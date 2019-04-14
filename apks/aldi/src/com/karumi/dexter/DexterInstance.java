package com.karumi.dexter;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.karumi.dexter.listener.DexterError;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.BaseMultiplePermissionsListener;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

final class DexterInstance
{
  private static final MultiplePermissionsListener EMPTY_LISTENER = new BaseMultiplePermissionsListener();
  private static final int PERMISSIONS_REQUEST_CODE = 42;
  private Activity activity;
  private final AndroidPermissionService androidPermissionService;
  private WeakReference<Context> context;
  private final IntentProvider intentProvider;
  private final AtomicBoolean isRequestingPermission;
  private final AtomicBoolean isShowingNativeDialog;
  private MultiplePermissionsListener listener = EMPTY_LISTENER;
  private final MultiplePermissionsReport multiplePermissionsReport;
  private final Collection<String> pendingPermissions;
  private final Object pendingPermissionsMutex = new Object();
  private final AtomicBoolean rationaleAccepted;
  
  DexterInstance(Context paramContext, AndroidPermissionService paramAndroidPermissionService, IntentProvider paramIntentProvider)
  {
    this.androidPermissionService = paramAndroidPermissionService;
    this.intentProvider = paramIntentProvider;
    this.pendingPermissions = new TreeSet();
    this.multiplePermissionsReport = new MultiplePermissionsReport();
    this.isRequestingPermission = new AtomicBoolean();
    this.rationaleAccepted = new AtomicBoolean();
    this.isShowingNativeDialog = new AtomicBoolean();
    setContext(paramContext);
  }
  
  private void checkMultiplePermissions(final MultiplePermissionsListener paramMultiplePermissionsListener, final Collection<String> paramCollection, Thread paramThread)
  {
    checkNoDexterRequestOngoing();
    checkRequestSomePermission(paramCollection);
    if (this.context.get() == null) {
      return;
    }
    this.pendingPermissions.clear();
    this.pendingPermissions.addAll(paramCollection);
    this.multiplePermissionsReport.clear();
    this.listener = new MultiplePermissionListenerThreadDecorator(paramMultiplePermissionsListener, paramThread);
    if (isEveryPermissionGranted(paramCollection, (Context)this.context.get())) {
      paramThread.execute(new Runnable()
      {
        public void run()
        {
          MultiplePermissionsReport localMultiplePermissionsReport = new MultiplePermissionsReport();
          Iterator localIterator = paramCollection.iterator();
          while (localIterator.hasNext()) {
            localMultiplePermissionsReport.addGrantedPermissionResponse(PermissionGrantedResponse.from((String)localIterator.next()));
          }
          DexterInstance.this.isRequestingPermission.set(false);
          paramMultiplePermissionsListener.onPermissionsChecked(localMultiplePermissionsReport);
        }
      });
    } else {
      startTransparentActivityIfNeeded();
    }
    paramThread.loop();
  }
  
  private void checkNoDexterRequestOngoing()
  {
    if (!this.isRequestingPermission.getAndSet(true)) {
      return;
    }
    throw new DexterException("Only one Dexter request at a time is allowed", DexterError.REQUEST_ONGOING);
  }
  
  private void checkRequestSomePermission(Collection<String> paramCollection)
  {
    if (!paramCollection.isEmpty()) {
      return;
    }
    throw new DexterException("Dexter has to be called with at least one permission", DexterError.NO_PERMISSIONS_REQUESTED);
  }
  
  private int checkSelfPermission(Activity paramActivity, String paramString)
  {
    try
    {
      int i = this.androidPermissionService.checkSelfPermission(paramActivity, paramString);
      return i;
    }
    catch (RuntimeException paramActivity)
    {
      for (;;) {}
    }
    return -1;
  }
  
  private void checkSinglePermission(PermissionListener paramPermissionListener, String paramString, Thread paramThread)
  {
    checkMultiplePermissions(new MultiplePermissionsListenerToPermissionListenerAdapter(paramPermissionListener), Collections.singleton(paramString), paramThread);
  }
  
  private PermissionStates getPermissionStates(Collection<String> paramCollection)
  {
    PermissionStates localPermissionStates = new PermissionStates(null);
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      String str = (String)paramCollection.next();
      switch (checkSelfPermission(this.activity, str))
      {
      default: 
        localPermissionStates.addGrantedPermission(str);
        break;
      case -1: 
        localPermissionStates.addDeniedPermission(str);
        break;
      case -2: 
        localPermissionStates.addImpossibleToGrantPermission(str);
      }
    }
    return localPermissionStates;
  }
  
  private void handleDeniedPermissions(Collection<String> paramCollection)
  {
    if (paramCollection.isEmpty()) {
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (this.androidPermissionService.shouldShowRequestPermissionRationale(this.activity, str)) {
        localLinkedList.add(new PermissionRequest(str));
      }
    }
    if (localLinkedList.isEmpty())
    {
      requestPermissionsToSystem(paramCollection);
      return;
    }
    if (!this.rationaleAccepted.get())
    {
      paramCollection = new PermissionRationaleToken(this);
      this.listener.onPermissionRationaleShouldBeShown(localLinkedList, paramCollection);
    }
  }
  
  private boolean isEveryPermissionGranted(Collection<String> paramCollection, Context paramContext)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      String str = (String)paramCollection.next();
      if (this.androidPermissionService.checkSelfPermission(paramContext, str) != 0) {
        return false;
      }
    }
    return true;
  }
  
  private void onPermissionsChecked(Collection<String> paramCollection)
  {
    if (this.pendingPermissions.isEmpty()) {
      return;
    }
    synchronized (this.pendingPermissionsMutex)
    {
      this.pendingPermissions.removeAll(paramCollection);
      if (this.pendingPermissions.isEmpty())
      {
        this.activity.finish();
        this.activity = null;
        this.isRequestingPermission.set(false);
        this.rationaleAccepted.set(false);
        this.isShowingNativeDialog.set(false);
        paramCollection = this.listener;
        this.listener = EMPTY_LISTENER;
        paramCollection.onPermissionsChecked(this.multiplePermissionsReport);
      }
      return;
    }
  }
  
  private void requestPermissionsToSystem(Collection<String> paramCollection)
  {
    if (!this.isShowingNativeDialog.get()) {
      this.androidPermissionService.requestPermissions(this.activity, (String[])paramCollection.toArray(new String[paramCollection.size()]), 42);
    }
    this.isShowingNativeDialog.set(true);
  }
  
  private void startTransparentActivityIfNeeded()
  {
    Context localContext = (Context)this.context.get();
    if (localContext == null) {
      return;
    }
    Intent localIntent = this.intentProvider.get(localContext, DexterActivity.class);
    if ((localContext instanceof Application)) {
      localIntent.addFlags(268435456);
    }
    localContext.startActivity(localIntent);
  }
  
  private void updatePermissionsAsDenied(Collection<String> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = PermissionDeniedResponse.from((String)localObject, this.androidPermissionService.shouldShowRequestPermissionRationale(this.activity, (String)localObject) ^ true);
      this.multiplePermissionsReport.addDeniedPermissionResponse((PermissionDeniedResponse)localObject);
    }
    onPermissionsChecked(paramCollection);
  }
  
  private void updatePermissionsAsGranted(Collection<String> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      PermissionGrantedResponse localPermissionGrantedResponse = PermissionGrantedResponse.from((String)localIterator.next());
      this.multiplePermissionsReport.addGrantedPermissionResponse(localPermissionGrantedResponse);
    }
    onPermissionsChecked(paramCollection);
  }
  
  final void checkPermission(PermissionListener paramPermissionListener, String paramString, Thread paramThread)
  {
    checkSinglePermission(paramPermissionListener, paramString, paramThread);
  }
  
  final void checkPermissions(MultiplePermissionsListener paramMultiplePermissionsListener, Collection<String> paramCollection, Thread paramThread)
  {
    checkMultiplePermissions(paramMultiplePermissionsListener, paramCollection, paramThread);
  }
  
  final void onActivityDestroyed()
  {
    this.isRequestingPermission.set(false);
  }
  
  final void onActivityReady(Activity paramActivity)
  {
    this.activity = paramActivity;
    Object localObject = this.pendingPermissionsMutex;
    if (paramActivity != null) {}
    for (;;)
    {
      try
      {
        paramActivity = getPermissionStates(this.pendingPermissions);
        if (paramActivity != null)
        {
          handleDeniedPermissions(paramActivity.getDeniedPermissions());
          updatePermissionsAsDenied(paramActivity.getImpossibleToGrantPermissions());
          updatePermissionsAsGranted(paramActivity.getGrantedPermissions());
        }
        return;
      }
      finally
      {
        continue;
      }
      throw paramActivity;
      paramActivity = null;
    }
  }
  
  final void onCancelPermissionRequest()
  {
    this.rationaleAccepted.set(false);
    updatePermissionsAsDenied(this.pendingPermissions);
  }
  
  final void onContinuePermissionRequest()
  {
    this.rationaleAccepted.set(true);
    requestPermissionsToSystem(this.pendingPermissions);
  }
  
  final void onPermissionRequestDenied(Collection<String> paramCollection)
  {
    updatePermissionsAsDenied(paramCollection);
  }
  
  final void onPermissionRequestGranted(Collection<String> paramCollection)
  {
    updatePermissionsAsGranted(paramCollection);
  }
  
  final void setContext(Context paramContext)
  {
    this.context = new WeakReference(paramContext);
  }
  
  final class PermissionStates
  {
    private final Collection<String> deniedPermissions = new LinkedList();
    private final Collection<String> grantedPermissions = new LinkedList();
    private final Collection<String> impossibleToGrantPermissions = new LinkedList();
    
    private PermissionStates() {}
    
    private void addDeniedPermission(String paramString)
    {
      this.deniedPermissions.add(paramString);
    }
    
    private void addGrantedPermission(String paramString)
    {
      this.grantedPermissions.add(paramString);
    }
    
    private void addImpossibleToGrantPermission(String paramString)
    {
      this.impossibleToGrantPermissions.add(paramString);
    }
    
    private Collection<String> getDeniedPermissions()
    {
      return this.deniedPermissions;
    }
    
    private Collection<String> getGrantedPermissions()
    {
      return this.grantedPermissions;
    }
    
    public final Collection<String> getImpossibleToGrantPermissions()
    {
      return this.impossibleToGrantPermissions;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/DexterInstance.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
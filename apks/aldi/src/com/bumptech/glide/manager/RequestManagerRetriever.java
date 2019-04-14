package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RequestManagerRetriever
  implements Handler.Callback
{
  private static final RequestManagerFactory DEFAULT_FACTORY = new RequestManagerFactory()
  {
    @NonNull
    public RequestManager build(@NonNull Glide paramAnonymousGlide, @NonNull Lifecycle paramAnonymousLifecycle, @NonNull RequestManagerTreeNode paramAnonymousRequestManagerTreeNode, @NonNull Context paramAnonymousContext)
    {
      return new RequestManager(paramAnonymousGlide, paramAnonymousLifecycle, paramAnonymousRequestManagerTreeNode, paramAnonymousContext);
    }
  };
  private static final String FRAGMENT_INDEX_KEY = "key";
  @VisibleForTesting
  static final String FRAGMENT_TAG = "com.bumptech.glide.manager";
  private static final int ID_REMOVE_FRAGMENT_MANAGER = 1;
  private static final int ID_REMOVE_SUPPORT_FRAGMENT_MANAGER = 2;
  private static final String TAG = "RMRetriever";
  private volatile RequestManager applicationManager;
  private final RequestManagerFactory factory;
  private final Handler handler;
  @VisibleForTesting
  final Map<android.app.FragmentManager, RequestManagerFragment> pendingRequestManagerFragments = new HashMap();
  @VisibleForTesting
  final Map<android.support.v4.app.FragmentManager, SupportRequestManagerFragment> pendingSupportRequestManagerFragments = new HashMap();
  private final Bundle tempBundle = new Bundle();
  private final ArrayMap<View, android.app.Fragment> tempViewToFragment = new ArrayMap();
  private final ArrayMap<View, android.support.v4.app.Fragment> tempViewToSupportFragment = new ArrayMap();
  
  public RequestManagerRetriever(@Nullable RequestManagerFactory paramRequestManagerFactory)
  {
    if (paramRequestManagerFactory == null) {
      paramRequestManagerFactory = DEFAULT_FACTORY;
    }
    this.factory = paramRequestManagerFactory;
    this.handler = new Handler(Looper.getMainLooper(), this);
  }
  
  @TargetApi(17)
  private static void assertNotDestroyed(@NonNull Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      if (!paramActivity.isDestroyed()) {
        return;
      }
      throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }
  }
  
  @Nullable
  private Activity findActivity(@NonNull Context paramContext)
  {
    for (;;)
    {
      if ((paramContext instanceof Activity)) {
        return (Activity)paramContext;
      }
      if (!(paramContext instanceof ContextWrapper)) {
        break;
      }
      paramContext = ((ContextWrapper)paramContext).getBaseContext();
    }
    return null;
  }
  
  @Deprecated
  @TargetApi(26)
  private void findAllFragmentsWithViews(@NonNull android.app.FragmentManager paramFragmentManager, @NonNull ArrayMap<View, android.app.Fragment> paramArrayMap)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      paramFragmentManager = paramFragmentManager.getFragments().iterator();
      while (paramFragmentManager.hasNext())
      {
        android.app.Fragment localFragment = (android.app.Fragment)paramFragmentManager.next();
        if (localFragment.getView() != null)
        {
          paramArrayMap.put(localFragment.getView(), localFragment);
          findAllFragmentsWithViews(localFragment.getChildFragmentManager(), paramArrayMap);
        }
      }
      return;
    }
    findAllFragmentsWithViewsPreO(paramFragmentManager, paramArrayMap);
  }
  
  @Deprecated
  private void findAllFragmentsWithViewsPreO(@NonNull android.app.FragmentManager paramFragmentManager, @NonNull ArrayMap<View, android.app.Fragment> paramArrayMap)
  {
    int i = 0;
    for (;;)
    {
      this.tempBundle.putInt("key", i);
      Object localObject = null;
      try
      {
        android.app.Fragment localFragment = paramFragmentManager.getFragment(this.tempBundle, "key");
        localObject = localFragment;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      if (localObject == null) {
        break;
      }
      if (((android.app.Fragment)localObject).getView() != null)
      {
        paramArrayMap.put(((android.app.Fragment)localObject).getView(), localObject);
        if (Build.VERSION.SDK_INT >= 17) {
          findAllFragmentsWithViews(((android.app.Fragment)localObject).getChildFragmentManager(), paramArrayMap);
        }
      }
      i += 1;
    }
  }
  
  private static void findAllSupportFragmentsWithViews(@Nullable Collection<android.support.v4.app.Fragment> paramCollection, @NonNull Map<View, android.support.v4.app.Fragment> paramMap)
  {
    if (paramCollection == null) {
      return;
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      android.support.v4.app.Fragment localFragment = (android.support.v4.app.Fragment)paramCollection.next();
      if ((localFragment != null) && (localFragment.getView() != null))
      {
        paramMap.put(localFragment.getView(), localFragment);
        findAllSupportFragmentsWithViews(localFragment.getChildFragmentManager().getFragments(), paramMap);
      }
    }
  }
  
  @Deprecated
  @Nullable
  private android.app.Fragment findFragment(@NonNull View paramView, @NonNull Activity paramActivity)
  {
    this.tempViewToFragment.clear();
    findAllFragmentsWithViews(paramActivity.getFragmentManager(), this.tempViewToFragment);
    View localView2 = paramActivity.findViewById(16908290);
    View localView1 = null;
    paramActivity = paramView;
    paramView = localView1;
    for (;;)
    {
      localView1 = paramView;
      if (paramActivity.equals(localView2)) {
        break;
      }
      paramView = (android.app.Fragment)this.tempViewToFragment.get(paramActivity);
      localView1 = paramView;
      if (paramView != null) {
        break;
      }
      localView1 = paramView;
      if (!(paramActivity.getParent() instanceof View)) {
        break;
      }
      paramActivity = (View)paramActivity.getParent();
    }
    this.tempViewToFragment.clear();
    return localView1;
  }
  
  @Nullable
  private android.support.v4.app.Fragment findSupportFragment(@NonNull View paramView, @NonNull FragmentActivity paramFragmentActivity)
  {
    this.tempViewToSupportFragment.clear();
    findAllSupportFragmentsWithViews(paramFragmentActivity.getSupportFragmentManager().getFragments(), this.tempViewToSupportFragment);
    View localView2 = paramFragmentActivity.findViewById(16908290);
    View localView1 = null;
    paramFragmentActivity = paramView;
    paramView = localView1;
    for (;;)
    {
      localView1 = paramView;
      if (paramFragmentActivity.equals(localView2)) {
        break;
      }
      paramView = (android.support.v4.app.Fragment)this.tempViewToSupportFragment.get(paramFragmentActivity);
      localView1 = paramView;
      if (paramView != null) {
        break;
      }
      localView1 = paramView;
      if (!(paramFragmentActivity.getParent() instanceof View)) {
        break;
      }
      paramFragmentActivity = (View)paramFragmentActivity.getParent();
    }
    this.tempViewToSupportFragment.clear();
    return localView1;
  }
  
  @Deprecated
  @NonNull
  private RequestManager fragmentGet(@NonNull Context paramContext, @NonNull android.app.FragmentManager paramFragmentManager, @Nullable android.app.Fragment paramFragment, boolean paramBoolean)
  {
    RequestManagerFragment localRequestManagerFragment = getRequestManagerFragment(paramFragmentManager, paramFragment, paramBoolean);
    paramFragment = localRequestManagerFragment.getRequestManager();
    paramFragmentManager = paramFragment;
    if (paramFragment == null)
    {
      paramFragmentManager = Glide.get(paramContext);
      paramFragmentManager = this.factory.build(paramFragmentManager, localRequestManagerFragment.getGlideLifecycle(), localRequestManagerFragment.getRequestManagerTreeNode(), paramContext);
      localRequestManagerFragment.setRequestManager(paramFragmentManager);
    }
    return paramFragmentManager;
  }
  
  @NonNull
  private RequestManager getApplicationManager(@NonNull Context paramContext)
  {
    if (this.applicationManager == null) {
      try
      {
        if (this.applicationManager == null)
        {
          Glide localGlide = Glide.get(paramContext.getApplicationContext());
          this.applicationManager = this.factory.build(localGlide, new ApplicationLifecycle(), new EmptyRequestManagerTreeNode(), paramContext.getApplicationContext());
        }
      }
      finally {}
    }
    return this.applicationManager;
  }
  
  @NonNull
  private RequestManagerFragment getRequestManagerFragment(@NonNull android.app.FragmentManager paramFragmentManager, @Nullable android.app.Fragment paramFragment, boolean paramBoolean)
  {
    RequestManagerFragment localRequestManagerFragment2 = (RequestManagerFragment)paramFragmentManager.findFragmentByTag("com.bumptech.glide.manager");
    RequestManagerFragment localRequestManagerFragment1 = localRequestManagerFragment2;
    if (localRequestManagerFragment2 == null)
    {
      localRequestManagerFragment2 = (RequestManagerFragment)this.pendingRequestManagerFragments.get(paramFragmentManager);
      localRequestManagerFragment1 = localRequestManagerFragment2;
      if (localRequestManagerFragment2 == null)
      {
        localRequestManagerFragment1 = new RequestManagerFragment();
        localRequestManagerFragment1.setParentFragmentHint(paramFragment);
        if (paramBoolean) {
          localRequestManagerFragment1.getGlideLifecycle().onStart();
        }
        this.pendingRequestManagerFragments.put(paramFragmentManager, localRequestManagerFragment1);
        paramFragmentManager.beginTransaction().add(localRequestManagerFragment1, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.handler.obtainMessage(1, paramFragmentManager).sendToTarget();
      }
    }
    return localRequestManagerFragment1;
  }
  
  @NonNull
  private SupportRequestManagerFragment getSupportRequestManagerFragment(@NonNull android.support.v4.app.FragmentManager paramFragmentManager, @Nullable android.support.v4.app.Fragment paramFragment, boolean paramBoolean)
  {
    SupportRequestManagerFragment localSupportRequestManagerFragment2 = (SupportRequestManagerFragment)paramFragmentManager.findFragmentByTag("com.bumptech.glide.manager");
    SupportRequestManagerFragment localSupportRequestManagerFragment1 = localSupportRequestManagerFragment2;
    if (localSupportRequestManagerFragment2 == null)
    {
      localSupportRequestManagerFragment2 = (SupportRequestManagerFragment)this.pendingSupportRequestManagerFragments.get(paramFragmentManager);
      localSupportRequestManagerFragment1 = localSupportRequestManagerFragment2;
      if (localSupportRequestManagerFragment2 == null)
      {
        localSupportRequestManagerFragment1 = new SupportRequestManagerFragment();
        localSupportRequestManagerFragment1.setParentFragmentHint(paramFragment);
        if (paramBoolean) {
          localSupportRequestManagerFragment1.getGlideLifecycle().onStart();
        }
        this.pendingSupportRequestManagerFragments.put(paramFragmentManager, localSupportRequestManagerFragment1);
        paramFragmentManager.beginTransaction().add(localSupportRequestManagerFragment1, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.handler.obtainMessage(2, paramFragmentManager).sendToTarget();
      }
    }
    return localSupportRequestManagerFragment1;
  }
  
  private static boolean isActivityVisible(Activity paramActivity)
  {
    return !paramActivity.isFinishing();
  }
  
  @NonNull
  private RequestManager supportFragmentGet(@NonNull Context paramContext, @NonNull android.support.v4.app.FragmentManager paramFragmentManager, @Nullable android.support.v4.app.Fragment paramFragment, boolean paramBoolean)
  {
    SupportRequestManagerFragment localSupportRequestManagerFragment = getSupportRequestManagerFragment(paramFragmentManager, paramFragment, paramBoolean);
    paramFragment = localSupportRequestManagerFragment.getRequestManager();
    paramFragmentManager = paramFragment;
    if (paramFragment == null)
    {
      paramFragmentManager = Glide.get(paramContext);
      paramFragmentManager = this.factory.build(paramFragmentManager, localSupportRequestManagerFragment.getGlideLifecycle(), localSupportRequestManagerFragment.getRequestManagerTreeNode(), paramContext);
      localSupportRequestManagerFragment.setRequestManager(paramFragmentManager);
    }
    return paramFragmentManager;
  }
  
  @NonNull
  public RequestManager get(@NonNull Activity paramActivity)
  {
    if (Util.isOnBackgroundThread()) {
      return get(paramActivity.getApplicationContext());
    }
    assertNotDestroyed(paramActivity);
    return fragmentGet(paramActivity, paramActivity.getFragmentManager(), null, isActivityVisible(paramActivity));
  }
  
  @Deprecated
  @TargetApi(17)
  @NonNull
  public RequestManager get(@NonNull android.app.Fragment paramFragment)
  {
    if (paramFragment.getActivity() != null)
    {
      if ((!Util.isOnBackgroundThread()) && (Build.VERSION.SDK_INT >= 17))
      {
        android.app.FragmentManager localFragmentManager = paramFragment.getChildFragmentManager();
        return fragmentGet(paramFragment.getActivity(), localFragmentManager, paramFragment, paramFragment.isVisible());
      }
      return get(paramFragment.getActivity().getApplicationContext());
    }
    throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
  }
  
  @NonNull
  public RequestManager get(@NonNull Context paramContext)
  {
    if (paramContext != null)
    {
      if ((Util.isOnMainThread()) && (!(paramContext instanceof Application)))
      {
        if ((paramContext instanceof FragmentActivity)) {
          return get((FragmentActivity)paramContext);
        }
        if ((paramContext instanceof Activity)) {
          return get((Activity)paramContext);
        }
        if ((paramContext instanceof ContextWrapper)) {
          return get(((ContextWrapper)paramContext).getBaseContext());
        }
      }
      return getApplicationManager(paramContext);
    }
    throw new IllegalArgumentException("You cannot start a load on a null Context");
  }
  
  @NonNull
  public RequestManager get(@NonNull android.support.v4.app.Fragment paramFragment)
  {
    Preconditions.checkNotNull(paramFragment.getActivity(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
    if (Util.isOnBackgroundThread()) {
      return get(paramFragment.getActivity().getApplicationContext());
    }
    android.support.v4.app.FragmentManager localFragmentManager = paramFragment.getChildFragmentManager();
    return supportFragmentGet(paramFragment.getActivity(), localFragmentManager, paramFragment, paramFragment.isVisible());
  }
  
  @NonNull
  public RequestManager get(@NonNull FragmentActivity paramFragmentActivity)
  {
    if (Util.isOnBackgroundThread()) {
      return get(paramFragmentActivity.getApplicationContext());
    }
    assertNotDestroyed(paramFragmentActivity);
    return supportFragmentGet(paramFragmentActivity, paramFragmentActivity.getSupportFragmentManager(), null, isActivityVisible(paramFragmentActivity));
  }
  
  @NonNull
  public RequestManager get(@NonNull View paramView)
  {
    if (Util.isOnBackgroundThread()) {}
    Activity localActivity;
    do
    {
      return get(paramView.getContext().getApplicationContext());
      Preconditions.checkNotNull(paramView);
      Preconditions.checkNotNull(paramView.getContext(), "Unable to obtain a request manager for a view without a Context");
      localActivity = findActivity(paramView.getContext());
    } while (localActivity == null);
    if ((localActivity instanceof FragmentActivity))
    {
      paramView = findSupportFragment(paramView, (FragmentActivity)localActivity);
      if (paramView != null) {
        return get(paramView);
      }
      return get(localActivity);
    }
    paramView = findFragment(paramView, localActivity);
    if (paramView == null) {
      return get(localActivity);
    }
    return get(paramView);
  }
  
  @Deprecated
  @NonNull
  RequestManagerFragment getRequestManagerFragment(Activity paramActivity)
  {
    return getRequestManagerFragment(paramActivity.getFragmentManager(), null, isActivityVisible(paramActivity));
  }
  
  @NonNull
  SupportRequestManagerFragment getSupportRequestManagerFragment(FragmentActivity paramFragmentActivity)
  {
    return getSupportRequestManagerFragment(paramFragmentActivity.getSupportFragmentManager(), null, isActivityVisible(paramFragmentActivity));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    Object localObject1 = null;
    boolean bool = true;
    switch (i)
    {
    default: 
      bool = false;
      Object localObject2 = null;
      paramMessage = (Message)localObject1;
      localObject1 = localObject2;
      break;
    case 2: 
      paramMessage = (android.support.v4.app.FragmentManager)paramMessage.obj;
      localObject1 = this.pendingSupportRequestManagerFragments;
      break;
    case 1: 
      paramMessage = (android.app.FragmentManager)paramMessage.obj;
      localObject1 = this.pendingRequestManagerFragments;
    }
    localObject1 = ((Map)localObject1).remove(paramMessage);
    if ((bool) && (localObject1 == null) && (Log.isLoggable("RMRetriever", 5))) {
      new StringBuilder("Failed to remove expected request manager fragment, manager: ").append(paramMessage);
    }
    return bool;
  }
  
  public static abstract interface RequestManagerFactory
  {
    @NonNull
    public abstract RequestManager build(@NonNull Glide paramGlide, @NonNull Lifecycle paramLifecycle, @NonNull RequestManagerTreeNode paramRequestManagerTreeNode, @NonNull Context paramContext);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/manager/RequestManagerRetriever.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
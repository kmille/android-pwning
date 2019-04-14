package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import java.util.LinkedList;

@KeepForSdk
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate>
{
  private T zare;
  private Bundle zarf;
  private LinkedList<zaa> zarg;
  private final OnDelegateCreatedListener<T> zarh = new zaa(this);
  
  @KeepForSdk
  public static void showGooglePlayUnavailableMessage(FrameLayout paramFrameLayout)
  {
    Object localObject = GoogleApiAvailability.getInstance();
    Context localContext = paramFrameLayout.getContext();
    int i = ((GoogleApiAvailability)localObject).isGooglePlayServicesAvailable(localContext);
    String str2 = ConnectionErrorMessages.getErrorMessage(localContext, i);
    String str1 = ConnectionErrorMessages.getErrorDialogButtonMessage(localContext, i);
    LinearLayout localLinearLayout = new LinearLayout(paramFrameLayout.getContext());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    paramFrameLayout.addView(localLinearLayout);
    paramFrameLayout = new TextView(paramFrameLayout.getContext());
    paramFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    paramFrameLayout.setText(str2);
    localLinearLayout.addView(paramFrameLayout);
    paramFrameLayout = ((GoogleApiAvailability)localObject).getErrorResolutionIntent(localContext, i, null);
    if (paramFrameLayout != null)
    {
      localObject = new Button(localContext);
      ((Button)localObject).setId(16908313);
      ((Button)localObject).setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
      ((Button)localObject).setText(str1);
      localLinearLayout.addView((View)localObject);
      ((Button)localObject).setOnClickListener(new zae(localContext, paramFrameLayout));
    }
  }
  
  private final void zaa(Bundle paramBundle, zaa paramzaa)
  {
    if (this.zare != null)
    {
      paramzaa.zaa(this.zare);
      return;
    }
    if (this.zarg == null) {
      this.zarg = new LinkedList();
    }
    this.zarg.add(paramzaa);
    if (paramBundle != null) {
      if (this.zarf == null) {
        this.zarf = ((Bundle)paramBundle.clone());
      } else {
        this.zarf.putAll(paramBundle);
      }
    }
    createDelegate(this.zarh);
  }
  
  private final void zal(int paramInt)
  {
    while ((!this.zarg.isEmpty()) && (((zaa)this.zarg.getLast()).getState() >= paramInt)) {
      this.zarg.removeLast();
    }
  }
  
  @KeepForSdk
  protected abstract void createDelegate(OnDelegateCreatedListener<T> paramOnDelegateCreatedListener);
  
  @KeepForSdk
  public T getDelegate()
  {
    return this.zare;
  }
  
  @KeepForSdk
  protected void handleGooglePlayUnavailable(FrameLayout paramFrameLayout)
  {
    showGooglePlayUnavailableMessage(paramFrameLayout);
  }
  
  @KeepForSdk
  public void onCreate(Bundle paramBundle)
  {
    zaa(paramBundle, new zac(this, paramBundle));
  }
  
  @KeepForSdk
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FrameLayout localFrameLayout = new FrameLayout(paramLayoutInflater.getContext());
    zaa(paramBundle, new zad(this, localFrameLayout, paramLayoutInflater, paramViewGroup, paramBundle));
    if (this.zare == null) {
      handleGooglePlayUnavailable(localFrameLayout);
    }
    return localFrameLayout;
  }
  
  @KeepForSdk
  public void onDestroy()
  {
    if (this.zare != null)
    {
      this.zare.onDestroy();
      return;
    }
    zal(1);
  }
  
  @KeepForSdk
  public void onDestroyView()
  {
    if (this.zare != null)
    {
      this.zare.onDestroyView();
      return;
    }
    zal(2);
  }
  
  @KeepForSdk
  public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    zaa(paramBundle2, new zab(this, paramActivity, paramBundle1, paramBundle2));
  }
  
  @KeepForSdk
  public void onLowMemory()
  {
    if (this.zare != null) {
      this.zare.onLowMemory();
    }
  }
  
  @KeepForSdk
  public void onPause()
  {
    if (this.zare != null)
    {
      this.zare.onPause();
      return;
    }
    zal(5);
  }
  
  @KeepForSdk
  public void onResume()
  {
    zaa(null, new zag(this));
  }
  
  @KeepForSdk
  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (this.zare != null)
    {
      this.zare.onSaveInstanceState(paramBundle);
      return;
    }
    if (this.zarf != null) {
      paramBundle.putAll(this.zarf);
    }
  }
  
  @KeepForSdk
  public void onStart()
  {
    zaa(null, new zaf(this));
  }
  
  @KeepForSdk
  public void onStop()
  {
    if (this.zare != null)
    {
      this.zare.onStop();
      return;
    }
    zal(4);
  }
  
  static abstract interface zaa
  {
    public abstract int getState();
    
    public abstract void zaa(LifecycleDelegate paramLifecycleDelegate);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/dynamic/DeferredLifecycleHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
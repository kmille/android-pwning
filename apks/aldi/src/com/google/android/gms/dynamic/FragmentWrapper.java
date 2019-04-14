package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;

@SuppressLint({"NewApi"})
@KeepForSdk
public final class FragmentWrapper
  extends IFragmentWrapper.Stub
{
  private Fragment zzhy;
  
  private FragmentWrapper(Fragment paramFragment)
  {
    this.zzhy = paramFragment;
  }
  
  @KeepForSdk
  public static FragmentWrapper wrap(Fragment paramFragment)
  {
    if (paramFragment != null) {
      return new FragmentWrapper(paramFragment);
    }
    return null;
  }
  
  public final Bundle getArguments()
  {
    return this.zzhy.getArguments();
  }
  
  public final int getId()
  {
    return this.zzhy.getId();
  }
  
  public final boolean getRetainInstance()
  {
    return this.zzhy.getRetainInstance();
  }
  
  public final String getTag()
  {
    return this.zzhy.getTag();
  }
  
  public final int getTargetRequestCode()
  {
    return this.zzhy.getTargetRequestCode();
  }
  
  public final boolean getUserVisibleHint()
  {
    return this.zzhy.getUserVisibleHint();
  }
  
  public final boolean isAdded()
  {
    return this.zzhy.isAdded();
  }
  
  public final boolean isDetached()
  {
    return this.zzhy.isDetached();
  }
  
  public final boolean isHidden()
  {
    return this.zzhy.isHidden();
  }
  
  public final boolean isInLayout()
  {
    return this.zzhy.isInLayout();
  }
  
  public final boolean isRemoving()
  {
    return this.zzhy.isRemoving();
  }
  
  public final boolean isResumed()
  {
    return this.zzhy.isResumed();
  }
  
  public final boolean isVisible()
  {
    return this.zzhy.isVisible();
  }
  
  public final void setHasOptionsMenu(boolean paramBoolean)
  {
    this.zzhy.setHasOptionsMenu(paramBoolean);
  }
  
  public final void setMenuVisibility(boolean paramBoolean)
  {
    this.zzhy.setMenuVisibility(paramBoolean);
  }
  
  public final void setRetainInstance(boolean paramBoolean)
  {
    this.zzhy.setRetainInstance(paramBoolean);
  }
  
  public final void setUserVisibleHint(boolean paramBoolean)
  {
    this.zzhy.setUserVisibleHint(paramBoolean);
  }
  
  public final void startActivity(Intent paramIntent)
  {
    this.zzhy.startActivity(paramIntent);
  }
  
  public final void startActivityForResult(Intent paramIntent, int paramInt)
  {
    this.zzhy.startActivityForResult(paramIntent, paramInt);
  }
  
  public final void zza(IObjectWrapper paramIObjectWrapper)
  {
    paramIObjectWrapper = (View)ObjectWrapper.unwrap(paramIObjectWrapper);
    this.zzhy.registerForContextMenu(paramIObjectWrapper);
  }
  
  public final IObjectWrapper zzad()
  {
    return ObjectWrapper.wrap(this.zzhy.getActivity());
  }
  
  public final IFragmentWrapper zzae()
  {
    return wrap(this.zzhy.getParentFragment());
  }
  
  public final IObjectWrapper zzaf()
  {
    return ObjectWrapper.wrap(this.zzhy.getResources());
  }
  
  public final IFragmentWrapper zzag()
  {
    return wrap(this.zzhy.getTargetFragment());
  }
  
  public final IObjectWrapper zzah()
  {
    return ObjectWrapper.wrap(this.zzhy.getView());
  }
  
  public final void zzb(IObjectWrapper paramIObjectWrapper)
  {
    paramIObjectWrapper = (View)ObjectWrapper.unwrap(paramIObjectWrapper);
    this.zzhy.unregisterForContextMenu(paramIObjectWrapper);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/dynamic/FragmentWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package de.eplus.mappecc.client.android.common.base;

import de.eplus.mappecc.client.android.common.tracking.ITrackingPresenter;

public abstract interface IPresenter<T>
  extends ITrackingPresenter
{
  public abstract boolean isSecuredByHigherLogin();
  
  public abstract void onCreate();
  
  public abstract void onCreateView();
  
  public abstract void onDestroy();
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract void setView(T paramT);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/base/IPresenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
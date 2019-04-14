package de.eplus.mappecc.client.android.common.network.piranha;

public abstract interface IAutomaticLoginCallback
{
  public abstract void onAutomaticLoginFailure(int paramInt);
  
  public abstract void onAutomaticLoginMaintenanceMode();
  
  public abstract void onAutomaticLoginNotPossible();
  
  public abstract void onAutomaticLoginSuccess();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/IAutomaticLoginCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
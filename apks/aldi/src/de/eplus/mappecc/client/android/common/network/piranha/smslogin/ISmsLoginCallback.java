package de.eplus.mappecc.client.android.common.network.piranha.smslogin;

public abstract interface ISmsLoginCallback
{
  public abstract void onIccidConversionSuccess();
  
  public abstract void onSmsLoginFailed(int paramInt);
  
  public abstract void onSmsLoginStartFailure();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/smslogin/ISmsLoginCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
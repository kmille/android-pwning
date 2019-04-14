package com.squareup.otto;

import android.os.Looper;

public abstract interface ThreadEnforcer
{
  public static final ThreadEnforcer ANY = new ThreadEnforcer()
  {
    public final void enforce(Bus paramAnonymousBus) {}
  };
  public static final ThreadEnforcer MAIN = new ThreadEnforcer()
  {
    public final void enforce(Bus paramAnonymousBus)
    {
      if (Looper.myLooper() == Looper.getMainLooper()) {
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder("Event bus ");
      localStringBuilder.append(paramAnonymousBus);
      localStringBuilder.append(" accessed from non-main thread ");
      localStringBuilder.append(Looper.myLooper());
      throw new IllegalStateException(localStringBuilder.toString());
    }
  };
  
  public abstract void enforce(Bus paramBus);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/squareup/otto/ThreadEnforcer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

@ShowFirstParty
public abstract class zac
{
  private static final Object sLock = new Object();
  @GuardedBy("sLock")
  private static final Map<Object, zac> zacj = new WeakHashMap();
  
  public abstract void remove(int paramInt);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/zac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
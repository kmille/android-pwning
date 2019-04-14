package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzbb
  implements zzbx
{
  private static final Object zzaxa = new Object();
  private static zzbb zzazr;
  private zzej zzaye;
  private zzby zzazs;
  
  private zzbb(Context paramContext)
  {
    this(zzbz.zzo(paramContext), new zzfl());
  }
  
  @VisibleForTesting
  private zzbb(zzby paramzzby, zzej paramzzej)
  {
    this.zzazs = paramzzby;
    this.zzaye = paramzzej;
  }
  
  public static zzbx zzi(Context paramContext)
  {
    synchronized (zzaxa)
    {
      if (zzazr == null) {
        zzazr = new zzbb(paramContext);
      }
      paramContext = zzazr;
      return paramContext;
    }
  }
  
  public final boolean zzdb(String paramString)
  {
    if (!this.zzaye.zzes())
    {
      zzdi.zzab("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
      return false;
    }
    this.zzazs.zzdg(paramString);
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
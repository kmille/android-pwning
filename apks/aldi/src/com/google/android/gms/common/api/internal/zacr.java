package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.zac;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

final class zacr
  implements IBinder.DeathRecipient, zacs
{
  private final WeakReference<BasePendingResult<?>> zalb;
  private final WeakReference<zac> zalc;
  private final WeakReference<IBinder> zald;
  
  private zacr(BasePendingResult<?> paramBasePendingResult, zac paramzac, IBinder paramIBinder)
  {
    this.zalc = new WeakReference(paramzac);
    this.zalb = new WeakReference(paramBasePendingResult);
    this.zald = new WeakReference(paramIBinder);
  }
  
  private final void zaby()
  {
    Object localObject = (BasePendingResult)this.zalb.get();
    zac localzac = (zac)this.zalc.get();
    if ((localzac != null) && (localObject != null)) {
      localzac.remove(((PendingResult)localObject).zam().intValue());
    }
    localObject = (IBinder)this.zald.get();
    if (localObject != null) {}
    try
    {
      ((IBinder)localObject).unlinkToDeath(this, 0);
      return;
    }
    catch (NoSuchElementException localNoSuchElementException) {}
  }
  
  public final void binderDied()
  {
    zaby();
  }
  
  public final void zac(BasePendingResult<?> paramBasePendingResult)
  {
    zaby();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zacr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
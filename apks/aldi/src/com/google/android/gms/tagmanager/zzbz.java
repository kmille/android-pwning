package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzxi;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

final class zzbz
  extends Thread
  implements zzby
{
  private static zzbz zzbal;
  private volatile boolean closed = false;
  private final LinkedBlockingQueue<Runnable> zzbaj = new LinkedBlockingQueue();
  private volatile boolean zzbak = false;
  private volatile zzcb zzbam;
  private final Context zzqx;
  
  private zzbz(Context paramContext)
  {
    super("GAThread");
    Context localContext = paramContext;
    if (paramContext != null) {
      localContext = paramContext.getApplicationContext();
    }
    this.zzqx = localContext;
    start();
  }
  
  static zzbz zzo(Context paramContext)
  {
    if (zzbal == null) {
      zzbal = new zzbz(paramContext);
    }
    return zzbal;
  }
  
  public final void run()
  {
    for (;;)
    {
      boolean bool = this.closed;
      try
      {
        Runnable localRunnable = (Runnable)this.zzbaj.take();
        if (this.zzbak) {
          continue;
        }
        localRunnable.run();
      }
      catch (Exception localException)
      {
        break label47;
      }
      catch (InterruptedException localInterruptedException)
      {
        zzdi.zzcz(localInterruptedException.toString());
      }
      continue;
      label47:
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
      zzxi.zza(localInterruptedException, localPrintStream);
      localPrintStream.flush();
      String str = String.valueOf(new String(localByteArrayOutputStream.toByteArray()));
      if (str.length() != 0) {
        str = "Error on Google TagManager Thread: ".concat(str);
      } else {
        str = new String("Error on Google TagManager Thread: ");
      }
      zzdi.e(str);
      zzdi.e("Google TagManager is shutting down.");
      this.zzbak = true;
    }
  }
  
  public final void zzdg(String paramString)
  {
    zzh(new zzca(this, this, System.currentTimeMillis(), paramString));
  }
  
  public final void zzh(Runnable paramRunnable)
  {
    this.zzbaj.add(paramRunnable);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzbz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
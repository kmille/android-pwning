package com.google.android.gms.internal.measurement;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

final class zzxm
  extends zzxj
{
  private final zzxk zzbqg = new zzxk();
  
  public final void zza(Throwable paramThrowable, PrintStream paramPrintStream)
  {
    paramThrowable.printStackTrace(paramPrintStream);
    paramThrowable = this.zzbqg.zza(paramThrowable, false);
    if (paramThrowable == null) {
      return;
    }
    try
    {
      Iterator localIterator = paramThrowable.iterator();
      while (localIterator.hasNext())
      {
        Throwable localThrowable = (Throwable)localIterator.next();
        paramPrintStream.print("Suppressed: ");
        localThrowable.printStackTrace(paramPrintStream);
      }
      return;
    }
    finally {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzxm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
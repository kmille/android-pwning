package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
public class NumberedThreadFactory
  implements ThreadFactory
{
  private final int priority;
  private final ThreadFactory zzhp = Executors.defaultThreadFactory();
  private final String zzhq;
  private final AtomicInteger zzhr = new AtomicInteger();
  
  @KeepForSdk
  public NumberedThreadFactory(String paramString)
  {
    this(paramString, 0);
  }
  
  private NumberedThreadFactory(String paramString, int paramInt)
  {
    this.zzhq = ((String)Preconditions.checkNotNull(paramString, "Name must not be null"));
    this.priority = 0;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = this.zzhp.newThread(new zza(paramRunnable, 0));
    String str = this.zzhq;
    int i = this.zzhr.getAndIncrement();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 13);
    localStringBuilder.append(str);
    localStringBuilder.append("[");
    localStringBuilder.append(i);
    localStringBuilder.append("]");
    paramRunnable.setName(localStringBuilder.toString());
    return paramRunnable;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/concurrent/NumberedThreadFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
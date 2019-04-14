package com.google.common.base;

import java.util.concurrent.TimeUnit;

public final class k
{
  public final m a = m.b();
  public boolean b;
  public long c;
  private long d;
  
  public final long a()
  {
    if (this.b) {
      return this.a.a() - this.c + this.d;
    }
    return this.d;
  }
  
  public final String toString()
  {
    long l = a();
    Object localObject;
    if (TimeUnit.DAYS.convert(l, TimeUnit.NANOSECONDS) > 0L) {
      localObject = TimeUnit.DAYS;
    } else if (TimeUnit.HOURS.convert(l, TimeUnit.NANOSECONDS) > 0L) {
      localObject = TimeUnit.HOURS;
    } else if (TimeUnit.MINUTES.convert(l, TimeUnit.NANOSECONDS) > 0L) {
      localObject = TimeUnit.MINUTES;
    } else if (TimeUnit.SECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L) {
      localObject = TimeUnit.SECONDS;
    } else if (TimeUnit.MILLISECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L) {
      localObject = TimeUnit.MILLISECONDS;
    } else if (TimeUnit.MICROSECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L) {
      localObject = TimeUnit.MICROSECONDS;
    } else {
      localObject = TimeUnit.NANOSECONDS;
    }
    double d1 = l;
    double d2 = TimeUnit.NANOSECONDS.convert(1L, (TimeUnit)localObject);
    Double.isNaN(d1);
    Double.isNaN(d2);
    d1 /= d2;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(i.a(d1));
    localStringBuilder.append(" ");
    switch (1.a[localObject.ordinal()])
    {
    default: 
      throw new AssertionError();
    case 7: 
      localObject = "d";
      break;
    case 6: 
      localObject = "h";
      break;
    case 5: 
      localObject = "min";
      break;
    case 4: 
      localObject = "s";
      break;
    case 3: 
      localObject = "ms";
      break;
    case 2: 
      localObject = "μs";
      break;
    case 1: 
      localObject = "ns";
    }
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/base/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
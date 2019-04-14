package com.google.android.gms.tagmanager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Random;

public final class zzai
{
  private final String zzaxm;
  private final Random zzays;
  private final Context zzqx;
  
  public zzai(Context paramContext, String paramString)
  {
    this(paramContext, paramString, new Random());
  }
  
  @VisibleForTesting
  private zzai(Context paramContext, String paramString, Random paramRandom)
  {
    this.zzqx = ((Context)Preconditions.checkNotNull(paramContext));
    this.zzaxm = ((String)Preconditions.checkNotNull(paramString));
    this.zzays = paramRandom;
  }
  
  private final long zzb(long paramLong1, long paramLong2)
  {
    SharedPreferences localSharedPreferences = zznc();
    long l1 = Math.max(0L, localSharedPreferences.getLong("FORBIDDEN_COUNT", 0L));
    long l2 = Math.max(0L, localSharedPreferences.getLong("SUCCESSFUL_COUNT", 0L));
    paramLong2 = ((float)l1 / (float)(l1 + l2 + 1L) * (float)(paramLong2 - paramLong1));
    return (this.zzays.nextFloat() * (float)(paramLong1 + paramLong2));
  }
  
  private final SharedPreferences zznc()
  {
    Context localContext = this.zzqx;
    String str1 = String.valueOf("_gtmContainerRefreshPolicy_");
    String str2 = String.valueOf(this.zzaxm);
    if (str2.length() != 0) {
      str1 = str1.concat(str2);
    } else {
      str1 = new String(str1);
    }
    return localContext.getSharedPreferences(str1, 0);
  }
  
  public final long zzmy()
  {
    return zzb(7200000L, 259200000L) + 43200000L;
  }
  
  public final long zzmz()
  {
    return zzb(600000L, 86400000L) + 3600000L;
  }
  
  @SuppressLint({"CommitPrefEdits"})
  public final void zzna()
  {
    Object localObject = zznc();
    long l1 = ((SharedPreferences)localObject).getLong("FORBIDDEN_COUNT", 0L);
    long l2 = ((SharedPreferences)localObject).getLong("SUCCESSFUL_COUNT", 0L);
    localObject = ((SharedPreferences)localObject).edit();
    if (l1 == 0L) {
      l1 = 3L;
    } else {
      l1 = Math.min(10L, l1 + 1L);
    }
    l2 = Math.max(0L, Math.min(l2, 10L - l1));
    ((SharedPreferences.Editor)localObject).putLong("FORBIDDEN_COUNT", l1);
    ((SharedPreferences.Editor)localObject).putLong("SUCCESSFUL_COUNT", l2);
    ((SharedPreferences.Editor)localObject).apply();
  }
  
  @SuppressLint({"CommitPrefEdits"})
  public final void zznb()
  {
    Object localObject = zznc();
    long l2 = ((SharedPreferences)localObject).getLong("SUCCESSFUL_COUNT", 0L);
    long l1 = ((SharedPreferences)localObject).getLong("FORBIDDEN_COUNT", 0L);
    l2 = Math.min(10L, l2 + 1L);
    l1 = Math.max(0L, Math.min(l1, 10L - l2));
    localObject = ((SharedPreferences)localObject).edit();
    ((SharedPreferences.Editor)localObject).putLong("SUCCESSFUL_COUNT", l2);
    ((SharedPreferences.Editor)localObject).putLong("FORBIDDEN_COUNT", l1);
    ((SharedPreferences.Editor)localObject).apply();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
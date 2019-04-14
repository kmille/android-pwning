package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import java.util.List;

@SafeParcelable.Class(creator="WakeLockEventCreator")
public final class WakeLockEvent
  extends StatsEvent
{
  public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
  @SafeParcelable.Field(getter="getTimeout", id=16)
  private final long mTimeout;
  @SafeParcelable.Field(getter="getTimeMillis", id=2)
  private final long zzfo;
  @SafeParcelable.Field(getter="getEventType", id=11)
  private int zzfp;
  @SafeParcelable.Field(getter="getWakeLockName", id=4)
  private final String zzfq;
  @SafeParcelable.Field(getter="getSecondaryWakeLockName", id=10)
  private final String zzfr;
  @SafeParcelable.Field(getter="getCodePackage", id=17)
  private final String zzfs;
  @SafeParcelable.Field(getter="getWakeLockType", id=5)
  private final int zzft;
  @SafeParcelable.Field(getter="getCallingPackages", id=6)
  private final List<String> zzfu;
  @SafeParcelable.Field(getter="getEventKey", id=12)
  private final String zzfv;
  @SafeParcelable.Field(getter="getElapsedRealtime", id=8)
  private final long zzfw;
  @SafeParcelable.Field(getter="getDeviceState", id=14)
  private int zzfx;
  @SafeParcelable.Field(getter="getHostPackage", id=13)
  private final String zzfy;
  @SafeParcelable.Field(getter="getBeginPowerPercentage", id=15)
  private final float zzfz;
  @SafeParcelable.VersionField(id=1)
  private final int zzg;
  private long zzga;
  
  @SafeParcelable.Constructor
  WakeLockEvent(@SafeParcelable.Param(id=1) int paramInt1, @SafeParcelable.Param(id=2) long paramLong1, @SafeParcelable.Param(id=11) int paramInt2, @SafeParcelable.Param(id=4) String paramString1, @SafeParcelable.Param(id=5) int paramInt3, @SafeParcelable.Param(id=6) List<String> paramList, @SafeParcelable.Param(id=12) String paramString2, @SafeParcelable.Param(id=8) long paramLong2, @SafeParcelable.Param(id=14) int paramInt4, @SafeParcelable.Param(id=10) String paramString3, @SafeParcelable.Param(id=13) String paramString4, @SafeParcelable.Param(id=15) float paramFloat, @SafeParcelable.Param(id=16) long paramLong3, @SafeParcelable.Param(id=17) String paramString5)
  {
    this.zzg = paramInt1;
    this.zzfo = paramLong1;
    this.zzfp = paramInt2;
    this.zzfq = paramString1;
    this.zzfr = paramString3;
    this.zzfs = paramString5;
    this.zzft = paramInt3;
    this.zzga = -1L;
    this.zzfu = paramList;
    this.zzfv = paramString2;
    this.zzfw = paramLong2;
    this.zzfx = paramInt4;
    this.zzfy = paramString4;
    this.zzfz = paramFloat;
    this.mTimeout = paramLong3;
  }
  
  public WakeLockEvent(long paramLong1, int paramInt1, String paramString1, int paramInt2, List<String> paramList, String paramString2, long paramLong2, int paramInt3, String paramString3, String paramString4, float paramFloat, long paramLong3, String paramString5)
  {
    this(2, paramLong1, paramInt1, paramString1, paramInt2, paramList, paramString2, paramLong2, paramInt3, paramString3, paramString4, paramFloat, paramLong3, paramString5);
  }
  
  public final int getEventType()
  {
    return this.zzfp;
  }
  
  public final long getTimeMillis()
  {
    return this.zzfo;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zzg);
    SafeParcelWriter.writeLong(paramParcel, 2, getTimeMillis());
    SafeParcelWriter.writeString(paramParcel, 4, this.zzfq, false);
    SafeParcelWriter.writeInt(paramParcel, 5, this.zzft);
    SafeParcelWriter.writeStringList(paramParcel, 6, this.zzfu, false);
    SafeParcelWriter.writeLong(paramParcel, 8, this.zzfw);
    SafeParcelWriter.writeString(paramParcel, 10, this.zzfr, false);
    SafeParcelWriter.writeInt(paramParcel, 11, getEventType());
    SafeParcelWriter.writeString(paramParcel, 12, this.zzfv, false);
    SafeParcelWriter.writeString(paramParcel, 13, this.zzfy, false);
    SafeParcelWriter.writeInt(paramParcel, 14, this.zzfx);
    SafeParcelWriter.writeFloat(paramParcel, 15, this.zzfz);
    SafeParcelWriter.writeLong(paramParcel, 16, this.mTimeout);
    SafeParcelWriter.writeString(paramParcel, 17, this.zzfs, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final long zzu()
  {
    return this.zzga;
  }
  
  public final String zzv()
  {
    String str5 = this.zzfq;
    int i = this.zzft;
    String str1;
    if (this.zzfu == null) {
      str1 = "";
    } else {
      str1 = TextUtils.join(",", this.zzfu);
    }
    int j = this.zzfx;
    String str2;
    if (this.zzfr == null) {
      str2 = "";
    } else {
      str2 = this.zzfr;
    }
    String str3;
    if (this.zzfy == null) {
      str3 = "";
    } else {
      str3 = this.zzfy;
    }
    float f = this.zzfz;
    String str4;
    if (this.zzfs == null) {
      str4 = "";
    } else {
      str4 = this.zzfs;
    }
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str5).length() + 45 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
    localStringBuilder.append("\t");
    localStringBuilder.append(str5);
    localStringBuilder.append("\t");
    localStringBuilder.append(i);
    localStringBuilder.append("\t");
    localStringBuilder.append(str1);
    localStringBuilder.append("\t");
    localStringBuilder.append(j);
    localStringBuilder.append("\t");
    localStringBuilder.append(str2);
    localStringBuilder.append("\t");
    localStringBuilder.append(str3);
    localStringBuilder.append("\t");
    localStringBuilder.append(f);
    localStringBuilder.append("\t");
    localStringBuilder.append(str4);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/stats/WakeLockEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
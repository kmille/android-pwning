package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;

@SafeParcelable.Class(creator="AccountChangeEventCreator")
public class AccountChangeEvent
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();
  @SafeParcelable.VersionField(id=1)
  private final int zze;
  @SafeParcelable.Field(id=2)
  private final long zzf;
  @SafeParcelable.Field(id=3)
  private final String zzg;
  @SafeParcelable.Field(id=4)
  private final int zzh;
  @SafeParcelable.Field(id=5)
  private final int zzi;
  @SafeParcelable.Field(id=6)
  private final String zzj;
  
  @SafeParcelable.Constructor
  AccountChangeEvent(@SafeParcelable.Param(id=1) int paramInt1, @SafeParcelable.Param(id=2) long paramLong, @SafeParcelable.Param(id=3) String paramString1, @SafeParcelable.Param(id=4) int paramInt2, @SafeParcelable.Param(id=5) int paramInt3, @SafeParcelable.Param(id=6) String paramString2)
  {
    this.zze = paramInt1;
    this.zzf = paramLong;
    this.zzg = ((String)Preconditions.checkNotNull(paramString1));
    this.zzh = paramInt2;
    this.zzi = paramInt3;
    this.zzj = paramString2;
  }
  
  public AccountChangeEvent(long paramLong, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    this.zze = 1;
    this.zzf = paramLong;
    this.zzg = ((String)Preconditions.checkNotNull(paramString1));
    this.zzh = paramInt1;
    this.zzi = paramInt2;
    this.zzj = paramString2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof AccountChangeEvent))
    {
      paramObject = (AccountChangeEvent)paramObject;
      if ((this.zze == ((AccountChangeEvent)paramObject).zze) && (this.zzf == ((AccountChangeEvent)paramObject).zzf) && (Objects.equal(this.zzg, ((AccountChangeEvent)paramObject).zzg)) && (this.zzh == ((AccountChangeEvent)paramObject).zzh) && (this.zzi == ((AccountChangeEvent)paramObject).zzi) && (Objects.equal(this.zzj, ((AccountChangeEvent)paramObject).zzj))) {
        return true;
      }
    }
    return false;
  }
  
  public String getAccountName()
  {
    return this.zzg;
  }
  
  public String getChangeData()
  {
    return this.zzj;
  }
  
  public int getChangeType()
  {
    return this.zzh;
  }
  
  public int getEventIndex()
  {
    return this.zzi;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zze), Long.valueOf(this.zzf), this.zzg, Integer.valueOf(this.zzh), Integer.valueOf(this.zzi), this.zzj });
  }
  
  public String toString()
  {
    String str1 = "UNKNOWN";
    switch (this.zzh)
    {
    default: 
      break;
    case 4: 
      str1 = "RENAMED_TO";
      break;
    case 3: 
      str1 = "RENAMED_FROM";
      break;
    case 2: 
      str1 = "REMOVED";
      break;
    case 1: 
      str1 = "ADDED";
    }
    String str2 = this.zzg;
    String str3 = this.zzj;
    int i = this.zzi;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str2).length() + 91 + String.valueOf(str1).length() + String.valueOf(str3).length());
    localStringBuilder.append("AccountChangeEvent {accountName = ");
    localStringBuilder.append(str2);
    localStringBuilder.append(", changeType = ");
    localStringBuilder.append(str1);
    localStringBuilder.append(", changeData = ");
    localStringBuilder.append(str3);
    localStringBuilder.append(", eventIndex = ");
    localStringBuilder.append(i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zze);
    SafeParcelWriter.writeLong(paramParcel, 2, this.zzf);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzg, false);
    SafeParcelWriter.writeInt(paramParcel, 4, this.zzh);
    SafeParcelWriter.writeInt(paramParcel, 5, this.zzi);
    SafeParcelWriter.writeString(paramParcel, 6, this.zzj, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/AccountChangeEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
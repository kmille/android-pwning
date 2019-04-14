package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import java.util.List;

@SafeParcelable.Class(creator="TokenDataCreator")
public class TokenData
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<TokenData> CREATOR = new zzk();
  @SafeParcelable.Field(getter="getGrantedScopes", id=6)
  private final List<String> zzaa;
  @SafeParcelable.Field(getter="getScopeData", id=7)
  private final String zzab;
  @SafeParcelable.VersionField(id=1)
  private final int zzv;
  @SafeParcelable.Field(getter="getToken", id=2)
  private final String zzw;
  @SafeParcelable.Field(getter="getExpirationTimeSecs", id=3)
  private final Long zzx;
  @SafeParcelable.Field(getter="isCached", id=4)
  private final boolean zzy;
  @SafeParcelable.Field(getter="isSnowballed", id=5)
  private final boolean zzz;
  
  @SafeParcelable.Constructor
  TokenData(@SafeParcelable.Param(id=1) int paramInt, @SafeParcelable.Param(id=2) String paramString1, @SafeParcelable.Param(id=3) Long paramLong, @SafeParcelable.Param(id=4) boolean paramBoolean1, @SafeParcelable.Param(id=5) boolean paramBoolean2, @SafeParcelable.Param(id=6) List<String> paramList, @SafeParcelable.Param(id=7) String paramString2)
  {
    this.zzv = paramInt;
    this.zzw = Preconditions.checkNotEmpty(paramString1);
    this.zzx = paramLong;
    this.zzy = paramBoolean1;
    this.zzz = paramBoolean2;
    this.zzaa = paramList;
    this.zzab = paramString2;
  }
  
  @Nullable
  public static TokenData zza(Bundle paramBundle, String paramString)
  {
    paramBundle.setClassLoader(TokenData.class.getClassLoader());
    paramBundle = paramBundle.getBundle(paramString);
    if (paramBundle == null) {
      return null;
    }
    paramBundle.setClassLoader(TokenData.class.getClassLoader());
    return (TokenData)paramBundle.getParcelable("TokenData");
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof TokenData)) {
      return false;
    }
    paramObject = (TokenData)paramObject;
    return (TextUtils.equals(this.zzw, ((TokenData)paramObject).zzw)) && (Objects.equal(this.zzx, ((TokenData)paramObject).zzx)) && (this.zzy == ((TokenData)paramObject).zzy) && (this.zzz == ((TokenData)paramObject).zzz) && (Objects.equal(this.zzaa, ((TokenData)paramObject).zzaa)) && (Objects.equal(this.zzab, ((TokenData)paramObject).zzab));
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzw, this.zzx, Boolean.valueOf(this.zzy), Boolean.valueOf(this.zzz), this.zzaa, this.zzab });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zzv);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzw, false);
    SafeParcelWriter.writeLongObject(paramParcel, 3, this.zzx, false);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzy);
    SafeParcelWriter.writeBoolean(paramParcel, 5, this.zzz);
    SafeParcelWriter.writeStringList(paramParcel, 6, this.zzaa, false);
    SafeParcelWriter.writeString(paramParcel, 7, this.zzab, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final String zzb()
  {
    return this.zzw;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/TokenData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
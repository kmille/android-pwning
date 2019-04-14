package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
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
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@SafeParcelable.Class(creator="IdTokenCreator")
@SafeParcelable.Reserved({1000})
public final class IdToken
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<IdToken> CREATOR = new zzk();
  @NonNull
  @SafeParcelable.Field(getter="getIdToken", id=2)
  private final String zzak;
  @NonNull
  @SafeParcelable.Field(getter="getAccountType", id=1)
  private final String zzr;
  
  @SafeParcelable.Constructor
  public IdToken(@NonNull @SafeParcelable.Param(id=1) String paramString1, @NonNull @SafeParcelable.Param(id=2) String paramString2)
  {
    Preconditions.checkArgument(TextUtils.isEmpty(paramString1) ^ true, "account type string cannot be null or empty");
    Preconditions.checkArgument(TextUtils.isEmpty(paramString2) ^ true, "id token string cannot be null or empty");
    this.zzr = paramString1;
    this.zzak = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof IdToken)) {
      return false;
    }
    paramObject = (IdToken)paramObject;
    return (Objects.equal(this.zzr, ((IdToken)paramObject).zzr)) && (Objects.equal(this.zzak, ((IdToken)paramObject).zzak));
  }
  
  @NonNull
  public final String getAccountType()
  {
    return this.zzr;
  }
  
  @NonNull
  public final String getIdToken()
  {
    return this.zzak;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, getAccountType(), false);
    SafeParcelWriter.writeString(paramParcel, 2, getIdToken(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/credentials/IdToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
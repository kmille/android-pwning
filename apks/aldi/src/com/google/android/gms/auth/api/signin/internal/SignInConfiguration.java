package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@SafeParcelable.Class(creator="SignInConfigurationCreator")
@SafeParcelable.Reserved({1})
public final class SignInConfiguration
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<SignInConfiguration> CREATOR = new zzx();
  @SafeParcelable.Field(getter="getConsumerPkgName", id=2)
  private final String zzbr;
  @SafeParcelable.Field(getter="getGoogleConfig", id=5)
  private GoogleSignInOptions zzbs;
  
  @SafeParcelable.Constructor
  public SignInConfiguration(@SafeParcelable.Param(id=2) String paramString, @SafeParcelable.Param(id=5) GoogleSignInOptions paramGoogleSignInOptions)
  {
    this.zzbr = Preconditions.checkNotEmpty(paramString);
    this.zzbs = paramGoogleSignInOptions;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof SignInConfiguration)) {
      return false;
    }
    paramObject = (SignInConfiguration)paramObject;
    return (this.zzbr.equals(((SignInConfiguration)paramObject).zzbr)) && (this.zzbs == null ? ((SignInConfiguration)paramObject).zzbs == null : this.zzbs.equals(((SignInConfiguration)paramObject).zzbs));
  }
  
  public final int hashCode()
  {
    return new HashAccumulator().addObject(this.zzbr).addObject(this.zzbs).hash();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzbr, false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, this.zzbs, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final GoogleSignInOptions zzm()
  {
    return this.zzbs;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/SignInConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
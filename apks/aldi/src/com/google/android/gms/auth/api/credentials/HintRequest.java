package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@SafeParcelable.Class(creator="HintRequestCreator")
public final class HintRequest
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<HintRequest> CREATOR = new zzj();
  @SafeParcelable.Field(getter="getAccountTypes", id=4)
  private final String[] zzaa;
  @SafeParcelable.Field(getter="isIdTokenRequested", id=5)
  private final boolean zzad;
  @SafeParcelable.Field(getter="getServerClientId", id=6)
  private final String zzae;
  @SafeParcelable.Field(getter="getIdTokenNonce", id=7)
  private final String zzaf;
  @SafeParcelable.Field(getter="getHintPickerConfig", id=1)
  private final CredentialPickerConfig zzah;
  @SafeParcelable.Field(getter="isEmailAddressIdentifierSupported", id=2)
  private final boolean zzai;
  @SafeParcelable.Field(getter="isPhoneNumberIdentifierSupported", id=3)
  private final boolean zzaj;
  @SafeParcelable.Field(id=1000)
  private final int zzu;
  
  @SafeParcelable.Constructor
  HintRequest(@SafeParcelable.Param(id=1000) int paramInt, @SafeParcelable.Param(id=1) CredentialPickerConfig paramCredentialPickerConfig, @SafeParcelable.Param(id=2) boolean paramBoolean1, @SafeParcelable.Param(id=3) boolean paramBoolean2, @SafeParcelable.Param(id=4) String[] paramArrayOfString, @SafeParcelable.Param(id=5) boolean paramBoolean3, @SafeParcelable.Param(id=6) String paramString1, @SafeParcelable.Param(id=7) String paramString2)
  {
    this.zzu = paramInt;
    this.zzah = ((CredentialPickerConfig)Preconditions.checkNotNull(paramCredentialPickerConfig));
    this.zzai = paramBoolean1;
    this.zzaj = paramBoolean2;
    this.zzaa = ((String[])Preconditions.checkNotNull(paramArrayOfString));
    if (this.zzu < 2)
    {
      this.zzad = true;
      this.zzae = null;
      this.zzaf = null;
      return;
    }
    this.zzad = paramBoolean3;
    this.zzae = paramString1;
    this.zzaf = paramString2;
  }
  
  private HintRequest(Builder paramBuilder)
  {
    this(2, Builder.zzc(paramBuilder), Builder.zzd(paramBuilder), Builder.zze(paramBuilder), Builder.zzf(paramBuilder), Builder.zzg(paramBuilder), Builder.zzh(paramBuilder), Builder.zzi(paramBuilder));
  }
  
  @NonNull
  public final String[] getAccountTypes()
  {
    return this.zzaa;
  }
  
  @NonNull
  public final CredentialPickerConfig getHintPickerConfig()
  {
    return this.zzah;
  }
  
  @Nullable
  public final String getIdTokenNonce()
  {
    return this.zzaf;
  }
  
  @Nullable
  public final String getServerClientId()
  {
    return this.zzae;
  }
  
  public final boolean isEmailAddressIdentifierSupported()
  {
    return this.zzai;
  }
  
  public final boolean isIdTokenRequested()
  {
    return this.zzad;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, getHintPickerConfig(), paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 2, isEmailAddressIdentifierSupported());
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzaj);
    SafeParcelWriter.writeStringArray(paramParcel, 4, getAccountTypes(), false);
    SafeParcelWriter.writeBoolean(paramParcel, 5, isIdTokenRequested());
    SafeParcelWriter.writeString(paramParcel, 6, getServerClientId(), false);
    SafeParcelWriter.writeString(paramParcel, 7, getIdTokenNonce(), false);
    SafeParcelWriter.writeInt(paramParcel, 1000, this.zzu);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public static final class Builder
  {
    private String[] zzaa;
    private boolean zzad = false;
    private String zzae;
    private String zzaf;
    private CredentialPickerConfig zzah = new CredentialPickerConfig.Builder().build();
    private boolean zzai;
    private boolean zzaj;
    
    public final HintRequest build()
    {
      if (this.zzaa == null) {
        this.zzaa = new String[0];
      }
      if ((!this.zzai) && (!this.zzaj) && (this.zzaa.length == 0)) {
        throw new IllegalStateException("At least one authentication method must be specified");
      }
      return new HintRequest(this, null);
    }
    
    public final Builder setAccountTypes(String... paramVarArgs)
    {
      String[] arrayOfString = paramVarArgs;
      if (paramVarArgs == null) {
        arrayOfString = new String[0];
      }
      this.zzaa = arrayOfString;
      return this;
    }
    
    public final Builder setEmailAddressIdentifierSupported(boolean paramBoolean)
    {
      this.zzai = paramBoolean;
      return this;
    }
    
    public final Builder setHintPickerConfig(@NonNull CredentialPickerConfig paramCredentialPickerConfig)
    {
      this.zzah = ((CredentialPickerConfig)Preconditions.checkNotNull(paramCredentialPickerConfig));
      return this;
    }
    
    public final Builder setIdTokenNonce(@Nullable String paramString)
    {
      this.zzaf = paramString;
      return this;
    }
    
    public final Builder setIdTokenRequested(boolean paramBoolean)
    {
      this.zzad = paramBoolean;
      return this;
    }
    
    public final Builder setPhoneNumberIdentifierSupported(boolean paramBoolean)
    {
      this.zzaj = paramBoolean;
      return this;
    }
    
    public final Builder setServerClientId(@Nullable String paramString)
    {
      this.zzae = paramString;
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/credentials/HintRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
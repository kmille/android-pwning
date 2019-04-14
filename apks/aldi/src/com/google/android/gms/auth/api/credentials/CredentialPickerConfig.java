package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator="CredentialPickerConfigCreator")
public final class CredentialPickerConfig
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new zze();
  @SafeParcelable.Field(getter="shouldShowCancelButton", id=2)
  private final boolean mShowCancelButton;
  @SafeParcelable.Field(id=1000)
  private final int zzu;
  @SafeParcelable.Field(getter="shouldShowAddAccountButton", id=1)
  private final boolean zzv;
  @Deprecated
  @SafeParcelable.Field(getter="isForNewAccount", id=3)
  private final boolean zzw;
  @SafeParcelable.Field(getter="getPromptInternalId", id=4)
  private final int zzx;
  
  @SafeParcelable.Constructor
  CredentialPickerConfig(@SafeParcelable.Param(id=1000) int paramInt1, @SafeParcelable.Param(id=1) boolean paramBoolean1, @SafeParcelable.Param(id=2) boolean paramBoolean2, @SafeParcelable.Param(id=3) boolean paramBoolean3, @SafeParcelable.Param(id=4) int paramInt2)
  {
    this.zzu = paramInt1;
    this.zzv = paramBoolean1;
    this.mShowCancelButton = paramBoolean2;
    paramBoolean1 = true;
    int i = 1;
    if (paramInt1 < 2)
    {
      this.zzw = paramBoolean3;
      paramInt1 = i;
      if (paramBoolean3) {
        paramInt1 = 3;
      }
      this.zzx = paramInt1;
      return;
    }
    if (paramInt2 != 3) {
      paramBoolean1 = false;
    }
    this.zzw = paramBoolean1;
    this.zzx = paramInt2;
  }
  
  private CredentialPickerConfig(Builder paramBuilder)
  {
    this(2, Builder.zzc(paramBuilder), Builder.zzd(paramBuilder), false, Builder.zze(paramBuilder));
  }
  
  @Deprecated
  public final boolean isForNewAccount()
  {
    return this.zzx == 3;
  }
  
  public final boolean shouldShowAddAccountButton()
  {
    return this.zzv;
  }
  
  public final boolean shouldShowCancelButton()
  {
    return this.mShowCancelButton;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBoolean(paramParcel, 1, shouldShowAddAccountButton());
    SafeParcelWriter.writeBoolean(paramParcel, 2, shouldShowCancelButton());
    SafeParcelWriter.writeBoolean(paramParcel, 3, isForNewAccount());
    SafeParcelWriter.writeInt(paramParcel, 4, this.zzx);
    SafeParcelWriter.writeInt(paramParcel, 1000, this.zzu);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public static class Builder
  {
    private boolean mShowCancelButton = true;
    private boolean zzv = false;
    private int zzy = 1;
    
    public CredentialPickerConfig build()
    {
      return new CredentialPickerConfig(this, null);
    }
    
    @Deprecated
    public Builder setForNewAccount(boolean paramBoolean)
    {
      int i;
      if (paramBoolean) {
        i = 3;
      } else {
        i = 1;
      }
      this.zzy = i;
      return this;
    }
    
    public Builder setPrompt(int paramInt)
    {
      this.zzy = paramInt;
      return this;
    }
    
    public Builder setShowAddAccountButton(boolean paramBoolean)
    {
      this.zzv = paramBoolean;
      return this;
    }
    
    public Builder setShowCancelButton(boolean paramBoolean)
    {
      this.mShowCancelButton = paramBoolean;
      return this;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Prompt
  {
    public static final int CONTINUE = 1;
    public static final int SIGN_IN = 2;
    public static final int SIGN_UP = 3;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/credentials/CredentialPickerConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
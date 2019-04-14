package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@SafeParcelable.Class(creator="ConnectionInfoCreator")
public final class zzb
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzb> CREATOR = new zzc();
  @SafeParcelable.Field(id=1)
  Bundle zzcz;
  @SafeParcelable.Field(id=2)
  Feature[] zzda;
  
  public zzb() {}
  
  @SafeParcelable.Constructor
  zzb(@SafeParcelable.Param(id=1) Bundle paramBundle, @SafeParcelable.Param(id=2) Feature[] paramArrayOfFeature)
  {
    this.zzcz = paramBundle;
    this.zzda = paramArrayOfFeature;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBundle(paramParcel, 1, this.zzcz, false);
    SafeParcelWriter.writeTypedArray(paramParcel, 2, this.zzda, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
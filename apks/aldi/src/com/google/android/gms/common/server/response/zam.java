package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;

@ShowFirstParty
@SafeParcelable.Class(creator="FieldMapPairCreator")
public final class zam
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zam> CREATOR = new zaj();
  @SafeParcelable.VersionField(id=1)
  private final int versionCode;
  @SafeParcelable.Field(id=2)
  final String zaqy;
  @SafeParcelable.Field(id=3)
  final FastJsonResponse.Field<?, ?> zaqz;
  
  @SafeParcelable.Constructor
  zam(@SafeParcelable.Param(id=1) int paramInt, @SafeParcelable.Param(id=2) String paramString, @SafeParcelable.Param(id=3) FastJsonResponse.Field<?, ?> paramField)
  {
    this.versionCode = paramInt;
    this.zaqy = paramString;
    this.zaqz = paramField;
  }
  
  zam(String paramString, FastJsonResponse.Field<?, ?> paramField)
  {
    this.versionCode = 1;
    this.zaqy = paramString;
    this.zaqz = paramField;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.versionCode);
    SafeParcelWriter.writeString(paramParcel, 2, this.zaqy, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zaqz, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/server/response/zam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
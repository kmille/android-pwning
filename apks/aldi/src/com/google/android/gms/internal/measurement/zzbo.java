package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class zzbo
  implements Parcelable
{
  @Deprecated
  public static final Parcelable.Creator<zzbo> CREATOR = new zzbp();
  private String value;
  private String zzno;
  private String zzxt;
  
  @Deprecated
  public zzbo() {}
  
  @Deprecated
  zzbo(Parcel paramParcel)
  {
    this.zzno = paramParcel.readString();
    this.zzxt = paramParcel.readString();
    this.value = paramParcel.readString();
  }
  
  @Deprecated
  public final int describeContents()
  {
    return 0;
  }
  
  public final String getId()
  {
    return this.zzno;
  }
  
  public final String getValue()
  {
    return this.value;
  }
  
  @Deprecated
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.zzno);
    paramParcel.writeString(this.zzxt);
    paramParcel.writeString(this.value);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzbo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
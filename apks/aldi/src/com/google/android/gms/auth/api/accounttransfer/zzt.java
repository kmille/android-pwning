package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.util.ArraySet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Indicator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Set;

@SafeParcelable.Class(creator="AuthenticatorTransferInfoCreator")
public class zzt
  extends zzaz
{
  public static final Parcelable.Creator<zzt> CREATOR = new zzu();
  private static final HashMap<String, FastJsonResponse.Field<?, ?>> zzaz;
  @SafeParcelable.Indicator
  private final Set<Integer> zzba;
  @SafeParcelable.Field(getter="getAccountType", id=2)
  private String zzbn;
  @SafeParcelable.Field(getter="getStatus", id=3)
  private int zzbo;
  @SafeParcelable.Field(getter="getTransferBytes", id=4)
  private byte[] zzbp;
  @SafeParcelable.Field(getter="getPendingIntent", id=5)
  private PendingIntent zzbq;
  @SafeParcelable.Field(getter="getDeviceMetaData", id=6)
  private DeviceMetaData zzbr;
  @SafeParcelable.VersionField(id=1)
  private final int zzv;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzaz = localHashMap;
    localHashMap.put("accountType", FastJsonResponse.Field.forString("accountType", 2));
    zzaz.put("status", FastJsonResponse.Field.forInteger("status", 3));
    zzaz.put("transferBytes", FastJsonResponse.Field.forBase64("transferBytes", 4));
  }
  
  public zzt()
  {
    this.zzba = new ArraySet(3);
    this.zzv = 1;
  }
  
  @SafeParcelable.Constructor
  zzt(@SafeParcelable.Indicator Set<Integer> paramSet, @SafeParcelable.Param(id=1) int paramInt1, @SafeParcelable.Param(id=2) String paramString, @SafeParcelable.Param(id=3) int paramInt2, @SafeParcelable.Param(id=4) byte[] paramArrayOfByte, @SafeParcelable.Param(id=5) PendingIntent paramPendingIntent, @SafeParcelable.Param(id=6) DeviceMetaData paramDeviceMetaData)
  {
    this.zzba = paramSet;
    this.zzv = paramInt1;
    this.zzbn = paramString;
    this.zzbo = paramInt2;
    this.zzbp = paramArrayOfByte;
    this.zzbq = paramPendingIntent;
    this.zzbr = paramDeviceMetaData;
  }
  
  public Object getFieldValue(FastJsonResponse.Field paramField)
  {
    switch (paramField.getSafeParcelableFieldId())
    {
    default: 
      i = paramField.getSafeParcelableFieldId();
      paramField = new StringBuilder(37);
      paramField.append("Unknown SafeParcelable id=");
      paramField.append(i);
      throw new IllegalStateException(paramField.toString());
    case 4: 
      return this.zzbp;
    }
    for (int i = this.zzbo;; i = this.zzv)
    {
      return Integer.valueOf(i);
      return this.zzbn;
    }
  }
  
  public boolean isFieldSet(FastJsonResponse.Field paramField)
  {
    return this.zzba.contains(Integer.valueOf(paramField.getSafeParcelableFieldId()));
  }
  
  public void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, byte[] paramArrayOfByte)
  {
    int i = paramField.getSafeParcelableFieldId();
    if (i == 4)
    {
      this.zzbp = paramArrayOfByte;
      this.zzba.add(Integer.valueOf(i));
      return;
    }
    paramField = new StringBuilder(59);
    paramField.append("Field with id=");
    paramField.append(i);
    paramField.append(" is not known to be an byte array.");
    throw new IllegalArgumentException(paramField.toString());
  }
  
  public void setIntegerInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, int paramInt)
  {
    int i = paramField.getSafeParcelableFieldId();
    if (i == 3)
    {
      this.zzbo = paramInt;
      this.zzba.add(Integer.valueOf(i));
      return;
    }
    paramField = new StringBuilder(52);
    paramField.append("Field with id=");
    paramField.append(i);
    paramField.append(" is not known to be an int.");
    throw new IllegalArgumentException(paramField.toString());
  }
  
  public void setStringInternal(FastJsonResponse.Field<?, ?> paramField, String paramString1, String paramString2)
  {
    int i = paramField.getSafeParcelableFieldId();
    if (i == 2)
    {
      this.zzbn = paramString2;
      this.zzba.add(Integer.valueOf(i));
      return;
    }
    throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[] { Integer.valueOf(i) }));
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    Set localSet = this.zzba;
    if (localSet.contains(Integer.valueOf(1))) {
      SafeParcelWriter.writeInt(paramParcel, 1, this.zzv);
    }
    if (localSet.contains(Integer.valueOf(2))) {
      SafeParcelWriter.writeString(paramParcel, 2, this.zzbn, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      SafeParcelWriter.writeInt(paramParcel, 3, this.zzbo);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      SafeParcelWriter.writeByteArray(paramParcel, 4, this.zzbp, true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      SafeParcelWriter.writeParcelable(paramParcel, 5, this.zzbq, paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzbr, paramInt, true);
    }
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/accounttransfer/zzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
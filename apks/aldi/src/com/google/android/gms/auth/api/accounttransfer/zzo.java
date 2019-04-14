package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SafeParcelable.Class(creator="AccountTransferProgressCreator")
public class zzo
  extends zzaz
{
  public static final Parcelable.Creator<zzo> CREATOR = new zzp();
  private static final ArrayMap<String, FastJsonResponse.Field<?, ?>> zzbe;
  @SafeParcelable.Field(getter="getRegisteredAccountTypes", id=2)
  private List<String> zzbf;
  @SafeParcelable.Field(getter="getInProgressAccountTypes", id=3)
  private List<String> zzbg;
  @SafeParcelable.Field(getter="getSuccessAccountTypes", id=4)
  private List<String> zzbh;
  @SafeParcelable.Field(getter="getFailedAccountTypes", id=5)
  private List<String> zzbi;
  @SafeParcelable.Field(getter="getEscrowedAccountTypes", id=6)
  private List<String> zzbj;
  @SafeParcelable.VersionField(id=1)
  private final int zzv;
  
  static
  {
    ArrayMap localArrayMap = new ArrayMap();
    zzbe = localArrayMap;
    localArrayMap.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
    zzbe.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
    zzbe.put("success", FastJsonResponse.Field.forStrings("success", 4));
    zzbe.put("failed", FastJsonResponse.Field.forStrings("failed", 5));
    zzbe.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
  }
  
  public zzo()
  {
    this.zzv = 1;
  }
  
  @SafeParcelable.Constructor
  zzo(@SafeParcelable.Param(id=1) int paramInt, @Nullable @SafeParcelable.Param(id=2) List<String> paramList1, @Nullable @SafeParcelable.Param(id=3) List<String> paramList2, @Nullable @SafeParcelable.Param(id=4) List<String> paramList3, @Nullable @SafeParcelable.Param(id=5) List<String> paramList4, @Nullable @SafeParcelable.Param(id=6) List<String> paramList5)
  {
    this.zzv = paramInt;
    this.zzbf = paramList1;
    this.zzbg = paramList2;
    this.zzbh = paramList3;
    this.zzbi = paramList4;
    this.zzbj = paramList5;
  }
  
  public Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings()
  {
    return zzbe;
  }
  
  public Object getFieldValue(FastJsonResponse.Field paramField)
  {
    switch (paramField.getSafeParcelableFieldId())
    {
    default: 
      int i = paramField.getSafeParcelableFieldId();
      paramField = new StringBuilder(37);
      paramField.append("Unknown SafeParcelable id=");
      paramField.append(i);
      throw new IllegalStateException(paramField.toString());
    case 6: 
      return this.zzbj;
    case 5: 
      return this.zzbi;
    case 4: 
      return this.zzbh;
    case 3: 
      return this.zzbg;
    case 2: 
      return this.zzbf;
    }
    return Integer.valueOf(this.zzv);
  }
  
  public boolean isFieldSet(FastJsonResponse.Field paramField)
  {
    return true;
  }
  
  public void setStringsInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<String> paramArrayList)
  {
    int i = paramField.getSafeParcelableFieldId();
    switch (i)
    {
    default: 
      throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[] { Integer.valueOf(i) }));
    case 6: 
      this.zzbj = paramArrayList;
      return;
    case 5: 
      this.zzbi = paramArrayList;
      return;
    case 4: 
      this.zzbh = paramArrayList;
      return;
    case 3: 
      this.zzbg = paramArrayList;
      return;
    }
    this.zzbf = paramArrayList;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zzv);
    SafeParcelWriter.writeStringList(paramParcel, 2, this.zzbf, false);
    SafeParcelWriter.writeStringList(paramParcel, 3, this.zzbg, false);
    SafeParcelWriter.writeStringList(paramParcel, 4, this.zzbh, false);
    SafeParcelWriter.writeStringList(paramParcel, 5, this.zzbi, false);
    SafeParcelWriter.writeStringList(paramParcel, 6, this.zzbj, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/accounttransfer/zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
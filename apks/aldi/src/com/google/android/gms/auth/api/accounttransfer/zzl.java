package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Indicator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SafeParcelable.Class(creator="AccountTransferMsgCreator")
public final class zzl
  extends zzaz
{
  public static final Parcelable.Creator<zzl> CREATOR = new zzm();
  private static final HashMap<String, FastJsonResponse.Field<?, ?>> zzaz;
  @SafeParcelable.Indicator
  private final Set<Integer> zzba;
  @SafeParcelable.Field(getter="getAuthenticatorDatas", id=2)
  private ArrayList<zzr> zzbb;
  @SafeParcelable.Field(getter="getRequestType", id=3)
  private int zzbc;
  @SafeParcelable.Field(getter="getProgress", id=4)
  private zzo zzbd;
  @SafeParcelable.VersionField(id=1)
  private final int zzv;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzaz = localHashMap;
    localHashMap.put("authenticatorData", FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, zzr.class));
    zzaz.put("progress", FastJsonResponse.Field.forConcreteType("progress", 4, zzo.class));
  }
  
  public zzl()
  {
    this.zzba = new HashSet(1);
    this.zzv = 1;
  }
  
  @SafeParcelable.Constructor
  zzl(@SafeParcelable.Indicator Set<Integer> paramSet, @SafeParcelable.Param(id=1) int paramInt1, @SafeParcelable.Param(id=2) ArrayList<zzr> paramArrayList, @SafeParcelable.Param(id=3) int paramInt2, @SafeParcelable.Param(id=4) zzo paramzzo)
  {
    this.zzba = paramSet;
    this.zzv = paramInt1;
    this.zzbb = paramArrayList;
    this.zzbc = paramInt2;
    this.zzbd = paramzzo;
  }
  
  public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<T> paramArrayList)
  {
    int i = paramField.getSafeParcelableFieldId();
    if (i == 2)
    {
      this.zzbb = paramArrayList;
      this.zzba.add(Integer.valueOf(i));
      return;
    }
    throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[] { Integer.valueOf(i), paramArrayList.getClass().getCanonicalName() }));
  }
  
  public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, T paramT)
  {
    int i = paramField.getSafeParcelableFieldId();
    if (i == 4)
    {
      this.zzbd = ((zzo)paramT);
      this.zzba.add(Integer.valueOf(i));
      return;
    }
    throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[] { Integer.valueOf(i), paramT.getClass().getCanonicalName() }));
  }
  
  public final Object getFieldValue(FastJsonResponse.Field paramField)
  {
    int i = paramField.getSafeParcelableFieldId();
    if (i != 4)
    {
      switch (i)
      {
      default: 
        i = paramField.getSafeParcelableFieldId();
        paramField = new StringBuilder(37);
        paramField.append("Unknown SafeParcelable id=");
        paramField.append(i);
        throw new IllegalStateException(paramField.toString());
      case 2: 
        return this.zzbb;
      }
      return Integer.valueOf(this.zzv);
    }
    return this.zzbd;
  }
  
  public final boolean isFieldSet(FastJsonResponse.Field paramField)
  {
    return this.zzba.contains(Integer.valueOf(paramField.getSafeParcelableFieldId()));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    Set localSet = this.zzba;
    if (localSet.contains(Integer.valueOf(1))) {
      SafeParcelWriter.writeInt(paramParcel, 1, this.zzv);
    }
    if (localSet.contains(Integer.valueOf(2))) {
      SafeParcelWriter.writeTypedList(paramParcel, 2, this.zzbb, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      SafeParcelWriter.writeInt(paramParcel, 3, this.zzbc);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzbd, paramInt, true);
    }
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/accounttransfer/zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
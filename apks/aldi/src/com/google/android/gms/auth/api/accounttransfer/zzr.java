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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SafeParcelable.Class(creator="AuthenticatorAnnotatedDataCreator")
public class zzr
  extends zzaz
{
  public static final Parcelable.Creator<zzr> CREATOR = new zzs();
  private static final HashMap<String, FastJsonResponse.Field<?, ?>> zzaz;
  @SafeParcelable.Field(getter="getPackageName", id=4)
  private String mPackageName;
  @SafeParcelable.Indicator
  private final Set<Integer> zzba;
  @SafeParcelable.Field(getter="getInfo", id=2)
  private zzt zzbk;
  @SafeParcelable.Field(getter="getSignature", id=3)
  private String zzbl;
  @SafeParcelable.Field(getter="getId", id=5)
  private String zzbm;
  @SafeParcelable.VersionField(id=1)
  private final int zzv;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzaz = localHashMap;
    localHashMap.put("authenticatorInfo", FastJsonResponse.Field.forConcreteType("authenticatorInfo", 2, zzt.class));
    zzaz.put("signature", FastJsonResponse.Field.forString("signature", 3));
    zzaz.put("package", FastJsonResponse.Field.forString("package", 4));
  }
  
  public zzr()
  {
    this.zzba = new HashSet(3);
    this.zzv = 1;
  }
  
  @SafeParcelable.Constructor
  zzr(@SafeParcelable.Indicator Set<Integer> paramSet, @SafeParcelable.Param(id=1) int paramInt, @SafeParcelable.Param(id=2) zzt paramzzt, @SafeParcelable.Param(id=3) String paramString1, @SafeParcelable.Param(id=4) String paramString2, @SafeParcelable.Param(id=5) String paramString3)
  {
    this.zzba = paramSet;
    this.zzv = paramInt;
    this.zzbk = paramzzt;
    this.zzbl = paramString1;
    this.mPackageName = paramString2;
    this.zzbm = paramString3;
  }
  
  public <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, T paramT)
  {
    int i = paramField.getSafeParcelableFieldId();
    if (i == 2)
    {
      this.zzbk = ((zzt)paramT);
      this.zzba.add(Integer.valueOf(i));
      return;
    }
    throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[] { Integer.valueOf(i), paramT.getClass().getCanonicalName() }));
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
    case 4: 
      return this.mPackageName;
    case 3: 
      return this.zzbl;
    case 2: 
      return this.zzbk;
    }
    return Integer.valueOf(this.zzv);
  }
  
  public boolean isFieldSet(FastJsonResponse.Field paramField)
  {
    return this.zzba.contains(Integer.valueOf(paramField.getSafeParcelableFieldId()));
  }
  
  public void setStringInternal(FastJsonResponse.Field<?, ?> paramField, String paramString1, String paramString2)
  {
    int i = paramField.getSafeParcelableFieldId();
    switch (i)
    {
    default: 
      throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[] { Integer.valueOf(i) }));
    case 4: 
      this.mPackageName = paramString2;
      break;
    case 3: 
      this.zzbl = paramString2;
    }
    this.zzba.add(Integer.valueOf(i));
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    Set localSet = this.zzba;
    if (localSet.contains(Integer.valueOf(1))) {
      SafeParcelWriter.writeInt(paramParcel, 1, this.zzv);
    }
    if (localSet.contains(Integer.valueOf(2))) {
      SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzbk, paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      SafeParcelWriter.writeString(paramParcel, 3, this.zzbl, true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      SafeParcelWriter.writeString(paramParcel, 4, this.mPackageName, true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      SafeParcelWriter.writeString(paramParcel, 5, this.zzbm, true);
    }
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/accounttransfer/zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
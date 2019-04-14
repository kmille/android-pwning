package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@KeepForSdk
@SafeParcelable.Class(creator="StringToIntConverterCreator")
public final class StringToIntConverter
  extends AbstractSafeParcelable
  implements FastJsonResponse.FieldConverter<String, Integer>
{
  public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zac();
  @SafeParcelable.VersionField(id=1)
  private final int zale;
  private final HashMap<String, Integer> zapl;
  private final SparseArray<String> zapm;
  @SafeParcelable.Field(getter="getSerializedMap", id=2)
  private final ArrayList<zaa> zapn;
  
  @KeepForSdk
  public StringToIntConverter()
  {
    this.zale = 1;
    this.zapl = new HashMap();
    this.zapm = new SparseArray();
    this.zapn = null;
  }
  
  @SafeParcelable.Constructor
  StringToIntConverter(@SafeParcelable.Param(id=1) int paramInt, @SafeParcelable.Param(id=2) ArrayList<zaa> paramArrayList)
  {
    this.zale = paramInt;
    this.zapl = new HashMap();
    this.zapm = new SparseArray();
    this.zapn = null;
    paramArrayList = (ArrayList)paramArrayList;
    int i = paramArrayList.size();
    paramInt = 0;
    while (paramInt < i)
    {
      Object localObject = paramArrayList.get(paramInt);
      paramInt += 1;
      localObject = (zaa)localObject;
      add(((zaa)localObject).zapo, ((zaa)localObject).zapp);
    }
  }
  
  @KeepForSdk
  public final StringToIntConverter add(String paramString, int paramInt)
  {
    this.zapl.put(paramString, Integer.valueOf(paramInt));
    this.zapm.put(paramInt, paramString);
    return this;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zale);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.zapl.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new zaa(str, ((Integer)this.zapl.get(str)).intValue()));
    }
    SafeParcelWriter.writeTypedList(paramParcel, 2, localArrayList, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final int zacj()
  {
    return 7;
  }
  
  public final int zack()
  {
    return 0;
  }
  
  @SafeParcelable.Class(creator="StringToIntConverterEntryCreator")
  public static final class zaa
    extends AbstractSafeParcelable
  {
    public static final Parcelable.Creator<zaa> CREATOR = new zad();
    @SafeParcelable.VersionField(id=1)
    private final int versionCode;
    @SafeParcelable.Field(id=2)
    final String zapo;
    @SafeParcelable.Field(id=3)
    final int zapp;
    
    @SafeParcelable.Constructor
    zaa(@SafeParcelable.Param(id=1) int paramInt1, @SafeParcelable.Param(id=2) String paramString, @SafeParcelable.Param(id=3) int paramInt2)
    {
      this.versionCode = paramInt1;
      this.zapo = paramString;
      this.zapp = paramInt2;
    }
    
    zaa(String paramString, int paramInt)
    {
      this.versionCode = 1;
      this.zapo = paramString;
      this.zapp = paramInt;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
      SafeParcelWriter.writeInt(paramParcel, 1, this.versionCode);
      SafeParcelWriter.writeString(paramParcel, 2, this.zapo, false);
      SafeParcelWriter.writeInt(paramParcel, 3, this.zapp);
      SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/server/converter/StringToIntConverter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
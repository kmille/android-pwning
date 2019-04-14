package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@KeepForSdk
@SafeParcelable.Class(creator="SafeParcelResponseCreator")
@VisibleForTesting
public class SafeParcelResponse
  extends FastSafeParcelableJsonResponse
{
  @KeepForSdk
  public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zap();
  private final String mClassName;
  @SafeParcelable.VersionField(getter="getVersionCode", id=1)
  private final int zale;
  @SafeParcelable.Field(getter="getFieldMappingDictionary", id=3)
  private final zak zapy;
  @SafeParcelable.Field(getter="getParcel", id=2)
  private final Parcel zara;
  private final int zarb;
  private int zarc;
  private int zard;
  
  @SafeParcelable.Constructor
  SafeParcelResponse(@SafeParcelable.Param(id=1) int paramInt, @SafeParcelable.Param(id=2) Parcel paramParcel, @SafeParcelable.Param(id=3) zak paramzak)
  {
    this.zale = paramInt;
    this.zara = ((Parcel)Preconditions.checkNotNull(paramParcel));
    this.zarb = 2;
    this.zapy = paramzak;
    if (this.zapy == null) {}
    for (paramParcel = null;; paramParcel = this.zapy.zact())
    {
      this.mClassName = paramParcel;
      break;
    }
    this.zarc = 2;
  }
  
  private SafeParcelResponse(SafeParcelable paramSafeParcelable, zak paramzak, String paramString)
  {
    this.zale = 1;
    this.zara = Parcel.obtain();
    paramSafeParcelable.writeToParcel(this.zara, 0);
    this.zarb = 1;
    this.zapy = ((zak)Preconditions.checkNotNull(paramzak));
    this.mClassName = ((String)Preconditions.checkNotNull(paramString));
    this.zarc = 2;
  }
  
  public SafeParcelResponse(zak paramzak, String paramString)
  {
    this.zale = 1;
    this.zara = Parcel.obtain();
    this.zarb = 0;
    this.zapy = ((zak)Preconditions.checkNotNull(paramzak));
    this.mClassName = ((String)Preconditions.checkNotNull(paramString));
    this.zarc = 0;
  }
  
  @KeepForSdk
  public static <T extends FastJsonResponse,  extends SafeParcelable> SafeParcelResponse from(T paramT)
  {
    String str = paramT.getClass().getCanonicalName();
    zak localzak = new zak(paramT.getClass());
    zaa(localzak, paramT);
    localzak.zacs();
    localzak.zacr();
    return new SafeParcelResponse((SafeParcelable)paramT, localzak, str);
  }
  
  private static void zaa(zak paramzak, FastJsonResponse paramFastJsonResponse)
  {
    Object localObject = paramFastJsonResponse.getClass();
    if (!paramzak.zaa((Class)localObject))
    {
      Map localMap = paramFastJsonResponse.getFieldMappings();
      paramzak.zaa((Class)localObject, localMap);
      localObject = localMap.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramFastJsonResponse = (FastJsonResponse.Field)localMap.get((String)((Iterator)localObject).next());
        Class localClass = paramFastJsonResponse.zapw;
        if (localClass != null) {
          try
          {
            zaa(paramzak, (FastJsonResponse)localClass.newInstance());
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            paramzak = String.valueOf(paramFastJsonResponse.zapw.getCanonicalName());
            if (paramzak.length() != 0) {
              paramzak = "Could not access object of type ".concat(paramzak);
            } else {
              paramzak = new String("Could not access object of type ");
            }
            throw new IllegalStateException(paramzak, localIllegalAccessException);
          }
          catch (InstantiationException localInstantiationException)
          {
            paramzak = String.valueOf(paramFastJsonResponse.zapw.getCanonicalName());
            if (paramzak.length() != 0) {
              paramzak = "Could not instantiate an object of type ".concat(paramzak);
            } else {
              paramzak = new String("Could not instantiate an object of type ");
            }
            throw new IllegalStateException(paramzak, localInstantiationException);
          }
        }
      }
    }
  }
  
  private static void zaa(StringBuilder paramStringBuilder, int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default: 
      paramStringBuilder = new StringBuilder(26);
      paramStringBuilder.append("Unknown type = ");
      paramStringBuilder.append(paramInt);
      throw new IllegalArgumentException(paramStringBuilder.toString());
    case 11: 
      throw new IllegalArgumentException("Method does not accept concrete type.");
    case 10: 
      MapUtils.writeStringMapToJson(paramStringBuilder, (HashMap)paramObject);
      return;
    case 9: 
      paramStringBuilder.append("\"");
      paramStringBuilder.append(Base64Utils.encodeUrlSafe((byte[])paramObject));
      paramStringBuilder.append("\"");
      return;
    case 8: 
      paramStringBuilder.append("\"");
      paramStringBuilder.append(Base64Utils.encode((byte[])paramObject));
      paramStringBuilder.append("\"");
      return;
    case 7: 
      paramStringBuilder.append("\"");
      paramStringBuilder.append(JsonUtils.escapeString(paramObject.toString()));
      paramStringBuilder.append("\"");
      return;
    }
    paramStringBuilder.append(paramObject);
  }
  
  private final void zaa(StringBuilder paramStringBuilder, Map<String, FastJsonResponse.Field<?, ?>> paramMap, Parcel paramParcel)
  {
    SparseArray localSparseArray = new SparseArray();
    paramMap = paramMap.entrySet().iterator();
    Object localObject1;
    while (paramMap.hasNext())
    {
      localObject1 = (Map.Entry)paramMap.next();
      localSparseArray.put(((FastJsonResponse.Field)((Map.Entry)localObject1).getValue()).getSafeParcelableFieldId(), localObject1);
    }
    paramStringBuilder.append('{');
    int j = SafeParcelReader.validateObjectHeader(paramParcel);
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = SafeParcelReader.readHeader(paramParcel);
      localObject1 = (Map.Entry)localSparseArray.get(SafeParcelReader.getFieldId(k));
      if (localObject1 != null)
      {
        if (i != 0) {
          paramStringBuilder.append(",");
        }
        paramMap = (String)((Map.Entry)localObject1).getKey();
        localObject1 = (FastJsonResponse.Field)((Map.Entry)localObject1).getValue();
        paramStringBuilder.append("\"");
        paramStringBuilder.append(paramMap);
        paramStringBuilder.append("\":");
        Object localObject2;
        if (((FastJsonResponse.Field)localObject1).zacn())
        {
          switch (((FastJsonResponse.Field)localObject1).zaps)
          {
          default: 
            i = ((FastJsonResponse.Field)localObject1).zaps;
            paramStringBuilder = new StringBuilder(36);
            paramStringBuilder.append("Unknown field out type = ");
            paramStringBuilder.append(i);
            throw new IllegalArgumentException(paramStringBuilder.toString());
          case 11: 
            throw new IllegalArgumentException("Method does not accept concrete type.");
          case 10: 
            paramMap = SafeParcelReader.createBundle(paramParcel, k);
            localObject2 = new HashMap();
            Iterator localIterator = paramMap.keySet().iterator();
            while (localIterator.hasNext())
            {
              String str = (String)localIterator.next();
              ((HashMap)localObject2).put(str, paramMap.getString(str));
            }
            paramMap = zab((FastJsonResponse.Field)localObject1, localObject2);
            break;
          case 8: 
          case 9: 
            paramMap = SafeParcelReader.createByteArray(paramParcel, k);
            break;
          case 7: 
            paramMap = SafeParcelReader.createString(paramParcel, k);
            break;
          case 6: 
            paramMap = Boolean.valueOf(SafeParcelReader.readBoolean(paramParcel, k));
            break;
          case 5: 
            paramMap = SafeParcelReader.createBigDecimal(paramParcel, k);
            break;
          case 4: 
            paramMap = Double.valueOf(SafeParcelReader.readDouble(paramParcel, k));
            break;
          case 3: 
            paramMap = Float.valueOf(SafeParcelReader.readFloat(paramParcel, k));
            break;
          case 2: 
            paramMap = Long.valueOf(SafeParcelReader.readLong(paramParcel, k));
            break;
          case 1: 
            paramMap = SafeParcelReader.createBigInteger(paramParcel, k);
            break;
          case 0: 
            paramMap = Integer.valueOf(SafeParcelReader.readInt(paramParcel, k));
          }
          paramMap = zab((FastJsonResponse.Field)localObject1, paramMap);
          zab(paramStringBuilder, (FastJsonResponse.Field)localObject1, paramMap);
        }
        else
        {
          if (((FastJsonResponse.Field)localObject1).zapt)
          {
            paramStringBuilder.append("[");
            switch (((FastJsonResponse.Field)localObject1).zaps)
            {
            default: 
              throw new IllegalStateException("Unknown field type out.");
            case 11: 
              paramMap = SafeParcelReader.createParcelArray(paramParcel, k);
              k = paramMap.length;
              i = 0;
            }
            while (i < k)
            {
              if (i > 0) {
                paramStringBuilder.append(",");
              }
              paramMap[i].setDataPosition(0);
              zaa(paramStringBuilder, ((FastJsonResponse.Field)localObject1).zacq(), paramMap[i]);
              i += 1;
              continue;
              throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
              ArrayUtils.writeStringArray(paramStringBuilder, SafeParcelReader.createStringArray(paramParcel, k));
              break;
              ArrayUtils.writeArray(paramStringBuilder, SafeParcelReader.createBooleanArray(paramParcel, k));
              break;
              paramMap = SafeParcelReader.createBigDecimalArray(paramParcel, k);
              break label753;
              ArrayUtils.writeArray(paramStringBuilder, SafeParcelReader.createDoubleArray(paramParcel, k));
              break;
              ArrayUtils.writeArray(paramStringBuilder, SafeParcelReader.createFloatArray(paramParcel, k));
              break;
              ArrayUtils.writeArray(paramStringBuilder, SafeParcelReader.createLongArray(paramParcel, k));
              break;
              paramMap = SafeParcelReader.createBigIntegerArray(paramParcel, k);
              label753:
              ArrayUtils.writeArray(paramStringBuilder, paramMap);
              break;
              ArrayUtils.writeArray(paramStringBuilder, SafeParcelReader.createIntArray(paramParcel, k));
            }
            paramMap = "]";
          }
          switch (((FastJsonResponse.Field)localObject1).zaps)
          {
          default: 
            throw new IllegalStateException("Unknown field type out");
          case 11: 
            paramMap = SafeParcelReader.createParcel(paramParcel, k);
            paramMap.setDataPosition(0);
            zaa(paramStringBuilder, ((FastJsonResponse.Field)localObject1).zacq(), paramMap);
            break;
          case 10: 
            paramMap = SafeParcelReader.createBundle(paramParcel, k);
            localObject1 = paramMap.keySet();
            ((Set)localObject1).size();
            paramStringBuilder.append("{");
            localObject1 = ((Set)localObject1).iterator();
            for (i = 1; ((Iterator)localObject1).hasNext(); i = 0)
            {
              localObject2 = (String)((Iterator)localObject1).next();
              if (i == 0) {
                paramStringBuilder.append(",");
              }
              paramStringBuilder.append("\"");
              paramStringBuilder.append((String)localObject2);
              paramStringBuilder.append("\"");
              paramStringBuilder.append(":");
              paramStringBuilder.append("\"");
              paramStringBuilder.append(JsonUtils.escapeString(paramMap.getString((String)localObject2)));
              paramStringBuilder.append("\"");
            }
            paramMap = "}";
            break;
          case 9: 
            paramMap = SafeParcelReader.createByteArray(paramParcel, k);
            paramStringBuilder.append("\"");
            paramMap = Base64Utils.encodeUrlSafe(paramMap);
            break;
          case 8: 
            paramMap = SafeParcelReader.createByteArray(paramParcel, k);
            paramStringBuilder.append("\"");
            paramMap = Base64Utils.encode(paramMap);
            break;
          case 7: 
            paramMap = SafeParcelReader.createString(paramParcel, k);
            paramStringBuilder.append("\"");
            paramMap = JsonUtils.escapeString(paramMap);
            paramStringBuilder.append(paramMap);
            paramMap = "\"";
            paramStringBuilder.append(paramMap);
            break;
          case 6: 
            paramStringBuilder.append(SafeParcelReader.readBoolean(paramParcel, k));
            break;
          case 5: 
            paramMap = SafeParcelReader.createBigDecimal(paramParcel, k);
            break;
          case 4: 
            paramStringBuilder.append(SafeParcelReader.readDouble(paramParcel, k));
            break;
          case 3: 
            paramStringBuilder.append(SafeParcelReader.readFloat(paramParcel, k));
            break;
          case 2: 
            paramStringBuilder.append(SafeParcelReader.readLong(paramParcel, k));
            break;
          case 1: 
            paramMap = SafeParcelReader.createBigInteger(paramParcel, k);
            paramStringBuilder.append(paramMap);
            break;
          }
          paramStringBuilder.append(SafeParcelReader.readInt(paramParcel, k));
        }
        i = 1;
      }
    }
    if (paramParcel.dataPosition() == j)
    {
      paramStringBuilder.append('}');
      return;
    }
    paramStringBuilder = new StringBuilder(37);
    paramStringBuilder.append("Overread allowed size end=");
    paramStringBuilder.append(j);
    throw new SafeParcelReader.ParseException(paramStringBuilder.toString(), paramParcel);
  }
  
  private final void zab(FastJsonResponse.Field<?, ?> paramField)
  {
    int i;
    if (paramField.zapv != -1) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (this.zara != null)
      {
        switch (this.zarc)
        {
        default: 
          throw new IllegalStateException("Unknown parse state in SafeParcelResponse.");
        case 2: 
          throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
        case 1: 
          return;
        }
        this.zard = SafeParcelWriter.beginObjectHeader(this.zara);
        this.zarc = 1;
        return;
      }
      throw new IllegalStateException("Internal Parcel object is null.");
    }
    throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
  }
  
  private final void zab(StringBuilder paramStringBuilder, FastJsonResponse.Field<?, ?> paramField, Object paramObject)
  {
    if (paramField.zapr)
    {
      paramObject = (ArrayList)paramObject;
      paramStringBuilder.append("[");
      int j = ((ArrayList)paramObject).size();
      int i = 0;
      while (i < j)
      {
        if (i != 0) {
          paramStringBuilder.append(",");
        }
        zaa(paramStringBuilder, paramField.zapq, ((ArrayList)paramObject).get(i));
        i += 1;
      }
      paramStringBuilder.append("]");
      return;
    }
    zaa(paramStringBuilder, paramField.zapq, paramObject);
  }
  
  private final Parcel zacu()
  {
    switch (this.zarc)
    {
    default: 
      break;
    case 0: 
      this.zard = SafeParcelWriter.beginObjectHeader(this.zara);
    case 1: 
      SafeParcelWriter.finishObjectHeader(this.zara, this.zard);
      this.zarc = 2;
    }
    return this.zara;
  }
  
  public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<T> paramArrayList)
  {
    zab(paramField);
    paramString = new ArrayList();
    paramArrayList.size();
    paramArrayList = (ArrayList)paramArrayList;
    int j = paramArrayList.size();
    int i = 0;
    while (i < j)
    {
      Object localObject = paramArrayList.get(i);
      i += 1;
      paramString.add(((SafeParcelResponse)localObject).zacu());
    }
    SafeParcelWriter.writeParcelList(this.zara, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  public <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, T paramT)
  {
    zab(paramField);
    paramString = ((SafeParcelResponse)paramT).zacu();
    SafeParcelWriter.writeParcel(this.zara, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  public Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings()
  {
    if (this.zapy == null) {
      return null;
    }
    return this.zapy.zai(this.mClassName);
  }
  
  public Object getValueObject(String paramString)
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  public boolean isPrimitiveFieldSet(String paramString)
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  protected void setBooleanInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, boolean paramBoolean)
  {
    zab(paramField);
    SafeParcelWriter.writeBoolean(this.zara, paramField.getSafeParcelableFieldId(), paramBoolean);
  }
  
  protected void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, byte[] paramArrayOfByte)
  {
    zab(paramField);
    SafeParcelWriter.writeByteArray(this.zara, paramField.getSafeParcelableFieldId(), paramArrayOfByte, true);
  }
  
  protected void setIntegerInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, int paramInt)
  {
    zab(paramField);
    SafeParcelWriter.writeInt(this.zara, paramField.getSafeParcelableFieldId(), paramInt);
  }
  
  protected void setLongInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, long paramLong)
  {
    zab(paramField);
    SafeParcelWriter.writeLong(this.zara, paramField.getSafeParcelableFieldId(), paramLong);
  }
  
  protected void setStringInternal(FastJsonResponse.Field<?, ?> paramField, String paramString1, String paramString2)
  {
    zab(paramField);
    SafeParcelWriter.writeString(this.zara, paramField.getSafeParcelableFieldId(), paramString2, true);
  }
  
  protected void setStringsInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<String> paramArrayList)
  {
    zab(paramField);
    int j = paramArrayList.size();
    paramString = new String[j];
    int i = 0;
    while (i < j)
    {
      paramString[i] = ((String)paramArrayList.get(i));
      i += 1;
    }
    SafeParcelWriter.writeStringArray(this.zara, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  public String toString()
  {
    Preconditions.checkNotNull(this.zapy, "Cannot convert to JSON on client side.");
    Parcel localParcel = zacu();
    localParcel.setDataPosition(0);
    StringBuilder localStringBuilder = new StringBuilder(100);
    zaa(localStringBuilder, this.zapy.zai(this.mClassName), localParcel);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zale);
    SafeParcelWriter.writeParcel(paramParcel, 2, zacu(), false);
    zak localzak;
    switch (this.zarb)
    {
    default: 
      paramInt = this.zarb;
      paramParcel = new StringBuilder(34);
      paramParcel.append("Invalid creation type: ");
      paramParcel.append(paramInt);
      throw new IllegalStateException(paramParcel.toString());
    case 1: 
    case 2: 
      localzak = this.zapy;
      break;
    case 0: 
      localzak = null;
    }
    SafeParcelWriter.writeParcelable(paramParcel, 3, localzak, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  protected final void zaa(FastJsonResponse.Field<?, ?> paramField, String paramString, double paramDouble)
  {
    zab(paramField);
    SafeParcelWriter.writeDouble(this.zara, paramField.getSafeParcelableFieldId(), paramDouble);
  }
  
  protected final void zaa(FastJsonResponse.Field<?, ?> paramField, String paramString, float paramFloat)
  {
    zab(paramField);
    SafeParcelWriter.writeFloat(this.zara, paramField.getSafeParcelableFieldId(), paramFloat);
  }
  
  protected final void zaa(FastJsonResponse.Field<?, ?> paramField, String paramString, BigDecimal paramBigDecimal)
  {
    zab(paramField);
    SafeParcelWriter.writeBigDecimal(this.zara, paramField.getSafeParcelableFieldId(), paramBigDecimal, true);
  }
  
  protected final void zaa(FastJsonResponse.Field<?, ?> paramField, String paramString, BigInteger paramBigInteger)
  {
    zab(paramField);
    SafeParcelWriter.writeBigInteger(this.zara, paramField.getSafeParcelableFieldId(), paramBigInteger, true);
  }
  
  protected final void zaa(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Integer> paramArrayList)
  {
    zab(paramField);
    int j = paramArrayList.size();
    paramString = new int[j];
    int i = 0;
    while (i < j)
    {
      paramString[i] = ((Integer)paramArrayList.get(i)).intValue();
      i += 1;
    }
    SafeParcelWriter.writeIntArray(this.zara, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  protected final void zaa(FastJsonResponse.Field<?, ?> paramField, String paramString, Map<String, String> paramMap)
  {
    zab(paramField);
    paramString = new Bundle();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramString.putString(str, (String)paramMap.get(str));
    }
    SafeParcelWriter.writeBundle(this.zara, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  protected final void zab(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<BigInteger> paramArrayList)
  {
    zab(paramField);
    int j = paramArrayList.size();
    paramString = new BigInteger[j];
    int i = 0;
    while (i < j)
    {
      paramString[i] = ((BigInteger)paramArrayList.get(i));
      i += 1;
    }
    SafeParcelWriter.writeBigIntegerArray(this.zara, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  protected final void zac(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Long> paramArrayList)
  {
    zab(paramField);
    int j = paramArrayList.size();
    paramString = new long[j];
    int i = 0;
    while (i < j)
    {
      paramString[i] = ((Long)paramArrayList.get(i)).longValue();
      i += 1;
    }
    SafeParcelWriter.writeLongArray(this.zara, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  protected final void zad(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Float> paramArrayList)
  {
    zab(paramField);
    int j = paramArrayList.size();
    paramString = new float[j];
    int i = 0;
    while (i < j)
    {
      paramString[i] = ((Float)paramArrayList.get(i)).floatValue();
      i += 1;
    }
    SafeParcelWriter.writeFloatArray(this.zara, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  protected final void zae(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Double> paramArrayList)
  {
    zab(paramField);
    int j = paramArrayList.size();
    paramString = new double[j];
    int i = 0;
    while (i < j)
    {
      paramString[i] = ((Double)paramArrayList.get(i)).doubleValue();
      i += 1;
    }
    SafeParcelWriter.writeDoubleArray(this.zara, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  protected final void zaf(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<BigDecimal> paramArrayList)
  {
    zab(paramField);
    int j = paramArrayList.size();
    paramString = new BigDecimal[j];
    int i = 0;
    while (i < j)
    {
      paramString[i] = ((BigDecimal)paramArrayList.get(i));
      i += 1;
    }
    SafeParcelWriter.writeBigDecimalArray(this.zara, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  protected final void zag(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Boolean> paramArrayList)
  {
    zab(paramField);
    int j = paramArrayList.size();
    paramString = new boolean[j];
    int i = 0;
    while (i < j)
    {
      paramString[i] = ((Boolean)paramArrayList.get(i)).booleanValue();
      i += 1;
    }
    SafeParcelWriter.writeBooleanArray(this.zara, paramField.getSafeParcelableFieldId(), paramString, true);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/server/response/SafeParcelResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
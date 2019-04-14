package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@KeepForSdk
@ShowFirstParty
public abstract class FastSafeParcelableJsonResponse
  extends FastJsonResponse
  implements SafeParcelable
{
  public final int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!getClass().isInstance(paramObject)) {
      return false;
    }
    paramObject = (FastJsonResponse)paramObject;
    Iterator localIterator = getFieldMappings().values().iterator();
    while (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (isFieldSet(localField))
      {
        if ((!((FastJsonResponse)paramObject).isFieldSet(localField)) || (!getFieldValue(localField).equals(((FastJsonResponse)paramObject).getFieldValue(localField)))) {
          return false;
        }
      }
      else if (((FastJsonResponse)paramObject).isFieldSet(localField)) {
        return false;
      }
    }
    return true;
  }
  
  @VisibleForTesting
  public Object getValueObject(String paramString)
  {
    return null;
  }
  
  public int hashCode()
  {
    Iterator localIterator = getFieldMappings().values().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (isFieldSet(localField)) {
        i = i * 31 + getFieldValue(localField).hashCode();
      }
    }
    return i;
  }
  
  @VisibleForTesting
  public boolean isPrimitiveFieldSet(String paramString)
  {
    return false;
  }
  
  @KeepForSdk
  public byte[] toByteArray()
  {
    Parcel localParcel = Parcel.obtain();
    writeToParcel(localParcel, 0);
    byte[] arrayOfByte = localParcel.marshall();
    localParcel.recycle();
    return arrayOfByte;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/server/response/FastSafeParcelableJsonResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Patterns;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@KeepForSdkWithMembers
@SafeParcelable.Class(creator="ProxyRequestCreator")
public class ProxyRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ProxyRequest> CREATOR = new zza();
  public static final int HTTP_METHOD_DELETE;
  public static final int HTTP_METHOD_GET = 0;
  public static final int HTTP_METHOD_HEAD;
  public static final int HTTP_METHOD_OPTIONS;
  public static final int HTTP_METHOD_PATCH = 7;
  public static final int HTTP_METHOD_POST = 1;
  public static final int HTTP_METHOD_PUT = 2;
  public static final int HTTP_METHOD_TRACE;
  public static final int LAST_CODE = 7;
  public static final int VERSION_CODE = 2;
  @SafeParcelable.Field(id=4)
  public final byte[] body;
  @SafeParcelable.Field(id=2)
  public final int httpMethod;
  @SafeParcelable.Field(id=3)
  public final long timeoutMillis;
  @SafeParcelable.Field(id=1)
  public final String url;
  @SafeParcelable.VersionField(id=1000)
  private final int versionCode;
  @SafeParcelable.Field(id=5)
  private Bundle zzby;
  
  static
  {
    HTTP_METHOD_DELETE = 3;
    HTTP_METHOD_HEAD = 4;
    HTTP_METHOD_OPTIONS = 5;
    HTTP_METHOD_TRACE = 6;
  }
  
  @SafeParcelable.Constructor
  ProxyRequest(@SafeParcelable.Param(id=1000) int paramInt1, @SafeParcelable.Param(id=1) String paramString, @SafeParcelable.Param(id=2) int paramInt2, @SafeParcelable.Param(id=3) long paramLong, @SafeParcelable.Param(id=4) byte[] paramArrayOfByte, @SafeParcelable.Param(id=5) Bundle paramBundle)
  {
    this.versionCode = paramInt1;
    this.url = paramString;
    this.httpMethod = paramInt2;
    this.timeoutMillis = paramLong;
    this.body = paramArrayOfByte;
    this.zzby = paramBundle;
  }
  
  public Map<String, String> getHeaderMap()
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(this.zzby.size());
    Iterator localIterator = this.zzby.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localLinkedHashMap.put(str, this.zzby.getString(str));
    }
    return Collections.unmodifiableMap(localLinkedHashMap);
  }
  
  public String toString()
  {
    String str = this.url;
    int i = this.httpMethod;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 42);
    localStringBuilder.append("ProxyRequest[ url: ");
    localStringBuilder.append(str);
    localStringBuilder.append(", method: ");
    localStringBuilder.append(i);
    localStringBuilder.append(" ]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.url, false);
    SafeParcelWriter.writeInt(paramParcel, 2, this.httpMethod);
    SafeParcelWriter.writeLong(paramParcel, 3, this.timeoutMillis);
    SafeParcelWriter.writeByteArray(paramParcel, 4, this.body, false);
    SafeParcelWriter.writeBundle(paramParcel, 5, this.zzby, false);
    SafeParcelWriter.writeInt(paramParcel, 1000, this.versionCode);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  @KeepForSdkWithMembers
  public static class Builder
  {
    private String zzbz;
    private int zzca = ProxyRequest.HTTP_METHOD_GET;
    private long zzcb = 3000L;
    private byte[] zzcc = null;
    private Bundle zzcd = new Bundle();
    
    public Builder(String paramString)
    {
      Preconditions.checkNotEmpty(paramString);
      if (Patterns.WEB_URL.matcher(paramString).matches())
      {
        this.zzbz = paramString;
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 51);
      localStringBuilder.append("The supplied url [ ");
      localStringBuilder.append(paramString);
      localStringBuilder.append("] is not match Patterns.WEB_URL!");
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    
    public ProxyRequest build()
    {
      if (this.zzcc == null) {
        this.zzcc = new byte[0];
      }
      return new ProxyRequest(2, this.zzbz, this.zzca, this.zzcb, this.zzcc, this.zzcd);
    }
    
    public Builder putHeader(String paramString1, String paramString2)
    {
      Preconditions.checkNotEmpty(paramString1, "Header name cannot be null or empty!");
      Bundle localBundle = this.zzcd;
      String str = paramString2;
      if (paramString2 == null) {
        str = "";
      }
      localBundle.putString(paramString1, str);
      return this;
    }
    
    public Builder setBody(byte[] paramArrayOfByte)
    {
      this.zzcc = paramArrayOfByte;
      return this;
    }
    
    public Builder setHttpMethod(int paramInt)
    {
      boolean bool;
      if ((paramInt >= 0) && (paramInt <= ProxyRequest.LAST_CODE)) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "Unrecognized http method code.");
      this.zzca = paramInt;
      return this;
    }
    
    public Builder setTimeoutMillis(long paramLong)
    {
      boolean bool;
      if (paramLong >= 0L) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "The specified timeout must be non-negative.");
      this.zzcb = paramLong;
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/proxy/ProxyRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
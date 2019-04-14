package com.bumptech.glide.load.model;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

public class GlideUrl
  implements Key
{
  private static final String ALLOWED_URI_CHARS = "@#&=*+-_.,:!?()/~'%;$";
  @Nullable
  private volatile byte[] cacheKeyBytes;
  private int hashCode;
  private final Headers headers;
  @Nullable
  private String safeStringUrl;
  @Nullable
  private URL safeUrl;
  @Nullable
  private final String stringUrl;
  @Nullable
  private final URL url;
  
  public GlideUrl(String paramString)
  {
    this(paramString, Headers.DEFAULT);
  }
  
  public GlideUrl(String paramString, Headers paramHeaders)
  {
    this.url = null;
    this.stringUrl = Preconditions.checkNotEmpty(paramString);
    this.headers = ((Headers)Preconditions.checkNotNull(paramHeaders));
  }
  
  public GlideUrl(URL paramURL)
  {
    this(paramURL, Headers.DEFAULT);
  }
  
  public GlideUrl(URL paramURL, Headers paramHeaders)
  {
    this.url = ((URL)Preconditions.checkNotNull(paramURL));
    this.stringUrl = null;
    this.headers = ((Headers)Preconditions.checkNotNull(paramHeaders));
  }
  
  private byte[] getCacheKeyBytes()
  {
    if (this.cacheKeyBytes == null) {
      this.cacheKeyBytes = getCacheKey().getBytes(CHARSET);
    }
    return this.cacheKeyBytes;
  }
  
  private String getSafeStringUrl()
  {
    if (TextUtils.isEmpty(this.safeStringUrl))
    {
      String str2 = this.stringUrl;
      String str1 = str2;
      if (TextUtils.isEmpty(str2)) {
        str1 = ((URL)Preconditions.checkNotNull(this.url)).toString();
      }
      this.safeStringUrl = Uri.encode(str1, "@#&=*+-_.,:!?()/~'%;$");
    }
    return this.safeStringUrl;
  }
  
  private URL getSafeUrl()
    throws MalformedURLException
  {
    if (this.safeUrl == null) {
      this.safeUrl = new URL(getSafeStringUrl());
    }
    return this.safeUrl;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof GlideUrl))
    {
      paramObject = (GlideUrl)paramObject;
      if ((getCacheKey().equals(((GlideUrl)paramObject).getCacheKey())) && (this.headers.equals(((GlideUrl)paramObject).headers))) {
        return true;
      }
    }
    return false;
  }
  
  public String getCacheKey()
  {
    if (this.stringUrl != null) {
      return this.stringUrl;
    }
    return ((URL)Preconditions.checkNotNull(this.url)).toString();
  }
  
  public Map<String, String> getHeaders()
  {
    return this.headers.getHeaders();
  }
  
  public int hashCode()
  {
    if (this.hashCode == 0)
    {
      this.hashCode = getCacheKey().hashCode();
      this.hashCode = (this.hashCode * 31 + this.headers.hashCode());
    }
    return this.hashCode;
  }
  
  public String toString()
  {
    return getCacheKey();
  }
  
  public String toStringUrl()
  {
    return getSafeStringUrl();
  }
  
  public URL toURL()
    throws MalformedURLException
  {
    return getSafeUrl();
  }
  
  public void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest)
  {
    paramMessageDigest.update(getCacheKeyBytes());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/GlideUrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
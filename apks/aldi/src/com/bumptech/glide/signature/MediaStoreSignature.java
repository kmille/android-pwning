package com.bumptech.glide.signature;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Key;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class MediaStoreSignature
  implements Key
{
  private final long dateModified;
  @NonNull
  private final String mimeType;
  private final int orientation;
  
  public MediaStoreSignature(@Nullable String paramString, long paramLong, int paramInt)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    this.mimeType = str;
    this.dateModified = paramLong;
    this.orientation = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject != null)
    {
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (MediaStoreSignature)paramObject;
      if (this.dateModified != ((MediaStoreSignature)paramObject).dateModified) {
        return false;
      }
      if (this.orientation != ((MediaStoreSignature)paramObject).orientation) {
        return false;
      }
      return this.mimeType.equals(((MediaStoreSignature)paramObject).mimeType);
    }
    return false;
  }
  
  public int hashCode()
  {
    return (this.mimeType.hashCode() * 31 + (int)(this.dateModified ^ this.dateModified >>> 32)) * 31 + this.orientation;
  }
  
  public void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest)
  {
    paramMessageDigest.update(ByteBuffer.allocate(12).putLong(this.dateModified).putInt(this.orientation).array());
    paramMessageDigest.update(this.mimeType.getBytes(CHARSET));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/signature/MediaStoreSignature.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
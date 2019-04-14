package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

final class zab
{
  public final Uri uri;
  
  public zab(Uri paramUri)
  {
    this.uri = paramUri;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zab)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    return Objects.equal(((zab)paramObject).uri, this.uri);
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.uri });
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/images/zab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
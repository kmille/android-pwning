package com.google.android.gms.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.VisibleForTesting;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

final class zzo
{
  private final KeyPair zzbw;
  private final long zzbx;
  
  @VisibleForTesting
  zzo(KeyPair paramKeyPair, long paramLong)
  {
    this.zzbw = paramKeyPair;
    this.zzbx = paramLong;
  }
  
  private final String zzo()
  {
    return Base64.encodeToString(this.zzbw.getPublic().getEncoded(), 11);
  }
  
  private final String zzp()
  {
    return Base64.encodeToString(this.zzbw.getPrivate().getEncoded(), 11);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzo)) {
      return false;
    }
    paramObject = (zzo)paramObject;
    return (this.zzbx == ((zzo)paramObject).zzbx) && (this.zzbw.getPublic().equals(((zzo)paramObject).zzbw.getPublic())) && (this.zzbw.getPrivate().equals(((zzo)paramObject).zzbw.getPrivate()));
  }
  
  final long getCreationTime()
  {
    return this.zzbx;
  }
  
  final KeyPair getKeyPair()
  {
    return this.zzbw;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzbw.getPublic(), this.zzbw.getPrivate(), Long.valueOf(this.zzbx) });
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class zzcp
{
  private int zzabb;
  private ByteArrayOutputStream zzabc = new ByteArrayOutputStream();
  
  public zzcp(zzco paramzzco) {}
  
  public final byte[] getPayload()
  {
    return this.zzabc.toByteArray();
  }
  
  public final boolean zze(zzch paramzzch)
  {
    Preconditions.checkNotNull(paramzzch);
    if (this.zzabb + 1 > zzbu.zzdy()) {
      return false;
    }
    Object localObject = this.zzabd.zza(paramzzch, false);
    if (localObject == null)
    {
      this.zzabd.zzbu().zza(paramzzch, "Error formatting hit");
      return true;
    }
    localObject = ((String)localObject).getBytes();
    int j = localObject.length;
    if (j > zzbu.zzdu())
    {
      this.zzabd.zzbu().zza(paramzzch, "Hit size exceeds the maximum size limit");
      return true;
    }
    int i = j;
    if (this.zzabc.size() > 0) {
      i = j + 1;
    }
    if (this.zzabc.size() + i > ((Integer)zzcc.zzzj.get()).intValue()) {
      return false;
    }
    try
    {
      if (this.zzabc.size() > 0) {
        this.zzabc.write(zzco.zzez());
      }
      this.zzabc.write((byte[])localObject);
      this.zzabb += 1;
      return true;
    }
    catch (IOException paramzzch)
    {
      this.zzabd.zze("Failed to write payload when batching hits", paramzzch);
    }
    return true;
  }
  
  public final int zzfa()
  {
    return this.zzabb;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzcp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
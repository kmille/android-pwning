package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzzy
  extends IOException
{
  private zzaaq zzbva = null;
  
  public zzzy(String paramString)
  {
    super(paramString);
  }
  
  static zzzy zzub()
  {
    return new zzzy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  static zzzy zzuc()
  {
    return new zzzy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
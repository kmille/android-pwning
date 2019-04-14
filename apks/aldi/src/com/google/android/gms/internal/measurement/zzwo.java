package com.google.android.gms.internal.measurement;

import com.google.android.gms.tagmanager.zzdi;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

final class zzwo
  implements zzwp
{
  private HttpURLConnection zzbmn;
  private InputStream zzbmo = null;
  
  public final void close()
  {
    HttpURLConnection localHttpURLConnection = this.zzbmn;
    try
    {
      if (this.zzbmo != null) {
        this.zzbmo.close();
      }
    }
    catch (IOException localIOException)
    {
      String str = String.valueOf(localIOException.getMessage());
      if (str.length() != 0) {
        str = "HttpUrlConnectionNetworkClient: Error when closing http input stream: ".concat(str);
      } else {
        str = new String("HttpUrlConnectionNetworkClient: Error when closing http input stream: ");
      }
      zzdi.zza(str, localIOException);
    }
    if (localHttpURLConnection != null) {
      localHttpURLConnection.disconnect();
    }
  }
  
  public final InputStream zzem(String paramString)
    throws IOException
  {
    paramString = (HttpURLConnection)new URL(paramString).openConnection();
    paramString.setReadTimeout(20000);
    paramString.setConnectTimeout(20000);
    this.zzbmn = paramString;
    paramString = this.zzbmn;
    int i = paramString.getResponseCode();
    if (i == 200)
    {
      this.zzbmo = paramString.getInputStream();
      return this.zzbmo;
    }
    paramString = new StringBuilder(25);
    paramString.append("Bad response: ");
    paramString.append(i);
    paramString = paramString.toString();
    if (i != 404)
    {
      if (i == 503) {
        throw new zzwr(paramString);
      }
      throw new IOException(paramString);
    }
    throw new FileNotFoundException(paramString);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzwo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
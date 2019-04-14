package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.ByteArrayOutputStream;

@KeepForSdk
public final class DataUtils
{
  @KeepForSdk
  public static void copyStringToBuffer(String paramString, CharArrayBuffer paramCharArrayBuffer)
  {
    if (TextUtils.isEmpty(paramString)) {
      paramCharArrayBuffer.sizeCopied = 0;
    } else if ((paramCharArrayBuffer.data != null) && (paramCharArrayBuffer.data.length >= paramString.length())) {
      paramString.getChars(0, paramString.length(), paramCharArrayBuffer.data, 0);
    } else {
      paramCharArrayBuffer.data = paramString.toCharArray();
    }
    paramCharArrayBuffer.sizeCopied = paramString.length();
  }
  
  @KeepForSdk
  public static byte[] loadImageBytes(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
    return localByteArrayOutputStream.toByteArray();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/DataUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
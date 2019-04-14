package com.bumptech.glide.load.model;

import android.support.annotation.NonNull;
import android.util.Log;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ByteBufferEncoder
  implements Encoder<ByteBuffer>
{
  private static final String TAG = "ByteBufferEncoder";
  
  public boolean encode(@NonNull ByteBuffer paramByteBuffer, @NonNull File paramFile, @NonNull Options paramOptions)
  {
    try
    {
      ByteBufferUtil.toFile(paramByteBuffer, paramFile);
      return true;
    }
    catch (IOException paramByteBuffer)
    {
      for (;;) {}
    }
    Log.isLoggable("ByteBufferEncoder", 3);
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/ByteBufferEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
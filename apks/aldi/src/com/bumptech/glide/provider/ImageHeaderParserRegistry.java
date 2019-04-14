package com.bumptech.glide.provider;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

public final class ImageHeaderParserRegistry
{
  private final List<ImageHeaderParser> parsers = new ArrayList();
  
  public final void add(@NonNull ImageHeaderParser paramImageHeaderParser)
  {
    try
    {
      this.parsers.add(paramImageHeaderParser);
      return;
    }
    finally
    {
      paramImageHeaderParser = finally;
      throw paramImageHeaderParser;
    }
  }
  
  @NonNull
  public final List<ImageHeaderParser> getParsers()
  {
    try
    {
      List localList = this.parsers;
      return localList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/provider/ImageHeaderParserRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
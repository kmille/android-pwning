package com.bumptech.glide.gifdecoder;

import android.support.annotation.ColorInt;
import java.util.ArrayList;
import java.util.List;

public class GifHeader
{
  public static final int NETSCAPE_LOOP_COUNT_DOES_NOT_EXIST = -1;
  public static final int NETSCAPE_LOOP_COUNT_FOREVER = 0;
  @ColorInt
  int bgColor;
  int bgIndex;
  GifFrame currentFrame;
  int frameCount = 0;
  final List<GifFrame> frames = new ArrayList();
  @ColorInt
  int[] gct = null;
  boolean gctFlag;
  int gctSize;
  int height;
  int loopCount = -1;
  int pixelAspect;
  int status = 0;
  int width;
  
  public int getHeight()
  {
    return this.height;
  }
  
  public int getNumFrames()
  {
    return this.frameCount;
  }
  
  public int getStatus()
  {
    return this.status;
  }
  
  public int getWidth()
  {
    return this.width;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/gifdecoder/GifHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
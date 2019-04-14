package com.bumptech.glide.gifdecoder;

import android.support.annotation.ColorInt;

class GifFrame
{
  static final int DISPOSAL_BACKGROUND = 2;
  static final int DISPOSAL_NONE = 1;
  static final int DISPOSAL_PREVIOUS = 3;
  static final int DISPOSAL_UNSPECIFIED = 0;
  int bufferFrameStart;
  int delay;
  int dispose;
  int ih;
  boolean interlace;
  int iw;
  int ix;
  int iy;
  @ColorInt
  int[] lct;
  int transIndex;
  boolean transparency;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/gifdecoder/GifFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
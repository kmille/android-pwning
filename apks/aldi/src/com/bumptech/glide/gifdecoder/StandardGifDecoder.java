package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StandardGifDecoder
  implements GifDecoder
{
  private static final int BYTES_PER_INTEGER = 4;
  @ColorInt
  private static final int COLOR_TRANSPARENT_BLACK = 0;
  private static final int INITIAL_FRAME_POINTER = -1;
  private static final int MASK_INT_LOWEST_BYTE = 255;
  private static final int MAX_STACK_SIZE = 4096;
  private static final int NULL_CODE = -1;
  private static final String TAG = "StandardGifDecoder";
  @ColorInt
  private int[] act;
  @NonNull
  private Bitmap.Config bitmapConfig = Bitmap.Config.ARGB_8888;
  private final GifDecoder.BitmapProvider bitmapProvider;
  private byte[] block;
  private int downsampledHeight;
  private int downsampledWidth;
  private int framePointer;
  private GifHeader header;
  @Nullable
  private Boolean isFirstFrameTransparent;
  private byte[] mainPixels;
  @ColorInt
  private int[] mainScratch;
  private GifHeaderParser parser;
  @ColorInt
  private final int[] pct = new int['Ā'];
  private byte[] pixelStack;
  private short[] prefix;
  private Bitmap previousImage;
  private ByteBuffer rawData;
  private int sampleSize;
  private boolean savePrevious;
  private int status;
  private byte[] suffix;
  
  public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider paramBitmapProvider)
  {
    this.bitmapProvider = paramBitmapProvider;
    this.header = new GifHeader();
  }
  
  public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider paramBitmapProvider, GifHeader paramGifHeader, ByteBuffer paramByteBuffer)
  {
    this(paramBitmapProvider, paramGifHeader, paramByteBuffer, 1);
  }
  
  public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider paramBitmapProvider, GifHeader paramGifHeader, ByteBuffer paramByteBuffer, int paramInt)
  {
    this(paramBitmapProvider);
    setData(paramGifHeader, paramByteBuffer, paramInt);
  }
  
  @ColorInt
  private int averageColorsNear(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = paramInt1;
    int n = 0;
    int m = 0;
    int k = 0;
    int j = 0;
    int i6;
    int i4;
    int i3;
    for (int i = 0; (i1 < this.sampleSize + paramInt1) && (i1 < this.mainPixels.length) && (i1 < paramInt2); i = i2)
    {
      i2 = this.mainPixels[i1];
      int i7 = this.act[(i2 & 0xFF)];
      i6 = n;
      i5 = m;
      i4 = k;
      i3 = j;
      i2 = i;
      if (i7 != 0)
      {
        i6 = n + (i7 >> 24 & 0xFF);
        i5 = m + (i7 >> 16 & 0xFF);
        i4 = k + (i7 >> 8 & 0xFF);
        i3 = j + (i7 & 0xFF);
        i2 = i + 1;
      }
      i1 += 1;
      n = i6;
      m = i5;
      k = i4;
      j = i3;
    }
    int i5 = paramInt1 + paramInt3;
    paramInt1 = i5;
    int i2 = n;
    while ((paramInt1 < this.sampleSize + i5) && (paramInt1 < this.mainPixels.length) && (paramInt1 < paramInt2))
    {
      paramInt3 = this.mainPixels[paramInt1];
      i6 = this.act[(paramInt3 & 0xFF)];
      i4 = i2;
      i3 = m;
      i1 = k;
      n = j;
      paramInt3 = i;
      if (i6 != 0)
      {
        i4 = i2 + (i6 >> 24 & 0xFF);
        i3 = m + (i6 >> 16 & 0xFF);
        i1 = k + (i6 >> 8 & 0xFF);
        n = j + (i6 & 0xFF);
        paramInt3 = i + 1;
      }
      paramInt1 += 1;
      i2 = i4;
      m = i3;
      k = i1;
      j = n;
      i = paramInt3;
    }
    if (i == 0) {
      return 0;
    }
    return i2 / i << 24 | m / i << 16 | k / i << 8 | j / i;
  }
  
  private void copyCopyIntoScratchRobust(GifFrame paramGifFrame)
  {
    int[] arrayOfInt1 = this.mainScratch;
    int i6 = paramGifFrame.ih / this.sampleSize;
    int i5 = paramGifFrame.iy / this.sampleSize;
    int i = paramGifFrame.iw / this.sampleSize;
    int i11 = paramGifFrame.ix / this.sampleSize;
    int i4;
    if (this.framePointer == 0) {
      i4 = 1;
    } else {
      i4 = 0;
    }
    int i12 = this.sampleSize;
    int i13 = this.downsampledWidth;
    int i14 = this.downsampledHeight;
    byte[] arrayOfByte = this.mainPixels;
    int[] arrayOfInt2 = this.act;
    Object localObject1 = this.isFirstFrameTransparent;
    int k = 0;
    int n = 0;
    int i2 = 1;
    int i1 = 8;
    while (n < i6)
    {
      int j;
      int i3;
      if (paramGifFrame.interlace)
      {
        j = k;
        i3 = i2;
        m = i1;
        if (k >= i6)
        {
          i3 = i2 + 1;
          switch (i3)
          {
          default: 
            j = k;
            m = i1;
            break;
          case 4: 
            j = 1;
            m = 2;
            break;
          case 3: 
            j = 2;
            m = 4;
            break;
          case 2: 
            j = 4;
            m = i1;
          }
        }
        i1 = j + m;
        k = j;
        j = i1;
        i2 = i3;
        i1 = m;
      }
      else
      {
        j = k;
        k = n;
      }
      k += i5;
      if (i12 == 1) {
        m = 1;
      } else {
        m = 0;
      }
      if (k < i14)
      {
        k *= i13;
        i3 = k + i11;
        int i7 = i3 + i;
        int i8 = k + i13;
        k = i7;
        if (i8 < i7) {
          k = i8;
        }
        i7 = n * i12 * paramGifFrame.iw;
        if (m != 0) {
          for (;;)
          {
            m = i;
            localObject2 = localObject1;
            if (i3 >= k) {
              break;
            }
            m = arrayOfInt2[(arrayOfByte[i7] & 0xFF)];
            if (m != 0)
            {
              arrayOfInt1[i3] = m;
              localObject2 = localObject1;
            }
            else
            {
              localObject2 = localObject1;
              if (i4 != 0)
              {
                localObject2 = localObject1;
                if (localObject1 == null) {
                  localObject2 = Boolean.TRUE;
                }
              }
            }
            i7 += i12;
            i3 += 1;
            localObject1 = localObject2;
          }
        }
        i8 = i;
        int i9 = i3;
        m = i7;
        i = k;
        for (;;)
        {
          int i10 = m;
          m = i;
          localObject2 = localObject1;
          i = i8;
          if (i9 >= m) {
            break;
          }
          i = averageColorsNear(i10, (k - i3) * i12 + i7, paramGifFrame.iw);
          if (i != 0)
          {
            arrayOfInt1[i9] = i;
            localObject2 = localObject1;
          }
          else
          {
            localObject2 = localObject1;
            if (i4 != 0)
            {
              localObject2 = localObject1;
              if (localObject1 == null) {
                localObject2 = Boolean.TRUE;
              }
            }
          }
          i10 += i12;
          i9 += 1;
          i = m;
          m = i10;
          localObject1 = localObject2;
        }
      }
      Object localObject2 = localObject1;
      int m = i;
      i = m;
      n += 1;
      k = j;
      localObject1 = localObject2;
    }
    if (this.isFirstFrameTransparent == null)
    {
      boolean bool;
      if (localObject1 == null) {
        bool = false;
      } else {
        bool = ((Boolean)localObject1).booleanValue();
      }
      this.isFirstFrameTransparent = Boolean.valueOf(bool);
    }
  }
  
  private void copyIntoScratchFast(GifFrame paramGifFrame)
  {
    Object localObject = paramGifFrame;
    int[] arrayOfInt1 = this.mainScratch;
    int n = ((GifFrame)localObject).ih;
    int i5 = ((GifFrame)localObject).iy;
    int i6 = ((GifFrame)localObject).iw;
    int i7 = ((GifFrame)localObject).ix;
    int j;
    if (this.framePointer == 0) {
      j = 1;
    } else {
      j = 0;
    }
    int i8 = this.downsampledWidth;
    localObject = this.mainPixels;
    int[] arrayOfInt2 = this.act;
    int k = 0;
    int i = -1;
    while (k < n)
    {
      int m = (k + i5) * i8;
      int i2 = m + i7;
      int i1 = i2 + i6;
      int i3 = m + i8;
      m = i1;
      if (i3 < i1) {
        m = i3;
      }
      i1 = paramGifFrame.iw;
      i1 *= k;
      while (i2 < m)
      {
        int i4 = localObject[i1];
        int i9 = i4 & 0xFF;
        i3 = i;
        if (i9 != i)
        {
          i3 = arrayOfInt2[i9];
          if (i3 != 0)
          {
            arrayOfInt1[i2] = i3;
            i3 = i;
          }
          else
          {
            i3 = i4;
          }
        }
        i1 += 1;
        i2 += 1;
        i = i3;
      }
      k += 1;
    }
    boolean bool;
    if ((this.isFirstFrameTransparent == null) && (j != 0) && (i != -1)) {
      bool = true;
    } else {
      bool = false;
    }
    this.isFirstFrameTransparent = Boolean.valueOf(bool);
  }
  
  private void decodeBitmapData(GifFrame paramGifFrame)
  {
    Object localObject = this;
    if (paramGifFrame != null) {
      ((StandardGifDecoder)localObject).rawData.position(paramGifFrame.bufferFrameStart);
    }
    int i9;
    if (paramGifFrame == null)
    {
      i9 = ((StandardGifDecoder)localObject).header.width * ((StandardGifDecoder)localObject).header.height;
    }
    else
    {
      j = paramGifFrame.iw;
      i9 = paramGifFrame.ih * j;
    }
    if ((((StandardGifDecoder)localObject).mainPixels == null) || (((StandardGifDecoder)localObject).mainPixels.length < i9)) {
      ((StandardGifDecoder)localObject).mainPixels = ((StandardGifDecoder)localObject).bitmapProvider.obtainByteArray(i9);
    }
    paramGifFrame = ((StandardGifDecoder)localObject).mainPixels;
    if (((StandardGifDecoder)localObject).prefix == null) {
      ((StandardGifDecoder)localObject).prefix = new short['က'];
    }
    short[] arrayOfShort = ((StandardGifDecoder)localObject).prefix;
    if (((StandardGifDecoder)localObject).suffix == null) {
      ((StandardGifDecoder)localObject).suffix = new byte['က'];
    }
    byte[] arrayOfByte1 = ((StandardGifDecoder)localObject).suffix;
    if (((StandardGifDecoder)localObject).pixelStack == null) {
      ((StandardGifDecoder)localObject).pixelStack = new byte['ခ'];
    }
    byte[] arrayOfByte2 = ((StandardGifDecoder)localObject).pixelStack;
    int j = readByte();
    int i17 = 1 << j;
    int i10 = i17 + 2;
    int i12 = j + 1;
    int i11 = (1 << i12) - 1;
    int i13 = 0;
    j = 0;
    while (j < i17)
    {
      arrayOfShort[j] = 0;
      arrayOfByte1[j] = ((byte)j);
      j += 1;
    }
    localObject = ((StandardGifDecoder)localObject).block;
    int m = i12;
    int i2 = i10;
    int i3 = i11;
    int i6 = 0;
    int k = 0;
    int i4 = 0;
    int i8 = 0;
    int i7 = 0;
    int n = -1;
    int i1 = 0;
    int i5 = 0;
    j = i13;
    while (j < i9)
    {
      i13 = i6;
      if (i6 == 0)
      {
        i13 = readBlock();
        if (i13 <= 0)
        {
          this.status = 3;
          break;
        }
        i7 = 0;
      }
      i8 += ((localObject[i7] & 0xFF) << i4);
      int i15 = i7 + 1;
      int i16 = i13 - 1;
      i7 = i4 + 8;
      i4 = n;
      i6 = i1;
      i1 = k;
      k = i2;
      n = j;
      j = m;
      i2 = i4;
      m = i12;
      i4 = i7;
      for (;;)
      {
        if (i4 >= j)
        {
          i7 = i8 & i3;
          i8 >>= j;
          i4 -= j;
          if (i7 == i17)
          {
            j = m;
            k = i10;
            i3 = i11;
            i2 = -1;
            i7 = i6;
            i12 = n;
            i6 = i2;
            i2 = i6;
            n = i12;
            i6 = i7;
          }
          else
          {
            if (i7 != i17 + 1)
            {
              if (i2 == -1)
              {
                paramGifFrame[i1] = arrayOfByte1[i7];
                i1 += 1;
                i2 = n + 1;
              }
              for (n = i7;; n = i14)
              {
                i6 = i7;
                i12 = i2;
                i7 = n;
                break;
                i12 = k;
                if (i7 >= i12)
                {
                  arrayOfByte2[i5] = ((byte)i6);
                  i5 += 1;
                  k = i2;
                }
                for (k = i7; k >= i17; k = arrayOfShort[k])
                {
                  arrayOfByte2[i5] = arrayOfByte1[k];
                  i5 += 1;
                }
                i14 = arrayOfByte1[k] & 0xFF;
                int i = (byte)i14;
                paramGifFrame[i1] = i;
                for (;;)
                {
                  i6 = i1 + 1;
                  i13 = n + 1;
                  if (i5 <= 0) {
                    break;
                  }
                  i5 -= 1;
                  paramGifFrame[i6] = arrayOfByte2[i5];
                  n = i13;
                  i1 = i6;
                }
                i1 = i12;
                n = j;
                k = i3;
                if (i12 < 4096)
                {
                  arrayOfShort[i12] = ((short)i2);
                  arrayOfByte1[i12] = i;
                  i2 = i12 + 1;
                  i1 = i2;
                  n = j;
                  k = i3;
                  if ((i2 & i3) == 0)
                  {
                    i1 = i2;
                    n = j;
                    k = i3;
                    if (i2 < 4096)
                    {
                      n = j + 1;
                      k = i3 + i2;
                      i1 = i2;
                    }
                  }
                }
                i12 = i1;
                j = n;
                i2 = i13;
                i1 = i6;
                i3 = k;
                k = i12;
              }
            }
            i13 = k;
            i14 = j;
            j = n;
            k = i1;
            i1 = i6;
            i12 = m;
            i6 = i16;
            i7 = i15;
            n = i2;
            i2 = i13;
            m = i14;
            break;
          }
        }
      }
      i13 = k;
      int i14 = j;
      j = n;
      k = i1;
      i1 = i6;
      i12 = m;
      i6 = i16;
      i7 = i15;
      n = i2;
      i2 = i13;
      m = i14;
    }
    Arrays.fill(paramGifFrame, k, i9, (byte)0);
  }
  
  @NonNull
  private GifHeaderParser getHeaderParser()
  {
    if (this.parser == null) {
      this.parser = new GifHeaderParser();
    }
    return this.parser;
  }
  
  private Bitmap getNextBitmap()
  {
    if ((this.isFirstFrameTransparent != null) && (!this.isFirstFrameTransparent.booleanValue())) {
      localObject = this.bitmapConfig;
    } else {
      localObject = Bitmap.Config.ARGB_8888;
    }
    Object localObject = this.bitmapProvider.obtain(this.downsampledWidth, this.downsampledHeight, (Bitmap.Config)localObject);
    ((Bitmap)localObject).setHasAlpha(true);
    return (Bitmap)localObject;
  }
  
  private int readBlock()
  {
    int i = readByte();
    if (i <= 0) {
      return i;
    }
    this.rawData.get(this.block, 0, Math.min(i, this.rawData.remaining()));
    return i;
  }
  
  private int readByte()
  {
    return this.rawData.get() & 0xFF;
  }
  
  private Bitmap setPixels(GifFrame paramGifFrame1, GifFrame paramGifFrame2)
  {
    int[] arrayOfInt = this.mainScratch;
    int i = 0;
    if (paramGifFrame2 == null)
    {
      if (this.previousImage != null) {
        this.bitmapProvider.release(this.previousImage);
      }
      this.previousImage = null;
      Arrays.fill(arrayOfInt, 0);
    }
    if ((paramGifFrame2 != null) && (paramGifFrame2.dispose == 3) && (this.previousImage == null)) {
      Arrays.fill(arrayOfInt, 0);
    }
    if ((paramGifFrame2 != null) && (paramGifFrame2.dispose > 0))
    {
      if (paramGifFrame2.dispose == 2)
      {
        int j;
        if (!paramGifFrame1.transparency)
        {
          j = this.header.bgColor;
          if ((paramGifFrame1.lct != null) && (this.header.bgIndex == paramGifFrame1.transIndex)) {
            j = i;
          }
        }
        else
        {
          j = i;
          if (this.framePointer == 0)
          {
            this.isFirstFrameTransparent = Boolean.TRUE;
            j = i;
          }
        }
        int n = paramGifFrame2.ih / this.sampleSize;
        i = paramGifFrame2.iy / this.sampleSize;
        int i1 = paramGifFrame2.iw / this.sampleSize;
        int k = paramGifFrame2.ix / this.sampleSize;
        int m = i * this.downsampledWidth + k;
        int i2 = this.downsampledWidth;
        i = m;
        while (i < n * i2 + m)
        {
          k = i;
          while (k < i + i1)
          {
            arrayOfInt[k] = j;
            k += 1;
          }
          i += this.downsampledWidth;
        }
      }
      if ((paramGifFrame2.dispose == 3) && (this.previousImage != null)) {
        this.previousImage.getPixels(arrayOfInt, 0, this.downsampledWidth, 0, 0, this.downsampledWidth, this.downsampledHeight);
      }
    }
    decodeBitmapData(paramGifFrame1);
    if ((!paramGifFrame1.interlace) && (this.sampleSize == 1)) {
      copyIntoScratchFast(paramGifFrame1);
    } else {
      copyCopyIntoScratchRobust(paramGifFrame1);
    }
    if ((this.savePrevious) && ((paramGifFrame1.dispose == 0) || (paramGifFrame1.dispose == 1)))
    {
      if (this.previousImage == null) {
        this.previousImage = getNextBitmap();
      }
      this.previousImage.setPixels(arrayOfInt, 0, this.downsampledWidth, 0, 0, this.downsampledWidth, this.downsampledHeight);
    }
    paramGifFrame1 = getNextBitmap();
    paramGifFrame1.setPixels(arrayOfInt, 0, this.downsampledWidth, 0, 0, this.downsampledWidth, this.downsampledHeight);
    return paramGifFrame1;
  }
  
  public void advance()
  {
    this.framePointer = ((this.framePointer + 1) % this.header.frameCount);
  }
  
  public void clear()
  {
    this.header = null;
    if (this.mainPixels != null) {
      this.bitmapProvider.release(this.mainPixels);
    }
    if (this.mainScratch != null) {
      this.bitmapProvider.release(this.mainScratch);
    }
    if (this.previousImage != null) {
      this.bitmapProvider.release(this.previousImage);
    }
    this.previousImage = null;
    this.rawData = null;
    this.isFirstFrameTransparent = null;
    if (this.block != null) {
      this.bitmapProvider.release(this.block);
    }
  }
  
  public int getByteSize()
  {
    return this.rawData.limit() + this.mainPixels.length + this.mainScratch.length * 4;
  }
  
  public int getCurrentFrameIndex()
  {
    return this.framePointer;
  }
  
  @NonNull
  public ByteBuffer getData()
  {
    return this.rawData;
  }
  
  public int getDelay(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.header.frameCount)) {
      return ((GifFrame)this.header.frames.get(paramInt)).delay;
    }
    return -1;
  }
  
  public int getFrameCount()
  {
    return this.header.frameCount;
  }
  
  public int getHeight()
  {
    return this.header.height;
  }
  
  @Deprecated
  public int getLoopCount()
  {
    if (this.header.loopCount == -1) {
      return 1;
    }
    return this.header.loopCount;
  }
  
  public int getNetscapeLoopCount()
  {
    return this.header.loopCount;
  }
  
  public int getNextDelay()
  {
    if ((this.header.frameCount > 0) && (this.framePointer >= 0)) {
      return getDelay(this.framePointer);
    }
    return 0;
  }
  
  @Nullable
  public Bitmap getNextFrame()
  {
    for (;;)
    {
      try
      {
        Object localObject1;
        if ((this.header.frameCount <= 0) || (this.framePointer < 0))
        {
          if (Log.isLoggable(TAG, 3))
          {
            localObject1 = new StringBuilder("Unable to decode frame, frameCount=");
            ((StringBuilder)localObject1).append(this.header.frameCount);
            ((StringBuilder)localObject1).append(", framePointer=");
            ((StringBuilder)localObject1).append(this.framePointer);
          }
          this.status = 1;
        }
        if ((this.status != 1) && (this.status != 2))
        {
          this.status = 0;
          if (this.block == null) {
            this.block = this.bitmapProvider.obtainByteArray(255);
          }
          GifFrame localGifFrame = (GifFrame)this.header.frames.get(this.framePointer);
          int i = this.framePointer - 1;
          if (i >= 0)
          {
            localObject1 = (GifFrame)this.header.frames.get(i);
            int[] arrayOfInt;
            if (localGifFrame.lct != null) {
              arrayOfInt = localGifFrame.lct;
            } else {
              arrayOfInt = this.header.gct;
            }
            this.act = arrayOfInt;
            if (this.act == null)
            {
              if (Log.isLoggable(TAG, 3)) {
                new StringBuilder("No valid color table found for frame #").append(this.framePointer);
              }
              this.status = 1;
              return null;
            }
            if (localGifFrame.transparency)
            {
              System.arraycopy(this.act, 0, this.pct, 0, this.act.length);
              this.act = this.pct;
              this.act[localGifFrame.transIndex] = 0;
            }
            localObject1 = setPixels(localGifFrame, (GifFrame)localObject1);
            return (Bitmap)localObject1;
          }
        }
        else
        {
          if (Log.isLoggable(TAG, 3)) {
            new StringBuilder("Unable to decode frame, status=").append(this.status);
          }
          return null;
        }
      }
      finally {}
      Object localObject3 = null;
    }
  }
  
  public int getStatus()
  {
    return this.status;
  }
  
  public int getTotalIterationCount()
  {
    if (this.header.loopCount == -1) {
      return 1;
    }
    if (this.header.loopCount == 0) {
      return 0;
    }
    return this.header.loopCount + 1;
  }
  
  public int getWidth()
  {
    return this.header.width;
  }
  
  public int read(@Nullable InputStream paramInputStream, int paramInt)
  {
    if (paramInputStream != null) {
      if (paramInt > 0) {
        paramInt += 4096;
      } else {
        paramInt = 16384;
      }
    }
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramInt);
      byte[] arrayOfByte = new byte['䀀'];
      for (;;)
      {
        paramInt = paramInputStream.read(arrayOfByte, 0, 16384);
        if (paramInt == -1) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, paramInt);
      }
      localByteArrayOutputStream.flush();
      read(localByteArrayOutputStream.toByteArray());
    }
    catch (IOException localIOException)
    {
      try
      {
        paramInputStream.close();
        return this.status;
        localIOException = localIOException;
      }
      catch (IOException paramInputStream)
      {
        for (;;) {}
      }
    }
    break label88;
    this.status = 2;
    label88:
    if (paramInputStream == null) {}
  }
  
  public int read(@Nullable byte[] paramArrayOfByte)
  {
    try
    {
      this.header = getHeaderParser().setData(paramArrayOfByte).parseHeader();
      if (paramArrayOfByte != null) {
        setData(this.header, paramArrayOfByte);
      }
      int i = this.status;
      return i;
    }
    finally {}
  }
  
  public void resetFrameIndex()
  {
    this.framePointer = -1;
  }
  
  public void setData(@NonNull GifHeader paramGifHeader, @NonNull ByteBuffer paramByteBuffer)
  {
    try
    {
      setData(paramGifHeader, paramByteBuffer, 1);
      return;
    }
    finally
    {
      paramGifHeader = finally;
      throw paramGifHeader;
    }
  }
  
  public void setData(@NonNull GifHeader paramGifHeader, @NonNull ByteBuffer paramByteBuffer, int paramInt)
  {
    if (paramInt > 0) {}
    try
    {
      paramInt = Integer.highestOneBit(paramInt);
      this.status = 0;
      this.header = paramGifHeader;
      this.framePointer = -1;
      this.rawData = paramByteBuffer.asReadOnlyBuffer();
      this.rawData.position(0);
      this.rawData.order(ByteOrder.LITTLE_ENDIAN);
      this.savePrevious = false;
      paramByteBuffer = paramGifHeader.frames.iterator();
      while (paramByteBuffer.hasNext()) {
        if (((GifFrame)paramByteBuffer.next()).dispose == 3) {
          this.savePrevious = true;
        }
      }
      this.sampleSize = paramInt;
      this.downsampledWidth = (paramGifHeader.width / paramInt);
      this.downsampledHeight = (paramGifHeader.height / paramInt);
      this.mainPixels = this.bitmapProvider.obtainByteArray(paramGifHeader.width * paramGifHeader.height);
      this.mainScratch = this.bitmapProvider.obtainIntArray(this.downsampledWidth * this.downsampledHeight);
      return;
    }
    finally {}
    throw new IllegalArgumentException("Sample size must be >=0, not: ".concat(String.valueOf(paramInt)));
  }
  
  public void setData(@NonNull GifHeader paramGifHeader, @NonNull byte[] paramArrayOfByte)
  {
    try
    {
      setData(paramGifHeader, ByteBuffer.wrap(paramArrayOfByte));
      return;
    }
    finally
    {
      paramGifHeader = finally;
      throw paramGifHeader;
    }
  }
  
  public void setDefaultBitmapConfig(@NonNull Bitmap.Config paramConfig)
  {
    if ((paramConfig != Bitmap.Config.ARGB_8888) && (paramConfig != Bitmap.Config.RGB_565))
    {
      StringBuilder localStringBuilder = new StringBuilder("Unsupported format: ");
      localStringBuilder.append(paramConfig);
      localStringBuilder.append(", must be one of ");
      localStringBuilder.append(Bitmap.Config.ARGB_8888);
      localStringBuilder.append(" or ");
      localStringBuilder.append(Bitmap.Config.RGB_565);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    this.bitmapConfig = paramConfig;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/gifdecoder/StandardGifDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.bumptech.glide.gifdecoder;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

public class GifHeaderParser
{
  static final int DEFAULT_FRAME_DELAY = 10;
  private static final int DESCRIPTOR_MASK_INTERLACE_FLAG = 64;
  private static final int DESCRIPTOR_MASK_LCT_FLAG = 128;
  private static final int DESCRIPTOR_MASK_LCT_SIZE = 7;
  private static final int EXTENSION_INTRODUCER = 33;
  private static final int GCE_DISPOSAL_METHOD_SHIFT = 2;
  private static final int GCE_MASK_DISPOSAL_METHOD = 28;
  private static final int GCE_MASK_TRANSPARENT_COLOR_FLAG = 1;
  private static final int IMAGE_SEPARATOR = 44;
  private static final int LABEL_APPLICATION_EXTENSION = 255;
  private static final int LABEL_COMMENT_EXTENSION = 254;
  private static final int LABEL_GRAPHIC_CONTROL_EXTENSION = 249;
  private static final int LABEL_PLAIN_TEXT_EXTENSION = 1;
  private static final int LSD_MASK_GCT_FLAG = 128;
  private static final int LSD_MASK_GCT_SIZE = 7;
  private static final int MASK_INT_LOWEST_BYTE = 255;
  private static final int MAX_BLOCK_SIZE = 256;
  static final int MIN_FRAME_DELAY = 2;
  private static final String TAG = "GifHeaderParser";
  private static final int TRAILER = 59;
  private final byte[] block = new byte['Ā'];
  private int blockSize = 0;
  private GifHeader header;
  private ByteBuffer rawData;
  
  private boolean err()
  {
    return this.header.status != 0;
  }
  
  private int read()
  {
    try
    {
      int i = this.rawData.get();
      return i & 0xFF;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    this.header.status = 1;
    return 0;
  }
  
  private void readBitmap()
  {
    this.header.currentFrame.ix = readShort();
    this.header.currentFrame.iy = readShort();
    this.header.currentFrame.iw = readShort();
    this.header.currentFrame.ih = readShort();
    int j = read();
    boolean bool = false;
    int i;
    if ((j & 0x80) != 0) {
      i = 1;
    } else {
      i = 0;
    }
    int k = (int)Math.pow(2.0D, (j & 0x7) + 1);
    Object localObject = this.header.currentFrame;
    if ((j & 0x40) != 0) {
      bool = true;
    }
    ((GifFrame)localObject).interlace = bool;
    if (i != 0) {
      localObject = this.header.currentFrame;
    }
    for (int[] arrayOfInt = readColorTable(k);; arrayOfInt = null)
    {
      ((GifFrame)localObject).lct = arrayOfInt;
      break;
      localObject = this.header.currentFrame;
    }
    this.header.currentFrame.bufferFrameStart = this.rawData.position();
    skipImageData();
    if (err()) {
      return;
    }
    localObject = this.header;
    ((GifHeader)localObject).frameCount += 1;
    this.header.frames.add(this.header.currentFrame);
  }
  
  private void readBlock()
  {
    this.blockSize = read();
    int j;
    int i;
    if (this.blockSize > 0)
    {
      j = 0;
      i = 0;
    }
    for (;;)
    {
      int k = i;
      try
      {
        if (j < this.blockSize)
        {
          k = i;
          i = this.blockSize - j;
          k = i;
          this.rawData.get(this.block, j, i);
          j += i;
        }
        else
        {
          return;
        }
      }
      catch (Exception localException)
      {
        StringBuilder localStringBuilder;
        for (;;) {}
      }
    }
    if (Log.isLoggable("GifHeaderParser", 3))
    {
      localStringBuilder = new StringBuilder("Error Reading Block n: ");
      localStringBuilder.append(j);
      localStringBuilder.append(" count: ");
      localStringBuilder.append(k);
      localStringBuilder.append(" blockSize: ");
      localStringBuilder.append(this.blockSize);
    }
    this.header.status = 1;
  }
  
  @Nullable
  private int[] readColorTable(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt * 3];
    try
    {
      this.rawData.get(arrayOfByte);
      int[] arrayOfInt2 = new int['Ā'];
      int i = 0;
      int j = 0;
      for (;;)
      {
        arrayOfInt1 = arrayOfInt2;
        if (i >= paramInt) {
          break;
        }
        int k = j + 1;
        j = arrayOfByte[j];
        int m = k + 1;
        arrayOfInt2[i] = ((j & 0xFF) << 16 | 0xFF000000 | (arrayOfByte[k] & 0xFF) << 8 | arrayOfByte[m] & 0xFF);
        j = m + 1;
        i += 1;
      }
    }
    catch (BufferUnderflowException localBufferUnderflowException)
    {
      int[] arrayOfInt1;
      for (;;) {}
    }
    arrayOfInt1 = null;
    Log.isLoggable("GifHeaderParser", 3);
    this.header.status = 1;
    return arrayOfInt1;
  }
  
  private void readContents()
  {
    readContents(Integer.MAX_VALUE);
  }
  
  private void readContents(int paramInt)
  {
    int i = 0;
    while ((i == 0) && (!err()) && (this.header.frameCount <= paramInt))
    {
      int j = read();
      if (j != 33)
      {
        if (j != 44)
        {
          if (j != 59) {
            this.header.status = 1;
          } else {
            i = 1;
          }
        }
        else
        {
          if (this.header.currentFrame == null) {
            this.header.currentFrame = new GifFrame();
          }
          readBitmap();
        }
      }
      else
      {
        j = read();
        if (j != 1)
        {
          if (j == 249) {
            break label204;
          }
          switch (j)
          {
          }
        }
        StringBuilder localStringBuilder;
        do
        {
          skip();
          break;
          readBlock();
          localStringBuilder = new StringBuilder();
          j = 0;
          while (j < 11)
          {
            localStringBuilder.append((char)this.block[j]);
            j += 1;
          }
        } while (!localStringBuilder.toString().equals("NETSCAPE2.0"));
        readNetscapeExt();
        continue;
        label204:
        this.header.currentFrame = new GifFrame();
        readGraphicControlExt();
      }
    }
  }
  
  private void readGraphicControlExt()
  {
    read();
    int i = read();
    this.header.currentFrame.dispose = ((i & 0x1C) >> 2);
    int j = this.header.currentFrame.dispose;
    boolean bool = true;
    if (j == 0) {
      this.header.currentFrame.dispose = 1;
    }
    GifFrame localGifFrame = this.header.currentFrame;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    localGifFrame.transparency = bool;
    j = readShort();
    i = j;
    if (j < 2) {
      i = 10;
    }
    this.header.currentFrame.delay = (i * 10);
    this.header.currentFrame.transIndex = read();
    read();
  }
  
  private void readHeader()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < 6)
    {
      localStringBuilder.append((char)read());
      i += 1;
    }
    if (!localStringBuilder.toString().startsWith("GIF"))
    {
      this.header.status = 1;
      return;
    }
    readLSD();
    if ((this.header.gctFlag) && (!err()))
    {
      this.header.gct = readColorTable(this.header.gctSize);
      this.header.bgColor = this.header.gct[this.header.bgIndex];
    }
  }
  
  private void readLSD()
  {
    this.header.width = readShort();
    this.header.height = readShort();
    int i = read();
    GifHeader localGifHeader = this.header;
    boolean bool;
    if ((i & 0x80) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    localGifHeader.gctFlag = bool;
    this.header.gctSize = ((int)Math.pow(2.0D, (i & 0x7) + 1));
    this.header.bgIndex = read();
    this.header.pixelAspect = read();
  }
  
  private void readNetscapeExt()
  {
    do
    {
      readBlock();
      if (this.block[0] == 1)
      {
        int i = this.block[1];
        int j = this.block[2];
        this.header.loopCount = (i & 0xFF | (j & 0xFF) << 8);
      }
    } while ((this.blockSize > 0) && (!err()));
  }
  
  private int readShort()
  {
    return this.rawData.getShort();
  }
  
  private void reset()
  {
    this.rawData = null;
    Arrays.fill(this.block, (byte)0);
    this.header = new GifHeader();
    this.blockSize = 0;
  }
  
  private void skip()
  {
    int i;
    do
    {
      i = read();
      int j = Math.min(this.rawData.position() + i, this.rawData.limit());
      this.rawData.position(j);
    } while (i > 0);
  }
  
  private void skipImageData()
  {
    read();
    skip();
  }
  
  public void clear()
  {
    this.rawData = null;
    this.header = null;
  }
  
  public boolean isAnimated()
  {
    readHeader();
    if (!err()) {
      readContents(2);
    }
    return this.header.frameCount > 1;
  }
  
  @NonNull
  public GifHeader parseHeader()
  {
    if (this.rawData != null)
    {
      if (err()) {
        return this.header;
      }
      readHeader();
      if (!err())
      {
        readContents();
        if (this.header.frameCount < 0) {
          this.header.status = 1;
        }
      }
      return this.header;
    }
    throw new IllegalStateException("You must call setData() before parseHeader()");
  }
  
  public GifHeaderParser setData(@NonNull ByteBuffer paramByteBuffer)
  {
    reset();
    this.rawData = paramByteBuffer.asReadOnlyBuffer();
    this.rawData.position(0);
    this.rawData.order(ByteOrder.LITTLE_ENDIAN);
    return this;
  }
  
  public GifHeaderParser setData(@Nullable byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      setData(ByteBuffer.wrap(paramArrayOfByte));
      return this;
    }
    this.rawData = null;
    this.header.status = 2;
    return this;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/gifdecoder/GifHeaderParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
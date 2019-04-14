package com.bumptech.glide.load.data;

import android.support.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ExifOrientationStream
  extends FilterInputStream
{
  private static final byte[] EXIF_SEGMENT = { -1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0 };
  private static final int ORIENTATION_POSITION = 31;
  private static final int SEGMENT_LENGTH = 29;
  private static final int SEGMENT_START_POSITION = 2;
  private final byte orientation;
  private int position;
  
  public ExifOrientationStream(InputStream paramInputStream, int paramInt)
  {
    super(paramInputStream);
    if ((paramInt >= -1) && (paramInt <= 8))
    {
      this.orientation = ((byte)paramInt);
      return;
    }
    throw new IllegalArgumentException("Cannot add invalid orientation: ".concat(String.valueOf(paramInt)));
  }
  
  public final void mark(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean markSupported()
  {
    return false;
  }
  
  public final int read()
    throws IOException
  {
    int i;
    if ((this.position >= 2) && (this.position <= ORIENTATION_POSITION))
    {
      if (this.position == ORIENTATION_POSITION) {
        i = this.orientation;
      } else {
        i = EXIF_SEGMENT[(this.position - 2)] & 0xFF;
      }
    }
    else {
      i = super.read();
    }
    if (i != -1) {
      this.position += 1;
    }
    return i;
  }
  
  public final int read(@NonNull byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (this.position > ORIENTATION_POSITION)
    {
      paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    }
    else if (this.position == ORIENTATION_POSITION)
    {
      paramArrayOfByte[paramInt1] = this.orientation;
      paramInt1 = 1;
    }
    else if (this.position < 2)
    {
      paramInt1 = super.read(paramArrayOfByte, paramInt1, 2 - this.position);
    }
    else
    {
      paramInt2 = Math.min(ORIENTATION_POSITION - this.position, paramInt2);
      System.arraycopy(EXIF_SEGMENT, this.position - 2, paramArrayOfByte, paramInt1, paramInt2);
      paramInt1 = paramInt2;
    }
    if (paramInt1 > 0) {
      this.position += paramInt1;
    }
    return paramInt1;
  }
  
  public final void reset()
    throws IOException
  {
    throw new UnsupportedOperationException();
  }
  
  public final long skip(long paramLong)
    throws IOException
  {
    paramLong = super.skip(paramLong);
    if (paramLong > 0L) {
      this.position = ((int)(this.position + paramLong));
    }
    return paramLong;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/data/ExifOrientationStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
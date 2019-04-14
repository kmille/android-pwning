package com.bumptech.glide.load.resource.bitmap;

import android.support.annotation.NonNull;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class DefaultImageHeaderParser
  implements ImageHeaderParser
{
  private static final int[] BYTES_PER_FORMAT = { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8 };
  static final int EXIF_MAGIC_NUMBER = 65496;
  static final int EXIF_SEGMENT_TYPE = 225;
  private static final int GIF_HEADER = 4671814;
  private static final int INTEL_TIFF_MAGIC_NUMBER = 18761;
  private static final String JPEG_EXIF_SEGMENT_PREAMBLE = "Exif\000\000";
  static final byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = "Exif\000\000".getBytes(Charset.forName("UTF-8"));
  private static final int MARKER_EOI = 217;
  private static final int MOTOROLA_TIFF_MAGIC_NUMBER = 19789;
  private static final int ORIENTATION_TAG_TYPE = 274;
  private static final int PNG_HEADER = -1991225785;
  private static final int RIFF_HEADER = 1380533830;
  private static final int SEGMENT_SOS = 218;
  static final int SEGMENT_START_ID = 255;
  private static final String TAG = "DfltImageHeaderParser";
  private static final int VP8_HEADER = 1448097792;
  private static final int VP8_HEADER_MASK = -256;
  private static final int VP8_HEADER_TYPE_EXTENDED = 88;
  private static final int VP8_HEADER_TYPE_LOSSLESS = 76;
  private static final int VP8_HEADER_TYPE_MASK = 255;
  private static final int WEBP_EXTENDED_ALPHA_FLAG = 16;
  private static final int WEBP_HEADER = 1464156752;
  private static final int WEBP_LOSSLESS_ALPHA_FLAG = 8;
  
  private static int calcTagOffset(int paramInt1, int paramInt2)
  {
    return paramInt1 + 2 + paramInt2 * 12;
  }
  
  private int getOrientation(Reader paramReader, ArrayPool paramArrayPool)
    throws IOException
  {
    if (!handles(paramReader.getUInt16())) {}
    int i;
    do
    {
      Log.isLoggable("DfltImageHeaderParser", 3);
      return -1;
      i = moveToExifSegmentAndGetLength(paramReader);
    } while (i == -1);
    byte[] arrayOfByte = (byte[])paramArrayPool.get(i, byte[].class);
    try
    {
      i = parseExifSegment(paramReader, arrayOfByte, i);
      return i;
    }
    finally
    {
      paramArrayPool.put(arrayOfByte);
    }
  }
  
  @NonNull
  private ImageHeaderParser.ImageType getType(Reader paramReader)
    throws IOException
  {
    int i = paramReader.getUInt16();
    if (i == 65496) {
      return ImageHeaderParser.ImageType.JPEG;
    }
    i = i << 16 & 0xFFFF0000 | paramReader.getUInt16() & 0xFFFF;
    if (i == -1991225785)
    {
      paramReader.skip(21L);
      if (paramReader.getByte() >= 3) {
        return ImageHeaderParser.ImageType.PNG_A;
      }
      return ImageHeaderParser.ImageType.PNG;
    }
    if (i >> 8 == 4671814) {
      return ImageHeaderParser.ImageType.GIF;
    }
    if (i != 1380533830) {
      return ImageHeaderParser.ImageType.UNKNOWN;
    }
    paramReader.skip(4L);
    if ((paramReader.getUInt16() << 16 & 0xFFFF0000 | paramReader.getUInt16() & 0xFFFF) != 1464156752) {
      return ImageHeaderParser.ImageType.UNKNOWN;
    }
    i = paramReader.getUInt16() << 16 & 0xFFFF0000 | paramReader.getUInt16() & 0xFFFF;
    if ((i & 0xFF00) != 1448097792) {
      return ImageHeaderParser.ImageType.UNKNOWN;
    }
    i &= 0xFF;
    if (i == 88)
    {
      paramReader.skip(4L);
      if ((paramReader.getByte() & 0x10) != 0) {
        return ImageHeaderParser.ImageType.WEBP_A;
      }
      return ImageHeaderParser.ImageType.WEBP;
    }
    if (i == 76)
    {
      paramReader.skip(4L);
      if ((paramReader.getByte() & 0x8) != 0) {
        return ImageHeaderParser.ImageType.WEBP_A;
      }
      return ImageHeaderParser.ImageType.WEBP;
    }
    return ImageHeaderParser.ImageType.WEBP;
  }
  
  private static boolean handles(int paramInt)
  {
    return ((paramInt & 0xFFD8) == 65496) || (paramInt == 19789) || (paramInt == 18761);
  }
  
  private boolean hasJpegExifPreamble(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool;
    if ((paramArrayOfByte != null) && (paramInt > JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length)) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool)
    {
      paramInt = 0;
      while (paramInt < JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length)
      {
        if (paramArrayOfByte[paramInt] != JPEG_EXIF_SEGMENT_PREAMBLE_BYTES[paramInt]) {
          return false;
        }
        paramInt += 1;
      }
    }
    return bool;
  }
  
  private int moveToExifSegmentAndGetLength(Reader paramReader)
    throws IOException
  {
    int i;
    int j;
    long l1;
    long l2;
    do
    {
      if (paramReader.getUInt8() != 255) {}
      do
      {
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
        i = paramReader.getUInt8();
        if (i == 218) {
          return -1;
        }
      } while (i == 217);
      j = paramReader.getUInt16() - 2;
      if (i == 225) {
        break;
      }
      l1 = j;
      l2 = paramReader.skip(l1);
    } while (l2 == l1);
    if (Log.isLoggable("DfltImageHeaderParser", 3))
    {
      paramReader = new StringBuilder("Unable to skip enough data, type: ");
      paramReader.append(i);
      paramReader.append(", wanted to skip: ");
      paramReader.append(j);
      paramReader.append(", but actually skipped: ");
      paramReader.append(l2);
    }
    return -1;
    return j;
  }
  
  private static int parseExifSegment(RandomAccessReader paramRandomAccessReader)
  {
    int i = paramRandomAccessReader.getInt16(6);
    Object localObject;
    if (i != 18761)
    {
      if (i != 19789) {
        Log.isLoggable("DfltImageHeaderParser", 3);
      }
      localObject = ByteOrder.BIG_ENDIAN;
    }
    else
    {
      localObject = ByteOrder.LITTLE_ENDIAN;
    }
    paramRandomAccessReader.order((ByteOrder)localObject);
    int j = paramRandomAccessReader.getInt32(10) + 6;
    int k = paramRandomAccessReader.getInt16(j);
    i = 0;
    while (i < k)
    {
      int n = calcTagOffset(j, i);
      int m = paramRandomAccessReader.getInt16(n);
      if (m == 274)
      {
        int i1 = paramRandomAccessReader.getInt16(n + 2);
        int i2;
        if ((i1 > 0) && (i1 <= 12))
        {
          i2 = paramRandomAccessReader.getInt32(n + 4);
          if (i2 >= 0) {
            break label143;
          }
        }
        label143:
        do
        {
          do
          {
            Log.isLoggable("DfltImageHeaderParser", 3);
            break;
            if (Log.isLoggable("DfltImageHeaderParser", 3))
            {
              localObject = new StringBuilder("Got tagIndex=");
              ((StringBuilder)localObject).append(i);
              ((StringBuilder)localObject).append(" tagType=");
              ((StringBuilder)localObject).append(m);
              ((StringBuilder)localObject).append(" formatCode=");
              ((StringBuilder)localObject).append(i1);
              ((StringBuilder)localObject).append(" componentCount=");
              ((StringBuilder)localObject).append(i2);
            }
            i1 = i2 + BYTES_PER_FORMAT[i1];
          } while (i1 > 4);
          n += 8;
          if ((n < 0) || (n > paramRandomAccessReader.length())) {
            break;
          }
        } while ((i1 < 0) || (i1 + n > paramRandomAccessReader.length()));
        return paramRandomAccessReader.getInt16(n);
        if (Log.isLoggable("DfltImageHeaderParser", 3))
        {
          localObject = new StringBuilder("Illegal tagValueOffset=");
          ((StringBuilder)localObject).append(n);
          ((StringBuilder)localObject).append(" tagType=");
          ((StringBuilder)localObject).append(m);
        }
      }
      i += 1;
    }
    return -1;
  }
  
  private int parseExifSegment(Reader paramReader, byte[] paramArrayOfByte, int paramInt)
    throws IOException
  {
    int i = paramReader.read(paramArrayOfByte, paramInt);
    if (i != paramInt)
    {
      if (Log.isLoggable("DfltImageHeaderParser", 3))
      {
        paramReader = new StringBuilder("Unable to read exif segment data, length: ");
        paramReader.append(paramInt);
        paramReader.append(", actually read: ");
        paramReader.append(i);
      }
      return -1;
    }
    if (hasJpegExifPreamble(paramArrayOfByte, paramInt)) {
      return parseExifSegment(new RandomAccessReader(paramArrayOfByte, paramInt));
    }
    Log.isLoggable("DfltImageHeaderParser", 3);
    return -1;
  }
  
  public final int getOrientation(@NonNull InputStream paramInputStream, @NonNull ArrayPool paramArrayPool)
    throws IOException
  {
    return getOrientation(new StreamReader((InputStream)Preconditions.checkNotNull(paramInputStream)), (ArrayPool)Preconditions.checkNotNull(paramArrayPool));
  }
  
  public final int getOrientation(@NonNull ByteBuffer paramByteBuffer, @NonNull ArrayPool paramArrayPool)
    throws IOException
  {
    return getOrientation(new ByteBufferReader((ByteBuffer)Preconditions.checkNotNull(paramByteBuffer)), (ArrayPool)Preconditions.checkNotNull(paramArrayPool));
  }
  
  @NonNull
  public final ImageHeaderParser.ImageType getType(@NonNull InputStream paramInputStream)
    throws IOException
  {
    return getType(new StreamReader((InputStream)Preconditions.checkNotNull(paramInputStream)));
  }
  
  @NonNull
  public final ImageHeaderParser.ImageType getType(@NonNull ByteBuffer paramByteBuffer)
    throws IOException
  {
    return getType(new ByteBufferReader((ByteBuffer)Preconditions.checkNotNull(paramByteBuffer)));
  }
  
  static final class ByteBufferReader
    implements DefaultImageHeaderParser.Reader
  {
    private final ByteBuffer byteBuffer;
    
    ByteBufferReader(ByteBuffer paramByteBuffer)
    {
      this.byteBuffer = paramByteBuffer;
      paramByteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
    
    public final int getByte()
    {
      if (this.byteBuffer.remaining() <= 0) {
        return -1;
      }
      return this.byteBuffer.get();
    }
    
    public final int getUInt16()
    {
      return getByte() << 8 & 0xFF00 | getByte() & 0xFF;
    }
    
    public final short getUInt8()
    {
      return (short)(getByte() & 0xFF);
    }
    
    public final int read(byte[] paramArrayOfByte, int paramInt)
    {
      paramInt = Math.min(paramInt, this.byteBuffer.remaining());
      if (paramInt == 0) {
        return -1;
      }
      this.byteBuffer.get(paramArrayOfByte, 0, paramInt);
      return paramInt;
    }
    
    public final long skip(long paramLong)
    {
      int i = (int)Math.min(this.byteBuffer.remaining(), paramLong);
      this.byteBuffer.position(this.byteBuffer.position() + i);
      return i;
    }
  }
  
  static final class RandomAccessReader
  {
    private final ByteBuffer data;
    
    RandomAccessReader(byte[] paramArrayOfByte, int paramInt)
    {
      this.data = ((ByteBuffer)ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.BIG_ENDIAN).limit(paramInt));
    }
    
    private boolean isAvailable(int paramInt1, int paramInt2)
    {
      return this.data.remaining() - paramInt1 >= paramInt2;
    }
    
    final short getInt16(int paramInt)
    {
      if (isAvailable(paramInt, 2)) {
        return this.data.getShort(paramInt);
      }
      return -1;
    }
    
    final int getInt32(int paramInt)
    {
      if (isAvailable(paramInt, 4)) {
        return this.data.getInt(paramInt);
      }
      return -1;
    }
    
    final int length()
    {
      return this.data.remaining();
    }
    
    final void order(ByteOrder paramByteOrder)
    {
      this.data.order(paramByteOrder);
    }
  }
  
  static abstract interface Reader
  {
    public abstract int getByte()
      throws IOException;
    
    public abstract int getUInt16()
      throws IOException;
    
    public abstract short getUInt8()
      throws IOException;
    
    public abstract int read(byte[] paramArrayOfByte, int paramInt)
      throws IOException;
    
    public abstract long skip(long paramLong)
      throws IOException;
  }
  
  static final class StreamReader
    implements DefaultImageHeaderParser.Reader
  {
    private final InputStream is;
    
    StreamReader(InputStream paramInputStream)
    {
      this.is = paramInputStream;
    }
    
    public final int getByte()
      throws IOException
    {
      return this.is.read();
    }
    
    public final int getUInt16()
      throws IOException
    {
      return this.is.read() << 8 & 0xFF00 | this.is.read() & 0xFF;
    }
    
    public final short getUInt8()
      throws IOException
    {
      return (short)(this.is.read() & 0xFF);
    }
    
    public final int read(byte[] paramArrayOfByte, int paramInt)
      throws IOException
    {
      int i = paramInt;
      while (i > 0)
      {
        int j = this.is.read(paramArrayOfByte, paramInt - i, i);
        if (j == -1) {
          break;
        }
        i -= j;
      }
      return paramInt - i;
    }
    
    public final long skip(long paramLong)
      throws IOException
    {
      if (paramLong < 0L) {
        return 0L;
      }
      long l1 = paramLong;
      if (l1 > 0L)
      {
        long l2 = this.is.skip(l1);
        if (l2 > 0L) {}
        for (;;)
        {
          l1 -= l2;
          break;
          if (this.is.read() == -1) {
            break label58;
          }
          l2 = 1L;
        }
      }
      label58:
      return paramLong - l1;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
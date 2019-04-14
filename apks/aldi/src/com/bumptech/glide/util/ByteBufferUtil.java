package com.bumptech.glide.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public final class ByteBufferUtil
{
  private static final AtomicReference<byte[]> BUFFER_REF = new AtomicReference();
  private static final int BUFFER_SIZE = 16384;
  
  /* Error */
  @NonNull
  public static ByteBuffer fromFile(@NonNull java.io.File paramFile)
    throws IOException
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: invokevirtual 38	java/io/File:length	()J
    //   7: lstore_1
    //   8: lload_1
    //   9: ldc2_w 39
    //   12: lcmp
    //   13: ifgt +79 -> 92
    //   16: lload_1
    //   17: lconst_0
    //   18: lcmp
    //   19: ifeq +63 -> 82
    //   22: new 42	java/io/RandomAccessFile
    //   25: dup
    //   26: aload_0
    //   27: ldc 44
    //   29: invokespecial 47	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   32: astore_3
    //   33: aload_3
    //   34: invokevirtual 51	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   37: astore_0
    //   38: aload_0
    //   39: getstatic 57	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   42: lconst_0
    //   43: lload_1
    //   44: invokevirtual 63	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   47: invokevirtual 69	java/nio/MappedByteBuffer:load	()Ljava/nio/MappedByteBuffer;
    //   50: astore 4
    //   52: aload_0
    //   53: ifnull +7 -> 60
    //   56: aload_0
    //   57: invokevirtual 72	java/nio/channels/FileChannel:close	()V
    //   60: aload_3
    //   61: invokevirtual 73	java/io/RandomAccessFile:close	()V
    //   64: aload 4
    //   66: areturn
    //   67: astore 5
    //   69: aload_0
    //   70: astore 4
    //   72: aload 5
    //   74: astore_0
    //   75: goto +30 -> 105
    //   78: astore_0
    //   79: goto +26 -> 105
    //   82: new 31	java/io/IOException
    //   85: dup
    //   86: ldc 75
    //   88: invokespecial 78	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   91: athrow
    //   92: new 31	java/io/IOException
    //   95: dup
    //   96: ldc 80
    //   98: invokespecial 78	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   101: athrow
    //   102: astore_0
    //   103: aconst_null
    //   104: astore_3
    //   105: aload 4
    //   107: ifnull +11 -> 118
    //   110: aload 4
    //   112: invokevirtual 72	java/nio/channels/FileChannel:close	()V
    //   115: goto +3 -> 118
    //   118: aload_3
    //   119: ifnull +7 -> 126
    //   122: aload_3
    //   123: invokevirtual 73	java/io/RandomAccessFile:close	()V
    //   126: aload_0
    //   127: athrow
    //   128: astore_0
    //   129: goto -69 -> 60
    //   132: astore_0
    //   133: aload 4
    //   135: areturn
    //   136: astore 4
    //   138: goto -20 -> 118
    //   141: astore_3
    //   142: goto -16 -> 126
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	paramFile	java.io.File
    //   7	37	1	l	long
    //   32	91	3	localRandomAccessFile	java.io.RandomAccessFile
    //   141	1	3	localIOException1	IOException
    //   1	133	4	localObject1	Object
    //   136	1	4	localIOException2	IOException
    //   67	6	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   38	52	67	finally
    //   33	38	78	finally
    //   3	8	102	finally
    //   22	33	102	finally
    //   82	92	102	finally
    //   92	102	102	finally
    //   56	60	128	java/io/IOException
    //   60	64	132	java/io/IOException
    //   110	115	136	java/io/IOException
    //   122	126	141	java/io/IOException
  }
  
  @NonNull
  public static ByteBuffer fromStream(@NonNull InputStream paramInputStream)
    throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(16384);
    byte[] arrayOfByte2 = (byte[])BUFFER_REF.getAndSet(null);
    byte[] arrayOfByte1 = arrayOfByte2;
    if (arrayOfByte2 == null) {
      arrayOfByte1 = new byte['䀀'];
    }
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte1);
      if (i < 0) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte1, 0, i);
    }
    BUFFER_REF.set(arrayOfByte1);
    paramInputStream = localByteArrayOutputStream.toByteArray();
    return (ByteBuffer)ByteBuffer.allocateDirect(paramInputStream.length).put(paramInputStream).position(0);
  }
  
  @Nullable
  private static SafeArray getSafeArray(@NonNull ByteBuffer paramByteBuffer)
  {
    if ((!paramByteBuffer.isReadOnly()) && (paramByteBuffer.hasArray())) {
      return new SafeArray(paramByteBuffer.array(), paramByteBuffer.arrayOffset(), paramByteBuffer.limit());
    }
    return null;
  }
  
  @NonNull
  public static byte[] toBytes(@NonNull ByteBuffer paramByteBuffer)
  {
    Object localObject = getSafeArray(paramByteBuffer);
    if ((localObject != null) && (((SafeArray)localObject).offset == 0) && (((SafeArray)localObject).limit == ((SafeArray)localObject).data.length)) {
      return paramByteBuffer.array();
    }
    paramByteBuffer = paramByteBuffer.asReadOnlyBuffer();
    localObject = new byte[paramByteBuffer.limit()];
    paramByteBuffer.position(0);
    paramByteBuffer.get((byte[])localObject);
    return (byte[])localObject;
  }
  
  /* Error */
  public static void toFile(@NonNull ByteBuffer paramByteBuffer, @NonNull java.io.File paramFile)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: invokevirtual 128	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   5: pop
    //   6: new 42	java/io/RandomAccessFile
    //   9: dup
    //   10: aload_1
    //   11: ldc -83
    //   13: invokespecial 47	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   16: astore_2
    //   17: aload_2
    //   18: invokevirtual 51	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   21: astore_1
    //   22: aload_1
    //   23: aload_0
    //   24: invokevirtual 176	java/nio/channels/FileChannel:write	(Ljava/nio/ByteBuffer;)I
    //   27: pop
    //   28: aload_1
    //   29: iconst_0
    //   30: invokevirtual 180	java/nio/channels/FileChannel:force	(Z)V
    //   33: aload_1
    //   34: invokevirtual 72	java/nio/channels/FileChannel:close	()V
    //   37: aload_2
    //   38: invokevirtual 73	java/io/RandomAccessFile:close	()V
    //   41: aload_1
    //   42: ifnull +7 -> 49
    //   45: aload_1
    //   46: invokevirtual 72	java/nio/channels/FileChannel:close	()V
    //   49: aload_2
    //   50: invokevirtual 73	java/io/RandomAccessFile:close	()V
    //   53: return
    //   54: astore_0
    //   55: goto +14 -> 69
    //   58: astore_0
    //   59: aconst_null
    //   60: astore_1
    //   61: goto +8 -> 69
    //   64: astore_0
    //   65: aconst_null
    //   66: astore_1
    //   67: aload_1
    //   68: astore_2
    //   69: aload_1
    //   70: ifnull +10 -> 80
    //   73: aload_1
    //   74: invokevirtual 72	java/nio/channels/FileChannel:close	()V
    //   77: goto +3 -> 80
    //   80: aload_2
    //   81: ifnull +7 -> 88
    //   84: aload_2
    //   85: invokevirtual 73	java/io/RandomAccessFile:close	()V
    //   88: aload_0
    //   89: athrow
    //   90: astore_0
    //   91: goto -42 -> 49
    //   94: astore_0
    //   95: return
    //   96: astore_1
    //   97: goto -17 -> 80
    //   100: astore_1
    //   101: goto -13 -> 88
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	paramByteBuffer	ByteBuffer
    //   0	104	1	paramFile	java.io.File
    //   16	69	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   22	41	54	finally
    //   17	22	58	finally
    //   6	17	64	finally
    //   45	49	90	java/io/IOException
    //   49	53	94	java/io/IOException
    //   73	77	96	java/io/IOException
    //   84	88	100	java/io/IOException
  }
  
  @NonNull
  public static InputStream toStream(@NonNull ByteBuffer paramByteBuffer)
  {
    return new ByteBufferStream(paramByteBuffer);
  }
  
  public static void toStream(@NonNull ByteBuffer paramByteBuffer, @NonNull OutputStream paramOutputStream)
    throws IOException
  {
    Object localObject = getSafeArray(paramByteBuffer);
    if (localObject != null)
    {
      paramOutputStream.write(((SafeArray)localObject).data, ((SafeArray)localObject).offset, ((SafeArray)localObject).offset + ((SafeArray)localObject).limit);
      return;
    }
    byte[] arrayOfByte = (byte[])BUFFER_REF.getAndSet(null);
    localObject = arrayOfByte;
    if (arrayOfByte == null) {
      localObject = new byte['䀀'];
    }
    while (paramByteBuffer.remaining() > 0)
    {
      int i = Math.min(paramByteBuffer.remaining(), localObject.length);
      paramByteBuffer.get((byte[])localObject, 0, i);
      paramOutputStream.write((byte[])localObject, 0, i);
    }
    BUFFER_REF.set(localObject);
  }
  
  static class ByteBufferStream
    extends InputStream
  {
    private static final int UNSET = -1;
    @NonNull
    private final ByteBuffer byteBuffer;
    private int markPos = -1;
    
    ByteBufferStream(@NonNull ByteBuffer paramByteBuffer)
    {
      this.byteBuffer = paramByteBuffer;
    }
    
    public int available()
    {
      return this.byteBuffer.remaining();
    }
    
    public void mark(int paramInt)
    {
      try
      {
        this.markPos = this.byteBuffer.position();
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public boolean markSupported()
    {
      return true;
    }
    
    public int read()
    {
      if (!this.byteBuffer.hasRemaining()) {
        return -1;
      }
      return this.byteBuffer.get();
    }
    
    public int read(@NonNull byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      if (!this.byteBuffer.hasRemaining()) {
        return -1;
      }
      paramInt2 = Math.min(paramInt2, available());
      this.byteBuffer.get(paramArrayOfByte, paramInt1, paramInt2);
      return paramInt2;
    }
    
    public void reset()
      throws IOException
    {
      try
      {
        if (this.markPos != -1)
        {
          this.byteBuffer.position(this.markPos);
          return;
        }
        throw new IOException("Cannot reset to unset mark position");
      }
      finally {}
    }
    
    public long skip(long paramLong)
      throws IOException
    {
      if (!this.byteBuffer.hasRemaining()) {
        return -1L;
      }
      paramLong = Math.min(paramLong, available());
      this.byteBuffer.position((int)(this.byteBuffer.position() + paramLong));
      return paramLong;
    }
  }
  
  static final class SafeArray
  {
    final byte[] data;
    final int limit;
    final int offset;
    
    SafeArray(@NonNull byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      this.data = paramArrayOfByte;
      this.offset = paramInt1;
      this.limit = paramInt2;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/util/ByteBufferUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
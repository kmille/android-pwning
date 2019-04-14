package com.google.common.io;

import com.google.common.base.j;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;

public abstract class b
{
  /* Error */
  public long a(OutputStream paramOutputStream)
    throws IOException
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 25	com/google/common/base/j:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: invokestatic 30	com/google/common/io/g:a	()Lcom/google/common/io/g;
    //   8: astore 4
    //   10: aload 4
    //   12: aload_0
    //   13: invokevirtual 33	com/google/common/io/b:a	()Ljava/io/InputStream;
    //   16: invokevirtual 36	com/google/common/io/g:a	(Ljava/io/Closeable;)Ljava/io/Closeable;
    //   19: checkcast 38	java/io/InputStream
    //   22: aload_1
    //   23: invokestatic 43	com/google/common/io/c:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   26: lstore_2
    //   27: aload 4
    //   29: invokevirtual 46	com/google/common/io/g:close	()V
    //   32: lload_2
    //   33: lreturn
    //   34: astore_1
    //   35: goto +11 -> 46
    //   38: astore_1
    //   39: aload 4
    //   41: aload_1
    //   42: invokevirtual 49	com/google/common/io/g:a	(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    //   45: athrow
    //   46: aload 4
    //   48: invokevirtual 46	com/google/common/io/g:close	()V
    //   51: aload_1
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	b
    //   0	53	1	paramOutputStream	OutputStream
    //   26	7	2	l	long
    //   8	39	4	localg	g
    // Exception table:
    //   from	to	target	type
    //   10	27	34	finally
    //   39	46	34	finally
    //   10	27	38	java/lang/Throwable
  }
  
  public final d a(Charset paramCharset)
  {
    return new a(paramCharset);
  }
  
  public abstract InputStream a()
    throws IOException;
  
  /* Error */
  public byte[] b()
    throws IOException
  {
    // Byte code:
    //   0: invokestatic 30	com/google/common/io/g:a	()Lcom/google/common/io/g;
    //   3: astore_1
    //   4: aload_1
    //   5: aload_0
    //   6: invokevirtual 33	com/google/common/io/b:a	()Ljava/io/InputStream;
    //   9: invokevirtual 36	com/google/common/io/g:a	(Ljava/io/Closeable;)Ljava/io/Closeable;
    //   12: checkcast 38	java/io/InputStream
    //   15: invokestatic 58	com/google/common/io/c:a	(Ljava/io/InputStream;)[B
    //   18: astore_2
    //   19: aload_1
    //   20: invokevirtual 46	com/google/common/io/g:close	()V
    //   23: aload_2
    //   24: areturn
    //   25: astore_2
    //   26: goto +10 -> 36
    //   29: astore_2
    //   30: aload_1
    //   31: aload_2
    //   32: invokevirtual 49	com/google/common/io/g:a	(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_1
    //   37: invokevirtual 46	com/google/common/io/g:close	()V
    //   40: aload_2
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	b
    //   3	34	1	localg	g
    //   18	6	2	arrayOfByte	byte[]
    //   25	1	2	localObject	Object
    //   29	12	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   4	19	25	finally
    //   30	36	25	finally
    //   4	19	29	java/lang/Throwable
  }
  
  final class a
    extends d
  {
    final Charset a;
    
    a(Charset paramCharset)
    {
      this.a = ((Charset)j.a(paramCharset));
    }
    
    public final Reader a()
      throws IOException
    {
      return new InputStreamReader(b.this.a(), this.a);
    }
    
    public final String b()
      throws IOException
    {
      return new String(b.this.b(), this.a);
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(b.this.toString());
      localStringBuilder.append(".asCharSource(");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends b
  {
    final byte[] a;
    final int b;
    final int c;
    
    public b(byte[] paramArrayOfByte)
    {
      this(paramArrayOfByte, paramArrayOfByte.length);
    }
    
    private b(byte[] paramArrayOfByte, int paramInt)
    {
      this.a = paramArrayOfByte;
      this.b = 0;
      this.c = paramInt;
    }
    
    public final long a(OutputStream paramOutputStream)
      throws IOException
    {
      paramOutputStream.write(this.a, this.b, this.c);
      return this.c;
    }
    
    public final InputStream a()
    {
      return new ByteArrayInputStream(this.a, this.b, this.c);
    }
    
    public final byte[] b()
    {
      return Arrays.copyOfRange(this.a, this.b, this.b + this.c);
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("ByteSource.wrap(");
      Object localObject2 = a.b().a(this.a, this.b, this.c);
      j.a(localObject2);
      int j = 30 - "...".length();
      int i;
      if (j >= 0) {
        i = 1;
      } else {
        i = 0;
      }
      int k = "...".length();
      if (i != 0)
      {
        Object localObject1 = localObject2;
        if (((CharSequence)localObject2).length() <= 30)
        {
          localObject2 = ((CharSequence)localObject2).toString();
          localObject1 = localObject2;
          if (((String)localObject2).length() <= 30) {}
        }
        else
        {
          localObject2 = new StringBuilder(30);
          ((StringBuilder)localObject2).append((CharSequence)localObject1, 0, j);
          ((StringBuilder)localObject2).append("...");
          localObject2 = ((StringBuilder)localObject2).toString();
        }
        localStringBuilder.append((String)localObject2);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
      throw new IllegalArgumentException(j.a("maxLength (%s) must be >= length of the truncation indicator (%s)", new Object[] { Integer.valueOf(30), Integer.valueOf(k) }));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/io/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
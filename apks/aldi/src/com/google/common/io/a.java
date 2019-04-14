package com.google.common.io;

import com.google.common.base.b;
import com.google.common.base.b.b;
import com.google.common.base.g;
import com.google.common.base.j;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import javax.annotation.Nullable;

public abstract class a
{
  private static final a a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));
  private static final a b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));
  private static final a c = new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));
  private static final a d = new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));
  private static final a e = new b("base16()", "0123456789ABCDEF");
  
  public static a a()
  {
    return a;
  }
  
  public static a b()
  {
    return e;
  }
  
  abstract int a(int paramInt);
  
  public final String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    j.a(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    StringBuilder localStringBuilder = new StringBuilder(a(paramInt2));
    try
    {
      a(localStringBuilder, paramArrayOfByte, paramInt1, paramInt2);
      return localStringBuilder.toString();
    }
    catch (IOException paramArrayOfByte)
    {
      throw new AssertionError(paramArrayOfByte);
    }
  }
  
  abstract void a(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException;
  
  static final class a
    extends b
  {
    final char[] o;
    final int p;
    final int q;
    final int r;
    final int s;
    private final String t;
    private final byte[] u;
    private final boolean[] v;
    
    /* Error */
    a(String paramString, char[] paramArrayOfChar)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 27	com/google/common/base/b:<init>	()V
      //   4: aload_0
      //   5: aload_1
      //   6: invokestatic 32	com/google/common/base/j:a	(Ljava/lang/Object;)Ljava/lang/Object;
      //   9: checkcast 34	java/lang/String
      //   12: putfield 36	com/google/common/io/a$a:t	Ljava/lang/String;
      //   15: aload_0
      //   16: aload_2
      //   17: invokestatic 32	com/google/common/base/j:a	(Ljava/lang/Object;)Ljava/lang/Object;
      //   20: checkcast 37	[C
      //   23: putfield 39	com/google/common/io/a$a:o	[C
      //   26: aload_0
      //   27: aload_2
      //   28: arraylength
      //   29: getstatic 45	java/math/RoundingMode:UNNECESSARY	Ljava/math/RoundingMode;
      //   32: invokestatic 50	com/google/common/b/a:a	(ILjava/math/RoundingMode;)I
      //   35: putfield 52	com/google/common/io/a$a:q	I
      //   38: bipush 8
      //   40: aload_0
      //   41: getfield 52	com/google/common/io/a$a:q	I
      //   44: invokestatic 58	java/lang/Integer:lowestOneBit	(I)I
      //   47: invokestatic 64	java/lang/Math:min	(II)I
      //   50: istore 4
      //   52: aload_0
      //   53: bipush 8
      //   55: iload 4
      //   57: idiv
      //   58: putfield 66	com/google/common/io/a$a:r	I
      //   61: aload_0
      //   62: aload_0
      //   63: getfield 52	com/google/common/io/a$a:q	I
      //   66: iload 4
      //   68: idiv
      //   69: putfield 68	com/google/common/io/a$a:s	I
      //   72: aload_0
      //   73: aload_2
      //   74: arraylength
      //   75: iconst_1
      //   76: isub
      //   77: putfield 70	com/google/common/io/a$a:p	I
      //   80: sipush 128
      //   83: newarray <illegal type>
      //   85: astore_1
      //   86: aload_1
      //   87: iconst_m1
      //   88: invokestatic 76	java/util/Arrays:fill	([BB)V
      //   91: iconst_0
      //   92: istore 5
      //   94: iconst_0
      //   95: istore 4
      //   97: iload 4
      //   99: aload_2
      //   100: arraylength
      //   101: if_icmpge +60 -> 161
      //   104: aload_2
      //   105: iload 4
      //   107: caload
      //   108: istore_3
      //   109: getstatic 81	com/google/common/base/b$b:o	Lcom/google/common/base/b$b;
      //   112: iload_3
      //   113: invokevirtual 84	com/google/common/base/b:a	(C)Z
      //   116: ldc 86
      //   118: iload_3
      //   119: invokestatic 89	com/google/common/base/j:a	(ZLjava/lang/String;C)V
      //   122: aload_1
      //   123: iload_3
      //   124: baload
      //   125: iconst_m1
      //   126: if_icmpne +9 -> 135
      //   129: iconst_1
      //   130: istore 6
      //   132: goto +6 -> 138
      //   135: iconst_0
      //   136: istore 6
      //   138: iload 6
      //   140: ldc 91
      //   142: iload_3
      //   143: invokestatic 89	com/google/common/base/j:a	(ZLjava/lang/String;C)V
      //   146: aload_1
      //   147: iload_3
      //   148: iload 4
      //   150: i2b
      //   151: bastore
      //   152: iload 4
      //   154: iconst_1
      //   155: iadd
      //   156: istore 4
      //   158: goto -61 -> 97
      //   161: aload_0
      //   162: aload_1
      //   163: putfield 93	com/google/common/io/a$a:u	[B
      //   166: aload_0
      //   167: getfield 66	com/google/common/io/a$a:r	I
      //   170: newarray <illegal type>
      //   172: astore_1
      //   173: iload 5
      //   175: istore 4
      //   177: iload 4
      //   179: aload_0
      //   180: getfield 68	com/google/common/io/a$a:s	I
      //   183: if_icmpge +30 -> 213
      //   186: aload_1
      //   187: iload 4
      //   189: bipush 8
      //   191: imul
      //   192: aload_0
      //   193: getfield 52	com/google/common/io/a$a:q	I
      //   196: getstatic 96	java/math/RoundingMode:CEILING	Ljava/math/RoundingMode;
      //   199: invokestatic 99	com/google/common/b/a:a	(IILjava/math/RoundingMode;)I
      //   202: iconst_1
      //   203: bastore
      //   204: iload 4
      //   206: iconst_1
      //   207: iadd
      //   208: istore 4
      //   210: goto -33 -> 177
      //   213: aload_0
      //   214: aload_1
      //   215: putfield 101	com/google/common/io/a$a:v	[Z
      //   218: return
      //   219: astore_1
      //   220: new 103	java/lang/StringBuilder
      //   223: dup
      //   224: ldc 105
      //   226: invokespecial 108	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   229: astore 7
      //   231: aload 7
      //   233: new 34	java/lang/String
      //   236: dup
      //   237: aload_2
      //   238: invokespecial 111	java/lang/String:<init>	([C)V
      //   241: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   244: pop
      //   245: new 117	java/lang/IllegalArgumentException
      //   248: dup
      //   249: aload 7
      //   251: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   254: aload_1
      //   255: invokespecial 124	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   258: athrow
      //   259: astore_1
      //   260: new 103	java/lang/StringBuilder
      //   263: dup
      //   264: ldc 126
      //   266: invokespecial 108	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   269: astore 7
      //   271: aload 7
      //   273: aload_2
      //   274: arraylength
      //   275: invokevirtual 129	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   278: pop
      //   279: new 117	java/lang/IllegalArgumentException
      //   282: dup
      //   283: aload 7
      //   285: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   288: aload_1
      //   289: invokespecial 124	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   292: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	293	0	this	a
      //   0	293	1	paramString	String
      //   0	293	2	paramArrayOfChar	char[]
      //   108	40	3	c	char
      //   50	159	4	i	int
      //   92	82	5	j	int
      //   130	9	6	bool	boolean
      //   229	55	7	localStringBuilder	StringBuilder
      // Exception table:
      //   from	to	target	type
      //   52	72	219	java/lang/ArithmeticException
      //   26	38	259	java/lang/ArithmeticException
    }
    
    public final boolean a(char paramChar)
    {
      return (b.b.o.a(paramChar)) && (this.u[paramChar] != -1);
    }
    
    public final boolean equals(@Nullable Object paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        return Arrays.equals(this.o, ((a)paramObject).o);
      }
      return false;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(this.o);
    }
    
    public final String toString()
    {
      return this.t;
    }
  }
  
  static final class b
    extends a.d
  {
    final char[] a = new char['Ȁ'];
    
    private b(a.a parama)
    {
      super(null);
      int j = a.a.a(parama).length;
      int i = 0;
      boolean bool;
      if (j == 16) {
        bool = true;
      } else {
        bool = false;
      }
      j.a(bool);
      while (i < 256)
      {
        this.a[i] = parama.o[(i >>> 4)];
        this.a[(i | 0x100)] = parama.o[(i & 0xF)];
        i += 1;
      }
    }
    
    b(String paramString1, String paramString2)
    {
      this(new a.a(paramString1, paramString2.toCharArray()));
    }
    
    final void a(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      j.a(paramAppendable);
      j.a(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
      int i = 0;
      while (i < paramInt2)
      {
        int j = paramArrayOfByte[(paramInt1 + i)] & 0xFF;
        paramAppendable.append(this.a[j]);
        paramAppendable.append(this.a[(j | 0x100)]);
        i += 1;
      }
    }
  }
  
  static final class c
    extends a.d
  {
    private c(a.a parama, @Nullable Character paramCharacter)
    {
      super(paramCharacter);
      boolean bool;
      if (a.a.a(parama).length == 64) {
        bool = true;
      } else {
        bool = false;
      }
      j.a(bool);
    }
    
    c(String paramString1, String paramString2, @Nullable Character paramCharacter)
    {
      this(new a.a(paramString1, paramString2.toCharArray()), paramCharacter);
    }
    
    final void a(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      j.a(paramAppendable);
      int i = paramInt1 + paramInt2;
      j.a(paramInt1, i, paramArrayOfByte.length);
      while (paramInt2 >= 3)
      {
        int j = paramInt1 + 1;
        int k = paramArrayOfByte[paramInt1];
        paramInt1 = j + 1;
        j = (k & 0xFF) << 16 | (paramArrayOfByte[j] & 0xFF) << 8 | paramArrayOfByte[paramInt1] & 0xFF;
        paramAppendable.append(this.b.o[(j >>> 18)]);
        paramAppendable.append(this.b.o[(j >>> 12 & 0x3F)]);
        paramAppendable.append(this.b.o[(j >>> 6 & 0x3F)]);
        paramAppendable.append(this.b.o[(j & 0x3F)]);
        paramInt2 -= 3;
        paramInt1 += 1;
      }
      if (paramInt1 < i) {
        b(paramAppendable, paramArrayOfByte, paramInt1, i - paramInt1);
      }
    }
  }
  
  static class d
    extends a
  {
    final a.a b;
    @Nullable
    final Character c;
    
    d(a.a parama, @Nullable Character paramCharacter)
    {
      this.b = ((a.a)j.a(parama));
      boolean bool;
      if ((paramCharacter != null) && (parama.a(paramCharacter.charValue()))) {
        bool = false;
      } else {
        bool = true;
      }
      j.a(bool, "Padding character %s was already in alphabet", paramCharacter);
      this.c = paramCharacter;
    }
    
    d(String paramString1, String paramString2, @Nullable Character paramCharacter)
    {
      this(new a.a(paramString1, paramString2.toCharArray()), paramCharacter);
    }
    
    final int a(int paramInt)
    {
      return this.b.r * com.google.common.b.a.a(paramInt, this.b.s, RoundingMode.CEILING);
    }
    
    void a(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      j.a(paramAppendable);
      j.a(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
      int i = 0;
      while (i < paramInt2)
      {
        b(paramAppendable, paramArrayOfByte, paramInt1 + i, Math.min(this.b.s, paramInt2 - i));
        i += this.b.s;
      }
    }
    
    final void b(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      j.a(paramAppendable);
      j.a(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
      int i = this.b.s;
      int j = 0;
      boolean bool;
      if (paramInt2 <= i) {
        bool = true;
      } else {
        bool = false;
      }
      j.a(bool);
      long l = 0L;
      i = 0;
      while (i < paramInt2)
      {
        l = (l | paramArrayOfByte[(paramInt1 + i)] & 0xFF) << 8;
        i += 1;
      }
      i = this.b.q;
      paramInt1 = j;
      while (paramInt1 < paramInt2 * 8)
      {
        j = (int)(l >>> (paramInt2 + 1) * 8 - i - paramInt1);
        int k = this.b.p;
        paramAppendable.append(this.b.o[(j & k)]);
        paramInt1 += this.b.q;
      }
      if (this.c != null) {
        while (paramInt1 < this.b.s * 8)
        {
          paramAppendable.append(this.c.charValue());
          paramInt1 += this.b.q;
        }
      }
    }
    
    public boolean equals(@Nullable Object paramObject)
    {
      if ((paramObject instanceof d))
      {
        paramObject = (d)paramObject;
        if ((this.b.equals(((d)paramObject).b)) && (g.a(this.c, ((d)paramObject).c))) {
          return true;
        }
      }
      return false;
    }
    
    public int hashCode()
    {
      return this.b.hashCode() ^ Arrays.hashCode(new Object[] { this.c });
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("BaseEncoding.");
      localStringBuilder.append(this.b.toString());
      if (8 % this.b.q != 0)
      {
        if (this.c == null) {}
        for (String str = ".omitPadding()";; str = "')")
        {
          localStringBuilder.append(str);
          break;
          localStringBuilder.append(".withPadChar('");
          localStringBuilder.append(this.c);
        }
      }
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/io/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
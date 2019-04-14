package b.i.b.a.c.g;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class d
  implements Iterable<Byte>
{
  public static final d b = new p(new byte[0]);
  
  public static d a(Iterable<d> paramIterable)
  {
    if (!(paramIterable instanceof Collection))
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramIterable.iterator();
      for (;;)
      {
        paramIterable = localArrayList;
        if (!localIterator.hasNext()) {
          break;
        }
        localArrayList.add((d)localIterator.next());
      }
    }
    paramIterable = (Collection)paramIterable;
    if (paramIterable.isEmpty()) {
      return b;
    }
    return a(paramIterable.iterator(), paramIterable.size());
  }
  
  public static d a(String paramString)
  {
    try
    {
      paramString = new p(paramString.getBytes("UTF-8"));
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException("UTF-8 not supported?", paramString);
    }
  }
  
  private static d a(Iterator<d> paramIterator, int paramInt)
  {
    if ((!c) && (paramInt <= 0)) {
      throw new AssertionError();
    }
    if (paramInt == 1) {
      return (d)paramIterator.next();
    }
    int i = paramInt >>> 1;
    return a(paramIterator, i).a(a(paramIterator, paramInt - i));
  }
  
  public static d a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static d a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    return new p(arrayOfByte);
  }
  
  public static b h()
  {
    return new b();
  }
  
  public abstract int a();
  
  protected abstract int a(int paramInt1, int paramInt2, int paramInt3);
  
  public final d a(d paramd)
  {
    int i = a();
    int j = paramd.a();
    if (i + j < 2147483647L) {
      return u.a(this, paramd);
    }
    paramd = new StringBuilder(53);
    paramd.append("ByteString would be too long: ");
    paramd.append(i);
    paramd.append("+");
    paramd.append(j);
    throw new IllegalArgumentException(paramd.toString());
  }
  
  final void a(OutputStream paramOutputStream, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramInt1 >= 0)
    {
      if (paramInt2 >= 0)
      {
        int i = paramInt1 + paramInt2;
        if (i <= a())
        {
          if (paramInt2 > 0) {
            b(paramOutputStream, paramInt1, paramInt2);
          }
          return;
        }
        paramOutputStream = new StringBuilder(39);
        paramOutputStream.append("Source end offset exceeded: ");
        paramOutputStream.append(i);
        throw new IndexOutOfBoundsException(paramOutputStream.toString());
      }
      paramOutputStream = new StringBuilder(23);
      paramOutputStream.append("Length < 0: ");
      paramOutputStream.append(paramInt2);
      throw new IndexOutOfBoundsException(paramOutputStream.toString());
    }
    paramOutputStream = new StringBuilder(30);
    paramOutputStream.append("Source offset < 0: ");
    paramOutputStream.append(paramInt1);
    throw new IndexOutOfBoundsException(paramOutputStream.toString());
  }
  
  protected abstract void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  
  protected abstract int b(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract String b(String paramString)
    throws UnsupportedEncodingException;
  
  abstract void b(OutputStream paramOutputStream, int paramInt1, int paramInt2)
    throws IOException;
  
  public final void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 >= 0)
    {
      if (paramInt2 >= 0)
      {
        if (paramInt3 >= 0)
        {
          int i = paramInt1 + paramInt3;
          if (i <= a())
          {
            i = paramInt2 + paramInt3;
            if (i <= paramArrayOfByte.length)
            {
              if (paramInt3 > 0) {
                a(paramArrayOfByte, paramInt1, paramInt2, paramInt3);
              }
              return;
            }
            paramArrayOfByte = new StringBuilder(34);
            paramArrayOfByte.append("Target end offset < 0: ");
            paramArrayOfByte.append(i);
            throw new IndexOutOfBoundsException(paramArrayOfByte.toString());
          }
          paramArrayOfByte = new StringBuilder(34);
          paramArrayOfByte.append("Source end offset < 0: ");
          paramArrayOfByte.append(i);
          throw new IndexOutOfBoundsException(paramArrayOfByte.toString());
        }
        paramArrayOfByte = new StringBuilder(23);
        paramArrayOfByte.append("Length < 0: ");
        paramArrayOfByte.append(paramInt3);
        throw new IndexOutOfBoundsException(paramArrayOfByte.toString());
      }
      paramArrayOfByte = new StringBuilder(30);
      paramArrayOfByte.append("Target offset < 0: ");
      paramArrayOfByte.append(paramInt2);
      throw new IndexOutOfBoundsException(paramArrayOfByte.toString());
    }
    paramArrayOfByte = new StringBuilder(30);
    paramArrayOfByte.append("Source offset < 0: ");
    paramArrayOfByte.append(paramInt1);
    throw new IndexOutOfBoundsException(paramArrayOfByte.toString());
  }
  
  public abstract a c();
  
  public final byte[] d()
  {
    int i = a();
    if (i == 0) {
      return j.a;
    }
    byte[] arrayOfByte = new byte[i];
    a(arrayOfByte, 0, 0, i);
    return arrayOfByte;
  }
  
  public final String e()
  {
    try
    {
      String str = b("UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException("UTF-8 not supported?", localUnsupportedEncodingException);
    }
  }
  
  public abstract boolean f();
  
  public abstract e g();
  
  protected abstract int i();
  
  protected abstract boolean j();
  
  protected abstract int k();
  
  public String toString()
  {
    return String.format("<ByteString@%s size=%d>", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a()) });
  }
  
  public static abstract interface a
    extends Iterator<Byte>
  {
    public abstract byte a();
  }
  
  public static final class b
    extends OutputStream
  {
    private static final byte[] a = new byte[0];
    private final int b = 128;
    private final ArrayList<d> c = new ArrayList();
    private int d;
    private byte[] e = new byte[''];
    private int f;
    
    private void a(int paramInt)
    {
      this.c.add(new p(this.e));
      this.d += this.e.length;
      this.e = new byte[Math.max(this.b, Math.max(paramInt, this.d >>> 1))];
      this.f = 0;
    }
    
    private int b()
    {
      try
      {
        int i = this.d;
        int j = this.f;
        return i + j;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public final d a()
    {
      try
      {
        if (this.f < this.e.length)
        {
          if (this.f > 0)
          {
            localObject1 = this.e;
            int i = this.f;
            byte[] arrayOfByte = new byte[i];
            System.arraycopy(localObject1, 0, arrayOfByte, 0, Math.min(localObject1.length, i));
            this.c.add(new p(arrayOfByte));
          }
        }
        else
        {
          this.c.add(new p(this.e));
          this.e = a;
        }
        this.d += this.f;
        this.f = 0;
        Object localObject1 = d.a(this.c);
        return (d)localObject1;
      }
      finally {}
    }
    
    public final String toString()
    {
      return String.format("<ByteString.Output@%s size=%d>", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b()) });
    }
    
    public final void write(int paramInt)
    {
      try
      {
        if (this.f == this.e.length) {
          a(1);
        }
        byte[] arrayOfByte = this.e;
        int i = this.f;
        this.f = (i + 1);
        arrayOfByte[i] = ((byte)paramInt);
        return;
      }
      finally {}
    }
    
    public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      try
      {
        if (paramInt2 <= this.e.length - this.f)
        {
          System.arraycopy(paramArrayOfByte, paramInt1, this.e, this.f, paramInt2);
          this.f += paramInt2;
          return;
        }
        int i = this.e.length - this.f;
        System.arraycopy(paramArrayOfByte, paramInt1, this.e, this.f, i);
        paramInt2 -= i;
        a(paramInt2);
        System.arraycopy(paramArrayOfByte, paramInt1 + i, this.e, 0, paramInt2);
        this.f = paramInt2;
        return;
      }
      finally {}
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
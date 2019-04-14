package b.i.b.a.c.g;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class a
  implements q
{
  protected int r = 0;
  
  public final void a(OutputStream paramOutputStream)
    throws IOException
  {
    int k = f();
    int j = f.f(k) + k;
    int i = j;
    if (j > 4096) {
      i = 4096;
    }
    paramOutputStream = f.a(paramOutputStream, i);
    paramOutputStream.e(k);
    a(paramOutputStream);
    paramOutputStream.a();
  }
  
  public static abstract class a<BuilderType extends a>
    implements q.a
  {
    public abstract BuilderType a(e parame, g paramg)
      throws IOException;
    
    public abstract BuilderType c();
    
    static final class a
      extends FilterInputStream
    {
      private int a;
      
      a(InputStream paramInputStream, int paramInt)
      {
        super();
        this.a = paramInt;
      }
      
      public final int available()
        throws IOException
      {
        return Math.min(super.available(), this.a);
      }
      
      public final int read()
        throws IOException
      {
        if (this.a <= 0) {
          return -1;
        }
        int i = super.read();
        if (i >= 0) {
          this.a -= 1;
        }
        return i;
      }
      
      public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
        throws IOException
      {
        if (this.a <= 0) {
          return -1;
        }
        paramInt1 = super.read(paramArrayOfByte, paramInt1, Math.min(paramInt2, this.a));
        if (paramInt1 >= 0) {
          this.a -= paramInt1;
        }
        return paramInt1;
      }
      
      public final long skip(long paramLong)
        throws IOException
      {
        paramLong = super.skip(Math.min(paramLong, this.a));
        if (paramLong >= 0L) {
          this.a = ((int)(this.a - paramLong));
        }
        return paramLong;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
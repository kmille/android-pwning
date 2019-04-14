package b.i.b.a.c.g;

import java.util.NoSuchElementException;

final class c
  extends p
{
  final int a;
  private final int e;
  
  c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    if (paramInt1 >= 0)
    {
      if (paramInt2 >= 0)
      {
        if (paramInt1 + paramInt2 <= paramArrayOfByte.length)
        {
          this.a = paramInt1;
          this.e = paramInt2;
          return;
        }
        paramArrayOfByte = new StringBuilder(48);
        paramArrayOfByte.append("Offset+Length too large: ");
        paramArrayOfByte.append(paramInt1);
        paramArrayOfByte.append("+");
        paramArrayOfByte.append(paramInt2);
        throw new IllegalArgumentException(paramArrayOfByte.toString());
      }
      paramArrayOfByte = new StringBuilder(29);
      paramArrayOfByte.append("Length too small: ");
      paramArrayOfByte.append(paramInt1);
      throw new IllegalArgumentException(paramArrayOfByte.toString());
    }
    paramArrayOfByte = new StringBuilder(29);
    paramArrayOfByte.append("Offset too small: ");
    paramArrayOfByte.append(paramInt1);
    throw new IllegalArgumentException(paramArrayOfByte.toString());
  }
  
  public final byte a(int paramInt)
  {
    if (paramInt >= 0)
    {
      if (paramInt < this.e) {
        return this.d[(this.a + paramInt)];
      }
      int i = this.e;
      localStringBuilder = new StringBuilder(41);
      localStringBuilder.append("Index too large: ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(", ");
      localStringBuilder.append(i);
      throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder(28);
    localStringBuilder.append("Index too small: ");
    localStringBuilder.append(paramInt);
    throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public final int a()
  {
    return this.e;
  }
  
  protected final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.d, this.a + paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  protected final int b()
  {
    return this.a;
  }
  
  public final d.a c()
  {
    return new a((byte)0);
  }
  
  final class a
    implements d.a
  {
    private int b = c.this.a;
    private final int c = this.b + c.this.a();
    
    private a() {}
    
    public final byte a()
    {
      if (this.b < this.c)
      {
        byte[] arrayOfByte = c.this.d;
        int i = this.b;
        this.b = (i + 1);
        return arrayOfByte[i];
      }
      throw new NoSuchElementException();
    }
    
    public final boolean hasNext()
    {
      return this.b < this.c;
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
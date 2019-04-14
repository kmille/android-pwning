package b.i.b.a.c.g;

public final class z
{
  static final int a = 11;
  static final int b = 12;
  static final int c = 16;
  static final int d = 26;
  
  static int a(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
  
  public static int b(int paramInt)
  {
    return paramInt >>> 3;
  }
  
  public static enum a
  {
    final z.b s;
    final int t;
    
    private a(z.b paramb, int paramInt)
    {
      this.s = paramb;
      this.t = paramInt;
    }
    
    public boolean a()
    {
      return true;
    }
  }
  
  public static enum b
  {
    private final Object j;
    
    private b(Object paramObject)
    {
      this.j = paramObject;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
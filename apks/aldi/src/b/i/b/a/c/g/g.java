package b.i.b.a.c.g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class g
{
  private static volatile boolean b = false;
  private static final g c = new g((byte)0);
  final Map<a, i.f<?, ?>> a;
  
  g()
  {
    this.a = new HashMap();
  }
  
  private g(byte paramByte)
  {
    this.a = Collections.emptyMap();
  }
  
  public static g a()
  {
    return new g();
  }
  
  public static g b()
  {
    return c;
  }
  
  public final void a(i.f<?, ?> paramf)
  {
    this.a.put(new a(paramf.a, paramf.d.b), paramf);
  }
  
  static final class a
  {
    private final Object a;
    private final int b;
    
    a(Object paramObject, int paramInt)
    {
      this.a = paramObject;
      this.b = paramInt;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
      return (this.a == ((a)paramObject).a) && (this.b == ((a)paramObject).b);
    }
    
    public final int hashCode()
    {
      return System.identityHashCode(this.a) * 65535 + this.b;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
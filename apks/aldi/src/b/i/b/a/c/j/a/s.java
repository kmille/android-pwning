package b.i.b.a.c.j.a;

import b.f.b.j;
import b.i.b.a.c.b.am;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.a.c.b;
import b.i.b.a.c.e.a.b.a;
import b.i.b.a.c.e.a.b.c;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.a.h;
import b.i.b.a.c.f.a;

public abstract class s
{
  public final c a;
  public final h b;
  public final am c;
  
  private s(c paramc, h paramh, am paramam)
  {
    this.a = paramc;
    this.b = paramh;
    this.c = paramam;
  }
  
  public abstract b.i.b.a.c.f.b a();
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append(": ");
    localStringBuilder.append(a());
    return localStringBuilder.toString();
  }
  
  public static final class a
    extends s
  {
    public final a d;
    public final a.c.b e;
    public final boolean f;
    public final a g;
    private final a.c h;
    
    public a(a.c paramc, c paramc1, h paramh, am paramam, a parama)
    {
      super(paramh, paramam, (byte)0);
      this.h = paramc;
      this.g = parama;
      this.d = r.a(paramc1, this.h.c);
      paramc1 = (a.c.b)b.i.b.a.c.e.a.b.e.b(this.h.b);
      paramc = paramc1;
      if (paramc1 == null) {
        paramc = a.c.b.a;
      }
      this.e = paramc;
      paramc = b.i.b.a.c.e.a.b.f.a(this.h.b);
      j.a(paramc, "Flags.IS_INNER.get(classProto.flags)");
      this.f = paramc.booleanValue();
    }
    
    public final b.i.b.a.c.f.b a()
    {
      b.i.b.a.c.f.b localb = this.d.d();
      j.a(localb, "classId.asSingleFqName()");
      return localb;
    }
  }
  
  public static final class b
    extends s
  {
    private final b.i.b.a.c.f.b d;
    
    public b(b.i.b.a.c.f.b paramb, c paramc, h paramh, am paramam)
    {
      super(paramh, paramam, (byte)0);
      this.d = paramb;
    }
    
    public final b.i.b.a.c.f.b a()
    {
      return this.d;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package b.i.b.a.c.l;

import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.i.e.h;
import java.util.List;

public class o
  extends ad
{
  private final an a;
  private final h b;
  private final List<ap> c;
  private final boolean d;
  
  public o(an paraman, h paramh, byte paramByte)
  {
    this(paraman, paramh);
  }
  
  public o(an paraman, h paramh, List<? extends ap> paramList, boolean paramBoolean)
  {
    this.a = paraman;
    this.b = paramh;
    this.c = paramList;
    this.d = paramBoolean;
  }
  
  public final List<ap> a()
  {
    return this.c;
  }
  
  public final h b()
  {
    return this.b;
  }
  
  public final ad b(g paramg)
  {
    b.f.b.j.b(paramg, "newAnnotations");
    return (ad)this;
  }
  
  public ad b(boolean paramBoolean)
  {
    return (ad)new o(this.a, this.b, this.c, paramBoolean);
  }
  
  public final boolean c()
  {
    return this.d;
  }
  
  public final an f()
  {
    return this.a;
  }
  
  public final g r()
  {
    g.a locala = g.a;
    return g.a.a();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a.toString());
    String str;
    if (this.c.isEmpty()) {
      str = "";
    } else {
      str = b.a.j.a((Iterable)this.c, (CharSequence)", ", (CharSequence)"<", (CharSequence)">", -1, (CharSequence)"...", null);
    }
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
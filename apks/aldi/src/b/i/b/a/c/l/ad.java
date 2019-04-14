package b.i.b.a.c.l;

import b.i.b.a.c.b.a.g;
import b.k.l;
import java.util.Iterator;
import java.util.List;

public abstract class ad
  extends az
{
  public ad()
  {
    super((byte)0);
  }
  
  public abstract ad b(g paramg);
  
  public abstract ad b(boolean paramBoolean);
  
  public String toString()
  {
    Object localObject = new StringBuilder();
    Iterator localIterator = r().iterator();
    while (localIterator.hasNext())
    {
      b.i.b.a.c.b.a.c localc = (b.i.b.a.c.b.a.c)localIterator.next();
      l.a((StringBuilder)localObject, new String[] { "[", b.i.b.a.c.h.c.a(b.i.b.a.c.h.c.h, localc), "] " });
    }
    ((StringBuilder)localObject).append(f());
    if (!a().isEmpty()) {
      b.a.j.a((Iterable)a(), (Appendable)localObject, (CharSequence)", ", (CharSequence)"<", (CharSequence)">", 0, null, null, 112);
    }
    if (c()) {
      ((StringBuilder)localObject).append("?");
    }
    localObject = ((StringBuilder)localObject).toString();
    b.f.b.j.a(localObject, "StringBuilder().apply(builderAction).toString()");
    return (String)localObject;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
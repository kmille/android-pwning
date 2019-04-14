package b.i.b.a.c.d.b;

import b.i.b.a.c.b.e;
import b.i.b.a.c.l.w;
import java.util.Collection;

public final class v
  implements u<j>
{
  public static final v a = new v();
  
  public final w a(Collection<? extends w> paramCollection)
  {
    b.f.b.j.b(paramCollection, "types");
    StringBuilder localStringBuilder = new StringBuilder("There should be no intersection type in existing descriptors, but found: ");
    localStringBuilder.append(b.a.j.a((Iterable)paramCollection, null, null, null, 0, null, null, 63));
    throw ((Throwable)new AssertionError(localStringBuilder.toString()));
  }
  
  public final void a(w paramw, e parame)
  {
    b.f.b.j.b(paramw, "kotlinType");
    b.f.b.j.b(parame, "descriptor");
  }
  
  public final String b(e parame)
  {
    b.f.b.j.b(parame, "classDescriptor");
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
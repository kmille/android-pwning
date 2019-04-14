package b.i.b.a.c.a.a;

import b.a.j;
import b.a.v;
import b.i.b.a.c.b.t;
import b.i.b.a.c.k.i;
import b.r;
import java.util.List;

public final class d
  extends b.i.b.a.c.i.e.e
{
  public d(i parami, b paramb)
  {
    super(parami, (b.i.b.a.c.b.e)paramb);
  }
  
  public final List<t> a()
  {
    Object localObject = this.c;
    if (localObject != null)
    {
      localObject = ((b)localObject).b;
      switch (e.a[localObject.ordinal()])
      {
      default: 
        return (List)v.a;
      case 2: 
        localObject = f.a;
        return j.a(f.a.a((b)this.c, true));
      }
      localObject = f.a;
      return j.a(f.a.a((b)this.c, false));
    }
    throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
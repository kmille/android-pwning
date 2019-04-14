package b.i.b.a.c.d.a.c.b;

import b.f.a.b;
import b.f.b.k;
import b.i.b.a.c.h.i;
import b.i.b.a.c.l.ac;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.as;
import b.i.b.a.c.l.c.a;
import b.i.b.a.c.l.q;
import b.k.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class g
  extends q
  implements ac
{
  public g(ad paramad1, ad paramad2)
  {
    super(paramad1, paramad2);
    boolean bool = b.i.b.a.c.l.a.c.a.a((b.i.b.a.c.l.w)paramad1, (b.i.b.a.c.l.w)paramad2);
    if (b.w.a)
    {
      if (bool) {
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder("Lower bound ");
      localStringBuilder.append(paramad1);
      localStringBuilder.append(" of a flexible type must be a subtype of the upper bound ");
      localStringBuilder.append(paramad2);
      throw ((Throwable)new AssertionError(localStringBuilder.toString()));
    }
  }
  
  public final String a(b.i.b.a.c.h.c paramc, i parami)
  {
    b.f.b.j.b(paramc, "renderer");
    b.f.b.j.b(parami, "options");
    Object localObject1 = a.a;
    Object localObject2 = new b(paramc);
    localObject1 = c.a;
    String str = paramc.a((b.i.b.a.c.l.w)this.a);
    localObject1 = paramc.a((b.i.b.a.c.l.w)this.b);
    if (parami.b())
    {
      paramc = new StringBuilder("raw (");
      paramc.append(str);
      paramc.append("..");
      paramc.append((String)localObject1);
      paramc.append(')');
      return paramc.toString();
    }
    if (this.b.a().isEmpty()) {
      return paramc.a(str, (String)localObject1, a.a(this));
    }
    Object localObject3 = ((b)localObject2).a((b.i.b.a.c.l.w)this.a);
    parami = ((b)localObject2).a((b.i.b.a.c.l.w)this.b);
    localObject3 = (Iterable)localObject3;
    localObject2 = b.a.j.a((Iterable)localObject3, (CharSequence)", ", null, null, 0, null, (b)d.a, 30);
    parami = (Iterable)b.a.j.a((Iterable)localObject3, (Iterable)parami);
    if (!((Collection)parami).isEmpty())
    {
      parami = parami.iterator();
      while (parami.hasNext())
      {
        localObject3 = (b.m)parami.next();
        a locala = a.a;
        if (!a.a((String)((b.m)localObject3).a, (String)((b.m)localObject3).b))
        {
          i = 0;
          break label282;
        }
      }
    }
    int i = 1;
    label282:
    parami = (i)localObject1;
    if (i != 0) {
      parami = c.a((String)localObject1, (String)localObject2);
    }
    localObject1 = c.a(str, (String)localObject2);
    if (b.f.b.j.a(localObject1, parami)) {
      return (String)localObject1;
    }
    return paramc.a((String)localObject1, parami, a.a(this));
  }
  
  public final b.i.b.a.c.i.e.h b()
  {
    b.i.b.a.c.b.h localh = f().c();
    Object localObject = localh;
    if (!(localh instanceof b.i.b.a.c.b.e)) {
      localObject = null;
    }
    localObject = (b.i.b.a.c.b.e)localObject;
    if (localObject != null)
    {
      localObject = ((b.i.b.a.c.b.e)localObject).a((as)e.a);
      b.f.b.j.a(localObject, "classDescriptor.getMemberScope(RawSubstitution)");
      return (b.i.b.a.c.i.e.h)localObject;
    }
    localObject = new StringBuilder("Incorrect classifier: ");
    ((StringBuilder)localObject).append(f().c());
    throw ((Throwable)new IllegalStateException(((StringBuilder)localObject).toString().toString()));
  }
  
  public final ad n_()
  {
    return this.a;
  }
  
  static final class a
    extends k
    implements b.f.a.m<String, String, Boolean>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
    
    public static boolean a(String paramString1, String paramString2)
    {
      b.f.b.j.b(paramString1, "first");
      b.f.b.j.b(paramString2, "second");
      return (b.f.b.j.a(paramString1, l.a(paramString2, (CharSequence)"out "))) || (b.f.b.j.a(paramString2, "*"));
    }
  }
  
  static final class b
    extends k
    implements b<b.i.b.a.c.l.w, List<? extends String>>
  {
    b(b.i.b.a.c.h.c paramc)
    {
      super();
    }
    
    public final List<String> a(b.i.b.a.c.l.w paramw)
    {
      b.f.b.j.b(paramw, "type");
      Object localObject = (Iterable)paramw.a();
      paramw = (Collection)new ArrayList(b.a.j.a((Iterable)localObject));
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        ap localap = (ap)((Iterator)localObject).next();
        paramw.add(this.a.a(localap));
      }
      return (List)paramw;
    }
  }
  
  static final class c
    extends k
    implements b.f.a.m<String, String, String>
  {
    public static final c a = new c();
    
    c()
    {
      super();
    }
    
    public static String a(String paramString1, String paramString2)
    {
      b.f.b.j.b(paramString1, "receiver$0");
      b.f.b.j.b(paramString2, "newArgs");
      if (!l.b((CharSequence)paramString1, '<')) {
        return paramString1;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(l.c(paramString1, paramString1));
      localStringBuilder.append('<');
      localStringBuilder.append(paramString2);
      localStringBuilder.append('>');
      localStringBuilder.append(l.a(paramString1, '>'));
      return localStringBuilder.toString();
    }
  }
  
  static final class d
    extends k
    implements b<String, String>
  {
    public static final d a = new d();
    
    d()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
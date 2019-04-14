package b.i.b.a.c.l.a;

import b.f.b.j;
import b.f.b.k;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ao;
import b.i.b.a.c.l.ao.a;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.as;
import b.i.b.a.c.l.au;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.d.a;
import b.i.b.a.c.l.w;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;

public final class t
{
  private static final w a(w paramw)
  {
    return (w)b.i.b.a.c.l.d.b.a(paramw).b;
  }
  
  public static final w a(w paramw1, w paramw2, r paramr)
  {
    j.b(paramw1, "subtype");
    j.b(paramw2, "supertype");
    j.b(paramr, "typeCheckingProcedureCallbacks");
    Object localObject1 = new ArrayDeque();
    ((ArrayDeque)localObject1).add(new n(paramw1, null));
    an localan = paramw2.f();
    while (!((ArrayDeque)localObject1).isEmpty())
    {
      paramw2 = (n)((ArrayDeque)localObject1).poll();
      paramw1 = paramw2.a;
      Object localObject2 = paramw1.f();
      if (paramr.a((an)localObject2, localan))
      {
        boolean bool = paramw1.c();
        for (;;)
        {
          paramw2 = paramw2.b;
          if (paramw2 == null) {
            break;
          }
          localObject1 = paramw2.a;
          localObject2 = (Iterable)((w)localObject1).a();
          if ((!(localObject2 instanceof Collection)) || (!((Collection)localObject2).isEmpty()))
          {
            localObject2 = ((Iterable)localObject2).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              if (((ap)((Iterator)localObject2).next()).b() != ba.a) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0)
              {
                i = 1;
                break label199;
              }
            }
          }
          int i = 0;
          label199:
          if (i != 0)
          {
            localObject2 = ao.b;
            paramw1 = b.i.b.a.c.i.a.a.c.a(ao.a.a((w)localObject1)).d().a(paramw1, ba.a);
            j.a(paramw1, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
            paramw1 = a(paramw1);
          }
          else
          {
            localObject2 = ao.b;
            paramw1 = ao.a.a((w)localObject1).d().a(paramw1, ba.a);
            j.a(paramw1, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
          }
          if ((!bool) && (!((w)localObject1).c())) {
            bool = false;
          } else {
            bool = true;
          }
        }
        paramw2 = paramw1.f();
        if (paramr.a(paramw2, localan)) {
          return av.a(paramw1, bool);
        }
        paramw1 = new StringBuilder("Type constructors should be equals!\nsubstitutedSuperType: ");
        paramw1.append(a(paramw2));
        paramw1.append(", \n\nsupertype: ");
        paramw1.append(a(localan));
        paramw1.append(" \n");
        paramw1.append(paramr.a(paramw2, localan));
        throw ((Throwable)new AssertionError(paramw1.toString()));
      }
      paramw1 = ((an)localObject2).i_().iterator();
      while (paramw1.hasNext())
      {
        localObject2 = (w)paramw1.next();
        j.a(localObject2, "immediateSupertype");
        ((ArrayDeque)localObject1).add(new n((w)localObject2, paramw2));
      }
    }
    return null;
  }
  
  private static final String a(an paraman)
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    a locala = new a(localStringBuilder1);
    locala.a("type: ".concat(String.valueOf(paraman)));
    StringBuilder localStringBuilder2 = new StringBuilder("hashCode: ");
    localStringBuilder2.append(paraman.hashCode());
    locala.a(localStringBuilder2.toString());
    localStringBuilder2 = new StringBuilder("javaClass: ");
    localStringBuilder2.append(paraman.getClass().getCanonicalName());
    locala.a(localStringBuilder2.toString());
    for (paraman = (b.i.b.a.c.b.l)paraman.c(); paraman != null; paraman = paraman.a())
    {
      localStringBuilder2 = new StringBuilder("fqName: ");
      localStringBuilder2.append(b.i.b.a.c.h.c.f.a(paraman));
      locala.a(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder("javaClass: ");
      localStringBuilder2.append(paraman.getClass().getCanonicalName());
      locala.a(localStringBuilder2.toString());
    }
    paraman = localStringBuilder1.toString();
    j.a(paraman, "StringBuilder().apply(builderAction).toString()");
    return paraman;
  }
  
  static final class a
    extends k
    implements b.f.a.b<String, StringBuilder>
  {
    a(StringBuilder paramStringBuilder)
    {
      super();
    }
    
    public final StringBuilder a(String paramString)
    {
      j.b(paramString, "receiver$0");
      StringBuilder localStringBuilder = this.a;
      localStringBuilder.append(paramString);
      j.a(localStringBuilder, "append(value)");
      return b.k.l.a(localStringBuilder);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/a/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
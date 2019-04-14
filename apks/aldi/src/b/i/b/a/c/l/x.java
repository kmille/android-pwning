package b.i.b.a.c.l;

import b.f.b.j;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.aq;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.e;
import java.util.List;

public final class x
{
  public static final x a = new x();
  
  public static final ad a(g paramg, e parame, List<? extends ap> paramList)
  {
    j.b(paramg, "annotations");
    j.b(parame, "descriptor");
    j.b(paramList, "arguments");
    parame = parame.c();
    j.a(parame, "descriptor.typeConstructor");
    return a(paramg, parame, paramList, false);
  }
  
  public static final ad a(g paramg, an paraman, List<? extends ap> paramList, boolean paramBoolean)
  {
    j.b(paramg, "annotations");
    j.b(paraman, "constructor");
    j.b(paramList, "arguments");
    if ((paramg.a()) && (paramList.isEmpty()) && (!paramBoolean) && (paraman.c() != null))
    {
      paramg = paraman.c();
      if (paramg == null) {
        j.a();
      }
      j.a(paramg, "constructor.declarationDescriptor!!");
      paramg = paramg.h();
      j.a(paramg, "constructor.declarationDescriptor!!.defaultType");
      return paramg;
    }
    Object localObject1 = paraman.c();
    if ((localObject1 instanceof ar)) {}
    for (localObject1 = ((b.i.b.a.c.b.h)localObject1).h();; localObject1 = ((e)localObject1).h())
    {
      localObject1 = ((ad)localObject1).b();
      break label244;
      if (!(localObject1 instanceof e)) {
        break label191;
      }
      if (!paramList.isEmpty()) {
        break;
      }
    }
    localObject1 = (e)localObject1;
    Object localObject2 = ao.b;
    localObject1 = ((e)localObject1).a(ao.a.a(paraman, paramList));
    for (localObject2 = "descriptor.getMemberScop…(constructor, arguments))";; localObject2 = "ErrorUtils.createErrorSc…{descriptor.name}\", true)")
    {
      j.a(localObject1, (String)localObject2);
      break;
      label191:
      if (!(localObject1 instanceof aq)) {
        break label254;
      }
      localObject2 = new StringBuilder("Scope for abbreviation: ");
      ((StringBuilder)localObject2).append(((aq)localObject1).i());
      localObject1 = p.a(((StringBuilder)localObject2).toString(), true);
    }
    label244:
    return a(paramg, paraman, paramList, paramBoolean, (b.i.b.a.c.i.e.h)localObject1);
    label254:
    paramg = new StringBuilder("Unsupported classifier: ");
    paramg.append(localObject1);
    paramg.append(" for constructor: ");
    paramg.append(paraman);
    throw ((Throwable)new IllegalStateException(paramg.toString()));
  }
  
  public static final ad a(g paramg, an paraman, List<? extends ap> paramList, boolean paramBoolean, b.i.b.a.c.i.e.h paramh)
  {
    j.b(paramg, "annotations");
    j.b(paraman, "constructor");
    j.b(paramList, "arguments");
    j.b(paramh, "memberScope");
    paraman = new ae(paraman, paramList, paramBoolean, paramh);
    if (paramg.a()) {
      return (ad)paraman;
    }
    return (ad)new d((ad)paraman, paramg);
  }
  
  public static final az a(ad paramad1, ad paramad2)
  {
    j.b(paramad1, "lowerBound");
    j.b(paramad2, "upperBound");
    if (j.a(paramad1, paramad2)) {
      return (az)paramad1;
    }
    return (az)new r(paramad1, paramad2);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
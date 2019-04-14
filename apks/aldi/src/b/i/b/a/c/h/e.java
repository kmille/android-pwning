package b.i.b.a.c.h;

import b.i.b.a.c.a.g.b;
import b.i.b.a.c.b.aa.b;
import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.af;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.aq;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.as;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.aw;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.t;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.bb;
import b.i.b.a.c.l.p.d;
import b.r;
import b.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class e
  extends c
  implements i
{
  final j l;
  private final b.d m;
  private final b.d n;
  
  public e(j paramj)
  {
    this.l = paramj;
    boolean bool = this.l.b;
    if ((b.w.a) && (!bool)) {
      throw ((Throwable)new AssertionError("Assertion failed"));
    }
    this.m = b.e.a((b.f.a.a)new c(this));
    this.n = b.e.a((b.f.a.a)new d(this));
  }
  
  private String a(b.i.b.a.c.b.h paramh)
  {
    b.f.b.j.b(paramh, "klass");
    if (b.i.b.a.c.l.p.a((b.i.b.a.c.b.l)paramh)) {
      return paramh.c().toString();
    }
    return this.l.f().a(paramh, (c)this);
  }
  
  private final String a(b.i.b.a.c.i.b.f<?> paramf)
  {
    if ((paramf instanceof b.i.b.a.c.i.b.b)) {
      return b.a.j.a((Iterable)((b.i.b.a.c.i.b.b)paramf).a(), (CharSequence)", ", (CharSequence)"{", (CharSequence)"}", 0, null, (b.f.a.b)new e(this), 24);
    }
    if ((paramf instanceof b.i.b.a.c.i.b.a)) {
      return b.k.l.a(a((b.i.b.a.c.b.a.c)((b.i.b.a.c.i.b.a)paramf).a(), null), (CharSequence)"@");
    }
    if ((paramf instanceof b.i.b.a.c.i.b.o))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a(((b.i.b.a.c.i.b.o)paramf).b()));
      localStringBuilder.append("::class");
      return localStringBuilder.toString();
    }
    return paramf.toString();
  }
  
  private String a(an paraman)
  {
    b.f.b.j.b(paraman, "typeConstructor");
    b.i.b.a.c.b.h localh = paraman.c();
    if ((!(localh instanceof ar)) && (!(localh instanceof b.i.b.a.c.b.e)) && (!(localh instanceof aq)))
    {
      if (localh == null) {
        return paraman.toString();
      }
      paraman = new StringBuilder("Unexpected classifier: ");
      paraman.append(localh.getClass());
      throw ((Throwable)new IllegalStateException(paraman.toString().toString()));
    }
    return a(localh);
  }
  
  private final String a(String paramString)
  {
    p localp = this.l.r();
    Object localObject = paramString;
    switch (g.a[localp.ordinal()])
    {
    default: 
      throw new b.k();
    case 2: 
      if (this.l.z()) {
        return paramString;
      }
      localObject = new StringBuilder("<b>");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append("</b>");
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  private static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    if ((b.k.l.a(paramString1, paramString2)) && (b.k.l.a(paramString3, paramString4)))
    {
      int i = paramString2.length();
      if (paramString1 != null)
      {
        paramString1 = paramString1.substring(i);
        b.f.b.j.a(paramString1, "(this as java.lang.String).substring(startIndex)");
        i = paramString4.length();
        if (paramString3 != null)
        {
          paramString2 = paramString3.substring(i);
          b.f.b.j.a(paramString2, "(this as java.lang.String).substring(startIndex)");
          paramString3 = new StringBuilder();
          paramString3.append(paramString5);
          paramString3.append(paramString1);
          paramString3 = paramString3.toString();
          if (b.f.b.j.a(paramString1, paramString2)) {
            return paramString3;
          }
          if (a(paramString1, paramString2))
          {
            paramString1 = new StringBuilder();
            paramString1.append(paramString3);
            paramString1.append("!");
            return paramString1.toString();
          }
        }
        else
        {
          throw new r("null cannot be cast to non-null type java.lang.String");
        }
      }
      else
      {
        throw new r("null cannot be cast to non-null type java.lang.String");
      }
    }
    return null;
  }
  
  private String a(List<? extends ap> paramList)
  {
    b.f.b.j.b(paramList, "typeArguments");
    if (paramList.isEmpty()) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(c("<"));
    a(localStringBuilder, paramList);
    localStringBuilder.append(c(">"));
    paramList = localStringBuilder.toString();
    b.f.b.j.a(paramList, "StringBuilder().apply(builderAction).toString()");
    return paramList;
  }
  
  private final List<String> a(b.i.b.a.c.b.a.c paramc)
  {
    Object localObject3 = paramc.c();
    boolean bool = ((Boolean)this.l.o.b(j.a[28])).booleanValue();
    Object localObject2 = null;
    if (bool) {
      localObject1 = b.i.b.a.c.i.c.a.a(paramc);
    } else {
      localObject1 = null;
    }
    paramc = (b.i.b.a.c.b.a.c)localObject2;
    if (localObject1 != null)
    {
      localObject1 = ((b.i.b.a.c.b.e)localObject1).e_();
      paramc = (b.i.b.a.c.b.a.c)localObject2;
      if (localObject1 != null)
      {
        localObject1 = ((b.i.b.a.c.b.d)localObject1).k();
        paramc = (b.i.b.a.c.b.a.c)localObject2;
        if (localObject1 != null)
        {
          localObject1 = (Iterable)localObject1;
          paramc = (Collection)new ArrayList();
          localObject1 = ((Iterable)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = ((Iterator)localObject1).next();
            if (((au)localObject2).h()) {
              paramc.add(localObject2);
            }
          }
          localObject1 = (Iterable)paramc;
          paramc = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
          localObject1 = ((Iterable)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (au)((Iterator)localObject1).next();
            b.f.b.j.a(localObject2, "it");
            paramc.add(((au)localObject2).i());
          }
          paramc = (List)paramc;
        }
      }
    }
    Object localObject1 = paramc;
    if (paramc == null) {
      localObject1 = (List)b.a.v.a;
    }
    localObject2 = (Iterable)localObject1;
    paramc = (Collection)new ArrayList();
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject4 = ((Iterator)localObject2).next();
      if ((true ^ ((Map)localObject3).containsKey((b.i.b.a.c.f.f)localObject4))) {
        paramc.add(localObject4);
      }
    }
    localObject2 = (Iterable)paramc;
    paramc = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    Object localObject5;
    while (((Iterator)localObject2).hasNext())
    {
      localObject4 = (b.i.b.a.c.f.f)((Iterator)localObject2).next();
      localObject5 = new StringBuilder();
      ((StringBuilder)localObject5).append(((b.i.b.a.c.f.f)localObject4).a);
      ((StringBuilder)localObject5).append(" = ...");
      paramc.add(((StringBuilder)localObject5).toString());
    }
    localObject2 = (List)paramc;
    paramc = (Iterable)((Map)localObject3).entrySet();
    localObject3 = (Collection)new ArrayList(b.a.j.a(paramc));
    Object localObject4 = paramc.iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject5 = (Map.Entry)((Iterator)localObject4).next();
      paramc = (b.i.b.a.c.f.f)((Map.Entry)localObject5).getKey();
      b.i.b.a.c.i.b.f localf = (b.i.b.a.c.i.b.f)((Map.Entry)localObject5).getValue();
      localObject5 = new StringBuilder();
      ((StringBuilder)localObject5).append(paramc.a);
      ((StringBuilder)localObject5).append(" = ");
      if (!((List)localObject1).contains(paramc)) {
        paramc = a(localf);
      } else {
        paramc = "...";
      }
      ((StringBuilder)localObject5).append(paramc);
      ((Collection)localObject3).add(((StringBuilder)localObject5).toString());
    }
    paramc = (List)localObject3;
    paramc = (Iterable)b.a.j.b((Collection)localObject2, (Iterable)paramc);
    b.f.b.j.b(paramc, "receiver$0");
    localObject1 = (Collection)paramc;
    if (((Collection)localObject1).size() <= 1) {
      return b.a.j.i(paramc);
    }
    paramc = ((Collection)localObject1).toArray(new Comparable[0]);
    if (paramc != null)
    {
      if (paramc != null)
      {
        paramc = (Comparable[])paramc;
        if (paramc != null)
        {
          paramc = (Object[])paramc;
          b.f.b.j.b(paramc, "receiver$0");
          if (paramc.length > 1) {
            Arrays.sort(paramc);
          }
          return b.a.e.a(paramc);
        }
        throw new r("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
      }
      throw new r("null cannot be cast to non-null type kotlin.Array<T>");
    }
    throw new r("null cannot be cast to non-null type kotlin.Array<T>");
  }
  
  private final void a(b.i.b.a.c.b.a parama, StringBuilder paramStringBuilder)
  {
    if (!((Boolean)this.l.m.b(j.a[25])).booleanValue()) {
      return;
    }
    parama = parama.d();
    if (parama != null)
    {
      paramStringBuilder.append(" on ");
      parama = parama.y();
      b.f.b.j.a(parama, "receiver.type");
      paramStringBuilder.append(a(parama));
    }
  }
  
  private final void a(ar paramar, StringBuilder paramStringBuilder, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramStringBuilder.append(c("<"));
    }
    if (this.l.j())
    {
      paramStringBuilder.append("/*");
      paramStringBuilder.append(paramar.g());
      paramStringBuilder.append("*/ ");
    }
    a(paramStringBuilder, paramar.l(), "reified");
    Object localObject = paramar.k().d;
    int j = ((CharSequence)localObject).length();
    int i = 1;
    boolean bool;
    if (j > 0) {
      bool = true;
    } else {
      bool = false;
    }
    a(paramStringBuilder, bool, (String)localObject);
    a(paramStringBuilder, (b.i.b.a.c.b.a.a)paramar, null);
    a((b.i.b.a.c.b.l)paramar, paramStringBuilder, paramBoolean);
    j = paramar.j().size();
    if (((j > 1) && (!paramBoolean)) || (j == 1))
    {
      paramar = (b.i.b.a.c.l.w)paramar.j().iterator().next();
      if (!b.i.b.a.c.a.g.r(paramar))
      {
        paramStringBuilder.append(" : ");
        b.f.b.j.a(paramar, "upperBound");
        paramStringBuilder.append(a(paramar));
      }
    }
    else if (paramBoolean)
    {
      localObject = paramar.j().iterator();
      while (((Iterator)localObject).hasNext())
      {
        b.i.b.a.c.l.w localw = (b.i.b.a.c.l.w)((Iterator)localObject).next();
        if (!b.i.b.a.c.a.g.r(localw))
        {
          if (i != 0) {}
          for (paramar = " : ";; paramar = " & ")
          {
            paramStringBuilder.append(paramar);
            break;
          }
          b.f.b.j.a(localw, "upperBound");
          paramStringBuilder.append(a(localw));
          i = 0;
        }
      }
    }
    if (paramBoolean) {
      paramStringBuilder.append(c(">"));
    }
  }
  
  private final void a(au paramau, boolean paramBoolean1, StringBuilder paramStringBuilder, boolean paramBoolean2)
  {
    if (paramBoolean2)
    {
      paramStringBuilder.append(a("value-parameter"));
      paramStringBuilder.append(" ");
    }
    if (this.l.j())
    {
      paramStringBuilder.append("/*");
      paramStringBuilder.append(paramau.c());
      paramStringBuilder.append("*/ ");
    }
    a(paramStringBuilder, (b.i.b.a.c.b.a.a)paramau, null);
    a(paramStringBuilder, paramau.p(), "crossinline");
    a(paramStringBuilder, paramau.q(), "noinline");
    a((aw)paramau, paramBoolean1, paramStringBuilder, paramBoolean2);
    if (this.l.n() != null)
    {
      if (this.l.b()) {
        paramBoolean1 = paramau.h();
      } else {
        paramBoolean1 = b.i.b.a.c.i.c.a.a(paramau);
      }
      if (paramBoolean1)
      {
        i = 1;
        break label160;
      }
    }
    int i = 0;
    label160:
    if (i != 0)
    {
      StringBuilder localStringBuilder = new StringBuilder(" = ");
      b.f.a.b localb = this.l.n();
      if (localb == null) {
        b.f.b.j.a();
      }
      localStringBuilder.append((String)localb.a(paramau));
      paramStringBuilder.append(localStringBuilder.toString());
    }
  }
  
  private final void a(aw paramaw, StringBuilder paramStringBuilder)
  {
    if (!(paramaw instanceof au))
    {
      if (paramaw.z()) {
        paramaw = "var";
      } else {
        paramaw = "val";
      }
      paramStringBuilder.append(a(paramaw));
      paramStringBuilder.append(" ");
    }
  }
  
  private final void a(aw paramaw, boolean paramBoolean1, StringBuilder paramStringBuilder, boolean paramBoolean2)
  {
    b.i.b.a.c.l.w localw = paramaw.y();
    b.f.b.j.a(localw, "variable.type");
    if (!(paramaw instanceof au)) {
      localObject1 = null;
    } else {
      localObject1 = paramaw;
    }
    Object localObject1 = (au)localObject1;
    if (localObject1 != null) {
      localObject1 = ((au)localObject1).m_();
    } else {
      localObject1 = null;
    }
    Object localObject2;
    if (localObject1 == null) {
      localObject2 = localw;
    } else {
      localObject2 = localObject1;
    }
    boolean bool;
    if (localObject1 != null) {
      bool = true;
    } else {
      bool = false;
    }
    a(paramStringBuilder, bool, "vararg");
    if ((paramBoolean2) && (!this.l.h())) {
      a(paramaw, paramStringBuilder);
    }
    if (paramBoolean1)
    {
      a((b.i.b.a.c.b.l)paramaw, paramStringBuilder, paramBoolean2);
      paramStringBuilder.append(": ");
    }
    paramStringBuilder.append(a((b.i.b.a.c.l.w)localObject2));
    b(paramaw, paramStringBuilder);
    if ((this.l.j()) && (localObject1 != null))
    {
      paramStringBuilder.append(" /*");
      paramStringBuilder.append(a(localw));
      paramStringBuilder.append("*/");
    }
  }
  
  private final void a(b.i.b.a.c.b.az paramaz, StringBuilder paramStringBuilder)
  {
    if (!this.l.g().contains(h.a)) {
      return;
    }
    b.i.b.a.c.b.az localaz = paramaz;
    if (((Boolean)this.l.h.b(j.a[12])).booleanValue()) {
      localaz = paramaz.b();
    }
    if ((!((Boolean)this.l.i.b(j.a[13])).booleanValue()) && (b.f.b.j.a(localaz, b.i.b.a.c.b.ay.k))) {
      return;
    }
    paramStringBuilder.append(a(localaz.a()));
    paramStringBuilder.append(" ");
  }
  
  private final void a(b.i.b.a.c.b.b paramb, StringBuilder paramStringBuilder)
  {
    if ((!b.i.b.a.c.i.d.e((b.i.b.a.c.b.l)paramb)) || (paramb.d_() != b.i.b.a.c.b.w.a))
    {
      if ((this.l.p() == m.a) && (paramb.d_() == b.i.b.a.c.b.w.c) && (a(paramb))) {
        return;
      }
      paramb = paramb.d_();
      b.f.b.j.a(paramb, "callable.modality");
      a(paramb, paramStringBuilder);
    }
  }
  
  private final void a(b.i.b.a.c.b.i parami, StringBuilder paramStringBuilder)
  {
    List localList = parami.u();
    b.f.b.j.a(localList, "classifier.declaredTypeParameters");
    Object localObject = parami.c();
    b.f.b.j.a(localObject, "classifier.typeConstructor");
    localObject = ((an)localObject).b();
    b.f.b.j.a(localObject, "classifier.typeConstructor.parameters");
    if ((this.l.j()) && (parami.l()) && (((List)localObject).size() > localList.size()))
    {
      paramStringBuilder.append(" /*captured type parameters: ");
      b(paramStringBuilder, ((List)localObject).subList(localList.size(), ((List)localObject).size()));
      paramStringBuilder.append("*/");
    }
  }
  
  private final void a(b.i.b.a.c.b.l paraml, StringBuilder paramStringBuilder, boolean paramBoolean)
  {
    paraml = paraml.i();
    b.f.b.j.a(paraml, "descriptor.name");
    paramStringBuilder.append(a(paraml, paramBoolean));
  }
  
  private final void a(t paramt, StringBuilder paramStringBuilder)
  {
    a(paramStringBuilder, paramt.C(), "suspend");
  }
  
  private final void a(b.i.b.a.c.b.v paramv, StringBuilder paramStringBuilder)
  {
    a(paramStringBuilder, paramv.q(), "external");
    boolean bool1 = this.l.g().contains(h.i);
    boolean bool2 = true;
    if ((bool1) && (paramv.o())) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    a(paramStringBuilder, bool1, "expect");
    if ((this.l.g().contains(h.j)) && (paramv.p())) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    a(paramStringBuilder, bool1, "actual");
  }
  
  private final void a(b.i.b.a.c.b.w paramw, StringBuilder paramStringBuilder)
  {
    boolean bool = this.l.g().contains(h.b);
    paramw = paramw.name();
    if (paramw != null)
    {
      paramw = paramw.toLowerCase();
      b.f.b.j.a(paramw, "(this as java.lang.String).toLowerCase()");
      a(paramStringBuilder, bool, paramw);
      return;
    }
    throw new r("null cannot be cast to non-null type java.lang.String");
  }
  
  private final void a(b.i.b.a.c.f.b paramb, String paramString, StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(a(paramString));
    paramb = paramb.b;
    b.f.b.j.a(paramb, "fqName.toUnsafe()");
    paramb = a(paramb);
    int i;
    if (((CharSequence)paramb).length() > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      paramStringBuilder.append(" ");
      paramStringBuilder.append(paramb);
    }
  }
  
  private static void a(StringBuilder paramStringBuilder)
  {
    int i = paramStringBuilder.length();
    if ((i == 0) || (paramStringBuilder.charAt(i - 1) != ' ')) {
      paramStringBuilder.append(' ');
    }
  }
  
  private final void a(StringBuilder paramStringBuilder, b.i.b.a.c.b.a.a parama, b.i.b.a.c.b.a.e parame)
  {
    if (!this.l.g().contains(h.d)) {
      return;
    }
    Set localSet;
    if ((parama instanceof b.i.b.a.c.l.w)) {
      localSet = this.l.d();
    } else {
      localSet = (Set)this.l.q.b(j.a[30]);
    }
    b.f.a.b localb = (b.f.a.b)this.l.r.b(j.a[32]);
    parama = parama.r().iterator();
    while (parama.hasNext())
    {
      b.i.b.a.c.b.a.c localc = (b.i.b.a.c.b.a.c)parama.next();
      if ((!b.a.j.a((Iterable)localSet, localc.b())) && ((localb == null) || (((Boolean)localb.a(localc)).booleanValue())))
      {
        paramStringBuilder.append(a(localc, parame));
        if (((Boolean)this.l.p.b(j.a[29])).booleanValue()) {
          b.k.l.a(paramStringBuilder);
        } else {
          paramStringBuilder.append(" ");
        }
      }
    }
  }
  
  private final void a(StringBuilder paramStringBuilder, af paramaf)
  {
    Object localObject = paramaf.c;
    if (localObject != null)
    {
      a(paramStringBuilder, (af)localObject);
      paramStringBuilder.append('.');
      localObject = paramaf.a.i();
      b.f.b.j.a(localObject, "possiblyInnerType.classifierDescriptor.name");
      paramStringBuilder.append(a((b.i.b.a.c.f.f)localObject, false));
      if (paramStringBuilder != null) {}
    }
    else
    {
      localObject = paramaf.a.c();
      b.f.b.j.a(localObject, "possiblyInnerType.classi…escriptor.typeConstructor");
      paramStringBuilder.append(a((an)localObject));
    }
    paramStringBuilder.append(a(paramaf.b));
  }
  
  private final void a(StringBuilder paramStringBuilder, b.i.b.a.c.l.a parama)
  {
    if (this.l.r() == p.b) {
      paramStringBuilder.append("<font color=\"808080\"><i>");
    }
    paramStringBuilder.append(" /* = ");
    b(paramStringBuilder, (b.i.b.a.c.l.w)parama.a);
    paramStringBuilder.append(" */");
    if (this.l.r() == p.b) {
      paramStringBuilder.append("</i></font>");
    }
  }
  
  private final void a(StringBuilder paramStringBuilder, b.i.b.a.c.l.ad paramad)
  {
    b.i.b.a.c.l.w localw;
    if (!b.f.b.j.a(paramad, av.b))
    {
      localw = (b.i.b.a.c.l.w)paramad;
      if (!av.b(localw))
      {
        if (!b.i.b.a.c.l.p.a(localw)) {
          break label114;
        }
        if (this.l.k())
        {
          paramad = paramad.f();
          if (paramad != null)
          {
            paramad = ((p.d)paramad).a;
            b.f.b.j.a(paramad, "(type.constructor as Uni…).typeParameterDescriptor");
            paramad = paramad.i().toString();
            b.f.b.j.a(paramad, "(type.constructor as Uni…escriptor.name.toString()");
          }
        }
      }
    }
    for (paramad = b(paramad);; paramad = "???")
    {
      paramStringBuilder.append(paramad);
      return;
      throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.types.ErrorUtils.UninferredParameterTypeConstructor");
    }
    label114:
    if (b.i.b.a.c.l.y.b(localw))
    {
      c(paramStringBuilder, localw);
      return;
    }
    if (b(localw))
    {
      d(paramStringBuilder, localw);
      return;
    }
    c(paramStringBuilder, localw);
  }
  
  private final void a(StringBuilder paramStringBuilder, b.i.b.a.c.l.w paramw)
  {
    b.i.b.a.c.l.az localaz = paramw.i();
    Object localObject = localaz;
    if (!(localaz instanceof b.i.b.a.c.l.a)) {
      localObject = null;
    }
    localObject = (b.i.b.a.c.l.a)localObject;
    if (localObject != null)
    {
      b(paramStringBuilder, (b.i.b.a.c.l.w)((b.i.b.a.c.l.a)localObject).b);
      if (this.l.v()) {
        a(paramStringBuilder, (b.i.b.a.c.l.a)localObject);
      }
      return;
    }
    b(paramStringBuilder, paramw);
  }
  
  private final void a(StringBuilder paramStringBuilder, b.i.b.a.c.l.w paramw, an paraman)
  {
    b.f.b.j.b(paramw, "receiver$0");
    b.i.b.a.c.b.h localh = paramw.f().c();
    Object localObject = localh;
    if (!(localh instanceof b.i.b.a.c.b.i)) {
      localObject = null;
    }
    localObject = as.a(paramw, (b.i.b.a.c.b.i)localObject, 0);
    if (localObject == null)
    {
      paramStringBuilder.append(a(paraman));
      paramStringBuilder.append(a(paramw.a()));
      return;
    }
    a(paramStringBuilder, (af)localObject);
  }
  
  private final void a(StringBuilder paramStringBuilder, List<? extends ap> paramList)
  {
    b.a.j.a((Iterable)paramList, (Appendable)paramStringBuilder, (CharSequence)", ", null, null, 0, null, (b.f.a.b)new b(this), 60);
  }
  
  private final void a(StringBuilder paramStringBuilder, boolean paramBoolean, String paramString)
  {
    if (paramBoolean)
    {
      paramStringBuilder.append(a(paramString));
      paramStringBuilder.append(" ");
    }
  }
  
  private final void a(Collection<? extends au> paramCollection, boolean paramBoolean, StringBuilder paramStringBuilder)
  {
    Object localObject = (n)this.l.l.b(j.a[24]);
    switch (g.e[localObject.ordinal()])
    {
    default: 
      throw new b.k();
    case 3: 
    case 2: 
      do
      {
        paramBoolean = false;
        break;
      } while (paramBoolean);
    }
    paramBoolean = true;
    int j = paramCollection.size();
    this.l.q().a(paramStringBuilder);
    paramCollection = ((Iterable)paramCollection).iterator();
    int i = 0;
    while (paramCollection.hasNext())
    {
      localObject = (au)paramCollection.next();
      this.l.q().a((au)localObject, paramStringBuilder);
      a((au)localObject, paramBoolean, paramStringBuilder, false);
      this.l.q().a((au)localObject, i, j, paramStringBuilder);
      i += 1;
    }
    this.l.q().b(paramStringBuilder);
  }
  
  private final void a(List<? extends ar> paramList, StringBuilder paramStringBuilder)
  {
    if (this.l.m()) {
      return;
    }
    ArrayList localArrayList = new ArrayList(0);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      ar localar = (ar)paramList.next();
      Object localObject1 = localar.j();
      b.f.b.j.a(localObject1, "typeParameter.upperBounds");
      localObject1 = ((Iterable)b.a.j.g((Iterable)localObject1)).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = ((Iterator)localObject1).next();
        Collection localCollection = (Collection)localArrayList;
        localObject2 = (b.i.b.a.c.l.w)localObject2;
        StringBuilder localStringBuilder = new StringBuilder();
        b.i.b.a.c.f.f localf = localar.i();
        b.f.b.j.a(localf, "typeParameter.name");
        localStringBuilder.append(a(localf, false));
        localStringBuilder.append(" : ");
        b.f.b.j.a(localObject2, "it");
        localStringBuilder.append(a((b.i.b.a.c.l.w)localObject2));
        localCollection.add(localStringBuilder.toString());
      }
    }
    if (!localArrayList.isEmpty())
    {
      paramStringBuilder.append(" ");
      paramStringBuilder.append(a("where"));
      paramStringBuilder.append(" ");
      b.a.j.a((Iterable)localArrayList, (Appendable)paramStringBuilder, (CharSequence)", ", null, null, 0, null, null, 124);
    }
  }
  
  private final void a(List<? extends ar> paramList, StringBuilder paramStringBuilder, boolean paramBoolean)
  {
    if (this.l.m()) {
      return;
    }
    if (!paramList.isEmpty())
    {
      paramStringBuilder.append(c("<"));
      b(paramStringBuilder, paramList);
      paramStringBuilder.append(c(">"));
      if (paramBoolean) {
        paramStringBuilder.append(" ");
      }
    }
  }
  
  private static boolean a(b.i.b.a.c.b.b paramb)
  {
    return !paramb.m().isEmpty();
  }
  
  private static boolean a(String paramString1, String paramString2)
  {
    if (!b.f.b.j.a(paramString1, b.k.l.a(paramString2, "?", "")))
    {
      StringBuilder localStringBuilder;
      if (b.k.l.b(paramString2, "?"))
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append(paramString1);
        localStringBuilder.append('?');
        if (b.f.b.j.a(localStringBuilder.toString(), paramString2)) {}
      }
      else
      {
        localStringBuilder = new StringBuilder("(");
        localStringBuilder.append(paramString1);
        localStringBuilder.append(")?");
        if (!b.f.b.j.a(localStringBuilder.toString(), paramString2)) {
          return false;
        }
      }
    }
    return true;
  }
  
  private final String b(String paramString)
  {
    p localp = this.l.r();
    Object localObject = paramString;
    switch (g.b[localp.ordinal()])
    {
    default: 
      throw new b.k();
    case 2: 
      localObject = new StringBuilder("<font color=red><b>");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append("</b></font>");
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  private final void b(b.i.b.a.c.b.a parama, StringBuilder paramStringBuilder)
  {
    parama = parama.d();
    if (parama != null)
    {
      a(paramStringBuilder, (b.i.b.a.c.b.a.a)parama, b.i.b.a.c.b.a.e.f);
      b.i.b.a.c.l.w localw = parama.y();
      b.f.b.j.a(localw, "receiver.type");
      String str = a(localw);
      parama = str;
      if (b(localw))
      {
        parama = str;
        if (!av.e(localw))
        {
          parama = new StringBuilder("(");
          parama.append(str);
          parama.append(')');
          parama = parama.toString();
        }
      }
      paramStringBuilder.append(parama);
      paramStringBuilder.append(".");
    }
  }
  
  private final void b(aw paramaw, StringBuilder paramStringBuilder)
  {
    if (this.l.l())
    {
      paramaw = paramaw.A();
      if (paramaw != null)
      {
        paramStringBuilder.append(" = ");
        b.f.b.j.a(paramaw, "constant");
        paramStringBuilder.append(c(a(paramaw)));
      }
    }
  }
  
  private final void b(b.i.b.a.c.b.b paramb, StringBuilder paramStringBuilder)
  {
    if (!this.l.g().contains(h.c)) {
      return;
    }
    if ((a(paramb)) && (this.l.p() != m.b))
    {
      a(paramStringBuilder, true, "override");
      if (this.l.j())
      {
        paramStringBuilder.append("/*");
        paramStringBuilder.append(paramb.m().size());
        paramStringBuilder.append("*/ ");
      }
    }
  }
  
  private final void b(StringBuilder paramStringBuilder, b.i.b.a.c.l.w paramw)
  {
    if (((paramw instanceof bb)) && (this.l.b()) && (!((bb)paramw).e())) {}
    for (paramw = "<Not computed yet>";; paramw = ((b.i.b.a.c.l.q)paramw).a((c)this, (i)this))
    {
      paramStringBuilder.append(paramw);
      return;
      paramw = paramw.i();
      if (!(paramw instanceof b.i.b.a.c.l.q)) {
        break;
      }
    }
    if ((paramw instanceof b.i.b.a.c.l.ad)) {
      a(paramStringBuilder, (b.i.b.a.c.l.ad)paramw);
    }
  }
  
  private final void b(StringBuilder paramStringBuilder, List<? extends ar> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      a((ar)paramList.next(), paramStringBuilder, false);
      if (paramList.hasNext()) {
        paramStringBuilder.append(", ");
      }
    }
  }
  
  private static boolean b(b.i.b.a.c.l.w paramw)
  {
    if (b.i.b.a.c.a.f.c(paramw))
    {
      paramw = (Iterable)paramw.a();
      if ((!(paramw instanceof Collection)) || (!((Collection)paramw).isEmpty()))
      {
        paramw = paramw.iterator();
        while (paramw.hasNext()) {
          if (((ap)paramw.next()).a())
          {
            i = 0;
            break label74;
          }
        }
      }
      int i = 1;
      label74:
      if (i != 0) {
        return true;
      }
    }
    return false;
  }
  
  private final String c(String paramString)
  {
    return this.l.r().a(paramString);
  }
  
  private final void c(b.i.b.a.c.b.b paramb, StringBuilder paramStringBuilder)
  {
    if (!this.l.g().contains(h.f)) {
      return;
    }
    if ((this.l.j()) && (paramb.t() != b.a.a))
    {
      paramStringBuilder.append("/*");
      paramb = paramb.t().name();
      if (paramb != null)
      {
        paramb = paramb.toLowerCase();
        b.f.b.j.a(paramb, "(this as java.lang.String).toLowerCase()");
        paramStringBuilder.append(paramb);
        paramStringBuilder.append("*/ ");
        return;
      }
      throw new r("null cannot be cast to non-null type java.lang.String");
    }
  }
  
  private final void c(StringBuilder paramStringBuilder, b.i.b.a.c.l.w paramw)
  {
    a(paramStringBuilder, (b.i.b.a.c.b.a.a)paramw, null);
    if (b.i.b.a.c.l.y.b(paramw))
    {
      String str;
      if (((paramw instanceof b.i.b.a.c.l.ay)) && (this.l.y())) {
        str = ((b.i.b.a.c.l.ay)paramw).a;
      } else {
        str = paramw.f().toString();
      }
      paramStringBuilder.append(str);
      paramStringBuilder.append(a(paramw.a()));
    }
    else
    {
      a(this, paramStringBuilder, paramw);
    }
    if (paramw.c()) {
      paramStringBuilder.append("?");
    }
    if (b.i.b.a.c.l.ag.b(paramw)) {
      paramStringBuilder.append("!!");
    }
  }
  
  private static boolean c(b.i.b.a.c.l.w paramw)
  {
    return (b.i.b.a.c.a.f.b(paramw)) || (!paramw.r().a());
  }
  
  private final void d(StringBuilder paramStringBuilder, b.i.b.a.c.l.w paramw)
  {
    int i2 = paramStringBuilder.length();
    e().a(paramStringBuilder, (b.i.b.a.c.b.a.a)paramw, null);
    int i = paramStringBuilder.length();
    int i1 = 1;
    if (i != i2) {
      j = 1;
    } else {
      j = 0;
    }
    boolean bool1 = b.i.b.a.c.a.f.b(paramw);
    boolean bool2 = paramw.c();
    Object localObject1 = b.i.b.a.c.a.f.d(paramw);
    if ((!bool2) && ((j == 0) || (localObject1 == null))) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0) {
      if (bool1)
      {
        paramStringBuilder.insert(i2, '(');
      }
      else
      {
        if (j != 0)
        {
          localObject2 = (CharSequence)paramStringBuilder;
          if (b.k.l.c((CharSequence)localObject2) == ' ') {
            j = 1;
          } else {
            j = 0;
          }
          if ((b.w.a) && (j == 0)) {
            throw ((Throwable)new AssertionError("Assertion failed"));
          }
          if (paramStringBuilder.charAt(b.k.l.a((CharSequence)localObject2) - 1) != ')') {
            paramStringBuilder.insert(b.k.l.a((CharSequence)localObject2), "()");
          }
        }
        paramStringBuilder.append("(");
      }
    }
    a(paramStringBuilder, bool1, "suspend");
    if (localObject1 != null)
    {
      if (b((b.i.b.a.c.l.w)localObject1))
      {
        j = i1;
        if (!((b.i.b.a.c.l.w)localObject1).c()) {}
      }
      else if (c((b.i.b.a.c.l.w)localObject1))
      {
        j = i1;
      }
      else
      {
        j = 0;
      }
      if (j != 0) {
        paramStringBuilder.append("(");
      }
      a(paramStringBuilder, (b.i.b.a.c.l.w)localObject1);
      if (j != 0) {
        paramStringBuilder.append(")");
      }
      paramStringBuilder.append(".");
    }
    paramStringBuilder.append("(");
    Object localObject2 = ((Iterable)b.i.b.a.c.a.f.f(paramw)).iterator();
    int j = 0;
    while (((Iterator)localObject2).hasNext())
    {
      ap localap = (ap)((Iterator)localObject2).next();
      if (j > 0) {
        paramStringBuilder.append(", ");
      }
      if (this.l.x())
      {
        localObject1 = localap.c();
        b.f.b.j.a(localObject1, "typeProjection.type");
        localObject1 = b.i.b.a.c.a.f.g((b.i.b.a.c.l.w)localObject1);
      }
      else
      {
        localObject1 = null;
      }
      if (localObject1 != null)
      {
        paramStringBuilder.append(a((b.i.b.a.c.f.f)localObject1, false));
        paramStringBuilder.append(": ");
      }
      paramStringBuilder.append(f().a(localap));
      j += 1;
    }
    paramStringBuilder.append(") ");
    paramStringBuilder.append(g());
    paramStringBuilder.append(" ");
    a(paramStringBuilder, b.i.b.a.c.a.f.e(paramw));
    if (i != 0) {
      paramStringBuilder.append(")");
    }
    if (bool2) {
      paramStringBuilder.append("?");
    }
  }
  
  private final e e()
  {
    return (e)this.m.a();
  }
  
  private final c f()
  {
    return (c)this.n.a();
  }
  
  private final String g()
  {
    p localp = this.l.r();
    switch (g.c[localp.ordinal()])
    {
    default: 
      throw new b.k();
    case 2: 
      return "&rarr;";
    }
    return c("->");
  }
  
  public final a a()
  {
    return this.l.a();
  }
  
  public final String a(b.i.b.a.c.b.a.c paramc, b.i.b.a.c.b.a.e parame)
  {
    b.f.b.j.b(paramc, "annotation");
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append('@');
    if (parame != null)
    {
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(parame.j);
      localStringBuilder2.append(":");
      localStringBuilder1.append(localStringBuilder2.toString());
    }
    parame = paramc.a();
    localStringBuilder1.append(a(parame));
    if (i.a.a(this.l))
    {
      paramc = a(paramc);
      if ((i.a.b(this.l)) || ((((Collection)paramc).isEmpty() ^ true))) {
        b.a.j.a((Iterable)paramc, (Appendable)localStringBuilder1, (CharSequence)", ", (CharSequence)"(", (CharSequence)")", 0, null, null, 112);
      }
    }
    if ((this.l.j()) && ((b.i.b.a.c.l.y.b(parame)) || ((parame.f().c() instanceof aa.b)))) {
      localStringBuilder1.append(" /* annotation class not found */");
    }
    paramc = localStringBuilder1.toString();
    b.f.b.j.a(paramc, "StringBuilder().apply(builderAction).toString()");
    return paramc;
  }
  
  public final String a(b.i.b.a.c.b.l paraml)
  {
    b.f.b.j.b(paraml, "declarationDescriptor");
    StringBuilder localStringBuilder = new StringBuilder();
    paraml.a((b.i.b.a.c.b.n)new a(), localStringBuilder);
    if ((((Boolean)this.l.c.b(j.a[1])).booleanValue()) && (!(paraml instanceof ab)) && (!(paraml instanceof b.i.b.a.c.b.ad))) {
      if ((paraml instanceof b.i.b.a.c.b.y))
      {
        localStringBuilder.append(" is a module");
      }
      else
      {
        b.i.b.a.c.b.l locall = paraml.a();
        if ((locall != null) && (!(locall instanceof b.i.b.a.c.b.y)))
        {
          localStringBuilder.append(" ");
          Object localObject = "defined in";
          b.f.b.j.b("defined in", "message");
          p localp = this.l.r();
          switch (g.d[localp.ordinal()])
          {
          default: 
            throw new b.k();
          case 2: 
            localObject = new StringBuilder("<i>");
            ((StringBuilder)localObject).append("defined in");
            ((StringBuilder)localObject).append("</i>");
            localObject = ((StringBuilder)localObject).toString();
          }
          localStringBuilder.append((String)localObject);
          localStringBuilder.append(" ");
          localObject = b.i.b.a.c.i.d.c(locall);
          b.f.b.j.a(localObject, "DescriptorUtils.getFqName(containingDeclaration)");
          if (((b.i.b.a.c.f.c)localObject).a.isEmpty()) {
            localObject = "root package";
          } else {
            localObject = a((b.i.b.a.c.f.c)localObject);
          }
          localStringBuilder.append((String)localObject);
          if ((((Boolean)this.l.d.b(j.a[2])).booleanValue()) && ((locall instanceof ab)) && ((paraml instanceof b.i.b.a.c.b.o)))
          {
            paraml = ((b.i.b.a.c.b.o)paraml).s();
            b.f.b.j.a(paraml, "descriptor.source");
            b.f.b.j.a(paraml.a(), "descriptor.source.containingFile");
          }
        }
      }
    }
    paraml = localStringBuilder.toString();
    b.f.b.j.a(paraml, "StringBuilder().apply(builderAction).toString()");
    return paraml;
  }
  
  public final String a(b.i.b.a.c.f.c paramc)
  {
    b.f.b.j.b(paramc, "fqName");
    paramc = paramc.f();
    b.f.b.j.a(paramc, "fqName.pathSegments()");
    return c(q.a(paramc));
  }
  
  public final String a(b.i.b.a.c.f.f paramf, boolean paramBoolean)
  {
    b.f.b.j.b(paramf, "name");
    String str = c(q.a(paramf));
    paramf = str;
    if (this.l.z())
    {
      paramf = str;
      if (this.l.r() == p.b)
      {
        paramf = str;
        if (paramBoolean)
        {
          paramf = new StringBuilder("<b>");
          paramf.append(str);
          paramf.append("</b>");
          paramf = paramf.toString();
        }
      }
    }
    return paramf;
  }
  
  public final String a(ap paramap)
  {
    b.f.b.j.b(paramap, "typeProjection");
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, b.a.j.a(paramap));
    paramap = localStringBuilder.toString();
    b.f.b.j.a(paramap, "StringBuilder().apply(builderAction).toString()");
    return paramap;
  }
  
  public final String a(b.i.b.a.c.l.w paramw)
  {
    b.f.b.j.b(paramw, "type");
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, (b.i.b.a.c.l.w)((b.f.a.b)this.l.k.b(j.a[18])).a(paramw));
    paramw = localStringBuilder.toString();
    b.f.b.j.a(paramw, "StringBuilder().apply(builderAction).toString()");
    return paramw;
  }
  
  public final String a(String paramString1, String paramString2, b.i.b.a.c.a.g paramg)
  {
    b.f.b.j.b(paramString1, "lowerRendered");
    b.f.b.j.b(paramString2, "upperRendered");
    b.f.b.j.b(paramg, "builtIns");
    if (a(paramString1, paramString2))
    {
      if (b.k.l.a(paramString2, "("))
      {
        paramString2 = new StringBuilder("(");
        paramString2.append(paramString1);
        paramString2.append(")!");
        return paramString2.toString();
      }
      paramString2 = new StringBuilder();
      paramString2.append(paramString1);
      paramString2.append("!");
      return paramString2.toString();
    }
    Object localObject2 = this.l.f();
    Object localObject1 = ((g.b)paramg.i.b_()).b;
    localObject1 = b.i.b.a.c.a.g.a(b.i.b.a.c.f.f.a("Collection"), (ab)localObject1);
    b.f.b.j.a(localObject1, "builtIns.collection");
    Object localObject3 = (b.i.b.a.c.b.h)localObject1;
    localObject1 = (c)this;
    localObject2 = b.k.l.d(((b)localObject2).a((b.i.b.a.c.b.h)localObject3, (c)localObject1), "Collection");
    localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append((String)localObject2);
    ((StringBuilder)localObject3).append("Mutable");
    localObject3 = ((StringBuilder)localObject3).toString();
    Object localObject4 = new StringBuilder();
    ((StringBuilder)localObject4).append((String)localObject2);
    ((StringBuilder)localObject4).append('(');
    ((StringBuilder)localObject4).append("Mutable");
    ((StringBuilder)localObject4).append(')');
    localObject3 = a(paramString1, (String)localObject3, paramString2, (String)localObject2, ((StringBuilder)localObject4).toString());
    if (localObject3 != null) {
      return (String)localObject3;
    }
    localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append((String)localObject2);
    ((StringBuilder)localObject3).append("MutableMap.MutableEntry");
    localObject3 = ((StringBuilder)localObject3).toString();
    localObject4 = new StringBuilder();
    ((StringBuilder)localObject4).append((String)localObject2);
    ((StringBuilder)localObject4).append("Map.Entry");
    localObject4 = ((StringBuilder)localObject4).toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append((String)localObject2);
    localStringBuilder.append("(Mutable)Map.(Mutable)Entry");
    localObject2 = a(paramString1, (String)localObject3, paramString2, (String)localObject4, localStringBuilder.toString());
    if (localObject2 != null) {
      return (String)localObject2;
    }
    localObject2 = this.l.f();
    paramg = paramg.a("Array");
    b.f.b.j.a(paramg, "builtIns.array");
    paramg = b.k.l.d(((b)localObject2).a((b.i.b.a.c.b.h)paramg, (c)localObject1), "Array");
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(paramg);
    ((StringBuilder)localObject1).append(c("Array<"));
    localObject1 = ((StringBuilder)localObject1).toString();
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(paramg);
    ((StringBuilder)localObject2).append(c("Array<out "));
    localObject2 = ((StringBuilder)localObject2).toString();
    localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append(paramg);
    ((StringBuilder)localObject3).append(c("Array<(out) "));
    paramg = a(paramString1, (String)localObject1, paramString2, (String)localObject2, ((StringBuilder)localObject3).toString());
    if (paramg != null) {
      return paramg;
    }
    paramg = new StringBuilder("(");
    paramg.append(paramString1);
    paramg.append("..");
    paramg.append(paramString2);
    paramg.append(')');
    return paramg.toString();
  }
  
  public final void a(a parama)
  {
    b.f.b.j.b(parama, "<set-?>");
    this.l.a(parama);
  }
  
  public final void a(b paramb)
  {
    b.f.b.j.b(paramb, "<set-?>");
    this.l.a(paramb);
  }
  
  public final void a(n paramn)
  {
    b.f.b.j.b(paramn, "<set-?>");
    this.l.a(paramn);
  }
  
  public final void a(p paramp)
  {
    b.f.b.j.b(paramp, "<set-?>");
    this.l.a(paramp);
  }
  
  public final void a(Set<b.i.b.a.c.f.b> paramSet)
  {
    b.f.b.j.b(paramSet, "<set-?>");
    this.l.a(paramSet);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.l.a(paramBoolean);
  }
  
  public final void b(Set<? extends h> paramSet)
  {
    b.f.b.j.b(paramSet, "<set-?>");
    this.l.b(paramSet);
  }
  
  public final void b(boolean paramBoolean)
  {
    this.l.b(paramBoolean);
  }
  
  public final boolean b()
  {
    return this.l.b();
  }
  
  public final void c(boolean paramBoolean)
  {
    this.l.c(paramBoolean);
  }
  
  public final boolean c()
  {
    return this.l.c();
  }
  
  public final Set<b.i.b.a.c.f.b> d()
  {
    return this.l.d();
  }
  
  public final void d(boolean paramBoolean)
  {
    this.l.d(paramBoolean);
  }
  
  public final void e(boolean paramBoolean)
  {
    this.l.e(paramBoolean);
  }
  
  public final void f(boolean paramBoolean)
  {
    this.l.f(paramBoolean);
  }
  
  public final void g(boolean paramBoolean)
  {
    this.l.g(paramBoolean);
  }
  
  public final void h(boolean paramBoolean)
  {
    this.l.h(paramBoolean);
  }
  
  final class a
    implements b.i.b.a.c.b.n<u, StringBuilder>
  {
    private final void a(b.i.b.a.c.b.ag paramag, StringBuilder paramStringBuilder, String paramString)
    {
      Object localObject = this.a.l.s();
      switch (f.a[localObject.ordinal()])
      {
      default: 
        return;
      case 2: 
        a((t)paramag, paramStringBuilder);
        return;
      }
      e.a(this.a, paramag, paramStringBuilder);
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(" for ");
      paramStringBuilder.append(((StringBuilder)localObject).toString());
      paramString = this.a;
      paramag = paramag.v();
      b.f.b.j.a(paramag, "descriptor.correspondingProperty");
      e.a(paramString, paramag, paramStringBuilder);
    }
    
    private void a(t paramt, StringBuilder paramStringBuilder)
    {
      b.f.b.j.b(paramt, "descriptor");
      b.f.b.j.b(paramStringBuilder, "builder");
      e.a(this.a, paramt, paramStringBuilder);
    }
  }
  
  static final class b
    extends b.f.b.k
    implements b.f.a.b<ap, CharSequence>
  {
    b(e parame)
    {
      super();
    }
  }
  
  static final class c
    extends b.f.b.k
    implements b.f.a.a<e>
  {
    c(e parame)
    {
      super();
    }
  }
  
  static final class d
    extends b.f.b.k
    implements b.f.a.a<c>
  {
    d(e parame)
    {
      super();
    }
  }
  
  static final class e
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.i.b.f<?>, String>
  {
    e(e parame)
    {
      super();
    }
  }
  
  static final class f
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.l.w, String>
  {
    f(e parame)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/h/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
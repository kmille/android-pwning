package b.i.b.a.c.b.c;

import b.f.a.a;
import b.f.b.j;
import b.f.b.k;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.aq;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.d;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.t;
import b.i.b.a.c.b.t.a;
import b.i.b.a.c.f.f;
import b.i.b.a.c.k.i;
import b.i.b.a.c.l.au;
import b.r;

public final class ag
  extends p
  implements af
{
  public static final a w = new a((byte)0);
  final i b;
  final aq v;
  private final b.i.b.a.c.k.g x;
  private d y;
  
  private ag(i parami, aq paramaq, final d paramd, af paramaf, b.i.b.a.c.b.a.g paramg, b.a parama, am paramam)
  {
    super((l)paramaq, (t)paramaf, paramg, f.c("<init>"), parama, paramam);
    this.b = parami;
    this.v = paramaq;
    this.p = this.v.p();
    this.x = this.b.b((a)new b(this, paramd));
    this.y = paramd;
  }
  
  private af E()
  {
    t localt = super.w();
    if (localt != null) {
      return (af)localt;
    }
    throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
  }
  
  private af a(l paraml, b.i.b.a.c.b.w paramw, az paramaz, b.a parama, boolean paramBoolean)
  {
    j.b(paraml, "newOwner");
    j.b(paramw, "modality");
    j.b(paramaz, "visibility");
    j.b(parama, "kind");
    paraml = D().a(paraml).a(paramw).a(paramaz).a(parama).a(paramBoolean).f();
    if (paraml != null) {
      return (af)paraml;
    }
    throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
  }
  
  private af a(au paramau)
  {
    j.b(paramau, "substitutor");
    paramau = super.c(paramau);
    if (paramau != null)
    {
      paramau = (ag)paramau;
      Object localObject = au.a(paramau.g());
      j.a(localObject, "TypeSubstitutor.create(s…asConstructor.returnType)");
      localObject = this.y.u().a((au)localObject);
      if (localObject == null) {
        return null;
      }
      paramau.y = ((d)localObject);
      return (af)paramau;
    }
    throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
  }
  
  public final b.i.b.a.c.l.w g()
  {
    b.i.b.a.c.l.w localw = super.g();
    if (localw == null) {
      j.a();
    }
    return localw;
  }
  
  public final d u()
  {
    return this.y;
  }
  
  public static final class a
  {
    static au a(aq paramaq)
    {
      if (paramaq.g() == null) {
        return null;
      }
      return au.a((b.i.b.a.c.l.w)paramaq.d());
    }
  }
  
  static final class b
    extends k
    implements a<ag>
  {
    b(ag paramag, d paramd)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
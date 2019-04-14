package b.i.b.a.c.d.a.c.b;

import b.f.b.j;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.d.a.a.l;

public final class a
{
  final l a;
  final b b;
  final boolean c;
  final ar d;
  
  private a(l paraml, b paramb, boolean paramBoolean, ar paramar)
  {
    this.a = paraml;
    this.b = paramb;
    this.c = paramBoolean;
    this.d = paramar;
  }
  
  public final a a(b paramb)
  {
    j.b(paramb, "flexibility");
    l locall = this.a;
    boolean bool = this.c;
    ar localar = this.d;
    j.b(locall, "howThisTypeIsUsed");
    j.b(paramb, "flexibility");
    return new a(locall, paramb, bool, localar);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((j.a(this.a, ((a)paramObject).a)) && (j.a(this.b, ((a)paramObject).b)))
        {
          int i;
          if (this.c == ((a)paramObject).c) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (j.a(this.d, ((a)paramObject).d))) {
            return true;
          }
        }
      }
      return false;
    }
    return true;
  }
  
  public final int hashCode()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("JavaTypeAttributes(howThisTypeIsUsed=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", flexibility=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", isForAnnotationParameter=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", upperBoundOfTypeParameter=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
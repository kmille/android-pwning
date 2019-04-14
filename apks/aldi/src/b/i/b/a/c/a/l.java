package b.i.b.a.c.a;

import b.f.b.j;
import b.i.b.a.c.f.a;
import b.i.b.a.c.f.b;
import b.i.b.a.c.f.c;
import b.i.b.a.c.f.f;

public enum l
{
  final f e;
  final a f;
  final a g;
  
  static
  {
    Object localObject1 = a.a("kotlin/UByte");
    j.a(localObject1, "ClassId.fromString(\"kotlin/UByte\")");
    localObject1 = new l("UBYTE", 0, (a)localObject1);
    a = (l)localObject1;
    Object localObject2 = a.a("kotlin/UShort");
    j.a(localObject2, "ClassId.fromString(\"kotlin/UShort\")");
    localObject2 = new l("USHORT", 1, (a)localObject2);
    b = (l)localObject2;
    Object localObject3 = a.a("kotlin/UInt");
    j.a(localObject3, "ClassId.fromString(\"kotlin/UInt\")");
    localObject3 = new l("UINT", 2, (a)localObject3);
    c = (l)localObject3;
    Object localObject4 = a.a("kotlin/ULong");
    j.a(localObject4, "ClassId.fromString(\"kotlin/ULong\")");
    localObject4 = new l("ULONG", 3, (a)localObject4);
    d = (l)localObject4;
    h = new l[] { localObject1, localObject2, localObject3, localObject4 };
  }
  
  private l(a parama)
  {
    this.g = parama;
    ??? = this.g.b.b.d();
    j.a(???, "classId.shortClassName");
    this.e = ((f)???);
    ??? = this.g.a;
    a parama = new StringBuilder();
    parama.append(this.e.a);
    parama.append("Array");
    this.f = new a((b)???, f.a(parama.toString()));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
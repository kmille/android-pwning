package b.i.b.a.c.d.a.c;

import b.f.b.j;
import b.i.b.a.c.d.a.a.a;
import b.i.b.a.c.d.a.f.h;
import java.util.EnumMap;

public final class d
{
  final EnumMap<a.a, h> a;
  
  public d(EnumMap<a.a, h> paramEnumMap)
  {
    this.a = paramEnumMap;
  }
  
  public final b.i.b.a.c.d.a.f.d a(a.a parama)
  {
    parama = (h)this.a.get(parama);
    if (parama == null) {
      return null;
    }
    j.a(parama, "nullabilityQualifiers[ap…ilityType] ?: return null");
    return new b.i.b.a.c.d.a.f.d(parama.a, null, false, parama.b);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
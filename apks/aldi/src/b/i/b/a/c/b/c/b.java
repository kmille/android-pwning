package b.i.b.a.c.b.c;

import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ap;
import b.i.b.a.c.b.l;
import b.i.b.a.c.f.f;
import b.i.b.a.c.k.i;
import b.i.b.a.c.l.ba;

public abstract class b
  extends e
{
  public b(i parami, l paraml, f paramf, ba paramba, boolean paramBoolean, int paramInt, am paramam, ap paramap)
  {
    super(parami, paraml, g.a.a(), paramf, paramba, paramBoolean, paramInt, paramam, paramap);
  }
  
  public String toString()
  {
    String str;
    if (this.b) {
      str = "reified ";
    } else {
      str = "";
    }
    Object localObject;
    if (this.a == ba.a)
    {
      localObject = "";
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(this.a);
      ((StringBuilder)localObject).append(" ");
      localObject = ((StringBuilder)localObject).toString();
    }
    return String.format("%s%s%s", new Object[] { str, localObject, this.d });
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package b.i.b.a.c.l;

import b.f.b.j;
import b.k;

public final class ax
{
  public static final az a(az paramaz, w paramw)
  {
    j.b(paramaz, "receiver$0");
    j.b(paramw, "origin");
    return b(paramaz, a(paramw));
  }
  
  public static final w a(w paramw)
  {
    j.b(paramw, "receiver$0");
    if ((paramw instanceof aw)) {
      return ((aw)paramw).h();
    }
    return null;
  }
  
  public static final az b(az paramaz, w paramw)
  {
    j.b(paramaz, "receiver$0");
    if (paramw == null) {
      return paramaz;
    }
    if ((paramaz instanceof ad)) {}
    for (paramaz = new af((ad)paramaz, paramw);; paramaz = new s((q)paramaz, paramw))
    {
      return (az)paramaz;
      if (!(paramaz instanceof q)) {
        break;
      }
    }
    throw new k();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package b.i.b.a.c.d.a.a;

import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.au;
import b.i.b.a.c.l.w;
import java.util.Collections;
import java.util.List;

public abstract interface k
{
  public static final k a = new k()
  {
    public final k.a a(w paramAnonymousw, List<au> paramAnonymousList, List<ar> paramAnonymousList1)
    {
      return new k.a(paramAnonymousw, paramAnonymousList, paramAnonymousList1, Collections.emptyList());
    }
    
    public final void a()
    {
      throw new UnsupportedOperationException("Should not be called");
    }
  };
  
  public abstract a a(w paramw, List<au> paramList, List<ar> paramList1);
  
  public abstract void a();
  
  public static final class a
  {
    public final w a;
    public final w b;
    public final List<au> c;
    public final List<ar> d;
    public final List<String> e;
    public final boolean f;
    
    public a(w paramw, List<au> paramList, List<ar> paramList1, List<String> paramList2)
    {
      this.a = paramw;
      this.b = null;
      this.c = paramList;
      this.d = paramList1;
      this.e = paramList2;
      this.f = false;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
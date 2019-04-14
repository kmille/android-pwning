package b.i.b.a.c.g;

import java.io.IOException;

public class m
{
  protected volatile q a;
  private d b;
  private g c;
  private volatile boolean d;
  
  public final q a(q paramq)
  {
    if (this.a == null) {}
    for (;;)
    {
      try
      {
        if (this.a != null) {
          break label66;
        }
        localq = paramq;
      }
      finally
      {
        try
        {
          q localq;
          if (this.b != null) {
            localq = (q)paramq.b().a(this.b, this.c);
          }
          this.a = localq;
        }
        catch (IOException paramq) {}
        paramq = finally;
      }
      label66:
      return this.a;
    }
  }
  
  public final int b()
  {
    if (this.d) {
      return this.a.f();
    }
    return this.b.a();
  }
  
  public final q b(q paramq)
  {
    q localq = this.a;
    this.a = paramq;
    this.b = null;
    this.d = true;
    return localq;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
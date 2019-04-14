package b.i.b.a.c.m;

import b.f.b.k;
import b.i.b.a.c.b.t;
import b.i.b.a.c.f.f;
import b.k.j;
import java.util.Arrays;
import java.util.Collection;

public final class d
{
  public final f a;
  public final j b;
  public final Collection<f> c;
  public final b.f.a.b<t, String> d;
  public final b[] e;
  
  private d(f paramf, j paramj, Collection<f> paramCollection, b.f.a.b<? super t, String> paramb, b... paramVarArgs)
  {
    this.a = paramf;
    this.b = paramj;
    this.c = paramCollection;
    this.d = paramb;
    this.e = paramVarArgs;
  }
  
  public d(f paramf, b[] paramArrayOfb, b.f.a.b<? super t, String> paramb)
  {
    this(paramf, null, null, paramb, (b[])Arrays.copyOf(paramArrayOfb, paramArrayOfb.length));
  }
  
  private d(j paramj, b[] paramArrayOfb, b.f.a.b<? super t, String> paramb)
  {
    this(null, paramj, null, paramb, (b[])Arrays.copyOf(paramArrayOfb, paramArrayOfb.length));
  }
  
  public d(Collection<f> paramCollection, b[] paramArrayOfb, b.f.a.b<? super t, String> paramb)
  {
    this(null, null, paramCollection, paramb, (b[])Arrays.copyOf(paramArrayOfb, paramArrayOfb.length));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/m/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
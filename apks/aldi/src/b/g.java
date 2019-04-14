package b;

import b.f.a.a;

@j(a={1, 1, 13}, b={"\000\034\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\032 \020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\f\020\003\032\b\022\004\022\002H\0020\004\032*\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\b\020\005\032\004\030\0010\0062\f\020\003\032\b\022\004\022\002H\0020\004\032(\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\006\020\007\032\0020\b2\f\020\003\032\b\022\004\022\002H\0020\004¨\006\t"}, c={"lazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "lock", "", "mode", "Lkotlin/LazyThreadSafetyMode;", "kotlin-stdlib"}, d=1)
public class g
{
  public static final <T> d<T> a(a<? extends T> parama)
  {
    b.f.b.j.b(parama, "initializer");
    return (d)new o(parama, (byte)0);
  }
  
  public static final <T> d<T> a(i parami, a<? extends T> parama)
  {
    b.f.b.j.b(parami, "mode");
    b.f.b.j.b(parama, "initializer");
    switch (f.a[parami.ordinal()])
    {
    default: 
      throw new k();
    case 3: 
      parami = new v(parama);
    }
    for (;;)
    {
      return (d)parami;
      parami = new n(parama);
      continue;
      parami = new o(parama, (byte)0);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
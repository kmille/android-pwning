package b.i.b.a.d;

final class d<V>
{
  private static final d<Object> a = new d(c.a);
  private final c<V> b;
  
  private d(c<V> paramc)
  {
    this.b = paramc;
  }
  
  public static <V> d<V> a()
  {
    return a;
  }
  
  private d<V> a(c<V> paramc)
  {
    if (paramc == this.b) {
      return this;
    }
    return new d(paramc);
  }
  
  public final d<V> a(int paramInt, V paramV)
  {
    return a(this.b.a(paramInt, paramV));
  }
  
  public final V a(int paramInt)
  {
    return (V)this.b.a(paramInt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
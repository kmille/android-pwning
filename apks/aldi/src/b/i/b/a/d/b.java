package b.i.b.a.d;

public final class b<K, V>
{
  private static final b<Object, Object> a = new b(d.a(), 0);
  private final d<a<e<K, V>>> b;
  private final int c;
  
  private b(d<a<e<K, V>>> paramd, int paramInt)
  {
    this.b = paramd;
    this.c = paramInt;
  }
  
  private static <K, V> int a(a<e<K, V>> parama, Object paramObject)
  {
    int i = 0;
    while ((parama != null) && (parama.c > 0))
    {
      if (((e)parama.a).a.equals(paramObject)) {
        return i;
      }
      parama = parama.b;
      i += 1;
    }
    return -1;
  }
  
  public static <K, V> b<K, V> a()
  {
    return a;
  }
  
  public final a<e<K, V>> a(int paramInt)
  {
    a locala2 = (a)this.b.a(paramInt);
    a locala1 = locala2;
    if (locala2 == null) {
      locala1 = a.a();
    }
    return locala1;
  }
  
  public final b<K, V> a(K paramK, V paramV)
  {
    a locala2 = a(paramK.hashCode());
    int i = locala2.c;
    int j = a(locala2, paramK);
    a locala1 = locala2;
    if (j != -1) {
      locala1 = locala2.a(j);
    }
    paramV = locala1.a(new e(paramK, paramV));
    return new b(this.b.a(paramK.hashCode(), paramV), this.c - i + paramV.c);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
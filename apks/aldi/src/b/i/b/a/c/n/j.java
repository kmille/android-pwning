package b.i.b.a.c.n;

public final class j
{
  public static volatile boolean a = false;
  private static final Object b = new Object()
  {
    public final String toString()
    {
      return "NULL_VALUE";
    }
  };
  
  public static <V> Object a(V paramV)
  {
    Object localObject = paramV;
    if (paramV == null) {
      localObject = b;
    }
    return localObject;
  }
  
  public static Object a(Throwable paramThrowable)
  {
    return new a(paramThrowable, (byte)0);
  }
  
  public static <V> V b(Object paramObject)
  {
    Object localObject = c(paramObject);
    paramObject = localObject;
    if (localObject == b) {
      paramObject = null;
    }
    return (V)paramObject;
  }
  
  public static <V> V c(Object paramObject)
  {
    if ((paramObject instanceof a))
    {
      paramObject = ((a)paramObject).a;
      if ((a) && (c.a((Throwable)paramObject))) {
        throw new b((Throwable)paramObject);
      }
      b.f.b.j.b(paramObject, "e");
      throw ((Throwable)paramObject);
    }
    return (V)paramObject;
  }
  
  static final class a
  {
    final Throwable a;
    
    private a(Throwable paramThrowable)
    {
      this.a = paramThrowable;
    }
    
    public final String toString()
    {
      return this.a.toString();
    }
  }
  
  public static final class b
    extends RuntimeException
  {
    public b(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/n/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
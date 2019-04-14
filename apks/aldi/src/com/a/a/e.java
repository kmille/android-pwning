package com.a.a;

public final class e<T>
{
  private static final e<?> b = new e();
  public final T a;
  
  private e()
  {
    this.a = null;
  }
  
  private e(T paramT)
  {
    this.a = d.a(paramT);
  }
  
  public static <T> e<T> a()
  {
    return b;
  }
  
  public static <T> e<T> a(T paramT)
  {
    return new e(paramT);
  }
  
  public static <T> e<T> b(T paramT)
  {
    if (paramT == null) {
      return b;
    }
    return a(paramT);
  }
  
  public final <U> e<U> a(com.a.a.a.d<? super T, ? extends U> paramd)
  {
    if (!b()) {
      return b;
    }
    return b(paramd.apply(this.a));
  }
  
  public final boolean b()
  {
    return this.a != null;
  }
  
  public final T c(T paramT)
  {
    if (this.a != null) {
      paramT = this.a;
    }
    return paramT;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof e)) {
      return false;
    }
    Object localObject = (e)paramObject;
    paramObject = this.a;
    localObject = ((e)localObject).a;
    if (paramObject != localObject) {
      return (paramObject != null) && (paramObject.equals(localObject));
    }
    return true;
  }
  
  public final int hashCode()
  {
    Object localObject = this.a;
    if (localObject != null) {
      return localObject.hashCode();
    }
    return 0;
  }
  
  public final String toString()
  {
    if (this.a != null) {
      return String.format("Optional[%s]", new Object[] { this.a });
    }
    return "Optional.empty";
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
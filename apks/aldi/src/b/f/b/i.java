package b.f.b;

import b.i.a;
import b.i.e;

public class i
  extends c
  implements h, e
{
  private final int c;
  
  public i(int paramInt)
  {
    this.c = paramInt;
  }
  
  public i(Object paramObject)
  {
    super(paramObject);
    this.c = 1;
  }
  
  protected final a b()
  {
    return v.a(this);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof i))
    {
      paramObject = (i)paramObject;
      return (f() == null ? ((i)paramObject).f() == null : f().equals(((i)paramObject).f())) && (g().equals(((i)paramObject).g())) && (h().equals(((i)paramObject).h())) && (j.a(c(), ((i)paramObject).c()));
    }
    if ((paramObject instanceof e)) {
      return paramObject.equals(d());
    }
    return false;
  }
  
  public int hashCode()
  {
    int i;
    if (f() == null) {
      i = 0;
    } else {
      i = f().hashCode() * 31;
    }
    return (i + g().hashCode()) * 31 + h().hashCode();
  }
  
  public String toString()
  {
    Object localObject = d();
    if (localObject != this) {
      return localObject.toString();
    }
    if ("<init>".equals(g())) {
      return "constructor (Kotlin reflection is not available)";
    }
    localObject = new StringBuilder("function ");
    ((StringBuilder)localObject).append(g());
    ((StringBuilder)localObject).append(" (Kotlin reflection is not available)");
    return ((StringBuilder)localObject).toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/f/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
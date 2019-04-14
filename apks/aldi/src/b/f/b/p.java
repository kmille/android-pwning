package b.f.b;

import b.i.k;

public abstract class p
  extends c
  implements k
{
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof p))
    {
      paramObject = (p)paramObject;
      return (f().equals(((p)paramObject).f())) && (g().equals(((p)paramObject).g())) && (h().equals(((p)paramObject).h())) && (j.a(c(), ((p)paramObject).c()));
    }
    if ((paramObject instanceof k)) {
      return paramObject.equals(d());
    }
    return false;
  }
  
  public int hashCode()
  {
    return (f().hashCode() * 31 + g().hashCode()) * 31 + h().hashCode();
  }
  
  protected final k i()
  {
    return (k)super.e();
  }
  
  public String toString()
  {
    Object localObject = d();
    if (localObject != this) {
      return localObject.toString();
    }
    localObject = new StringBuilder("property ");
    ((StringBuilder)localObject).append(g());
    ((StringBuilder)localObject).append(" (Kotlin reflection is not available)");
    return ((StringBuilder)localObject).toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/f/b/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
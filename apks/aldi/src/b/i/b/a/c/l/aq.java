package b.i.b.a.c.l;

public abstract class aq
  implements ap
{
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ap)) {
      return false;
    }
    paramObject = (ap)paramObject;
    if (a() != ((ap)paramObject).a()) {
      return false;
    }
    if (b() != ((ap)paramObject).b()) {
      return false;
    }
    return c().equals(((ap)paramObject).c());
  }
  
  public int hashCode()
  {
    int j = b().hashCode();
    int i;
    if (a()) {
      i = 17;
    } else {
      i = c().hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    if (a()) {
      return "*";
    }
    if (b() == ba.a) {
      return c().toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b());
    localStringBuilder.append(" ");
    localStringBuilder.append(c());
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
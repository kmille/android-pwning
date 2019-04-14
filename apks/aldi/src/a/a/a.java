package a.a;

import java.util.ArrayList;
import java.util.Collection;

public final class a<T>
{
  public Class<T> a;
  public e<? super T> b;
  public Collection<Object<T>> c;
  public boolean d;
  private Collection<d<T>> e;
  
  public a(Class<T> paramClass)
  {
    this.a = paramClass;
  }
  
  public final Collection<d<T>> a()
  {
    if (this.e == null) {
      this.e = new ArrayList();
    }
    return this.e;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
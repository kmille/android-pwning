package a.a.b;

import a.a.c.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class i
  implements h
{
  private final Collection<h> a;
  
  public i(Collection<h> paramCollection)
  {
    this.a = new ArrayList(paramCollection);
  }
  
  public i(h... paramVarArgs)
  {
    this(Arrays.asList(paramVarArgs));
  }
  
  public final boolean a(a parama)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      if (((h)localIterator.next()).a(parama)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
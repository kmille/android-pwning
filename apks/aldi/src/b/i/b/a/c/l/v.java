package b.i.b.a.c.l;

import b.i.b.a.c.a.g;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.i.e.m;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class v
  implements an
{
  public final Set<w> a;
  private final int c;
  
  public v(Collection<w> paramCollection)
  {
    if ((!b) && (paramCollection.isEmpty())) {
      throw new AssertionError("Attempt to create an empty intersection");
    }
    this.a = new LinkedHashSet(paramCollection);
    this.c = this.a.hashCode();
  }
  
  public final List<ar> b()
  {
    return Collections.emptyList();
  }
  
  public final b.i.b.a.c.b.h c()
  {
    return null;
  }
  
  public final g d()
  {
    return ((w)this.a.iterator().next()).f().d();
  }
  
  public final boolean e()
  {
    return false;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject != null)
    {
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (v)paramObject;
      if (this.a != null)
      {
        if (!this.a.equals(((v)paramObject).a)) {
          return false;
        }
      }
      else if (((v)paramObject).a != null) {
        return false;
      }
      return true;
    }
    return false;
  }
  
  public final b.i.b.a.c.i.e.h f()
  {
    return m.a("member scope for intersection type ".concat(String.valueOf(this)), this.a);
  }
  
  public int hashCode()
  {
    return this.c;
  }
  
  public final Collection<w> i_()
  {
    return this.a;
  }
  
  public String toString()
  {
    Object localObject = this.a;
    StringBuilder localStringBuilder = new StringBuilder("{");
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      localStringBuilder.append(((w)((Iterator)localObject).next()).toString());
      if (((Iterator)localObject).hasNext()) {
        localStringBuilder.append(" & ");
      }
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
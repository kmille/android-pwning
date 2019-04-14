package b.f.b;

import java.util.ArrayList;

public final class x
{
  public final ArrayList<Object> a = new ArrayList(2);
  
  public final void a(Object paramObject)
  {
    if (paramObject == null) {
      return;
    }
    if ((paramObject instanceof Object[]))
    {
      paramObject = (Object[])paramObject;
      if (paramObject.length > 0)
      {
        this.a.ensureCapacity(this.a.size() + paramObject.length);
        int j = paramObject.length;
        int i = 0;
        while (i < j)
        {
          localObject = paramObject[i];
          this.a.add(localObject);
          i += 1;
        }
      }
      return;
    }
    Object localObject = new StringBuilder("Don't know how to spread ");
    ((StringBuilder)localObject).append(paramObject.getClass());
    throw new UnsupportedOperationException(((StringBuilder)localObject).toString());
  }
  
  public final Object[] a(Object[] paramArrayOfObject)
  {
    return this.a.toArray(paramArrayOfObject);
  }
  
  public final void b(Object paramObject)
  {
    this.a.add(paramObject);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/f/b/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package b.f.b;

import b.f.b.a.a;
import b.f.b.a.f;
import java.util.Set;

public class y
{
  private static <T extends Throwable> T a(T paramT)
  {
    return j.a(paramT, y.class.getName());
  }
  
  public static Set a(Object paramObject)
  {
    if (((paramObject instanceof a)) && (!(paramObject instanceof f)))
    {
      if (paramObject == null) {
        paramObject = "null";
      } else {
        paramObject = paramObject.getClass().getName();
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append((String)paramObject);
      localStringBuilder.append(" cannot be cast to ");
      localStringBuilder.append("kotlin.collections.MutableSet");
      throw ((ClassCastException)a(new ClassCastException(localStringBuilder.toString())));
    }
    return b(paramObject);
  }
  
  private static Set b(Object paramObject)
  {
    try
    {
      paramObject = (Set)paramObject;
      return (Set)paramObject;
    }
    catch (ClassCastException paramObject)
    {
      throw ((ClassCastException)a((Throwable)paramObject));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/f/b/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
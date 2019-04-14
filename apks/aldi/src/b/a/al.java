package b.a;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

@b.j(a={1, 1, 13}, b={"\000\034\n\000\n\002\020\"\n\002\b\004\n\002\020\021\n\000\n\002\020\034\n\002\030\002\n\002\b\004\032,\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\006\020\003\032\002H\002H\002¢\006\002\020\004\0324\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\016\020\005\032\n\022\006\b\001\022\002H\0020\006H\002¢\006\002\020\007\032-\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\f\020\005\032\b\022\004\022\002H\0020\bH\002\032-\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\f\020\005\032\b\022\004\022\002H\0020\tH\002\032,\020\n\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\006\020\003\032\002H\002H\b¢\006\002\020\004\032,\020\013\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\006\020\003\032\002H\002H\002¢\006\002\020\004\0324\020\013\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\016\020\005\032\n\022\006\b\001\022\002H\0020\006H\002¢\006\002\020\007\032-\020\013\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\f\020\005\032\b\022\004\022\002H\0020\bH\002\032-\020\013\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\f\020\005\032\b\022\004\022\002H\0020\tH\002\032,\020\f\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\006\020\003\032\002H\002H\b¢\006\002\020\004¨\006\r"}, c={"minus", "", "T", "element", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "elements", "", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "Lkotlin/sequences/Sequence;", "minusElement", "plus", "plusElement", "kotlin-stdlib"}, d=1)
public class al
  extends ak
{
  public static final <T> Set<T> a(Set<? extends T> paramSet, Iterable<? extends T> paramIterable)
  {
    b.f.b.j.b(paramSet, "receiver$0");
    b.f.b.j.b(paramIterable, "elements");
    b.f.b.j.b(paramIterable, "receiver$0");
    if ((paramIterable instanceof Collection)) {
      localObject = Integer.valueOf(((Collection)paramIterable).size());
    } else {
      localObject = null;
    }
    int i;
    if (localObject != null)
    {
      i = ((Number)localObject).intValue();
      i = paramSet.size() + i;
    }
    else
    {
      i = paramSet.size() * 2;
    }
    Object localObject = new LinkedHashSet(ac.a(i));
    ((LinkedHashSet)localObject).addAll((Collection)paramSet);
    j.a((Collection)localObject, paramIterable);
    return (Set)localObject;
  }
  
  public static final <T> Set<T> a(Set<? extends T> paramSet, T paramT)
  {
    b.f.b.j.b(paramSet, "receiver$0");
    LinkedHashSet localLinkedHashSet = new LinkedHashSet(ac.a(paramSet.size() + 1));
    localLinkedHashSet.addAll((Collection)paramSet);
    localLinkedHashSet.add(paramT);
    return (Set)localLinkedHashSet;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
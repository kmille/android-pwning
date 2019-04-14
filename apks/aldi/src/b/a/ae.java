package b.a;

import b.m;
import java.util.Collections;
import java.util.Map;

@b.j(a={1, 1, 13}, b={"\000D\n\000\n\002\020$\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\020\017\n\000\n\002\020\021\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\016\n\002\b\004\n\002\030\002\n\000\0322\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\0032\022\020\004\032\016\022\004\022\002H\002\022\004\022\002H\0030\005\032Y\020\006\032\016\022\004\022\002H\002\022\004\022\002H\0030\007\"\016\b\000\020\002*\b\022\004\022\002H\0020\b\"\004\b\001\020\0032*\020\t\032\026\022\022\b\001\022\016\022\004\022\002H\002\022\004\022\002H\0030\0050\n\"\016\022\004\022\002H\002\022\004\022\002H\0030\005¢\006\002\020\013\032@\020\f\032\002H\003\"\004\b\000\020\002\"\004\b\001\020\003*\016\022\004\022\002H\002\022\004\022\002H\0030\r2\006\020\016\032\002H\0022\f\020\017\032\b\022\004\022\002H\0030\020H\b¢\006\002\020\021\032\031\020\022\032\0020\023*\016\022\004\022\0020\024\022\004\022\0020\0240\001H\b\0322\020\025\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\001H\000\0321\020\026\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\016\022\004\022\002H\002\022\004\022\002H\0030\001H\b\032:\020\027\032\016\022\004\022\002H\002\022\004\022\002H\0030\007\"\016\b\000\020\002*\b\022\004\022\002H\0020\b\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\001\032@\020\027\032\016\022\004\022\002H\002\022\004\022\002H\0030\007\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\016\020\030\032\n\022\006\b\000\022\002H\0020\031¨\006\032"}, c={"mapOf", "", "K", "V", "pair", "Lkotlin/Pair;", "sortedMapOf", "Ljava/util/SortedMap;", "", "pairs", "", "([Lkotlin/Pair;)Ljava/util/SortedMap;", "getOrPut", "Ljava/util/concurrent/ConcurrentMap;", "key", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "toProperties", "Ljava/util/Properties;", "", "toSingletonMap", "toSingletonMapOrSelf", "toSortedMap", "comparator", "Ljava/util/Comparator;", "kotlin-stdlib"}, d=1)
public class ae
  extends ad
{
  public static final <K, V> Map<K, V> a(m<? extends K, ? extends V> paramm)
  {
    b.f.b.j.b(paramm, "pair");
    paramm = Collections.singletonMap(paramm.a, paramm.b);
    b.f.b.j.a(paramm, "java.util.Collections.si…(pair.first, pair.second)");
    return paramm;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
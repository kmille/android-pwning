package b.a;

import java.util.Collection;

@b.j(a={1, 1, 13}, b={"\000:\n\000\n\002\020\034\n\002\b\002\n\002\030\002\n\002\020(\n\000\n\002\020\b\n\002\b\004\n\002\020\036\n\002\b\003\n\002\020 \n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\002\032+\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\024\b\004\020\003\032\016\022\n\022\b\022\004\022\002H\0020\0050\004H\b\032 \020\006\032\0020\007\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\006\020\b\032\0020\007H\001\032\037\020\t\032\004\030\0010\007\"\004\b\000\020\002*\b\022\004\022\002H\0020\001H\001¢\006\002\020\n\032\036\020\013\032\b\022\004\022\002H\0020\f\"\004\b\000\020\002*\b\022\004\022\002H\0020\001H\000\032,\020\r\032\b\022\004\022\002H\0020\f\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\f\020\016\032\b\022\004\022\002H\0020\001H\000\032\"\020\017\032\b\022\004\022\002H\0020\020\"\004\b\000\020\002*\016\022\n\022\b\022\004\022\002H\0020\0010\001\032\035\020\021\032\0020\022\"\004\b\000\020\002*\b\022\004\022\002H\0020\fH\002¢\006\002\b\023\032@\020\024\032\032\022\n\022\b\022\004\022\002H\0020\020\022\n\022\b\022\004\022\002H\0260\0200\025\"\004\b\000\020\002\"\004\b\001\020\026*\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0260\0250\001¨\006\027"}, c={"Iterable", "", "T", "iterator", "Lkotlin/Function0;", "", "collectionSizeOrDefault", "", "default", "collectionSizeOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "convertToSetForSetOperation", "", "convertToSetForSetOperationWith", "source", "flatten", "", "safeToConvertToSet", "", "safeToConvertToSet$CollectionsKt__IterablesKt", "unzip", "Lkotlin/Pair;", "R", "kotlin-stdlib"}, d=1)
public class m
  extends l
{
  public static final <T> int a(Iterable<? extends T> paramIterable)
  {
    b.f.b.j.b(paramIterable, "receiver$0");
    if ((paramIterable instanceof Collection)) {
      return ((Collection)paramIterable).size();
    }
    return 10;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package b.a;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000<\n\000\n\002\020\002\n\000\n\002\020!\n\002\b\004\n\002\030\002\n\000\n\002\020 \n\002\020\034\n\000\n\002\020\017\n\000\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\b\002\032&\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\004\032\002H\002H\b¢\006\002\020\005\032\031\020\006\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\b\032!\020\006\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\007\032\0020\bH\b\032\036\020\t\032\b\022\004\022\002H\0020\n\"\004\b\000\020\002*\b\022\004\022\002H\0020\013H\007\032&\020\t\032\b\022\004\022\002H\0020\n\"\004\b\000\020\002*\b\022\004\022\002H\0020\0132\006\020\007\032\0020\bH\007\032 \020\f\032\0020\001\"\016\b\000\020\002*\b\022\004\022\002H\0020\r*\b\022\004\022\002H\0020\003\0323\020\f\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\030\020\016\032\024\022\004\022\002H\002\022\004\022\002H\002\022\004\022\0020\0200\017H\b\0325\020\f\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\032\020\021\032\026\022\006\b\000\022\002H\0020\022j\n\022\006\b\000\022\002H\002`\023H\b\0322\020\024\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\032\020\021\032\026\022\006\b\000\022\002H\0020\022j\n\022\006\b\000\022\002H\002`\023¨\006\025"}, c={"fill", "", "T", "", "value", "(Ljava/util/List;Ljava/lang/Object;)V", "shuffle", "random", "Ljava/util/Random;", "shuffled", "", "", "sort", "", "comparison", "Lkotlin/Function2;", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "sortWith", "kotlin-stdlib"}, d=1)
public class p
  extends o
{
  public static final <T> void a(List<T> paramList, Comparator<? super T> paramComparator)
  {
    b.f.b.j.b(paramList, "receiver$0");
    b.f.b.j.b(paramComparator, "comparator");
    if (paramList.size() > 1) {
      Collections.sort(paramList, paramComparator);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
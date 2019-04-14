package b.k;

import b.a.a;
import b.f.b.k;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

@b.j(a={1, 1, 13}, b={"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\r\n\002\b\002\n\002\020 \n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\n\020\033\032\004\030\0010\001H\026R\032\020\007\032\b\022\004\022\0020\t0\b8VX\004¢\006\006\032\004\b\n\020\013R\026\020\f\032\n\022\004\022\0020\t\030\0010\bX\016¢\006\002\n\000R\024\020\r\032\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\016\020\004\032\0020\005X\004¢\006\002\n\000R\026\020\021\032\n \023*\004\030\0010\0220\022X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\024\032\0020\0258VX\004¢\006\006\032\004\b\026\020\027R\024\020\030\032\0020\t8VX\004¢\006\006\032\004\b\031\020\032¨\006\034"}, c={"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "kotlin.jvm.PlatformType", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"})
public final class i
  implements h
{
  final MatchResult a;
  private final f b;
  private List<String> c;
  private final Matcher d;
  private final CharSequence e;
  
  public i(Matcher paramMatcher, CharSequence paramCharSequence)
  {
    this.d = paramMatcher;
    this.e = paramCharSequence;
    this.a = this.d.toMatchResult();
    this.b = ((f)new b(this));
  }
  
  public final List<String> a()
  {
    if (this.c == null) {
      this.c = ((List)new a(this));
    }
    List localList = this.c;
    if (localList == null) {
      b.f.b.j.a();
    }
    return localList;
  }
  
  public final h.a b()
  {
    return new h.a(this);
  }
  
  @b.j(a={1, 1, 13}, b={"\000\027\n\000\n\002\030\002\n\002\020\016\n\000\n\002\020\b\n\002\b\005*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\021\020\007\032\0020\0022\006\020\b\032\0020\004H\002R\024\020\003\032\0020\0048VX\004¢\006\006\032\004\b\005\020\006¨\006\t"}, c={"kotlin/text/MatcherMatchResult$groupValues$1", "Lkotlin/collections/AbstractList;", "", "size", "", "getSize", "()I", "get", "index", "kotlin-stdlib"})
  public static final class a
    extends b.a.b<String>
  {
    public final int a()
    {
      return this.b.a.groupCount() + 1;
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000-\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\016\n\000\n\002\020\013\n\000\n\002\020(\n\000*\001\000\b\n\030\0002\0020\0012\n\022\006\022\004\030\0010\0030\002J\023\020\b\032\004\030\0010\0032\006\020\t\032\0020\005H\002J\023\020\b\032\004\030\0010\0032\006\020\n\032\0020\013H\002J\b\020\f\032\0020\rH\026J\021\020\016\032\n\022\006\022\004\030\0010\0030\017H\002R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, c={"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"})
  public static final class b
    extends a<e>
    implements g
  {
    public final int a()
    {
      return this.a.a.groupCount() + 1;
    }
    
    public final boolean isEmpty()
    {
      return false;
    }
    
    public final Iterator<e> iterator()
    {
      return b.j.i.d(b.a.j.n((Iterable)b.a.j.a(this)), (b.f.a.b)new a(this)).a();
    }
    
    @b.j(a={1, 1, 13}, b={"\000\016\n\000\n\002\030\002\n\000\n\002\020\b\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, c={"<anonymous>", "Lkotlin/text/MatchGroup;", "it", "", "invoke"})
    static final class a
      extends k
      implements b.f.a.b<Integer, e>
    {
      a(i.b paramb)
      {
        super();
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/k/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
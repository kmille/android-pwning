package b.k;

import b.f.b.a.a;
import b.h.c;
import b.j;
import b.j.h;
import java.util.Iterator;

@j(a={1, 1, 13}, b={"\000:\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020(\n\000\b\002\030\0002\b\022\004\022\0020\0020\001BY\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\006\022:\020\b\0326\022\004\022\0020\004\022\023\022\0210\006¢\006\f\b\n\022\b\b\013\022\004\b\b(\f\022\022\022\020\022\004\022\0020\006\022\004\022\0020\006\030\0010\r0\t¢\006\002\b\016¢\006\002\020\017J\017\020\020\032\b\022\004\022\0020\0020\021H\002RB\020\b\0326\022\004\022\0020\004\022\023\022\0210\006¢\006\f\b\n\022\b\b\013\022\004\b\b(\f\022\022\022\020\022\004\022\0020\006\022\004\022\0020\006\030\0010\r0\t¢\006\002\b\016X\004¢\006\002\n\000R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\007\032\0020\006X\004¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\022"}, c={"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"})
final class d
  implements h<c>
{
  final CharSequence a;
  final int b;
  final int c;
  final b.f.a.m<CharSequence, Integer, b.m<Integer, Integer>> d;
  
  public d(CharSequence paramCharSequence, b.f.a.m<? super CharSequence, ? super Integer, b.m<Integer, Integer>> paramm)
  {
    this.a = paramCharSequence;
    this.b = 0;
    this.c = 0;
    this.d = paramm;
  }
  
  public final Iterator<c> a()
  {
    return (Iterator)new a(this);
  }
  
  @j(a={1, 1, 13}, b={"\000%\n\000\n\002\020(\n\002\030\002\n\000\n\002\020\b\n\002\b\023\n\002\020\002\n\000\n\002\020\013\n\002\b\002*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\b\020\027\032\0020\030H\002J\t\020\031\032\0020\032H\002J\t\020\033\032\0020\002H\002R\032\020\003\032\0020\004X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\bR\032\020\t\032\0020\004X\016¢\006\016\n\000\032\004\b\n\020\006\"\004\b\013\020\bR\034\020\f\032\004\030\0010\002X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020R\032\020\021\032\0020\004X\016¢\006\016\n\000\032\004\b\022\020\006\"\004\b\023\020\bR\032\020\024\032\0020\004X\016¢\006\016\n\000\032\004\b\025\020\006\"\004\b\026\020\b¨\006\034"}, c={"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"})
  public static final class a
    implements a, Iterator<c>
  {
    private int b = -1;
    private int c;
    private int d;
    private c e;
    private int f;
    
    a()
    {
      int j = localStringBuilder.b;
      int k = localStringBuilder.a.length();
      if (k >= 0)
      {
        int i;
        if (j < 0)
        {
          i = 0;
        }
        else
        {
          i = j;
          if (j > k) {
            i = k;
          }
        }
        this.c = i;
        this.d = this.c;
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder("Cannot coerce value to an empty range: maximum ");
      localStringBuilder.append(k);
      localStringBuilder.append(" is less than minimum 0.");
      throw ((Throwable)new IllegalArgumentException(localStringBuilder.toString()));
    }
    
    private final void a()
    {
      int j = this.d;
      int i = 0;
      if (j < 0)
      {
        this.b = 0;
        this.e = null;
        return;
      }
      int k = this.a.c;
      j = -1;
      if (k > 0)
      {
        this.f += 1;
        if (this.f >= this.a.c) {}
      }
      else
      {
        if (this.d <= this.a.a.length()) {
          break label118;
        }
      }
      Object localObject = new c(this.c, l.a(this.a.a));
      this.e = ((c)localObject);
      for (i = j;; i = k + i)
      {
        this.d = i;
        break label241;
        label118:
        localObject = (b.m)this.a.d.a(this.a.a, Integer.valueOf(this.d));
        if (localObject == null)
        {
          localObject = new c(this.c, l.a(this.a.a));
          break;
        }
        k = ((Number)((b.m)localObject).a).intValue();
        j = ((Number)((b.m)localObject).b).intValue();
        this.e = b.h.d.a(this.c, k);
        this.c = (k + j);
        k = this.c;
        if (j == 0) {
          i = 1;
        }
      }
      label241:
      this.b = 1;
    }
    
    public final boolean hasNext()
    {
      if (this.b == -1) {
        a();
      }
      return this.b == 1;
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/k/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
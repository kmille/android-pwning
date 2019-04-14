package b.j;

import b.a.e;
import b.f.a.b;
import java.util.Iterator;

@b.j(a={1, 1, 13}, b={"\000@\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020(\n\002\b\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\021\n\002\b\006\n\002\020\034\n\002\b\005\n\002\030\002\n\002\020 \n\000\032+\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\024\b\004\020\003\032\016\022\n\022\b\022\004\022\002H\0020\0050\004H\b\032\022\020\006\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002\032&\020\007\032\b\022\004\022\002H\0020\001\"\b\b\000\020\002*\0020\b2\016\020\t\032\n\022\006\022\004\030\001H\0020\004\032<\020\007\032\b\022\004\022\002H\0020\001\"\b\b\000\020\002*\0020\b2\016\020\n\032\n\022\006\022\004\030\001H\0020\0042\024\020\t\032\020\022\004\022\002H\002\022\006\022\004\030\001H\0020\013\032=\020\007\032\b\022\004\022\002H\0020\001\"\b\b\000\020\002*\0020\b2\b\020\f\032\004\030\001H\0022\024\020\t\032\020\022\004\022\002H\002\022\006\022\004\030\001H\0020\013H\007¢\006\002\020\r\032+\020\016\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\022\020\017\032\n\022\006\b\001\022\002H\0020\020\"\002H\002¢\006\002\020\021\032\034\020\022\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\005\032\034\020\023\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\001\032C\020\024\032\b\022\004\022\002H\0250\001\"\004\b\000\020\002\"\004\b\001\020\025*\b\022\004\022\002H\0020\0012\030\020\003\032\024\022\004\022\002H\002\022\n\022\b\022\004\022\002H\0250\0050\013H\002¢\006\002\b\026\032)\020\024\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\016\022\n\022\b\022\004\022\002H\0020\0270\001H\007¢\006\002\b\030\032\"\020\024\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\016\022\n\022\b\022\004\022\002H\0020\0010\001\0322\020\031\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\022\020\032\032\016\022\n\022\b\022\004\022\002H\0020\0010\004H\007\032!\020\033\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\n\022\004\022\002H\002\030\0010\001H\b\032@\020\034\032\032\022\n\022\b\022\004\022\002H\0020\036\022\n\022\b\022\004\022\002H\0250\0360\035\"\004\b\000\020\002\"\004\b\001\020\025*\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0250\0350\001¨\006\037"}, c={"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "generateSequence", "", "nextFunction", "seedFunction", "Lkotlin/Function1;", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "R", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "ifEmpty", "defaultValue", "orEmpty", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, d=1)
public class l
  extends k
{
  public static final <T> h<T> a(b.f.a.a<? extends T> parama)
  {
    b.f.b.j.b(parama, "nextFunction");
    return i.a((h)new g(parama, (b)new c(parama)));
  }
  
  public static final <T> h<T> a(h<? extends T> paramh)
  {
    b.f.b.j.b(paramh, "receiver$0");
    return (h)new a(paramh);
  }
  
  public static final <T> h<T> a(T paramT, b<? super T, ? extends T> paramb)
  {
    b.f.b.j.b(paramb, "nextFunction");
    if (paramT == null) {
      return (h)d.a;
    }
    return (h)new g((b.f.a.a)new d(paramT), paramb);
  }
  
  public static final <T> h<T> a(T... paramVarArgs)
  {
    b.f.b.j.b(paramVarArgs, "elements");
    int i;
    if (paramVarArgs.length == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return (h)d.a;
    }
    return e.k(paramVarArgs);
  }
  
  @b.j(a={1, 1, 13}, b={"\000\020\n\000\n\002\020(\n\002\b\002\n\002\030\002\n\000\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\f\020\003\032\b\022\004\022\002H\0020\004H\n¢\006\002\b\005"}, c={"<anonymous>", "", "T", "it", "Lkotlin/sequences/Sequence;", "invoke"})
  public static final class a
    extends b.f.b.k
    implements b<h<? extends T>, Iterator<? extends T>>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\004\n\002\b\006\020\000\032\002H\001\"\004\b\000\020\001\"\004\b\001\020\0022\006\020\003\032\002H\001H\n¢\006\004\b\004\020\005"}, c={"<anonymous>", "T", "R", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"})
  public static final class b
    extends b.f.b.k
    implements b<T, T>
  {
    public static final b a = new b();
    
    b()
    {
      super();
    }
    
    public final T a(T paramT)
    {
      return paramT;
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\f\n\002\b\002\n\002\020\000\n\002\b\003\020\000\032\004\030\001H\001\"\b\b\000\020\001*\0020\0022\006\020\003\032\002H\001H\n¢\006\004\b\004\020\005"}, c={"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"})
  static final class c
    extends b.f.b.k
    implements b<T, T>
  {
    c(b.f.a.a parama)
    {
      super();
    }
    
    public final T a(T paramT)
    {
      b.f.b.j.b(paramT, "it");
      return (T)this.a.b_();
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\f\n\002\b\002\n\002\020\000\n\002\b\002\020\000\032\004\030\001H\001\"\b\b\000\020\001*\0020\002H\n¢\006\004\b\003\020\004"}, c={"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"})
  static final class d
    extends b.f.b.k
    implements b.f.a.a<T>
  {
    d(Object paramObject)
    {
      super();
    }
    
    public final T b_()
    {
      return (T)this.a;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/j/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
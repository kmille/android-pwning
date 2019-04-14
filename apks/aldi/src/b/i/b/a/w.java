package b.i.b.a;

import b.f.a.a;
import b.f.b.k;
import b.i.b.a.c.b.ar;
import b.i.o;
import b.i.p;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000H\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\002\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\000\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\023\020\032\032\0020\t2\b\020\033\032\004\030\0010\034H\002J\b\020\035\032\0020\036H\026J\b\020\037\032\0020\fH\026R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\t8VX\004¢\006\006\032\004\b\b\020\nR\024\020\013\032\0020\f8VX\004¢\006\006\032\004\b\r\020\016R!\020\017\032\b\022\004\022\0020\0210\0208VX\002¢\006\f\n\004\b\024\020\025\032\004\b\022\020\023R\024\020\026\032\0020\0278VX\004¢\006\006\032\004\b\030\020\031¨\006 "}, c={"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "isReified", "", "()Z", "name", "", "getName", "()Ljava/lang/String;", "upperBounds", "", "Lkotlin/reflect/KType;", "getUpperBounds", "()Ljava/util/List;", "upperBounds$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "variance", "Lkotlin/reflect/KVariance;", "getVariance", "()Lkotlin/reflect/KVariance;", "equals", "other", "", "hashCode", "", "toString", "kotlin-reflect-api"})
public final class w
  implements p
{
  final ar b;
  private final z.a c;
  
  public w(ar paramar)
  {
    this.b = paramar;
    this.c = z.a(null, (a)new a(this));
  }
  
  public final List<o> a()
  {
    return (List)this.c.a();
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof w)) && (b.f.b.j.a(this.b, ((w)paramObject).b));
  }
  
  public final int hashCode()
  {
    return this.b.hashCode();
  }
  
  public final String toString()
  {
    ab localab = ab.a;
    return ab.a(this.b);
  }
  
  @b.j(a={1, 1, 13}, b={"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, c={"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "invoke"})
  static final class a
    extends k
    implements a<List<? extends u>>
  {
    a(w paramw)
    {
      super();
    }
    
    @b.j(a={1, 1, 13}, b={"\000\n\n\000\n\002\020\001\n\002\b\002\020\000\032\0020\001H\n¢\006\002\b\002¨\006\003"}, c={"<anonymous>", "", "invoke", "kotlin/reflect/jvm/internal/KTypeParameterImpl$upperBounds$2$1$1"})
    static final class a
      extends k
      implements a
    {
      a(w.a parama)
      {
        super();
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
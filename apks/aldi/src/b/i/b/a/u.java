package b.i.b.a;

import b.d;
import b.i.b.a.c.b.aq;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.e;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.av;
import b.i.b.a.e.b;
import b.i.c;
import b.i.o;
import b.i.q;
import b.l;
import java.lang.reflect.Type;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000T\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\020\033\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\n\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\000\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\007J\022\020 \032\004\030\0010\0232\006\020\002\032\0020\003H\002J\023\020!\032\0020\0302\b\020\"\032\004\030\0010#H\002J\b\020$\032\0020%H\026J\b\020&\032\0020'H\026R\032\020\b\032\b\022\004\022\0020\n0\t8VX\004¢\006\006\032\004\b\013\020\fR!\020\r\032\b\022\004\022\0020\0160\t8VX\002¢\006\f\n\004\b\020\020\021\032\004\b\017\020\fR\035\020\022\032\004\030\0010\0238VX\002¢\006\f\n\004\b\026\020\021\032\004\b\024\020\025R\024\020\027\032\0020\0308VX\004¢\006\006\032\004\b\027\020\031R\033\020\032\032\0020\0068@X\002¢\006\f\n\004\b\035\020\021\032\004\b\033\020\034R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\036\020\037¨\006(²\006\020\020)\032\b\022\004\022\0020\0060\tX\002"}, c={"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "computeJavaType", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "arguments", "Lkotlin/reflect/KTypeProjection;", "getArguments", "arguments$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "classifier", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier$delegate", "isMarkedNullable", "", "()Z", "javaType", "getJavaType$kotlin_reflect_api", "()Ljava/lang/reflect/Type;", "javaType$delegate", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "convert", "equals", "other", "", "hashCode", "", "toString", "", "kotlin-reflect-api", "parameterizedTypeArguments"})
public final class u
  implements o
{
  public final b.i.b.a.c.l.w b;
  private final z.a c;
  private final z.a d;
  private final z.a e;
  
  public u(b.i.b.a.c.l.w paramw, b.f.a.a<? extends Type> parama)
  {
    this.b = paramw;
    this.c = z.a(null, parama);
    this.d = z.a(null, (b.f.a.a)new b(this));
    this.e = z.a(null, (b.f.a.a)new a(this));
  }
  
  private final c a(b.i.b.a.c.l.w paramw)
  {
    Object localObject = paramw.f().c();
    if ((localObject instanceof e))
    {
      localObject = af.a((e)localObject);
      if (localObject == null) {
        return null;
      }
      if (((Class)localObject).isArray())
      {
        paramw = (ap)b.a.j.h(paramw.a());
        if (paramw != null)
        {
          paramw = paramw.c();
          if (paramw != null)
          {
            b.f.b.j.a(paramw, "type.arguments.singleOrN…return KClassImpl(jClass)");
            paramw = a(paramw);
            if (paramw != null) {
              return (c)new g(b.g(b.f.a.a(b.i.b.a.a(paramw))));
            }
            throw ((Throwable)new x("Cannot determine classifier for array element type: ".concat(String.valueOf(this))));
          }
        }
        paramw = new g((Class)localObject);
      }
    }
    for (;;)
    {
      return (c)paramw;
      if (!av.e(paramw))
      {
        paramw = b.c((Class)localObject);
        if (paramw == null) {
          paramw = (b.i.b.a.c.l.w)localObject;
        }
        paramw = new g(paramw);
      }
      else
      {
        paramw = new g((Class)localObject);
        continue;
        if (!(localObject instanceof ar)) {
          break;
        }
        paramw = new w((ar)localObject);
      }
    }
    if (!(localObject instanceof aq)) {
      return null;
    }
    throw ((Throwable)new l("An operation is not implemented: ".concat(String.valueOf("Type alias classifiers are not yet supported"))));
  }
  
  public final c a()
  {
    return (c)this.d.a();
  }
  
  public final Type b()
  {
    return (Type)this.c.a();
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof u)) && (b.f.b.j.a(this.b, ((u)paramObject).b));
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
  
  @b.j(a={1, 1, 13}, b={"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, c={"<anonymous>", "", "Lkotlin/reflect/KTypeProjection;", "invoke"})
  static final class a
    extends b.f.b.k
    implements b.f.a.a<List<? extends q>>
  {
    a(u paramu)
    {
      super();
    }
    
    @b.j(a={1, 1, 13}, b={"\000\n\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001H\n¢\006\002\b\002¨\006\003"}, c={"<anonymous>", "Ljava/lang/reflect/Type;", "invoke", "kotlin/reflect/jvm/internal/KTypeImpl$arguments$2$1$type$1"})
    static final class a
      extends b.f.b.k
      implements b.f.a.a<Type>
    {
      a(int paramInt, u.a parama, d paramd, b.i.k paramk)
      {
        super();
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, c={"<anonymous>", "", "Ljava/lang/reflect/Type;", "invoke"})
    static final class b
      extends b.f.b.k
      implements b.f.a.a<List<? extends Type>>
    {
      b(u.a parama)
      {
        super();
      }
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\b\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001H\n¢\006\002\b\002"}, c={"<anonymous>", "Lkotlin/reflect/KClassifier;", "invoke"})
  static final class b
    extends b.f.b.k
    implements b.f.a.a<c>
  {
    b(u paramu)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
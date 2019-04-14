package b.i.b.a;

import b.d;
import b.e;
import b.f.a.a;
import b.f.b.k;
import b.i.b.a.c.b.ah;
import b.i.m;
import b.i.m.a;
import java.lang.reflect.Field;

@b.j(a={1, 1, 13}, b={"\000H\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\n\b\020\030\000*\004\b\000\020\001*\006\b\001\020\002 \0012\016\022\004\022\002H\001\022\004\022\002H\0020\0032\b\022\004\022\002H\0020\004:\001\037B)\b\026\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\b\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\027\b\026\022\006\020\005\032\0020\006\022\006\020\r\032\0020\016¢\006\002\020\017J\025\020\032\032\0028\0012\006\020\033\032\0028\000H\026¢\006\002\020\034J\027\020\035\032\004\030\0010\0132\006\020\033\032\0028\000H\026¢\006\002\020\034J\026\020\036\032\0028\0012\006\020\033\032\0028\000H\002¢\006\002\020\034R4\020\020\032(\022$\022\"\022\004\022\0028\000\022\004\022\0028\001 \023*\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0220\0220\021X\004¢\006\002\n\000R\026\020\024\032\n\022\006\022\004\030\0010\0260\025X\004¢\006\002\n\000R \020\027\032\016\022\004\022\0028\000\022\004\022\0028\0010\0228VX\004¢\006\006\032\004\b\030\020\031¨\006 "}, c={"Lkotlin/reflect/jvm/internal/KProperty1Impl;", "T", "R", "Lkotlin/reflect/KProperty1;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_getter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "kotlin.jvm.PlatformType", "delegateField", "Lkotlin/Lazy;", "Ljava/lang/reflect/Field;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "get", "receiver", "(Ljava/lang/Object;)Ljava/lang/Object;", "getDelegate", "invoke", "Getter", "kotlin-reflect-api"})
public class q<T, R>
  extends s<R>
  implements m<T, R>
{
  private final z.b<a<T, R>> a;
  private final d<Field> g;
  
  public q(i parami, ah paramah)
  {
    super(parami, paramah);
    parami = z.a((a)new b(this));
    b.f.b.j.a(parami, "ReflectProperties.lazy { Getter(this) }");
    this.a = parami;
    this.g = e.a(b.i.b, (a)new c(this));
  }
  
  public q(i parami, String paramString1, String paramString2, Object paramObject)
  {
    super(parami, paramString1, paramString2, paramObject);
    parami = z.a((a)new b(this));
    b.f.b.j.a(parami, "ReflectProperties.lazy { Getter(this) }");
    this.a = parami;
    this.g = e.a(b.i.b, (a)new c(this));
  }
  
  private a<T, R> j()
  {
    Object localObject = this.a.a();
    b.f.b.j.a(localObject, "_getter()");
    return (a)localObject;
  }
  
  public final R a(T paramT)
  {
    return (R)b(paramT);
  }
  
  public final R b(T paramT)
  {
    return (R)j().a(new Object[] { paramT });
  }
  
  @b.j(a={1, 1, 13}, b={"\000\032\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\030\000*\004\b\002\020\001*\006\b\003\020\002 \0012\b\022\004\022\002H\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\004B\031\022\022\020\005\032\016\022\004\022\0028\002\022\004\022\0028\0030\006¢\006\002\020\007J\026\020\n\032\0028\0032\006\020\013\032\0028\002H\002¢\006\002\020\fR \020\005\032\016\022\004\022\0028\002\022\004\022\0028\0030\006X\004¢\006\b\n\000\032\004\b\b\020\t¨\006\r"}, c={"Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "T", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty1$Getter;", "property", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "(Lkotlin/reflect/jvm/internal/KProperty1Impl;)V", "getProperty", "()Lkotlin/reflect/jvm/internal/KProperty1Impl;", "invoke", "receiver", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
  public static final class a<T, R>
    extends s.c<R>
    implements m.a<T, R>
  {
    private final q<T, R> b;
    
    public a(q<T, ? extends R> paramq)
    {
      this.b = paramq;
    }
    
    public final R a(T paramT)
    {
      return (R)this.b.b(paramT);
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\n\n\000\n\002\030\002\n\002\b\003\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\006\b\001\020\003 \001H\n¢\006\002\b\004"}, c={"<anonymous>", "Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "T", "R", "invoke"})
  static final class b
    extends k
    implements a<q.a<T, ? extends R>>
  {
    b(q paramq)
    {
      super();
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\n\n\000\n\002\030\002\n\002\b\003\020\000\032\004\030\0010\001\"\004\b\000\020\002\"\006\b\001\020\003 \001H\n¢\006\002\b\004"}, c={"<anonymous>", "Ljava/lang/reflect/Field;", "T", "R", "invoke"})
  static final class c
    extends k
    implements a<Field>
  {
    c(q paramq)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package b.i.b.a;

import b.d;
import b.e;
import b.f.a.a;
import b.f.b.k;
import b.i.b.a.c.b.ah;
import b.i.n;
import b.i.n.a;
import java.lang.reflect.Field;

@b.j(a={1, 1, 13}, b={"\000H\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\b\n\002\020\000\n\002\b\003\b\020\030\000*\004\b\000\020\001*\004\b\001\020\002*\006\b\002\020\003 \0012\024\022\004\022\002H\001\022\004\022\002H\002\022\004\022\002H\0030\0042\b\022\004\022\002H\0030\005:\001 B\037\b\026\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\t¢\006\002\020\013B\027\b\026\022\006\020\006\032\0020\007\022\006\020\f\032\0020\r¢\006\002\020\016J\035\020\031\032\0028\0022\006\020\032\032\0028\0002\006\020\033\032\0028\001H\026¢\006\002\020\034J\037\020\035\032\004\030\0010\0362\006\020\032\032\0028\0002\006\020\033\032\0028\001H\026¢\006\002\020\034J\036\020\037\032\0028\0022\006\020\032\032\0028\0002\006\020\033\032\0028\001H\002¢\006\002\020\034R@\020\017\0324\0220\022.\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0028\002 \022*\026\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0028\002\030\0010\0210\0210\020X\004¢\006\002\n\000R\026\020\023\032\n\022\006\022\004\030\0010\0250\024X\004¢\006\002\n\000R&\020\026\032\024\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0028\0020\0218VX\004¢\006\006\032\004\b\027\020\030¨\006!"}, c={"Lkotlin/reflect/jvm/internal/KProperty2Impl;", "D", "E", "R", "Lkotlin/reflect/KProperty2;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_getter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "kotlin.jvm.PlatformType", "delegateField", "Lkotlin/Lazy;", "Ljava/lang/reflect/Field;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "get", "receiver1", "receiver2", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getDelegate", "", "invoke", "Getter", "kotlin-reflect-api"})
public class r<D, E, R>
  extends s<R>
  implements n<D, E, R>
{
  private final z.b<a<D, E, R>> a;
  private final d<Field> g;
  
  public r(i parami, ah paramah)
  {
    super(parami, paramah);
    parami = z.a((a)new b(this));
    b.f.b.j.a(parami, "ReflectProperties.lazy { Getter(this) }");
    this.a = parami;
    this.g = e.a(b.i.b, (a)new c(this));
  }
  
  private a<D, E, R> a()
  {
    Object localObject = this.a.a();
    b.f.b.j.a(localObject, "_getter()");
    return (a)localObject;
  }
  
  public final R a(D paramD, E paramE)
  {
    return (R)b(paramD, paramE);
  }
  
  public final R b(D paramD, E paramE)
  {
    return (R)a().a(new Object[] { paramD, paramE });
  }
  
  @b.j(a={1, 1, 13}, b={"\000\032\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\b\030\000*\004\b\003\020\001*\004\b\004\020\002*\006\b\005\020\003 \0012\b\022\004\022\002H\0030\0042\024\022\004\022\002H\001\022\004\022\002H\002\022\004\022\002H\0030\005B\037\022\030\020\006\032\024\022\004\022\0028\003\022\004\022\0028\004\022\004\022\0028\0050\007¢\006\002\020\bJ\036\020\013\032\0028\0052\006\020\f\032\0028\0032\006\020\r\032\0028\004H\002¢\006\002\020\016R&\020\006\032\024\022\004\022\0028\003\022\004\022\0028\004\022\004\022\0028\0050\007X\004¢\006\b\n\000\032\004\b\t\020\n¨\006\017"}, c={"Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "D", "E", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty2$Getter;", "property", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "(Lkotlin/reflect/jvm/internal/KProperty2Impl;)V", "getProperty", "()Lkotlin/reflect/jvm/internal/KProperty2Impl;", "invoke", "receiver1", "receiver2", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
  public static final class a<D, E, R>
    extends s.c<R>
    implements n.a<D, E, R>
  {
    private final r<D, E, R> b;
    
    public a(r<D, E, ? extends R> paramr)
    {
      this.b = paramr;
    }
    
    public final R a(D paramD, E paramE)
    {
      return (R)this.b.b(paramD, paramE);
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\n\n\000\n\002\030\002\n\002\b\004\020\000\032\024\022\004\022\002H\002\022\004\022\002H\003\022\004\022\002H\0040\001\"\004\b\000\020\002\"\004\b\001\020\003\"\006\b\002\020\004 \001H\n¢\006\002\b\005"}, c={"<anonymous>", "Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "D", "E", "R", "invoke"})
  static final class b
    extends k
    implements a<r.a<D, E, ? extends R>>
  {
    b(r paramr)
    {
      super();
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\n\n\000\n\002\030\002\n\002\b\004\020\000\032\004\030\0010\001\"\004\b\000\020\002\"\004\b\001\020\003\"\006\b\002\020\004 \001H\n¢\006\002\b\005"}, c={"<anonymous>", "Ljava/lang/reflect/Field;", "D", "E", "R", "invoke"})
  static final class c
    extends k
    implements a<Field>
  {
    c(r paramr)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package b.i.b.a.a;

import b.f.b.k;
import b.h.c;
import b.i;
import b.i.b.a.c.b.b;
import b.i.b.a.x;
import b.r;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000Z\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\b\n\002\020 \n\002\030\002\n\002\b\006\n\002\020\000\n\000\n\002\020\021\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\b\000\030\000*\n\b\000\020\001 \001*\0020\0022\b\022\004\022\002H\0010\003:\001'B#\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0028\0000\007\022\006\020\b\032\0020\t¢\006\002\020\nJ\033\020\034\032\004\030\0010\0352\n\020\036\032\006\022\002\b\0030\037H\026¢\006\002\020 J\020\020!\032\0020\"*\006\022\002\b\0030#H\002J\020\020$\032\0020\"*\006\022\002\b\0030#H\002J\022\020%\032\b\022\002\b\003\030\0010#*\0020&H\002R\024\020\006\032\b\022\004\022\0028\0000\007X\004¢\006\002\n\000R\033\020\013\032\0020\f8BX\002¢\006\f\n\004\b\017\020\020\032\004\b\r\020\016R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\024\020\021\032\0028\0008VX\004¢\006\006\032\004\b\022\020\023R\032\020\024\032\b\022\004\022\0020\0260\0258VX\004¢\006\006\032\004\b\027\020\030R\024\020\031\032\0020\0268VX\004¢\006\006\032\004\b\032\020\033¨\006("}, c={"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "caller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "isDefault", "", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/CallerImpl;Z)V", "data", "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "getData", "()Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "data$delegate", "Lkotlin/Lazy;", "member", "getMember", "()Ljava/lang/reflect/Member;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "getBoxMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "getUnboxMethod", "toInlineClass", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "BoxUnboxData", "kotlin-reflect-api"})
public final class g<M extends Member>
  implements d<M>
{
  final e<M> b;
  private final b.d c;
  private final b d;
  private final boolean e;
  
  public g(b paramb, e<? extends M> parame, boolean paramBoolean)
  {
    this.d = paramb;
    this.b = parame;
    this.e = paramBoolean;
    this.c = b.e.a(i.b, (b.f.a.a)new b(this));
  }
  
  private final Method a(Class<?> paramClass)
  {
    try
    {
      localObject = paramClass.getDeclaredMethod("box-impl", new Class[] { b(paramClass).getReturnType() });
      b.f.b.j.a(localObject, "getDeclaredMethod(\"box\" …UnboxMethod().returnType)");
      return (Method)localObject;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Object localObject;
      for (;;) {}
    }
    localObject = new StringBuilder("No box method found in inline class: ");
    ((StringBuilder)localObject).append(paramClass);
    ((StringBuilder)localObject).append(" (calling ");
    ((StringBuilder)localObject).append(this.d);
    ((StringBuilder)localObject).append(')');
    throw ((Throwable)new x(((StringBuilder)localObject).toString()));
  }
  
  private final Method b(Class<?> paramClass)
  {
    try
    {
      localObject = paramClass.getDeclaredMethod("unbox-impl", new Class[0]);
      b.f.b.j.a(localObject, "getDeclaredMethod(\"unbox…FOR_INLINE_CLASS_MEMBERS)");
      return (Method)localObject;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Object localObject;
      for (;;) {}
    }
    localObject = new StringBuilder("No unbox method found in inline class: ");
    ((StringBuilder)localObject).append(paramClass);
    ((StringBuilder)localObject).append(" (calling ");
    ((StringBuilder)localObject).append(this.d);
    ((StringBuilder)localObject).append(')');
    throw ((Throwable)new x(((StringBuilder)localObject).toString()));
  }
  
  public final Object a(Object[] paramArrayOfObject)
  {
    b.f.b.j.b(paramArrayOfObject, "args");
    Object localObject2 = (a)this.c.a();
    Object localObject1 = ((a)localObject2).a;
    Method[] arrayOfMethod = ((a)localObject2).b;
    Method localMethod1 = ((a)localObject2).c;
    Object[] arrayOfObject = Arrays.copyOf(paramArrayOfObject, paramArrayOfObject.length);
    b.f.b.j.a(arrayOfObject, "java.util.Arrays.copyOf(this, size)");
    if (arrayOfObject != null)
    {
      int i = ((b.h.a)localObject1).a;
      int j = ((b.h.a)localObject1).b;
      if (i <= j) {
        for (;;)
        {
          Method localMethod2 = arrayOfMethod[i];
          localObject2 = paramArrayOfObject[i];
          localObject1 = localObject2;
          if (localMethod2 != null)
          {
            localObject1 = localObject2;
            if (localObject2 != null) {
              localObject1 = localMethod2.invoke(localObject2, new Object[0]);
            }
          }
          arrayOfObject[i] = localObject1;
          if (i == j) {
            break;
          }
          i += 1;
        }
      }
      localObject1 = this.b.a(arrayOfObject);
      paramArrayOfObject = (Object[])localObject1;
      if (localMethod1 != null)
      {
        paramArrayOfObject = localMethod1.invoke(null, new Object[] { localObject1 });
        if (paramArrayOfObject == null) {
          return localObject1;
        }
      }
      return paramArrayOfObject;
    }
    throw new r("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
  }
  
  public final M a()
  {
    return this.b.b;
  }
  
  public final Type b()
  {
    return this.b.c;
  }
  
  public final List<Type> c()
  {
    return this.b.a;
  }
  
  @b.j(a={1, 1, 13}, b={"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\r\b\002\030\0002\0020\001B'\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\006\022\004\030\0010\0060\005\022\b\020\007\032\004\030\0010\006¢\006\002\020\bJ\t\020\020\032\0020\003H\002J\026\020\021\032\n\022\006\022\004\030\0010\0060\005H\002¢\006\002\020\016J\013\020\022\032\004\030\0010\006H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\023\020\007\032\004\030\0010\006¢\006\b\n\000\032\004\b\013\020\fR\033\020\004\032\n\022\006\022\004\030\0010\0060\005¢\006\n\n\002\020\017\032\004\b\r\020\016¨\006\023"}, c={"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "", "argumentRange", "Lkotlin/ranges/IntRange;", "unbox", "", "Ljava/lang/reflect/Method;", "box", "(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getArgumentRange", "()Lkotlin/ranges/IntRange;", "getBox", "()Ljava/lang/reflect/Method;", "getUnbox", "()[Ljava/lang/reflect/Method;", "[Ljava/lang/reflect/Method;", "component1", "component2", "component3", "kotlin-reflect-api"})
  static final class a
  {
    final c a;
    final Method[] b;
    final Method c;
    
    public a(c paramc, Method[] paramArrayOfMethod, Method paramMethod)
    {
      this.a = paramc;
      this.b = paramArrayOfMethod;
      this.c = paramMethod;
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\001\"\n\b\000\020\002 \001*\0020\003H\n¢\006\002\b\004"}, c={"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "M", "Ljava/lang/reflect/Member;", "invoke"})
  static final class b
    extends k
    implements b.f.a.a<g.a>
  {
    b(g paramg)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
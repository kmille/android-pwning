package b.i.b.a.b;

import b.a.e;
import b.i.b.a.c.a.g.a;
import b.i.b.a.c.a.h;
import b.i.b.a.c.b.am;
import b.i.b.a.c.d.b.n.a;
import b.i.b.a.c.d.b.n.b;
import b.i.b.a.c.d.b.n.c;
import b.i.b.a.c.d.b.n.d;
import b.i.b.a.c.f.f;
import b.r;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Set;

@b.j(a={1, 1, 13}, b={"\000B\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\033\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\003\032\0020\0042\n\020\005\032\006\022\002\b\0030\0062\006\020\007\032\0020\bJ\034\020\t\032\0020\0042\n\020\005\032\006\022\002\b\0030\0062\006\020\n\032\0020\013H\002J\034\020\f\032\0020\0042\n\020\005\032\006\022\002\b\0030\0062\006\020\n\032\0020\013H\002J\034\020\r\032\0020\0042\n\020\005\032\006\022\002\b\0030\0062\006\020\n\032\0020\013H\002J\030\020\016\032\0020\0042\006\020\007\032\0020\b2\006\020\017\032\0020\020H\002J \020\021\032\0020\0042\006\020\007\032\0020\0222\006\020\023\032\0020\0242\006\020\025\032\0020\001H\002J$\020\026\032\0020\0042\006\020\007\032\0020\0222\006\020\017\032\0020\0202\n\020\027\032\006\022\002\b\0030\006H\002J\032\020\030\032\0020\0042\n\020\005\032\006\022\002\b\0030\0062\006\020\n\032\0020\013J\020\020\031\032\0020\032*\006\022\002\b\0030\006H\002¨\006\033"}, c={"Lkotlin/reflect/jvm/internal/components/ReflectClassStructure;", "", "()V", "loadClassAnnotations", "", "klass", "Ljava/lang/Class;", "visitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationVisitor;", "loadConstructorAnnotations", "memberVisitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$MemberVisitor;", "loadFieldAnnotations", "loadMethodAnnotations", "processAnnotation", "annotation", "", "processAnnotationArgumentValue", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationArgumentVisitor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "value", "processAnnotationArguments", "annotationType", "visitMembers", "classLiteralId", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$ClassLiteralId;", "descriptors.runtime"})
final class b
{
  public static final b a = new b();
  
  private static n.d a(Class<?> paramClass)
  {
    int i = 0;
    while (paramClass.isArray())
    {
      i += 1;
      paramClass = paramClass.getComponentType();
      b.f.b.j.a(paramClass, "currentClass.componentType");
    }
    if (paramClass.isPrimitive())
    {
      if (b.f.b.j.a(paramClass, Void.TYPE))
      {
        paramClass = b.i.b.a.c.f.a.a(b.i.b.a.c.a.g.k.e.b());
        b.f.b.j.a(paramClass, "ClassId.topLevel(KotlinB…s.FQ_NAMES.unit.toSafe())");
        return new n.d(paramClass, i);
      }
      paramClass = b.i.b.a.c.i.d.c.a(paramClass.getName());
      b.f.b.j.a(paramClass, "JvmPrimitiveType.get(currentClass.name)");
      paramClass = paramClass.i;
      b.f.b.j.a(paramClass, "JvmPrimitiveType.get(cur…Class.name).primitiveType");
      if (i > 0)
      {
        if (paramClass.m != null) {}
        for (;;)
        {
          paramClass = paramClass.m;
          break;
          paramClass.m = b.i.b.a.c.a.g.c.a(paramClass.k);
        }
        paramClass = b.i.b.a.c.f.a.a(paramClass);
        b.f.b.j.a(paramClass, "ClassId.topLevel(primitiveType.arrayTypeFqName)");
        return new n.d(paramClass, i - 1);
      }
      if (paramClass.l != null) {}
      for (;;)
      {
        paramClass = paramClass.l;
        break;
        paramClass.l = b.i.b.a.c.a.g.c.a(paramClass.j);
      }
      paramClass = b.i.b.a.c.f.a.a(paramClass);
      b.f.b.j.a(paramClass, "ClassId.topLevel(primitiveType.typeFqName)");
      return new n.d(paramClass, i);
    }
    paramClass = b.i.b.a.e.b.e(paramClass);
    Object localObject = b.i.b.a.c.a.b.c.b;
    localObject = paramClass.d();
    b.f.b.j.a(localObject, "javaClassId.asSingleFqName()");
    localObject = b.i.b.a.c.a.b.c.a((b.i.b.a.c.f.b)localObject);
    if (localObject != null) {
      paramClass = (Class<?>)localObject;
    }
    return new n.d(paramClass, i);
  }
  
  private final void a(n.a parama, f paramf, Object paramObject)
  {
    Object localObject = paramObject.getClass();
    if (b.f.b.j.a(localObject, Class.class))
    {
      if (paramObject != null)
      {
        parama.a(paramf, a((Class)paramObject));
        return;
      }
      throw new r("null cannot be cast to non-null type java.lang.Class<*>");
    }
    if (g.a().contains(localObject))
    {
      parama.a(paramf, paramObject);
      return;
    }
    if (b.i.b.a.e.b.b((Class)localObject))
    {
      if (!((Class)localObject).isEnum()) {
        localObject = ((Class)localObject).getEnclosingClass();
      }
      b.f.b.j.a(localObject, "(if (clazz.isEnum) clazz…lse clazz.enclosingClass)");
      localObject = b.i.b.a.e.b.e((Class)localObject);
      if (paramObject != null)
      {
        paramObject = f.a(((Enum)paramObject).name());
        b.f.b.j.a(paramObject, "Name.identifier((value as Enum<*>).name)");
        parama.a(paramf, (b.i.b.a.c.f.a)localObject, (f)paramObject);
        return;
      }
      throw new r("null cannot be cast to non-null type kotlin.Enum<*>");
    }
    if (Annotation.class.isAssignableFrom((Class)localObject))
    {
      localObject = ((Class)localObject).getInterfaces();
      b.f.b.j.a(localObject, "clazz.interfaces");
      localObject = (Class)e.e((Object[])localObject);
      b.f.b.j.a(localObject, "annotationClass");
      parama = parama.a(paramf, b.i.b.a.e.b.e((Class)localObject));
      if (parama == null) {
        return;
      }
      if (paramObject != null)
      {
        a(parama, (Annotation)paramObject, (Class)localObject);
        return;
      }
      throw new r("null cannot be cast to non-null type kotlin.Annotation");
    }
    if (((Class)localObject).isArray())
    {
      parama = parama.a(paramf);
      if (parama == null) {
        return;
      }
      paramf = ((Class)localObject).getComponentType();
      b.f.b.j.a(paramf, "componentType");
      boolean bool = paramf.isEnum();
      int j = 0;
      int k = 0;
      int i = 0;
      if (bool)
      {
        paramf = b.i.b.a.e.b.e(paramf);
        if (paramObject != null)
        {
          paramObject = (Object[])paramObject;
          j = paramObject.length;
          for (;;)
          {
            if (i >= j) {
              break label511;
            }
            localObject = paramObject[i];
            if (localObject == null) {
              break;
            }
            localObject = f.a(((Enum)localObject).name());
            b.f.b.j.a(localObject, "Name.identifier((element as Enum<*>).name)");
            parama.a(paramf, (f)localObject);
            i += 1;
          }
          throw new r("null cannot be cast to non-null type kotlin.Enum<*>");
        }
        throw new r("null cannot be cast to non-null type kotlin.Array<*>");
      }
      if (b.f.b.j.a(paramf, Class.class))
      {
        if (paramObject != null)
        {
          paramf = (Object[])paramObject;
          k = paramf.length;
          i = j;
          for (;;)
          {
            if (i >= k) {
              break label511;
            }
            paramObject = paramf[i];
            if (paramObject == null) {
              break;
            }
            parama.a(a((Class)paramObject));
            i += 1;
          }
          throw new r("null cannot be cast to non-null type java.lang.Class<*>");
        }
        throw new r("null cannot be cast to non-null type kotlin.Array<*>");
      }
      if (paramObject != null)
      {
        paramf = (Object[])paramObject;
        j = paramf.length;
        i = k;
        while (i < j)
        {
          parama.a(paramf[i]);
          i += 1;
        }
        label511:
        parama.a();
        return;
      }
      throw new r("null cannot be cast to non-null type kotlin.Array<*>");
    }
    parama = new StringBuilder("Unsupported annotation argument value (");
    parama.append(localObject);
    parama.append("): ");
    parama.append(paramObject);
    throw ((Throwable)new UnsupportedOperationException(parama.toString()));
  }
  
  static void a(n.c paramc, Annotation paramAnnotation)
  {
    Class localClass = b.f.a.a(b.f.a.a(paramAnnotation));
    paramc = paramc.a(b.i.b.a.e.b.e(localClass), (am)new a(paramAnnotation));
    if (paramc != null) {
      a.a(paramc, paramAnnotation, localClass);
    }
  }
  
  public static void a(Class<?> paramClass, n.c paramc)
  {
    b.f.b.j.b(paramClass, "klass");
    b.f.b.j.b(paramc, "visitor");
    paramClass = paramClass.getDeclaredAnnotations();
    int j = paramClass.length;
    int i = 0;
    while (i < j)
    {
      Object localObject = paramClass[i];
      b.f.b.j.a(localObject, "annotation");
      a(paramc, (Annotation)localObject);
      i += 1;
    }
    paramc.a();
  }
  
  final void a(n.a parama, Annotation paramAnnotation, Class<?> paramClass)
  {
    paramClass = paramClass.getDeclaredMethods();
    int j = paramClass.length;
    int i = 0;
    while (i < j)
    {
      Object localObject2 = paramClass[i];
      try
      {
        Object localObject1 = ((Method)localObject2).invoke(paramAnnotation, new Object[0]);
        if (localObject1 == null) {
          b.f.b.j.a();
        }
        b.f.b.j.a(localObject2, "method");
        localObject2 = f.a(((Method)localObject2).getName());
        b.f.b.j.a(localObject2, "Name.identifier(method.name)");
        a(parama, (f)localObject2, localObject1);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;) {}
      }
      i += 1;
    }
    parama.a();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
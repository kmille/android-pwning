package b.i.b.a.b;

import b.i.b.a.c.b.am;
import b.i.b.a.c.d.b.a.a.a;
import b.i.b.a.c.d.b.n;
import b.i.b.a.c.d.b.n.a;
import b.i.b.a.c.d.b.n.c;
import b.i.b.a.c.d.b.n.e;
import b.i.b.a.c.d.b.n.f;
import b.i.b.a.c.e.b.a.d;
import b.i.b.a.c.e.b.a.g;
import b.i.b.a.c.f.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@b.j(a={1, 1, 13}, b={"\000V\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\022\n\002\b\002\n\002\030\002\n\002\b\002\030\000 \"2\0020\001:\001\"B\033\b\002\022\n\020\002\032\006\022\002\b\0030\003\022\006\020\004\032\0020\005¢\006\002\020\006J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\026H\002J\b\020\027\032\0020\030H\026J\032\020\031\032\0020\0322\006\020\033\032\0020\0342\b\020\035\032\004\030\0010\036H\026J\b\020\037\032\0020\020H\026J\032\020 \032\0020\0322\006\020\033\032\0020!2\b\020\035\032\004\030\0010\036H\026R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\n8VX\004¢\006\006\032\004\b\013\020\fR\025\020\002\032\006\022\002\b\0030\003¢\006\b\n\000\032\004\b\r\020\016R\024\020\017\032\0020\0208VX\004¢\006\006\032\004\b\021\020\022¨\006#"}, c={"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass;", "klass", "Ljava/lang/Class;", "classHeader", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader;", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader;)V", "getClassHeader", "()Lorg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "getKlass", "()Ljava/lang/Class;", "location", "", "getLocation", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "loadClassAnnotations", "", "visitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationVisitor;", "cachedContents", "", "toString", "visitMembers", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$MemberVisitor;", "Factory", "descriptors.runtime"})
public final class e
  implements n
{
  public static final a c = new a((byte)0);
  public final Class<?> a;
  public final b.i.b.a.c.d.b.a.a b;
  
  private e(Class<?> paramClass, b.i.b.a.c.d.b.a.a parama)
  {
    this.a = paramClass;
    this.b = parama;
  }
  
  public final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str = this.a.getName();
    b.f.b.j.a(str, "klass.name");
    localStringBuilder.append(b.k.l.a(str, '.', '/'));
    localStringBuilder.append(".class");
    return localStringBuilder.toString();
  }
  
  public final void a(n.c paramc)
  {
    b.f.b.j.b(paramc, "visitor");
    b localb = b.a;
    b.a(this.a, paramc);
  }
  
  public final void a(n.e parame)
  {
    b.f.b.j.b(parame, "visitor");
    Object localObject1 = b.a;
    Object localObject3 = this.a;
    b.f.b.j.b(localObject3, "klass");
    b.f.b.j.b(parame, "memberVisitor");
    localObject1 = ((Class)localObject3).getDeclaredMethods();
    int m = localObject1.length;
    int i = 0;
    Object localObject4;
    Object localObject2;
    Object localObject5;
    int j;
    Object localObject6;
    Object localObject7;
    int n;
    int i1;
    Object localObject8;
    while (i < m)
    {
      localObject4 = localObject1[i];
      b.f.b.j.a(localObject4, "method");
      localObject2 = f.a(((Method)localObject4).getName());
      b.f.b.j.a(localObject2, "Name.identifier(method.name)");
      localObject5 = l.a;
      localObject2 = parame.a((f)localObject2, l.a((Method)localObject4));
      localObject5 = ((Method)localObject4).getDeclaredAnnotations();
      k = localObject5.length;
      j = 0;
      while (j < k)
      {
        localObject6 = localObject5[j];
        localObject7 = (n.c)localObject2;
        b.f.b.j.a(localObject6, "annotation");
        b.a((n.c)localObject7, (Annotation)localObject6);
        j += 1;
      }
      localObject4 = ((Method)localObject4).getParameterAnnotations();
      b.f.b.j.a(localObject4, "method.parameterAnnotations");
      n = localObject4.length;
      j = 0;
      while (j < n)
      {
        localObject5 = localObject4[j];
        i1 = localObject5.length;
        k = 0;
        while (k < i1)
        {
          localObject6 = localObject5[k];
          localObject7 = b.f.a.a(b.f.a.a((Annotation)localObject6));
          localObject8 = b.i.b.a.e.b.e((Class)localObject7);
          b.f.b.j.a(localObject6, "annotation");
          localObject8 = ((n.f)localObject2).a(j, (b.i.b.a.c.f.a)localObject8, (am)new a((Annotation)localObject6));
          if (localObject8 != null) {
            b.a.a((n.a)localObject8, (Annotation)localObject6, (Class)localObject7);
          }
          k += 1;
        }
        j += 1;
      }
      ((n.f)localObject2).a();
      i += 1;
    }
    localObject1 = ((Class)localObject3).getDeclaredConstructors();
    i = localObject1.length;
    int k = 0;
    while (k < i)
    {
      localObject6 = localObject1[k];
      localObject2 = f.c("<init>");
      b.f.b.j.a(localObject2, "Name.special(\"<init>\")");
      localObject4 = l.a;
      b.f.b.j.a(localObject6, "constructor");
      localObject4 = parame.a((f)localObject2, l.a((Constructor)localObject6));
      localObject2 = ((Constructor)localObject6).getDeclaredAnnotations();
      m = localObject2.length;
      j = 0;
      while (j < m)
      {
        localObject5 = localObject2[j];
        localObject7 = (n.c)localObject4;
        b.f.b.j.a(localObject5, "annotation");
        b.a((n.c)localObject7, (Annotation)localObject5);
        j += 1;
      }
      localObject5 = ((Constructor)localObject6).getParameterAnnotations();
      b.f.b.j.a(localObject5, "parameterAnnotations");
      localObject7 = (Object[])localObject5;
      if (localObject7.length == 0) {
        m = 1;
      } else {
        m = 0;
      }
      localObject2 = localObject1;
      j = i;
      if ((m ^ 0x1) != 0)
      {
        n = ((Constructor)localObject6).getParameterTypes().length - localObject7.length;
        i1 = localObject5.length;
        m = 0;
        for (;;)
        {
          localObject2 = localObject1;
          j = i;
          if (m >= i1) {
            break;
          }
          localObject2 = localObject5[m];
          int i2 = localObject2.length;
          j = 0;
          while (j < i2)
          {
            localObject6 = localObject2[j];
            localObject7 = b.f.a.a(b.f.a.a((Annotation)localObject6));
            localObject8 = b.i.b.a.e.b.e((Class)localObject7);
            b.f.b.j.a(localObject6, "annotation");
            localObject8 = ((n.f)localObject4).a(m + n, (b.i.b.a.c.f.a)localObject8, (am)new a((Annotation)localObject6));
            if (localObject8 != null) {
              b.a.a((n.a)localObject8, (Annotation)localObject6, (Class)localObject7);
            }
            j += 1;
          }
          m += 1;
        }
      }
      ((n.f)localObject4).a();
      k += 1;
      localObject1 = localObject2;
      i = j;
    }
    localObject1 = ((Class)localObject3).getDeclaredFields();
    k = localObject1.length;
    i = 0;
    while (i < k)
    {
      localObject2 = localObject1[i];
      b.f.b.j.a(localObject2, "field");
      localObject3 = f.a(((Field)localObject2).getName());
      b.f.b.j.a(localObject3, "Name.identifier(field.name)");
      localObject4 = l.a;
      localObject3 = parame.b((f)localObject3, l.a((Field)localObject2));
      localObject2 = ((Field)localObject2).getDeclaredAnnotations();
      m = localObject2.length;
      j = 0;
      while (j < m)
      {
        localObject4 = localObject2[j];
        b.f.b.j.a(localObject4, "annotation");
        b.a((n.c)localObject3, (Annotation)localObject4);
        j += 1;
      }
      ((n.c)localObject3).a();
      i += 1;
    }
  }
  
  public final b.i.b.a.c.f.a b()
  {
    return b.i.b.a.e.b.e(this.a);
  }
  
  public final b.i.b.a.c.d.b.a.a c()
  {
    return this.b;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof e)) && (b.f.b.j.a(this.a, ((e)paramObject).a));
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getName());
    localStringBuilder.append(": ");
    localStringBuilder.append(this.a);
    return localStringBuilder.toString();
  }
  
  @b.j(a={1, 1, 13}, b={"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\024\020\003\032\004\030\0010\0042\n\020\005\032\006\022\002\b\0030\006¨\006\007"}, c={"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass$Factory;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "klass", "Ljava/lang/Class;", "descriptors.runtime"})
  public static final class a
  {
    public static e a(Class<?> paramClass)
    {
      b.f.b.j.b(paramClass, "klass");
      b.i.b.a.c.d.b.a.b localb = new b.i.b.a.c.d.b.a.b();
      Object localObject = b.a;
      b.a(paramClass, (n.c)localb);
      if ((localb.i != null) && (localb.a != null))
      {
        localObject = localb.a;
        int i = localb.d;
        int j = 1;
        boolean bool;
        if ((i & 0x8) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        g localg = new g((int[])localObject, bool);
        if (!localg.a())
        {
          localb.h = localb.f;
          localb.f = null;
        }
        else
        {
          i = j;
          if (localb.i != a.a.b)
          {
            i = j;
            if (localb.i != a.a.c) {
              if (localb.i == a.a.f) {
                i = j;
              } else {
                i = 0;
              }
            }
          }
          if ((i != 0) && (localb.f == null)) {
            break label256;
          }
        }
        a.a locala = localb.i;
        if (localb.b != null) {}
        for (localObject = localb.b;; localObject = d.f) {
          break;
        }
        localObject = new b.i.b.a.c.d.b.a.a(locala, localg, (d)localObject, localb.f, localb.h, localb.g, localb.c, localb.d, localb.e);
        break label259;
      }
      label256:
      localObject = null;
      label259:
      if (localObject == null) {
        return null;
      }
      return new e(paramClass, (b.i.b.a.c.d.b.a.a)localObject, (byte)0);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
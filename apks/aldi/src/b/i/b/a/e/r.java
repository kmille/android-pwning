package b.i.b.a.e;

import b.a.e;
import b.i.b.a.c.b.az;
import b.i.b.a.c.d.a.e.p;
import b.i.b.a.c.f.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000n\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\000\n\002\020\033\n\002\b\004\n\002\020\016\n\000\b&\030\0002\0020\0012\0020\0022\0020\0032\0020\004B\005¢\006\002\020\005J\023\020\032\032\0020\0332\b\020\034\032\004\030\0010\035H\002J=\020\036\032\b\022\004\022\0020 0\0372\f\020!\032\b\022\004\022\0020#0\"2\022\020$\032\016\022\n\022\b\022\004\022\0020%0\"0\"2\006\020&\032\0020\033H\004¢\006\002\020'J\b\020(\032\0020\023H\026J\b\020)\032\0020*H\026R\024\020\006\032\0020\0078VX\004¢\006\006\032\004\b\b\020\tR\024\020\n\032\0020\0138VX\004¢\006\006\032\004\b\f\020\rR\022\020\016\032\0020\017X¦\004¢\006\006\032\004\b\020\020\021R\024\020\022\032\0020\0238VX\004¢\006\006\032\004\b\024\020\025R\024\020\026\032\0020\0278VX\004¢\006\006\032\004\b\030\020\031¨\006+"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaMember;", "()V", "containingClass", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "getContainingClass", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "member", "Ljava/lang/reflect/Member;", "getMember", "()Ljava/lang/reflect/Member;", "modifiers", "", "getModifiers", "()I", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "equals", "", "other", "", "getValueParameters", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "parameterAnnotations", "", "isVararg", "([Ljava/lang/reflect/Type;[[Ljava/lang/annotation/Annotation;Z)Ljava/util/List;", "hashCode", "toString", "", "descriptors.runtime"})
public abstract class r
  extends n
  implements p, f, t
{
  protected final List<b.i.b.a.c.d.a.e.y> a(Type[] paramArrayOfType, Annotation[][] paramArrayOfAnnotation, boolean paramBoolean)
  {
    b.f.b.j.b(paramArrayOfType, "parameterTypes");
    b.f.b.j.b(paramArrayOfAnnotation, "parameterAnnotations");
    ArrayList localArrayList = new ArrayList(paramArrayOfType.length);
    Object localObject = a.a;
    List localList = a.a(c());
    int i;
    if (localList != null) {
      i = localList.size() - paramArrayOfType.length;
    } else {
      i = 0;
    }
    int k = paramArrayOfType.length;
    int j = 0;
    while (j < k)
    {
      localObject = w.b;
      w localw = w.a.a(paramArrayOfType[j]);
      if (localList != null)
      {
        localObject = (String)b.a.j.b(localList, j + i);
        if (localObject == null)
        {
          paramArrayOfType = new StringBuilder("No parameter with index ");
          paramArrayOfType.append(j);
          paramArrayOfType.append('+');
          paramArrayOfType.append(i);
          paramArrayOfType.append(" (name=");
          paramArrayOfType.append(p());
          paramArrayOfType.append(" type=");
          paramArrayOfType.append(localw);
          paramArrayOfType.append(") in ");
          paramArrayOfType.append(localList);
          paramArrayOfType.append("@ReflectJavaMember");
          throw ((Throwable)new IllegalStateException(paramArrayOfType.toString().toString()));
        }
      }
      else
      {
        localObject = null;
      }
      boolean bool;
      if ((paramBoolean) && (j == e.f(paramArrayOfType))) {
        bool = true;
      } else {
        bool = false;
      }
      localArrayList.add(new y(localw, paramArrayOfAnnotation[j], (String)localObject, bool));
      j += 1;
    }
    return (List)localArrayList;
  }
  
  public abstract Member c();
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof r)) && (b.f.b.j.a(c(), ((r)paramObject).c()));
  }
  
  public int hashCode()
  {
    return c().hashCode();
  }
  
  public final boolean l()
  {
    return t.a.a(this);
  }
  
  public final boolean m()
  {
    return t.a.b(this);
  }
  
  public final boolean n()
  {
    return t.a.c(this);
  }
  
  public final az o()
  {
    return t.a.d(this);
  }
  
  public final b.i.b.a.c.f.f p()
  {
    Object localObject = c().getName();
    if (localObject != null) {
      return b.i.b.a.c.f.f.a((String)localObject);
    }
    localObject = h.a;
    b.f.b.j.a(localObject, "SpecialNames.NO_NAME_PROVIDED");
    return (b.i.b.a.c.f.f)localObject;
  }
  
  public final AnnotatedElement r()
  {
    Member localMember = c();
    if (localMember != null) {
      return (AnnotatedElement)localMember;
    }
    throw new b.r("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
  }
  
  public final int s()
  {
    return c().getModifiers();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getName());
    localStringBuilder.append(": ");
    localStringBuilder.append(c());
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
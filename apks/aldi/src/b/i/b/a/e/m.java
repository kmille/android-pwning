package b.i.b.a.e;

import b.a.e;
import b.a.v;
import b.i.b.a.c.d.a.e.k;
import b.i.b.a.c.d.a.e.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\0012\0020\002B\021\022\n\020\003\032\006\022\002\b\0030\004¢\006\002\020\005R\030\020\003\032\006\022\002\b\0030\004X\004¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\t8VX\004¢\006\006\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0160\t8VX\004¢\006\006\032\004\b\017\020\f¨\006\020"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaConstructor;", "member", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "getMember", "()Ljava/lang/reflect/Constructor;", "typeParameters", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "()Ljava/util/List;", "valueParameters", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "getValueParameters", "descriptors.runtime"})
public final class m
  extends r
  implements k
{
  public final Constructor<?> a;
  
  public m(Constructor<?> paramConstructor)
  {
    this.a = paramConstructor;
  }
  
  public final List<y> b()
  {
    Object localObject2 = this.a.getGenericParameterTypes();
    b.f.b.j.a(localObject2, "types");
    int i;
    if (localObject2.length == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return (List)v.a;
    }
    Object localObject3 = this.a.getDeclaringClass();
    b.f.b.j.a(localObject3, "klass");
    Object localObject1 = localObject2;
    if (((Class)localObject3).getDeclaringClass() != null)
    {
      localObject1 = localObject2;
      if (!Modifier.isStatic(((Class)localObject3).getModifiers())) {
        localObject1 = (Type[])e.a((Object[])localObject2, 1, localObject2.length);
      }
    }
    localObject3 = this.a.getParameterAnnotations();
    Object[] arrayOfObject = (Object[])localObject3;
    if (arrayOfObject.length >= localObject1.length)
    {
      localObject2 = localObject3;
      if (arrayOfObject.length > localObject1.length)
      {
        b.f.b.j.a(localObject3, "annotations");
        localObject2 = (Annotation[][])e.a(arrayOfObject, arrayOfObject.length - localObject1.length, arrayOfObject.length);
      }
      b.f.b.j.a(localObject1, "realTypes");
      b.f.b.j.a(localObject2, "realAnnotations");
      return a((Type[])localObject1, (Annotation[][])localObject2, this.a.isVarArgs());
    }
    localObject1 = new StringBuilder("Illegal generic signature: ");
    ((StringBuilder)localObject1).append(this.a);
    throw ((Throwable)new IllegalStateException(((StringBuilder)localObject1).toString()));
  }
  
  public final List<x> q()
  {
    TypeVariable[] arrayOfTypeVariable = this.a.getTypeParameters();
    b.f.b.j.a(arrayOfTypeVariable, "member.typeParameters");
    Collection localCollection = (Collection)new ArrayList(arrayOfTypeVariable.length);
    int j = arrayOfTypeVariable.length;
    int i = 0;
    while (i < j)
    {
      localCollection.add(new x(arrayOfTypeVariable[i]));
      i += 1;
    }
    return (List)localCollection;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
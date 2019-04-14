package b.i.b.a.e;

import b.i.b.a.c.d.a.e.q;
import b.i.b.a.c.d.a.e.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000:\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005R\024\020\006\032\0020\0078VX\004¢\006\006\032\004\b\b\020\tR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\n\020\013R\024\020\f\032\0020\r8VX\004¢\006\006\032\004\b\016\020\017R\032\020\020\032\b\022\004\022\0020\0220\0218VX\004¢\006\006\032\004\b\023\020\024R\032\020\025\032\b\022\004\022\0020\0260\0218VX\004¢\006\006\032\004\b\027\020\024¨\006\030"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaMethod;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaMethod;", "member", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "hasAnnotationParameterDefaultValue", "", "getHasAnnotationParameterDefaultValue", "()Z", "getMember", "()Ljava/lang/reflect/Method;", "returnType", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "getReturnType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "typeParameters", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "()Ljava/util/List;", "valueParameters", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "getValueParameters", "descriptors.runtime"})
public final class s
  extends r
  implements q
{
  public final Method a;
  
  public s(Method paramMethod)
  {
    this.a = paramMethod;
  }
  
  public final List<y> b()
  {
    Type[] arrayOfType = this.a.getGenericParameterTypes();
    b.f.b.j.a(arrayOfType, "member.genericParameterTypes");
    Annotation[][] arrayOfAnnotation = this.a.getParameterAnnotations();
    b.f.b.j.a(arrayOfAnnotation, "member.parameterAnnotations");
    return a(arrayOfType, arrayOfAnnotation, this.a.isVarArgs());
  }
  
  public final boolean e()
  {
    return this.a.getDefaultValue() != null;
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


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
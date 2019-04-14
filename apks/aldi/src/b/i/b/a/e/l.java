package b.i.b.a.e;

import b.i.b.a.c.d.a.e.a;
import b.i.b.a.c.d.a.e.i;
import b.r;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000L\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\036\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020\013\n\002\b\007\n\002\020 \n\002\030\002\n\002\b\004\n\002\030\002\n\000\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\022\020 \032\004\030\0010\b2\006\020!\032\0020\"H\026R\032\020\006\032\b\022\004\022\0020\b0\0078VX\004¢\006\006\032\004\b\t\020\nR\024\020\013\032\0020\fX\004¢\006\b\n\000\032\004\b\r\020\016R\024\020\017\032\0020\0208VX\004¢\006\006\032\004\b\021\020\022R\024\020\023\032\0020\0248VX\004¢\006\006\032\004\b\023\020\025R\024\020\026\032\0020\0248VX\004¢\006\006\032\004\b\026\020\025R\024\020\027\032\0020\0208VX\004¢\006\006\032\004\b\030\020\022R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\031\020\032R\032\020\033\032\b\022\004\022\0020\0350\0348VX\004¢\006\006\032\004\b\036\020\037¨\006#"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassifierType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifierType;", "reflectType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "annotations", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "getAnnotations", "()Ljava/util/Collection;", "classifier", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifier;", "getClassifier", "()Lorg/jetbrains/kotlin/load/java/structure/JavaClassifier;", "classifierQualifiedName", "", "getClassifierQualifiedName", "()Ljava/lang/String;", "isDeprecatedInJavaDoc", "", "()Z", "isRaw", "presentableText", "getPresentableText", "getReflectType", "()Ljava/lang/reflect/Type;", "typeArguments", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "getTypeArguments", "()Ljava/util/List;", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "descriptors.runtime"})
public final class l
  extends w
  implements b.i.b.a.c.d.a.e.j
{
  final Type a;
  private final i c;
  
  public l(Type paramType)
  {
    this.a = paramType;
    paramType = ((l)this).a;
    if ((paramType instanceof Class)) {
      paramType = new j((Class)paramType);
    }
    for (;;)
    {
      paramType = (i)paramType;
      break;
      if ((paramType instanceof TypeVariable))
      {
        paramType = new x((TypeVariable)paramType);
      }
      else
      {
        if (!(paramType instanceof ParameterizedType)) {
          break label124;
        }
        paramType = ((ParameterizedType)paramType).getRawType();
        if (paramType == null) {
          break label114;
        }
        paramType = new j((Class)paramType);
      }
    }
    this.c = paramType;
    return;
    label114:
    throw new r("null cannot be cast to non-null type java.lang.Class<*>");
    label124:
    StringBuilder localStringBuilder = new StringBuilder("Not a classifier type (");
    localStringBuilder.append(paramType.getClass());
    localStringBuilder.append("): ");
    localStringBuilder.append(paramType);
    throw ((Throwable)new IllegalStateException(localStringBuilder.toString()));
  }
  
  public final a a(b.i.b.a.c.f.b paramb)
  {
    b.f.b.j.b(paramb, "fqName");
    return null;
  }
  
  public final Collection<a> a()
  {
    return (Collection)b.a.v.a;
  }
  
  public final i b()
  {
    return this.c;
  }
  
  public final List<b.i.b.a.c.d.a.e.v> c()
  {
    Object localObject = (Iterable)b.a(this.a);
    Collection localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localCollection.add(w.a.a((Type)((Iterator)localObject).next()));
    }
    return (List)localCollection;
  }
  
  public final boolean d()
  {
    Object localObject = this.a;
    if ((localObject instanceof Class))
    {
      localObject = ((Class)localObject).getTypeParameters();
      b.f.b.j.a(localObject, "getTypeParameters()");
      int i;
      if (localObject.length == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i ^ 0x1) != 0) {
        return true;
      }
    }
    return false;
  }
  
  public final String e()
  {
    StringBuilder localStringBuilder = new StringBuilder("Type not found: ");
    localStringBuilder.append(this.a);
    throw ((Throwable)new UnsupportedOperationException(localStringBuilder.toString()));
  }
  
  public final String f()
  {
    return this.a.toString();
  }
  
  public final Type p_()
  {
    return this.a;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
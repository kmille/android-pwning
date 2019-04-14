package b.f;

import b.f.b.d;
import b.f.b.v;
import b.i.b;
import b.r;
import java.lang.annotation.Annotation;

@b.j(a={1, 1, 13}, b={"\000,\n\000\n\002\030\002\n\000\n\002\020\033\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\000\n\002\b\013\n\002\020\013\n\002\020\021\n\002\b\002\032\037\020\030\032\0020\031\"\n\b\000\020\002\030\001*\0020\r*\006\022\002\b\0030\032¢\006\002\020\033\"'\020\000\032\n\022\006\b\001\022\002H\0020\001\"\b\b\000\020\002*\0020\003*\002H\0028F¢\006\006\032\004\b\004\020\005\"-\020\006\032\b\022\004\022\002H\0020\007\"\004\b\000\020\002*\b\022\004\022\002H\0020\0018G¢\006\f\022\004\b\b\020\t\032\004\b\n\020\013\"&\020\f\032\b\022\004\022\002H\0020\007\"\b\b\000\020\002*\0020\r*\002H\0028Æ\002¢\006\006\032\004\b\n\020\016\";\020\f\032\016\022\n\022\b\022\004\022\002H\0020\0010\007\"\b\b\000\020\002*\0020\r*\b\022\004\022\002H\0020\0018Ç\002X\004¢\006\f\022\004\b\017\020\t\032\004\b\020\020\013\"+\020\021\032\b\022\004\022\002H\0020\007\"\b\b\000\020\002*\0020\r*\b\022\004\022\002H\0020\0018F¢\006\006\032\004\b\022\020\013\"-\020\023\032\n\022\004\022\002H\002\030\0010\007\"\b\b\000\020\002*\0020\r*\b\022\004\022\002H\0020\0018F¢\006\006\032\004\b\024\020\013\"+\020\025\032\b\022\004\022\002H\0020\001\"\b\b\000\020\002*\0020\r*\b\022\004\022\002H\0020\0078G¢\006\006\032\004\b\026\020\027¨\006\034"}, c={"annotationClass", "Lkotlin/reflect/KClass;", "T", "", "getAnnotationClass", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "java", "Ljava/lang/Class;", "java$annotations", "(Lkotlin/reflect/KClass;)V", "getJavaClass", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "javaClass", "", "(Ljava/lang/Object;)Ljava/lang/Class;", "javaClass$annotations", "getRuntimeClassOfKClassInstance", "javaObjectType", "getJavaObjectType", "javaPrimitiveType", "getJavaPrimitiveType", "kotlin", "getKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "isArrayOf", "", "", "([Ljava/lang/Object;)Z", "kotlin-stdlib"})
public final class a
{
  public static final <T> b<T> a(Class<T> paramClass)
  {
    b.f.b.j.b(paramClass, "receiver$0");
    return v.a(paramClass);
  }
  
  public static final <T extends Annotation> b<? extends T> a(T paramT)
  {
    b.f.b.j.b(paramT, "receiver$0");
    paramT = paramT.annotationType();
    b.f.b.j.a(paramT, "(this as java.lang.annot…otation).annotationType()");
    paramT = a(paramT);
    if (paramT != null) {
      return paramT;
    }
    throw new r("null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
  }
  
  public static final <T> Class<T> a(b<T> paramb)
  {
    b.f.b.j.b(paramb, "receiver$0");
    paramb = ((d)paramb).a();
    if (paramb != null) {
      return paramb;
    }
    throw new r("null cannot be cast to non-null type java.lang.Class<T>");
  }
  
  public static final <T> Class<T> b(b<T> paramb)
  {
    b.f.b.j.b(paramb, "receiver$0");
    paramb = ((d)paramb).a();
    if (paramb.isPrimitive())
    {
      if (paramb != null) {
        return paramb;
      }
      throw new r("null cannot be cast to non-null type java.lang.Class<T>");
    }
    paramb = paramb.getName();
    if (paramb != null) {
      switch (paramb.hashCode())
      {
      default: 
        break;
      case 761287205: 
        if (paramb.equals("java.lang.Double")) {
          return Double.TYPE;
        }
        break;
      case 399092968: 
        if (paramb.equals("java.lang.Void")) {
          return Void.TYPE;
        }
        break;
      case 398795216: 
        if (paramb.equals("java.lang.Long")) {
          return Long.TYPE;
        }
        break;
      case 398507100: 
        if (paramb.equals("java.lang.Byte")) {
          return Byte.TYPE;
        }
        break;
      case 344809556: 
        if (paramb.equals("java.lang.Boolean")) {
          return Boolean.TYPE;
        }
        break;
      case 155276373: 
        if (paramb.equals("java.lang.Character")) {
          return Character.TYPE;
        }
        break;
      case -515992664: 
        if (paramb.equals("java.lang.Short")) {
          return Short.TYPE;
        }
        break;
      case -527879800: 
        if (paramb.equals("java.lang.Float")) {
          return Float.TYPE;
        }
        break;
      case -2056817302: 
        if (paramb.equals("java.lang.Integer")) {
          return Integer.TYPE;
        }
        break;
      }
    }
    return null;
  }
  
  public static final <T> Class<T> c(b<T> paramb)
  {
    b.f.b.j.b(paramb, "receiver$0");
    paramb = ((d)paramb).a();
    if (!paramb.isPrimitive())
    {
      if (paramb != null) {
        return paramb;
      }
      throw new r("null cannot be cast to non-null type java.lang.Class<T>");
    }
    String str = paramb.getName();
    if (str != null) {
      switch (str.hashCode())
      {
      default: 
        break;
      case 109413500: 
        if (str.equals("short")) {
          paramb = Short.class;
        }
        break;
      case 97526364: 
        if (str.equals("float")) {
          paramb = Float.class;
        }
        break;
      case 64711720: 
        if (str.equals("boolean")) {
          paramb = Boolean.class;
        }
        break;
      case 3625364: 
        if (str.equals("void")) {
          paramb = Void.class;
        }
        break;
      case 3327612: 
        if (str.equals("long")) {
          paramb = Long.class;
        }
        break;
      case 3052374: 
        if (str.equals("char")) {
          paramb = Character.class;
        }
        break;
      case 3039496: 
        if (str.equals("byte")) {
          paramb = Byte.class;
        }
        break;
      case 104431: 
        if (str.equals("int")) {
          paramb = Integer.class;
        }
        break;
      case -1325958191: 
        if (str.equals("double")) {
          paramb = Double.class;
        }
        break;
      }
    }
    if (paramb != null) {
      return paramb;
    }
    throw new r("null cannot be cast to non-null type java.lang.Class<T>");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package b.i.b.a;

import b.i.b.a.c.a.h;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.ai;
import b.i.b.a.c.b.aj;
import b.i.b.a.c.d.a.b.e;
import b.i.b.a.c.d.a.o;
import b.i.b.a.c.d.b.r;
import b.i.b.a.c.e.a.e;
import b.i.b.a.c.e.a.o;
import b.i.b.a.c.e.a.u;
import b.i.b.a.c.e.b.a.f.b;
import b.i.b.a.c.e.b.b.e;
import b.i.b.a.c.g.i.c;
import b.i.b.a.c.g.i.f;
import b.i.b.a.c.j.a.a.i;
import b.i.b.a.e.m;
import b.i.b.a.e.p;
import b.i.b.a.e.s;
import java.lang.reflect.Method;

@b.j(a={1, 1, 13}, b={"\000H\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\022\020\n\032\0020\0042\n\020\013\032\006\022\002\b\0030\007J\020\020\f\032\0020\r2\006\020\016\032\0020\017H\002J\020\020\020\032\0020\0212\006\020\016\032\0020\022H\002J\016\020\023\032\0020\0242\006\020\025\032\0020\026J\016\020\027\032\0020\0302\006\020\031\032\0020\017R\016\020\003\032\0020\004X\004¢\006\002\n\000R\036\020\005\032\004\030\0010\006*\006\022\002\b\0030\0078BX\004¢\006\006\032\004\b\b\020\t¨\006\032"}, c={"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", "", "()V", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "primitiveType", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "Ljava/lang/Class;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "mapJvmClassToKotlinClassId", "klass", "mapJvmFunctionSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "mapName", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "mapPropertySignature", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "mapSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "possiblySubstitutedFunction", "kotlin-reflect-api"})
public final class ad
{
  static final b.i.b.a.c.f.a a;
  public static final ad b = new ad();
  
  static
  {
    b.i.b.a.c.f.a locala = b.i.b.a.c.f.a.a(new b.i.b.a.c.f.b("java.lang.Void"));
    b.f.b.j.a(locala, "ClassId.topLevel(FqName(\"java.lang.Void\"))");
    a = locala;
  }
  
  static h a(Class<?> paramClass)
  {
    if (paramClass.isPrimitive())
    {
      paramClass = b.i.b.a.c.i.d.c.a(paramClass.getSimpleName());
      b.f.b.j.a(paramClass, "JvmPrimitiveType.get(simpleName)");
      return paramClass.i;
    }
    return null;
  }
  
  public static c a(b.i.b.a.c.b.t paramt)
  {
    b.f.b.j.b(paramt, "possiblySubstitutedFunction");
    paramt = b.i.b.a.c.i.d.a((b.i.b.a.c.b.b)paramt);
    b.f.b.j.a(paramt, "DescriptorUtils.unwrapFa…siblySubstitutedFunction)");
    b.i.b.a.c.b.t localt = ((b.i.b.a.c.b.t)paramt).w();
    b.f.b.j.a(localt, "DescriptorUtils.unwrapFa…titutedFunction).original");
    Object localObject1;
    Object localObject2;
    if ((localt instanceof b.i.b.a.c.j.a.a.b))
    {
      paramt = (b.i.b.a.c.j.a.a.b)localt;
      localObject1 = paramt.G();
      if ((localObject1 instanceof a.o))
      {
        localObject2 = b.i.b.a.c.e.b.a.j.a;
        localObject2 = b.i.b.a.c.e.b.a.j.a((a.o)localObject1, paramt.H(), paramt.I());
        if (localObject2 == null) {}
      }
      for (paramt = new c.e((f.b)localObject2);; paramt = new c.d(paramt))
      {
        return (c)paramt;
        if (!(localObject1 instanceof a.e)) {
          break;
        }
        localObject2 = b.i.b.a.c.e.b.a.j.a;
        paramt = b.i.b.a.c.e.b.a.j.a((a.e)localObject1, paramt.H(), paramt.I());
        if (paramt == null) {
          break;
        }
      }
    }
    int i;
    do
    {
      int j;
      do
      {
        paramt = b(localt);
        break;
        boolean bool = localt instanceof e;
        localObject1 = null;
        if (bool)
        {
          localObject1 = ((e)localt).s();
          paramt = (b.i.b.a.c.b.t)localObject1;
          if (!(localObject1 instanceof b.i.b.a.c.d.a.d.a)) {
            paramt = null;
          }
          paramt = (b.i.b.a.c.d.a.d.a)paramt;
          if (paramt != null) {
            paramt = paramt.b();
          } else {
            paramt = null;
          }
          localObject1 = paramt;
          if (!(paramt instanceof s)) {
            localObject1 = null;
          }
          paramt = (s)localObject1;
          if (paramt != null)
          {
            paramt = paramt.a;
            if (paramt != null)
            {
              paramt = new c.c(paramt);
              break;
            }
          }
          throw ((Throwable)new x("Incorrect resolution sequence for Java method ".concat(String.valueOf(localt))));
        }
        if ((localt instanceof b.i.b.a.c.d.a.b.c))
        {
          localObject2 = ((b.i.b.a.c.d.a.b.c)localt).s();
          paramt = (b.i.b.a.c.b.t)localObject2;
          if (!(localObject2 instanceof b.i.b.a.c.d.a.d.a)) {
            paramt = null;
          }
          localObject2 = (b.i.b.a.c.d.a.d.a)paramt;
          paramt = (b.i.b.a.c.b.t)localObject1;
          if (localObject2 != null) {
            paramt = ((b.i.b.a.c.d.a.d.a)localObject2).b();
          }
          if ((paramt instanceof m))
          {
            paramt = new c.b(((m)paramt).a);
            break;
          }
          if ((paramt instanceof b.i.b.a.e.j))
          {
            localObject1 = (b.i.b.a.e.j)paramt;
            if (((b.i.b.a.e.j)localObject1).a.isAnnotation())
            {
              paramt = new c.a(((b.i.b.a.e.j)localObject1).a);
              break;
            }
          }
          localObject1 = new StringBuilder("Incorrect resolution sequence for Java constructor ");
          ((StringBuilder)localObject1).append(localt);
          ((StringBuilder)localObject1).append(" (");
          ((StringBuilder)localObject1).append(paramt);
          ((StringBuilder)localObject1).append(')');
          throw ((Throwable)new x(((StringBuilder)localObject1).toString()));
        }
        bool = localt.i().equals(b.i.b.a.c.i.d.b);
        j = 1;
        if ((bool) && (b.i.b.a.c.i.c.a(localt))) {
          i = 1;
        } else {
          i = 0;
        }
      } while (i != 0);
      if ((localt.i().equals(b.i.b.a.c.i.d.a)) && (b.i.b.a.c.i.c.a(localt))) {
        i = j;
      } else {
        i = 0;
      }
    } while (i != 0);
    paramt = new StringBuilder("Unknown origin of ");
    paramt.append(localt);
    paramt.append(" (");
    paramt.append(localt.getClass());
    paramt.append(')');
    throw ((Throwable)new x(paramt.toString()));
  }
  
  public static d a(ah paramah)
  {
    b.f.b.j.b(paramah, "possiblyOverriddenProperty");
    paramah = b.i.b.a.c.i.d.a((b.i.b.a.c.b.b)paramah);
    b.f.b.j.a(paramah, "DescriptorUtils.unwrapFa…ssiblyOverriddenProperty)");
    ah localah = ((ah)paramah).v();
    b.f.b.j.a(localah, "DescriptorUtils.unwrapFa…rriddenProperty).original");
    boolean bool = localah instanceof i;
    paramah = null;
    Object localObject2 = null;
    Object localObject3;
    if (bool)
    {
      localObject1 = (i)localah;
      localObject2 = ((i)localObject1).u;
      localObject3 = (i.c)localObject2;
      i.f localf = b.i.b.a.c.e.b.b.d;
      b.f.b.j.a(localf, "JvmProtoBuf.propertySignature");
      localObject3 = (b.e)b.i.b.a.c.e.a.f.a((i.c)localObject3, localf);
      if (localObject3 != null) {
        return (d)new d.c(localah, (a.u)localObject2, (b.e)localObject3, ((i)localObject1).v, ((i)localObject1).w);
      }
    }
    else if ((localah instanceof b.i.b.a.c.d.a.b.f))
    {
      localObject1 = ((b.i.b.a.c.d.a.b.f)localah).s();
      paramah = (ah)localObject1;
      if (!(localObject1 instanceof b.i.b.a.c.d.a.d.a)) {
        paramah = null;
      }
      paramah = (b.i.b.a.c.d.a.d.a)paramah;
      if (paramah != null) {
        paramah = paramah.b();
      } else {
        paramah = null;
      }
      if ((paramah instanceof p)) {
        return (d)new d.a(((p)paramah).a);
      }
      if ((paramah instanceof s))
      {
        localObject3 = ((s)paramah).a;
        paramah = localah.c();
        if (paramah != null) {
          paramah = paramah.s();
        } else {
          paramah = null;
        }
        localObject1 = paramah;
        if (!(paramah instanceof b.i.b.a.c.d.a.d.a)) {
          localObject1 = null;
        }
        paramah = (b.i.b.a.c.d.a.d.a)localObject1;
        if (paramah != null) {
          paramah = paramah.b();
        } else {
          paramah = null;
        }
        localObject1 = paramah;
        if (!(paramah instanceof s)) {
          localObject1 = null;
        }
        localObject1 = (s)localObject1;
        paramah = (ah)localObject2;
        if (localObject1 != null) {
          paramah = ((s)localObject1).a;
        }
        return (d)new d.b((Method)localObject3, paramah);
      }
      localObject1 = new StringBuilder("Incorrect resolution sequence for Java field ");
      ((StringBuilder)localObject1).append(localah);
      ((StringBuilder)localObject1).append(" (source = ");
      ((StringBuilder)localObject1).append(paramah);
      ((StringBuilder)localObject1).append(')');
      throw ((Throwable)new x(((StringBuilder)localObject1).toString()));
    }
    Object localObject1 = localah.b();
    if (localObject1 == null) {
      b.f.b.j.a();
    }
    localObject1 = b((b.i.b.a.c.b.t)localObject1);
    localObject2 = localah.c();
    if (localObject2 != null) {
      paramah = b((b.i.b.a.c.b.t)localObject2);
    }
    return (d)new d.d((c.e)localObject1, paramah);
  }
  
  private static String a(b.i.b.a.c.b.b paramb)
  {
    String str = b.i.b.a.c.d.a.t.d(paramb);
    Object localObject = str;
    if (str == null)
    {
      if ((paramb instanceof ai)) {
        paramb = o.c(b.i.b.a.c.i.c.a.a(paramb).i().a);
      }
      for (;;)
      {
        break;
        if ((paramb instanceof aj)) {
          paramb = o.d(b.i.b.a.c.i.c.a.a(paramb).i().a);
        } else {
          paramb = paramb.i().a;
        }
      }
      b.f.b.j.a(paramb, "when (descriptor) {\n    …name.asString()\n        }");
      localObject = paramb;
    }
    return (String)localObject;
  }
  
  private static c.e b(b.i.b.a.c.b.t paramt)
  {
    return new c.e(new f.b(a((b.i.b.a.c.b.b)paramt), r.a(paramt, false, false, 1)));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
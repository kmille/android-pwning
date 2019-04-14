package b.i.b.a;

import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.d.a.o;
import b.i.b.a.c.e.a.u;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.a.h;
import b.i.b.a.c.e.b.a.f.a;
import b.i.b.a.c.e.b.b.c;
import b.i.b.a.c.e.b.b.e;
import b.i.b.a.c.f.g;
import b.i.b.a.c.g.i.c;
import b.r;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@b.j(a={1, 1, 13}, b={"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b0\030\0002\0020\001:\004\005\006\007\bB\007\b\002¢\006\002\020\002J\b\020\003\032\0020\004H&\001\004\t\n\013\f¨\006\r"}, c={"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "()V", "asString", "", "JavaField", "JavaMethodProperty", "KotlinProperty", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflect-api"})
public abstract class d
{
  public abstract String a();
  
  @b.j(a={1, 1, 13}, b={"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\007\032\0020\bH\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, c={"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "getField", "()Ljava/lang/reflect/Field;", "asString", "", "kotlin-reflect-api"})
  public static final class a
    extends d
  {
    final Field a;
    
    public a(Field paramField)
    {
      super();
      this.a = paramField;
    }
    
    public final String a()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(o.c(this.a.getName()));
      localStringBuilder.append("()");
      Class localClass = this.a.getType();
      b.f.b.j.a(localClass, "field.type");
      localStringBuilder.append(b.i.b.a.e.b.f(localClass));
      return localStringBuilder.toString();
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\016\n\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\003¢\006\002\020\005J\b\020\t\032\0020\nH\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\b\020\007¨\006\013"}, c={"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterMethod", "Ljava/lang/reflect/Method;", "setterMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getGetterMethod", "()Ljava/lang/reflect/Method;", "getSetterMethod", "asString", "", "kotlin-reflect-api"})
  public static final class b
    extends d
  {
    final Method a;
    final Method b;
    
    public b(Method paramMethod1, Method paramMethod2)
    {
      super();
      this.a = paramMethod1;
      this.b = paramMethod2;
    }
    
    public final String a()
    {
      return ae.a(this.a);
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\0002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\016\n\002\b\005\030\0002\0020\001B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\fJ\b\020\031\032\0020\026H\026J\b\020\032\032\0020\026H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\017\020\020R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\021\020\022R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\023\020\024R\016\020\025\032\0020\026X\004¢\006\002\n\000R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\027\020\030¨\006\033"}, c={"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "string", "", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "asString", "getManglingSuffix", "kotlin-reflect-api"})
  public static final class c
    extends d
  {
    final ah a;
    final a.u b;
    final b.e c;
    final c d;
    final h e;
    private final String f;
    
    public c(ah paramah, a.u paramu, b.e parame, c paramc, h paramh)
    {
      super();
      this.a = paramah;
      this.b = paramu;
      this.c = parame;
      this.d = paramc;
      this.e = paramh;
      if (this.c.g())
      {
        paramah = new StringBuilder();
        paramu = this.d;
        parame = this.c.d;
        b.f.b.j.a(parame, "signature.getter");
        paramah.append(paramu.a(parame.b));
        paramu = this.d;
        parame = this.c.d;
        b.f.b.j.a(parame, "signature.getter");
        paramah.append(paramu.a(parame.c));
        paramah = paramah.toString();
      }
      else
      {
        paramah = b.i.b.a.c.e.b.a.j.a;
        paramu = b.i.b.a.c.e.b.a.j.a(this.b, this.d, this.e);
        if (paramu == null) {
          break label470;
        }
        paramah = paramu.a;
        parame = paramu.b;
        paramc = new StringBuilder();
        paramc.append(o.c(paramah));
        paramah = this.a.a();
        b.f.b.j.a(paramah, "descriptor.containingDeclaration");
        if ((b.f.b.j.a(this.a.j(), ay.d)) && ((paramah instanceof b.i.b.a.c.j.a.a.d)))
        {
          paramah = (i.c)((b.i.b.a.c.j.a.a.d)paramah).g;
          paramu = b.i.b.a.c.e.b.b.i;
          b.f.b.j.a(paramu, "JvmProtoBuf.classModuleName");
          paramah = (Integer)b.i.b.a.c.e.a.f.a(paramah, paramu);
          if (paramah != null)
          {
            paramu = this.d.a(((Number)paramah).intValue());
            paramah = paramu;
            if (paramu != null) {}
          }
          else
          {
            paramah = "main";
          }
          paramu = new StringBuilder("$");
        }
        for (paramah = g.a(paramah);; paramah = paramah.b().a)
        {
          paramu.append(paramah);
          paramah = paramu.toString();
          break label436;
          if ((!b.f.b.j.a(this.a.j(), ay.a)) || (!(paramah instanceof ab))) {
            break label433;
          }
          paramah = this.a;
          if (paramah == null) {
            break;
          }
          paramah = ((b.i.b.a.c.j.a.a.i)paramah).x;
          if (!(paramah instanceof b.i.b.a.c.d.b.i)) {
            break label433;
          }
          paramah = (b.i.b.a.c.d.b.i)paramah;
          if (paramah.c == null) {
            break label433;
          }
          paramu = new StringBuilder("$");
        }
        throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
        label433:
        paramah = "";
        label436:
        paramc.append(paramah);
        paramc.append("()");
        paramc.append(parame);
        paramah = paramc.toString();
      }
      this.f = paramah;
      return;
      label470:
      paramah = new StringBuilder("No field signature for property: ");
      paramah.append(this.a);
      throw ((Throwable)new x(paramah.toString()));
    }
    
    public final String a()
    {
      return this.f;
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\016\n\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\003¢\006\002\020\005J\b\020\t\032\0020\nH\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\b\020\007¨\006\013"}, c={"Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "setterSignature", "(Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;)V", "getGetterSignature", "()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "getSetterSignature", "asString", "", "kotlin-reflect-api"})
  public static final class d
    extends d
  {
    final c.e a;
    final c.e b;
    
    public d(c.e parame1, c.e parame2)
    {
      super();
      this.a = parame1;
      this.b = parame2;
    }
    
    public final String a()
    {
      return this.a.a;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
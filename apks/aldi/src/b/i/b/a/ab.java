package b.i.b.a;

import b.f.a.b;
import b.f.b.k;
import b.i.b.a.c.b.a;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.t;
import b.i.b.a.c.f.f;
import b.i.b.a.c.h.c;
import b.i.b.a.c.l.w;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000X\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\005\032\0020\0062\006\020\007\032\0020\bH\002J\016\020\t\032\0020\0062\006\020\007\032\0020\nJ\016\020\013\032\0020\0062\006\020\f\032\0020\nJ\016\020\r\032\0020\0062\006\020\016\032\0020\017J\016\020\020\032\0020\0062\006\020\007\032\0020\021J\016\020\022\032\0020\0062\006\020\023\032\0020\024J\016\020\025\032\0020\0062\006\020\026\032\0020\027J\032\020\030\032\0020\031*\0060\032j\002`\0332\b\020\034\032\004\030\0010\035H\002J\030\020\036\032\0020\031*\0060\032j\002`\0332\006\020\037\032\0020\bH\002R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006 "}, c={"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "()V", "renderer", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderCallable", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "renderFunction", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "renderLambda", "invoke", "renderParameter", "parameter", "Lkotlin/reflect/jvm/internal/KParameterImpl;", "renderProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "renderType", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "renderTypeParameter", "typeParameter", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "appendReceiverType", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "appendReceivers", "callable", "kotlin-reflect-api"})
public final class ab
{
  public static final ab a = new ab();
  private static final c b = c.f;
  
  public static String a(ah paramah)
  {
    b.f.b.j.b(paramah, "descriptor");
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramah.z()) {
      localObject = "var ";
    } else {
      localObject = "val ";
    }
    localStringBuilder.append((String)localObject);
    a(localStringBuilder, (a)paramah);
    Object localObject = b;
    f localf = paramah.i();
    b.f.b.j.a(localf, "descriptor.name");
    localStringBuilder.append(((c)localObject).a(localf, true));
    localStringBuilder.append(": ");
    paramah = paramah.y();
    b.f.b.j.a(paramah, "descriptor.type");
    localStringBuilder.append(a(paramah));
    paramah = localStringBuilder.toString();
    b.f.b.j.a(paramah, "StringBuilder().apply(builderAction).toString()");
    return paramah;
  }
  
  public static String a(ar paramar)
  {
    b.f.b.j.b(paramar, "typeParameter");
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = paramar.k();
    switch (ac.b[localObject.ordinal()])
    {
    default: 
      break;
    case 3: 
      localObject = "out ";
      break;
    case 2: 
      localObject = "in ";
      localStringBuilder.append((String)localObject);
    }
    localStringBuilder.append(paramar.i());
    paramar = localStringBuilder.toString();
    b.f.b.j.a(paramar, "StringBuilder().apply(builderAction).toString()");
    return paramar;
  }
  
  public static String a(t paramt)
  {
    b.f.b.j.b(paramt, "descriptor");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("fun ");
    a(localStringBuilder, (a)paramt);
    Object localObject = b;
    f localf = paramt.i();
    b.f.b.j.a(localf, "descriptor.name");
    localStringBuilder.append(((c)localObject).a(localf, true));
    localObject = paramt.k();
    b.f.b.j.a(localObject, "descriptor.valueParameters");
    b.a.j.a((Iterable)localObject, (Appendable)localStringBuilder, (CharSequence)", ", (CharSequence)"(", (CharSequence)")", 0, null, (b)a.a, 48);
    localStringBuilder.append(": ");
    paramt = paramt.g();
    if (paramt == null) {
      b.f.b.j.a();
    }
    b.f.b.j.a(paramt, "descriptor.returnType!!");
    localStringBuilder.append(a(paramt));
    paramt = localStringBuilder.toString();
    b.f.b.j.a(paramt, "StringBuilder().apply(builderAction).toString()");
    return paramt;
  }
  
  public static String a(w paramw)
  {
    b.f.b.j.b(paramw, "type");
    return b.a(paramw);
  }
  
  public static String a(o paramo)
  {
    b.f.b.j.b(paramo, "parameter");
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = paramo.d;
    switch (ac.a[localObject.ordinal()])
    {
    default: 
      break;
    case 3: 
      localObject = new StringBuilder("parameter #");
      ((StringBuilder)localObject).append(paramo.c);
      ((StringBuilder)localObject).append(' ');
      ((StringBuilder)localObject).append(paramo.a());
      localObject = ((StringBuilder)localObject).toString();
      break;
    case 2: 
      localObject = "instance";
      break;
    case 1: 
      localObject = "extension receiver";
    }
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(" of ");
    paramo = (a)paramo.b.b();
    if ((paramo instanceof ah))
    {
      paramo = a((ah)paramo);
    }
    else
    {
      if (!(paramo instanceof t)) {
        break label183;
      }
      paramo = a((t)paramo);
    }
    localStringBuilder.append(paramo);
    paramo = localStringBuilder.toString();
    b.f.b.j.a(paramo, "StringBuilder().apply(builderAction).toString()");
    return paramo;
    label183:
    throw ((Throwable)new IllegalStateException("Illegal callable: ".concat(String.valueOf(paramo)).toString()));
  }
  
  private static void a(StringBuilder paramStringBuilder, a parama)
  {
    ak localak = af.a(parama);
    parama = parama.d();
    a(paramStringBuilder, localak);
    int i;
    if ((localak != null) && (parama != null)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      paramStringBuilder.append("(");
    }
    a(paramStringBuilder, parama);
    if (i != 0) {
      paramStringBuilder.append(")");
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, ak paramak)
  {
    if (paramak != null)
    {
      paramak = paramak.y();
      b.f.b.j.a(paramak, "receiver.type");
      paramStringBuilder.append(a(paramak));
      paramStringBuilder.append(".");
    }
  }
  
  public static String b(t paramt)
  {
    b.f.b.j.b(paramt, "invoke");
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, (a)paramt);
    List localList = paramt.k();
    b.f.b.j.a(localList, "invoke.valueParameters");
    b.a.j.a((Iterable)localList, (Appendable)localStringBuilder, (CharSequence)", ", (CharSequence)"(", (CharSequence)")", 0, null, (b)b.a, 48);
    localStringBuilder.append(" -> ");
    paramt = paramt.g();
    if (paramt == null) {
      b.f.b.j.a();
    }
    b.f.b.j.a(paramt, "invoke.returnType!!");
    localStringBuilder.append(a(paramt));
    paramt = localStringBuilder.toString();
    b.f.b.j.a(paramt, "StringBuilder().apply(builderAction).toString()");
    return paramt;
  }
  
  @b.j(a={1, 1, 13}, b={"\000\020\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\002\b\005"}, c={"<anonymous>", "", "it", "Lkotlin/reflect/jvm/internal/impl/descriptors/ValueParameterDescriptor;", "kotlin.jvm.PlatformType", "invoke"})
  static final class a
    extends k
    implements b<au, String>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\020\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\002\b\005"}, c={"<anonymous>", "", "it", "Lkotlin/reflect/jvm/internal/impl/descriptors/ValueParameterDescriptor;", "kotlin.jvm.PlatformType", "invoke"})
  static final class b
    extends k
    implements b<au, String>
  {
    public static final b a = new b();
    
    b()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
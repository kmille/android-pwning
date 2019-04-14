package b.i.b.a;

import b.f.b.k;
import b.i.b.a.c.b.ae;
import b.i.b.a.c.b.au;
import b.i.b.a.c.f.f;
import b.i.j.a;
import java.lang.annotation.Annotation;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000T\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\020\033\n\002\b\r\n\002\020\013\n\002\b\005\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\000\n\002\b\003\b\000\030\0002\0020\001B/\022\n\020\002\032\006\022\002\b\0030\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t¢\006\002\020\013J\023\020)\032\0020\0342\b\020*\032\004\030\0010+H\002J\b\020,\032\0020\005H\026J\b\020-\032\0020\"H\026R!\020\f\032\b\022\004\022\0020\0160\r8VX\002¢\006\f\n\004\b\021\020\022\032\004\b\017\020\020R\025\020\002\032\006\022\002\b\0030\003¢\006\b\n\000\032\004\b\023\020\024R\033\020\025\032\0020\n8BX\002¢\006\f\n\004\b\030\020\022\032\004\b\026\020\027R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\031\020\032R\024\020\033\032\0020\0348VX\004¢\006\006\032\004\b\033\020\035R\024\020\036\032\0020\0348VX\004¢\006\006\032\004\b\036\020\035R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\037\020 R\026\020!\032\004\030\0010\"8VX\004¢\006\006\032\004\b#\020$R\024\020%\032\0020&8VX\004¢\006\006\032\004\b'\020(¨\006."}, c={"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "callable", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "index", "", "kind", "Lkotlin/reflect/KParameter$Kind;", "computeDescriptor", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "(Lkotlin/reflect/jvm/internal/KCallableImpl;ILkotlin/reflect/KParameter$Kind;Lkotlin/jvm/functions/Function0;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getCallable", "()Lkotlin/reflect/jvm/internal/KCallableImpl;", "descriptor", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor$delegate", "getIndex", "()I", "isOptional", "", "()Z", "isVararg", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "name", "", "getName", "()Ljava/lang/String;", "type", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "equals", "other", "", "hashCode", "toString", "kotlin-reflect-api"})
public final class o
  implements b.i.j
{
  final e<?> b;
  final int c;
  final j.a d;
  private final z.a e;
  private final z.a f;
  
  public o(e<?> parame, int paramInt, j.a parama, b.f.a.a<? extends ae> parama1)
  {
    this.b = parame;
    this.c = paramInt;
    this.d = parama;
    this.e = z.a(null, parama1);
    this.f = z.a(null, (b.f.a.a)new a(this));
  }
  
  private final ae b()
  {
    return (ae)this.e.a();
  }
  
  public final String a()
  {
    ae localae = b();
    Object localObject = localae;
    if (!(localae instanceof au)) {
      localObject = null;
    }
    localObject = (au)localObject;
    if (localObject == null) {
      return null;
    }
    if (((au)localObject).b().l()) {
      return null;
    }
    localObject = ((au)localObject).i();
    b.f.b.j.a(localObject, "valueParameter.name");
    if (((f)localObject).b) {
      return null;
    }
    return ((f)localObject).a;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof o))
    {
      e locale = this.b;
      paramObject = (o)paramObject;
      if ((b.f.b.j.a(locale, ((o)paramObject).b)) && (b.f.b.j.a(b(), ((o)paramObject).b()))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.b.hashCode() * 31 + b().hashCode();
  }
  
  public final String toString()
  {
    ab localab = ab.a;
    return ab.a(this);
  }
  
  @b.j(a={1, 1, 13}, b={"\000\f\n\000\n\002\020 \n\002\020\033\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, c={"<anonymous>", "", "", "invoke"})
  static final class a
    extends k
    implements b.f.a.a<List<? extends Annotation>>
  {
    a(o paramo)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
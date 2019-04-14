package b.i.b;

import b.f.b.v;
import b.i.b.a.af;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.t;
import b.i.b.a.c.e.a.ag;
import b.i.b.a.c.e.a.o;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.b.a.g;
import b.i.d;
import b.i.e;

@b.j(a={1, 1, 13}, b={"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\036\020\000\032\n\022\004\022\002H\002\030\0010\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003¨\006\004"}, c={"reflect", "Lkotlin/reflect/KFunction;", "R", "Lkotlin/Function;", "kotlin-reflect-api"})
public final class b
{
  public static final <R> e<R> a(b.a<? extends R> parama)
  {
    b.f.b.j.b(parama, "receiver$0");
    Object localObject2 = (b.j)parama.getClass().getAnnotation(b.j.class);
    if (localObject2 == null) {
      return null;
    }
    Object localObject1 = ((b.j)localObject2).b();
    int i = localObject1.length;
    boolean bool = false;
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      localObject1 = null;
    }
    if (localObject1 == null) {
      return null;
    }
    Object localObject3 = b.i.b.a.c.e.b.a.j.c((String[])localObject1, ((b.j)localObject2).c());
    localObject1 = (b.i.b.a.c.e.b.a.h)((b.m)localObject3).a;
    localObject3 = (a.o)((b.m)localObject3).b;
    Object localObject4 = ((b.j)localObject2).a();
    if ((((b.j)localObject2).d() & 0x8) != 0) {
      bool = true;
    }
    localObject2 = new g((int[])localObject4, bool);
    parama = parama.getClass();
    localObject4 = (b.i.b.a.c.g.q)localObject3;
    localObject1 = (c)localObject1;
    localObject3 = ((a.o)localObject3).k;
    b.f.b.j.a(localObject3, "proto.typeTable");
    parama = (al)af.a(parama, (b.i.b.a.c.g.q)localObject4, (c)localObject1, new b.i.b.a.c.e.a.h((a.ag)localObject3), (b.i.b.a.c.e.a.a)localObject2, (b.f.a.m)a.c);
    if (parama == null) {
      return null;
    }
    return (e)new b.i.b.a.j((b.i.b.a.i)b.i.b.a.a.a, (t)parama);
  }
  
  @b.j(a={1, 1, 13}, b={"\000\034\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\0042\025\020\005\032\0210\006¢\006\f\b\007\022\b\b\b\022\004\b\b(\t¢\006\002\b\n"}, c={"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/SimpleFunctionDescriptor;", "R", "p1", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "p2", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;", "Lkotlin/ParameterName;", "name", "proto", "invoke"})
  static final class a
    extends b.f.b.i
    implements b.f.a.m<b.i.b.a.c.j.a.q, a.o, al>
  {
    public static final a c = new a();
    
    a()
    {
      super();
    }
    
    public final d f()
    {
      return v.a(b.i.b.a.c.j.a.q.class);
    }
    
    public final String g()
    {
      return "loadFunction";
    }
    
    public final String h()
    {
      return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
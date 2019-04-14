package b.i.b.a;

import b.f.a.a;
import b.i.b.a.a.d;
import b.i.b.a.a.e;
import b.i.b.a.a.e.d;
import b.i.b.a.a.e.d.a;
import b.i.b.a.a.e.d.b;
import b.i.b.a.a.e.d.c;
import b.i.b.a.a.e.d.d;
import b.i.b.a.a.e.d.e;
import b.i.b.a.a.e.e;
import b.i.b.a.a.e.e.a;
import b.i.b.a.a.e.e.b;
import b.i.b.a.a.e.e.c;
import b.i.b.a.a.e.e.d;
import b.i.b.a.a.e.e.e;
import b.i.b.a.a.e.f;
import b.i.b.a.a.e.f.a;
import b.i.b.a.a.e.f.b;
import b.i.b.a.a.e.f.c;
import b.i.b.a.a.e.f.d;
import b.i.b.a.a.e.f.e;
import b.i.b.a.a.e.f.f;
import b.i.b.a.a.h;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.b.a.f.b;
import b.i.b.a.c.e.b.b.c;
import b.i.b.a.c.e.b.b.e;
import b.i.b.a.c.l.av;
import b.w;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

@b.j(a={1, 1, 13}, b={"\000\030\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\032 \020\000\032\006\022\002\b\0030\001*\n\022\002\b\003\022\002\b\0030\0022\006\020\003\032\0020\004H\002\032\f\020\005\032\0020\004*\0020\006H\002¨\006\007"}, c={"computeCallerForAccessor", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "isGetter", "", "isJvmFieldPropertyInCompanionObject", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "kotlin-reflect-api"})
public final class t
{
  static final d<?> a(s.a<?, ?> parama, final boolean paramBoolean)
  {
    Object localObject1 = i.d;
    if (i.g().a((CharSequence)parama.a().d)) {
      return (d)b.i.b.a.a.i.a;
    }
    final a locala = new a(parama);
    c localc = new c(parama, paramBoolean, new b(parama), locala);
    localObject1 = ad.b;
    localObject1 = ad.a(parama.a().n());
    Object localObject2;
    if ((localObject1 instanceof d.c))
    {
      d.c localc1 = (d.c)localObject1;
      localObject1 = localc1.c;
      localObject2 = null;
      if (paramBoolean) {
        if (((b.e)localObject1).g())
        {
          localObject1 = ((b.e)localObject1).d;
          break label133;
        }
      }
      while (!((b.e)localObject1).k())
      {
        localObject1 = null;
        break;
      }
      localObject1 = ((b.e)localObject1).e;
      label133:
      if (localObject1 != null) {
        localObject2 = parama.a().b.a(localc1.d.a(((b.c)localObject1).b), localc1.d.a(((b.c)localObject1).c), af.a((b.i.b.a.c.b.b)parama.i()));
      }
      if (localObject2 == null)
      {
        localObject1 = parama.a().l();
        if (localObject1 == null)
        {
          localObject1 = new StringBuilder("No accessors or field is found for property ");
          ((StringBuilder)localObject1).append(parama.a());
          throw ((Throwable)new x(((StringBuilder)localObject1).toString()));
        }
      }
      else
      {
        if (!Modifier.isStatic(((Method)localObject2).getModifiers())) {
          if (parama.a().e()) {
            localObject1 = new e.f.a((Method)localObject2, parama.a().e);
          }
        }
        for (;;)
        {
          localObject1 = (e.f)localObject1;
          break label295;
          localObject1 = new e.f.d((Method)localObject2);
          continue;
          label295:
          localObject1 = (e)localObject1;
          break;
          if (locala.b())
          {
            if (parama.a().e()) {
              localObject1 = new e.f.b((Method)localObject2);
            } else {
              localObject1 = new e.f.e((Method)localObject2);
            }
          }
          else if (parama.a().e()) {
            localObject1 = new e.f.c((Method)localObject2, parama.a().e);
          } else {
            localObject1 = new e.f.f((Method)localObject2);
          }
        }
      }
    }
    else
    {
      if (!(localObject1 instanceof d.a)) {
        break label411;
      }
      localObject1 = ((d.a)localObject1).a;
    }
    localObject1 = localc.a((Field)localObject1);
    label411:
    if ((localObject1 instanceof d.b))
    {
      if (paramBoolean)
      {
        localObject1 = ((d.b)localObject1).a;
      }
      else
      {
        localObject2 = (d.b)localObject1;
        localObject1 = ((d.b)localObject2).b;
        if (localObject1 == null) {
          break label510;
        }
      }
      if (parama.a().e()) {}
      for (localObject1 = new e.f.a((Method)localObject1, parama.a().e);; localObject1 = new e.f.d((Method)localObject1))
      {
        localObject1 = (e.f)localObject1;
        break;
      }
      localObject1 = (e)localObject1;
      return h.a((e)localObject1, (b.i.b.a.c.b.b)parama.i());
      label510:
      parama = new StringBuilder("No source found for setter of Java method property: ");
      parama.append(((d.b)localObject2).a);
      throw ((Throwable)new x(parama.toString()));
    }
    if ((localObject1 instanceof d.d))
    {
      if (paramBoolean)
      {
        localObject1 = ((d.d)localObject1).a;
      }
      else
      {
        localObject1 = ((d.d)localObject1).b;
        if (localObject1 == null) {
          break label749;
        }
      }
      localObject1 = parama.a().b.a(((c.e)localObject1).b.a, ((c.e)localObject1).b.b, af.a((b.i.b.a.c.b.b)parama.i()));
      if (localObject1 != null)
      {
        paramBoolean = Modifier.isStatic(((Method)localObject1).getModifiers());
        if ((w.a) && (!(paramBoolean ^ true)))
        {
          localObject1 = new StringBuilder("Mapped property cannot have a static accessor: ");
          ((StringBuilder)localObject1).append(parama.a());
          throw ((Throwable)new AssertionError(((StringBuilder)localObject1).toString()));
        }
        if (parama.a().e()) {
          return (d)new e.f.a((Method)localObject1, parama.a().e);
        }
        return (d)new e.f.d((Method)localObject1);
      }
      localObject1 = new StringBuilder("No accessor found for property ");
      ((StringBuilder)localObject1).append(parama.a());
      throw ((Throwable)new x(((StringBuilder)localObject1).toString()));
      label749:
      localObject1 = new StringBuilder("No setter found for property ");
      ((StringBuilder)localObject1).append(parama.a());
      throw ((Throwable)new x(((StringBuilder)localObject1).toString()));
    }
    throw new b.k();
  }
  
  @b.j(a={1, 1, 13}, b={"\000\b\n\000\n\002\020\013\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, c={"isJvmStaticProperty", "", "invoke"})
  static final class a
    extends b.f.b.k
    implements a<Boolean>
  {
    a(s.a parama)
    {
      super();
    }
    
    public final boolean b()
    {
      return this.a.a().n().r().b(af.a());
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\b\n\000\n\002\020\013\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, c={"isNotNullProperty", "", "invoke"})
  static final class b
    extends b.f.b.k
    implements a<Boolean>
  {
    b(s.a parama)
    {
      super();
    }
    
    public final boolean b()
    {
      return !av.e(this.a.a().n().y());
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\002\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\002H\n¢\006\002\b\004"}, c={"computeFieldCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "invoke"})
  static final class c
    extends b.f.b.k
    implements b.f.a.b<Field, e<? extends Field>>
  {
    c(s.a parama, boolean paramBoolean, t.b paramb, t.a parama1)
    {
      super();
    }
    
    public final e<Field> a(Field paramField)
    {
      b.f.b.j.b(paramField, "field");
      if ((!t.a(this.a.a().n())) && (Modifier.isStatic(paramField.getModifiers())))
      {
        if (locala.b())
        {
          if (paramBoolean)
          {
            if (this.a.a().e()) {}
            for (paramField = new e.d.b(paramField);; paramField = new e.d.d(paramField))
            {
              paramField = (e.d)paramField;
              break;
            }
            return (e)paramField;
          }
          if (this.a.a().e()) {}
          for (paramField = new e.e.b(paramField, this.c.b());; paramField = new e.e.d(paramField, this.c.b()))
          {
            paramField = (e.e)paramField;
            break;
          }
          return (e)paramField;
        }
        if (paramBoolean) {}
        for (paramField = new e.d.e(paramField);; paramField = new e.e.e(paramField, this.c.b())) {
          return (e)paramField;
        }
      }
      if (paramBoolean)
      {
        if (this.a.a().e()) {}
        for (paramField = new e.d.a(paramField, this.a.a().e);; paramField = new e.d.c(paramField))
        {
          paramField = (e.d)paramField;
          break;
        }
        return (e)paramField;
      }
      if (this.a.a().e()) {}
      for (paramField = new e.e.a(paramField, this.c.b(), this.a.a().e);; paramField = new e.e.c(paramField, this.c.b()))
      {
        paramField = (e.e)paramField;
        break;
      }
      return (e)paramField;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
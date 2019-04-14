package b.i.b.a.c.g;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class i
  extends a
  implements Serializable
{
  protected i() {}
  
  protected i(byte paramByte) {}
  
  public static <ContainingType extends q, Type> f<ContainingType, Type> a(ContainingType paramContainingType, q paramq, int paramInt, z.a parama, Class paramClass)
  {
    return new f(paramContainingType, Collections.emptyList(), paramq, new e(paramInt, parama, true), paramClass);
  }
  
  public static <ContainingType extends q, Type> f<ContainingType, Type> a(ContainingType paramContainingType, Type paramType, q paramq, int paramInt, z.a parama, Class paramClass)
  {
    return new f(paramContainingType, paramType, paramq, new e(paramInt, parama, false), paramClass);
  }
  
  static Object a(Method paramMethod, Object... paramVarArgs)
  {
    try
    {
      paramMethod = paramMethod.invoke(null, paramVarArgs);
      return paramMethod;
    }
    catch (InvocationTargetException paramMethod)
    {
      paramMethod = paramMethod.getCause();
      if (!(paramMethod instanceof RuntimeException))
      {
        if ((paramMethod instanceof Error)) {
          throw ((Error)paramMethod);
        }
        throw new RuntimeException("Unexpected exception thrown by generated accessor method.", paramMethod);
      }
      throw ((RuntimeException)paramMethod);
    }
    catch (IllegalAccessException paramMethod)
    {
      throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", paramMethod);
    }
  }
  
  static Method a(Class paramClass, String paramString, Class... paramVarArgs)
  {
    try
    {
      paramVarArgs = paramClass.getMethod(paramString, paramVarArgs);
      return paramVarArgs;
    }
    catch (NoSuchMethodException paramVarArgs)
    {
      paramClass = String.valueOf(String.valueOf(paramClass.getName()));
      paramString = String.valueOf(String.valueOf(paramString));
      StringBuilder localStringBuilder = new StringBuilder(paramClass.length() + 45 + paramString.length());
      localStringBuilder.append("Generated message class \"");
      localStringBuilder.append(paramClass);
      localStringBuilder.append("\" missing method \"");
      localStringBuilder.append(paramString);
      localStringBuilder.append("\".");
      throw new RuntimeException(localStringBuilder.toString(), paramVarArgs);
    }
  }
  
  protected boolean a(e parame, f paramf, g paramg, int paramInt)
    throws IOException
  {
    return parame.a(paramInt, paramf);
  }
  
  public s<? extends q> b()
  {
    throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
  }
  
  protected void w() {}
  
  public static abstract class a<MessageType extends i, BuilderType extends a>
    extends a.a<BuilderType>
  {
    public d a = d.b;
    
    public abstract BuilderType a(MessageType paramMessageType);
    
    public abstract MessageType a();
    
    public BuilderType b()
    {
      throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }
  }
  
  public static abstract class b<MessageType extends i.c<MessageType>, BuilderType extends b<MessageType, BuilderType>>
    extends i.a<MessageType, BuilderType>
    implements i.d<MessageType>
  {
    protected h<i.e> b = h.b();
    private boolean c;
    
    protected final void a(MessageType paramMessageType)
    {
      if (!this.c)
      {
        this.b = this.b.d();
        this.c = true;
      }
      h localh = this.b;
      paramMessageType = i.c.a(paramMessageType);
      int i = 0;
      while (i < paramMessageType.a.b())
      {
        localh.a(paramMessageType.a.b(i));
        i += 1;
      }
      paramMessageType = paramMessageType.a.c().iterator();
      while (paramMessageType.hasNext()) {
        localh.a((Map.Entry)paramMessageType.next());
      }
    }
    
    public BuilderType f()
    {
      throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }
  }
  
  public static abstract class c<MessageType extends c<MessageType>>
    extends i
    implements i.d<MessageType>
  {
    protected final h<i.e> s;
    
    protected c()
    {
      this.s = h.a();
    }
    
    protected c(i.b<MessageType, ?> paramb)
    {
      this.s = i.b.a(paramb);
    }
    
    private void d(i.f<MessageType, ?> paramf)
    {
      if (paramf.a == j()) {
        return;
      }
      throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }
    
    public final <Type> Type a(i.f<MessageType, List<Type>> paramf, int paramInt)
    {
      d(paramf);
      Object localObject = this.s;
      i.e locale = paramf.d;
      if (locale.d())
      {
        localObject = ((h)localObject).a(locale);
        if (localObject != null) {
          return (Type)paramf.a(((List)localObject).get(paramInt));
        }
        throw new IndexOutOfBoundsException();
      }
      throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
    
    protected final boolean a(e parame, f paramf, g paramg, int paramInt)
      throws IOException
    {
      h localh = this.s;
      Object localObject = j();
      int i = z.a(paramInt);
      int j = z.b(paramInt);
      i.f localf = (i.f)paramg.a.get(new g.a(localObject, j));
      if (localf != null)
      {
        if (i == h.a(localf.d.c, false))
        {
          i = 0;
          break label133;
        }
        if ((localf.d.d) && (localf.d.c.a()) && (i == h.a(localf.d.c, true)))
        {
          i = 0;
          j = 1;
          break label136;
        }
      }
      i = 1;
      label133:
      j = 0;
      label136:
      if (i != 0) {
        return parame.a(paramInt, paramf);
      }
      if (j != 0)
      {
        paramInt = parame.b(parame.d());
        if (localf.d.c == z.a.n) {
          while (parame.h() > 0)
          {
            i = parame.d();
            paramf = localf.d.a.a(i);
            if (paramf == null) {
              break label645;
            }
            localh.b(localf.d, localf.b(paramf));
          }
        }
        while (parame.h() > 0)
        {
          paramf = h.a(parame, localf.d.c);
          localh.b(localf.d, paramf);
        }
        parame.c(paramInt);
        return true;
      }
      switch (i.1.a[localf.d.c.s.ordinal()])
      {
      default: 
        parame = h.a(parame, localf.d.c);
        break;
      case 2: 
        i = parame.d();
        paramg = localf.d.a.a(i);
        parame = paramg;
        if (paramg == null)
        {
          paramf.e(paramInt);
          paramf.e(i);
          return true;
        }
        break;
      case 1: 
        localObject = null;
        paramf = (f)localObject;
        if (!localf.d.d)
        {
          q localq = (q)localh.a(localf.d);
          paramf = (f)localObject;
          if (localq != null) {
            paramf = localq.h();
          }
        }
        localObject = paramf;
        if (paramf == null) {
          localObject = localf.c.i();
        }
        if (localf.d.c == z.a.j)
        {
          paramInt = localf.d.b;
          if (parame.d < parame.e)
          {
            parame.d += 1;
            ((q.a)localObject).b(parame, paramg);
            parame.a(z.a(paramInt, 4));
            parame.d -= 1;
          }
          else
          {
            throw k.g();
          }
        }
        else
        {
          paramInt = parame.d();
          if (parame.d >= parame.e) {
            break label596;
          }
          paramInt = parame.b(paramInt);
          parame.d += 1;
          ((q.a)localObject).b(parame, paramg);
          parame.a(0);
          parame.d -= 1;
          parame.c(paramInt);
        }
        parame = ((q.a)localObject).d();
        break;
        label596:
        throw k.g();
      }
      if (localf.d.d)
      {
        localh.b(localf.d, localf.b(parame));
        return true;
      }
      localh.a(localf.d, localf.b(parame));
      label645:
      return true;
    }
    
    public final <Type> boolean a(i.f<MessageType, Type> paramf)
    {
      d(paramf);
      h localh = this.s;
      paramf = paramf.d;
      if (!paramf.d()) {
        return localh.a.get(paramf) != null;
      }
      throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }
    
    public final <Type> int b(i.f<MessageType, List<Type>> paramf)
    {
      d(paramf);
      h localh = this.s;
      paramf = paramf.d;
      if (paramf.d())
      {
        paramf = localh.a(paramf);
        if (paramf == null) {
          return 0;
        }
        return ((List)paramf).size();
      }
      throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
    
    public final <Type> Type c(i.f<MessageType, Type> paramf)
    {
      d(paramf);
      Object localObject = this.s.a(paramf.d);
      if (localObject == null) {
        return (Type)paramf.b;
      }
      if (paramf.d.d)
      {
        if (paramf.d.c.s == z.b.h)
        {
          ArrayList localArrayList = new ArrayList();
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext()) {
            localArrayList.add(paramf.a(((Iterator)localObject).next()));
          }
          return localArrayList;
        }
        return (Type)localObject;
      }
      return (Type)paramf.a(localObject);
    }
    
    protected final void w()
    {
      this.s.c();
    }
    
    protected final c<MessageType>.a x()
    {
      return new a((byte)0);
    }
    
    public final class a
    {
      private final Iterator<Map.Entry<i.e, Object>> b;
      private Map.Entry<i.e, Object> c;
      private final boolean d;
      
      private a()
      {
        this$1 = i.c.a(i.c.this);
        if (i.c.this.b) {
          this$1 = new l.b(i.c.this.a.entrySet().iterator());
        } else {
          this$1 = i.c.this.a.entrySet().iterator();
        }
        this.b = i.c.this;
        if (this.b.hasNext()) {
          this.c = ((Map.Entry)this.b.next());
        }
        this.d = false;
      }
      
      public final void a(int paramInt, f paramf)
        throws IOException
      {
        if ((this.c != null) && (((i.e)this.c.getKey()).b < paramInt))
        {
          Object localObject = (i.e)this.c.getKey();
          if ((this.d) && (((i.e)localObject).c.s == z.b.i) && (!((i.e)localObject).d)) {
            paramf.b(((i.e)localObject).b, (q)this.c.getValue());
          } else {
            h.a((h.a)localObject, this.c.getValue(), paramf);
          }
          if (this.b.hasNext()) {}
          for (localObject = (Map.Entry)this.b.next();; localObject = null)
          {
            this.c = ((Map.Entry)localObject);
            break;
          }
        }
      }
    }
  }
  
  public static abstract interface d
    extends r
  {}
  
  static final class e
    implements h.a<e>
  {
    final j.b<?> a = null;
    final int b;
    final z.a c;
    final boolean d;
    final boolean e;
    
    e(int paramInt, z.a parama, boolean paramBoolean)
    {
      this.b = paramInt;
      this.c = parama;
      this.d = paramBoolean;
      this.e = false;
    }
    
    public final int a()
    {
      return this.b;
    }
    
    public final q.a a(q.a parama, q paramq)
    {
      return ((i.a)parama).a((i)paramq);
    }
    
    public final z.a b()
    {
      return this.c;
    }
    
    public final z.b c()
    {
      return this.c.s;
    }
    
    public final boolean d()
    {
      return this.d;
    }
    
    public final boolean e()
    {
      return this.e;
    }
  }
  
  public static final class f<ContainingType extends q, Type>
  {
    final ContainingType a;
    final Type b;
    final q c;
    final i.e d;
    final Class e;
    final Method f;
    
    f(ContainingType paramContainingType, Type paramType, q paramq, i.e parame, Class paramClass)
    {
      if (paramContainingType != null)
      {
        if ((parame.c == z.a.k) && (paramq == null)) {
          throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = paramContainingType;
        this.b = paramType;
        this.c = paramq;
        this.d = parame;
        this.e = paramClass;
        if (j.a.class.isAssignableFrom(paramClass)) {}
        for (paramContainingType = i.a(paramClass, "valueOf", new Class[] { Integer.TYPE });; paramContainingType = null)
        {
          this.f = paramContainingType;
          return;
        }
      }
      throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }
    
    final Object a(Object paramObject)
    {
      Object localObject = paramObject;
      if (this.d.c.s == z.b.h) {
        localObject = i.a(this.f, new Object[] { (Integer)paramObject });
      }
      return localObject;
    }
    
    final Object b(Object paramObject)
    {
      Object localObject = paramObject;
      if (this.d.c.s == z.b.h) {
        localObject = Integer.valueOf(((j.a)paramObject).a());
      }
      return localObject;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package b.i.b.a.a;

import b.a.ac;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000J\n\002\030\002\n\002\030\002\n\002\020\001\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\b\007\n\002\020\021\n\002\b\004\b\000\030\0002\n\022\006\022\004\030\0010\0020\001:\002 !B?\022\n\020\003\032\006\022\002\b\0030\004\022\f\020\005\032\b\022\004\022\0020\0070\006\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\016\b\002\020\f\032\b\022\004\022\0020\r0\006¢\006\002\020\016J\033\020\034\032\004\030\0010\0202\n\020\035\032\006\022\002\b\0030\036H\026¢\006\002\020\037R\016\020\b\032\0020\tX\004¢\006\002\n\000R\026\020\017\032\n\022\006\022\004\030\0010\0200\006X\004¢\006\002\n\000R\030\020\021\032\f\022\b\022\006\022\002\b\0030\0040\006X\004¢\006\002\n\000R\022\020\003\032\006\022\002\b\0030\004X\004¢\006\002\n\000R\026\020\022\032\004\030\0010\0028VX\004¢\006\006\032\004\b\023\020\024R\024\020\f\032\b\022\004\022\0020\r0\006X\004¢\006\002\n\000R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000R\032\020\025\032\b\022\004\022\0020\0260\006X\004¢\006\b\n\000\032\004\b\027\020\030R\024\020\031\032\0020\0268VX\004¢\006\006\032\004\b\032\020\033¨\006\""}, c={"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "jClass", "Ljava/lang/Class;", "parameterNames", "", "", "callMode", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "origin", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "methods", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V", "defaultValues", "", "erasedParameterTypes", "member", "getMember", "()Ljava/lang/Void;", "parameterTypes", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "CallMode", "Origin", "kotlin-reflect-api"})
public final class a
  implements d
{
  private final List<Type> a;
  private final List<Class<?>> b;
  private final List<Object> c;
  private final Class<?> d;
  private final List<String> e;
  private final a f;
  private final List<Method> g;
  
  public a(Class<?> paramClass, List<String> paramList, a parama, b paramb, List<Method> paramList1)
  {
    this.d = paramClass;
    this.e = paramList;
    this.f = parama;
    this.g = paramList1;
    paramList = (Iterable)this.g;
    paramClass = (Collection)new ArrayList(b.a.j.a(paramList));
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      paramClass.add(((Method)paramList.next()).getGenericReturnType());
    }
    this.a = ((List)paramClass);
    paramClass = (Iterable)this.g;
    parama = (Collection)new ArrayList(b.a.j.a(paramClass));
    paramList1 = paramClass.iterator();
    while (paramList1.hasNext())
    {
      paramClass = ((Method)paramList1.next()).getReturnType();
      b.f.b.j.a(paramClass, "it");
      paramList = b.i.b.a.e.b.d(paramClass);
      if (paramList != null) {
        paramClass = paramList;
      }
      parama.add(paramClass);
    }
    this.b = ((List)parama);
    paramList = (Iterable)this.g;
    paramClass = (Collection)new ArrayList(b.a.j.a(paramList));
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      paramClass.add(((Method)paramList.next()).getDefaultValue());
    }
    this.c = ((List)paramClass);
    if ((this.f == a.b) && (paramb == b.a))
    {
      if (!(((Collection)b.a.j.b((Iterable)this.e, "value")).isEmpty() ^ true)) {
        return;
      }
      throw ((Throwable)new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead."));
    }
  }
  
  public final Object a(Object[] paramArrayOfObject)
  {
    b.f.b.j.b(paramArrayOfObject, "args");
    b.f.b.j.b(paramArrayOfObject, "args");
    d.a.a(this, paramArrayOfObject);
    Collection localCollection = (Collection)new ArrayList(paramArrayOfObject.length);
    int k = paramArrayOfObject.length;
    int j = 0;
    int i = 0;
    while (j < k)
    {
      Object localObject = paramArrayOfObject[j];
      if ((localObject == null) && (this.f == a.a)) {
        localObject = this.c.get(i);
      } else {
        localObject = b.a(localObject, (Class)this.b.get(i));
      }
      if (localObject != null)
      {
        localCollection.add(localObject);
        j += 1;
        i += 1;
      }
      else
      {
        b.a(i, (String)this.e.get(i), (Class)this.b.get(i));
        throw null;
      }
    }
    paramArrayOfObject = (List)localCollection;
    return b.a(this.d, ac.a((Iterable)b.a.j.a((Iterable)this.e, (Iterable)paramArrayOfObject)), this.g);
  }
  
  public final Type b()
  {
    return (Type)this.d;
  }
  
  public final List<Type> c()
  {
    return this.a;
  }
  
  @b.j(a={1, 1, 13}, b={"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\005"}, c={"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflect-api"})
  public static enum a
  {
    static
    {
      a locala1 = new a("CALL_BY_NAME", 0);
      a = locala1;
      a locala2 = new a("POSITIONAL_CALL", 1);
      b = locala2;
      c = new a[] { locala1, locala2 };
    }
    
    private a() {}
  }
  
  @b.j(a={1, 1, 13}, b={"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\005"}, c={"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflect-api"})
  public static enum b
  {
    static
    {
      b localb1 = new b("JAVA", 0);
      a = localb1;
      b localb2 = new b("KOTLIN", 1);
      b = localb2;
      c = new b[] { localb1, localb2 };
    }
    
    private b() {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
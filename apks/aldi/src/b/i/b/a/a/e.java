package b.i.b.a.a;

import b.f.b.x;
import b.r;
import b.u;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000R\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\b\007\n\002\020 \n\002\b\005\n\002\020\002\n\000\n\002\020\000\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b0\030\000 \034*\n\b\000\020\001 \001*\0020\0022\b\022\004\022\002H\0010\003:\006\033\034\035\036\037 B3\b\002\022\006\020\004\032\0028\000\022\006\020\005\032\0020\006\022\f\020\007\032\b\022\002\b\003\030\0010\b\022\f\020\t\032\b\022\004\022\0020\0060\n¢\006\002\020\013J\022\020\027\032\0020\0302\b\020\031\032\004\030\0010\032H\004R\027\020\007\032\b\022\002\b\003\030\0010\b¢\006\b\n\000\032\004\b\f\020\rR\023\020\004\032\0028\000¢\006\n\n\002\020\020\032\004\b\016\020\017R\032\020\021\032\b\022\004\022\0020\0060\022X\004¢\006\b\n\000\032\004\b\023\020\024R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\025\020\026\001\005!\"#$%¨\006&"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "member", "returnType", "Ljava/lang/reflect/Type;", "instanceClass", "Ljava/lang/Class;", "valueParameterTypes", "", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "getInstanceClass", "()Ljava/lang/Class;", "getMember", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Member;", "parameterTypes", "", "getParameterTypes", "()Ljava/util/List;", "getReturnType", "()Ljava/lang/reflect/Type;", "checkObjectInstance", "", "obj", "", "BoundConstructor", "Companion", "Constructor", "FieldGetter", "FieldSetter", "Method", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflect-api"})
public abstract class e<M extends Member>
  implements d<M>
{
  public static final b e = new b((byte)0);
  final List<Type> a;
  final M b;
  final Type c;
  final Class<?> d;
  
  private e(M paramM, Type paramType, Class<?> paramClass, Type[] paramArrayOfType)
  {
    this.b = paramM;
    this.c = paramType;
    this.d = paramClass;
    paramM = this.d;
    if (paramM != null)
    {
      paramType = new x();
      paramType.b((Type)paramM);
      paramType.a(paramArrayOfType);
      paramType = b.a.j.b((Type[])paramType.a(new Type[paramType.a.size()]));
      paramM = paramType;
      if (paramType != null) {}
    }
    else
    {
      paramM = b.a.e.g(paramArrayOfType);
    }
    this.a = paramM;
  }
  
  public final M a()
  {
    return this.b;
  }
  
  protected final void a(Object paramObject)
  {
    if ((paramObject != null) && (this.b.getDeclaringClass().isInstance(paramObject))) {
      return;
    }
    throw ((Throwable)new IllegalArgumentException("An object member requires the object instance passed as the first argument."));
  }
  
  public final Type b()
  {
    return this.c;
  }
  
  public void b(Object[] paramArrayOfObject)
  {
    b.f.b.j.b(paramArrayOfObject, "args");
    d.a.a(this, paramArrayOfObject);
  }
  
  public final List<Type> c()
  {
    return this.a;
  }
  
  @b.j(a={1, 1, 13}, b={"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\003\n\002\020\021\n\002\b\002\030\0002\0020\0012\f\022\b\022\006\022\002\b\0030\0030\002B\033\022\n\020\004\032\006\022\002\b\0030\003\022\b\020\005\032\004\030\0010\006¢\006\002\020\007J\033\020\b\032\004\030\0010\0062\n\020\t\032\006\022\002\b\0030\nH\026¢\006\002\020\013R\020\020\005\032\004\030\0010\006X\004¢\006\002\n\000¨\006\f"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "boundReceiver", "", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
  public static final class a
    extends e<Constructor<?>>
    implements c
  {
    private final Object f;
    
    public a(Constructor<?> paramConstructor, Object paramObject)
    {
      super((Type)localObject, null, paramConstructor, (byte)0);
      this.f = paramObject;
    }
    
    public final Object a(Object[] paramArrayOfObject)
    {
      b.f.b.j.b(paramArrayOfObject, "args");
      b(paramArrayOfObject);
      Constructor localConstructor = (Constructor)this.b;
      x localx = new x();
      localx.b(this.f);
      localx.a(paramArrayOfObject);
      return localConstructor.newInstance(localx.a(new Object[localx.a.size()]));
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\003\032\b\022\004\022\002H\0050\004\"\006\b\001\020\005\030\001*\n\022\006\b\001\022\002H\0050\004H\b¢\006\002\020\006¨\006\007"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Companion;", "", "()V", "dropFirst", "", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "kotlin-reflect-api"})
  public static final class b {}
  
  @b.j(a={1, 1, 13}, b={"\000\036\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\000\n\000\n\002\020\021\n\002\b\002\030\0002\f\022\b\022\006\022\002\b\0030\0020\001B\021\022\n\020\003\032\006\022\002\b\0030\002¢\006\002\020\004J\033\020\005\032\004\030\0010\0062\n\020\007\032\006\022\002\b\0030\bH\026¢\006\002\020\t¨\006\n"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
  public static final class c
    extends e<Constructor<?>>
  {
    public c(Constructor<?> paramConstructor)
    {
      super(localType, localClass1, paramConstructor, (byte)0);
    }
    
    public final Object a(Object[] paramArrayOfObject)
    {
      b.f.b.j.b(paramArrayOfObject, "args");
      b(paramArrayOfObject);
      return ((Constructor)this.b).newInstance(Arrays.copyOf(paramArrayOfObject, paramArrayOfObject.length));
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020\000\n\000\n\002\020\021\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b6\030\0002\b\022\004\022\0020\0020\001:\005\f\r\016\017\020B\027\b\002\022\006\020\003\032\0020\002\022\006\020\004\032\0020\005¢\006\002\020\006J\033\020\007\032\004\030\0010\b2\n\020\t\032\006\022\002\b\0030\nH\026¢\006\002\020\013\001\005\021\022\023\024\025¨\006\026"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "requiresInstance", "", "(Ljava/lang/reflect/Field;Z)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "kotlin-reflect-api"})
  public static abstract class d
    extends e<Field>
  {
    private d(Field paramField, boolean paramBoolean)
    {
      super(localType, paramField, new Type[0], (byte)0);
    }
    
    public Object a(Object[] paramArrayOfObject)
    {
      b.f.b.j.b(paramArrayOfObject, "args");
      b(paramArrayOfObject);
      Field localField = (Field)this.b;
      if (this.d != null) {
        paramArrayOfObject = b.a.e.b(paramArrayOfObject);
      } else {
        paramArrayOfObject = null;
      }
      return localField.get(paramArrayOfObject);
    }
    
    @b.j(a={1, 1, 13}, b={"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\002\b\003\n\002\020\021\n\002\b\002\030\0002\0020\0012\0020\002B\027\022\006\020\003\032\0020\004\022\b\020\005\032\004\030\0010\006¢\006\002\020\007J\033\020\b\032\004\030\0010\0062\n\020\t\032\006\022\002\b\0030\nH\026¢\006\002\020\013R\020\020\005\032\004\030\0010\006X\004¢\006\002\n\000¨\006\f"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "boundReceiver", "", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    public static final class a
      extends e.d
      implements c
    {
      private final Object f;
      
      public a(Field paramField, Object paramObject)
      {
        super(false, (byte)0);
        this.f = paramObject;
      }
      
      public final Object a(Object[] paramArrayOfObject)
      {
        b.f.b.j.b(paramArrayOfObject, "args");
        b(paramArrayOfObject);
        return ((Field)this.b).get(this.f);
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005¨\006\006"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflect-api"})
    public static final class b
      extends e.d
      implements c
    {
      public b(Field paramField)
      {
        super(false, (byte)0);
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004¨\006\005"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflect-api"})
    public static final class c
      extends e.d
    {
      public c(Field paramField)
      {
        super(true, (byte)0);
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\021\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\031\020\005\032\0020\0062\n\020\007\032\006\022\002\b\0030\bH\026¢\006\002\020\t¨\006\n"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "checkArguments", "", "args", "", "([Ljava/lang/Object;)V", "kotlin-reflect-api"})
    public static final class d
      extends e.d
    {
      public d(Field paramField)
      {
        super(true, (byte)0);
      }
      
      public final void b(Object[] paramArrayOfObject)
      {
        b.f.b.j.b(paramArrayOfObject, "args");
        super.b(paramArrayOfObject);
        a(b.a.e.c(paramArrayOfObject));
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004¨\006\005"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflect-api"})
    public static final class e
      extends e.d
    {
      public e(Field paramField)
      {
        super(false, (byte)0);
      }
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000D\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\000\n\000\n\002\020\021\n\002\b\002\n\002\020\002\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b6\030\0002\b\022\004\022\0020\0020\001:\005\020\021\022\023\024B\037\b\002\022\006\020\003\032\0020\002\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\007J\033\020\b\032\004\030\0010\t2\n\020\n\032\006\022\002\b\0030\013H\026¢\006\002\020\fJ\031\020\r\032\0020\0162\n\020\n\032\006\022\002\b\0030\013H\026¢\006\002\020\017R\016\020\004\032\0020\005X\004¢\006\002\n\000\001\005\025\026\027\030\031¨\006\032"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "notNull", "", "requiresInstance", "(Ljava/lang/reflect/Field;ZZ)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "checkArguments", "", "([Ljava/lang/Object;)V", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "kotlin-reflect-api"})
  public static abstract class e
    extends e<Field>
  {
    private final boolean f;
    
    private e(Field paramField, boolean paramBoolean1, boolean paramBoolean2)
    {
      super(localType, localClass, new Type[] { paramField }, (byte)0);
      this.f = paramBoolean1;
    }
    
    public Object a(Object[] paramArrayOfObject)
    {
      b.f.b.j.b(paramArrayOfObject, "args");
      b(paramArrayOfObject);
      Field localField = (Field)this.b;
      Object localObject;
      if (this.d != null) {
        localObject = b.a.e.b(paramArrayOfObject);
      } else {
        localObject = null;
      }
      localField.set(localObject, b.a.e.d(paramArrayOfObject));
      return u.a;
    }
    
    public void b(Object[] paramArrayOfObject)
    {
      b.f.b.j.b(paramArrayOfObject, "args");
      super.b(paramArrayOfObject);
      if (this.f)
      {
        if (b.a.e.d(paramArrayOfObject) != null) {
          return;
        }
        throw ((Throwable)new IllegalArgumentException("null is not allowed as a value for this property."));
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\021\n\002\b\002\030\0002\0020\0012\0020\002B\037\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\b\020\007\032\004\030\0010\b¢\006\002\020\tJ\033\020\n\032\004\030\0010\b2\n\020\013\032\006\022\002\b\0030\fH\026¢\006\002\020\rR\020\020\007\032\004\030\0010\bX\004¢\006\002\n\000¨\006\016"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "boundReceiver", "", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    public static final class a
      extends e.e
      implements c
    {
      private final Object f;
      
      public a(Field paramField, boolean paramBoolean, Object paramObject)
      {
        super(paramBoolean, false, (byte)0);
        this.f = paramObject;
      }
      
      public final Object a(Object[] paramArrayOfObject)
      {
        b.f.b.j.b(paramArrayOfObject, "args");
        b(paramArrayOfObject);
        ((Field)this.b).set(this.f, b.a.e.b(paramArrayOfObject));
        return u.a;
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020\000\n\000\n\002\020\021\n\002\b\002\030\0002\0020\0012\0020\002B\025\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\002\020\007J\033\020\b\032\004\030\0010\t2\n\020\n\032\006\022\002\b\0030\013H\026¢\006\002\020\f¨\006\r"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    public static final class b
      extends e.e
      implements c
    {
      public b(Field paramField, boolean paramBoolean)
      {
        super(paramBoolean, false, (byte)0);
      }
      
      public final Object a(Object[] paramArrayOfObject)
      {
        b.f.b.j.b(paramArrayOfObject, "args");
        b(paramArrayOfObject);
        ((Field)this.b).set(null, b.a.e.d(paramArrayOfObject));
        return u.a;
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006¨\006\007"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflect-api"})
    public static final class c
      extends e.e
    {
      public c(Field paramField, boolean paramBoolean)
      {
        super(paramBoolean, true, (byte)0);
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020\002\n\000\n\002\020\021\n\002\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\031\020\007\032\0020\b2\n\020\t\032\006\022\002\b\0030\nH\026¢\006\002\020\013¨\006\f"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "checkArguments", "", "args", "", "([Ljava/lang/Object;)V", "kotlin-reflect-api"})
    public static final class d
      extends e.e
    {
      public d(Field paramField, boolean paramBoolean)
      {
        super(paramBoolean, true, (byte)0);
      }
      
      public final void b(Object[] paramArrayOfObject)
      {
        b.f.b.j.b(paramArrayOfObject, "args");
        super.b(paramArrayOfObject);
        a(b.a.e.c(paramArrayOfObject));
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006¨\006\007"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflect-api"})
    public static final class e
      extends e.e
    {
      public e(Field paramField, boolean paramBoolean)
      {
        super(paramBoolean, false, (byte)0);
      }
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000D\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\021\n\002\030\002\n\002\b\003\n\002\020\000\n\002\b\t\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b6\030\0002\b\022\004\022\0020\0020\001:\006\020\021\022\023\024\025B)\b\002\022\006\020\003\032\0020\002\022\b\b\002\020\004\032\0020\005\022\016\b\002\020\006\032\b\022\004\022\0020\b0\007¢\006\002\020\tJ%\020\013\032\004\030\0010\f2\b\020\r\032\004\030\0010\f2\n\020\016\032\006\022\002\b\0030\007H\004¢\006\002\020\017R\016\020\n\032\0020\005X\004¢\006\002\n\000\001\006\026\027\030\031\032\033¨\006\034"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Method;", "method", "requiresInstance", "", "parameterTypes", "", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "isVoidMethod", "callMethod", "", "instance", "args", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "BoundStatic", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "kotlin-reflect-api"})
  public static abstract class f
    extends e<Method>
  {
    private final boolean f = b.f.b.j.a(this.c, Void.TYPE);
    
    private f(Method paramMethod, boolean paramBoolean, Type[] paramArrayOfType)
    {
      super(localType, paramMethod, paramArrayOfType, (byte)0);
    }
    
    protected final Object a(Object paramObject, Object[] paramArrayOfObject)
    {
      b.f.b.j.b(paramArrayOfObject, "args");
      paramObject = ((Method)this.b).invoke(paramObject, Arrays.copyOf(paramArrayOfObject, paramArrayOfObject.length));
      if (this.f) {
        paramObject = u.a;
      }
      return paramObject;
    }
    
    @b.j(a={1, 1, 13}, b={"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\002\b\003\n\002\020\021\n\002\b\002\030\0002\0020\0012\0020\002B\027\022\006\020\003\032\0020\004\022\b\020\005\032\004\030\0010\006¢\006\002\020\007J\033\020\b\032\004\030\0010\0062\n\020\t\032\006\022\002\b\0030\nH\026¢\006\002\020\013R\020\020\005\032\004\030\0010\006X\004¢\006\002\n\000¨\006\f"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "boundReceiver", "", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    public static final class a
      extends e.f
      implements c
    {
      private final Object f;
      
      public a(Method paramMethod, Object paramObject)
      {
        super(false, null, 4);
        this.f = paramObject;
      }
      
      public final Object a(Object[] paramArrayOfObject)
      {
        b.f.b.j.b(paramArrayOfObject, "args");
        b(paramArrayOfObject);
        return a(this.f, paramArrayOfObject);
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020\021\n\002\b\002\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\033\020\006\032\004\030\0010\0072\n\020\b\032\006\022\002\b\0030\tH\026¢\006\002\020\n¨\006\013"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    public static final class b
      extends e.f
      implements c
    {
      public b(Method paramMethod)
      {
        super(false, null, 4);
      }
      
      public final Object a(Object[] paramArrayOfObject)
      {
        b.f.b.j.b(paramArrayOfObject, "args");
        b(paramArrayOfObject);
        return a(null, paramArrayOfObject);
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\002\b\003\n\002\020\021\n\002\b\002\030\0002\0020\0012\0020\002B\027\022\006\020\003\032\0020\004\022\b\020\005\032\004\030\0010\006¢\006\002\020\007J\033\020\b\032\004\030\0010\0062\n\020\t\032\006\022\002\b\0030\nH\026¢\006\002\020\013R\020\020\005\032\004\030\0010\006X\004¢\006\002\n\000¨\006\f"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "boundReceiver", "", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    public static final class c
      extends e.f
      implements c
    {
      private final Object f;
      
      public c(Method paramMethod, Object paramObject)
      {
        super((Type[])localObject);
        this.f = paramObject;
        return;
        label58:
        throw new r("null cannot be cast to non-null type kotlin.Array<T>");
      }
      
      public final Object a(Object[] paramArrayOfObject)
      {
        b.f.b.j.b(paramArrayOfObject, "args");
        b(paramArrayOfObject);
        x localx = new x();
        localx.b(this.f);
        localx.a(paramArrayOfObject);
        return a(null, localx.a(new Object[localx.a.size()]));
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020\021\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\033\020\005\032\004\030\0010\0062\n\020\007\032\006\022\002\b\0030\bH\026¢\006\002\020\t¨\006\n"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    public static final class d
      extends e.f
    {
      public d(Method paramMethod)
      {
        super(false, null, 6);
      }
      
      public final Object a(Object[] paramArrayOfObject)
      {
        b.f.b.j.b(paramArrayOfObject, "args");
        b(paramArrayOfObject);
        Object localObject = paramArrayOfObject[0];
        if (paramArrayOfObject.length <= 1)
        {
          paramArrayOfObject = new Object[0];
        }
        else
        {
          paramArrayOfObject = b.a.e.a(paramArrayOfObject, 1, paramArrayOfObject.length);
          if (paramArrayOfObject == null) {
            break label48;
          }
        }
        return a(localObject, paramArrayOfObject);
        label48:
        throw new r("null cannot be cast to non-null type kotlin.Array<T>");
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020\021\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\033\020\005\032\004\030\0010\0062\n\020\007\032\006\022\002\b\0030\bH\026¢\006\002\020\t¨\006\n"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    public static final class e
      extends e.f
    {
      public e(Method paramMethod)
      {
        super(true, null, 4);
      }
      
      public final Object a(Object[] paramArrayOfObject)
      {
        b.f.b.j.b(paramArrayOfObject, "args");
        b(paramArrayOfObject);
        a(b.a.e.c(paramArrayOfObject));
        if (paramArrayOfObject.length <= 1)
        {
          paramArrayOfObject = new Object[0];
        }
        else
        {
          paramArrayOfObject = b.a.e.a(paramArrayOfObject, 1, paramArrayOfObject.length);
          if (paramArrayOfObject == null) {
            break label52;
          }
        }
        return a(null, paramArrayOfObject);
        label52:
        throw new r("null cannot be cast to non-null type kotlin.Array<T>");
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020\021\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\033\020\005\032\004\030\0010\0062\n\020\007\032\006\022\002\b\0030\bH\026¢\006\002\020\t¨\006\n"}, c={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    public static final class f
      extends e.f
    {
      public f(Method paramMethod)
      {
        super(false, null, 6);
      }
      
      public final Object a(Object[] paramArrayOfObject)
      {
        b.f.b.j.b(paramArrayOfObject, "args");
        b(paramArrayOfObject);
        return a(null, paramArrayOfObject);
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
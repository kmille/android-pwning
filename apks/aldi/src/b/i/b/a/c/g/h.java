package b.i.b.a.c.g;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class h<FieldDescriptorType extends a<FieldDescriptorType>>
{
  private static final h d = new h((byte)0);
  final v<FieldDescriptorType, Object> a;
  boolean b = false;
  private boolean c;
  
  private h()
  {
    this.a = v.a(16);
  }
  
  private h(byte paramByte)
  {
    this.a = v.a(0);
    c();
  }
  
  private static int a(z.a parama, int paramInt, Object paramObject)
  {
    int i = f.d(paramInt);
    paramInt = i;
    if (parama == z.a.j) {
      paramInt = i * 2;
    }
    return paramInt + b(parama, paramObject);
  }
  
  static int a(z.a parama, boolean paramBoolean)
  {
    if (paramBoolean) {
      return 2;
    }
    return parama.t;
  }
  
  public static <T extends a<T>> h<T> a()
  {
    return new h();
  }
  
  public static Object a(e parame, z.a parama)
    throws IOException
  {
    int i;
    switch (1.b[parama.ordinal()])
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 18: 
      throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
    case 17: 
      throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
    case 16: 
      throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
    case 15: 
      return Long.valueOf(e.a(parame.e()));
    case 14: 
      i = parame.d();
      return Integer.valueOf(-(i & 0x1) ^ i >>> 1);
    case 13: 
      return Long.valueOf(parame.g());
    case 12: 
      return Integer.valueOf(parame.f());
    case 11: 
      return Integer.valueOf(parame.d());
    case 10: 
      return parame.c();
    case 9: 
      i = parame.d();
      if ((i <= parame.b - parame.c) && (i > 0))
      {
        parama = new String(parame.a, parame.c, i, "UTF-8");
        parame.c += i;
        return parama;
      }
      if (i == 0) {
        return "";
      }
      return new String(parame.d(i), "UTF-8");
    case 8: 
      return Boolean.valueOf(parame.b());
    case 7: 
      return Integer.valueOf(parame.f());
    case 6: 
      return Long.valueOf(parame.g());
    case 5: 
      return Integer.valueOf(parame.d());
    case 4: 
      return Long.valueOf(parame.e());
    case 3: 
      return Long.valueOf(parame.e());
    case 2: 
      return Float.valueOf(Float.intBitsToFloat(parame.f()));
    }
    return Double.valueOf(Double.longBitsToDouble(parame.g()));
  }
  
  private static Object a(Object paramObject)
  {
    if ((paramObject instanceof byte[]))
    {
      paramObject = (byte[])paramObject;
      byte[] arrayOfByte = new byte[paramObject.length];
      System.arraycopy(paramObject, 0, arrayOfByte, 0, paramObject.length);
      return arrayOfByte;
    }
    return paramObject;
  }
  
  private static void a(f paramf, z.a parama, int paramInt, Object paramObject)
    throws IOException
  {
    if (parama == z.a.j)
    {
      parama = (q)paramObject;
      paramf.e(paramInt, 3);
      parama.a(paramf);
      paramf.e(paramInt, 4);
      return;
    }
    paramf.e(paramInt, a(parama, false));
    a(paramf, parama, paramObject);
  }
  
  private static void a(f paramf, z.a parama, Object paramObject)
    throws IOException
  {
    switch (1.b[parama.ordinal()])
    {
    default: 
      return;
    case 18: 
      if ((paramObject instanceof j.a))
      {
        paramf.a(((j.a)paramObject).a());
        return;
      }
      paramf.a(((Integer)paramObject).intValue());
      return;
    case 17: 
      paramf.a((q)paramObject);
      return;
    case 16: 
      ((q)paramObject).a(paramf);
      return;
    case 15: 
      paramf.a(((Long)paramObject).longValue());
      return;
    case 14: 
      paramf.b(((Integer)paramObject).intValue());
      return;
    case 13: 
      paramf.e(((Long)paramObject).longValue());
      return;
    case 12: 
      paramf.g(((Integer)paramObject).intValue());
      return;
    case 11: 
      paramf.e(((Integer)paramObject).intValue());
      return;
    case 10: 
      if ((paramObject instanceof d))
      {
        paramf.a((d)paramObject);
        return;
      }
      paramf.a((byte[])paramObject);
      return;
    case 9: 
      paramf.a((String)paramObject);
      return;
    case 8: 
      paramf.b(((Boolean)paramObject).booleanValue());
      return;
    case 7: 
      paramf.g(((Integer)paramObject).intValue());
      return;
    case 6: 
      paramf.e(((Long)paramObject).longValue());
      return;
    case 5: 
      paramf.a(((Integer)paramObject).intValue());
      return;
    case 4: 
      paramf.c(((Long)paramObject).longValue());
      return;
    case 3: 
      paramf.c(((Long)paramObject).longValue());
      return;
    case 2: 
      paramf.a(((Float)paramObject).floatValue());
      return;
    }
    paramf.a(((Double)paramObject).doubleValue());
  }
  
  public static void a(a<?> parama, Object paramObject, f paramf)
    throws IOException
  {
    z.a locala = parama.b();
    int i = parama.a();
    if (parama.d())
    {
      paramObject = (List)paramObject;
      if (parama.e())
      {
        paramf.e(i, 2);
        i = 0;
        parama = ((List)paramObject).iterator();
        while (parama.hasNext()) {
          i += b(locala, parama.next());
        }
        paramf.e(i);
        parama = ((List)paramObject).iterator();
        while (parama.hasNext()) {
          a(paramf, locala, parama.next());
        }
        return;
      }
      parama = ((List)paramObject).iterator();
      while (parama.hasNext()) {
        a(paramf, locala, i, parama.next());
      }
      return;
    }
    if ((paramObject instanceof l))
    {
      a(paramf, locala, i, ((l)paramObject).a());
      return;
    }
    a(paramf, locala, i, paramObject);
  }
  
  /* Error */
  private static void a(z.a parama, Object paramObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +184 -> 185
    //   4: getstatic 285	b/i/b/a/c/g/h$1:a	[I
    //   7: aload_0
    //   8: getfield 289	b/i/b/a/c/g/z$a:s	Lb/i/b/a/c/g/z$b;
    //   11: invokevirtual 292	b/i/b/a/c/g/z$b:ordinal	()I
    //   14: iaload
    //   15: istore_2
    //   16: iconst_0
    //   17: istore_3
    //   18: iload_2
    //   19: tableswitch	default:+49->68, 1:+145->164, 2:+137->156, 3:+129->148, 4:+121->140, 5:+113->132, 6:+105->124, 7:+88->107, 8:+69->88, 9:+52->71
    //   68: goto +101 -> 169
    //   71: aload_1
    //   72: instanceof 180
    //   75: ifne +27 -> 102
    //   78: aload_1
    //   79: instanceof 278
    //   82: ifeq +87 -> 169
    //   85: goto +17 -> 102
    //   88: aload_1
    //   89: instanceof 108
    //   92: ifne +10 -> 102
    //   95: aload_1
    //   96: instanceof 193
    //   99: ifeq +70 -> 169
    //   102: iconst_1
    //   103: istore_3
    //   104: goto +65 -> 169
    //   107: aload_1
    //   108: instanceof 220
    //   111: ifne -9 -> 102
    //   114: aload_1
    //   115: instanceof 171
    //   118: ifeq +51 -> 169
    //   121: goto -19 -> 102
    //   124: aload_1
    //   125: instanceof 126
    //   128: istore_3
    //   129: goto +40 -> 169
    //   132: aload_1
    //   133: instanceof 147
    //   136: istore_3
    //   137: goto +32 -> 169
    //   140: aload_1
    //   141: instanceof 161
    //   144: istore_3
    //   145: goto +24 -> 169
    //   148: aload_1
    //   149: instanceof 152
    //   152: istore_3
    //   153: goto +16 -> 169
    //   156: aload_1
    //   157: instanceof 100
    //   160: istore_3
    //   161: goto +8 -> 169
    //   164: aload_1
    //   165: instanceof 108
    //   168: istore_3
    //   169: iload_3
    //   170: ifeq +4 -> 174
    //   173: return
    //   174: new 82	java/lang/IllegalArgumentException
    //   177: dup
    //   178: ldc_w 294
    //   181: invokespecial 85	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   184: athrow
    //   185: new 296	java/lang/NullPointerException
    //   188: dup
    //   189: invokespecial 297	java/lang/NullPointerException:<init>	()V
    //   192: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	193	0	parama	z.a
    //   0	193	1	paramObject	Object
    //   15	4	2	i	int
    //   17	153	3	bool	boolean
  }
  
  private static int b(z.a parama, Object paramObject)
  {
    switch (1.b[parama.ordinal()])
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 18: 
      if ((paramObject instanceof j.a)) {
        return f.c(((j.a)paramObject).a());
      }
      return f.c(((Integer)paramObject).intValue());
    case 17: 
      if ((paramObject instanceof l)) {
        return f.a((l)paramObject);
      }
      return f.b((q)paramObject);
    case 16: 
      return ((q)paramObject).f();
    case 15: 
      return f.d(f.f(((Long)paramObject).longValue()));
    case 14: 
      return f.f(f.h(((Integer)paramObject).intValue()));
    case 13: 
      ((Long)paramObject).longValue();
      return 8;
    case 12: 
      ((Integer)paramObject).intValue();
      return 4;
    case 11: 
      return f.f(((Integer)paramObject).intValue());
    case 10: 
      if ((paramObject instanceof d)) {
        return f.b((d)paramObject);
      }
      return f.b((byte[])paramObject);
    case 9: 
      return f.b((String)paramObject);
    case 8: 
      ((Boolean)paramObject).booleanValue();
      return 1;
    case 7: 
      ((Integer)paramObject).intValue();
      return 4;
    case 6: 
      ((Long)paramObject).longValue();
      return 8;
    case 5: 
      return f.c(((Integer)paramObject).intValue());
    case 4: 
      return f.d(((Long)paramObject).longValue());
    case 3: 
      return f.d(((Long)paramObject).longValue());
    case 2: 
      ((Float)paramObject).floatValue();
      return 4;
    }
    ((Double)paramObject).doubleValue();
    return 8;
  }
  
  public static <T extends a<T>> h<T> b()
  {
    return d;
  }
  
  private static boolean b(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    a locala = (a)paramEntry.getKey();
    if (locala.c() == z.b.i)
    {
      if (locala.d())
      {
        paramEntry = ((List)paramEntry.getValue()).iterator();
        do
        {
          if (!paramEntry.hasNext()) {
            break;
          }
        } while (((q)paramEntry.next()).e());
        return false;
      }
      paramEntry = paramEntry.getValue();
      if ((paramEntry instanceof q))
      {
        if (!((q)paramEntry).e()) {
          return false;
        }
      }
      else
      {
        if ((paramEntry instanceof l)) {
          return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    return true;
  }
  
  private static int c(a<?> parama, Object paramObject)
  {
    z.a locala = parama.b();
    int k = parama.a();
    if (parama.d())
    {
      boolean bool = parama.e();
      int j = 0;
      int i = 0;
      if (bool)
      {
        parama = ((List)paramObject).iterator();
        while (parama.hasNext()) {
          i += b(locala, parama.next());
        }
        return f.d(k) + i + f.f(i);
      }
      parama = ((List)paramObject).iterator();
      i = j;
      while (parama.hasNext()) {
        i += a(locala, k, parama.next());
      }
      return i;
    }
    return a(locala, k, paramObject);
  }
  
  public final Object a(FieldDescriptorType paramFieldDescriptorType)
  {
    Object localObject = this.a.get(paramFieldDescriptorType);
    paramFieldDescriptorType = (FieldDescriptorType)localObject;
    if ((localObject instanceof l)) {
      paramFieldDescriptorType = ((l)localObject).a();
    }
    return paramFieldDescriptorType;
  }
  
  public final void a(FieldDescriptorType paramFieldDescriptorType, Object paramObject)
  {
    if (paramFieldDescriptorType.d())
    {
      if ((paramObject instanceof List))
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll((List)paramObject);
        paramObject = localArrayList.iterator();
        while (((Iterator)paramObject).hasNext())
        {
          Object localObject = ((Iterator)paramObject).next();
          a(paramFieldDescriptorType.b(), localObject);
        }
        paramObject = localArrayList;
      }
      else
      {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    else {
      a(paramFieldDescriptorType.b(), paramObject);
    }
    if ((paramObject instanceof l)) {
      this.b = true;
    }
    this.a.a(paramFieldDescriptorType, paramObject);
  }
  
  final void a(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    a locala = (a)paramEntry.getKey();
    Object localObject1 = paramEntry.getValue();
    paramEntry = (Map.Entry<FieldDescriptorType, Object>)localObject1;
    if ((localObject1 instanceof l)) {
      paramEntry = ((l)localObject1).a();
    }
    if (locala.d())
    {
      Object localObject2 = a(locala);
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new ArrayList();
      }
      paramEntry = ((List)paramEntry).iterator();
      while (paramEntry.hasNext())
      {
        localObject2 = paramEntry.next();
        ((List)localObject1).add(a(localObject2));
      }
      this.a.a(locala, localObject1);
      return;
    }
    if (locala.c() == z.b.i)
    {
      localObject1 = a(locala);
      if (localObject1 == null)
      {
        this.a.a(locala, a(paramEntry));
        return;
      }
      paramEntry = locala.a(((q)localObject1).h(), (q)paramEntry).d();
      this.a.a(locala, paramEntry);
      return;
    }
    this.a.a(locala, a(paramEntry));
  }
  
  public final void b(FieldDescriptorType paramFieldDescriptorType, Object paramObject)
  {
    if (paramFieldDescriptorType.d())
    {
      a(paramFieldDescriptorType.b(), paramObject);
      Object localObject = a(paramFieldDescriptorType);
      if (localObject == null)
      {
        localObject = new ArrayList();
        this.a.a(paramFieldDescriptorType, localObject);
        paramFieldDescriptorType = (FieldDescriptorType)localObject;
      }
      else
      {
        paramFieldDescriptorType = (List)localObject;
      }
      paramFieldDescriptorType.add(paramObject);
      return;
    }
    throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
  }
  
  public final void c()
  {
    if (this.c) {
      return;
    }
    this.a.a();
    this.c = true;
  }
  
  public final h<FieldDescriptorType> d()
  {
    h localh = new h();
    int i = 0;
    while (i < this.a.b())
    {
      localObject = this.a.b(i);
      localh.a((a)((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
      i += 1;
    }
    Object localObject = this.a.c().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      localh.a((a)localEntry.getKey(), localEntry.getValue());
    }
    localh.b = this.b;
    return localh;
  }
  
  public final boolean e()
  {
    int i = 0;
    while (i < this.a.b())
    {
      if (!b(this.a.b(i))) {
        return false;
      }
      i += 1;
    }
    Iterator localIterator = this.a.c().iterator();
    while (localIterator.hasNext()) {
      if (!b((Map.Entry)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final int f()
  {
    int j = 0;
    int i = 0;
    while (j < this.a.b())
    {
      localObject = this.a.b(j);
      i += c((a)((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
      j += 1;
    }
    Object localObject = this.a.c().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      i += c((a)localEntry.getKey(), localEntry.getValue());
    }
    return i;
  }
  
  public static abstract interface a<T extends a<T>>
    extends Comparable<T>
  {
    public abstract int a();
    
    public abstract q.a a(q.a parama, q paramq);
    
    public abstract z.a b();
    
    public abstract z.b c();
    
    public abstract boolean d();
    
    public abstract boolean e();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
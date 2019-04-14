package b.i.b.a.c.d.b;

import b.f.b.k;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public final class t
{
  public static final t a = new t();
  
  public static String a(e parame, String paramString)
  {
    b.f.b.j.b(parame, "classDescriptor");
    b.f.b.j.b(paramString, "jvmDescriptor");
    b.f.b.j.b(parame, "receiver$0");
    Object localObject = b.i.b.a.c.a.b.c.b;
    localObject = b.i.b.a.c.i.c.a.b((l)parame).b;
    b.f.b.j.a(localObject, "fqNameSafe.toUnsafe()");
    localObject = b.i.b.a.c.a.b.c.a((b.i.b.a.c.f.c)localObject);
    if (localObject != null)
    {
      parame = b.i.b.a.c.i.d.b.a((b.i.b.a.c.f.a)localObject);
      b.f.b.j.a(parame, "JvmClassName.byClassId(it)");
      parame = parame.a;
      b.f.b.j.a(parame, "JvmClassName.byClassId(it).internalName");
    }
    else
    {
      parame = y.a(parame, (u)v.a, false);
    }
    return a(parame, paramString);
  }
  
  public static String a(String paramString)
  {
    b.f.b.j.b(paramString, "name");
    return "java/lang/".concat(String.valueOf(paramString));
  }
  
  public static String a(String paramString1, String paramString2)
  {
    b.f.b.j.b(paramString1, "internalName");
    b.f.b.j.b(paramString2, "jvmDescriptor");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(".");
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  public static String a(String paramString1, List<String> paramList, String paramString2)
  {
    b.f.b.j.b(paramString1, "name");
    b.f.b.j.b(paramList, "parameters");
    b.f.b.j.b(paramString2, "ret");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append('(');
    localStringBuilder.append(b.a.j.a((Iterable)paramList, (CharSequence)"", null, null, 0, null, (b.f.a.b)a.a, 30));
    localStringBuilder.append(')');
    localStringBuilder.append(e(paramString2));
    return localStringBuilder.toString();
  }
  
  public static LinkedHashSet<String> a(String paramString, String... paramVarArgs)
  {
    b.f.b.j.b(paramString, "name");
    b.f.b.j.b(paramVarArgs, "signatures");
    return c(a(paramString), (String[])Arrays.copyOf(paramVarArgs, paramVarArgs.length));
  }
  
  public static String[] a(String... paramVarArgs)
  {
    b.f.b.j.b(paramVarArgs, "signatures");
    Collection localCollection = (Collection)new ArrayList(paramVarArgs.length);
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      String str = paramVarArgs[i];
      StringBuilder localStringBuilder = new StringBuilder("<init>(");
      localStringBuilder.append(str);
      localStringBuilder.append(")V");
      localCollection.add(localStringBuilder.toString());
      i += 1;
    }
    paramVarArgs = ((Collection)localCollection).toArray(new String[0]);
    if (paramVarArgs != null) {
      return (String[])paramVarArgs;
    }
    throw new r("null cannot be cast to non-null type kotlin.Array<T>");
  }
  
  public static String b(String paramString)
  {
    b.f.b.j.b(paramString, "name");
    return "java/util/".concat(String.valueOf(paramString));
  }
  
  public static LinkedHashSet<String> b(String paramString, String... paramVarArgs)
  {
    b.f.b.j.b(paramString, "name");
    b.f.b.j.b(paramVarArgs, "signatures");
    return c(b(paramString), (String[])Arrays.copyOf(paramVarArgs, paramVarArgs.length));
  }
  
  public static String c(String paramString)
  {
    b.f.b.j.b(paramString, "name");
    return "java/util/function/".concat(String.valueOf(paramString));
  }
  
  private static LinkedHashSet<String> c(String paramString, String... paramVarArgs)
  {
    b.f.b.j.b(paramString, "internalName");
    b.f.b.j.b(paramVarArgs, "signatures");
    Collection localCollection = (Collection)new LinkedHashSet();
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      String str = paramVarArgs[i];
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append(".");
      localStringBuilder.append(str);
      localCollection.add(localStringBuilder.toString());
      i += 1;
    }
    return (LinkedHashSet)localCollection;
  }
  
  private static String e(String paramString)
  {
    Object localObject = paramString;
    if (paramString.length() > 1)
    {
      localObject = new StringBuilder("L");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(';');
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  static final class a
    extends k
    implements b.f.a.b<String, String>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
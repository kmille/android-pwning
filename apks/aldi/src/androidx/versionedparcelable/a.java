package androidx.versionedparcelable;

import android.os.Parcelable;
import android.support.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract class a
{
  private static <T extends c> T a(String paramString, a parama)
  {
    try
    {
      paramString = (c)Class.forName(paramString, true, a.class.getClassLoader()).getDeclaredMethod("read", new Class[] { a.class }).invoke(null, new Object[] { parama });
      return paramString;
    }
    catch (ClassNotFoundException paramString)
    {
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", paramString);
    }
    catch (NoSuchMethodException paramString)
    {
      throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", paramString);
    }
    catch (InvocationTargetException paramString)
    {
      if ((paramString.getCause() instanceof RuntimeException)) {
        throw ((RuntimeException)paramString.getCause());
      }
      throw new RuntimeException("VersionedParcel encountered InvocationTargetException", paramString);
    }
    catch (IllegalAccessException paramString)
    {
      throw new RuntimeException("VersionedParcel encountered IllegalAccessException", paramString);
    }
  }
  
  private static Class a(Class<? extends c> paramClass)
    throws ClassNotFoundException
  {
    return Class.forName(String.format("%s.%sParcelizer", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() }), false, paramClass.getClassLoader());
  }
  
  private static <T extends c> void a(T paramT, a parama)
  {
    try
    {
      a(paramT.getClass()).getDeclaredMethod("write", new Class[] { paramT.getClass(), a.class }).invoke(null, new Object[] { paramT, parama });
      return;
    }
    catch (ClassNotFoundException paramT)
    {
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", paramT);
    }
    catch (NoSuchMethodException paramT)
    {
      throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", paramT);
    }
    catch (InvocationTargetException paramT)
    {
      if ((paramT.getCause() instanceof RuntimeException)) {
        throw ((RuntimeException)paramT.getCause());
      }
      throw new RuntimeException("VersionedParcel encountered InvocationTargetException", paramT);
    }
    catch (IllegalAccessException paramT)
    {
      throw new RuntimeException("VersionedParcel encountered IllegalAccessException", paramT);
    }
  }
  
  private void d(c paramc)
  {
    try
    {
      Class localClass = a(paramc.getClass());
      a(localClass.getName());
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramc.getClass().getSimpleName());
      localStringBuilder.append(" does not have a Parcelizer");
      throw new RuntimeException(localStringBuilder.toString(), localClassNotFoundException);
    }
  }
  
  protected abstract void a();
  
  protected abstract void a(int paramInt);
  
  public final void a(int paramInt1, int paramInt2)
  {
    c(paramInt2);
    a(paramInt1);
  }
  
  protected abstract void a(Parcelable paramParcelable);
  
  public final void a(Parcelable paramParcelable, int paramInt)
  {
    c(paramInt);
    a(paramParcelable);
  }
  
  public final void a(c paramc)
  {
    c(1);
    b(paramc);
  }
  
  protected abstract void a(String paramString);
  
  protected abstract void a(byte[] paramArrayOfByte);
  
  public final int b(int paramInt1, int paramInt2)
  {
    if (!b(paramInt2)) {
      return paramInt1;
    }
    return c();
  }
  
  public final <T extends Parcelable> T b(T paramT, int paramInt)
  {
    if (!b(paramInt)) {
      return paramT;
    }
    return f();
  }
  
  protected abstract a b();
  
  protected final void b(c paramc)
  {
    if (paramc == null)
    {
      a(null);
      return;
    }
    d(paramc);
    a locala = b();
    a(paramc, locala);
    locala.a();
  }
  
  public final void b(String paramString)
  {
    c(7);
    a(paramString);
  }
  
  public final void b(byte[] paramArrayOfByte)
  {
    c(2);
    a(paramArrayOfByte);
  }
  
  protected abstract boolean b(int paramInt);
  
  protected abstract int c();
  
  public final <T extends c> T c(T paramT)
  {
    if (!b(1)) {
      return paramT;
    }
    return g();
  }
  
  public final String c(String paramString)
  {
    if (!b(7)) {
      return paramString;
    }
    return d();
  }
  
  protected abstract void c(int paramInt);
  
  public final byte[] c(byte[] paramArrayOfByte)
  {
    if (!b(2)) {
      return paramArrayOfByte;
    }
    return e();
  }
  
  protected abstract String d();
  
  protected abstract byte[] e();
  
  protected abstract <T extends Parcelable> T f();
  
  protected final <T extends c> T g()
  {
    String str = d();
    if (str == null) {
      return null;
    }
    return a(str, b());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/androidx/versionedparcelable/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
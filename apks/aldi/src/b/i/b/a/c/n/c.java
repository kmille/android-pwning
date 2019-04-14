package b.i.b.a.c.n;

import b.f.b.j;

public final class c
{
  public static final boolean a(Throwable paramThrowable)
  {
    j.b(paramThrowable, "receiver$0");
    paramThrowable = paramThrowable.getClass();
    Class localClass;
    do
    {
      if (j.a(paramThrowable.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
        return true;
      }
      localClass = paramThrowable.getSuperclass();
      paramThrowable = localClass;
    } while (localClass != null);
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/n/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
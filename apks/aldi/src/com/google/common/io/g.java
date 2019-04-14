package com.google.common.io;

import com.google.common.base.j;
import com.google.common.base.l;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

public final class g
  implements Closeable
{
  private static final c b;
  final c a;
  private final Deque<Closeable> c = new ArrayDeque(4);
  private Throwable d;
  
  static
  {
    Object localObject;
    if (b.a()) {
      localObject = b.a;
    } else {
      localObject = a.a;
    }
    b = (c)localObject;
  }
  
  private g(c paramc)
  {
    this.a = ((c)j.a(paramc));
  }
  
  public static g a()
  {
    return new g(b);
  }
  
  public final <C extends Closeable> C a(@Nullable C paramC)
  {
    if (paramC != null) {
      this.c.addFirst(paramC);
    }
    return paramC;
  }
  
  public final RuntimeException a(Throwable paramThrowable)
    throws IOException
  {
    j.a(paramThrowable);
    this.d = paramThrowable;
    l.a(paramThrowable, IOException.class);
    throw new RuntimeException(paramThrowable);
  }
  
  public final void close()
    throws IOException
  {
    Object localObject = this.d;
    while (!this.c.isEmpty())
    {
      Closeable localCloseable = (Closeable)this.c.removeFirst();
      try
      {
        localCloseable.close();
      }
      catch (Throwable localThrowable)
      {
        if (localObject == null) {
          localObject = localThrowable;
        } else {
          this.a.a(localCloseable, (Throwable)localObject, localThrowable);
        }
      }
    }
    if (this.d == null)
    {
      if (localObject == null) {
        return;
      }
      l.a((Throwable)localObject, IOException.class);
      throw new AssertionError(localObject);
    }
  }
  
  static final class a
    implements g.c
  {
    static final a a = new a();
    
    public final void a(Closeable paramCloseable, Throwable paramThrowable1, Throwable paramThrowable2)
    {
      f.a.log(Level.WARNING, "Suppressing exception thrown when closing ".concat(String.valueOf(paramCloseable)), paramThrowable2);
    }
  }
  
  static final class b
    implements g.c
  {
    static final b a = new b();
    static final Method b = b();
    
    static boolean a()
    {
      return b != null;
    }
    
    private static Method b()
    {
      try
      {
        Method localMethod = Throwable.class.getMethod("addSuppressed", new Class[] { Throwable.class });
        return localMethod;
      }
      catch (Throwable localThrowable)
      {
        for (;;) {}
      }
      return null;
    }
    
    public final void a(Closeable paramCloseable, Throwable paramThrowable1, Throwable paramThrowable2)
    {
      if (paramThrowable1 == paramThrowable2) {
        return;
      }
      try
      {
        b.invoke(paramThrowable1, new Object[] { paramThrowable2 });
        return;
      }
      catch (Throwable localThrowable)
      {
        for (;;) {}
      }
      g.a.a.a(paramCloseable, paramThrowable1, paramThrowable2);
    }
  }
  
  static abstract interface c
  {
    public abstract void a(Closeable paramCloseable, Throwable paramThrowable1, Throwable paramThrowable2);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/io/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
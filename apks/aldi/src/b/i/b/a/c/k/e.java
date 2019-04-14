package b.i.b.a.c.k;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

final class e
  implements Lock
{
  public static final Lock a = new e();
  
  public final void lock() {}
  
  public final void lockInterruptibly()
    throws InterruptedException
  {
    throw new UnsupportedOperationException("Should not be called");
  }
  
  public final Condition newCondition()
  {
    throw new UnsupportedOperationException("Should not be called");
  }
  
  public final boolean tryLock()
  {
    throw new UnsupportedOperationException("Should not be called");
  }
  
  public final boolean tryLock(long paramLong, TimeUnit paramTimeUnit)
    throws InterruptedException
  {
    throw new UnsupportedOperationException("Should not be called");
  }
  
  public final void unlock() {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/k/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
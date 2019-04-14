package com.google.common.d.a;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class j
{
  public static enum a
    implements Executor
  {
    private a() {}
    
    public final void execute(Runnable paramRunnable)
    {
      paramRunnable.run();
    }
    
    public final String toString()
    {
      return "MoreExecutors.directExecutor()";
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/d/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package b.i.b.a.c.a;

import b.f.b.j;

public final class a<T extends g>
{
  private volatile T a;
  private volatile boolean b;
  private Throwable c;
  private final b.f.a.a<T> d;
  
  public a(b.f.a.a<? extends T> parama)
  {
    this.d = parama;
  }
  
  /* Error */
  private final void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 36	b/i/b/a/c/a/a:a	Lb/i/b/a/c/a/g;
    //   6: ifnonnull +144 -> 150
    //   9: aload_0
    //   10: getfield 38	b/i/b/a/c/a/a:c	Ljava/lang/Throwable;
    //   13: ifnull +50 -> 63
    //   16: new 40	java/lang/StringBuilder
    //   19: dup
    //   20: ldc 42
    //   22: invokespecial 45	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   25: astore_1
    //   26: aload_0
    //   27: getfield 38	b/i/b/a/c/a/a:c	Ljava/lang/Throwable;
    //   30: astore_2
    //   31: aload_2
    //   32: ifnonnull +6 -> 38
    //   35: invokestatic 47	b/f/b/j:a	()V
    //   38: aload_1
    //   39: aload_2
    //   40: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: new 53	java/lang/IllegalStateException
    //   47: dup
    //   48: aload_1
    //   49: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: aload_0
    //   53: getfield 38	b/i/b/a/c/a/a:c	Ljava/lang/Throwable;
    //   56: invokespecial 60	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   59: checkcast 34	java/lang/Throwable
    //   62: athrow
    //   63: aload_0
    //   64: getfield 62	b/i/b/a/c/a/a:b	Z
    //   67: ifne +70 -> 137
    //   70: aload_0
    //   71: iconst_1
    //   72: putfield 62	b/i/b/a/c/a/a:b	Z
    //   75: aload_0
    //   76: aload_0
    //   77: getfield 29	b/i/b/a/c/a/a:d	Lb/f/a/a;
    //   80: invokeinterface 68 1 0
    //   85: checkcast 70	b/i/b/a/c/a/g
    //   88: putfield 36	b/i/b/a/c/a/a:a	Lb/i/b/a/c/a/g;
    //   91: aload_0
    //   92: iconst_0
    //   93: putfield 62	b/i/b/a/c/a/a:b	Z
    //   96: aload_0
    //   97: monitorexit
    //   98: return
    //   99: astore_1
    //   100: goto +30 -> 130
    //   103: astore_1
    //   104: aload_0
    //   105: aload_1
    //   106: putfield 38	b/i/b/a/c/a/a:c	Ljava/lang/Throwable;
    //   109: new 53	java/lang/IllegalStateException
    //   112: dup
    //   113: ldc 72
    //   115: aload_1
    //   116: invokestatic 78	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   119: invokevirtual 82	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   122: aload_1
    //   123: invokespecial 60	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   126: checkcast 34	java/lang/Throwable
    //   129: athrow
    //   130: aload_0
    //   131: iconst_0
    //   132: putfield 62	b/i/b/a/c/a/a:b	Z
    //   135: aload_1
    //   136: athrow
    //   137: new 53	java/lang/IllegalStateException
    //   140: dup
    //   141: ldc 84
    //   143: invokespecial 85	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   146: checkcast 34	java/lang/Throwable
    //   149: athrow
    //   150: aload_0
    //   151: monitorexit
    //   152: return
    //   153: astore_1
    //   154: aload_0
    //   155: monitorexit
    //   156: aload_1
    //   157: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	158	0	this	a
    //   25	24	1	localStringBuilder	StringBuilder
    //   99	1	1	localObject1	Object
    //   103	33	1	localThrowable1	Throwable
    //   153	4	1	localObject2	Object
    //   30	10	2	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   75	91	99	finally
    //   104	130	99	finally
    //   75	91	103	java/lang/Throwable
    //   2	31	153	finally
    //   35	38	153	finally
    //   38	63	153	finally
    //   63	75	153	finally
    //   91	96	153	finally
    //   130	137	153	finally
    //   137	150	153	finally
  }
  
  public final T a()
  {
    if (this.b) {
      try
      {
        g localg1 = this.a;
        if (localg1 != null) {
          return localg1;
        }
        throw ((Throwable)new AssertionError("Built-ins are not initialized (note: We are under the same lock as initializing and instance)"));
      }
      finally {}
    }
    if (this.a == null) {
      b();
    }
    g localg2 = this.a;
    if (localg2 == null) {
      j.a();
    }
    return localg2;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
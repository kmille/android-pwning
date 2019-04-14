package b.i.b.a.c.g;

import java.io.IOException;
import java.io.InputStream;

public abstract class b<MessageType extends q>
  implements s<MessageType>
{
  private static final g a = ;
  
  private static MessageType a(MessageType paramMessageType)
    throws k
  {
    if ((paramMessageType != null) && (!paramMessageType.e()))
    {
      if ((paramMessageType instanceof a)) {
        localObject = new w();
      } else {
        localObject = new w();
      }
      Object localObject = new k(((w)localObject).getMessage());
      ((k)localObject).a = paramMessageType;
      throw ((Throwable)localObject);
    }
    return paramMessageType;
  }
  
  /* Error */
  private MessageType b(d paramd, g paramg)
    throws k
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 57	b/i/b/a/c/g/d:g	()Lb/i/b/a/c/g/e;
    //   4: astore_1
    //   5: aload_0
    //   6: aload_1
    //   7: aload_2
    //   8: invokevirtual 60	b/i/b/a/c/g/b:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/g;)Ljava/lang/Object;
    //   11: checkcast 28	b/i/b/a/c/g/q
    //   14: astore_2
    //   15: aload_1
    //   16: iconst_0
    //   17: invokevirtual 65	b/i/b/a/c/g/e:a	(I)V
    //   20: aload_2
    //   21: areturn
    //   22: astore_1
    //   23: aload_1
    //   24: aload_2
    //   25: putfield 47	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
    //   28: aload_1
    //   29: athrow
    //   30: astore_1
    //   31: aload_1
    //   32: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	this	b
    //   0	33	1	paramd	d
    //   0	33	2	paramg	g
    // Exception table:
    //   from	to	target	type
    //   15	20	22	b/i/b/a/c/g/k
    //   0	15	30	b/i/b/a/c/g/k
    //   23	30	30	b/i/b/a/c/g/k
  }
  
  private MessageType c(InputStream paramInputStream, g paramg)
    throws k
  {
    paramInputStream = e.a(paramInputStream);
    paramg = (q)a(paramInputStream, paramg);
    try
    {
      paramInputStream.a(0);
      return paramg;
    }
    catch (k paramInputStream)
    {
      paramInputStream.a = paramg;
      throw paramInputStream;
    }
  }
  
  private MessageType d(InputStream paramInputStream, g paramg)
    throws k
  {
    return a(c(paramInputStream, paramg));
  }
  
  private MessageType e(InputStream paramInputStream, g paramg)
    throws k
  {
    for (;;)
    {
      int i;
      int j;
      try
      {
        i = paramInputStream.read();
        if (i != -1) {
          break label136;
        }
        return null;
      }
      catch (IOException paramInputStream)
      {
        int k;
        throw new k(paramInputStream.getMessage());
      }
      k = j;
      if (j < 32)
      {
        k = paramInputStream.read();
        if (k != -1)
        {
          i |= (k & 0x7F) << j;
          if ((k & 0x80) != 0) {
            break label159;
          }
        }
        else
        {
          throw k.a();
        }
      }
      else
      {
        if (k >= 64) {
          continue;
        }
        j = paramInputStream.read();
        if (j == -1) {
          continue;
        }
        if ((j & 0x80) != 0) {
          continue;
        }
      }
      return c(new a.a.a(paramInputStream, i), paramg);
      k += 7;
      continue;
      throw k.a();
      throw k.c();
      label136:
      if ((i & 0x80) != 0)
      {
        i &= 0x7F;
        j = 7;
        continue;
        label159:
        j += 7;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
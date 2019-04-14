package com.google.common.io;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.Queue;

public final class j
{
  final Queue<String> a = new LinkedList();
  private final Readable b;
  private final Reader c;
  private final CharBuffer d = CharBuffer.allocate(2048);
  private final char[] e = this.d.array();
  private final h f = new h()
  {
    protected final void a(String paramAnonymousString)
    {
      j.this.a.add(paramAnonymousString);
    }
  };
  
  public j(Readable paramReadable)
  {
    this.b = ((Readable)com.google.common.base.j.a(paramReadable));
    if ((paramReadable instanceof Reader)) {
      paramReadable = (Reader)paramReadable;
    } else {
      paramReadable = null;
    }
    this.c = paramReadable;
  }
  
  public final String a()
    throws IOException
  {
    while (this.a.peek() == null)
    {
      this.d.clear();
      int i;
      if (this.c != null) {
        i = this.c.read(this.e, 0, this.e.length);
      } else {
        i = this.b.read(this.d);
      }
      if (i == -1)
      {
        this.f.a();
        break;
      }
      this.f.a(this.e, i);
    }
    return (String)this.a.poll();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/io/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
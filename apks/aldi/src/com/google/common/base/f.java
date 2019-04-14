package com.google.common.base;

import java.util.Arrays;
import javax.annotation.Nullable;

public final class f
{
  public static a a(Object paramObject)
  {
    return new a(paramObject.getClass().getSimpleName(), (byte)0);
  }
  
  public static final class a
  {
    private final String a;
    private final a b = new a((byte)0);
    private a c = this.b;
    private boolean d = false;
    
    private a(String paramString)
    {
      this.a = ((String)j.a(paramString));
    }
    
    private a a()
    {
      a locala = new a((byte)0);
      this.c.c = locala;
      this.c = locala;
      return locala;
    }
    
    public final a a(String paramString, int paramInt)
    {
      return a(paramString, String.valueOf(paramInt));
    }
    
    public final a a(String paramString, @Nullable Object paramObject)
    {
      a locala = a();
      locala.b = paramObject;
      locala.a = ((String)j.a(paramString));
      return this;
    }
    
    public final String toString()
    {
      boolean bool = this.d;
      String str = "";
      StringBuilder localStringBuilder = new StringBuilder(32);
      localStringBuilder.append(this.a);
      localStringBuilder.append('{');
      Object localObject1 = this.b;
      for (;;)
      {
        a locala = ((a)localObject1).c;
        if (locala == null) {
          break;
        }
        Object localObject2 = locala.b;
        if (bool)
        {
          localObject1 = locala;
          if (localObject2 == null) {}
        }
        else
        {
          localStringBuilder.append(str);
          str = ", ";
          if (locala.a != null)
          {
            localStringBuilder.append(locala.a);
            localStringBuilder.append('=');
          }
          if ((localObject2 != null) && (localObject2.getClass().isArray()))
          {
            localObject1 = Arrays.deepToString(new Object[] { localObject2 });
            localStringBuilder.append((CharSequence)localObject1, 1, ((String)localObject1).length() - 1);
            localObject1 = locala;
          }
          else
          {
            localStringBuilder.append(localObject2);
            localObject1 = locala;
          }
        }
      }
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    static final class a
    {
      String a;
      Object b;
      a c;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/base/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
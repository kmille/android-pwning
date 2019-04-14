package b.i.b.a.c.d.b.a;

import b.a.ac;
import b.i.b.a.c.e.b.a.g;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a
{
  public final a a;
  public final g b;
  public final String[] c;
  public final String[] d;
  public final String[] e;
  private final b.i.b.a.c.e.b.a.d f;
  private final String g;
  private final int h;
  private final String i;
  
  public a(a parama, g paramg, b.i.b.a.c.e.b.a.d paramd, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString1, int paramInt, String paramString2)
  {
    this.a = parama;
    this.b = paramg;
    this.f = paramd;
    this.c = paramArrayOfString1;
    this.d = paramArrayOfString2;
    this.e = paramArrayOfString3;
    this.g = paramString1;
    this.h = paramInt;
    this.i = paramString2;
  }
  
  public final String a()
  {
    String str = this.g;
    int j;
    if (this.a == a.f) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0) {
      return str;
    }
    return null;
  }
  
  public final boolean b()
  {
    return (this.h & 0x2) != 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append(" version=");
    localStringBuilder.append(this.b);
    return localStringBuilder.toString();
  }
  
  public static enum a
  {
    public static final a g;
    private static final Map<Integer, a> j;
    private final int i;
    
    static
    {
      int k = 0;
      Object localObject1 = new a("UNKNOWN", 0, 0);
      a = (a)localObject1;
      Object localObject2 = new a("CLASS", 1, 1);
      b = (a)localObject2;
      a locala1 = new a("FILE_FACADE", 2, 2);
      c = locala1;
      a locala2 = new a("SYNTHETIC_CLASS", 3, 3);
      d = locala2;
      a locala3 = new a("MULTIFILE_CLASS", 4, 4);
      e = locala3;
      a locala4 = new a("MULTIFILE_CLASS_PART", 5, 5);
      f = locala4;
      h = new a[] { localObject1, localObject2, locala1, locala2, locala3, locala4 };
      g = new a((byte)0);
      localObject1 = values();
      localObject2 = (Map)new LinkedHashMap(b.h.d.b(ac.a(localObject1.length), 16));
      int m = localObject1.length;
      while (k < m)
      {
        locala1 = localObject1[k];
        ((Map)localObject2).put(Integer.valueOf(locala1.i), locala1);
        k += 1;
      }
      j = (Map)localObject2;
    }
    
    private a(int paramInt)
    {
      this.i = paramInt;
    }
    
    public static final a a(int paramInt)
    {
      a locala2 = (a)j.get(Integer.valueOf(paramInt));
      a locala1 = locala2;
      if (locala2 == null) {
        locala1 = a;
      }
      return locala1;
    }
    
    public static final class a {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
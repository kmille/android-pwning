package b.i.b.a.c.e.a;

import b.a.e;
import b.a.h.a;
import b.a.v;
import java.util.ArrayList;
import java.util.List;

public abstract class a
{
  public static final a d = new a((byte)0);
  public final int a;
  public final int b;
  public final int c;
  private final List<Integer> e;
  private final int[] f;
  
  public a(int... paramVarArgs)
  {
    this.f = paramVarArgs;
    paramVarArgs = e.a(this.f, 0);
    int j = -1;
    if (paramVarArgs != null) {
      i = paramVarArgs.intValue();
    } else {
      i = -1;
    }
    this.a = i;
    paramVarArgs = e.a(this.f, 1);
    if (paramVarArgs != null) {
      i = paramVarArgs.intValue();
    } else {
      i = -1;
    }
    this.b = i;
    paramVarArgs = e.a(this.f, 2);
    int i = j;
    if (paramVarArgs != null) {
      i = paramVarArgs.intValue();
    }
    this.c = i;
    if (this.f.length > 3)
    {
      paramVarArgs = this.f;
      b.f.b.j.b(paramVarArgs, "receiver$0");
      paramVarArgs = b.a.j.i((Iterable)((List)new h.a(paramVarArgs)).subList(3, this.f.length));
    }
    else
    {
      paramVarArgs = (List)v.a;
    }
    this.e = paramVarArgs;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (b.f.b.j.a(getClass(), paramObject.getClass())))
    {
      int i = this.a;
      paramObject = (a)paramObject;
      if ((i == ((a)paramObject).a) && (this.b == ((a)paramObject).b) && (this.c == ((a)paramObject).c) && (b.f.b.j.a(this.e, ((a)paramObject).e))) {
        return true;
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = this.a;
    i += i * 31 + this.b;
    i += i * 31 + this.c;
    return i + (i * 31 + this.e.hashCode());
  }
  
  public String toString()
  {
    Object localObject = this.f;
    ArrayList localArrayList = new ArrayList();
    int k = localObject.length;
    int i = 0;
    while (i < k)
    {
      int m = localObject[i];
      int j;
      if (m != -1) {
        j = 1;
      } else {
        j = 0;
      }
      if (j == 0) {
        break;
      }
      localArrayList.add(Integer.valueOf(m));
      i += 1;
    }
    localObject = (List)localArrayList;
    if (((List)localObject).isEmpty()) {
      return "unknown";
    }
    return b.a.j.a((Iterable)localObject, (CharSequence)".", null, null, 0, null, null, 62);
  }
  
  public static final class a {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
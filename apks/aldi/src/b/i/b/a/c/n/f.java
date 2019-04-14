package b.i.b.a.c.n;

import b.f.b.j;

public final class f
{
  public final String a;
  public final int b;
  
  public f(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof f))
      {
        paramObject = (f)paramObject;
        if (j.a(this.a, ((f)paramObject).a))
        {
          int i;
          if (this.b == ((f)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            return true;
          }
        }
      }
      return false;
    }
    return true;
  }
  
  public final int hashCode()
  {
    String str = this.a;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return i * 31 + this.b;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("NumberWithRadix(number=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", radix=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/n/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
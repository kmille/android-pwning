package b.k;

@b.j(a={1, 1, 13}, b={"\000.\n\000\n\002\020\001\n\000\n\002\020\016\n\000\n\002\020\005\n\002\b\002\n\002\020\b\n\002\b\005\n\002\020\t\n\002\b\003\n\002\020\n\n\002\b\003\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\000\032\023\020\004\032\004\030\0010\005*\0020\003H\007¢\006\002\020\006\032\033\020\004\032\004\030\0010\005*\0020\0032\006\020\007\032\0020\bH\007¢\006\002\020\t\032\023\020\n\032\004\030\0010\b*\0020\003H\007¢\006\002\020\013\032\033\020\n\032\004\030\0010\b*\0020\0032\006\020\007\032\0020\bH\007¢\006\002\020\f\032\023\020\r\032\004\030\0010\016*\0020\003H\007¢\006\002\020\017\032\033\020\r\032\004\030\0010\016*\0020\0032\006\020\007\032\0020\bH\007¢\006\002\020\020\032\023\020\021\032\004\030\0010\022*\0020\003H\007¢\006\002\020\023\032\033\020\021\032\004\030\0010\022*\0020\0032\006\020\007\032\0020\bH\007¢\006\002\020\024¨\006\025"}, c={"numberFormatError", "", "input", "", "toByteOrNull", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "radix", "", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "toLongOrNull", "", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "toShortOrNull", "", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "kotlin-stdlib"}, d=1)
public class s
  extends r
{
  public static final Integer a(String paramString, int paramInt)
  {
    b.f.b.j.b(paramString, "receiver$0");
    a.a(paramInt);
    int i1 = paramString.length();
    if (i1 == 0) {
      return null;
    }
    int m = 0;
    int n = 0;
    int i = paramString.charAt(0);
    int k = -2147483647;
    if (i < 48)
    {
      if (i1 == 1) {
        return null;
      }
      if (i == 45)
      {
        k = Integer.MIN_VALUE;
        i = 1;
        j = 1;
        break label88;
      }
      if (i == 43) {
        i = 1;
      } else {
        return null;
      }
    }
    else
    {
      i = 0;
    }
    int j = 0;
    label88:
    int i2 = k / paramInt;
    i1 -= 1;
    if (i <= i1) {
      for (m = n;; m = n)
      {
        n = Character.digit(paramString.charAt(i), paramInt);
        if (n < 0) {
          return null;
        }
        if (m < i2) {
          return null;
        }
        m *= paramInt;
        if (m < k + n) {
          return null;
        }
        n = m - n;
        m = n;
        if (i == i1) {
          break;
        }
        i += 1;
      }
    }
    if (j != 0) {
      return Integer.valueOf(m);
    }
    return Integer.valueOf(-m);
  }
  
  public static final Integer c(String paramString)
  {
    b.f.b.j.b(paramString, "receiver$0");
    return l.a(paramString, 10);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/k/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
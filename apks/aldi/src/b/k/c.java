package b.k;

import b.j;

@j(a={1, 1, 13}, b={"\000\024\n\000\n\002\020\013\n\002\020\f\n\002\b\004\n\002\020\016\n\000\032\034\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0022\b\b\002\020\004\032\0020\001\032\n\020\005\032\0020\001*\0020\002\032\025\020\006\032\0020\007*\0020\0022\006\020\003\032\0020\007H\n¨\006\b"}, c={"equals", "", "", "other", "ignoreCase", "isSurrogate", "plus", "", "kotlin-stdlib"}, d=1)
public class c
  extends b
{
  public static final boolean a(char paramChar1, char paramChar2, boolean paramBoolean)
  {
    if (paramChar1 == paramChar2) {
      return true;
    }
    if (!paramBoolean) {
      return false;
    }
    if (Character.toUpperCase(paramChar1) == Character.toUpperCase(paramChar2)) {
      return true;
    }
    return Character.toLowerCase(paramChar1) == Character.toLowerCase(paramChar2);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
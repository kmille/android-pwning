package b.i.b.a.c.e.b.a;

public final class l
{
  static final String a(String paramString1, String paramString2)
  {
    int i;
    if (((CharSequence)paramString1).length() == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b.k.l.a(paramString1, '.', '/'));
    localStringBuilder.append("/");
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/b/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
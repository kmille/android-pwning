package b.k;

@b.j(a={1, 1, 13}, b={"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\020\020\003\032\0020\0048\006X\004¢\006\002\n\000¨\006\005"}, c={"Lkotlin/text/SystemProperties;", "", "()V", "LINE_SEPARATOR", "", "kotlin-stdlib"})
final class x
{
  public static final String a;
  public static final x b = new x();
  
  static
  {
    String str = System.getProperty("line.separator");
    if (str == null) {
      b.f.b.j.a();
    }
    a = str;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/k/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
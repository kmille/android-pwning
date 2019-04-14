package b.k;

@b.j(a={1, 1, 13}, b={"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\020\020\003\032\0020\0048\006X\004¢\006\002\n\000¨\006\005"}, c={"Lkotlin/text/ScreenFloatValueRegEx;", "", "()V", "value", "Lkotlin/text/Regex;", "kotlin-stdlib"})
final class k
{
  public static final j a;
  public static final k b = new k();
  
  static
  {
    String str = "[eE][+-]?".concat(String.valueOf("(\\p{Digit}+)"));
    Object localObject = new StringBuilder("(0[xX]");
    ((StringBuilder)localObject).append("(\\p{XDigit}+)");
    ((StringBuilder)localObject).append("(\\.)?)|(0[xX]");
    ((StringBuilder)localObject).append("(\\p{XDigit}+)");
    ((StringBuilder)localObject).append("?(\\.)");
    ((StringBuilder)localObject).append("(\\p{XDigit}+)");
    ((StringBuilder)localObject).append(')');
    localObject = ((StringBuilder)localObject).toString();
    StringBuilder localStringBuilder = new StringBuilder("(");
    localStringBuilder.append("(\\p{Digit}+)");
    localStringBuilder.append("(\\.)?(");
    localStringBuilder.append("(\\p{Digit}+)");
    localStringBuilder.append("?)(");
    localStringBuilder.append(str);
    localStringBuilder.append(")?)|(\\.(");
    localStringBuilder.append("(\\p{Digit}+)");
    localStringBuilder.append(")(");
    localStringBuilder.append(str);
    localStringBuilder.append(")?)|((");
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(")[pP][+-]?");
    localStringBuilder.append("(\\p{Digit}+)");
    localStringBuilder.append(')');
    str = localStringBuilder.toString();
    localObject = new StringBuilder("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(")[fFdD]?))[\\x00-\\x20]*");
    a = new j(((StringBuilder)localObject).toString());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/k/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
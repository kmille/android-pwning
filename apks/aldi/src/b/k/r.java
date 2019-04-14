package b.k;

@b.j(a={1, 1, 13}, b={"\000X\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\000\n\002\020\005\n\000\n\002\020\006\n\002\b\003\n\002\020\007\n\002\b\004\n\002\020\t\n\000\n\002\020\n\n\002\b\002\0324\020\000\032\004\030\001H\001\"\004\b\000\020\0012\006\020\002\032\0020\0032\022\020\004\032\016\022\004\022\0020\003\022\004\022\002H\0010\005H\b¢\006\004\b\006\020\007\032\r\020\b\032\0020\t*\0020\003H\b\032\025\020\b\032\0020\t*\0020\0032\006\020\n\032\0020\013H\b\032\016\020\f\032\004\030\0010\t*\0020\003H\007\032\026\020\f\032\004\030\0010\t*\0020\0032\006\020\n\032\0020\013H\007\032\r\020\r\032\0020\016*\0020\003H\b\032\025\020\r\032\0020\016*\0020\0032\006\020\017\032\0020\020H\b\032\016\020\021\032\004\030\0010\016*\0020\003H\007\032\026\020\021\032\004\030\0010\016*\0020\0032\006\020\017\032\0020\020H\007\032\r\020\022\032\0020\023*\0020\003H\b\032\r\020\024\032\0020\025*\0020\003H\b\032\025\020\024\032\0020\025*\0020\0032\006\020\017\032\0020\020H\b\032\r\020\026\032\0020\027*\0020\003H\b\032\023\020\030\032\004\030\0010\027*\0020\003H\007¢\006\002\020\031\032\r\020\032\032\0020\033*\0020\003H\b\032\023\020\034\032\004\030\0010\033*\0020\003H\007¢\006\002\020\035\032\r\020\036\032\0020\020*\0020\003H\b\032\025\020\036\032\0020\020*\0020\0032\006\020\017\032\0020\020H\b\032\r\020\037\032\0020 *\0020\003H\b\032\025\020\037\032\0020 *\0020\0032\006\020\017\032\0020\020H\b\032\r\020!\032\0020\"*\0020\003H\b\032\025\020!\032\0020\"*\0020\0032\006\020\017\032\0020\020H\b\032\025\020#\032\0020\003*\0020\0252\006\020\017\032\0020\020H\b\032\025\020#\032\0020\003*\0020\0202\006\020\017\032\0020\020H\b\032\025\020#\032\0020\003*\0020 2\006\020\017\032\0020\020H\b\032\025\020#\032\0020\003*\0020\"2\006\020\017\032\0020\020H\b¨\006$"}, c={"screenFloatValue", "T", "str", "", "parse", "Lkotlin/Function1;", "screenFloatValue$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "toBigDecimal", "Ljava/math/BigDecimal;", "mathContext", "Ljava/math/MathContext;", "toBigDecimalOrNull", "toBigInteger", "Ljava/math/BigInteger;", "radix", "", "toBigIntegerOrNull", "toBoolean", "", "toByte", "", "toDouble", "", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "toFloat", "", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "toInt", "toLong", "", "toShort", "", "toString", "kotlin-stdlib"}, d=1)
public class r
  extends q
{
  public static final Float a(String paramString)
  {
    b.f.b.j.b(paramString, "receiver$0");
    Float localFloat = null;
    try
    {
      if (k.a.a((CharSequence)paramString))
      {
        float f = Float.parseFloat(paramString);
        localFloat = Float.valueOf(f);
      }
      return localFloat;
    }
    catch (NumberFormatException paramString) {}
    return null;
  }
  
  public static final Double b(String paramString)
  {
    b.f.b.j.b(paramString, "receiver$0");
    Double localDouble = null;
    try
    {
      if (k.a.a((CharSequence)paramString))
      {
        double d = Double.parseDouble(paramString);
        localDouble = Double.valueOf(d);
      }
      return localDouble;
    }
    catch (NumberFormatException paramString) {}
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/k/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
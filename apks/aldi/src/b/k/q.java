package b.k;

import b.f.a.b;

@b.j(a={1, 1, 13}, b={"\000B\n\000\n\002\020\016\n\000\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\020\r\n\000\n\002\020\000\n\002\b\007\032.\020\000\032\0020\0012\006\020\002\032\0020\0032\033\020\004\032\027\022\b\022\0060\006j\002`\007\022\004\022\0020\b0\005¢\006\002\b\tH\b\032&\020\000\032\0020\0012\033\020\004\032\027\022\b\022\0060\006j\002`\007\022\004\022\0020\b0\005¢\006\002\b\tH\b\0325\020\n\032\002H\013\"\f\b\000\020\013*\0060\fj\002`\r*\002H\0132\026\020\016\032\f\022\b\b\001\022\004\030\0010\0200\017\"\004\030\0010\020¢\006\002\020\021\032/\020\n\032\0060\006j\002`\007*\0060\006j\002`\0072\026\020\016\032\f\022\b\b\001\022\004\030\0010\0220\017\"\004\030\0010\022¢\006\002\020\023\032/\020\n\032\0060\006j\002`\007*\0060\006j\002`\0072\026\020\016\032\f\022\b\b\001\022\004\030\0010\0010\017\"\004\030\0010\001¢\006\002\020\024\0329\020\025\032\0020\b\"\004\b\000\020\013*\0060\fj\002`\r2\006\020\026\032\002H\0132\024\020\027\032\020\022\004\022\002H\013\022\004\022\0020\020\030\0010\005H\000¢\006\002\020\030¨\006\031"}, c={"buildString", "", "capacity", "", "builderAction", "Lkotlin/Function1;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "Lkotlin/ExtensionFunctionType;", "append", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "value", "", "", "(Ljava/lang/Appendable;[Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "", "(Ljava/lang/StringBuilder;[Ljava/lang/Object;)Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "appendElement", "element", "transform", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, d=1)
public class q
  extends p
{
  public static final StringBuilder a(StringBuilder paramStringBuilder, String... paramVarArgs)
  {
    b.f.b.j.b(paramStringBuilder, "receiver$0");
    b.f.b.j.b(paramVarArgs, "value");
    int i = 0;
    while (i < 3)
    {
      paramStringBuilder.append(paramVarArgs[i]);
      i += 1;
    }
    return paramStringBuilder;
  }
  
  public static final <T> void a(Appendable paramAppendable, T paramT, b<? super T, ? extends CharSequence> paramb)
  {
    b.f.b.j.b(paramAppendable, "receiver$0");
    if (paramb != null)
    {
      paramAppendable.append((CharSequence)paramb.a(paramT));
      return;
    }
    boolean bool;
    if (paramT != null) {
      bool = paramT instanceof CharSequence;
    } else {
      bool = true;
    }
    if (bool)
    {
      paramAppendable.append((CharSequence)paramT);
      return;
    }
    if ((paramT instanceof Character))
    {
      paramAppendable.append(((Character)paramT).charValue());
      return;
    }
    paramAppendable.append((CharSequence)String.valueOf(paramT));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/k/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
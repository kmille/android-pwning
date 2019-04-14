package b.k;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@b.j(a={1, 1, 13}, b={"\000f\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\"\n\002\b\002\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\r\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020 \n\002\b\004\n\002\020\000\n\002\b\003\030\000 ,2\0060\001j\002`\002:\002,-B\017\b\026\022\006\020\003\032\0020\004¢\006\002\020\005B\027\b\026\022\006\020\003\032\0020\004\022\006\020\006\032\0020\007¢\006\002\020\bB\035\b\026\022\006\020\003\032\0020\004\022\f\020\t\032\b\022\004\022\0020\0070\n¢\006\002\020\013B\017\b\001\022\006\020\f\032\0020\r¢\006\002\020\016J\016\020\024\032\0020\0252\006\020\026\032\0020\027J\032\020\030\032\004\030\0010\0312\006\020\026\032\0020\0272\b\b\002\020\032\032\0020\033J\036\020\034\032\b\022\004\022\0020\0310\0352\006\020\026\032\0020\0272\b\b\002\020\032\032\0020\033J\020\020\036\032\004\030\0010\0312\006\020\026\032\0020\027J\021\020\037\032\0020\0252\006\020\026\032\0020\027H\004J\"\020 \032\0020\0042\006\020\026\032\0020\0272\022\020!\032\016\022\004\022\0020\031\022\004\022\0020\0270\"J\026\020 \032\0020\0042\006\020\026\032\0020\0272\006\020#\032\0020\004J\026\020$\032\0020\0042\006\020\026\032\0020\0272\006\020#\032\0020\004J\036\020%\032\b\022\004\022\0020\0040&2\006\020\026\032\0020\0272\b\b\002\020'\032\0020\033J\006\020(\032\0020\rJ\b\020)\032\0020\004H\026J\b\020*\032\0020+H\002R\026\020\017\032\n\022\004\022\0020\007\030\0010\nX\016¢\006\002\n\000R\016\020\f\032\0020\rX\004¢\006\002\n\000R\027\020\t\032\b\022\004\022\0020\0070\n8F¢\006\006\032\004\b\020\020\021R\021\020\003\032\0020\0048F¢\006\006\032\004\b\022\020\023¨\006."}, c={"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "nativePattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "_options", "getOptions", "()Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "containsMatchIn", "", "input", "", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchEntire", "matches", "replace", "transform", "Lkotlin/Function1;", "replacement", "replaceFirst", "split", "", "limit", "toPattern", "toString", "writeReplace", "", "Companion", "Serialized", "kotlin-stdlib"})
public final class j
  implements Serializable
{
  public static final a b = new a((byte)0);
  public final Pattern a;
  
  public j(String paramString)
  {
    this(paramString);
  }
  
  private j(Pattern paramPattern)
  {
    this.a = paramPattern;
  }
  
  public final boolean a(CharSequence paramCharSequence)
  {
    b.f.b.j.b(paramCharSequence, "input");
    return this.a.matcher(paramCharSequence).matches();
  }
  
  public final String toString()
  {
    String str = this.a.toString();
    b.f.b.j.a(str, "nativePattern.toString()");
    return str;
  }
  
  @b.j(a={1, 1, 13}, b={"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\004H\002J\016\020\006\032\0020\0072\006\020\b\032\0020\007J\016\020\t\032\0020\0072\006\020\b\032\0020\007J\016\020\n\032\0020\0132\006\020\b\032\0020\007¨\006\f"}, c={"Lkotlin/text/Regex$Companion;", "", "()V", "ensureUnicodeCase", "", "flags", "escape", "", "literal", "escapeReplacement", "fromLiteral", "Lkotlin/text/Regex;", "kotlin-stdlib"})
  public static final class a {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/k/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package b;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@j(a={1, 1, 13}, b={"\000$\n\002\030\002\n\002\020\033\n\000\n\002\020\b\n\000\n\002\020\025\n\002\b\002\n\002\020\021\n\002\020\016\n\002\b\021\b\002\030\0002\0020\001B\\\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\005\022\016\b\002\020\007\032\b\022\004\022\0020\t0\b\022\016\b\002\020\n\032\b\022\004\022\0020\t0\b\022\b\b\002\020\013\032\0020\t\022\b\b\002\020\f\032\0020\t\022\b\b\002\020\r\032\0020\003R\021\020\006\032\0020\0058\007¢\006\006\032\004\b\016\020\017R\027\020\007\032\b\022\004\022\0020\t0\b8\007¢\006\006\032\004\b\020\020\021R\027\020\n\032\b\022\004\022\0020\t0\b8\007¢\006\006\032\004\b\022\020\021R\022\020\r\032\0020\003X\004¢\006\006\032\004\b\023\020\024R\021\020\013\032\0020\t8\007¢\006\006\032\004\b\025\020\026R\021\020\002\032\0020\0038\007¢\006\006\032\004\b\027\020\024R\021\020\004\032\0020\0058\007¢\006\006\032\004\b\030\020\017R\022\020\f\032\0020\tX\004¢\006\006\032\004\b\031\020\026¨\006\032"}, c={"Lkotlin/Metadata;", "", "kind", "", "metadataVersion", "", "bytecodeVersion", "data1", "", "", "data2", "extraString", "packageName", "extraInt", "bv", "()[I", "d1", "()[Ljava/lang/String;", "d2", "xi", "()I", "xs", "()Ljava/lang/String;", "k", "mv", "pn", "kotlin-stdlib"})
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface j
{
  int[] a() default {};
  
  String[] b() default {};
  
  String[] c() default {};
  
  int d() default 0;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
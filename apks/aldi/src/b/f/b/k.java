package b.f.b;

import java.io.Serializable;

@b.j(a={1, 1, 13}, b={"\000\036\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020\016\n\000\b&\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\0020\003B\r\022\006\020\004\032\0020\005¢\006\002\020\006J\b\020\t\032\0020\nH\026R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\013"}, c={"Lkotlin/jvm/internal/Lambda;", "R", "Lkotlin/jvm/internal/FunctionBase;", "Ljava/io/Serializable;", "arity", "", "(I)V", "getArity", "()I", "toString", "", "kotlin-stdlib"})
public abstract class k<R>
  implements h<R>, Serializable
{
  private final int a;
  
  public k(int paramInt)
  {
    this.a = paramInt;
  }
  
  public String toString()
  {
    String str = v.a(this);
    j.a(str, "Reflection.renderLambdaToString(this)");
    return str;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/f/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
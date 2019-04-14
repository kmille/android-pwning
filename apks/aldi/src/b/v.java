package b;

import b.f.a.a;
import java.io.Serializable;

@j(a={1, 1, 13}, b={"\0002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\004\n\002\020\013\n\000\n\002\020\016\n\002\b\002\b\000\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\0060\003j\002`\004B\023\022\f\020\005\032\b\022\004\022\0028\0000\006¢\006\002\020\007J\b\020\r\032\0020\016H\026J\b\020\017\032\0020\020H\026J\b\020\021\032\0020\tH\002R\020\020\b\032\004\030\0010\tX\016¢\006\002\n\000R\026\020\005\032\n\022\004\022\0028\000\030\0010\006X\016¢\006\002\n\000R\024\020\n\032\0028\0008VX\004¢\006\006\032\004\b\013\020\f¨\006\022"}, c={"Lkotlin/UnsafeLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"})
public final class v<T>
  implements d<T>, Serializable
{
  private a<? extends T> a;
  private Object b;
  
  public v(a<? extends T> parama)
  {
    this.a = parama;
    this.b = s.a;
  }
  
  public final T a()
  {
    if (this.b == s.a)
    {
      a locala = this.a;
      if (locala == null) {
        b.f.b.j.a();
      }
      this.b = locala.b_();
      this.a = null;
    }
    return (T)this.b;
  }
  
  public final String toString()
  {
    int i;
    if (this.b != s.a) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return String.valueOf(a());
    }
    return "Lazy value not initialized yet.";
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
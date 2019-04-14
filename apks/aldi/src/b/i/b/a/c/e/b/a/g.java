package b.i.b.a.c.e.b.a;

import b.f.b.j;
import b.i.b.a.c.e.a.a;
import java.util.Arrays;

public final class g
  extends a
{
  public static final g e = new g(new int[] { 1, 1, 13 });
  public static final g f = new g(new int[0]);
  public static final a g = new a((byte)0);
  private final boolean h;
  
  public g(int... paramVarArgs)
  {
    this(paramVarArgs, false);
  }
  
  public g(int[] paramArrayOfInt, boolean paramBoolean)
  {
    super(Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length));
    this.h = paramBoolean;
  }
  
  public final boolean a()
  {
    if ((this.a != 1) || (this.b != 0))
    {
      if (this.h)
      {
        a locala = (a)e;
        j.b(locala, "ourVersion");
        if (this.a == 0) {
          if ((locala.a != 0) || (this.b != locala.b)) {
            break label109;
          }
        } else {
          if ((this.a != locala.a) || (this.b > locala.b)) {
            break label109;
          }
        }
      }
      else
      {
        if ((this.a != 1) || (this.b > 4)) {
          break label109;
        }
      }
      int i = 1;
      break label111;
      label109:
      i = 0;
      label111:
      if (i != 0) {
        return true;
      }
    }
    return false;
  }
  
  public static final class a {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/b/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
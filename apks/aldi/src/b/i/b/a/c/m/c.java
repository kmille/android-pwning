package b.i.b.a.c.m;

public abstract class c
{
  public final boolean a;
  
  private c(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public static final class a
    extends c
  {
    public static final a b = new a();
    
    private a()
    {
      super((byte)0);
    }
  }
  
  public static final class b
    extends c
  {
    private final String b;
    
    public b(String paramString)
    {
      super((byte)0);
      this.b = paramString;
    }
  }
  
  public static final class c
    extends c
  {
    public static final c b = new c();
    
    private c()
    {
      super((byte)0);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/m/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
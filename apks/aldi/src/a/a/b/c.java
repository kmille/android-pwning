package a.a.b;

import java.util.Date;

public final class c
  extends d
{
  public c(boolean paramBoolean)
  {
    super(paramBoolean);
  }
  
  protected final long a(Date paramDate)
  {
    return paramDate.getTime() / 1000L;
  }
  
  protected final Date a(long paramLong)
  {
    return new Date(paramLong * 1000L);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
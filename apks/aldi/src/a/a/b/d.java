package a.a.b;

import com.google.gson.TypeAdapter;
import java.util.Date;

abstract class d
  extends TypeAdapter<Date>
{
  private final boolean a;
  
  public d(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  protected abstract long a(Date paramDate);
  
  protected abstract Date a(long paramLong);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package butterknife;

import android.support.annotation.UiThread;

public abstract interface Unbinder
{
  public static final Unbinder a = new Unbinder()
  {
    public final void unbind() {}
  };
  
  @UiThread
  public abstract void unbind();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/butterknife/Unbinder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
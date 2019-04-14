package butterknife.a;

import android.view.View;
import android.view.View.OnClickListener;

public abstract class a
  implements View.OnClickListener
{
  private static final Runnable ENABLE_AGAIN = new Runnable()
  {
    public final void run()
    {
      a.enabled = true;
    }
  };
  static boolean enabled = true;
  
  public abstract void doClick(View paramView);
  
  public final void onClick(View paramView)
  {
    if (enabled)
    {
      enabled = false;
      paramView.post(ENABLE_AGAIN);
      doClick(paramView);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/butterknife/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
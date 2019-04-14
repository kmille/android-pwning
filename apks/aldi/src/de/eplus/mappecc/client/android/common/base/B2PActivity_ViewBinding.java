package de.eplus.mappecc.client.android.common.base;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.a.b;
import de.eplus.mappecc.client.android.common.component.tabbar.TabBarView;

public class B2PActivity_ViewBinding
  implements Unbinder
{
  private B2PActivity target;
  
  @UiThread
  public B2PActivity_ViewBinding(B2PActivity paramB2PActivity)
  {
    this(paramB2PActivity, paramB2PActivity.getWindow().getDecorView());
  }
  
  @UiThread
  public B2PActivity_ViewBinding(B2PActivity paramB2PActivity, View paramView)
  {
    this.target = paramB2PActivity;
    paramB2PActivity.tabBarView = ((TabBarView)b.a(paramView, 2131231234, "field 'tabBarView'", TabBarView.class));
    paramB2PActivity.toolbar = ((Toolbar)b.a(paramView, 2131231238, "field 'toolbar'", Toolbar.class));
    paramB2PActivity.tabbarLayout = ((LinearLayout)b.a(paramView, 2131231068, "field 'tabbarLayout'", LinearLayout.class));
    paramB2PActivity.titleTextView = ((TextView)b.a(paramView, 2131231444, "field 'titleTextView'", TextView.class));
  }
  
  @CallSuper
  public void unbind()
  {
    B2PActivity localB2PActivity = this.target;
    if (localB2PActivity != null)
    {
      this.target = null;
      localB2PActivity.tabBarView = null;
      localB2PActivity.toolbar = null;
      localB2PActivity.tabbarLayout = null;
      localB2PActivity.titleTextView = null;
      return;
    }
    throw new IllegalStateException("Bindings already cleared.");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/base/B2PActivity_ViewBinding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
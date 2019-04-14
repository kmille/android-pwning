package de.eplus.mappecc.client.android.common.component.tabbar;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.a.b;

public class TabBarView_ViewBinding
  implements Unbinder
{
  private TabBarView target;
  
  @UiThread
  public TabBarView_ViewBinding(TabBarView paramTabBarView)
  {
    this(paramTabBarView, paramTabBarView);
  }
  
  @UiThread
  public TabBarView_ViewBinding(TabBarView paramTabBarView, View paramView)
  {
    this.target = paramTabBarView;
    paramTabBarView.overViewLinearLayout = ((LinearLayout)b.b(paramView, 2131231029, "field 'overViewLinearLayout'", LinearLayout.class));
    paramTabBarView.optionsLinearLayout = ((LinearLayout)b.b(paramView, 2131231028, "field 'optionsLinearLayout'", LinearLayout.class));
    paramTabBarView.chargingLinearLayout = ((LinearLayout)b.b(paramView, 2131231026, "field 'chargingLinearLayout'", LinearLayout.class));
    paramTabBarView.accountsLinearLayout = ((LinearLayout)b.b(paramView, 2131231024, "field 'accountsLinearLayout'", LinearLayout.class));
    paramTabBarView.helpLinearLayout = ((LinearLayout)b.b(paramView, 2131231027, "field 'helpLinearLayout'", LinearLayout.class));
    paramTabBarView.overViewButton = ((ImageView)b.b(paramView, 2131231017, "field 'overViewButton'", ImageView.class));
    paramTabBarView.optionsButton = ((ImageView)b.b(paramView, 2131231016, "field 'optionsButton'", ImageView.class));
    paramTabBarView.chargingButton = ((ImageView)b.b(paramView, 2131231014, "field 'chargingButton'", ImageView.class));
    paramTabBarView.accountsButton = ((ImageView)b.b(paramView, 2131231013, "field 'accountsButton'", ImageView.class));
    paramTabBarView.helpButton = ((ImageView)b.b(paramView, 2131231015, "field 'helpButton'", ImageView.class));
    paramTabBarView.overViewTextView = ((TextView)b.b(paramView, 2131231443, "field 'overViewTextView'", TextView.class));
    paramTabBarView.optionsTextView = ((TextView)b.b(paramView, 2131231442, "field 'optionsTextView'", TextView.class));
    paramTabBarView.chargingTextView = ((TextView)b.b(paramView, 2131231440, "field 'chargingTextView'", TextView.class));
    paramTabBarView.accountsTextView = ((TextView)b.b(paramView, 2131231439, "field 'accountsTextView'", TextView.class));
    paramTabBarView.helpTextView = ((TextView)b.b(paramView, 2131231441, "field 'helpTextView'", TextView.class));
  }
  
  @CallSuper
  public void unbind()
  {
    TabBarView localTabBarView = this.target;
    if (localTabBarView != null)
    {
      this.target = null;
      localTabBarView.overViewLinearLayout = null;
      localTabBarView.optionsLinearLayout = null;
      localTabBarView.chargingLinearLayout = null;
      localTabBarView.accountsLinearLayout = null;
      localTabBarView.helpLinearLayout = null;
      localTabBarView.overViewButton = null;
      localTabBarView.optionsButton = null;
      localTabBarView.chargingButton = null;
      localTabBarView.accountsButton = null;
      localTabBarView.helpButton = null;
      localTabBarView.overViewTextView = null;
      localTabBarView.optionsTextView = null;
      localTabBarView.chargingTextView = null;
      localTabBarView.accountsTextView = null;
      localTabBarView.helpTextView = null;
      return;
    }
    throw new IllegalStateException("Bindings already cleared.");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/tabbar/TabBarView_ViewBinding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
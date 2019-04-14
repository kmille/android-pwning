package de.eplus.mappecc.client.android.common.component.expandablecellcard;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.a.a;
import butterknife.a.b;

public class ExpandableCellCardView_ViewBinding
  implements Unbinder
{
  private ExpandableCellCardView target;
  private View view2131230836;
  
  @UiThread
  public ExpandableCellCardView_ViewBinding(ExpandableCellCardView paramExpandableCellCardView)
  {
    this(paramExpandableCellCardView, paramExpandableCellCardView);
  }
  
  @UiThread
  public ExpandableCellCardView_ViewBinding(final ExpandableCellCardView paramExpandableCellCardView, View paramView)
  {
    this.target = paramExpandableCellCardView;
    paramExpandableCellCardView.iconImageView = ((ImageView)b.b(paramView, 2131230999, "field 'iconImageView'", ImageView.class));
    paramExpandableCellCardView.expAreaRecyclerView = ((RecyclerView)b.b(paramView, 2131231168, "field 'expAreaRecyclerView'", RecyclerView.class));
    View localView = b.a(paramView, 2131230836, "field 'expAreaClickAreaRelativeLayout' and method 'onClickExpAreaClickArea'");
    paramExpandableCellCardView.expAreaClickAreaRelativeLayout = ((ConstraintLayout)b.c(localView, 2131230836, "field 'expAreaClickAreaRelativeLayout'", ConstraintLayout.class));
    this.view2131230836 = localView;
    localView.setOnClickListener(new a()
    {
      public void doClick(View paramAnonymousView)
      {
        paramExpandableCellCardView.onClickExpAreaClickArea();
      }
    });
    paramExpandableCellCardView.subjectTextView = ((TextView)b.b(paramView, 2131231335, "field 'subjectTextView'", TextView.class));
    paramExpandableCellCardView.expandSwitch = ((SwitchCompat)b.b(paramView, 2131231000, "field 'expandSwitch'", SwitchCompat.class));
  }
  
  @CallSuper
  public void unbind()
  {
    ExpandableCellCardView localExpandableCellCardView = this.target;
    if (localExpandableCellCardView != null)
    {
      this.target = null;
      localExpandableCellCardView.iconImageView = null;
      localExpandableCellCardView.expAreaRecyclerView = null;
      localExpandableCellCardView.expAreaClickAreaRelativeLayout = null;
      localExpandableCellCardView.subjectTextView = null;
      localExpandableCellCardView.expandSwitch = null;
      this.view2131230836.setOnClickListener(null);
      this.view2131230836 = null;
      return;
    }
    throw new IllegalStateException("Bindings already cleared.");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/expandablecellcard/ExpandableCellCardView_ViewBinding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
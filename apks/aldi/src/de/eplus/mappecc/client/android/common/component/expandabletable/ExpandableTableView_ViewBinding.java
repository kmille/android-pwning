package de.eplus.mappecc.client.android.common.component.expandabletable;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.a.b;

public class ExpandableTableView_ViewBinding
  implements Unbinder
{
  private ExpandableTableView target;
  
  @UiThread
  public ExpandableTableView_ViewBinding(ExpandableTableView paramExpandableTableView)
  {
    this(paramExpandableTableView, paramExpandableTableView);
  }
  
  @UiThread
  public ExpandableTableView_ViewBinding(ExpandableTableView paramExpandableTableView, View paramView)
  {
    this.target = paramExpandableTableView;
    paramExpandableTableView.imageButtonExpand = ((ImageView)b.b(paramView, 2131230949, "field 'imageButtonExpand'", ImageView.class));
    paramExpandableTableView.textViewTitle = ((TextView)b.b(paramView, 2131231334, "field 'textViewTitle'", TextView.class));
    paramExpandableTableView.descriptionRecyclerView = ((RecyclerView)b.b(paramView, 2131231167, "field 'descriptionRecyclerView'", RecyclerView.class));
    paramExpandableTableView.expentableTableLinearLayout = ((LinearLayout)b.b(paramView, 2131231091, "field 'expentableTableLinearLayout'", LinearLayout.class));
    paramExpandableTableView.clickAreaRelativeLayout = ((RelativeLayout)b.b(paramView, 2131231156, "field 'clickAreaRelativeLayout'", RelativeLayout.class));
    paramExpandableTableView.lineView = b.a(paramView, 2131231478, "field 'lineView'");
  }
  
  @CallSuper
  public void unbind()
  {
    ExpandableTableView localExpandableTableView = this.target;
    if (localExpandableTableView != null)
    {
      this.target = null;
      localExpandableTableView.imageButtonExpand = null;
      localExpandableTableView.textViewTitle = null;
      localExpandableTableView.descriptionRecyclerView = null;
      localExpandableTableView.expentableTableLinearLayout = null;
      localExpandableTableView.clickAreaRelativeLayout = null;
      localExpandableTableView.lineView = null;
      return;
    }
    throw new IllegalStateException("Bindings already cleared.");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/expandabletable/ExpandableTableView_ViewBinding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
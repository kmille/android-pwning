package de.eplus.mappecc.client.android.common.component.expandablecellcard;

import android.widget.TextView;
import de.eplus.mappecc.client.android.common.network.moe.TextViewHtmlAdapter;
import de.eplus.mappecc.client.android.common.network.moe.ViewSetter;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;

public class ExpandableCellCardViewAdapter$$ViewSetter
  extends ViewSetter
{
  public ExpandableCellCardViewAdapter$$ViewSetter(Object paramObject, Localizer paramLocalizer)
  {
    super(paramObject, paramLocalizer);
  }
  
  public void update()
  {
    Object localObject = findById(2131231140);
    if (localObject != null) {
      TextViewHtmlAdapter.setNonHtmlText((TextView)localObject, this.localizer.getString(2131691312));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/expandablecellcard/ExpandableCellCardViewAdapter$$ViewSetter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
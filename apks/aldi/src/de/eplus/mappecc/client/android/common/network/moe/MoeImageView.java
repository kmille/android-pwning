package de.eplus.mappecc.client.android.common.network.moe;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.StringRes;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import de.eplus.mappecc.client.android.R.styleable;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.utils.ImageUtils;
import de.eplus.mappecc.client.android.common.utils.UiUtils;
import javax.inject.Inject;

public class MoeImageView
  extends AppCompatImageView
{
  @Inject
  Localizer localizer;
  
  public MoeImageView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public MoeImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
    initAttributes(paramAttributeSet);
  }
  
  public MoeImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
    initAttributes(paramAttributeSet);
  }
  
  private void init()
  {
    B2PApplication.component.inject(this);
  }
  
  private void initAttributes(AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return;
    }
    paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.MoeImageView);
    try
    {
      int j = paramAttributeSet.getIndexCount();
      int i = 0;
      while (i < j)
      {
        int k = paramAttributeSet.getIndex(i);
        if (k == 0) {
          setMoeImage(paramAttributeSet.getResourceId(k, 0));
        }
        i += 1;
      }
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  public void setMoeImage(@StringRes int paramInt)
  {
    UiUtils.renderUrlImage(this, ImageUtils.getMoeImageUrlWithMoeValue(this.localizer.getString(paramInt)));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/MoeImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
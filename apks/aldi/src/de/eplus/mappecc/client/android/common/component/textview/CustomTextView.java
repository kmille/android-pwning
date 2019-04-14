package de.eplus.mappecc.client.android.common.component.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import de.eplus.mappecc.client.android.R.styleable;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import java.util.Map;
import javax.inject.Inject;

public class CustomTextView
  extends AppCompatTextView
{
  @Inject
  Localizer localizer;
  
  public CustomTextView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public CustomTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
    initAttributes(paramAttributeSet);
  }
  
  public CustomTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
    initAttributes(paramAttributeSet);
  }
  
  private void init()
  {
    B2PApplication.component.inject(this);
  }
  
  private void initAttributes(@Nullable AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return;
    }
    paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.CustomTextView);
    try
    {
      int j = paramAttributeSet.getIndexCount();
      int i = 0;
      while (i < j)
      {
        int k = paramAttributeSet.getIndex(i);
        if (k == 0)
        {
          int m = paramAttributeSet.getResourceId(k, 0);
          if (m > 0) {
            setTextFromMoe(m);
          } else {
            setText(paramAttributeSet.getText(k).toString());
          }
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
  
  public void setTextFromMoe(@StringRes int paramInt)
  {
    setTextFromMoe(paramInt, null);
  }
  
  public void setTextFromMoe(@StringRes int paramInt, @Nullable Map<String, String> paramMap)
  {
    setText(this.localizer.getString(paramInt, paramMap));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/textview/CustomTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
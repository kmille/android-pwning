package de.eplus.mappecc.client.android.common.component.cellcard;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.eplus.mappecc.client.android.R.styleable;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;

public class CellCardView
  extends CardView
  implements ICellCardView
{
  private LinearLayout accountLinearLayout;
  private CardView cardView;
  private TextView descTextView;
  private ImageView iconImageView;
  private TextView titleTextView;
  
  public CellCardView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public CellCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
    initAttributeSet(paramAttributeSet);
  }
  
  public CellCardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
    initAttributeSet(paramAttributeSet);
  }
  
  private void init()
  {
    B2PApplication.component.inject(this);
    inflate(getContext(), 2131427433, this);
    this.cardView = ((CardView)findViewById(2131230872));
    this.titleTextView = ((TextView)findViewById(2131231455));
    this.descTextView = ((TextView)findViewById(2131231311));
    this.iconImageView = ((ImageView)findViewById(2131231002));
    this.accountLinearLayout = ((LinearLayout)findViewById(2131231039));
    if (Build.VERSION.SDK_INT < 21) {
      setCardElevation(0.0F);
    }
  }
  
  private void initAttributeSet(AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return;
    }
    paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.CellCardView);
    for (;;)
    {
      try
      {
        int j = paramAttributeSet.getIndexCount();
        int i = 0;
        int k;
        if (i < j) {
          k = paramAttributeSet.getIndex(i);
        }
        switch (k)
        {
        case 1: 
          setTitle(paramAttributeSet.getText(k).toString());
          break;
        case 0: 
          setIcon(paramAttributeSet.getResourceId(k, 0));
          i += 1;
          continue;
          return;
        }
      }
      finally
      {
        paramAttributeSet.recycle();
      }
    }
  }
  
  private void setIcon(@DrawableRes int paramInt)
  {
    this.iconImageView.setVisibility(0);
    this.iconImageView.setBackground(ContextCompat.getDrawable(getContext(), paramInt));
  }
  
  @Deprecated
  public void applyCell() {}
  
  public void setCellWithAccounts(String paramString1, String paramString2, int paramInt, int[] paramArrayOfInt)
  {
    setTitleWithIconDesc(paramString1, paramString2, paramInt);
    this.accountLinearLayout.setVisibility(0);
  }
  
  public void setTeaser(String paramString1, String paramString2, int paramInt)
  {
    this.descTextView.setTextColor(ContextCompat.getColor(getContext(), 2131034289));
    setTitleWithIconDesc(paramString1, paramString2, paramInt);
  }
  
  public void setTitle(String paramString)
  {
    this.titleTextView.setText(paramString);
  }
  
  public void setTitleWithDesc(String paramString1, String paramString2)
  {
    setTitle(paramString1);
    this.descTextView.setVisibility(0);
    this.descTextView.setText(paramString2);
  }
  
  public void setTitleWithIcon(String paramString, int paramInt)
  {
    setTitle(paramString);
    this.iconImageView.setVisibility(0);
    this.iconImageView.setBackground(ContextCompat.getDrawable(getContext(), paramInt));
  }
  
  public void setTitleWithIconDesc(String paramString1, String paramString2, int paramInt)
  {
    setTitleWithIcon(paramString1, paramInt);
    this.descTextView.setVisibility(0);
    this.descTextView.setText(paramString2);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/cellcard/CellCardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package de.eplus.mappecc.client.android.common.component.expandablecellcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RadioButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import de.eplus.mappecc.client.android.common.restclient.model.MoneyModel;
import java.math.BigDecimal;

public class RadioButtonGroupTableLayout
  extends TableLayout
  implements View.OnClickListener
{
  private static final String TAG = "RadioButtonGroupTableLayout";
  private RadioButton activeRadioButton;
  
  public RadioButtonGroupTableLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public RadioButtonGroupTableLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void setChildrenOnClickListener(TableRow paramTableRow)
  {
    int j = paramTableRow.getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = ((ViewGroup)paramTableRow.getChildAt(i)).getChildAt(0);
      if ((localView instanceof RadioButton)) {
        localView.setOnClickListener(this);
      }
      i += 1;
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    setChildrenOnClickListener((TableRow)paramView);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramLayoutParams);
    setChildrenOnClickListener((TableRow)paramView);
  }
  
  public Object getCheckedRadioButtonTag()
  {
    TableRow localTableRow = (TableRow)getChildAt(0);
    int i = 0;
    while (i < localTableRow.getChildCount())
    {
      RadioButton localRadioButton = (RadioButton)((ViewGroup)localTableRow.getChildAt(i)).getChildAt(0);
      if (localRadioButton.isChecked()) {
        return localRadioButton.getTag();
      }
      i += 1;
    }
    return null;
  }
  
  public void onClick(View paramView)
  {
    paramView = (RadioButton)paramView;
    if (this.activeRadioButton != null) {
      this.activeRadioButton.setChecked(false);
    }
    paramView.setChecked(true);
    this.activeRadioButton = paramView;
  }
  
  public void setPreselectedRadioButton(RadioButton paramRadioButton)
  {
    this.activeRadioButton = paramRadioButton;
  }
  
  public void setSelectedFirstRadioButton()
  {
    RadioButton localRadioButton = (RadioButton)((ViewGroup)((TableRow)getChildAt(0)).getChildAt(0)).getChildAt(0);
    if (this.activeRadioButton != null) {
      this.activeRadioButton.setChecked(false);
    }
    localRadioButton.setChecked(true);
    this.activeRadioButton = localRadioButton;
  }
  
  public void setSelectedRadioButton(MoneyModel paramMoneyModel)
  {
    TableRow localTableRow = (TableRow)getChildAt(0);
    int i = 0;
    while (i < localTableRow.getChildCount())
    {
      RadioButton localRadioButton = (RadioButton)((ViewGroup)localTableRow.getChildAt(i)).getChildAt(0);
      MoneyModel localMoneyModel = (MoneyModel)localRadioButton.getTag();
      if (paramMoneyModel.getAmount().compareTo(localMoneyModel.getAmount()) == 0)
      {
        if (this.activeRadioButton != null) {
          this.activeRadioButton.setChecked(false);
        }
        localRadioButton.setChecked(true);
        this.activeRadioButton = localRadioButton;
      }
      i += 1;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/expandablecellcard/RadioButtonGroupTableLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
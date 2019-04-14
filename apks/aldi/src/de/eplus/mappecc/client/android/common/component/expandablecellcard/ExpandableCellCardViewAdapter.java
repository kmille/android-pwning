package de.eplus.mappecc.client.android.common.component.expandablecellcard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;
import c.a.a;
import de.eplus.mappecc.client.android.common.component.expandabletable.ExpandableCellCardRowModel;
import de.eplus.mappecc.client.android.common.restclient.model.MoneyModel;
import de.eplus.mappecc.client.android.common.utils.UiUtils;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpandableCellCardViewAdapter
  extends RecyclerView.Adapter<ViewHolder>
{
  private Context context;
  private List<ExpandableCellCardRowModel> expandableCellCardRowModelList;
  private LayoutInflater layoutInflater;
  private List<CompoundButton.OnCheckedChangeListener> onCheckedChangePerRowListenerList;
  private Map<Integer, ViewHolder> viewHolderMap = new HashMap();
  
  public ExpandableCellCardViewAdapter(Context paramContext, List<ExpandableCellCardRowModel> paramList, List<CompoundButton.OnCheckedChangeListener> paramList1)
  {
    this.layoutInflater = LayoutInflater.from(paramContext);
    this.context = paramContext;
    this.expandableCellCardRowModelList = paramList;
    this.onCheckedChangePerRowListenerList = paramList1;
  }
  
  private boolean isPreSelected(MoneyModel paramMoneyModel1, MoneyModel paramMoneyModel2, int paramInt)
  {
    if ((paramMoneyModel2 == null) && (paramInt == 0)) {
      return true;
    }
    if ((paramMoneyModel2 == null) && (paramInt > 0)) {
      return false;
    }
    return (paramMoneyModel2 != null) && (paramMoneyModel2.getAmount().equals(paramMoneyModel1.getAmount()));
  }
  
  public int getItemCount()
  {
    return this.expandableCellCardRowModelList.size();
  }
  
  public List<MoneyModel> getRadioValues(int paramInt)
  {
    return ((ExpandableCellCardRowModel)this.expandableCellCardRowModelList.get(paramInt)).getRadioValues();
  }
  
  public MoneyModel getSelectedRadioButtonValue(int paramInt)
  {
    ViewHolder localViewHolder = (ViewHolder)this.viewHolderMap.get(Integer.valueOf(paramInt));
    if (localViewHolder != null) {
      return (MoneyModel)localViewHolder.valuesRadioGroup.getCheckedRadioButtonTag();
    }
    a.d("Warning view was already recycled so no viewholder found, cannot get charging value for radiobutton!", new Object[0]);
    return null;
  }
  
  public void onAttachedToRecyclerView(RecyclerView paramRecyclerView)
  {
    super.onAttachedToRecyclerView(paramRecyclerView);
  }
  
  public void onBindViewHolder(ViewHolder paramViewHolder, int paramInt)
  {
    Object localObject1 = ((ExpandableCellCardRowModel)this.expandableCellCardRowModelList.get(paramInt)).getSubject();
    Object localObject2 = ((ExpandableCellCardRowModel)this.expandableCellCardRowModelList.get(paramInt)).getDescription();
    paramViewHolder.subjectTextView.setText((CharSequence)localObject1);
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      paramViewHolder.subjectTextView.setVisibility(8);
    }
    paramViewHolder.descriptionTextView.setText((CharSequence)localObject2);
    int j = ((ExpandableCellCardRowModel)this.expandableCellCardRowModelList.get(paramInt)).getValuesCount();
    Map localMap = ((ExpandableCellCardRowModel)this.expandableCellCardRowModelList.get(paramInt)).getReplaceText();
    TableRow localTableRow = new TableRow(this.context);
    localTableRow.setLayoutParams(new TableRow.LayoutParams(-1));
    localTableRow.setGravity(1);
    localTableRow.setWeightSum(1.0F);
    localObject1 = null;
    int i = 0;
    while (i < j)
    {
      MoneyModel localMoneyModel1 = (MoneyModel)((ExpandableCellCardRowModel)this.expandableCellCardRowModelList.get(paramInt)).getRadioValues().get(i);
      MoneyModel localMoneyModel2 = ((ExpandableCellCardRowModel)this.expandableCellCardRowModelList.get(paramInt)).getRadioPreChecked();
      LinearLayout localLinearLayout = (LinearLayout)this.layoutInflater.inflate(2131427441, null);
      RadioButton localRadioButton = (RadioButton)localLinearLayout.getChildAt(0);
      if ((localMap != null) && (localMap.containsKey(localMoneyModel1)))
      {
        localObject2 = (String)localMap.get(localMoneyModel1);
      }
      else
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(localMoneyModel1.getAmount().intValue());
        ((StringBuilder)localObject2).append(" ");
        ((StringBuilder)localObject2).append(localRadioButton.getText());
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localRadioButton.setText((CharSequence)localObject2);
      localRadioButton.setId(UiUtils.generateViewId());
      localRadioButton.setTag(localMoneyModel1);
      boolean bool = isPreSelected(localMoneyModel1, localMoneyModel2, i);
      localRadioButton.setChecked(bool);
      if (bool) {
        localObject1 = localRadioButton;
      }
      if (this.onCheckedChangePerRowListenerList.size() > paramInt) {
        localRadioButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this.onCheckedChangePerRowListenerList.get(paramInt));
      }
      localLinearLayout.setLayoutParams(new TableRow.LayoutParams(-2, -2));
      localTableRow.addView(localLinearLayout);
      i += 1;
    }
    paramViewHolder.valuesRadioGroup.addView(localTableRow);
    paramViewHolder.valuesRadioGroup.setPreselectedRadioButton((RadioButton)localObject1);
    this.viewHolderMap.put(Integer.valueOf(paramInt), paramViewHolder);
  }
  
  public ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    return new ViewHolder(this.layoutInflater.inflate(2131427449, paramViewGroup, false));
  }
  
  public void setSelectedRadioButton(int paramInt, MoneyModel paramMoneyModel)
  {
    ViewHolder localViewHolder = (ViewHolder)this.viewHolderMap.get(Integer.valueOf(paramInt));
    if (localViewHolder != null)
    {
      localViewHolder.valuesRadioGroup.setSelectedRadioButton(paramMoneyModel);
      return;
    }
    a.d("Warning view was already recycled so no viewholder found, cannot select charging value radiobutton!", new Object[0]);
  }
  
  public class ViewHolder
    extends RecyclerView.ViewHolder
  {
    TextView descriptionTextView;
    TextView subjectTextView;
    RadioButtonGroupTableLayout valuesRadioGroup;
    
    ViewHolder(View paramView)
    {
      super();
      this.subjectTextView = ((TextView)paramView.findViewById(2131231337));
      this.descriptionTextView = ((TextView)paramView.findViewById(2131231336));
      this.valuesRadioGroup = ((RadioButtonGroupTableLayout)paramView.findViewById(2131231152));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/expandablecellcard/ExpandableCellCardViewAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
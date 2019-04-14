package de.eplus.mappecc.client.android.common.component.expandabletable;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import de.eplus.mappecc.client.android.common.model.PackDataModel;
import de.eplus.mappecc.client.android.common.utils.StringHelper;
import java.util.ArrayList;

public class ExpandableTableAdapter
  extends RecyclerView.Adapter<ViewHolder>
{
  private LayoutInflater inflater;
  private ArrayList<String> rowHeader;
  private ArrayList<String> rowText;
  
  public ExpandableTableAdapter(Context paramContext, PackDataModel paramPackDataModel)
  {
    this.inflater = LayoutInflater.from(paramContext);
    this.rowHeader = paramPackDataModel.getDetailsHeaderStringList();
    this.rowText = paramPackDataModel.getDetailsStringList();
  }
  
  public int getItemCount()
  {
    if (this.rowHeader.size() > this.rowText.size()) {}
    for (ArrayList localArrayList = this.rowHeader;; localArrayList = this.rowText) {
      return localArrayList.size();
    }
  }
  
  public void onBindViewHolder(ViewHolder paramViewHolder, int paramInt)
  {
    Object localObject;
    if (paramInt < this.rowHeader.size())
    {
      localObject = (String)this.rowHeader.get(paramInt);
      paramViewHolder.titleTextView.setText((CharSequence)localObject);
    }
    if (paramInt < this.rowText.size())
    {
      localObject = StringHelper.fromHtml((String)this.rowText.get(paramInt));
      paramViewHolder.descriptionTextView.setText((CharSequence)localObject);
    }
  }
  
  public ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    return new ViewHolder(this.inflater.inflate(2131427474, paramViewGroup, false));
  }
  
  public class ViewHolder
    extends RecyclerView.ViewHolder
  {
    TextView descriptionTextView;
    TextView titleTextView;
    
    ViewHolder(View paramView)
    {
      super();
      this.descriptionTextView = ((TextView)paramView.findViewById(2131231311));
      this.titleTextView = ((TextView)paramView.findViewById(2131231455));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/expandabletable/ExpandableTableAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
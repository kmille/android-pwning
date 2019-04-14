package de.eplus.mappecc.client.android.common.component.packages;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class PackagesAdapter
  extends RecyclerView.Adapter<ViewHolder>
{
  private List<String> data;
  private LayoutInflater inflater;
  
  public PackagesAdapter(Context paramContext, List<String> paramList)
  {
    this.inflater = LayoutInflater.from(paramContext);
    this.data = paramList;
  }
  
  public int getItemCount()
  {
    return this.data.size();
  }
  
  public void onBindViewHolder(ViewHolder paramViewHolder, int paramInt)
  {
    String str = (String)this.data.get(paramInt);
    paramViewHolder.packageTextView.setText(str);
  }
  
  public ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    return new ViewHolder(this.inflater.inflate(2131427467, paramViewGroup, false));
  }
  
  class ViewHolder
    extends RecyclerView.ViewHolder
  {
    TextView packageTextView;
    
    ViewHolder(View paramView)
    {
      super();
      this.packageTextView = ((TextView)paramView.findViewById(2131231398));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/packages/PackagesAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package de.eplus.mappecc.client.android.common.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.restclient.model.CounterModel;
import de.eplus.mappecc.client.android.common.restclient.model.CurrentBandwidthInfoModel;
import de.eplus.mappecc.client.android.common.restclient.model.FrontendMoneyModel;
import de.eplus.mappecc.client.android.common.restclient.model.PackModel;
import de.eplus.mappecc.client.android.common.restclient.model.PackModel.PackStatusEnum;
import de.eplus.mappecc.client.android.common.utils.formatter.FrontendMoneyModelFormatter;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.a.c.h;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class PackViewModel
{
  private ArrayList<CounterModel> counters;
  private CurrentBandwidthInfoModel currentBandwidthInfoModel;
  private int index;
  private Localizer localizer;
  private PackModel pack;
  private String timeStamp;
  
  public PackViewModel(Localizer paramLocalizer)
  {
    this.localizer = paramLocalizer;
  }
  
  public String getAdditionalTextHeader()
  {
    return this.localizer.getString(2131690149);
  }
  
  public ArrayList<CounterModel> getCounters()
  {
    return this.counters;
  }
  
  public CurrentBandwidthInfoModel getCurrentBandwidthInfoModel()
  {
    return this.currentBandwidthInfoModel;
  }
  
  public String getFrontendName(String paramString)
  {
    return this.localizer.getStringOrDefault(this.localizer.getString(paramString), this.pack.getFrontendName());
  }
  
  public String getGraceStatusHint()
  {
    if (getPack().getPackStatus() == PackModel.PackStatusEnum.GRACE) {
      return this.localizer.getString(2131690150);
    }
    return "";
  }
  
  public String getIconValue(String paramString)
  {
    return this.localizer.getString(paramString);
  }
  
  public int getIndex()
  {
    return this.index;
  }
  
  public PackModel getPack()
  {
    return this.pack;
  }
  
  @Nullable
  public String getPackAdditionalText(String paramString)
  {
    String str = this.localizer.getString(paramString);
    paramString = str;
    if (h.c(str)) {
      paramString = "";
    }
    return paramString;
  }
  
  public String getPackCancelHeadline()
  {
    return this.localizer.getString(2131690157);
  }
  
  @NonNull
  public String getPackDeactivationDateForMyTariff()
  {
    DateTimeFormatter localDateTimeFormatter = DateTimeFormat.forPattern("EEEE, dd.MM.yyyy");
    if (getPack().getNextPossibleDeactivationDate() != null) {
      return getPack().getNextPossibleDeactivationDate().toString(localDateTimeFormatter.withLocale(Locale.getDefault()));
    }
    return "";
  }
  
  public String getPackDurationHeadline()
  {
    return this.localizer.getString(2131690158);
  }
  
  public String getPackGraceStatusHint()
  {
    return this.localizer.getString(2131690150);
  }
  
  public PackModel.PackStatusEnum getPackStatus()
  {
    return getPack().getPackStatus();
  }
  
  public String getPriceHeader()
  {
    return this.localizer.getString(2131690147);
  }
  
  public String getPriceValue(@NonNull String paramString1, @NonNull String paramString2)
  {
    String str = FrontendMoneyModelFormatter.from(getPack().getPackPrice()).getMoneyModelAmount();
    if ((getPack().getPackPrice() != null) && (getPack().getPackPrice().getCurrency() != null) && (getPack().getPackPrice().getAmount() != null))
    {
      str = this.localizer.getString(paramString1).replace("${amount}", str);
      paramString2 = this.localizer.getString(paramString2);
      paramString1 = paramString2;
      if (paramString2.isEmpty()) {
        paramString1 = getPack().getPackPrice().getCurrency();
      }
      paramString2 = new StringBuilder();
      paramString2.append(str);
      paramString2.append(paramString1);
      return paramString2.toString();
    }
    return "";
  }
  
  public String getTimeStamp()
  {
    return this.timeStamp;
  }
  
  public void setCounters(ArrayList<CounterModel> paramArrayList)
  {
    this.counters = paramArrayList;
  }
  
  public void setCurrentBandwidthInfoModel(CurrentBandwidthInfoModel paramCurrentBandwidthInfoModel)
  {
    this.currentBandwidthInfoModel = paramCurrentBandwidthInfoModel;
  }
  
  public void setIndex(int paramInt)
  {
    this.index = paramInt;
  }
  
  public void setPack(PackModel paramPackModel)
  {
    this.pack = paramPackModel;
  }
  
  public void setTimeStamp(String paramString)
  {
    this.timeStamp = paramString;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/model/PackViewModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
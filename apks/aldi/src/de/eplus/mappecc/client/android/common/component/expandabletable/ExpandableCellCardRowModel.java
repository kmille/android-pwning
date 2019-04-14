package de.eplus.mappecc.client.android.common.component.expandabletable;

import de.eplus.mappecc.client.android.common.restclient.model.MoneyModel;
import java.util.List;
import java.util.Map;

public class ExpandableCellCardRowModel
{
  private String description;
  private MoneyModel radioPreChecked;
  private List<MoneyModel> radioValues;
  private Map<MoneyModel, String> replaceText;
  private String subject;
  
  public ExpandableCellCardRowModel(String paramString1, String paramString2, List<MoneyModel> paramList, MoneyModel paramMoneyModel)
  {
    this.subject = paramString1;
    this.description = paramString2;
    this.radioValues = paramList;
    this.radioPreChecked = paramMoneyModel;
  }
  
  public String getDescription()
  {
    return this.description;
  }
  
  public MoneyModel getRadioPreChecked()
  {
    return this.radioPreChecked;
  }
  
  public List<MoneyModel> getRadioValues()
  {
    return this.radioValues;
  }
  
  public Map<MoneyModel, String> getReplaceText()
  {
    return this.replaceText;
  }
  
  public String getSubject()
  {
    return this.subject;
  }
  
  public int getValuesCount()
  {
    return this.radioValues.size();
  }
  
  public void setReplaceText(Map<MoneyModel, String> paramMap)
  {
    this.replaceText = paramMap;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/expandabletable/ExpandableCellCardRowModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
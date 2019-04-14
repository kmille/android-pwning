package de.eplus.mappecc.client.android.common.model;

import android.support.annotation.NonNull;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTime;

public class BalanceMonthSelectionModel
{
  @NonNull
  private final DateTime dateTime;
  
  public BalanceMonthSelectionModel(DateTime paramDateTime)
  {
    this.dateTime = new DateTime(paramDateTime);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject != null)
    {
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (BalanceMonthSelectionModel)paramObject;
      if ((this.dateTime.getYear() == ((BalanceMonthSelectionModel)paramObject).dateTime.getYear()) && (this.dateTime.getMonthOfYear() == ((BalanceMonthSelectionModel)paramObject).dateTime.getMonthOfYear())) {
        return true;
      }
    }
    return false;
  }
  
  @NonNull
  public DateTime getDateTime()
  {
    return this.dateTime;
  }
  
  public String getMonthName(Locale paramLocale)
  {
    return this.dateTime.toString("MMMM", paramLocale);
  }
  
  public String getYear(Locale paramLocale)
  {
    return this.dateTime.toString("yyyy", paramLocale);
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.dateTime.getYear()), Integer.valueOf(this.dateTime.getMonthOfYear()) });
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("BalanceMonthSelectionModel{dateTime=");
    localStringBuilder.append(this.dateTime);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/model/BalanceMonthSelectionModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
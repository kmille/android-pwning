package de.eplus.mappecc.client.android.common.model;

import android.support.annotation.NonNull;
import com.google.common.collect.m;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.restclient.model.CycleInfoModel;
import de.eplus.mappecc.client.android.common.restclient.model.CycleInfoModel.CycleTypeEnum;
import de.eplus.mappecc.client.android.common.restclient.model.FrontendMoneyModel;
import de.eplus.mappecc.client.android.common.restclient.model.PackBookingInfoModel;
import de.eplus.mappecc.client.android.common.restclient.model.PackBookingInfoModel.ActionEnum;
import de.eplus.mappecc.client.android.common.restclient.model.PackCancelInfoModel;
import de.eplus.mappecc.client.android.common.restclient.model.PackModel;
import de.eplus.mappecc.client.android.common.restclient.model.PackModel.PackStatusEnum;
import de.eplus.mappecc.client.android.common.restclient.model.PaymentMethodEnum;
import de.eplus.mappecc.client.android.common.utils.StringHelper;
import de.eplus.mappecc.client.android.common.utils.formatter.FrontendMoneyModelFormatter;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.a.c.h;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Months;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class PackDataModel
{
  private static final String DEFAULT_PACK_PATH_PART = "";
  private Localizer localizer;
  private final PackModel packModel;
  
  public PackDataModel(PackModel paramPackModel, Localizer paramLocalizer)
  {
    this.packModel = paramPackModel;
    this.localizer = paramLocalizer;
  }
  
  protected boolean canEqual(Object paramObject)
  {
    return paramObject instanceof PackDataModel;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof PackDataModel)) {
      return false;
    }
    paramObject = (PackDataModel)paramObject;
    if (!((PackDataModel)paramObject).canEqual(this)) {
      return false;
    }
    Object localObject = getPackModel();
    PackModel localPackModel = ((PackDataModel)paramObject).getPackModel();
    if (localObject == null)
    {
      if (localPackModel != null) {
        return false;
      }
    }
    else if (!localObject.equals(localPackModel)) {
      return false;
    }
    localObject = getLocalizer();
    paramObject = ((PackDataModel)paramObject).getLocalizer();
    if (localObject == null)
    {
      if (paramObject != null) {
        return false;
      }
    }
    else if (!localObject.equals(paramObject)) {
      return false;
    }
    return true;
  }
  
  protected String escapeServiceItemCode(@NonNull String paramString)
  {
    if (h.b(paramString)) {
      return paramString.replaceAll("[^\\w]", "_");
    }
    return null;
  }
  
  public PackBookingInfoModel.ActionEnum getBookingAction()
  {
    if ((this.packModel.getBookingInfo() != null) && (this.packModel.getBookingInfo().getAction() != null)) {
      return this.packModel.getBookingInfo().getAction();
    }
    return PackBookingInfoModel.ActionEnum.UNKNOWN;
  }
  
  public String getBundleDuration()
  {
    Object localObject2 = this.packModel.getCycleInfo();
    if (localObject2 != null)
    {
      Object localObject1 = ((CycleInfoModel)localObject2).getCycleCount();
      localObject2 = ((CycleInfoModel)localObject2).getCycleType();
      if ((localObject2 != null) && (localObject1 != null) && (((Integer)localObject1).intValue() > 0))
      {
        switch (1.$SwitchMap$de$eplus$mappecc$client$android$common$restclient$model$CycleInfoModel$CycleTypeEnum[localObject2.ordinal()])
        {
        default: 
          localObject1 = null;
          break;
        case 6: 
          localObject1 = Years.years(((Integer)localObject1).intValue());
          break;
        case 4: 
        case 5: 
          localObject1 = Months.months(((Integer)localObject1).intValue());
          break;
        case 3: 
          localObject1 = Weeks.weeks(((Integer)localObject1).intValue());
          break;
        case 2: 
          localObject1 = Hours.hours(((Integer)localObject1).intValue());
          break;
        case 1: 
          localObject1 = Days.days(((Integer)localObject1).intValue());
        }
        if (localObject1 != null) {
          return String.valueOf(Days.standardDaysIn((ReadablePeriod)localObject1).getDays());
        }
      }
    }
    return "";
  }
  
  public String getDetail(int paramInt)
  {
    Localizer localLocalizer = getLocalizer();
    StringBuilder localStringBuilder = new StringBuilder("productDetail_detail_");
    localStringBuilder.append(getPackEscapedPackPathPart());
    localStringBuilder.append("_");
    localStringBuilder.append(paramInt);
    return localLocalizer.getStringOrDefault(localStringBuilder.toString(), "-1");
  }
  
  public ArrayList<String> getDetailsHeaderStringList()
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    String str;
    do
    {
      i += 1;
      str = getHeader(i);
      if (!str.equals("-1")) {
        localArrayList.add(str);
      }
    } while (!str.equals("-1"));
    return localArrayList;
  }
  
  public ArrayList<String> getDetailsStringList()
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    String str;
    do
    {
      i += 1;
      str = getDetail(i);
      if (!str.equals("-1")) {
        localArrayList.add(str);
      }
    } while (!str.equals("-1"));
    return localArrayList;
  }
  
  protected String getEscapedPackPart(@NonNull String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(escapeServiceItemCode(this.packModel.getServiceItemCode()));
    return localStringBuilder.toString();
  }
  
  public String getFormattedPackPrice()
  {
    Object localObject = getLocalizer();
    StringBuilder localStringBuilder = new StringBuilder("properties_currency_");
    localStringBuilder.append(getPackModel().getPackPrice().getCurrency());
    localObject = ((Localizer)localObject).getStringOrDefault(localStringBuilder.toString(), getPackModel().getPackPrice().getCurrency());
    return h.a(FrontendMoneyModelFormatter.from(getPackModel().getPackPrice()).getMoneyModelAmountAndCurrency(), getPackModel().getPackPrice().getCurrency(), (String)localObject);
  }
  
  public String getHeader(int paramInt)
  {
    Localizer localLocalizer = getLocalizer();
    StringBuilder localStringBuilder = new StringBuilder("productDetail_header_");
    localStringBuilder.append(getPackEscapedPackPathPart());
    localStringBuilder.append("_");
    localStringBuilder.append(paramInt);
    return localLocalizer.getStringOrDefault(localStringBuilder.toString(), "-1");
  }
  
  public Localizer getLocalizer()
  {
    return this.localizer;
  }
  
  public String getPackAdditionalPriceValue()
  {
    if (getPackModel().getPackPrice() == null) {
      return "";
    }
    Object localObject = getLocalizer();
    StringBuilder localStringBuilder = new StringBuilder("properties_currency_");
    localStringBuilder.append(getPackModel().getPackPrice().getCurrency());
    localObject = ((Localizer)localObject).getStringOrDefault(localStringBuilder.toString(), getPackModel().getPackPrice().getCurrency());
    return h.a(FrontendMoneyModelFormatter.from(getPackModel().getPackPrice()).getMoneyModelAmountAndCurrency(), getPackModel().getPackPrice().getCurrency(), (String)localObject);
  }
  
  public int getPackCycle()
  {
    CycleInfoModel localCycleInfoModel = this.packModel.getCycleInfo();
    if (localCycleInfoModel != null) {
      return localCycleInfoModel.getCycleCount().intValue();
    }
    return 0;
  }
  
  @NonNull
  public String getPackDeactivationDateForCancel()
  {
    Object localObject = DateTimeFormat.forPattern("EEEE, dd.MM.yyyy ");
    if (getPackModel().getNextPossibleDeactivationDate() != null) {
      localObject = getPackModel().getNextPossibleDeactivationDate().toString(((DateTimeFormatter)localObject).withLocale(Locale.getDefault()));
    } else {
      localObject = "";
    }
    String str = this.localizer.getNonHtmlString(2131690159);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.localizer.getString(2131691618));
    localStringBuilder.append(" ");
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public String getPackDetailTitle()
  {
    Localizer localLocalizer = getLocalizer();
    StringBuilder localStringBuilder = new StringBuilder("productDetail_pageheader_");
    localStringBuilder.append(getPackEscapedPackPathPart());
    return localLocalizer.getStringOrDefault(localStringBuilder.toString(), "");
  }
  
  public String getPackEscapedPackPathPart()
  {
    if ((this.packModel.getBookingInfo() == null) || (this.packModel.getBookingInfo().getAction() == null) || (1.$SwitchMap$de$eplus$mappecc$client$android$common$restclient$model$PackBookingInfoModel$ActionEnum[this.packModel.getBookingInfo().getAction().ordinal()] != 1)) {}
    for (String str = "";; str = "CHANGE_") {
      return getEscapedPackPart(str);
    }
  }
  
  public String getPackFrontName()
  {
    return getPackModel().getFrontendName();
  }
  
  public PackModel getPackModel()
  {
    return this.packModel;
  }
  
  public String getPackName()
  {
    StringBuilder localStringBuilder = new StringBuilder("productName_");
    localStringBuilder.append(getPackEscapedPackPathPart());
    return localStringBuilder.toString();
  }
  
  @NonNull
  public String getPackNameCancelTeaser()
  {
    Object localObject1 = this.localizer;
    Object localObject2 = new StringBuilder("productDetail_detail_CANCEL_");
    ((StringBuilder)localObject2).append(escapeServiceItemCode(getPackModel().getServiceItemCode()));
    localObject2 = ((Localizer)localObject1).getString(((StringBuilder)localObject2).toString());
    localObject1 = localObject2;
    if (h.a((CharSequence)localObject2)) {
      localObject1 = "";
    }
    return (String)localObject1;
  }
  
  @NonNull
  public String getPackNameCancelTeaserHeader()
  {
    Object localObject1 = this.localizer;
    Object localObject2 = new StringBuilder("productDetail_header_CANCEL_");
    ((StringBuilder)localObject2).append(escapeServiceItemCode(getPackModel().getServiceItemCode()));
    localObject2 = ((Localizer)localObject1).getString(((StringBuilder)localObject2).toString());
    localObject1 = localObject2;
    if (h.a((CharSequence)localObject2)) {
      localObject1 = "";
    }
    return (String)localObject1;
  }
  
  @NonNull
  public String getPackNameCancelTitle()
  {
    StringBuilder localStringBuilder = new StringBuilder("productName_CANCEL_");
    localStringBuilder.append(escapeServiceItemCode(getPackModel().getServiceItemCode()));
    return localStringBuilder.toString();
  }
  
  @NonNull
  public String getPackNameForCancel()
  {
    Object localObject1 = this.localizer;
    Object localObject2 = new StringBuilder("productName_CANCEL_");
    ((StringBuilder)localObject2).append(escapeServiceItemCode(getPackModel().getServiceItemCode()));
    ((StringBuilder)localObject2).append("_twoliner");
    localObject2 = ((Localizer)localObject1).getString(((StringBuilder)localObject2).toString());
    localObject1 = localObject2;
    if (h.a((CharSequence)localObject2))
    {
      localObject1 = this.localizer;
      localObject2 = new StringBuilder("productName_");
      ((StringBuilder)localObject2).append(escapeServiceItemCode(getPackModel().getServiceItemCode()));
      localObject2 = ((Localizer)localObject1).getString(((StringBuilder)localObject2).toString());
      localObject1 = localObject2;
      if (h.a((CharSequence)localObject2)) {
        localObject1 = getPackModel().getFrontendName();
      }
    }
    return (String)localObject1;
  }
  
  @NonNull
  public String getPackNameForCancelTeaser()
  {
    Object localObject1 = this.localizer;
    Object localObject2 = new StringBuilder("productTeaser_CANCEL_");
    ((StringBuilder)localObject2).append(escapeServiceItemCode(getPackModel().getServiceItemCode()));
    localObject2 = ((Localizer)localObject1).getString(((StringBuilder)localObject2).toString(), m.a("bundlePrice", getFormattedPackPrice()));
    localObject1 = localObject2;
    if (h.a((CharSequence)localObject2)) {
      localObject1 = "";
    }
    return (String)localObject1;
  }
  
  @NonNull
  public String getPackNameForCancelTeaserHeader()
  {
    Object localObject1 = this.localizer;
    Object localObject2 = new StringBuilder("productTeaser_header_CANCEL_");
    ((StringBuilder)localObject2).append(escapeServiceItemCode(getPackModel().getServiceItemCode()));
    localObject2 = ((Localizer)localObject1).getString(((StringBuilder)localObject2).toString());
    localObject1 = localObject2;
    if (h.a((CharSequence)localObject2)) {
      localObject1 = "";
    }
    return (String)localObject1;
  }
  
  public String getPackNameTwoliner()
  {
    StringBuilder localStringBuilder = new StringBuilder("productName_");
    localStringBuilder.append(getPackEscapedPackPathPart());
    localStringBuilder.append("_twoliner");
    return localStringBuilder.toString();
  }
  
  public FrontendMoneyModel getPackPrice()
  {
    return getPackModel().getPackPrice();
  }
  
  public String getPackTeaser(int paramInt)
  {
    Localizer localLocalizer = getLocalizer();
    StringBuilder localStringBuilder = new StringBuilder("productTeaser_");
    localStringBuilder.append(escapeServiceItemCode(this.packModel.getServiceItemCode()));
    localStringBuilder.append("_");
    localStringBuilder.append(paramInt);
    return localLocalizer.getStringOrDefault(localStringBuilder.toString(), m.a("bundlePrice", getFormattedPackPrice(), "bundleDuration", getBundleDuration()));
  }
  
  public String getPackTeaserForCancel()
  {
    Object localObject1 = this.localizer;
    Object localObject2 = new StringBuilder("productTeaser_CANCEL_");
    ((StringBuilder)localObject2).append(escapeServiceItemCode(getPackModel().getServiceItemCode()));
    localObject2 = ((Localizer)localObject1).getString(((StringBuilder)localObject2).toString(), m.a("bundlePrice", getFormattedPackPrice(), "bundleDuration", getBundleDuration()));
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = this.localizer;
      localObject2 = new StringBuilder("productTeaser_");
      ((StringBuilder)localObject2).append(escapeServiceItemCode(getPackModel().getServiceItemCode()));
      localObject1 = ((Localizer)localObject1).getStringOrDefault(((StringBuilder)localObject2).toString(), m.a("bundlePrice", getFormattedPackPrice(), "bundleDuration", getBundleDuration()));
    }
    return (String)localObject1;
  }
  
  public PaymentMethodEnum getPaymentMethod()
  {
    return getPackModel().getPaymentMethod();
  }
  
  public String getServiceItemCode()
  {
    return StringHelper.escapeServiceItemCode(this.packModel.getServiceItemCode());
  }
  
  public ArrayList<String> getTeaserStringList()
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    String str;
    do
    {
      i += 1;
      str = getPackTeaser(i);
      if (h.b(str)) {
        localArrayList.add(str);
      }
    } while (h.b(str));
    return localArrayList;
  }
  
  public boolean hasCycleInfoType(CycleInfoModel.CycleTypeEnum paramCycleTypeEnum)
  {
    CycleInfoModel localCycleInfoModel = this.packModel.getCycleInfo();
    return (localCycleInfoModel != null) && (paramCycleTypeEnum == localCycleInfoModel.getCycleType());
  }
  
  public boolean hasPackStatus(PackModel.PackStatusEnum paramPackStatusEnum)
  {
    return paramPackStatusEnum == this.packModel.getPackStatus();
  }
  
  public int hashCode()
  {
    Object localObject = getPackModel();
    int j = 43;
    int i;
    if (localObject == null) {
      i = 43;
    } else {
      i = localObject.hashCode();
    }
    localObject = getLocalizer();
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return (i + 59) * 59 + j;
  }
  
  public boolean isNonCancelableFlagged()
  {
    return (!this.packModel.getCancelInfo().isDeletable().booleanValue()) && (!this.packModel.getCancelInfo().isCancelable().booleanValue());
  }
  
  public boolean isPackCancelable()
  {
    return ((hasPackStatus(PackModel.PackStatusEnum.ACTIVE)) || (hasPackStatus(PackModel.PackStatusEnum.GRACE))) && (!hasCycleInfoType(CycleInfoModel.CycleTypeEnum.NONE)) && (!isNonCancelableFlagged());
  }
  
  public void setLocalizer(Localizer paramLocalizer)
  {
    this.localizer = paramLocalizer;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PackDataModel(packModel=");
    localStringBuilder.append(getPackModel());
    localStringBuilder.append(", localizer=");
    localStringBuilder.append(getLocalizer());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/model/PackDataModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
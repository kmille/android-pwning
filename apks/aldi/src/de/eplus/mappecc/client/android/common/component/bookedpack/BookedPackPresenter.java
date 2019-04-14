package de.eplus.mappecc.client.android.common.component.bookedpack;

import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.model.PackViewModel;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.restclient.model.CounterModel;
import de.eplus.mappecc.client.android.common.restclient.model.FrontendMoneyModel;
import de.eplus.mappecc.client.android.common.restclient.model.PackModel;
import de.eplus.mappecc.client.android.common.restclient.model.PackModel.PackStatusEnum;
import de.eplus.mappecc.client.android.common.restclient.model.PaymentMethodEnum;
import de.eplus.mappecc.client.android.common.utils.StringHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BookedPackPresenter
  implements IBookedPackPresenter
{
  private static final String ADDITIONAL_TEXT = "_additionaltext";
  private static final String MODULE_MYTARIFF_FEETEXT = "module_mytariff_feetext";
  private static final String MYTARIFF_PACK = "module_mytariff_pack_";
  private static final String PROPERTIES_CURRENCY = "properties_currency_";
  private static final String TWOLINER = "_twoliner";
  private IB2pView b2pView;
  private IBookedPackView bookedPackView;
  private Box7SubscriptionManager box7SubscriptionManager;
  protected Localizer localizer;
  private PackViewModel packViewModel;
  
  public BookedPackPresenter(BookedPackView paramBookedPackView, PackViewModel paramPackViewModel, Localizer paramLocalizer, Box7SubscriptionManager paramBox7SubscriptionManager, IB2pView paramIB2pView)
  {
    this.bookedPackView = paramBookedPackView;
    this.packViewModel = paramPackViewModel;
    this.localizer = paramLocalizer;
    this.box7SubscriptionManager = paramBox7SubscriptionManager;
    this.b2pView = paramIB2pView;
  }
  
  public void apply()
  {
    loadTitle();
    loadGraceHintText();
    loadCounters();
    loadAdditonalInfos();
    loadPrice();
    loadPaymentMethod();
    loadRuntime();
    loadIcon();
    loadChangePayment();
  }
  
  protected void loadAdditonalInfos()
  {
    IBookedPackView localIBookedPackView = this.bookedPackView;
    String str = this.packViewModel.getAdditionalTextHeader();
    PackViewModel localPackViewModel = this.packViewModel;
    StringBuilder localStringBuilder = new StringBuilder("module_mytariff_pack_");
    localStringBuilder.append(StringHelper.escapeServiceItemCode(this.packViewModel.getPack().getServiceItemCode()));
    localStringBuilder.append("_additionaltext");
    localIBookedPackView.setAdditionalTextView(str, localPackViewModel.getPackAdditionalText(localStringBuilder.toString()));
  }
  
  protected void loadChangePayment()
  {
    Object localObject = this.localizer;
    boolean bool = false;
    if (((Localizer)localObject).getBoolean(2131691314, false))
    {
      localObject = this.bookedPackView;
      bool = true;
    }
    for (;;)
    {
      ((IBookedPackView)localObject).setChangePayment(bool);
      return;
      localObject = this.bookedPackView;
    }
  }
  
  public void loadCounters()
  {
    int i = 0;
    while (i < this.packViewModel.getCounters().size())
    {
      CounterModel localCounterModel = (CounterModel)this.packViewModel.getCounters().get(i);
      if (localCounterModel.getPack().getPackStatus() != PackModel.PackStatusEnum.GRACE) {
        this.bookedPackView.addCounterView(this.packViewModel.getTimeStamp(), localCounterModel, this.packViewModel.getCurrentBandwidthInfoModel(), this.box7SubscriptionManager, this.b2pView);
      } else {
        this.bookedPackView.setGraceStatus(this.packViewModel.getPackGraceStatusHint());
      }
      i += 1;
    }
  }
  
  protected void loadGraceHintText()
  {
    this.bookedPackView.setGraceStatus(this.packViewModel.getGraceStatusHint());
  }
  
  protected void loadIcon()
  {
    String str = StringHelper.escapeServiceItemCode(this.packViewModel.getPack().getServiceItemCode());
    if (str == null) {
      return;
    }
    this.bookedPackView.setImageView(this.packViewModel.getIconValue("productIcon_".concat(String.valueOf(str))));
  }
  
  protected void loadPaymentMethod()
  {
    Object localObject = this.packViewModel.getPack().getPaymentMethod();
    if (localObject != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("paymentMethod", this.localizer.getString(((PaymentMethodEnum)localObject).getMoeKey()));
      localObject = this.localizer.getString(2131691681, localHashMap);
    }
    else
    {
      localObject = "";
    }
    this.bookedPackView.setPaymentMethod((String)localObject);
  }
  
  protected void loadPrice()
  {
    IBookedPackView localIBookedPackView = this.bookedPackView;
    String str = this.packViewModel.getPriceHeader();
    PackViewModel localPackViewModel = this.packViewModel;
    StringBuilder localStringBuilder = new StringBuilder("properties_currency_");
    localStringBuilder.append(this.packViewModel.getPack().getPackPrice().getCurrency());
    localIBookedPackView.setPriceTextView(str, localPackViewModel.getPriceValue("module_mytariff_feetext", localStringBuilder.toString()));
  }
  
  protected void loadRuntime()
  {
    String str1 = this.packViewModel.getPackDurationHeadline();
    String str2 = this.packViewModel.getPackCancelHeadline();
    String str3 = this.packViewModel.getPackDeactivationDateForMyTariff();
    String str4 = this.localizer.getNonHtmlString(2131690159);
    if (1.$SwitchMap$de$eplus$mappecc$client$android$common$restclient$model$PackModel$PackStatusEnum[this.packViewModel.getPackStatus().ordinal()] != 1)
    {
      this.bookedPackView.setPackRuntimeTextView(str1, str3, str4);
      setCancelText(false);
      return;
    }
    this.bookedPackView.setPackRuntimeTextView(str2, str3, str4);
    setCancelText(true);
  }
  
  protected void loadTitle()
  {
    IBookedPackView localIBookedPackView = this.bookedPackView;
    PackViewModel localPackViewModel = this.packViewModel;
    StringBuilder localStringBuilder1 = new StringBuilder("productName_");
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(this.packViewModel.getPack().getServiceItemCode());
    localStringBuilder2.append("_twoliner");
    localStringBuilder1.append(StringHelper.escapeServiceItemCode(localStringBuilder2.toString()));
    localIBookedPackView.setPackDetailTitleTextView(localPackViewModel.getFrontendName(localStringBuilder1.toString()));
  }
  
  public void onClickChangePayment()
  {
    this.bookedPackView.goToDirectDebitPaymentChoice(this.packViewModel.getPack());
  }
  
  public void setB2pView(IB2pView paramIB2pView)
  {
    this.b2pView = paramIB2pView;
  }
  
  public void setBookedPackView(IBookedPackView paramIBookedPackView)
  {
    this.bookedPackView = paramIBookedPackView;
  }
  
  public void setBox7SubscriptionManager(Box7SubscriptionManager paramBox7SubscriptionManager)
  {
    this.box7SubscriptionManager = paramBox7SubscriptionManager;
  }
  
  protected void setCancelText(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.bookedPackView.setCancelTextRed();
      return;
    }
    this.bookedPackView.setCancelTextNotRed();
  }
  
  public void setPackViewModel(PackViewModel paramPackViewModel)
  {
    this.packViewModel = paramPackViewModel;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/bookedpack/BookedPackPresenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package de.eplus.mappecc.client.android.common.component.bookedpack;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.a.a;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import de.eplus.mappecc.client.android.common.model.PackViewModel;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.restclient.model.CounterModel;
import de.eplus.mappecc.client.android.common.restclient.model.CurrentBandwidthInfoModel;
import de.eplus.mappecc.client.android.common.restclient.model.PackModel;
import de.eplus.mappecc.client.android.common.utils.StringHelper;
import de.eplus.mappecc.client.android.common.utils.UiUtils;
import de.eplus.mappecc.client.android.feature.customer.history.CounterPackView;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.DirectDebitPaymentChoiceActivity;
import de.eplus.mappecc.client.android.feature.homescreen.counterview.CounterViewModel;
import javax.inject.Inject;
import org.apache.a.c.h;

public class BookedPackView
  extends LinearLayout
  implements IBookedPackView
{
  private TextView additionalTextHeaderTextView;
  private LinearLayout additionalTextLinearLayout;
  private TextView additionalTextTextView;
  private IBookedPackPresenter bookedPackPresenter;
  private LinearLayout changePaymentLinearLayout;
  private LinearLayout countersLinearLayout;
  private TextView graceStatusTextView;
  @Inject
  Localizer localizer;
  private ImageView moeImageView;
  private TextView packDetailTitleTextView;
  private TextView paymentMethodTextView;
  private TextView priceHeaderTextView;
  private TextView priceValueTextView;
  private TextView runtimeHeaderTextView;
  private TextView runtimeValueMezTextView;
  private TextView runtimeValueTextView;
  @Inject
  UiUtils uiUtils;
  
  public BookedPackView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public BookedPackView(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public BookedPackView(Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  @RequiresApi(api=21)
  public BookedPackView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init();
  }
  
  private void init()
  {
    inflate(getContext(), 2131427460, this);
    B2PApplication.component.inject(this);
    initViews(this);
    initClickListeners();
  }
  
  private void initClickListeners()
  {
    this.changePaymentLinearLayout.setOnClickListener(new -..Lambda.BookedPackView.vVIU_4T6Pysd07D_AjCcaG-Bwbc(this));
  }
  
  private void initViews(@NonNull View paramView)
  {
    this.packDetailTitleTextView = ((TextView)paramView.findViewById(2131231381));
    this.graceStatusTextView = ((TextView)paramView.findViewById(2131231380));
    this.additionalTextLinearLayout = ((LinearLayout)paramView.findViewById(2131231073));
    this.additionalTextHeaderTextView = ((TextView)paramView.findViewById(2131231373));
    this.additionalTextTextView = ((TextView)paramView.findViewById(2131231372));
    this.priceHeaderTextView = ((TextView)paramView.findViewById(2131231375));
    this.priceValueTextView = ((TextView)paramView.findViewById(2131231374));
    this.runtimeHeaderTextView = ((TextView)paramView.findViewById(2131231378));
    this.runtimeValueTextView = ((TextView)paramView.findViewById(2131231377));
    this.runtimeValueMezTextView = ((TextView)paramView.findViewById(2131231376));
    this.paymentMethodTextView = ((TextView)paramView.findViewById(2131231392));
    this.countersLinearLayout = ((LinearLayout)paramView.findViewById(2131231050));
    this.changePaymentLinearLayout = ((LinearLayout)paramView.findViewById(2131231075));
    this.moeImageView = ((ImageView)paramView.findViewById(2131231104));
  }
  
  public void addCounterView(String paramString, CounterModel paramCounterModel, CurrentBandwidthInfoModel paramCurrentBandwidthInfoModel, Box7SubscriptionManager paramBox7SubscriptionManager, IB2pView paramIB2pView)
  {
    paramBox7SubscriptionManager = new CounterPackView(getContext());
    CounterViewModel localCounterViewModel = new CounterViewModel();
    localCounterViewModel.setTimeStamp(paramString);
    localCounterViewModel.setCounterModel(paramCounterModel);
    localCounterViewModel.setCurrentBandwidthInfoModel(paramCurrentBandwidthInfoModel);
    paramBox7SubscriptionManager.apply(localCounterViewModel, paramIB2pView);
    this.countersLinearLayout.addView(paramBox7SubscriptionManager);
  }
  
  public void apply(PackViewModel paramPackViewModel, Box7SubscriptionManager paramBox7SubscriptionManager, IB2pView paramIB2pView)
  {
    this.bookedPackPresenter = new BookedPackPresenter(this, paramPackViewModel, this.localizer, paramBox7SubscriptionManager, paramIB2pView);
    this.bookedPackPresenter.apply();
  }
  
  public void goToDirectDebitPaymentChoice(@NonNull PackModel paramPackModel)
  {
    a.b("entered...", new Object[0]);
    Intent localIntent = new Intent(getContext(), DirectDebitPaymentChoiceActivity.class);
    localIntent.putExtra("EXTRA_SELECTED_PACKMODEL", paramPackModel);
    localIntent.putExtra("EXTRA_FROM_HOMESCREEN", true);
    getContext().startActivity(localIntent);
  }
  
  public void setAdditionalTextView(String paramString1, String paramString2)
  {
    if ((h.a(paramString2)) && (h.a(paramString1)))
    {
      this.additionalTextLinearLayout.setVisibility(8);
      return;
    }
    if (h.a(paramString2))
    {
      this.additionalTextTextView.setVisibility(8);
      this.additionalTextHeaderTextView.setText(paramString1);
      return;
    }
    if (h.a(paramString1))
    {
      this.additionalTextHeaderTextView.setVisibility(8);
      this.additionalTextTextView.setText(StringHelper.fromHtml(paramString2));
      return;
    }
    this.additionalTextHeaderTextView.setText(paramString1);
    this.additionalTextTextView.setText(StringHelper.fromHtml(paramString2));
  }
  
  public void setCancelTextNotRed()
  {
    this.runtimeHeaderTextView.setTextColor(getResources().getColor(2131034289));
  }
  
  public void setCancelTextRed()
  {
    this.runtimeHeaderTextView.setTextColor(getResources().getColor(2131034285));
  }
  
  public void setChangePayment(boolean paramBoolean)
  {
    LinearLayout localLinearLayout = this.changePaymentLinearLayout;
    int i;
    if (paramBoolean) {
      i = 0;
    } else {
      i = 8;
    }
    localLinearLayout.setVisibility(i);
  }
  
  public void setGraceStatus(String paramString)
  {
    this.graceStatusTextView.setText(paramString);
    TextView localTextView = this.graceStatusTextView;
    int i;
    if (TextUtils.isEmpty(paramString)) {
      i = 8;
    } else {
      i = 0;
    }
    localTextView.setVisibility(i);
  }
  
  public void setImageView(String paramString)
  {
    this.uiUtils.renderMoeImage(this.moeImageView, paramString);
  }
  
  public void setPackDetailTitleTextView(String paramString)
  {
    this.packDetailTitleTextView.setText(paramString);
  }
  
  public void setPackRuntimeTextView(String paramString1, String paramString2, String paramString3)
  {
    if (h.c(paramString2))
    {
      this.runtimeValueTextView.setVisibility(8);
      return;
    }
    this.runtimeValueTextView.setText(paramString2);
    this.runtimeHeaderTextView.setText(paramString1);
    this.runtimeValueMezTextView.setText(paramString3);
  }
  
  public void setPaymentMethod(String paramString)
  {
    this.paymentMethodTextView.setText(paramString);
    TextView localTextView = this.paymentMethodTextView;
    int i;
    if (TextUtils.isEmpty(paramString)) {
      i = 8;
    } else {
      i = 0;
    }
    localTextView.setVisibility(i);
  }
  
  public void setPriceTextView(String paramString1, String paramString2)
  {
    this.priceHeaderTextView.setText(paramString1);
    paramString1 = this.priceValueTextView;
    int i;
    if (h.a(paramString2)) {
      i = 8;
    } else {
      i = 0;
    }
    paramString1.setVisibility(i);
    this.priceValueTextView.setText(paramString2);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/bookedpack/BookedPackView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
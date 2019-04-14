package de.eplus.mappecc.client.android.common.component.bankdetail;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import javax.inject.Inject;

public class BankDetailsView
  extends CardView
  implements IBankDetailsView
{
  private Unbinder binder;
  @BindView
  TextView changeBtn;
  @BindView
  TextView customerNameText;
  @BindView
  TextView ibanBankNameText;
  @Inject
  Localizer localizer;
  private BankDetailsPresenter presenter;
  
  public BankDetailsView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public BankDetailsView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public BankDetailsView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    inflate(paramContext, 2131427430, this);
    B2PApplication.component.inject(this);
    if (Build.VERSION.SDK_INT < 21) {
      setCardElevation(0.0F);
    }
  }
  
  public void apply(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    this.binder = ButterKnife.a(this);
    this.presenter = new BankDetailsPresenter(this, this.localizer);
    this.presenter.apply(paramString1, paramString2, paramString3, paramBoolean);
  }
  
  @OnClick
  public void onClickChangeButton()
  {
    this.presenter.onClickChangeButton();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.binder != null) {
      this.binder.unbind();
    }
  }
  
  public void setButtonVisibility(boolean paramBoolean)
  {
    TextView localTextView = this.changeBtn;
    int i;
    if (paramBoolean) {
      i = 0;
    } else {
      i = 4;
    }
    localTextView.setVisibility(i);
  }
  
  public void setChangeBtnText(String paramString)
  {
    this.changeBtn.setText(paramString);
  }
  
  public void setCustomerName(String paramString)
  {
    this.customerNameText.setText(paramString);
  }
  
  public void setIbanBankName(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append("\n");
    localStringBuilder.append(paramString2);
    paramString1 = localStringBuilder.toString();
    this.ibanBankNameText.setText(paramString1);
  }
  
  public void setIbanBankNameVisibility(boolean paramBoolean)
  {
    TextView localTextView = this.ibanBankNameText;
    int i;
    if (paramBoolean) {
      i = 0;
    } else {
      i = 8;
    }
    localTextView.setVisibility(i);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/bankdetail/BankDetailsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
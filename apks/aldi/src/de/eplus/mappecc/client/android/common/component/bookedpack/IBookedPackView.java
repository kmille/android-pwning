package de.eplus.mappecc.client.android.common.component.bookedpack;

import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.restclient.model.CounterModel;
import de.eplus.mappecc.client.android.common.restclient.model.CurrentBandwidthInfoModel;
import de.eplus.mappecc.client.android.common.restclient.model.PackModel;

public abstract interface IBookedPackView
{
  public abstract void addCounterView(String paramString, CounterModel paramCounterModel, CurrentBandwidthInfoModel paramCurrentBandwidthInfoModel, Box7SubscriptionManager paramBox7SubscriptionManager, IB2pView paramIB2pView);
  
  public abstract void goToDirectDebitPaymentChoice(PackModel paramPackModel);
  
  public abstract void setAdditionalTextView(String paramString1, String paramString2);
  
  public abstract void setCancelTextNotRed();
  
  public abstract void setCancelTextRed();
  
  public abstract void setChangePayment(boolean paramBoolean);
  
  public abstract void setGraceStatus(String paramString);
  
  public abstract void setImageView(String paramString);
  
  public abstract void setPackDetailTitleTextView(String paramString);
  
  public abstract void setPackRuntimeTextView(String paramString1, String paramString2, String paramString3);
  
  public abstract void setPaymentMethod(String paramString);
  
  public abstract void setPriceTextView(String paramString1, String paramString2);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/bookedpack/IBookedPackView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
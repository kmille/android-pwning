package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.InvoiceOverviewModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupConfigurationModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupPackBookingOptions;
import de.eplus.mappecc.client.android.feature.customer.invoice.downloadbill.IDownloadFileCallback;

public abstract interface IInvoiceOverviewModelRepository
{
  public abstract void get(@NonNull Box7Callback<InvoiceOverviewModel> paramBox7Callback);
  
  public abstract void getInvoiceCreateState(@NonNull Box7Callback<PrepaidTopupConfigurationModel> paramBox7Callback);
  
  public abstract void getPdfBill(@NonNull String paramString, IDownloadFileCallback paramIDownloadFileCallback);
  
  public abstract void saveInvoiceCreateState(@NonNull PrepaidTopupPackBookingOptions paramPrepaidTopupPackBookingOptions, @NonNull Box7Callback<EmptyModel> paramBox7Callback);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/IInvoiceOverviewModelRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
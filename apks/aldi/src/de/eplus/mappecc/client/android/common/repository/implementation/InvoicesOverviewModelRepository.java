package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.repository.NetworkCacheStorageManager;
import de.eplus.mappecc.client.android.common.restclient.api.BillingsApi;
import de.eplus.mappecc.client.android.common.restclient.model.BillingDocumentPartModel.BillDocTypeEnum;
import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.InvoiceOverviewModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupConfigurationModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupPackBookingOptions;
import de.eplus.mappecc.client.android.feature.customer.invoice.downloadbill.IDownloadFileCallback;
import de.eplus.mappecc.client.android.feature.customer.invoice.downloadbill.RetrofitFileSaveAsyncTask;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InvoicesOverviewModelRepository
  implements IInvoiceOverviewModelRepository
{
  private final BillingsApi billingsApi;
  private final Box7Cache box7Cache;
  
  public InvoicesOverviewModelRepository(@NonNull BillingsApi paramBillingsApi, @NonNull Box7Cache paramBox7Cache)
  {
    this.billingsApi = paramBillingsApi;
    this.box7Cache = paramBox7Cache;
  }
  
  public void get(@NonNull Box7Callback<InvoiceOverviewModel> paramBox7Callback)
  {
    new NetworkCacheStorageManager(paramBox7Callback)
    {
      public void createCall(@NonNull Box7Callback<InvoiceOverviewModel> paramAnonymousBox7Callback)
      {
        InvoicesOverviewModelRepository.this.billingsApi.getInvoicesWithBrandForSubscriptionRx("alditalk", InvoicesOverviewModelRepository.this.box7Cache.getSubscriptionId()).enqueue(new Box7CallbackWrapper(paramAnonymousBox7Callback));
      }
    };
  }
  
  public void getInvoiceCreateState(@NonNull Box7Callback<PrepaidTopupConfigurationModel> paramBox7Callback)
  {
    new NetworkCacheStorageManager(paramBox7Callback)
    {
      public void createCall(@NonNull Box7Callback<PrepaidTopupConfigurationModel> paramAnonymousBox7Callback)
      {
        InvoicesOverviewModelRepository.this.billingsApi.getTopupConfigurationTypeWithBrand("alditalk", InvoicesOverviewModelRepository.this.box7Cache.getSubscriptionId()).enqueue(new Box7CallbackWrapper(paramAnonymousBox7Callback));
      }
    };
  }
  
  public void getPdfBill(@NonNull final String paramString, final IDownloadFileCallback paramIDownloadFileCallback)
  {
    this.billingsApi.getBillingDocumentPartWithBrandForSubscription("alditalk", this.box7Cache.getSubscriptionId(), paramString, BillingDocumentPartModel.BillDocTypeEnum.BILL_PDF.toString()).enqueue(new Callback()
    {
      public void onFailure(Call<ResponseBody> paramAnonymousCall, Throwable paramAnonymousThrowable)
      {
        paramIDownloadFileCallback.onDownloadFailed();
      }
      
      public void onResponse(Call<ResponseBody> paramAnonymousCall, Response<ResponseBody> paramAnonymousResponse)
      {
        new RetrofitFileSaveAsyncTask(paramIDownloadFileCallback, paramString).execute(new Response[] { paramAnonymousResponse });
      }
    });
  }
  
  public void saveInvoiceCreateState(@NonNull PrepaidTopupPackBookingOptions paramPrepaidTopupPackBookingOptions, @NonNull Box7Callback<EmptyModel> paramBox7Callback)
  {
    this.billingsApi.updateTopupConfigurationOptions("alditalk", this.box7Cache.getSubscriptionId(), paramPrepaidTopupPackBookingOptions).enqueue(new Box7CallbackWrapper(paramBox7Callback));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/InvoicesOverviewModelRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
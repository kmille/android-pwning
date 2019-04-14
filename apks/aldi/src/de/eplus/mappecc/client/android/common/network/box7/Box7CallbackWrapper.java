package de.eplus.mappecc.client.android.common.network.box7;

import android.support.annotation.NonNull;
import c.a.a;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.eplus.mappecc.client.android.common.restclient.model.ErrorModel;
import de.eplus.mappecc.client.android.common.utils.DateUtils;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import de.eplus.mappecc.client.android.feature.rating.rule.implementation.BackendCallSuccessfulRatingShowingRule;
import java.io.IOException;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.apache.a.b.b;
import org.apache.a.c.h;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Box7CallbackWrapper<T>
  implements Callback<T>
{
  private final IBox7ManagerCallback<T> box7Callback;
  private Request request;
  private Response<T> response;
  
  public Box7CallbackWrapper(IBox7ManagerCallback<T> paramIBox7ManagerCallback)
  {
    this.box7Callback = paramIBox7ManagerCallback;
  }
  
  private ErrorModel getErrorModel(@NonNull Response<T> paramResponse)
  {
    if ((paramResponse != null) && (paramResponse.errorBody() != null)) {
      try
      {
        paramResponse = b.a(paramResponse.errorBody().charStream());
        if (h.b(paramResponse))
        {
          paramResponse = (ErrorModel)new GsonBuilder().create().fromJson(paramResponse, ErrorModel.class);
          return paramResponse;
        }
      }
      catch (IOException paramResponse)
      {
        a.b(paramResponse);
      }
    }
    return null;
  }
  
  private boolean handleSpecialResponseCodes(Response<T> paramResponse)
  {
    StringBuilder localStringBuilder = new StringBuilder("entered... responseCode: ");
    localStringBuilder.append(paramResponse.code());
    a.b(localStringBuilder.toString(), new Object[0]);
    if (paramResponse.code() == 401)
    {
      this.box7Callback.onBox7Result(Box7Result.BOX7_UNAUTHORIZED(), null);
      return true;
    }
    if (paramResponse.code() == 403)
    {
      this.box7Callback.onBox7Result(Box7Result.BOX7_FORBIDDEN(), null);
      return true;
    }
    if ((paramResponse.code() != 510) && (paramResponse.code() != 503))
    {
      if ((paramResponse.code() > 400) && (paramResponse.code() != 404) && (paramResponse.code() != 403))
      {
        this.box7Callback.onBox7Result(Box7Result.BOX7_SERVER_ERROR().withErrorCode(paramResponse.code()).withErrorModel(getErrorModel(paramResponse)), null);
        return true;
      }
      return false;
    }
    this.box7Callback.onBox7Result(Box7Result.BOX7_MAINTENANCE_MODE(), null);
    return true;
  }
  
  @NonNull
  public BackendCallSuccessfulRatingShowingRule getBackendCallSuccessfulRatingShowingRule()
  {
    return new BackendCallSuccessfulRatingShowingRule();
  }
  
  protected void onBackendCall(Response<T> paramResponse)
  {
    if (paramResponse != null)
    {
      getBackendCallSuccessfulRatingShowingRule().handleBackendStatusCode(paramResponse.code());
      return;
    }
    onBackendCallFailure();
  }
  
  protected void onBackendCallFailure()
  {
    getBackendCallSuccessfulRatingShowingRule().onBackendCallFailure();
  }
  
  public void onFailure(@NonNull Call paramCall, @NonNull Throwable paramThrowable)
  {
    a.b("entered...", new Object[0]);
    onBackendCallFailure();
    if (NetworkUtils.isNetworkError(paramThrowable))
    {
      paramThrowable = this.box7Callback;
      paramCall = Box7Result.BOX7_FAILURE();
    }
    for (int i = -2;; i = -1)
    {
      paramThrowable.onBox7Result(paramCall.withErrorCode(i), null);
      return;
      paramThrowable = this.box7Callback;
      paramCall = Box7Result.BOX7_FAILURE();
    }
  }
  
  public void onResponse(@NonNull Call<T> paramCall, @NonNull Response<T> paramResponse)
  {
    Object localObject = new StringBuilder("onResponse() entered... code: ");
    ((StringBuilder)localObject).append(paramResponse.code());
    a.b(((StringBuilder)localObject).toString(), new Object[0]);
    this.response = paramResponse;
    this.request = paramCall.request();
    paramCall = DateUtils.getTimeStamp(paramResponse);
    onBackendCall(paramResponse);
    if (handleSpecialResponseCodes(paramResponse)) {
      return;
    }
    if ((paramResponse.code() == 200) && (paramResponse.body() != null))
    {
      onSuccess(paramResponse.body(), paramCall, getErrorModel(paramResponse));
      return;
    }
    localObject = getErrorModel(paramResponse);
    this.box7Callback.onBox7Result(Box7Result.BOX7_NON_FATAL_FAILURE().withResponse(this.response).withRequest(this.request).withTimeStamp(paramCall).withErrorCode(paramResponse.code()).withErrorModel((ErrorModel)localObject), null);
  }
  
  protected void onSuccess(T paramT, String paramString, ErrorModel paramErrorModel)
  {
    this.box7Callback.onBox7Result(Box7Result.BOX7_SUCCESS().withResponse(this.response).withRequest(this.request).withTimeStamp(paramString).withErrorModel(paramErrorModel), paramT);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/Box7CallbackWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
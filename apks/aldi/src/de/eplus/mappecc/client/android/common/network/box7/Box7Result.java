package de.eplus.mappecc.client.android.common.network.box7;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.restclient.model.ErrorModel;
import okhttp3.Request;
import retrofit2.Response;

public class Box7Result<T>
{
  private static final int BOX7_FAILURE = -1;
  private static final int BOX7_FORBIDDEN = 6;
  private static final int BOX7_MAINTENANCE_MODE = 2;
  private static final int BOX7_NON_FATAL_FAILURE = 1;
  private static final int BOX7_SERVER_ERROR = 4;
  private static final int BOX7_SUCCESS = 0;
  private static final int BOX7_UNAUTHORIZED = 3;
  private int errorCode;
  private ErrorModel errorModel;
  private boolean isFromCacheOrDiveStorage = false;
  private Request request;
  private Response<T> response;
  private String timeStamp;
  @NonNull
  private final int type;
  
  private Box7Result(int paramInt)
  {
    this.type = paramInt;
  }
  
  @NonNull
  public static Box7Result BOX7_FAILURE()
  {
    return new Box7Result(-1);
  }
  
  @NonNull
  public static Box7Result BOX7_FORBIDDEN()
  {
    return new Box7Result(6);
  }
  
  @NonNull
  public static Box7Result BOX7_MAINTENANCE_MODE()
  {
    return new Box7Result(2);
  }
  
  @NonNull
  public static Box7Result BOX7_NON_FATAL_FAILURE()
  {
    return new Box7Result(1);
  }
  
  @NonNull
  public static Box7Result BOX7_SERVER_ERROR()
  {
    return new Box7Result(4);
  }
  
  @NonNull
  public static Box7Result BOX7_SUCCESS()
  {
    return new Box7Result(0);
  }
  
  @NonNull
  public static Box7Result BOX7_UNAUTHORIZED()
  {
    return new Box7Result(3);
  }
  
  public int getErrorCode()
  {
    return this.errorCode;
  }
  
  public ErrorModel getErrorModel()
  {
    return this.errorModel;
  }
  
  public Response<T> getResponse()
  {
    return this.response;
  }
  
  public String getTimeStamp()
  {
    return this.timeStamp;
  }
  
  public boolean isFailure()
  {
    return this.type == -1;
  }
  
  public boolean isFailureWithNoInternet()
  {
    return (this.type == -1) && (this.errorCode == -2);
  }
  
  public boolean isForbidden()
  {
    return this.type == 6;
  }
  
  public boolean isFromCacheOrDiveStorage()
  {
    return this.isFromCacheOrDiveStorage;
  }
  
  public boolean isMaintenanceMode()
  {
    return this.type == 2;
  }
  
  public boolean isNonFatalFailure()
  {
    return this.type == 1;
  }
  
  public boolean isServerError()
  {
    return this.type == 4;
  }
  
  public boolean isSuccess()
  {
    return this.type == 0;
  }
  
  public boolean isUnauthorized()
  {
    return this.type == 3;
  }
  
  public Box7Result<T> setIsFromCacheOrDiveStorage()
  {
    this.isFromCacheOrDiveStorage = true;
    return this;
  }
  
  public Box7Result<T> withErrorCode(int paramInt)
  {
    this.errorCode = paramInt;
    return this;
  }
  
  public Box7Result<T> withErrorModel(ErrorModel paramErrorModel)
  {
    this.errorModel = paramErrorModel;
    return this;
  }
  
  public Box7Result<T> withRequest(Request paramRequest)
  {
    this.request = paramRequest;
    return this;
  }
  
  public Box7Result<T> withResponse(Response<T> paramResponse)
  {
    this.response = paramResponse;
    return this;
  }
  
  public Box7Result<T> withTimeStamp(String paramString)
  {
    this.timeStamp = paramString;
    return this;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/Box7Result.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package de.eplus.mappecc.client.android.common.network.box7.performance;

import android.support.annotation.NonNull;
import c.a.a;
import com.google.common.collect.o;
import de.eplus.mappecc.client.android.common.network.box7.model.Box7ClientConfig;
import de.eplus.mappecc.client.android.common.restclient.api.PerformanceTimingsApi;
import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.PerformanceTimingModel;
import de.eplus.mappecc.client.android.common.restclient.model.PerformanceTimingModel.OsTypeEnum;
import de.eplus.mappecc.client.android.common.restclient.model.ResourceTimingModel;
import de.eplus.mappecc.client.android.common.restclient.model.UserTimingModel;
import de.eplus.mappecc.client.android.common.restclient.model.UserTimingModel.ConnectionTypeEnum;
import de.eplus.mappecc.client.android.common.restclient.monitoring.MonitoringHandler;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.apache.a.c.h;
import org.joda.time.DateTime;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Singleton
public class PerformanceTimingManagerSplunk
  implements IPerformanceTimingManager
{
  private static final MonitoringHandler handler = ;
  private UserTimingModel currentUserTimingModel;
  private final NetworkUtils networkUtils;
  private final PerformanceTimingsApi performanceTimingsApi;
  
  @Inject
  public PerformanceTimingManagerSplunk(PerformanceTimingsApi paramPerformanceTimingsApi, NetworkUtils paramNetworkUtils)
  {
    this.performanceTimingsApi = paramPerformanceTimingsApi;
    this.networkUtils = paramNetworkUtils;
  }
  
  public static MonitoringHandler getHandler()
  {
    return handler;
  }
  
  private int getStatus()
  {
    Object localObject = handler.getResourceTimingModels();
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      localObject = handler.getResourceTimingModels();
      if ((localObject instanceof List))
      {
        localObject = (List)localObject;
        if (!((List)localObject).isEmpty()) {
          localObject = ((List)localObject).get(((List)localObject).size() - 1);
        } else {
          throw new NoSuchElementException();
        }
      }
      else
      {
        localObject = o.a(((Iterable)localObject).iterator());
      }
      localObject = (ResourceTimingModel)localObject;
      if (localObject != null) {
        return ((ResourceTimingModel)localObject).getStatus().intValue();
      }
      return 200;
    }
    return 444;
  }
  
  private String getTransactionId()
  {
    return UUID.randomUUID().toString().replace("-", "");
  }
  
  private static MonitoringHandler initHandler()
  {
    Box7ClientConfig localBox7ClientConfig = Box7ClientConfig.fromBuildConfig();
    MonitoringHandler localMonitoringHandler = new MonitoringHandler();
    String str = localBox7ClientConfig.getBuildModel().replace("(", "").replace(")", "").replace(";", "|");
    if (str == null) {
      str = null;
    } else {
      str = str.trim();
    }
    str = h.b(str);
    PerformanceTimingModel localPerformanceTimingModel = localMonitoringHandler.getPerformanceTimingModel();
    localPerformanceTimingModel.setClient(localBox7ClientConfig.getClientId());
    localPerformanceTimingModel.setClientVersion(localBox7ClientConfig.getClientVersion());
    localPerformanceTimingModel.setOsType(PerformanceTimingModel.OsTypeEnum.ANDROID);
    localPerformanceTimingModel.setOsVersion(str);
    localMonitoringHandler.setPerformanceTimingModel(localPerformanceTimingModel);
    return localMonitoringHandler;
  }
  
  public void finish(int paramInt)
  {
    if (this.currentUserTimingModel != null)
    {
      if (handler == null) {
        return;
      }
      this.currentUserTimingModel.setFinishedAt(DateTime.now());
      handler.addUserTimingModel(this.currentUserTimingModel);
      ((UserTimingModel)handler.getUserTimingModels().get(0)).setStatus(Integer.valueOf(paramInt));
      StringBuilder localStringBuilder = new StringBuilder("finish(");
      localStringBuilder.append(paramInt);
      localStringBuilder.append("): ");
      localStringBuilder.append(this.currentUserTimingModel.toString());
      a.b(localStringBuilder.toString(), new Object[0]);
      this.performanceTimingsApi.createPerformanceTimings("alditalk", handler.getPerformanceTimingModel()).enqueue(new Callback()
      {
        public void onFailure(@NonNull Call<EmptyModel> paramAnonymousCall, @NonNull Throwable paramAnonymousThrowable)
        {
          a.b("Splunk: finish FAILURE", new Object[0]);
        }
        
        public void onResponse(@NonNull Call<EmptyModel> paramAnonymousCall, @NonNull Response<EmptyModel> paramAnonymousResponse)
        {
          a.b("Splunk: finish Done", new Object[0]);
        }
      });
      this.currentUserTimingModel = null;
    }
  }
  
  public void finishUserInteraction()
  {
    if (this.currentUserTimingModel != null)
    {
      if (handler == null) {
        return;
      }
      this.currentUserTimingModel.setFinishedAt(DateTime.now());
      handler.addUserTimingModel(this.currentUserTimingModel);
      ((UserTimingModel)handler.getUserTimingModels().get(0)).setStatus(Integer.valueOf(getStatus()));
      StringBuilder localStringBuilder = new StringBuilder("finishUserInteraction: ");
      localStringBuilder.append(this.currentUserTimingModel.toString());
      a.b(localStringBuilder.toString(), new Object[0]);
      this.performanceTimingsApi.createPerformanceTimings("alditalk", handler.getPerformanceTimingModel()).enqueue(new Callback()
      {
        public void onFailure(@NonNull Call<EmptyModel> paramAnonymousCall, @NonNull Throwable paramAnonymousThrowable)
        {
          a.b("Splunk: finishUserInteraction Failure", new Object[0]);
        }
        
        public void onResponse(@NonNull Call<EmptyModel> paramAnonymousCall, @NonNull Response<EmptyModel> paramAnonymousResponse)
        {
          a.b("Splunk: finishUserInteraction Done", new Object[0]);
        }
      });
      a.b(handler.getPerformanceTimingModel().toString(), new Object[0]);
      this.currentUserTimingModel = null;
    }
  }
  
  public UserTimingModel getCurrentUserTimingModel()
  {
    return this.currentUserTimingModel;
  }
  
  public void startUserInteraction(@NonNull PerformanceTimingFlow paramPerformanceTimingFlow)
  {
    Object localObject = new StringBuilder("startUserInteraction: ");
    ((StringBuilder)localObject).append(paramPerformanceTimingFlow.toString());
    a.b(((StringBuilder)localObject).toString(), new Object[0]);
    localObject = getTransactionId();
    UserTimingModel.ConnectionTypeEnum localConnectionTypeEnum = this.networkUtils.getConnectionType();
    handler.getPerformanceTimingModel().getResourceTimings().clear();
    handler.getPerformanceTimingModel().getUserTimings().clear();
    handler.setUuid((String)localObject);
    handler.setConnectionTypeEnum(localConnectionTypeEnum);
    this.currentUserTimingModel = new UserTimingModel();
    this.currentUserTimingModel.setConnectionType(localConnectionTypeEnum);
    this.currentUserTimingModel.setStartedAt(DateTime.now());
    this.currentUserTimingModel.setName(paramPerformanceTimingFlow.getPerformanceTimingKey().getName());
    this.currentUserTimingModel.setProperties(paramPerformanceTimingFlow.getPropertyMap());
    this.currentUserTimingModel.setTransactionId((String)localObject);
  }
  
  public void startUserInteraction(@NonNull PerformanceTimingKey paramPerformanceTimingKey)
  {
    startUserInteraction(new PerformanceTimingFlow(paramPerformanceTimingKey));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/performance/PerformanceTimingManagerSplunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
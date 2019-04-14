package de.eplus.mappecc.client.android.common.network.moe.core;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import de.a.a.b;
import de.a.a.c;
import de.eplus.mappecc.client.android.common.network.moe.IMoeUpdateCallback;
import de.eplus.mappecc.client.android.common.network.moe.IMoeUpdateCallback.MoeUpdateResult;
import de.eplus.mappecc.client.android.common.network.moe.ImageManager;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManager;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.network.moe.LocalizerBatchOperation;
import de.eplus.mappecc.client.android.common.network.moe.model.MoeResourceUpdateModel;
import de.eplus.mappecc.client.android.common.utils.preferences.NetworkPreferences;
import de.eplus.mappecc.client.android.feature.rating.rule.implementation.BackendCallSuccessfulRatingShowingRule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.a.c.h;

public class MoeTask
  extends AsyncTask<String, Integer, MoeResourceUpdateModel>
{
  private AtomicInteger barrier;
  private ImageManager imageManager;
  private String language;
  private LocalizationManagerFactory localizationManagerFactory;
  private MoeStreamingResourceTaskFactory moeStreamingResourceTaskFactory;
  private MoeTaskFactory moeTaskFactory;
  private IMoeUpdateCallback moeUpdateCallback;
  private NetworkPreferences networkPreferences;
  @NonNull
  private de.a.a.a updater;
  
  public MoeTask(String paramString, IMoeUpdateCallback paramIMoeUpdateCallback, LocalizationManagerFactory paramLocalizationManagerFactory, MoeTaskFactory paramMoeTaskFactory, MoeStreamingResourceTaskFactory paramMoeStreamingResourceTaskFactory, de.a.a.a parama, NetworkPreferences paramNetworkPreferences, ImageManager paramImageManager)
  {
    this.language = paramString;
    this.moeUpdateCallback = paramIMoeUpdateCallback;
    this.localizationManagerFactory = paramLocalizationManagerFactory;
    this.moeTaskFactory = paramMoeTaskFactory;
    this.moeStreamingResourceTaskFactory = paramMoeStreamingResourceTaskFactory;
    this.updater = parama;
    this.networkPreferences = paramNetworkPreferences;
    this.imageManager = paramImageManager;
  }
  
  @Nullable
  protected MoeResourceUpdateModel doInBackground(String... paramVarArgs)
  {
    boolean bool = true;
    c.a.a.b("MoeResourceUpdateModel.doInBackground() entered.... The MOE updater we currently use is %s", new Object[] { this.updater });
    if (paramVarArgs.length > 0) {
      paramVarArgs = paramVarArgs[0];
    } else {
      paramVarArgs = null;
    }
    if (paramVarArgs != null) {
      localObject1 = this.updater.a(this.language, paramVarArgs);
    } else {
      localObject1 = this.updater.a(this.language, null);
    }
    c.a.a.b("MoeResourceUpdateModel.doInBackground(): Now downloading resources for language=%s, version=%s", new Object[] { this.language, paramVarArgs });
    paramVarArgs = new HashMap();
    Object localObject1 = ((Map)localObject1).entrySet().iterator();
    int i = 0;
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      String str = (String)((Map.Entry)localObject2).getKey();
      localObject2 = (b)((Map.Entry)localObject2).getValue();
      if (((b)localObject2).a())
      {
        paramVarArgs.put(str, ((b)localObject2).c);
      }
      else
      {
        Throwable localThrowable = ((b)localObject2).e;
        if (localThrowable != null)
        {
          c.a.a.c(localThrowable, "MoeResourceUpdateModel.doInBackground():Update for key=%s, update=%s failed", new Object[] { str, this.updater.toString() });
          i = 1;
        }
        else
        {
          if (((b)localObject2).b != c.b) {
            bool = false;
          }
          if (bool) {
            i = 304;
          } else {
            i = ((b)localObject2).d;
          }
          return new MoeResourceUpdateModel(paramVarArgs, this.updater.a, bool, i);
        }
      }
    }
    localObject1 = this.updater.a;
    if (h.d((CharSequence)localObject1)) {
      this.localizationManagerFactory.create(this.language).beginLocalizationUpdate(Integer.parseInt((String)localObject1)).createOrUpdateLocalizations(paramVarArgs).commit();
    }
    return new MoeResourceUpdateModel(paramVarArgs, this.updater.a, 0x1 ^ i);
  }
  
  public void fetchStreamingResource(@NonNull String paramString)
  {
    Object localObject2 = h.a(paramString, "_", 2);
    Object localObject1 = localObject2[0];
    localObject2 = localObject2[1];
    LocalizationManager localLocalizationManager = this.localizationManagerFactory.create(this.language);
    this.moeStreamingResourceTaskFactory.create(this.moeUpdateCallback, this.barrier).execute(new String[] { localLocalizationManager.getLanguageCode(), paramString, localObject1, localObject2 });
  }
  
  void onBackendCallSuccessful()
  {
    new BackendCallSuccessfulRatingShowingRule().onBackendCallSuccessful();
  }
  
  protected void onPostExecute(@Nullable MoeResourceUpdateModel paramMoeResourceUpdateModel)
  {
    c.a.a.b("MoeResourceUpdateModel.onPostExecute() entered...", new Object[0]);
    Object localObject = this.localizationManagerFactory.create(this.language);
    if (paramMoeResourceUpdateModel.isSuccess())
    {
      c.a.a.c("MoeResourceUpdateModel.onPostExecute(): MoeResourceUpdateEvent finished", new Object[0]);
    }
    else if (paramMoeResourceUpdateModel.getStatusCode() == 404)
    {
      this.localizationManagerFactory.resetLocalizaionDatabase();
      this.moeTaskFactory.create(this.language, this.moeUpdateCallback).execute(new String[0]);
      return;
    }
    List localList = ((LocalizationManager)localObject).getStreamingResourceKeys();
    this.barrier = new AtomicInteger(localList.size());
    if (!localList.isEmpty())
    {
      paramMoeResourceUpdateModel = localList.iterator();
      while (paramMoeResourceUpdateModel.hasNext()) {
        fetchStreamingResource((String)paramMoeResourceUpdateModel.next());
      }
      return;
    }
    if (!this.networkPreferences.areImagesPrecached().booleanValue())
    {
      localObject = ((LocalizationManager)localObject).getImageValues();
      this.imageManager.preCache((List)localObject);
      this.networkPreferences.setImagesPrecached();
    }
    if (paramMoeResourceUpdateModel.isSuccess())
    {
      this.moeUpdateCallback.onMoeUpdateResult(IMoeUpdateCallback.MoeUpdateResult.MOE_UPDATE_SUCCESS.withStatusCode(paramMoeResourceUpdateModel.getStatusCode()));
      onBackendCallSuccessful();
      return;
    }
    this.moeUpdateCallback.onMoeUpdateResult(IMoeUpdateCallback.MoeUpdateResult.MOE_UPDATE_FAIL.withStatusCode(paramMoeResourceUpdateModel.getStatusCode()));
    new BackendCallSuccessfulRatingShowingRule().onBackendCallFailure();
  }
  
  public void setLanguage(String paramString)
  {
    this.language = paramString;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/core/MoeTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
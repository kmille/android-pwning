package de.eplus.mappecc.client.android.common.network.moe.core;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import de.a.a.b;
import de.eplus.mappecc.client.android.common.network.moe.IMoeUpdateCallback;
import de.eplus.mappecc.client.android.common.network.moe.IMoeUpdateCallback.MoeUpdateResult;
import de.eplus.mappecc.client.android.common.network.moe.ImageManager;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManager;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.network.moe.LocalizerBatchOperation;
import de.eplus.mappecc.client.android.common.network.moe.model.MoeStreamingResourceUpdateModel;
import de.eplus.mappecc.client.android.feature.rating.rule.implementation.BackendCallSuccessfulRatingShowingRule;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.a.c.h;

public class MoeStreamingResourceTask
  extends AsyncTask<String, Integer, MoeStreamingResourceUpdateModel>
{
  private AtomicInteger barrier;
  private ImageManager imageManager;
  private LocalizationManagerFactory localizationManagerFactory;
  private IMoeUpdateCallback moeUpdateCallback;
  private de.a.a.a moeUpdater;
  
  public MoeStreamingResourceTask(IMoeUpdateCallback paramIMoeUpdateCallback, AtomicInteger paramAtomicInteger, de.a.a.a parama, LocalizationManagerFactory paramLocalizationManagerFactory, ImageManager paramImageManager)
  {
    this.moeUpdateCallback = paramIMoeUpdateCallback;
    this.barrier = paramAtomicInteger;
    this.moeUpdater = parama;
    this.localizationManagerFactory = paramLocalizationManagerFactory;
    this.imageManager = paramImageManager;
  }
  
  @NonNull
  protected MoeStreamingResourceUpdateModel doInBackground(String... paramVarArgs)
  {
    c.a.a.b("entered...", new Object[0]);
    Object localObject = this.moeUpdater.a(paramVarArgs[2], paramVarArgs[0], new String[] { paramVarArgs[3] });
    boolean bool = ((b)localObject).a();
    String str1 = paramVarArgs[1];
    String str2 = ((b)localObject).c;
    if ((bool) && (h.d(str1)))
    {
      LocalizationManager localLocalizationManager = this.localizationManagerFactory.create(paramVarArgs[0]);
      if (paramVarArgs[2].equalsIgnoreCase("img"))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(((b)localObject).f);
        localStringBuilder.append("/");
        localStringBuilder.append(paramVarArgs[3]);
        localObject = localStringBuilder.toString();
        this.imageManager.insertUrlToList((String)localObject);
      }
      localLocalizationManager.beginLocalizationUpdate(localLocalizationManager.getVersion()).createOrUpdateLocalization(str1, str2).commit();
    }
    else
    {
      c.a.a.c(((b)localObject).e, "Update for key=%s, update=%s failed", new Object[] { Integer.valueOf(1), this.moeUpdater.toString() });
    }
    return new MoeStreamingResourceUpdateModel(str2, paramVarArgs[1], bool);
  }
  
  void onBackendCallFailure()
  {
    new BackendCallSuccessfulRatingShowingRule().onBackendCallFailure();
  }
  
  void onBackendCallSuccessful()
  {
    new BackendCallSuccessfulRatingShowingRule().onBackendCallSuccessful();
  }
  
  protected void onPostExecute(@Nullable MoeStreamingResourceUpdateModel paramMoeStreamingResourceUpdateModel)
  {
    String str2 = paramMoeStreamingResourceUpdateModel.getKey();
    String str1;
    if (paramMoeStreamingResourceUpdateModel.getResource() != null) {
      str1 = h.b(paramMoeStreamingResourceUpdateModel.getResource(), "...");
    } else {
      str1 = null;
    }
    c.a.a.b("onPostExecute() entered...: MOE Streaming: %s -> %s", new Object[] { str2, str1 });
    this.barrier.decrementAndGet();
    if (streamingCompleted())
    {
      this.imageManager.preCache();
      if (paramMoeStreamingResourceUpdateModel.isSuccess())
      {
        this.moeUpdateCallback.onMoeUpdateResult(IMoeUpdateCallback.MoeUpdateResult.MOE_UPDATE_SUCCESS);
        onBackendCallSuccessful();
        return;
      }
      this.moeUpdateCallback.onMoeUpdateResult(IMoeUpdateCallback.MoeUpdateResult.MOE_UPDATE_FAIL);
      onBackendCallFailure();
    }
  }
  
  public void setBarrier(AtomicInteger paramAtomicInteger)
  {
    this.barrier = paramAtomicInteger;
  }
  
  public boolean streamingCompleted()
  {
    return this.barrier.get() == 0;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/core/MoeStreamingResourceTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
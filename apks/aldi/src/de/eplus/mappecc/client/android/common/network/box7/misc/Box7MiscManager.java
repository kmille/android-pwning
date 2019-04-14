package de.eplus.mappecc.client.android.common.network.box7.misc;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.network.box7.Box7Result;
import de.eplus.mappecc.client.android.common.network.box7.IBox7ManagerCallback;
import de.eplus.mappecc.client.android.common.restclient.api.MiscApi;
import de.eplus.mappecc.client.android.common.restclient.model.IccIdConversionModel;
import de.eplus.mappecc.client.android.common.restclient.model.VersionModel;
import de.eplus.mappecc.client.android.common.utils.SimUtils;
import javax.inject.Inject;
import org.apache.a.c.h;
import retrofit2.Call;

public class Box7MiscManager
  implements IBox7MiscManager
{
  private final MiscApi miscApi;
  public boolean performSIM2Call = false;
  private final SimUtils simUtils;
  
  @Inject
  public Box7MiscManager(MiscApi paramMiscApi, SimUtils paramSimUtils)
  {
    this.miscApi = paramMiscApi;
    this.simUtils = paramSimUtils;
  }
  
  public void getBox7Version(IBox7ManagerCallback<VersionModel> paramIBox7ManagerCallback)
  {
    this.miscApi.triggerVersion().enqueue(getVersionModelCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  @NonNull
  protected Box7CallbackWrapper<IccIdConversionModel> getIccIdConversionModelCallbackWrapper(IBox7ManagerCallback<IccIdConversionModel> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  @NonNull
  protected Box7CallbackWrapper<VersionModel> getVersionModelCallbackWrapper(IBox7ManagerCallback<VersionModel> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  public void iccidConversion(IBox7ManagerCallback<IccIdConversionModel> paramIBox7ManagerCallback)
  {
    IccIdConversionModel localIccIdConversionModel = new IccIdConversionModel();
    String str2 = this.simUtils.getSimSerial(1);
    String str1 = str2;
    if (this.simUtils.isDualSIM()) {
      if (!h.a(str2))
      {
        str1 = str2;
        if (!this.performSIM2Call) {}
      }
      else
      {
        str1 = this.simUtils.getSimSerial(2);
      }
    }
    if ((!h.a(str1)) && (!str1.equals("8991101200003204510")))
    {
      localIccIdConversionModel.setIccid(str1);
      this.miscApi.iccidConversionWithBrand("alditalk", localIccIdConversionModel).enqueue(getIccIdConversionModelCallbackWrapper(paramIBox7ManagerCallback));
      return;
    }
    paramIBox7ManagerCallback.onBox7Result(Box7Result.BOX7_FAILURE().withErrorCode(-4), localIccIdConversionModel);
  }
  
  public void setPerformSIM2Call(boolean paramBoolean)
  {
    this.performSIM2Call = paramBoolean;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/misc/Box7MiscManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
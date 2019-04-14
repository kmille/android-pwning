package de.eplus.mappecc.client.android.common.network.box7.misc;

import de.eplus.mappecc.client.android.common.network.box7.IBox7ManagerCallback;
import de.eplus.mappecc.client.android.common.restclient.model.IccIdConversionModel;
import de.eplus.mappecc.client.android.common.restclient.model.VersionModel;

public abstract interface IBox7MiscManager
{
  public abstract void getBox7Version(IBox7ManagerCallback<VersionModel> paramIBox7ManagerCallback);
  
  public abstract void iccidConversion(IBox7ManagerCallback<IccIdConversionModel> paramIBox7ManagerCallback);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/misc/IBox7MiscManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
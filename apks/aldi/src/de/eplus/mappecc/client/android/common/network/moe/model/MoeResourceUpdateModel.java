package de.eplus.mappecc.client.android.common.network.moe.model;

import java.util.Map;

public class MoeResourceUpdateModel
{
  private final int statusCode;
  private final boolean success;
  private final Map<String, String> updates;
  private final String version;
  
  public MoeResourceUpdateModel(Map<String, String> paramMap, String paramString, boolean paramBoolean)
  {
    this.updates = paramMap;
    this.version = paramString;
    this.success = paramBoolean;
    this.statusCode = -1;
  }
  
  public MoeResourceUpdateModel(Map<String, String> paramMap, String paramString, boolean paramBoolean, int paramInt)
  {
    this.updates = paramMap;
    this.version = paramString;
    this.success = paramBoolean;
    this.statusCode = paramInt;
  }
  
  public int getStatusCode()
  {
    return this.statusCode;
  }
  
  public Map<String, String> getUpdates()
  {
    return this.updates;
  }
  
  public String getVersion()
  {
    return this.version;
  }
  
  public boolean isSuccess()
  {
    return this.success;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/model/MoeResourceUpdateModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
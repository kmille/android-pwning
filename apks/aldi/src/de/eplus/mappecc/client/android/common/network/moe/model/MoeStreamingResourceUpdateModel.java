package de.eplus.mappecc.client.android.common.network.moe.model;

public class MoeStreamingResourceUpdateModel
{
  private final String key;
  private final String resource;
  private final boolean success;
  
  public MoeStreamingResourceUpdateModel(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.resource = paramString1;
    this.key = paramString2;
    this.success = paramBoolean;
  }
  
  public String getKey()
  {
    return this.key;
  }
  
  public String getResource()
  {
    return this.resource;
  }
  
  public boolean isSuccess()
  {
    return this.success;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/model/MoeStreamingResourceUpdateModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
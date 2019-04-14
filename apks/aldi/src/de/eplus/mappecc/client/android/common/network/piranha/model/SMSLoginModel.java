package de.eplus.mappecc.client.android.common.network.piranha.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import de.eplus.mappecc.client.android.common.network.piranha.model.pojo.Callback;
import de.eplus.mappecc.client.android.common.restclient.json.JSONModelType;
import java.util.ArrayList;
import java.util.List;
import org.apache.a.c.a.f;

public class SMSLoginModel
  implements JSONModelType
{
  @Expose(deserialize=true, serialize=true)
  @SerializedName("authId")
  private String authId;
  @Expose(deserialize=true, serialize=true)
  @SerializedName("callbacks")
  private List<Callback> callbacks = new ArrayList();
  @Expose(deserialize=true, serialize=true)
  @SerializedName("header")
  private String header;
  @Expose(deserialize=true, serialize=true)
  @SerializedName("stage")
  private String stage;
  @Expose(deserialize=true, serialize=true)
  @SerializedName("template")
  private String template;
  
  public SMSLoginModel() {}
  
  public SMSLoginModel(String paramString1, String paramString2, String paramString3, String paramString4, List<Callback> paramList)
  {
    this.authId = paramString1;
    this.template = paramString2;
    this.stage = paramString3;
    this.header = paramString4;
    this.callbacks = paramList;
  }
  
  public String getAuthId()
  {
    return this.authId;
  }
  
  public List<Callback> getCallbacks()
  {
    return this.callbacks;
  }
  
  public String getHeader()
  {
    return this.header;
  }
  
  public String getStage()
  {
    return this.stage;
  }
  
  public String getTemplate()
  {
    return this.template;
  }
  
  public void setAuthId(String paramString)
  {
    this.authId = paramString;
  }
  
  public void setCallbacks(List<Callback> paramList)
  {
    this.callbacks = paramList;
  }
  
  public void setHeader(String paramString)
  {
    this.header = paramString;
  }
  
  public void setStage(String paramString)
  {
    this.stage = paramString;
  }
  
  public void setTemplate(String paramString)
  {
    this.template = paramString;
  }
  
  public String toString()
  {
    return new f(this).a("authId", this.authId).a("template", this.template).a("stage", this.stage).a("header", this.header).a("callbacks", this.callbacks).toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/model/SMSLoginModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
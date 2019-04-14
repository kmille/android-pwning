package de.eplus.mappecc.client.android.common.network.piranha.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.a.c.a.f;
import org.apache.a.c.a.h;

public class Output
{
  @Expose(deserialize=true, serialize=true)
  @SerializedName("name")
  private String name;
  @Expose(deserialize=true, serialize=true)
  @SerializedName("value")
  private String value;
  private String[] valueStrArray;
  
  public Output() {}
  
  public Output(String paramString1, String paramString2)
  {
    this.name = paramString1;
    this.value = paramString2;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getValue()
  {
    return this.value;
  }
  
  public String[] getValueStrArray()
  {
    return this.valueStrArray;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setValue(String paramString)
  {
    this.value = paramString;
  }
  
  public void setValueStrArray(String[] paramArrayOfString)
  {
    this.valueStrArray = paramArrayOfString;
  }
  
  public String toString()
  {
    f localf = new f(this).a("name", this.name).a("value", this.value);
    String[] arrayOfString = this.valueStrArray;
    localf.d.a(localf.b, "valueStrArray", arrayOfString, null);
    return localf.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/model/pojo/Output.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
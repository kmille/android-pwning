package de.eplus.mappecc.client.android.common.network.piranha.model.pojo;

import android.support.annotation.Nullable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.a.c.a.f;
import org.apache.a.c.h;

public class Callback
{
  @Expose(deserialize=true, serialize=true)
  @SerializedName("input")
  private List<Input> input = new ArrayList();
  @Expose(deserialize=true, serialize=true)
  @SerializedName("output")
  private List<Output> output = new ArrayList();
  @Expose(deserialize=true, serialize=true)
  @SerializedName("type")
  private String type;
  
  public Callback() {}
  
  public Callback(String paramString, List<Input> paramList, List<Output> paramList1)
  {
    this.type = paramString;
    this.input = paramList;
    this.output = paramList1;
  }
  
  @Nullable
  public Input getIDTokenInput()
  {
    Iterator localIterator = this.input.iterator();
    while (localIterator.hasNext())
    {
      Input localInput = (Input)localIterator.next();
      if (h.b("IDToken1", localInput.getName())) {
        return localInput;
      }
    }
    return null;
  }
  
  public List<Input> getInput()
  {
    return this.input;
  }
  
  public List<Output> getOutput()
  {
    return this.output;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public void setInput(List<Input> paramList)
  {
    this.input = paramList;
  }
  
  public void setOutput(List<Output> paramList)
  {
    this.output = paramList;
  }
  
  public void setType(String paramString)
  {
    this.type = paramString;
  }
  
  public String toString()
  {
    return new f(this).a("type", this.type).a("input", this.input).a("output", this.output).toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/model/pojo/Callback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package de.eplus.mappecc.client.android.common.restclient;

import java.util.Arrays;
import java.util.List;

public class CollectionFormats
{
  public static class CSVParams
  {
    protected List<String> params;
    
    public CSVParams() {}
    
    public CSVParams(List<String> paramList)
    {
      this.params = paramList;
    }
    
    public CSVParams(String... paramVarArgs)
    {
      this.params = Arrays.asList(paramVarArgs);
    }
    
    public List<String> getParams()
    {
      return this.params;
    }
    
    public void setParams(List<String> paramList)
    {
      this.params = paramList;
    }
    
    public String toString()
    {
      return StringUtil.join((String[])this.params.toArray(new String[0]), ",");
    }
  }
  
  public static class PIPESParams
    extends CollectionFormats.CSVParams
  {
    public PIPESParams() {}
    
    public PIPESParams(List<String> paramList)
    {
      super();
    }
    
    public PIPESParams(String... paramVarArgs)
    {
      super();
    }
    
    public String toString()
    {
      return StringUtil.join((String[])this.params.toArray(new String[0]), "|");
    }
  }
  
  public static class SSVParams
    extends CollectionFormats.CSVParams
  {
    public SSVParams() {}
    
    public SSVParams(List<String> paramList)
    {
      super();
    }
    
    public SSVParams(String... paramVarArgs)
    {
      super();
    }
    
    public String toString()
    {
      return StringUtil.join((String[])this.params.toArray(new String[0]), " ");
    }
  }
  
  public static class TSVParams
    extends CollectionFormats.CSVParams
  {
    public TSVParams() {}
    
    public TSVParams(List<String> paramList)
    {
      super();
    }
    
    public TSVParams(String... paramVarArgs)
    {
      super();
    }
    
    public String toString()
    {
      return StringUtil.join((String[])this.params.toArray(new String[0]), "\t");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/CollectionFormats.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package de.eplus.mappecc.client.android.common.restclient.endpoint;

import b.j;

@j(a={1, 1, 13}, b={"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\b\b\001\030\0002\b\022\004\022\0020\0000\001B\027\b\002\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\007j\002\b\tj\002\b\n¨\006\013"}, c={"Lde/eplus/mappecc/client/android/common/restclient/endpoint/MoeEndpoint;", "", "moeUrl", "", "description", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getMoeUrl", "PRE_PROD", "PROD", "app_alditalkRelease"})
public enum MoeEndpoint
{
  private final String description;
  private final String moeUrl;
  
  static
  {
    MoeEndpoint localMoeEndpoint1 = new MoeEndpoint("PRE_PROD", 0, "https://maecc-pp.eplus.de/mappecc/moe/", "Moe PP");
    PRE_PROD = localMoeEndpoint1;
    MoeEndpoint localMoeEndpoint2 = new MoeEndpoint("PROD", 1, "https://maecc.eplus.de/mappecc/moe/", "Moe Prod");
    PROD = localMoeEndpoint2;
    $VALUES = new MoeEndpoint[] { localMoeEndpoint1, localMoeEndpoint2 };
  }
  
  protected MoeEndpoint(String paramString1, String paramString2)
  {
    this.moeUrl = paramString1;
    this.description = paramString2;
  }
  
  public final String getDescription()
  {
    return this.description;
  }
  
  public final String getMoeUrl()
  {
    return this.moeUrl;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/endpoint/MoeEndpoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
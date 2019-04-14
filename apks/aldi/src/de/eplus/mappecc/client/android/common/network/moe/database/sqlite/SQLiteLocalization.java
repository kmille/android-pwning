package de.eplus.mappecc.client.android.common.network.moe.database.sqlite;

import de.eplus.mappecc.client.android.common.network.moe.core.Localization;

public class SQLiteLocalization
  implements Localization
{
  private final long id;
  private final boolean isStreamingResource;
  private final String key;
  private final String value;
  
  public SQLiteLocalization(long paramLong, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.id = paramLong;
    this.key = paramString1;
    this.value = paramString2;
    this.isStreamingResource = paramBoolean;
  }
  
  public long getId()
  {
    return this.id;
  }
  
  public String getKey()
  {
    return this.key;
  }
  
  public String getValue()
  {
    return this.value;
  }
  
  public boolean isStreamingResource()
  {
    return this.isStreamingResource;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/database/sqlite/SQLiteLocalization.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package de.eplus.mappecc.client.android.common.network.moe.database.sqlite;

import de.eplus.mappecc.client.android.common.network.moe.core.Language;

public class SQLiteLanguage
  implements Language
{
  private long id;
  private String languageCode;
  private int versionNumber;
  
  public SQLiteLanguage(long paramLong, String paramString, int paramInt)
  {
    this.id = paramLong;
    this.languageCode = paramString;
    this.versionNumber = paramInt;
  }
  
  public long getId()
  {
    return this.id;
  }
  
  public String getLanguageCode()
  {
    return this.languageCode;
  }
  
  public int getVersionNumber()
  {
    return this.versionNumber;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/database/sqlite/SQLiteLanguage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
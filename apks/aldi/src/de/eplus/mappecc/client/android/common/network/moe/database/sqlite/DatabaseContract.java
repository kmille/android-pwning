package de.eplus.mappecc.client.android.common.network.moe.database.sqlite;

import android.provider.BaseColumns;

public final class DatabaseContract
{
  public static class Language
    implements BaseColumns
  {
    public static final String COLUMN_NAME_CODE = "code";
    public static final String COLUMN_NAME_VERSION = "version";
    public static final String TABLE_NAME = "language";
  }
  
  public static class Localization
    implements BaseColumns
  {
    public static final String COLUMN_NAME_IS_STREAMING_RESOURCE = "isStreamingResource";
    public static final String COLUMN_NAME_KEY = "key";
    public static final String COLUMN_NAME_LANGUAGE_ID = "languageId";
    public static final String COLUMN_NAME_VALUE = "value";
    public static final String TABLE_NAME = "localization";
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/database/sqlite/DatabaseContract.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
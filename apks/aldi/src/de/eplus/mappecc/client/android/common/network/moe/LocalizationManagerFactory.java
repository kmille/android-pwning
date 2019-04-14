package de.eplus.mappecc.client.android.common.network.moe;

import android.content.Context;
import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.moe.core.Language;
import de.eplus.mappecc.client.android.common.network.moe.database.DatabaseAccessor;
import java.util.Locale;
import javax.inject.Inject;

public class LocalizationManagerFactory
{
  private final Context context;
  private final DatabaseAccessor databaseAccessor;
  private final LocalizationInfo localizationInfo;
  private final LocalizerBatchOperationFactory localizerBatchOperationFactory;
  
  @Inject
  public LocalizationManagerFactory(Context paramContext, DatabaseAccessor paramDatabaseAccessor, LocalizationInfo paramLocalizationInfo, LocalizerBatchOperationFactory paramLocalizerBatchOperationFactory)
  {
    this.databaseAccessor = paramDatabaseAccessor;
    this.context = paramContext;
    this.localizationInfo = paramLocalizationInfo;
    this.localizerBatchOperationFactory = paramLocalizerBatchOperationFactory;
    create();
  }
  
  @NonNull
  private Language createLanguage(@NonNull Context paramContext, DatabaseAccessor paramDatabaseAccessor, String paramString)
  {
    return paramDatabaseAccessor.createLanguage(paramString, getVersionNumberFromAssets(paramContext, paramString));
  }
  
  /* Error */
  private int getVersionNumberFromAssets(@NonNull Context paramContext, @NonNull String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 5
    //   6: aload 5
    //   8: astore 4
    //   10: aload_1
    //   11: invokevirtual 54	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   14: astore_1
    //   15: aload 5
    //   17: astore 4
    //   19: new 56	java/lang/StringBuilder
    //   22: dup
    //   23: ldc 58
    //   25: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   28: astore 7
    //   30: aload 5
    //   32: astore 4
    //   34: aload 7
    //   36: aload_2
    //   37: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: pop
    //   41: aload 5
    //   43: astore 4
    //   45: aload 7
    //   47: ldc 67
    //   49: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload 5
    //   55: astore 4
    //   57: aload_1
    //   58: aload 7
    //   60: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokevirtual 77	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   66: astore_1
    //   67: aload_1
    //   68: getstatic 83	com/google/common/base/Charsets:UTF_8	Ljava/nio/charset/Charset;
    //   71: invokestatic 89	org/apache/a/b/b:a	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/util/List;
    //   74: iconst_0
    //   75: invokeinterface 95 2 0
    //   80: checkcast 97	java/lang/String
    //   83: invokestatic 103	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   86: istore_3
    //   87: aload_1
    //   88: ifnull +7 -> 95
    //   91: aload_1
    //   92: invokestatic 106	org/apache/a/b/b:a	(Ljava/io/InputStream;)V
    //   95: iload_3
    //   96: ireturn
    //   97: astore_2
    //   98: aload_1
    //   99: astore 4
    //   101: aload_2
    //   102: astore_1
    //   103: goto +45 -> 148
    //   106: astore 5
    //   108: goto +12 -> 120
    //   111: astore_1
    //   112: goto +36 -> 148
    //   115: astore 5
    //   117: aload 6
    //   119: astore_1
    //   120: aload_1
    //   121: astore 4
    //   123: aload 5
    //   125: ldc 108
    //   127: iconst_1
    //   128: anewarray 4	java/lang/Object
    //   131: dup
    //   132: iconst_0
    //   133: aload_2
    //   134: aastore
    //   135: invokestatic 114	c/a/a:c	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   138: aload_1
    //   139: ifnull +7 -> 146
    //   142: aload_1
    //   143: invokestatic 106	org/apache/a/b/b:a	(Ljava/io/InputStream;)V
    //   146: iconst_m1
    //   147: ireturn
    //   148: aload 4
    //   150: ifnull +8 -> 158
    //   153: aload 4
    //   155: invokestatic 106	org/apache/a/b/b:a	(Ljava/io/InputStream;)V
    //   158: aload_1
    //   159: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	this	LocalizationManagerFactory
    //   0	160	1	paramContext	Context
    //   0	160	2	paramString	String
    //   86	10	3	i	int
    //   8	146	4	localObject1	Object
    //   4	50	5	localObject2	Object
    //   106	1	5	localException1	Exception
    //   115	9	5	localException2	Exception
    //   1	117	6	localObject3	Object
    //   28	31	7	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   67	87	97	finally
    //   67	87	106	java/lang/Exception
    //   10	15	111	finally
    //   19	30	111	finally
    //   34	41	111	finally
    //   45	53	111	finally
    //   57	67	111	finally
    //   123	138	111	finally
    //   10	15	115	java/lang/Exception
    //   19	30	115	java/lang/Exception
    //   34	41	115	java/lang/Exception
    //   45	53	115	java/lang/Exception
    //   57	67	115	java/lang/Exception
  }
  
  @NonNull
  public LocalizationManager create()
  {
    return create(Locale.getDefault().getLanguage());
  }
  
  @NonNull
  public LocalizationManager create(@NonNull String paramString)
  {
    String str = this.localizationInfo.getSupportedLanguageCode(paramString);
    paramString = this.databaseAccessor.getLanguage(str);
    int i;
    if (paramString != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      paramString = createLanguage(this.context, this.databaseAccessor, str);
    }
    paramString = new LocalizationManager(paramString, this.databaseAccessor, this.localizerBatchOperationFactory);
    if (i == 0) {
      paramString.insertPreIncludeLocalizations();
    }
    return paramString;
  }
  
  public void ensureLocalizationsExist()
  {
    create();
  }
  
  public void resetLocalizaionDatabase()
  {
    this.databaseAccessor.clearLocalizationDatabase();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/LocalizationManagerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
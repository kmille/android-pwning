package de.eplus.mappecc.client.android.common.network.moe;

import de.eplus.mappecc.client.android.common.network.moe.core.Language;
import de.eplus.mappecc.client.android.common.network.moe.database.DatabaseAccessor;
import javax.inject.Inject;

public class LocalizerBatchOperationFactory
{
  final DatabaseAccessor databaseAccessor;
  
  @Inject
  public LocalizerBatchOperationFactory(DatabaseAccessor paramDatabaseAccessor)
  {
    this.databaseAccessor = paramDatabaseAccessor;
  }
  
  public LocalizerBatchOperation create(Language paramLanguage, int paramInt)
  {
    return new LocalizerBatchOperation(paramLanguage, paramInt, this.databaseAccessor);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/LocalizerBatchOperationFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
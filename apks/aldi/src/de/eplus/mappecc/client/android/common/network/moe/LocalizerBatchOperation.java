package de.eplus.mappecc.client.android.common.network.moe;

import android.support.annotation.NonNull;
import c.a.a;
import de.eplus.mappecc.client.android.common.network.moe.core.Language;
import de.eplus.mappecc.client.android.common.network.moe.core.Localization;
import de.eplus.mappecc.client.android.common.network.moe.database.DatabaseAccessor;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.a.c.h;

public class LocalizerBatchOperation
{
  private DatabaseAccessor accessor;
  private boolean isActive = true;
  private Language language;
  private int versionAfterUpdate;
  
  public LocalizerBatchOperation() {}
  
  public LocalizerBatchOperation(Language paramLanguage, int paramInt, DatabaseAccessor paramDatabaseAccessor)
  {
    this.language = paramLanguage;
    this.versionAfterUpdate = paramInt;
    this.accessor = paramDatabaseAccessor;
    this.accessor.beginTransaction();
  }
  
  protected boolean canEqual(Object paramObject)
  {
    return paramObject instanceof LocalizerBatchOperation;
  }
  
  public void commit()
  {
    this.accessor.updateLanguageVersion(this.language, this.versionAfterUpdate);
    this.accessor.commitTransaction();
    this.isActive = false;
  }
  
  @NonNull
  public LocalizerBatchOperation createLocalization(@NonNull String paramString1, String paramString2)
  {
    if (this.isActive)
    {
      if (this.accessor.getLocalization(paramString1, this.language) == null)
      {
        boolean bool = h.c(paramString2, "@StreamingResource@");
        this.accessor.createLocalization(this.language, paramString1, paramString2, bool);
      }
      return this;
    }
    throw new UnsupportedOperationException("Tried to create on committed LocalizerBatchOperation");
  }
  
  @NonNull
  public LocalizerBatchOperation createLocalizations(@NonNull Map<String, String> paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    int i = 0;
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      createLocalization((String)localEntry.getKey(), (String)localEntry.getValue());
      i += 1;
    }
    a.c("Created %d localizations", new Object[] { Integer.valueOf(i) });
    return this;
  }
  
  @NonNull
  public LocalizerBatchOperation createOrUpdateLocalization(@NonNull String paramString1, String paramString2)
  {
    if (this.isActive)
    {
      Localization localLocalization = this.accessor.getLocalization(paramString1, this.language);
      boolean bool = h.c(paramString2, "@StreamingResource@");
      if (localLocalization != null)
      {
        a.a("Updating Localization for %s => %s (was: %s", new Object[] { paramString1, h.b(paramString2, "..."), h.b(localLocalization.getValue(), "...") });
        this.accessor.updateLocalization(localLocalization, paramString2, bool);
        return this;
      }
      this.accessor.createLocalization(this.language, paramString1, paramString2, bool);
      return this;
    }
    throw new UnsupportedOperationException("Tried to create/update on committed LocalizerBatchOperation");
  }
  
  @NonNull
  public LocalizerBatchOperation createOrUpdateLocalizations(@NonNull Map<String, String> paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    int i = 0;
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      createOrUpdateLocalization((String)localEntry.getKey(), (String)localEntry.getValue());
      i += 1;
    }
    a.c("Created or updated %d localizations", new Object[] { Integer.valueOf(i) });
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof LocalizerBatchOperation)) {
      return false;
    }
    paramObject = (LocalizerBatchOperation)paramObject;
    if (!((LocalizerBatchOperation)paramObject).canEqual(this)) {
      return false;
    }
    Object localObject = getLanguage();
    Language localLanguage = ((LocalizerBatchOperation)paramObject).getLanguage();
    if (localObject == null)
    {
      if (localLanguage != null) {
        return false;
      }
    }
    else if (!localObject.equals(localLanguage)) {
      return false;
    }
    if (getVersionAfterUpdate() != ((LocalizerBatchOperation)paramObject).getVersionAfterUpdate()) {
      return false;
    }
    if (isActive() != ((LocalizerBatchOperation)paramObject).isActive()) {
      return false;
    }
    localObject = getAccessor();
    paramObject = ((LocalizerBatchOperation)paramObject).getAccessor();
    if (localObject == null)
    {
      if (paramObject != null) {
        return false;
      }
    }
    else if (!localObject.equals(paramObject)) {
      return false;
    }
    return true;
  }
  
  public DatabaseAccessor getAccessor()
  {
    return this.accessor;
  }
  
  public Language getLanguage()
  {
    return this.language;
  }
  
  public int getVersionAfterUpdate()
  {
    return this.versionAfterUpdate;
  }
  
  public int hashCode()
  {
    Object localObject = getLanguage();
    int k = 43;
    int i;
    if (localObject == null) {
      i = 43;
    } else {
      i = localObject.hashCode();
    }
    int m = getVersionAfterUpdate();
    int j;
    if (isActive()) {
      j = 79;
    } else {
      j = 97;
    }
    localObject = getAccessor();
    if (localObject != null) {
      k = localObject.hashCode();
    }
    return (((i + 59) * 59 + m) * 59 + j) * 59 + k;
  }
  
  public boolean isActive()
  {
    return this.isActive;
  }
  
  public void setAccessor(DatabaseAccessor paramDatabaseAccessor)
  {
    this.accessor = paramDatabaseAccessor;
  }
  
  public void setActive(boolean paramBoolean)
  {
    this.isActive = paramBoolean;
  }
  
  public void setLanguage(Language paramLanguage)
  {
    this.language = paramLanguage;
  }
  
  public void setVersionAfterUpdate(int paramInt)
  {
    this.versionAfterUpdate = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("LocalizerBatchOperation(language=");
    localStringBuilder.append(getLanguage());
    localStringBuilder.append(", versionAfterUpdate=");
    localStringBuilder.append(getVersionAfterUpdate());
    localStringBuilder.append(", isActive=");
    localStringBuilder.append(isActive());
    localStringBuilder.append(", accessor=");
    localStringBuilder.append(getAccessor());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/LocalizerBatchOperation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
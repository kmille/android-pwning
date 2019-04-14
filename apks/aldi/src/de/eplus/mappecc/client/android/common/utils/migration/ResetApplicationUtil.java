package de.eplus.mappecc.client.android.common.utils.migration;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import c.a.a;
import com.google.common.collect.n;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import de.eplus.mappecc.client.android.common.utils.DeviceUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.Preferences;
import java.io.File;
import java.util.Set;
import javax.inject.Inject;

public final class ResetApplicationUtil
{
  private static final int MIN_VERSION_TO_START_REPLACE = 56101;
  private static final String SHARED_PREFERENCES_VERSION_NUMBER = "VERSION_NUMBER";
  private final Set<String> FILE_NAMES_NOT_TO_DELETE = n.a("IO.xml", "B2PDefaultKeyStore.jks");
  @Inject
  Preferences preferences;
  
  public ResetApplicationUtil()
  {
    B2PApplication.component.inject(this);
  }
  
  private void clearApplicationData(@NonNull Context paramContext)
  {
    paramContext = new File(paramContext.getCacheDir().getParent());
    if (paramContext.exists())
    {
      String[] arrayOfString = paramContext.list();
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        String str = arrayOfString[i];
        if (!str.equals("lib")) {
          deleteFile(new File(paramContext, str));
        }
        i += 1;
      }
    }
  }
  
  private void clearSharedPreferences(@NonNull Context paramContext)
  {
    paramContext = DeviceUtils.getSharedPreferencesDir(paramContext).listFiles();
    if (paramContext == null) {
      return;
    }
    int j = paramContext.length;
    int i = 0;
    while (i < j)
    {
      Object localObject = paramContext[i];
      if (!this.FILE_NAMES_NOT_TO_DELETE.contains(((File)localObject).getName()))
      {
        StringBuilder localStringBuilder = new StringBuilder("Delete file with the name: ");
        localStringBuilder.append(((File)localObject).getAbsolutePath());
        a.a(localStringBuilder.toString(), new Object[0]);
        ((File)localObject).delete();
      }
      i += 1;
    }
  }
  
  private boolean deleteFile(@Nullable File paramFile)
  {
    boolean bool = true;
    if (paramFile != null)
    {
      if (this.FILE_NAMES_NOT_TO_DELETE.contains(paramFile.getName())) {
        return true;
      }
      if (paramFile.isDirectory())
      {
        localObject = paramFile.list();
        int j = localObject.length;
        int i = 0;
        bool = true;
        while (i < j)
        {
          if ((deleteFile(new File(paramFile, localObject[i]))) && (bool)) {
            bool = true;
          } else {
            bool = false;
          }
          i += 1;
        }
        return bool;
      }
      Object localObject = new StringBuilder("Delete file with the name: ");
      ((StringBuilder)localObject).append(paramFile.getAbsolutePath());
      a.a(((StringBuilder)localObject).toString(), new Object[0]);
      bool = paramFile.delete();
    }
    return bool;
  }
  
  public final void resetIfNecessary(@NonNull Context paramContext)
  {
    if (this.preferences.loadInteger("VERSION_NUMBER", 0) < 56101)
    {
      new MigrationManager(this.preferences, paramContext).migrateOldToNewSharedPreferences();
      clearSharedPreferences(paramContext);
      clearApplicationData(paramContext);
    }
    this.preferences.saveInteger("VERSION_NUMBER", 62010);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/utils/migration/ResetApplicationUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
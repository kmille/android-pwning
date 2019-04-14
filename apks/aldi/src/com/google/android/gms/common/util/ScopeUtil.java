package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

@KeepForSdk
public final class ScopeUtil
{
  @KeepForSdk
  public static String[] toScopeString(Set<Scope> paramSet)
  {
    Preconditions.checkNotNull(paramSet, "scopes can't be null.");
    paramSet = (Scope[])paramSet.toArray(new Scope[paramSet.size()]);
    Preconditions.checkNotNull(paramSet, "scopes can't be null.");
    String[] arrayOfString = new String[paramSet.length];
    int i = 0;
    while (i < paramSet.length)
    {
      arrayOfString[i] = paramSet[i].getScopeUri();
      i += 1;
    }
    return arrayOfString;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/ScopeUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
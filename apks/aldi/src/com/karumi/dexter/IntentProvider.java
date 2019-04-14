package com.karumi.dexter;

import android.content.Context;
import android.content.Intent;

class IntentProvider
{
  public Intent get(Context paramContext, Class<?> paramClass)
  {
    return new Intent(paramContext, paramClass);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/IntentProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
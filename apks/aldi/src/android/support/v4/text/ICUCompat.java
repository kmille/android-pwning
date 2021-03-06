package android.support.v4.text;

import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class ICUCompat
{
  private static final String TAG = "ICUCompat";
  private static Method sAddLikelySubtagsMethod = null;
  private static Method sGetScriptMethod;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {
      try
      {
        sAddLikelySubtagsMethod = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] { Locale.class });
        return;
      }
      catch (Exception localException1)
      {
        throw new IllegalStateException(localException1);
      }
    }
    try
    {
      Class localClass = Class.forName("libcore.icu.ICU");
      if (localClass != null)
      {
        sGetScriptMethod = localClass.getMethod("getScript", new Class[] { String.class });
        sAddLikelySubtagsMethod = localClass.getMethod("addLikelySubtags", new Class[] { String.class });
      }
      return;
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
    sGetScriptMethod = null;
  }
  
  private static String addLikelySubtags(Locale paramLocale)
  {
    paramLocale = paramLocale.toString();
    try
    {
      if (sAddLikelySubtagsMethod != null)
      {
        String str = (String)sAddLikelySubtagsMethod.invoke(null, new Object[] { paramLocale });
        return str;
      }
      return paramLocale;
    }
    catch (IllegalAccessException|InvocationTargetException localIllegalAccessException) {}
    return paramLocale;
  }
  
  private static String getScript(String paramString)
  {
    try
    {
      if (sGetScriptMethod != null)
      {
        paramString = (String)sGetScriptMethod.invoke(null, new Object[] { paramString });
        return paramString;
      }
      return null;
    }
    catch (IllegalAccessException|InvocationTargetException paramString) {}
    return null;
  }
  
  @Nullable
  public static String maximizeAndGetScript(Locale paramLocale)
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    try
    {
      String str = ((Locale)sAddLikelySubtagsMethod.invoke(null, new Object[] { paramLocale })).getScript();
      return str;
    }
    catch (InvocationTargetException|IllegalAccessException localInvocationTargetException)
    {
      for (;;) {}
    }
    return paramLocale.getScript();
    paramLocale = addLikelySubtags(paramLocale);
    if (paramLocale != null) {
      return getScript(paramLocale);
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/text/ICUCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
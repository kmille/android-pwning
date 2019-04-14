package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class ViewUtils
{
  @KeepForSdk
  public static String getXmlAttributeString(String paramString1, String paramString2, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2, String paramString3)
  {
    if (paramAttributeSet == null) {
      paramString1 = null;
    } else {
      paramString1 = paramAttributeSet.getAttributeValue(paramString1, paramString2);
    }
    paramAttributeSet = paramString1;
    String str;
    if (paramString1 != null)
    {
      paramAttributeSet = paramString1;
      if (paramString1.startsWith("@string/"))
      {
        paramAttributeSet = paramString1;
        if (paramBoolean1)
        {
          paramString3 = paramString1.substring(8);
          str = paramContext.getPackageName();
          paramAttributeSet = new TypedValue();
        }
      }
    }
    try
    {
      paramContext = paramContext.getResources();
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(paramString3).length());
      localStringBuilder.append(str);
      localStringBuilder.append(":string/");
      localStringBuilder.append(paramString3);
      paramContext.getValue(localStringBuilder.toString(), paramAttributeSet, true);
    }
    catch (Resources.NotFoundException paramContext)
    {
      for (;;) {}
    }
    paramContext = new StringBuilder(String.valueOf(paramString2).length() + 30 + String.valueOf(paramString1).length());
    paramContext.append("Could not find resource for ");
    paramContext.append(paramString2);
    paramContext.append(": ");
    paramContext.append(paramString1);
    if (paramAttributeSet.string != null)
    {
      paramAttributeSet = paramAttributeSet.string.toString();
    }
    else
    {
      paramContext = String.valueOf(paramAttributeSet);
      paramAttributeSet = new StringBuilder(String.valueOf(paramString2).length() + 28 + String.valueOf(paramContext).length());
      paramAttributeSet.append("Resource ");
      paramAttributeSet.append(paramString2);
      paramAttributeSet.append(" was not a string: ");
      paramAttributeSet.append(paramContext);
      paramAttributeSet = paramString1;
    }
    if ((paramBoolean2) && (paramAttributeSet == null))
    {
      paramString1 = new StringBuilder(String.valueOf(paramString2).length() + 33);
      paramString1.append("Required XML attribute \"");
      paramString1.append(paramString2);
      paramString1.append("\" missing");
    }
    return paramAttributeSet;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/ViewUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

public class zzbs<T extends zzbr>
  extends zzaq
{
  private zzbt<T> zzxx;
  
  public zzbs(zzat paramzzat, zzbt<T> paramzzbt)
  {
    super(paramzzat);
    this.zzxx = paramzzbt;
  }
  
  private final T zza(XmlResourceParser paramXmlResourceParser)
  {
    try
    {
      paramXmlResourceParser.next();
      for (int i = paramXmlResourceParser.getEventType(); i != 1; i = paramXmlResourceParser.next()) {
        if (paramXmlResourceParser.getEventType() == 2)
        {
          String str1 = paramXmlResourceParser.getName().toLowerCase(Locale.US);
          String str3;
          if (str1.equals("screenname"))
          {
            str1 = paramXmlResourceParser.getAttributeValue(null, "name");
            str3 = paramXmlResourceParser.nextText().trim();
            if ((!TextUtils.isEmpty(str1)) && (!TextUtils.isEmpty(str3))) {
              this.zzxx.zzb(str1, str3);
            }
          }
          else if (str1.equals("string"))
          {
            str1 = paramXmlResourceParser.getAttributeValue(null, "name");
            str3 = paramXmlResourceParser.nextText().trim();
            if ((!TextUtils.isEmpty(str1)) && (str3 != null)) {
              this.zzxx.zzc(str1, str3);
            }
          }
          else
          {
            boolean bool;
            String str4;
            if (str1.equals("bool"))
            {
              str1 = paramXmlResourceParser.getAttributeValue(null, "name");
              str3 = paramXmlResourceParser.nextText().trim();
              if (!TextUtils.isEmpty(str1))
              {
                bool = TextUtils.isEmpty(str3);
                if (!bool) {
                  try
                  {
                    bool = Boolean.parseBoolean(str3);
                    this.zzxx.zza(str1, bool);
                  }
                  catch (NumberFormatException localNumberFormatException1)
                  {
                    str4 = "Error parsing bool configuration value";
                  }
                }
              }
            }
            else
            {
              for (;;)
              {
                zzc(str4, str3, localNumberFormatException1);
                break;
                if (!localNumberFormatException1.equals("integer")) {
                  break;
                }
                String str2 = paramXmlResourceParser.getAttributeValue(null, "name");
                str3 = paramXmlResourceParser.nextText().trim();
                if (TextUtils.isEmpty(str2)) {
                  break;
                }
                bool = TextUtils.isEmpty(str3);
                if (bool) {
                  break;
                }
                try
                {
                  i = Integer.parseInt(str3);
                  this.zzxx.zzb(str2, i);
                }
                catch (NumberFormatException localNumberFormatException2)
                {
                  str4 = "Error parsing int configuration value";
                }
              }
            }
          }
        }
      }
      return this.zzxx.zzdr();
    }
    catch (XmlPullParserException|IOException paramXmlResourceParser)
    {
      zze("Error parsing tracker configuration file", paramXmlResourceParser);
    }
  }
  
  public final T zzo(int paramInt)
  {
    try
    {
      zzbr localzzbr = zza(zzbs().zzci().getResources().getXml(paramInt));
      return localzzbr;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      zzd("inflate() called with unknown resourceId", localNotFoundException);
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzbs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
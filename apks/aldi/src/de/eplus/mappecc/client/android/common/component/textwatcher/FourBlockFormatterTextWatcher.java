package de.eplus.mappecc.client.android.common.component.textwatcher;

import android.text.Editable;
import de.eplus.mappecc.client.android.common.component.textview.AdapterTextWatcher;
import de.eplus.mappecc.client.android.common.restclient.StringUtil;

public class FourBlockFormatterTextWatcher
  extends AdapterTextWatcher
{
  public void afterTextChanged(Editable paramEditable)
  {
    String str1 = paramEditable.toString();
    String str2 = StringUtil.fourBlockFormatter(str1);
    if (!str1.equals(str2)) {
      paramEditable.replace(0, paramEditable.length(), str2);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/textwatcher/FourBlockFormatterTextWatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
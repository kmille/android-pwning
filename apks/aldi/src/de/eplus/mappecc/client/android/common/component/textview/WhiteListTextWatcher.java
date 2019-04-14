package de.eplus.mappecc.client.android.common.component.textview;

import android.support.annotation.NonNull;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import org.apache.a.c.c;

public class WhiteListTextWatcher
  extends AdapterTextWatcher
{
  private final WeakReference<EditText> editTextWeakReference;
  private final String whiteListChars;
  
  public WhiteListTextWatcher(@NonNull String paramString, @NonNull EditText paramEditText)
  {
    this.whiteListChars = paramString;
    this.editTextWeakReference = new WeakReference(paramEditText);
  }
  
  private String getFilteredText(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramString.length();
    int i = 0;
    while (i < j)
    {
      String str = c.a(paramString.charAt(i));
      if (this.whiteListChars.contains(str)) {
        localStringBuilder.append(str);
      }
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    String str = getFilteredText(paramCharSequence.toString());
    EditText localEditText = (EditText)this.editTextWeakReference.get();
    if ((localEditText != null) && (str.length() != paramCharSequence.length()))
    {
      localEditText.setText(str);
      if (str.length() > 0) {
        localEditText.setSelection(str.length());
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/textview/WhiteListTextWatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
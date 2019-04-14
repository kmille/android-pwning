package de.eplus.mappecc.client.android.common.network.moe;

import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import c.a.a;
import org.apache.a.c.g;
import org.apache.a.c.h;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.select.Elements;

public final class TextViewHtmlAdapter
{
  public static Spanned fromHtml(@Nullable CharSequence paramCharSequence)
  {
    if (paramCharSequence != null) {
      paramCharSequence = g.b(paramCharSequence.toString());
    } else {
      paramCharSequence = "";
    }
    paramCharSequence = h.a(h.a(paramCharSequence, "\\n", "<br/>", -1), "\\'", "'", -1);
    if (Build.VERSION.SDK_INT >= 24) {
      return Html.fromHtml(paramCharSequence, 63);
    }
    return Html.fromHtml(paramCharSequence, null, new HtmlTagHandler());
  }
  
  public static String removeHtml(String paramString)
  {
    if (h.c(paramString)) {
      return "";
    }
    paramString = Jsoup.parse(paramString);
    paramString.outputSettings(new Document.OutputSettings().prettyPrint(false));
    paramString.select("br").after("\\n");
    paramString.select("p").prepend("\\n\\n");
    return paramString.text().replace("\\n", "\n");
  }
  
  public static void setFormatedText(@Nullable TextView paramTextView, Spannable paramSpannable)
  {
    if (paramTextView != null) {
      paramTextView.setText(paramSpannable);
    }
  }
  
  public static void setHtmlText(@Nullable TextView paramTextView, @Nullable String paramString)
  {
    if (paramTextView != null)
    {
      paramTextView.setText(fromHtml(paramString), TextView.BufferType.SPANNABLE);
      return;
    }
    a.d("TextView for text=%s is null!", new Object[] { paramString });
  }
  
  public static void setNonHtmlText(@Nullable TextView paramTextView, @Nullable String paramString)
  {
    if (paramTextView != null)
    {
      paramString = g.b(paramString);
      if (paramString == null) {
        paramString = "";
      }
      if (h.a(paramString, new char[] { 60, 62, 38 }))
      {
        paramTextView.setText(removeHtml(paramString));
        return;
      }
      paramTextView.setText(paramString);
      return;
    }
    a.d("TextView for text=%s is null!", new Object[] { paramString });
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/TextViewHtmlAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
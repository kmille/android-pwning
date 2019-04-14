package de.eplus.mappecc.client.android.common.network.moe;

import android.text.Editable;
import android.text.Html.TagHandler;
import android.text.Layout.Alignment;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BulletSpan;
import android.text.style.LeadingMarginSpan.Standard;
import android.text.style.StrikethroughSpan;
import android.text.style.TypefaceSpan;
import c.a.a;
import java.util.Stack;
import org.xml.sax.XMLReader;

public class HtmlTagHandler
  implements Html.TagHandler
{
  private static final BulletSpan bullet = new BulletSpan(10);
  private static final int indent = 10;
  private static final int listItemIndent = 20;
  private Stack<String> lists = new Stack();
  Stack<Integer> olNextIndex = new Stack();
  
  private void end(Editable paramEditable, Class paramClass, boolean paramBoolean, Object... paramVarArgs)
  {
    paramClass = getLast(paramEditable, paramClass);
    int k = paramEditable.getSpanStart(paramClass);
    int j = paramEditable.length();
    paramEditable.removeSpan(paramClass);
    if (k != j)
    {
      int i = j;
      if (paramBoolean)
      {
        paramEditable.append("\n");
        i = j + 1;
      }
      int m = paramVarArgs.length;
      j = 0;
      while (j < m)
      {
        paramEditable.setSpan(paramVarArgs[j], k, i, 33);
        j += 1;
      }
    }
  }
  
  private CharSequence extractSpanText(Editable paramEditable, Class paramClass)
  {
    int i = paramEditable.getSpanStart(getLast(paramEditable, paramClass));
    int j = paramEditable.length();
    paramClass = paramEditable.subSequence(i, j);
    paramEditable.delete(i, j);
    return paramClass;
  }
  
  private static Object getLast(Editable paramEditable, Class paramClass)
  {
    paramClass = paramEditable.getSpans(0, paramEditable.length(), paramClass);
    if (paramClass.length == 0) {
      return null;
    }
    int i = paramClass.length;
    while (i > 0)
    {
      int j = i - 1;
      if (paramEditable.getSpanFlags(paramClass[j]) == 17) {
        return paramClass[j];
      }
      i -= 1;
    }
    return null;
  }
  
  private void start(Editable paramEditable, Object paramObject)
  {
    int i = paramEditable.length();
    paramEditable.setSpan(paramObject, i, i, 17);
  }
  
  public void handleTag(boolean paramBoolean, String paramString, Editable paramEditable, XMLReader paramXMLReader)
  {
    int i = 10;
    if (paramBoolean)
    {
      if ((paramString.equalsIgnoreCase("ul")) || (paramString.equalsIgnoreCase("li"))) {
        a.b("ul or li hit", new Object[0]);
      }
      if (paramString.equalsIgnoreCase("ul"))
      {
        this.lists.push(paramString);
        return;
      }
      if (paramString.equalsIgnoreCase("ol"))
      {
        this.lists.push(paramString);
        this.olNextIndex.push(Integer.valueOf(1));
        return;
      }
      if (paramString.equalsIgnoreCase("li"))
      {
        if ((paramEditable.length() > 0) && (paramEditable.charAt(paramEditable.length() - 1) != '\n')) {
          paramEditable.append("\n");
        }
        paramString = (String)this.lists.peek();
        if (paramString.equalsIgnoreCase("ol"))
        {
          start(paramEditable, new Ol(null));
          paramEditable.append(((Integer)this.olNextIndex.peek()).toString()).append(". ");
          this.olNextIndex.push(Integer.valueOf(((Integer)this.olNextIndex.pop()).intValue() + 1));
          return;
        }
        if (paramString.equalsIgnoreCase("ul")) {
          start(paramEditable, new Ul(null));
        }
        return;
      }
      if (paramString.equalsIgnoreCase("code"))
      {
        start(paramEditable, new Code(null));
        return;
      }
      if (paramString.equalsIgnoreCase("center"))
      {
        start(paramEditable, new Center(null));
        return;
      }
      if ((paramString.equalsIgnoreCase("s")) || (paramString.equalsIgnoreCase("strike"))) {
        start(paramEditable, new Strike(null));
      }
    }
    else
    {
      if (paramString.equalsIgnoreCase("ul"))
      {
        this.lists.pop();
        return;
      }
      if (paramString.equalsIgnoreCase("ol"))
      {
        this.lists.pop();
        this.olNextIndex.pop();
        return;
      }
      if (paramString.equalsIgnoreCase("li"))
      {
        int j;
        if (((String)this.lists.peek()).equalsIgnoreCase("ul"))
        {
          if ((paramEditable.length() > 0) && (paramEditable.charAt(paramEditable.length() - 1) != '\n')) {
            paramEditable.append("\n");
          }
          if (this.lists.size() > 1)
          {
            j = 10 - bullet.getLeadingMargin(true);
            i = j;
            if (this.lists.size() > 2) {
              i = j - (this.lists.size() - 2) * 20;
            }
          }
          paramString = new BulletSpan(i);
          end(paramEditable, Ul.class, false, new Object[] { new LeadingMarginSpan.Standard((this.lists.size() - 1) * 20), paramString });
          return;
        }
        if (((String)this.lists.peek()).equalsIgnoreCase("ol"))
        {
          if ((paramEditable.length() > 0) && (paramEditable.charAt(paramEditable.length() - 1) != '\n')) {
            paramEditable.append("\n");
          }
          j = (this.lists.size() - 1) * 20;
          i = j;
          if (this.lists.size() > 2) {
            i = j - (this.lists.size() - 2) * 20;
          }
          end(paramEditable, Ol.class, false, new Object[] { new LeadingMarginSpan.Standard(i) });
        }
      }
      else
      {
        if (paramString.equalsIgnoreCase("code"))
        {
          end(paramEditable, Code.class, false, new Object[] { new TypefaceSpan("monospace") });
          return;
        }
        if (paramString.equalsIgnoreCase("center"))
        {
          end(paramEditable, Center.class, true, new Object[] { new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER) });
          return;
        }
        if ((paramString.equalsIgnoreCase("s")) || (paramString.equalsIgnoreCase("strike"))) {
          end(paramEditable, Strike.class, false, new Object[] { new StrikethroughSpan() });
        }
      }
    }
  }
  
  static class Center {}
  
  static class Code {}
  
  static class Ol {}
  
  static class Strike {}
  
  static class Ul {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/HtmlTagHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
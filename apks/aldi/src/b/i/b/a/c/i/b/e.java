package b.i.b.a.c.i.b;

import b.f.b.j;
import java.util.Arrays;

public final class e
  extends m<Character>
{
  public e(char paramChar)
  {
    super(Character.valueOf(paramChar));
  }
  
  public final String toString()
  {
    int k = ((Character)a()).charValue();
    int j = 0;
    char c = ((Character)a()).charValue();
    int i;
    switch (c)
    {
    case '\013': 
    default: 
      int m = (byte)Character.getType(c);
      i = j;
      if (m != 0)
      {
        i = j;
        if (m != 13)
        {
          i = j;
          if (m != 14)
          {
            i = j;
            if (m != 15)
            {
              i = j;
              if (m != 16)
              {
                i = j;
                if (m != 18)
                {
                  i = j;
                  if (m != 19) {
                    i = 1;
                  }
                }
              }
            }
          }
        }
      }
      break;
    case '\r': 
      str = "\\r";
      break;
    case '\f': 
      str = "\\f";
      break;
    case '\n': 
      str = "\\n";
      break;
    case '\t': 
      str = "\\t";
      break;
    case '\b': 
      str = "\\b";
      break;
    }
    if (i != 0) {
      str = Character.toString(c);
    } else {
      str = "?";
    }
    j.a(str, "if (isPrintableUnicode(c…cter.toString(c) else \"?\"");
    String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[] { Integer.valueOf(k), str }, 2));
    j.a(str, "java.lang.String.format(this, *args)");
    return str;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
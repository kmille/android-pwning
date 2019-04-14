package com.google.common.io;

import java.io.IOException;

abstract class h
{
  private StringBuilder a = new StringBuilder();
  private boolean b;
  
  private boolean a(boolean paramBoolean)
    throws IOException
  {
    a(this.a.toString());
    this.a = new StringBuilder();
    this.b = false;
    return paramBoolean;
  }
  
  protected final void a()
    throws IOException
  {
    if ((this.b) || (this.a.length() > 0)) {
      a(false);
    }
  }
  
  protected abstract void a(String paramString)
    throws IOException;
  
  protected final void a(char[] paramArrayOfChar, int paramInt)
    throws IOException
  {
    boolean bool;
    if ((this.b) && (paramInt > 0))
    {
      if (paramArrayOfChar[0] == '\n') {
        bool = true;
      } else {
        bool = false;
      }
      if (a(bool))
      {
        i = 1;
        break label44;
      }
    }
    int i = 0;
    label44:
    int k = paramInt + 0;
    int j = i;
    paramInt = i;
    while (paramInt < k)
    {
      i = paramArrayOfChar[paramInt];
      if (i != 10)
      {
        if (i != 13) {
          break label178;
        }
        this.a.append(paramArrayOfChar, j, paramInt - j);
        this.b = true;
        j = paramInt + 1;
        i = paramInt;
        if (j < k)
        {
          if (paramArrayOfChar[j] == '\n') {
            bool = true;
          } else {
            bool = false;
          }
          i = paramInt;
          if (a(bool)) {
            i = j;
          }
        }
      }
      else
      {
        this.a.append(paramArrayOfChar, j, paramInt - j);
        a(true);
        i = paramInt;
      }
      j = i + 1;
      paramInt = i;
      label178:
      paramInt += 1;
    }
    this.a.append(paramArrayOfChar, j, k - j);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/io/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
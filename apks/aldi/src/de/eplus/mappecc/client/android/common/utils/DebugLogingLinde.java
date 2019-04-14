package de.eplus.mappecc.client.android.common.utils;

import c.a.a.a;

public class DebugLogingLinde
  extends a.a
{
  public String createStackElementTag(StackTraceElement paramStackTraceElement)
  {
    return String.format("[Class:%s][Method:%s] ", new Object[] { super.createStackElementTag(paramStackTraceElement), paramStackTraceElement.getMethodName() });
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/utils/DebugLogingLinde.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
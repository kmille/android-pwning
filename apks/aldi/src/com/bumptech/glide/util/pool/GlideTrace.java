package com.bumptech.glide.util.pool;

public final class GlideTrace
{
  private static final int MAX_LENGTH = 127;
  private static final boolean TRACING_ENABLED = false;
  
  public static void beginSection(String paramString) {}
  
  public static void beginSectionFormat(String paramString, Object paramObject) {}
  
  public static void beginSectionFormat(String paramString, Object paramObject1, Object paramObject2) {}
  
  public static void beginSectionFormat(String paramString, Object paramObject1, Object paramObject2, Object paramObject3) {}
  
  public static void endSection() {}
  
  private static String truncateTag(String paramString)
  {
    String str = paramString;
    if (paramString.length() > 127) {
      str = paramString.substring(0, 126);
    }
    return str;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/util/pool/GlideTrace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
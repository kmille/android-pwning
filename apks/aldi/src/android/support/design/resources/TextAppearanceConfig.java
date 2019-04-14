package android.support.design.resources;

public class TextAppearanceConfig
{
  private static boolean shouldLoadFontSynchronously;
  
  public static void setShouldLoadFontSynchronously(boolean paramBoolean)
  {
    shouldLoadFontSynchronously = paramBoolean;
  }
  
  public static boolean shouldLoadFontSynchronously()
  {
    return shouldLoadFontSynchronously;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/design/resources/TextAppearanceConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
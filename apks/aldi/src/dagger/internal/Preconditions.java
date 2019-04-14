package dagger.internal;

public final class Preconditions
{
  public static <T> T checkNotNull(T paramT)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException();
  }
  
  public static <T> T checkNotNull(T paramT, String paramString)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException(paramString);
  }
  
  public static <T> T checkNotNull(T paramT, String paramString, Object paramObject)
  {
    if (paramT == null)
    {
      if (paramString.contains("%s"))
      {
        if (paramString.indexOf("%s") == paramString.lastIndexOf("%s"))
        {
          if ((paramObject instanceof Class)) {
            paramT = ((Class)paramObject).getCanonicalName();
          } else {
            paramT = String.valueOf(paramObject);
          }
          throw new NullPointerException(paramString.replace("%s", paramT));
        }
        throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
      }
      throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
    }
    return paramT;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/internal/Preconditions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
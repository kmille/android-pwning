package com.google.android.gms.common.images;

public final class Size
{
  private final int zand;
  private final int zane;
  
  public Size(int paramInt1, int paramInt2)
  {
    this.zand = paramInt1;
    this.zane = paramInt2;
  }
  
  public static Size parseSize(String paramString)
    throws NumberFormatException
  {
    int i;
    if (paramString != null)
    {
      int j = paramString.indexOf('*');
      i = j;
      if (j < 0) {
        i = paramString.indexOf('x');
      }
      if (i < 0) {}
    }
    try
    {
      Size localSize = new Size(Integer.parseInt(paramString.substring(0, i)), Integer.parseInt(paramString.substring(i + 1)));
      return localSize;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
    throw zah(paramString);
    throw zah(paramString);
    throw new IllegalArgumentException("string must not be null");
  }
  
  private static NumberFormatException zah(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 16);
    localStringBuilder.append("Invalid Size: \"");
    localStringBuilder.append(paramString);
    localStringBuilder.append("\"");
    throw new NumberFormatException(localStringBuilder.toString());
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof Size))
    {
      paramObject = (Size)paramObject;
      if ((this.zand == ((Size)paramObject).zand) && (this.zane == ((Size)paramObject).zane)) {
        return true;
      }
    }
    return false;
  }
  
  public final int getHeight()
  {
    return this.zane;
  }
  
  public final int getWidth()
  {
    return this.zand;
  }
  
  public final int hashCode()
  {
    return this.zane ^ (this.zand << 16 | this.zand >>> 16);
  }
  
  public final String toString()
  {
    int i = this.zand;
    int j = this.zane;
    StringBuilder localStringBuilder = new StringBuilder(23);
    localStringBuilder.append(i);
    localStringBuilder.append("x");
    localStringBuilder.append(j);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/images/Size.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
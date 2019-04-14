package android.support.v4.graphics.drawable;

import android.support.annotation.RestrictTo;
import androidx.versionedparcelable.a;

@RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY})
public final class IconCompatParcelizer
  extends androidx.core.graphics.drawable.IconCompatParcelizer
{
  public static IconCompat read(a parama)
  {
    return androidx.core.graphics.drawable.IconCompatParcelizer.read(parama);
  }
  
  public static void write(IconCompat paramIconCompat, a parama)
  {
    androidx.core.graphics.drawable.IconCompatParcelizer.write(paramIconCompat, parama);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/graphics/drawable/IconCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
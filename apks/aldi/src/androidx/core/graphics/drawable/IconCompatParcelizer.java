package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.support.annotation.RestrictTo;
import android.support.v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

@RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY})
public class IconCompatParcelizer
{
  public static IconCompat read(a parama)
  {
    IconCompat localIconCompat = new IconCompat();
    localIconCompat.mType = parama.b(localIconCompat.mType, 1);
    localIconCompat.mData = parama.c(localIconCompat.mData);
    localIconCompat.mParcelable = parama.b(localIconCompat.mParcelable, 3);
    localIconCompat.mInt1 = parama.b(localIconCompat.mInt1, 4);
    localIconCompat.mInt2 = parama.b(localIconCompat.mInt2, 5);
    localIconCompat.mTintList = ((ColorStateList)parama.b(localIconCompat.mTintList, 6));
    localIconCompat.mTintModeStr = parama.c(localIconCompat.mTintModeStr);
    localIconCompat.onPostParceling();
    return localIconCompat;
  }
  
  public static void write(IconCompat paramIconCompat, a parama)
  {
    paramIconCompat.onPreParceling(false);
    parama.a(paramIconCompat.mType, 1);
    parama.b(paramIconCompat.mData);
    parama.a(paramIconCompat.mParcelable, 3);
    parama.a(paramIconCompat.mInt1, 4);
    parama.a(paramIconCompat.mInt2, 5);
    parama.a(paramIconCompat.mTintList, 6);
    parama.b(paramIconCompat.mTintModeStr);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/androidx/core/graphics/drawable/IconCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
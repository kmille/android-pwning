package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zaj;
import java.lang.ref.WeakReference;

public final class zac
  extends zaa
{
  private WeakReference<ImageView> zanb;
  
  public zac(ImageView paramImageView, int paramInt)
  {
    super(null, paramInt);
    Asserts.checkNotNull(paramImageView);
    this.zanb = new WeakReference(paramImageView);
  }
  
  public zac(ImageView paramImageView, Uri paramUri)
  {
    super(paramUri, 0);
    Asserts.checkNotNull(paramImageView);
    this.zanb = new WeakReference(paramImageView);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zac)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    Object localObject = (zac)paramObject;
    paramObject = (ImageView)this.zanb.get();
    localObject = (ImageView)((zac)localObject).zanb.get();
    return (localObject != null) && (paramObject != null) && (Objects.equal(localObject, paramObject));
  }
  
  public final int hashCode()
  {
    return 0;
  }
  
  protected final void zaa(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    ImageView localImageView = (ImageView)this.zanb.get();
    if (localImageView != null)
    {
      int j = 0;
      int i;
      if ((!paramBoolean2) && (!paramBoolean3)) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i != 0) && ((localImageView instanceof zaj)))
      {
        int k = zaj.zach();
        if ((this.zamw != 0) && (k == this.zamw)) {}
      }
      else
      {
        paramBoolean1 = zaa(paramBoolean1, paramBoolean2);
        Object localObject2 = null;
        Object localObject1 = paramDrawable;
        if (paramBoolean1)
        {
          Drawable localDrawable = localImageView.getDrawable();
          if (localDrawable != null)
          {
            localObject1 = localDrawable;
            if ((localDrawable instanceof zae)) {
              localObject1 = ((zae)localDrawable).zacf();
            }
          }
          else
          {
            localObject1 = null;
          }
          localObject1 = new zae((Drawable)localObject1, paramDrawable);
        }
        localImageView.setImageDrawable((Drawable)localObject1);
        if ((localImageView instanceof zaj))
        {
          paramDrawable = (Drawable)localObject2;
          if (paramBoolean3) {
            paramDrawable = this.zamu.uri;
          }
          zaj.zaa(paramDrawable);
          if (i != 0) {
            j = this.zamw;
          }
          zaj.zai(j);
        }
        if (paramBoolean1) {
          ((zae)localObject1).startTransition(250);
        }
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/images/zac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
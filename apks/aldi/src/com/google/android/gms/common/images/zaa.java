package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;

public abstract class zaa
{
  final zab zamu;
  private int zamv = 0;
  protected int zamw = 0;
  private boolean zamx = false;
  private boolean zamy = true;
  private boolean zamz = false;
  private boolean zana = true;
  
  public zaa(Uri paramUri, int paramInt)
  {
    this.zamu = new zab(paramUri);
    this.zamw = paramInt;
  }
  
  final void zaa(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    Asserts.checkNotNull(paramBitmap);
    zaa(new BitmapDrawable(paramContext.getResources(), paramBitmap), paramBoolean, false, true);
  }
  
  final void zaa(Context paramContext, zak paramzak)
  {
    if (this.zana) {
      zaa(null, false, true, false);
    }
  }
  
  final void zaa(Context paramContext, zak paramzak, boolean paramBoolean)
  {
    if (this.zamw != 0)
    {
      int i = this.zamw;
      paramContext = paramContext.getResources().getDrawable(i);
    }
    else
    {
      paramContext = null;
    }
    zaa(paramContext, paramBoolean, false, false);
  }
  
  protected abstract void zaa(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);
  
  protected final boolean zaa(boolean paramBoolean1, boolean paramBoolean2)
  {
    return (this.zamy) && (!paramBoolean2) && (!paramBoolean1);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/images/zaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
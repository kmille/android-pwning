package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;

public class UnitDrawableDecoder
  implements ResourceDecoder<Drawable, Drawable>
{
  @Nullable
  public Resource<Drawable> decode(@NonNull Drawable paramDrawable, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    return NonOwnedDrawableResource.newInstance(paramDrawable);
  }
  
  public boolean handles(@NonNull Drawable paramDrawable, @NonNull Options paramOptions)
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/drawable/UnitDrawableDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
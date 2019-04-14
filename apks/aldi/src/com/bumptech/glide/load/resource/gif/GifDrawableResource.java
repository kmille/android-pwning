package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.resource.drawable.DrawableResource;

public class GifDrawableResource
  extends DrawableResource<GifDrawable>
  implements Initializable
{
  public GifDrawableResource(GifDrawable paramGifDrawable)
  {
    super(paramGifDrawable);
  }
  
  @NonNull
  public Class<GifDrawable> getResourceClass()
  {
    return GifDrawable.class;
  }
  
  public int getSize()
  {
    return ((GifDrawable)this.drawable).getSize();
  }
  
  public void initialize()
  {
    ((GifDrawable)this.drawable).getFirstFrame().prepareToDraw();
  }
  
  public void recycle()
  {
    ((GifDrawable)this.drawable).stop();
    ((GifDrawable)this.drawable).recycle();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/gif/GifDrawableResource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
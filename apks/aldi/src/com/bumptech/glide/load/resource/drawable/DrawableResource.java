package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.Preconditions;

public abstract class DrawableResource<T extends Drawable>
  implements Initializable, Resource<T>
{
  protected final T drawable;
  
  public DrawableResource(T paramT)
  {
    this.drawable = ((Drawable)Preconditions.checkNotNull(paramT));
  }
  
  @NonNull
  public final T get()
  {
    Drawable.ConstantState localConstantState = this.drawable.getConstantState();
    if (localConstantState == null) {
      return this.drawable;
    }
    return localConstantState.newDrawable();
  }
  
  public void initialize()
  {
    if ((this.drawable instanceof BitmapDrawable))
    {
      ((BitmapDrawable)this.drawable).getBitmap().prepareToDraw();
      return;
    }
    if ((this.drawable instanceof GifDrawable)) {
      ((GifDrawable)this.drawable).getFirstFrame().prepareToDraw();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/drawable/DrawableResource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
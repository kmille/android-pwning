package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.Log;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import java.util.concurrent.locks.Lock;

final class DrawableToBitmapConverter
{
  private static final BitmapPool NO_RECYCLE_BITMAP_POOL = new BitmapPoolAdapter()
  {
    public void put(Bitmap paramAnonymousBitmap) {}
  };
  private static final String TAG = "DrawableToBitmap";
  
  @Nullable
  static Resource<Bitmap> convert(BitmapPool paramBitmapPool, Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    paramDrawable = paramDrawable.getCurrent();
    boolean bool = paramDrawable instanceof BitmapDrawable;
    int i = 0;
    if (bool)
    {
      paramDrawable = ((BitmapDrawable)paramDrawable).getBitmap();
      paramInt1 = i;
    }
    else if (!(paramDrawable instanceof Animatable))
    {
      paramDrawable = drawToBitmap(paramBitmapPool, paramDrawable, paramInt1, paramInt2);
      paramInt1 = 1;
    }
    else
    {
      paramDrawable = null;
      paramInt1 = i;
    }
    if (paramInt1 == 0) {
      paramBitmapPool = NO_RECYCLE_BITMAP_POOL;
    }
    return BitmapResource.obtain(paramDrawable, paramBitmapPool);
  }
  
  @Nullable
  private static Bitmap drawToBitmap(BitmapPool paramBitmapPool, Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    if ((paramInt1 == Integer.MIN_VALUE) && (paramDrawable.getIntrinsicWidth() <= 0))
    {
      if (Log.isLoggable("DrawableToBitmap", 5))
      {
        paramBitmapPool = new StringBuilder("Unable to draw ");
        paramBitmapPool.append(paramDrawable);
        paramBitmapPool.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
      }
      return null;
    }
    if ((paramInt2 == Integer.MIN_VALUE) && (paramDrawable.getIntrinsicHeight() <= 0))
    {
      if (Log.isLoggable("DrawableToBitmap", 5))
      {
        paramBitmapPool = new StringBuilder("Unable to draw ");
        paramBitmapPool.append(paramDrawable);
        paramBitmapPool.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
      }
      return null;
    }
    if (paramDrawable.getIntrinsicWidth() > 0) {
      paramInt1 = paramDrawable.getIntrinsicWidth();
    }
    if (paramDrawable.getIntrinsicHeight() > 0) {
      paramInt2 = paramDrawable.getIntrinsicHeight();
    }
    Lock localLock = TransformationUtils.getBitmapDrawableLock();
    localLock.lock();
    paramBitmapPool = paramBitmapPool.get(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    try
    {
      Canvas localCanvas = new Canvas(paramBitmapPool);
      paramDrawable.setBounds(0, 0, paramInt1, paramInt2);
      paramDrawable.draw(localCanvas);
      localCanvas.setBitmap(null);
      return paramBitmapPool;
    }
    finally
    {
      localLock.unlock();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/DrawableToBitmapConverter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
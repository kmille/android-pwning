package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.view.Gravity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.nio.ByteBuffer;

public class GifDrawable
  extends Drawable
  implements Animatable, GifFrameLoader.FrameCallback
{
  private static final int GRAVITY = 119;
  public static final int LOOP_FOREVER = -1;
  public static final int LOOP_INTRINSIC = 0;
  private boolean applyGravity;
  private Rect destRect;
  private boolean isRecycled;
  private boolean isRunning;
  private boolean isStarted;
  private boolean isVisible = true;
  private int loopCount;
  private int maxLoopCount = -1;
  private Paint paint;
  private final GifState state;
  
  public GifDrawable(Context paramContext, GifDecoder paramGifDecoder, Transformation<Bitmap> paramTransformation, int paramInt1, int paramInt2, Bitmap paramBitmap)
  {
    this(new GifState(new GifFrameLoader(Glide.get(paramContext), paramGifDecoder, paramInt1, paramInt2, paramTransformation, paramBitmap)));
  }
  
  @Deprecated
  public GifDrawable(Context paramContext, GifDecoder paramGifDecoder, BitmapPool paramBitmapPool, Transformation<Bitmap> paramTransformation, int paramInt1, int paramInt2, Bitmap paramBitmap)
  {
    this(paramContext, paramGifDecoder, paramTransformation, paramInt1, paramInt2, paramBitmap);
  }
  
  GifDrawable(GifState paramGifState)
  {
    this.state = ((GifState)Preconditions.checkNotNull(paramGifState));
  }
  
  @VisibleForTesting
  GifDrawable(GifFrameLoader paramGifFrameLoader, Paint paramPaint)
  {
    this(new GifState(paramGifFrameLoader));
    this.paint = paramPaint;
  }
  
  private Drawable.Callback findCallback()
  {
    for (Drawable.Callback localCallback = getCallback(); (localCallback instanceof Drawable); localCallback = ((Drawable)localCallback).getCallback()) {}
    return localCallback;
  }
  
  private Rect getDestRect()
  {
    if (this.destRect == null) {
      this.destRect = new Rect();
    }
    return this.destRect;
  }
  
  private Paint getPaint()
  {
    if (this.paint == null) {
      this.paint = new Paint(2);
    }
    return this.paint;
  }
  
  private void resetLoopCount()
  {
    this.loopCount = 0;
  }
  
  private void startRunning()
  {
    Preconditions.checkArgument(this.isRecycled ^ true, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
    if (this.state.frameLoader.getFrameCount() == 1)
    {
      invalidateSelf();
      return;
    }
    if (!this.isRunning)
    {
      this.isRunning = true;
      this.state.frameLoader.subscribe(this);
      invalidateSelf();
    }
  }
  
  private void stopRunning()
  {
    this.isRunning = false;
    this.state.frameLoader.unsubscribe(this);
  }
  
  public void draw(@NonNull Canvas paramCanvas)
  {
    if (this.isRecycled) {
      return;
    }
    if (this.applyGravity)
    {
      Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), getDestRect());
      this.applyGravity = false;
    }
    paramCanvas.drawBitmap(this.state.frameLoader.getCurrentFrame(), null, getDestRect(), getPaint());
  }
  
  public ByteBuffer getBuffer()
  {
    return this.state.frameLoader.getBuffer();
  }
  
  public Drawable.ConstantState getConstantState()
  {
    return this.state;
  }
  
  public Bitmap getFirstFrame()
  {
    return this.state.frameLoader.getFirstFrame();
  }
  
  public int getFrameCount()
  {
    return this.state.frameLoader.getFrameCount();
  }
  
  public int getFrameIndex()
  {
    return this.state.frameLoader.getCurrentIndex();
  }
  
  public Transformation<Bitmap> getFrameTransformation()
  {
    return this.state.frameLoader.getFrameTransformation();
  }
  
  public int getIntrinsicHeight()
  {
    return this.state.frameLoader.getHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return this.state.frameLoader.getWidth();
  }
  
  public int getOpacity()
  {
    return -2;
  }
  
  public int getSize()
  {
    return this.state.frameLoader.getSize();
  }
  
  boolean isRecycled()
  {
    return this.isRecycled;
  }
  
  public boolean isRunning()
  {
    return this.isRunning;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.applyGravity = true;
  }
  
  public void onFrameReady()
  {
    if (findCallback() == null)
    {
      stop();
      invalidateSelf();
      return;
    }
    invalidateSelf();
    if (getFrameIndex() == getFrameCount() - 1) {
      this.loopCount += 1;
    }
    if ((this.maxLoopCount != -1) && (this.loopCount >= this.maxLoopCount)) {
      stop();
    }
  }
  
  public void recycle()
  {
    this.isRecycled = true;
    this.state.frameLoader.clear();
  }
  
  public void setAlpha(int paramInt)
  {
    getPaint().setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    getPaint().setColorFilter(paramColorFilter);
  }
  
  public void setFrameTransformation(Transformation<Bitmap> paramTransformation, Bitmap paramBitmap)
  {
    this.state.frameLoader.setFrameTransformation(paramTransformation, paramBitmap);
  }
  
  void setIsRunning(boolean paramBoolean)
  {
    this.isRunning = paramBoolean;
  }
  
  public void setLoopCount(int paramInt)
  {
    if ((paramInt <= 0) && (paramInt != -1) && (paramInt != 0)) {
      throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
    }
    if (paramInt == 0)
    {
      int i = this.state.frameLoader.getLoopCount();
      paramInt = i;
      if (i == 0) {
        paramInt = -1;
      }
      this.maxLoopCount = paramInt;
      return;
    }
    this.maxLoopCount = paramInt;
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    Preconditions.checkArgument(this.isRecycled ^ true, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
    this.isVisible = paramBoolean1;
    if (!paramBoolean1) {
      stopRunning();
    } else if (this.isStarted) {
      startRunning();
    }
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void start()
  {
    this.isStarted = true;
    resetLoopCount();
    if (this.isVisible) {
      startRunning();
    }
  }
  
  public void startFromFirstFrame()
  {
    Preconditions.checkArgument(this.isRunning ^ true, "You cannot restart a currently running animation.");
    this.state.frameLoader.setNextStartFromFirstFrame();
    start();
  }
  
  public void stop()
  {
    this.isStarted = false;
    stopRunning();
  }
  
  static final class GifState
    extends Drawable.ConstantState
  {
    @VisibleForTesting
    final GifFrameLoader frameLoader;
    
    GifState(GifFrameLoader paramGifFrameLoader)
    {
      this.frameLoader = paramGifFrameLoader;
    }
    
    public final int getChangingConfigurations()
    {
      return 0;
    }
    
    @NonNull
    public final Drawable newDrawable()
    {
      return new GifDrawable(this);
    }
    
    @NonNull
    public final Drawable newDrawable(Resources paramResources)
    {
      return newDrawable();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/gif/GifDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
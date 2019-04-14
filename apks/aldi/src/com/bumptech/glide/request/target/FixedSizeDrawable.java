package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import com.bumptech.glide.util.Preconditions;

public class FixedSizeDrawable
  extends Drawable
{
  private final RectF bounds;
  private final Matrix matrix;
  private boolean mutated;
  private State state;
  private Drawable wrapped;
  private final RectF wrappedRect;
  
  public FixedSizeDrawable(Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    this(new State(paramDrawable.getConstantState(), paramInt1, paramInt2), paramDrawable);
  }
  
  FixedSizeDrawable(State paramState, Drawable paramDrawable)
  {
    this.state = ((State)Preconditions.checkNotNull(paramState));
    this.wrapped = ((Drawable)Preconditions.checkNotNull(paramDrawable));
    paramDrawable.setBounds(0, 0, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
    this.matrix = new Matrix();
    this.wrappedRect = new RectF(0.0F, 0.0F, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
    this.bounds = new RectF();
  }
  
  private void updateMatrix()
  {
    this.matrix.setRectToRect(this.wrappedRect, this.bounds, Matrix.ScaleToFit.CENTER);
  }
  
  public void clearColorFilter()
  {
    this.wrapped.clearColorFilter();
  }
  
  public void draw(@NonNull Canvas paramCanvas)
  {
    paramCanvas.save();
    paramCanvas.concat(this.matrix);
    this.wrapped.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  @RequiresApi(19)
  public int getAlpha()
  {
    return this.wrapped.getAlpha();
  }
  
  public Drawable.Callback getCallback()
  {
    return this.wrapped.getCallback();
  }
  
  public int getChangingConfigurations()
  {
    return this.wrapped.getChangingConfigurations();
  }
  
  public Drawable.ConstantState getConstantState()
  {
    return this.state;
  }
  
  @NonNull
  public Drawable getCurrent()
  {
    return this.wrapped.getCurrent();
  }
  
  public int getIntrinsicHeight()
  {
    return this.state.height;
  }
  
  public int getIntrinsicWidth()
  {
    return this.state.width;
  }
  
  public int getMinimumHeight()
  {
    return this.wrapped.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    return this.wrapped.getMinimumWidth();
  }
  
  public int getOpacity()
  {
    return this.wrapped.getOpacity();
  }
  
  public boolean getPadding(@NonNull Rect paramRect)
  {
    return this.wrapped.getPadding(paramRect);
  }
  
  public void invalidateSelf()
  {
    super.invalidateSelf();
    this.wrapped.invalidateSelf();
  }
  
  @NonNull
  public Drawable mutate()
  {
    if ((!this.mutated) && (super.mutate() == this))
    {
      this.wrapped = this.wrapped.mutate();
      this.state = new State(this.state);
      this.mutated = true;
    }
    return this;
  }
  
  public void scheduleSelf(@NonNull Runnable paramRunnable, long paramLong)
  {
    super.scheduleSelf(paramRunnable, paramLong);
    this.wrapped.scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    this.wrapped.setAlpha(paramInt);
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    this.bounds.set(paramInt1, paramInt2, paramInt3, paramInt4);
    updateMatrix();
  }
  
  public void setBounds(@NonNull Rect paramRect)
  {
    super.setBounds(paramRect);
    this.bounds.set(paramRect);
    updateMatrix();
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    this.wrapped.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(int paramInt, @NonNull PorterDuff.Mode paramMode)
  {
    this.wrapped.setColorFilter(paramInt, paramMode);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.wrapped.setColorFilter(paramColorFilter);
  }
  
  @Deprecated
  public void setDither(boolean paramBoolean)
  {
    this.wrapped.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    this.wrapped.setFilterBitmap(paramBoolean);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    return this.wrapped.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void unscheduleSelf(@NonNull Runnable paramRunnable)
  {
    super.unscheduleSelf(paramRunnable);
    this.wrapped.unscheduleSelf(paramRunnable);
  }
  
  static final class State
    extends Drawable.ConstantState
  {
    final int height;
    final int width;
    private final Drawable.ConstantState wrapped;
    
    State(Drawable.ConstantState paramConstantState, int paramInt1, int paramInt2)
    {
      this.wrapped = paramConstantState;
      this.width = paramInt1;
      this.height = paramInt2;
    }
    
    State(State paramState)
    {
      this(paramState.wrapped, paramState.width, paramState.height);
    }
    
    public final int getChangingConfigurations()
    {
      return 0;
    }
    
    @NonNull
    public final Drawable newDrawable()
    {
      return new FixedSizeDrawable(this, this.wrapped.newDrawable());
    }
    
    @NonNull
    public final Drawable newDrawable(Resources paramResources)
    {
      return new FixedSizeDrawable(this, this.wrapped.newDrawable(paramResources));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/target/FixedSizeDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
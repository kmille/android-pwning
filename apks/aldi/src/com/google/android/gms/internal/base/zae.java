package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;

public final class zae
  extends Drawable
  implements Drawable.Callback
{
  private int mAlpha = 0;
  private int mFrom;
  private boolean zamy = true;
  private int zang = 0;
  private long zanh;
  private int zani;
  private int zanj = 255;
  private int zank;
  private boolean zanl;
  private zai zanm;
  private Drawable zann;
  private Drawable zano;
  private boolean zanp;
  private boolean zanq;
  private boolean zanr;
  private int zans;
  
  public zae(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    this(null);
    Object localObject = paramDrawable1;
    if (paramDrawable1 == null) {
      localObject = zag.zacg();
    }
    this.zann = ((Drawable)localObject);
    ((Drawable)localObject).setCallback(this);
    paramDrawable1 = this.zanm;
    int i = paramDrawable1.zanv;
    paramDrawable1.zanv = (((Drawable)localObject).getChangingConfigurations() | i);
    paramDrawable1 = paramDrawable2;
    if (paramDrawable2 == null) {
      paramDrawable1 = zag.zacg();
    }
    this.zano = paramDrawable1;
    paramDrawable1.setCallback(this);
    paramDrawable2 = this.zanm;
    i = paramDrawable2.zanv;
    paramDrawable2.zanv = (paramDrawable1.getChangingConfigurations() | i);
  }
  
  zae(zai paramzai)
  {
    this.zanm = new zai(paramzai);
  }
  
  private final boolean canConstantState()
  {
    if (!this.zanp)
    {
      boolean bool;
      if ((this.zann.getConstantState() != null) && (this.zano.getConstantState() != null)) {
        bool = true;
      } else {
        bool = false;
      }
      this.zanq = bool;
      this.zanp = true;
    }
    return this.zanq;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    int k = this.zang;
    int i = 1;
    int j = 1;
    switch (k)
    {
    default: 
      break;
    case 2: 
      if (this.zanh >= 0L)
      {
        float f = (float)(SystemClock.uptimeMillis() - this.zanh) / this.zank;
        if (f >= 1.0F) {
          i = j;
        } else {
          i = 0;
        }
        if (i != 0) {
          this.zang = 0;
        }
        f = Math.min(f, 1.0F);
        this.mAlpha = ((int)(this.zani * f + 0.0F));
      }
      break;
    case 1: 
      this.zanh = SystemClock.uptimeMillis();
      this.zang = 2;
      i = 0;
    }
    j = this.mAlpha;
    boolean bool = this.zamy;
    Drawable localDrawable1 = this.zann;
    Drawable localDrawable2 = this.zano;
    if (i != 0)
    {
      if ((!bool) || (j == 0)) {
        localDrawable1.draw(paramCanvas);
      }
      if (j == this.zanj)
      {
        localDrawable2.setAlpha(this.zanj);
        localDrawable2.draw(paramCanvas);
      }
      return;
    }
    if (bool) {
      localDrawable1.setAlpha(this.zanj - j);
    }
    localDrawable1.draw(paramCanvas);
    if (bool) {
      localDrawable1.setAlpha(this.zanj);
    }
    if (j > 0)
    {
      localDrawable2.setAlpha(j);
      localDrawable2.draw(paramCanvas);
      localDrawable2.setAlpha(this.zanj);
    }
    invalidateSelf();
  }
  
  public final int getChangingConfigurations()
  {
    return super.getChangingConfigurations() | this.zanm.mChangingConfigurations | this.zanm.zanv;
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    if (canConstantState())
    {
      this.zanm.mChangingConfigurations = getChangingConfigurations();
      return this.zanm;
    }
    return null;
  }
  
  public final int getIntrinsicHeight()
  {
    return Math.max(this.zann.getIntrinsicHeight(), this.zano.getIntrinsicHeight());
  }
  
  public final int getIntrinsicWidth()
  {
    return Math.max(this.zann.getIntrinsicWidth(), this.zano.getIntrinsicWidth());
  }
  
  public final int getOpacity()
  {
    if (!this.zanr)
    {
      this.zans = Drawable.resolveOpacity(this.zann.getOpacity(), this.zano.getOpacity());
      this.zanr = true;
    }
    return this.zans;
  }
  
  public final void invalidateDrawable(Drawable paramDrawable)
  {
    paramDrawable = getCallback();
    if (paramDrawable != null) {
      paramDrawable.invalidateDrawable(this);
    }
  }
  
  public final Drawable mutate()
  {
    if ((!this.zanl) && (super.mutate() == this))
    {
      if (canConstantState())
      {
        this.zann.mutate();
        this.zano.mutate();
        this.zanl = true;
        return this;
      }
      throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
    }
    return this;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    this.zann.setBounds(paramRect);
    this.zano.setBounds(paramRect);
  }
  
  public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    paramDrawable = getCallback();
    if (paramDrawable != null) {
      paramDrawable.scheduleDrawable(this, paramRunnable, paramLong);
    }
  }
  
  public final void setAlpha(int paramInt)
  {
    if (this.mAlpha == this.zanj) {
      this.mAlpha = paramInt;
    }
    this.zanj = paramInt;
    invalidateSelf();
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.zann.setColorFilter(paramColorFilter);
    this.zano.setColorFilter(paramColorFilter);
  }
  
  public final void startTransition(int paramInt)
  {
    this.mFrom = 0;
    this.zani = this.zanj;
    this.mAlpha = 0;
    this.zank = 250;
    this.zang = 1;
    invalidateSelf();
  }
  
  public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    paramDrawable = getCallback();
    if (paramDrawable != null) {
      paramDrawable.unscheduleDrawable(this, paramRunnable);
    }
  }
  
  public final Drawable zacf()
  {
    return this.zano;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/base/zae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.widget.EdgeEffect;

public final class EdgeEffectCompat
{
  private EdgeEffect mEdgeEffect;
  
  @Deprecated
  public EdgeEffectCompat(Context paramContext)
  {
    this.mEdgeEffect = new EdgeEffect(paramContext);
  }
  
  public static void onPull(@NonNull EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramEdgeEffect.onPull(paramFloat1, paramFloat2);
      return;
    }
    paramEdgeEffect.onPull(paramFloat1);
  }
  
  @Deprecated
  public final boolean draw(Canvas paramCanvas)
  {
    return this.mEdgeEffect.draw(paramCanvas);
  }
  
  @Deprecated
  public final void finish()
  {
    this.mEdgeEffect.finish();
  }
  
  @Deprecated
  public final boolean isFinished()
  {
    return this.mEdgeEffect.isFinished();
  }
  
  @Deprecated
  public final boolean onAbsorb(int paramInt)
  {
    this.mEdgeEffect.onAbsorb(paramInt);
    return true;
  }
  
  @Deprecated
  public final boolean onPull(float paramFloat)
  {
    this.mEdgeEffect.onPull(paramFloat);
    return true;
  }
  
  @Deprecated
  public final boolean onPull(float paramFloat1, float paramFloat2)
  {
    onPull(this.mEdgeEffect, paramFloat1, paramFloat2);
    return true;
  }
  
  @Deprecated
  public final boolean onRelease()
  {
    this.mEdgeEffect.onRelease();
    return this.mEdgeEffect.isFinished();
  }
  
  @Deprecated
  public final void setSize(int paramInt1, int paramInt2)
  {
    this.mEdgeEffect.setSize(paramInt1, paramInt2);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/widget/EdgeEffectCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package de.eplus.mappecc.client.android.common.component.seekbarview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;

public class SeekBarView
  extends AppCompatSeekBar
{
  private Bitmap bitmap = BitmapFactory.decodeResource(getResources(), 2131165328);
  private DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
  private Paint paint = new Paint();
  
  public SeekBarView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public SeekBarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public SeekBarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  void init()
  {
    setPadding((int)(this.displayMetrics.density * 50.0F), (int)(this.displayMetrics.density * 40.0F), (int)(this.displayMetrics.density * 50.0F), (int)(this.displayMetrics.density * 5.0F));
    this.paint.setColor(ContextCompat.getColor(getContext(), 2131034284));
    this.paint.setTextSize(this.displayMetrics.density * 12.0F);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    float f1 = getThumb().getBounds().centerX();
    float f2 = getThumb().getBounds().centerY();
    paramCanvas.drawBitmap(this.bitmap, f1 - this.displayMetrics.density * 5.0F, f2 - this.displayMetrics.density * 5.0F, this.paint);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getProgress());
    localStringBuilder.append(" MB");
    paramCanvas.drawText(localStringBuilder.toString(), f1 + this.displayMetrics.density * 15.0F, f2 + this.displayMetrics.density * 10.0F, this.paint);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    Paint localPaint;
    if (paramMotionEvent.getAction() == 2)
    {
      this.bitmap = BitmapFactory.decodeResource(getResources(), 2131165327);
      localPaint = this.paint;
    }
    for (int i = -1;; i = ContextCompat.getColor(getContext(), 2131034284))
    {
      localPaint.setColor(i);
      break;
      this.bitmap = BitmapFactory.decodeResource(getResources(), 2131165328);
      localPaint = this.paint;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/seekbarview/SeekBarView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
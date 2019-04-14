package android.support.design.shape;

import android.support.design.internal.Experimental;

@Experimental("The shapes API is currently experimental and subject to change")
public class CutCornerTreatment
  extends CornerTreatment
{
  private final float size;
  
  public CutCornerTreatment(float paramFloat)
  {
    this.size = paramFloat;
  }
  
  public void getCornerPath(float paramFloat1, float paramFloat2, ShapePath paramShapePath)
  {
    paramShapePath.reset(0.0F, this.size * paramFloat2);
    double d2 = paramFloat1;
    double d3 = Math.sin(d2);
    double d4 = this.size;
    Double.isNaN(d4);
    double d1 = paramFloat2;
    Double.isNaN(d1);
    paramFloat1 = (float)(d3 * d4 * d1);
    d2 = Math.cos(d2);
    d3 = this.size;
    Double.isNaN(d3);
    Double.isNaN(d1);
    paramShapePath.lineTo(paramFloat1, (float)(d2 * d3 * d1));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/design/shape/CutCornerTreatment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
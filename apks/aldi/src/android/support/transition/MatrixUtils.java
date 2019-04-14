package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;

class MatrixUtils
{
  static final Matrix IDENTITY_MATRIX = new Matrix()
  {
    final void oops()
    {
      throw new IllegalStateException("Matrix can not be modified");
    }
    
    public final boolean postConcat(Matrix paramAnonymousMatrix)
    {
      oops();
      return false;
    }
    
    public final boolean postRotate(float paramAnonymousFloat)
    {
      oops();
      return false;
    }
    
    public final boolean postRotate(float paramAnonymousFloat1, float paramAnonymousFloat2, float paramAnonymousFloat3)
    {
      oops();
      return false;
    }
    
    public final boolean postScale(float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      oops();
      return false;
    }
    
    public final boolean postScale(float paramAnonymousFloat1, float paramAnonymousFloat2, float paramAnonymousFloat3, float paramAnonymousFloat4)
    {
      oops();
      return false;
    }
    
    public final boolean postSkew(float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      oops();
      return false;
    }
    
    public final boolean postSkew(float paramAnonymousFloat1, float paramAnonymousFloat2, float paramAnonymousFloat3, float paramAnonymousFloat4)
    {
      oops();
      return false;
    }
    
    public final boolean postTranslate(float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      oops();
      return false;
    }
    
    public final boolean preConcat(Matrix paramAnonymousMatrix)
    {
      oops();
      return false;
    }
    
    public final boolean preRotate(float paramAnonymousFloat)
    {
      oops();
      return false;
    }
    
    public final boolean preRotate(float paramAnonymousFloat1, float paramAnonymousFloat2, float paramAnonymousFloat3)
    {
      oops();
      return false;
    }
    
    public final boolean preScale(float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      oops();
      return false;
    }
    
    public final boolean preScale(float paramAnonymousFloat1, float paramAnonymousFloat2, float paramAnonymousFloat3, float paramAnonymousFloat4)
    {
      oops();
      return false;
    }
    
    public final boolean preSkew(float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      oops();
      return false;
    }
    
    public final boolean preSkew(float paramAnonymousFloat1, float paramAnonymousFloat2, float paramAnonymousFloat3, float paramAnonymousFloat4)
    {
      oops();
      return false;
    }
    
    public final boolean preTranslate(float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      oops();
      return false;
    }
    
    public final void reset()
    {
      oops();
    }
    
    public final void set(Matrix paramAnonymousMatrix)
    {
      oops();
    }
    
    public final boolean setConcat(Matrix paramAnonymousMatrix1, Matrix paramAnonymousMatrix2)
    {
      oops();
      return false;
    }
    
    public final boolean setPolyToPoly(float[] paramAnonymousArrayOfFloat1, int paramAnonymousInt1, float[] paramAnonymousArrayOfFloat2, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      oops();
      return false;
    }
    
    public final boolean setRectToRect(RectF paramAnonymousRectF1, RectF paramAnonymousRectF2, Matrix.ScaleToFit paramAnonymousScaleToFit)
    {
      oops();
      return false;
    }
    
    public final void setRotate(float paramAnonymousFloat)
    {
      oops();
    }
    
    public final void setRotate(float paramAnonymousFloat1, float paramAnonymousFloat2, float paramAnonymousFloat3)
    {
      oops();
    }
    
    public final void setScale(float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      oops();
    }
    
    public final void setScale(float paramAnonymousFloat1, float paramAnonymousFloat2, float paramAnonymousFloat3, float paramAnonymousFloat4)
    {
      oops();
    }
    
    public final void setSinCos(float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      oops();
    }
    
    public final void setSinCos(float paramAnonymousFloat1, float paramAnonymousFloat2, float paramAnonymousFloat3, float paramAnonymousFloat4)
    {
      oops();
    }
    
    public final void setSkew(float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      oops();
    }
    
    public final void setSkew(float paramAnonymousFloat1, float paramAnonymousFloat2, float paramAnonymousFloat3, float paramAnonymousFloat4)
    {
      oops();
    }
    
    public final void setTranslate(float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      oops();
    }
    
    public final void setValues(float[] paramAnonymousArrayOfFloat)
    {
      oops();
    }
  };
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/transition/MatrixUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
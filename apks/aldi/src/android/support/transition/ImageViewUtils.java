package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ImageViewUtils
{
  private static final String TAG = "ImageViewUtils";
  private static Method sAnimateTransformMethod;
  private static boolean sAnimateTransformMethodFetched;
  
  static void animateTransform(ImageView paramImageView, Matrix paramMatrix)
  {
    if (Build.VERSION.SDK_INT < 21)
    {
      paramImageView.setImageMatrix(paramMatrix);
      return;
    }
    fetchAnimateTransformMethod();
    if (sAnimateTransformMethod != null) {}
    try
    {
      sAnimateTransformMethod.invoke(paramImageView, new Object[] { paramMatrix });
      return;
    }
    catch (InvocationTargetException paramImageView)
    {
      throw new RuntimeException(paramImageView.getCause());
      return;
    }
    catch (IllegalAccessException paramImageView) {}
  }
  
  private static void fetchAnimateTransformMethod()
  {
    if (!sAnimateTransformMethodFetched) {}
    try
    {
      Method localMethod = ImageView.class.getDeclaredMethod("animateTransform", new Class[] { Matrix.class });
      sAnimateTransformMethod = localMethod;
      localMethod.setAccessible(true);
      sAnimateTransformMethodFetched = true;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  static void reserveEndAnimateTransform(ImageView paramImageView, Animator paramAnimator)
  {
    if (Build.VERSION.SDK_INT < 21) {
      paramAnimator.addListener(new AnimatorListenerAdapter()
      {
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          ImageView.ScaleType localScaleType = (ImageView.ScaleType)this.val$view.getTag(R.id.save_scale_type);
          this.val$view.setScaleType(localScaleType);
          this.val$view.setTag(R.id.save_scale_type, null);
          if (localScaleType == ImageView.ScaleType.MATRIX)
          {
            this.val$view.setImageMatrix((Matrix)this.val$view.getTag(R.id.save_image_matrix));
            this.val$view.setTag(R.id.save_image_matrix, null);
          }
          paramAnonymousAnimator.removeListener(this);
        }
      });
    }
  }
  
  static void startAnimateTransform(ImageView paramImageView)
  {
    if (Build.VERSION.SDK_INT < 21)
    {
      ImageView.ScaleType localScaleType = paramImageView.getScaleType();
      paramImageView.setTag(R.id.save_scale_type, localScaleType);
      if (localScaleType == ImageView.ScaleType.MATRIX) {
        paramImageView.setTag(R.id.save_image_matrix, paramImageView.getImageMatrix());
      } else {
        paramImageView.setScaleType(ImageView.ScaleType.MATRIX);
      }
      paramImageView.setImageMatrix(MatrixUtils.IDENTITY_MATRIX);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/transition/ImageViewUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
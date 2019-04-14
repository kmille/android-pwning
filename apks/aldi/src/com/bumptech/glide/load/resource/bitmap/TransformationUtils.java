package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class TransformationUtils
{
  private static final Lock BITMAP_DRAWABLE_LOCK;
  private static final Paint CIRCLE_CROP_BITMAP_PAINT;
  private static final int CIRCLE_CROP_PAINT_FLAGS = 7;
  private static final Paint CIRCLE_CROP_SHAPE_PAINT;
  private static final Paint DEFAULT_PAINT = new Paint(6);
  private static final Set<String> MODELS_REQUIRING_BITMAP_LOCK;
  public static final int PAINT_FLAGS = 6;
  private static final String TAG = "TransformationUtils";
  
  static
  {
    CIRCLE_CROP_SHAPE_PAINT = new Paint(7);
    Object localObject = new HashSet(Arrays.asList(new String[] { "XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079" }));
    MODELS_REQUIRING_BITMAP_LOCK = (Set)localObject;
    if (((Set)localObject).contains(Build.MODEL)) {
      localObject = new ReentrantLock();
    } else {
      localObject = new NoLock();
    }
    BITMAP_DRAWABLE_LOCK = (Lock)localObject;
    localObject = new Paint(7);
    CIRCLE_CROP_BITMAP_PAINT = (Paint)localObject;
    ((Paint)localObject).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
  }
  
  private static void applyMatrix(@NonNull Bitmap paramBitmap1, @NonNull Bitmap paramBitmap2, Matrix paramMatrix)
  {
    BITMAP_DRAWABLE_LOCK.lock();
    try
    {
      paramBitmap2 = new Canvas(paramBitmap2);
      paramBitmap2.drawBitmap(paramBitmap1, paramMatrix, DEFAULT_PAINT);
      clear(paramBitmap2);
      return;
    }
    finally
    {
      BITMAP_DRAWABLE_LOCK.unlock();
    }
  }
  
  public static Bitmap centerCrop(@NonNull BitmapPool paramBitmapPool, @NonNull Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    if ((paramBitmap.getWidth() == paramInt1) && (paramBitmap.getHeight() == paramInt2)) {
      return paramBitmap;
    }
    Matrix localMatrix = new Matrix();
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f3 = 0.0F;
    float f1;
    float f2;
    if (i * paramInt2 > j * paramInt1)
    {
      f1 = paramInt2 / paramBitmap.getHeight();
      f2 = (paramInt1 - paramBitmap.getWidth() * f1) * 0.5F;
    }
    else
    {
      f1 = paramInt1 / paramBitmap.getWidth();
      f3 = (paramInt2 - paramBitmap.getHeight() * f1) * 0.5F;
      f2 = 0.0F;
    }
    localMatrix.setScale(f1, f1);
    localMatrix.postTranslate((int)(f2 + 0.5F), (int)(f3 + 0.5F));
    paramBitmapPool = paramBitmapPool.get(paramInt1, paramInt2, getNonNullConfig(paramBitmap));
    setAlpha(paramBitmap, paramBitmapPool);
    applyMatrix(paramBitmap, paramBitmapPool, localMatrix);
    return paramBitmapPool;
  }
  
  public static Bitmap centerInside(@NonNull BitmapPool paramBitmapPool, @NonNull Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    if ((paramBitmap.getWidth() <= paramInt1) && (paramBitmap.getHeight() <= paramInt2))
    {
      Log.isLoggable("TransformationUtils", 2);
      return paramBitmap;
    }
    Log.isLoggable("TransformationUtils", 2);
    return fitCenter(paramBitmapPool, paramBitmap, paramInt1, paramInt2);
  }
  
  public static Bitmap circleCrop(@NonNull BitmapPool paramBitmapPool, @NonNull Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    paramInt1 = Math.min(paramInt1, paramInt2);
    float f2 = paramInt1;
    float f1 = f2 / 2.0F;
    paramInt2 = paramBitmap.getWidth();
    int i = paramBitmap.getHeight();
    float f3 = paramInt2;
    float f5 = f2 / f3;
    float f4 = i;
    f5 = Math.max(f5, f2 / f4);
    f3 *= f5;
    f4 = f5 * f4;
    f5 = (f2 - f3) / 2.0F;
    f2 = (f2 - f4) / 2.0F;
    RectF localRectF = new RectF(f5, f2, f3 + f5, f4 + f2);
    Bitmap localBitmap1 = getAlphaSafeBitmap(paramBitmapPool, paramBitmap);
    Bitmap localBitmap2 = paramBitmapPool.get(paramInt1, paramInt1, getAlphaSafeConfig(paramBitmap));
    localBitmap2.setHasAlpha(true);
    BITMAP_DRAWABLE_LOCK.lock();
    try
    {
      Canvas localCanvas = new Canvas(localBitmap2);
      localCanvas.drawCircle(f1, f1, f1, CIRCLE_CROP_SHAPE_PAINT);
      localCanvas.drawBitmap(localBitmap1, null, localRectF, CIRCLE_CROP_BITMAP_PAINT);
      clear(localCanvas);
      BITMAP_DRAWABLE_LOCK.unlock();
      if (!localBitmap1.equals(paramBitmap)) {
        paramBitmapPool.put(localBitmap1);
      }
      return localBitmap2;
    }
    finally
    {
      BITMAP_DRAWABLE_LOCK.unlock();
    }
  }
  
  private static void clear(Canvas paramCanvas)
  {
    paramCanvas.setBitmap(null);
  }
  
  public static Bitmap fitCenter(@NonNull BitmapPool paramBitmapPool, @NonNull Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    if ((paramBitmap.getWidth() == paramInt1) && (paramBitmap.getHeight() == paramInt2)) {}
    float f;
    int i;
    int j;
    do
    {
      Log.isLoggable("TransformationUtils", 2);
      return paramBitmap;
      f = Math.min(paramInt1 / paramBitmap.getWidth(), paramInt2 / paramBitmap.getHeight());
      i = Math.round(paramBitmap.getWidth() * f);
      j = Math.round(paramBitmap.getHeight() * f);
    } while ((paramBitmap.getWidth() == i) && (paramBitmap.getHeight() == j));
    paramBitmapPool = paramBitmapPool.get((int)(paramBitmap.getWidth() * f), (int)(paramBitmap.getHeight() * f), getNonNullConfig(paramBitmap));
    setAlpha(paramBitmap, paramBitmapPool);
    if (Log.isLoggable("TransformationUtils", 2))
    {
      localObject = new StringBuilder("request: ");
      ((StringBuilder)localObject).append(paramInt1);
      ((StringBuilder)localObject).append("x");
      ((StringBuilder)localObject).append(paramInt2);
      localObject = new StringBuilder("toFit:   ");
      ((StringBuilder)localObject).append(paramBitmap.getWidth());
      ((StringBuilder)localObject).append("x");
      ((StringBuilder)localObject).append(paramBitmap.getHeight());
      localObject = new StringBuilder("toReuse: ");
      ((StringBuilder)localObject).append(paramBitmapPool.getWidth());
      ((StringBuilder)localObject).append("x");
      ((StringBuilder)localObject).append(paramBitmapPool.getHeight());
    }
    Object localObject = new Matrix();
    ((Matrix)localObject).setScale(f, f);
    applyMatrix(paramBitmap, paramBitmapPool, (Matrix)localObject);
    return paramBitmapPool;
  }
  
  private static Bitmap getAlphaSafeBitmap(@NonNull BitmapPool paramBitmapPool, @NonNull Bitmap paramBitmap)
  {
    Bitmap.Config localConfig = getAlphaSafeConfig(paramBitmap);
    if (localConfig.equals(paramBitmap.getConfig())) {
      return paramBitmap;
    }
    paramBitmapPool = paramBitmapPool.get(paramBitmap.getWidth(), paramBitmap.getHeight(), localConfig);
    new Canvas(paramBitmapPool).drawBitmap(paramBitmap, 0.0F, 0.0F, null);
    return paramBitmapPool;
  }
  
  @NonNull
  private static Bitmap.Config getAlphaSafeConfig(@NonNull Bitmap paramBitmap)
  {
    if ((Build.VERSION.SDK_INT >= 26) && (Bitmap.Config.RGBA_F16.equals(paramBitmap.getConfig()))) {
      return Bitmap.Config.RGBA_F16;
    }
    return Bitmap.Config.ARGB_8888;
  }
  
  public static Lock getBitmapDrawableLock()
  {
    return BITMAP_DRAWABLE_LOCK;
  }
  
  public static int getExifOrientationDegrees(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 7: 
    case 8: 
      return 270;
    case 5: 
    case 6: 
      return 90;
    }
    return 180;
  }
  
  @NonNull
  private static Bitmap.Config getNonNullConfig(@NonNull Bitmap paramBitmap)
  {
    if (paramBitmap.getConfig() != null) {
      return paramBitmap.getConfig();
    }
    return Bitmap.Config.ARGB_8888;
  }
  
  @VisibleForTesting
  static void initializeMatrixForRotation(int paramInt, Matrix paramMatrix)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 8: 
      paramMatrix.setRotate(-90.0F);
      return;
    case 7: 
      paramMatrix.setRotate(-90.0F);
    case 6: 
    case 5: 
    case 4: 
      for (;;)
      {
        paramMatrix.postScale(-1.0F, 1.0F);
        return;
        paramMatrix.setRotate(90.0F);
        return;
        paramMatrix.setRotate(90.0F);
        continue;
        paramMatrix.setRotate(180.0F);
      }
    case 3: 
      paramMatrix.setRotate(180.0F);
      return;
    }
    paramMatrix.setScale(-1.0F, 1.0F);
  }
  
  public static boolean isExifOrientationRequired(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public static Bitmap rotateImage(@NonNull Bitmap paramBitmap, int paramInt)
  {
    if (paramInt != 0) {
      try
      {
        Object localObject = new Matrix();
        ((Matrix)localObject).setRotate(paramInt);
        localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
        return (Bitmap)localObject;
      }
      catch (Exception localException)
      {
        if (Log.isLoggable("TransformationUtils", 6)) {
          Log.e("TransformationUtils", "Exception when trying to orient image", localException);
        }
      }
    }
    return paramBitmap;
  }
  
  public static Bitmap rotateImageExif(@NonNull BitmapPool paramBitmapPool, @NonNull Bitmap paramBitmap, int paramInt)
  {
    if (!isExifOrientationRequired(paramInt)) {
      return paramBitmap;
    }
    Matrix localMatrix = new Matrix();
    initializeMatrixForRotation(paramInt, localMatrix);
    RectF localRectF = new RectF(0.0F, 0.0F, paramBitmap.getWidth(), paramBitmap.getHeight());
    localMatrix.mapRect(localRectF);
    paramBitmapPool = paramBitmapPool.get(Math.round(localRectF.width()), Math.round(localRectF.height()), getNonNullConfig(paramBitmap));
    localMatrix.postTranslate(-localRectF.left, -localRectF.top);
    applyMatrix(paramBitmap, paramBitmapPool, localMatrix);
    return paramBitmapPool;
  }
  
  public static Bitmap roundedCorners(@NonNull BitmapPool paramBitmapPool, @NonNull Bitmap paramBitmap, int paramInt)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "roundingRadius must be greater than 0.");
    Object localObject1 = getAlphaSafeConfig(paramBitmap);
    Bitmap localBitmap = getAlphaSafeBitmap(paramBitmapPool, paramBitmap);
    localObject1 = paramBitmapPool.get(localBitmap.getWidth(), localBitmap.getHeight(), (Bitmap.Config)localObject1);
    ((Bitmap)localObject1).setHasAlpha(true);
    Object localObject2 = Shader.TileMode.CLAMP;
    Object localObject3 = new BitmapShader(localBitmap, (Shader.TileMode)localObject2, (Shader.TileMode)localObject2);
    localObject2 = new Paint();
    ((Paint)localObject2).setAntiAlias(true);
    ((Paint)localObject2).setShader((Shader)localObject3);
    localObject3 = new RectF(0.0F, 0.0F, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight());
    BITMAP_DRAWABLE_LOCK.lock();
    try
    {
      Canvas localCanvas = new Canvas((Bitmap)localObject1);
      localCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
      float f = paramInt;
      localCanvas.drawRoundRect((RectF)localObject3, f, f, (Paint)localObject2);
      clear(localCanvas);
      BITMAP_DRAWABLE_LOCK.unlock();
      if (!localBitmap.equals(paramBitmap)) {
        paramBitmapPool.put(localBitmap);
      }
      return (Bitmap)localObject1;
    }
    finally
    {
      BITMAP_DRAWABLE_LOCK.unlock();
    }
  }
  
  @Deprecated
  public static Bitmap roundedCorners(@NonNull BitmapPool paramBitmapPool, @NonNull Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3)
  {
    return roundedCorners(paramBitmapPool, paramBitmap, paramInt3);
  }
  
  public static void setAlpha(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    paramBitmap2.setHasAlpha(paramBitmap1.hasAlpha());
  }
  
  static final class NoLock
    implements Lock
  {
    public final void lock() {}
    
    public final void lockInterruptibly()
      throws InterruptedException
    {}
    
    @NonNull
    public final Condition newCondition()
    {
      throw new UnsupportedOperationException("Should not be called");
    }
    
    public final boolean tryLock()
    {
      return true;
    }
    
    public final boolean tryLock(long paramLong, @NonNull TimeUnit paramTimeUnit)
      throws InterruptedException
    {
      return true;
    }
    
    public final void unlock() {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/TransformationUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
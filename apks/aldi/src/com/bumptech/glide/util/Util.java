package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.model.Model;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public final class Util
{
  private static final int HASH_ACCUMULATOR = 17;
  private static final int HASH_MULTIPLIER = 31;
  private static final char[] HEX_CHAR_ARRAY = "0123456789abcdef".toCharArray();
  private static final char[] SHA_256_CHARS = new char[64];
  
  public static void assertBackgroundThread()
  {
    if (isOnBackgroundThread()) {
      return;
    }
    throw new IllegalArgumentException("You must call this method on a background thread");
  }
  
  public static void assertMainThread()
  {
    if (isOnMainThread()) {
      return;
    }
    throw new IllegalArgumentException("You must call this method on the main thread");
  }
  
  public static boolean bothModelsNullEquivalentOrEquals(@Nullable Object paramObject1, @Nullable Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    if ((paramObject1 instanceof Model)) {
      return ((Model)paramObject1).isEquivalentTo(paramObject2);
    }
    return paramObject1.equals(paramObject2);
  }
  
  public static boolean bothNullOrEqual(@Nullable Object paramObject1, @Nullable Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
  }
  
  @NonNull
  private static String bytesToHex(@NonNull byte[] paramArrayOfByte, @NonNull char[] paramArrayOfChar)
  {
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = paramArrayOfByte[i] & 0xFF;
      int k = i * 2;
      paramArrayOfChar[k] = HEX_CHAR_ARRAY[(j >>> 4)];
      paramArrayOfChar[(k + 1)] = HEX_CHAR_ARRAY[(j & 0xF)];
      i += 1;
    }
    return new String(paramArrayOfChar);
  }
  
  @NonNull
  public static <T> Queue<T> createQueue(int paramInt)
  {
    return new ArrayDeque(paramInt);
  }
  
  public static int getBitmapByteSize(int paramInt1, int paramInt2, @Nullable Bitmap.Config paramConfig)
  {
    return paramInt1 * paramInt2 * getBytesPerPixel(paramConfig);
  }
  
  @TargetApi(19)
  public static int getBitmapByteSize(@NonNull Bitmap paramBitmap)
  {
    if ((paramBitmap.isRecycled()) || (Build.VERSION.SDK_INT >= 19)) {}
    try
    {
      int i = paramBitmap.getAllocationByteCount();
      return i;
    }
    catch (NullPointerException localNullPointerException)
    {
      StringBuilder localStringBuilder;
      for (;;) {}
    }
    return paramBitmap.getHeight() * paramBitmap.getRowBytes();
    localStringBuilder = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
    localStringBuilder.append(paramBitmap);
    localStringBuilder.append("[");
    localStringBuilder.append(paramBitmap.getWidth());
    localStringBuilder.append("x");
    localStringBuilder.append(paramBitmap.getHeight());
    localStringBuilder.append("] ");
    localStringBuilder.append(paramBitmap.getConfig());
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private static int getBytesPerPixel(@Nullable Bitmap.Config paramConfig)
  {
    Bitmap.Config localConfig = paramConfig;
    if (paramConfig == null) {
      localConfig = Bitmap.Config.ARGB_8888;
    }
    switch (localConfig)
    {
    default: 
      return 4;
    case ???: 
      return 8;
    case ???: 
    case ???: 
      return 2;
    }
    return 1;
  }
  
  @Deprecated
  public static int getSize(@NonNull Bitmap paramBitmap)
  {
    return getBitmapByteSize(paramBitmap);
  }
  
  @NonNull
  public static <T> List<T> getSnapshot(@NonNull Collection<T> paramCollection)
  {
    ArrayList localArrayList = new ArrayList(paramCollection.size());
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      Object localObject = paramCollection.next();
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public static int hashCode(float paramFloat)
  {
    return hashCode(paramFloat, 17);
  }
  
  public static int hashCode(float paramFloat, int paramInt)
  {
    return hashCode(Float.floatToIntBits(paramFloat), paramInt);
  }
  
  public static int hashCode(int paramInt)
  {
    return hashCode(paramInt, 17);
  }
  
  public static int hashCode(int paramInt1, int paramInt2)
  {
    return paramInt2 * 31 + paramInt1;
  }
  
  public static int hashCode(@Nullable Object paramObject, int paramInt)
  {
    int i;
    if (paramObject == null) {
      i = 0;
    } else {
      i = paramObject.hashCode();
    }
    return hashCode(i, paramInt);
  }
  
  public static int hashCode(boolean paramBoolean)
  {
    return hashCode(paramBoolean, 17);
  }
  
  public static int hashCode(boolean paramBoolean, int paramInt)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static boolean isOnBackgroundThread()
  {
    return !isOnMainThread();
  }
  
  public static boolean isOnMainThread()
  {
    return Looper.myLooper() == Looper.getMainLooper();
  }
  
  private static boolean isValidDimension(int paramInt)
  {
    return (paramInt > 0) || (paramInt == Integer.MIN_VALUE);
  }
  
  public static boolean isValidDimensions(int paramInt1, int paramInt2)
  {
    return (isValidDimension(paramInt1)) && (isValidDimension(paramInt2));
  }
  
  @NonNull
  public static String sha256BytesToHex(@NonNull byte[] paramArrayOfByte)
  {
    synchronized (SHA_256_CHARS)
    {
      paramArrayOfByte = bytesToHex(paramArrayOfByte, SHA_256_CHARS);
      return paramArrayOfByte;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/util/Util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.util.LruCache;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager
{
  private static final Object zamg = new Object();
  private static HashSet<Uri> zamh = new HashSet();
  private static ImageManager zami;
  private final Context mContext;
  private final Handler mHandler;
  private final ExecutorService zamj;
  private final zaa zamk;
  private final zak zaml;
  private final Map<zaa, ImageReceiver> zamm;
  private final Map<Uri, ImageReceiver> zamn;
  private final Map<Uri, Long> zamo;
  
  private ImageManager(Context paramContext, boolean paramBoolean)
  {
    this.mContext = paramContext.getApplicationContext();
    this.mHandler = new zal(Looper.getMainLooper());
    this.zamj = Executors.newFixedThreadPool(4);
    this.zamk = null;
    this.zaml = new zak();
    this.zamm = new HashMap();
    this.zamn = new HashMap();
    this.zamo = new HashMap();
  }
  
  public static ImageManager create(Context paramContext)
  {
    if (zami == null) {
      zami = new ImageManager(paramContext, false);
    }
    return zami;
  }
  
  private final Bitmap zaa(zab paramzab)
  {
    if (this.zamk == null) {
      return null;
    }
    return (Bitmap)this.zamk.get(paramzab);
  }
  
  private final void zaa(zaa paramzaa)
  {
    Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
    new zac(paramzaa).run();
  }
  
  public final void loadImage(ImageView paramImageView, int paramInt)
  {
    zaa(new zac(paramImageView, paramInt));
  }
  
  public final void loadImage(ImageView paramImageView, Uri paramUri)
  {
    zaa(new zac(paramImageView, paramUri));
  }
  
  public final void loadImage(ImageView paramImageView, Uri paramUri, int paramInt)
  {
    paramImageView = new zac(paramImageView, paramUri);
    paramImageView.zamw = paramInt;
    zaa(paramImageView);
  }
  
  public final void loadImage(OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri)
  {
    zaa(new zad(paramOnImageLoadedListener, paramUri));
  }
  
  public final void loadImage(OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri, int paramInt)
  {
    paramOnImageLoadedListener = new zad(paramOnImageLoadedListener, paramUri);
    paramOnImageLoadedListener.zamw = paramInt;
    zaa(paramOnImageLoadedListener);
  }
  
  @KeepName
  final class ImageReceiver
    extends ResultReceiver
  {
    private final Uri mUri;
    private final ArrayList<zaa> zamp;
    
    ImageReceiver(Uri paramUri)
    {
      super();
      this.mUri = paramUri;
      this.zamp = new ArrayList();
    }
    
    public final void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      paramBundle = (ParcelFileDescriptor)paramBundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
      ImageManager.zaf(ImageManager.this).execute(new ImageManager.zab(ImageManager.this, this.mUri, paramBundle));
    }
    
    public final void zab(zaa paramzaa)
    {
      Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
      this.zamp.add(paramzaa);
    }
    
    public final void zac(zaa paramzaa)
    {
      Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
      this.zamp.remove(paramzaa);
    }
    
    public final void zace()
    {
      Intent localIntent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
      localIntent.putExtra("com.google.android.gms.extras.uri", this.mUri);
      localIntent.putExtra("com.google.android.gms.extras.resultReceiver", this);
      localIntent.putExtra("com.google.android.gms.extras.priority", 3);
      ImageManager.zab(ImageManager.this).sendBroadcast(localIntent);
    }
  }
  
  public static abstract interface OnImageLoadedListener
  {
    public abstract void onImageLoaded(Uri paramUri, Drawable paramDrawable, boolean paramBoolean);
  }
  
  static final class zaa
    extends LruCache<zab, Bitmap>
  {}
  
  final class zab
    implements Runnable
  {
    private final Uri mUri;
    private final ParcelFileDescriptor zamr;
    
    public zab(Uri paramUri, ParcelFileDescriptor paramParcelFileDescriptor)
    {
      this.mUri = paramUri;
      this.zamr = paramParcelFileDescriptor;
    }
    
    public final void run()
    {
      Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
      Object localObject2 = this.zamr;
      boolean bool = false;
      Object localObject1 = null;
      if (localObject2 != null)
      {
        try
        {
          localObject2 = BitmapFactory.decodeFileDescriptor(this.zamr.getFileDescriptor());
          localObject1 = localObject2;
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          String str = String.valueOf(this.mUri);
          StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 34);
          localStringBuilder.append("OOM while loading bitmap for uri: ");
          localStringBuilder.append(str);
          Log.e("ImageManager", localStringBuilder.toString(), localOutOfMemoryError);
          bool = true;
        }
        try
        {
          this.zamr.close();
        }
        catch (IOException localIOException)
        {
          Log.e("ImageManager", "closed failed", localIOException);
        }
      }
      else
      {
        localObject1 = null;
        bool = false;
      }
      Object localObject3 = new CountDownLatch(1);
      ImageManager.zag(ImageManager.this).post(new ImageManager.zad(ImageManager.this, this.mUri, (Bitmap)localObject1, bool, (CountDownLatch)localObject3));
      try
      {
        ((CountDownLatch)localObject3).await();
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
      localObject1 = String.valueOf(this.mUri);
      localObject3 = new StringBuilder(String.valueOf(localObject1).length() + 32);
      ((StringBuilder)localObject3).append("Latch interrupted while posting ");
      ((StringBuilder)localObject3).append((String)localObject1);
    }
  }
  
  final class zac
    implements Runnable
  {
    private final zaa zams;
    
    public zac(zaa paramzaa)
    {
      this.zams = paramzaa;
    }
    
    public final void run()
    {
      Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
      Object localObject1 = (ImageManager.ImageReceiver)ImageManager.zaa(ImageManager.this).get(this.zams);
      if (localObject1 != null)
      {
        ImageManager.zaa(ImageManager.this).remove(this.zams);
        ((ImageManager.ImageReceiver)localObject1).zac(this.zams);
      }
      zab localzab = this.zams.zamu;
      if (localzab.uri == null)
      {
        this.zams.zaa(ImageManager.zab(ImageManager.this), ImageManager.zac(ImageManager.this), true);
        return;
      }
      localObject1 = ImageManager.zaa(ImageManager.this, localzab);
      if (localObject1 != null)
      {
        this.zams.zaa(ImageManager.zab(ImageManager.this), (Bitmap)localObject1, true);
        return;
      }
      localObject1 = (Long)ImageManager.zad(ImageManager.this).get(localzab.uri);
      if (localObject1 != null)
      {
        if (SystemClock.elapsedRealtime() - ((Long)localObject1).longValue() < 3600000L)
        {
          this.zams.zaa(ImageManager.zab(ImageManager.this), ImageManager.zac(ImageManager.this), true);
          return;
        }
        ImageManager.zad(ImageManager.this).remove(localzab.uri);
      }
      this.zams.zaa(ImageManager.zab(ImageManager.this), ImageManager.zac(ImageManager.this));
      ??? = (ImageManager.ImageReceiver)ImageManager.zae(ImageManager.this).get(localzab.uri);
      localObject1 = ???;
      if (??? == null)
      {
        localObject1 = new ImageManager.ImageReceiver(ImageManager.this, localzab.uri);
        ImageManager.zae(ImageManager.this).put(localzab.uri, localObject1);
      }
      ((ImageManager.ImageReceiver)localObject1).zab(this.zams);
      if (!(this.zams instanceof zad)) {
        ImageManager.zaa(ImageManager.this).put(this.zams, localObject1);
      }
      synchronized (ImageManager.zacc())
      {
        if (!ImageManager.zacd().contains(localzab.uri))
        {
          ImageManager.zacd().add(localzab.uri);
          ((ImageManager.ImageReceiver)localObject1).zace();
        }
        return;
      }
    }
  }
  
  final class zad
    implements Runnable
  {
    private final Bitmap mBitmap;
    private final Uri mUri;
    private final CountDownLatch zadq;
    private boolean zamt;
    
    public zad(Uri paramUri, Bitmap paramBitmap, boolean paramBoolean, CountDownLatch paramCountDownLatch)
    {
      this.mUri = paramUri;
      this.mBitmap = paramBitmap;
      this.zamt = paramBoolean;
      this.zadq = paramCountDownLatch;
    }
    
    public final void run()
    {
      Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
      int i;
      if (this.mBitmap != null) {
        i = 1;
      } else {
        i = 0;
      }
      if (ImageManager.zah(ImageManager.this) != null)
      {
        if (this.zamt)
        {
          ImageManager.zah(ImageManager.this).evictAll();
          System.gc();
          this.zamt = false;
          ImageManager.zag(ImageManager.this).post(this);
          return;
        }
        if (i != 0) {
          ImageManager.zah(ImageManager.this).put(new zab(this.mUri), this.mBitmap);
        }
      }
      ??? = (ImageManager.ImageReceiver)ImageManager.zae(ImageManager.this).remove(this.mUri);
      if (??? != null)
      {
        ??? = ImageManager.ImageReceiver.zaa((ImageManager.ImageReceiver)???);
        int k = ((ArrayList)???).size();
        int j = 0;
        while (j < k)
        {
          zaa localzaa = (zaa)((ArrayList)???).get(j);
          if (i != 0)
          {
            localzaa.zaa(ImageManager.zab(ImageManager.this), this.mBitmap, false);
          }
          else
          {
            ImageManager.zad(ImageManager.this).put(this.mUri, Long.valueOf(SystemClock.elapsedRealtime()));
            localzaa.zaa(ImageManager.zab(ImageManager.this), ImageManager.zac(ImageManager.this), false);
          }
          if (!(localzaa instanceof zad)) {
            ImageManager.zaa(ImageManager.this).remove(localzaa);
          }
          j += 1;
        }
      }
      this.zadq.countDown();
      synchronized (ImageManager.zacc())
      {
        ImageManager.zacd().remove(this.mUri);
        return;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/images/ImageManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
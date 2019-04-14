package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.util.List;

public class ResourceDrawableDecoder
  implements ResourceDecoder<Uri, Drawable>
{
  private static final int ID_PATH_SEGMENTS = 1;
  private static final int NAME_PATH_SEGMENT_INDEX = 1;
  private static final int NAME_URI_PATH_SEGMENTS = 2;
  private static final int RESOURCE_ID_SEGMENT_INDEX = 0;
  private static final int TYPE_PATH_SEGMENT_INDEX = 0;
  private final Context context;
  
  public ResourceDrawableDecoder(Context paramContext)
  {
    this.context = paramContext.getApplicationContext();
  }
  
  @NonNull
  private Context getContextForPackage(Uri paramUri, String paramString)
  {
    try
    {
      paramString = this.context.createPackageContext(paramString, 0);
      return paramString;
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(paramUri)), paramString);
    }
  }
  
  @DrawableRes
  private int loadResourceIdFromUri(Uri paramUri)
  {
    Object localObject2 = paramUri.getPathSegments();
    if (((List)localObject2).size() == 2)
    {
      localObject1 = paramUri.getAuthority();
      String str = (String)((List)localObject2).get(0);
      localObject2 = (String)((List)localObject2).get(1);
      localObject1 = Integer.valueOf(this.context.getResources().getIdentifier((String)localObject2, str, (String)localObject1));
    }
    else if (((List)localObject2).size() != 1) {}
    try
    {
      localObject1 = Integer.valueOf((String)((List)localObject2).get(0));
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
    Object localObject1 = null;
    if (localObject1 != null)
    {
      if (((Integer)localObject1).intValue() != 0) {
        return ((Integer)localObject1).intValue();
      }
      throw new IllegalArgumentException("Failed to obtain resource id for: ".concat(String.valueOf(paramUri)));
    }
    throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(paramUri)));
  }
  
  @Nullable
  public Resource<Drawable> decode(@NonNull Uri paramUri, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    paramInt1 = loadResourceIdFromUri(paramUri);
    paramOptions = paramUri.getAuthority();
    if (paramOptions.equals(this.context.getPackageName())) {
      paramUri = this.context;
    } else {
      paramUri = getContextForPackage(paramUri, paramOptions);
    }
    return NonOwnedDrawableResource.newInstance(DrawableDecoderCompat.getDrawable(this.context, paramUri, paramInt1));
  }
  
  public boolean handles(@NonNull Uri paramUri, @NonNull Options paramOptions)
  {
    return paramUri.getScheme().equals("android.resource");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/drawable/ResourceDrawableDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
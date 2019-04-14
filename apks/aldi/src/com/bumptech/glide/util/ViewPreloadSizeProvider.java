package com.bumptech.glide.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.bumptech.glide.ListPreloader.PreloadSizeProvider;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.request.transition.Transition;
import java.util.Arrays;

public class ViewPreloadSizeProvider<T>
  implements ListPreloader.PreloadSizeProvider<T>, SizeReadyCallback
{
  private int[] size;
  private SizeViewTarget viewTarget;
  
  public ViewPreloadSizeProvider() {}
  
  public ViewPreloadSizeProvider(@NonNull View paramView)
  {
    this.viewTarget = new SizeViewTarget(paramView, this);
  }
  
  @Nullable
  public int[] getPreloadSize(@NonNull T paramT, int paramInt1, int paramInt2)
  {
    if (this.size == null) {
      return null;
    }
    return Arrays.copyOf(this.size, this.size.length);
  }
  
  public void onSizeReady(int paramInt1, int paramInt2)
  {
    this.size = new int[] { paramInt1, paramInt2 };
    this.viewTarget = null;
  }
  
  public void setView(@NonNull View paramView)
  {
    if (this.size == null)
    {
      if (this.viewTarget != null) {
        return;
      }
      this.viewTarget = new SizeViewTarget(paramView, this);
    }
  }
  
  static final class SizeViewTarget
    extends ViewTarget<View, Object>
  {
    SizeViewTarget(@NonNull View paramView, @NonNull SizeReadyCallback paramSizeReadyCallback)
    {
      super();
      getSize(paramSizeReadyCallback);
    }
    
    public final void onResourceReady(@NonNull Object paramObject, @Nullable Transition<? super Object> paramTransition) {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/util/ViewPreloadSizeProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
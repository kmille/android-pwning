package com.bumptech.glide.request.target;

import android.support.annotation.NonNull;
import com.bumptech.glide.util.Util;

@Deprecated
public abstract class SimpleTarget<Z>
  extends BaseTarget<Z>
{
  private final int height;
  private final int width;
  
  public SimpleTarget()
  {
    this(Integer.MIN_VALUE, Integer.MIN_VALUE);
  }
  
  public SimpleTarget(int paramInt1, int paramInt2)
  {
    this.width = paramInt1;
    this.height = paramInt2;
  }
  
  public final void getSize(@NonNull SizeReadyCallback paramSizeReadyCallback)
  {
    if (Util.isValidDimensions(this.width, this.height))
    {
      paramSizeReadyCallback.onSizeReady(this.width, this.height);
      return;
    }
    paramSizeReadyCallback = new StringBuilder("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
    paramSizeReadyCallback.append(this.width);
    paramSizeReadyCallback.append(" and height: ");
    paramSizeReadyCallback.append(this.height);
    paramSizeReadyCallback.append(", either provide dimensions in the constructor or call override()");
    throw new IllegalArgumentException(paramSizeReadyCallback.toString());
  }
  
  public void removeCallback(@NonNull SizeReadyCallback paramSizeReadyCallback) {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/target/SimpleTarget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
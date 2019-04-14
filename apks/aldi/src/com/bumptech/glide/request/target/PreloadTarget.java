package com.bumptech.glide.request.target;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.transition.Transition;

public final class PreloadTarget<Z>
  extends SimpleTarget<Z>
{
  private static final Handler HANDLER = new Handler(Looper.getMainLooper(), new Handler.Callback()
  {
    public boolean handleMessage(Message paramAnonymousMessage)
    {
      if (paramAnonymousMessage.what == 1)
      {
        ((PreloadTarget)paramAnonymousMessage.obj).clear();
        return true;
      }
      return false;
    }
  });
  private static final int MESSAGE_CLEAR = 1;
  private final RequestManager requestManager;
  
  private PreloadTarget(RequestManager paramRequestManager, int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.requestManager = paramRequestManager;
  }
  
  public static <Z> PreloadTarget<Z> obtain(RequestManager paramRequestManager, int paramInt1, int paramInt2)
  {
    return new PreloadTarget(paramRequestManager, paramInt1, paramInt2);
  }
  
  final void clear()
  {
    this.requestManager.clear(this);
  }
  
  public final void onResourceReady(@NonNull Z paramZ, @Nullable Transition<? super Z> paramTransition)
  {
    HANDLER.obtainMessage(1, this).sendToTarget();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/target/PreloadTarget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
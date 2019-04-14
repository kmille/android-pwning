package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.util.Util;

class ResourceRecycler
{
  private final Handler handler = new Handler(Looper.getMainLooper(), new ResourceRecyclerCallback());
  private boolean isRecycling;
  
  void recycle(Resource<?> paramResource)
  {
    
    if (this.isRecycling)
    {
      this.handler.obtainMessage(1, paramResource).sendToTarget();
      return;
    }
    this.isRecycling = true;
    paramResource.recycle();
    this.isRecycling = false;
  }
  
  static final class ResourceRecyclerCallback
    implements Handler.Callback
  {
    static final int RECYCLE_RESOURCE = 1;
    
    public final boolean handleMessage(Message paramMessage)
    {
      if (paramMessage.what == 1)
      {
        ((Resource)paramMessage.obj).recycle();
        return true;
      }
      return false;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/ResourceRecycler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
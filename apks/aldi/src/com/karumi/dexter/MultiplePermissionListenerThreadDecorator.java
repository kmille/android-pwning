package com.karumi.dexter;

import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import java.util.List;

final class MultiplePermissionListenerThreadDecorator
  implements MultiplePermissionsListener
{
  private final MultiplePermissionsListener listener;
  private final Thread thread;
  
  MultiplePermissionListenerThreadDecorator(MultiplePermissionsListener paramMultiplePermissionsListener, Thread paramThread)
  {
    this.thread = paramThread;
    this.listener = paramMultiplePermissionsListener;
  }
  
  public final void onPermissionRationaleShouldBeShown(final List<PermissionRequest> paramList, final PermissionToken paramPermissionToken)
  {
    this.thread.execute(new Runnable()
    {
      public void run()
      {
        MultiplePermissionListenerThreadDecorator.this.listener.onPermissionRationaleShouldBeShown(paramList, paramPermissionToken);
      }
    });
  }
  
  public final void onPermissionsChecked(final MultiplePermissionsReport paramMultiplePermissionsReport)
  {
    this.thread.execute(new Runnable()
    {
      public void run()
      {
        MultiplePermissionListenerThreadDecorator.this.listener.onPermissionsChecked(paramMultiplePermissionsReport);
      }
    });
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/MultiplePermissionListenerThreadDecorator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
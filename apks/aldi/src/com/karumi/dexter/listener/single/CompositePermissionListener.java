package com.karumi.dexter.listener.single;

import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CompositePermissionListener
  implements PermissionListener
{
  private final Collection<PermissionListener> listeners;
  
  public CompositePermissionListener(Collection<PermissionListener> paramCollection)
  {
    this.listeners = paramCollection;
  }
  
  public CompositePermissionListener(PermissionListener... paramVarArgs)
  {
    this(Arrays.asList(paramVarArgs));
  }
  
  public void onPermissionDenied(PermissionDeniedResponse paramPermissionDeniedResponse)
  {
    Iterator localIterator = this.listeners.iterator();
    while (localIterator.hasNext()) {
      ((PermissionListener)localIterator.next()).onPermissionDenied(paramPermissionDeniedResponse);
    }
  }
  
  public void onPermissionGranted(PermissionGrantedResponse paramPermissionGrantedResponse)
  {
    Iterator localIterator = this.listeners.iterator();
    while (localIterator.hasNext()) {
      ((PermissionListener)localIterator.next()).onPermissionGranted(paramPermissionGrantedResponse);
    }
  }
  
  public void onPermissionRationaleShouldBeShown(PermissionRequest paramPermissionRequest, PermissionToken paramPermissionToken)
  {
    Iterator localIterator = this.listeners.iterator();
    while (localIterator.hasNext()) {
      ((PermissionListener)localIterator.next()).onPermissionRationaleShouldBeShown(paramPermissionRequest, paramPermissionToken);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/listener/single/CompositePermissionListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
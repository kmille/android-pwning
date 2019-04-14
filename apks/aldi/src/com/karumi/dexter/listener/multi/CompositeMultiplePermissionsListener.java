package com.karumi.dexter.listener.multi;

import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CompositeMultiplePermissionsListener
  implements MultiplePermissionsListener
{
  private final Collection<MultiplePermissionsListener> listeners;
  
  public CompositeMultiplePermissionsListener(Collection<MultiplePermissionsListener> paramCollection)
  {
    this.listeners = paramCollection;
  }
  
  public CompositeMultiplePermissionsListener(MultiplePermissionsListener... paramVarArgs)
  {
    this(Arrays.asList(paramVarArgs));
  }
  
  public void onPermissionRationaleShouldBeShown(List<PermissionRequest> paramList, PermissionToken paramPermissionToken)
  {
    Iterator localIterator = this.listeners.iterator();
    while (localIterator.hasNext()) {
      ((MultiplePermissionsListener)localIterator.next()).onPermissionRationaleShouldBeShown(paramList, paramPermissionToken);
    }
  }
  
  public void onPermissionsChecked(MultiplePermissionsReport paramMultiplePermissionsReport)
  {
    Iterator localIterator = this.listeners.iterator();
    while (localIterator.hasNext()) {
      ((MultiplePermissionsListener)localIterator.next()).onPermissionsChecked(paramMultiplePermissionsReport);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/listener/multi/CompositeMultiplePermissionsListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
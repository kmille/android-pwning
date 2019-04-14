package android.arch.lifecycle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class ViewModelStore
{
  private final HashMap<String, ViewModel> mMap = new HashMap();
  
  public final void clear()
  {
    Iterator localIterator = this.mMap.values().iterator();
    while (localIterator.hasNext()) {
      ((ViewModel)localIterator.next()).onCleared();
    }
    this.mMap.clear();
  }
  
  final ViewModel get(String paramString)
  {
    return (ViewModel)this.mMap.get(paramString);
  }
  
  final void put(String paramString, ViewModel paramViewModel)
  {
    paramString = (ViewModel)this.mMap.put(paramString, paramViewModel);
    if (paramString != null) {
      paramString.onCleared();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/lifecycle/ViewModelStore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
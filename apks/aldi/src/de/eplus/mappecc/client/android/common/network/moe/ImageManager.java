package de.eplus.mappecc.client.android.common.network.moe;

import de.eplus.mappecc.client.android.common.utils.UiUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ImageManager
{
  private final UiUtils uiUtils;
  private List<String> urlList = new ArrayList();
  
  @Inject
  public ImageManager(UiUtils paramUiUtils)
  {
    this.uiUtils = paramUiUtils;
  }
  
  private void clearUrlList()
  {
    this.urlList.clear();
  }
  
  public void insertUrlToList(String paramString)
  {
    this.urlList.add(paramString);
  }
  
  public void preCache()
  {
    Iterator localIterator = this.urlList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.uiUtils.preCacheImage(str);
    }
    clearUrlList();
  }
  
  public void preCache(List<String> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      this.uiUtils.preCacheImage(str);
    }
  }
  
  public void setUrlList(List<String> paramList)
  {
    this.urlList = paramList;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/ImageManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package de.eplus.mappecc.client.android.common.network.moe;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.View;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;

public abstract class ViewSetter
{
  @NonNull
  protected final Localizer localizer;
  @Nullable
  protected Object view;
  
  protected ViewSetter(@Nullable Object paramObject, @NonNull Localizer paramLocalizer)
  {
    this.view = paramObject;
    this.localizer = paramLocalizer;
  }
  
  @Nullable
  protected Object findById(@IdRes int paramInt)
  {
    if ((this.view instanceof View)) {
      return ((View)this.view).findViewById(paramInt);
    }
    if ((this.view instanceof Activity)) {
      return ((Activity)this.view).findViewById(paramInt);
    }
    if ((this.view instanceof Menu)) {
      return ((Menu)this.view).findItem(paramInt);
    }
    return null;
  }
  
  public abstract void update();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/ViewSetter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
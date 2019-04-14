package de.eplus.mappecc.client.android.common.network.moe;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import c.a.a;
import de.eplus.mappecc.client.android.common.base.B2PFragment;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.rating.RatingActivity;
import de.eplus.mappecc.client.android.feature.rating.feedback.FeedbackScreenFragment;
import de.eplus.mappecc.client.android.feature.rating.starpage.StarRatingFragment;
import de.eplus.mappecc.client.android.feature.rating.thankyou.ThankYouFragment;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import javax.inject.Inject;
import org.apache.a.c.h;

public class ViewSetterFactory
{
  static final String[] SPECIAL_VIEW_SETTER_LIST = { RatingActivity.class.getName(), StarRatingFragment.class.getName(), ThankYouFragment.class.getName(), FeedbackScreenFragment.class.getName() };
  private static final String VIEW_SETTER_MARKER = "$$ViewSetter";
  @NonNull
  private static final HashMap<String, ViewSetter> viewSetterCache = new HashMap();
  private final Localizer localizer;
  
  @Inject
  public ViewSetterFactory(Localizer paramLocalizer)
  {
    this.localizer = paramLocalizer;
  }
  
  @NonNull
  private ViewSetter get(@NonNull Object paramObject1, @NonNull Object paramObject2)
  {
    Object localObject2;
    Object localObject1;
    if ((paramObject2 instanceof Menu))
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(paramObject1.getClass().getName());
      localObject1 = "$$MenuViewSetter";
      paramObject1 = localObject2;
    }
    for (;;)
    {
      ((StringBuilder)paramObject1).append((String)localObject1);
      paramObject1 = ((StringBuilder)paramObject1).toString();
      break;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(paramObject1.getClass().getName());
      localObject2 = "$$ViewSetter";
      paramObject1 = localObject1;
      localObject1 = localObject2;
    }
    return get((String)paramObject1, paramObject2);
  }
  
  @NonNull
  private ViewSetter get(@NonNull String paramString, @NonNull Object paramObject)
  {
    ViewSetter localViewSetter = (ViewSetter)viewSetterCache.get(paramString);
    if (localViewSetter != null)
    {
      localViewSetter.view = paramObject;
      return localViewSetter;
    }
    if (isSpecialClass(paramString)) {
      paramObject = getDefaultViewSetter();
    } else {
      paramObject = getGeneratedViewSetter(paramString, paramObject);
    }
    viewSetterCache.put(paramString, paramObject);
    return (ViewSetter)paramObject;
  }
  
  private ViewSetter getDefaultViewSetter()
  {
    new ViewSetter(null, this.localizer)
    {
      public void update() {}
    };
  }
  
  private ViewSetter getGeneratedViewSetter(String paramString, Object paramObject)
  {
    try
    {
      a.b("ViewSetter.get(%s): Cache Miss! Invoking evil black voodoo aka Reflection!", new Object[] { paramString });
      paramObject = (ViewSetter)Class.forName(paramString).getDeclaredConstructor(new Class[] { Object.class, Localizer.class }).newInstance(new Object[] { paramObject, this.localizer });
      return (ViewSetter)paramObject;
    }
    catch (Exception paramObject)
    {
      a.d((Throwable)paramObject, "Cannot find ViewSetter %s", new Object[] { paramString });
    }
    return getDefaultViewSetter();
  }
  
  @NonNull
  public ViewSetter create(@NonNull Activity paramActivity)
  {
    return get(paramActivity, paramActivity);
  }
  
  @NonNull
  public ViewSetter create(@NonNull Activity paramActivity, @NonNull Menu paramMenu)
  {
    return get(paramActivity, paramMenu);
  }
  
  @NonNull
  public ViewSetter create(@NonNull ArrayAdapter paramArrayAdapter, @NonNull View paramView)
  {
    return get(paramArrayAdapter, paramView);
  }
  
  @NonNull
  public ViewSetter create(@NonNull ListAdapter paramListAdapter, @NonNull View paramView)
  {
    return get(paramListAdapter, paramView);
  }
  
  @NonNull
  public ViewSetter create(@NonNull B2PFragment paramB2PFragment, @NonNull View paramView)
  {
    return get(paramB2PFragment, paramView);
  }
  
  boolean isSpecialClass(@Nullable String paramString)
  {
    if (h.a(paramString)) {
      return false;
    }
    String[] arrayOfString = SPECIAL_VIEW_SETTER_LIST;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str = arrayOfString[i];
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(str);
      localStringBuilder.append("$$ViewSetter");
      if (paramString.equals(localStringBuilder.toString())) {
        return true;
      }
      i += 1;
    }
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/ViewSetterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
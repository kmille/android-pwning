package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.RemoteViews;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;

public class AppWidgetTarget
  extends SimpleTarget<Bitmap>
{
  private final ComponentName componentName;
  private final Context context;
  private final RemoteViews remoteViews;
  private final int viewId;
  private final int[] widgetIds;
  
  public AppWidgetTarget(Context paramContext, int paramInt1, int paramInt2, int paramInt3, RemoteViews paramRemoteViews, ComponentName paramComponentName)
  {
    super(paramInt1, paramInt2);
    this.context = ((Context)Preconditions.checkNotNull(paramContext, "Context can not be null!"));
    this.remoteViews = ((RemoteViews)Preconditions.checkNotNull(paramRemoteViews, "RemoteViews object can not be null!"));
    this.componentName = ((ComponentName)Preconditions.checkNotNull(paramComponentName, "ComponentName can not be null!"));
    this.viewId = paramInt3;
    this.widgetIds = null;
  }
  
  public AppWidgetTarget(Context paramContext, int paramInt1, int paramInt2, int paramInt3, RemoteViews paramRemoteViews, int... paramVarArgs)
  {
    super(paramInt1, paramInt2);
    if (paramVarArgs.length != 0)
    {
      this.context = ((Context)Preconditions.checkNotNull(paramContext, "Context can not be null!"));
      this.remoteViews = ((RemoteViews)Preconditions.checkNotNull(paramRemoteViews, "RemoteViews object can not be null!"));
      this.widgetIds = ((int[])Preconditions.checkNotNull(paramVarArgs, "WidgetIds can not be null!"));
      this.viewId = paramInt3;
      this.componentName = null;
      return;
    }
    throw new IllegalArgumentException("WidgetIds must have length > 0");
  }
  
  public AppWidgetTarget(Context paramContext, int paramInt, RemoteViews paramRemoteViews, ComponentName paramComponentName)
  {
    this(paramContext, Integer.MIN_VALUE, Integer.MIN_VALUE, paramInt, paramRemoteViews, paramComponentName);
  }
  
  public AppWidgetTarget(Context paramContext, int paramInt, RemoteViews paramRemoteViews, int... paramVarArgs)
  {
    this(paramContext, Integer.MIN_VALUE, Integer.MIN_VALUE, paramInt, paramRemoteViews, paramVarArgs);
  }
  
  private void update()
  {
    AppWidgetManager localAppWidgetManager = AppWidgetManager.getInstance(this.context);
    if (this.componentName != null)
    {
      localAppWidgetManager.updateAppWidget(this.componentName, this.remoteViews);
      return;
    }
    localAppWidgetManager.updateAppWidget(this.widgetIds, this.remoteViews);
  }
  
  public void onResourceReady(@NonNull Bitmap paramBitmap, @Nullable Transition<? super Bitmap> paramTransition)
  {
    this.remoteViews.setImageViewBitmap(this.viewId, paramBitmap);
    update();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/target/AppWidgetTarget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
public abstract class ViewTarget<T extends View, Z>
  extends BaseTarget<Z>
{
  private static final String TAG = "ViewTarget";
  private static boolean isTagUsedAtLeastOnce;
  @Nullable
  private static Integer tagId;
  @Nullable
  private View.OnAttachStateChangeListener attachStateListener;
  private boolean isAttachStateListenerAdded;
  private boolean isClearedByUs;
  private final SizeDeterminer sizeDeterminer;
  protected final T view;
  
  public ViewTarget(@NonNull T paramT)
  {
    this.view = ((View)Preconditions.checkNotNull(paramT));
    this.sizeDeterminer = new SizeDeterminer(paramT);
  }
  
  @Deprecated
  public ViewTarget(@NonNull T paramT, boolean paramBoolean)
  {
    this(paramT);
    if (paramBoolean) {
      waitForLayout();
    }
  }
  
  @Nullable
  private Object getTag()
  {
    if (tagId == null) {
      return this.view.getTag();
    }
    return this.view.getTag(tagId.intValue());
  }
  
  private void maybeAddAttachStateListener()
  {
    if (this.attachStateListener != null)
    {
      if (this.isAttachStateListenerAdded) {
        return;
      }
      this.view.addOnAttachStateChangeListener(this.attachStateListener);
      this.isAttachStateListenerAdded = true;
    }
  }
  
  private void maybeRemoveAttachStateListener()
  {
    if (this.attachStateListener != null)
    {
      if (!this.isAttachStateListenerAdded) {
        return;
      }
      this.view.removeOnAttachStateChangeListener(this.attachStateListener);
      this.isAttachStateListenerAdded = false;
    }
  }
  
  private void setTag(@Nullable Object paramObject)
  {
    if (tagId == null)
    {
      isTagUsedAtLeastOnce = true;
      this.view.setTag(paramObject);
      return;
    }
    this.view.setTag(tagId.intValue(), paramObject);
  }
  
  public static void setTagId(int paramInt)
  {
    if ((tagId == null) && (!isTagUsedAtLeastOnce))
    {
      tagId = Integer.valueOf(paramInt);
      return;
    }
    throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
  }
  
  @NonNull
  public final ViewTarget<T, Z> clearOnDetach()
  {
    if (this.attachStateListener != null) {
      return this;
    }
    this.attachStateListener = new View.OnAttachStateChangeListener()
    {
      public void onViewAttachedToWindow(View paramAnonymousView)
      {
        ViewTarget.this.resumeMyRequest();
      }
      
      public void onViewDetachedFromWindow(View paramAnonymousView)
      {
        ViewTarget.this.pauseMyRequest();
      }
    };
    maybeAddAttachStateListener();
    return this;
  }
  
  @Nullable
  public Request getRequest()
  {
    Object localObject = getTag();
    if (localObject != null)
    {
      if ((localObject instanceof Request)) {
        return (Request)localObject;
      }
      throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }
    return null;
  }
  
  @CallSuper
  public void getSize(@NonNull SizeReadyCallback paramSizeReadyCallback)
  {
    this.sizeDeterminer.getSize(paramSizeReadyCallback);
  }
  
  @NonNull
  public T getView()
  {
    return this.view;
  }
  
  @CallSuper
  public void onLoadCleared(@Nullable Drawable paramDrawable)
  {
    super.onLoadCleared(paramDrawable);
    this.sizeDeterminer.clearCallbacksAndListener();
    if (!this.isClearedByUs) {
      maybeRemoveAttachStateListener();
    }
  }
  
  @CallSuper
  public void onLoadStarted(@Nullable Drawable paramDrawable)
  {
    super.onLoadStarted(paramDrawable);
    maybeAddAttachStateListener();
  }
  
  void pauseMyRequest()
  {
    Request localRequest = getRequest();
    if (localRequest != null)
    {
      this.isClearedByUs = true;
      localRequest.clear();
      this.isClearedByUs = false;
    }
  }
  
  @CallSuper
  public void removeCallback(@NonNull SizeReadyCallback paramSizeReadyCallback)
  {
    this.sizeDeterminer.removeCallback(paramSizeReadyCallback);
  }
  
  void resumeMyRequest()
  {
    Request localRequest = getRequest();
    if ((localRequest != null) && (localRequest.isCleared())) {
      localRequest.begin();
    }
  }
  
  public void setRequest(@Nullable Request paramRequest)
  {
    setTag(paramRequest);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Target for: ");
    localStringBuilder.append(this.view);
    return localStringBuilder.toString();
  }
  
  @NonNull
  public final ViewTarget<T, Z> waitForLayout()
  {
    this.sizeDeterminer.waitForLayout = true;
    return this;
  }
  
  @VisibleForTesting
  static final class SizeDeterminer
  {
    private static final int PENDING_SIZE = 0;
    @Nullable
    @VisibleForTesting
    static Integer maxDisplayLength;
    private final List<SizeReadyCallback> cbs = new ArrayList();
    @Nullable
    private SizeDeterminerLayoutListener layoutListener;
    private final View view;
    boolean waitForLayout;
    
    SizeDeterminer(@NonNull View paramView)
    {
      this.view = paramView;
    }
    
    private static int getMaxDisplayLength(@NonNull Context paramContext)
    {
      if (maxDisplayLength == null)
      {
        paramContext = ((WindowManager)Preconditions.checkNotNull((WindowManager)paramContext.getSystemService("window"))).getDefaultDisplay();
        Point localPoint = new Point();
        paramContext.getSize(localPoint);
        maxDisplayLength = Integer.valueOf(Math.max(localPoint.x, localPoint.y));
      }
      return maxDisplayLength.intValue();
    }
    
    private int getTargetDimen(int paramInt1, int paramInt2, int paramInt3)
    {
      int i = paramInt2 - paramInt3;
      if (i > 0) {
        return i;
      }
      if ((this.waitForLayout) && (this.view.isLayoutRequested())) {
        return 0;
      }
      paramInt1 -= paramInt3;
      if (paramInt1 > 0) {
        return paramInt1;
      }
      if ((!this.view.isLayoutRequested()) && (paramInt2 == -2))
      {
        Log.isLoggable("ViewTarget", 4);
        return getMaxDisplayLength(this.view.getContext());
      }
      return 0;
    }
    
    private int getTargetHeight()
    {
      int j = this.view.getPaddingTop();
      int k = this.view.getPaddingBottom();
      ViewGroup.LayoutParams localLayoutParams = this.view.getLayoutParams();
      int i;
      if (localLayoutParams != null) {
        i = localLayoutParams.height;
      } else {
        i = 0;
      }
      return getTargetDimen(this.view.getHeight(), i, j + k);
    }
    
    private int getTargetWidth()
    {
      int j = this.view.getPaddingLeft();
      int k = this.view.getPaddingRight();
      ViewGroup.LayoutParams localLayoutParams = this.view.getLayoutParams();
      int i;
      if (localLayoutParams != null) {
        i = localLayoutParams.width;
      } else {
        i = 0;
      }
      return getTargetDimen(this.view.getWidth(), i, j + k);
    }
    
    private boolean isDimensionValid(int paramInt)
    {
      return (paramInt > 0) || (paramInt == Integer.MIN_VALUE);
    }
    
    private boolean isViewStateAndSizeValid(int paramInt1, int paramInt2)
    {
      return (isDimensionValid(paramInt1)) && (isDimensionValid(paramInt2));
    }
    
    private void notifyCbs(int paramInt1, int paramInt2)
    {
      Iterator localIterator = new ArrayList(this.cbs).iterator();
      while (localIterator.hasNext()) {
        ((SizeReadyCallback)localIterator.next()).onSizeReady(paramInt1, paramInt2);
      }
    }
    
    final void checkCurrentDimens()
    {
      if (this.cbs.isEmpty()) {
        return;
      }
      int i = getTargetWidth();
      int j = getTargetHeight();
      if (!isViewStateAndSizeValid(i, j)) {
        return;
      }
      notifyCbs(i, j);
      clearCallbacksAndListener();
    }
    
    final void clearCallbacksAndListener()
    {
      ViewTreeObserver localViewTreeObserver = this.view.getViewTreeObserver();
      if (localViewTreeObserver.isAlive()) {
        localViewTreeObserver.removeOnPreDrawListener(this.layoutListener);
      }
      this.layoutListener = null;
      this.cbs.clear();
    }
    
    final void getSize(@NonNull SizeReadyCallback paramSizeReadyCallback)
    {
      int i = getTargetWidth();
      int j = getTargetHeight();
      if (isViewStateAndSizeValid(i, j))
      {
        paramSizeReadyCallback.onSizeReady(i, j);
        return;
      }
      if (!this.cbs.contains(paramSizeReadyCallback)) {
        this.cbs.add(paramSizeReadyCallback);
      }
      if (this.layoutListener == null)
      {
        paramSizeReadyCallback = this.view.getViewTreeObserver();
        this.layoutListener = new SizeDeterminerLayoutListener(this);
        paramSizeReadyCallback.addOnPreDrawListener(this.layoutListener);
      }
    }
    
    final void removeCallback(@NonNull SizeReadyCallback paramSizeReadyCallback)
    {
      this.cbs.remove(paramSizeReadyCallback);
    }
    
    static final class SizeDeterminerLayoutListener
      implements ViewTreeObserver.OnPreDrawListener
    {
      private final WeakReference<ViewTarget.SizeDeterminer> sizeDeterminerRef;
      
      SizeDeterminerLayoutListener(@NonNull ViewTarget.SizeDeterminer paramSizeDeterminer)
      {
        this.sizeDeterminerRef = new WeakReference(paramSizeDeterminer);
      }
      
      public final boolean onPreDraw()
      {
        if (Log.isLoggable("ViewTarget", 2)) {
          new StringBuilder("OnGlobalLayoutListener called attachStateListener=").append(this);
        }
        ViewTarget.SizeDeterminer localSizeDeterminer = (ViewTarget.SizeDeterminer)this.sizeDeterminerRef.get();
        if (localSizeDeterminer != null) {
          localSizeDeterminer.checkCurrentDimens();
        }
        return true;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/target/ViewTarget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
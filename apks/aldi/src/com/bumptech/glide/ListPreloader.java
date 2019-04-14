package com.bumptech.glide;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.bumptech.glide.request.target.BaseTarget;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.List;
import java.util.Queue;

public class ListPreloader<T>
  implements AbsListView.OnScrollListener
{
  private boolean isIncreasing = true;
  private int lastEnd;
  private int lastFirstVisible = -1;
  private int lastStart;
  private final int maxPreload;
  private final PreloadSizeProvider<T> preloadDimensionProvider;
  private final PreloadModelProvider<T> preloadModelProvider;
  private final PreloadTargetQueue preloadTargetQueue;
  private final RequestManager requestManager;
  private int totalItemCount;
  
  public ListPreloader(@NonNull RequestManager paramRequestManager, @NonNull PreloadModelProvider<T> paramPreloadModelProvider, @NonNull PreloadSizeProvider<T> paramPreloadSizeProvider, int paramInt)
  {
    this.requestManager = paramRequestManager;
    this.preloadModelProvider = paramPreloadModelProvider;
    this.preloadDimensionProvider = paramPreloadSizeProvider;
    this.maxPreload = paramInt;
    this.preloadTargetQueue = new PreloadTargetQueue(paramInt + 1);
  }
  
  private void cancelAll()
  {
    int i = 0;
    while (i < this.maxPreload)
    {
      this.requestManager.clear(this.preloadTargetQueue.next(0, 0));
      i += 1;
    }
  }
  
  private void preload(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2)
    {
      i = Math.max(this.lastEnd, paramInt1);
      j = paramInt2;
    }
    else
    {
      j = Math.min(this.lastStart, paramInt1);
      i = paramInt2;
    }
    int j = Math.min(this.totalItemCount, j);
    int i = Math.min(this.totalItemCount, Math.max(0, i));
    if (paramInt1 < paramInt2)
    {
      paramInt1 = i;
      while (paramInt1 < j)
      {
        preloadAdapterPosition(this.preloadModelProvider.getPreloadItems(paramInt1), paramInt1, true);
        paramInt1 += 1;
      }
    }
    paramInt1 = j - 1;
    while (paramInt1 >= i)
    {
      preloadAdapterPosition(this.preloadModelProvider.getPreloadItems(paramInt1), paramInt1, false);
      paramInt1 -= 1;
    }
    this.lastStart = i;
    this.lastEnd = j;
  }
  
  private void preload(int paramInt, boolean paramBoolean)
  {
    if (this.isIncreasing != paramBoolean)
    {
      this.isIncreasing = paramBoolean;
      cancelAll();
    }
    int i;
    if (paramBoolean) {
      i = this.maxPreload;
    } else {
      i = -this.maxPreload;
    }
    preload(paramInt, i + paramInt);
  }
  
  private void preloadAdapterPosition(List<T> paramList, int paramInt, boolean paramBoolean)
  {
    int j = paramList.size();
    if (paramBoolean)
    {
      i = 0;
      while (i < j)
      {
        preloadItem(paramList.get(i), paramInt, i);
        i += 1;
      }
      return;
    }
    int i = j - 1;
    while (i >= 0)
    {
      preloadItem(paramList.get(i), paramInt, i);
      i -= 1;
    }
  }
  
  private void preloadItem(@Nullable T paramT, int paramInt1, int paramInt2)
  {
    if (paramT == null) {
      return;
    }
    int[] arrayOfInt = this.preloadDimensionProvider.getPreloadSize(paramT, paramInt1, paramInt2);
    if (arrayOfInt == null) {
      return;
    }
    paramT = this.preloadModelProvider.getPreloadRequestBuilder(paramT);
    if (paramT == null) {
      return;
    }
    paramT.into(this.preloadTargetQueue.next(arrayOfInt[0], arrayOfInt[1]));
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.totalItemCount = paramInt3;
    if (paramInt1 > this.lastFirstVisible) {
      preload(paramInt2 + paramInt1, true);
    } else if (paramInt1 < this.lastFirstVisible) {
      preload(paramInt1, false);
    }
    this.lastFirstVisible = paramInt1;
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
  
  public static abstract interface PreloadModelProvider<U>
  {
    @NonNull
    public abstract List<U> getPreloadItems(int paramInt);
    
    @Nullable
    public abstract RequestBuilder<?> getPreloadRequestBuilder(@NonNull U paramU);
  }
  
  public static abstract interface PreloadSizeProvider<T>
  {
    @Nullable
    public abstract int[] getPreloadSize(@NonNull T paramT, int paramInt1, int paramInt2);
  }
  
  static final class PreloadTarget
    extends BaseTarget<Object>
  {
    int photoHeight;
    int photoWidth;
    
    public final void getSize(@NonNull SizeReadyCallback paramSizeReadyCallback)
    {
      paramSizeReadyCallback.onSizeReady(this.photoWidth, this.photoHeight);
    }
    
    public final void onResourceReady(@NonNull Object paramObject, @Nullable Transition<? super Object> paramTransition) {}
    
    public final void removeCallback(@NonNull SizeReadyCallback paramSizeReadyCallback) {}
  }
  
  static final class PreloadTargetQueue
  {
    private final Queue<ListPreloader.PreloadTarget> queue;
    
    PreloadTargetQueue(int paramInt)
    {
      this.queue = Util.createQueue(paramInt);
      int i = 0;
      while (i < paramInt)
      {
        this.queue.offer(new ListPreloader.PreloadTarget());
        i += 1;
      }
    }
    
    public final ListPreloader.PreloadTarget next(int paramInt1, int paramInt2)
    {
      ListPreloader.PreloadTarget localPreloadTarget = (ListPreloader.PreloadTarget)this.queue.poll();
      this.queue.offer(localPreloadTarget);
      localPreloadTarget.photoWidth = paramInt1;
      localPreloadTarget.photoHeight = paramInt2;
      return localPreloadTarget;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/ListPreloader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
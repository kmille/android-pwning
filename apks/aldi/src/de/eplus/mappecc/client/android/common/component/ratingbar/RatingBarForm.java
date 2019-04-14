package de.eplus.mappecc.client.android.common.component.ratingbar;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import b.r;
import de.eplus.mappecc.client.android.R.id;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import java.util.HashMap;

@b.j(a={1, 1, 13}, b={"\000>\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\007\n\002\b\003\030\0002\0020\001B\021\b\026\022\b\020\002\032\004\030\0010\003¢\006\002\020\004B\033\b\026\022\b\020\002\032\004\030\0010\003\022\b\020\005\032\004\030\0010\006¢\006\002\020\007B#\b\026\022\b\020\002\032\004\030\0010\003\022\b\020\005\032\004\030\0010\006\022\006\020\b\032\0020\t¢\006\002\020\nB+\b\027\022\b\020\002\032\004\030\0010\003\022\b\020\005\032\004\030\0010\006\022\006\020\b\032\0020\t\022\006\020\013\032\0020\t¢\006\002\020\fJ\006\020\021\032\0020\tJ\020\020\022\032\0020\0232\006\020\024\032\0020\025H\002J\016\020\026\032\0020\0232\006\020\027\032\0020\020R\016\020\r\032\0020\016X\016¢\006\002\n\000R\016\020\017\032\0020\020X.¢\006\002\n\000¨\006\030"}, c={"Lde/eplus/mappecc/client/android/common/component/ratingbar/RatingBarForm;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "ratingBar", "Landroid/widget/RatingBar;", "ratingBarCallback", "Lde/eplus/mappecc/client/android/common/component/ratingbar/RatingBarCallback;", "getRating", "onRatingChanged", "", "rating", "", "setCallback", "callback", "app_alditalkRelease"})
public final class RatingBarForm
  extends LinearLayout
{
  private HashMap _$_findViewCache;
  private RatingBar ratingBar;
  private RatingBarCallback ratingBarCallback;
  
  public RatingBarForm(Context paramContext)
  {
    super(paramContext);
    B2PApplication.component.inject(this);
    LinearLayout.inflate(getContext(), 2131427471, (ViewGroup)this);
    paramContext = (RatingBar)_$_findCachedViewById(R.id.customRatingBar);
    if (paramContext != null)
    {
      this.ratingBar = paramContext;
      this.ratingBar.setOnRatingBarChangeListener((RatingBar.OnRatingBarChangeListener)new RatingBar.OnRatingBarChangeListener()
      {
        public final void onRatingChanged(RatingBar paramAnonymousRatingBar, float paramAnonymousFloat, boolean paramAnonymousBoolean)
        {
          RatingBarForm.access$onRatingChanged(this.this$0, paramAnonymousFloat);
        }
      });
      return;
    }
    throw new r("null cannot be cast to non-null type android.widget.RatingBar");
  }
  
  public RatingBarForm(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    B2PApplication.component.inject(this);
    LinearLayout.inflate(getContext(), 2131427471, (ViewGroup)this);
    paramContext = (RatingBar)_$_findCachedViewById(R.id.customRatingBar);
    if (paramContext != null)
    {
      this.ratingBar = paramContext;
      this.ratingBar.setOnRatingBarChangeListener((RatingBar.OnRatingBarChangeListener)new RatingBar.OnRatingBarChangeListener()
      {
        public final void onRatingChanged(RatingBar paramAnonymousRatingBar, float paramAnonymousFloat, boolean paramAnonymousBoolean)
        {
          RatingBarForm.access$onRatingChanged(this.this$0, paramAnonymousFloat);
        }
      });
      return;
    }
    throw new r("null cannot be cast to non-null type android.widget.RatingBar");
  }
  
  public RatingBarForm(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    B2PApplication.component.inject(this);
    LinearLayout.inflate(getContext(), 2131427471, (ViewGroup)this);
    paramContext = (RatingBar)_$_findCachedViewById(R.id.customRatingBar);
    if (paramContext != null)
    {
      this.ratingBar = paramContext;
      this.ratingBar.setOnRatingBarChangeListener((RatingBar.OnRatingBarChangeListener)new RatingBar.OnRatingBarChangeListener()
      {
        public final void onRatingChanged(RatingBar paramAnonymousRatingBar, float paramAnonymousFloat, boolean paramAnonymousBoolean)
        {
          RatingBarForm.access$onRatingChanged(this.this$0, paramAnonymousFloat);
        }
      });
      return;
    }
    throw new r("null cannot be cast to non-null type android.widget.RatingBar");
  }
  
  @RequiresApi(21)
  public RatingBarForm(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    B2PApplication.component.inject(this);
    LinearLayout.inflate(getContext(), 2131427471, (ViewGroup)this);
    paramContext = (RatingBar)_$_findCachedViewById(R.id.customRatingBar);
    if (paramContext != null)
    {
      this.ratingBar = paramContext;
      this.ratingBar.setOnRatingBarChangeListener((RatingBar.OnRatingBarChangeListener)new RatingBar.OnRatingBarChangeListener()
      {
        public final void onRatingChanged(RatingBar paramAnonymousRatingBar, float paramAnonymousFloat, boolean paramAnonymousBoolean)
        {
          RatingBarForm.access$onRatingChanged(this.this$0, paramAnonymousFloat);
        }
      });
      return;
    }
    throw new r("null cannot be cast to non-null type android.widget.RatingBar");
  }
  
  private final void onRatingChanged(float paramFloat)
  {
    double d = paramFloat;
    Double.isNaN(d);
    float f = (float)Math.ceil(d / 1.0D);
    if (paramFloat == 0.0F) {
      f = 1.0F;
    }
    this.ratingBar.setRating(f);
    RatingBarCallback localRatingBarCallback = this.ratingBarCallback;
    if (localRatingBarCallback == null) {
      b.f.b.j.a("ratingBarCallback");
    }
    localRatingBarCallback.onRatingChanged((int)this.ratingBar.getRating());
  }
  
  public final void _$_clearFindViewByIdCache()
  {
    if (this._$_findViewCache != null) {
      this._$_findViewCache.clear();
    }
  }
  
  public final View _$_findCachedViewById(int paramInt)
  {
    if (this._$_findViewCache == null) {
      this._$_findViewCache = new HashMap();
    }
    View localView2 = (View)this._$_findViewCache.get(Integer.valueOf(paramInt));
    View localView1 = localView2;
    if (localView2 == null)
    {
      localView1 = findViewById(paramInt);
      this._$_findViewCache.put(Integer.valueOf(paramInt), localView1);
    }
    return localView1;
  }
  
  public final int getRating()
  {
    return (int)this.ratingBar.getRating();
  }
  
  public final void setCallback(RatingBarCallback paramRatingBarCallback)
  {
    b.f.b.j.b(paramRatingBarCallback, "callback");
    this.ratingBarCallback = paramRatingBarCallback;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/ratingbar/RatingBarForm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
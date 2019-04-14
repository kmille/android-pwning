package de.eplus.mappecc.client.android.common.component.expandabletable;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import de.eplus.mappecc.client.android.common.model.PackDataModel;
import java.util.ArrayList;

public class ExpandableTableView
  extends CardView
  implements IExpandableTableView
{
  private ValueAnimator animator;
  private Unbinder binder;
  @BindView
  RelativeLayout clickAreaRelativeLayout;
  private Context context;
  @BindView
  RecyclerView descriptionRecyclerView;
  @BindView
  LinearLayout expentableTableLinearLayout;
  @BindView
  ImageView imageButtonExpand;
  private boolean initialzed = false;
  @BindView
  View lineView;
  private ExpandableTablePresenter presenter;
  @BindView
  TextView textViewTitle;
  
  public ExpandableTableView(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
    init();
  }
  
  public ExpandableTableView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    init();
  }
  
  public ExpandableTableView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    init();
  }
  
  private void collapseAnimation()
  {
    ValueAnimator localValueAnimator = getSlideAnimator(this.descriptionRecyclerView.getHeight(), 0);
    localValueAnimator.addListener(new Animator.AnimatorListener()
    {
      public void onAnimationCancel(Animator paramAnonymousAnimator) {}
      
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        ExpandableTableView.this.descriptionRecyclerView.setVisibility(8);
      }
      
      public void onAnimationRepeat(Animator paramAnonymousAnimator) {}
      
      public void onAnimationStart(Animator paramAnonymousAnimator) {}
    });
    localValueAnimator.start();
  }
  
  private void expandAnimation()
  {
    this.descriptionRecyclerView.setVisibility(0);
    this.animator.start();
  }
  
  private ValueAnimator getSlideAnimator(int paramInt1, int paramInt2)
  {
    ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { paramInt1, paramInt2 });
    localValueAnimator.addUpdateListener(new -..Lambda.ExpandableTableView.lsmNMbM11wLjrlAVto_yGqJJEQk(this));
    return localValueAnimator;
  }
  
  private void init()
  {
    inflate(this.context, 2131427431, this);
    B2PApplication.component.inject(this);
    this.binder = ButterKnife.a(this);
    if (Build.VERSION.SDK_INT < 21) {
      setCardElevation(0.0F);
    }
  }
  
  private void initTableView()
  {
    this.presenter = new ExpandableTablePresenter(this);
    this.descriptionRecyclerView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public boolean onPreDraw()
      {
        ExpandableTableView.this.descriptionRecyclerView.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableTableView.this.descriptionRecyclerView.setVisibility(8);
        ExpandableTableView.this.imageButtonExpand.setImageDrawable(ContextCompat.getDrawable(ExpandableTableView.this.context, 2131165404));
        ExpandableTableView.this.lineView.setVisibility(8);
        int i = View.MeasureSpec.makeMeasureSpec(0, 0);
        int j = View.MeasureSpec.makeMeasureSpec(0, 0);
        ExpandableTableView.this.descriptionRecyclerView.measure(i, j);
        ExpandableTableView.access$102(ExpandableTableView.this, ExpandableTableView.this.getSlideAnimator(0, ExpandableTableView.this.descriptionRecyclerView.getMeasuredHeight()));
        return true;
      }
    });
  }
  
  public void collapse()
  {
    collapseAnimation();
    this.imageButtonExpand.setImageDrawable(ContextCompat.getDrawable(this.context, 2131165404));
    this.lineView.setVisibility(8);
  }
  
  public void expand()
  {
    expandAnimation();
    this.imageButtonExpand.setImageDrawable(ContextCompat.getDrawable(this.context, 2131165407));
    this.lineView.setVisibility(0);
  }
  
  public void fillTable(String paramString, PackDataModel paramPackDataModel)
  {
    if (!this.initialzed)
    {
      this.initialzed = true;
      if ((paramPackDataModel.getDetailsHeaderStringList().size() == 0) && (paramPackDataModel.getDetailsStringList().size() == 0)) {
        this.expentableTableLinearLayout.setVisibility(8);
      }
      this.descriptionRecyclerView.setNestedScrollingEnabled(false);
      this.descriptionRecyclerView.setHasFixedSize(false);
      this.descriptionRecyclerView.setClipToPadding(true);
      this.descriptionRecyclerView.setLayoutManager(new LinearLayoutManager(this.context));
      paramPackDataModel = new ExpandableTableAdapter(this.context, paramPackDataModel);
      this.descriptionRecyclerView.setAdapter(paramPackDataModel);
      this.textViewTitle.setText(paramString);
      this.clickAreaRelativeLayout.setOnClickListener(new -..Lambda.ExpandableTableView.Ch0R9srmjg_eQeJ-DGpJXTV3bWM(this));
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    initTableView();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.binder != null) {
      this.binder.unbind();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/expandabletable/ExpandableTableView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.view;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.support.constraint.Constraints.LayoutParams;
import android.support.constraint.Group;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import de.eplus.mappecc.client.android.common.component.button.OnSingleClickListener;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.model.B2PDialogButtonConfig;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.model.contentstyle.B2PDialogContentStyle;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.view.button.B2PDialogButtonCallback;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.view.button.B2PDialogButtonLayout;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.view.content.B2PDialogOnlyMessageView;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.view.content.B2PDialogTitleMessageView;

public class B2PDialogView
  extends ConstraintLayout
{
  private B2PDialogButtonLayout b2PDialogButtonLayout;
  private ImageView backgroundIconImageView;
  private LinearLayout contentPlaceHolderFrameLayout;
  private Group group;
  private ImageView innerIconImageView;
  
  public B2PDialogView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public B2PDialogView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public B2PDialogView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void addContentToPlaceholder(B2PDialogContentStyle paramB2PDialogContentStyle, View paramView)
  {
    this.contentPlaceHolderFrameLayout.setPadding(paramB2PDialogContentStyle.getPaddingLeft(), paramB2PDialogContentStyle.getPaddingTop(), paramB2PDialogContentStyle.getPaddingRight(), paramB2PDialogContentStyle.getPaddingBottom());
    this.contentPlaceHolderFrameLayout.removeAllViews();
    this.contentPlaceHolderFrameLayout.addView(paramView);
    this.contentPlaceHolderFrameLayout.requestLayout();
  }
  
  private void init()
  {
    inflate(getContext(), 2131427426, this);
    prepareLayoutParms();
    this.backgroundIconImageView = ((ImageView)findViewById(2131230994));
    this.innerIconImageView = ((ImageView)findViewById(2131231003));
    this.group = ((Group)findViewById(2131230945));
    this.contentPlaceHolderFrameLayout = ((LinearLayout)findViewById(2131231135));
    this.b2PDialogButtonLayout = ((B2PDialogButtonLayout)findViewById(2131230755));
  }
  
  private void prepareLayoutParms()
  {
    setLayoutParams(new Constraints.LayoutParams(-1, -2));
  }
  
  public void setContent(@NonNull B2PDialogContentStyle paramB2PDialogContentStyle, @NonNull CharSequence paramCharSequence)
  {
    B2PDialogOnlyMessageView localB2PDialogOnlyMessageView = new B2PDialogOnlyMessageView(getContext());
    localB2PDialogOnlyMessageView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
    localB2PDialogOnlyMessageView.setMessage(paramCharSequence);
    localB2PDialogOnlyMessageView.setMessageGravity(paramB2PDialogContentStyle.getContentGravity());
    addContentToPlaceholder(paramB2PDialogContentStyle, localB2PDialogOnlyMessageView);
  }
  
  public void setContent(@NonNull B2PDialogContentStyle paramB2PDialogContentStyle, @NonNull CharSequence paramCharSequence1, @NonNull CharSequence paramCharSequence2)
  {
    B2PDialogTitleMessageView localB2PDialogTitleMessageView = new B2PDialogTitleMessageView(getContext());
    localB2PDialogTitleMessageView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
    localB2PDialogTitleMessageView.setTitle(paramCharSequence1);
    localB2PDialogTitleMessageView.setMessage(paramCharSequence2);
    localB2PDialogTitleMessageView.setMessageGravity(paramB2PDialogContentStyle.getContentGravity());
    localB2PDialogTitleMessageView.setTitleMessageSpace(paramB2PDialogContentStyle.getTitleContentSpace());
    addContentToPlaceholder(paramB2PDialogContentStyle, localB2PDialogTitleMessageView);
  }
  
  public void setDoubleDialogButton(@NonNull B2PDialogButtonConfig paramB2PDialogButtonConfig1, @NonNull B2PDialogButtonConfig paramB2PDialogButtonConfig2)
  {
    this.b2PDialogButtonLayout.removeAllButtons();
    this.b2PDialogButtonLayout.addButton(2131230808, paramB2PDialogButtonConfig2, 2131755013);
    this.b2PDialogButtonLayout.addButton(2131230810, paramB2PDialogButtonConfig1, 2131755014);
    this.b2PDialogButtonLayout.requestLayout();
  }
  
  public void setIcon(@DrawableRes int paramInt1, @DrawableRes int paramInt2)
  {
    this.backgroundIconImageView.setBackgroundResource(paramInt1);
    this.innerIconImageView.setBackgroundResource(paramInt2);
    this.group.setVisibility(0);
  }
  
  public void setIconClick(@NonNull final B2PDialogButtonCallback paramB2PDialogButtonCallback)
  {
    this.backgroundIconImageView.setOnClickListener(new OnSingleClickListener()
    {
      public void onSingleClick(View paramAnonymousView)
      {
        paramB2PDialogButtonCallback.onButtonClicked();
      }
    });
  }
  
  public void setSingleDialogButton(@NonNull B2PDialogButtonConfig paramB2PDialogButtonConfig)
  {
    this.b2PDialogButtonLayout.removeAllButtons();
    this.b2PDialogButtonLayout.addButton(2131230811, paramB2PDialogButtonConfig, 2131755012);
    this.b2PDialogButtonLayout.requestLayout();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/dialog/b2pdialog/view/B2PDialogView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
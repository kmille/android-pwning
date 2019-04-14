package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.R.dimen;
import android.support.v7.appcompat.R.layout;
import android.support.v7.widget.MenuPopupWindow;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

final class StandardMenuPopup
  extends MenuPopup
  implements MenuPresenter, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private static final int ITEM_LAYOUT = R.layout.abc_popup_menu_item_layout;
  private final MenuAdapter mAdapter;
  private View mAnchorView;
  private final View.OnAttachStateChangeListener mAttachStateChangeListener = new View.OnAttachStateChangeListener()
  {
    public void onViewAttachedToWindow(View paramAnonymousView) {}
    
    public void onViewDetachedFromWindow(View paramAnonymousView)
    {
      if (StandardMenuPopup.this.mTreeObserver != null)
      {
        if (!StandardMenuPopup.this.mTreeObserver.isAlive()) {
          StandardMenuPopup.this.mTreeObserver = paramAnonymousView.getViewTreeObserver();
        }
        StandardMenuPopup.this.mTreeObserver.removeGlobalOnLayoutListener(StandardMenuPopup.this.mGlobalLayoutListener);
      }
      paramAnonymousView.removeOnAttachStateChangeListener(this);
    }
  };
  private int mContentWidth;
  private final Context mContext;
  private int mDropDownGravity = 0;
  final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener()
  {
    public void onGlobalLayout()
    {
      if ((StandardMenuPopup.this.isShowing()) && (!StandardMenuPopup.this.mPopup.isModal()))
      {
        View localView = StandardMenuPopup.this.mShownAnchorView;
        if ((localView != null) && (localView.isShown()))
        {
          StandardMenuPopup.this.mPopup.show();
          return;
        }
        StandardMenuPopup.this.dismiss();
      }
    }
  };
  private boolean mHasContentWidth;
  private final MenuBuilder mMenu;
  private PopupWindow.OnDismissListener mOnDismissListener;
  private final boolean mOverflowOnly;
  final MenuPopupWindow mPopup;
  private final int mPopupMaxWidth;
  private final int mPopupStyleAttr;
  private final int mPopupStyleRes;
  private MenuPresenter.Callback mPresenterCallback;
  private boolean mShowTitle;
  View mShownAnchorView;
  ViewTreeObserver mTreeObserver;
  private boolean mWasDismissed;
  
  public StandardMenuPopup(Context paramContext, MenuBuilder paramMenuBuilder, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.mContext = paramContext;
    this.mMenu = paramMenuBuilder;
    this.mOverflowOnly = paramBoolean;
    this.mAdapter = new MenuAdapter(paramMenuBuilder, LayoutInflater.from(paramContext), this.mOverflowOnly, ITEM_LAYOUT);
    this.mPopupStyleAttr = paramInt1;
    this.mPopupStyleRes = paramInt2;
    Resources localResources = paramContext.getResources();
    this.mPopupMaxWidth = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    this.mAnchorView = paramView;
    this.mPopup = new MenuPopupWindow(this.mContext, null, this.mPopupStyleAttr, this.mPopupStyleRes);
    paramMenuBuilder.addMenuPresenter(this, paramContext);
  }
  
  private boolean tryShow()
  {
    if (isShowing()) {
      return true;
    }
    if (!this.mWasDismissed)
    {
      if (this.mAnchorView == null) {
        return false;
      }
      this.mShownAnchorView = this.mAnchorView;
      this.mPopup.setOnDismissListener(this);
      this.mPopup.setOnItemClickListener(this);
      this.mPopup.setModal(true);
      Object localObject = this.mShownAnchorView;
      int i;
      if (this.mTreeObserver == null) {
        i = 1;
      } else {
        i = 0;
      }
      this.mTreeObserver = ((View)localObject).getViewTreeObserver();
      if (i != 0) {
        this.mTreeObserver.addOnGlobalLayoutListener(this.mGlobalLayoutListener);
      }
      ((View)localObject).addOnAttachStateChangeListener(this.mAttachStateChangeListener);
      this.mPopup.setAnchorView((View)localObject);
      this.mPopup.setDropDownGravity(this.mDropDownGravity);
      if (!this.mHasContentWidth)
      {
        this.mContentWidth = measureIndividualMenuWidth(this.mAdapter, null, this.mContext, this.mPopupMaxWidth);
        this.mHasContentWidth = true;
      }
      this.mPopup.setContentWidth(this.mContentWidth);
      this.mPopup.setInputMethodMode(2);
      this.mPopup.setEpicenterBounds(getEpicenterBounds());
      this.mPopup.show();
      localObject = this.mPopup.getListView();
      ((ListView)localObject).setOnKeyListener(this);
      if ((this.mShowTitle) && (this.mMenu.getHeaderTitle() != null))
      {
        FrameLayout localFrameLayout = (FrameLayout)LayoutInflater.from(this.mContext).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup)localObject, false);
        TextView localTextView = (TextView)localFrameLayout.findViewById(16908310);
        if (localTextView != null) {
          localTextView.setText(this.mMenu.getHeaderTitle());
        }
        localFrameLayout.setEnabled(false);
        ((ListView)localObject).addHeaderView(localFrameLayout, null, false);
      }
      this.mPopup.setAdapter(this.mAdapter);
      this.mPopup.show();
      return true;
    }
    return false;
  }
  
  public final void addMenu(MenuBuilder paramMenuBuilder) {}
  
  public final void dismiss()
  {
    if (isShowing()) {
      this.mPopup.dismiss();
    }
  }
  
  public final boolean flagActionItems()
  {
    return false;
  }
  
  public final ListView getListView()
  {
    return this.mPopup.getListView();
  }
  
  public final boolean isShowing()
  {
    return (!this.mWasDismissed) && (this.mPopup.isShowing());
  }
  
  public final void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    if (paramMenuBuilder != this.mMenu) {
      return;
    }
    dismiss();
    if (this.mPresenterCallback != null) {
      this.mPresenterCallback.onCloseMenu(paramMenuBuilder, paramBoolean);
    }
  }
  
  public final void onDismiss()
  {
    this.mWasDismissed = true;
    this.mMenu.close();
    if (this.mTreeObserver != null)
    {
      if (!this.mTreeObserver.isAlive()) {
        this.mTreeObserver = this.mShownAnchorView.getViewTreeObserver();
      }
      this.mTreeObserver.removeGlobalOnLayoutListener(this.mGlobalLayoutListener);
      this.mTreeObserver = null;
    }
    this.mShownAnchorView.removeOnAttachStateChangeListener(this.mAttachStateChangeListener);
    if (this.mOnDismissListener != null) {
      this.mOnDismissListener.onDismiss();
    }
  }
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      return true;
    }
    return false;
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {}
  
  public final Parcelable onSaveInstanceState()
  {
    return null;
  }
  
  public final boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    if (paramSubMenuBuilder.hasVisibleItems())
    {
      MenuPopupHelper localMenuPopupHelper = new MenuPopupHelper(this.mContext, paramSubMenuBuilder, this.mShownAnchorView, this.mOverflowOnly, this.mPopupStyleAttr, this.mPopupStyleRes);
      localMenuPopupHelper.setPresenterCallback(this.mPresenterCallback);
      localMenuPopupHelper.setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(paramSubMenuBuilder));
      localMenuPopupHelper.setOnDismissListener(this.mOnDismissListener);
      this.mOnDismissListener = null;
      this.mMenu.close(false);
      int j = this.mPopup.getHorizontalOffset();
      int k = this.mPopup.getVerticalOffset();
      int i = j;
      if ((Gravity.getAbsoluteGravity(this.mDropDownGravity, ViewCompat.getLayoutDirection(this.mAnchorView)) & 0x7) == 5) {
        i = j + this.mAnchorView.getWidth();
      }
      if (localMenuPopupHelper.tryShow(i, k))
      {
        if (this.mPresenterCallback != null) {
          this.mPresenterCallback.onOpenSubMenu(paramSubMenuBuilder);
        }
        return true;
      }
    }
    return false;
  }
  
  public final void setAnchorView(View paramView)
  {
    this.mAnchorView = paramView;
  }
  
  public final void setCallback(MenuPresenter.Callback paramCallback)
  {
    this.mPresenterCallback = paramCallback;
  }
  
  public final void setForceShowIcon(boolean paramBoolean)
  {
    this.mAdapter.setForceShowIcon(paramBoolean);
  }
  
  public final void setGravity(int paramInt)
  {
    this.mDropDownGravity = paramInt;
  }
  
  public final void setHorizontalOffset(int paramInt)
  {
    this.mPopup.setHorizontalOffset(paramInt);
  }
  
  public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.mOnDismissListener = paramOnDismissListener;
  }
  
  public final void setShowTitle(boolean paramBoolean)
  {
    this.mShowTitle = paramBoolean;
  }
  
  public final void setVerticalOffset(int paramInt)
  {
    this.mPopup.setVerticalOffset(paramInt);
  }
  
  public final void show()
  {
    if (tryShow()) {
      return;
    }
    throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
  }
  
  public final void updateMenuView(boolean paramBoolean)
  {
    this.mHasContentWidth = false;
    if (this.mAdapter != null) {
      this.mAdapter.notifyDataSetChanged();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v7/view/menu/StandardMenuPopup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
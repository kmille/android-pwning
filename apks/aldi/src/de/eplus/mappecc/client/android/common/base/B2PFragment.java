package de.eplus.mappecc.client.android.common.base;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import c.a.a;
import dagger.android.support.DaggerFragment;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.B2PDialogBuilder;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.view.button.B2PDialogButtonCallback;
import de.eplus.mappecc.client.android.common.component.dialog.olddialog.OldDialogICON;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.moe.ViewSetter;
import de.eplus.mappecc.client.android.common.network.moe.ViewSetterFactory;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import javax.inject.Inject;

public abstract class B2PFragment<T extends IPresenter>
  extends DaggerFragment
  implements IB2pView, OnBackPressedListener, OnKeyboardListener
{
  @Inject
  protected Application application;
  public B2PActivity b2pActivity;
  @Inject
  protected MainThreadBus bus;
  protected Context context;
  private boolean isDestroyed = false;
  @Inject
  @NonNull
  protected Localizer localizer;
  public T presenter;
  private View view;
  @Inject
  @NonNull
  protected ViewSetterFactory viewSetterFactory;
  
  protected void addFragment(int paramInt, B2PFragment paramB2PFragment)
  {
    ((B2PActivity)this.context).addFragment(paramInt, paramB2PFragment);
  }
  
  public void doActionsForForbidden()
  {
    this.b2pActivity.doActionsForForbidden(this.presenter.isSecuredByHigherLogin());
  }
  
  public void doActionsForUnauthorized(@NonNull Box7Callback paramBox7Callback)
  {
    this.b2pActivity.doActionsForUnauthorized(paramBox7Callback);
  }
  
  public void doLogoutGotoLoginScreen(boolean paramBoolean)
  {
    this.b2pActivity.doLogoutGotoLoginScreen(paramBoolean);
  }
  
  public void finishPerformanceTracking(int paramInt)
  {
    this.b2pActivity.finishPerformanceTracking(paramInt);
  }
  
  @LayoutRes
  public abstract int getContentView();
  
  public Context getContext()
  {
    return this.context;
  }
  
  public abstract int getTitleResId();
  
  public boolean getToolbarBackbuttonActivated()
  {
    return false;
  }
  
  public void goBack()
  {
    this.b2pActivity.goBack();
  }
  
  public void goToHomeScreen()
  {
    this.b2pActivity.goToHomeScreen();
  }
  
  public void goToLogin()
  {
    this.b2pActivity.goToLogin();
  }
  
  public boolean hasTabbarVisible()
  {
    return false;
  }
  
  public void hideKeyboard()
  {
    this.b2pActivity.hideKeyboard();
  }
  
  public void hideProgressDialog()
  {
    this.b2pActivity.hideProgressDialog();
  }
  
  protected void initView(@NonNull View paramView) {}
  
  public boolean isDestroyed()
  {
    return this.isDestroyed;
  }
  
  public void onAttach(Context paramContext)
  {
    super.onAttach(paramContext);
    this.context = paramContext;
    this.b2pActivity = ((B2PActivity)getActivity());
  }
  
  public boolean onBackPressed()
  {
    a.b("entered...", new Object[0]);
    return false;
  }
  
  public void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new StringBuilder("entered... class: ");
    paramBundle.append(getClass().getSimpleName());
    a.b(paramBundle.toString(), new Object[0]);
    if (this.presenter != null) {
      this.presenter.onCreate();
    }
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.view = paramLayoutInflater.inflate(getContentView(), null);
    this.viewSetterFactory.create(this, this.view).update();
    ButterKnife.a(this, this.view);
    this.bus.register(this);
    initView(this.view);
    this.presenter.onCreateView();
    this.b2pActivity.trackOpenScreen(this.presenter.getTrackingScreen(), this.presenter.getTrackingData());
    return this.view;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    StringBuilder localStringBuilder = new StringBuilder("entered... class: ");
    localStringBuilder.append(getClass().getSimpleName());
    a.b(localStringBuilder.toString(), new Object[0]);
    this.bus.unregister(this);
    if (this.presenter != null) {
      this.presenter.onDestroy();
    }
    this.isDestroyed = true;
  }
  
  public void onKeyboardClosed()
  {
    a.b("keyboard for fragment closed...", new Object[0]);
  }
  
  public void onKeyboardOpened()
  {
    a.b("keyboard for fragment opened...", new Object[0]);
  }
  
  public void onPause()
  {
    super.onPause();
    StringBuilder localStringBuilder = new StringBuilder("entered... class: ");
    localStringBuilder.append(getClass().getSimpleName());
    a.b(localStringBuilder.toString(), new Object[0]);
    if (this.presenter != null) {
      this.presenter.onPause();
    }
  }
  
  public void onResume()
  {
    super.onResume();
    StringBuilder localStringBuilder = new StringBuilder("entered... class: ");
    localStringBuilder.append(getClass().getSimpleName());
    a.b(localStringBuilder.toString(), new Object[0]);
    if (this.presenter != null) {
      this.presenter.onResume();
    }
  }
  
  public void restartApp()
  {
    this.b2pActivity.restartApp();
  }
  
  @Inject
  public void setPresenter(T paramT)
  {
    this.presenter = paramT;
    this.presenter.setView(this);
  }
  
  public void showB2PDialog(@NonNull B2PDialogBuilder paramB2PDialogBuilder)
  {
    this.b2pActivity.showB2PDialog(paramB2PDialogBuilder);
  }
  
  public void showDialog(int paramInt1, int paramInt2, IB2pView.IDialogCallback paramIDialogCallback1, int paramInt3, IB2pView.IDialogCallback paramIDialogCallback2, int paramInt4, OldDialogICON paramOldDialogICON)
  {
    this.b2pActivity.showDialog(paramInt1, paramInt2, paramIDialogCallback1, paramInt3, paramIDialogCallback2, paramInt4, paramOldDialogICON);
  }
  
  public void showDialog(int paramInt1, int paramInt2, IB2pView.IDialogCallback paramIDialogCallback, int paramInt3, OldDialogICON paramOldDialogICON)
  {
    this.b2pActivity.showDialog(paramInt1, paramInt2, paramIDialogCallback, paramInt3, paramOldDialogICON);
  }
  
  public void showDialog(String paramString, Spannable paramSpannable, IB2pView.IDialogCallback paramIDialogCallback1, int paramInt1, IB2pView.IDialogCallback paramIDialogCallback2, int paramInt2, boolean paramBoolean, OldDialogICON paramOldDialogICON)
  {
    this.b2pActivity.showDialog(paramString, paramSpannable, paramIDialogCallback1, paramInt1, paramIDialogCallback2, paramInt2, paramBoolean, paramOldDialogICON);
  }
  
  public void showDialog(String paramString, Spannable paramSpannable, IB2pView.IDialogCallback paramIDialogCallback, int paramInt, OldDialogICON paramOldDialogICON)
  {
    this.b2pActivity.showDialog(paramString, paramSpannable, paramIDialogCallback, paramInt, paramOldDialogICON);
  }
  
  public void showDialog(String paramString, Spannable paramSpannable, IB2pView.IDialogCallback paramIDialogCallback, int paramInt, boolean paramBoolean, OldDialogICON paramOldDialogICON)
  {
    this.b2pActivity.showDialog(paramString, paramSpannable, paramIDialogCallback, paramInt, paramBoolean, paramOldDialogICON);
  }
  
  public void showDialog(String paramString1, String paramString2, IB2pView.IDialogCallback paramIDialogCallback1, int paramInt1, IB2pView.IDialogCallback paramIDialogCallback2, int paramInt2, OldDialogICON paramOldDialogICON)
  {
    this.b2pActivity.showDialog(paramString1, paramString2, paramIDialogCallback1, paramInt1, paramIDialogCallback2, paramInt2, paramOldDialogICON);
  }
  
  public void showGenericError(@Nullable B2PDialogButtonCallback paramB2PDialogButtonCallback)
  {
    this.b2pActivity.showGenericError(paramB2PDialogButtonCallback);
  }
  
  public void showMaintenance()
  {
    this.b2pActivity.showMaintenance();
  }
  
  public void showProgressDialog()
  {
    this.b2pActivity.showProgressDialog();
  }
  
  public void showProgressDialog(int paramInt)
  {
    this.b2pActivity.showProgressDialog(paramInt);
  }
  
  public void showReauth(boolean paramBoolean) {}
  
  public void showSimSwap(IB2pView.IDialogCallback paramIDialogCallback)
  {
    this.b2pActivity.showSimSwap(paramIDialogCallback);
  }
  
  public void startChooserActivity(@NonNull Uri paramUri)
  {
    this.b2pActivity.startChooserActivity(paramUri);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/base/B2PFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
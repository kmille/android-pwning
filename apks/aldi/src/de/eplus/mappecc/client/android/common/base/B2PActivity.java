package de.eplus.mappecc.client.android.common.base;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.MenuRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.BackStackEntry;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.LayoutParams;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.a.a;
import de.eplus.mappecc.client.android.common.component.tabbar.TabBarView;
import de.eplus.mappecc.client.android.common.eventbus.BusEvent;
import de.eplus.mappecc.client.android.common.eventbus.BusEventReceiver;
import de.eplus.mappecc.client.android.common.eventbus.BusEventReceiver.BusEventListener;
import de.eplus.mappecc.client.android.common.eventbus.KillActivityEvent;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import de.eplus.mappecc.client.android.common.eventbus.TimeoutEvent;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.network.moe.ViewSetter;
import de.eplus.mappecc.client.android.common.network.moe.ViewSetterFactory;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.network.piranha.LoginManager;
import de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin.IHigherLoginManager;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.tracking.TrackingScreen;
import de.eplus.mappecc.client.android.common.utils.SimUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.UserPreferences;
import java.util.Map;
import javax.inject.Inject;
import org.apache.a.c.h;

public abstract class B2PActivity<T extends IPresenter>
  extends B2PDialogActivity
  implements BusEventReceiver.BusEventListener
{
  private static String activityOnTop;
  @Inject
  protected Application application;
  @Inject
  Box7Cache box7Cache;
  @Inject
  protected MainThreadBus bus;
  @Inject
  protected BusEventReceiver busEventReceiver;
  private int keyboardClosedHeight = Integer.MAX_VALUE;
  @Inject
  protected LocalizationManagerFactory localizationManagerFactory;
  @Inject
  protected LoginManager loginManager;
  protected Menu menu;
  protected OnBackPressedListener onBackPressedListener;
  protected OnKeyboardListener onKeyboardListener;
  public T presenter;
  @Inject
  SimUtils simUtils;
  @Nullable
  @BindView
  protected TabBarView tabBarView;
  @Nullable
  @BindView
  LinearLayout tabbarLayout;
  @Nullable
  @BindView
  TextView titleTextView;
  @Nullable
  @BindView
  protected Toolbar toolbar;
  @Inject
  protected UserPreferences userPreferences;
  @Inject
  protected ViewSetterFactory viewSetterFactory;
  
  private void handleTabBarVisibility(boolean paramBoolean)
  {
    if ((getTopFragment() != null) && (!getTopFragment().hasTabbarVisible())) {
      return;
    }
    setTabbarVisibility(paramBoolean);
  }
  
  private void initKeyboardListener()
  {
    if (this.tabBarView == null) {
      return;
    }
    View localView = findViewById(16908290);
    Object localObject = localView;
    if (localView == null) {
      localObject = getWindow().getDecorView().findViewById(16908290);
    }
    if (localObject != null)
    {
      localObject = (ViewGroup)((ViewGroup)findViewById(16908290)).getChildAt(0);
      if (localObject == null) {
        return;
      }
      ((ViewGroup)localObject).getViewTreeObserver().addOnGlobalLayoutListener(new -..Lambda.B2PActivity.47cpoIBPklsjXtKALr8MfsPdUCw(this, (ViewGroup)localObject));
    }
  }
  
  private void onKeyBoardClosed()
  {
    a.b("keyboard closed...", new Object[0]);
    handleTabBarVisibility(true);
    if (this.onKeyboardListener != null) {
      this.onKeyboardListener.onKeyboardClosed();
    }
  }
  
  private void onKeyBoardOpened()
  {
    a.b("keyboard opened...", new Object[0]);
    handleTabBarVisibility(false);
    if (this.onKeyboardListener != null) {
      this.onKeyboardListener.onKeyboardOpened();
    }
  }
  
  private void setFragmentBackpressedAndKeyBoardListener()
  {
    getSupportFragmentManager().addOnBackStackChangedListener(new -..Lambda.B2PActivity.hCqE8LecfjDnF3rn26g7l-_PEeI(this));
  }
  
  private void setTabbarVisibility(boolean paramBoolean)
  {
    if (this.tabbarLayout != null)
    {
      LinearLayout localLinearLayout = this.tabbarLayout;
      int i;
      if (paramBoolean) {
        i = 0;
      } else {
        i = 8;
      }
      localLinearLayout.setVisibility(i);
    }
  }
  
  private void setToolbarBackbutton(boolean paramBoolean)
  {
    if (this.titleTextView != null)
    {
      Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)this.titleTextView.getLayoutParams();
      if (paramBoolean) {}
      for (int i = 3;; i = 17)
      {
        localLayoutParams.gravity = i;
        break;
      }
      this.titleTextView.setLayoutParams(localLayoutParams);
    }
    getSupportActionBar().setDisplayHomeAsUpEnabled(paramBoolean);
    getSupportActionBar().setDisplayShowHomeEnabled(paramBoolean);
  }
  
  private void setUpActionBar()
  {
    if (this.toolbar != null)
    {
      setSupportActionBar(this.toolbar);
      getSupportActionBar().setDisplayShowTitleEnabled(false);
      getSupportActionBar().setHomeAsUpIndicator(2131165403);
      setToolbarTitleText(getTitleResId());
      setToolbarBackbutton(getToolbarBackButtonActivated());
    }
  }
  
  public void addFragment(int paramInt, B2PFragment paramB2PFragment)
  {
    FragmentTransaction localFragmentTransaction = getSupportFragmentManager().beginTransaction();
    localFragmentTransaction.add(paramInt, paramB2PFragment, paramB2PFragment.getClass().getSimpleName());
    localFragmentTransaction.addToBackStack(paramB2PFragment.getClass().getSimpleName());
    localFragmentTransaction.commit();
  }
  
  @LayoutRes
  public abstract int getContentView();
  
  public int getFragmentStackSize()
  {
    return getSupportFragmentManager().getBackStackEntryCount();
  }
  
  @MenuRes
  public int getMenuResourceId()
  {
    return 2131492864;
  }
  
  public abstract int getTitleResId();
  
  public boolean getToolbarBackButtonActivated()
  {
    return false;
  }
  
  public B2PFragment getTopFragment()
  {
    String str = getTopFragmentTag();
    return (B2PFragment)getSupportFragmentManager().findFragmentByTag(str);
  }
  
  public String getTopFragmentTag()
  {
    int i = getSupportFragmentManager().getBackStackEntryCount() - 1;
    if (i < 0) {
      return null;
    }
    return getSupportFragmentManager().getBackStackEntryAt(i).getName();
  }
  
  public abstract void initViews();
  
  protected final boolean isSecuredByHigherLogin()
  {
    if (this.presenter != null) {
      return this.presenter.isSecuredByHigherLogin();
    }
    return false;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    paramIntent = new StringBuilder("onActivityResult() entered... class: ");
    paramIntent.append(getClass().getSimpleName());
    paramIntent.append(" requestCode: ");
    paramIntent.append(paramInt1);
    paramIntent.append(" resultCode: ");
    paramIntent.append(paramInt2);
    a.b(paramIntent.toString(), new Object[0]);
  }
  
  public final void onBackPressed()
  {
    Object localObject = getSupportFragmentManager();
    StringBuilder localStringBuilder = new StringBuilder("onBackPressed() entered... onBackPressedListener:   fragment stack size: ");
    localStringBuilder.append(((FragmentManager)localObject).getBackStackEntryCount());
    a.b(localStringBuilder.toString(), new Object[0]);
    if ((this.onBackPressedListener != null) && (this.onBackPressedListener.onBackPressed()))
    {
      localObject = new StringBuilder("onBackPressed(): Doing fragment back navigation on ");
      ((StringBuilder)localObject).append(this.onBackPressedListener.getClass().getSimpleName());
      a.b(((StringBuilder)localObject).toString(), new Object[0]);
      return;
    }
    if (((FragmentManager)localObject).getBackStackEntryCount() <= 1)
    {
      localObject = new StringBuilder("onBackPressed(): No more fragments left - finishing ");
      ((StringBuilder)localObject).append(getClass().getSimpleName());
      ((StringBuilder)localObject).append(".");
      a.b(((StringBuilder)localObject).toString(), new Object[0]);
      finish();
      return;
    }
    a.b("onBackPressed(): finishing...", new Object[0]);
    super.onBackPressed();
  }
  
  public void onBusEventReceived(BusEvent paramBusEvent)
  {
    String str = getClass().getSimpleName();
    if (paramBusEvent.event != 12) {
      return;
    }
    if ((activityOnTop.equals(str)) && (!isFinishing()) && (this.simUtils.hasSimCardChange(this.userPreferences.getSimIccid1(), this.userPreferences.getSimIccid2()))) {
      showSimSwap(new -..Lambda.B2PActivity.YNpBPbmdtmAkSTc_yaLwxmx8qc4(this));
    }
    this.trackingHelper.sendOpenScreen(TrackingScreen.SIM_CARD_CHANGE);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new StringBuilder("onCreate() entered... class: ");
    paramBundle.append(getClass().getSimpleName());
    a.b(paramBundle.toString(), new Object[0]);
    overridePendingTransition(0, 0);
    this.bus.register(this);
    this.busEventReceiver.addBusEventListener(this);
    setContentView(getContentView());
    ButterKnife.a(this);
    this.localizationManagerFactory.ensureLocalizationsExist();
    this.viewSetterFactory.create(this).update();
    initViews();
    if (this.presenter != null)
    {
      this.presenter.onCreate();
      trackOpenScreen(this.presenter.getTrackingScreen(), this.presenter.getTrackingData());
    }
    setUpActionBar();
    setFragmentBackpressedAndKeyBoardListener();
    initKeyboardListener();
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    StringBuilder localStringBuilder = new StringBuilder("onCreateOptionsMenu() entered... class: ");
    localStringBuilder.append(getClass().getSimpleName());
    a.b(localStringBuilder.toString(), new Object[0]);
    getMenuInflater().inflate(getMenuResourceId(), paramMenu);
    this.menu = paramMenu;
    if (paramMenu.hasVisibleItems())
    {
      paramMenu.findItem(2131231098).setTitle(this.localizer.getString(2131690146));
      paramMenu.findItem(2131230943).setTitle(this.localizer.getString(2131690143));
      paramMenu.findItem(2131231099).setTitle(this.localizer.getString(2131690144));
      paramMenu.findItem(2131231100).setTitle(this.localizer.getString(2131690145));
    }
    return true;
  }
  
  public void onDestroy()
  {
    StringBuilder localStringBuilder = new StringBuilder("onDestroy() entered... class: ");
    localStringBuilder.append(getClass().getSimpleName());
    a.b(localStringBuilder.toString(), new Object[0]);
    this.bus.unregister(this);
    this.busEventReceiver.removeBusEventListener(this);
    if (this.presenter != null) {
      this.presenter.onDestroy();
    }
    super.onDestroy();
  }
  
  public void onKillActivity(@NonNull KillActivityEvent paramKillActivityEvent)
  {
    if (h.a(paramKillActivityEvent.getWhitelist(), getClass().getSimpleName())) {
      return;
    }
    finishAffinity();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    StringBuilder localStringBuilder = new StringBuilder("onOptionsItemSelected() entered... id: ");
    localStringBuilder.append(paramMenuItem.getItemId());
    localStringBuilder.append(" class: ");
    localStringBuilder.append(getClass().getSimpleName());
    a.b(localStringBuilder.toString(), new Object[0]);
    int i = paramMenuItem.getItemId();
    if (i != 2131230943) {
      switch (i)
      {
      default: 
        break;
      case 2131231100: 
        showLicense();
        break;
      case 2131231099: 
        showImprint();
        break;
      case 2131231098: 
        showTerms(TrackingScreen.TERMS_OF_USE, new -..Lambda.B2PActivity.6ln-ghDqpaEmCzjzUUmtJ6-u-mc(this), null, false);
        break;
      }
    } else {
      showDataProtection();
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  public void onPause()
  {
    super.onPause();
    StringBuilder localStringBuilder = new StringBuilder("onPause() entered... class: ");
    localStringBuilder.append(getClass().getSimpleName());
    a.b(localStringBuilder.toString(), new Object[0]);
    if (this.presenter != null) {
      this.presenter.onPause();
    }
  }
  
  public void onResume()
  {
    super.onResume();
    a.b("entered...", new Object[0]);
    activityOnTop = getClass().getSimpleName();
    B2PApplication.activity = this;
    if (this.presenter != null) {
      this.presenter.onResume();
    }
  }
  
  public boolean onSupportNavigateUp()
  {
    onBackPressed();
    return true;
  }
  
  public void onTimeoutReceived(@NonNull TimeoutEvent paramTimeoutEvent)
  {
    a.b("entered...", new Object[0]);
    if (paramTimeoutEvent.getTimeoutId() != 3) {
      return;
    }
    a.b("onTimeoutReceived() REQUEST_HIGHER_LOGIN_TIMER entered...", new Object[0]);
    this.higherLoginManager.resetHigherLoginState();
    if (isSecuredByHigherLogin()) {
      goToHomeScreen();
    }
  }
  
  public void restart()
  {
    finish();
    Intent localIntent = new Intent(this, getClass());
    if ((getIntent() != null) && (getIntent().getExtras() != null)) {
      localIntent.putExtras(getIntent().getExtras());
    }
    startActivity(localIntent);
  }
  
  public void setOnBackPressedListener(OnBackPressedListener paramOnBackPressedListener)
  {
    this.onBackPressedListener = paramOnBackPressedListener;
  }
  
  public void setOnKeyboardListener(OnKeyboardListener paramOnKeyboardListener)
  {
    this.onKeyboardListener = paramOnKeyboardListener;
  }
  
  public void setPresenter(T paramT)
  {
    this.presenter = paramT;
  }
  
  public void setToolbarTitleText(int paramInt)
  {
    if (this.titleTextView != null)
    {
      String str;
      if (paramInt != 0) {
        str = this.localizer.getNonHtmlString(paramInt);
      } else {
        str = "";
      }
      if (h.b(str))
      {
        this.titleTextView.setText(str);
        this.titleTextView.setVisibility(0);
        return;
      }
      this.titleTextView.setVisibility(8);
    }
  }
  
  public void setToolbarTitleText(@NonNull String paramString)
  {
    if (this.titleTextView == null) {
      return;
    }
    this.titleTextView.setText(paramString);
  }
  
  public void startActivity(Intent paramIntent)
  {
    overridePendingTransition(0, 0);
    super.startActivity(paramIntent);
  }
  
  public void trackOpenScreen(@NonNull TrackingScreen paramTrackingScreen, @NonNull Map<String, Object> paramMap)
  {
    this.trackingHelper.sendOpenScreen(paramTrackingScreen, paramMap);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/base/B2PActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
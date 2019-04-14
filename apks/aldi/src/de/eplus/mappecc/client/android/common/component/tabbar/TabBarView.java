package de.eplus.mappecc.client.android.common.component.tabbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.a.a;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.component.button.OnSingleClickListener;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.customer.AccountOverviewActivity;
import de.eplus.mappecc.client.android.feature.help.HelpActivity;
import de.eplus.mappecc.client.android.feature.homescreen.HomeScreenActivity;
import de.eplus.mappecc.client.android.feature.pack.PackActivity;
import de.eplus.mappecc.client.android.feature.topup.TopUpActivity;
import javax.inject.Inject;

public class TabBarView
  extends LinearLayout
  implements ITabBarView
{
  @BindView
  ImageView accountsButton;
  @BindView
  LinearLayout accountsLinearLayout;
  @BindView
  TextView accountsTextView;
  private Unbinder binder;
  @BindView
  ImageView chargingButton;
  @BindView
  LinearLayout chargingLinearLayout;
  @BindView
  TextView chargingTextView;
  @BindView
  ImageView helpButton;
  @BindView
  LinearLayout helpLinearLayout;
  @BindView
  TextView helpTextView;
  @Inject
  Localizer localizer;
  @BindView
  ImageView optionsButton;
  @BindView
  LinearLayout optionsLinearLayout;
  @BindView
  TextView optionsTextView;
  @BindView
  ImageView overViewButton;
  @BindView
  LinearLayout overViewLinearLayout;
  @BindView
  TextView overViewTextView;
  @Inject
  IPerformanceTimingManager performanceTimingManager;
  private TabBarPresenter tabBarPresenter;
  
  public TabBarView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public TabBarView(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public TabBarView(Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  @RequiresApi(api=21)
  public TabBarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init();
  }
  
  private void init()
  {
    inflate(getContext(), 2131427442, this);
    B2PApplication.component.inject(this);
    findViewById(2131231029).setOnClickListener(new OnSingleClickListener()
    {
      public void onSingleClick(View paramAnonymousView)
      {
        TabBarView.this.tabBarPresenter.onClickOverview();
      }
    });
    findViewById(2131231028).setOnClickListener(new OnSingleClickListener()
    {
      public void onSingleClick(View paramAnonymousView)
      {
        TabBarView.this.tabBarPresenter.onClickOptions();
      }
    });
    findViewById(2131231026).setOnClickListener(new OnSingleClickListener()
    {
      public void onSingleClick(View paramAnonymousView)
      {
        TabBarView.this.tabBarPresenter.onClickCharging();
      }
    });
    findViewById(2131231024).setOnClickListener(new OnSingleClickListener()
    {
      public void onSingleClick(View paramAnonymousView)
      {
        TabBarView.this.tabBarPresenter.onClickAccounts();
      }
    });
    findViewById(2131231027).setOnClickListener(new OnSingleClickListener()
    {
      public void onSingleClick(View paramAnonymousView)
      {
        TabBarView.this.tabBarPresenter.onClickHelp();
      }
    });
  }
  
  public void addTabBarViewListener(@NonNull TabBarPresenter.TabBarViewListener paramTabBarViewListener)
  {
    this.tabBarPresenter.addTabBarViewListener(paramTabBarViewListener);
  }
  
  public void apply(TabBarPresenter.TabSelection paramTabSelection)
  {
    this.binder = ButterKnife.a(this);
    this.tabBarPresenter = new TabBarPresenter(this, this.localizer, this.performanceTimingManager);
    this.tabBarPresenter.setTabSelection(paramTabSelection);
    this.tabBarPresenter.apply();
  }
  
  public void changePressedState(TabBarPresenter.TabSelection paramTabSelection)
  {
    int i = ContextCompat.getColor(getContext(), 2131034286);
    int j = ContextCompat.getColor(getContext(), 2131034289);
    Object localObject = this.overViewTextView;
    int k;
    if (paramTabSelection == TabBarPresenter.TabSelection.OVERVIEW) {
      k = i;
    } else {
      k = j;
    }
    ((TextView)localObject).setTextColor(k);
    localObject = this.optionsTextView;
    if (paramTabSelection == TabBarPresenter.TabSelection.OPTIONS) {
      k = i;
    } else {
      k = j;
    }
    ((TextView)localObject).setTextColor(k);
    localObject = this.chargingTextView;
    if (paramTabSelection == TabBarPresenter.TabSelection.CHARGING) {
      k = i;
    } else {
      k = j;
    }
    ((TextView)localObject).setTextColor(k);
    localObject = this.accountsTextView;
    if (paramTabSelection == TabBarPresenter.TabSelection.ACCOUNTS) {
      k = i;
    } else {
      k = j;
    }
    ((TextView)localObject).setTextColor(k);
    localObject = this.helpTextView;
    if (paramTabSelection != TabBarPresenter.TabSelection.HELP) {
      i = j;
    }
    ((TextView)localObject).setTextColor(i);
    localObject = this.overViewButton;
    if (paramTabSelection == TabBarPresenter.TabSelection.OVERVIEW) {
      i = 2131165420;
    } else {
      i = 2131165421;
    }
    ((ImageView)localObject).setImageResource(i);
    localObject = this.optionsButton;
    if (paramTabSelection == TabBarPresenter.TabSelection.OPTIONS) {
      i = 2131165418;
    } else {
      i = 2131165419;
    }
    ((ImageView)localObject).setImageResource(i);
    localObject = this.chargingButton;
    if (paramTabSelection == TabBarPresenter.TabSelection.CHARGING) {
      i = 2131165414;
    } else {
      i = 2131165415;
    }
    ((ImageView)localObject).setImageResource(i);
    localObject = this.accountsButton;
    if (paramTabSelection == TabBarPresenter.TabSelection.ACCOUNTS) {
      i = 2131165412;
    } else {
      i = 2131165413;
    }
    ((ImageView)localObject).setImageResource(i);
    localObject = this.helpButton;
    if (paramTabSelection == TabBarPresenter.TabSelection.HELP) {
      i = 2131165416;
    } else {
      i = 2131165417;
    }
    ((ImageView)localObject).setImageResource(i);
  }
  
  public void launchAccounts()
  {
    getContext().startActivity(new Intent(getContext(), AccountOverviewActivity.class));
  }
  
  public void launchCharging()
  {
    getContext().startActivity(new Intent(getContext(), TopUpActivity.class));
  }
  
  public void launchHelp()
  {
    Intent localIntent = new Intent(getContext(), HelpActivity.class);
    localIntent.putExtra("bundle_help_overview", true);
    getContext().startActivity(localIntent);
  }
  
  public void launchOptions()
  {
    Intent localIntent = new Intent(getContext(), PackActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("bundle_pack_overview", true);
    localIntent.putExtras(localBundle);
    getContext().startActivity(localIntent);
  }
  
  public void launchOverview()
  {
    a.b("entered...", new Object[0]);
    Intent localIntent = new Intent(getContext(), HomeScreenActivity.class);
    getContext().startActivity(localIntent);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.binder != null) {
      this.binder.unbind();
    }
  }
  
  public void removeTabBarViewListener(@NonNull TabBarPresenter.TabBarViewListener paramTabBarViewListener)
  {
    this.tabBarPresenter.removeTabBarViewListener(paramTabBarViewListener);
  }
  
  public void setTextForLinks(TabBarPresenter.TabSelection paramTabSelection, String paramString)
  {
    switch (paramTabSelection)
    {
    default: 
      return;
    case ???: 
      this.helpTextView.setText(paramString);
      return;
    case ???: 
      paramTabSelection = this.accountsTextView;
    }
    for (;;)
    {
      paramTabSelection.setText(paramString);
      return;
      paramTabSelection = this.chargingTextView;
      continue;
      paramTabSelection = this.optionsTextView;
      continue;
      paramTabSelection = this.overViewTextView;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/tabbar/TabBarView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
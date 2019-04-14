package de.eplus.mappecc.client.android.common.component.tabbar;

public abstract interface ITabBarView
{
  public abstract void changePressedState(TabBarPresenter.TabSelection paramTabSelection);
  
  public abstract void launchAccounts();
  
  public abstract void launchCharging();
  
  public abstract void launchHelp();
  
  public abstract void launchOptions();
  
  public abstract void launchOverview();
  
  public abstract void setTextForLinks(TabBarPresenter.TabSelection paramTabSelection, String paramString);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/tabbar/ITabBarView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
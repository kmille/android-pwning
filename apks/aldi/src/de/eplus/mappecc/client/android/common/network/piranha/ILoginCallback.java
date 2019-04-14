package de.eplus.mappecc.client.android.common.network.piranha;

import de.eplus.mappecc.client.android.common.network.piranha.smslogin.ISmsLoginCallback;
import de.eplus.mappecc.client.android.feature.rating.rule.implementation.AutomatedLoginRatingShowingRule;

public abstract class ILoginCallback
  implements IAutomaticLoginCallback, ISmsLoginCallback
{
  public void callAutomatedLoginRatingShowingRuleFailed()
  {
    new AutomatedLoginRatingShowingRule().onAutomatedLoginFailed();
  }
  
  protected void callAutomatedLoginRatingShowingRuleSuccess()
  {
    new AutomatedLoginRatingShowingRule().onAutomatedLoginSuccessful();
  }
  
  public void onAutomaticLoginFailure(int paramInt)
  {
    callAutomatedLoginRatingShowingRuleFailed();
    onLoginFailure(paramInt);
  }
  
  public void onAutomaticLoginMaintenanceMode()
  {
    callAutomatedLoginRatingShowingRuleFailed();
    onMaintenanceMode();
  }
  
  public void onAutomaticLoginNotPossible() {}
  
  public void onAutomaticLoginSuccess()
  {
    callAutomatedLoginRatingShowingRuleSuccess();
    onLoginSuccess();
  }
  
  public void onIccidConversionSuccess() {}
  
  public abstract void onLoginFailure(int paramInt);
  
  public abstract void onLoginSuccess();
  
  public abstract void onMaintenanceMode();
  
  public void onSmsLoginFailed(int paramInt)
  {
    callAutomatedLoginRatingShowingRuleFailed();
  }
  
  public void onSmsLoginStartFailure()
  {
    callAutomatedLoginRatingShowingRuleFailed();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/ILoginCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
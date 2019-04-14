package de.eplus.mappecc.client.android.common.base;

import android.support.annotation.NonNull;
import c.a.a;
import de.eplus.mappecc.client.android.common.component.dialog.olddialog.OldDialogICON;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.piranha.ILoginCallback;
import de.eplus.mappecc.client.android.common.network.piranha.LoginManager;
import de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin.IHigherLoginManager;
import javax.inject.Inject;

public class ReloginPresenter
{
  private final IB2pView b2pView;
  private final IHigherLoginManager higherLoginManager;
  private final LoginManager loginManager;
  
  @Inject
  public ReloginPresenter(IB2pView paramIB2pView, LoginManager paramLoginManager, IHigherLoginManager paramIHigherLoginManager)
  {
    this.b2pView = paramIB2pView;
    this.loginManager = paramLoginManager;
    this.higherLoginManager = paramIHigherLoginManager;
  }
  
  private void doForbiddenActions(boolean paramBoolean)
  {
    a.b("entered...", new Object[0]);
    if (paramBoolean)
    {
      a.b("Was inside higher login area, going to homescreen", new Object[0]);
      this.b2pView.goToHomeScreen();
    }
    this.higherLoginManager.resetHigherLoginState();
    if (this.b2pView != null) {
      this.b2pView.hideProgressDialog();
    }
  }
  
  private void onReLoginFailed()
  {
    a.b("entered...", new Object[0]);
    this.loginManager.deleteCredentialsCacheAndCookie();
    IB2pView localIB2pView1 = this.b2pView;
    IB2pView localIB2pView2 = this.b2pView;
    localIB2pView2.getClass();
    localIB2pView1.showDialog(0, 2131690226, new -..Lambda.AXErgaj69quzkkF9jRO0cK6FzPY(localIB2pView2), 0, OldDialogICON.FAILURE);
  }
  
  private void onReLoginSuccess(Box7Callback paramBox7Callback)
  {
    a.b("entered...", new Object[0]);
    if (paramBox7Callback != null) {
      paramBox7Callback.restartRequest();
    }
  }
  
  public void doRelogin(Box7Callback paramBox7Callback)
  {
    a.b("entered...", new Object[0]);
    this.b2pView.showProgressDialog();
    this.loginManager.doAutomaticLogin(getLoginCallback(paramBox7Callback));
  }
  
  @NonNull
  protected ReloginLoginCallback getLoginCallback(Box7Callback paramBox7Callback)
  {
    return new ReloginLoginCallback(paramBox7Callback);
  }
  
  public void onForbidden(boolean paramBoolean)
  {
    a.b("entered...", new Object[0]);
    doForbiddenActions(paramBoolean);
  }
  
  public void onUnauthorized(@NonNull Box7Callback paramBox7Callback)
  {
    a.b("entered...", new Object[0]);
    doRelogin(paramBox7Callback);
  }
  
  class ReloginLoginCallback
    extends ILoginCallback
  {
    private final Box7Callback box7Callback;
    
    public ReloginLoginCallback(Box7Callback paramBox7Callback)
    {
      this.box7Callback = paramBox7Callback;
    }
    
    public void onAutomaticLoginNotPossible()
    {
      ReloginPresenter.this.onReLoginFailed();
    }
    
    public void onIccidConversionSuccess()
    {
      ReloginPresenter.this.b2pView.hideProgressDialog();
      ReloginPresenter.this.b2pView.showProgressDialog(2131689757);
    }
    
    public void onLoginFailure(int paramInt)
    {
      ReloginPresenter.this.onReLoginFailed();
    }
    
    public void onLoginSuccess()
    {
      ReloginPresenter.this.onReLoginSuccess(this.box7Callback);
    }
    
    public void onMaintenanceMode()
    {
      ReloginPresenter.this.b2pView.hideProgressDialog();
      ReloginPresenter.this.b2pView.showMaintenance();
    }
    
    public void onSmsLoginFailed(int paramInt)
    {
      super.onSmsLoginFailed(paramInt);
      ReloginPresenter.this.onReLoginFailed();
    }
    
    public void onSmsLoginStartFailure()
    {
      super.onSmsLoginStartFailure();
      ReloginPresenter.this.onReLoginFailed();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/base/ReloginPresenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package de.eplus.mappecc.client.android.feature.resetpassword.password;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.common.collect.m;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.base.IPresenter;
import de.eplus.mappecc.client.android.common.component.dialog.olddialog.OldDialogICON;
import de.eplus.mappecc.client.android.common.network.box7.loginaccount.Box7LoginAccountManager;
import de.eplus.mappecc.client.android.common.network.piranha.ILoginManager;
import de.eplus.mappecc.client.android.common.restclient.model.LoginAccountModel;
import de.eplus.mappecc.client.android.common.restclient.model.LoginAccountModel.UseCaseEnum;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.tracking.TrackingScreen;
import de.eplus.mappecc.client.android.common.utils.StringHelper;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import java.util.Map;
import javax.annotation.Nonnull;
import org.apache.a.c.h;

public class ResetPasswordFragmentPresenter
  implements IPresenter<IResetPasswordView>
{
  private final IB2pView b2pView;
  private final Box7LoginAccountManager box7LoginAccountManager;
  private boolean isFromHigherLogin;
  private final ILoginManager loginManager;
  private String loginName;
  private final LoginPreferences loginPreferences;
  private IResetPasswordView resetPasswordView;
  private final TimeoutPreferences timeoutPreferences;
  private final TrackingHelper trackingHelper;
  
  public ResetPasswordFragmentPresenter(@NonNull IB2pView paramIB2pView, @NonNull Box7LoginAccountManager paramBox7LoginAccountManager, @NonNull ILoginManager paramILoginManager, @NonNull LoginPreferences paramLoginPreferences, @NonNull TimeoutPreferences paramTimeoutPreferences, @NonNull TrackingHelper paramTrackingHelper)
  {
    this.b2pView = paramIB2pView;
    this.box7LoginAccountManager = paramBox7LoginAccountManager;
    this.loginManager = paramILoginManager;
    this.loginPreferences = paramLoginPreferences;
    this.timeoutPreferences = paramTimeoutPreferences;
    this.trackingHelper = paramTrackingHelper;
  }
  
  private void changePasswordRequest(@NonNull String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4)
  {
    LoginAccountModel localLoginAccountModel = new LoginAccountModel();
    localLoginAccountModel.setActivationCode(paramString2);
    localLoginAccountModel.setPassword(paramString3);
    localLoginAccountModel.setPasswordConfirmation(paramString4);
    localLoginAccountModel.setLoginName(paramString1);
    localLoginAccountModel.setUseCase(LoginAccountModel.UseCaseEnum.PASSWORD_FORGOTTEN);
    this.b2pView.showProgressDialog();
    this.box7LoginAccountManager.updateAccount(paramString1, localLoginAccountModel, new ResetPasswordFragmentPresenter.2(this, this.b2pView, paramString1, paramString3, paramString2, paramString4));
  }
  
  private void onUpdateError(@NonNull String paramString)
  {
    if (paramString.contains("activationCode:invalid"))
    {
      this.b2pView.showDialog(0, 2131690217, null, 0, OldDialogICON.FAILURE);
      return;
    }
    this.b2pView.showDialog(0, 2131690218, null, 0, OldDialogICON.FAILURE);
  }
  
  private void onUpdateSuccess(@NonNull String paramString1, @Nonnull String paramString2)
  {
    this.b2pView.showDialog(0, 2131690276, new -..Lambda.ResetPasswordFragmentPresenter.vCn5xIth5bm4J4ARny2mXqvgeFY(this, paramString1, paramString2), 0, OldDialogICON.SUCCESS);
  }
  
  protected boolean arePasswordNotEqual(@Nullable String paramString1, @Nullable String paramString2)
  {
    return h.a(paramString1, paramString2) != 0;
  }
  
  @NonNull
  public Map<String, Object> getTrackingData()
  {
    String str;
    if (this.isFromHigherLogin) {
      str = "higherLogin";
    } else {
      str = "login";
    }
    return m.a("source", str);
  }
  
  @NonNull
  public TrackingScreen getTrackingScreen()
  {
    return TrackingScreen.FORGOT_PASSWORD;
  }
  
  protected void handleButtonState(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3)
  {
    if ((StringHelper.hasStringMinLength(paramString1, 1)) && (StringHelper.hasStringMinLength(paramString2, 8)) && (StringHelper.hasStringMinLength(paramString3, 8)))
    {
      this.resetPasswordView.enableSaveButton();
      return;
    }
    this.resetPasswordView.disableSaveButton();
  }
  
  public void onButtonChangeClicked(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3)
  {
    if (arePasswordNotEqual(paramString2, paramString3))
    {
      this.b2pView.showDialog(-1, 2131690216, null, 0, OldDialogICON.FAILURE);
      return;
    }
    changePasswordRequest(this.loginName, paramString1, paramString2, paramString3);
  }
  
  public void onCreateView()
  {
    this.resetPasswordView.disableSaveButton();
  }
  
  public void onInputTextChanged(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3)
  {
    handleButtonState(paramString1, paramString2, paramString3);
  }
  
  protected void onSuccessChangedPasswordDialogClicked(@NonNull String paramString1, @Nonnull String paramString2)
  {
    this.b2pView.showProgressDialog();
    this.loginManager.doLogin(paramString1, paramString2, false, new ResetPasswordFragmentPresenter.1(this));
  }
  
  protected void resetCredentialsIfNecessary()
  {
    if (!this.resetPasswordView.isAutoLoginChecked())
    {
      this.loginPreferences.saveUsername("");
      this.loginPreferences.savePassword("");
      this.timeoutPreferences.setAutoLogin(false);
    }
  }
  
  public void setFromHigherLogin(boolean paramBoolean)
  {
    this.isFromHigherLogin = paramBoolean;
  }
  
  public void setLoginName(String paramString)
  {
    this.loginName = paramString;
  }
  
  public void setView(IResetPasswordView paramIResetPasswordView)
  {
    this.resetPasswordView = paramIResetPasswordView;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/feature/resetpassword/password/ResetPasswordFragmentPresenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
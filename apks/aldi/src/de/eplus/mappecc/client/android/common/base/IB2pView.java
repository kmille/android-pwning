package de.eplus.mappecc.client.android.common.base;

import android.net.Uri;
import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.IB2PDialog;
import de.eplus.mappecc.client.android.common.component.dialog.olddialog.IOldDialogView;
import de.eplus.mappecc.client.android.common.component.dialog.progressdialog.IProgressDialog;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingMangerView;

public abstract interface IB2pView
  extends IKeyboardView, ReloginActions, IB2PDialog, IOldDialogView, IProgressDialog, IPerformanceTimingMangerView
{
  public abstract void doLogoutGotoLoginScreen(boolean paramBoolean);
  
  public abstract void goBack();
  
  public abstract void goToHomeScreen();
  
  public abstract void goToLogin();
  
  public abstract void restartApp();
  
  public abstract void showSimSwap(IDialogCallback paramIDialogCallback);
  
  public abstract void startChooserActivity(@NonNull Uri paramUri);
  
  public static abstract interface IDialogCallback
  {
    public abstract void onConfirm();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/base/IB2pView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
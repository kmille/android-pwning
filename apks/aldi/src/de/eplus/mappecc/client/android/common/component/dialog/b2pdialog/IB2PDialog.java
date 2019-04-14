package de.eplus.mappecc.client.android.common.component.dialog.b2pdialog;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.view.button.B2PDialogButtonCallback;

public abstract interface IB2PDialog
{
  public abstract void showB2PDialog(@NonNull B2PDialogBuilder paramB2PDialogBuilder);
  
  public abstract void showGenericError(@Nullable B2PDialogButtonCallback paramB2PDialogButtonCallback);
  
  public abstract void showMaintenance();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/dialog/b2pdialog/IB2PDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package de.eplus.mappecc.client.android.common.component.dialog.olddialog;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.Spannable;
import de.eplus.mappecc.client.android.common.base.IB2pView.IDialogCallback;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.B2PDialogBuilder;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.model.B2PDialogIconType;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import org.apache.a.c.h;

public class DialogUtils
{
  private static B2PDialogIconType parseIconType(@Nullable OldDialogICON paramOldDialogICON)
  {
    if (paramOldDialogICON == null) {
      return B2PDialogIconType.NONE;
    }
    switch (paramOldDialogICON)
    {
    default: 
      throw new IllegalStateException("We want to remove this old dialog. Do not add new icon types");
    case ???: 
      return B2PDialogIconType.FAILURE;
    case ???: 
      return B2PDialogIconType.SUCCESS;
    }
    return B2PDialogIconType.NONE;
  }
  
  public static void showAlertDialog(Context paramContext, String paramString1, String paramString2, Spannable paramSpannable, OldDialogICON paramOldDialogICON, IB2pView.IDialogCallback paramIDialogCallback1, int paramInt1, IB2pView.IDialogCallback paramIDialogCallback2, int paramInt2, Localizer paramLocalizer)
  {
    paramString1 = new B2PDialogBuilder(paramLocalizer).setIconType(parseIconType(paramOldDialogICON)).setHtmlTitle(paramString1);
    if (h.b(paramSpannable)) {
      paramString1.setHtmlMessage(paramSpannable);
    } else if (h.b(paramString2)) {
      paramString1.setMessage(paramString2);
    }
    if (paramInt1 > 0) {
      paramString1.setPositiveButtonText(paramInt1);
    }
    if (paramIDialogCallback1 != null)
    {
      paramIDialogCallback1.getClass();
      paramString1.setPositiveButtonCallback(new -..Lambda.MnPtIHMNN2FRjqInp7RfRkZ34E0(paramIDialogCallback1));
    }
    if (paramInt2 > 0) {
      paramString1.setNegativeButtonText(paramInt2);
    }
    if (paramIDialogCallback2 != null)
    {
      paramIDialogCallback2.getClass();
      paramString1.setNegativeButtonCallback(new -..Lambda.MnPtIHMNN2FRjqInp7RfRkZ34E0(paramIDialogCallback2));
    }
    paramString1.show(paramContext);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/dialog/olddialog/DialogUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
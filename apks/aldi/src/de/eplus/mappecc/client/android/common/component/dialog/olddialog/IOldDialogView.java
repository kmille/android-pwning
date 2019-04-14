package de.eplus.mappecc.client.android.common.component.dialog.olddialog;

import android.text.Spannable;
import de.eplus.mappecc.client.android.common.base.IB2pView.IDialogCallback;

@Deprecated
public abstract interface IOldDialogView
{
  public abstract void showDialog(int paramInt1, int paramInt2, IB2pView.IDialogCallback paramIDialogCallback1, int paramInt3, IB2pView.IDialogCallback paramIDialogCallback2, int paramInt4, OldDialogICON paramOldDialogICON);
  
  public abstract void showDialog(int paramInt1, int paramInt2, IB2pView.IDialogCallback paramIDialogCallback, int paramInt3, OldDialogICON paramOldDialogICON);
  
  public abstract void showDialog(String paramString, Spannable paramSpannable, IB2pView.IDialogCallback paramIDialogCallback1, int paramInt1, IB2pView.IDialogCallback paramIDialogCallback2, int paramInt2, boolean paramBoolean, OldDialogICON paramOldDialogICON);
  
  public abstract void showDialog(String paramString, Spannable paramSpannable, IB2pView.IDialogCallback paramIDialogCallback, int paramInt, OldDialogICON paramOldDialogICON);
  
  public abstract void showDialog(String paramString, Spannable paramSpannable, IB2pView.IDialogCallback paramIDialogCallback, int paramInt, boolean paramBoolean, OldDialogICON paramOldDialogICON);
  
  public abstract void showDialog(String paramString1, String paramString2, IB2pView.IDialogCallback paramIDialogCallback1, int paramInt1, IB2pView.IDialogCallback paramIDialogCallback2, int paramInt2, OldDialogICON paramOldDialogICON);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/dialog/olddialog/IOldDialogView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
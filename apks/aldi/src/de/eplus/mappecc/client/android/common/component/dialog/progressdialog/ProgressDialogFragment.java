package de.eplus.mappecc.client.android.common.component.dialog.progressdialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import org.apache.a.c.h;

public class ProgressDialogFragment
  extends DialogFragment
{
  public static final String TAG = "ProgressDialogFragment";
  private CharSequence message;
  private TextView progressMessageTextView;
  
  public void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setStyle(0, 2131755214);
  }
  
  @Nullable
  public View onCreateView(@NonNull LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    paramLayoutInflater = getActivity().getLayoutInflater().inflate(2131427470, null);
    this.progressMessageTextView = ((TextView)paramLayoutInflater.findViewById(2131231416));
    getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
    if (this.message == null)
    {
      this.progressMessageTextView.setVisibility(8);
      return paramLayoutInflater;
    }
    this.progressMessageTextView.setText(this.message);
    return paramLayoutInflater;
  }
  
  public void setMessage(@Nullable CharSequence paramCharSequence)
  {
    if (h.a(paramCharSequence))
    {
      this.message = null;
      return;
    }
    this.message = paramCharSequence;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/dialog/progressdialog/ProgressDialogFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
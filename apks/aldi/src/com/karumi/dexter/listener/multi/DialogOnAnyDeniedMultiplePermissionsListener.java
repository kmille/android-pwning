package com.karumi.dexter.listener.multi;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import com.karumi.dexter.MultiplePermissionsReport;

public class DialogOnAnyDeniedMultiplePermissionsListener
  extends BaseMultiplePermissionsListener
{
  private final Context context;
  private final Drawable icon;
  private final String message;
  private final String positiveButtonText;
  private final String title;
  
  private DialogOnAnyDeniedMultiplePermissionsListener(Context paramContext, String paramString1, String paramString2, String paramString3, Drawable paramDrawable)
  {
    this.context = paramContext;
    this.title = paramString1;
    this.message = paramString2;
    this.positiveButtonText = paramString3;
    this.icon = paramDrawable;
  }
  
  private void showDialog()
  {
    new AlertDialog.Builder(this.context).setTitle(this.title).setMessage(this.message).setPositiveButton(this.positiveButtonText, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.dismiss();
      }
    }).setIcon(this.icon).show();
  }
  
  public void onPermissionsChecked(MultiplePermissionsReport paramMultiplePermissionsReport)
  {
    super.onPermissionsChecked(paramMultiplePermissionsReport);
    if (!paramMultiplePermissionsReport.areAllPermissionsGranted()) {
      showDialog();
    }
  }
  
  public static class Builder
  {
    private String buttonText;
    private final Context context;
    private Drawable icon;
    private String message;
    private String title;
    
    private Builder(Context paramContext)
    {
      this.context = paramContext;
    }
    
    public static Builder withContext(Context paramContext)
    {
      return new Builder(paramContext);
    }
    
    public DialogOnAnyDeniedMultiplePermissionsListener build()
    {
      if (this.title == null) {}
      for (String str1 = "";; str1 = this.title) {
        break;
      }
      if (this.message == null) {}
      for (String str2 = "";; str2 = this.message) {
        break;
      }
      if (this.buttonText == null) {}
      for (String str3 = "";; str3 = this.buttonText) {
        break;
      }
      return new DialogOnAnyDeniedMultiplePermissionsListener(this.context, str1, str2, str3, this.icon, null);
    }
    
    public Builder withButtonText(@StringRes int paramInt)
    {
      this.buttonText = this.context.getString(paramInt);
      return this;
    }
    
    public Builder withButtonText(String paramString)
    {
      this.buttonText = paramString;
      return this;
    }
    
    public Builder withIcon(@DrawableRes int paramInt)
    {
      this.icon = this.context.getResources().getDrawable(paramInt);
      return this;
    }
    
    public Builder withIcon(Drawable paramDrawable)
    {
      this.icon = paramDrawable;
      return this;
    }
    
    public Builder withMessage(@StringRes int paramInt)
    {
      this.message = this.context.getString(paramInt);
      return this;
    }
    
    public Builder withMessage(String paramString)
    {
      this.message = paramString;
      return this;
    }
    
    public Builder withTitle(@StringRes int paramInt)
    {
      this.title = this.context.getString(paramInt);
      return this;
    }
    
    public Builder withTitle(String paramString)
    {
      this.title = paramString;
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/listener/multi/DialogOnAnyDeniedMultiplePermissionsListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
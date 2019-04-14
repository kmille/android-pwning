package com.karumi.dexter.listener.multi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.StringRes;
import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.Callback;
import android.view.View;
import android.view.View.OnClickListener;
import com.karumi.dexter.MultiplePermissionsReport;

public class SnackbarOnAnyDeniedMultiplePermissionsListener
  extends BaseMultiplePermissionsListener
{
  private final String buttonText;
  private final int duration;
  private final View.OnClickListener onButtonClickListener;
  private final Snackbar.Callback snackbarCallback;
  private final String text;
  private final View view;
  
  private SnackbarOnAnyDeniedMultiplePermissionsListener(View paramView, String paramString1, String paramString2, View.OnClickListener paramOnClickListener, Snackbar.Callback paramCallback, int paramInt)
  {
    this.view = paramView;
    this.text = paramString1;
    this.buttonText = paramString2;
    this.onButtonClickListener = paramOnClickListener;
    this.snackbarCallback = paramCallback;
    this.duration = paramInt;
  }
  
  private void showSnackbar()
  {
    Snackbar localSnackbar = Snackbar.make(this.view, this.text, this.duration);
    if ((this.buttonText != null) && (this.onButtonClickListener != null)) {
      localSnackbar.setAction(this.buttonText, this.onButtonClickListener);
    }
    if (this.snackbarCallback != null) {
      localSnackbar.setCallback(this.snackbarCallback);
    }
    localSnackbar.show();
  }
  
  public void onPermissionsChecked(MultiplePermissionsReport paramMultiplePermissionsReport)
  {
    super.onPermissionsChecked(paramMultiplePermissionsReport);
    if (!paramMultiplePermissionsReport.areAllPermissionsGranted()) {
      showSnackbar();
    }
  }
  
  public static class Builder
  {
    private String buttonText;
    private int duration = 0;
    private View.OnClickListener onClickListener;
    private Snackbar.Callback snackbarCallback;
    private final String text;
    private final View view;
    
    private Builder(View paramView, String paramString)
    {
      this.view = paramView;
      this.text = paramString;
    }
    
    public static Builder with(View paramView, @StringRes int paramInt)
    {
      return with(paramView, paramView.getContext().getString(paramInt));
    }
    
    public static Builder with(View paramView, String paramString)
    {
      return new Builder(paramView, paramString);
    }
    
    public SnackbarOnAnyDeniedMultiplePermissionsListener build()
    {
      return new SnackbarOnAnyDeniedMultiplePermissionsListener(this.view, this.text, this.buttonText, this.onClickListener, this.snackbarCallback, this.duration, null);
    }
    
    public Builder withButton(@StringRes int paramInt, View.OnClickListener paramOnClickListener)
    {
      return withButton(this.view.getContext().getString(paramInt), paramOnClickListener);
    }
    
    public Builder withButton(String paramString, View.OnClickListener paramOnClickListener)
    {
      this.buttonText = paramString;
      this.onClickListener = paramOnClickListener;
      return this;
    }
    
    public Builder withCallback(Snackbar.Callback paramCallback)
    {
      this.snackbarCallback = paramCallback;
      return this;
    }
    
    public Builder withDuration(int paramInt)
    {
      this.duration = paramInt;
      return this;
    }
    
    public Builder withOpenSettingsButton(@StringRes int paramInt)
    {
      return withOpenSettingsButton(this.view.getContext().getString(paramInt));
    }
    
    public Builder withOpenSettingsButton(String paramString)
    {
      this.buttonText = paramString;
      this.onClickListener = new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          paramAnonymousView = SnackbarOnAnyDeniedMultiplePermissionsListener.Builder.this.view.getContext();
          Object localObject = new StringBuilder("package:");
          ((StringBuilder)localObject).append(paramAnonymousView.getPackageName());
          localObject = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(((StringBuilder)localObject).toString()));
          ((Intent)localObject).addCategory("android.intent.category.DEFAULT");
          ((Intent)localObject).setFlags(268435456);
          paramAnonymousView.startActivity((Intent)localObject);
        }
      };
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/listener/multi/SnackbarOnAnyDeniedMultiplePermissionsListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
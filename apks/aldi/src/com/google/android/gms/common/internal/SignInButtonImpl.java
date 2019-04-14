package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.Button;
import com.google.android.gms.base.R.color;
import com.google.android.gms.base.R.drawable;
import com.google.android.gms.base.R.string;
import com.google.android.gms.common.util.DeviceProperties;

public final class SignInButtonImpl
  extends Button
{
  public SignInButtonImpl(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SignInButtonImpl(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 16842824);
  }
  
  private static int zaa(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    switch (paramInt1)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder(33);
      localStringBuilder.append("Unknown color scheme: ");
      localStringBuilder.append(paramInt1);
      throw new IllegalStateException(localStringBuilder.toString());
    case 2: 
      return paramInt4;
    case 1: 
      return paramInt3;
    }
    return paramInt2;
  }
  
  public final void configure(Resources paramResources, int paramInt1, int paramInt2)
  {
    setTypeface(Typeface.DEFAULT_BOLD);
    setTextSize(14.0F);
    int i = (int)(paramResources.getDisplayMetrics().density * 48.0F + 0.5F);
    setMinHeight(i);
    setMinWidth(i);
    i = R.drawable.common_google_signin_btn_icon_dark;
    int j = R.drawable.common_google_signin_btn_icon_light;
    i = zaa(paramInt2, i, j, j);
    j = R.drawable.common_google_signin_btn_text_dark;
    int k = R.drawable.common_google_signin_btn_text_light;
    j = zaa(paramInt2, j, k, k);
    switch (paramInt1)
    {
    default: 
      paramResources = new StringBuilder(32);
      paramResources.append("Unknown button size: ");
      paramResources.append(paramInt1);
      throw new IllegalStateException(paramResources.toString());
    case 0: 
    case 1: 
      i = j;
    }
    Drawable localDrawable = DrawableCompat.wrap(paramResources.getDrawable(i));
    DrawableCompat.setTintList(localDrawable, paramResources.getColorStateList(R.color.common_google_signin_btn_tint));
    DrawableCompat.setTintMode(localDrawable, PorterDuff.Mode.SRC_ATOP);
    setBackgroundDrawable(localDrawable);
    i = R.color.common_google_signin_btn_text_dark;
    j = R.color.common_google_signin_btn_text_light;
    setTextColor((ColorStateList)Preconditions.checkNotNull(paramResources.getColorStateList(zaa(paramInt2, i, j, j))));
    switch (paramInt1)
    {
    default: 
      paramResources = new StringBuilder(32);
      paramResources.append("Unknown button size: ");
      paramResources.append(paramInt1);
      throw new IllegalStateException(paramResources.toString());
    case 2: 
      setText(null);
      break;
    case 1: 
      paramInt1 = R.string.common_signin_button_text_long;
      break;
    case 0: 
      paramInt1 = R.string.common_signin_button_text;
    }
    setText(paramResources.getString(paramInt1));
    setTransformationMethod(null);
    if (DeviceProperties.isWearable(getContext())) {
      setGravity(19);
    }
  }
  
  public final void configure(Resources paramResources, SignInButtonConfig paramSignInButtonConfig)
  {
    configure(paramResources, paramSignInButtonConfig.getButtonSize(), paramSignInButtonConfig.getColorScheme());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/SignInButtonImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
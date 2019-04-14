package de.eplus.mappecc.client.android.common.component.dialog.b2pdialog;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.view.Window;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.model.B2PDialogButtonConfig;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.model.B2PDialogIconType;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.model.contentstyle.B2PDialogContentStyle;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.model.contentstyle.B2PDialogContentStyleType;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.view.B2PDialogView;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.view.button.B2PDialogButtonCallback;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.utils.StringHelper;
import org.apache.a.c.h;

public class B2PDialogBuilder
{
  private B2PDialogContentStyle b2PDialogContentStyle;
  private B2PDialogIconType iconType;
  private boolean isCancelable;
  Localizer localizer;
  private CharSequence message;
  private B2PDialogButtonConfig negativeB2PDialogButtonConfig;
  private B2PDialogButtonConfig positiveB2PDialogButtonConfig;
  private CharSequence title;
  
  public B2PDialogBuilder(@NonNull Localizer paramLocalizer)
  {
    this.localizer = paramLocalizer;
    init();
  }
  
  private B2PDialogButtonConfig getNegativeB2PDialogButtonConfig()
  {
    if (this.negativeB2PDialogButtonConfig == null)
    {
      this.negativeB2PDialogButtonConfig = new B2PDialogButtonConfig();
      this.negativeB2PDialogButtonConfig.setText(this.localizer.getString(2131690253));
    }
    return this.negativeB2PDialogButtonConfig;
  }
  
  private B2PDialogButtonConfig getPositiveB2PDialogButtonConfig()
  {
    if (this.positiveB2PDialogButtonConfig == null) {
      this.positiveB2PDialogButtonConfig = new B2PDialogButtonConfig();
    }
    return this.positiveB2PDialogButtonConfig;
  }
  
  private void init()
  {
    this.isCancelable = false;
    this.iconType = B2PDialogIconType.NONE;
    this.positiveB2PDialogButtonConfig = new B2PDialogButtonConfig();
    this.positiveB2PDialogButtonConfig.setText(this.localizer.getString(2131690254));
  }
  
  public AlertDialog create(@NonNull Context paramContext)
  {
    return new B2PDialogFactory().create(paramContext);
  }
  
  public B2PDialogBuilder setB2PDialogContentStyle(@Nullable B2PDialogContentStyle paramB2PDialogContentStyle)
  {
    this.b2PDialogContentStyle = paramB2PDialogContentStyle;
    return this;
  }
  
  public B2PDialogBuilder setHtmlMessage(@StringRes int paramInt)
  {
    return setHtmlMessage(this.localizer.getString(paramInt));
  }
  
  public B2PDialogBuilder setHtmlMessage(@Nullable CharSequence paramCharSequence)
  {
    if (h.b(paramCharSequence)) {}
    for (paramCharSequence = StringHelper.fromHtml(paramCharSequence);; paramCharSequence = null) {
      return setMessage(paramCharSequence);
    }
  }
  
  public B2PDialogBuilder setHtmlTitle(@NonNull String paramString)
  {
    if (h.b(paramString)) {}
    for (paramString = StringHelper.fromHtml(paramString);; paramString = null) {
      return setTitle(paramString);
    }
  }
  
  public B2PDialogBuilder setIconType(@NonNull B2PDialogIconType paramB2PDialogIconType)
  {
    this.iconType = paramB2PDialogIconType;
    return this;
  }
  
  public B2PDialogBuilder setMessage(@StringRes int paramInt)
  {
    this.message = this.localizer.getString(paramInt);
    return this;
  }
  
  public B2PDialogBuilder setMessage(@Nullable CharSequence paramCharSequence)
  {
    if (h.b(paramCharSequence)) {}
    for (;;)
    {
      this.message = paramCharSequence;
      return this;
      paramCharSequence = null;
    }
  }
  
  public B2PDialogBuilder setNegativeButton()
  {
    getNegativeB2PDialogButtonConfig();
    return this;
  }
  
  public B2PDialogBuilder setNegativeButtonCallback(@Nullable B2PDialogButtonCallback paramB2PDialogButtonCallback)
  {
    getNegativeB2PDialogButtonConfig().setB2PDialogButtonCallback(paramB2PDialogButtonCallback);
    return this;
  }
  
  public B2PDialogBuilder setNegativeButtonText(int paramInt)
  {
    getNegativeB2PDialogButtonConfig().setText(this.localizer.getString(paramInt));
    return this;
  }
  
  public B2PDialogBuilder setPositiveBackgroundStyleId(@DrawableRes int paramInt)
  {
    getPositiveB2PDialogButtonConfig().setBackgroundStyleId(paramInt);
    return this;
  }
  
  public B2PDialogBuilder setPositiveButtonCallback(@Nullable B2PDialogButtonCallback paramB2PDialogButtonCallback)
  {
    getPositiveB2PDialogButtonConfig().setB2PDialogButtonCallback(paramB2PDialogButtonCallback);
    return this;
  }
  
  public B2PDialogBuilder setPositiveButtonText(@StringRes int paramInt)
  {
    getPositiveB2PDialogButtonConfig().setText(this.localizer.getString(paramInt));
    return this;
  }
  
  public B2PDialogBuilder setPositiveButtonTextColor(@ColorRes int paramInt)
  {
    getPositiveB2PDialogButtonConfig().setTextColorId(paramInt);
    return this;
  }
  
  public B2PDialogBuilder setTitle(@StringRes int paramInt)
  {
    this.title = this.localizer.getString(paramInt);
    return this;
  }
  
  public B2PDialogBuilder setTitle(@Nullable CharSequence paramCharSequence)
  {
    if (h.b(paramCharSequence)) {}
    for (;;)
    {
      this.title = paramCharSequence;
      return this;
      paramCharSequence = null;
    }
  }
  
  public AlertDialog show(@NonNull Context paramContext)
  {
    paramContext = create(paramContext);
    paramContext.show();
    return paramContext;
  }
  
  public class B2PDialogFactory
  {
    public B2PDialogFactory() {}
    
    private void handleButtons(@NonNull B2PDialogView paramB2PDialogView)
    {
      if (isSingleButton())
      {
        paramB2PDialogView.setSingleDialogButton(B2PDialogBuilder.this.positiveB2PDialogButtonConfig);
        return;
      }
      paramB2PDialogView.setDoubleDialogButton(B2PDialogBuilder.this.positiveB2PDialogButtonConfig, B2PDialogBuilder.this.negativeB2PDialogButtonConfig);
    }
    
    private void handleContent(@NonNull B2PDialogView paramB2PDialogView)
    {
      if (isMessageOnly())
      {
        paramB2PDialogView.setContent(B2PDialogBuilder.this.b2PDialogContentStyle, B2PDialogBuilder.this.message);
        return;
      }
      paramB2PDialogView.setContent(B2PDialogBuilder.this.b2PDialogContentStyle, B2PDialogBuilder.this.title, B2PDialogBuilder.this.message);
    }
    
    private void handleIcon(@NonNull B2PDialogView paramB2PDialogView)
    {
      if (hasIcon()) {
        paramB2PDialogView.setIcon(B2PDialogBuilder.this.iconType.getBackgroundIcon(), B2PDialogBuilder.this.iconType.getInnerIcon());
      }
      if ((hasIcon()) && (isSingleButton())) {
        paramB2PDialogView.setIconClick(B2PDialogBuilder.this.positiveB2PDialogButtonConfig.getB2PDialogButtonCallback());
      }
    }
    
    private boolean hasIcon()
    {
      return (B2PDialogBuilder.this.iconType.getBackgroundIcon() > 0) && (B2PDialogBuilder.this.iconType.getInnerIcon() > 0);
    }
    
    private boolean isDefaultStyle()
    {
      return B2PDialogBuilder.this.b2PDialogContentStyle == null;
    }
    
    private boolean isMessageOnly()
    {
      return B2PDialogBuilder.this.title == null;
    }
    
    private boolean isSingleButton()
    {
      return B2PDialogBuilder.this.negativeB2PDialogButtonConfig == null;
    }
    
    private void prepareB2PDialogContentStyle()
    {
      if (!isDefaultStyle()) {
        return;
      }
      B2PDialogBuilder localB2PDialogBuilder;
      B2PDialogContentStyleType localB2PDialogContentStyleType;
      if ((hasIcon()) && (isMessageOnly()))
      {
        localB2PDialogBuilder = B2PDialogBuilder.this;
        localB2PDialogContentStyleType = B2PDialogContentStyleType.WITH_ICON_MESSAGE_ONLY;
      }
      for (;;)
      {
        B2PDialogBuilder.access$402(localB2PDialogBuilder, localB2PDialogContentStyleType.getB2PDialogContentStyle());
        return;
        if ((hasIcon()) && (!isMessageOnly()))
        {
          localB2PDialogBuilder = B2PDialogBuilder.this;
          localB2PDialogContentStyleType = B2PDialogContentStyleType.WITH_ICON_TITLE_MESSAGE;
        }
        else
        {
          localB2PDialogBuilder = B2PDialogBuilder.this;
          localB2PDialogContentStyleType = B2PDialogContentStyleType.DEFAULT;
        }
      }
    }
    
    private void prepareButtonConfig(@NonNull AlertDialog paramAlertDialog)
    {
      B2PDialogButtonConfig localB2PDialogButtonConfig1 = B2PDialogBuilder.this.positiveB2PDialogButtonConfig;
      int i = 0;
      B2PDialogButtonConfig localB2PDialogButtonConfig2 = B2PDialogBuilder.this.negativeB2PDialogButtonConfig;
      while (i < 2)
      {
        B2PDialogButtonConfig localB2PDialogButtonConfig3 = new B2PDialogButtonConfig[] { localB2PDialogButtonConfig1, localB2PDialogButtonConfig2 }[i];
        if (localB2PDialogButtonConfig3 != null) {
          localB2PDialogButtonConfig3.setB2PDialogButtonCallback(new -..Lambda.B2PDialogBuilder.B2PDialogFactory.ua9Dec_KxPda7T44em8owLm5shc(localB2PDialogButtonConfig3.getB2PDialogButtonCallback(), paramAlertDialog));
        }
        i += 1;
      }
    }
    
    private void validate() {}
    
    public AlertDialog create(@NonNull Context paramContext)
    {
      validate();
      AlertDialog localAlertDialog = new AlertDialog.Builder(paramContext).setCancelable(B2PDialogBuilder.this.isCancelable).create();
      prepareButtonConfig(localAlertDialog);
      prepareB2PDialogContentStyle();
      paramContext = new B2PDialogView(paramContext);
      handleIcon(paramContext);
      handleContent(paramContext);
      handleButtons(paramContext);
      localAlertDialog.setView(paramContext);
      localAlertDialog.getWindow().setBackgroundDrawableResource(17170445);
      return localAlertDialog;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/dialog/b2pdialog/B2PDialogBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
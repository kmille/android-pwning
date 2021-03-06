package de.eplus.mappecc.client.android.common.component.checkbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.eplus.mappecc.client.android.R.styleable;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import javax.inject.Inject;

public class CheckBoxForm
  extends LinearLayout
{
  private CheckBox checkBox;
  @Inject
  Localizer localizer;
  private TextView textViewDescription;
  
  public CheckBoxForm(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public CheckBoxForm(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
    initAttributes(paramAttributeSet);
  }
  
  public CheckBoxForm(Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
    initAttributes(paramAttributeSet);
  }
  
  @RequiresApi(api=21)
  public CheckBoxForm(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init();
    initAttributes(paramAttributeSet);
  }
  
  private void init()
  {
    B2PApplication.component.inject(this);
    inflate(getContext(), 2131427435, this);
    setOrientation(0);
    setGravity(3);
    this.checkBox = ((CheckBox)findViewById(2131230817));
    this.textViewDescription = ((TextView)findViewById(2131231283));
    setOnClickListener(new -..Lambda.CheckBoxForm.3VG-tntHIwFbwjiCl_Q1MWH_XQw(this));
  }
  
  private void initAttributes(AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return;
    }
    paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.CheckBoxForm);
    for (;;)
    {
      try
      {
        int j = paramAttributeSet.getIndexCount();
        int i = 0;
        int k;
        if (i < j) {
          k = paramAttributeSet.getIndex(i);
        }
        switch (k)
        {
        case 1: 
          setDescription(paramAttributeSet.getResourceId(k, 0));
          break;
        case 0: 
          setChecked(paramAttributeSet.getBoolean(k, false));
          i += 1;
          continue;
          return;
        }
      }
      finally
      {
        paramAttributeSet.recycle();
      }
    }
  }
  
  public boolean isChecked()
  {
    return this.checkBox.isChecked();
  }
  
  public void setChecked(boolean paramBoolean)
  {
    this.checkBox.setChecked(paramBoolean);
  }
  
  public void setDescription(@StringRes int paramInt)
  {
    this.textViewDescription.setText(this.localizer.getString(paramInt));
  }
  
  public void setDescription(@NonNull String paramString)
  {
    this.textViewDescription.setText(paramString);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/checkbox/CheckBoxForm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
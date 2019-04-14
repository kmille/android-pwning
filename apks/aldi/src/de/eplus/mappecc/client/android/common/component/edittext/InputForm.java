package de.eplus.mappecc.client.android.common.component.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import de.eplus.mappecc.client.android.R.styleable;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.component.textview.WhiteListTextWatcher;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;

public class InputForm
  extends LinearLayout
{
  private TextInputEditText inputFieldEditText;
  private TextInputLayout inputFieldLayout;
  private TextWatcher whiteListTextWatcher;
  
  public InputForm(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public InputForm(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
    initAttribute(paramAttributeSet);
  }
  
  public InputForm(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
    initAttribute(paramAttributeSet);
  }
  
  private void init()
  {
    inflate(getContext(), 2131427453, this);
    if (!isInEditMode()) {
      B2PApplication.component.inject(this);
    }
    this.inputFieldLayout = ((TextInputLayout)findViewById(2131231248));
    this.inputFieldEditText = ((TextInputEditText)findViewById(2131230918));
    setOrientation(1);
    this.inputFieldLayout.setErrorEnabled(true);
    this.inputFieldEditText.setMaxLines(1);
    this.inputFieldEditText.setLines(1);
  }
  
  private void initAttribute(AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return;
    }
    paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.InputForm);
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
        case 6: 
          setCharWhiteList(paramAttributeSet.getString(k));
          break;
        case 5: 
          setAllCaps(paramAttributeSet.getBoolean(k, false));
          break;
        case 4: 
          setImeOptions(paramAttributeSet.getInt(k, 0));
          break;
        case 3: 
          setInputType(paramAttributeSet.getInt(k, -1));
          break;
        case 2: 
          setHint(paramAttributeSet.getText(k));
          break;
        case 1: 
          setText(paramAttributeSet.getText(k).toString());
          break;
        case 0: 
          setFocusDown(paramAttributeSet.getInt(k, 0));
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
  
  private void setFocusDown(int paramInt)
  {
    this.inputFieldEditText.setNextFocusDownId(paramInt);
  }
  
  private void setImeOptions(int paramInt)
  {
    this.inputFieldEditText.setImeOptions(paramInt);
  }
  
  public void addTextChangedListener(TextWatcher paramTextWatcher)
  {
    this.inputFieldEditText.addTextChangedListener(paramTextWatcher);
  }
  
  public Editable getText()
  {
    return this.inputFieldEditText.getText();
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.inputFieldEditText.setFilters(new InputFilter[] { new InputFilter.AllCaps() });
      return;
    }
    this.inputFieldEditText.setFilters(new InputFilter[0]);
  }
  
  public void setCharWhiteList(@Nullable String paramString)
  {
    if (this.whiteListTextWatcher != null) {
      this.inputFieldEditText.removeTextChangedListener(this.whiteListTextWatcher);
    }
    if (paramString == null) {
      return;
    }
    this.whiteListTextWatcher = new WhiteListTextWatcher(paramString, this.inputFieldEditText);
    this.inputFieldEditText.addTextChangedListener(this.whiteListTextWatcher);
  }
  
  public void setHint(CharSequence paramCharSequence)
  {
    this.inputFieldLayout.setHint(paramCharSequence);
  }
  
  public void setInputType(int paramInt)
  {
    this.inputFieldEditText.setInputType(paramInt);
  }
  
  public void setMaxLength(int paramInt)
  {
    this.inputFieldEditText.setMaxEms(paramInt);
    this.inputFieldEditText.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramInt) });
  }
  
  public void setText(String paramString)
  {
    this.inputFieldEditText.setText(paramString);
  }
  
  public void setTextColor(int paramInt)
  {
    this.inputFieldEditText.setTextColor(paramInt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/edittext/InputForm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
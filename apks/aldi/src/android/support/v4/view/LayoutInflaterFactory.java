package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract interface LayoutInflaterFactory
{
  public abstract View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/view/LayoutInflaterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.v13.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.inputmethod.InputContentInfo;

public final class InputContentInfoCompat
{
  private final InputContentInfoCompatImpl mImpl;
  
  public InputContentInfoCompat(@NonNull Uri paramUri1, @NonNull ClipDescription paramClipDescription, @Nullable Uri paramUri2)
  {
    if (Build.VERSION.SDK_INT >= 25) {}
    for (paramUri1 = new InputContentInfoCompatApi25Impl(paramUri1, paramClipDescription, paramUri2);; paramUri1 = new InputContentInfoCompatBaseImpl(paramUri1, paramClipDescription, paramUri2))
    {
      this.mImpl = paramUri1;
      return;
    }
  }
  
  private InputContentInfoCompat(@NonNull InputContentInfoCompatImpl paramInputContentInfoCompatImpl)
  {
    this.mImpl = paramInputContentInfoCompatImpl;
  }
  
  @Nullable
  public static InputContentInfoCompat wrap(@Nullable Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if (Build.VERSION.SDK_INT < 25) {
      return null;
    }
    return new InputContentInfoCompat(new InputContentInfoCompatApi25Impl(paramObject));
  }
  
  @NonNull
  public final Uri getContentUri()
  {
    return this.mImpl.getContentUri();
  }
  
  @NonNull
  public final ClipDescription getDescription()
  {
    return this.mImpl.getDescription();
  }
  
  @Nullable
  public final Uri getLinkUri()
  {
    return this.mImpl.getLinkUri();
  }
  
  public final void releasePermission()
  {
    this.mImpl.releasePermission();
  }
  
  public final void requestPermission()
  {
    this.mImpl.requestPermission();
  }
  
  @Nullable
  public final Object unwrap()
  {
    return this.mImpl.getInputContentInfo();
  }
  
  @RequiresApi(25)
  static final class InputContentInfoCompatApi25Impl
    implements InputContentInfoCompat.InputContentInfoCompatImpl
  {
    @NonNull
    final InputContentInfo mObject;
    
    InputContentInfoCompatApi25Impl(@NonNull Uri paramUri1, @NonNull ClipDescription paramClipDescription, @Nullable Uri paramUri2)
    {
      this.mObject = new InputContentInfo(paramUri1, paramClipDescription, paramUri2);
    }
    
    InputContentInfoCompatApi25Impl(@NonNull Object paramObject)
    {
      this.mObject = ((InputContentInfo)paramObject);
    }
    
    @NonNull
    public final Uri getContentUri()
    {
      return this.mObject.getContentUri();
    }
    
    @NonNull
    public final ClipDescription getDescription()
    {
      return this.mObject.getDescription();
    }
    
    @Nullable
    public final Object getInputContentInfo()
    {
      return this.mObject;
    }
    
    @Nullable
    public final Uri getLinkUri()
    {
      return this.mObject.getLinkUri();
    }
    
    public final void releasePermission()
    {
      this.mObject.releasePermission();
    }
    
    public final void requestPermission()
    {
      this.mObject.requestPermission();
    }
  }
  
  static final class InputContentInfoCompatBaseImpl
    implements InputContentInfoCompat.InputContentInfoCompatImpl
  {
    @NonNull
    private final Uri mContentUri;
    @NonNull
    private final ClipDescription mDescription;
    @Nullable
    private final Uri mLinkUri;
    
    InputContentInfoCompatBaseImpl(@NonNull Uri paramUri1, @NonNull ClipDescription paramClipDescription, @Nullable Uri paramUri2)
    {
      this.mContentUri = paramUri1;
      this.mDescription = paramClipDescription;
      this.mLinkUri = paramUri2;
    }
    
    @NonNull
    public final Uri getContentUri()
    {
      return this.mContentUri;
    }
    
    @NonNull
    public final ClipDescription getDescription()
    {
      return this.mDescription;
    }
    
    @Nullable
    public final Object getInputContentInfo()
    {
      return null;
    }
    
    @Nullable
    public final Uri getLinkUri()
    {
      return this.mLinkUri;
    }
    
    public final void releasePermission() {}
    
    public final void requestPermission() {}
  }
  
  static abstract interface InputContentInfoCompatImpl
  {
    @NonNull
    public abstract Uri getContentUri();
    
    @NonNull
    public abstract ClipDescription getDescription();
    
    @Nullable
    public abstract Object getInputContentInfo();
    
    @Nullable
    public abstract Uri getLinkUri();
    
    public abstract void releasePermission();
    
    public abstract void requestPermission();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v13/view/inputmethod/InputContentInfoCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
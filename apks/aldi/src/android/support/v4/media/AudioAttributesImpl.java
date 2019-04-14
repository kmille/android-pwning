package android.support.v4.media;

import android.os.Bundle;
import android.support.annotation.NonNull;
import androidx.versionedparcelable.c;

public abstract interface AudioAttributesImpl
  extends c
{
  public abstract Object getAudioAttributes();
  
  public abstract int getContentType();
  
  public abstract int getFlags();
  
  public abstract int getLegacyStreamType();
  
  public abstract int getRawLegacyStreamType();
  
  public abstract int getUsage();
  
  public abstract int getVolumeControlStream();
  
  @NonNull
  public abstract Bundle toBundle();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/media/AudioAttributesImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
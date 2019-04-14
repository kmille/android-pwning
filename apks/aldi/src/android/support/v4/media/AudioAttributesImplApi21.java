package android.support.v4.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(21)
public class AudioAttributesImplApi21
  implements AudioAttributesImpl
{
  private static final String TAG = "AudioAttributesCompat21";
  static Method sAudioAttributesToLegacyStreamType;
  AudioAttributes mAudioAttributes;
  int mLegacyStreamType = -1;
  
  AudioAttributesImplApi21() {}
  
  AudioAttributesImplApi21(AudioAttributes paramAudioAttributes)
  {
    this(paramAudioAttributes, -1);
  }
  
  AudioAttributesImplApi21(AudioAttributes paramAudioAttributes, int paramInt)
  {
    this.mAudioAttributes = paramAudioAttributes;
    this.mLegacyStreamType = paramInt;
  }
  
  public static AudioAttributesImpl fromBundle(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    AudioAttributes localAudioAttributes = (AudioAttributes)paramBundle.getParcelable("android.support.v4.media.audio_attrs.FRAMEWORKS");
    if (localAudioAttributes == null) {
      return null;
    }
    return new AudioAttributesImplApi21(localAudioAttributes, paramBundle.getInt("android.support.v4.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
  }
  
  static Method getAudioAttributesToLegacyStreamTypeMethod()
  {
    try
    {
      if (sAudioAttributesToLegacyStreamType == null) {
        sAudioAttributesToLegacyStreamType = AudioAttributes.class.getMethod("toLegacyStreamType", new Class[] { AudioAttributes.class });
      }
      return sAudioAttributesToLegacyStreamType;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    return null;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof AudioAttributesImplApi21)) {
      return false;
    }
    paramObject = (AudioAttributesImplApi21)paramObject;
    return this.mAudioAttributes.equals(((AudioAttributesImplApi21)paramObject).mAudioAttributes);
  }
  
  public Object getAudioAttributes()
  {
    return this.mAudioAttributes;
  }
  
  public int getContentType()
  {
    return this.mAudioAttributes.getContentType();
  }
  
  public int getFlags()
  {
    return this.mAudioAttributes.getFlags();
  }
  
  public int getLegacyStreamType()
  {
    if (this.mLegacyStreamType != -1) {
      return this.mLegacyStreamType;
    }
    Object localObject = getAudioAttributesToLegacyStreamTypeMethod();
    if (localObject == null) {}
    for (localObject = new StringBuilder("No AudioAttributes#toLegacyStreamType() on API: ");; localObject = new StringBuilder("getLegacyStreamType() failed on API: "))
    {
      ((StringBuilder)localObject).append(Build.VERSION.SDK_INT);
      return -1;
      try
      {
        int i = ((Integer)((Method)localObject).invoke(null, new Object[] { this.mAudioAttributes })).intValue();
        return i;
      }
      catch (InvocationTargetException|IllegalAccessException localInvocationTargetException)
      {
        for (;;) {}
      }
    }
  }
  
  public int getRawLegacyStreamType()
  {
    return this.mLegacyStreamType;
  }
  
  public int getUsage()
  {
    return this.mAudioAttributes.getUsage();
  }
  
  public int getVolumeControlStream()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return this.mAudioAttributes.getVolumeControlStream();
    }
    return AudioAttributesCompat.toVolumeStreamType(true, getFlags(), getUsage());
  }
  
  public int hashCode()
  {
    return this.mAudioAttributes.hashCode();
  }
  
  @NonNull
  public Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("android.support.v4.media.audio_attrs.FRAMEWORKS", this.mAudioAttributes);
    if (this.mLegacyStreamType != -1) {
      localBundle.putInt("android.support.v4.media.audio_attrs.LEGACY_STREAM_TYPE", this.mLegacyStreamType);
    }
    return localBundle;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("AudioAttributesCompat: audioattributes=");
    localStringBuilder.append(this.mAudioAttributes);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/media/AudioAttributesImplApi21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
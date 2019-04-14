package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.RequiresPermission;

public class OneoffTask
  extends Task
{
  public static final Parcelable.Creator<OneoffTask> CREATOR = new zzi();
  private final long zzaj;
  private final long zzak;
  
  @Deprecated
  private OneoffTask(Parcel paramParcel)
  {
    super(paramParcel);
    this.zzaj = paramParcel.readLong();
    this.zzak = paramParcel.readLong();
  }
  
  private OneoffTask(Builder paramBuilder)
  {
    super(paramBuilder);
    this.zzaj = Builder.zzd(paramBuilder);
    this.zzak = Builder.zze(paramBuilder);
  }
  
  public long getWindowEnd()
  {
    return this.zzak;
  }
  
  public long getWindowStart()
  {
    return this.zzaj;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    super.toBundle(paramBundle);
    paramBundle.putLong("window_start", this.zzaj);
    paramBundle.putLong("window_end", this.zzak);
  }
  
  public String toString()
  {
    String str = super.toString();
    long l1 = getWindowStart();
    long l2 = getWindowEnd();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 64);
    localStringBuilder.append(str);
    localStringBuilder.append(" windowStart=");
    localStringBuilder.append(l1);
    localStringBuilder.append(" windowEnd=");
    localStringBuilder.append(l2);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.zzaj);
    paramParcel.writeLong(this.zzak);
  }
  
  public static class Builder
    extends Task.Builder
  {
    private long zzaj = -1L;
    private long zzak = -1L;
    
    public Builder()
    {
      this.isPersisted = false;
    }
    
    public OneoffTask build()
    {
      checkConditions();
      return new OneoffTask(this, null);
    }
    
    protected void checkConditions()
    {
      super.checkConditions();
      if ((this.zzaj != -1L) && (this.zzak != -1L))
      {
        if (this.zzaj < this.zzak) {
          return;
        }
        throw new IllegalArgumentException("Window start must be shorter than window end.");
      }
      throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
    }
    
    public Builder setExecutionWindow(long paramLong1, long paramLong2)
    {
      this.zzaj = paramLong1;
      this.zzak = paramLong2;
      return this;
    }
    
    public Builder setExtras(Bundle paramBundle)
    {
      this.extras = paramBundle;
      return this;
    }
    
    @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
    public Builder setPersisted(boolean paramBoolean)
    {
      this.isPersisted = paramBoolean;
      return this;
    }
    
    public Builder setRequiredNetwork(int paramInt)
    {
      this.requiredNetworkState = paramInt;
      return this;
    }
    
    public Builder setRequiresCharging(boolean paramBoolean)
    {
      this.requiresCharging = paramBoolean;
      return this;
    }
    
    public Builder setService(Class<? extends GcmTaskService> paramClass)
    {
      this.gcmTaskService = paramClass.getName();
      return this;
    }
    
    public Builder setTag(String paramString)
    {
      this.tag = paramString;
      return this;
    }
    
    public Builder setUpdateCurrent(boolean paramBoolean)
    {
      this.updateCurrent = paramBoolean;
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/gcm/OneoffTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.RequiresPermission;

public class PeriodicTask
  extends Task
{
  public static final Parcelable.Creator<PeriodicTask> CREATOR = new zzk();
  protected long mFlexInSeconds = -1L;
  protected long mIntervalInSeconds = -1L;
  
  @Deprecated
  private PeriodicTask(Parcel paramParcel)
  {
    super(paramParcel);
    this.mIntervalInSeconds = paramParcel.readLong();
    this.mFlexInSeconds = Math.min(paramParcel.readLong(), this.mIntervalInSeconds);
  }
  
  private PeriodicTask(Builder paramBuilder)
  {
    super(paramBuilder);
    this.mIntervalInSeconds = Builder.zzd(paramBuilder);
    this.mFlexInSeconds = Math.min(Builder.zze(paramBuilder), this.mIntervalInSeconds);
  }
  
  public long getFlex()
  {
    return this.mFlexInSeconds;
  }
  
  public long getPeriod()
  {
    return this.mIntervalInSeconds;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    super.toBundle(paramBundle);
    paramBundle.putLong("period", this.mIntervalInSeconds);
    paramBundle.putLong("period_flex", this.mFlexInSeconds);
  }
  
  public String toString()
  {
    String str = super.toString();
    long l1 = getPeriod();
    long l2 = getFlex();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 54);
    localStringBuilder.append(str);
    localStringBuilder.append(" period=");
    localStringBuilder.append(l1);
    localStringBuilder.append(" flex=");
    localStringBuilder.append(l2);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.mIntervalInSeconds);
    paramParcel.writeLong(this.mFlexInSeconds);
  }
  
  public static class Builder
    extends Task.Builder
  {
    private long zzam = -1L;
    private long zzan = -1L;
    
    public Builder()
    {
      this.isPersisted = true;
    }
    
    public PeriodicTask build()
    {
      checkConditions();
      return new PeriodicTask(this, null);
    }
    
    protected void checkConditions()
    {
      super.checkConditions();
      if (this.zzam != -1L)
      {
        if (this.zzam > 0L)
        {
          if (this.zzan == -1L)
          {
            this.zzan = (((float)this.zzam * 0.1F));
            return;
          }
          if (this.zzan > this.zzam) {
            this.zzan = this.zzam;
          }
          return;
        }
        long l = this.zzam;
        StringBuilder localStringBuilder = new StringBuilder(66);
        localStringBuilder.append("Period set cannot be less than or equal to 0: ");
        localStringBuilder.append(l);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
    }
    
    public Builder setExtras(Bundle paramBundle)
    {
      this.extras = paramBundle;
      return this;
    }
    
    public Builder setFlex(long paramLong)
    {
      this.zzan = paramLong;
      return this;
    }
    
    public Builder setPeriod(long paramLong)
    {
      this.zzam = paramLong;
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


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/gcm/PeriodicTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
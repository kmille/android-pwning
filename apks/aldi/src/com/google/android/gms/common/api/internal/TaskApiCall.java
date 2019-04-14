package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT>
{
  private final Feature[] zakd;
  private final boolean zakk;
  
  @Deprecated
  @KeepForSdk
  public TaskApiCall()
  {
    this.zakd = null;
    this.zakk = false;
  }
  
  @KeepForSdk
  private TaskApiCall(Feature[] paramArrayOfFeature, boolean paramBoolean)
  {
    this.zakd = paramArrayOfFeature;
    this.zakk = paramBoolean;
  }
  
  @KeepForSdk
  public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> builder()
  {
    return new Builder(null);
  }
  
  @KeepForSdk
  protected abstract void doExecute(A paramA, TaskCompletionSource<ResultT> paramTaskCompletionSource)
    throws RemoteException;
  
  @KeepForSdk
  public boolean shouldAutoResolveMissingFeatures()
  {
    return this.zakk;
  }
  
  @Nullable
  public final Feature[] zabt()
  {
    return this.zakd;
  }
  
  @KeepForSdk
  public static class Builder<A extends Api.AnyClient, ResultT>
  {
    private Feature[] zakd;
    private boolean zakk = true;
    private RemoteCall<A, TaskCompletionSource<ResultT>> zakl;
    
    @KeepForSdk
    public TaskApiCall<A, ResultT> build()
    {
      boolean bool;
      if (this.zakl != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "execute parameter required");
      return new zack(this, this.zakd, this.zakk);
    }
    
    @Deprecated
    @KeepForSdk
    public Builder<A, ResultT> execute(BiConsumer<A, TaskCompletionSource<ResultT>> paramBiConsumer)
    {
      this.zakl = new zacj(paramBiConsumer);
      return this;
    }
    
    @KeepForSdk
    public Builder<A, ResultT> run(RemoteCall<A, TaskCompletionSource<ResultT>> paramRemoteCall)
    {
      this.zakl = paramRemoteCall;
      return this;
    }
    
    @KeepForSdk
    public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean paramBoolean)
    {
      this.zakk = paramBoolean;
      return this;
    }
    
    @KeepForSdk
    public Builder<A, ResultT> setFeatures(Feature... paramVarArgs)
    {
      this.zakd = paramVarArgs;
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/TaskApiCall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
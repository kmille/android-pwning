package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public class RegistrationMethods<A extends Api.AnyClient, L>
{
  public final RegisterListenerMethod<A, L> zajy;
  public final UnregisterListenerMethod<A, L> zajz;
  
  private RegistrationMethods(RegisterListenerMethod<A, L> paramRegisterListenerMethod, UnregisterListenerMethod<A, L> paramUnregisterListenerMethod)
  {
    this.zajy = paramRegisterListenerMethod;
    this.zajz = paramUnregisterListenerMethod;
  }
  
  @KeepForSdk
  public static <A extends Api.AnyClient, L> Builder<A, L> builder()
  {
    return new Builder(null);
  }
  
  @KeepForSdk
  public static class Builder<A extends Api.AnyClient, L>
  {
    private boolean zajv = true;
    private RemoteCall<A, TaskCompletionSource<Void>> zaka;
    private RemoteCall<A, TaskCompletionSource<Boolean>> zakb;
    private ListenerHolder<L> zakc;
    private Feature[] zakd;
    
    @KeepForSdk
    public RegistrationMethods<A, L> build()
    {
      RemoteCall localRemoteCall = this.zaka;
      boolean bool2 = false;
      if (localRemoteCall != null) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Preconditions.checkArgument(bool1, "Must set register function");
      if (this.zakb != null) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Preconditions.checkArgument(bool1, "Must set unregister function");
      boolean bool1 = bool2;
      if (this.zakc != null) {
        bool1 = true;
      }
      Preconditions.checkArgument(bool1, "Must set holder");
      return new RegistrationMethods(new zaca(this, this.zakc, this.zakd, this.zajv), new zacb(this, this.zakc.getListenerKey()), null);
    }
    
    @KeepForSdk
    public Builder<A, L> register(RemoteCall<A, TaskCompletionSource<Void>> paramRemoteCall)
    {
      this.zaka = paramRemoteCall;
      return this;
    }
    
    @Deprecated
    @KeepForSdk
    public Builder<A, L> register(BiConsumer<A, TaskCompletionSource<Void>> paramBiConsumer)
    {
      this.zaka = new zaby(paramBiConsumer);
      return this;
    }
    
    @KeepForSdk
    public Builder<A, L> setAutoResolveMissingFeatures(boolean paramBoolean)
    {
      this.zajv = paramBoolean;
      return this;
    }
    
    @KeepForSdk
    public Builder<A, L> setFeatures(Feature[] paramArrayOfFeature)
    {
      this.zakd = paramArrayOfFeature;
      return this;
    }
    
    @KeepForSdk
    public Builder<A, L> unregister(RemoteCall<A, TaskCompletionSource<Boolean>> paramRemoteCall)
    {
      this.zakb = paramRemoteCall;
      return this;
    }
    
    @Deprecated
    @KeepForSdk
    public Builder<A, L> unregister(BiConsumer<A, TaskCompletionSource<Boolean>> paramBiConsumer)
    {
      this.zaka = new zabz(this);
      return this;
    }
    
    @KeepForSdk
    public Builder<A, L> withHolder(ListenerHolder<L> paramListenerHolder)
    {
      this.zakc = paramListenerHolder;
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/RegistrationMethods.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
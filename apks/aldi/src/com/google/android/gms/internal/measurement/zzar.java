package com.google.android.gms.internal.measurement;

public abstract class zzar
  extends zzaq
{
  private boolean zzvn;
  
  protected zzar(zzat paramzzat)
  {
    super(paramzzat);
  }
  
  public final boolean isInitialized()
  {
    return this.zzvn;
  }
  
  protected abstract void zzac();
  
  protected final void zzch()
  {
    if (isInitialized()) {
      return;
    }
    throw new IllegalStateException("Not initialized");
  }
  
  public final void zzm()
  {
    zzac();
    this.zzvn = true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
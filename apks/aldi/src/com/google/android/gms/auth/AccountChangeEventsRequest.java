package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;

@SafeParcelable.Class(creator="AccountChangeEventsRequestCreator")
public class AccountChangeEventsRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new zzb();
  @SafeParcelable.VersionField(id=1)
  private final int zze;
  @Deprecated
  @SafeParcelable.Field(id=3)
  private String zzg;
  @SafeParcelable.Field(id=2)
  private int zzi;
  @SafeParcelable.Field(id=4)
  private Account zzk;
  
  public AccountChangeEventsRequest()
  {
    this.zze = 1;
  }
  
  @SafeParcelable.Constructor
  AccountChangeEventsRequest(@SafeParcelable.Param(id=1) int paramInt1, @SafeParcelable.Param(id=2) int paramInt2, @SafeParcelable.Param(id=3) String paramString, @SafeParcelable.Param(id=4) Account paramAccount)
  {
    this.zze = paramInt1;
    this.zzi = paramInt2;
    this.zzg = paramString;
    if ((paramAccount == null) && (!TextUtils.isEmpty(paramString)))
    {
      this.zzk = new Account(paramString, "com.google");
      return;
    }
    this.zzk = paramAccount;
  }
  
  public Account getAccount()
  {
    return this.zzk;
  }
  
  @Deprecated
  public String getAccountName()
  {
    return this.zzg;
  }
  
  public int getEventIndex()
  {
    return this.zzi;
  }
  
  public AccountChangeEventsRequest setAccount(Account paramAccount)
  {
    this.zzk = paramAccount;
    return this;
  }
  
  @Deprecated
  public AccountChangeEventsRequest setAccountName(String paramString)
  {
    this.zzg = paramString;
    return this;
  }
  
  public AccountChangeEventsRequest setEventIndex(int paramInt)
  {
    this.zzi = paramInt;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zze);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzi);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzg, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzk, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/AccountChangeEventsRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
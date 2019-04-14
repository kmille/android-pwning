package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.support.v4.util.ArraySet;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@KeepForSdk
@VisibleForTesting
public final class ClientSettings
{
  public static final String KEY_CLIENT_SESSION_ID = "com.google.android.gms.common.internal.ClientSettings.sessionId";
  private final Set<Scope> zabr;
  private final int zabt;
  private final View zabu;
  private final String zabv;
  private final String zabw;
  private final Set<Scope> zaoa;
  private final Map<Api<?>, OptionalApiSettings> zaob;
  private final SignInOptions zaoc;
  private Integer zaod;
  private final Account zax;
  
  public ClientSettings(Account paramAccount, Set<Scope> paramSet, Map<Api<?>, OptionalApiSettings> paramMap, int paramInt, View paramView, String paramString1, String paramString2, SignInOptions paramSignInOptions)
  {
    this.zax = paramAccount;
    if (paramSet == null) {
      paramAccount = Collections.EMPTY_SET;
    } else {
      paramAccount = Collections.unmodifiableSet(paramSet);
    }
    this.zabr = paramAccount;
    paramAccount = paramMap;
    if (paramMap == null) {
      paramAccount = Collections.EMPTY_MAP;
    }
    this.zaob = paramAccount;
    this.zabu = paramView;
    this.zabt = paramInt;
    this.zabv = paramString1;
    this.zabw = paramString2;
    this.zaoc = paramSignInOptions;
    paramAccount = new HashSet(this.zabr);
    paramSet = this.zaob.values().iterator();
    while (paramSet.hasNext()) {
      paramAccount.addAll(((OptionalApiSettings)paramSet.next()).mScopes);
    }
    this.zaoa = Collections.unmodifiableSet(paramAccount);
  }
  
  @KeepForSdk
  public static ClientSettings createDefault(Context paramContext)
  {
    return new GoogleApiClient.Builder(paramContext).buildClientSettings();
  }
  
  @Nullable
  @KeepForSdk
  public final Account getAccount()
  {
    return this.zax;
  }
  
  @Deprecated
  @Nullable
  @KeepForSdk
  public final String getAccountName()
  {
    if (this.zax != null) {
      return this.zax.name;
    }
    return null;
  }
  
  @KeepForSdk
  public final Account getAccountOrDefault()
  {
    if (this.zax != null) {
      return this.zax;
    }
    return new Account("<<default account>>", "com.google");
  }
  
  @KeepForSdk
  public final Set<Scope> getAllRequestedScopes()
  {
    return this.zaoa;
  }
  
  @KeepForSdk
  public final Set<Scope> getApplicableScopes(Api<?> paramApi)
  {
    paramApi = (OptionalApiSettings)this.zaob.get(paramApi);
    if ((paramApi != null) && (!paramApi.mScopes.isEmpty()))
    {
      HashSet localHashSet = new HashSet(this.zabr);
      localHashSet.addAll(paramApi.mScopes);
      return localHashSet;
    }
    return this.zabr;
  }
  
  @Nullable
  public final Integer getClientSessionId()
  {
    return this.zaod;
  }
  
  @KeepForSdk
  public final int getGravityForPopups()
  {
    return this.zabt;
  }
  
  public final Map<Api<?>, OptionalApiSettings> getOptionalApiSettings()
  {
    return this.zaob;
  }
  
  @Nullable
  public final String getRealClientClassName()
  {
    return this.zabw;
  }
  
  @Nullable
  @KeepForSdk
  public final String getRealClientPackageName()
  {
    return this.zabv;
  }
  
  @KeepForSdk
  public final Set<Scope> getRequiredScopes()
  {
    return this.zabr;
  }
  
  @Nullable
  public final SignInOptions getSignInOptions()
  {
    return this.zaoc;
  }
  
  @Nullable
  @KeepForSdk
  public final View getViewForPopups()
  {
    return this.zabu;
  }
  
  public final void setClientSessionId(Integer paramInteger)
  {
    this.zaod = paramInteger;
  }
  
  @KeepForSdk
  public static final class Builder
  {
    private int zabt = 0;
    private View zabu;
    private String zabv;
    private String zabw;
    private Map<Api<?>, ClientSettings.OptionalApiSettings> zaob;
    private SignInOptions zaoc = SignInOptions.DEFAULT;
    private ArraySet<Scope> zaoe;
    private Account zax;
    
    public final Builder addAllRequiredScopes(Collection<Scope> paramCollection)
    {
      if (this.zaoe == null) {
        this.zaoe = new ArraySet();
      }
      this.zaoe.addAll(paramCollection);
      return this;
    }
    
    public final Builder addRequiredScope(Scope paramScope)
    {
      if (this.zaoe == null) {
        this.zaoe = new ArraySet();
      }
      this.zaoe.add(paramScope);
      return this;
    }
    
    @KeepForSdk
    public final ClientSettings build()
    {
      return new ClientSettings(this.zax, this.zaoe, this.zaob, this.zabt, this.zabu, this.zabv, this.zabw, this.zaoc);
    }
    
    public final Builder setAccount(Account paramAccount)
    {
      this.zax = paramAccount;
      return this;
    }
    
    public final Builder setGravityForPopups(int paramInt)
    {
      this.zabt = paramInt;
      return this;
    }
    
    public final Builder setOptionalApiSettingsMap(Map<Api<?>, ClientSettings.OptionalApiSettings> paramMap)
    {
      this.zaob = paramMap;
      return this;
    }
    
    public final Builder setRealClientClassName(String paramString)
    {
      this.zabw = paramString;
      return this;
    }
    
    @KeepForSdk
    public final Builder setRealClientPackageName(String paramString)
    {
      this.zabv = paramString;
      return this;
    }
    
    public final Builder setSignInOptions(SignInOptions paramSignInOptions)
    {
      this.zaoc = paramSignInOptions;
      return this;
    }
    
    public final Builder setViewForPopups(View paramView)
    {
      this.zabu = paramView;
      return this;
    }
  }
  
  public static final class OptionalApiSettings
  {
    public final Set<Scope> mScopes;
    
    public OptionalApiSettings(Set<Scope> paramSet)
    {
      Preconditions.checkNotNull(paramSet);
      this.mScopes = Collections.unmodifiableSet(paramSet);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/ClientSettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
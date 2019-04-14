package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

@SafeParcelable.Class(creator="CredentialCreator")
@SafeParcelable.Reserved({1000})
public class Credential
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<Credential> CREATOR = new zzc();
  public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
  @Nonnull
  @SafeParcelable.Field(getter="getId", id=1)
  private final String mId;
  @Nullable
  @SafeParcelable.Field(getter="getName", id=2)
  private final String mName;
  @Nullable
  @SafeParcelable.Field(getter="getProfilePictureUri", id=3)
  private final Uri zzo;
  @Nonnull
  @SafeParcelable.Field(getter="getIdTokens", id=4)
  private final List<IdToken> zzp;
  @Nullable
  @SafeParcelable.Field(getter="getPassword", id=5)
  private final String zzq;
  @Nullable
  @SafeParcelable.Field(getter="getAccountType", id=6)
  private final String zzr;
  @Nullable
  @SafeParcelable.Field(getter="getGivenName", id=9)
  private final String zzs;
  @Nullable
  @SafeParcelable.Field(getter="getFamilyName", id=10)
  private final String zzt;
  
  @SafeParcelable.Constructor
  Credential(@SafeParcelable.Param(id=1) String paramString1, @SafeParcelable.Param(id=2) String paramString2, @SafeParcelable.Param(id=3) Uri paramUri, @SafeParcelable.Param(id=4) List<IdToken> paramList, @SafeParcelable.Param(id=5) String paramString3, @SafeParcelable.Param(id=6) String paramString4, @SafeParcelable.Param(id=9) String paramString5, @SafeParcelable.Param(id=10) String paramString6)
  {
    String str = ((String)Preconditions.checkNotNull(paramString1, "credential identifier cannot be null")).trim();
    Preconditions.checkNotEmpty(str, "credential identifier cannot be empty");
    if ((paramString3 != null) && (TextUtils.isEmpty(paramString3))) {
      throw new IllegalArgumentException("Password must not be empty if set");
    }
    if (paramString4 != null)
    {
      boolean bool = TextUtils.isEmpty(paramString4);
      int j = 0;
      int i = j;
      if (!bool)
      {
        paramString1 = Uri.parse(paramString4);
        i = j;
        if (paramString1.isAbsolute())
        {
          i = j;
          if (paramString1.isHierarchical())
          {
            i = j;
            if (!TextUtils.isEmpty(paramString1.getScheme())) {
              if (TextUtils.isEmpty(paramString1.getAuthority()))
              {
                i = j;
              }
              else if (!"http".equalsIgnoreCase(paramString1.getScheme()))
              {
                i = j;
                if (!"https".equalsIgnoreCase(paramString1.getScheme())) {}
              }
              else
              {
                i = 1;
              }
            }
          }
        }
      }
      if (i == 0) {
        throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
      }
    }
    if ((!TextUtils.isEmpty(paramString4)) && (!TextUtils.isEmpty(paramString3))) {
      throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
    }
    paramString1 = paramString2;
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (TextUtils.isEmpty(paramString2.trim())) {
        paramString1 = null;
      }
    }
    this.mName = paramString1;
    this.zzo = paramUri;
    if (paramList == null) {
      paramString1 = Collections.emptyList();
    } else {
      paramString1 = Collections.unmodifiableList(paramList);
    }
    this.zzp = paramString1;
    this.mId = str;
    this.zzq = paramString3;
    this.zzr = paramString4;
    this.zzs = paramString5;
    this.zzt = paramString6;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Credential)) {
      return false;
    }
    paramObject = (Credential)paramObject;
    return (TextUtils.equals(this.mId, ((Credential)paramObject).mId)) && (TextUtils.equals(this.mName, ((Credential)paramObject).mName)) && (Objects.equal(this.zzo, ((Credential)paramObject).zzo)) && (TextUtils.equals(this.zzq, ((Credential)paramObject).zzq)) && (TextUtils.equals(this.zzr, ((Credential)paramObject).zzr));
  }
  
  @Nullable
  public String getAccountType()
  {
    return this.zzr;
  }
  
  @Nullable
  public String getFamilyName()
  {
    return this.zzt;
  }
  
  @Nullable
  public String getGivenName()
  {
    return this.zzs;
  }
  
  @Nonnull
  public String getId()
  {
    return this.mId;
  }
  
  @Nonnull
  public List<IdToken> getIdTokens()
  {
    return this.zzp;
  }
  
  @Nullable
  public String getName()
  {
    return this.mName;
  }
  
  @Nullable
  public String getPassword()
  {
    return this.zzq;
  }
  
  @Nullable
  public Uri getProfilePictureUri()
  {
    return this.zzo;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { this.mId, this.mName, this.zzo, this.zzq, this.zzr });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, getId(), false);
    SafeParcelWriter.writeString(paramParcel, 2, getName(), false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, getProfilePictureUri(), paramInt, false);
    SafeParcelWriter.writeTypedList(paramParcel, 4, getIdTokens(), false);
    SafeParcelWriter.writeString(paramParcel, 5, getPassword(), false);
    SafeParcelWriter.writeString(paramParcel, 6, getAccountType(), false);
    SafeParcelWriter.writeString(paramParcel, 9, getGivenName(), false);
    SafeParcelWriter.writeString(paramParcel, 10, getFamilyName(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public static class Builder
  {
    private final String mId;
    private String mName;
    private Uri zzo;
    private List<IdToken> zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private String zzt;
    
    public Builder(Credential paramCredential)
    {
      this.mId = Credential.zzc(paramCredential);
      this.mName = Credential.zzd(paramCredential);
      this.zzo = Credential.zze(paramCredential);
      this.zzp = Credential.zzf(paramCredential);
      this.zzq = Credential.zzg(paramCredential);
      this.zzr = Credential.zzh(paramCredential);
      this.zzs = Credential.zzi(paramCredential);
      this.zzt = Credential.zzj(paramCredential);
    }
    
    public Builder(String paramString)
    {
      this.mId = paramString;
    }
    
    public Credential build()
    {
      return new Credential(this.mId, this.mName, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt);
    }
    
    public Builder setAccountType(String paramString)
    {
      this.zzr = paramString;
      return this;
    }
    
    public Builder setName(String paramString)
    {
      this.mName = paramString;
      return this;
    }
    
    public Builder setPassword(String paramString)
    {
      this.zzq = paramString;
      return this;
    }
    
    public Builder setProfilePictureUri(Uri paramUri)
    {
      this.zzo = paramUri;
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/credentials/Credential.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
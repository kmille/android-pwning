package android.support.v4.provider;

import android.support.annotation.ArrayRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.util.Preconditions;
import android.util.Base64;
import java.util.List;

public final class FontRequest
{
  private final List<List<byte[]>> mCertificates;
  private final int mCertificatesArray;
  private final String mIdentifier;
  private final String mProviderAuthority;
  private final String mProviderPackage;
  private final String mQuery;
  
  public FontRequest(@NonNull String paramString1, @NonNull String paramString2, @NonNull String paramString3, @ArrayRes int paramInt)
  {
    this.mProviderAuthority = ((String)Preconditions.checkNotNull(paramString1));
    this.mProviderPackage = ((String)Preconditions.checkNotNull(paramString2));
    this.mQuery = ((String)Preconditions.checkNotNull(paramString3));
    this.mCertificates = null;
    boolean bool;
    if (paramInt != 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    this.mCertificatesArray = paramInt;
    paramString1 = new StringBuilder(this.mProviderAuthority);
    paramString1.append("-");
    paramString1.append(this.mProviderPackage);
    paramString1.append("-");
    paramString1.append(this.mQuery);
    this.mIdentifier = paramString1.toString();
  }
  
  public FontRequest(@NonNull String paramString1, @NonNull String paramString2, @NonNull String paramString3, @NonNull List<List<byte[]>> paramList)
  {
    this.mProviderAuthority = ((String)Preconditions.checkNotNull(paramString1));
    this.mProviderPackage = ((String)Preconditions.checkNotNull(paramString2));
    this.mQuery = ((String)Preconditions.checkNotNull(paramString3));
    this.mCertificates = ((List)Preconditions.checkNotNull(paramList));
    this.mCertificatesArray = 0;
    paramString1 = new StringBuilder(this.mProviderAuthority);
    paramString1.append("-");
    paramString1.append(this.mProviderPackage);
    paramString1.append("-");
    paramString1.append(this.mQuery);
    this.mIdentifier = paramString1.toString();
  }
  
  @Nullable
  public final List<List<byte[]>> getCertificates()
  {
    return this.mCertificates;
  }
  
  @ArrayRes
  public final int getCertificatesArrayResId()
  {
    return this.mCertificatesArray;
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public final String getIdentifier()
  {
    return this.mIdentifier;
  }
  
  @NonNull
  public final String getProviderAuthority()
  {
    return this.mProviderAuthority;
  }
  
  @NonNull
  public final String getProviderPackage()
  {
    return this.mProviderPackage;
  }
  
  @NonNull
  public final String getQuery()
  {
    return this.mQuery;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = new StringBuilder("FontRequest {mProviderAuthority: ");
    ((StringBuilder)localObject).append(this.mProviderAuthority);
    ((StringBuilder)localObject).append(", mProviderPackage: ");
    ((StringBuilder)localObject).append(this.mProviderPackage);
    ((StringBuilder)localObject).append(", mQuery: ");
    ((StringBuilder)localObject).append(this.mQuery);
    ((StringBuilder)localObject).append(", mCertificates:");
    localStringBuilder.append(((StringBuilder)localObject).toString());
    int i = 0;
    while (i < this.mCertificates.size())
    {
      localStringBuilder.append(" [");
      localObject = (List)this.mCertificates.get(i);
      int j = 0;
      while (j < ((List)localObject).size())
      {
        localStringBuilder.append(" \"");
        localStringBuilder.append(Base64.encodeToString((byte[])((List)localObject).get(j), 0));
        localStringBuilder.append("\"");
        j += 1;
      }
      localStringBuilder.append(" ]");
      i += 1;
    }
    localStringBuilder.append("}");
    localObject = new StringBuilder("mCertificatesArray: ");
    ((StringBuilder)localObject).append(this.mCertificatesArray);
    localStringBuilder.append(((StringBuilder)localObject).toString());
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/provider/FontRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
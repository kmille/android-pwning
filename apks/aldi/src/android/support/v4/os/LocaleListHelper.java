package android.support.v4.os;

import android.os.Build.VERSION;
import android.support.annotation.GuardedBy;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.Size;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

@RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
final class LocaleListHelper
{
  private static final Locale EN_LATN;
  private static final Locale LOCALE_AR_XB;
  private static final Locale LOCALE_EN_XA;
  private static final int NUM_PSEUDO_LOCALES = 2;
  private static final String STRING_AR_XB = "ar-XB";
  private static final String STRING_EN_XA = "en-XA";
  @GuardedBy("sLock")
  private static LocaleListHelper sDefaultAdjustedLocaleList = null;
  @GuardedBy("sLock")
  private static LocaleListHelper sDefaultLocaleList;
  private static final Locale[] sEmptyList = new Locale[0];
  private static final LocaleListHelper sEmptyLocaleList = new LocaleListHelper(new Locale[0]);
  @GuardedBy("sLock")
  private static Locale sLastDefaultLocale = null;
  @GuardedBy("sLock")
  private static LocaleListHelper sLastExplicitlySetLocaleList;
  private static final Object sLock;
  private final Locale[] mList;
  @NonNull
  private final String mStringRepresentation;
  
  static
  {
    LOCALE_EN_XA = new Locale("en", "XA");
    LOCALE_AR_XB = new Locale("ar", "XB");
    EN_LATN = LocaleHelper.forLanguageTag("en-Latn");
    sLock = new Object();
    sLastExplicitlySetLocaleList = null;
    sDefaultLocaleList = null;
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  LocaleListHelper(@NonNull Locale paramLocale, LocaleListHelper paramLocaleListHelper)
  {
    if (paramLocale != null)
    {
      int m = 0;
      int j;
      if (paramLocaleListHelper == null) {
        j = 0;
      } else {
        j = paramLocaleListHelper.mList.length;
      }
      int i = 0;
      while (i < j)
      {
        if (paramLocale.equals(paramLocaleListHelper.mList[i])) {
          break label61;
        }
        i += 1;
      }
      i = -1;
      label61:
      if (i == -1) {
        k = 1;
      } else {
        k = 0;
      }
      int i1 = k + j;
      Locale[] arrayOfLocale = new Locale[i1];
      arrayOfLocale[0] = ((Locale)paramLocale.clone());
      if (i == -1) {
        for (i = 0; i < j; i = k)
        {
          k = i + 1;
          arrayOfLocale[k] = ((Locale)paramLocaleListHelper.mList[i].clone());
        }
      }
      int n;
      for (int k = 0; k < i; k = n)
      {
        n = k + 1;
        arrayOfLocale[n] = ((Locale)paramLocaleListHelper.mList[k].clone());
      }
      i += 1;
      while (i < j)
      {
        arrayOfLocale[i] = ((Locale)paramLocaleListHelper.mList[i].clone());
        i += 1;
      }
      paramLocale = new StringBuilder();
      i = m;
      while (i < i1)
      {
        paramLocale.append(LocaleHelper.toLanguageTag(arrayOfLocale[i]));
        if (i < i1 - 1) {
          paramLocale.append(',');
        }
        i += 1;
      }
      this.mList = arrayOfLocale;
      this.mStringRepresentation = paramLocale.toString();
      return;
    }
    throw new NullPointerException("topLocale is null");
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  LocaleListHelper(@NonNull Locale... paramVarArgs)
  {
    if (paramVarArgs.length == 0) {
      this.mList = sEmptyList;
    }
    StringBuilder localStringBuilder;
    for (paramVarArgs = "";; paramVarArgs = localStringBuilder.toString())
    {
      this.mStringRepresentation = paramVarArgs;
      return;
      Locale[] arrayOfLocale = new Locale[paramVarArgs.length];
      HashSet localHashSet = new HashSet();
      localStringBuilder = new StringBuilder();
      int i = 0;
      while (i < paramVarArgs.length)
      {
        Locale localLocale = paramVarArgs[i];
        if (localLocale != null)
        {
          if (!localHashSet.contains(localLocale))
          {
            localLocale = (Locale)localLocale.clone();
            arrayOfLocale[i] = localLocale;
            localStringBuilder.append(LocaleHelper.toLanguageTag(localLocale));
            if (i < paramVarArgs.length - 1) {
              localStringBuilder.append(',');
            }
            localHashSet.add(localLocale);
            i += 1;
          }
          else
          {
            paramVarArgs = new StringBuilder("list[");
            paramVarArgs.append(i);
            paramVarArgs.append("] is a repetition");
            throw new IllegalArgumentException(paramVarArgs.toString());
          }
        }
        else
        {
          paramVarArgs = new StringBuilder("list[");
          paramVarArgs.append(i);
          paramVarArgs.append("] is null");
          throw new NullPointerException(paramVarArgs.toString());
        }
      }
      this.mList = arrayOfLocale;
    }
  }
  
  private Locale computeFirstMatch(Collection<String> paramCollection, boolean paramBoolean)
  {
    int i = computeFirstMatchIndex(paramCollection, paramBoolean);
    if (i == -1) {
      return null;
    }
    return this.mList[i];
  }
  
  private int computeFirstMatchIndex(Collection<String> paramCollection, boolean paramBoolean)
  {
    if (this.mList.length == 1) {
      return 0;
    }
    if (this.mList.length == 0) {
      return -1;
    }
    int i;
    if (paramBoolean)
    {
      i = findFirstMatchIndex(EN_LATN);
      if (i == 0) {
        return 0;
      }
      if (i < Integer.MAX_VALUE) {}
    }
    else
    {
      i = Integer.MAX_VALUE;
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      int j = findFirstMatchIndex(LocaleHelper.forLanguageTag((String)paramCollection.next()));
      if (j == 0) {
        return 0;
      }
      if (j < i) {
        i = j;
      }
    }
    if (i == Integer.MAX_VALUE) {
      return 0;
    }
    return i;
  }
  
  private int findFirstMatchIndex(Locale paramLocale)
  {
    int i = 0;
    while (i < this.mList.length)
    {
      if (matchScore(paramLocale, this.mList[i]) > 0) {
        return i;
      }
      i += 1;
    }
    return Integer.MAX_VALUE;
  }
  
  @NonNull
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  static LocaleListHelper forLanguageTags(@Nullable String paramString)
  {
    if ((paramString != null) && (!paramString.isEmpty()))
    {
      paramString = paramString.split(",", -1);
      Locale[] arrayOfLocale = new Locale[paramString.length];
      int i = 0;
      while (i < arrayOfLocale.length)
      {
        arrayOfLocale[i] = LocaleHelper.forLanguageTag(paramString[i]);
        i += 1;
      }
      return new LocaleListHelper(arrayOfLocale);
    }
    return getEmptyLocaleList();
  }
  
  @NonNull
  @Size(min=1L)
  static LocaleListHelper getAdjustedDefault()
  {
    getDefault();
    synchronized (sLock)
    {
      LocaleListHelper localLocaleListHelper = sDefaultAdjustedLocaleList;
      return localLocaleListHelper;
    }
  }
  
  @NonNull
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  @Size(min=1L)
  static LocaleListHelper getDefault()
  {
    Object localObject2 = Locale.getDefault();
    synchronized (sLock)
    {
      if (!((Locale)localObject2).equals(sLastDefaultLocale))
      {
        sLastDefaultLocale = (Locale)localObject2;
        if ((sDefaultLocaleList != null) && (((Locale)localObject2).equals(sDefaultLocaleList.get(0))))
        {
          localObject2 = sDefaultLocaleList;
          return (LocaleListHelper)localObject2;
        }
        localObject2 = new LocaleListHelper((Locale)localObject2, sLastExplicitlySetLocaleList);
        sDefaultLocaleList = (LocaleListHelper)localObject2;
        sDefaultAdjustedLocaleList = (LocaleListHelper)localObject2;
      }
      localObject2 = sDefaultLocaleList;
      return (LocaleListHelper)localObject2;
    }
  }
  
  @NonNull
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  static LocaleListHelper getEmptyLocaleList()
  {
    return sEmptyLocaleList;
  }
  
  private static String getLikelyScript(Locale paramLocale)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramLocale = paramLocale.getScript();
      if (!paramLocale.isEmpty()) {
        return paramLocale;
      }
      return "";
    }
    return "";
  }
  
  private static boolean isPseudoLocale(String paramString)
  {
    return ("en-XA".equals(paramString)) || ("ar-XB".equals(paramString));
  }
  
  private static boolean isPseudoLocale(Locale paramLocale)
  {
    return (LOCALE_EN_XA.equals(paramLocale)) || (LOCALE_AR_XB.equals(paramLocale));
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  static boolean isPseudoLocalesOnly(@Nullable String[] paramArrayOfString)
  {
    if (paramArrayOfString == null) {
      return true;
    }
    if (paramArrayOfString.length > 3) {
      return false;
    }
    int j = paramArrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str = paramArrayOfString[i];
      if ((!str.isEmpty()) && (!isPseudoLocale(str))) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  @IntRange(from=0L, to=1L)
  private static int matchScore(Locale paramLocale1, Locale paramLocale2)
  {
    if (paramLocale1.equals(paramLocale2)) {
      return 1;
    }
    if (!paramLocale1.getLanguage().equals(paramLocale2.getLanguage())) {
      return 0;
    }
    if (!isPseudoLocale(paramLocale1))
    {
      if (isPseudoLocale(paramLocale2)) {
        return 0;
      }
      String str = getLikelyScript(paramLocale1);
      if (str.isEmpty())
      {
        paramLocale1 = paramLocale1.getCountry();
        if (!paramLocale1.isEmpty())
        {
          if (paramLocale1.equals(paramLocale2.getCountry())) {
            return 1;
          }
          return 0;
        }
        return 1;
      }
      if (str.equals(getLikelyScript(paramLocale2))) {
        return 1;
      }
    }
    return 0;
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  static void setDefault(@NonNull @Size(min=1L) LocaleListHelper paramLocaleListHelper)
  {
    setDefault(paramLocaleListHelper, 0);
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  static void setDefault(@NonNull @Size(min=1L) LocaleListHelper paramLocaleListHelper, int paramInt)
  {
    if (paramLocaleListHelper != null)
    {
      if (!paramLocaleListHelper.isEmpty()) {
        synchronized (sLock)
        {
          Locale localLocale = paramLocaleListHelper.get(paramInt);
          sLastDefaultLocale = localLocale;
          Locale.setDefault(localLocale);
          sLastExplicitlySetLocaleList = paramLocaleListHelper;
          sDefaultLocaleList = paramLocaleListHelper;
          if (paramInt == 0) {}
          for (paramLocaleListHelper = sDefaultLocaleList;; paramLocaleListHelper = new LocaleListHelper(sLastDefaultLocale, sDefaultLocaleList))
          {
            sDefaultAdjustedLocaleList = paramLocaleListHelper;
            break;
          }
          return;
        }
      }
      throw new IllegalArgumentException("locales is empty");
    }
    throw new NullPointerException("locales is null");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof LocaleListHelper)) {
      return false;
    }
    paramObject = ((LocaleListHelper)paramObject).mList;
    if (this.mList.length != paramObject.length) {
      return false;
    }
    int i = 0;
    while (i < this.mList.length)
    {
      if (!this.mList[i].equals(paramObject[i])) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  final Locale get(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.mList.length)) {
      return this.mList[paramInt];
    }
    return null;
  }
  
  @Nullable
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  final Locale getFirstMatch(String[] paramArrayOfString)
  {
    return computeFirstMatch(Arrays.asList(paramArrayOfString), false);
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  final int getFirstMatchIndex(String[] paramArrayOfString)
  {
    return computeFirstMatchIndex(Arrays.asList(paramArrayOfString), false);
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  final int getFirstMatchIndexWithEnglishSupported(Collection<String> paramCollection)
  {
    return computeFirstMatchIndex(paramCollection, true);
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  final int getFirstMatchIndexWithEnglishSupported(String[] paramArrayOfString)
  {
    return getFirstMatchIndexWithEnglishSupported(Arrays.asList(paramArrayOfString));
  }
  
  @Nullable
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  final Locale getFirstMatchWithEnglishSupported(String[] paramArrayOfString)
  {
    return computeFirstMatch(Arrays.asList(paramArrayOfString), true);
  }
  
  public final int hashCode()
  {
    int j = 1;
    int i = 0;
    while (i < this.mList.length)
    {
      j = j * 31 + this.mList[i].hashCode();
      i += 1;
    }
    return j;
  }
  
  @IntRange(from=-1L)
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  final int indexOf(Locale paramLocale)
  {
    int i = 0;
    while (i < this.mList.length)
    {
      if (this.mList[i].equals(paramLocale)) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  final boolean isEmpty()
  {
    return this.mList.length == 0;
  }
  
  @IntRange(from=0L)
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  final int size()
  {
    return this.mList.length;
  }
  
  @NonNull
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  final String toLanguageTags()
  {
    return this.mStringRepresentation;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    int i = 0;
    while (i < this.mList.length)
    {
      localStringBuilder.append(this.mList[i]);
      if (i < this.mList.length - 1) {
        localStringBuilder.append(',');
      }
      i += 1;
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/os/LocaleListHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
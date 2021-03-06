package android.support.v4.text;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.support.annotation.GuardedBy;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.UiThread;
import android.support.v4.os.TraceCompat;
import android.support.v4.util.ObjectsCompat;
import android.support.v4.util.Preconditions;
import android.text.Layout.Alignment;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText.Params.Builder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class PrecomputedTextCompat
  implements Spannable
{
  private static final char LINE_FEED = '\n';
  @GuardedBy("sLock")
  @NonNull
  private static Executor sExecutor = null;
  private static final Object sLock = new Object();
  @NonNull
  private final int[] mParagraphEnds;
  @NonNull
  private final Params mParams;
  @NonNull
  private final Spannable mText;
  @Nullable
  private final PrecomputedText mWrapped;
  
  @RequiresApi(28)
  private PrecomputedTextCompat(@NonNull PrecomputedText paramPrecomputedText, @NonNull Params paramParams)
  {
    this.mText = paramPrecomputedText;
    this.mParams = paramParams;
    this.mParagraphEnds = null;
    this.mWrapped = paramPrecomputedText;
  }
  
  private PrecomputedTextCompat(@NonNull CharSequence paramCharSequence, @NonNull Params paramParams, @NonNull int[] paramArrayOfInt)
  {
    this.mText = new SpannableString(paramCharSequence);
    this.mParams = paramParams;
    this.mParagraphEnds = paramArrayOfInt;
    this.mWrapped = null;
  }
  
  public static PrecomputedTextCompat create(@NonNull CharSequence paramCharSequence, @NonNull Params paramParams)
  {
    Preconditions.checkNotNull(paramCharSequence);
    Preconditions.checkNotNull(paramParams);
    for (;;)
    {
      int i;
      try
      {
        TraceCompat.beginSection("PrecomputedText");
        if ((Build.VERSION.SDK_INT >= 28) && (paramParams.mWrapped != null))
        {
          paramCharSequence = new PrecomputedTextCompat(PrecomputedText.create(paramCharSequence, paramParams.mWrapped), paramParams);
          return paramCharSequence;
        }
        ArrayList localArrayList = new ArrayList();
        int j = paramCharSequence.length();
        i = 0;
        if (i < j)
        {
          i = TextUtils.indexOf(paramCharSequence, '\n', i, j);
          if (i < 0)
          {
            i = j;
            localArrayList.add(Integer.valueOf(i));
          }
        }
        else
        {
          int[] arrayOfInt = new int[localArrayList.size()];
          i = 0;
          if (i < localArrayList.size())
          {
            arrayOfInt[i] = ((Integer)localArrayList.get(i)).intValue();
            i += 1;
            continue;
          }
          if (Build.VERSION.SDK_INT >= 23) {
            StaticLayout.Builder.obtain(paramCharSequence, 0, paramCharSequence.length(), paramParams.getTextPaint(), Integer.MAX_VALUE).setBreakStrategy(paramParams.getBreakStrategy()).setHyphenationFrequency(paramParams.getHyphenationFrequency()).setTextDirection(paramParams.getTextDirection()).build();
          } else if (Build.VERSION.SDK_INT >= 21) {
            new StaticLayout(paramCharSequence, paramParams.getTextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
          }
          paramCharSequence = new PrecomputedTextCompat(paramCharSequence, paramParams, arrayOfInt);
          return paramCharSequence;
        }
      }
      finally
      {
        TraceCompat.endSection();
      }
      i += 1;
    }
  }
  
  private int findParaIndex(@IntRange(from=0L) int paramInt)
  {
    int i = 0;
    while (i < this.mParagraphEnds.length)
    {
      if (paramInt < this.mParagraphEnds[i]) {
        return i;
      }
      i += 1;
    }
    StringBuilder localStringBuilder = new StringBuilder("pos must be less than ");
    localStringBuilder.append(this.mParagraphEnds[(this.mParagraphEnds.length - 1)]);
    localStringBuilder.append(", gave ");
    localStringBuilder.append(paramInt);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  @UiThread
  public static Future<PrecomputedTextCompat> getTextFuture(@NonNull CharSequence paramCharSequence, @NonNull Params paramParams, @Nullable Executor arg2)
  {
    paramParams = new PrecomputedTextFutureTask(paramParams, paramCharSequence);
    paramCharSequence = ???;
    if (??? == null) {
      synchronized (sLock)
      {
        if (sExecutor == null) {
          sExecutor = Executors.newFixedThreadPool(1);
        }
        paramCharSequence = sExecutor;
      }
    }
    paramCharSequence.execute(paramParams);
    return paramParams;
  }
  
  public char charAt(int paramInt)
  {
    return this.mText.charAt(paramInt);
  }
  
  @IntRange(from=0L)
  public int getParagraphCount()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return this.mWrapped.getParagraphCount();
    }
    return this.mParagraphEnds.length;
  }
  
  @IntRange(from=0L)
  public int getParagraphEnd(@IntRange(from=0L) int paramInt)
  {
    Preconditions.checkArgumentInRange(paramInt, 0, getParagraphCount(), "paraIndex");
    if (Build.VERSION.SDK_INT >= 28) {
      return this.mWrapped.getParagraphEnd(paramInt);
    }
    return this.mParagraphEnds[paramInt];
  }
  
  @IntRange(from=0L)
  public int getParagraphStart(@IntRange(from=0L) int paramInt)
  {
    Preconditions.checkArgumentInRange(paramInt, 0, getParagraphCount(), "paraIndex");
    if (Build.VERSION.SDK_INT >= 28) {
      return this.mWrapped.getParagraphStart(paramInt);
    }
    if (paramInt == 0) {
      return 0;
    }
    return this.mParagraphEnds[(paramInt - 1)];
  }
  
  @NonNull
  public Params getParams()
  {
    return this.mParams;
  }
  
  @Nullable
  @RequiresApi(28)
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public PrecomputedText getPrecomputedText()
  {
    if ((this.mText instanceof PrecomputedText)) {
      return (PrecomputedText)this.mText;
    }
    return null;
  }
  
  public int getSpanEnd(Object paramObject)
  {
    return this.mText.getSpanEnd(paramObject);
  }
  
  public int getSpanFlags(Object paramObject)
  {
    return this.mText.getSpanFlags(paramObject);
  }
  
  public int getSpanStart(Object paramObject)
  {
    return this.mText.getSpanStart(paramObject);
  }
  
  public <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return this.mWrapped.getSpans(paramInt1, paramInt2, paramClass);
    }
    return this.mText.getSpans(paramInt1, paramInt2, paramClass);
  }
  
  public int length()
  {
    return this.mText.length();
  }
  
  public int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    return this.mText.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }
  
  public void removeSpan(Object paramObject)
  {
    if (!(paramObject instanceof MetricAffectingSpan))
    {
      if (Build.VERSION.SDK_INT >= 28)
      {
        this.mWrapped.removeSpan(paramObject);
        return;
      }
      this.mText.removeSpan(paramObject);
      return;
    }
    throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
  }
  
  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!(paramObject instanceof MetricAffectingSpan))
    {
      if (Build.VERSION.SDK_INT >= 28)
      {
        this.mWrapped.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
        return;
      }
      this.mText.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
      return;
    }
    throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return this.mText.subSequence(paramInt1, paramInt2);
  }
  
  public String toString()
  {
    return this.mText.toString();
  }
  
  public static final class Params
  {
    private final int mBreakStrategy;
    private final int mHyphenationFrequency;
    @NonNull
    private final TextPaint mPaint;
    @Nullable
    private final TextDirectionHeuristic mTextDir;
    final PrecomputedText.Params mWrapped;
    
    @RequiresApi(28)
    public Params(@NonNull PrecomputedText.Params paramParams)
    {
      this.mPaint = paramParams.getTextPaint();
      this.mTextDir = paramParams.getTextDirection();
      this.mBreakStrategy = paramParams.getBreakStrategy();
      this.mHyphenationFrequency = paramParams.getHyphenationFrequency();
      this.mWrapped = paramParams;
    }
    
    Params(@NonNull TextPaint paramTextPaint, @NonNull TextDirectionHeuristic paramTextDirectionHeuristic, int paramInt1, int paramInt2)
    {
      if (Build.VERSION.SDK_INT >= 28) {}
      for (PrecomputedText.Params localParams = new PrecomputedText.Params.Builder(paramTextPaint).setBreakStrategy(paramInt1).setHyphenationFrequency(paramInt2).setTextDirection(paramTextDirectionHeuristic).build();; localParams = null)
      {
        this.mWrapped = localParams;
        break;
      }
      this.mPaint = paramTextPaint;
      this.mTextDir = paramTextDirectionHeuristic;
      this.mBreakStrategy = paramInt1;
      this.mHyphenationFrequency = paramInt2;
    }
    
    public final boolean equals(@Nullable Object paramObject)
    {
      if (paramObject == this) {
        return true;
      }
      if (paramObject != null)
      {
        if (!(paramObject instanceof Params)) {
          return false;
        }
        paramObject = (Params)paramObject;
        if (this.mWrapped != null) {
          return this.mWrapped.equals(((Params)paramObject).mWrapped);
        }
        if (Build.VERSION.SDK_INT >= 23)
        {
          if (this.mBreakStrategy != ((Params)paramObject).getBreakStrategy()) {
            return false;
          }
          if (this.mHyphenationFrequency != ((Params)paramObject).getHyphenationFrequency()) {
            return false;
          }
        }
        if ((Build.VERSION.SDK_INT >= 18) && (this.mTextDir != ((Params)paramObject).getTextDirection())) {
          return false;
        }
        if (this.mPaint.getTextSize() != ((Params)paramObject).getTextPaint().getTextSize()) {
          return false;
        }
        if (this.mPaint.getTextScaleX() != ((Params)paramObject).getTextPaint().getTextScaleX()) {
          return false;
        }
        if (this.mPaint.getTextSkewX() != ((Params)paramObject).getTextPaint().getTextSkewX()) {
          return false;
        }
        if (Build.VERSION.SDK_INT >= 21)
        {
          if (this.mPaint.getLetterSpacing() != ((Params)paramObject).getTextPaint().getLetterSpacing()) {
            return false;
          }
          if (!TextUtils.equals(this.mPaint.getFontFeatureSettings(), ((Params)paramObject).getTextPaint().getFontFeatureSettings())) {
            return false;
          }
        }
        if (this.mPaint.getFlags() != ((Params)paramObject).getTextPaint().getFlags()) {
          return false;
        }
        if (Build.VERSION.SDK_INT >= 24)
        {
          if (!this.mPaint.getTextLocales().equals(((Params)paramObject).getTextPaint().getTextLocales())) {
            return false;
          }
        }
        else if ((Build.VERSION.SDK_INT >= 17) && (!this.mPaint.getTextLocale().equals(((Params)paramObject).getTextPaint().getTextLocale()))) {
          return false;
        }
        if (this.mPaint.getTypeface() == null)
        {
          if (((Params)paramObject).getTextPaint().getTypeface() != null) {
            return false;
          }
        }
        else if (!this.mPaint.getTypeface().equals(((Params)paramObject).getTextPaint().getTypeface())) {
          return false;
        }
        return true;
      }
      return false;
    }
    
    @RequiresApi(23)
    public final int getBreakStrategy()
    {
      return this.mBreakStrategy;
    }
    
    @RequiresApi(23)
    public final int getHyphenationFrequency()
    {
      return this.mHyphenationFrequency;
    }
    
    @Nullable
    @RequiresApi(18)
    public final TextDirectionHeuristic getTextDirection()
    {
      return this.mTextDir;
    }
    
    @NonNull
    public final TextPaint getTextPaint()
    {
      return this.mPaint;
    }
    
    public final int hashCode()
    {
      Object[] arrayOfObject;
      if (Build.VERSION.SDK_INT >= 24)
      {
        arrayOfObject = new Object[11];
        arrayOfObject[0] = Float.valueOf(this.mPaint.getTextSize());
        arrayOfObject[1] = Float.valueOf(this.mPaint.getTextScaleX());
        arrayOfObject[2] = Float.valueOf(this.mPaint.getTextSkewX());
        arrayOfObject[3] = Float.valueOf(this.mPaint.getLetterSpacing());
        arrayOfObject[4] = Integer.valueOf(this.mPaint.getFlags());
        arrayOfObject[5] = this.mPaint.getTextLocales();
        arrayOfObject[6] = this.mPaint.getTypeface();
        arrayOfObject[7] = Boolean.valueOf(this.mPaint.isElegantTextHeight());
        arrayOfObject[8] = this.mTextDir;
        arrayOfObject[9] = Integer.valueOf(this.mBreakStrategy);
        arrayOfObject[10] = Integer.valueOf(this.mHyphenationFrequency);
      }
      for (;;)
      {
        return ObjectsCompat.hash(arrayOfObject);
        if (Build.VERSION.SDK_INT >= 21)
        {
          arrayOfObject = new Object[11];
          arrayOfObject[0] = Float.valueOf(this.mPaint.getTextSize());
          arrayOfObject[1] = Float.valueOf(this.mPaint.getTextScaleX());
          arrayOfObject[2] = Float.valueOf(this.mPaint.getTextSkewX());
          arrayOfObject[3] = Float.valueOf(this.mPaint.getLetterSpacing());
          arrayOfObject[4] = Integer.valueOf(this.mPaint.getFlags());
          arrayOfObject[5] = this.mPaint.getTextLocale();
          arrayOfObject[6] = this.mPaint.getTypeface();
          arrayOfObject[7] = Boolean.valueOf(this.mPaint.isElegantTextHeight());
          arrayOfObject[8] = this.mTextDir;
          arrayOfObject[9] = Integer.valueOf(this.mBreakStrategy);
          arrayOfObject[10] = Integer.valueOf(this.mHyphenationFrequency);
        }
        else if (Build.VERSION.SDK_INT >= 18)
        {
          arrayOfObject = new Object[9];
          arrayOfObject[0] = Float.valueOf(this.mPaint.getTextSize());
          arrayOfObject[1] = Float.valueOf(this.mPaint.getTextScaleX());
          arrayOfObject[2] = Float.valueOf(this.mPaint.getTextSkewX());
          arrayOfObject[3] = Integer.valueOf(this.mPaint.getFlags());
          arrayOfObject[4] = this.mPaint.getTextLocale();
          arrayOfObject[5] = this.mPaint.getTypeface();
          arrayOfObject[6] = this.mTextDir;
          arrayOfObject[7] = Integer.valueOf(this.mBreakStrategy);
          arrayOfObject[8] = Integer.valueOf(this.mHyphenationFrequency);
        }
        else if (Build.VERSION.SDK_INT >= 17)
        {
          arrayOfObject = new Object[9];
          arrayOfObject[0] = Float.valueOf(this.mPaint.getTextSize());
          arrayOfObject[1] = Float.valueOf(this.mPaint.getTextScaleX());
          arrayOfObject[2] = Float.valueOf(this.mPaint.getTextSkewX());
          arrayOfObject[3] = Integer.valueOf(this.mPaint.getFlags());
          arrayOfObject[4] = this.mPaint.getTextLocale();
          arrayOfObject[5] = this.mPaint.getTypeface();
          arrayOfObject[6] = this.mTextDir;
          arrayOfObject[7] = Integer.valueOf(this.mBreakStrategy);
          arrayOfObject[8] = Integer.valueOf(this.mHyphenationFrequency);
        }
        else
        {
          arrayOfObject = new Object[8];
          arrayOfObject[0] = Float.valueOf(this.mPaint.getTextSize());
          arrayOfObject[1] = Float.valueOf(this.mPaint.getTextScaleX());
          arrayOfObject[2] = Float.valueOf(this.mPaint.getTextSkewX());
          arrayOfObject[3] = Integer.valueOf(this.mPaint.getFlags());
          arrayOfObject[4] = this.mPaint.getTypeface();
          arrayOfObject[5] = this.mTextDir;
          arrayOfObject[6] = Integer.valueOf(this.mBreakStrategy);
          arrayOfObject[7] = Integer.valueOf(this.mHyphenationFrequency);
        }
      }
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder2 = new StringBuilder("{");
      StringBuilder localStringBuilder1 = new StringBuilder("textSize=");
      localStringBuilder1.append(this.mPaint.getTextSize());
      localStringBuilder2.append(localStringBuilder1.toString());
      localStringBuilder1 = new StringBuilder(", textScaleX=");
      localStringBuilder1.append(this.mPaint.getTextScaleX());
      localStringBuilder2.append(localStringBuilder1.toString());
      localStringBuilder1 = new StringBuilder(", textSkewX=");
      localStringBuilder1.append(this.mPaint.getTextSkewX());
      localStringBuilder2.append(localStringBuilder1.toString());
      if (Build.VERSION.SDK_INT >= 21)
      {
        localStringBuilder1 = new StringBuilder(", letterSpacing=");
        localStringBuilder1.append(this.mPaint.getLetterSpacing());
        localStringBuilder2.append(localStringBuilder1.toString());
        localStringBuilder1 = new StringBuilder(", elegantTextHeight=");
        localStringBuilder1.append(this.mPaint.isElegantTextHeight());
        localStringBuilder2.append(localStringBuilder1.toString());
      }
      if (Build.VERSION.SDK_INT >= 24) {
        localStringBuilder1 = new StringBuilder(", textLocale=");
      }
      for (Object localObject = this.mPaint.getTextLocales();; localObject = this.mPaint.getTextLocale())
      {
        localStringBuilder1.append(localObject);
        localStringBuilder2.append(localStringBuilder1.toString());
        break;
        if (Build.VERSION.SDK_INT < 17) {
          break;
        }
        localStringBuilder1 = new StringBuilder(", textLocale=");
      }
      localStringBuilder1 = new StringBuilder(", typeface=");
      localStringBuilder1.append(this.mPaint.getTypeface());
      localStringBuilder2.append(localStringBuilder1.toString());
      if (Build.VERSION.SDK_INT >= 26)
      {
        localStringBuilder1 = new StringBuilder(", variationSettings=");
        localStringBuilder1.append(this.mPaint.getFontVariationSettings());
        localStringBuilder2.append(localStringBuilder1.toString());
      }
      localStringBuilder1 = new StringBuilder(", textDir=");
      localStringBuilder1.append(this.mTextDir);
      localStringBuilder2.append(localStringBuilder1.toString());
      localStringBuilder1 = new StringBuilder(", breakStrategy=");
      localStringBuilder1.append(this.mBreakStrategy);
      localStringBuilder2.append(localStringBuilder1.toString());
      localStringBuilder1 = new StringBuilder(", hyphenationFrequency=");
      localStringBuilder1.append(this.mHyphenationFrequency);
      localStringBuilder2.append(localStringBuilder1.toString());
      localStringBuilder2.append("}");
      return localStringBuilder2.toString();
    }
    
    public static class Builder
    {
      private int mBreakStrategy;
      private int mHyphenationFrequency;
      @NonNull
      private final TextPaint mPaint;
      private TextDirectionHeuristic mTextDir;
      
      public Builder(@NonNull TextPaint paramTextPaint)
      {
        this.mPaint = paramTextPaint;
        if (Build.VERSION.SDK_INT >= 23)
        {
          this.mBreakStrategy = 1;
          this.mHyphenationFrequency = 1;
        }
        else
        {
          this.mHyphenationFrequency = 0;
          this.mBreakStrategy = 0;
        }
        if (Build.VERSION.SDK_INT >= 18) {}
        for (paramTextPaint = TextDirectionHeuristics.FIRSTSTRONG_LTR;; paramTextPaint = null)
        {
          this.mTextDir = paramTextPaint;
          return;
        }
      }
      
      @NonNull
      public PrecomputedTextCompat.Params build()
      {
        return new PrecomputedTextCompat.Params(this.mPaint, this.mTextDir, this.mBreakStrategy, this.mHyphenationFrequency);
      }
      
      @RequiresApi(23)
      public Builder setBreakStrategy(int paramInt)
      {
        this.mBreakStrategy = paramInt;
        return this;
      }
      
      @RequiresApi(23)
      public Builder setHyphenationFrequency(int paramInt)
      {
        this.mHyphenationFrequency = paramInt;
        return this;
      }
      
      @RequiresApi(18)
      public Builder setTextDirection(@NonNull TextDirectionHeuristic paramTextDirectionHeuristic)
      {
        this.mTextDir = paramTextDirectionHeuristic;
        return this;
      }
    }
  }
  
  static class PrecomputedTextFutureTask
    extends FutureTask<PrecomputedTextCompat>
  {
    PrecomputedTextFutureTask(@NonNull PrecomputedTextCompat.Params paramParams, @NonNull CharSequence paramCharSequence)
    {
      super();
    }
    
    static class PrecomputedTextCallback
      implements Callable<PrecomputedTextCompat>
    {
      private PrecomputedTextCompat.Params mParams;
      private CharSequence mText;
      
      PrecomputedTextCallback(@NonNull PrecomputedTextCompat.Params paramParams, @NonNull CharSequence paramCharSequence)
      {
        this.mParams = paramParams;
        this.mText = paramCharSequence;
      }
      
      public PrecomputedTextCompat call()
        throws Exception
      {
        return PrecomputedTextCompat.create(this.mText, this.mParams);
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/text/PrecomputedTextCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
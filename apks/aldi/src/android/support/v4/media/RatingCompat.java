package android.support.v4.media;

import android.media.Rating;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.RestrictTo;
import android.util.Log;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class RatingCompat
  implements Parcelable
{
  public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator()
  {
    public final RatingCompat createFromParcel(Parcel paramAnonymousParcel)
    {
      return new RatingCompat(paramAnonymousParcel.readInt(), paramAnonymousParcel.readFloat());
    }
    
    public final RatingCompat[] newArray(int paramAnonymousInt)
    {
      return new RatingCompat[paramAnonymousInt];
    }
  };
  public static final int RATING_3_STARS = 3;
  public static final int RATING_4_STARS = 4;
  public static final int RATING_5_STARS = 5;
  public static final int RATING_HEART = 1;
  public static final int RATING_NONE = 0;
  private static final float RATING_NOT_RATED = -1.0F;
  public static final int RATING_PERCENTAGE = 6;
  public static final int RATING_THUMB_UP_DOWN = 2;
  private static final String TAG = "Rating";
  private Object mRatingObj;
  private final int mRatingStyle;
  private final float mRatingValue;
  
  RatingCompat(int paramInt, float paramFloat)
  {
    this.mRatingStyle = paramInt;
    this.mRatingValue = paramFloat;
  }
  
  public static RatingCompat fromRating(Object paramObject)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramObject != null)
    {
      localObject1 = localObject2;
      if (Build.VERSION.SDK_INT >= 19)
      {
        localObject1 = (Rating)paramObject;
        int i = ((Rating)localObject1).getRatingStyle();
        if (((Rating)localObject1).isRated()) {
          switch (i)
          {
          default: 
            return null;
          case 6: 
            localObject1 = newPercentageRating(((Rating)localObject1).getPercentRating());
            break;
          case 3: 
          case 4: 
          case 5: 
            localObject1 = newStarRating(i, ((Rating)localObject1).getStarRating());
            break;
          case 2: 
            localObject1 = newThumbRating(((Rating)localObject1).isThumbUp());
            break;
          case 1: 
            localObject1 = newHeartRating(((Rating)localObject1).hasHeart());
            break;
          }
        } else {
          localObject1 = newUnratedRating(i);
        }
        ((RatingCompat)localObject1).mRatingObj = paramObject;
      }
    }
    return (RatingCompat)localObject1;
  }
  
  public static RatingCompat newHeartRating(boolean paramBoolean)
  {
    float f;
    if (paramBoolean) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    return new RatingCompat(1, f);
  }
  
  public static RatingCompat newPercentageRating(float paramFloat)
  {
    if ((paramFloat >= 0.0F) && (paramFloat <= 100.0F)) {
      return new RatingCompat(6, paramFloat);
    }
    Log.e("Rating", "Invalid percentage-based rating value");
    return null;
  }
  
  public static RatingCompat newStarRating(int paramInt, float paramFloat)
  {
    float f;
    switch (paramInt)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder("Invalid rating style (");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(") for a star rating");
      Log.e("Rating", localStringBuilder.toString());
      return null;
    case 5: 
      f = 5.0F;
      break;
    case 4: 
      f = 4.0F;
      break;
    case 3: 
      f = 3.0F;
    }
    if ((paramFloat >= 0.0F) && (paramFloat <= f)) {
      return new RatingCompat(paramInt, paramFloat);
    }
    Log.e("Rating", "Trying to set out of range star-based rating");
    return null;
  }
  
  public static RatingCompat newThumbRating(boolean paramBoolean)
  {
    float f;
    if (paramBoolean) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    return new RatingCompat(2, f);
  }
  
  public static RatingCompat newUnratedRating(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return new RatingCompat(paramInt, -1.0F);
  }
  
  public final int describeContents()
  {
    return this.mRatingStyle;
  }
  
  public final float getPercentRating()
  {
    if ((this.mRatingStyle == 6) && (isRated())) {
      return this.mRatingValue;
    }
    return -1.0F;
  }
  
  public final Object getRating()
  {
    if ((this.mRatingObj == null) && (Build.VERSION.SDK_INT >= 19))
    {
      Rating localRating;
      if (isRated()) {
        switch (this.mRatingStyle)
        {
        default: 
          return null;
        case 6: 
          localRating = Rating.newPercentageRating(getPercentRating());
          break;
        case 3: 
        case 4: 
        case 5: 
          localRating = Rating.newStarRating(this.mRatingStyle, getStarRating());
          break;
        case 2: 
          localRating = Rating.newThumbRating(isThumbUp());
          break;
        case 1: 
          localRating = Rating.newHeartRating(hasHeart());
          break;
        }
      } else {
        localRating = Rating.newUnratedRating(this.mRatingStyle);
      }
      this.mRatingObj = localRating;
    }
    return this.mRatingObj;
  }
  
  public final int getRatingStyle()
  {
    return this.mRatingStyle;
  }
  
  public final float getStarRating()
  {
    switch (this.mRatingStyle)
    {
    default: 
      break;
    case 3: 
    case 4: 
    case 5: 
      if (isRated()) {
        return this.mRatingValue;
      }
      break;
    }
    return -1.0F;
  }
  
  public final boolean hasHeart()
  {
    if (this.mRatingStyle != 1) {
      return false;
    }
    return this.mRatingValue == 1.0F;
  }
  
  public final boolean isRated()
  {
    return this.mRatingValue >= 0.0F;
  }
  
  public final boolean isThumbUp()
  {
    if (this.mRatingStyle != 2) {
      return false;
    }
    return this.mRatingValue == 1.0F;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Rating:style=");
    localStringBuilder.append(this.mRatingStyle);
    localStringBuilder.append(" rating=");
    String str;
    if (this.mRatingValue < 0.0F) {
      str = "unrated";
    } else {
      str = String.valueOf(this.mRatingValue);
    }
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.mRatingStyle);
    paramParcel.writeFloat(this.mRatingValue);
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static @interface StarStyle {}
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static @interface Style {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/media/RatingCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
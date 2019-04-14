package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.rating.IRatingView;
import de.eplus.mappecc.client.android.feature.rating.RatingActivity;
import de.eplus.mappecc.client.android.feature.rating.RatingPresenter;

@b.j(a={1, 1, 13}, b={"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b'\030\000 \0072\0020\001:\001\007B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H'¨\006\b"}, c={"Lde/eplus/mappecc/client/android/common/dependencyinjection/activity/RatingActivityModule;", "", "()V", "feedbackView", "Lde/eplus/mappecc/client/android/feature/rating/IRatingView;", "ratingActivity", "Lde/eplus/mappecc/client/android/feature/rating/RatingActivity;", "Companion", "app_alditalkRelease"})
@Module
public abstract class RatingActivityModule
{
  public static final Companion Companion = new Companion(null);
  
  @Binds
  public abstract IRatingView feedbackView(RatingActivity paramRatingActivity);
  
  @b.j(a={1, 1, 13}, b={"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\007¨\006\t"}, c={"Lde/eplus/mappecc/client/android/common/dependencyinjection/activity/RatingActivityModule$Companion;", "", "()V", "provideFeedbackActivityPresenter", "Lde/eplus/mappecc/client/android/feature/rating/RatingPresenter;", "ratingView", "Lde/eplus/mappecc/client/android/feature/rating/IRatingView;", "localizer", "Lde/eplus/mappecc/client/android/common/network/moe/core/Localizer;", "app_alditalkRelease"})
  public static final class Companion
  {
    @Provides
    public final RatingPresenter provideFeedbackActivityPresenter(IRatingView paramIRatingView, Localizer paramLocalizer)
    {
      b.f.b.j.b(paramIRatingView, "ratingView");
      b.f.b.j.b(paramLocalizer, "localizer");
      return new RatingPresenter(paramIRatingView, paramLocalizer);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/RatingActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
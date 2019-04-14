package de.eplus.mappecc.client.android.common.network.piranha;

import de.eplus.mappecc.client.android.feature.rating.rule.implementation.BackendCallSuccessfulRatingShowingRule;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

@b.j(a={1, 1, 13}, b={"\000.\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\026\030\0002\0020\001B\005¢\006\002\020\002J\b\020\003\032\004\030\0010\004J\022\020\005\032\0020\0062\b\020\007\032\004\030\0010\bH\004J\b\020\t\032\0020\006H\004J\030\020\n\032\0020\0062\006\020\013\032\0020\f2\006\020\r\032\0020\016H\026J\030\020\017\032\0020\0062\006\020\013\032\0020\f2\006\020\007\032\0020\bH\026¨\006\020"}, c={"Lde/eplus/mappecc/client/android/common/network/piranha/PiranhaCallback;", "Lokhttp3/Callback;", "()V", "getBackendCallSuccessfulRatingShowingRule", "Lde/eplus/mappecc/client/android/feature/rating/rule/implementation/BackendCallSuccessfulRatingShowingRule;", "onBackendCall", "", "response", "Lokhttp3/Response;", "onBackendCallFailure", "onFailure", "call", "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "app_alditalkRelease"})
public class PiranhaCallback
  implements Callback
{
  public final BackendCallSuccessfulRatingShowingRule getBackendCallSuccessfulRatingShowingRule()
  {
    try
    {
      BackendCallSuccessfulRatingShowingRule localBackendCallSuccessfulRatingShowingRule = new BackendCallSuccessfulRatingShowingRule();
      return localBackendCallSuccessfulRatingShowingRule;
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;) {}
    }
    return null;
  }
  
  protected final void onBackendCall(Response paramResponse)
  {
    if (paramResponse != null)
    {
      BackendCallSuccessfulRatingShowingRule localBackendCallSuccessfulRatingShowingRule = getBackendCallSuccessfulRatingShowingRule();
      if (localBackendCallSuccessfulRatingShowingRule != null) {
        localBackendCallSuccessfulRatingShowingRule.handleBackendStatusCode(paramResponse.code());
      }
      return;
    }
    onBackendCallFailure();
  }
  
  protected final void onBackendCallFailure()
  {
    BackendCallSuccessfulRatingShowingRule localBackendCallSuccessfulRatingShowingRule = getBackendCallSuccessfulRatingShowingRule();
    if (localBackendCallSuccessfulRatingShowingRule != null) {
      localBackendCallSuccessfulRatingShowingRule.onBackendCallFailure();
    }
  }
  
  public void onFailure(Call paramCall, IOException paramIOException)
  {
    b.f.b.j.b(paramCall, "call");
    b.f.b.j.b(paramIOException, "e");
    onBackendCallFailure();
  }
  
  public void onResponse(Call paramCall, Response paramResponse)
    throws IOException
  {
    b.f.b.j.b(paramCall, "call");
    b.f.b.j.b(paramResponse, "response");
    onBackendCall(paramResponse);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/PiranhaCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package de.eplus.mappecc.client.android.common.base;

import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.network.piranha.LoginManager;
import de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin.IHigherLoginManager;
import javax.inject.Provider;

public final class ReloginPresenter_Factory
  implements Factory<ReloginPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<IHigherLoginManager> higherLoginManagerProvider;
  private final Provider<LoginManager> loginManagerProvider;
  
  public ReloginPresenter_Factory(Provider<IB2pView> paramProvider, Provider<LoginManager> paramProvider1, Provider<IHigherLoginManager> paramProvider2)
  {
    this.b2pViewProvider = paramProvider;
    this.loginManagerProvider = paramProvider1;
    this.higherLoginManagerProvider = paramProvider2;
  }
  
  public static ReloginPresenter_Factory create(Provider<IB2pView> paramProvider, Provider<LoginManager> paramProvider1, Provider<IHigherLoginManager> paramProvider2)
  {
    return new ReloginPresenter_Factory(paramProvider, paramProvider1, paramProvider2);
  }
  
  public static ReloginPresenter newReloginPresenter(IB2pView paramIB2pView, LoginManager paramLoginManager, IHigherLoginManager paramIHigherLoginManager)
  {
    return new ReloginPresenter(paramIB2pView, paramLoginManager, paramIHigherLoginManager);
  }
  
  public static ReloginPresenter provideInstance(Provider<IB2pView> paramProvider, Provider<LoginManager> paramProvider1, Provider<IHigherLoginManager> paramProvider2)
  {
    return new ReloginPresenter((IB2pView)paramProvider.get(), (LoginManager)paramProvider1.get(), (IHigherLoginManager)paramProvider2.get());
  }
  
  public final ReloginPresenter get()
  {
    return provideInstance(this.b2pViewProvider, this.loginManagerProvider, this.higherLoginManagerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/base/ReloginPresenter_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
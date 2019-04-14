package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.TopUpByVoucherHelper;

public final class TopUpVoucherFragmentModule_ProvideTopUpByVoucherHelperFactory
  implements Factory<TopUpByVoucherHelper>
{
  private static final TopUpVoucherFragmentModule_ProvideTopUpByVoucherHelperFactory INSTANCE = new TopUpVoucherFragmentModule_ProvideTopUpByVoucherHelperFactory();
  
  public static TopUpVoucherFragmentModule_ProvideTopUpByVoucherHelperFactory create()
  {
    return INSTANCE;
  }
  
  public static TopUpByVoucherHelper provideInstance()
  {
    return proxyProvideTopUpByVoucherHelper();
  }
  
  public static TopUpByVoucherHelper proxyProvideTopUpByVoucherHelper()
  {
    return (TopUpByVoucherHelper)Preconditions.checkNotNull(TopUpVoucherFragmentModule.provideTopUpByVoucherHelper(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final TopUpByVoucherHelper get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/TopUpVoucherFragmentModule_ProvideTopUpByVoucherHelperFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
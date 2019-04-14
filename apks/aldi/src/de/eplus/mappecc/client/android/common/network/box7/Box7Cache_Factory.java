package de.eplus.mappecc.client.android.common.network.box7;

import dagger.internal.Factory;

public final class Box7Cache_Factory
  implements Factory<Box7Cache>
{
  private static final Box7Cache_Factory INSTANCE = new Box7Cache_Factory();
  
  public static Box7Cache_Factory create()
  {
    return INSTANCE;
  }
  
  public static Box7Cache newBox7Cache()
  {
    return new Box7Cache();
  }
  
  public static Box7Cache provideInstance()
  {
    return new Box7Cache();
  }
  
  public final Box7Cache get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/Box7Cache_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
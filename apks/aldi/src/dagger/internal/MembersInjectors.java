package dagger.internal;

import dagger.MembersInjector;

public final class MembersInjectors
{
  public static <T> MembersInjector<T> noOp()
  {
    return NoOpMembersInjector.INSTANCE;
  }
  
  static enum NoOpMembersInjector
    implements MembersInjector<Object>
  {
    INSTANCE;
    
    private NoOpMembersInjector() {}
    
    public final void injectMembers(Object paramObject)
    {
      Preconditions.checkNotNull(paramObject, "Cannot inject members into a null reference");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/internal/MembersInjectors.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
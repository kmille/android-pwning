package dagger.android;

final class AutoAnnotation_ReleaseReferencesAtCreator_createReleaseReferencesAt
  implements ReleaseReferencesAt
{
  private final int value;
  
  AutoAnnotation_ReleaseReferencesAtCreator_createReleaseReferencesAt(int paramInt)
  {
    this.value = paramInt;
  }
  
  public final Class<? extends ReleaseReferencesAt> annotationType()
  {
    return ReleaseReferencesAt.class;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof ReleaseReferencesAt))
    {
      paramObject = (ReleaseReferencesAt)paramObject;
      if (this.value == ((ReleaseReferencesAt)paramObject).value()) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.value ^ 0x4F9C270F;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("@dagger.android.ReleaseReferencesAt(");
    localStringBuilder.append(this.value);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public final int value()
  {
    return this.value;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/AutoAnnotation_ReleaseReferencesAtCreator_createReleaseReferencesAt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
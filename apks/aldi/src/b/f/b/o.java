package b.f.b;

@b.j(a={1, 1, 13}, b={"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\036\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\007\030\0002\0020\001B\031\022\n\020\002\032\006\022\002\b\0030\003\022\006\020\004\032\0020\005¢\006\002\020\006J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\023H\026J\b\020\024\032\0020\005H\026R\030\020\002\032\006\022\002\b\0030\003X\004¢\006\b\n\000\032\004\b\007\020\bR\036\020\t\032\f\022\b\022\006\022\002\b\0030\0130\n8VX\004¢\006\006\032\004\b\f\020\rR\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\025"}, c={"Lkotlin/jvm/internal/PackageReference;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "moduleName", "", "(Ljava/lang/Class;Ljava/lang/String;)V", "getJClass", "()Ljava/lang/Class;", "members", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-stdlib"})
public final class o
  implements d
{
  private final Class<?> a;
  private final String b;
  
  public o(Class<?> paramClass, String paramString)
  {
    this.a = paramClass;
    this.b = paramString;
  }
  
  public final Class<?> a()
  {
    return this.a;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof o)) && (j.a(this.a, ((o)paramObject).a));
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a.toString());
    localStringBuilder.append(" (Kotlin reflection is not available)");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/f/b/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
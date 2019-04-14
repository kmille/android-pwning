package b.i.b.a.b;

import b.i.b.a.c.b.b;
import b.i.b.a.c.b.e;
import b.i.b.a.c.j.a.m;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020!\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026J\036\020\007\032\0020\0042\006\020\005\032\0020\b2\f\020\t\032\b\022\004\022\0020\0130\nH\026¨\006\f"}, c={"Lkotlin/reflect/jvm/internal/components/RuntimeErrorReporter;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter;", "()V", "reportCannotInferVisibility", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "reportIncompleteHierarchy", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "unresolvedSuperClasses", "", "", "descriptors.runtime"})
public final class h
  implements m
{
  public static final h a = new h();
  
  public final void a(b paramb)
  {
    b.f.b.j.b(paramb, "descriptor");
    throw ((Throwable)new IllegalStateException("Cannot infer visibility for ".concat(String.valueOf(paramb))));
  }
  
  public final void a(e parame, List<String> paramList)
  {
    b.f.b.j.b(parame, "descriptor");
    b.f.b.j.b(paramList, "unresolvedSuperClasses");
    StringBuilder localStringBuilder = new StringBuilder("Incomplete hierarchy for class ");
    localStringBuilder.append(parame.i());
    localStringBuilder.append(", unresolved classes ");
    localStringBuilder.append(paramList);
    throw ((Throwable)new IllegalStateException(localStringBuilder.toString()));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
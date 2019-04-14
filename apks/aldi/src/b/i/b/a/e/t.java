package b.i.b.a.e;

import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.az;
import b.i.b.a.c.d.a.e.r;
import b.i.b.a.c.d.a.n;
import java.lang.reflect.Modifier;

@b.j(a={1, 1, 13}, b={"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\024\020\002\032\0020\0038VX\004¢\006\006\032\004\b\002\020\004R\024\020\005\032\0020\0038VX\004¢\006\006\032\004\b\005\020\004R\024\020\006\032\0020\0038VX\004¢\006\006\032\004\b\006\020\004R\022\020\007\032\0020\bX¦\004¢\006\006\032\004\b\t\020\nR\024\020\013\032\0020\f8VX\004¢\006\006\032\004\b\r\020\016¨\006\017"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaModifierListOwner;", "isAbstract", "", "()Z", "isFinal", "isStatic", "modifiers", "", "getModifiers", "()I", "visibility", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "getVisibility", "()Lorg/jetbrains/kotlin/descriptors/Visibility;", "descriptors.runtime"})
public abstract interface t
  extends r
{
  public abstract int s();
  
  @b.j(a={1, 1, 13})
  public static final class a
  {
    public static boolean a(t paramt)
    {
      return Modifier.isAbstract(paramt.s());
    }
    
    public static boolean b(t paramt)
    {
      return Modifier.isStatic(paramt.s());
    }
    
    public static boolean c(t paramt)
    {
      return Modifier.isFinal(paramt.s());
    }
    
    public static az d(t paramt)
    {
      int i = paramt.s();
      az localaz;
      if (Modifier.isPublic(i))
      {
        localaz = ay.e;
        paramt = "Visibilities.PUBLIC";
      }
      for (;;)
      {
        b.f.b.j.a(localaz, paramt);
        return localaz;
        if (Modifier.isPrivate(i))
        {
          localaz = ay.a;
          paramt = "Visibilities.PRIVATE";
        }
        else if (Modifier.isProtected(i))
        {
          if (Modifier.isStatic(i)) {
            localaz = n.b;
          } else {
            localaz = n.c;
          }
          paramt = "if (Modifier.isStatic(mo…ies.PROTECTED_AND_PACKAGE";
        }
        else
        {
          localaz = n.a;
          paramt = "JavaVisibilities.PACKAGE_VISIBILITY";
        }
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
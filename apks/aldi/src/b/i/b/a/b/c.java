package b.i.b.a.b;

import b.i.b.a.c.d.a.e.g;
import b.i.b.a.c.d.a.e.t;
import b.i.b.a.c.f.a;
import b.i.b.a.c.f.b;
import b.i.b.a.e.u;
import b.k.l;
import java.util.Set;

@b.j(a={1, 1, 13}, b={"\0006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\"\n\002\020\016\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\022\020\005\032\004\030\0010\0062\006\020\007\032\0020\bH\026J\022\020\t\032\004\030\0010\n2\006\020\013\032\0020\fH\026J\030\020\r\032\n\022\004\022\0020\017\030\0010\0162\006\020\020\032\0020\fH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\021"}, c={"Lkotlin/reflect/jvm/internal/components/ReflectJavaClassFinder;", "Lkotlin/reflect/jvm/internal/impl/load/java/JavaClassFinder;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "findClass", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "findPackage", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaPackage;", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "knownClassNamesInPackage", "", "", "packageFqName", "descriptors.runtime"})
public final class c
  implements b.i.b.a.c.d.a.j
{
  private final ClassLoader a;
  
  public c(ClassLoader paramClassLoader)
  {
    this.a = paramClassLoader;
  }
  
  public final g a(a parama)
  {
    b.f.b.j.b(parama, "classId");
    b localb = parama.a;
    b.f.b.j.a(localb, "classId.packageFqName");
    parama = parama.b.b.a;
    b.f.b.j.a(parama, "classId.relativeClassName.asString()");
    parama = l.a(parama, '.', '$');
    if (!localb.b.a.isEmpty())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(localb.b.a);
      localStringBuilder.append(".");
      localStringBuilder.append(parama);
      parama = localStringBuilder.toString();
    }
    parama = d.a(this.a, parama);
    if (parama != null) {
      return (g)new b.i.b.a.e.j(parama);
    }
    return null;
  }
  
  public final t a(b paramb)
  {
    b.f.b.j.b(paramb, "fqName");
    return (t)new u(paramb);
  }
  
  public final Set<String> b(b paramb)
  {
    b.f.b.j.b(paramb, "packageFqName");
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
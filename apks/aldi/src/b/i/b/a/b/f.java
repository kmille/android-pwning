package b.i.b.a.b;

import b.i.b.a.c.d.a.e.g;
import b.i.b.a.c.d.b.m;
import b.i.b.a.c.d.b.n;
import b.i.b.a.c.f.a;
import b.i.b.a.c.f.b;
import b.i.b.a.c.f.c;
import b.k.l;

@b.j(a={1, 1, 13}, b={"\000>\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\022\020\005\032\004\030\0010\0062\006\020\007\032\0020\bH\026J\022\020\t\032\004\030\0010\n2\006\020\013\032\0020\fH\002J\022\020\t\032\004\030\0010\n2\006\020\r\032\0020\016H\026J\022\020\t\032\004\030\0010\n2\006\020\017\032\0020\020H\026J\022\020\021\032\004\030\0010\0062\006\020\017\032\0020\020H\026J\020\020\022\032\0020\0232\006\020\013\032\0020\bH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\024"}, c={"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClassFinder;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinClassFinder;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "findBuiltInsData", "Ljava/io/InputStream;", "packageFqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "findKotlinClass", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass;", "fqName", "", "javaClass", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "findMetadata", "hasMetadataPackage", "", "descriptors.runtime"})
public final class f
  implements m
{
  private final ClassLoader a;
  
  public f(ClassLoader paramClassLoader)
  {
    this.a = paramClassLoader;
  }
  
  private final n a(String paramString)
  {
    paramString = d.a(this.a, paramString);
    if (paramString != null)
    {
      e.a locala = e.c;
      paramString = e.a.a(paramString);
    }
    else
    {
      paramString = null;
    }
    return (n)paramString;
  }
  
  public final n a(g paramg)
  {
    b.f.b.j.b(paramg, "javaClass");
    paramg = paramg.b();
    if (paramg != null)
    {
      paramg = paramg.b.a;
      if (paramg != null) {
        return a(paramg);
      }
    }
    return null;
  }
  
  public final n a(a parama)
  {
    b.f.b.j.b(parama, "classId");
    String str = parama.b.b.a;
    b.f.b.j.a(str, "relativeClassName.asString()");
    str = l.a(str, '.', '$');
    Object localObject = parama.a;
    b.f.b.j.a(localObject, "packageFqName");
    if (((b)localObject).b.a.isEmpty())
    {
      parama = str;
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(parama.a);
      ((StringBuilder)localObject).append('.');
      ((StringBuilder)localObject).append(str);
      parama = ((StringBuilder)localObject).toString();
    }
    return a(parama);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
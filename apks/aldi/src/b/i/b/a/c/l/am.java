package b.i.b.a.c.l;

import b.f.b.j;

public final class am
{
  public static final boolean a(w paramw)
  {
    j.b(paramw, "receiver$0");
    az localaz = paramw.i();
    paramw = localaz;
    if (!(localaz instanceof f)) {
      paramw = null;
    }
    paramw = (f)paramw;
    if (paramw != null) {
      return paramw.o_();
    }
    return false;
  }
  
  public static final boolean a(w paramw1, w paramw2)
  {
    j.b(paramw1, "first");
    j.b(paramw2, "second");
    az localaz = paramw1.i();
    Object localObject = localaz;
    if (!(localaz instanceof ak)) {
      localObject = null;
    }
    localObject = (ak)localObject;
    boolean bool;
    if (localObject != null) {
      bool = ((ak)localObject).a(paramw2);
    } else {
      bool = false;
    }
    if (!bool)
    {
      localObject = paramw2.i();
      paramw2 = (w)localObject;
      if (!(localObject instanceof ak)) {
        paramw2 = null;
      }
      paramw2 = (ak)paramw2;
      if (paramw2 != null) {
        bool = paramw2.a(paramw1);
      } else {
        bool = false;
      }
      if (!bool) {
        return false;
      }
    }
    return true;
  }
  
  public static final f b(w paramw)
  {
    j.b(paramw, "receiver$0");
    az localaz = paramw.i();
    paramw = localaz;
    if (!(localaz instanceof f)) {
      paramw = null;
    }
    paramw = (f)paramw;
    if ((paramw != null) && (paramw.o_())) {
      return paramw;
    }
    return null;
  }
  
  public static final w c(w paramw)
  {
    j.b(paramw, "receiver$0");
    Object localObject2 = paramw.i();
    Object localObject1 = localObject2;
    if (!(localObject2 instanceof ak)) {
      localObject1 = null;
    }
    localObject2 = (ak)localObject1;
    localObject1 = paramw;
    if (localObject2 != null)
    {
      localObject1 = ((ak)localObject2).d();
      if (localObject1 == null) {
        return paramw;
      }
    }
    return (w)localObject1;
  }
  
  public static final w d(w paramw)
  {
    j.b(paramw, "receiver$0");
    Object localObject2 = paramw.i();
    Object localObject1 = localObject2;
    if (!(localObject2 instanceof ak)) {
      localObject1 = null;
    }
    localObject2 = (ak)localObject1;
    localObject1 = paramw;
    if (localObject2 != null)
    {
      localObject1 = ((ak)localObject2).e();
      if (localObject1 == null) {
        return paramw;
      }
    }
    return (w)localObject1;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
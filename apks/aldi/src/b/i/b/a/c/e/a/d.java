package b.i.b.a.c.e.a;

import b.i.b.a.c.e.a.w;
import b.i.b.a.c.e.a.w.b;
import b.i.b.a.c.e.a.w.b.b;
import b.i.b.a.c.e.a.y;
import b.p;
import java.util.LinkedList;
import java.util.List;

public final class d
  implements c
{
  private final a.y a;
  private final a.w b;
  
  public d(a.y paramy, a.w paramw)
  {
    this.a = paramy;
    this.b = paramw;
  }
  
  private final p<List<String>, List<String>, Boolean> d(int paramInt)
  {
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    boolean bool = false;
    while (paramInt != -1)
    {
      a.w.b localb = this.b.a(paramInt);
      Object localObject = this.a;
      b.f.b.j.a(localb, "proto");
      localObject = ((a.y)localObject).a(localb.c);
      a.w.b.b localb1 = localb.d;
      if (localb1 == null) {
        b.f.b.j.a();
      }
      switch (e.a[localb1.ordinal()])
      {
      default: 
        break;
      case 3: 
        localLinkedList2.addFirst(localObject);
        bool = true;
        break;
      case 2: 
        localLinkedList1.addFirst(localObject);
        break;
      case 1: 
        localLinkedList2.addFirst(localObject);
      }
      paramInt = localb.b;
    }
    return new p(localLinkedList1, localLinkedList2, Boolean.valueOf(bool));
  }
  
  public final String a(int paramInt)
  {
    String str = this.a.a(paramInt);
    b.f.b.j.a(str, "strings.getString(index)");
    return str;
  }
  
  public final String b(int paramInt)
  {
    Object localObject = d(paramInt);
    List localList = (List)((p)localObject).a;
    localObject = b.a.j.a((Iterable)((p)localObject).b, (CharSequence)".", null, null, 0, null, null, 62);
    if (localList.isEmpty()) {
      return (String)localObject;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b.a.j.a((Iterable)localList, (CharSequence)"/", null, null, 0, null, null, 62));
    localStringBuilder.append('/');
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
  
  public final boolean c(int paramInt)
  {
    return ((Boolean)d(paramInt).c).booleanValue();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
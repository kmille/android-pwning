package b.a;

import b.j;
import java.util.Iterator;

@j(a={1, 1, 13}, b={"\000\034\n\002\030\002\n\000\n\002\020\034\n\002\030\002\n\000\n\002\030\002\n\002\020(\n\002\b\003\b\000\030\000*\006\b\000\020\001 \0012\016\022\n\022\b\022\004\022\002H\0010\0030\002B\031\022\022\020\004\032\016\022\n\022\b\022\004\022\0028\0000\0060\005¢\006\002\020\007J\025\020\b\032\016\022\n\022\b\022\004\022\0028\0000\0030\006H\002R\032\020\004\032\016\022\n\022\b\022\004\022\0028\0000\0060\005X\004¢\006\002\n\000¨\006\t"}, c={"Lkotlin/collections/IndexingIterable;", "T", "", "Lkotlin/collections/IndexedValue;", "iteratorFactory", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "iterator", "kotlin-stdlib"})
public final class z<T>
  implements b.f.b.a.a, Iterable<y<? extends T>>
{
  private final b.f.a.a<Iterator<T>> a;
  
  public z(b.f.a.a<? extends Iterator<? extends T>> parama)
  {
    this.a = parama;
  }
  
  public final Iterator<y<T>> iterator()
  {
    return (Iterator)new aa((Iterator)this.a.b_());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
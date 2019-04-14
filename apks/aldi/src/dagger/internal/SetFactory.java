package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

public final class SetFactory<T>
  implements Factory<Set<T>>
{
  private static final Factory<Set<Object>> EMPTY_FACTORY = InstanceFactory.create(Collections.emptySet());
  private final List<Provider<Collection<T>>> collectionProviders;
  private final List<Provider<T>> individualProviders;
  
  private SetFactory(List<Provider<T>> paramList, List<Provider<Collection<T>>> paramList1)
  {
    this.individualProviders = paramList;
    this.collectionProviders = paramList1;
  }
  
  public static <T> Builder<T> builder(int paramInt1, int paramInt2)
  {
    return new Builder(paramInt1, paramInt2, null);
  }
  
  public static <T> Factory<Set<T>> empty()
  {
    return EMPTY_FACTORY;
  }
  
  public final Set<T> get()
  {
    int j = this.individualProviders.size();
    ArrayList localArrayList = new ArrayList(this.collectionProviders.size());
    int m = this.collectionProviders.size();
    int k = 0;
    int i = 0;
    while (i < m)
    {
      localObject = (Collection)((Provider)this.collectionProviders.get(i)).get();
      j += ((Collection)localObject).size();
      localArrayList.add(localObject);
      i += 1;
    }
    Object localObject = DaggerCollections.newHashSetWithExpectedSize(j);
    j = this.individualProviders.size();
    i = 0;
    while (i < j)
    {
      ((Set)localObject).add(Preconditions.checkNotNull(((Provider)this.individualProviders.get(i)).get()));
      i += 1;
    }
    j = localArrayList.size();
    i = k;
    while (i < j)
    {
      Iterator localIterator = ((Collection)localArrayList.get(i)).iterator();
      while (localIterator.hasNext()) {
        ((Set)localObject).add(Preconditions.checkNotNull(localIterator.next()));
      }
      i += 1;
    }
    return Collections.unmodifiableSet((Set)localObject);
  }
  
  public static final class Builder<T>
  {
    private final List<Provider<Collection<T>>> collectionProviders;
    private final List<Provider<T>> individualProviders;
    
    private Builder(int paramInt1, int paramInt2)
    {
      this.individualProviders = DaggerCollections.presizedList(paramInt1);
      this.collectionProviders = DaggerCollections.presizedList(paramInt2);
    }
    
    public final Builder<T> addCollectionProvider(Provider<? extends Collection<? extends T>> paramProvider)
    {
      this.collectionProviders.add(paramProvider);
      return this;
    }
    
    public final Builder<T> addProvider(Provider<? extends T> paramProvider)
    {
      this.individualProviders.add(paramProvider);
      return this;
    }
    
    public final SetFactory<T> build()
    {
      return new SetFactory(this.individualProviders, this.collectionProviders, null);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/internal/SetFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
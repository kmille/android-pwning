package dagger.android;

import dagger.internal.DaggerCollections;
import dagger.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Provider;

public final class DispatchingAndroidInjector<T>
  implements AndroidInjector<T>
{
  private static final String NO_SUPERTYPES_BOUND_FORMAT = "No injector factory bound for Class<%s>";
  private static final String SUPERTYPES_BOUND_FORMAT = "No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?";
  private final Map<String, Provider<AndroidInjector.Factory<? extends T>>> injectorFactories;
  
  @Inject
  DispatchingAndroidInjector(Map<Class<? extends T>, Provider<AndroidInjector.Factory<? extends T>>> paramMap, Map<String, Provider<AndroidInjector.Factory<? extends T>>> paramMap1)
  {
    this.injectorFactories = merge(paramMap, paramMap1);
  }
  
  private String errorMessageSuggestions(T paramT)
  {
    ArrayList localArrayList = new ArrayList();
    for (Class localClass = paramT.getClass(); localClass != null; localClass = localClass.getSuperclass()) {
      if (this.injectorFactories.containsKey(localClass.getCanonicalName())) {
        localArrayList.add(localClass.getCanonicalName());
      }
    }
    if (localArrayList.isEmpty()) {
      return String.format("No injector factory bound for Class<%s>", new Object[] { paramT.getClass().getCanonicalName() });
    }
    return String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", new Object[] { paramT.getClass().getCanonicalName(), localArrayList });
  }
  
  private static <C, V> Map<String, V> merge(Map<Class<? extends C>, V> paramMap, Map<String, V> paramMap1)
  {
    if (paramMap.isEmpty()) {
      return paramMap1;
    }
    LinkedHashMap localLinkedHashMap = DaggerCollections.newLinkedHashMapWithExpectedSize(paramMap.size() + paramMap1.size());
    localLinkedHashMap.putAll(paramMap1);
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      paramMap1 = (Map.Entry)paramMap.next();
      localLinkedHashMap.put(((Class)paramMap1.getKey()).getName(), paramMap1.getValue());
    }
    return Collections.unmodifiableMap(localLinkedHashMap);
  }
  
  public final void inject(T paramT)
  {
    if (maybeInject(paramT)) {
      return;
    }
    throw new IllegalArgumentException(errorMessageSuggestions(paramT));
  }
  
  public final boolean maybeInject(T paramT)
  {
    Object localObject = (Provider)this.injectorFactories.get(paramT.getClass().getName());
    if (localObject == null) {
      return false;
    }
    localObject = (AndroidInjector.Factory)((Provider)localObject).get();
    try
    {
      ((AndroidInjector)Preconditions.checkNotNull(((AndroidInjector.Factory)localObject).create(paramT), "%s.create(I) should not return null.", localObject.getClass())).inject(paramT);
      return true;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new InvalidInjectorBindingException(String.format("%s does not implement AndroidInjector.Factory<%s>", new Object[] { localObject.getClass().getCanonicalName(), paramT.getClass().getCanonicalName() }), localClassCastException);
    }
  }
  
  public static final class InvalidInjectorBindingException
    extends RuntimeException
  {
    InvalidInjectorBindingException(String paramString, ClassCastException paramClassCastException)
    {
      super(paramClassCastException);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/DispatchingAndroidInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
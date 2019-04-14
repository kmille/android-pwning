package com.google.common.base;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.Nullable;

public class Joiner
{
  private final String a;
  
  private Joiner(String paramString)
  {
    this.a = ((String)j.a(paramString));
  }
  
  private static CharSequence a(Object paramObject)
  {
    j.a(paramObject);
    if ((paramObject instanceof CharSequence)) {
      return (CharSequence)paramObject;
    }
    return paramObject.toString();
  }
  
  private StringBuilder a(StringBuilder paramStringBuilder, Iterator<?> paramIterator)
  {
    try
    {
      j.a(paramStringBuilder);
      if (paramIterator.hasNext()) {
        for (CharSequence localCharSequence = a(paramIterator.next());; localCharSequence = a(paramIterator.next()))
        {
          paramStringBuilder.append(localCharSequence);
          if (!paramIterator.hasNext()) {
            break;
          }
          paramStringBuilder.append(this.a);
        }
      }
      return paramStringBuilder;
    }
    catch (IOException paramStringBuilder)
    {
      throw new AssertionError(paramStringBuilder);
    }
  }
  
  public static Joiner on(String paramString)
  {
    return new Joiner(paramString);
  }
  
  public final String join(Iterable<?> paramIterable)
  {
    return join(paramIterable.iterator());
  }
  
  public final String join(@Nullable final Object paramObject1, @Nullable final Object paramObject2, Object... paramVarArgs)
  {
    j.a(paramVarArgs);
    join(new AbstractList()
    {
      public final Object get(int paramAnonymousInt)
      {
        switch (paramAnonymousInt)
        {
        default: 
          return this.a[(paramAnonymousInt - 2)];
        case 1: 
          return paramObject2;
        }
        return paramObject1;
      }
      
      public final int size()
      {
        return this.a.length + 2;
      }
    });
  }
  
  public final String join(Iterator<?> paramIterator)
  {
    return a(new StringBuilder(), paramIterator).toString();
  }
  
  public final String join(Object[] paramArrayOfObject)
  {
    return join(Arrays.asList(paramArrayOfObject));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/base/Joiner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.common.io;

import com.google.common.base.j;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public final class Resources
{
  public static b asByteSource(URL paramURL)
  {
    return new a(paramURL, (byte)0);
  }
  
  public static d asCharSource(URL paramURL, Charset paramCharset)
  {
    return asByteSource(paramURL).a(paramCharset);
  }
  
  public static void copy(URL paramURL, OutputStream paramOutputStream)
    throws IOException
  {
    asByteSource(paramURL).a(paramOutputStream);
  }
  
  public static URL getResource(Class<?> paramClass, String paramString)
  {
    URL localURL = paramClass.getResource(paramString);
    int i;
    if (localURL != null) {
      i = 1;
    } else {
      i = 0;
    }
    paramClass = paramClass.getName();
    if (i != 0) {
      return localURL;
    }
    throw new IllegalArgumentException(j.a("resource %s relative to %s not found.", new Object[] { paramString, paramClass }));
  }
  
  public static URL getResource(String paramString)
  {
    Object localObject = Thread.currentThread().getContextClassLoader();
    ClassLoader localClassLoader = Resources.class.getClassLoader();
    if (localObject == null) {
      localObject = j.a(localClassLoader);
    }
    localObject = ((ClassLoader)localObject).getResource(paramString);
    boolean bool;
    if (localObject != null) {
      bool = true;
    } else {
      bool = false;
    }
    j.a(bool, "resource %s not found.", paramString);
    return (URL)localObject;
  }
  
  public static <T> T readLines(URL paramURL, Charset paramCharset, i<T> parami)
    throws IOException
  {
    return (T)asCharSource(paramURL, paramCharset).a(parami);
  }
  
  public static List<String> readLines(URL paramURL, Charset paramCharset)
    throws IOException
  {
    (List)readLines(paramURL, paramCharset, new i()
    {
      final List<String> a = Lists.a();
      
      public final boolean a(String paramAnonymousString)
      {
        this.a.add(paramAnonymousString);
        return true;
      }
    });
  }
  
  public static byte[] toByteArray(URL paramURL)
    throws IOException
  {
    return asByteSource(paramURL).b();
  }
  
  public static String toString(URL paramURL, Charset paramCharset)
    throws IOException
  {
    return asCharSource(paramURL, paramCharset).b();
  }
  
  static final class a
    extends b
  {
    private final URL a;
    
    private a(URL paramURL)
    {
      this.a = ((URL)j.a(paramURL));
    }
    
    public final InputStream a()
      throws IOException
    {
      return this.a.openStream();
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("Resources.asByteSource(");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/io/Resources.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
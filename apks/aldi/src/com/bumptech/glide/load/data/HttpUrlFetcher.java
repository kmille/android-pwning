package com.bumptech.glide.load.data;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HttpUrlFetcher
  implements DataFetcher<InputStream>
{
  @VisibleForTesting
  static final HttpUrlConnectionFactory DEFAULT_CONNECTION_FACTORY = new DefaultHttpUrlConnectionFactory();
  private static final int INVALID_STATUS_CODE = -1;
  private static final int MAXIMUM_REDIRECTS = 5;
  private static final String TAG = "HttpUrlFetcher";
  private final HttpUrlConnectionFactory connectionFactory;
  private final GlideUrl glideUrl;
  private volatile boolean isCancelled;
  private InputStream stream;
  private final int timeout;
  private HttpURLConnection urlConnection;
  
  public HttpUrlFetcher(GlideUrl paramGlideUrl, int paramInt)
  {
    this(paramGlideUrl, paramInt, DEFAULT_CONNECTION_FACTORY);
  }
  
  @VisibleForTesting
  HttpUrlFetcher(GlideUrl paramGlideUrl, int paramInt, HttpUrlConnectionFactory paramHttpUrlConnectionFactory)
  {
    this.glideUrl = paramGlideUrl;
    this.timeout = paramInt;
    this.connectionFactory = paramHttpUrlConnectionFactory;
  }
  
  private InputStream getStreamForSuccessfulRequest(HttpURLConnection paramHttpURLConnection)
    throws IOException
  {
    int i;
    if (TextUtils.isEmpty(paramHttpURLConnection.getContentEncoding())) {
      i = paramHttpURLConnection.getContentLength();
    }
    for (paramHttpURLConnection = ContentLengthInputStream.obtain(paramHttpURLConnection.getInputStream(), i);; paramHttpURLConnection = paramHttpURLConnection.getInputStream())
    {
      this.stream = paramHttpURLConnection;
      break;
      if (Log.isLoggable("HttpUrlFetcher", 3)) {
        new StringBuilder("Got non empty content encoding: ").append(paramHttpURLConnection.getContentEncoding());
      }
    }
    return this.stream;
  }
  
  private static boolean isHttpOk(int paramInt)
  {
    return paramInt / 100 == 2;
  }
  
  private static boolean isHttpRedirect(int paramInt)
  {
    return paramInt / 100 == 3;
  }
  
  private InputStream loadDataWithRedirects(URL paramURL1, int paramInt, URL paramURL2, Map<String, String> paramMap)
    throws IOException
  {
    for (;;)
    {
      if ((paramInt >= 5) || (paramURL2 != null)) {}
      try
      {
        if (paramURL1.toURI().equals(paramURL2.toURI())) {
          throw new HttpException("In re-direct loop");
        }
      }
      catch (URISyntaxException paramURL2)
      {
        Object localObject;
        int i;
        for (;;) {}
      }
      this.urlConnection = this.connectionFactory.build(paramURL1);
      paramURL2 = paramMap.entrySet().iterator();
      while (paramURL2.hasNext())
      {
        localObject = (Map.Entry)paramURL2.next();
        this.urlConnection.addRequestProperty((String)((Map.Entry)localObject).getKey(), (String)((Map.Entry)localObject).getValue());
      }
      this.urlConnection.setConnectTimeout(this.timeout);
      this.urlConnection.setReadTimeout(this.timeout);
      this.urlConnection.setUseCaches(false);
      this.urlConnection.setDoInput(true);
      this.urlConnection.setInstanceFollowRedirects(false);
      this.urlConnection.connect();
      this.stream = this.urlConnection.getInputStream();
      if (this.isCancelled) {
        return null;
      }
      i = this.urlConnection.getResponseCode();
      if (isHttpOk(i)) {
        return getStreamForSuccessfulRequest(this.urlConnection);
      }
      if (!isHttpRedirect(i)) {
        break label274;
      }
      paramURL2 = this.urlConnection.getHeaderField("Location");
      if (TextUtils.isEmpty(paramURL2)) {
        break;
      }
      localObject = new URL(paramURL1, paramURL2);
      cleanup();
      paramInt += 1;
      paramURL2 = paramURL1;
      paramURL1 = (URL)localObject;
    }
    throw new HttpException("Received empty or null redirect url");
    label274:
    if (i == -1) {
      throw new HttpException(i);
    }
    throw new HttpException(this.urlConnection.getResponseMessage(), i);
    throw new HttpException("Too many (> 5) redirects!");
  }
  
  public void cancel()
  {
    this.isCancelled = true;
  }
  
  public void cleanup()
  {
    if (this.stream != null) {}
    try
    {
      this.stream.close();
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
    if (this.urlConnection != null) {
      this.urlConnection.disconnect();
    }
    this.urlConnection = null;
  }
  
  @NonNull
  public Class<InputStream> getDataClass()
  {
    return InputStream.class;
  }
  
  @NonNull
  public DataSource getDataSource()
  {
    return DataSource.REMOTE;
  }
  
  /* Error */
  public void loadData(@NonNull com.bumptech.glide.Priority paramPriority, @NonNull DataFetcher.DataCallback<? super InputStream> paramDataCallback)
  {
    // Byte code:
    //   0: invokestatic 257	com/bumptech/glide/util/LogTime:getLogTime	()J
    //   3: lstore_3
    //   4: aload_2
    //   5: aload_0
    //   6: aload_0
    //   7: getfield 50	com/bumptech/glide/load/data/HttpUrlFetcher:glideUrl	Lcom/bumptech/glide/load/model/GlideUrl;
    //   10: invokevirtual 263	com/bumptech/glide/load/model/GlideUrl:toURL	()Ljava/net/URL;
    //   13: iconst_0
    //   14: aconst_null
    //   15: aload_0
    //   16: getfield 50	com/bumptech/glide/load/data/HttpUrlFetcher:glideUrl	Lcom/bumptech/glide/load/model/GlideUrl;
    //   19: invokevirtual 267	com/bumptech/glide/load/model/GlideUrl:getHeaders	()Ljava/util/Map;
    //   22: invokespecial 269	com/bumptech/glide/load/data/HttpUrlFetcher:loadDataWithRedirects	(Ljava/net/URL;ILjava/net/URL;Ljava/util/Map;)Ljava/io/InputStream;
    //   25: invokeinterface 275 2 0
    //   30: ldc 25
    //   32: iconst_2
    //   33: invokestatic 93	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   36: ifeq +66 -> 102
    //   39: new 95	java/lang/StringBuilder
    //   42: dup
    //   43: ldc_w 277
    //   46: invokespecial 100	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   49: astore_1
    //   50: aload_1
    //   51: lload_3
    //   52: invokestatic 281	com/bumptech/glide/util/LogTime:getElapsedMillis	(J)D
    //   55: invokevirtual 284	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: return
    //   60: astore_1
    //   61: goto +42 -> 103
    //   64: astore_1
    //   65: ldc 25
    //   67: iconst_3
    //   68: invokestatic 93	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   71: pop
    //   72: aload_2
    //   73: aload_1
    //   74: invokeinterface 288 2 0
    //   79: ldc 25
    //   81: iconst_2
    //   82: invokestatic 93	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   85: ifeq +17 -> 102
    //   88: new 95	java/lang/StringBuilder
    //   91: dup
    //   92: ldc_w 277
    //   95: invokespecial 100	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   98: astore_1
    //   99: goto -49 -> 50
    //   102: return
    //   103: ldc 25
    //   105: iconst_2
    //   106: invokestatic 93	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   109: ifeq +21 -> 130
    //   112: new 95	java/lang/StringBuilder
    //   115: dup
    //   116: ldc_w 277
    //   119: invokespecial 100	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   122: lload_3
    //   123: invokestatic 281	com/bumptech/glide/util/LogTime:getElapsedMillis	(J)D
    //   126: invokevirtual 284	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload_1
    //   131: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	this	HttpUrlFetcher
    //   0	132	1	paramPriority	com.bumptech.glide.Priority
    //   0	132	2	paramDataCallback	DataFetcher.DataCallback<? super InputStream>
    //   3	120	3	l	long
    // Exception table:
    //   from	to	target	type
    //   4	30	60	finally
    //   65	79	60	finally
    //   4	30	64	java/io/IOException
  }
  
  static class DefaultHttpUrlConnectionFactory
    implements HttpUrlFetcher.HttpUrlConnectionFactory
  {
    public HttpURLConnection build(URL paramURL)
      throws IOException
    {
      return (HttpURLConnection)paramURL.openConnection();
    }
  }
  
  static abstract interface HttpUrlConnectionFactory
  {
    public abstract HttpURLConnection build(URL paramURL)
      throws IOException;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/data/HttpUrlFetcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
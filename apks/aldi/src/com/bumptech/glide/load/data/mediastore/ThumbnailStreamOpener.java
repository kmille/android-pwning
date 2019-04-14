package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

class ThumbnailStreamOpener
{
  private static final FileService DEFAULT_SERVICE = new FileService();
  private static final String TAG = "ThumbStreamOpener";
  private final ArrayPool byteArrayPool;
  private final ContentResolver contentResolver;
  private final List<ImageHeaderParser> parsers;
  private final ThumbnailQuery query;
  private final FileService service;
  
  ThumbnailStreamOpener(List<ImageHeaderParser> paramList, FileService paramFileService, ThumbnailQuery paramThumbnailQuery, ArrayPool paramArrayPool, ContentResolver paramContentResolver)
  {
    this.service = paramFileService;
    this.query = paramThumbnailQuery;
    this.byteArrayPool = paramArrayPool;
    this.contentResolver = paramContentResolver;
    this.parsers = paramList;
  }
  
  ThumbnailStreamOpener(List<ImageHeaderParser> paramList, ThumbnailQuery paramThumbnailQuery, ArrayPool paramArrayPool, ContentResolver paramContentResolver)
  {
    this(paramList, DEFAULT_SERVICE, paramThumbnailQuery, paramArrayPool, paramContentResolver);
  }
  
  @Nullable
  private String getPath(@NonNull Uri paramUri)
  {
    paramUri = this.query.query(paramUri);
    if (paramUri != null) {
      try
      {
        if (paramUri.moveToFirst())
        {
          String str = paramUri.getString(0);
          return str;
        }
      }
      finally
      {
        if (paramUri != null) {
          paramUri.close();
        }
      }
    }
    if (paramUri != null) {
      paramUri.close();
    }
    return null;
  }
  
  private boolean isValid(File paramFile)
  {
    return (this.service.exists(paramFile)) && (0L < this.service.length(paramFile));
  }
  
  /* Error */
  int getOrientation(Uri paramUri)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore_3
    //   5: aload_0
    //   6: getfield 40	com/bumptech/glide/load/data/mediastore/ThumbnailStreamOpener:contentResolver	Landroid/content/ContentResolver;
    //   9: aload_1
    //   10: invokevirtual 93	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   13: astore 4
    //   15: aload_0
    //   16: getfield 42	com/bumptech/glide/load/data/mediastore/ThumbnailStreamOpener:parsers	Ljava/util/List;
    //   19: aload 4
    //   21: aload_0
    //   22: getfield 38	com/bumptech/glide/load/data/mediastore/ThumbnailStreamOpener:byteArrayPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;
    //   25: invokestatic 98	com/bumptech/glide/load/ImageHeaderParserUtils:getOrientation	(Ljava/util/List;Ljava/io/InputStream;Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;)I
    //   28: istore_2
    //   29: aload 4
    //   31: ifnull +8 -> 39
    //   34: aload 4
    //   36: invokevirtual 101	java/io/InputStream:close	()V
    //   39: iload_2
    //   40: ireturn
    //   41: astore_1
    //   42: aload 4
    //   44: astore_3
    //   45: goto +51 -> 96
    //   48: goto +7 -> 55
    //   51: astore_1
    //   52: goto +44 -> 96
    //   55: aload 4
    //   57: astore_3
    //   58: ldc 10
    //   60: iconst_3
    //   61: invokestatic 107	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   64: ifeq +20 -> 84
    //   67: aload 4
    //   69: astore_3
    //   70: new 109	java/lang/StringBuilder
    //   73: dup
    //   74: ldc 111
    //   76: invokespecial 114	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   79: aload_1
    //   80: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload 4
    //   86: ifnull +8 -> 94
    //   89: aload 4
    //   91: invokevirtual 101	java/io/InputStream:close	()V
    //   94: iconst_m1
    //   95: ireturn
    //   96: aload_3
    //   97: ifnull +7 -> 104
    //   100: aload_3
    //   101: invokevirtual 101	java/io/InputStream:close	()V
    //   104: aload_1
    //   105: athrow
    //   106: astore_3
    //   107: aload 5
    //   109: astore 4
    //   111: goto -56 -> 55
    //   114: astore_3
    //   115: goto -67 -> 48
    //   118: astore_1
    //   119: iload_2
    //   120: ireturn
    //   121: astore_1
    //   122: goto -28 -> 94
    //   125: astore_3
    //   126: goto -22 -> 104
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	this	ThumbnailStreamOpener
    //   0	129	1	paramUri	Uri
    //   28	92	2	i	int
    //   4	97	3	localObject1	Object
    //   106	1	3	localIOException1	java.io.IOException
    //   114	1	3	localIOException2	java.io.IOException
    //   125	1	3	localIOException3	java.io.IOException
    //   13	97	4	localObject2	Object
    //   1	107	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   15	29	41	finally
    //   5	15	51	finally
    //   58	67	51	finally
    //   70	84	51	finally
    //   5	15	106	java/io/IOException
    //   5	15	106	java/lang/NullPointerException
    //   15	29	114	java/io/IOException
    //   15	29	114	java/lang/NullPointerException
    //   34	39	118	java/io/IOException
    //   89	94	121	java/io/IOException
    //   100	104	125	java/io/IOException
  }
  
  public InputStream open(Uri paramUri)
    throws FileNotFoundException
  {
    Object localObject = getPath(paramUri);
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      return null;
    }
    localObject = this.service.get((String)localObject);
    if (!isValid((File)localObject)) {
      return null;
    }
    localObject = Uri.fromFile((File)localObject);
    try
    {
      InputStream localInputStream = this.contentResolver.openInputStream((Uri)localObject);
      return localInputStream;
    }
    catch (NullPointerException localNullPointerException)
    {
      StringBuilder localStringBuilder = new StringBuilder("NPE opening uri: ");
      localStringBuilder.append(paramUri);
      localStringBuilder.append(" -> ");
      localStringBuilder.append(localObject);
      throw ((FileNotFoundException)new FileNotFoundException(localStringBuilder.toString()).initCause(localNullPointerException));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/data/mediastore/ThumbnailStreamOpener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class MultiDexExtractor
  implements Closeable
{
  private static final int BUFFER_SIZE = 16384;
  private static final String DEX_PREFIX = "classes";
  static final String DEX_SUFFIX = ".dex";
  private static final String EXTRACTED_NAME_EXT = ".classes";
  static final String EXTRACTED_SUFFIX = ".zip";
  private static final String KEY_CRC = "crc";
  private static final String KEY_DEX_CRC = "dex.crc.";
  private static final String KEY_DEX_NUMBER = "dex.number";
  private static final String KEY_DEX_TIME = "dex.time.";
  private static final String KEY_TIME_STAMP = "timestamp";
  private static final String LOCK_FILENAME = "MultiDex.lock";
  private static final int MAX_EXTRACT_ATTEMPTS = 3;
  private static final long NO_VALUE = -1L;
  private static final String PREFS_FILE = "multidex.version";
  private static final String TAG = "MultiDex";
  private final FileLock cacheLock;
  private final File dexDir;
  private final FileChannel lockChannel;
  private final RandomAccessFile lockRaf;
  private final File sourceApk;
  private final long sourceCrc;
  
  /* Error */
  MultiDexExtractor(File paramFile1, File paramFile2)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 78	java/lang/Object:<init>	()V
    //   4: new 80	java/lang/StringBuilder
    //   7: dup
    //   8: ldc 82
    //   10: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   13: astore_3
    //   14: aload_3
    //   15: aload_1
    //   16: invokevirtual 91	java/io/File:getPath	()Ljava/lang/String;
    //   19: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: pop
    //   23: aload_3
    //   24: ldc 97
    //   26: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: pop
    //   30: aload_3
    //   31: aload_2
    //   32: invokevirtual 91	java/io/File:getPath	()Ljava/lang/String;
    //   35: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: pop
    //   39: aload_3
    //   40: ldc 99
    //   42: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload_0
    //   47: aload_1
    //   48: putfield 101	android/support/multidex/MultiDexExtractor:sourceApk	Ljava/io/File;
    //   51: aload_0
    //   52: aload_2
    //   53: putfield 103	android/support/multidex/MultiDexExtractor:dexDir	Ljava/io/File;
    //   56: aload_0
    //   57: aload_1
    //   58: invokestatic 107	android/support/multidex/MultiDexExtractor:getZipCrc	(Ljava/io/File;)J
    //   61: putfield 109	android/support/multidex/MultiDexExtractor:sourceCrc	J
    //   64: new 87	java/io/File
    //   67: dup
    //   68: aload_2
    //   69: ldc 45
    //   71: invokespecial 112	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   74: astore_1
    //   75: aload_0
    //   76: new 114	java/io/RandomAccessFile
    //   79: dup
    //   80: aload_1
    //   81: ldc 116
    //   83: invokespecial 117	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   86: putfield 119	android/support/multidex/MultiDexExtractor:lockRaf	Ljava/io/RandomAccessFile;
    //   89: aload_0
    //   90: aload_0
    //   91: getfield 119	android/support/multidex/MultiDexExtractor:lockRaf	Ljava/io/RandomAccessFile;
    //   94: invokevirtual 123	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   97: putfield 125	android/support/multidex/MultiDexExtractor:lockChannel	Ljava/nio/channels/FileChannel;
    //   100: new 80	java/lang/StringBuilder
    //   103: dup
    //   104: ldc 127
    //   106: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   109: aload_1
    //   110: invokevirtual 91	java/io/File:getPath	()Ljava/lang/String;
    //   113: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload_0
    //   118: aload_0
    //   119: getfield 125	android/support/multidex/MultiDexExtractor:lockChannel	Ljava/nio/channels/FileChannel;
    //   122: invokevirtual 133	java/nio/channels/FileChannel:lock	()Ljava/nio/channels/FileLock;
    //   125: putfield 135	android/support/multidex/MultiDexExtractor:cacheLock	Ljava/nio/channels/FileLock;
    //   128: new 80	java/lang/StringBuilder
    //   131: dup
    //   132: invokespecial 136	java/lang/StringBuilder:<init>	()V
    //   135: astore_2
    //   136: aload_2
    //   137: aload_1
    //   138: invokevirtual 91	java/io/File:getPath	()Ljava/lang/String;
    //   141: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: aload_2
    //   146: ldc -118
    //   148: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: pop
    //   152: return
    //   153: astore_1
    //   154: aload_0
    //   155: getfield 125	android/support/multidex/MultiDexExtractor:lockChannel	Ljava/nio/channels/FileChannel;
    //   158: invokestatic 142	android/support/multidex/MultiDexExtractor:closeQuietly	(Ljava/io/Closeable;)V
    //   161: aload_1
    //   162: athrow
    //   163: astore_1
    //   164: aload_0
    //   165: getfield 119	android/support/multidex/MultiDexExtractor:lockRaf	Ljava/io/RandomAccessFile;
    //   168: invokestatic 142	android/support/multidex/MultiDexExtractor:closeQuietly	(Ljava/io/Closeable;)V
    //   171: aload_1
    //   172: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	MultiDexExtractor
    //   0	173	1	paramFile1	File
    //   0	173	2	paramFile2	File
    //   13	27	3	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   100	128	153	java/io/IOException
    //   100	128	153	java/lang/RuntimeException
    //   100	128	153	java/lang/Error
    //   89	100	163	java/io/IOException
    //   89	100	163	java/lang/RuntimeException
    //   89	100	163	java/lang/Error
    //   128	152	163	java/io/IOException
    //   128	152	163	java/lang/RuntimeException
    //   128	152	163	java/lang/Error
    //   154	163	163	java/io/IOException
    //   154	163	163	java/lang/RuntimeException
    //   154	163	163	java/lang/Error
  }
  
  private void clearDexDir()
  {
    File[] arrayOfFile = this.dexDir.listFiles(new FileFilter()
    {
      public boolean accept(File paramAnonymousFile)
      {
        return !paramAnonymousFile.getName().equals("MultiDex.lock");
      }
    });
    StringBuilder localStringBuilder;
    if (arrayOfFile == null)
    {
      localStringBuilder = new StringBuilder("Failed to list secondary dex dir content (");
      localStringBuilder.append(this.dexDir.getPath());
      localStringBuilder.append(").");
      return;
    }
    int j = arrayOfFile.length;
    int i = 0;
    while (i < j)
    {
      File localFile = arrayOfFile[i];
      localStringBuilder = new StringBuilder("Trying to delete old file ");
      localStringBuilder.append(localFile.getPath());
      localStringBuilder.append(" of size ");
      localStringBuilder.append(localFile.length());
      if (!localFile.delete()) {}
      for (localStringBuilder = new StringBuilder("Failed to delete old file ");; localStringBuilder = new StringBuilder("Deleted old file "))
      {
        localStringBuilder.append(localFile.getPath());
        break;
      }
      i += 1;
    }
  }
  
  private static void closeQuietly(Closeable paramCloseable)
  {
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  /* Error */
  private static void extract(java.util.zip.ZipFile paramZipFile, java.util.zip.ZipEntry paramZipEntry, File paramFile, String paramString)
    throws IOException, java.io.FileNotFoundException
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 188	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   5: astore_0
    //   6: ldc -66
    //   8: aload_3
    //   9: invokestatic 196	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   12: invokevirtual 200	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   15: ldc 27
    //   17: aload_2
    //   18: invokevirtual 204	java/io/File:getParentFile	()Ljava/io/File;
    //   21: invokestatic 208	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   24: astore_3
    //   25: new 80	java/lang/StringBuilder
    //   28: dup
    //   29: ldc -46
    //   31: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   34: aload_3
    //   35: invokevirtual 91	java/io/File:getPath	()Ljava/lang/String;
    //   38: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: new 212	java/util/zip/ZipOutputStream
    //   45: dup
    //   46: new 214	java/io/BufferedOutputStream
    //   49: dup
    //   50: new 216	java/io/FileOutputStream
    //   53: dup
    //   54: aload_3
    //   55: invokespecial 219	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   58: invokespecial 222	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   61: invokespecial 223	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   64: astore 6
    //   66: new 225	java/util/zip/ZipEntry
    //   69: dup
    //   70: ldc -29
    //   72: invokespecial 228	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
    //   75: astore 7
    //   77: aload 7
    //   79: aload_1
    //   80: invokevirtual 231	java/util/zip/ZipEntry:getTime	()J
    //   83: invokevirtual 235	java/util/zip/ZipEntry:setTime	(J)V
    //   86: aload 6
    //   88: aload 7
    //   90: invokevirtual 239	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
    //   93: sipush 16384
    //   96: newarray <illegal type>
    //   98: astore_1
    //   99: aload_0
    //   100: aload_1
    //   101: invokevirtual 245	java/io/InputStream:read	([B)I
    //   104: istore 4
    //   106: iload 4
    //   108: iconst_m1
    //   109: if_icmpeq +15 -> 124
    //   112: aload 6
    //   114: aload_1
    //   115: iconst_0
    //   116: iload 4
    //   118: invokevirtual 249	java/util/zip/ZipOutputStream:write	([BII)V
    //   121: goto -22 -> 99
    //   124: aload 6
    //   126: invokevirtual 252	java/util/zip/ZipOutputStream:closeEntry	()V
    //   129: aload 6
    //   131: invokevirtual 253	java/util/zip/ZipOutputStream:close	()V
    //   134: aload_3
    //   135: invokevirtual 256	java/io/File:setReadOnly	()Z
    //   138: ifeq +100 -> 238
    //   141: new 80	java/lang/StringBuilder
    //   144: dup
    //   145: ldc_w 258
    //   148: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   151: aload_2
    //   152: invokevirtual 91	java/io/File:getPath	()Ljava/lang/String;
    //   155: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: aload_3
    //   160: aload_2
    //   161: invokevirtual 262	java/io/File:renameTo	(Ljava/io/File;)Z
    //   164: istore 5
    //   166: iload 5
    //   168: ifeq +13 -> 181
    //   171: aload_0
    //   172: invokestatic 142	android/support/multidex/MultiDexExtractor:closeQuietly	(Ljava/io/Closeable;)V
    //   175: aload_3
    //   176: invokevirtual 171	java/io/File:delete	()Z
    //   179: pop
    //   180: return
    //   181: new 80	java/lang/StringBuilder
    //   184: dup
    //   185: ldc_w 264
    //   188: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   191: astore_1
    //   192: aload_1
    //   193: aload_3
    //   194: invokevirtual 267	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   197: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: pop
    //   201: aload_1
    //   202: ldc_w 269
    //   205: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: pop
    //   209: aload_1
    //   210: aload_2
    //   211: invokevirtual 267	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   214: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: aload_1
    //   219: ldc_w 271
    //   222: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: new 71	java/io/IOException
    //   229: dup
    //   230: aload_1
    //   231: invokevirtual 274	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   234: invokespecial 275	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   237: athrow
    //   238: new 80	java/lang/StringBuilder
    //   241: dup
    //   242: ldc_w 277
    //   245: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   248: astore_1
    //   249: aload_1
    //   250: aload_3
    //   251: invokevirtual 267	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   254: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: pop
    //   258: aload_1
    //   259: ldc_w 279
    //   262: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: pop
    //   266: aload_1
    //   267: aload_2
    //   268: invokevirtual 267	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   271: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: pop
    //   275: aload_1
    //   276: ldc_w 281
    //   279: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: pop
    //   283: new 71	java/io/IOException
    //   286: dup
    //   287: aload_1
    //   288: invokevirtual 274	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   291: invokespecial 275	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   294: athrow
    //   295: astore_1
    //   296: aload 6
    //   298: invokevirtual 253	java/util/zip/ZipOutputStream:close	()V
    //   301: aload_1
    //   302: athrow
    //   303: astore_1
    //   304: aload_0
    //   305: invokestatic 142	android/support/multidex/MultiDexExtractor:closeQuietly	(Ljava/io/Closeable;)V
    //   308: aload_3
    //   309: invokevirtual 171	java/io/File:delete	()Z
    //   312: pop
    //   313: aload_1
    //   314: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	315	0	paramZipFile	java.util.zip.ZipFile
    //   0	315	1	paramZipEntry	java.util.zip.ZipEntry
    //   0	315	2	paramFile	File
    //   0	315	3	paramString	String
    //   104	13	4	i	int
    //   164	3	5	bool	boolean
    //   64	233	6	localZipOutputStream	java.util.zip.ZipOutputStream
    //   75	14	7	localZipEntry	java.util.zip.ZipEntry
    // Exception table:
    //   from	to	target	type
    //   66	99	295	finally
    //   99	106	295	finally
    //   112	121	295	finally
    //   124	129	295	finally
    //   42	66	303	finally
    //   129	166	303	finally
    //   181	238	303	finally
    //   238	295	303	finally
    //   296	303	303	finally
  }
  
  private static SharedPreferences getMultiDexPreferences(Context paramContext)
  {
    int i;
    if (Build.VERSION.SDK_INT < 11) {
      i = 0;
    } else {
      i = 4;
    }
    return paramContext.getSharedPreferences("multidex.version", i);
  }
  
  private static long getTimeStamp(File paramFile)
  {
    long l2 = paramFile.lastModified();
    long l1 = l2;
    if (l2 == -1L) {
      l1 = l2 - 1L;
    }
    return l1;
  }
  
  private static long getZipCrc(File paramFile)
    throws IOException
  {
    long l2 = ZipUtil.getZipCrc(paramFile);
    long l1 = l2;
    if (l2 == -1L) {
      l1 = l2 - 1L;
    }
    return l1;
  }
  
  private static boolean isModified(Context paramContext, File paramFile, long paramLong, String paramString)
  {
    paramContext = getMultiDexPreferences(paramContext);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append("timestamp");
    if (paramContext.getLong(localStringBuilder.toString(), -1L) == getTimeStamp(paramFile))
    {
      paramFile = new StringBuilder();
      paramFile.append(paramString);
      paramFile.append("crc");
      if (paramContext.getLong(paramFile.toString(), -1L) == paramLong) {
        return false;
      }
    }
    return true;
  }
  
  private List<ExtractedDex> loadExistingExtractions(Context paramContext, String paramString)
    throws IOException
  {
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(this.sourceApk.getName());
    ((StringBuilder)localObject1).append(".classes");
    localObject1 = ((StringBuilder)localObject1).toString();
    paramContext = getMultiDexPreferences(paramContext);
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(paramString);
    ((StringBuilder)localObject2).append("dex.number");
    int j = paramContext.getInt(((StringBuilder)localObject2).toString(), 1);
    localObject2 = new ArrayList(j - 1);
    int i = 2;
    while (i <= j)
    {
      Object localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append((String)localObject1);
      ((StringBuilder)localObject3).append(i);
      ((StringBuilder)localObject3).append(".zip");
      localObject3 = ((StringBuilder)localObject3).toString();
      localObject3 = new ExtractedDex(this.dexDir, (String)localObject3);
      if (((ExtractedDex)localObject3).isFile())
      {
        ((ExtractedDex)localObject3).crc = getZipCrc((File)localObject3);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(paramString);
        localStringBuilder.append("dex.crc.");
        localStringBuilder.append(i);
        long l1 = paramContext.getLong(localStringBuilder.toString(), -1L);
        localStringBuilder = new StringBuilder();
        localStringBuilder.append(paramString);
        localStringBuilder.append("dex.time.");
        localStringBuilder.append(i);
        long l2 = paramContext.getLong(localStringBuilder.toString(), -1L);
        long l3 = ((ExtractedDex)localObject3).lastModified();
        if ((l2 == l3) && (l1 == ((ExtractedDex)localObject3).crc))
        {
          ((List)localObject2).add(localObject3);
          i += 1;
        }
        else
        {
          paramContext = new StringBuilder("Invalid extracted dex: ");
          paramContext.append(localObject3);
          paramContext.append(" (key \"");
          paramContext.append(paramString);
          paramContext.append("\"), expected modification time: ");
          paramContext.append(l2);
          paramContext.append(", modification time: ");
          paramContext.append(l3);
          paramContext.append(", expected crc: ");
          paramContext.append(l1);
          paramContext.append(", file crc: ");
          paramContext.append(((ExtractedDex)localObject3).crc);
          throw new IOException(paramContext.toString());
        }
      }
      else
      {
        paramContext = new StringBuilder("Missing extracted secondary dex file '");
        paramContext.append(((ExtractedDex)localObject3).getPath());
        paramContext.append("'");
        throw new IOException(paramContext.toString());
      }
    }
    return (List<ExtractedDex>)localObject2;
  }
  
  /* Error */
  private List<ExtractedDex> performExtractions()
    throws IOException
  {
    // Byte code:
    //   0: new 80	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 136	java/lang/StringBuilder:<init>	()V
    //   7: astore 6
    //   9: aload 6
    //   11: aload_0
    //   12: getfield 101	android/support/multidex/MultiDexExtractor:sourceApk	Ljava/io/File;
    //   15: invokevirtual 318	java/io/File:getName	()Ljava/lang/String;
    //   18: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: pop
    //   22: aload 6
    //   24: ldc 24
    //   26: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: pop
    //   30: aload 6
    //   32: invokevirtual 274	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: astore 9
    //   37: aload_0
    //   38: invokespecial 369	android/support/multidex/MultiDexExtractor:clearDexDir	()V
    //   41: new 324	java/util/ArrayList
    //   44: dup
    //   45: invokespecial 370	java/util/ArrayList:<init>	()V
    //   48: astore 8
    //   50: new 184	java/util/zip/ZipFile
    //   53: dup
    //   54: aload_0
    //   55: getfield 101	android/support/multidex/MultiDexExtractor:sourceApk	Ljava/io/File;
    //   58: invokespecial 371	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   61: astore 7
    //   63: iconst_2
    //   64: istore_2
    //   65: ldc_w 373
    //   68: astore 6
    //   70: aload 7
    //   72: aload 6
    //   74: invokevirtual 377	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   77: astore 10
    //   79: aload 10
    //   81: ifnull +418 -> 499
    //   84: new 80	java/lang/StringBuilder
    //   87: dup
    //   88: invokespecial 136	java/lang/StringBuilder:<init>	()V
    //   91: astore 6
    //   93: aload 6
    //   95: aload 9
    //   97: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload 6
    //   103: iload_2
    //   104: invokevirtual 330	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload 6
    //   110: ldc 27
    //   112: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload 6
    //   118: invokevirtual 274	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   121: astore 6
    //   123: new 10	android/support/multidex/MultiDexExtractor$ExtractedDex
    //   126: dup
    //   127: aload_0
    //   128: getfield 103	android/support/multidex/MultiDexExtractor:dexDir	Ljava/io/File;
    //   131: aload 6
    //   133: invokespecial 331	android/support/multidex/MultiDexExtractor$ExtractedDex:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   136: astore 11
    //   138: aload 8
    //   140: aload 11
    //   142: invokeinterface 343 2 0
    //   147: pop
    //   148: new 80	java/lang/StringBuilder
    //   151: dup
    //   152: ldc_w 379
    //   155: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   158: aload 11
    //   160: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: iconst_0
    //   165: istore 4
    //   167: iconst_0
    //   168: istore_3
    //   169: iload 4
    //   171: iconst_3
    //   172: if_icmpge +223 -> 395
    //   175: iload_3
    //   176: ifne +219 -> 395
    //   179: iload 4
    //   181: iconst_1
    //   182: iadd
    //   183: istore 5
    //   185: aload 7
    //   187: aload 10
    //   189: aload 11
    //   191: aload 9
    //   193: invokestatic 381	android/support/multidex/MultiDexExtractor:extract	(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;Ljava/lang/String;)V
    //   196: aload 11
    //   198: aload 11
    //   200: invokestatic 107	android/support/multidex/MultiDexExtractor:getZipCrc	(Ljava/io/File;)J
    //   203: putfield 336	android/support/multidex/MultiDexExtractor$ExtractedDex:crc	J
    //   206: iconst_1
    //   207: istore_1
    //   208: goto +24 -> 232
    //   211: new 80	java/lang/StringBuilder
    //   214: dup
    //   215: ldc_w 383
    //   218: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   221: aload 11
    //   223: invokevirtual 384	android/support/multidex/MultiDexExtractor$ExtractedDex:getAbsolutePath	()Ljava/lang/String;
    //   226: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: iconst_0
    //   231: istore_1
    //   232: new 80	java/lang/StringBuilder
    //   235: dup
    //   236: ldc_w 386
    //   239: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   242: astore 12
    //   244: iload_1
    //   245: ifeq +287 -> 532
    //   248: ldc_w 388
    //   251: astore 6
    //   253: goto +3 -> 256
    //   256: aload 12
    //   258: aload 6
    //   260: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: pop
    //   264: aload 12
    //   266: ldc_w 390
    //   269: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: pop
    //   273: aload 12
    //   275: aload 11
    //   277: invokevirtual 384	android/support/multidex/MultiDexExtractor$ExtractedDex:getAbsolutePath	()Ljava/lang/String;
    //   280: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: pop
    //   284: aload 12
    //   286: ldc_w 392
    //   289: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: pop
    //   293: aload 12
    //   295: aload 11
    //   297: invokevirtual 393	android/support/multidex/MultiDexExtractor$ExtractedDex:length	()J
    //   300: invokevirtual 167	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   303: pop
    //   304: aload 12
    //   306: ldc_w 395
    //   309: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: pop
    //   313: aload 12
    //   315: aload 11
    //   317: getfield 336	android/support/multidex/MultiDexExtractor$ExtractedDex:crc	J
    //   320: invokevirtual 167	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   323: pop
    //   324: iload 5
    //   326: istore 4
    //   328: iload_1
    //   329: istore_3
    //   330: iload_1
    //   331: ifne -162 -> 169
    //   334: aload 11
    //   336: invokevirtual 396	android/support/multidex/MultiDexExtractor$ExtractedDex:delete	()Z
    //   339: pop
    //   340: iload 5
    //   342: istore 4
    //   344: iload_1
    //   345: istore_3
    //   346: aload 11
    //   348: invokevirtual 399	android/support/multidex/MultiDexExtractor$ExtractedDex:exists	()Z
    //   351: ifeq -182 -> 169
    //   354: new 80	java/lang/StringBuilder
    //   357: dup
    //   358: ldc_w 401
    //   361: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   364: astore 6
    //   366: aload 6
    //   368: aload 11
    //   370: invokevirtual 361	android/support/multidex/MultiDexExtractor$ExtractedDex:getPath	()Ljava/lang/String;
    //   373: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   376: pop
    //   377: aload 6
    //   379: ldc_w 363
    //   382: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: pop
    //   386: iload 5
    //   388: istore 4
    //   390: iload_1
    //   391: istore_3
    //   392: goto -223 -> 169
    //   395: iload_3
    //   396: ifeq +43 -> 439
    //   399: iload_2
    //   400: iconst_1
    //   401: iadd
    //   402: istore_2
    //   403: new 80	java/lang/StringBuilder
    //   406: dup
    //   407: ldc 18
    //   409: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   412: astore 6
    //   414: aload 6
    //   416: iload_2
    //   417: invokevirtual 330	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   420: pop
    //   421: aload 6
    //   423: ldc 21
    //   425: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   428: pop
    //   429: aload 6
    //   431: invokevirtual 274	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   434: astore 6
    //   436: goto -366 -> 70
    //   439: new 80	java/lang/StringBuilder
    //   442: dup
    //   443: ldc_w 403
    //   446: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   449: astore 6
    //   451: aload 6
    //   453: aload 11
    //   455: invokevirtual 384	android/support/multidex/MultiDexExtractor$ExtractedDex:getAbsolutePath	()Ljava/lang/String;
    //   458: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   461: pop
    //   462: aload 6
    //   464: ldc_w 405
    //   467: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: pop
    //   471: aload 6
    //   473: iload_2
    //   474: invokevirtual 330	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   477: pop
    //   478: aload 6
    //   480: ldc 99
    //   482: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   485: pop
    //   486: new 71	java/io/IOException
    //   489: dup
    //   490: aload 6
    //   492: invokevirtual 274	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   495: invokespecial 275	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   498: athrow
    //   499: aload 7
    //   501: invokevirtual 406	java/util/zip/ZipFile:close	()V
    //   504: aload 8
    //   506: areturn
    //   507: astore 6
    //   509: aload 7
    //   511: invokevirtual 406	java/util/zip/ZipFile:close	()V
    //   514: aload 6
    //   516: athrow
    //   517: astore 6
    //   519: goto -308 -> 211
    //   522: astore 6
    //   524: aload 8
    //   526: areturn
    //   527: astore 7
    //   529: goto -15 -> 514
    //   532: ldc_w 408
    //   535: astore 6
    //   537: goto -281 -> 256
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	540	0	this	MultiDexExtractor
    //   207	184	1	i	int
    //   64	410	2	j	int
    //   168	228	3	k	int
    //   165	224	4	m	int
    //   183	204	5	n	int
    //   7	484	6	localObject1	Object
    //   507	8	6	localObject2	Object
    //   517	1	6	localIOException1	IOException
    //   522	1	6	localIOException2	IOException
    //   535	1	6	str1	String
    //   61	449	7	localZipFile	java.util.zip.ZipFile
    //   527	1	7	localIOException3	IOException
    //   48	477	8	localArrayList	ArrayList
    //   35	157	9	str2	String
    //   77	111	10	localZipEntry	java.util.zip.ZipEntry
    //   136	318	11	localExtractedDex	ExtractedDex
    //   242	72	12	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   70	79	507	finally
    //   84	164	507	finally
    //   185	196	507	finally
    //   196	206	507	finally
    //   211	230	507	finally
    //   232	244	507	finally
    //   256	324	507	finally
    //   334	340	507	finally
    //   346	386	507	finally
    //   403	436	507	finally
    //   439	499	507	finally
    //   196	206	517	java/io/IOException
    //   499	504	522	java/io/IOException
    //   509	514	527	java/io/IOException
  }
  
  private static void putStoredApkInfo(Context paramContext, String paramString, long paramLong1, long paramLong2, List<ExtractedDex> paramList)
  {
    paramContext = getMultiDexPreferences(paramContext).edit();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("timestamp");
    paramContext.putLong(((StringBuilder)localObject).toString(), paramLong1);
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("crc");
    paramContext.putLong(((StringBuilder)localObject).toString(), paramLong2);
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("dex.number");
    paramContext.putInt(((StringBuilder)localObject).toString(), paramList.size() + 1);
    paramList = paramList.iterator();
    int i = 2;
    while (paramList.hasNext())
    {
      localObject = (ExtractedDex)paramList.next();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append("dex.crc.");
      localStringBuilder.append(i);
      paramContext.putLong(localStringBuilder.toString(), ((ExtractedDex)localObject).crc);
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append("dex.time.");
      localStringBuilder.append(i);
      paramContext.putLong(localStringBuilder.toString(), ((ExtractedDex)localObject).lastModified());
      i += 1;
    }
    paramContext.commit();
  }
  
  public final void close()
    throws IOException
  {
    this.cacheLock.release();
    this.lockChannel.close();
    this.lockRaf.close();
  }
  
  final List<? extends File> load(Context paramContext, String paramString, boolean paramBoolean)
    throws IOException
  {
    Object localObject = new StringBuilder("MultiDexExtractor.load(");
    ((StringBuilder)localObject).append(this.sourceApk.getPath());
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramBoolean);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(")");
    if ((!this.cacheLock.isValid()) || ((!paramBoolean) && (!isModified(paramContext, this.sourceApk, this.sourceCrc, paramString)))) {}
    try
    {
      localObject = loadExistingExtractions(paramContext, paramString);
      paramContext = (Context)localObject;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
    localObject = performExtractions();
    putStoredApkInfo(paramContext, paramString, getTimeStamp(this.sourceApk), this.sourceCrc, (List)localObject);
    paramContext = (Context)localObject;
    paramString = new StringBuilder("load found ");
    paramString.append(paramContext.size());
    paramString.append(" secondary dex files");
    return paramContext;
    throw new IllegalStateException("MultiDexExtractor was closed");
  }
  
  static class ExtractedDex
    extends File
  {
    public long crc = -1L;
    
    public ExtractedDex(File paramFile, String paramString)
    {
      super(paramString);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/multidex/MultiDexExtractor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.bumptech.glide.disklrucache;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class DiskLruCache
  implements Closeable
{
  static final long ANY_SEQUENCE_NUMBER = -1L;
  private static final String CLEAN = "CLEAN";
  private static final String DIRTY = "DIRTY";
  static final String JOURNAL_FILE = "journal";
  static final String JOURNAL_FILE_BACKUP = "journal.bkp";
  static final String JOURNAL_FILE_TEMP = "journal.tmp";
  static final String MAGIC = "libcore.io.DiskLruCache";
  private static final String READ = "READ";
  private static final String REMOVE = "REMOVE";
  static final String VERSION_1 = "1";
  private final int appVersion;
  private final Callable<Void> cleanupCallable = new Callable()
  {
    public Void call()
      throws Exception
    {
      synchronized (DiskLruCache.this)
      {
        if (DiskLruCache.this.journalWriter == null) {
          return null;
        }
        DiskLruCache.this.trimToSize();
        if (DiskLruCache.this.journalRebuildRequired())
        {
          DiskLruCache.this.rebuildJournal();
          DiskLruCache.access$502(DiskLruCache.this, 0);
        }
        return null;
      }
    }
  };
  private final File directory;
  final ThreadPoolExecutor executorService = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DiskLruCacheThreadFactory(null));
  private final File journalFile;
  private final File journalFileBackup;
  private final File journalFileTmp;
  private Writer journalWriter;
  private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap(0, 0.75F, true);
  private long maxSize;
  private long nextSequenceNumber = 0L;
  private int redundantOpCount;
  private long size = 0L;
  private final int valueCount;
  
  private DiskLruCache(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    this.directory = paramFile;
    this.appVersion = paramInt1;
    this.journalFile = new File(paramFile, "journal");
    this.journalFileTmp = new File(paramFile, "journal.tmp");
    this.journalFileBackup = new File(paramFile, "journal.bkp");
    this.valueCount = paramInt2;
    this.maxSize = paramLong;
  }
  
  private void checkNotClosed()
  {
    if (this.journalWriter != null) {
      return;
    }
    throw new IllegalStateException("cache is closed");
  }
  
  private void completeEdit(Editor paramEditor, boolean paramBoolean)
    throws IOException
  {
    for (;;)
    {
      int j;
      try
      {
        Entry localEntry = paramEditor.entry;
        if (localEntry.currentEditor == paramEditor)
        {
          int k = 0;
          j = k;
          if (paramBoolean)
          {
            j = k;
            if (!localEntry.readable)
            {
              int i = 0;
              j = k;
              if (i < this.valueCount)
              {
                if (paramEditor.written[i] != 0)
                {
                  if (!localEntry.getDirtyFile(i).exists())
                  {
                    paramEditor.abort();
                    return;
                  }
                  i += 1;
                  continue;
                }
                paramEditor.abort();
                throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
              }
            }
          }
          long l1;
          if (j < this.valueCount)
          {
            paramEditor = localEntry.getDirtyFile(j);
            if (paramBoolean)
            {
              if (paramEditor.exists())
              {
                File localFile = localEntry.getCleanFile(j);
                paramEditor.renameTo(localFile);
                l1 = localEntry.lengths[j];
                long l2 = localFile.length();
                localEntry.lengths[j] = l2;
                this.size = (this.size - l1 + l2);
              }
            }
            else {
              deleteIfExists(paramEditor);
            }
          }
          else
          {
            this.redundantOpCount += 1;
            Entry.access$802(localEntry, null);
            if ((localEntry.readable | paramBoolean))
            {
              Entry.access$702(localEntry, true);
              this.journalWriter.append("CLEAN");
              this.journalWriter.append(' ');
              this.journalWriter.append(localEntry.key);
              this.journalWriter.append(localEntry.getLengths());
              this.journalWriter.append('\n');
              if (paramBoolean)
              {
                l1 = this.nextSequenceNumber;
                this.nextSequenceNumber = (1L + l1);
                Entry.access$1302(localEntry, l1);
              }
            }
            else
            {
              this.lruEntries.remove(localEntry.key);
              this.journalWriter.append("REMOVE");
              this.journalWriter.append(' ');
              this.journalWriter.append(localEntry.key);
              this.journalWriter.append('\n');
            }
            this.journalWriter.flush();
            if ((this.size > this.maxSize) || (journalRebuildRequired())) {
              this.executorService.submit(this.cleanupCallable);
            }
          }
        }
        else
        {
          throw new IllegalStateException();
        }
      }
      finally {}
      j += 1;
    }
  }
  
  private static void deleteIfExists(File paramFile)
    throws IOException
  {
    if (paramFile.exists())
    {
      if (paramFile.delete()) {
        return;
      }
      throw new IOException();
    }
  }
  
  private Editor edit(String paramString, long paramLong)
    throws IOException
  {
    try
    {
      checkNotClosed();
      Entry localEntry = (Entry)this.lruEntries.get(paramString);
      if (paramLong != -1L) {
        if (localEntry != null)
        {
          long l = localEntry.sequenceNumber;
          if (l == paramLong) {}
        }
        else
        {
          return null;
        }
      }
      if (localEntry == null)
      {
        localEntry = new Entry(paramString, null);
        this.lruEntries.put(paramString, localEntry);
      }
      else
      {
        localEditor = localEntry.currentEditor;
        if (localEditor != null) {
          return null;
        }
      }
      Editor localEditor = new Editor(localEntry, null);
      Entry.access$802(localEntry, localEditor);
      this.journalWriter.append("DIRTY");
      this.journalWriter.append(' ');
      this.journalWriter.append(paramString);
      this.journalWriter.append('\n');
      this.journalWriter.flush();
      return localEditor;
    }
    finally {}
  }
  
  private static String inputStreamToString(InputStream paramInputStream)
    throws IOException
  {
    return Util.readFully(new InputStreamReader(paramInputStream, Util.UTF_8));
  }
  
  private boolean journalRebuildRequired()
  {
    return (this.redundantOpCount >= 2000) && (this.redundantOpCount >= this.lruEntries.size());
  }
  
  public static DiskLruCache open(File paramFile, int paramInt1, int paramInt2, long paramLong)
    throws IOException
  {
    if (paramLong > 0L)
    {
      if (paramInt2 > 0)
      {
        Object localObject = new File(paramFile, "journal.bkp");
        if (((File)localObject).exists())
        {
          File localFile = new File(paramFile, "journal");
          if (localFile.exists()) {
            ((File)localObject).delete();
          } else {
            renameTo((File)localObject, localFile, false);
          }
        }
        localObject = new DiskLruCache(paramFile, paramInt1, paramInt2, paramLong);
        if (((DiskLruCache)localObject).journalFile.exists()) {
          try
          {
            ((DiskLruCache)localObject).readJournal();
            ((DiskLruCache)localObject).processJournal();
            return (DiskLruCache)localObject;
          }
          catch (IOException localIOException)
          {
            PrintStream localPrintStream = System.out;
            StringBuilder localStringBuilder = new StringBuilder("DiskLruCache ");
            localStringBuilder.append(paramFile);
            localStringBuilder.append(" is corrupt: ");
            localStringBuilder.append(localIOException.getMessage());
            localStringBuilder.append(", removing");
            localPrintStream.println(localStringBuilder.toString());
            ((DiskLruCache)localObject).delete();
          }
        }
        paramFile.mkdirs();
        paramFile = new DiskLruCache(paramFile, paramInt1, paramInt2, paramLong);
        paramFile.rebuildJournal();
        return paramFile;
      }
      throw new IllegalArgumentException("valueCount <= 0");
    }
    throw new IllegalArgumentException("maxSize <= 0");
  }
  
  private void processJournal()
    throws IOException
  {
    deleteIfExists(this.journalFileTmp);
    Iterator localIterator = this.lruEntries.values().iterator();
    while (localIterator.hasNext())
    {
      Entry localEntry = (Entry)localIterator.next();
      Editor localEditor = localEntry.currentEditor;
      int j = 0;
      int i = 0;
      if (localEditor == null)
      {
        while (i < this.valueCount)
        {
          this.size += localEntry.lengths[i];
          i += 1;
        }
      }
      else
      {
        Entry.access$802(localEntry, null);
        i = j;
        while (i < this.valueCount)
        {
          deleteIfExists(localEntry.getCleanFile(i));
          deleteIfExists(localEntry.getDirtyFile(i));
          i += 1;
        }
        localIterator.remove();
      }
    }
  }
  
  private void readJournal()
    throws IOException
  {
    localStrictLineReader = new StrictLineReader(new FileInputStream(this.journalFile), Util.US_ASCII);
    for (;;)
    {
      try
      {
        str1 = localStrictLineReader.readLine();
        str2 = localStrictLineReader.readLine();
        localObject2 = localStrictLineReader.readLine();
        str3 = localStrictLineReader.readLine();
        str4 = localStrictLineReader.readLine();
        if (("libcore.io.DiskLruCache".equals(str1)) && ("1".equals(str2)) && (Integer.toString(this.appVersion).equals(localObject2)) && (Integer.toString(this.valueCount).equals(str3)))
        {
          boolean bool = "".equals(str4);
          if (bool) {
            i = 0;
          }
        }
      }
      finally
      {
        String str1;
        String str2;
        Object localObject2;
        String str3;
        String str4;
        int i;
        Util.closeQuietly(localStrictLineReader);
      }
      try
      {
        readJournalLine(localStrictLineReader.readLine());
        i += 1;
      }
      catch (EOFException localEOFException) {}
    }
    this.redundantOpCount = (i - this.lruEntries.size());
    if (localStrictLineReader.hasUnterminatedLine()) {
      rebuildJournal();
    } else {
      this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.US_ASCII));
    }
    Util.closeQuietly(localStrictLineReader);
    return;
    localObject2 = new StringBuilder("unexpected journal header: [");
    ((StringBuilder)localObject2).append(str1);
    ((StringBuilder)localObject2).append(", ");
    ((StringBuilder)localObject2).append(str2);
    ((StringBuilder)localObject2).append(", ");
    ((StringBuilder)localObject2).append(str3);
    ((StringBuilder)localObject2).append(", ");
    ((StringBuilder)localObject2).append(str4);
    ((StringBuilder)localObject2).append("]");
    throw new IOException(((StringBuilder)localObject2).toString());
  }
  
  private void readJournalLine(String paramString)
    throws IOException
  {
    int i = paramString.indexOf(' ');
    if (i != -1)
    {
      int j = i + 1;
      int k = paramString.indexOf(' ', j);
      Object localObject1;
      if (k == -1)
      {
        localObject2 = paramString.substring(j);
        localObject1 = localObject2;
        if (i == 6)
        {
          localObject1 = localObject2;
          if (paramString.startsWith("REMOVE")) {
            this.lruEntries.remove(localObject2);
          }
        }
      }
      else
      {
        localObject1 = paramString.substring(j, k);
      }
      Entry localEntry = (Entry)this.lruEntries.get(localObject1);
      Object localObject2 = localEntry;
      if (localEntry == null)
      {
        localObject2 = new Entry((String)localObject1, null);
        this.lruEntries.put(localObject1, localObject2);
      }
      if ((k != -1) && (i == 5) && (paramString.startsWith("CLEAN")))
      {
        paramString = paramString.substring(k + 1).split(" ");
        Entry.access$702((Entry)localObject2, true);
        Entry.access$802((Entry)localObject2, null);
        ((Entry)localObject2).setLengths(paramString);
        return;
      }
      if ((k == -1) && (i == 5) && (paramString.startsWith("DIRTY")))
      {
        Entry.access$802((Entry)localObject2, new Editor((Entry)localObject2, null));
        return;
      }
      if ((k == -1) && (i == 4) && (paramString.startsWith("READ"))) {
        return;
      }
      throw new IOException("unexpected journal line: ".concat(String.valueOf(paramString)));
    }
    throw new IOException("unexpected journal line: ".concat(String.valueOf(paramString)));
  }
  
  /* Error */
  private void rebuildJournal()
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 137	com/bumptech/glide/disklrucache/DiskLruCache:journalWriter	Ljava/io/Writer;
    //   6: ifnull +10 -> 16
    //   9: aload_0
    //   10: getfield 137	com/bumptech/glide/disklrucache/DiskLruCache:journalWriter	Ljava/io/Writer;
    //   13: invokevirtual 496	java/io/Writer:close	()V
    //   16: new 437	java/io/BufferedWriter
    //   19: dup
    //   20: new 439	java/io/OutputStreamWriter
    //   23: dup
    //   24: new 441	java/io/FileOutputStream
    //   27: dup
    //   28: aload_0
    //   29: getfield 126	com/bumptech/glide/disklrucache/DiskLruCache:journalFileTmp	Ljava/io/File;
    //   32: invokespecial 497	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   35: getstatic 415	com/bumptech/glide/disklrucache/Util:US_ASCII	Ljava/nio/charset/Charset;
    //   38: invokespecial 447	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   41: invokespecial 450	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   44: astore_2
    //   45: aload_2
    //   46: ldc 41
    //   48: invokevirtual 500	java/io/Writer:write	(Ljava/lang/String;)V
    //   51: aload_2
    //   52: ldc_w 502
    //   55: invokevirtual 500	java/io/Writer:write	(Ljava/lang/String;)V
    //   58: aload_2
    //   59: ldc 48
    //   61: invokevirtual 500	java/io/Writer:write	(Ljava/lang/String;)V
    //   64: aload_2
    //   65: ldc_w 502
    //   68: invokevirtual 500	java/io/Writer:write	(Ljava/lang/String;)V
    //   71: aload_2
    //   72: aload_0
    //   73: getfield 117	com/bumptech/glide/disklrucache/DiskLruCache:appVersion	I
    //   76: invokestatic 427	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   79: invokevirtual 500	java/io/Writer:write	(Ljava/lang/String;)V
    //   82: aload_2
    //   83: ldc_w 502
    //   86: invokevirtual 500	java/io/Writer:write	(Ljava/lang/String;)V
    //   89: aload_2
    //   90: aload_0
    //   91: getfield 130	com/bumptech/glide/disklrucache/DiskLruCache:valueCount	I
    //   94: invokestatic 427	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   97: invokevirtual 500	java/io/Writer:write	(Ljava/lang/String;)V
    //   100: aload_2
    //   101: ldc_w 502
    //   104: invokevirtual 500	java/io/Writer:write	(Ljava/lang/String;)V
    //   107: aload_2
    //   108: ldc_w 502
    //   111: invokevirtual 500	java/io/Writer:write	(Ljava/lang/String;)V
    //   114: aload_0
    //   115: getfield 85	com/bumptech/glide/disklrucache/DiskLruCache:lruEntries	Ljava/util/LinkedHashMap;
    //   118: invokevirtual 387	java/util/LinkedHashMap:values	()Ljava/util/Collection;
    //   121: invokeinterface 393 1 0
    //   126: astore_3
    //   127: aload_3
    //   128: invokeinterface 398 1 0
    //   133: ifeq +113 -> 246
    //   136: aload_3
    //   137: invokeinterface 402 1 0
    //   142: checkcast 16	com/bumptech/glide/disklrucache/DiskLruCache$Entry
    //   145: astore_1
    //   146: aload_1
    //   147: invokestatic 195	com/bumptech/glide/disklrucache/DiskLruCache$Entry:access$800	(Lcom/bumptech/glide/disklrucache/DiskLruCache$Entry;)Lcom/bumptech/glide/disklrucache/DiskLruCache$Editor;
    //   150: ifnull +47 -> 197
    //   153: new 347	java/lang/StringBuilder
    //   156: dup
    //   157: ldc_w 504
    //   160: invokespecial 350	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   163: astore 4
    //   165: aload 4
    //   167: aload_1
    //   168: invokestatic 265	com/bumptech/glide/disklrucache/DiskLruCache$Entry:access$1200	(Lcom/bumptech/glide/disklrucache/DiskLruCache$Entry;)Ljava/lang/String;
    //   171: invokevirtual 358	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload 4
    //   177: bipush 10
    //   179: invokevirtual 507	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   182: pop
    //   183: aload 4
    //   185: invokevirtual 366	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   188: astore_1
    //   189: aload_2
    //   190: aload_1
    //   191: invokevirtual 500	java/io/Writer:write	(Ljava/lang/String;)V
    //   194: goto -67 -> 127
    //   197: new 347	java/lang/StringBuilder
    //   200: dup
    //   201: ldc_w 509
    //   204: invokespecial 350	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   207: astore 4
    //   209: aload 4
    //   211: aload_1
    //   212: invokestatic 265	com/bumptech/glide/disklrucache/DiskLruCache$Entry:access$1200	(Lcom/bumptech/glide/disklrucache/DiskLruCache$Entry;)Ljava/lang/String;
    //   215: invokevirtual 358	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: pop
    //   219: aload 4
    //   221: aload_1
    //   222: invokevirtual 269	com/bumptech/glide/disklrucache/DiskLruCache$Entry:getLengths	()Ljava/lang/String;
    //   225: invokevirtual 358	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: pop
    //   229: aload 4
    //   231: bipush 10
    //   233: invokevirtual 507	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   236: pop
    //   237: aload 4
    //   239: invokevirtual 366	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   242: astore_1
    //   243: goto -54 -> 189
    //   246: aload_2
    //   247: invokevirtual 496	java/io/Writer:close	()V
    //   250: aload_0
    //   251: getfield 124	com/bumptech/glide/disklrucache/DiskLruCache:journalFile	Ljava/io/File;
    //   254: invokevirtual 210	java/io/File:exists	()Z
    //   257: ifeq +15 -> 272
    //   260: aload_0
    //   261: getfield 124	com/bumptech/glide/disklrucache/DiskLruCache:journalFile	Ljava/io/File;
    //   264: aload_0
    //   265: getfield 128	com/bumptech/glide/disklrucache/DiskLruCache:journalFileBackup	Ljava/io/File;
    //   268: iconst_1
    //   269: invokestatic 331	com/bumptech/glide/disklrucache/DiskLruCache:renameTo	(Ljava/io/File;Ljava/io/File;Z)V
    //   272: aload_0
    //   273: getfield 126	com/bumptech/glide/disklrucache/DiskLruCache:journalFileTmp	Ljava/io/File;
    //   276: aload_0
    //   277: getfield 124	com/bumptech/glide/disklrucache/DiskLruCache:journalFile	Ljava/io/File;
    //   280: iconst_0
    //   281: invokestatic 331	com/bumptech/glide/disklrucache/DiskLruCache:renameTo	(Ljava/io/File;Ljava/io/File;Z)V
    //   284: aload_0
    //   285: getfield 128	com/bumptech/glide/disklrucache/DiskLruCache:journalFileBackup	Ljava/io/File;
    //   288: invokevirtual 288	java/io/File:delete	()Z
    //   291: pop
    //   292: aload_0
    //   293: new 437	java/io/BufferedWriter
    //   296: dup
    //   297: new 439	java/io/OutputStreamWriter
    //   300: dup
    //   301: new 441	java/io/FileOutputStream
    //   304: dup
    //   305: aload_0
    //   306: getfield 124	com/bumptech/glide/disklrucache/DiskLruCache:journalFile	Ljava/io/File;
    //   309: iconst_1
    //   310: invokespecial 444	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   313: getstatic 415	com/bumptech/glide/disklrucache/Util:US_ASCII	Ljava/nio/charset/Charset;
    //   316: invokespecial 447	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   319: invokespecial 450	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   322: putfield 137	com/bumptech/glide/disklrucache/DiskLruCache:journalWriter	Ljava/io/Writer;
    //   325: aload_0
    //   326: monitorexit
    //   327: return
    //   328: astore_1
    //   329: aload_2
    //   330: invokevirtual 496	java/io/Writer:close	()V
    //   333: aload_1
    //   334: athrow
    //   335: astore_1
    //   336: aload_0
    //   337: monitorexit
    //   338: aload_1
    //   339: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	340	0	this	DiskLruCache
    //   145	98	1	localObject1	Object
    //   328	6	1	localObject2	Object
    //   335	4	1	localObject3	Object
    //   44	286	2	localBufferedWriter	BufferedWriter
    //   126	11	3	localIterator	Iterator
    //   163	75	4	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   45	127	328	finally
    //   127	189	328	finally
    //   189	194	328	finally
    //   197	243	328	finally
    //   2	16	335	finally
    //   16	45	335	finally
    //   246	272	335	finally
    //   272	325	335	finally
    //   329	335	335	finally
  }
  
  private static void renameTo(File paramFile1, File paramFile2, boolean paramBoolean)
    throws IOException
  {
    if (paramBoolean) {
      deleteIfExists(paramFile2);
    }
    if (paramFile1.renameTo(paramFile2)) {
      return;
    }
    throw new IOException();
  }
  
  private void trimToSize()
    throws IOException
  {
    while (this.size > this.maxSize) {
      remove((String)((Map.Entry)this.lruEntries.entrySet().iterator().next()).getKey());
    }
  }
  
  public final void close()
    throws IOException
  {
    try
    {
      Object localObject1 = this.journalWriter;
      if (localObject1 == null) {
        return;
      }
      localObject1 = new ArrayList(this.lruEntries.values()).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Entry localEntry = (Entry)((Iterator)localObject1).next();
        if (localEntry.currentEditor != null) {
          localEntry.currentEditor.abort();
        }
      }
      trimToSize();
      this.journalWriter.close();
      this.journalWriter = null;
      return;
    }
    finally {}
  }
  
  public final void delete()
    throws IOException
  {
    close();
    Util.deleteContents(this.directory);
  }
  
  public final Editor edit(String paramString)
    throws IOException
  {
    return edit(paramString, -1L);
  }
  
  public final void flush()
    throws IOException
  {
    try
    {
      checkNotClosed();
      trimToSize();
      this.journalWriter.flush();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Value get(String paramString)
    throws IOException
  {
    try
    {
      checkNotClosed();
      Entry localEntry = (Entry)this.lruEntries.get(paramString);
      if (localEntry == null) {
        return null;
      }
      boolean bool = localEntry.readable;
      if (!bool) {
        return null;
      }
      File[] arrayOfFile = localEntry.cleanFiles;
      int j = arrayOfFile.length;
      int i = 0;
      while (i < j)
      {
        bool = arrayOfFile[i].exists();
        if (!bool) {
          return null;
        }
        i += 1;
      }
      this.redundantOpCount += 1;
      this.journalWriter.append("READ");
      this.journalWriter.append(' ');
      this.journalWriter.append(paramString);
      this.journalWriter.append('\n');
      if (journalRebuildRequired()) {
        this.executorService.submit(this.cleanupCallable);
      }
      paramString = new Value(paramString, localEntry.sequenceNumber, localEntry.cleanFiles, localEntry.lengths, null);
      return paramString;
    }
    finally {}
  }
  
  public final File getDirectory()
  {
    return this.directory;
  }
  
  public final long getMaxSize()
  {
    try
    {
      long l = this.maxSize;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final boolean isClosed()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 137	com/bumptech/glide/disklrucache/DiskLruCache:journalWriter	Ljava/io/Writer;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +9 -> 17
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_1
    //   19: goto -6 -> 13
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	DiskLruCache
    //   12	7	1	bool	boolean
    //   6	2	2	localWriter	Writer
    //   22	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public final boolean remove(String paramString)
    throws IOException
  {
    try
    {
      checkNotClosed();
      Entry localEntry = (Entry)this.lruEntries.get(paramString);
      int i = 0;
      if ((localEntry != null) && (localEntry.currentEditor == null))
      {
        while (i < this.valueCount)
        {
          File localFile = localEntry.getCleanFile(i);
          if ((localFile.exists()) && (!localFile.delete())) {
            throw new IOException("failed to delete ".concat(String.valueOf(localFile)));
          }
          this.size -= localEntry.lengths[i];
          localEntry.lengths[i] = 0L;
          i += 1;
        }
        this.redundantOpCount += 1;
        this.journalWriter.append("REMOVE");
        this.journalWriter.append(' ');
        this.journalWriter.append(paramString);
        this.journalWriter.append('\n');
        this.lruEntries.remove(paramString);
        if (journalRebuildRequired()) {
          this.executorService.submit(this.cleanupCallable);
        }
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public final void setMaxSize(long paramLong)
  {
    try
    {
      this.maxSize = paramLong;
      this.executorService.submit(this.cleanupCallable);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final long size()
  {
    try
    {
      long l = this.size;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  static final class DiskLruCacheThreadFactory
    implements ThreadFactory
  {
    public final Thread newThread(Runnable paramRunnable)
    {
      try
      {
        paramRunnable = new Thread(paramRunnable, "glide-disk-lru-cache-thread");
        paramRunnable.setPriority(1);
        return paramRunnable;
      }
      finally
      {
        paramRunnable = finally;
        throw paramRunnable;
      }
    }
  }
  
  public final class Editor
  {
    private boolean committed;
    private final DiskLruCache.Entry entry;
    private final boolean[] written;
    
    private Editor(DiskLruCache.Entry paramEntry)
    {
      this.entry = paramEntry;
      if (DiskLruCache.Entry.access$700(paramEntry)) {
        this$1 = null;
      } else {
        this$1 = new boolean[DiskLruCache.this.valueCount];
      }
      this.written = DiskLruCache.this;
    }
    
    private InputStream newInputStream(int paramInt)
      throws IOException
    {
      synchronized (DiskLruCache.this)
      {
        if (DiskLruCache.Entry.access$800(this.entry) == this) {
          if (!DiskLruCache.Entry.access$700(this.entry)) {
            return null;
          }
        }
        try
        {
          FileInputStream localFileInputStream = new FileInputStream(this.entry.getCleanFile(paramInt));
          return localFileInputStream;
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          for (;;) {}
        }
        return null;
        throw new IllegalStateException();
      }
    }
    
    public final void abort()
      throws IOException
    {
      DiskLruCache.this.completeEdit(this, false);
    }
    
    public final void abortUnlessCommitted()
    {
      if (!this.committed) {}
      try
      {
        abort();
        return;
      }
      catch (IOException localIOException) {}
    }
    
    public final void commit()
      throws IOException
    {
      DiskLruCache.this.completeEdit(this, true);
      this.committed = true;
    }
    
    public final File getFile(int paramInt)
      throws IOException
    {
      synchronized (DiskLruCache.this)
      {
        if (DiskLruCache.Entry.access$800(this.entry) == this)
        {
          if (!DiskLruCache.Entry.access$700(this.entry)) {
            this.written[paramInt] = true;
          }
          File localFile = this.entry.getDirtyFile(paramInt);
          if (!DiskLruCache.this.directory.exists()) {
            DiskLruCache.this.directory.mkdirs();
          }
          return localFile;
        }
        throw new IllegalStateException();
      }
    }
    
    public final String getString(int paramInt)
      throws IOException
    {
      InputStream localInputStream = newInputStream(paramInt);
      if (localInputStream != null) {
        return DiskLruCache.inputStreamToString(localInputStream);
      }
      return null;
    }
    
    /* Error */
    public final void set(int paramInt, String paramString)
      throws IOException
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 4
      //   3: new 107	java/io/OutputStreamWriter
      //   6: dup
      //   7: new 109	java/io/FileOutputStream
      //   10: dup
      //   11: aload_0
      //   12: iload_1
      //   13: invokevirtual 111	com/bumptech/glide/disklrucache/DiskLruCache$Editor:getFile	(I)Ljava/io/File;
      //   16: invokespecial 112	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
      //   19: getstatic 118	com/bumptech/glide/disklrucache/Util:UTF_8	Ljava/nio/charset/Charset;
      //   22: invokespecial 121	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
      //   25: astore_3
      //   26: aload_3
      //   27: aload_2
      //   28: invokevirtual 127	java/io/Writer:write	(Ljava/lang/String;)V
      //   31: aload_3
      //   32: invokestatic 131	com/bumptech/glide/disklrucache/Util:closeQuietly	(Ljava/io/Closeable;)V
      //   35: return
      //   36: astore 4
      //   38: aload_3
      //   39: astore_2
      //   40: aload 4
      //   42: astore_3
      //   43: goto +7 -> 50
      //   46: astore_3
      //   47: aload 4
      //   49: astore_2
      //   50: aload_2
      //   51: invokestatic 131	com/bumptech/glide/disklrucache/Util:closeQuietly	(Ljava/io/Closeable;)V
      //   54: aload_3
      //   55: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	56	0	this	Editor
      //   0	56	1	paramInt	int
      //   0	56	2	paramString	String
      //   25	18	3	localObject1	Object
      //   46	9	3	localObject2	Object
      //   1	1	4	localObject3	Object
      //   36	12	4	localObject4	Object
      // Exception table:
      //   from	to	target	type
      //   26	31	36	finally
      //   3	26	46	finally
    }
  }
  
  final class Entry
  {
    File[] cleanFiles;
    private DiskLruCache.Editor currentEditor;
    File[] dirtyFiles;
    private final String key;
    private final long[] lengths;
    private boolean readable;
    private long sequenceNumber;
    
    private Entry(String paramString)
    {
      this.key = paramString;
      this.lengths = new long[DiskLruCache.this.valueCount];
      this.cleanFiles = new File[DiskLruCache.this.valueCount];
      this.dirtyFiles = new File[DiskLruCache.this.valueCount];
      paramString = new StringBuilder(paramString);
      paramString.append('.');
      int j = paramString.length();
      int i = 0;
      while (i < DiskLruCache.this.valueCount)
      {
        paramString.append(i);
        this.cleanFiles[i] = new File(DiskLruCache.this.directory, paramString.toString());
        paramString.append(".tmp");
        this.dirtyFiles[i] = new File(DiskLruCache.this.directory, paramString.toString());
        paramString.setLength(j);
        i += 1;
      }
    }
    
    private IOException invalidLengths(String[] paramArrayOfString)
      throws IOException
    {
      StringBuilder localStringBuilder = new StringBuilder("unexpected journal line: ");
      localStringBuilder.append(Arrays.toString(paramArrayOfString));
      throw new IOException(localStringBuilder.toString());
    }
    
    private void setLengths(String[] paramArrayOfString)
      throws IOException
    {
      int i;
      if (paramArrayOfString.length == DiskLruCache.this.valueCount) {
        i = 0;
      }
      try
      {
        while (i < paramArrayOfString.length)
        {
          this.lengths[i] = Long.parseLong(paramArrayOfString[i]);
          i += 1;
        }
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;) {}
      }
      throw invalidLengths(paramArrayOfString);
      throw invalidLengths(paramArrayOfString);
    }
    
    public final File getCleanFile(int paramInt)
    {
      return this.cleanFiles[paramInt];
    }
    
    public final File getDirtyFile(int paramInt)
    {
      return this.dirtyFiles[paramInt];
    }
    
    public final String getLengths()
      throws IOException
    {
      StringBuilder localStringBuilder = new StringBuilder();
      long[] arrayOfLong = this.lengths;
      int j = arrayOfLong.length;
      int i = 0;
      while (i < j)
      {
        long l = arrayOfLong[i];
        localStringBuilder.append(' ');
        localStringBuilder.append(l);
        i += 1;
      }
      return localStringBuilder.toString();
    }
  }
  
  public final class Value
  {
    private final File[] files;
    private final String key;
    private final long[] lengths;
    private final long sequenceNumber;
    
    private Value(String paramString, long paramLong, File[] paramArrayOfFile, long[] paramArrayOfLong)
    {
      this.key = paramString;
      this.sequenceNumber = paramLong;
      this.files = paramArrayOfFile;
      this.lengths = paramArrayOfLong;
    }
    
    public final DiskLruCache.Editor edit()
      throws IOException
    {
      return DiskLruCache.this.edit(this.key, this.sequenceNumber);
    }
    
    public final File getFile(int paramInt)
    {
      return this.files[paramInt];
    }
    
    public final long getLength(int paramInt)
    {
      return this.lengths[paramInt];
    }
    
    public final String getString(int paramInt)
      throws IOException
    {
      return DiskLruCache.inputStreamToString(new FileInputStream(this.files[paramInt]));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/disklrucache/DiskLruCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
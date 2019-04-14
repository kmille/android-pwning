package b.i.b.a.b;

import b.a.v;
import b.f.a.b;
import b.f.b.k;
import b.i.b.a.c.d.b.s;
import b.i.b.a.c.e.b.a.g;
import b.u;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000F\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\016\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\030\0002\0020\001:\001\025B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\026\020\r\032\b\022\004\022\0020\0070\0162\006\020\017\032\0020\007H\026J\026\020\020\032\b\022\004\022\0020\0210\0162\006\020\022\032\0020\007H\026J\016\020\023\032\0020\0242\006\020\022\032\0020\007R\016\020\002\032\0020\003X\004¢\006\002\n\000R6\020\005\032*\022\004\022\0020\007\022\n\022\b\022\004\022\0020\0070\b0\006j\024\022\004\022\0020\007\022\n\022\b\022\004\022\0020\0070\b`\tX\004¢\006\002\n\000R\036\020\n\032\022\022\004\022\0020\0070\013j\b\022\004\022\0020\007`\fX\004¢\006\002\n\000¨\006\026"}, c={"Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/PackagePartProvider;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "packageParts", "Ljava/util/HashMap;", "", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/HashMap;", "visitedModules", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "findPackageParts", "", "packageFqName", "getAnnotationsOnBinaryModule", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "moduleName", "registerModule", "", "EmptyEnumeration", "descriptors.runtime"})
public final class j
  implements s
{
  private final HashSet<String> a;
  private final HashMap<String, LinkedHashSet<String>> b;
  private final ClassLoader c;
  
  public j(ClassLoader paramClassLoader)
  {
    this.c = paramClassLoader;
    this.a = new HashSet();
    this.b = new HashMap();
  }
  
  /* Error */
  public final void a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ldc 73
    //   5: invokestatic 47	b/f/b/j:b	(Ljava/lang/Object;Ljava/lang/String;)V
    //   8: aload_0
    //   9: getfield 57	b/i/b/a/b/j:a	Ljava/util/HashSet;
    //   12: aload_1
    //   13: invokevirtual 77	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   16: istore_2
    //   17: iload_2
    //   18: ifne +6 -> 24
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: new 79	java/lang/StringBuilder
    //   27: dup
    //   28: ldc 81
    //   30: invokespecial 83	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   33: astore_3
    //   34: aload_3
    //   35: aload_1
    //   36: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload_3
    //   41: ldc 89
    //   43: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: astore 6
    //   53: aload_0
    //   54: getfield 52	b/i/b/a/b/j:c	Ljava/lang/ClassLoader;
    //   57: aload 6
    //   59: invokevirtual 99	java/lang/ClassLoader:getResources	(Ljava/lang/String;)Ljava/util/Enumeration;
    //   62: astore_1
    //   63: goto +10 -> 73
    //   66: getstatic 102	b/i/b/a/b/j$a:a	Lb/i/b/a/b/j$a;
    //   69: checkcast 104	java/util/Enumeration
    //   72: astore_1
    //   73: aload_1
    //   74: ldc 106
    //   76: invokestatic 108	b/f/b/j:a	(Ljava/lang/Object;Ljava/lang/String;)V
    //   79: aload_1
    //   80: ldc 110
    //   82: invokestatic 47	b/f/b/j:b	(Ljava/lang/Object;Ljava/lang/String;)V
    //   85: new 112	b/a/n$a
    //   88: dup
    //   89: aload_1
    //   90: invokespecial 115	b/a/n$a:<init>	(Ljava/util/Enumeration;)V
    //   93: checkcast 117	java/util/Iterator
    //   96: astore 7
    //   98: aload 7
    //   100: invokeinterface 121 1 0
    //   105: ifeq +379 -> 484
    //   108: aload 7
    //   110: invokeinterface 125 1 0
    //   115: checkcast 127	java/net/URL
    //   118: astore_1
    //   119: aload_1
    //   120: invokevirtual 131	java/net/URL:openStream	()Ljava/io/InputStream;
    //   123: astore_1
    //   124: aload_1
    //   125: ifnull -27 -> 98
    //   128: aload_1
    //   129: checkcast 133	java/io/Closeable
    //   132: astore 8
    //   134: aconst_null
    //   135: astore 4
    //   137: aload 4
    //   139: astore_1
    //   140: aload 8
    //   142: checkcast 135	java/io/InputStream
    //   145: astore 5
    //   147: aload 4
    //   149: astore_1
    //   150: getstatic 141	b/i/b/a/c/e/b/a/k:d	Lb/i/b/a/c/e/b/a/k$a;
    //   153: astore_3
    //   154: aload 4
    //   156: astore_1
    //   157: aload 5
    //   159: ldc 110
    //   161: invokestatic 47	b/f/b/j:b	(Ljava/lang/Object;Ljava/lang/String;)V
    //   164: aload 4
    //   166: astore_1
    //   167: new 143	java/io/ByteArrayOutputStream
    //   170: dup
    //   171: sipush 8192
    //   174: aload 5
    //   176: invokevirtual 147	java/io/InputStream:available	()I
    //   179: invokestatic 153	java/lang/Math:max	(II)I
    //   182: invokespecial 156	java/io/ByteArrayOutputStream:<init>	(I)V
    //   185: astore 9
    //   187: aload 4
    //   189: astore_1
    //   190: aload 5
    //   192: aload 9
    //   194: checkcast 158	java/io/OutputStream
    //   197: invokestatic 163	b/e/a:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   200: pop2
    //   201: aload 4
    //   203: astore_1
    //   204: aload 9
    //   206: invokevirtual 167	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   209: astore 5
    //   211: aload 4
    //   213: astore_1
    //   214: aload 5
    //   216: ldc -87
    //   218: invokestatic 108	b/f/b/j:a	(Ljava/lang/Object;Ljava/lang/String;)V
    //   221: aload 4
    //   223: astore_1
    //   224: getstatic 174	b/i/b/a/c/j/a/j$a:a	Lb/i/b/a/c/j/a/j$a;
    //   227: checkcast 176	b/i/b/a/c/j/a/j
    //   230: astore 9
    //   232: aload 4
    //   234: astore_1
    //   235: getstatic 179	b/i/b/a/b/j$b:a	Lb/i/b/a/b/j$b;
    //   238: checkcast 181	b/f/a/b
    //   241: astore 10
    //   243: aload 4
    //   245: astore_1
    //   246: aload_3
    //   247: ldc 110
    //   249: invokestatic 47	b/f/b/j:b	(Ljava/lang/Object;Ljava/lang/String;)V
    //   252: aload 4
    //   254: astore_1
    //   255: aload 6
    //   257: ldc -73
    //   259: invokestatic 47	b/f/b/j:b	(Ljava/lang/Object;Ljava/lang/String;)V
    //   262: aload 4
    //   264: astore_1
    //   265: aload 9
    //   267: ldc -71
    //   269: invokestatic 47	b/f/b/j:b	(Ljava/lang/Object;Ljava/lang/String;)V
    //   272: aload 4
    //   274: astore_1
    //   275: aload 10
    //   277: ldc -69
    //   279: invokestatic 47	b/f/b/j:b	(Ljava/lang/Object;Ljava/lang/String;)V
    //   282: aload 4
    //   284: astore_1
    //   285: aload 5
    //   287: aload 6
    //   289: aload 10
    //   291: invokestatic 192	b/i/b/a/c/e/b/a/k$a:a	([BLjava/lang/String;Lb/f/a/b;)Lb/i/b/a/c/e/b/a/k;
    //   294: getfield 195	b/i/b/a/c/e/b/a/k:a	Ljava/util/Map;
    //   297: invokeinterface 201 1 0
    //   302: invokeinterface 207 1 0
    //   307: astore 9
    //   309: aload 4
    //   311: astore_1
    //   312: aload 9
    //   314: invokeinterface 121 1 0
    //   319: ifeq +126 -> 445
    //   322: aload 4
    //   324: astore_1
    //   325: aload 9
    //   327: invokeinterface 125 1 0
    //   332: checkcast 209	java/util/Map$Entry
    //   335: astore_3
    //   336: aload 4
    //   338: astore_1
    //   339: aload_3
    //   340: invokeinterface 212 1 0
    //   345: checkcast 214	java/lang/String
    //   348: astore 10
    //   350: aload 4
    //   352: astore_1
    //   353: aload_3
    //   354: invokeinterface 217 1 0
    //   359: checkcast 219	b/i/b/a/c/e/b/a/m
    //   362: astore 11
    //   364: aload 4
    //   366: astore_1
    //   367: aload_0
    //   368: getfield 62	b/i/b/a/b/j:b	Ljava/util/HashMap;
    //   371: checkcast 197	java/util/Map
    //   374: astore 12
    //   376: aload 4
    //   378: astore_1
    //   379: aload 12
    //   381: aload 10
    //   383: invokeinterface 223 2 0
    //   388: astore 5
    //   390: aload 5
    //   392: astore_3
    //   393: aload 5
    //   395: ifnonnull +28 -> 423
    //   398: aload 4
    //   400: astore_1
    //   401: new 225	java/util/LinkedHashSet
    //   404: dup
    //   405: invokespecial 226	java/util/LinkedHashSet:<init>	()V
    //   408: astore_3
    //   409: aload 4
    //   411: astore_1
    //   412: aload 12
    //   414: aload 10
    //   416: aload_3
    //   417: invokeinterface 230 3 0
    //   422: pop
    //   423: aload 4
    //   425: astore_1
    //   426: aload_3
    //   427: checkcast 225	java/util/LinkedHashSet
    //   430: aload 11
    //   432: invokevirtual 232	b/i/b/a/c/e/b/a/m:a	()Ljava/util/Set;
    //   435: checkcast 234	java/util/Collection
    //   438: invokevirtual 238	java/util/LinkedHashSet:addAll	(Ljava/util/Collection;)Z
    //   441: pop
    //   442: goto -133 -> 309
    //   445: aload 4
    //   447: astore_1
    //   448: getstatic 243	b/u:a	Lb/u;
    //   451: astore_3
    //   452: aload 8
    //   454: aconst_null
    //   455: invokestatic 248	b/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   458: goto -360 -> 98
    //   461: astore_3
    //   462: goto +8 -> 470
    //   465: astore_3
    //   466: aload_3
    //   467: astore_1
    //   468: aload_3
    //   469: athrow
    //   470: aload 8
    //   472: aload_1
    //   473: invokestatic 248	b/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   476: aload_3
    //   477: athrow
    //   478: astore_1
    //   479: aload_1
    //   480: checkcast 72	java/lang/Throwable
    //   483: athrow
    //   484: aload_0
    //   485: monitorexit
    //   486: return
    //   487: astore_1
    //   488: aload_0
    //   489: monitorexit
    //   490: aload_1
    //   491: athrow
    //   492: astore_1
    //   493: goto -427 -> 66
    //   496: astore_1
    //   497: goto -399 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	500	0	this	j
    //   0	500	1	paramString	String
    //   16	2	2	bool	boolean
    //   33	419	3	localObject1	Object
    //   461	1	3	localObject2	Object
    //   465	12	3	localThrowable	Throwable
    //   135	311	4	localObject3	Object
    //   145	249	5	localObject4	Object
    //   51	237	6	str	String
    //   96	13	7	localIterator	java.util.Iterator
    //   132	339	8	localCloseable	java.io.Closeable
    //   185	141	9	localObject5	Object
    //   241	174	10	localObject6	Object
    //   362	69	11	localm	b.i.b.a.c.e.b.a.m
    //   374	39	12	localMap	java.util.Map
    // Exception table:
    //   from	to	target	type
    //   140	147	461	finally
    //   150	154	461	finally
    //   157	164	461	finally
    //   167	187	461	finally
    //   190	201	461	finally
    //   204	211	461	finally
    //   214	221	461	finally
    //   224	232	461	finally
    //   235	243	461	finally
    //   246	252	461	finally
    //   255	262	461	finally
    //   265	272	461	finally
    //   275	282	461	finally
    //   285	309	461	finally
    //   312	322	461	finally
    //   325	336	461	finally
    //   339	350	461	finally
    //   353	364	461	finally
    //   367	376	461	finally
    //   379	390	461	finally
    //   401	409	461	finally
    //   412	423	461	finally
    //   426	442	461	finally
    //   448	452	461	finally
    //   468	470	461	finally
    //   140	147	465	java/lang/Throwable
    //   150	154	465	java/lang/Throwable
    //   157	164	465	java/lang/Throwable
    //   167	187	465	java/lang/Throwable
    //   190	201	465	java/lang/Throwable
    //   204	211	465	java/lang/Throwable
    //   214	221	465	java/lang/Throwable
    //   224	232	465	java/lang/Throwable
    //   235	243	465	java/lang/Throwable
    //   246	252	465	java/lang/Throwable
    //   255	262	465	java/lang/Throwable
    //   265	272	465	java/lang/Throwable
    //   275	282	465	java/lang/Throwable
    //   285	309	465	java/lang/Throwable
    //   312	322	465	java/lang/Throwable
    //   325	336	465	java/lang/Throwable
    //   339	350	465	java/lang/Throwable
    //   353	364	465	java/lang/Throwable
    //   367	376	465	java/lang/Throwable
    //   379	390	465	java/lang/Throwable
    //   401	409	465	java/lang/Throwable
    //   412	423	465	java/lang/Throwable
    //   426	442	465	java/lang/Throwable
    //   448	452	465	java/lang/Throwable
    //   119	124	478	java/lang/UnsupportedOperationException
    //   128	134	478	java/lang/UnsupportedOperationException
    //   452	458	478	java/lang/UnsupportedOperationException
    //   470	478	478	java/lang/UnsupportedOperationException
    //   2	17	487	finally
    //   24	53	487	finally
    //   53	63	487	finally
    //   66	73	487	finally
    //   73	98	487	finally
    //   98	119	487	finally
    //   119	124	487	finally
    //   128	134	487	finally
    //   452	458	487	finally
    //   470	478	487	finally
    //   479	484	487	finally
    //   53	63	492	java/io/IOException
    //   119	124	496	java/lang/Exception
    //   128	134	496	java/lang/Exception
    //   452	458	496	java/lang/Exception
    //   470	478	496	java/lang/Exception
  }
  
  public final List<String> b(String paramString)
  {
    for (;;)
    {
      try
      {
        b.f.b.j.b(paramString, "packageFqName");
        paramString = (LinkedHashSet)this.b.get(paramString);
        if (paramString != null)
        {
          paramString = b.a.j.i((Iterable)paramString);
          Object localObject = paramString;
          if (paramString == null) {
            localObject = (List)v.a;
          }
          return (List<String>)localObject;
        }
      }
      finally {}
      paramString = null;
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\030\n\002\030\002\n\002\030\002\n\002\020\001\n\002\b\002\n\002\020\013\n\002\b\002\bÂ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\b\020\004\032\0020\005H\026J\b\020\006\032\0020\002H\026¨\006\007"}, c={"Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider$EmptyEnumeration;", "Ljava/util/Enumeration;", "", "()V", "hasMoreElements", "", "nextElement", "descriptors.runtime"})
  static final class a
    implements Enumeration
  {
    public static final a a = new a();
    
    public final boolean hasMoreElements()
    {
      return false;
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, c={"<anonymous>", "", "version", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "invoke"})
  static final class b
    extends k
    implements b<g, u>
  {
    public static final b a = new b();
    
    b()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
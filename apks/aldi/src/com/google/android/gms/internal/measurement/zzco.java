package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzco
  extends zzar
{
  private static final byte[] zzaba = "\n".getBytes();
  private final String zzaay = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] { "GoogleAnalytics", zzas.VERSION, Build.VERSION.RELEASE, zzdd.zza(Locale.getDefault()), Build.MODEL, Build.ID });
  private final zzcz zzaaz;
  
  zzco(zzat paramzzat)
  {
    super(paramzzat);
    this.zzaaz = new zzcz(paramzzat.zzbt());
  }
  
  /* Error */
  private final int zza(URL paramURL)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 91	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_0
    //   6: ldc 93
    //   8: aload_1
    //   9: invokevirtual 99	com/google/android/gms/internal/measurement/zzaq:zzb	(Ljava/lang/String;Ljava/lang/Object;)V
    //   12: aload_0
    //   13: aload_1
    //   14: invokespecial 102	com/google/android/gms/internal/measurement/zzco:zzb	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   17: astore_3
    //   18: aload_3
    //   19: astore_1
    //   20: aload_3
    //   21: invokevirtual 107	java/net/HttpURLConnection:connect	()V
    //   24: aload_3
    //   25: astore_1
    //   26: aload_0
    //   27: aload_3
    //   28: invokespecial 110	com/google/android/gms/internal/measurement/zzco:zza	(Ljava/net/HttpURLConnection;)V
    //   31: aload_3
    //   32: astore_1
    //   33: aload_3
    //   34: invokevirtual 114	java/net/HttpURLConnection:getResponseCode	()I
    //   37: istore_2
    //   38: iload_2
    //   39: sipush 200
    //   42: if_icmpne +12 -> 54
    //   45: aload_3
    //   46: astore_1
    //   47: aload_0
    //   48: invokevirtual 118	com/google/android/gms/internal/measurement/zzaq:zzby	()Lcom/google/android/gms/internal/measurement/zzai;
    //   51: invokevirtual 123	com/google/android/gms/internal/measurement/zzai:zzbr	()V
    //   54: aload_3
    //   55: astore_1
    //   56: aload_0
    //   57: ldc 125
    //   59: iload_2
    //   60: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   63: invokevirtual 99	com/google/android/gms/internal/measurement/zzaq:zzb	(Ljava/lang/String;Ljava/lang/Object;)V
    //   66: aload_3
    //   67: ifnull +7 -> 74
    //   70: aload_3
    //   71: invokevirtual 134	java/net/HttpURLConnection:disconnect	()V
    //   74: iload_2
    //   75: ireturn
    //   76: astore_3
    //   77: goto +38 -> 115
    //   80: astore 4
    //   82: goto +13 -> 95
    //   85: astore_3
    //   86: aconst_null
    //   87: astore_1
    //   88: goto +27 -> 115
    //   91: astore 4
    //   93: aconst_null
    //   94: astore_3
    //   95: aload_3
    //   96: astore_1
    //   97: aload_0
    //   98: ldc -120
    //   100: aload 4
    //   102: invokevirtual 139	com/google/android/gms/internal/measurement/zzaq:zzd	(Ljava/lang/String;Ljava/lang/Object;)V
    //   105: aload_3
    //   106: ifnull +7 -> 113
    //   109: aload_3
    //   110: invokevirtual 134	java/net/HttpURLConnection:disconnect	()V
    //   113: iconst_0
    //   114: ireturn
    //   115: aload_1
    //   116: ifnull +7 -> 123
    //   119: aload_1
    //   120: invokevirtual 134	java/net/HttpURLConnection:disconnect	()V
    //   123: aload_3
    //   124: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	zzco
    //   0	125	1	paramURL	URL
    //   37	38	2	i	int
    //   17	54	3	localHttpURLConnection	HttpURLConnection
    //   76	1	3	localObject1	Object
    //   85	1	3	localObject2	Object
    //   94	30	3	localObject3	Object
    //   80	1	4	localIOException1	IOException
    //   91	10	4	localIOException2	IOException
    // Exception table:
    //   from	to	target	type
    //   20	24	76	finally
    //   26	31	76	finally
    //   33	38	76	finally
    //   47	54	76	finally
    //   56	66	76	finally
    //   97	105	76	finally
    //   20	24	80	java/io/IOException
    //   26	31	80	java/io/IOException
    //   33	38	80	java/io/IOException
    //   47	54	80	java/io/IOException
    //   56	66	80	java/io/IOException
    //   12	18	85	finally
    //   12	18	91	java/io/IOException
  }
  
  /* Error */
  private final int zza(URL paramURL, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 91	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_2
    //   6: invokestatic 91	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   9: pop
    //   10: aload_0
    //   11: ldc -114
    //   13: aload_2
    //   14: arraylength
    //   15: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   18: aload_1
    //   19: invokevirtual 145	com/google/android/gms/internal/measurement/zzaq:zzb	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   22: invokestatic 149	com/google/android/gms/internal/measurement/zzco:zzcg	()Z
    //   25: ifeq +17 -> 42
    //   28: aload_0
    //   29: ldc -105
    //   31: new 16	java/lang/String
    //   34: dup
    //   35: aload_2
    //   36: invokespecial 154	java/lang/String:<init>	([B)V
    //   39: invokevirtual 156	com/google/android/gms/internal/measurement/zzaq:zza	(Ljava/lang/String;Ljava/lang/Object;)V
    //   42: aconst_null
    //   43: astore 6
    //   45: aconst_null
    //   46: astore 4
    //   48: aconst_null
    //   49: astore 7
    //   51: aload_0
    //   52: invokevirtual 160	com/google/android/gms/internal/measurement/zzaq:getContext	()Landroid/content/Context;
    //   55: invokevirtual 166	android/content/Context:getPackageName	()Ljava/lang/String;
    //   58: pop
    //   59: aload_0
    //   60: aload_1
    //   61: invokespecial 102	com/google/android/gms/internal/measurement/zzco:zzb	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   64: astore_1
    //   65: aload 6
    //   67: astore 4
    //   69: aload_1
    //   70: astore 5
    //   72: aload_1
    //   73: iconst_1
    //   74: invokevirtual 170	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   77: aload 6
    //   79: astore 4
    //   81: aload_1
    //   82: astore 5
    //   84: aload_1
    //   85: aload_2
    //   86: arraylength
    //   87: invokevirtual 174	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   90: aload 6
    //   92: astore 4
    //   94: aload_1
    //   95: astore 5
    //   97: aload_1
    //   98: invokevirtual 107	java/net/HttpURLConnection:connect	()V
    //   101: aload 6
    //   103: astore 4
    //   105: aload_1
    //   106: astore 5
    //   108: aload_1
    //   109: invokevirtual 178	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   112: astore 6
    //   114: aload 6
    //   116: aload_2
    //   117: invokevirtual 183	java/io/OutputStream:write	([B)V
    //   120: aload_0
    //   121: aload_1
    //   122: invokespecial 110	com/google/android/gms/internal/measurement/zzco:zza	(Ljava/net/HttpURLConnection;)V
    //   125: aload_1
    //   126: invokevirtual 114	java/net/HttpURLConnection:getResponseCode	()I
    //   129: istore_3
    //   130: iload_3
    //   131: sipush 200
    //   134: if_icmpne +10 -> 144
    //   137: aload_0
    //   138: invokevirtual 118	com/google/android/gms/internal/measurement/zzaq:zzby	()Lcom/google/android/gms/internal/measurement/zzai;
    //   141: invokevirtual 123	com/google/android/gms/internal/measurement/zzai:zzbr	()V
    //   144: aload_0
    //   145: ldc -71
    //   147: iload_3
    //   148: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   151: invokevirtual 99	com/google/android/gms/internal/measurement/zzaq:zzb	(Ljava/lang/String;Ljava/lang/Object;)V
    //   154: aload 6
    //   156: ifnull +19 -> 175
    //   159: aload 6
    //   161: invokevirtual 188	java/io/OutputStream:close	()V
    //   164: goto +11 -> 175
    //   167: astore_2
    //   168: aload_0
    //   169: ldc -66
    //   171: aload_2
    //   172: invokevirtual 193	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   175: aload_1
    //   176: ifnull +7 -> 183
    //   179: aload_1
    //   180: invokevirtual 134	java/net/HttpURLConnection:disconnect	()V
    //   183: iload_3
    //   184: ireturn
    //   185: astore_2
    //   186: aload 6
    //   188: astore 4
    //   190: goto +83 -> 273
    //   193: astore 4
    //   195: aload 6
    //   197: astore_2
    //   198: aload 4
    //   200: astore 6
    //   202: goto +24 -> 226
    //   205: astore 6
    //   207: aload 7
    //   209: astore_2
    //   210: goto +16 -> 226
    //   213: astore_2
    //   214: aconst_null
    //   215: astore_1
    //   216: goto +57 -> 273
    //   219: astore 6
    //   221: aconst_null
    //   222: astore_1
    //   223: aload 7
    //   225: astore_2
    //   226: aload_2
    //   227: astore 4
    //   229: aload_1
    //   230: astore 5
    //   232: aload_0
    //   233: ldc -61
    //   235: aload 6
    //   237: invokevirtual 139	com/google/android/gms/internal/measurement/zzaq:zzd	(Ljava/lang/String;Ljava/lang/Object;)V
    //   240: aload_2
    //   241: ifnull +18 -> 259
    //   244: aload_2
    //   245: invokevirtual 188	java/io/OutputStream:close	()V
    //   248: goto +11 -> 259
    //   251: astore_2
    //   252: aload_0
    //   253: ldc -66
    //   255: aload_2
    //   256: invokevirtual 193	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   259: aload_1
    //   260: ifnull +7 -> 267
    //   263: aload_1
    //   264: invokevirtual 134	java/net/HttpURLConnection:disconnect	()V
    //   267: iconst_0
    //   268: ireturn
    //   269: astore_2
    //   270: aload 5
    //   272: astore_1
    //   273: aload 4
    //   275: ifnull +21 -> 296
    //   278: aload 4
    //   280: invokevirtual 188	java/io/OutputStream:close	()V
    //   283: goto +13 -> 296
    //   286: astore 4
    //   288: aload_0
    //   289: ldc -66
    //   291: aload 4
    //   293: invokevirtual 193	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   296: aload_1
    //   297: ifnull +7 -> 304
    //   300: aload_1
    //   301: invokevirtual 134	java/net/HttpURLConnection:disconnect	()V
    //   304: aload_2
    //   305: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	306	0	this	zzco
    //   0	306	1	paramURL	URL
    //   0	306	2	paramArrayOfByte	byte[]
    //   129	55	3	i	int
    //   46	143	4	localObject1	Object
    //   193	6	4	localIOException1	IOException
    //   227	52	4	arrayOfByte	byte[]
    //   286	6	4	localIOException2	IOException
    //   70	201	5	localURL	URL
    //   43	158	6	localObject2	Object
    //   205	1	6	localIOException3	IOException
    //   219	17	6	localIOException4	IOException
    //   49	175	7	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   159	164	167	java/io/IOException
    //   114	130	185	finally
    //   137	144	185	finally
    //   144	154	185	finally
    //   114	130	193	java/io/IOException
    //   137	144	193	java/io/IOException
    //   144	154	193	java/io/IOException
    //   72	77	205	java/io/IOException
    //   84	90	205	java/io/IOException
    //   97	101	205	java/io/IOException
    //   108	114	205	java/io/IOException
    //   51	65	213	finally
    //   51	65	219	java/io/IOException
    //   244	248	251	java/io/IOException
    //   72	77	269	finally
    //   84	90	269	finally
    //   97	101	269	finally
    //   108	114	269	finally
    //   232	240	269	finally
    //   278	283	286	java/io/IOException
  }
  
  private static void zza(StringBuilder paramStringBuilder, String paramString1, String paramString2)
    throws UnsupportedEncodingException
  {
    if (paramStringBuilder.length() != 0) {
      paramStringBuilder.append('&');
    }
    paramStringBuilder.append(URLEncoder.encode(paramString1, "UTF-8"));
    paramStringBuilder.append('=');
    paramStringBuilder.append(URLEncoder.encode(paramString2, "UTF-8"));
  }
  
  /* Error */
  private final void zza(HttpURLConnection paramHttpURLConnection)
    throws IOException
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 223	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   4: astore_3
    //   5: sipush 1024
    //   8: newarray <illegal type>
    //   10: astore_1
    //   11: aload_3
    //   12: aload_1
    //   13: invokevirtual 229	java/io/InputStream:read	([B)I
    //   16: istore_2
    //   17: iload_2
    //   18: ifgt -7 -> 11
    //   21: aload_3
    //   22: ifnull +16 -> 38
    //   25: aload_3
    //   26: invokevirtual 230	java/io/InputStream:close	()V
    //   29: return
    //   30: astore_1
    //   31: aload_0
    //   32: ldc -24
    //   34: aload_1
    //   35: invokevirtual 193	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   38: return
    //   39: astore_1
    //   40: goto +6 -> 46
    //   43: astore_1
    //   44: aconst_null
    //   45: astore_3
    //   46: aload_3
    //   47: ifnull +18 -> 65
    //   50: aload_3
    //   51: invokevirtual 230	java/io/InputStream:close	()V
    //   54: goto +11 -> 65
    //   57: astore_3
    //   58: aload_0
    //   59: ldc -24
    //   61: aload_3
    //   62: invokevirtual 193	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   65: aload_1
    //   66: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	this	zzco
    //   0	67	1	paramHttpURLConnection	HttpURLConnection
    //   16	2	2	i	int
    //   4	47	3	localInputStream	java.io.InputStream
    //   57	5	3	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   25	29	30	java/io/IOException
    //   5	11	39	finally
    //   11	17	39	finally
    //   0	5	43	finally
    //   50	54	57	java/io/IOException
  }
  
  /* Error */
  private final int zzb(URL paramURL, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 91	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_2
    //   6: invokestatic 91	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   9: pop
    //   10: aconst_null
    //   11: astore 5
    //   13: aconst_null
    //   14: astore 4
    //   16: aload_0
    //   17: invokevirtual 160	com/google/android/gms/internal/measurement/zzaq:getContext	()Landroid/content/Context;
    //   20: invokevirtual 166	android/content/Context:getPackageName	()Ljava/lang/String;
    //   23: pop
    //   24: new 234	java/io/ByteArrayOutputStream
    //   27: dup
    //   28: invokespecial 236	java/io/ByteArrayOutputStream:<init>	()V
    //   31: astore 6
    //   33: new 238	java/util/zip/GZIPOutputStream
    //   36: dup
    //   37: aload 6
    //   39: invokespecial 241	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   42: astore 7
    //   44: aload 7
    //   46: aload_2
    //   47: invokevirtual 242	java/util/zip/GZIPOutputStream:write	([B)V
    //   50: aload 7
    //   52: invokevirtual 243	java/util/zip/GZIPOutputStream:close	()V
    //   55: aload 6
    //   57: invokevirtual 244	java/io/ByteArrayOutputStream:close	()V
    //   60: aload 6
    //   62: invokevirtual 247	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   65: astore 6
    //   67: aload_0
    //   68: ldc -7
    //   70: aload 6
    //   72: arraylength
    //   73: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   76: aload 6
    //   78: arraylength
    //   79: i2l
    //   80: ldc2_w 250
    //   83: lmul
    //   84: aload_2
    //   85: arraylength
    //   86: i2l
    //   87: ldiv
    //   88: invokestatic 256	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   91: aload_1
    //   92: invokevirtual 259	com/google/android/gms/internal/measurement/zzaq:zza	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   95: aload 6
    //   97: arraylength
    //   98: aload_2
    //   99: arraylength
    //   100: if_icmple +21 -> 121
    //   103: aload_0
    //   104: ldc_w 261
    //   107: aload 6
    //   109: arraylength
    //   110: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   113: aload_2
    //   114: arraylength
    //   115: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   118: invokevirtual 264	com/google/android/gms/internal/measurement/zzaq:zzc	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   121: invokestatic 149	com/google/android/gms/internal/measurement/zzco:zzcg	()Z
    //   124: ifeq +50 -> 174
    //   127: new 16	java/lang/String
    //   130: dup
    //   131: aload_2
    //   132: invokespecial 154	java/lang/String:<init>	([B)V
    //   135: invokestatic 267	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   138: astore_2
    //   139: aload_2
    //   140: invokevirtual 268	java/lang/String:length	()I
    //   143: ifeq +13 -> 156
    //   146: ldc 14
    //   148: aload_2
    //   149: invokevirtual 272	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   152: astore_2
    //   153: goto +13 -> 166
    //   156: new 16	java/lang/String
    //   159: dup
    //   160: ldc 14
    //   162: invokespecial 275	java/lang/String:<init>	(Ljava/lang/String;)V
    //   165: astore_2
    //   166: aload_0
    //   167: ldc_w 277
    //   170: aload_2
    //   171: invokevirtual 156	com/google/android/gms/internal/measurement/zzaq:zza	(Ljava/lang/String;Ljava/lang/Object;)V
    //   174: aload_0
    //   175: aload_1
    //   176: invokespecial 102	com/google/android/gms/internal/measurement/zzco:zzb	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   179: astore_1
    //   180: aload_1
    //   181: iconst_1
    //   182: invokevirtual 170	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   185: aload_1
    //   186: ldc_w 279
    //   189: ldc_w 281
    //   192: invokevirtual 285	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   195: aload_1
    //   196: aload 6
    //   198: arraylength
    //   199: invokevirtual 174	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   202: aload_1
    //   203: invokevirtual 107	java/net/HttpURLConnection:connect	()V
    //   206: aload_1
    //   207: invokevirtual 178	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   210: astore_2
    //   211: aload_2
    //   212: aload 6
    //   214: invokevirtual 183	java/io/OutputStream:write	([B)V
    //   217: aload_2
    //   218: invokevirtual 188	java/io/OutputStream:close	()V
    //   221: aload_0
    //   222: aload_1
    //   223: invokespecial 110	com/google/android/gms/internal/measurement/zzco:zza	(Ljava/net/HttpURLConnection;)V
    //   226: aload_1
    //   227: invokevirtual 114	java/net/HttpURLConnection:getResponseCode	()I
    //   230: istore_3
    //   231: iload_3
    //   232: sipush 200
    //   235: if_icmpne +10 -> 245
    //   238: aload_0
    //   239: invokevirtual 118	com/google/android/gms/internal/measurement/zzaq:zzby	()Lcom/google/android/gms/internal/measurement/zzai;
    //   242: invokevirtual 123	com/google/android/gms/internal/measurement/zzai:zzbr	()V
    //   245: aload_0
    //   246: ldc -71
    //   248: iload_3
    //   249: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   252: invokevirtual 99	com/google/android/gms/internal/measurement/zzaq:zzb	(Ljava/lang/String;Ljava/lang/Object;)V
    //   255: aload_1
    //   256: ifnull +7 -> 263
    //   259: aload_1
    //   260: invokevirtual 134	java/net/HttpURLConnection:disconnect	()V
    //   263: iload_3
    //   264: ireturn
    //   265: astore 4
    //   267: aload_1
    //   268: astore 5
    //   270: aload 4
    //   272: astore_1
    //   273: aload_2
    //   274: astore 4
    //   276: aload 5
    //   278: astore_2
    //   279: goto +92 -> 371
    //   282: astore 5
    //   284: aload_2
    //   285: astore 4
    //   287: aload 5
    //   289: astore_2
    //   290: goto +34 -> 324
    //   293: astore 4
    //   295: aload_1
    //   296: astore_2
    //   297: aload 4
    //   299: astore_1
    //   300: aload 5
    //   302: astore 4
    //   304: goto +67 -> 371
    //   307: astore_2
    //   308: goto +16 -> 324
    //   311: astore_1
    //   312: aconst_null
    //   313: astore_2
    //   314: aload 5
    //   316: astore 4
    //   318: goto +53 -> 371
    //   321: astore_2
    //   322: aconst_null
    //   323: astore_1
    //   324: aload_0
    //   325: ldc_w 287
    //   328: aload_2
    //   329: invokevirtual 139	com/google/android/gms/internal/measurement/zzaq:zzd	(Ljava/lang/String;Ljava/lang/Object;)V
    //   332: aload 4
    //   334: ifnull +20 -> 354
    //   337: aload 4
    //   339: invokevirtual 188	java/io/OutputStream:close	()V
    //   342: goto +12 -> 354
    //   345: astore_2
    //   346: aload_0
    //   347: ldc_w 289
    //   350: aload_2
    //   351: invokevirtual 193	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   354: aload_1
    //   355: ifnull +7 -> 362
    //   358: aload_1
    //   359: invokevirtual 134	java/net/HttpURLConnection:disconnect	()V
    //   362: iconst_0
    //   363: ireturn
    //   364: astore 5
    //   366: aload_1
    //   367: astore_2
    //   368: aload 5
    //   370: astore_1
    //   371: aload 4
    //   373: ifnull +22 -> 395
    //   376: aload 4
    //   378: invokevirtual 188	java/io/OutputStream:close	()V
    //   381: goto +14 -> 395
    //   384: astore 4
    //   386: aload_0
    //   387: ldc_w 289
    //   390: aload 4
    //   392: invokevirtual 193	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   395: aload_2
    //   396: ifnull +7 -> 403
    //   399: aload_2
    //   400: invokevirtual 134	java/net/HttpURLConnection:disconnect	()V
    //   403: aload_1
    //   404: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	405	0	this	zzco
    //   0	405	1	paramURL	URL
    //   0	405	2	paramArrayOfByte	byte[]
    //   230	34	3	i	int
    //   14	1	4	localObject1	Object
    //   265	6	4	localObject2	Object
    //   274	12	4	arrayOfByte	byte[]
    //   293	5	4	localObject3	Object
    //   302	75	4	localIOException1	IOException
    //   384	7	4	localIOException2	IOException
    //   11	266	5	localURL	URL
    //   282	33	5	localIOException3	IOException
    //   364	5	5	localObject4	Object
    //   31	182	6	localObject5	Object
    //   42	9	7	localGZIPOutputStream	java.util.zip.GZIPOutputStream
    // Exception table:
    //   from	to	target	type
    //   211	221	265	finally
    //   211	221	282	java/io/IOException
    //   180	211	293	finally
    //   221	231	293	finally
    //   238	245	293	finally
    //   245	255	293	finally
    //   180	211	307	java/io/IOException
    //   221	231	307	java/io/IOException
    //   238	245	307	java/io/IOException
    //   245	255	307	java/io/IOException
    //   16	121	311	finally
    //   121	153	311	finally
    //   156	166	311	finally
    //   166	174	311	finally
    //   174	180	311	finally
    //   16	121	321	java/io/IOException
    //   121	153	321	java/io/IOException
    //   156	166	321	java/io/IOException
    //   166	174	321	java/io/IOException
    //   174	180	321	java/io/IOException
    //   337	342	345	java/io/IOException
    //   324	332	364	finally
    //   376	381	384	java/io/IOException
  }
  
  @VisibleForTesting
  private final HttpURLConnection zzb(URL paramURL)
    throws IOException
  {
    paramURL = paramURL.openConnection();
    if ((paramURL instanceof HttpURLConnection))
    {
      paramURL = (HttpURLConnection)paramURL;
      paramURL.setDefaultUseCaches(false);
      paramURL.setConnectTimeout(((Integer)zzcc.zzzn.get()).intValue());
      paramURL.setReadTimeout(((Integer)zzcc.zzzo.get()).intValue());
      paramURL.setInstanceFollowRedirects(false);
      paramURL.setRequestProperty("User-Agent", this.zzaay);
      paramURL.setDoInput(true);
      return paramURL;
    }
    throw new IOException("Failed to obtain http connection");
  }
  
  private final URL zzb(zzch paramzzch, String paramString)
  {
    String str;
    if (paramzzch.zzep())
    {
      str = zzbu.zzdz();
      paramzzch = zzbu.zzeb();
    }
    for (StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(paramzzch).length() + String.valueOf(paramString).length());; localStringBuilder = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(paramzzch).length() + String.valueOf(paramString).length()))
    {
      localStringBuilder.append(str);
      localStringBuilder.append(paramzzch);
      localStringBuilder.append("?");
      localStringBuilder.append(paramString);
      paramzzch = localStringBuilder.toString();
      break;
      str = zzbu.zzea();
      paramzzch = zzbu.zzeb();
    }
    try
    {
      paramzzch = new URL(paramzzch);
      return paramzzch;
    }
    catch (MalformedURLException paramzzch)
    {
      zze("Error trying to parse the hardcoded host url", paramzzch);
    }
    return null;
  }
  
  private final URL zzd(zzch paramzzch)
  {
    String str;
    if (paramzzch.zzep())
    {
      str = String.valueOf(zzbu.zzdz());
      paramzzch = String.valueOf(zzbu.zzeb());
      if (paramzzch.length() != 0)
      {
        paramzzch = str.concat(paramzzch);
        break label85;
      }
    }
    for (paramzzch = new String(str);; paramzzch = new String(str))
    {
      break label85;
      str = String.valueOf(zzbu.zzea());
      paramzzch = String.valueOf(zzbu.zzeb());
      if (paramzzch.length() != 0) {
        break;
      }
    }
    try
    {
      label85:
      paramzzch = new URL(paramzzch);
      return paramzzch;
    }
    catch (MalformedURLException paramzzch)
    {
      zze("Error trying to parse the hardcoded host url", paramzzch);
    }
    return null;
  }
  
  private final URL zzey()
  {
    Object localObject = String.valueOf(zzbu.zzdz());
    String str = String.valueOf((String)zzcc.zzzc.get());
    if (str.length() != 0) {
      localObject = ((String)localObject).concat(str);
    } else {
      localObject = new String((String)localObject);
    }
    try
    {
      localObject = new URL((String)localObject);
      return (URL)localObject;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      zze("Error trying to parse the hardcoded host url", localMalformedURLException);
    }
    return null;
  }
  
  @VisibleForTesting
  final String zza(zzch paramzzch, boolean paramBoolean)
  {
    Preconditions.checkNotNull(paramzzch);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      Iterator localIterator = paramzzch.zzcs().entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = (String)localEntry.getKey();
        if ((!"ht".equals(str)) && (!"qt".equals(str)) && (!"AppUID".equals(str)) && (!"z".equals(str)) && (!"_gmsv".equals(str))) {
          zza(localStringBuilder, str, (String)localEntry.getValue());
        }
      }
      zza(localStringBuilder, "ht", String.valueOf(paramzzch.zzen()));
      zza(localStringBuilder, "qt", String.valueOf(zzbt().currentTimeMillis() - paramzzch.zzen()));
      if (paramBoolean)
      {
        long l = paramzzch.zzeq();
        if (l != 0L) {
          paramzzch = String.valueOf(l);
        } else {
          paramzzch = String.valueOf(paramzzch.zzem());
        }
        zza(localStringBuilder, "z", paramzzch);
      }
      paramzzch = localStringBuilder.toString();
      return paramzzch;
    }
    catch (UnsupportedEncodingException paramzzch)
    {
      zze("Failed to encode name or value", paramzzch);
    }
    return null;
  }
  
  protected final void zzac()
  {
    zza("Network initialized. User agent", this.zzaay);
  }
  
  public final List<Long> zzb(List<zzch> paramList)
  {
    zzk.zzab();
    zzch();
    Preconditions.checkNotNull(paramList);
    int j;
    if ((!zzbv().zzec().isEmpty()) && (this.zzaaz.zzj(((Integer)zzcc.zzzl.get()).intValue() * 1000L)))
    {
      if (zzbk.zzz((String)zzcc.zzze.get()) != zzbk.zzxk) {
        i = 1;
      } else {
        i = 0;
      }
      j = i;
      if (zzbq.zzaa((String)zzcc.zzzf.get()) == zzbq.zzxv)
      {
        bool = true;
        break label115;
      }
    }
    else
    {
      j = 0;
    }
    boolean bool = false;
    int i = j;
    label115:
    Object localObject1;
    if (i != 0)
    {
      Preconditions.checkArgument(paramList.isEmpty() ^ true);
      zza("Uploading batched hits. compression, count", Boolean.valueOf(bool), Integer.valueOf(paramList.size()));
      localObject1 = new zzcp(this);
      localArrayList = new ArrayList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localObject2 = (zzch)paramList.next();
        if (!((zzcp)localObject1).zze((zzch)localObject2)) {
          break;
        }
        localArrayList.add(Long.valueOf(((zzch)localObject2).zzem()));
      }
      if (((zzcp)localObject1).zzfa() == 0) {
        return localArrayList;
      }
      paramList = zzey();
      if (paramList == null)
      {
        zzu("Failed to build batching endpoint url");
      }
      else
      {
        if (bool) {
          i = zzb(paramList, ((zzcp)localObject1).getPayload());
        } else {
          i = zza(paramList, ((zzcp)localObject1).getPayload());
        }
        if (200 == i)
        {
          zza("Batched upload completed. Hits batched", Integer.valueOf(((zzcp)localObject1).zzfa()));
          return localArrayList;
        }
        zza("Network error uploading hits. status code", Integer.valueOf(i));
        if (zzbv().zzec().contains(Integer.valueOf(i)))
        {
          zzt("Server instructed the client to stop batching");
          this.zzaaz.start();
        }
      }
      return Collections.emptyList();
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    Object localObject2 = paramList.iterator();
    label446:
    label486:
    do
    {
      if (!((Iterator)localObject2).hasNext()) {
        break;
      }
      zzch localzzch = (zzch)((Iterator)localObject2).next();
      Preconditions.checkNotNull(localzzch);
      paramList = zza(localzzch, localzzch.zzep() ^ true);
      if (paramList == null)
      {
        paramList = zzbu();
        localObject1 = "Error formatting hit for upload";
        paramList.zza(localzzch, (String)localObject1);
        i = 1;
      }
      else
      {
        if (paramList.length() <= ((Integer)zzcc.zzzd.get()).intValue())
        {
          paramList = zzb(localzzch, paramList);
          if (paramList == null)
          {
            paramList = "Failed to build collect GET endpoint url";
            zzu(paramList);
          }
          else if (zza(paramList) != 200) {}
        }
        else
        {
          do
          {
            break label446;
            paramList = zza(localzzch, false);
            if (paramList == null)
            {
              paramList = zzbu();
              localObject1 = "Error formatting hit for POST upload";
              break;
            }
            paramList = paramList.getBytes();
            if (paramList.length > ((Integer)zzcc.zzzi.get()).intValue())
            {
              paramList = zzbu();
              localObject1 = "Hit payload exceeds size limit";
              break;
            }
            localObject1 = zzd(localzzch);
            if (localObject1 == null)
            {
              paramList = "Failed to build collect POST endpoint url";
              break label486;
            }
          } while (zza((URL)localObject1, paramList) == 200);
        }
        i = 0;
      }
      if (i == 0) {
        break;
      }
      localArrayList.add(Long.valueOf(localzzch.zzem()));
    } while (localArrayList.size() < zzbu.zzdx());
    return localArrayList;
  }
  
  public final boolean zzex()
  {
    zzk.zzab();
    zzch();
    Object localObject = (ConnectivityManager)getContext().getSystemService("connectivity");
    try
    {
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
    }
    catch (SecurityException localSecurityException)
    {
      for (;;) {}
    }
    localObject = null;
    if ((localObject != null) && (((NetworkInfo)localObject).isConnected())) {
      return true;
    }
    zzq("No network connectivity");
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
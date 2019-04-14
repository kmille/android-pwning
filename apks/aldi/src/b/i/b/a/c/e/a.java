package b.i.b.a.c.e;

import b.i.b.a.c.g.b;
import b.i.b.a.c.g.d;
import b.i.b.a.c.g.f;
import b.i.b.a.c.g.g;
import b.i.b.a.c.g.h;
import b.i.b.a.c.g.i;
import b.i.b.a.c.g.i.a;
import b.i.b.a.c.g.i.b;
import b.i.b.a.c.g.i.c;
import b.i.b.a.c.g.i.c.a;
import b.i.b.a.c.g.i.d;
import b.i.b.a.c.g.j.a;
import b.i.b.a.c.g.j.b;
import b.i.b.a.c.g.n;
import b.i.b.a.c.g.o;
import b.i.b.a.c.g.q;
import b.i.b.a.c.g.r;
import b.i.b.a.c.g.s;
import b.i.b.a.c.g.t;
import b.i.b.a.c.g.w;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a
{
  public static final class a
    extends i
    implements a.b
  {
    public static s<a> a = new b() {};
    private static final a d;
    public int b;
    public List<a> c;
    private final d e;
    private int f;
    private byte g = -1;
    private int h = -1;
    
    static
    {
      a locala = new a();
      d = locala;
      locala.k();
    }
    
    private a()
    {
      this.e = d.b;
    }
    
    /* Error */
    private a(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 63	b/i/b/a/c/g/i:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 65	b/i/b/a/c/e/a$a:g	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 67	b/i/b/a/c/e/a$a:h	I
      //   14: aload_0
      //   15: invokespecial 61	b/i/b/a/c/e/a$a:k	()V
      //   18: invokestatic 81	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   21: astore 9
      //   23: aload 9
      //   25: iconst_1
      //   26: invokestatic 86	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   29: astore 10
      //   31: iconst_0
      //   32: istore 8
      //   34: iconst_0
      //   35: istore_3
      //   36: iload 8
      //   38: ifne +284 -> 322
      //   41: iload_3
      //   42: istore 5
      //   44: iload_3
      //   45: istore 6
      //   47: iload_3
      //   48: istore 7
      //   50: aload_1
      //   51: invokevirtual 91	b/i/b/a/c/g/e:a	()I
      //   54: istore 4
      //   56: iload 4
      //   58: ifeq +152 -> 210
      //   61: iload 4
      //   63: bipush 8
      //   65: if_icmpeq +106 -> 171
      //   68: iload 4
      //   70: bipush 18
      //   72: if_icmpeq +28 -> 100
      //   75: iload_3
      //   76: istore 5
      //   78: iload_3
      //   79: istore 6
      //   81: iload_3
      //   82: istore 7
      //   84: aload_0
      //   85: aload_1
      //   86: aload 10
      //   88: aload_2
      //   89: iload 4
      //   91: invokevirtual 94	b/i/b/a/c/e/a$a:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   94: ifne -58 -> 36
      //   97: goto +113 -> 210
      //   100: iload_3
      //   101: istore 4
      //   103: iload_3
      //   104: iconst_2
      //   105: iand
      //   106: iconst_2
      //   107: if_icmpeq +28 -> 135
      //   110: iload_3
      //   111: istore 5
      //   113: iload_3
      //   114: istore 6
      //   116: iload_3
      //   117: istore 7
      //   119: aload_0
      //   120: new 96	java/util/ArrayList
      //   123: dup
      //   124: invokespecial 97	java/util/ArrayList:<init>	()V
      //   127: putfield 99	b/i/b/a/c/e/a$a:c	Ljava/util/List;
      //   130: iload_3
      //   131: iconst_2
      //   132: ior
      //   133: istore 4
      //   135: iload 4
      //   137: istore 5
      //   139: iload 4
      //   141: istore 6
      //   143: iload 4
      //   145: istore 7
      //   147: aload_0
      //   148: getfield 99	b/i/b/a/c/e/a$a:c	Ljava/util/List;
      //   151: aload_1
      //   152: getstatic 100	b/i/b/a/c/e/a$a$a:a	Lb/i/b/a/c/g/s;
      //   155: aload_2
      //   156: invokevirtual 103	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   159: invokeinterface 109 2 0
      //   164: pop
      //   165: iload 4
      //   167: istore_3
      //   168: goto -132 -> 36
      //   171: iload_3
      //   172: istore 5
      //   174: iload_3
      //   175: istore 6
      //   177: iload_3
      //   178: istore 7
      //   180: aload_0
      //   181: aload_0
      //   182: getfield 111	b/i/b/a/c/e/a$a:f	I
      //   185: iconst_1
      //   186: ior
      //   187: putfield 111	b/i/b/a/c/e/a$a:f	I
      //   190: iload_3
      //   191: istore 5
      //   193: iload_3
      //   194: istore 6
      //   196: iload_3
      //   197: istore 7
      //   199: aload_0
      //   200: aload_1
      //   201: invokevirtual 113	b/i/b/a/c/g/e:d	()I
      //   204: putfield 115	b/i/b/a/c/e/a$a:b	I
      //   207: goto -171 -> 36
      //   210: iconst_1
      //   211: istore 8
      //   213: goto -177 -> 36
      //   216: astore_1
      //   217: goto +51 -> 268
      //   220: astore_1
      //   221: iload 6
      //   223: istore 5
      //   225: new 76	b/i/b/a/c/g/k
      //   228: dup
      //   229: aload_1
      //   230: invokevirtual 119	java/io/IOException:getMessage	()Ljava/lang/String;
      //   233: invokespecial 122	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   236: astore_1
      //   237: iload 6
      //   239: istore 5
      //   241: aload_1
      //   242: aload_0
      //   243: putfield 125	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   246: iload 6
      //   248: istore 5
      //   250: aload_1
      //   251: athrow
      //   252: astore_1
      //   253: iload 7
      //   255: istore 5
      //   257: aload_1
      //   258: aload_0
      //   259: putfield 125	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   262: iload 7
      //   264: istore 5
      //   266: aload_1
      //   267: athrow
      //   268: iload 5
      //   270: iconst_2
      //   271: iand
      //   272: iconst_2
      //   273: if_icmpne +14 -> 287
      //   276: aload_0
      //   277: aload_0
      //   278: getfield 99	b/i/b/a/c/e/a$a:c	Ljava/util/List;
      //   281: invokestatic 131	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   284: putfield 99	b/i/b/a/c/e/a$a:c	Ljava/util/List;
      //   287: aload 10
      //   289: invokevirtual 133	b/i/b/a/c/g/f:a	()V
      //   292: aload_0
      //   293: aload 9
      //   295: invokevirtual 138	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   298: putfield 73	b/i/b/a/c/e/a$a:e	Lb/i/b/a/c/g/d;
      //   301: goto +15 -> 316
      //   304: astore_1
      //   305: aload_0
      //   306: aload 9
      //   308: invokevirtual 138	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   311: putfield 73	b/i/b/a/c/e/a$a:e	Lb/i/b/a/c/g/d;
      //   314: aload_1
      //   315: athrow
      //   316: aload_0
      //   317: invokevirtual 141	b/i/b/a/c/e/a$a:w	()V
      //   320: aload_1
      //   321: athrow
      //   322: iload_3
      //   323: iconst_2
      //   324: iand
      //   325: iconst_2
      //   326: if_icmpne +14 -> 340
      //   329: aload_0
      //   330: aload_0
      //   331: getfield 99	b/i/b/a/c/e/a$a:c	Ljava/util/List;
      //   334: invokestatic 131	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   337: putfield 99	b/i/b/a/c/e/a$a:c	Ljava/util/List;
      //   340: aload 10
      //   342: invokevirtual 133	b/i/b/a/c/g/f:a	()V
      //   345: aload_0
      //   346: aload 9
      //   348: invokevirtual 138	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   351: putfield 73	b/i/b/a/c/e/a$a:e	Lb/i/b/a/c/g/d;
      //   354: goto +15 -> 369
      //   357: astore_1
      //   358: aload_0
      //   359: aload 9
      //   361: invokevirtual 138	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   364: putfield 73	b/i/b/a/c/e/a$a:e	Lb/i/b/a/c/g/d;
      //   367: aload_1
      //   368: athrow
      //   369: aload_0
      //   370: invokevirtual 141	b/i/b/a/c/e/a$a:w	()V
      //   373: return
      //   374: astore_2
      //   375: goto -83 -> 292
      //   378: astore_1
      //   379: goto -34 -> 345
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	382	0	this	a
      //   0	382	1	parame	b.i.b.a.c.g.e
      //   0	382	2	paramg	g
      //   35	290	3	i	int
      //   54	112	4	j	int
      //   42	230	5	k	int
      //   45	202	6	m	int
      //   48	215	7	n	int
      //   32	180	8	i1	int
      //   21	339	9	localb	b.i.b.a.c.g.d.b
      //   29	312	10	localf	f
      // Exception table:
      //   from	to	target	type
      //   50	56	216	finally
      //   84	97	216	finally
      //   119	130	216	finally
      //   147	165	216	finally
      //   180	190	216	finally
      //   199	207	216	finally
      //   225	237	216	finally
      //   241	246	216	finally
      //   250	252	216	finally
      //   257	262	216	finally
      //   266	268	216	finally
      //   50	56	220	java/io/IOException
      //   84	97	220	java/io/IOException
      //   119	130	220	java/io/IOException
      //   147	165	220	java/io/IOException
      //   180	190	220	java/io/IOException
      //   199	207	220	java/io/IOException
      //   50	56	252	b/i/b/a/c/g/k
      //   84	97	252	b/i/b/a/c/g/k
      //   119	130	252	b/i/b/a/c/g/k
      //   147	165	252	b/i/b/a/c/g/k
      //   180	190	252	b/i/b/a/c/g/k
      //   199	207	252	b/i/b/a/c/g/k
      //   287	292	304	finally
      //   340	345	357	finally
      //   287	292	374	java/io/IOException
      //   340	345	378	java/io/IOException
    }
    
    private a(i.a parama)
    {
      super();
      this.e = parama.a;
    }
    
    public static c a(a parama)
    {
      return c.g().a(parama);
    }
    
    public static a a()
    {
      return d;
    }
    
    private void k()
    {
      this.b = 0;
      this.c = Collections.emptyList();
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      if ((this.f & 0x1) == 1) {
        paramf.a(1, this.b);
      }
      int i = 0;
      while (i < this.c.size())
      {
        paramf.a(2, (q)this.c.get(i));
        i += 1;
      }
      paramf.c(this.e);
    }
    
    public final s<a> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.f & 0x1) == 1;
    }
    
    public final int d()
    {
      return this.c.size();
    }
    
    public final boolean e()
    {
      int i = this.g;
      if (i == 1) {
        return true;
      }
      if (i == 0) {
        return false;
      }
      if (!c())
      {
        this.g = 0;
        return false;
      }
      i = 0;
      while (i < d())
      {
        if (!((a)this.c.get(i)).e())
        {
          this.g = 0;
          return false;
        }
        i += 1;
      }
      this.g = 1;
      return true;
    }
    
    public final int f()
    {
      int i = this.h;
      if (i != -1) {
        return i;
      }
      i = this.f;
      int j = 0;
      if ((i & 0x1) == 1) {
        i = f.c(1, this.b) + 0;
      } else {
        i = 0;
      }
      while (j < this.c.size())
      {
        i += f.c(2, (q)this.c.get(j));
        j += 1;
      }
      i += this.e.a();
      this.h = i;
      return i;
    }
    
    public final c g()
    {
      return c.g().a(this);
    }
    
    public static final class a
      extends i
      implements a.a.b
    {
      public static s<a> a = new b() {};
      private static final a d;
      public int b;
      public b c;
      private final d e;
      private int f;
      private byte g = -1;
      private int h = -1;
      
      static
      {
        a locala = new a();
        d = locala;
        locala.g();
      }
      
      private a()
      {
        this.e = d.b;
      }
      
      /* Error */
      private a(b.i.b.a.c.g.e parame, g paramg)
        throws b.i.b.a.c.g.k
      {
        // Byte code:
        //   0: aload_0
        //   1: invokespecial 55	b/i/b/a/c/g/i:<init>	()V
        //   4: aload_0
        //   5: iconst_m1
        //   6: putfield 57	b/i/b/a/c/e/a$a$a:g	B
        //   9: aload_0
        //   10: iconst_m1
        //   11: putfield 59	b/i/b/a/c/e/a$a$a:h	I
        //   14: aload_0
        //   15: invokespecial 53	b/i/b/a/c/e/a$a$a:g	()V
        //   18: invokestatic 73	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
        //   21: astore 6
        //   23: aload 6
        //   25: iconst_1
        //   26: invokestatic 78	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
        //   29: astore 7
        //   31: iconst_0
        //   32: istore_3
        //   33: iload_3
        //   34: ifne +211 -> 245
        //   37: aload_1
        //   38: invokevirtual 83	b/i/b/a/c/g/e:a	()I
        //   41: istore 4
        //   43: iload 4
        //   45: ifeq +128 -> 173
        //   48: iload 4
        //   50: bipush 8
        //   52: if_icmpeq +100 -> 152
        //   55: iload 4
        //   57: bipush 18
        //   59: if_icmpeq +19 -> 78
        //   62: aload_0
        //   63: aload_1
        //   64: aload 7
        //   66: aload_2
        //   67: iload 4
        //   69: invokevirtual 86	b/i/b/a/c/e/a$a$a:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
        //   72: ifne -39 -> 33
        //   75: goto +98 -> 173
        //   78: aconst_null
        //   79: astore 5
        //   81: aload_0
        //   82: getfield 88	b/i/b/a/c/e/a$a$a:f	I
        //   85: iconst_2
        //   86: iand
        //   87: iconst_2
        //   88: if_icmpne +12 -> 100
        //   91: aload_0
        //   92: getfield 90	b/i/b/a/c/e/a$a$a:c	Lb/i/b/a/c/e/a$a$a$b;
        //   95: invokestatic 93	b/i/b/a/c/e/a$a$a$b:a	(Lb/i/b/a/c/e/a$a$a$b;)Lb/i/b/a/c/e/a$a$a$b$a;
        //   98: astore 5
        //   100: aload_0
        //   101: aload_1
        //   102: getstatic 94	b/i/b/a/c/e/a$a$a$b:a	Lb/i/b/a/c/g/s;
        //   105: aload_2
        //   106: invokevirtual 97	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
        //   109: checkcast 17	b/i/b/a/c/e/a$a$a$b
        //   112: putfield 90	b/i/b/a/c/e/a$a$a:c	Lb/i/b/a/c/e/a$a$a$b;
        //   115: aload 5
        //   117: ifnull +22 -> 139
        //   120: aload 5
        //   122: aload_0
        //   123: getfield 90	b/i/b/a/c/e/a$a$a:c	Lb/i/b/a/c/e/a$a$a$b;
        //   126: invokevirtual 98	b/i/b/a/c/e/a$a$a$b$a:a	(Lb/i/b/a/c/e/a$a$a$b;)Lb/i/b/a/c/e/a$a$a$b$a;
        //   129: pop
        //   130: aload_0
        //   131: aload 5
        //   133: invokevirtual 101	b/i/b/a/c/e/a$a$a$b$a:f	()Lb/i/b/a/c/e/a$a$a$b;
        //   136: putfield 90	b/i/b/a/c/e/a$a$a:c	Lb/i/b/a/c/e/a$a$a$b;
        //   139: aload_0
        //   140: aload_0
        //   141: getfield 88	b/i/b/a/c/e/a$a$a:f	I
        //   144: iconst_2
        //   145: ior
        //   146: putfield 88	b/i/b/a/c/e/a$a$a:f	I
        //   149: goto -116 -> 33
        //   152: aload_0
        //   153: aload_0
        //   154: getfield 88	b/i/b/a/c/e/a$a$a:f	I
        //   157: iconst_1
        //   158: ior
        //   159: putfield 88	b/i/b/a/c/e/a$a$a:f	I
        //   162: aload_0
        //   163: aload_1
        //   164: invokevirtual 103	b/i/b/a/c/g/e:d	()I
        //   167: putfield 105	b/i/b/a/c/e/a$a$a:b	I
        //   170: goto -137 -> 33
        //   173: iconst_1
        //   174: istore_3
        //   175: goto -142 -> 33
        //   178: astore_1
        //   179: goto +31 -> 210
        //   182: astore_1
        //   183: new 68	b/i/b/a/c/g/k
        //   186: dup
        //   187: aload_1
        //   188: invokevirtual 109	java/io/IOException:getMessage	()Ljava/lang/String;
        //   191: invokespecial 112	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
        //   194: astore_1
        //   195: aload_1
        //   196: aload_0
        //   197: putfield 115	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   200: aload_1
        //   201: athrow
        //   202: astore_1
        //   203: aload_1
        //   204: aload_0
        //   205: putfield 115	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   208: aload_1
        //   209: athrow
        //   210: aload 7
        //   212: invokevirtual 117	b/i/b/a/c/g/f:a	()V
        //   215: aload_0
        //   216: aload 6
        //   218: invokevirtual 122	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
        //   221: putfield 65	b/i/b/a/c/e/a$a$a:e	Lb/i/b/a/c/g/d;
        //   224: goto +15 -> 239
        //   227: astore_1
        //   228: aload_0
        //   229: aload 6
        //   231: invokevirtual 122	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
        //   234: putfield 65	b/i/b/a/c/e/a$a$a:e	Lb/i/b/a/c/g/d;
        //   237: aload_1
        //   238: athrow
        //   239: aload_0
        //   240: invokevirtual 125	b/i/b/a/c/e/a$a$a:w	()V
        //   243: aload_1
        //   244: athrow
        //   245: aload 7
        //   247: invokevirtual 117	b/i/b/a/c/g/f:a	()V
        //   250: aload_0
        //   251: aload 6
        //   253: invokevirtual 122	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
        //   256: putfield 65	b/i/b/a/c/e/a$a$a:e	Lb/i/b/a/c/g/d;
        //   259: goto +15 -> 274
        //   262: astore_1
        //   263: aload_0
        //   264: aload 6
        //   266: invokevirtual 122	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
        //   269: putfield 65	b/i/b/a/c/e/a$a$a:e	Lb/i/b/a/c/g/d;
        //   272: aload_1
        //   273: athrow
        //   274: aload_0
        //   275: invokevirtual 125	b/i/b/a/c/e/a$a$a:w	()V
        //   278: return
        //   279: astore_2
        //   280: goto -65 -> 215
        //   283: astore_1
        //   284: goto -34 -> 250
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	287	0	this	a
        //   0	287	1	parame	b.i.b.a.c.g.e
        //   0	287	2	paramg	g
        //   32	143	3	i	int
        //   41	27	4	j	int
        //   79	53	5	locala	a.a.a.b.a
        //   21	244	6	localb	b.i.b.a.c.g.d.b
        //   29	217	7	localf	f
        // Exception table:
        //   from	to	target	type
        //   37	43	178	finally
        //   62	75	178	finally
        //   81	100	178	finally
        //   100	115	178	finally
        //   120	139	178	finally
        //   139	149	178	finally
        //   152	170	178	finally
        //   183	202	178	finally
        //   203	210	178	finally
        //   37	43	182	java/io/IOException
        //   62	75	182	java/io/IOException
        //   81	100	182	java/io/IOException
        //   100	115	182	java/io/IOException
        //   120	139	182	java/io/IOException
        //   139	149	182	java/io/IOException
        //   152	170	182	java/io/IOException
        //   37	43	202	b/i/b/a/c/g/k
        //   62	75	202	b/i/b/a/c/g/k
        //   81	100	202	b/i/b/a/c/g/k
        //   100	115	202	b/i/b/a/c/g/k
        //   120	139	202	b/i/b/a/c/g/k
        //   139	149	202	b/i/b/a/c/g/k
        //   152	170	202	b/i/b/a/c/g/k
        //   210	215	227	finally
        //   245	250	262	finally
        //   210	215	279	java/io/IOException
        //   245	250	283	java/io/IOException
      }
      
      private a(i.a parama)
      {
        super();
        this.e = parama.a;
      }
      
      public static a a()
      {
        return d;
      }
      
      private void g()
      {
        this.b = 0;
        this.c = b.a();
      }
      
      public final void a(f paramf)
        throws IOException
      {
        f();
        if ((this.f & 0x1) == 1) {
          paramf.a(1, this.b);
        }
        if ((this.f & 0x2) == 2) {
          paramf.a(2, this.c);
        }
        paramf.c(this.e);
      }
      
      public final s<a> b()
      {
        return a;
      }
      
      public final boolean c()
      {
        return (this.f & 0x1) == 1;
      }
      
      public final boolean d()
      {
        return (this.f & 0x2) == 2;
      }
      
      public final boolean e()
      {
        int i = this.g;
        if (i == 1) {
          return true;
        }
        if (i == 0) {
          return false;
        }
        if (!c())
        {
          this.g = 0;
          return false;
        }
        if (!d())
        {
          this.g = 0;
          return false;
        }
        if (!this.c.e())
        {
          this.g = 0;
          return false;
        }
        this.g = 1;
        return true;
      }
      
      public final int f()
      {
        int i = this.h;
        if (i != -1) {
          return i;
        }
        int j = this.f;
        i = 0;
        if ((j & 0x1) == 1) {
          i = 0 + f.c(1, this.b);
        }
        j = i;
        if ((this.f & 0x2) == 2) {
          j = i + f.c(2, this.c);
        }
        i = j + this.e.a();
        this.h = i;
        return i;
      }
      
      public static final class a
        extends i.a<a.a.a, a>
        implements a.a.b
      {
        private int b;
        private int c;
        private a.a.a.b d = a.a.a.b.a();
        
        private a a(int paramInt)
        {
          this.b |= 0x1;
          this.c = paramInt;
          return this;
        }
        
        private a a(a.a.a.b paramb)
        {
          a.a.a.b localb = paramb;
          if ((this.b & 0x2) == 2)
          {
            localb = paramb;
            if (this.d != a.a.a.b.a()) {
              localb = a.a.a.b.a(this.d).a(paramb).f();
            }
          }
          this.d = localb;
          this.b |= 0x2;
          return this;
        }
        
        /* Error */
        private a c(b.i.b.a.c.g.e parame, g paramg)
          throws IOException
        {
          // Byte code:
          //   0: aconst_null
          //   1: astore_3
          //   2: getstatic 54	b/i/b/a/c/e/a$a$a:a	Lb/i/b/a/c/g/s;
          //   5: aload_1
          //   6: aload_2
          //   7: invokeinterface 59 3 0
          //   12: checkcast 14	b/i/b/a/c/e/a$a$a
          //   15: astore_1
          //   16: aload_0
          //   17: aload_1
          //   18: invokevirtual 62	b/i/b/a/c/e/a$a$a$a:a	(Lb/i/b/a/c/e/a$a$a;)Lb/i/b/a/c/e/a$a$a$a;
          //   21: pop
          //   22: aload_0
          //   23: areturn
          //   24: astore_2
          //   25: aload_3
          //   26: astore_1
          //   27: goto +15 -> 42
          //   30: astore_2
          //   31: aload_2
          //   32: getfield 65	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
          //   35: checkcast 14	b/i/b/a/c/e/a$a$a
          //   38: astore_1
          //   39: aload_2
          //   40: athrow
          //   41: astore_2
          //   42: aload_1
          //   43: ifnull +9 -> 52
          //   46: aload_0
          //   47: aload_1
          //   48: invokevirtual 62	b/i/b/a/c/e/a$a$a$a:a	(Lb/i/b/a/c/e/a$a$a;)Lb/i/b/a/c/e/a$a$a$a;
          //   51: pop
          //   52: aload_2
          //   53: athrow
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	54	0	this	a
          //   0	54	1	parame	b.i.b.a.c.g.e
          //   0	54	2	paramg	g
          //   1	25	3	localObject	Object
          // Exception table:
          //   from	to	target	type
          //   2	16	24	finally
          //   31	39	24	finally
          //   2	16	30	b/i/b/a/c/g/k
          //   39	41	41	finally
        }
        
        private a g()
        {
          return new a().a(h());
        }
        
        private a.a.a h()
        {
          int i = 0;
          a.a.a locala = new a.a.a(this, (byte)0);
          int k = this.b;
          if ((k & 0x1) == 1) {
            i = 1;
          }
          a.a.a.a(locala, this.c);
          int j = i;
          if ((k & 0x2) == 2) {
            j = i | 0x2;
          }
          a.a.a.a(locala, this.d);
          a.a.a.b(locala, j);
          return locala;
        }
        
        public final a a(a.a.a parama)
        {
          if (parama == a.a.a.a()) {
            return this;
          }
          if (parama.c()) {
            a(parama.b);
          }
          if (parama.d()) {
            a(parama.c);
          }
          this.a = this.a.a(a.a.a.a(parama));
          return this;
        }
        
        public final boolean e()
        {
          int i;
          if ((this.b & 0x1) == 1) {
            i = 1;
          } else {
            i = 0;
          }
          if (i == 0) {
            return false;
          }
          if ((this.b & 0x2) == 2) {
            i = 1;
          } else {
            i = 0;
          }
          if (i == 0) {
            return false;
          }
          return this.d.e();
        }
      }
      
      public static final class b
        extends i
        implements a.a.a.c
      {
        public static s<b> a = new b() {};
        private static final b m;
        public b b;
        public long c;
        public float d;
        public double e;
        public int f;
        public int g;
        public int h;
        public a.a i;
        public List<b> j;
        public int k;
        public int l;
        private final d n;
        private int o;
        private byte p = -1;
        private int q = -1;
        
        static
        {
          b localb = new b();
          m = localb;
          localb.r();
        }
        
        private b()
        {
          this.n = d.b;
        }
        
        /* Error */
        private b(b.i.b.a.c.g.e parame, g paramg)
          throws b.i.b.a.c.g.k
        {
          // Byte code:
          //   0: aload_0
          //   1: invokespecial 65	b/i/b/a/c/g/i:<init>	()V
          //   4: aload_0
          //   5: iconst_m1
          //   6: putfield 67	b/i/b/a/c/e/a$a$a$b:p	B
          //   9: aload_0
          //   10: iconst_m1
          //   11: putfield 69	b/i/b/a/c/e/a$a$a$b:q	I
          //   14: aload_0
          //   15: invokespecial 63	b/i/b/a/c/e/a$a$a$b:r	()V
          //   18: invokestatic 83	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
          //   21: astore 12
          //   23: aload 12
          //   25: iconst_1
          //   26: invokestatic 88	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
          //   29: astore 13
          //   31: iconst_0
          //   32: istore 8
          //   34: iconst_0
          //   35: istore_3
          //   36: iload 8
          //   38: ifne +922 -> 960
          //   41: iload_3
          //   42: istore 5
          //   44: iload_3
          //   45: istore 6
          //   47: iload_3
          //   48: istore 7
          //   50: aload_1
          //   51: invokevirtual 93	b/i/b/a/c/g/e:a	()I
          //   54: istore 4
          //   56: iload 4
          //   58: lookupswitch	default:+966->1024, 0:+778->836, 8:+670->728, 16:+628->686, 29:+586->644, 33:+543->601, 40:+503->561, 48:+463->521, 56:+423->481, 66:+289->347, 74:+212->270, 80:+171->229, 88:+130->188
          //   164: iload_3
          //   165: istore 5
          //   167: iload_3
          //   168: istore 6
          //   170: iload_3
          //   171: istore 7
          //   173: aload_0
          //   174: aload_1
          //   175: aload 13
          //   177: aload_2
          //   178: iload 4
          //   180: invokevirtual 96	b/i/b/a/c/e/a$a$a$b:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
          //   183: istore 10
          //   185: goto +657 -> 842
          //   188: iload_3
          //   189: istore 5
          //   191: iload_3
          //   192: istore 6
          //   194: iload_3
          //   195: istore 7
          //   197: aload_0
          //   198: aload_0
          //   199: getfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   202: sipush 256
          //   205: ior
          //   206: putfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   209: iload_3
          //   210: istore 5
          //   212: iload_3
          //   213: istore 6
          //   215: iload_3
          //   216: istore 7
          //   218: aload_0
          //   219: aload_1
          //   220: invokevirtual 100	b/i/b/a/c/g/e:d	()I
          //   223: putfield 102	b/i/b/a/c/e/a$a$a$b:k	I
          //   226: goto -190 -> 36
          //   229: iload_3
          //   230: istore 5
          //   232: iload_3
          //   233: istore 6
          //   235: iload_3
          //   236: istore 7
          //   238: aload_0
          //   239: aload_0
          //   240: getfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   243: sipush 512
          //   246: ior
          //   247: putfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   250: iload_3
          //   251: istore 5
          //   253: iload_3
          //   254: istore 6
          //   256: iload_3
          //   257: istore 7
          //   259: aload_0
          //   260: aload_1
          //   261: invokevirtual 100	b/i/b/a/c/g/e:d	()I
          //   264: putfield 104	b/i/b/a/c/e/a$a$a$b:l	I
          //   267: goto -231 -> 36
          //   270: iload_3
          //   271: istore 4
          //   273: iload_3
          //   274: sipush 256
          //   277: iand
          //   278: sipush 256
          //   281: if_icmpeq +30 -> 311
          //   284: iload_3
          //   285: istore 5
          //   287: iload_3
          //   288: istore 6
          //   290: iload_3
          //   291: istore 7
          //   293: aload_0
          //   294: new 106	java/util/ArrayList
          //   297: dup
          //   298: invokespecial 107	java/util/ArrayList:<init>	()V
          //   301: putfield 109	b/i/b/a/c/e/a$a$a$b:j	Ljava/util/List;
          //   304: iload_3
          //   305: sipush 256
          //   308: ior
          //   309: istore 4
          //   311: iload 4
          //   313: istore 5
          //   315: iload 4
          //   317: istore 6
          //   319: iload 4
          //   321: istore 7
          //   323: aload_0
          //   324: getfield 109	b/i/b/a/c/e/a$a$a$b:j	Ljava/util/List;
          //   327: aload_1
          //   328: getstatic 57	b/i/b/a/c/e/a$a$a$b:a	Lb/i/b/a/c/g/s;
          //   331: aload_2
          //   332: invokevirtual 112	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
          //   335: invokeinterface 118 2 0
          //   340: pop
          //   341: iload 4
          //   343: istore_3
          //   344: goto -308 -> 36
          //   347: aconst_null
          //   348: astore 11
          //   350: iload_3
          //   351: istore 5
          //   353: iload_3
          //   354: istore 6
          //   356: iload_3
          //   357: istore 7
          //   359: aload_0
          //   360: getfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   363: sipush 128
          //   366: iand
          //   367: sipush 128
          //   370: if_icmpne +21 -> 391
          //   373: iload_3
          //   374: istore 5
          //   376: iload_3
          //   377: istore 6
          //   379: iload_3
          //   380: istore 7
          //   382: aload_0
          //   383: getfield 120	b/i/b/a/c/e/a$a$a$b:i	Lb/i/b/a/c/e/a$a;
          //   386: invokevirtual 123	b/i/b/a/c/e/a$a:g	()Lb/i/b/a/c/e/a$a$c;
          //   389: astore 11
          //   391: iload_3
          //   392: istore 5
          //   394: iload_3
          //   395: istore 6
          //   397: iload_3
          //   398: istore 7
          //   400: aload_0
          //   401: aload_1
          //   402: getstatic 124	b/i/b/a/c/e/a$a:a	Lb/i/b/a/c/g/s;
          //   405: aload_2
          //   406: invokevirtual 112	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
          //   409: checkcast 8	b/i/b/a/c/e/a$a
          //   412: putfield 120	b/i/b/a/c/e/a$a$a$b:i	Lb/i/b/a/c/e/a$a;
          //   415: aload 11
          //   417: ifnull +40 -> 457
          //   420: iload_3
          //   421: istore 5
          //   423: iload_3
          //   424: istore 6
          //   426: iload_3
          //   427: istore 7
          //   429: aload 11
          //   431: aload_0
          //   432: getfield 120	b/i/b/a/c/e/a$a$a$b:i	Lb/i/b/a/c/e/a$a;
          //   435: invokevirtual 129	b/i/b/a/c/e/a$a$c:a	(Lb/i/b/a/c/e/a$a;)Lb/i/b/a/c/e/a$a$c;
          //   438: pop
          //   439: iload_3
          //   440: istore 5
          //   442: iload_3
          //   443: istore 6
          //   445: iload_3
          //   446: istore 7
          //   448: aload_0
          //   449: aload 11
          //   451: invokevirtual 132	b/i/b/a/c/e/a$a$c:f	()Lb/i/b/a/c/e/a$a;
          //   454: putfield 120	b/i/b/a/c/e/a$a$a$b:i	Lb/i/b/a/c/e/a$a;
          //   457: iload_3
          //   458: istore 5
          //   460: iload_3
          //   461: istore 6
          //   463: iload_3
          //   464: istore 7
          //   466: aload_0
          //   467: aload_0
          //   468: getfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   471: sipush 128
          //   474: ior
          //   475: putfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   478: goto -442 -> 36
          //   481: iload_3
          //   482: istore 5
          //   484: iload_3
          //   485: istore 6
          //   487: iload_3
          //   488: istore 7
          //   490: aload_0
          //   491: aload_0
          //   492: getfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   495: bipush 64
          //   497: ior
          //   498: putfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   501: iload_3
          //   502: istore 5
          //   504: iload_3
          //   505: istore 6
          //   507: iload_3
          //   508: istore 7
          //   510: aload_0
          //   511: aload_1
          //   512: invokevirtual 100	b/i/b/a/c/g/e:d	()I
          //   515: putfield 134	b/i/b/a/c/e/a$a$a$b:h	I
          //   518: goto -482 -> 36
          //   521: iload_3
          //   522: istore 5
          //   524: iload_3
          //   525: istore 6
          //   527: iload_3
          //   528: istore 7
          //   530: aload_0
          //   531: aload_0
          //   532: getfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   535: bipush 32
          //   537: ior
          //   538: putfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   541: iload_3
          //   542: istore 5
          //   544: iload_3
          //   545: istore 6
          //   547: iload_3
          //   548: istore 7
          //   550: aload_0
          //   551: aload_1
          //   552: invokevirtual 100	b/i/b/a/c/g/e:d	()I
          //   555: putfield 136	b/i/b/a/c/e/a$a$a$b:g	I
          //   558: goto -522 -> 36
          //   561: iload_3
          //   562: istore 5
          //   564: iload_3
          //   565: istore 6
          //   567: iload_3
          //   568: istore 7
          //   570: aload_0
          //   571: aload_0
          //   572: getfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   575: bipush 16
          //   577: ior
          //   578: putfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   581: iload_3
          //   582: istore 5
          //   584: iload_3
          //   585: istore 6
          //   587: iload_3
          //   588: istore 7
          //   590: aload_0
          //   591: aload_1
          //   592: invokevirtual 100	b/i/b/a/c/g/e:d	()I
          //   595: putfield 138	b/i/b/a/c/e/a$a$a$b:f	I
          //   598: goto -562 -> 36
          //   601: iload_3
          //   602: istore 5
          //   604: iload_3
          //   605: istore 6
          //   607: iload_3
          //   608: istore 7
          //   610: aload_0
          //   611: aload_0
          //   612: getfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   615: bipush 8
          //   617: ior
          //   618: putfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   621: iload_3
          //   622: istore 5
          //   624: iload_3
          //   625: istore 6
          //   627: iload_3
          //   628: istore 7
          //   630: aload_0
          //   631: aload_1
          //   632: invokevirtual 141	b/i/b/a/c/g/e:g	()J
          //   635: invokestatic 147	java/lang/Double:longBitsToDouble	(J)D
          //   638: putfield 149	b/i/b/a/c/e/a$a$a$b:e	D
          //   641: goto -605 -> 36
          //   644: iload_3
          //   645: istore 5
          //   647: iload_3
          //   648: istore 6
          //   650: iload_3
          //   651: istore 7
          //   653: aload_0
          //   654: aload_0
          //   655: getfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   658: iconst_4
          //   659: ior
          //   660: putfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   663: iload_3
          //   664: istore 5
          //   666: iload_3
          //   667: istore 6
          //   669: iload_3
          //   670: istore 7
          //   672: aload_0
          //   673: aload_1
          //   674: invokevirtual 151	b/i/b/a/c/g/e:f	()I
          //   677: invokestatic 157	java/lang/Float:intBitsToFloat	(I)F
          //   680: putfield 159	b/i/b/a/c/e/a$a$a$b:d	F
          //   683: goto -647 -> 36
          //   686: iload_3
          //   687: istore 5
          //   689: iload_3
          //   690: istore 6
          //   692: iload_3
          //   693: istore 7
          //   695: aload_0
          //   696: aload_0
          //   697: getfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   700: iconst_2
          //   701: ior
          //   702: putfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   705: iload_3
          //   706: istore 5
          //   708: iload_3
          //   709: istore 6
          //   711: iload_3
          //   712: istore 7
          //   714: aload_0
          //   715: aload_1
          //   716: invokevirtual 161	b/i/b/a/c/g/e:e	()J
          //   719: invokestatic 164	b/i/b/a/c/g/e:a	(J)J
          //   722: putfield 166	b/i/b/a/c/e/a$a$a$b:c	J
          //   725: goto -689 -> 36
          //   728: iload_3
          //   729: istore 5
          //   731: iload_3
          //   732: istore 6
          //   734: iload_3
          //   735: istore 7
          //   737: aload_1
          //   738: invokevirtual 100	b/i/b/a/c/g/e:d	()I
          //   741: istore 9
          //   743: iload_3
          //   744: istore 5
          //   746: iload_3
          //   747: istore 6
          //   749: iload_3
          //   750: istore 7
          //   752: iload 9
          //   754: invokestatic 169	b/i/b/a/c/e/a$a$a$b$b:a	(I)Lb/i/b/a/c/e/a$a$a$b$b;
          //   757: astore 11
          //   759: aload 11
          //   761: ifnonnull +38 -> 799
          //   764: iload_3
          //   765: istore 5
          //   767: iload_3
          //   768: istore 6
          //   770: iload_3
          //   771: istore 7
          //   773: aload 13
          //   775: iload 4
          //   777: invokevirtual 172	b/i/b/a/c/g/f:e	(I)V
          //   780: iload_3
          //   781: istore 5
          //   783: iload_3
          //   784: istore 6
          //   786: iload_3
          //   787: istore 7
          //   789: aload 13
          //   791: iload 9
          //   793: invokevirtual 172	b/i/b/a/c/g/f:e	(I)V
          //   796: goto -760 -> 36
          //   799: iload_3
          //   800: istore 5
          //   802: iload_3
          //   803: istore 6
          //   805: iload_3
          //   806: istore 7
          //   808: aload_0
          //   809: aload_0
          //   810: getfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   813: iconst_1
          //   814: ior
          //   815: putfield 98	b/i/b/a/c/e/a$a$a$b:o	I
          //   818: iload_3
          //   819: istore 5
          //   821: iload_3
          //   822: istore 6
          //   824: iload_3
          //   825: istore 7
          //   827: aload_0
          //   828: aload 11
          //   830: putfield 174	b/i/b/a/c/e/a$a$a$b:b	Lb/i/b/a/c/e/a$a$a$b$b;
          //   833: goto -797 -> 36
          //   836: iconst_1
          //   837: istore 8
          //   839: goto -803 -> 36
          //   842: iload 10
          //   844: ifne -808 -> 36
          //   847: goto -11 -> 836
          //   850: astore_1
          //   851: goto +51 -> 902
          //   854: astore_1
          //   855: iload 6
          //   857: istore 5
          //   859: new 78	b/i/b/a/c/g/k
          //   862: dup
          //   863: aload_1
          //   864: invokevirtual 178	java/io/IOException:getMessage	()Ljava/lang/String;
          //   867: invokespecial 181	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
          //   870: astore_1
          //   871: iload 6
          //   873: istore 5
          //   875: aload_1
          //   876: aload_0
          //   877: putfield 184	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
          //   880: iload 6
          //   882: istore 5
          //   884: aload_1
          //   885: athrow
          //   886: astore_1
          //   887: iload 7
          //   889: istore 5
          //   891: aload_1
          //   892: aload_0
          //   893: putfield 184	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
          //   896: iload 7
          //   898: istore 5
          //   900: aload_1
          //   901: athrow
          //   902: iload 5
          //   904: sipush 256
          //   907: iand
          //   908: sipush 256
          //   911: if_icmpne +14 -> 925
          //   914: aload_0
          //   915: aload_0
          //   916: getfield 109	b/i/b/a/c/e/a$a$a$b:j	Ljava/util/List;
          //   919: invokestatic 190	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
          //   922: putfield 109	b/i/b/a/c/e/a$a$a$b:j	Ljava/util/List;
          //   925: aload 13
          //   927: invokevirtual 192	b/i/b/a/c/g/f:a	()V
          //   930: aload_0
          //   931: aload 12
          //   933: invokevirtual 197	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
          //   936: putfield 75	b/i/b/a/c/e/a$a$a$b:n	Lb/i/b/a/c/g/d;
          //   939: goto +15 -> 954
          //   942: astore_1
          //   943: aload_0
          //   944: aload 12
          //   946: invokevirtual 197	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
          //   949: putfield 75	b/i/b/a/c/e/a$a$a$b:n	Lb/i/b/a/c/g/d;
          //   952: aload_1
          //   953: athrow
          //   954: aload_0
          //   955: invokevirtual 200	b/i/b/a/c/e/a$a$a$b:w	()V
          //   958: aload_1
          //   959: athrow
          //   960: iload_3
          //   961: sipush 256
          //   964: iand
          //   965: sipush 256
          //   968: if_icmpne +14 -> 982
          //   971: aload_0
          //   972: aload_0
          //   973: getfield 109	b/i/b/a/c/e/a$a$a$b:j	Ljava/util/List;
          //   976: invokestatic 190	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
          //   979: putfield 109	b/i/b/a/c/e/a$a$a$b:j	Ljava/util/List;
          //   982: aload 13
          //   984: invokevirtual 192	b/i/b/a/c/g/f:a	()V
          //   987: aload_0
          //   988: aload 12
          //   990: invokevirtual 197	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
          //   993: putfield 75	b/i/b/a/c/e/a$a$a$b:n	Lb/i/b/a/c/g/d;
          //   996: goto +15 -> 1011
          //   999: astore_1
          //   1000: aload_0
          //   1001: aload 12
          //   1003: invokevirtual 197	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
          //   1006: putfield 75	b/i/b/a/c/e/a$a$a$b:n	Lb/i/b/a/c/g/d;
          //   1009: aload_1
          //   1010: athrow
          //   1011: aload_0
          //   1012: invokevirtual 200	b/i/b/a/c/e/a$a$a$b:w	()V
          //   1015: return
          //   1016: astore_2
          //   1017: goto -87 -> 930
          //   1020: astore_1
          //   1021: goto -34 -> 987
          //   1024: goto -860 -> 164
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	1027	0	this	b
          //   0	1027	1	parame	b.i.b.a.c.g.e
          //   0	1027	2	paramg	g
          //   35	930	3	i1	int
          //   54	722	4	i2	int
          //   42	866	5	i3	int
          //   45	836	6	i4	int
          //   48	849	7	i5	int
          //   32	806	8	i6	int
          //   741	51	9	i7	int
          //   183	660	10	bool	boolean
          //   348	481	11	localObject	Object
          //   21	981	12	localb	b.i.b.a.c.g.d.b
          //   29	954	13	localf	f
          // Exception table:
          //   from	to	target	type
          //   50	56	850	finally
          //   173	185	850	finally
          //   197	209	850	finally
          //   218	226	850	finally
          //   238	250	850	finally
          //   259	267	850	finally
          //   293	304	850	finally
          //   323	341	850	finally
          //   359	373	850	finally
          //   382	391	850	finally
          //   400	415	850	finally
          //   429	439	850	finally
          //   448	457	850	finally
          //   466	478	850	finally
          //   490	501	850	finally
          //   510	518	850	finally
          //   530	541	850	finally
          //   550	558	850	finally
          //   570	581	850	finally
          //   590	598	850	finally
          //   610	621	850	finally
          //   630	641	850	finally
          //   653	663	850	finally
          //   672	683	850	finally
          //   695	705	850	finally
          //   714	725	850	finally
          //   737	743	850	finally
          //   752	759	850	finally
          //   773	780	850	finally
          //   789	796	850	finally
          //   808	818	850	finally
          //   827	833	850	finally
          //   859	871	850	finally
          //   875	880	850	finally
          //   884	886	850	finally
          //   891	896	850	finally
          //   900	902	850	finally
          //   50	56	854	java/io/IOException
          //   173	185	854	java/io/IOException
          //   197	209	854	java/io/IOException
          //   218	226	854	java/io/IOException
          //   238	250	854	java/io/IOException
          //   259	267	854	java/io/IOException
          //   293	304	854	java/io/IOException
          //   323	341	854	java/io/IOException
          //   359	373	854	java/io/IOException
          //   382	391	854	java/io/IOException
          //   400	415	854	java/io/IOException
          //   429	439	854	java/io/IOException
          //   448	457	854	java/io/IOException
          //   466	478	854	java/io/IOException
          //   490	501	854	java/io/IOException
          //   510	518	854	java/io/IOException
          //   530	541	854	java/io/IOException
          //   550	558	854	java/io/IOException
          //   570	581	854	java/io/IOException
          //   590	598	854	java/io/IOException
          //   610	621	854	java/io/IOException
          //   630	641	854	java/io/IOException
          //   653	663	854	java/io/IOException
          //   672	683	854	java/io/IOException
          //   695	705	854	java/io/IOException
          //   714	725	854	java/io/IOException
          //   737	743	854	java/io/IOException
          //   752	759	854	java/io/IOException
          //   773	780	854	java/io/IOException
          //   789	796	854	java/io/IOException
          //   808	818	854	java/io/IOException
          //   827	833	854	java/io/IOException
          //   50	56	886	b/i/b/a/c/g/k
          //   173	185	886	b/i/b/a/c/g/k
          //   197	209	886	b/i/b/a/c/g/k
          //   218	226	886	b/i/b/a/c/g/k
          //   238	250	886	b/i/b/a/c/g/k
          //   259	267	886	b/i/b/a/c/g/k
          //   293	304	886	b/i/b/a/c/g/k
          //   323	341	886	b/i/b/a/c/g/k
          //   359	373	886	b/i/b/a/c/g/k
          //   382	391	886	b/i/b/a/c/g/k
          //   400	415	886	b/i/b/a/c/g/k
          //   429	439	886	b/i/b/a/c/g/k
          //   448	457	886	b/i/b/a/c/g/k
          //   466	478	886	b/i/b/a/c/g/k
          //   490	501	886	b/i/b/a/c/g/k
          //   510	518	886	b/i/b/a/c/g/k
          //   530	541	886	b/i/b/a/c/g/k
          //   550	558	886	b/i/b/a/c/g/k
          //   570	581	886	b/i/b/a/c/g/k
          //   590	598	886	b/i/b/a/c/g/k
          //   610	621	886	b/i/b/a/c/g/k
          //   630	641	886	b/i/b/a/c/g/k
          //   653	663	886	b/i/b/a/c/g/k
          //   672	683	886	b/i/b/a/c/g/k
          //   695	705	886	b/i/b/a/c/g/k
          //   714	725	886	b/i/b/a/c/g/k
          //   737	743	886	b/i/b/a/c/g/k
          //   752	759	886	b/i/b/a/c/g/k
          //   773	780	886	b/i/b/a/c/g/k
          //   789	796	886	b/i/b/a/c/g/k
          //   808	818	886	b/i/b/a/c/g/k
          //   827	833	886	b/i/b/a/c/g/k
          //   925	930	942	finally
          //   982	987	999	finally
          //   925	930	1016	java/io/IOException
          //   982	987	1020	java/io/IOException
        }
        
        private b(i.a parama)
        {
          super();
          this.n = parama.a;
        }
        
        public static a a(b paramb)
        {
          return a.g().a(paramb);
        }
        
        public static b a()
        {
          return m;
        }
        
        private void r()
        {
          this.b = b.a;
          this.c = 0L;
          this.d = 0.0F;
          this.e = 0.0D;
          this.f = 0;
          this.g = 0;
          this.h = 0;
          this.i = a.a.a();
          this.j = Collections.emptyList();
          this.k = 0;
          this.l = 0;
        }
        
        public final void a(f paramf)
          throws IOException
        {
          f();
          if ((this.o & 0x1) == 1) {
            paramf.b(1, this.b.n);
          }
          int i1 = this.o;
          int i2 = 0;
          if ((i1 & 0x2) == 2)
          {
            long l1 = this.c;
            paramf.e(2, 0);
            paramf.a(l1);
          }
          if ((this.o & 0x4) == 4)
          {
            float f1 = this.d;
            paramf.e(3, 5);
            paramf.a(f1);
          }
          if ((this.o & 0x8) == 8)
          {
            double d1 = this.e;
            paramf.e(4, 1);
            paramf.a(d1);
          }
          if ((this.o & 0x10) == 16) {
            paramf.a(5, this.f);
          }
          if ((this.o & 0x20) == 32) {
            paramf.a(6, this.g);
          }
          if ((this.o & 0x40) == 64) {
            paramf.a(7, this.h);
          }
          i1 = i2;
          if ((this.o & 0x80) == 128)
          {
            paramf.a(8, this.i);
            i1 = i2;
          }
          while (i1 < this.j.size())
          {
            paramf.a(9, (q)this.j.get(i1));
            i1 += 1;
          }
          if ((this.o & 0x200) == 512) {
            paramf.a(10, this.l);
          }
          if ((this.o & 0x100) == 256) {
            paramf.a(11, this.k);
          }
          paramf.c(this.n);
        }
        
        public final s<b> b()
        {
          return a;
        }
        
        public final boolean c()
        {
          return (this.o & 0x1) == 1;
        }
        
        public final boolean d()
        {
          return (this.o & 0x2) == 2;
        }
        
        public final boolean e()
        {
          int i1 = this.p;
          if (i1 == 1) {
            return true;
          }
          if (i1 == 0) {
            return false;
          }
          if ((o()) && (!this.i.e()))
          {
            this.p = 0;
            return false;
          }
          i1 = 0;
          while (i1 < this.j.size())
          {
            if (!((b)this.j.get(i1)).e())
            {
              this.p = 0;
              return false;
            }
            i1 += 1;
          }
          this.p = 1;
          return true;
        }
        
        public final int f()
        {
          int i1 = this.q;
          if (i1 != -1) {
            return i1;
          }
          i1 = this.o;
          int i4 = 0;
          if ((i1 & 0x1) == 1) {
            i2 = f.d(1, this.b.n) + 0;
          } else {
            i2 = 0;
          }
          i1 = i2;
          if ((this.o & 0x2) == 2) {
            i1 = i2 + f.b(this.c);
          }
          int i2 = i1;
          if ((this.o & 0x4) == 4) {
            i2 = i1 + (f.d(3) + 4);
          }
          i1 = i2;
          if ((this.o & 0x8) == 8) {
            i1 = i2 + (f.d(4) + 8);
          }
          i2 = i1;
          if ((this.o & 0x10) == 16) {
            i2 = i1 + f.c(5, this.f);
          }
          i1 = i2;
          if ((this.o & 0x20) == 32) {
            i1 = i2 + f.c(6, this.g);
          }
          i2 = i1;
          if ((this.o & 0x40) == 64) {
            i2 = i1 + f.c(7, this.h);
          }
          i1 = i2;
          int i3 = i4;
          if ((this.o & 0x80) == 128)
          {
            i1 = i2 + f.c(8, this.i);
            i3 = i4;
          }
          while (i3 < this.j.size())
          {
            i1 += f.c(9, (q)this.j.get(i3));
            i3 += 1;
          }
          i2 = i1;
          if ((this.o & 0x200) == 512) {
            i2 = i1 + f.c(10, this.l);
          }
          i1 = i2;
          if ((this.o & 0x100) == 256) {
            i1 = i2 + f.c(11, this.k);
          }
          i1 += this.n.a();
          this.q = i1;
          return i1;
        }
        
        public final boolean g()
        {
          return (this.o & 0x4) == 4;
        }
        
        public final boolean k()
        {
          return (this.o & 0x8) == 8;
        }
        
        public final boolean l()
        {
          return (this.o & 0x10) == 16;
        }
        
        public final boolean m()
        {
          return (this.o & 0x20) == 32;
        }
        
        public final boolean n()
        {
          return (this.o & 0x40) == 64;
        }
        
        public final boolean o()
        {
          return (this.o & 0x80) == 128;
        }
        
        public final boolean p()
        {
          return (this.o & 0x100) == 256;
        }
        
        public final boolean q()
        {
          return (this.o & 0x200) == 512;
        }
        
        public static final class a
          extends i.a<a.a.a.b, a>
          implements a.a.a.c
        {
          private int b;
          private a.a.a.b.b c = a.a.a.b.b.a;
          private long d;
          private float e;
          private double f;
          private int g;
          private int h;
          private int i;
          private a.a j = a.a.a();
          private List<a.a.a.b> k = Collections.emptyList();
          private int l;
          private int m;
          
          private a a(double paramDouble)
          {
            this.b |= 0x8;
            this.f = paramDouble;
            return this;
          }
          
          private a a(float paramFloat)
          {
            this.b |= 0x4;
            this.e = paramFloat;
            return this;
          }
          
          private a a(int paramInt)
          {
            this.b |= 0x10;
            this.g = paramInt;
            return this;
          }
          
          private a a(long paramLong)
          {
            this.b |= 0x2;
            this.d = paramLong;
            return this;
          }
          
          private a a(a.a.a.b.b paramb)
          {
            if (paramb != null)
            {
              this.b |= 0x1;
              this.c = paramb;
              return this;
            }
            throw new NullPointerException();
          }
          
          private a a(a.a parama)
          {
            a.a locala = parama;
            if ((this.b & 0x80) == 128)
            {
              locala = parama;
              if (this.j != a.a.a()) {
                locala = a.a.a(this.j).a(parama).f();
              }
            }
            this.j = locala;
            this.b |= 0x80;
            return this;
          }
          
          private a b(int paramInt)
          {
            this.b |= 0x20;
            this.h = paramInt;
            return this;
          }
          
          private a c(int paramInt)
          {
            this.b |= 0x40;
            this.i = paramInt;
            return this;
          }
          
          /* Error */
          private a c(b.i.b.a.c.g.e parame, g paramg)
            throws IOException
          {
            // Byte code:
            //   0: aconst_null
            //   1: astore_3
            //   2: getstatic 99	b/i/b/a/c/e/a$a$a$b:a	Lb/i/b/a/c/g/s;
            //   5: aload_1
            //   6: aload_2
            //   7: invokeinterface 104 3 0
            //   12: checkcast 16	b/i/b/a/c/e/a$a$a$b
            //   15: astore_1
            //   16: aload_0
            //   17: aload_1
            //   18: invokevirtual 107	b/i/b/a/c/e/a$a$a$b$a:a	(Lb/i/b/a/c/e/a$a$a$b;)Lb/i/b/a/c/e/a$a$a$b$a;
            //   21: pop
            //   22: aload_0
            //   23: areturn
            //   24: astore_2
            //   25: aload_3
            //   26: astore_1
            //   27: goto +15 -> 42
            //   30: astore_2
            //   31: aload_2
            //   32: getfield 110	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
            //   35: checkcast 16	b/i/b/a/c/e/a$a$a$b
            //   38: astore_1
            //   39: aload_2
            //   40: athrow
            //   41: astore_2
            //   42: aload_1
            //   43: ifnull +9 -> 52
            //   46: aload_0
            //   47: aload_1
            //   48: invokevirtual 107	b/i/b/a/c/e/a$a$a$b$a:a	(Lb/i/b/a/c/e/a$a$a$b;)Lb/i/b/a/c/e/a$a$a$b$a;
            //   51: pop
            //   52: aload_2
            //   53: athrow
            // Local variable table:
            //   start	length	slot	name	signature
            //   0	54	0	this	a
            //   0	54	1	parame	b.i.b.a.c.g.e
            //   0	54	2	paramg	g
            //   1	25	3	localObject	Object
            // Exception table:
            //   from	to	target	type
            //   2	16	24	finally
            //   31	39	24	finally
            //   2	16	30	b/i/b/a/c/g/k
            //   39	41	41	finally
          }
          
          private a d(int paramInt)
          {
            this.b |= 0x200;
            this.l = paramInt;
            return this;
          }
          
          private a e(int paramInt)
          {
            this.b |= 0x400;
            this.m = paramInt;
            return this;
          }
          
          private a h()
          {
            return new a().a(f());
          }
          
          private void i()
          {
            if ((this.b & 0x100) != 256)
            {
              this.k = new ArrayList(this.k);
              this.b |= 0x100;
            }
          }
          
          public final a a(a.a.a.b paramb)
          {
            if (paramb == a.a.a.b.a()) {
              return this;
            }
            if (paramb.c()) {
              a(paramb.b);
            }
            if (paramb.d()) {
              a(paramb.c);
            }
            if (paramb.g()) {
              a(paramb.d);
            }
            if (paramb.k()) {
              a(paramb.e);
            }
            if (paramb.l()) {
              a(paramb.f);
            }
            if (paramb.m()) {
              b(paramb.g);
            }
            if (paramb.n()) {
              c(paramb.h);
            }
            if (paramb.o()) {
              a(paramb.i);
            }
            if (!a.a.a.b.b(paramb).isEmpty()) {
              if (this.k.isEmpty())
              {
                this.k = a.a.a.b.b(paramb);
                this.b &= 0xFEFF;
              }
              else
              {
                i();
                this.k.addAll(a.a.a.b.b(paramb));
              }
            }
            if (paramb.p()) {
              d(paramb.k);
            }
            if (paramb.q()) {
              e(paramb.l);
            }
            this.a = this.a.a(a.a.a.b.c(paramb));
            return this;
          }
          
          public final boolean e()
          {
            if ((this.b & 0x80) == 128) {
              n = 1;
            } else {
              n = 0;
            }
            if ((n != 0) && (!this.j.e())) {
              return false;
            }
            int n = 0;
            while (n < this.k.size())
            {
              if (!((a.a.a.b)this.k.get(n)).e()) {
                return false;
              }
              n += 1;
            }
            return true;
          }
          
          public final a.a.a.b f()
          {
            int i1 = 0;
            a.a.a.b localb = new a.a.a.b(this, (byte)0);
            int i2 = this.b;
            if ((i2 & 0x1) == 1) {
              i1 = 1;
            }
            a.a.a.b.a(localb, this.c);
            int n = i1;
            if ((i2 & 0x2) == 2) {
              n = i1 | 0x2;
            }
            a.a.a.b.a(localb, this.d);
            i1 = n;
            if ((i2 & 0x4) == 4) {
              i1 = n | 0x4;
            }
            a.a.a.b.a(localb, this.e);
            n = i1;
            if ((i2 & 0x8) == 8) {
              n = i1 | 0x8;
            }
            a.a.a.b.a(localb, this.f);
            i1 = n;
            if ((i2 & 0x10) == 16) {
              i1 = n | 0x10;
            }
            a.a.a.b.a(localb, this.g);
            n = i1;
            if ((i2 & 0x20) == 32) {
              n = i1 | 0x20;
            }
            a.a.a.b.b(localb, this.h);
            i1 = n;
            if ((i2 & 0x40) == 64) {
              i1 = n | 0x40;
            }
            a.a.a.b.c(localb, this.i);
            n = i1;
            if ((i2 & 0x80) == 128) {
              n = i1 | 0x80;
            }
            a.a.a.b.a(localb, this.j);
            if ((this.b & 0x100) == 256)
            {
              this.k = Collections.unmodifiableList(this.k);
              this.b &= 0xFEFF;
            }
            a.a.a.b.a(localb, this.k);
            i1 = n;
            if ((i2 & 0x200) == 512) {
              i1 = n | 0x100;
            }
            a.a.a.b.d(localb, this.l);
            n = i1;
            if ((i2 & 0x400) == 1024) {
              n = i1 | 0x200;
            }
            a.a.a.b.e(localb, this.m);
            a.a.a.b.f(localb, n);
            return localb;
          }
        }
        
        public static enum b
          implements j.a
        {
          private static j.b<b> o = new j.b() {};
          final int n;
          
          private b(int paramInt1, int paramInt2)
          {
            this.n = paramInt1;
          }
          
          public static b a(int paramInt)
          {
            switch (paramInt)
            {
            default: 
              return null;
            case 12: 
              return m;
            case 11: 
              return l;
            case 10: 
              return k;
            case 9: 
              return j;
            case 8: 
              return i;
            case 7: 
              return h;
            case 6: 
              return g;
            case 5: 
              return f;
            case 4: 
              return e;
            case 3: 
              return d;
            case 2: 
              return c;
            case 1: 
              return b;
            }
            return a;
          }
          
          public final int a()
          {
            return this.n;
          }
        }
      }
      
      public static abstract interface c
        extends r
      {}
    }
    
    public static abstract interface b
      extends r
    {}
    
    public static final class c
      extends i.a<a.a, c>
      implements a.b
    {
      private int b;
      private int c;
      private List<a.a.a> d = Collections.emptyList();
      
      private c a(int paramInt)
      {
        this.b |= 0x1;
        this.c = paramInt;
        return this;
      }
      
      /* Error */
      private c c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 44	b/i/b/a/c/e/a$a:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 49 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$a
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 52	b/i/b/a/c/e/a$a$c:a	(Lb/i/b/a/c/e/a$a;)Lb/i/b/a/c/e/a$a$c;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 55	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$a
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 52	b/i/b/a/c/e/a$a$c:a	(Lb/i/b/a/c/e/a$a;)Lb/i/b/a/c/e/a$a$c;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	c
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private c h()
      {
        return new c().a(f());
      }
      
      private void i()
      {
        if ((this.b & 0x2) != 2)
        {
          this.d = new ArrayList(this.d);
          this.b |= 0x2;
        }
      }
      
      public final c a(a.a parama)
      {
        if (parama == a.a.a()) {
          return this;
        }
        if (parama.c()) {
          a(parama.b);
        }
        if (!a.a.b(parama).isEmpty()) {
          if (this.d.isEmpty())
          {
            this.d = a.a.b(parama);
            this.b &= 0xFFFFFFFD;
          }
          else
          {
            i();
            this.d.addAll(a.a.b(parama));
          }
        }
        this.a = this.a.a(a.a.c(parama));
        return this;
      }
      
      public final boolean e()
      {
        if ((this.b & 0x1) == 1) {
          i = 1;
        } else {
          i = 0;
        }
        if (i == 0) {
          return false;
        }
        int i = 0;
        while (i < this.d.size())
        {
          if (!((a.a.a)this.d.get(i)).e()) {
            return false;
          }
          i += 1;
        }
        return true;
      }
      
      public final a.a f()
      {
        int i = 0;
        a.a locala = new a.a(this, (byte)0);
        if ((this.b & 0x1) == 1) {
          i = 1;
        }
        a.a.a(locala, this.c);
        if ((this.b & 0x2) == 2)
        {
          this.d = Collections.unmodifiableList(this.d);
          this.b &= 0xFFFFFFFD;
        }
        a.a.a(locala, this.d);
        a.a.b(locala, i);
        return locala;
      }
    }
  }
  
  public static final class aa
    extends i.c<aa>
    implements a.ad
  {
    public static s<aa> a = new b() {};
    private static final aa p;
    public List<a> b;
    public boolean c;
    public int d;
    public aa e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public aa k;
    public int l;
    public aa m;
    public int n;
    public int o;
    private final d q;
    private int t;
    private byte u = -1;
    private int v = -1;
    
    static
    {
      aa localaa = new aa();
      p = localaa;
      localaa.y();
    }
    
    private aa()
    {
      this.q = d.b;
    }
    
    /* Error */
    private aa(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 70	b/i/b/a/c/g/i$c:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 72	b/i/b/a/c/e/a$aa:u	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 74	b/i/b/a/c/e/a$aa:v	I
      //   14: aload_0
      //   15: invokespecial 68	b/i/b/a/c/e/a$aa:y	()V
      //   18: invokestatic 88	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   21: astore 14
      //   23: aload 14
      //   25: iconst_1
      //   26: invokestatic 93	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   29: astore 15
      //   31: iconst_0
      //   32: istore 9
      //   34: iconst_0
      //   35: istore_3
      //   36: iload 9
      //   38: ifne +1248 -> 1286
      //   41: iload_3
      //   42: istore 5
      //   44: iload_3
      //   45: istore 6
      //   47: iload_3
      //   48: istore 7
      //   50: aload_1
      //   51: invokevirtual 98	b/i/b/a/c/g/e:a	()I
      //   54: istore 4
      //   56: aconst_null
      //   57: astore 12
      //   59: aconst_null
      //   60: astore 13
      //   62: aconst_null
      //   63: astore 11
      //   65: iload 4
      //   67: lookupswitch	default:+1282->1349, 0:+1096->1163, 8:+1055->1122, 18:+984->1051, 24:+945->1012, 32:+906->973, 42:+758->825, 48:+718->785, 56:+678->745, 64:+638->705, 72:+598->665, 82:+444->511, 88:+403->470, 96:+362->429, 106:+194->261, 112:+153->220
      //   196: iload_3
      //   197: istore 5
      //   199: iload_3
      //   200: istore 6
      //   202: iload_3
      //   203: istore 7
      //   205: aload_0
      //   206: aload_1
      //   207: aload 15
      //   209: aload_2
      //   210: iload 4
      //   212: invokevirtual 101	b/i/b/a/c/e/a$aa:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   215: istore 10
      //   217: goto +952 -> 1169
      //   220: iload_3
      //   221: istore 5
      //   223: iload_3
      //   224: istore 6
      //   226: iload_3
      //   227: istore 7
      //   229: aload_0
      //   230: aload_0
      //   231: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   234: sipush 2048
      //   237: ior
      //   238: putfield 103	b/i/b/a/c/e/a$aa:t	I
      //   241: iload_3
      //   242: istore 5
      //   244: iload_3
      //   245: istore 6
      //   247: iload_3
      //   248: istore 7
      //   250: aload_0
      //   251: aload_1
      //   252: invokevirtual 105	b/i/b/a/c/g/e:d	()I
      //   255: putfield 107	b/i/b/a/c/e/a$aa:n	I
      //   258: goto -222 -> 36
      //   261: iload_3
      //   262: istore 5
      //   264: iload_3
      //   265: istore 6
      //   267: iload_3
      //   268: istore 7
      //   270: aload_0
      //   271: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   274: istore 4
      //   276: sipush 1024
      //   279: istore 8
      //   281: iload 4
      //   283: sipush 1024
      //   286: iand
      //   287: sipush 1024
      //   290: if_icmpne +37 -> 327
      //   293: iload_3
      //   294: istore 5
      //   296: iload_3
      //   297: istore 6
      //   299: iload_3
      //   300: istore 7
      //   302: aload_0
      //   303: getfield 109	b/i/b/a/c/e/a$aa:m	Lb/i/b/a/c/e/a$aa;
      //   306: astore 11
      //   308: iload_3
      //   309: istore 5
      //   311: iload_3
      //   312: istore 6
      //   314: iload_3
      //   315: istore 7
      //   317: invokestatic 112	b/i/b/a/c/e/a$aa$c:i	()Lb/i/b/a/c/e/a$aa$c;
      //   320: aload 11
      //   322: invokevirtual 115	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   325: astore 11
      //   327: iload_3
      //   328: istore 5
      //   330: iload_3
      //   331: istore 6
      //   333: iload_3
      //   334: istore 7
      //   336: aload_0
      //   337: aload_1
      //   338: getstatic 62	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   341: aload_2
      //   342: invokevirtual 118	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   345: checkcast 2	b/i/b/a/c/e/a$aa
      //   348: putfield 109	b/i/b/a/c/e/a$aa:m	Lb/i/b/a/c/e/a$aa;
      //   351: aload 11
      //   353: ifnull +40 -> 393
      //   356: iload_3
      //   357: istore 5
      //   359: iload_3
      //   360: istore 6
      //   362: iload_3
      //   363: istore 7
      //   365: aload 11
      //   367: aload_0
      //   368: getfield 109	b/i/b/a/c/e/a$aa:m	Lb/i/b/a/c/e/a$aa;
      //   371: invokevirtual 115	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   374: pop
      //   375: iload_3
      //   376: istore 5
      //   378: iload_3
      //   379: istore 6
      //   381: iload_3
      //   382: istore 7
      //   384: aload_0
      //   385: aload 11
      //   387: invokevirtual 121	b/i/b/a/c/e/a$aa$c:h	()Lb/i/b/a/c/e/a$aa;
      //   390: putfield 109	b/i/b/a/c/e/a$aa:m	Lb/i/b/a/c/e/a$aa;
      //   393: iload_3
      //   394: istore 5
      //   396: iload_3
      //   397: istore 6
      //   399: iload_3
      //   400: istore 7
      //   402: aload_0
      //   403: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   406: istore 4
      //   408: iload_3
      //   409: istore 5
      //   411: iload_3
      //   412: istore 6
      //   414: iload_3
      //   415: istore 7
      //   417: aload_0
      //   418: iload 4
      //   420: iload 8
      //   422: ior
      //   423: putfield 103	b/i/b/a/c/e/a$aa:t	I
      //   426: goto -390 -> 36
      //   429: iload_3
      //   430: istore 5
      //   432: iload_3
      //   433: istore 6
      //   435: iload_3
      //   436: istore 7
      //   438: aload_0
      //   439: aload_0
      //   440: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   443: sipush 128
      //   446: ior
      //   447: putfield 103	b/i/b/a/c/e/a$aa:t	I
      //   450: iload_3
      //   451: istore 5
      //   453: iload_3
      //   454: istore 6
      //   456: iload_3
      //   457: istore 7
      //   459: aload_0
      //   460: aload_1
      //   461: invokevirtual 105	b/i/b/a/c/g/e:d	()I
      //   464: putfield 123	b/i/b/a/c/e/a$aa:j	I
      //   467: goto -431 -> 36
      //   470: iload_3
      //   471: istore 5
      //   473: iload_3
      //   474: istore 6
      //   476: iload_3
      //   477: istore 7
      //   479: aload_0
      //   480: aload_0
      //   481: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   484: sipush 512
      //   487: ior
      //   488: putfield 103	b/i/b/a/c/e/a$aa:t	I
      //   491: iload_3
      //   492: istore 5
      //   494: iload_3
      //   495: istore 6
      //   497: iload_3
      //   498: istore 7
      //   500: aload_0
      //   501: aload_1
      //   502: invokevirtual 105	b/i/b/a/c/g/e:d	()I
      //   505: putfield 125	b/i/b/a/c/e/a$aa:l	I
      //   508: goto -472 -> 36
      //   511: iload_3
      //   512: istore 5
      //   514: iload_3
      //   515: istore 6
      //   517: iload_3
      //   518: istore 7
      //   520: aload_0
      //   521: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   524: istore 4
      //   526: sipush 256
      //   529: istore 8
      //   531: aload 12
      //   533: astore 11
      //   535: iload 4
      //   537: sipush 256
      //   540: iand
      //   541: sipush 256
      //   544: if_icmpne +37 -> 581
      //   547: iload_3
      //   548: istore 5
      //   550: iload_3
      //   551: istore 6
      //   553: iload_3
      //   554: istore 7
      //   556: aload_0
      //   557: getfield 127	b/i/b/a/c/e/a$aa:k	Lb/i/b/a/c/e/a$aa;
      //   560: astore 11
      //   562: iload_3
      //   563: istore 5
      //   565: iload_3
      //   566: istore 6
      //   568: iload_3
      //   569: istore 7
      //   571: invokestatic 112	b/i/b/a/c/e/a$aa$c:i	()Lb/i/b/a/c/e/a$aa$c;
      //   574: aload 11
      //   576: invokevirtual 115	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   579: astore 11
      //   581: iload_3
      //   582: istore 5
      //   584: iload_3
      //   585: istore 6
      //   587: iload_3
      //   588: istore 7
      //   590: aload_0
      //   591: aload_1
      //   592: getstatic 62	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   595: aload_2
      //   596: invokevirtual 118	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   599: checkcast 2	b/i/b/a/c/e/a$aa
      //   602: putfield 127	b/i/b/a/c/e/a$aa:k	Lb/i/b/a/c/e/a$aa;
      //   605: aload 11
      //   607: ifnull +40 -> 647
      //   610: iload_3
      //   611: istore 5
      //   613: iload_3
      //   614: istore 6
      //   616: iload_3
      //   617: istore 7
      //   619: aload 11
      //   621: aload_0
      //   622: getfield 127	b/i/b/a/c/e/a$aa:k	Lb/i/b/a/c/e/a$aa;
      //   625: invokevirtual 115	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   628: pop
      //   629: iload_3
      //   630: istore 5
      //   632: iload_3
      //   633: istore 6
      //   635: iload_3
      //   636: istore 7
      //   638: aload_0
      //   639: aload 11
      //   641: invokevirtual 121	b/i/b/a/c/e/a$aa$c:h	()Lb/i/b/a/c/e/a$aa;
      //   644: putfield 127	b/i/b/a/c/e/a$aa:k	Lb/i/b/a/c/e/a$aa;
      //   647: iload_3
      //   648: istore 5
      //   650: iload_3
      //   651: istore 6
      //   653: iload_3
      //   654: istore 7
      //   656: aload_0
      //   657: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   660: istore 4
      //   662: goto -254 -> 408
      //   665: iload_3
      //   666: istore 5
      //   668: iload_3
      //   669: istore 6
      //   671: iload_3
      //   672: istore 7
      //   674: aload_0
      //   675: aload_0
      //   676: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   679: bipush 64
      //   681: ior
      //   682: putfield 103	b/i/b/a/c/e/a$aa:t	I
      //   685: iload_3
      //   686: istore 5
      //   688: iload_3
      //   689: istore 6
      //   691: iload_3
      //   692: istore 7
      //   694: aload_0
      //   695: aload_1
      //   696: invokevirtual 105	b/i/b/a/c/g/e:d	()I
      //   699: putfield 129	b/i/b/a/c/e/a$aa:i	I
      //   702: goto -666 -> 36
      //   705: iload_3
      //   706: istore 5
      //   708: iload_3
      //   709: istore 6
      //   711: iload_3
      //   712: istore 7
      //   714: aload_0
      //   715: aload_0
      //   716: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   719: bipush 8
      //   721: ior
      //   722: putfield 103	b/i/b/a/c/e/a$aa:t	I
      //   725: iload_3
      //   726: istore 5
      //   728: iload_3
      //   729: istore 6
      //   731: iload_3
      //   732: istore 7
      //   734: aload_0
      //   735: aload_1
      //   736: invokevirtual 105	b/i/b/a/c/g/e:d	()I
      //   739: putfield 131	b/i/b/a/c/e/a$aa:f	I
      //   742: goto -706 -> 36
      //   745: iload_3
      //   746: istore 5
      //   748: iload_3
      //   749: istore 6
      //   751: iload_3
      //   752: istore 7
      //   754: aload_0
      //   755: aload_0
      //   756: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   759: bipush 32
      //   761: ior
      //   762: putfield 103	b/i/b/a/c/e/a$aa:t	I
      //   765: iload_3
      //   766: istore 5
      //   768: iload_3
      //   769: istore 6
      //   771: iload_3
      //   772: istore 7
      //   774: aload_0
      //   775: aload_1
      //   776: invokevirtual 105	b/i/b/a/c/g/e:d	()I
      //   779: putfield 133	b/i/b/a/c/e/a$aa:h	I
      //   782: goto -746 -> 36
      //   785: iload_3
      //   786: istore 5
      //   788: iload_3
      //   789: istore 6
      //   791: iload_3
      //   792: istore 7
      //   794: aload_0
      //   795: aload_0
      //   796: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   799: bipush 16
      //   801: ior
      //   802: putfield 103	b/i/b/a/c/e/a$aa:t	I
      //   805: iload_3
      //   806: istore 5
      //   808: iload_3
      //   809: istore 6
      //   811: iload_3
      //   812: istore 7
      //   814: aload_0
      //   815: aload_1
      //   816: invokevirtual 105	b/i/b/a/c/g/e:d	()I
      //   819: putfield 135	b/i/b/a/c/e/a$aa:g	I
      //   822: goto -786 -> 36
      //   825: iload_3
      //   826: istore 5
      //   828: iload_3
      //   829: istore 6
      //   831: iload_3
      //   832: istore 7
      //   834: aload_0
      //   835: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   838: istore 4
      //   840: iconst_4
      //   841: istore 8
      //   843: aload 13
      //   845: astore 11
      //   847: iload 4
      //   849: iconst_4
      //   850: iand
      //   851: iconst_4
      //   852: if_icmpne +37 -> 889
      //   855: iload_3
      //   856: istore 5
      //   858: iload_3
      //   859: istore 6
      //   861: iload_3
      //   862: istore 7
      //   864: aload_0
      //   865: getfield 137	b/i/b/a/c/e/a$aa:e	Lb/i/b/a/c/e/a$aa;
      //   868: astore 11
      //   870: iload_3
      //   871: istore 5
      //   873: iload_3
      //   874: istore 6
      //   876: iload_3
      //   877: istore 7
      //   879: invokestatic 112	b/i/b/a/c/e/a$aa$c:i	()Lb/i/b/a/c/e/a$aa$c;
      //   882: aload 11
      //   884: invokevirtual 115	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   887: astore 11
      //   889: iload_3
      //   890: istore 5
      //   892: iload_3
      //   893: istore 6
      //   895: iload_3
      //   896: istore 7
      //   898: aload_0
      //   899: aload_1
      //   900: getstatic 62	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   903: aload_2
      //   904: invokevirtual 118	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   907: checkcast 2	b/i/b/a/c/e/a$aa
      //   910: putfield 137	b/i/b/a/c/e/a$aa:e	Lb/i/b/a/c/e/a$aa;
      //   913: aload 11
      //   915: ifnull +40 -> 955
      //   918: iload_3
      //   919: istore 5
      //   921: iload_3
      //   922: istore 6
      //   924: iload_3
      //   925: istore 7
      //   927: aload 11
      //   929: aload_0
      //   930: getfield 137	b/i/b/a/c/e/a$aa:e	Lb/i/b/a/c/e/a$aa;
      //   933: invokevirtual 115	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   936: pop
      //   937: iload_3
      //   938: istore 5
      //   940: iload_3
      //   941: istore 6
      //   943: iload_3
      //   944: istore 7
      //   946: aload_0
      //   947: aload 11
      //   949: invokevirtual 121	b/i/b/a/c/e/a$aa$c:h	()Lb/i/b/a/c/e/a$aa;
      //   952: putfield 137	b/i/b/a/c/e/a$aa:e	Lb/i/b/a/c/e/a$aa;
      //   955: iload_3
      //   956: istore 5
      //   958: iload_3
      //   959: istore 6
      //   961: iload_3
      //   962: istore 7
      //   964: aload_0
      //   965: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   968: istore 4
      //   970: goto -562 -> 408
      //   973: iload_3
      //   974: istore 5
      //   976: iload_3
      //   977: istore 6
      //   979: iload_3
      //   980: istore 7
      //   982: aload_0
      //   983: aload_0
      //   984: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   987: iconst_2
      //   988: ior
      //   989: putfield 103	b/i/b/a/c/e/a$aa:t	I
      //   992: iload_3
      //   993: istore 5
      //   995: iload_3
      //   996: istore 6
      //   998: iload_3
      //   999: istore 7
      //   1001: aload_0
      //   1002: aload_1
      //   1003: invokevirtual 105	b/i/b/a/c/g/e:d	()I
      //   1006: putfield 139	b/i/b/a/c/e/a$aa:d	I
      //   1009: goto -973 -> 36
      //   1012: iload_3
      //   1013: istore 5
      //   1015: iload_3
      //   1016: istore 6
      //   1018: iload_3
      //   1019: istore 7
      //   1021: aload_0
      //   1022: aload_0
      //   1023: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   1026: iconst_1
      //   1027: ior
      //   1028: putfield 103	b/i/b/a/c/e/a$aa:t	I
      //   1031: iload_3
      //   1032: istore 5
      //   1034: iload_3
      //   1035: istore 6
      //   1037: iload_3
      //   1038: istore 7
      //   1040: aload_0
      //   1041: aload_1
      //   1042: invokevirtual 142	b/i/b/a/c/g/e:b	()Z
      //   1045: putfield 144	b/i/b/a/c/e/a$aa:c	Z
      //   1048: goto -1012 -> 36
      //   1051: iload_3
      //   1052: istore 4
      //   1054: iload_3
      //   1055: iconst_1
      //   1056: iand
      //   1057: iconst_1
      //   1058: if_icmpeq +28 -> 1086
      //   1061: iload_3
      //   1062: istore 5
      //   1064: iload_3
      //   1065: istore 6
      //   1067: iload_3
      //   1068: istore 7
      //   1070: aload_0
      //   1071: new 146	java/util/ArrayList
      //   1074: dup
      //   1075: invokespecial 147	java/util/ArrayList:<init>	()V
      //   1078: putfield 149	b/i/b/a/c/e/a$aa:b	Ljava/util/List;
      //   1081: iload_3
      //   1082: iconst_1
      //   1083: ior
      //   1084: istore 4
      //   1086: iload 4
      //   1088: istore 5
      //   1090: iload 4
      //   1092: istore 6
      //   1094: iload 4
      //   1096: istore 7
      //   1098: aload_0
      //   1099: getfield 149	b/i/b/a/c/e/a$aa:b	Ljava/util/List;
      //   1102: aload_1
      //   1103: getstatic 150	b/i/b/a/c/e/a$aa$a:a	Lb/i/b/a/c/g/s;
      //   1106: aload_2
      //   1107: invokevirtual 118	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   1110: invokeinterface 156 2 0
      //   1115: pop
      //   1116: iload 4
      //   1118: istore_3
      //   1119: goto -1083 -> 36
      //   1122: iload_3
      //   1123: istore 5
      //   1125: iload_3
      //   1126: istore 6
      //   1128: iload_3
      //   1129: istore 7
      //   1131: aload_0
      //   1132: aload_0
      //   1133: getfield 103	b/i/b/a/c/e/a$aa:t	I
      //   1136: sipush 4096
      //   1139: ior
      //   1140: putfield 103	b/i/b/a/c/e/a$aa:t	I
      //   1143: iload_3
      //   1144: istore 5
      //   1146: iload_3
      //   1147: istore 6
      //   1149: iload_3
      //   1150: istore 7
      //   1152: aload_0
      //   1153: aload_1
      //   1154: invokevirtual 105	b/i/b/a/c/g/e:d	()I
      //   1157: putfield 158	b/i/b/a/c/e/a$aa:o	I
      //   1160: goto -1124 -> 36
      //   1163: iconst_1
      //   1164: istore 9
      //   1166: goto -1130 -> 36
      //   1169: iload 10
      //   1171: ifne -1135 -> 36
      //   1174: goto -11 -> 1163
      //   1177: astore_1
      //   1178: goto +51 -> 1229
      //   1181: astore_1
      //   1182: iload 6
      //   1184: istore 5
      //   1186: new 83	b/i/b/a/c/g/k
      //   1189: dup
      //   1190: aload_1
      //   1191: invokevirtual 162	java/io/IOException:getMessage	()Ljava/lang/String;
      //   1194: invokespecial 165	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   1197: astore_1
      //   1198: iload 6
      //   1200: istore 5
      //   1202: aload_1
      //   1203: aload_0
      //   1204: putfield 168	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   1207: iload 6
      //   1209: istore 5
      //   1211: aload_1
      //   1212: athrow
      //   1213: astore_1
      //   1214: iload 7
      //   1216: istore 5
      //   1218: aload_1
      //   1219: aload_0
      //   1220: putfield 168	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   1223: iload 7
      //   1225: istore 5
      //   1227: aload_1
      //   1228: athrow
      //   1229: iload 5
      //   1231: iconst_1
      //   1232: iand
      //   1233: iconst_1
      //   1234: if_icmpne +14 -> 1248
      //   1237: aload_0
      //   1238: aload_0
      //   1239: getfield 149	b/i/b/a/c/e/a$aa:b	Ljava/util/List;
      //   1242: invokestatic 174	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1245: putfield 149	b/i/b/a/c/e/a$aa:b	Ljava/util/List;
      //   1248: aload 15
      //   1250: invokevirtual 176	b/i/b/a/c/g/f:a	()V
      //   1253: aload_0
      //   1254: aload 14
      //   1256: invokevirtual 181	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1259: putfield 80	b/i/b/a/c/e/a$aa:q	Lb/i/b/a/c/g/d;
      //   1262: goto +15 -> 1277
      //   1265: astore_1
      //   1266: aload_0
      //   1267: aload 14
      //   1269: invokevirtual 181	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1272: putfield 80	b/i/b/a/c/e/a$aa:q	Lb/i/b/a/c/g/d;
      //   1275: aload_1
      //   1276: athrow
      //   1277: aload_0
      //   1278: getfield 185	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   1281: invokevirtual 189	b/i/b/a/c/g/h:c	()V
      //   1284: aload_1
      //   1285: athrow
      //   1286: iload_3
      //   1287: iconst_1
      //   1288: iand
      //   1289: iconst_1
      //   1290: if_icmpne +14 -> 1304
      //   1293: aload_0
      //   1294: aload_0
      //   1295: getfield 149	b/i/b/a/c/e/a$aa:b	Ljava/util/List;
      //   1298: invokestatic 174	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1301: putfield 149	b/i/b/a/c/e/a$aa:b	Ljava/util/List;
      //   1304: aload 15
      //   1306: invokevirtual 176	b/i/b/a/c/g/f:a	()V
      //   1309: aload_0
      //   1310: aload 14
      //   1312: invokevirtual 181	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1315: putfield 80	b/i/b/a/c/e/a$aa:q	Lb/i/b/a/c/g/d;
      //   1318: goto +15 -> 1333
      //   1321: astore_1
      //   1322: aload_0
      //   1323: aload 14
      //   1325: invokevirtual 181	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1328: putfield 80	b/i/b/a/c/e/a$aa:q	Lb/i/b/a/c/g/d;
      //   1331: aload_1
      //   1332: athrow
      //   1333: aload_0
      //   1334: getfield 185	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   1337: invokevirtual 189	b/i/b/a/c/g/h:c	()V
      //   1340: return
      //   1341: astore_2
      //   1342: goto -89 -> 1253
      //   1345: astore_1
      //   1346: goto -37 -> 1309
      //   1349: goto -1153 -> 196
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1352	0	this	aa
      //   0	1352	1	parame	b.i.b.a.c.g.e
      //   0	1352	2	paramg	g
      //   35	1254	3	i1	int
      //   54	1063	4	i2	int
      //   42	1191	5	i3	int
      //   45	1163	6	i4	int
      //   48	1176	7	i5	int
      //   279	563	8	i6	int
      //   32	1133	9	i7	int
      //   215	955	10	bool	boolean
      //   63	885	11	localObject1	Object
      //   57	475	12	localObject2	Object
      //   60	784	13	localObject3	Object
      //   21	1303	14	localb	b.i.b.a.c.g.d.b
      //   29	1276	15	localf	f
      // Exception table:
      //   from	to	target	type
      //   50	56	1177	finally
      //   205	217	1177	finally
      //   229	241	1177	finally
      //   250	258	1177	finally
      //   270	276	1177	finally
      //   302	308	1177	finally
      //   317	327	1177	finally
      //   336	351	1177	finally
      //   365	375	1177	finally
      //   384	393	1177	finally
      //   402	408	1177	finally
      //   417	426	1177	finally
      //   438	450	1177	finally
      //   459	467	1177	finally
      //   479	491	1177	finally
      //   500	508	1177	finally
      //   520	526	1177	finally
      //   556	562	1177	finally
      //   571	581	1177	finally
      //   590	605	1177	finally
      //   619	629	1177	finally
      //   638	647	1177	finally
      //   656	662	1177	finally
      //   674	685	1177	finally
      //   694	702	1177	finally
      //   714	725	1177	finally
      //   734	742	1177	finally
      //   754	765	1177	finally
      //   774	782	1177	finally
      //   794	805	1177	finally
      //   814	822	1177	finally
      //   834	840	1177	finally
      //   864	870	1177	finally
      //   879	889	1177	finally
      //   898	913	1177	finally
      //   927	937	1177	finally
      //   946	955	1177	finally
      //   964	970	1177	finally
      //   982	992	1177	finally
      //   1001	1009	1177	finally
      //   1021	1031	1177	finally
      //   1040	1048	1177	finally
      //   1070	1081	1177	finally
      //   1098	1116	1177	finally
      //   1131	1143	1177	finally
      //   1152	1160	1177	finally
      //   1186	1198	1177	finally
      //   1202	1207	1177	finally
      //   1211	1213	1177	finally
      //   1218	1223	1177	finally
      //   1227	1229	1177	finally
      //   50	56	1181	java/io/IOException
      //   205	217	1181	java/io/IOException
      //   229	241	1181	java/io/IOException
      //   250	258	1181	java/io/IOException
      //   270	276	1181	java/io/IOException
      //   302	308	1181	java/io/IOException
      //   317	327	1181	java/io/IOException
      //   336	351	1181	java/io/IOException
      //   365	375	1181	java/io/IOException
      //   384	393	1181	java/io/IOException
      //   402	408	1181	java/io/IOException
      //   417	426	1181	java/io/IOException
      //   438	450	1181	java/io/IOException
      //   459	467	1181	java/io/IOException
      //   479	491	1181	java/io/IOException
      //   500	508	1181	java/io/IOException
      //   520	526	1181	java/io/IOException
      //   556	562	1181	java/io/IOException
      //   571	581	1181	java/io/IOException
      //   590	605	1181	java/io/IOException
      //   619	629	1181	java/io/IOException
      //   638	647	1181	java/io/IOException
      //   656	662	1181	java/io/IOException
      //   674	685	1181	java/io/IOException
      //   694	702	1181	java/io/IOException
      //   714	725	1181	java/io/IOException
      //   734	742	1181	java/io/IOException
      //   754	765	1181	java/io/IOException
      //   774	782	1181	java/io/IOException
      //   794	805	1181	java/io/IOException
      //   814	822	1181	java/io/IOException
      //   834	840	1181	java/io/IOException
      //   864	870	1181	java/io/IOException
      //   879	889	1181	java/io/IOException
      //   898	913	1181	java/io/IOException
      //   927	937	1181	java/io/IOException
      //   946	955	1181	java/io/IOException
      //   964	970	1181	java/io/IOException
      //   982	992	1181	java/io/IOException
      //   1001	1009	1181	java/io/IOException
      //   1021	1031	1181	java/io/IOException
      //   1040	1048	1181	java/io/IOException
      //   1070	1081	1181	java/io/IOException
      //   1098	1116	1181	java/io/IOException
      //   1131	1143	1181	java/io/IOException
      //   1152	1160	1181	java/io/IOException
      //   50	56	1213	b/i/b/a/c/g/k
      //   205	217	1213	b/i/b/a/c/g/k
      //   229	241	1213	b/i/b/a/c/g/k
      //   250	258	1213	b/i/b/a/c/g/k
      //   270	276	1213	b/i/b/a/c/g/k
      //   302	308	1213	b/i/b/a/c/g/k
      //   317	327	1213	b/i/b/a/c/g/k
      //   336	351	1213	b/i/b/a/c/g/k
      //   365	375	1213	b/i/b/a/c/g/k
      //   384	393	1213	b/i/b/a/c/g/k
      //   402	408	1213	b/i/b/a/c/g/k
      //   417	426	1213	b/i/b/a/c/g/k
      //   438	450	1213	b/i/b/a/c/g/k
      //   459	467	1213	b/i/b/a/c/g/k
      //   479	491	1213	b/i/b/a/c/g/k
      //   500	508	1213	b/i/b/a/c/g/k
      //   520	526	1213	b/i/b/a/c/g/k
      //   556	562	1213	b/i/b/a/c/g/k
      //   571	581	1213	b/i/b/a/c/g/k
      //   590	605	1213	b/i/b/a/c/g/k
      //   619	629	1213	b/i/b/a/c/g/k
      //   638	647	1213	b/i/b/a/c/g/k
      //   656	662	1213	b/i/b/a/c/g/k
      //   674	685	1213	b/i/b/a/c/g/k
      //   694	702	1213	b/i/b/a/c/g/k
      //   714	725	1213	b/i/b/a/c/g/k
      //   734	742	1213	b/i/b/a/c/g/k
      //   754	765	1213	b/i/b/a/c/g/k
      //   774	782	1213	b/i/b/a/c/g/k
      //   794	805	1213	b/i/b/a/c/g/k
      //   814	822	1213	b/i/b/a/c/g/k
      //   834	840	1213	b/i/b/a/c/g/k
      //   864	870	1213	b/i/b/a/c/g/k
      //   879	889	1213	b/i/b/a/c/g/k
      //   898	913	1213	b/i/b/a/c/g/k
      //   927	937	1213	b/i/b/a/c/g/k
      //   946	955	1213	b/i/b/a/c/g/k
      //   964	970	1213	b/i/b/a/c/g/k
      //   982	992	1213	b/i/b/a/c/g/k
      //   1001	1009	1213	b/i/b/a/c/g/k
      //   1021	1031	1213	b/i/b/a/c/g/k
      //   1040	1048	1213	b/i/b/a/c/g/k
      //   1070	1081	1213	b/i/b/a/c/g/k
      //   1098	1116	1213	b/i/b/a/c/g/k
      //   1131	1143	1213	b/i/b/a/c/g/k
      //   1152	1160	1213	b/i/b/a/c/g/k
      //   1248	1253	1265	finally
      //   1304	1309	1321	finally
      //   1248	1253	1341	java/io/IOException
      //   1304	1309	1345	java/io/IOException
    }
    
    private aa(i.b<aa, ?> paramb)
    {
      super();
      this.q = paramb.a;
    }
    
    public static c a(aa paramaa)
    {
      return c.i().a(paramaa);
    }
    
    public static aa a()
    {
      return p;
    }
    
    private void y()
    {
      this.b = Collections.emptyList();
      this.c = false;
      this.d = 0;
      this.e = p;
      this.f = 0;
      this.g = 0;
      this.h = 0;
      this.i = 0;
      this.j = 0;
      this.k = p;
      this.l = 0;
      this.m = p;
      this.n = 0;
      this.o = 0;
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      i.c.a locala = x();
      if ((this.t & 0x1000) == 4096) {
        paramf.a(1, this.o);
      }
      int i1 = 0;
      while (i1 < this.b.size())
      {
        paramf.a(2, (q)this.b.get(i1));
        i1 += 1;
      }
      if ((this.t & 0x1) == 1) {
        paramf.a(this.c);
      }
      if ((this.t & 0x2) == 2) {
        paramf.a(4, this.d);
      }
      if ((this.t & 0x4) == 4) {
        paramf.a(5, this.e);
      }
      if ((this.t & 0x10) == 16) {
        paramf.a(6, this.g);
      }
      if ((this.t & 0x20) == 32) {
        paramf.a(7, this.h);
      }
      if ((this.t & 0x8) == 8) {
        paramf.a(8, this.f);
      }
      if ((this.t & 0x40) == 64) {
        paramf.a(9, this.i);
      }
      if ((this.t & 0x100) == 256) {
        paramf.a(10, this.k);
      }
      if ((this.t & 0x200) == 512) {
        paramf.a(11, this.l);
      }
      if ((this.t & 0x80) == 128) {
        paramf.a(12, this.j);
      }
      if ((this.t & 0x400) == 1024) {
        paramf.a(13, this.m);
      }
      if ((this.t & 0x800) == 2048) {
        paramf.a(14, this.n);
      }
      locala.a(200, paramf);
      paramf.c(this.q);
    }
    
    public final s<aa> b()
    {
      return a;
    }
    
    public final int c()
    {
      return this.b.size();
    }
    
    public final boolean d()
    {
      return (this.t & 0x1) == 1;
    }
    
    public final boolean e()
    {
      int i1 = this.u;
      if (i1 == 1) {
        return true;
      }
      if (i1 == 0) {
        return false;
      }
      i1 = 0;
      while (i1 < c())
      {
        if (!((a)this.b.get(i1)).e())
        {
          this.u = 0;
          return false;
        }
        i1 += 1;
      }
      if ((k()) && (!this.e.e()))
      {
        this.u = 0;
        return false;
      }
      if ((q()) && (!this.k.e()))
      {
        this.u = 0;
        return false;
      }
      if ((s()) && (!this.m.e()))
      {
        this.u = 0;
        return false;
      }
      if (!this.s.e())
      {
        this.u = 0;
        return false;
      }
      this.u = 1;
      return true;
    }
    
    public final int f()
    {
      int i1 = this.v;
      if (i1 != -1) {
        return i1;
      }
      i1 = this.t;
      int i2 = 0;
      if ((i1 & 0x1000) == 4096) {
        i1 = f.c(1, this.o) + 0;
      } else {
        i1 = 0;
      }
      while (i2 < this.b.size())
      {
        i1 += f.c(2, (q)this.b.get(i2));
        i2 += 1;
      }
      i2 = i1;
      if ((this.t & 0x1) == 1) {
        i2 = i1 + (f.d(3) + 1);
      }
      i1 = i2;
      if ((this.t & 0x2) == 2) {
        i1 = i2 + f.c(4, this.d);
      }
      i2 = i1;
      if ((this.t & 0x4) == 4) {
        i2 = i1 + f.c(5, this.e);
      }
      i1 = i2;
      if ((this.t & 0x10) == 16) {
        i1 = i2 + f.c(6, this.g);
      }
      i2 = i1;
      if ((this.t & 0x20) == 32) {
        i2 = i1 + f.c(7, this.h);
      }
      i1 = i2;
      if ((this.t & 0x8) == 8) {
        i1 = i2 + f.c(8, this.f);
      }
      i2 = i1;
      if ((this.t & 0x40) == 64) {
        i2 = i1 + f.c(9, this.i);
      }
      i1 = i2;
      if ((this.t & 0x100) == 256) {
        i1 = i2 + f.c(10, this.k);
      }
      i2 = i1;
      if ((this.t & 0x200) == 512) {
        i2 = i1 + f.c(11, this.l);
      }
      i1 = i2;
      if ((this.t & 0x80) == 128) {
        i1 = i2 + f.c(12, this.j);
      }
      i2 = i1;
      if ((this.t & 0x400) == 1024) {
        i2 = i1 + f.c(13, this.m);
      }
      i1 = i2;
      if ((this.t & 0x800) == 2048) {
        i1 = i2 + f.c(14, this.n);
      }
      i1 = i1 + this.s.f() + this.q.a();
      this.v = i1;
      return i1;
    }
    
    public final boolean g()
    {
      return (this.t & 0x2) == 2;
    }
    
    public final boolean k()
    {
      return (this.t & 0x4) == 4;
    }
    
    public final boolean l()
    {
      return (this.t & 0x8) == 8;
    }
    
    public final boolean m()
    {
      return (this.t & 0x10) == 16;
    }
    
    public final boolean n()
    {
      return (this.t & 0x20) == 32;
    }
    
    public final boolean o()
    {
      return (this.t & 0x40) == 64;
    }
    
    public final boolean p()
    {
      return (this.t & 0x80) == 128;
    }
    
    public final boolean q()
    {
      return (this.t & 0x100) == 256;
    }
    
    public final boolean r()
    {
      return (this.t & 0x200) == 512;
    }
    
    public final boolean s()
    {
      return (this.t & 0x400) == 1024;
    }
    
    public final boolean t()
    {
      return (this.t & 0x800) == 2048;
    }
    
    public final boolean u()
    {
      return (this.t & 0x1000) == 4096;
    }
    
    public final c v()
    {
      return c.i().a(this);
    }
    
    public static final class a
      extends i
      implements a.aa.b
    {
      public static s<a> a = new b() {};
      private static final a e;
      public b b;
      public a.aa c;
      public int d;
      private final d f;
      private int g;
      private byte h = -1;
      private int i = -1;
      
      static
      {
        a locala = new a();
        e = locala;
        locala.k();
      }
      
      private a()
      {
        this.f = d.b;
      }
      
      /* Error */
      private a(b.i.b.a.c.g.e parame, g paramg)
        throws b.i.b.a.c.g.k
      {
        // Byte code:
        //   0: aload_0
        //   1: invokespecial 51	b/i/b/a/c/g/i:<init>	()V
        //   4: aload_0
        //   5: iconst_m1
        //   6: putfield 53	b/i/b/a/c/e/a$aa$a:h	B
        //   9: aload_0
        //   10: iconst_m1
        //   11: putfield 55	b/i/b/a/c/e/a$aa$a:i	I
        //   14: aload_0
        //   15: invokespecial 49	b/i/b/a/c/e/a$aa$a:k	()V
        //   18: invokestatic 69	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
        //   21: astore 7
        //   23: aload 7
        //   25: iconst_1
        //   26: invokestatic 74	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
        //   29: astore 8
        //   31: iconst_0
        //   32: istore_3
        //   33: iload_3
        //   34: ifne +272 -> 306
        //   37: aload_1
        //   38: invokevirtual 79	b/i/b/a/c/g/e:a	()I
        //   41: istore 4
        //   43: iload 4
        //   45: ifeq +189 -> 234
        //   48: iload 4
        //   50: bipush 8
        //   52: if_icmpeq +128 -> 180
        //   55: iload 4
        //   57: bipush 18
        //   59: if_icmpeq +47 -> 106
        //   62: iload 4
        //   64: bipush 24
        //   66: if_icmpeq +19 -> 85
        //   69: aload_0
        //   70: aload_1
        //   71: aload 8
        //   73: aload_2
        //   74: iload 4
        //   76: invokevirtual 82	b/i/b/a/c/e/a$aa$a:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
        //   79: ifne -46 -> 33
        //   82: goto +152 -> 234
        //   85: aload_0
        //   86: aload_0
        //   87: getfield 84	b/i/b/a/c/e/a$aa$a:g	I
        //   90: iconst_4
        //   91: ior
        //   92: putfield 84	b/i/b/a/c/e/a$aa$a:g	I
        //   95: aload_0
        //   96: aload_1
        //   97: invokevirtual 86	b/i/b/a/c/g/e:d	()I
        //   100: putfield 88	b/i/b/a/c/e/a$aa$a:d	I
        //   103: goto -70 -> 33
        //   106: aconst_null
        //   107: astore 6
        //   109: aload_0
        //   110: getfield 84	b/i/b/a/c/e/a$aa$a:g	I
        //   113: iconst_2
        //   114: iand
        //   115: iconst_2
        //   116: if_icmpne +12 -> 128
        //   119: aload_0
        //   120: getfield 90	b/i/b/a/c/e/a$aa$a:c	Lb/i/b/a/c/e/a$aa;
        //   123: invokevirtual 94	b/i/b/a/c/e/a$aa:v	()Lb/i/b/a/c/e/a$aa$c;
        //   126: astore 6
        //   128: aload_0
        //   129: aload_1
        //   130: getstatic 95	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
        //   133: aload_2
        //   134: invokevirtual 98	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
        //   137: checkcast 8	b/i/b/a/c/e/a$aa
        //   140: putfield 90	b/i/b/a/c/e/a$aa$a:c	Lb/i/b/a/c/e/a$aa;
        //   143: aload 6
        //   145: ifnull +22 -> 167
        //   148: aload 6
        //   150: aload_0
        //   151: getfield 90	b/i/b/a/c/e/a$aa$a:c	Lb/i/b/a/c/e/a$aa;
        //   154: invokevirtual 103	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
        //   157: pop
        //   158: aload_0
        //   159: aload 6
        //   161: invokevirtual 106	b/i/b/a/c/e/a$aa$c:h	()Lb/i/b/a/c/e/a$aa;
        //   164: putfield 90	b/i/b/a/c/e/a$aa$a:c	Lb/i/b/a/c/e/a$aa;
        //   167: aload_0
        //   168: aload_0
        //   169: getfield 84	b/i/b/a/c/e/a$aa$a:g	I
        //   172: iconst_2
        //   173: ior
        //   174: putfield 84	b/i/b/a/c/e/a$aa$a:g	I
        //   177: goto -144 -> 33
        //   180: aload_1
        //   181: invokevirtual 86	b/i/b/a/c/g/e:d	()I
        //   184: istore 5
        //   186: iload 5
        //   188: invokestatic 109	b/i/b/a/c/e/a$aa$a$b:a	(I)Lb/i/b/a/c/e/a$aa$a$b;
        //   191: astore 6
        //   193: aload 6
        //   195: ifnonnull +20 -> 215
        //   198: aload 8
        //   200: iload 4
        //   202: invokevirtual 112	b/i/b/a/c/g/f:e	(I)V
        //   205: aload 8
        //   207: iload 5
        //   209: invokevirtual 112	b/i/b/a/c/g/f:e	(I)V
        //   212: goto -179 -> 33
        //   215: aload_0
        //   216: aload_0
        //   217: getfield 84	b/i/b/a/c/e/a$aa$a:g	I
        //   220: iconst_1
        //   221: ior
        //   222: putfield 84	b/i/b/a/c/e/a$aa$a:g	I
        //   225: aload_0
        //   226: aload 6
        //   228: putfield 114	b/i/b/a/c/e/a$aa$a:b	Lb/i/b/a/c/e/a$aa$a$b;
        //   231: goto -198 -> 33
        //   234: iconst_1
        //   235: istore_3
        //   236: goto -203 -> 33
        //   239: astore_1
        //   240: goto +31 -> 271
        //   243: astore_1
        //   244: new 64	b/i/b/a/c/g/k
        //   247: dup
        //   248: aload_1
        //   249: invokevirtual 118	java/io/IOException:getMessage	()Ljava/lang/String;
        //   252: invokespecial 121	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
        //   255: astore_1
        //   256: aload_1
        //   257: aload_0
        //   258: putfield 124	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   261: aload_1
        //   262: athrow
        //   263: astore_1
        //   264: aload_1
        //   265: aload_0
        //   266: putfield 124	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   269: aload_1
        //   270: athrow
        //   271: aload 8
        //   273: invokevirtual 126	b/i/b/a/c/g/f:a	()V
        //   276: aload_0
        //   277: aload 7
        //   279: invokevirtual 131	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
        //   282: putfield 61	b/i/b/a/c/e/a$aa$a:f	Lb/i/b/a/c/g/d;
        //   285: goto +15 -> 300
        //   288: astore_1
        //   289: aload_0
        //   290: aload 7
        //   292: invokevirtual 131	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
        //   295: putfield 61	b/i/b/a/c/e/a$aa$a:f	Lb/i/b/a/c/g/d;
        //   298: aload_1
        //   299: athrow
        //   300: aload_0
        //   301: invokevirtual 134	b/i/b/a/c/e/a$aa$a:w	()V
        //   304: aload_1
        //   305: athrow
        //   306: aload 8
        //   308: invokevirtual 126	b/i/b/a/c/g/f:a	()V
        //   311: aload_0
        //   312: aload 7
        //   314: invokevirtual 131	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
        //   317: putfield 61	b/i/b/a/c/e/a$aa$a:f	Lb/i/b/a/c/g/d;
        //   320: goto +15 -> 335
        //   323: astore_1
        //   324: aload_0
        //   325: aload 7
        //   327: invokevirtual 131	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
        //   330: putfield 61	b/i/b/a/c/e/a$aa$a:f	Lb/i/b/a/c/g/d;
        //   333: aload_1
        //   334: athrow
        //   335: aload_0
        //   336: invokevirtual 134	b/i/b/a/c/e/a$aa$a:w	()V
        //   339: return
        //   340: astore_2
        //   341: goto -65 -> 276
        //   344: astore_1
        //   345: goto -34 -> 311
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	348	0	this	a
        //   0	348	1	parame	b.i.b.a.c.g.e
        //   0	348	2	paramg	g
        //   32	204	3	j	int
        //   41	160	4	k	int
        //   184	24	5	m	int
        //   107	120	6	localObject	Object
        //   21	305	7	localb	b.i.b.a.c.g.d.b
        //   29	278	8	localf	f
        // Exception table:
        //   from	to	target	type
        //   37	43	239	finally
        //   69	82	239	finally
        //   85	103	239	finally
        //   109	128	239	finally
        //   128	143	239	finally
        //   148	167	239	finally
        //   167	177	239	finally
        //   180	193	239	finally
        //   198	212	239	finally
        //   215	231	239	finally
        //   244	263	239	finally
        //   264	271	239	finally
        //   37	43	243	java/io/IOException
        //   69	82	243	java/io/IOException
        //   85	103	243	java/io/IOException
        //   109	128	243	java/io/IOException
        //   128	143	243	java/io/IOException
        //   148	167	243	java/io/IOException
        //   167	177	243	java/io/IOException
        //   180	193	243	java/io/IOException
        //   198	212	243	java/io/IOException
        //   215	231	243	java/io/IOException
        //   37	43	263	b/i/b/a/c/g/k
        //   69	82	263	b/i/b/a/c/g/k
        //   85	103	263	b/i/b/a/c/g/k
        //   109	128	263	b/i/b/a/c/g/k
        //   128	143	263	b/i/b/a/c/g/k
        //   148	167	263	b/i/b/a/c/g/k
        //   167	177	263	b/i/b/a/c/g/k
        //   180	193	263	b/i/b/a/c/g/k
        //   198	212	263	b/i/b/a/c/g/k
        //   215	231	263	b/i/b/a/c/g/k
        //   271	276	288	finally
        //   306	311	323	finally
        //   271	276	340	java/io/IOException
        //   306	311	344	java/io/IOException
      }
      
      private a(i.a parama)
      {
        super();
        this.f = parama.a;
      }
      
      public static a a()
      {
        return e;
      }
      
      private void k()
      {
        this.b = b.c;
        this.c = a.aa.a();
        this.d = 0;
      }
      
      public final void a(f paramf)
        throws IOException
      {
        f();
        if ((this.g & 0x1) == 1) {
          paramf.b(1, this.b.e);
        }
        if ((this.g & 0x2) == 2) {
          paramf.a(2, this.c);
        }
        if ((this.g & 0x4) == 4) {
          paramf.a(3, this.d);
        }
        paramf.c(this.f);
      }
      
      public final s<a> b()
      {
        return a;
      }
      
      public final boolean c()
      {
        return (this.g & 0x1) == 1;
      }
      
      public final boolean d()
      {
        return (this.g & 0x2) == 2;
      }
      
      public final boolean e()
      {
        int j = this.h;
        if (j == 1) {
          return true;
        }
        if (j == 0) {
          return false;
        }
        if ((d()) && (!this.c.e()))
        {
          this.h = 0;
          return false;
        }
        this.h = 1;
        return true;
      }
      
      public final int f()
      {
        int j = this.i;
        if (j != -1) {
          return j;
        }
        int k = this.g;
        j = 0;
        if ((k & 0x1) == 1) {
          j = 0 + f.d(1, this.b.e);
        }
        k = j;
        if ((this.g & 0x2) == 2) {
          k = j + f.c(2, this.c);
        }
        j = k;
        if ((this.g & 0x4) == 4) {
          j = k + f.c(3, this.d);
        }
        j += this.f.a();
        this.i = j;
        return j;
      }
      
      public final boolean g()
      {
        return (this.g & 0x4) == 4;
      }
      
      public static final class a
        extends i.a<a.aa.a, a>
        implements a.aa.b
      {
        private int b;
        private a.aa.a.b c = a.aa.a.b.c;
        private a.aa d = a.aa.a();
        private int e;
        
        private a a(int paramInt)
        {
          this.b |= 0x4;
          this.e = paramInt;
          return this;
        }
        
        private a a(a.aa.a.b paramb)
        {
          if (paramb != null)
          {
            this.b |= 0x1;
            this.c = paramb;
            return this;
          }
          throw new NullPointerException();
        }
        
        private a a(a.aa paramaa)
        {
          a.aa localaa = paramaa;
          if ((this.b & 0x2) == 2)
          {
            localaa = paramaa;
            if (this.d != a.aa.a()) {
              localaa = a.aa.a(this.d).a(paramaa).h();
            }
          }
          this.d = localaa;
          this.b |= 0x2;
          return this;
        }
        
        /* Error */
        private a c(b.i.b.a.c.g.e parame, g paramg)
          throws IOException
        {
          // Byte code:
          //   0: aconst_null
          //   1: astore_3
          //   2: getstatic 64	b/i/b/a/c/e/a$aa$a:a	Lb/i/b/a/c/g/s;
          //   5: aload_1
          //   6: aload_2
          //   7: invokeinterface 69 3 0
          //   12: checkcast 14	b/i/b/a/c/e/a$aa$a
          //   15: astore_1
          //   16: aload_0
          //   17: aload_1
          //   18: invokevirtual 72	b/i/b/a/c/e/a$aa$a$a:a	(Lb/i/b/a/c/e/a$aa$a;)Lb/i/b/a/c/e/a$aa$a$a;
          //   21: pop
          //   22: aload_0
          //   23: areturn
          //   24: astore_2
          //   25: aload_3
          //   26: astore_1
          //   27: goto +15 -> 42
          //   30: astore_2
          //   31: aload_2
          //   32: getfield 75	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
          //   35: checkcast 14	b/i/b/a/c/e/a$aa$a
          //   38: astore_1
          //   39: aload_2
          //   40: athrow
          //   41: astore_2
          //   42: aload_1
          //   43: ifnull +9 -> 52
          //   46: aload_0
          //   47: aload_1
          //   48: invokevirtual 72	b/i/b/a/c/e/a$aa$a$a:a	(Lb/i/b/a/c/e/a$aa$a;)Lb/i/b/a/c/e/a$aa$a$a;
          //   51: pop
          //   52: aload_2
          //   53: athrow
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	54	0	this	a
          //   0	54	1	parame	b.i.b.a.c.g.e
          //   0	54	2	paramg	g
          //   1	25	3	localObject	Object
          // Exception table:
          //   from	to	target	type
          //   2	16	24	finally
          //   31	39	24	finally
          //   2	16	30	b/i/b/a/c/g/k
          //   39	41	41	finally
        }
        
        private a g()
        {
          return new a().a(h());
        }
        
        private a.aa.a h()
        {
          int j = 0;
          a.aa.a locala = new a.aa.a(this, (byte)0);
          int k = this.b;
          if ((k & 0x1) == 1) {
            j = 1;
          }
          a.aa.a.a(locala, this.c);
          int i = j;
          if ((k & 0x2) == 2) {
            i = j | 0x2;
          }
          a.aa.a.a(locala, this.d);
          j = i;
          if ((k & 0x4) == 4) {
            j = i | 0x4;
          }
          a.aa.a.a(locala, this.e);
          a.aa.a.b(locala, j);
          return locala;
        }
        
        public final a a(a.aa.a parama)
        {
          if (parama == a.aa.a.a()) {
            return this;
          }
          if (parama.c()) {
            a(parama.b);
          }
          if (parama.d()) {
            a(parama.c);
          }
          if (parama.g()) {
            a(parama.d);
          }
          this.a = this.a.a(a.aa.a.a(parama));
          return this;
        }
        
        public final boolean e()
        {
          int i;
          if ((this.b & 0x2) == 2) {
            i = 1;
          } else {
            i = 0;
          }
          return (i == 0) || (this.d.e());
        }
      }
      
      public static enum b
        implements j.a
      {
        private static j.b<b> f = new j.b() {};
        final int e;
        
        private b(int paramInt1, int paramInt2)
        {
          this.e = paramInt1;
        }
        
        public static b a(int paramInt)
        {
          switch (paramInt)
          {
          default: 
            return null;
          case 3: 
            return d;
          case 2: 
            return c;
          case 1: 
            return b;
          }
          return a;
        }
        
        public final int a()
        {
          return this.e;
        }
      }
    }
    
    public static abstract interface b
      extends r
    {}
    
    public static final class c
      extends i.b<a.aa, c>
      implements a.ad
    {
      private int c;
      private List<a.aa.a> d = Collections.emptyList();
      private boolean e;
      private int f;
      private a.aa g = a.aa.a();
      private int h;
      private int i;
      private int j;
      private int k;
      private int l;
      private a.aa m = a.aa.a();
      private int n;
      private a.aa o = a.aa.a();
      private int p;
      private int q;
      
      private c a(int paramInt)
      {
        this.c |= 0x4;
        this.f = paramInt;
        return this;
      }
      
      private c b(int paramInt)
      {
        this.c |= 0x10;
        this.h = paramInt;
        return this;
      }
      
      private c b(a.aa paramaa)
      {
        a.aa localaa = paramaa;
        if ((this.c & 0x8) == 8)
        {
          localaa = paramaa;
          if (this.g != a.aa.a()) {
            localaa = a.aa.a(this.g).a(paramaa).h();
          }
        }
        this.g = localaa;
        this.c |= 0x8;
        return this;
      }
      
      private c c(int paramInt)
      {
        this.c |= 0x20;
        this.i = paramInt;
        return this;
      }
      
      private c c(a.aa paramaa)
      {
        a.aa localaa = paramaa;
        if ((this.c & 0x200) == 512)
        {
          localaa = paramaa;
          if (this.m != a.aa.a()) {
            localaa = a.aa.a(this.m).a(paramaa).h();
          }
        }
        this.m = localaa;
        this.c |= 0x200;
        return this;
      }
      
      /* Error */
      private c c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 79	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 84 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$aa
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 67	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 87	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$aa
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 67	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	c
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private c d(int paramInt)
      {
        this.c |= 0x40;
        this.j = paramInt;
        return this;
      }
      
      private c d(a.aa paramaa)
      {
        a.aa localaa = paramaa;
        if ((this.c & 0x800) == 2048)
        {
          localaa = paramaa;
          if (this.o != a.aa.a()) {
            localaa = a.aa.a(this.o).a(paramaa).h();
          }
        }
        this.o = localaa;
        this.c |= 0x800;
        return this;
      }
      
      private c e(int paramInt)
      {
        this.c |= 0x80;
        this.k = paramInt;
        return this;
      }
      
      private c f(int paramInt)
      {
        this.c |= 0x100;
        this.l = paramInt;
        return this;
      }
      
      private c g(int paramInt)
      {
        this.c |= 0x400;
        this.n = paramInt;
        return this;
      }
      
      private c h(int paramInt)
      {
        this.c |= 0x1000;
        this.p = paramInt;
        return this;
      }
      
      private c i(int paramInt)
      {
        this.c |= 0x2000;
        this.q = paramInt;
        return this;
      }
      
      private c k()
      {
        return new c().a(h());
      }
      
      private void l()
      {
        if ((this.c & 0x1) != 1)
        {
          this.d = new ArrayList(this.d);
          this.c |= 0x1;
        }
      }
      
      public final c a(a.aa paramaa)
      {
        if (paramaa == a.aa.a()) {
          return this;
        }
        if (!a.aa.b(paramaa).isEmpty()) {
          if (this.d.isEmpty())
          {
            this.d = a.aa.b(paramaa);
            this.c &= 0xFFFFFFFE;
          }
          else
          {
            l();
            this.d.addAll(a.aa.b(paramaa));
          }
        }
        if (paramaa.d()) {
          a(paramaa.c);
        }
        if (paramaa.g()) {
          a(paramaa.d);
        }
        if (paramaa.k()) {
          b(paramaa.e);
        }
        if (paramaa.l()) {
          b(paramaa.f);
        }
        if (paramaa.m()) {
          c(paramaa.g);
        }
        if (paramaa.n()) {
          d(paramaa.h);
        }
        if (paramaa.o()) {
          e(paramaa.i);
        }
        if (paramaa.p()) {
          f(paramaa.j);
        }
        if (paramaa.q()) {
          c(paramaa.k);
        }
        if (paramaa.r()) {
          g(paramaa.l);
        }
        if (paramaa.s()) {
          d(paramaa.m);
        }
        if (paramaa.t()) {
          h(paramaa.n);
        }
        if (paramaa.u()) {
          i(paramaa.o);
        }
        a(paramaa);
        this.a = this.a.a(a.aa.c(paramaa));
        return this;
      }
      
      public final c a(boolean paramBoolean)
      {
        this.c |= 0x2;
        this.e = paramBoolean;
        return this;
      }
      
      public final boolean e()
      {
        int i1 = 0;
        while (i1 < this.d.size())
        {
          if (!((a.aa.a)this.d.get(i1)).e()) {
            return false;
          }
          i1 += 1;
        }
        if ((this.c & 0x8) == 8) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if ((i1 != 0) && (!this.g.e())) {
          return false;
        }
        if ((this.c & 0x200) == 512) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if ((i1 != 0) && (!this.m.e())) {
          return false;
        }
        if ((this.c & 0x800) == 2048) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if ((i1 != 0) && (!this.o.e())) {
          return false;
        }
        return this.b.e();
      }
      
      public final a.aa g()
      {
        a.aa localaa = h();
        if (localaa.e()) {
          return localaa;
        }
        throw new w();
      }
      
      public final a.aa h()
      {
        int i2 = 0;
        a.aa localaa = new a.aa(this, (byte)0);
        int i3 = this.c;
        if ((this.c & 0x1) == 1)
        {
          this.d = Collections.unmodifiableList(this.d);
          this.c &= 0xFFFFFFFE;
        }
        a.aa.a(localaa, this.d);
        if ((i3 & 0x2) == 2) {
          i2 = 1;
        }
        a.aa.a(localaa, this.e);
        int i1 = i2;
        if ((i3 & 0x4) == 4) {
          i1 = i2 | 0x2;
        }
        a.aa.a(localaa, this.f);
        i2 = i1;
        if ((i3 & 0x8) == 8) {
          i2 = i1 | 0x4;
        }
        a.aa.a(localaa, this.g);
        i1 = i2;
        if ((i3 & 0x10) == 16) {
          i1 = i2 | 0x8;
        }
        a.aa.b(localaa, this.h);
        i2 = i1;
        if ((i3 & 0x20) == 32) {
          i2 = i1 | 0x10;
        }
        a.aa.c(localaa, this.i);
        i1 = i2;
        if ((i3 & 0x40) == 64) {
          i1 = i2 | 0x20;
        }
        a.aa.d(localaa, this.j);
        i2 = i1;
        if ((i3 & 0x80) == 128) {
          i2 = i1 | 0x40;
        }
        a.aa.e(localaa, this.k);
        i1 = i2;
        if ((i3 & 0x100) == 256) {
          i1 = i2 | 0x80;
        }
        a.aa.f(localaa, this.l);
        i2 = i1;
        if ((i3 & 0x200) == 512) {
          i2 = i1 | 0x100;
        }
        a.aa.b(localaa, this.m);
        i1 = i2;
        if ((i3 & 0x400) == 1024) {
          i1 = i2 | 0x200;
        }
        a.aa.g(localaa, this.n);
        i2 = i1;
        if ((i3 & 0x800) == 2048) {
          i2 = i1 | 0x400;
        }
        a.aa.c(localaa, this.o);
        i1 = i2;
        if ((i3 & 0x1000) == 4096) {
          i1 = i2 | 0x800;
        }
        a.aa.h(localaa, this.p);
        i2 = i1;
        if ((i3 & 0x2000) == 8192) {
          i2 = i1 | 0x1000;
        }
        a.aa.i(localaa, this.q);
        a.aa.j(localaa, i2);
        return localaa;
      }
    }
  }
  
  public static final class ab
    extends i.c<ab>
    implements a.ac
  {
    public static s<ab> a = new b() {};
    private static final ab k;
    public int b;
    public int c;
    public List<a.ae> d;
    public a.aa e;
    public int f;
    public a.aa g;
    public int h;
    public List<a.a> i;
    public List<Integer> j;
    private final d l;
    private int m;
    private byte n = -1;
    private int o = -1;
    
    static
    {
      ab localab = new ab();
      k = localab;
      localab.n();
    }
    
    private ab()
    {
      this.l = d.b;
    }
    
    /* Error */
    private ab(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 54	b/i/b/a/c/g/i$c:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 56	b/i/b/a/c/e/a$ab:n	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 58	b/i/b/a/c/e/a$ab:o	I
      //   14: aload_0
      //   15: invokespecial 52	b/i/b/a/c/e/a$ab:n	()V
      //   18: invokestatic 72	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   21: astore 13
      //   23: aload 13
      //   25: iconst_1
      //   26: invokestatic 77	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   29: astore 14
      //   31: iconst_0
      //   32: istore 8
      //   34: iconst_0
      //   35: istore_3
      //   36: iload 8
      //   38: ifne +1161 -> 1199
      //   41: iload_3
      //   42: istore 4
      //   44: iload_3
      //   45: istore 5
      //   47: iload_3
      //   48: istore 6
      //   50: aload_1
      //   51: invokevirtual 82	b/i/b/a/c/g/e:a	()I
      //   54: istore 7
      //   56: aconst_null
      //   57: astore 12
      //   59: aconst_null
      //   60: astore 11
      //   62: iload 7
      //   64: lookupswitch	default:+1242->1306, 0:+966->1030, 8:+927->991, 16:+888->952, 26:+807->871, 34:+678->742, 40:+638->702, 50:+510->574, 56:+470->534, 66:+383->447, 248:+278->342, 250:+124->188
      //   164: iload_3
      //   165: istore 4
      //   167: iload_3
      //   168: istore 5
      //   170: iload_3
      //   171: istore 6
      //   173: aload_0
      //   174: aload_1
      //   175: aload 14
      //   177: aload_2
      //   178: iload 7
      //   180: invokevirtual 85	b/i/b/a/c/e/a$ab:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   183: istore 10
      //   185: goto +851 -> 1036
      //   188: iload_3
      //   189: istore 4
      //   191: iload_3
      //   192: istore 5
      //   194: iload_3
      //   195: istore 6
      //   197: aload_1
      //   198: aload_1
      //   199: invokevirtual 87	b/i/b/a/c/g/e:d	()I
      //   202: invokevirtual 90	b/i/b/a/c/g/e:b	(I)I
      //   205: istore 9
      //   207: iload_3
      //   208: istore 7
      //   210: iload_3
      //   211: sipush 256
      //   214: iand
      //   215: sipush 256
      //   218: if_icmpeq +49 -> 267
      //   221: iload_3
      //   222: istore 7
      //   224: iload_3
      //   225: istore 4
      //   227: iload_3
      //   228: istore 5
      //   230: iload_3
      //   231: istore 6
      //   233: aload_1
      //   234: invokevirtual 92	b/i/b/a/c/g/e:h	()I
      //   237: ifle +30 -> 267
      //   240: iload_3
      //   241: istore 4
      //   243: iload_3
      //   244: istore 5
      //   246: iload_3
      //   247: istore 6
      //   249: aload_0
      //   250: new 94	java/util/ArrayList
      //   253: dup
      //   254: invokespecial 95	java/util/ArrayList:<init>	()V
      //   257: putfield 97	b/i/b/a/c/e/a$ab:j	Ljava/util/List;
      //   260: iload_3
      //   261: sipush 256
      //   264: ior
      //   265: istore 7
      //   267: iload 7
      //   269: istore 4
      //   271: iload 7
      //   273: istore 5
      //   275: iload 7
      //   277: istore 6
      //   279: aload_1
      //   280: invokevirtual 92	b/i/b/a/c/g/e:h	()I
      //   283: ifle +35 -> 318
      //   286: iload 7
      //   288: istore 4
      //   290: iload 7
      //   292: istore 5
      //   294: iload 7
      //   296: istore 6
      //   298: aload_0
      //   299: getfield 97	b/i/b/a/c/e/a$ab:j	Ljava/util/List;
      //   302: aload_1
      //   303: invokevirtual 87	b/i/b/a/c/g/e:d	()I
      //   306: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   309: invokeinterface 109 2 0
      //   314: pop
      //   315: goto -48 -> 267
      //   318: iload 7
      //   320: istore 4
      //   322: iload 7
      //   324: istore 5
      //   326: iload 7
      //   328: istore 6
      //   330: aload_1
      //   331: iload 9
      //   333: invokevirtual 112	b/i/b/a/c/g/e:c	(I)V
      //   336: iload 7
      //   338: istore_3
      //   339: goto -303 -> 36
      //   342: iload_3
      //   343: istore 7
      //   345: iload_3
      //   346: sipush 256
      //   349: iand
      //   350: sipush 256
      //   353: if_icmpeq +30 -> 383
      //   356: iload_3
      //   357: istore 4
      //   359: iload_3
      //   360: istore 5
      //   362: iload_3
      //   363: istore 6
      //   365: aload_0
      //   366: new 94	java/util/ArrayList
      //   369: dup
      //   370: invokespecial 95	java/util/ArrayList:<init>	()V
      //   373: putfield 97	b/i/b/a/c/e/a$ab:j	Ljava/util/List;
      //   376: iload_3
      //   377: sipush 256
      //   380: ior
      //   381: istore 7
      //   383: iload 7
      //   385: istore 4
      //   387: iload 7
      //   389: istore 5
      //   391: iload 7
      //   393: istore 6
      //   395: aload_0
      //   396: getfield 97	b/i/b/a/c/e/a$ab:j	Ljava/util/List;
      //   399: astore 11
      //   401: iload 7
      //   403: istore 4
      //   405: iload 7
      //   407: istore 5
      //   409: iload 7
      //   411: istore 6
      //   413: aload_1
      //   414: invokevirtual 87	b/i/b/a/c/g/e:d	()I
      //   417: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   420: astore 12
      //   422: iload 7
      //   424: istore_3
      //   425: iload_3
      //   426: istore 4
      //   428: iload_3
      //   429: istore 5
      //   431: iload_3
      //   432: istore 6
      //   434: aload 11
      //   436: aload 12
      //   438: invokeinterface 109 2 0
      //   443: pop
      //   444: goto -408 -> 36
      //   447: iload_3
      //   448: istore 7
      //   450: iload_3
      //   451: sipush 128
      //   454: iand
      //   455: sipush 128
      //   458: if_icmpeq +30 -> 488
      //   461: iload_3
      //   462: istore 4
      //   464: iload_3
      //   465: istore 5
      //   467: iload_3
      //   468: istore 6
      //   470: aload_0
      //   471: new 94	java/util/ArrayList
      //   474: dup
      //   475: invokespecial 95	java/util/ArrayList:<init>	()V
      //   478: putfield 114	b/i/b/a/c/e/a$ab:i	Ljava/util/List;
      //   481: iload_3
      //   482: sipush 128
      //   485: ior
      //   486: istore 7
      //   488: iload 7
      //   490: istore 4
      //   492: iload 7
      //   494: istore 5
      //   496: iload 7
      //   498: istore 6
      //   500: aload_0
      //   501: getfield 114	b/i/b/a/c/e/a$ab:i	Ljava/util/List;
      //   504: astore 11
      //   506: iload 7
      //   508: istore 4
      //   510: iload 7
      //   512: istore 5
      //   514: iload 7
      //   516: istore 6
      //   518: aload_1
      //   519: getstatic 117	b/i/b/a/c/e/a$a:a	Lb/i/b/a/c/g/s;
      //   522: aload_2
      //   523: invokevirtual 120	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   526: astore 12
      //   528: iload 7
      //   530: istore_3
      //   531: goto -106 -> 425
      //   534: iload_3
      //   535: istore 4
      //   537: iload_3
      //   538: istore 5
      //   540: iload_3
      //   541: istore 6
      //   543: aload_0
      //   544: aload_0
      //   545: getfield 122	b/i/b/a/c/e/a$ab:m	I
      //   548: bipush 32
      //   550: ior
      //   551: putfield 122	b/i/b/a/c/e/a$ab:m	I
      //   554: iload_3
      //   555: istore 4
      //   557: iload_3
      //   558: istore 5
      //   560: iload_3
      //   561: istore 6
      //   563: aload_0
      //   564: aload_1
      //   565: invokevirtual 87	b/i/b/a/c/g/e:d	()I
      //   568: putfield 124	b/i/b/a/c/e/a$ab:h	I
      //   571: goto -535 -> 36
      //   574: iload_3
      //   575: istore 4
      //   577: iload_3
      //   578: istore 5
      //   580: iload_3
      //   581: istore 6
      //   583: aload_0
      //   584: getfield 122	b/i/b/a/c/e/a$ab:m	I
      //   587: bipush 16
      //   589: iand
      //   590: bipush 16
      //   592: if_icmpne +21 -> 613
      //   595: iload_3
      //   596: istore 4
      //   598: iload_3
      //   599: istore 5
      //   601: iload_3
      //   602: istore 6
      //   604: aload_0
      //   605: getfield 126	b/i/b/a/c/e/a$ab:g	Lb/i/b/a/c/e/a$aa;
      //   608: invokevirtual 132	b/i/b/a/c/e/a$aa:v	()Lb/i/b/a/c/e/a$aa$c;
      //   611: astore 11
      //   613: iload_3
      //   614: istore 4
      //   616: iload_3
      //   617: istore 5
      //   619: iload_3
      //   620: istore 6
      //   622: aload_0
      //   623: aload_1
      //   624: getstatic 133	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   627: aload_2
      //   628: invokevirtual 120	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   631: checkcast 128	b/i/b/a/c/e/a$aa
      //   634: putfield 126	b/i/b/a/c/e/a$ab:g	Lb/i/b/a/c/e/a$aa;
      //   637: aload 11
      //   639: ifnull +40 -> 679
      //   642: iload_3
      //   643: istore 4
      //   645: iload_3
      //   646: istore 5
      //   648: iload_3
      //   649: istore 6
      //   651: aload 11
      //   653: aload_0
      //   654: getfield 126	b/i/b/a/c/e/a$ab:g	Lb/i/b/a/c/e/a$aa;
      //   657: invokevirtual 138	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   660: pop
      //   661: iload_3
      //   662: istore 4
      //   664: iload_3
      //   665: istore 5
      //   667: iload_3
      //   668: istore 6
      //   670: aload_0
      //   671: aload 11
      //   673: invokevirtual 141	b/i/b/a/c/e/a$aa$c:h	()Lb/i/b/a/c/e/a$aa;
      //   676: putfield 126	b/i/b/a/c/e/a$ab:g	Lb/i/b/a/c/e/a$aa;
      //   679: iload_3
      //   680: istore 4
      //   682: iload_3
      //   683: istore 5
      //   685: iload_3
      //   686: istore 6
      //   688: aload_0
      //   689: aload_0
      //   690: getfield 122	b/i/b/a/c/e/a$ab:m	I
      //   693: bipush 16
      //   695: ior
      //   696: putfield 122	b/i/b/a/c/e/a$ab:m	I
      //   699: goto -663 -> 36
      //   702: iload_3
      //   703: istore 4
      //   705: iload_3
      //   706: istore 5
      //   708: iload_3
      //   709: istore 6
      //   711: aload_0
      //   712: aload_0
      //   713: getfield 122	b/i/b/a/c/e/a$ab:m	I
      //   716: bipush 8
      //   718: ior
      //   719: putfield 122	b/i/b/a/c/e/a$ab:m	I
      //   722: iload_3
      //   723: istore 4
      //   725: iload_3
      //   726: istore 5
      //   728: iload_3
      //   729: istore 6
      //   731: aload_0
      //   732: aload_1
      //   733: invokevirtual 87	b/i/b/a/c/g/e:d	()I
      //   736: putfield 143	b/i/b/a/c/e/a$ab:f	I
      //   739: goto -703 -> 36
      //   742: aload 12
      //   744: astore 11
      //   746: iload_3
      //   747: istore 4
      //   749: iload_3
      //   750: istore 5
      //   752: iload_3
      //   753: istore 6
      //   755: aload_0
      //   756: getfield 122	b/i/b/a/c/e/a$ab:m	I
      //   759: iconst_4
      //   760: iand
      //   761: iconst_4
      //   762: if_icmpne +21 -> 783
      //   765: iload_3
      //   766: istore 4
      //   768: iload_3
      //   769: istore 5
      //   771: iload_3
      //   772: istore 6
      //   774: aload_0
      //   775: getfield 145	b/i/b/a/c/e/a$ab:e	Lb/i/b/a/c/e/a$aa;
      //   778: invokevirtual 132	b/i/b/a/c/e/a$aa:v	()Lb/i/b/a/c/e/a$aa$c;
      //   781: astore 11
      //   783: iload_3
      //   784: istore 4
      //   786: iload_3
      //   787: istore 5
      //   789: iload_3
      //   790: istore 6
      //   792: aload_0
      //   793: aload_1
      //   794: getstatic 133	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   797: aload_2
      //   798: invokevirtual 120	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   801: checkcast 128	b/i/b/a/c/e/a$aa
      //   804: putfield 145	b/i/b/a/c/e/a$ab:e	Lb/i/b/a/c/e/a$aa;
      //   807: aload 11
      //   809: ifnull +40 -> 849
      //   812: iload_3
      //   813: istore 4
      //   815: iload_3
      //   816: istore 5
      //   818: iload_3
      //   819: istore 6
      //   821: aload 11
      //   823: aload_0
      //   824: getfield 145	b/i/b/a/c/e/a$ab:e	Lb/i/b/a/c/e/a$aa;
      //   827: invokevirtual 138	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   830: pop
      //   831: iload_3
      //   832: istore 4
      //   834: iload_3
      //   835: istore 5
      //   837: iload_3
      //   838: istore 6
      //   840: aload_0
      //   841: aload 11
      //   843: invokevirtual 141	b/i/b/a/c/e/a$aa$c:h	()Lb/i/b/a/c/e/a$aa;
      //   846: putfield 145	b/i/b/a/c/e/a$ab:e	Lb/i/b/a/c/e/a$aa;
      //   849: iload_3
      //   850: istore 4
      //   852: iload_3
      //   853: istore 5
      //   855: iload_3
      //   856: istore 6
      //   858: aload_0
      //   859: aload_0
      //   860: getfield 122	b/i/b/a/c/e/a$ab:m	I
      //   863: iconst_4
      //   864: ior
      //   865: putfield 122	b/i/b/a/c/e/a$ab:m	I
      //   868: goto -832 -> 36
      //   871: iload_3
      //   872: istore 7
      //   874: iload_3
      //   875: iconst_4
      //   876: iand
      //   877: iconst_4
      //   878: if_icmpeq +28 -> 906
      //   881: iload_3
      //   882: istore 4
      //   884: iload_3
      //   885: istore 5
      //   887: iload_3
      //   888: istore 6
      //   890: aload_0
      //   891: new 94	java/util/ArrayList
      //   894: dup
      //   895: invokespecial 95	java/util/ArrayList:<init>	()V
      //   898: putfield 147	b/i/b/a/c/e/a$ab:d	Ljava/util/List;
      //   901: iload_3
      //   902: iconst_4
      //   903: ior
      //   904: istore 7
      //   906: iload 7
      //   908: istore 4
      //   910: iload 7
      //   912: istore 5
      //   914: iload 7
      //   916: istore 6
      //   918: aload_0
      //   919: getfield 147	b/i/b/a/c/e/a$ab:d	Ljava/util/List;
      //   922: astore 11
      //   924: iload 7
      //   926: istore 4
      //   928: iload 7
      //   930: istore 5
      //   932: iload 7
      //   934: istore 6
      //   936: aload_1
      //   937: getstatic 150	b/i/b/a/c/e/a$ae:a	Lb/i/b/a/c/g/s;
      //   940: aload_2
      //   941: invokevirtual 120	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   944: astore 12
      //   946: iload 7
      //   948: istore_3
      //   949: goto -524 -> 425
      //   952: iload_3
      //   953: istore 4
      //   955: iload_3
      //   956: istore 5
      //   958: iload_3
      //   959: istore 6
      //   961: aload_0
      //   962: aload_0
      //   963: getfield 122	b/i/b/a/c/e/a$ab:m	I
      //   966: iconst_2
      //   967: ior
      //   968: putfield 122	b/i/b/a/c/e/a$ab:m	I
      //   971: iload_3
      //   972: istore 4
      //   974: iload_3
      //   975: istore 5
      //   977: iload_3
      //   978: istore 6
      //   980: aload_0
      //   981: aload_1
      //   982: invokevirtual 87	b/i/b/a/c/g/e:d	()I
      //   985: putfield 152	b/i/b/a/c/e/a$ab:c	I
      //   988: goto -952 -> 36
      //   991: iload_3
      //   992: istore 4
      //   994: iload_3
      //   995: istore 5
      //   997: iload_3
      //   998: istore 6
      //   1000: aload_0
      //   1001: aload_0
      //   1002: getfield 122	b/i/b/a/c/e/a$ab:m	I
      //   1005: iconst_1
      //   1006: ior
      //   1007: putfield 122	b/i/b/a/c/e/a$ab:m	I
      //   1010: iload_3
      //   1011: istore 4
      //   1013: iload_3
      //   1014: istore 5
      //   1016: iload_3
      //   1017: istore 6
      //   1019: aload_0
      //   1020: aload_1
      //   1021: invokevirtual 87	b/i/b/a/c/g/e:d	()I
      //   1024: putfield 154	b/i/b/a/c/e/a$ab:b	I
      //   1027: goto -991 -> 36
      //   1030: iconst_1
      //   1031: istore 8
      //   1033: goto -997 -> 36
      //   1036: iload 10
      //   1038: ifne -1002 -> 36
      //   1041: goto -11 -> 1030
      //   1044: astore_1
      //   1045: goto +51 -> 1096
      //   1048: astore_1
      //   1049: iload 5
      //   1051: istore 4
      //   1053: new 67	b/i/b/a/c/g/k
      //   1056: dup
      //   1057: aload_1
      //   1058: invokevirtual 158	java/io/IOException:getMessage	()Ljava/lang/String;
      //   1061: invokespecial 161	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   1064: astore_1
      //   1065: iload 5
      //   1067: istore 4
      //   1069: aload_1
      //   1070: aload_0
      //   1071: putfield 164	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   1074: iload 5
      //   1076: istore 4
      //   1078: aload_1
      //   1079: athrow
      //   1080: astore_1
      //   1081: iload 6
      //   1083: istore 4
      //   1085: aload_1
      //   1086: aload_0
      //   1087: putfield 164	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   1090: iload 6
      //   1092: istore 4
      //   1094: aload_1
      //   1095: athrow
      //   1096: iload 4
      //   1098: iconst_4
      //   1099: iand
      //   1100: iconst_4
      //   1101: if_icmpne +14 -> 1115
      //   1104: aload_0
      //   1105: aload_0
      //   1106: getfield 147	b/i/b/a/c/e/a$ab:d	Ljava/util/List;
      //   1109: invokestatic 170	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1112: putfield 147	b/i/b/a/c/e/a$ab:d	Ljava/util/List;
      //   1115: iload 4
      //   1117: sipush 128
      //   1120: iand
      //   1121: sipush 128
      //   1124: if_icmpne +14 -> 1138
      //   1127: aload_0
      //   1128: aload_0
      //   1129: getfield 114	b/i/b/a/c/e/a$ab:i	Ljava/util/List;
      //   1132: invokestatic 170	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1135: putfield 114	b/i/b/a/c/e/a$ab:i	Ljava/util/List;
      //   1138: iload 4
      //   1140: sipush 256
      //   1143: iand
      //   1144: sipush 256
      //   1147: if_icmpne +14 -> 1161
      //   1150: aload_0
      //   1151: aload_0
      //   1152: getfield 97	b/i/b/a/c/e/a$ab:j	Ljava/util/List;
      //   1155: invokestatic 170	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1158: putfield 97	b/i/b/a/c/e/a$ab:j	Ljava/util/List;
      //   1161: aload 14
      //   1163: invokevirtual 172	b/i/b/a/c/g/f:a	()V
      //   1166: aload_0
      //   1167: aload 13
      //   1169: invokevirtual 177	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1172: putfield 64	b/i/b/a/c/e/a$ab:l	Lb/i/b/a/c/g/d;
      //   1175: goto +15 -> 1190
      //   1178: astore_1
      //   1179: aload_0
      //   1180: aload 13
      //   1182: invokevirtual 177	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1185: putfield 64	b/i/b/a/c/e/a$ab:l	Lb/i/b/a/c/g/d;
      //   1188: aload_1
      //   1189: athrow
      //   1190: aload_0
      //   1191: getfield 181	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   1194: invokevirtual 185	b/i/b/a/c/g/h:c	()V
      //   1197: aload_1
      //   1198: athrow
      //   1199: iload_3
      //   1200: iconst_4
      //   1201: iand
      //   1202: iconst_4
      //   1203: if_icmpne +14 -> 1217
      //   1206: aload_0
      //   1207: aload_0
      //   1208: getfield 147	b/i/b/a/c/e/a$ab:d	Ljava/util/List;
      //   1211: invokestatic 170	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1214: putfield 147	b/i/b/a/c/e/a$ab:d	Ljava/util/List;
      //   1217: iload_3
      //   1218: sipush 128
      //   1221: iand
      //   1222: sipush 128
      //   1225: if_icmpne +14 -> 1239
      //   1228: aload_0
      //   1229: aload_0
      //   1230: getfield 114	b/i/b/a/c/e/a$ab:i	Ljava/util/List;
      //   1233: invokestatic 170	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1236: putfield 114	b/i/b/a/c/e/a$ab:i	Ljava/util/List;
      //   1239: iload_3
      //   1240: sipush 256
      //   1243: iand
      //   1244: sipush 256
      //   1247: if_icmpne +14 -> 1261
      //   1250: aload_0
      //   1251: aload_0
      //   1252: getfield 97	b/i/b/a/c/e/a$ab:j	Ljava/util/List;
      //   1255: invokestatic 170	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1258: putfield 97	b/i/b/a/c/e/a$ab:j	Ljava/util/List;
      //   1261: aload 14
      //   1263: invokevirtual 172	b/i/b/a/c/g/f:a	()V
      //   1266: aload_0
      //   1267: aload 13
      //   1269: invokevirtual 177	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1272: putfield 64	b/i/b/a/c/e/a$ab:l	Lb/i/b/a/c/g/d;
      //   1275: goto +15 -> 1290
      //   1278: astore_1
      //   1279: aload_0
      //   1280: aload 13
      //   1282: invokevirtual 177	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1285: putfield 64	b/i/b/a/c/e/a$ab:l	Lb/i/b/a/c/g/d;
      //   1288: aload_1
      //   1289: athrow
      //   1290: aload_0
      //   1291: getfield 181	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   1294: invokevirtual 185	b/i/b/a/c/g/h:c	()V
      //   1297: return
      //   1298: astore_2
      //   1299: goto -133 -> 1166
      //   1302: astore_1
      //   1303: goto -37 -> 1266
      //   1306: goto -1142 -> 164
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1309	0	this	ab
      //   0	1309	1	parame	b.i.b.a.c.g.e
      //   0	1309	2	paramg	g
      //   35	1209	3	i1	int
      //   42	1102	4	i2	int
      //   45	1030	5	i3	int
      //   48	1043	6	i4	int
      //   54	893	7	i5	int
      //   32	1000	8	i6	int
      //   205	127	9	i7	int
      //   183	854	10	bool	boolean
      //   60	863	11	localObject1	Object
      //   57	888	12	localObject2	Object
      //   21	1260	13	localb	b.i.b.a.c.g.d.b
      //   29	1233	14	localf	f
      // Exception table:
      //   from	to	target	type
      //   50	56	1044	finally
      //   173	185	1044	finally
      //   197	207	1044	finally
      //   233	240	1044	finally
      //   249	260	1044	finally
      //   279	286	1044	finally
      //   298	315	1044	finally
      //   330	336	1044	finally
      //   365	376	1044	finally
      //   395	401	1044	finally
      //   413	422	1044	finally
      //   434	444	1044	finally
      //   470	481	1044	finally
      //   500	506	1044	finally
      //   518	528	1044	finally
      //   543	554	1044	finally
      //   563	571	1044	finally
      //   583	595	1044	finally
      //   604	613	1044	finally
      //   622	637	1044	finally
      //   651	661	1044	finally
      //   670	679	1044	finally
      //   688	699	1044	finally
      //   711	722	1044	finally
      //   731	739	1044	finally
      //   755	765	1044	finally
      //   774	783	1044	finally
      //   792	807	1044	finally
      //   821	831	1044	finally
      //   840	849	1044	finally
      //   858	868	1044	finally
      //   890	901	1044	finally
      //   918	924	1044	finally
      //   936	946	1044	finally
      //   961	971	1044	finally
      //   980	988	1044	finally
      //   1000	1010	1044	finally
      //   1019	1027	1044	finally
      //   1053	1065	1044	finally
      //   1069	1074	1044	finally
      //   1078	1080	1044	finally
      //   1085	1090	1044	finally
      //   1094	1096	1044	finally
      //   50	56	1048	java/io/IOException
      //   173	185	1048	java/io/IOException
      //   197	207	1048	java/io/IOException
      //   233	240	1048	java/io/IOException
      //   249	260	1048	java/io/IOException
      //   279	286	1048	java/io/IOException
      //   298	315	1048	java/io/IOException
      //   330	336	1048	java/io/IOException
      //   365	376	1048	java/io/IOException
      //   395	401	1048	java/io/IOException
      //   413	422	1048	java/io/IOException
      //   434	444	1048	java/io/IOException
      //   470	481	1048	java/io/IOException
      //   500	506	1048	java/io/IOException
      //   518	528	1048	java/io/IOException
      //   543	554	1048	java/io/IOException
      //   563	571	1048	java/io/IOException
      //   583	595	1048	java/io/IOException
      //   604	613	1048	java/io/IOException
      //   622	637	1048	java/io/IOException
      //   651	661	1048	java/io/IOException
      //   670	679	1048	java/io/IOException
      //   688	699	1048	java/io/IOException
      //   711	722	1048	java/io/IOException
      //   731	739	1048	java/io/IOException
      //   755	765	1048	java/io/IOException
      //   774	783	1048	java/io/IOException
      //   792	807	1048	java/io/IOException
      //   821	831	1048	java/io/IOException
      //   840	849	1048	java/io/IOException
      //   858	868	1048	java/io/IOException
      //   890	901	1048	java/io/IOException
      //   918	924	1048	java/io/IOException
      //   936	946	1048	java/io/IOException
      //   961	971	1048	java/io/IOException
      //   980	988	1048	java/io/IOException
      //   1000	1010	1048	java/io/IOException
      //   1019	1027	1048	java/io/IOException
      //   50	56	1080	b/i/b/a/c/g/k
      //   173	185	1080	b/i/b/a/c/g/k
      //   197	207	1080	b/i/b/a/c/g/k
      //   233	240	1080	b/i/b/a/c/g/k
      //   249	260	1080	b/i/b/a/c/g/k
      //   279	286	1080	b/i/b/a/c/g/k
      //   298	315	1080	b/i/b/a/c/g/k
      //   330	336	1080	b/i/b/a/c/g/k
      //   365	376	1080	b/i/b/a/c/g/k
      //   395	401	1080	b/i/b/a/c/g/k
      //   413	422	1080	b/i/b/a/c/g/k
      //   434	444	1080	b/i/b/a/c/g/k
      //   470	481	1080	b/i/b/a/c/g/k
      //   500	506	1080	b/i/b/a/c/g/k
      //   518	528	1080	b/i/b/a/c/g/k
      //   543	554	1080	b/i/b/a/c/g/k
      //   563	571	1080	b/i/b/a/c/g/k
      //   583	595	1080	b/i/b/a/c/g/k
      //   604	613	1080	b/i/b/a/c/g/k
      //   622	637	1080	b/i/b/a/c/g/k
      //   651	661	1080	b/i/b/a/c/g/k
      //   670	679	1080	b/i/b/a/c/g/k
      //   688	699	1080	b/i/b/a/c/g/k
      //   711	722	1080	b/i/b/a/c/g/k
      //   731	739	1080	b/i/b/a/c/g/k
      //   755	765	1080	b/i/b/a/c/g/k
      //   774	783	1080	b/i/b/a/c/g/k
      //   792	807	1080	b/i/b/a/c/g/k
      //   821	831	1080	b/i/b/a/c/g/k
      //   840	849	1080	b/i/b/a/c/g/k
      //   858	868	1080	b/i/b/a/c/g/k
      //   890	901	1080	b/i/b/a/c/g/k
      //   918	924	1080	b/i/b/a/c/g/k
      //   936	946	1080	b/i/b/a/c/g/k
      //   961	971	1080	b/i/b/a/c/g/k
      //   980	988	1080	b/i/b/a/c/g/k
      //   1000	1010	1080	b/i/b/a/c/g/k
      //   1019	1027	1080	b/i/b/a/c/g/k
      //   1161	1166	1178	finally
      //   1261	1266	1278	finally
      //   1161	1166	1298	java/io/IOException
      //   1261	1266	1302	java/io/IOException
    }
    
    private ab(i.b<ab, ?> paramb)
    {
      super();
      this.l = paramb.a;
    }
    
    public static ab a()
    {
      return k;
    }
    
    public static ab a(InputStream paramInputStream, g paramg)
      throws IOException
    {
      return (ab)a.a(paramInputStream, paramg);
    }
    
    private void n()
    {
      this.b = 6;
      this.c = 0;
      this.d = Collections.emptyList();
      this.e = a.aa.a();
      this.f = 0;
      this.g = a.aa.a();
      this.h = 0;
      this.i = Collections.emptyList();
      this.j = Collections.emptyList();
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      i.c.a locala = x();
      if ((this.m & 0x1) == 1) {
        paramf.a(1, this.b);
      }
      if ((this.m & 0x2) == 2) {
        paramf.a(2, this.c);
      }
      int i3 = 0;
      int i1 = 0;
      while (i1 < this.d.size())
      {
        paramf.a(3, (q)this.d.get(i1));
        i1 += 1;
      }
      if ((this.m & 0x4) == 4) {
        paramf.a(4, this.e);
      }
      if ((this.m & 0x8) == 8) {
        paramf.a(5, this.f);
      }
      if ((this.m & 0x10) == 16) {
        paramf.a(6, this.g);
      }
      if ((this.m & 0x20) == 32) {
        paramf.a(7, this.h);
      }
      i1 = 0;
      int i2;
      for (;;)
      {
        i2 = i3;
        if (i1 >= this.i.size()) {
          break;
        }
        paramf.a(8, (q)this.i.get(i1));
        i1 += 1;
      }
      while (i2 < this.j.size())
      {
        paramf.a(31, ((Integer)this.j.get(i2)).intValue());
        i2 += 1;
      }
      locala.a(200, paramf);
      paramf.c(this.l);
    }
    
    public final s<ab> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.m & 0x1) == 1;
    }
    
    public final boolean d()
    {
      return (this.m & 0x2) == 2;
    }
    
    public final boolean e()
    {
      int i1 = this.n;
      if (i1 == 1) {
        return true;
      }
      if (i1 == 0) {
        return false;
      }
      if (!d())
      {
        this.n = 0;
        return false;
      }
      i1 = 0;
      while (i1 < this.d.size())
      {
        if (!((a.ae)this.d.get(i1)).e())
        {
          this.n = 0;
          return false;
        }
        i1 += 1;
      }
      if ((g()) && (!this.e.e()))
      {
        this.n = 0;
        return false;
      }
      if ((l()) && (!this.g.e()))
      {
        this.n = 0;
        return false;
      }
      i1 = 0;
      while (i1 < this.i.size())
      {
        if (!((a.a)this.i.get(i1)).e())
        {
          this.n = 0;
          return false;
        }
        i1 += 1;
      }
      if (!this.s.e())
      {
        this.n = 0;
        return false;
      }
      this.n = 1;
      return true;
    }
    
    public final int f()
    {
      int i1 = this.o;
      if (i1 != -1) {
        return i1;
      }
      i1 = this.m;
      int i3 = 0;
      if ((i1 & 0x1) == 1) {
        i1 = f.c(1, this.b) + 0;
      } else {
        i1 = 0;
      }
      int i2 = i1;
      if ((this.m & 0x2) == 2) {
        i2 = i1 + f.c(2, this.c);
      }
      i1 = i2;
      i2 = 0;
      while (i2 < this.d.size())
      {
        i1 += f.c(3, (q)this.d.get(i2));
        i2 += 1;
      }
      i2 = i1;
      if ((this.m & 0x4) == 4) {
        i2 = i1 + f.c(4, this.e);
      }
      i1 = i2;
      if ((this.m & 0x8) == 8) {
        i1 = i2 + f.c(5, this.f);
      }
      i2 = i1;
      if ((this.m & 0x10) == 16) {
        i2 = i1 + f.c(6, this.g);
      }
      i1 = i2;
      if ((this.m & 0x20) == 32) {
        i1 = i2 + f.c(7, this.h);
      }
      i2 = 0;
      while (i2 < this.i.size())
      {
        i1 += f.c(8, (q)this.i.get(i2));
        i2 += 1;
      }
      int i4 = 0;
      i2 = i3;
      i3 = i4;
      while (i2 < this.j.size())
      {
        i3 += f.c(((Integer)this.j.get(i2)).intValue());
        i2 += 1;
      }
      i1 = i1 + i3 + this.j.size() * 2 + this.s.f() + this.l.a();
      this.o = i1;
      return i1;
    }
    
    public final boolean g()
    {
      return (this.m & 0x4) == 4;
    }
    
    public final boolean k()
    {
      return (this.m & 0x8) == 8;
    }
    
    public final boolean l()
    {
      return (this.m & 0x10) == 16;
    }
    
    public final boolean m()
    {
      return (this.m & 0x20) == 32;
    }
    
    public static final class a
      extends i.b<a.ab, a>
      implements a.ac
    {
      private int c;
      private int d = 6;
      private int e;
      private List<a.ae> f = Collections.emptyList();
      private a.aa g = a.aa.a();
      private int h;
      private a.aa i = a.aa.a();
      private int j;
      private List<a.a> k = Collections.emptyList();
      private List<Integer> l = Collections.emptyList();
      
      private a a(int paramInt)
      {
        this.c |= 0x1;
        this.d = paramInt;
        return this;
      }
      
      private a a(a.aa paramaa)
      {
        a.aa localaa = paramaa;
        if ((this.c & 0x8) == 8)
        {
          localaa = paramaa;
          if (this.g != a.aa.a()) {
            localaa = a.aa.a(this.g).a(paramaa).h();
          }
        }
        this.g = localaa;
        this.c |= 0x8;
        return this;
      }
      
      private a b(int paramInt)
      {
        this.c |= 0x2;
        this.e = paramInt;
        return this;
      }
      
      private a b(a.aa paramaa)
      {
        a.aa localaa = paramaa;
        if ((this.c & 0x20) == 32)
        {
          localaa = paramaa;
          if (this.i != a.aa.a()) {
            localaa = a.aa.a(this.i).a(paramaa).h();
          }
        }
        this.i = localaa;
        this.c |= 0x20;
        return this;
      }
      
      private a c(int paramInt)
      {
        this.c |= 0x10;
        this.h = paramInt;
        return this;
      }
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 82	b/i/b/a/c/e/a$ab:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 87 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$ab
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 90	b/i/b/a/c/e/a$ab$a:a	(Lb/i/b/a/c/e/a$ab;)Lb/i/b/a/c/e/a$ab$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 93	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$ab
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 90	b/i/b/a/c/e/a$ab$a:a	(Lb/i/b/a/c/e/a$ab;)Lb/i/b/a/c/e/a$ab$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a d(int paramInt)
      {
        this.c |= 0x40;
        this.j = paramInt;
        return this;
      }
      
      private a h()
      {
        return new a().a(i());
      }
      
      private a.ab i()
      {
        int n = 0;
        a.ab localab = new a.ab(this, (byte)0);
        int i1 = this.c;
        if ((i1 & 0x1) == 1) {
          n = 1;
        }
        a.ab.a(localab, this.d);
        int m = n;
        if ((i1 & 0x2) == 2) {
          m = n | 0x2;
        }
        a.ab.b(localab, this.e);
        if ((this.c & 0x4) == 4)
        {
          this.f = Collections.unmodifiableList(this.f);
          this.c &= 0xFFFFFFFB;
        }
        a.ab.a(localab, this.f);
        n = m;
        if ((i1 & 0x8) == 8) {
          n = m | 0x4;
        }
        a.ab.a(localab, this.g);
        m = n;
        if ((i1 & 0x10) == 16) {
          m = n | 0x8;
        }
        a.ab.c(localab, this.h);
        n = m;
        if ((i1 & 0x20) == 32) {
          n = m | 0x10;
        }
        a.ab.b(localab, this.i);
        m = n;
        if ((i1 & 0x40) == 64) {
          m = n | 0x20;
        }
        a.ab.d(localab, this.j);
        if ((this.c & 0x80) == 128)
        {
          this.k = Collections.unmodifiableList(this.k);
          this.c &= 0xFF7F;
        }
        a.ab.b(localab, this.k);
        if ((this.c & 0x100) == 256)
        {
          this.l = Collections.unmodifiableList(this.l);
          this.c &= 0xFEFF;
        }
        a.ab.c(localab, this.l);
        a.ab.e(localab, m);
        return localab;
      }
      
      private void k()
      {
        if ((this.c & 0x4) != 4)
        {
          this.f = new ArrayList(this.f);
          this.c |= 0x4;
        }
      }
      
      private void l()
      {
        if ((this.c & 0x80) != 128)
        {
          this.k = new ArrayList(this.k);
          this.c |= 0x80;
        }
      }
      
      private void m()
      {
        if ((this.c & 0x100) != 256)
        {
          this.l = new ArrayList(this.l);
          this.c |= 0x100;
        }
      }
      
      public final a a(a.ab paramab)
      {
        if (paramab == a.ab.a()) {
          return this;
        }
        if (paramab.c()) {
          a(paramab.b);
        }
        if (paramab.d()) {
          b(paramab.c);
        }
        if (!a.ab.a(paramab).isEmpty()) {
          if (this.f.isEmpty())
          {
            this.f = a.ab.a(paramab);
            this.c &= 0xFFFFFFFB;
          }
          else
          {
            k();
            this.f.addAll(a.ab.a(paramab));
          }
        }
        if (paramab.g()) {
          a(paramab.e);
        }
        if (paramab.k()) {
          c(paramab.f);
        }
        if (paramab.l()) {
          b(paramab.g);
        }
        if (paramab.m()) {
          d(paramab.h);
        }
        if (!a.ab.b(paramab).isEmpty()) {
          if (this.k.isEmpty())
          {
            this.k = a.ab.b(paramab);
            this.c &= 0xFF7F;
          }
          else
          {
            l();
            this.k.addAll(a.ab.b(paramab));
          }
        }
        if (!a.ab.c(paramab).isEmpty()) {
          if (this.l.isEmpty())
          {
            this.l = a.ab.c(paramab);
            this.c &= 0xFEFF;
          }
          else
          {
            m();
            this.l.addAll(a.ab.c(paramab));
          }
        }
        a(paramab);
        this.a = this.a.a(a.ab.d(paramab));
        return this;
      }
      
      public final boolean e()
      {
        if ((this.c & 0x2) == 2) {
          m = 1;
        } else {
          m = 0;
        }
        if (m == 0) {
          return false;
        }
        int m = 0;
        while (m < this.f.size())
        {
          if (!((a.ae)this.f.get(m)).e()) {
            return false;
          }
          m += 1;
        }
        if ((this.c & 0x8) == 8) {
          m = 1;
        } else {
          m = 0;
        }
        if ((m != 0) && (!this.g.e())) {
          return false;
        }
        if ((this.c & 0x20) == 32) {
          m = 1;
        } else {
          m = 0;
        }
        if ((m != 0) && (!this.i.e())) {
          return false;
        }
        m = 0;
        while (m < this.k.size())
        {
          if (!((a.a)this.k.get(m)).e()) {
            return false;
          }
          m += 1;
        }
        return this.b.e();
      }
    }
  }
  
  public static abstract interface ac
    extends i.d
  {}
  
  public static abstract interface ad
    extends i.d
  {}
  
  public static final class ae
    extends i.c<ae>
    implements a.af
  {
    public static s<ae> a = new b() {};
    private static final ae h;
    public int b;
    public int c;
    public boolean d;
    public b e;
    public List<a.aa> f;
    public List<Integer> g;
    private final d i;
    private int j;
    private int k = -1;
    private byte l = -1;
    private int m = -1;
    
    static
    {
      ae localae = new ae();
      h = localae;
      localae.l();
    }
    
    private ae()
    {
      this.i = d.b;
    }
    
    /* Error */
    private ae(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 56	b/i/b/a/c/g/i$c:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 58	b/i/b/a/c/e/a$ae:k	I
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 60	b/i/b/a/c/e/a$ae:l	B
      //   14: aload_0
      //   15: iconst_m1
      //   16: putfield 62	b/i/b/a/c/e/a$ae:m	I
      //   19: aload_0
      //   20: invokespecial 54	b/i/b/a/c/e/a$ae:l	()V
      //   23: invokestatic 76	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   26: astore 12
      //   28: aload 12
      //   30: iconst_1
      //   31: invokestatic 81	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   34: astore 13
      //   36: iconst_0
      //   37: istore 8
      //   39: iconst_0
      //   40: istore_3
      //   41: iload 8
      //   43: ifne +798 -> 841
      //   46: iload_3
      //   47: istore 4
      //   49: iload_3
      //   50: istore 5
      //   52: iload_3
      //   53: istore 6
      //   55: aload_1
      //   56: invokevirtual 86	b/i/b/a/c/g/e:a	()I
      //   59: istore 7
      //   61: iload 7
      //   63: ifeq +640 -> 703
      //   66: iload 7
      //   68: bipush 8
      //   70: if_icmpeq +594 -> 664
      //   73: iload 7
      //   75: bipush 16
      //   77: if_icmpeq +548 -> 625
      //   80: iload 7
      //   82: bipush 24
      //   84: if_icmpeq +502 -> 586
      //   87: iload 7
      //   89: bipush 32
      //   91: if_icmpeq +386 -> 477
      //   94: iload 7
      //   96: bipush 42
      //   98: if_icmpeq +295 -> 393
      //   101: iload 7
      //   103: bipush 48
      //   105: if_icmpeq +186 -> 291
      //   108: iload 7
      //   110: bipush 50
      //   112: if_icmpeq +28 -> 140
      //   115: iload_3
      //   116: istore 4
      //   118: iload_3
      //   119: istore 5
      //   121: iload_3
      //   122: istore 6
      //   124: aload_0
      //   125: aload_1
      //   126: aload 13
      //   128: aload_2
      //   129: iload 7
      //   131: invokevirtual 89	b/i/b/a/c/e/a$ae:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   134: ifne -93 -> 41
      //   137: goto +566 -> 703
      //   140: iload_3
      //   141: istore 4
      //   143: iload_3
      //   144: istore 5
      //   146: iload_3
      //   147: istore 6
      //   149: aload_1
      //   150: aload_1
      //   151: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   154: invokevirtual 94	b/i/b/a/c/g/e:b	(I)I
      //   157: istore 9
      //   159: iload_3
      //   160: istore 7
      //   162: iload_3
      //   163: bipush 32
      //   165: iand
      //   166: bipush 32
      //   168: if_icmpeq +48 -> 216
      //   171: iload_3
      //   172: istore 7
      //   174: iload_3
      //   175: istore 4
      //   177: iload_3
      //   178: istore 5
      //   180: iload_3
      //   181: istore 6
      //   183: aload_1
      //   184: invokevirtual 96	b/i/b/a/c/g/e:h	()I
      //   187: ifle +29 -> 216
      //   190: iload_3
      //   191: istore 4
      //   193: iload_3
      //   194: istore 5
      //   196: iload_3
      //   197: istore 6
      //   199: aload_0
      //   200: new 98	java/util/ArrayList
      //   203: dup
      //   204: invokespecial 99	java/util/ArrayList:<init>	()V
      //   207: putfield 101	b/i/b/a/c/e/a$ae:g	Ljava/util/List;
      //   210: iload_3
      //   211: bipush 32
      //   213: ior
      //   214: istore 7
      //   216: iload 7
      //   218: istore 4
      //   220: iload 7
      //   222: istore 5
      //   224: iload 7
      //   226: istore 6
      //   228: aload_1
      //   229: invokevirtual 96	b/i/b/a/c/g/e:h	()I
      //   232: ifle +35 -> 267
      //   235: iload 7
      //   237: istore 4
      //   239: iload 7
      //   241: istore 5
      //   243: iload 7
      //   245: istore 6
      //   247: aload_0
      //   248: getfield 101	b/i/b/a/c/e/a$ae:g	Ljava/util/List;
      //   251: aload_1
      //   252: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   255: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   258: invokeinterface 113 2 0
      //   263: pop
      //   264: goto -48 -> 216
      //   267: iload 7
      //   269: istore 4
      //   271: iload 7
      //   273: istore 5
      //   275: iload 7
      //   277: istore 6
      //   279: aload_1
      //   280: iload 9
      //   282: invokevirtual 116	b/i/b/a/c/g/e:c	(I)V
      //   285: iload 7
      //   287: istore_3
      //   288: goto -247 -> 41
      //   291: iload_3
      //   292: istore 7
      //   294: iload_3
      //   295: bipush 32
      //   297: iand
      //   298: bipush 32
      //   300: if_icmpeq +29 -> 329
      //   303: iload_3
      //   304: istore 4
      //   306: iload_3
      //   307: istore 5
      //   309: iload_3
      //   310: istore 6
      //   312: aload_0
      //   313: new 98	java/util/ArrayList
      //   316: dup
      //   317: invokespecial 99	java/util/ArrayList:<init>	()V
      //   320: putfield 101	b/i/b/a/c/e/a$ae:g	Ljava/util/List;
      //   323: iload_3
      //   324: bipush 32
      //   326: ior
      //   327: istore 7
      //   329: iload 7
      //   331: istore 4
      //   333: iload 7
      //   335: istore 5
      //   337: iload 7
      //   339: istore 6
      //   341: aload_0
      //   342: getfield 101	b/i/b/a/c/e/a$ae:g	Ljava/util/List;
      //   345: astore 10
      //   347: iload 7
      //   349: istore 4
      //   351: iload 7
      //   353: istore 5
      //   355: iload 7
      //   357: istore 6
      //   359: aload_1
      //   360: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   363: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   366: astore 11
      //   368: iload 7
      //   370: istore_3
      //   371: iload_3
      //   372: istore 4
      //   374: iload_3
      //   375: istore 5
      //   377: iload_3
      //   378: istore 6
      //   380: aload 10
      //   382: aload 11
      //   384: invokeinterface 113 2 0
      //   389: pop
      //   390: goto -349 -> 41
      //   393: iload_3
      //   394: istore 7
      //   396: iload_3
      //   397: bipush 16
      //   399: iand
      //   400: bipush 16
      //   402: if_icmpeq +29 -> 431
      //   405: iload_3
      //   406: istore 4
      //   408: iload_3
      //   409: istore 5
      //   411: iload_3
      //   412: istore 6
      //   414: aload_0
      //   415: new 98	java/util/ArrayList
      //   418: dup
      //   419: invokespecial 99	java/util/ArrayList:<init>	()V
      //   422: putfield 118	b/i/b/a/c/e/a$ae:f	Ljava/util/List;
      //   425: iload_3
      //   426: bipush 16
      //   428: ior
      //   429: istore 7
      //   431: iload 7
      //   433: istore 4
      //   435: iload 7
      //   437: istore 5
      //   439: iload 7
      //   441: istore 6
      //   443: aload_0
      //   444: getfield 118	b/i/b/a/c/e/a$ae:f	Ljava/util/List;
      //   447: astore 10
      //   449: iload 7
      //   451: istore 4
      //   453: iload 7
      //   455: istore 5
      //   457: iload 7
      //   459: istore 6
      //   461: aload_1
      //   462: getstatic 121	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   465: aload_2
      //   466: invokevirtual 124	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   469: astore 11
      //   471: iload 7
      //   473: istore_3
      //   474: goto -103 -> 371
      //   477: iload_3
      //   478: istore 4
      //   480: iload_3
      //   481: istore 5
      //   483: iload_3
      //   484: istore 6
      //   486: aload_1
      //   487: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   490: istore 9
      //   492: iload_3
      //   493: istore 4
      //   495: iload_3
      //   496: istore 5
      //   498: iload_3
      //   499: istore 6
      //   501: iload 9
      //   503: invokestatic 127	b/i/b/a/c/e/a$ae$b:a	(I)Lb/i/b/a/c/e/a$ae$b;
      //   506: astore 10
      //   508: aload 10
      //   510: ifnonnull +38 -> 548
      //   513: iload_3
      //   514: istore 4
      //   516: iload_3
      //   517: istore 5
      //   519: iload_3
      //   520: istore 6
      //   522: aload 13
      //   524: iload 7
      //   526: invokevirtual 129	b/i/b/a/c/g/f:e	(I)V
      //   529: iload_3
      //   530: istore 4
      //   532: iload_3
      //   533: istore 5
      //   535: iload_3
      //   536: istore 6
      //   538: aload 13
      //   540: iload 9
      //   542: invokevirtual 129	b/i/b/a/c/g/f:e	(I)V
      //   545: goto -504 -> 41
      //   548: iload_3
      //   549: istore 4
      //   551: iload_3
      //   552: istore 5
      //   554: iload_3
      //   555: istore 6
      //   557: aload_0
      //   558: aload_0
      //   559: getfield 131	b/i/b/a/c/e/a$ae:j	I
      //   562: bipush 8
      //   564: ior
      //   565: putfield 131	b/i/b/a/c/e/a$ae:j	I
      //   568: iload_3
      //   569: istore 4
      //   571: iload_3
      //   572: istore 5
      //   574: iload_3
      //   575: istore 6
      //   577: aload_0
      //   578: aload 10
      //   580: putfield 133	b/i/b/a/c/e/a$ae:e	Lb/i/b/a/c/e/a$ae$b;
      //   583: goto -542 -> 41
      //   586: iload_3
      //   587: istore 4
      //   589: iload_3
      //   590: istore 5
      //   592: iload_3
      //   593: istore 6
      //   595: aload_0
      //   596: aload_0
      //   597: getfield 131	b/i/b/a/c/e/a$ae:j	I
      //   600: iconst_4
      //   601: ior
      //   602: putfield 131	b/i/b/a/c/e/a$ae:j	I
      //   605: iload_3
      //   606: istore 4
      //   608: iload_3
      //   609: istore 5
      //   611: iload_3
      //   612: istore 6
      //   614: aload_0
      //   615: aload_1
      //   616: invokevirtual 136	b/i/b/a/c/g/e:b	()Z
      //   619: putfield 138	b/i/b/a/c/e/a$ae:d	Z
      //   622: goto -581 -> 41
      //   625: iload_3
      //   626: istore 4
      //   628: iload_3
      //   629: istore 5
      //   631: iload_3
      //   632: istore 6
      //   634: aload_0
      //   635: aload_0
      //   636: getfield 131	b/i/b/a/c/e/a$ae:j	I
      //   639: iconst_2
      //   640: ior
      //   641: putfield 131	b/i/b/a/c/e/a$ae:j	I
      //   644: iload_3
      //   645: istore 4
      //   647: iload_3
      //   648: istore 5
      //   650: iload_3
      //   651: istore 6
      //   653: aload_0
      //   654: aload_1
      //   655: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   658: putfield 140	b/i/b/a/c/e/a$ae:c	I
      //   661: goto -620 -> 41
      //   664: iload_3
      //   665: istore 4
      //   667: iload_3
      //   668: istore 5
      //   670: iload_3
      //   671: istore 6
      //   673: aload_0
      //   674: aload_0
      //   675: getfield 131	b/i/b/a/c/e/a$ae:j	I
      //   678: iconst_1
      //   679: ior
      //   680: putfield 131	b/i/b/a/c/e/a$ae:j	I
      //   683: iload_3
      //   684: istore 4
      //   686: iload_3
      //   687: istore 5
      //   689: iload_3
      //   690: istore 6
      //   692: aload_0
      //   693: aload_1
      //   694: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   697: putfield 142	b/i/b/a/c/e/a$ae:b	I
      //   700: goto -659 -> 41
      //   703: iconst_1
      //   704: istore 8
      //   706: goto -665 -> 41
      //   709: astore_1
      //   710: goto +51 -> 761
      //   713: astore_1
      //   714: iload 5
      //   716: istore 4
      //   718: new 71	b/i/b/a/c/g/k
      //   721: dup
      //   722: aload_1
      //   723: invokevirtual 146	java/io/IOException:getMessage	()Ljava/lang/String;
      //   726: invokespecial 149	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   729: astore_1
      //   730: iload 5
      //   732: istore 4
      //   734: aload_1
      //   735: aload_0
      //   736: putfield 152	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   739: iload 5
      //   741: istore 4
      //   743: aload_1
      //   744: athrow
      //   745: astore_1
      //   746: iload 6
      //   748: istore 4
      //   750: aload_1
      //   751: aload_0
      //   752: putfield 152	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   755: iload 6
      //   757: istore 4
      //   759: aload_1
      //   760: athrow
      //   761: iload 4
      //   763: bipush 16
      //   765: iand
      //   766: bipush 16
      //   768: if_icmpne +14 -> 782
      //   771: aload_0
      //   772: aload_0
      //   773: getfield 118	b/i/b/a/c/e/a$ae:f	Ljava/util/List;
      //   776: invokestatic 158	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   779: putfield 118	b/i/b/a/c/e/a$ae:f	Ljava/util/List;
      //   782: iload 4
      //   784: bipush 32
      //   786: iand
      //   787: bipush 32
      //   789: if_icmpne +14 -> 803
      //   792: aload_0
      //   793: aload_0
      //   794: getfield 101	b/i/b/a/c/e/a$ae:g	Ljava/util/List;
      //   797: invokestatic 158	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   800: putfield 101	b/i/b/a/c/e/a$ae:g	Ljava/util/List;
      //   803: aload 13
      //   805: invokevirtual 160	b/i/b/a/c/g/f:a	()V
      //   808: aload_0
      //   809: aload 12
      //   811: invokevirtual 165	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   814: putfield 68	b/i/b/a/c/e/a$ae:i	Lb/i/b/a/c/g/d;
      //   817: goto +15 -> 832
      //   820: astore_1
      //   821: aload_0
      //   822: aload 12
      //   824: invokevirtual 165	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   827: putfield 68	b/i/b/a/c/e/a$ae:i	Lb/i/b/a/c/g/d;
      //   830: aload_1
      //   831: athrow
      //   832: aload_0
      //   833: getfield 169	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   836: invokevirtual 173	b/i/b/a/c/g/h:c	()V
      //   839: aload_1
      //   840: athrow
      //   841: iload_3
      //   842: bipush 16
      //   844: iand
      //   845: bipush 16
      //   847: if_icmpne +14 -> 861
      //   850: aload_0
      //   851: aload_0
      //   852: getfield 118	b/i/b/a/c/e/a$ae:f	Ljava/util/List;
      //   855: invokestatic 158	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   858: putfield 118	b/i/b/a/c/e/a$ae:f	Ljava/util/List;
      //   861: iload_3
      //   862: bipush 32
      //   864: iand
      //   865: bipush 32
      //   867: if_icmpne +14 -> 881
      //   870: aload_0
      //   871: aload_0
      //   872: getfield 101	b/i/b/a/c/e/a$ae:g	Ljava/util/List;
      //   875: invokestatic 158	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   878: putfield 101	b/i/b/a/c/e/a$ae:g	Ljava/util/List;
      //   881: aload 13
      //   883: invokevirtual 160	b/i/b/a/c/g/f:a	()V
      //   886: aload_0
      //   887: aload 12
      //   889: invokevirtual 165	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   892: putfield 68	b/i/b/a/c/e/a$ae:i	Lb/i/b/a/c/g/d;
      //   895: goto +15 -> 910
      //   898: astore_1
      //   899: aload_0
      //   900: aload 12
      //   902: invokevirtual 165	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   905: putfield 68	b/i/b/a/c/e/a$ae:i	Lb/i/b/a/c/g/d;
      //   908: aload_1
      //   909: athrow
      //   910: aload_0
      //   911: getfield 169	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   914: invokevirtual 173	b/i/b/a/c/g/h:c	()V
      //   917: return
      //   918: astore_2
      //   919: goto -111 -> 808
      //   922: astore_1
      //   923: goto -37 -> 886
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	926	0	this	ae
      //   0	926	1	parame	b.i.b.a.c.g.e
      //   0	926	2	paramg	g
      //   40	825	3	n	int
      //   47	740	4	i1	int
      //   50	690	5	i2	int
      //   53	703	6	i3	int
      //   59	466	7	i4	int
      //   37	668	8	i5	int
      //   157	384	9	i6	int
      //   345	234	10	localObject1	Object
      //   366	104	11	localObject2	Object
      //   26	875	12	localb	b.i.b.a.c.g.d.b
      //   34	848	13	localf	f
      // Exception table:
      //   from	to	target	type
      //   55	61	709	finally
      //   124	137	709	finally
      //   149	159	709	finally
      //   183	190	709	finally
      //   199	210	709	finally
      //   228	235	709	finally
      //   247	264	709	finally
      //   279	285	709	finally
      //   312	323	709	finally
      //   341	347	709	finally
      //   359	368	709	finally
      //   380	390	709	finally
      //   414	425	709	finally
      //   443	449	709	finally
      //   461	471	709	finally
      //   486	492	709	finally
      //   501	508	709	finally
      //   522	529	709	finally
      //   538	545	709	finally
      //   557	568	709	finally
      //   577	583	709	finally
      //   595	605	709	finally
      //   614	622	709	finally
      //   634	644	709	finally
      //   653	661	709	finally
      //   673	683	709	finally
      //   692	700	709	finally
      //   718	730	709	finally
      //   734	739	709	finally
      //   743	745	709	finally
      //   750	755	709	finally
      //   759	761	709	finally
      //   55	61	713	java/io/IOException
      //   124	137	713	java/io/IOException
      //   149	159	713	java/io/IOException
      //   183	190	713	java/io/IOException
      //   199	210	713	java/io/IOException
      //   228	235	713	java/io/IOException
      //   247	264	713	java/io/IOException
      //   279	285	713	java/io/IOException
      //   312	323	713	java/io/IOException
      //   341	347	713	java/io/IOException
      //   359	368	713	java/io/IOException
      //   380	390	713	java/io/IOException
      //   414	425	713	java/io/IOException
      //   443	449	713	java/io/IOException
      //   461	471	713	java/io/IOException
      //   486	492	713	java/io/IOException
      //   501	508	713	java/io/IOException
      //   522	529	713	java/io/IOException
      //   538	545	713	java/io/IOException
      //   557	568	713	java/io/IOException
      //   577	583	713	java/io/IOException
      //   595	605	713	java/io/IOException
      //   614	622	713	java/io/IOException
      //   634	644	713	java/io/IOException
      //   653	661	713	java/io/IOException
      //   673	683	713	java/io/IOException
      //   692	700	713	java/io/IOException
      //   55	61	745	b/i/b/a/c/g/k
      //   124	137	745	b/i/b/a/c/g/k
      //   149	159	745	b/i/b/a/c/g/k
      //   183	190	745	b/i/b/a/c/g/k
      //   199	210	745	b/i/b/a/c/g/k
      //   228	235	745	b/i/b/a/c/g/k
      //   247	264	745	b/i/b/a/c/g/k
      //   279	285	745	b/i/b/a/c/g/k
      //   312	323	745	b/i/b/a/c/g/k
      //   341	347	745	b/i/b/a/c/g/k
      //   359	368	745	b/i/b/a/c/g/k
      //   380	390	745	b/i/b/a/c/g/k
      //   414	425	745	b/i/b/a/c/g/k
      //   443	449	745	b/i/b/a/c/g/k
      //   461	471	745	b/i/b/a/c/g/k
      //   486	492	745	b/i/b/a/c/g/k
      //   501	508	745	b/i/b/a/c/g/k
      //   522	529	745	b/i/b/a/c/g/k
      //   538	545	745	b/i/b/a/c/g/k
      //   557	568	745	b/i/b/a/c/g/k
      //   577	583	745	b/i/b/a/c/g/k
      //   595	605	745	b/i/b/a/c/g/k
      //   614	622	745	b/i/b/a/c/g/k
      //   634	644	745	b/i/b/a/c/g/k
      //   653	661	745	b/i/b/a/c/g/k
      //   673	683	745	b/i/b/a/c/g/k
      //   692	700	745	b/i/b/a/c/g/k
      //   803	808	820	finally
      //   881	886	898	finally
      //   803	808	918	java/io/IOException
      //   881	886	922	java/io/IOException
    }
    
    private ae(i.b<ae, ?> paramb)
    {
      super();
      this.i = paramb.a;
    }
    
    public static ae a()
    {
      return h;
    }
    
    private void l()
    {
      this.b = 0;
      this.c = 0;
      this.d = false;
      this.e = b.c;
      this.f = Collections.emptyList();
      this.g = Collections.emptyList();
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      i.c.a locala = x();
      if ((this.j & 0x1) == 1) {
        paramf.a(1, this.b);
      }
      if ((this.j & 0x2) == 2) {
        paramf.a(2, this.c);
      }
      if ((this.j & 0x4) == 4) {
        paramf.a(this.d);
      }
      if ((this.j & 0x8) == 8) {
        paramf.b(4, this.e.d);
      }
      int i1 = 0;
      int n = 0;
      while (n < this.f.size())
      {
        paramf.a(5, (q)this.f.get(n));
        n += 1;
      }
      n = i1;
      if (this.g.size() > 0)
      {
        paramf.e(50);
        paramf.e(this.k);
        n = i1;
      }
      while (n < this.g.size())
      {
        paramf.a(((Integer)this.g.get(n)).intValue());
        n += 1;
      }
      locala.a(1000, paramf);
      paramf.c(this.i);
    }
    
    public final s<ae> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.j & 0x1) == 1;
    }
    
    public final boolean d()
    {
      return (this.j & 0x2) == 2;
    }
    
    public final boolean e()
    {
      int n = this.l;
      if (n == 1) {
        return true;
      }
      if (n == 0) {
        return false;
      }
      if (!c())
      {
        this.l = 0;
        return false;
      }
      if (!d())
      {
        this.l = 0;
        return false;
      }
      n = 0;
      while (n < this.f.size())
      {
        if (!((a.aa)this.f.get(n)).e())
        {
          this.l = 0;
          return false;
        }
        n += 1;
      }
      if (!this.s.e())
      {
        this.l = 0;
        return false;
      }
      this.l = 1;
      return true;
    }
    
    public final int f()
    {
      int n = this.m;
      if (n != -1) {
        return n;
      }
      n = this.j;
      int i2 = 0;
      if ((n & 0x1) == 1) {
        i1 = f.c(1, this.b) + 0;
      } else {
        i1 = 0;
      }
      n = i1;
      if ((this.j & 0x2) == 2) {
        n = i1 + f.c(2, this.c);
      }
      int i1 = n;
      if ((this.j & 0x4) == 4) {
        i1 = n + (f.d(3) + 1);
      }
      n = i1;
      if ((this.j & 0x8) == 8) {
        n = i1 + f.d(4, this.e.d);
      }
      i1 = 0;
      while (i1 < this.f.size())
      {
        n += f.c(5, (q)this.f.get(i1));
        i1 += 1;
      }
      i1 = 0;
      while (i2 < this.g.size())
      {
        i1 += f.c(((Integer)this.g.get(i2)).intValue());
        i2 += 1;
      }
      i2 = n + i1;
      n = i2;
      if (!this.g.isEmpty()) {
        n = i2 + 1 + f.c(i1);
      }
      this.k = i1;
      n = n + this.s.f() + this.i.a();
      this.m = n;
      return n;
    }
    
    public final boolean g()
    {
      return (this.j & 0x4) == 4;
    }
    
    public final boolean k()
    {
      return (this.j & 0x8) == 8;
    }
    
    public static final class a
      extends i.b<a.ae, a>
      implements a.af
    {
      private int c;
      private int d;
      private int e;
      private boolean f;
      private a.ae.b g = a.ae.b.c;
      private List<a.aa> h = Collections.emptyList();
      private List<Integer> i = Collections.emptyList();
      
      private a a(int paramInt)
      {
        this.c |= 0x1;
        this.d = paramInt;
        return this;
      }
      
      private a a(a.ae.b paramb)
      {
        if (paramb != null)
        {
          this.c |= 0x8;
          this.g = paramb;
          return this;
        }
        throw new NullPointerException();
      }
      
      private a a(boolean paramBoolean)
      {
        this.c |= 0x4;
        this.f = paramBoolean;
        return this;
      }
      
      private a b(int paramInt)
      {
        this.c |= 0x2;
        this.e = paramInt;
        return this;
      }
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 70	b/i/b/a/c/e/a$ae:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 75 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$ae
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 78	b/i/b/a/c/e/a$ae$a:a	(Lb/i/b/a/c/e/a$ae;)Lb/i/b/a/c/e/a$ae$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 81	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$ae
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 78	b/i/b/a/c/e/a$ae$a:a	(Lb/i/b/a/c/e/a$ae;)Lb/i/b/a/c/e/a$ae$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a h()
      {
        return new a().a(i());
      }
      
      private a.ae i()
      {
        int k = 0;
        a.ae localae = new a.ae(this, (byte)0);
        int m = this.c;
        if ((m & 0x1) == 1) {
          k = 1;
        }
        a.ae.a(localae, this.d);
        int j = k;
        if ((m & 0x2) == 2) {
          j = k | 0x2;
        }
        a.ae.b(localae, this.e);
        k = j;
        if ((m & 0x4) == 4) {
          k = j | 0x4;
        }
        a.ae.a(localae, this.f);
        j = k;
        if ((m & 0x8) == 8) {
          j = k | 0x8;
        }
        a.ae.a(localae, this.g);
        if ((this.c & 0x10) == 16)
        {
          this.h = Collections.unmodifiableList(this.h);
          this.c &= 0xFFFFFFEF;
        }
        a.ae.a(localae, this.h);
        if ((this.c & 0x20) == 32)
        {
          this.i = Collections.unmodifiableList(this.i);
          this.c &= 0xFFFFFFDF;
        }
        a.ae.b(localae, this.i);
        a.ae.c(localae, j);
        return localae;
      }
      
      private void k()
      {
        if ((this.c & 0x10) != 16)
        {
          this.h = new ArrayList(this.h);
          this.c |= 0x10;
        }
      }
      
      private void l()
      {
        if ((this.c & 0x20) != 32)
        {
          this.i = new ArrayList(this.i);
          this.c |= 0x20;
        }
      }
      
      public final a a(a.ae paramae)
      {
        if (paramae == a.ae.a()) {
          return this;
        }
        if (paramae.c()) {
          a(paramae.b);
        }
        if (paramae.d()) {
          b(paramae.c);
        }
        if (paramae.g()) {
          a(paramae.d);
        }
        if (paramae.k()) {
          a(paramae.e);
        }
        if (!a.ae.a(paramae).isEmpty()) {
          if (this.h.isEmpty())
          {
            this.h = a.ae.a(paramae);
            this.c &= 0xFFFFFFEF;
          }
          else
          {
            k();
            this.h.addAll(a.ae.a(paramae));
          }
        }
        if (!a.ae.b(paramae).isEmpty()) {
          if (this.i.isEmpty())
          {
            this.i = a.ae.b(paramae);
            this.c &= 0xFFFFFFDF;
          }
          else
          {
            l();
            this.i.addAll(a.ae.b(paramae));
          }
        }
        a(paramae);
        this.a = this.a.a(a.ae.c(paramae));
        return this;
      }
      
      public final boolean e()
      {
        if ((this.c & 0x1) == 1) {
          j = 1;
        } else {
          j = 0;
        }
        if (j == 0) {
          return false;
        }
        if ((this.c & 0x2) == 2) {
          j = 1;
        } else {
          j = 0;
        }
        if (j == 0) {
          return false;
        }
        int j = 0;
        while (j < this.h.size())
        {
          if (!((a.aa)this.h.get(j)).e()) {
            return false;
          }
          j += 1;
        }
        return this.b.e();
      }
    }
    
    public static enum b
      implements j.a
    {
      private static j.b<b> e = new j.b() {};
      final int d;
      
      private b(int paramInt1, int paramInt2)
      {
        this.d = paramInt1;
      }
      
      public static b a(int paramInt)
      {
        switch (paramInt)
        {
        default: 
          return null;
        case 2: 
          return c;
        case 1: 
          return b;
        }
        return a;
      }
      
      public final int a()
      {
        return this.d;
      }
    }
  }
  
  public static abstract interface af
    extends i.d
  {}
  
  public static final class ag
    extends i
    implements a.ah
  {
    public static s<ag> a = new b() {};
    private static final ag d;
    public List<a.aa> b;
    public int c;
    private final d e;
    private int f;
    private byte g = -1;
    private int h = -1;
    
    static
    {
      ag localag = new ag();
      d = localag;
      localag.d();
    }
    
    private ag()
    {
      this.e = d.b;
    }
    
    /* Error */
    private ag(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 43	b/i/b/a/c/g/i:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 45	b/i/b/a/c/e/a$ag:g	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 47	b/i/b/a/c/e/a$ag:h	I
      //   14: aload_0
      //   15: invokespecial 41	b/i/b/a/c/e/a$ag:d	()V
      //   18: invokestatic 61	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   21: astore 9
      //   23: aload 9
      //   25: iconst_1
      //   26: invokestatic 66	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   29: astore 10
      //   31: iconst_0
      //   32: istore 8
      //   34: iconst_0
      //   35: istore_3
      //   36: iload 8
      //   38: ifne +284 -> 322
      //   41: iload_3
      //   42: istore 5
      //   44: iload_3
      //   45: istore 6
      //   47: iload_3
      //   48: istore 7
      //   50: aload_1
      //   51: invokevirtual 71	b/i/b/a/c/g/e:a	()I
      //   54: istore 4
      //   56: iload 4
      //   58: ifeq +152 -> 210
      //   61: iload 4
      //   63: bipush 10
      //   65: if_icmpeq +74 -> 139
      //   68: iload 4
      //   70: bipush 16
      //   72: if_icmpeq +28 -> 100
      //   75: iload_3
      //   76: istore 5
      //   78: iload_3
      //   79: istore 6
      //   81: iload_3
      //   82: istore 7
      //   84: aload_0
      //   85: aload_1
      //   86: aload 10
      //   88: aload_2
      //   89: iload 4
      //   91: invokevirtual 74	b/i/b/a/c/e/a$ag:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   94: ifne -58 -> 36
      //   97: goto +113 -> 210
      //   100: iload_3
      //   101: istore 5
      //   103: iload_3
      //   104: istore 6
      //   106: iload_3
      //   107: istore 7
      //   109: aload_0
      //   110: aload_0
      //   111: getfield 76	b/i/b/a/c/e/a$ag:f	I
      //   114: iconst_1
      //   115: ior
      //   116: putfield 76	b/i/b/a/c/e/a$ag:f	I
      //   119: iload_3
      //   120: istore 5
      //   122: iload_3
      //   123: istore 6
      //   125: iload_3
      //   126: istore 7
      //   128: aload_0
      //   129: aload_1
      //   130: invokevirtual 78	b/i/b/a/c/g/e:d	()I
      //   133: putfield 80	b/i/b/a/c/e/a$ag:c	I
      //   136: goto -100 -> 36
      //   139: iload_3
      //   140: istore 4
      //   142: iload_3
      //   143: iconst_1
      //   144: iand
      //   145: iconst_1
      //   146: if_icmpeq +28 -> 174
      //   149: iload_3
      //   150: istore 5
      //   152: iload_3
      //   153: istore 6
      //   155: iload_3
      //   156: istore 7
      //   158: aload_0
      //   159: new 82	java/util/ArrayList
      //   162: dup
      //   163: invokespecial 83	java/util/ArrayList:<init>	()V
      //   166: putfield 85	b/i/b/a/c/e/a$ag:b	Ljava/util/List;
      //   169: iload_3
      //   170: iconst_1
      //   171: ior
      //   172: istore 4
      //   174: iload 4
      //   176: istore 5
      //   178: iload 4
      //   180: istore 6
      //   182: iload 4
      //   184: istore 7
      //   186: aload_0
      //   187: getfield 85	b/i/b/a/c/e/a$ag:b	Ljava/util/List;
      //   190: aload_1
      //   191: getstatic 88	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   194: aload_2
      //   195: invokevirtual 91	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   198: invokeinterface 97 2 0
      //   203: pop
      //   204: iload 4
      //   206: istore_3
      //   207: goto -171 -> 36
      //   210: iconst_1
      //   211: istore 8
      //   213: goto -177 -> 36
      //   216: astore_1
      //   217: goto +51 -> 268
      //   220: astore_1
      //   221: iload 6
      //   223: istore 5
      //   225: new 56	b/i/b/a/c/g/k
      //   228: dup
      //   229: aload_1
      //   230: invokevirtual 101	java/io/IOException:getMessage	()Ljava/lang/String;
      //   233: invokespecial 104	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   236: astore_1
      //   237: iload 6
      //   239: istore 5
      //   241: aload_1
      //   242: aload_0
      //   243: putfield 107	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   246: iload 6
      //   248: istore 5
      //   250: aload_1
      //   251: athrow
      //   252: astore_1
      //   253: iload 7
      //   255: istore 5
      //   257: aload_1
      //   258: aload_0
      //   259: putfield 107	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   262: iload 7
      //   264: istore 5
      //   266: aload_1
      //   267: athrow
      //   268: iload 5
      //   270: iconst_1
      //   271: iand
      //   272: iconst_1
      //   273: if_icmpne +14 -> 287
      //   276: aload_0
      //   277: aload_0
      //   278: getfield 85	b/i/b/a/c/e/a$ag:b	Ljava/util/List;
      //   281: invokestatic 113	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   284: putfield 85	b/i/b/a/c/e/a$ag:b	Ljava/util/List;
      //   287: aload 10
      //   289: invokevirtual 115	b/i/b/a/c/g/f:a	()V
      //   292: aload_0
      //   293: aload 9
      //   295: invokevirtual 120	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   298: putfield 53	b/i/b/a/c/e/a$ag:e	Lb/i/b/a/c/g/d;
      //   301: goto +15 -> 316
      //   304: astore_1
      //   305: aload_0
      //   306: aload 9
      //   308: invokevirtual 120	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   311: putfield 53	b/i/b/a/c/e/a$ag:e	Lb/i/b/a/c/g/d;
      //   314: aload_1
      //   315: athrow
      //   316: aload_0
      //   317: invokevirtual 123	b/i/b/a/c/e/a$ag:w	()V
      //   320: aload_1
      //   321: athrow
      //   322: iload_3
      //   323: iconst_1
      //   324: iand
      //   325: iconst_1
      //   326: if_icmpne +14 -> 340
      //   329: aload_0
      //   330: aload_0
      //   331: getfield 85	b/i/b/a/c/e/a$ag:b	Ljava/util/List;
      //   334: invokestatic 113	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   337: putfield 85	b/i/b/a/c/e/a$ag:b	Ljava/util/List;
      //   340: aload 10
      //   342: invokevirtual 115	b/i/b/a/c/g/f:a	()V
      //   345: aload_0
      //   346: aload 9
      //   348: invokevirtual 120	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   351: putfield 53	b/i/b/a/c/e/a$ag:e	Lb/i/b/a/c/g/d;
      //   354: goto +15 -> 369
      //   357: astore_1
      //   358: aload_0
      //   359: aload 9
      //   361: invokevirtual 120	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   364: putfield 53	b/i/b/a/c/e/a$ag:e	Lb/i/b/a/c/g/d;
      //   367: aload_1
      //   368: athrow
      //   369: aload_0
      //   370: invokevirtual 123	b/i/b/a/c/e/a$ag:w	()V
      //   373: return
      //   374: astore_2
      //   375: goto -83 -> 292
      //   378: astore_1
      //   379: goto -34 -> 345
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	382	0	this	ag
      //   0	382	1	parame	b.i.b.a.c.g.e
      //   0	382	2	paramg	g
      //   35	290	3	i	int
      //   54	151	4	j	int
      //   42	230	5	k	int
      //   45	202	6	m	int
      //   48	215	7	n	int
      //   32	180	8	i1	int
      //   21	339	9	localb	b.i.b.a.c.g.d.b
      //   29	312	10	localf	f
      // Exception table:
      //   from	to	target	type
      //   50	56	216	finally
      //   84	97	216	finally
      //   109	119	216	finally
      //   128	136	216	finally
      //   158	169	216	finally
      //   186	204	216	finally
      //   225	237	216	finally
      //   241	246	216	finally
      //   250	252	216	finally
      //   257	262	216	finally
      //   266	268	216	finally
      //   50	56	220	java/io/IOException
      //   84	97	220	java/io/IOException
      //   109	119	220	java/io/IOException
      //   128	136	220	java/io/IOException
      //   158	169	220	java/io/IOException
      //   186	204	220	java/io/IOException
      //   50	56	252	b/i/b/a/c/g/k
      //   84	97	252	b/i/b/a/c/g/k
      //   109	119	252	b/i/b/a/c/g/k
      //   128	136	252	b/i/b/a/c/g/k
      //   158	169	252	b/i/b/a/c/g/k
      //   186	204	252	b/i/b/a/c/g/k
      //   287	292	304	finally
      //   340	345	357	finally
      //   287	292	374	java/io/IOException
      //   340	345	378	java/io/IOException
    }
    
    private ag(i.a parama)
    {
      super();
      this.e = parama.a;
    }
    
    public static a a(ag paramag)
    {
      return a.g().a(paramag);
    }
    
    public static ag a()
    {
      return d;
    }
    
    private void d()
    {
      this.b = Collections.emptyList();
      this.c = -1;
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      int i = 0;
      while (i < this.b.size())
      {
        paramf.a(1, (q)this.b.get(i));
        i += 1;
      }
      if ((this.f & 0x1) == 1) {
        paramf.a(2, this.c);
      }
      paramf.c(this.e);
    }
    
    public final s<ag> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.f & 0x1) == 1;
    }
    
    public final boolean e()
    {
      int i = this.g;
      if (i == 1) {
        return true;
      }
      if (i == 0) {
        return false;
      }
      i = 0;
      while (i < this.b.size())
      {
        if (!((a.aa)this.b.get(i)).e())
        {
          this.g = 0;
          return false;
        }
        i += 1;
      }
      this.g = 1;
      return true;
    }
    
    public final int f()
    {
      int i = this.h;
      if (i != -1) {
        return i;
      }
      int j = 0;
      i = 0;
      while (j < this.b.size())
      {
        i += f.c(1, (q)this.b.get(j));
        j += 1;
      }
      j = i;
      if ((this.f & 0x1) == 1) {
        j = i + f.c(2, this.c);
      }
      i = j + this.e.a();
      this.h = i;
      return i;
    }
    
    public static final class a
      extends i.a<a.ag, a>
      implements a.ah
    {
      private int b;
      private List<a.aa> c = Collections.emptyList();
      private int d = -1;
      
      private a a(int paramInt)
      {
        this.b |= 0x2;
        this.d = paramInt;
        return this;
      }
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 45	b/i/b/a/c/e/a$ag:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 50 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$ag
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 53	b/i/b/a/c/e/a$ag$a:a	(Lb/i/b/a/c/e/a$ag;)Lb/i/b/a/c/e/a$ag$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 56	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$ag
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 53	b/i/b/a/c/e/a$ag$a:a	(Lb/i/b/a/c/e/a$ag;)Lb/i/b/a/c/e/a$ag$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a h()
      {
        return new a().a(f());
      }
      
      private void i()
      {
        if ((this.b & 0x1) != 1)
        {
          this.c = new ArrayList(this.c);
          this.b |= 0x1;
        }
      }
      
      public final a a(a.ag paramag)
      {
        if (paramag == a.ag.a()) {
          return this;
        }
        if (!a.ag.b(paramag).isEmpty()) {
          if (this.c.isEmpty())
          {
            this.c = a.ag.b(paramag);
            this.b &= 0xFFFFFFFE;
          }
          else
          {
            i();
            this.c.addAll(a.ag.b(paramag));
          }
        }
        if (paramag.c()) {
          a(paramag.c);
        }
        this.a = this.a.a(a.ag.c(paramag));
        return this;
      }
      
      public final boolean e()
      {
        int i = 0;
        while (i < this.c.size())
        {
          if (!((a.aa)this.c.get(i)).e()) {
            return false;
          }
          i += 1;
        }
        return true;
      }
      
      public final a.ag f()
      {
        int i = 0;
        a.ag localag = new a.ag(this, (byte)0);
        int j = this.b;
        if ((this.b & 0x1) == 1)
        {
          this.c = Collections.unmodifiableList(this.c);
          this.b &= 0xFFFFFFFE;
        }
        a.ag.a(localag, this.c);
        if ((j & 0x2) == 2) {
          i = 1;
        }
        a.ag.a(localag, this.d);
        a.ag.b(localag, i);
        return localag;
      }
    }
  }
  
  public static abstract interface ah
    extends r
  {}
  
  public static final class ai
    extends i.c<ai>
    implements a.aj
  {
    public static s<ai> a = new b() {};
    private static final ai h;
    public int b;
    public int c;
    public a.aa d;
    public int e;
    public a.aa f;
    public int g;
    private final d i;
    private int j;
    private byte k = -1;
    private int l = -1;
    
    static
    {
      ai localai = new ai();
      h = localai;
      localai.n();
    }
    
    private ai()
    {
      this.i = d.b;
    }
    
    /* Error */
    private ai(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 48	b/i/b/a/c/g/i$c:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 50	b/i/b/a/c/e/a$ai:k	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 52	b/i/b/a/c/e/a$ai:l	I
      //   14: aload_0
      //   15: invokespecial 46	b/i/b/a/c/e/a$ai:n	()V
      //   18: invokestatic 66	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   21: astore 7
      //   23: aload 7
      //   25: iconst_1
      //   26: invokestatic 71	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   29: astore 8
      //   31: iconst_0
      //   32: istore_3
      //   33: iload_3
      //   34: ifne +388 -> 422
      //   37: aload_1
      //   38: invokevirtual 76	b/i/b/a/c/g/e:a	()I
      //   41: istore 4
      //   43: iload 4
      //   45: ifeq +302 -> 347
      //   48: iload 4
      //   50: bipush 8
      //   52: if_icmpeq +274 -> 326
      //   55: iload 4
      //   57: bipush 16
      //   59: if_icmpeq +246 -> 305
      //   62: aconst_null
      //   63: astore 6
      //   65: aconst_null
      //   66: astore 5
      //   68: iload 4
      //   70: bipush 26
      //   72: if_icmpeq +158 -> 230
      //   75: iload 4
      //   77: bipush 34
      //   79: if_icmpeq +77 -> 156
      //   82: iload 4
      //   84: bipush 40
      //   86: if_icmpeq +48 -> 134
      //   89: iload 4
      //   91: bipush 48
      //   93: if_icmpeq +19 -> 112
      //   96: aload_0
      //   97: aload_1
      //   98: aload 8
      //   100: aload_2
      //   101: iload 4
      //   103: invokevirtual 79	b/i/b/a/c/e/a$ai:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   106: ifne -73 -> 33
      //   109: goto +238 -> 347
      //   112: aload_0
      //   113: aload_0
      //   114: getfield 81	b/i/b/a/c/e/a$ai:j	I
      //   117: bipush 32
      //   119: ior
      //   120: putfield 81	b/i/b/a/c/e/a$ai:j	I
      //   123: aload_0
      //   124: aload_1
      //   125: invokevirtual 83	b/i/b/a/c/g/e:d	()I
      //   128: putfield 85	b/i/b/a/c/e/a$ai:g	I
      //   131: goto -98 -> 33
      //   134: aload_0
      //   135: aload_0
      //   136: getfield 81	b/i/b/a/c/e/a$ai:j	I
      //   139: bipush 8
      //   141: ior
      //   142: putfield 81	b/i/b/a/c/e/a$ai:j	I
      //   145: aload_0
      //   146: aload_1
      //   147: invokevirtual 83	b/i/b/a/c/g/e:d	()I
      //   150: putfield 87	b/i/b/a/c/e/a$ai:e	I
      //   153: goto -120 -> 33
      //   156: aload_0
      //   157: getfield 81	b/i/b/a/c/e/a$ai:j	I
      //   160: bipush 16
      //   162: iand
      //   163: bipush 16
      //   165: if_icmpne +12 -> 177
      //   168: aload_0
      //   169: getfield 89	b/i/b/a/c/e/a$ai:f	Lb/i/b/a/c/e/a$aa;
      //   172: invokevirtual 95	b/i/b/a/c/e/a$aa:v	()Lb/i/b/a/c/e/a$aa$c;
      //   175: astore 5
      //   177: aload_0
      //   178: aload_1
      //   179: getstatic 96	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   182: aload_2
      //   183: invokevirtual 99	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   186: checkcast 91	b/i/b/a/c/e/a$aa
      //   189: putfield 89	b/i/b/a/c/e/a$ai:f	Lb/i/b/a/c/e/a$aa;
      //   192: aload 5
      //   194: ifnull +22 -> 216
      //   197: aload 5
      //   199: aload_0
      //   200: getfield 89	b/i/b/a/c/e/a$ai:f	Lb/i/b/a/c/e/a$aa;
      //   203: invokevirtual 104	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   206: pop
      //   207: aload_0
      //   208: aload 5
      //   210: invokevirtual 107	b/i/b/a/c/e/a$aa$c:h	()Lb/i/b/a/c/e/a$aa;
      //   213: putfield 89	b/i/b/a/c/e/a$ai:f	Lb/i/b/a/c/e/a$aa;
      //   216: aload_0
      //   217: aload_0
      //   218: getfield 81	b/i/b/a/c/e/a$ai:j	I
      //   221: bipush 16
      //   223: ior
      //   224: putfield 81	b/i/b/a/c/e/a$ai:j	I
      //   227: goto -194 -> 33
      //   230: aload 6
      //   232: astore 5
      //   234: aload_0
      //   235: getfield 81	b/i/b/a/c/e/a$ai:j	I
      //   238: iconst_4
      //   239: iand
      //   240: iconst_4
      //   241: if_icmpne +12 -> 253
      //   244: aload_0
      //   245: getfield 109	b/i/b/a/c/e/a$ai:d	Lb/i/b/a/c/e/a$aa;
      //   248: invokevirtual 95	b/i/b/a/c/e/a$aa:v	()Lb/i/b/a/c/e/a$aa$c;
      //   251: astore 5
      //   253: aload_0
      //   254: aload_1
      //   255: getstatic 96	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   258: aload_2
      //   259: invokevirtual 99	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   262: checkcast 91	b/i/b/a/c/e/a$aa
      //   265: putfield 109	b/i/b/a/c/e/a$ai:d	Lb/i/b/a/c/e/a$aa;
      //   268: aload 5
      //   270: ifnull +22 -> 292
      //   273: aload 5
      //   275: aload_0
      //   276: getfield 109	b/i/b/a/c/e/a$ai:d	Lb/i/b/a/c/e/a$aa;
      //   279: invokevirtual 104	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   282: pop
      //   283: aload_0
      //   284: aload 5
      //   286: invokevirtual 107	b/i/b/a/c/e/a$aa$c:h	()Lb/i/b/a/c/e/a$aa;
      //   289: putfield 109	b/i/b/a/c/e/a$ai:d	Lb/i/b/a/c/e/a$aa;
      //   292: aload_0
      //   293: aload_0
      //   294: getfield 81	b/i/b/a/c/e/a$ai:j	I
      //   297: iconst_4
      //   298: ior
      //   299: putfield 81	b/i/b/a/c/e/a$ai:j	I
      //   302: goto -269 -> 33
      //   305: aload_0
      //   306: aload_0
      //   307: getfield 81	b/i/b/a/c/e/a$ai:j	I
      //   310: iconst_2
      //   311: ior
      //   312: putfield 81	b/i/b/a/c/e/a$ai:j	I
      //   315: aload_0
      //   316: aload_1
      //   317: invokevirtual 83	b/i/b/a/c/g/e:d	()I
      //   320: putfield 111	b/i/b/a/c/e/a$ai:c	I
      //   323: goto -290 -> 33
      //   326: aload_0
      //   327: aload_0
      //   328: getfield 81	b/i/b/a/c/e/a$ai:j	I
      //   331: iconst_1
      //   332: ior
      //   333: putfield 81	b/i/b/a/c/e/a$ai:j	I
      //   336: aload_0
      //   337: aload_1
      //   338: invokevirtual 83	b/i/b/a/c/g/e:d	()I
      //   341: putfield 113	b/i/b/a/c/e/a$ai:b	I
      //   344: goto -311 -> 33
      //   347: iconst_1
      //   348: istore_3
      //   349: goto -316 -> 33
      //   352: astore_1
      //   353: goto +31 -> 384
      //   356: astore_1
      //   357: new 61	b/i/b/a/c/g/k
      //   360: dup
      //   361: aload_1
      //   362: invokevirtual 117	java/io/IOException:getMessage	()Ljava/lang/String;
      //   365: invokespecial 120	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   368: astore_1
      //   369: aload_1
      //   370: aload_0
      //   371: putfield 123	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   374: aload_1
      //   375: athrow
      //   376: astore_1
      //   377: aload_1
      //   378: aload_0
      //   379: putfield 123	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   382: aload_1
      //   383: athrow
      //   384: aload 8
      //   386: invokevirtual 125	b/i/b/a/c/g/f:a	()V
      //   389: aload_0
      //   390: aload 7
      //   392: invokevirtual 130	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   395: putfield 58	b/i/b/a/c/e/a$ai:i	Lb/i/b/a/c/g/d;
      //   398: goto +15 -> 413
      //   401: astore_1
      //   402: aload_0
      //   403: aload 7
      //   405: invokevirtual 130	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   408: putfield 58	b/i/b/a/c/e/a$ai:i	Lb/i/b/a/c/g/d;
      //   411: aload_1
      //   412: athrow
      //   413: aload_0
      //   414: getfield 134	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   417: invokevirtual 138	b/i/b/a/c/g/h:c	()V
      //   420: aload_1
      //   421: athrow
      //   422: aload 8
      //   424: invokevirtual 125	b/i/b/a/c/g/f:a	()V
      //   427: aload_0
      //   428: aload 7
      //   430: invokevirtual 130	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   433: putfield 58	b/i/b/a/c/e/a$ai:i	Lb/i/b/a/c/g/d;
      //   436: goto +15 -> 451
      //   439: astore_1
      //   440: aload_0
      //   441: aload 7
      //   443: invokevirtual 130	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   446: putfield 58	b/i/b/a/c/e/a$ai:i	Lb/i/b/a/c/g/d;
      //   449: aload_1
      //   450: athrow
      //   451: aload_0
      //   452: getfield 134	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   455: invokevirtual 138	b/i/b/a/c/g/h:c	()V
      //   458: return
      //   459: astore_2
      //   460: goto -71 -> 389
      //   463: astore_1
      //   464: goto -37 -> 427
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	467	0	this	ai
      //   0	467	1	parame	b.i.b.a.c.g.e
      //   0	467	2	paramg	g
      //   32	317	3	m	int
      //   41	61	4	n	int
      //   66	219	5	localObject1	Object
      //   63	168	6	localObject2	Object
      //   21	421	7	localb	b.i.b.a.c.g.d.b
      //   29	394	8	localf	f
      // Exception table:
      //   from	to	target	type
      //   37	43	352	finally
      //   96	109	352	finally
      //   112	131	352	finally
      //   134	153	352	finally
      //   156	177	352	finally
      //   177	192	352	finally
      //   197	216	352	finally
      //   216	227	352	finally
      //   234	253	352	finally
      //   253	268	352	finally
      //   273	292	352	finally
      //   292	302	352	finally
      //   305	323	352	finally
      //   326	344	352	finally
      //   357	376	352	finally
      //   377	384	352	finally
      //   37	43	356	java/io/IOException
      //   96	109	356	java/io/IOException
      //   112	131	356	java/io/IOException
      //   134	153	356	java/io/IOException
      //   156	177	356	java/io/IOException
      //   177	192	356	java/io/IOException
      //   197	216	356	java/io/IOException
      //   216	227	356	java/io/IOException
      //   234	253	356	java/io/IOException
      //   253	268	356	java/io/IOException
      //   273	292	356	java/io/IOException
      //   292	302	356	java/io/IOException
      //   305	323	356	java/io/IOException
      //   326	344	356	java/io/IOException
      //   37	43	376	b/i/b/a/c/g/k
      //   96	109	376	b/i/b/a/c/g/k
      //   112	131	376	b/i/b/a/c/g/k
      //   134	153	376	b/i/b/a/c/g/k
      //   156	177	376	b/i/b/a/c/g/k
      //   177	192	376	b/i/b/a/c/g/k
      //   197	216	376	b/i/b/a/c/g/k
      //   216	227	376	b/i/b/a/c/g/k
      //   234	253	376	b/i/b/a/c/g/k
      //   253	268	376	b/i/b/a/c/g/k
      //   273	292	376	b/i/b/a/c/g/k
      //   292	302	376	b/i/b/a/c/g/k
      //   305	323	376	b/i/b/a/c/g/k
      //   326	344	376	b/i/b/a/c/g/k
      //   384	389	401	finally
      //   422	427	439	finally
      //   384	389	459	java/io/IOException
      //   422	427	463	java/io/IOException
    }
    
    private ai(i.b<ai, ?> paramb)
    {
      super();
      this.i = paramb.a;
    }
    
    public static a a(ai paramai)
    {
      return a.h().a(paramai);
    }
    
    public static ai a()
    {
      return h;
    }
    
    private void n()
    {
      this.b = 0;
      this.c = 0;
      this.d = a.aa.a();
      this.e = 0;
      this.f = a.aa.a();
      this.g = 0;
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      i.c.a locala = x();
      if ((this.j & 0x1) == 1) {
        paramf.a(1, this.b);
      }
      if ((this.j & 0x2) == 2) {
        paramf.a(2, this.c);
      }
      if ((this.j & 0x4) == 4) {
        paramf.a(3, this.d);
      }
      if ((this.j & 0x10) == 16) {
        paramf.a(4, this.f);
      }
      if ((this.j & 0x8) == 8) {
        paramf.a(5, this.e);
      }
      if ((this.j & 0x20) == 32) {
        paramf.a(6, this.g);
      }
      locala.a(200, paramf);
      paramf.c(this.i);
    }
    
    public final s<ai> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.j & 0x1) == 1;
    }
    
    public final boolean d()
    {
      return (this.j & 0x2) == 2;
    }
    
    public final boolean e()
    {
      int m = this.k;
      if (m == 1) {
        return true;
      }
      if (m == 0) {
        return false;
      }
      if (!d())
      {
        this.k = 0;
        return false;
      }
      if ((g()) && (!this.d.e()))
      {
        this.k = 0;
        return false;
      }
      if ((l()) && (!this.f.e()))
      {
        this.k = 0;
        return false;
      }
      if (!this.s.e())
      {
        this.k = 0;
        return false;
      }
      this.k = 1;
      return true;
    }
    
    public final int f()
    {
      int m = this.l;
      if (m != -1) {
        return m;
      }
      int n = this.j;
      m = 0;
      if ((n & 0x1) == 1) {
        m = 0 + f.c(1, this.b);
      }
      n = m;
      if ((this.j & 0x2) == 2) {
        n = m + f.c(2, this.c);
      }
      m = n;
      if ((this.j & 0x4) == 4) {
        m = n + f.c(3, this.d);
      }
      n = m;
      if ((this.j & 0x10) == 16) {
        n = m + f.c(4, this.f);
      }
      m = n;
      if ((this.j & 0x8) == 8) {
        m = n + f.c(5, this.e);
      }
      n = m;
      if ((this.j & 0x20) == 32) {
        n = m + f.c(6, this.g);
      }
      m = n + this.s.f() + this.i.a();
      this.l = m;
      return m;
    }
    
    public final boolean g()
    {
      return (this.j & 0x4) == 4;
    }
    
    public final boolean k()
    {
      return (this.j & 0x8) == 8;
    }
    
    public final boolean l()
    {
      return (this.j & 0x10) == 16;
    }
    
    public final boolean m()
    {
      return (this.j & 0x20) == 32;
    }
    
    public static final class a
      extends i.b<a.ai, a>
      implements a.aj
    {
      private int c;
      private int d;
      private int e;
      private a.aa f = a.aa.a();
      private int g;
      private a.aa h = a.aa.a();
      private int i;
      
      private a a(int paramInt)
      {
        this.c |= 0x1;
        this.d = paramInt;
        return this;
      }
      
      private a a(a.aa paramaa)
      {
        a.aa localaa = paramaa;
        if ((this.c & 0x4) == 4)
        {
          localaa = paramaa;
          if (this.f != a.aa.a()) {
            localaa = a.aa.a(this.f).a(paramaa).h();
          }
        }
        this.f = localaa;
        this.c |= 0x4;
        return this;
      }
      
      private a b(int paramInt)
      {
        this.c |= 0x2;
        this.e = paramInt;
        return this;
      }
      
      private a b(a.aa paramaa)
      {
        a.aa localaa = paramaa;
        if ((this.c & 0x10) == 16)
        {
          localaa = paramaa;
          if (this.h != a.aa.a()) {
            localaa = a.aa.a(this.h).a(paramaa).h();
          }
        }
        this.h = localaa;
        this.c |= 0x10;
        return this;
      }
      
      private a c(int paramInt)
      {
        this.c |= 0x8;
        this.g = paramInt;
        return this;
      }
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 63	b/i/b/a/c/e/a$ai:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 68 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$ai
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 71	b/i/b/a/c/e/a$ai$a:a	(Lb/i/b/a/c/e/a$ai;)Lb/i/b/a/c/e/a$ai$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 74	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$ai
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 71	b/i/b/a/c/e/a$ai$a:a	(Lb/i/b/a/c/e/a$ai;)Lb/i/b/a/c/e/a$ai$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a d(int paramInt)
      {
        this.c |= 0x20;
        this.i = paramInt;
        return this;
      }
      
      private a i()
      {
        return new a().a(g());
      }
      
      public final a a(a.ai paramai)
      {
        if (paramai == a.ai.a()) {
          return this;
        }
        if (paramai.c()) {
          a(paramai.b);
        }
        if (paramai.d()) {
          b(paramai.c);
        }
        if (paramai.g()) {
          a(paramai.d);
        }
        if (paramai.k()) {
          c(paramai.e);
        }
        if (paramai.l()) {
          b(paramai.f);
        }
        if (paramai.m()) {
          d(paramai.g);
        }
        a(paramai);
        this.a = this.a.a(a.ai.b(paramai));
        return this;
      }
      
      public final boolean e()
      {
        int j;
        if ((this.c & 0x2) == 2) {
          j = 1;
        } else {
          j = 0;
        }
        if (j == 0) {
          return false;
        }
        if ((this.c & 0x4) == 4) {
          j = 1;
        } else {
          j = 0;
        }
        if ((j != 0) && (!this.f.e())) {
          return false;
        }
        if ((this.c & 0x10) == 16) {
          j = 1;
        } else {
          j = 0;
        }
        if ((j != 0) && (!this.h.e())) {
          return false;
        }
        return this.b.e();
      }
      
      public final a.ai g()
      {
        int k = 0;
        a.ai localai = new a.ai(this, (byte)0);
        int m = this.c;
        if ((m & 0x1) == 1) {
          k = 1;
        }
        a.ai.a(localai, this.d);
        int j = k;
        if ((m & 0x2) == 2) {
          j = k | 0x2;
        }
        a.ai.b(localai, this.e);
        k = j;
        if ((m & 0x4) == 4) {
          k = j | 0x4;
        }
        a.ai.a(localai, this.f);
        j = k;
        if ((m & 0x8) == 8) {
          j = k | 0x8;
        }
        a.ai.c(localai, this.g);
        k = j;
        if ((m & 0x10) == 16) {
          k = j | 0x10;
        }
        a.ai.b(localai, this.h);
        j = k;
        if ((m & 0x20) == 32) {
          j = k | 0x20;
        }
        a.ai.d(localai, this.i);
        a.ai.e(localai, j);
        return localai;
      }
    }
  }
  
  public static abstract interface aj
    extends i.d
  {}
  
  public static final class ak
    extends i
    implements a.al
  {
    public static s<ak> a = new b() {};
    private static final ak h;
    public int b;
    public int c;
    public b d;
    public int e;
    public int f;
    public c g;
    private final d i;
    private int j;
    private byte k = -1;
    private int l = -1;
    
    static
    {
      ak localak = new ak();
      h = localak;
      localak.n();
    }
    
    private ak()
    {
      this.i = d.b;
    }
    
    /* Error */
    private ak(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 56	b/i/b/a/c/g/i:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 58	b/i/b/a/c/e/a$ak:k	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 60	b/i/b/a/c/e/a$ak:l	I
      //   14: aload_0
      //   15: invokespecial 54	b/i/b/a/c/e/a$ak:n	()V
      //   18: invokestatic 74	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   21: astore 6
      //   23: aload 6
      //   25: iconst_1
      //   26: invokestatic 79	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   29: astore 7
      //   31: iconst_0
      //   32: istore_3
      //   33: iload_3
      //   34: ifne +332 -> 366
      //   37: aload_1
      //   38: invokevirtual 84	b/i/b/a/c/g/e:a	()I
      //   41: istore 5
      //   43: iload 5
      //   45: ifeq +249 -> 294
      //   48: iload 5
      //   50: bipush 8
      //   52: if_icmpeq +221 -> 273
      //   55: iload 5
      //   57: bipush 16
      //   59: if_icmpeq +193 -> 252
      //   62: iload 5
      //   64: bipush 24
      //   66: if_icmpeq +139 -> 205
      //   69: iload 5
      //   71: bipush 32
      //   73: if_icmpeq +110 -> 183
      //   76: iload 5
      //   78: bipush 40
      //   80: if_icmpeq +81 -> 161
      //   83: iload 5
      //   85: bipush 48
      //   87: if_icmpeq +19 -> 106
      //   90: aload_0
      //   91: aload_1
      //   92: aload 7
      //   94: aload_2
      //   95: iload 5
      //   97: invokevirtual 87	b/i/b/a/c/e/a$ak:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   100: ifne -67 -> 33
      //   103: goto +191 -> 294
      //   106: aload_1
      //   107: invokevirtual 89	b/i/b/a/c/g/e:d	()I
      //   110: istore 4
      //   112: iload 4
      //   114: invokestatic 92	b/i/b/a/c/e/a$ak$c:a	(I)Lb/i/b/a/c/e/a$ak$c;
      //   117: astore 8
      //   119: aload 8
      //   121: ifnonnull +20 -> 141
      //   124: aload 7
      //   126: iload 5
      //   128: invokevirtual 95	b/i/b/a/c/g/f:e	(I)V
      //   131: aload 7
      //   133: iload 4
      //   135: invokevirtual 95	b/i/b/a/c/g/f:e	(I)V
      //   138: goto -105 -> 33
      //   141: aload_0
      //   142: aload_0
      //   143: getfield 97	b/i/b/a/c/e/a$ak:j	I
      //   146: bipush 32
      //   148: ior
      //   149: putfield 97	b/i/b/a/c/e/a$ak:j	I
      //   152: aload_0
      //   153: aload 8
      //   155: putfield 99	b/i/b/a/c/e/a$ak:g	Lb/i/b/a/c/e/a$ak$c;
      //   158: goto -125 -> 33
      //   161: aload_0
      //   162: aload_0
      //   163: getfield 97	b/i/b/a/c/e/a$ak:j	I
      //   166: bipush 16
      //   168: ior
      //   169: putfield 97	b/i/b/a/c/e/a$ak:j	I
      //   172: aload_0
      //   173: aload_1
      //   174: invokevirtual 89	b/i/b/a/c/g/e:d	()I
      //   177: putfield 101	b/i/b/a/c/e/a$ak:f	I
      //   180: goto -147 -> 33
      //   183: aload_0
      //   184: aload_0
      //   185: getfield 97	b/i/b/a/c/e/a$ak:j	I
      //   188: bipush 8
      //   190: ior
      //   191: putfield 97	b/i/b/a/c/e/a$ak:j	I
      //   194: aload_0
      //   195: aload_1
      //   196: invokevirtual 89	b/i/b/a/c/g/e:d	()I
      //   199: putfield 103	b/i/b/a/c/e/a$ak:e	I
      //   202: goto -169 -> 33
      //   205: aload_1
      //   206: invokevirtual 89	b/i/b/a/c/g/e:d	()I
      //   209: istore 4
      //   211: iload 4
      //   213: invokestatic 106	b/i/b/a/c/e/a$ak$b:a	(I)Lb/i/b/a/c/e/a$ak$b;
      //   216: astore 8
      //   218: aload 8
      //   220: ifnonnull +13 -> 233
      //   223: aload 7
      //   225: iload 5
      //   227: invokevirtual 95	b/i/b/a/c/g/f:e	(I)V
      //   230: goto -99 -> 131
      //   233: aload_0
      //   234: aload_0
      //   235: getfield 97	b/i/b/a/c/e/a$ak:j	I
      //   238: iconst_4
      //   239: ior
      //   240: putfield 97	b/i/b/a/c/e/a$ak:j	I
      //   243: aload_0
      //   244: aload 8
      //   246: putfield 108	b/i/b/a/c/e/a$ak:d	Lb/i/b/a/c/e/a$ak$b;
      //   249: goto -216 -> 33
      //   252: aload_0
      //   253: aload_0
      //   254: getfield 97	b/i/b/a/c/e/a$ak:j	I
      //   257: iconst_2
      //   258: ior
      //   259: putfield 97	b/i/b/a/c/e/a$ak:j	I
      //   262: aload_0
      //   263: aload_1
      //   264: invokevirtual 89	b/i/b/a/c/g/e:d	()I
      //   267: putfield 110	b/i/b/a/c/e/a$ak:c	I
      //   270: goto -237 -> 33
      //   273: aload_0
      //   274: aload_0
      //   275: getfield 97	b/i/b/a/c/e/a$ak:j	I
      //   278: iconst_1
      //   279: ior
      //   280: putfield 97	b/i/b/a/c/e/a$ak:j	I
      //   283: aload_0
      //   284: aload_1
      //   285: invokevirtual 89	b/i/b/a/c/g/e:d	()I
      //   288: putfield 112	b/i/b/a/c/e/a$ak:b	I
      //   291: goto -258 -> 33
      //   294: iconst_1
      //   295: istore_3
      //   296: goto -263 -> 33
      //   299: astore_1
      //   300: goto +31 -> 331
      //   303: astore_1
      //   304: new 69	b/i/b/a/c/g/k
      //   307: dup
      //   308: aload_1
      //   309: invokevirtual 116	java/io/IOException:getMessage	()Ljava/lang/String;
      //   312: invokespecial 119	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   315: astore_1
      //   316: aload_1
      //   317: aload_0
      //   318: putfield 122	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   321: aload_1
      //   322: athrow
      //   323: astore_1
      //   324: aload_1
      //   325: aload_0
      //   326: putfield 122	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   329: aload_1
      //   330: athrow
      //   331: aload 7
      //   333: invokevirtual 124	b/i/b/a/c/g/f:a	()V
      //   336: aload_0
      //   337: aload 6
      //   339: invokevirtual 129	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   342: putfield 66	b/i/b/a/c/e/a$ak:i	Lb/i/b/a/c/g/d;
      //   345: goto +15 -> 360
      //   348: astore_1
      //   349: aload_0
      //   350: aload 6
      //   352: invokevirtual 129	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   355: putfield 66	b/i/b/a/c/e/a$ak:i	Lb/i/b/a/c/g/d;
      //   358: aload_1
      //   359: athrow
      //   360: aload_0
      //   361: invokevirtual 132	b/i/b/a/c/e/a$ak:w	()V
      //   364: aload_1
      //   365: athrow
      //   366: aload 7
      //   368: invokevirtual 124	b/i/b/a/c/g/f:a	()V
      //   371: aload_0
      //   372: aload 6
      //   374: invokevirtual 129	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   377: putfield 66	b/i/b/a/c/e/a$ak:i	Lb/i/b/a/c/g/d;
      //   380: goto +15 -> 395
      //   383: astore_1
      //   384: aload_0
      //   385: aload 6
      //   387: invokevirtual 129	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   390: putfield 66	b/i/b/a/c/e/a$ak:i	Lb/i/b/a/c/g/d;
      //   393: aload_1
      //   394: athrow
      //   395: aload_0
      //   396: invokevirtual 132	b/i/b/a/c/e/a$ak:w	()V
      //   399: return
      //   400: astore_2
      //   401: goto -65 -> 336
      //   404: astore_1
      //   405: goto -34 -> 371
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	408	0	this	ak
      //   0	408	1	parame	b.i.b.a.c.g.e
      //   0	408	2	paramg	g
      //   32	264	3	m	int
      //   110	102	4	n	int
      //   41	185	5	i1	int
      //   21	365	6	localb	b.i.b.a.c.g.d.b
      //   29	338	7	localf	f
      //   117	128	8	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   37	43	299	finally
      //   90	103	299	finally
      //   106	119	299	finally
      //   124	131	299	finally
      //   131	138	299	finally
      //   141	158	299	finally
      //   161	180	299	finally
      //   183	202	299	finally
      //   205	218	299	finally
      //   223	230	299	finally
      //   233	249	299	finally
      //   252	270	299	finally
      //   273	291	299	finally
      //   304	323	299	finally
      //   324	331	299	finally
      //   37	43	303	java/io/IOException
      //   90	103	303	java/io/IOException
      //   106	119	303	java/io/IOException
      //   124	131	303	java/io/IOException
      //   131	138	303	java/io/IOException
      //   141	158	303	java/io/IOException
      //   161	180	303	java/io/IOException
      //   183	202	303	java/io/IOException
      //   205	218	303	java/io/IOException
      //   223	230	303	java/io/IOException
      //   233	249	303	java/io/IOException
      //   252	270	303	java/io/IOException
      //   273	291	303	java/io/IOException
      //   37	43	323	b/i/b/a/c/g/k
      //   90	103	323	b/i/b/a/c/g/k
      //   106	119	323	b/i/b/a/c/g/k
      //   124	131	323	b/i/b/a/c/g/k
      //   131	138	323	b/i/b/a/c/g/k
      //   141	158	323	b/i/b/a/c/g/k
      //   161	180	323	b/i/b/a/c/g/k
      //   183	202	323	b/i/b/a/c/g/k
      //   205	218	323	b/i/b/a/c/g/k
      //   223	230	323	b/i/b/a/c/g/k
      //   233	249	323	b/i/b/a/c/g/k
      //   252	270	323	b/i/b/a/c/g/k
      //   273	291	323	b/i/b/a/c/g/k
      //   331	336	348	finally
      //   366	371	383	finally
      //   331	336	400	java/io/IOException
      //   366	371	404	java/io/IOException
    }
    
    private ak(i.a parama)
    {
      super();
      this.i = parama.a;
    }
    
    public static ak a()
    {
      return h;
    }
    
    private void n()
    {
      this.b = 0;
      this.c = 0;
      this.d = b.b;
      this.e = 0;
      this.f = 0;
      this.g = c.a;
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      if ((this.j & 0x1) == 1) {
        paramf.a(1, this.b);
      }
      if ((this.j & 0x2) == 2) {
        paramf.a(2, this.c);
      }
      if ((this.j & 0x4) == 4) {
        paramf.b(3, this.d.d);
      }
      if ((this.j & 0x8) == 8) {
        paramf.a(4, this.e);
      }
      if ((this.j & 0x10) == 16) {
        paramf.a(5, this.f);
      }
      if ((this.j & 0x20) == 32) {
        paramf.b(6, this.g.d);
      }
      paramf.c(this.i);
    }
    
    public final s<ak> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.j & 0x1) == 1;
    }
    
    public final boolean d()
    {
      return (this.j & 0x2) == 2;
    }
    
    public final boolean e()
    {
      int m = this.k;
      if (m == 1) {
        return true;
      }
      if (m == 0) {
        return false;
      }
      this.k = 1;
      return true;
    }
    
    public final int f()
    {
      int m = this.l;
      if (m != -1) {
        return m;
      }
      int n = this.j;
      m = 0;
      if ((n & 0x1) == 1) {
        m = 0 + f.c(1, this.b);
      }
      n = m;
      if ((this.j & 0x2) == 2) {
        n = m + f.c(2, this.c);
      }
      m = n;
      if ((this.j & 0x4) == 4) {
        m = n + f.d(3, this.d.d);
      }
      n = m;
      if ((this.j & 0x8) == 8) {
        n = m + f.c(4, this.e);
      }
      m = n;
      if ((this.j & 0x10) == 16) {
        m = n + f.c(5, this.f);
      }
      n = m;
      if ((this.j & 0x20) == 32) {
        n = m + f.d(6, this.g.d);
      }
      m = n + this.i.a();
      this.l = m;
      return m;
    }
    
    public final boolean g()
    {
      return (this.j & 0x4) == 4;
    }
    
    public final boolean k()
    {
      return (this.j & 0x8) == 8;
    }
    
    public final boolean l()
    {
      return (this.j & 0x10) == 16;
    }
    
    public final boolean m()
    {
      return (this.j & 0x20) == 32;
    }
    
    public static final class a
      extends i.a<a.ak, a>
      implements a.al
    {
      private int b;
      private int c;
      private int d;
      private a.ak.b e = a.ak.b.b;
      private int f;
      private int g;
      private a.ak.c h = a.ak.c.a;
      
      private a a(int paramInt)
      {
        this.b |= 0x1;
        this.c = paramInt;
        return this;
      }
      
      private a a(a.ak.b paramb)
      {
        if (paramb != null)
        {
          this.b |= 0x4;
          this.e = paramb;
          return this;
        }
        throw new NullPointerException();
      }
      
      private a a(a.ak.c paramc)
      {
        if (paramc != null)
        {
          this.b |= 0x20;
          this.h = paramc;
          return this;
        }
        throw new NullPointerException();
      }
      
      private a b(int paramInt)
      {
        this.b |= 0x2;
        this.d = paramInt;
        return this;
      }
      
      private a c(int paramInt)
      {
        this.b |= 0x8;
        this.f = paramInt;
        return this;
      }
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 62	b/i/b/a/c/e/a$ak:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 67 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$ak
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 70	b/i/b/a/c/e/a$ak$a:a	(Lb/i/b/a/c/e/a$ak;)Lb/i/b/a/c/e/a$ak$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 73	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$ak
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 70	b/i/b/a/c/e/a$ak$a:a	(Lb/i/b/a/c/e/a$ak;)Lb/i/b/a/c/e/a$ak$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a d(int paramInt)
      {
        this.b |= 0x10;
        this.g = paramInt;
        return this;
      }
      
      private a g()
      {
        return new a().a(h());
      }
      
      private a.ak h()
      {
        int j = 0;
        a.ak localak = new a.ak(this, (byte)0);
        int k = this.b;
        if ((k & 0x1) == 1) {
          j = 1;
        }
        a.ak.a(localak, this.c);
        int i = j;
        if ((k & 0x2) == 2) {
          i = j | 0x2;
        }
        a.ak.b(localak, this.d);
        j = i;
        if ((k & 0x4) == 4) {
          j = i | 0x4;
        }
        a.ak.a(localak, this.e);
        i = j;
        if ((k & 0x8) == 8) {
          i = j | 0x8;
        }
        a.ak.c(localak, this.f);
        j = i;
        if ((k & 0x10) == 16) {
          j = i | 0x10;
        }
        a.ak.d(localak, this.g);
        i = j;
        if ((k & 0x20) == 32) {
          i = j | 0x20;
        }
        a.ak.a(localak, this.h);
        a.ak.e(localak, i);
        return localak;
      }
      
      public final a a(a.ak paramak)
      {
        if (paramak == a.ak.a()) {
          return this;
        }
        if (paramak.c()) {
          a(paramak.b);
        }
        if (paramak.d()) {
          b(paramak.c);
        }
        if (paramak.g()) {
          a(paramak.d);
        }
        if (paramak.k()) {
          c(paramak.e);
        }
        if (paramak.l()) {
          d(paramak.f);
        }
        if (paramak.m()) {
          a(paramak.g);
        }
        this.a = this.a.a(a.ak.a(paramak));
        return this;
      }
      
      public final boolean e()
      {
        return true;
      }
    }
    
    public static enum b
      implements j.a
    {
      private static j.b<b> e = new j.b() {};
      final int d;
      
      private b(int paramInt1, int paramInt2)
      {
        this.d = paramInt1;
      }
      
      public static b a(int paramInt)
      {
        switch (paramInt)
        {
        default: 
          return null;
        case 2: 
          return c;
        case 1: 
          return b;
        }
        return a;
      }
      
      public final int a()
      {
        return this.d;
      }
    }
    
    public static enum c
      implements j.a
    {
      private static j.b<c> e = new j.b() {};
      final int d;
      
      private c(int paramInt1, int paramInt2)
      {
        this.d = paramInt1;
      }
      
      public static c a(int paramInt)
      {
        switch (paramInt)
        {
        default: 
          return null;
        case 2: 
          return c;
        case 1: 
          return b;
        }
        return a;
      }
      
      public final int a()
      {
        return this.d;
      }
    }
  }
  
  public static abstract interface al
    extends r
  {}
  
  public static final class am
    extends i
    implements a.an
  {
    public static s<am> a = new b() {};
    private static final am c;
    public List<a.ak> b;
    private final d d;
    private byte e = -1;
    private int f = -1;
    
    static
    {
      am localam = new am();
      c = localam;
      localam.b = Collections.emptyList();
    }
    
    private am()
    {
      this.d = d.b;
    }
    
    /* Error */
    private am(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 47	b/i/b/a/c/g/i:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 49	b/i/b/a/c/e/a$am:e	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 51	b/i/b/a/c/e/a$am:f	I
      //   14: aload_0
      //   15: invokestatic 43	java/util/Collections:emptyList	()Ljava/util/List;
      //   18: putfield 45	b/i/b/a/c/e/a$am:b	Ljava/util/List;
      //   21: invokestatic 66	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   24: astore 9
      //   26: aload 9
      //   28: iconst_1
      //   29: invokestatic 71	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   32: astore 10
      //   34: iconst_0
      //   35: istore 8
      //   37: iconst_0
      //   38: istore_3
      //   39: iload 8
      //   41: ifne +238 -> 279
      //   44: iload_3
      //   45: istore 5
      //   47: iload_3
      //   48: istore 6
      //   50: iload_3
      //   51: istore 7
      //   53: aload_1
      //   54: invokevirtual 76	b/i/b/a/c/g/e:a	()I
      //   57: istore 4
      //   59: iload 4
      //   61: ifeq +106 -> 167
      //   64: iload 4
      //   66: bipush 10
      //   68: if_icmpeq +28 -> 96
      //   71: iload_3
      //   72: istore 5
      //   74: iload_3
      //   75: istore 6
      //   77: iload_3
      //   78: istore 7
      //   80: aload_0
      //   81: aload_1
      //   82: aload 10
      //   84: aload_2
      //   85: iload 4
      //   87: invokevirtual 79	b/i/b/a/c/e/a$am:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   90: ifne -51 -> 39
      //   93: goto +74 -> 167
      //   96: iload_3
      //   97: istore 4
      //   99: iload_3
      //   100: iconst_1
      //   101: iand
      //   102: iconst_1
      //   103: if_icmpeq +28 -> 131
      //   106: iload_3
      //   107: istore 5
      //   109: iload_3
      //   110: istore 6
      //   112: iload_3
      //   113: istore 7
      //   115: aload_0
      //   116: new 81	java/util/ArrayList
      //   119: dup
      //   120: invokespecial 82	java/util/ArrayList:<init>	()V
      //   123: putfield 45	b/i/b/a/c/e/a$am:b	Ljava/util/List;
      //   126: iload_3
      //   127: iconst_1
      //   128: ior
      //   129: istore 4
      //   131: iload 4
      //   133: istore 5
      //   135: iload 4
      //   137: istore 6
      //   139: iload 4
      //   141: istore 7
      //   143: aload_0
      //   144: getfield 45	b/i/b/a/c/e/a$am:b	Ljava/util/List;
      //   147: aload_1
      //   148: getstatic 85	b/i/b/a/c/e/a$ak:a	Lb/i/b/a/c/g/s;
      //   151: aload_2
      //   152: invokevirtual 88	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   155: invokeinterface 94 2 0
      //   160: pop
      //   161: iload 4
      //   163: istore_3
      //   164: goto -125 -> 39
      //   167: iconst_1
      //   168: istore 8
      //   170: goto -131 -> 39
      //   173: astore_1
      //   174: goto +51 -> 225
      //   177: astore_1
      //   178: iload 6
      //   180: istore 5
      //   182: new 60	b/i/b/a/c/g/k
      //   185: dup
      //   186: aload_1
      //   187: invokevirtual 98	java/io/IOException:getMessage	()Ljava/lang/String;
      //   190: invokespecial 101	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   193: astore_1
      //   194: iload 6
      //   196: istore 5
      //   198: aload_1
      //   199: aload_0
      //   200: putfield 104	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   203: iload 6
      //   205: istore 5
      //   207: aload_1
      //   208: athrow
      //   209: astore_1
      //   210: iload 7
      //   212: istore 5
      //   214: aload_1
      //   215: aload_0
      //   216: putfield 104	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   219: iload 7
      //   221: istore 5
      //   223: aload_1
      //   224: athrow
      //   225: iload 5
      //   227: iconst_1
      //   228: iand
      //   229: iconst_1
      //   230: if_icmpne +14 -> 244
      //   233: aload_0
      //   234: aload_0
      //   235: getfield 45	b/i/b/a/c/e/a$am:b	Ljava/util/List;
      //   238: invokestatic 108	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   241: putfield 45	b/i/b/a/c/e/a$am:b	Ljava/util/List;
      //   244: aload 10
      //   246: invokevirtual 110	b/i/b/a/c/g/f:a	()V
      //   249: aload_0
      //   250: aload 9
      //   252: invokevirtual 115	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   255: putfield 57	b/i/b/a/c/e/a$am:d	Lb/i/b/a/c/g/d;
      //   258: goto +15 -> 273
      //   261: astore_1
      //   262: aload_0
      //   263: aload 9
      //   265: invokevirtual 115	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   268: putfield 57	b/i/b/a/c/e/a$am:d	Lb/i/b/a/c/g/d;
      //   271: aload_1
      //   272: athrow
      //   273: aload_0
      //   274: invokevirtual 118	b/i/b/a/c/e/a$am:w	()V
      //   277: aload_1
      //   278: athrow
      //   279: iload_3
      //   280: iconst_1
      //   281: iand
      //   282: iconst_1
      //   283: if_icmpne +14 -> 297
      //   286: aload_0
      //   287: aload_0
      //   288: getfield 45	b/i/b/a/c/e/a$am:b	Ljava/util/List;
      //   291: invokestatic 108	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   294: putfield 45	b/i/b/a/c/e/a$am:b	Ljava/util/List;
      //   297: aload 10
      //   299: invokevirtual 110	b/i/b/a/c/g/f:a	()V
      //   302: aload_0
      //   303: aload 9
      //   305: invokevirtual 115	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   308: putfield 57	b/i/b/a/c/e/a$am:d	Lb/i/b/a/c/g/d;
      //   311: goto +15 -> 326
      //   314: astore_1
      //   315: aload_0
      //   316: aload 9
      //   318: invokevirtual 115	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   321: putfield 57	b/i/b/a/c/e/a$am:d	Lb/i/b/a/c/g/d;
      //   324: aload_1
      //   325: athrow
      //   326: aload_0
      //   327: invokevirtual 118	b/i/b/a/c/e/a$am:w	()V
      //   330: return
      //   331: astore_2
      //   332: goto -83 -> 249
      //   335: astore_1
      //   336: goto -34 -> 302
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	339	0	this	am
      //   0	339	1	parame	b.i.b.a.c.g.e
      //   0	339	2	paramg	g
      //   38	244	3	i	int
      //   57	105	4	j	int
      //   45	184	5	k	int
      //   48	156	6	m	int
      //   51	169	7	n	int
      //   35	134	8	i1	int
      //   24	293	9	localb	b.i.b.a.c.g.d.b
      //   32	266	10	localf	f
      // Exception table:
      //   from	to	target	type
      //   53	59	173	finally
      //   80	93	173	finally
      //   115	126	173	finally
      //   143	161	173	finally
      //   182	194	173	finally
      //   198	203	173	finally
      //   207	209	173	finally
      //   214	219	173	finally
      //   223	225	173	finally
      //   53	59	177	java/io/IOException
      //   80	93	177	java/io/IOException
      //   115	126	177	java/io/IOException
      //   143	161	177	java/io/IOException
      //   53	59	209	b/i/b/a/c/g/k
      //   80	93	209	b/i/b/a/c/g/k
      //   115	126	209	b/i/b/a/c/g/k
      //   143	161	209	b/i/b/a/c/g/k
      //   244	249	261	finally
      //   297	302	314	finally
      //   244	249	331	java/io/IOException
      //   297	302	335	java/io/IOException
    }
    
    private am(i.a parama)
    {
      super();
      this.d = parama.a;
    }
    
    public static a a(am paramam)
    {
      return a.g().a(paramam);
    }
    
    public static am a()
    {
      return c;
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      int i = 0;
      while (i < this.b.size())
      {
        paramf.a(1, (q)this.b.get(i));
        i += 1;
      }
      paramf.c(this.d);
    }
    
    public final s<am> b()
    {
      return a;
    }
    
    public final boolean e()
    {
      int i = this.e;
      if (i == 1) {
        return true;
      }
      if (i == 0) {
        return false;
      }
      this.e = 1;
      return true;
    }
    
    public final int f()
    {
      int i = this.f;
      if (i != -1) {
        return i;
      }
      i = 0;
      int j = 0;
      while (i < this.b.size())
      {
        j += f.c(1, (q)this.b.get(i));
        i += 1;
      }
      i = j + this.d.a();
      this.f = i;
      return i;
    }
    
    public static final class a
      extends i.a<a.am, a>
      implements a.an
    {
      private int b;
      private List<a.ak> c = Collections.emptyList();
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 39	b/i/b/a/c/e/a$am:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 44 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$am
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 47	b/i/b/a/c/e/a$am$a:a	(Lb/i/b/a/c/e/a$am;)Lb/i/b/a/c/e/a$am$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 50	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$am
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 47	b/i/b/a/c/e/a$am$a:a	(Lb/i/b/a/c/e/a$am;)Lb/i/b/a/c/e/a$am$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a h()
      {
        return new a().a(f());
      }
      
      private void i()
      {
        if ((this.b & 0x1) != 1)
        {
          this.c = new ArrayList(this.c);
          this.b |= 0x1;
        }
      }
      
      public final a a(a.am paramam)
      {
        if (paramam == a.am.a()) {
          return this;
        }
        if (!a.am.b(paramam).isEmpty()) {
          if (this.c.isEmpty())
          {
            this.c = a.am.b(paramam);
            this.b &= 0xFFFFFFFE;
          }
          else
          {
            i();
            this.c.addAll(a.am.b(paramam));
          }
        }
        this.a = this.a.a(a.am.c(paramam));
        return this;
      }
      
      public final boolean e()
      {
        return true;
      }
      
      public final a.am f()
      {
        a.am localam = new a.am(this, (byte)0);
        if ((this.b & 0x1) == 1)
        {
          this.c = Collections.unmodifiableList(this.c);
          this.b &= 0xFFFFFFFE;
        }
        a.am.a(localam, this.c);
        return localam;
      }
    }
  }
  
  public static abstract interface an
    extends r
  {}
  
  public static enum ao
    implements j.a
  {
    private static j.b<ao> g = new j.b() {};
    private final int h;
    
    private ao(int paramInt1, int paramInt2)
    {
      this.h = paramInt1;
    }
    
    public static ao a(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return null;
      case 5: 
        return f;
      case 4: 
        return e;
      case 3: 
        return d;
      case 2: 
        return c;
      case 1: 
        return b;
      }
      return a;
    }
    
    public final int a()
    {
      return this.h;
    }
  }
  
  public static abstract interface b
    extends r
  {}
  
  public static final class c
    extends i.c<c>
    implements a.d
  {
    public static s<c> a = new b() {};
    private static final c t;
    private int A = -1;
    public int b;
    public int c;
    public int d;
    public List<a.ae> e;
    public List<a.aa> f;
    public List<Integer> g;
    public List<Integer> h;
    public List<a.e> i;
    public List<a.o> j;
    public List<a.u> k;
    public List<a.ab> l;
    public List<a.k> m;
    public List<Integer> n;
    public a.ag o;
    public List<Integer> p;
    public a.am q;
    private final d u;
    private int v;
    private int w = -1;
    private int x = -1;
    private int y = -1;
    private byte z = -1;
    
    static
    {
      c localc = new c();
      t = localc;
      localc.m();
    }
    
    private c()
    {
      this.u = d.b;
    }
    
    /* Error */
    private c(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 73	b/i/b/a/c/g/i$c:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 75	b/i/b/a/c/e/a$c:w	I
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 77	b/i/b/a/c/e/a$c:x	I
      //   14: aload_0
      //   15: iconst_m1
      //   16: putfield 79	b/i/b/a/c/e/a$c:y	I
      //   19: aload_0
      //   20: iconst_m1
      //   21: putfield 81	b/i/b/a/c/e/a$c:z	B
      //   24: aload_0
      //   25: iconst_m1
      //   26: putfield 83	b/i/b/a/c/e/a$c:A	I
      //   29: aload_0
      //   30: invokespecial 71	b/i/b/a/c/e/a$c:m	()V
      //   33: invokestatic 97	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   36: astore 14
      //   38: aload 14
      //   40: iconst_1
      //   41: invokestatic 102	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   44: astore 15
      //   46: iconst_0
      //   47: istore 9
      //   49: iconst_0
      //   50: istore_3
      //   51: iload 9
      //   53: ifne +2505 -> 2558
      //   56: iload_3
      //   57: istore 4
      //   59: iload_3
      //   60: istore 5
      //   62: iload_3
      //   63: istore 6
      //   65: aload_1
      //   66: invokevirtual 107	b/i/b/a/c/g/e:a	()I
      //   69: istore 7
      //   71: aconst_null
      //   72: astore 13
      //   74: aconst_null
      //   75: astore 12
      //   77: iload 7
      //   79: lookupswitch	default:+2758->2837, 0:+2121->2200, 8:+2079->2158, 16:+1996->2075, 18:+1862->1941, 24:+1823->1902, 32:+1784->1863, 42:+1700->1779, 50:+1616->1695, 56:+1533->1612, 58:+1399->1478, 66:+1312->1391, 74:+1225->1304, 82:+1138->1217, 90:+1051->1130, 106:+964->1043, 128:+878->957, 130:+720->799, 242:+588->667, 248:+480->559, 250:+329->408, 258:+201->280
      //   256: iload_3
      //   257: istore 4
      //   259: iload_3
      //   260: istore 5
      //   262: iload_3
      //   263: istore 6
      //   265: aload_0
      //   266: aload_1
      //   267: aload 15
      //   269: aload_2
      //   270: iload 7
      //   272: invokevirtual 110	b/i/b/a/c/e/a$c:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   275: istore 11
      //   277: goto +1929 -> 2206
      //   280: iload_3
      //   281: istore 4
      //   283: iload_3
      //   284: istore 5
      //   286: iload_3
      //   287: istore 6
      //   289: aload_0
      //   290: getfield 112	b/i/b/a/c/e/a$c:v	I
      //   293: bipush 16
      //   295: iand
      //   296: bipush 16
      //   298: if_icmpne +21 -> 319
      //   301: iload_3
      //   302: istore 4
      //   304: iload_3
      //   305: istore 5
      //   307: iload_3
      //   308: istore 6
      //   310: aload_0
      //   311: getfield 114	b/i/b/a/c/e/a$c:q	Lb/i/b/a/c/e/a$am;
      //   314: invokestatic 119	b/i/b/a/c/e/a$am:a	(Lb/i/b/a/c/e/a$am;)Lb/i/b/a/c/e/a$am$a;
      //   317: astore 12
      //   319: iload_3
      //   320: istore 4
      //   322: iload_3
      //   323: istore 5
      //   325: iload_3
      //   326: istore 6
      //   328: aload_0
      //   329: aload_1
      //   330: getstatic 120	b/i/b/a/c/e/a$am:a	Lb/i/b/a/c/g/s;
      //   333: aload_2
      //   334: invokevirtual 123	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   337: checkcast 116	b/i/b/a/c/e/a$am
      //   340: putfield 114	b/i/b/a/c/e/a$c:q	Lb/i/b/a/c/e/a$am;
      //   343: aload 12
      //   345: ifnull +40 -> 385
      //   348: iload_3
      //   349: istore 4
      //   351: iload_3
      //   352: istore 5
      //   354: iload_3
      //   355: istore 6
      //   357: aload 12
      //   359: aload_0
      //   360: getfield 114	b/i/b/a/c/e/a$c:q	Lb/i/b/a/c/e/a$am;
      //   363: invokevirtual 126	b/i/b/a/c/e/a$am$a:a	(Lb/i/b/a/c/e/a$am;)Lb/i/b/a/c/e/a$am$a;
      //   366: pop
      //   367: iload_3
      //   368: istore 4
      //   370: iload_3
      //   371: istore 5
      //   373: iload_3
      //   374: istore 6
      //   376: aload_0
      //   377: aload 12
      //   379: invokevirtual 129	b/i/b/a/c/e/a$am$a:f	()Lb/i/b/a/c/e/a$am;
      //   382: putfield 114	b/i/b/a/c/e/a$c:q	Lb/i/b/a/c/e/a$am;
      //   385: iload_3
      //   386: istore 4
      //   388: iload_3
      //   389: istore 5
      //   391: iload_3
      //   392: istore 6
      //   394: aload_0
      //   395: aload_0
      //   396: getfield 112	b/i/b/a/c/e/a$c:v	I
      //   399: bipush 16
      //   401: ior
      //   402: putfield 112	b/i/b/a/c/e/a$c:v	I
      //   405: goto +2435 -> 2840
      //   408: iload_3
      //   409: istore 4
      //   411: iload_3
      //   412: istore 5
      //   414: iload_3
      //   415: istore 6
      //   417: aload_1
      //   418: aload_1
      //   419: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   422: invokevirtual 134	b/i/b/a/c/g/e:b	(I)I
      //   425: istore 8
      //   427: iload_3
      //   428: istore 7
      //   430: iload_3
      //   431: sipush 16384
      //   434: iand
      //   435: sipush 16384
      //   438: if_icmpeq +49 -> 487
      //   441: iload_3
      //   442: istore 7
      //   444: iload_3
      //   445: istore 4
      //   447: iload_3
      //   448: istore 5
      //   450: iload_3
      //   451: istore 6
      //   453: aload_1
      //   454: invokevirtual 136	b/i/b/a/c/g/e:h	()I
      //   457: ifle +30 -> 487
      //   460: iload_3
      //   461: istore 4
      //   463: iload_3
      //   464: istore 5
      //   466: iload_3
      //   467: istore 6
      //   469: aload_0
      //   470: new 138	java/util/ArrayList
      //   473: dup
      //   474: invokespecial 139	java/util/ArrayList:<init>	()V
      //   477: putfield 141	b/i/b/a/c/e/a$c:p	Ljava/util/List;
      //   480: iload_3
      //   481: sipush 16384
      //   484: ior
      //   485: istore 7
      //   487: iload 7
      //   489: istore 4
      //   491: iload 7
      //   493: istore 5
      //   495: iload 7
      //   497: istore 6
      //   499: aload_1
      //   500: invokevirtual 136	b/i/b/a/c/g/e:h	()I
      //   503: ifle +35 -> 538
      //   506: iload 7
      //   508: istore 4
      //   510: iload 7
      //   512: istore 5
      //   514: iload 7
      //   516: istore 6
      //   518: aload_0
      //   519: getfield 141	b/i/b/a/c/e/a$c:p	Ljava/util/List;
      //   522: aload_1
      //   523: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   526: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   529: invokeinterface 153 2 0
      //   534: pop
      //   535: goto -48 -> 487
      //   538: iload 7
      //   540: istore 4
      //   542: iload 7
      //   544: istore 5
      //   546: iload 7
      //   548: istore 6
      //   550: aload_1
      //   551: iload 8
      //   553: invokevirtual 156	b/i/b/a/c/g/e:c	(I)V
      //   556: goto +1661 -> 2217
      //   559: iload_3
      //   560: istore 7
      //   562: iload_3
      //   563: sipush 16384
      //   566: iand
      //   567: sipush 16384
      //   570: if_icmpeq +30 -> 600
      //   573: iload_3
      //   574: istore 4
      //   576: iload_3
      //   577: istore 5
      //   579: iload_3
      //   580: istore 6
      //   582: aload_0
      //   583: new 138	java/util/ArrayList
      //   586: dup
      //   587: invokespecial 139	java/util/ArrayList:<init>	()V
      //   590: putfield 141	b/i/b/a/c/e/a$c:p	Ljava/util/List;
      //   593: iload_3
      //   594: sipush 16384
      //   597: ior
      //   598: istore 7
      //   600: iload 7
      //   602: istore 4
      //   604: iload 7
      //   606: istore 5
      //   608: iload 7
      //   610: istore 6
      //   612: aload_0
      //   613: getfield 141	b/i/b/a/c/e/a$c:p	Ljava/util/List;
      //   616: astore 12
      //   618: iload 7
      //   620: istore 4
      //   622: iload 7
      //   624: istore 5
      //   626: iload 7
      //   628: istore 6
      //   630: aload_1
      //   631: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   634: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   637: astore 13
      //   639: iload 7
      //   641: istore_3
      //   642: iload_3
      //   643: istore 4
      //   645: iload_3
      //   646: istore 5
      //   648: iload_3
      //   649: istore 6
      //   651: aload 12
      //   653: aload 13
      //   655: invokeinterface 153 2 0
      //   660: pop
      //   661: iload_3
      //   662: istore 7
      //   664: goto +1553 -> 2217
      //   667: aload 13
      //   669: astore 12
      //   671: iload_3
      //   672: istore 4
      //   674: iload_3
      //   675: istore 5
      //   677: iload_3
      //   678: istore 6
      //   680: aload_0
      //   681: getfield 112	b/i/b/a/c/e/a$c:v	I
      //   684: bipush 8
      //   686: iand
      //   687: bipush 8
      //   689: if_icmpne +21 -> 710
      //   692: iload_3
      //   693: istore 4
      //   695: iload_3
      //   696: istore 5
      //   698: iload_3
      //   699: istore 6
      //   701: aload_0
      //   702: getfield 158	b/i/b/a/c/e/a$c:o	Lb/i/b/a/c/e/a$ag;
      //   705: invokestatic 163	b/i/b/a/c/e/a$ag:a	(Lb/i/b/a/c/e/a$ag;)Lb/i/b/a/c/e/a$ag$a;
      //   708: astore 12
      //   710: iload_3
      //   711: istore 4
      //   713: iload_3
      //   714: istore 5
      //   716: iload_3
      //   717: istore 6
      //   719: aload_0
      //   720: aload_1
      //   721: getstatic 164	b/i/b/a/c/e/a$ag:a	Lb/i/b/a/c/g/s;
      //   724: aload_2
      //   725: invokevirtual 123	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   728: checkcast 160	b/i/b/a/c/e/a$ag
      //   731: putfield 158	b/i/b/a/c/e/a$c:o	Lb/i/b/a/c/e/a$ag;
      //   734: aload 12
      //   736: ifnull +40 -> 776
      //   739: iload_3
      //   740: istore 4
      //   742: iload_3
      //   743: istore 5
      //   745: iload_3
      //   746: istore 6
      //   748: aload 12
      //   750: aload_0
      //   751: getfield 158	b/i/b/a/c/e/a$c:o	Lb/i/b/a/c/e/a$ag;
      //   754: invokevirtual 167	b/i/b/a/c/e/a$ag$a:a	(Lb/i/b/a/c/e/a$ag;)Lb/i/b/a/c/e/a$ag$a;
      //   757: pop
      //   758: iload_3
      //   759: istore 4
      //   761: iload_3
      //   762: istore 5
      //   764: iload_3
      //   765: istore 6
      //   767: aload_0
      //   768: aload 12
      //   770: invokevirtual 170	b/i/b/a/c/e/a$ag$a:f	()Lb/i/b/a/c/e/a$ag;
      //   773: putfield 158	b/i/b/a/c/e/a$c:o	Lb/i/b/a/c/e/a$ag;
      //   776: iload_3
      //   777: istore 4
      //   779: iload_3
      //   780: istore 5
      //   782: iload_3
      //   783: istore 6
      //   785: aload_0
      //   786: aload_0
      //   787: getfield 112	b/i/b/a/c/e/a$c:v	I
      //   790: bipush 8
      //   792: ior
      //   793: putfield 112	b/i/b/a/c/e/a$c:v	I
      //   796: goto +2044 -> 2840
      //   799: iload_3
      //   800: istore 4
      //   802: iload_3
      //   803: istore 5
      //   805: iload_3
      //   806: istore 6
      //   808: aload_1
      //   809: aload_1
      //   810: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   813: invokevirtual 134	b/i/b/a/c/g/e:b	(I)I
      //   816: istore 10
      //   818: iload_3
      //   819: istore 7
      //   821: iload_3
      //   822: sipush 4096
      //   825: iand
      //   826: sipush 4096
      //   829: if_icmpeq +49 -> 878
      //   832: iload_3
      //   833: istore 7
      //   835: iload_3
      //   836: istore 4
      //   838: iload_3
      //   839: istore 5
      //   841: iload_3
      //   842: istore 6
      //   844: aload_1
      //   845: invokevirtual 136	b/i/b/a/c/g/e:h	()I
      //   848: ifle +30 -> 878
      //   851: iload_3
      //   852: istore 4
      //   854: iload_3
      //   855: istore 5
      //   857: iload_3
      //   858: istore 6
      //   860: aload_0
      //   861: new 138	java/util/ArrayList
      //   864: dup
      //   865: invokespecial 139	java/util/ArrayList:<init>	()V
      //   868: putfield 172	b/i/b/a/c/e/a$c:n	Ljava/util/List;
      //   871: iload_3
      //   872: sipush 4096
      //   875: ior
      //   876: istore 7
      //   878: iload 10
      //   880: istore 8
      //   882: iload 7
      //   884: istore_3
      //   885: iload 7
      //   887: istore 4
      //   889: iload 7
      //   891: istore 5
      //   893: iload 7
      //   895: istore 6
      //   897: aload_1
      //   898: invokevirtual 136	b/i/b/a/c/g/e:h	()I
      //   901: ifle +35 -> 936
      //   904: iload 7
      //   906: istore 4
      //   908: iload 7
      //   910: istore 5
      //   912: iload 7
      //   914: istore 6
      //   916: aload_0
      //   917: getfield 172	b/i/b/a/c/e/a$c:n	Ljava/util/List;
      //   920: aload_1
      //   921: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   924: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   927: invokeinterface 153 2 0
      //   932: pop
      //   933: goto -55 -> 878
      //   936: iload_3
      //   937: istore 4
      //   939: iload_3
      //   940: istore 5
      //   942: iload_3
      //   943: istore 6
      //   945: aload_1
      //   946: iload 8
      //   948: invokevirtual 156	b/i/b/a/c/g/e:c	(I)V
      //   951: iload_3
      //   952: istore 7
      //   954: goto +1263 -> 2217
      //   957: iload_3
      //   958: istore 7
      //   960: iload_3
      //   961: sipush 4096
      //   964: iand
      //   965: sipush 4096
      //   968: if_icmpeq +30 -> 998
      //   971: iload_3
      //   972: istore 4
      //   974: iload_3
      //   975: istore 5
      //   977: iload_3
      //   978: istore 6
      //   980: aload_0
      //   981: new 138	java/util/ArrayList
      //   984: dup
      //   985: invokespecial 139	java/util/ArrayList:<init>	()V
      //   988: putfield 172	b/i/b/a/c/e/a$c:n	Ljava/util/List;
      //   991: iload_3
      //   992: sipush 4096
      //   995: ior
      //   996: istore 7
      //   998: iload 7
      //   1000: istore 4
      //   1002: iload 7
      //   1004: istore 5
      //   1006: iload 7
      //   1008: istore 6
      //   1010: aload_0
      //   1011: getfield 172	b/i/b/a/c/e/a$c:n	Ljava/util/List;
      //   1014: astore 12
      //   1016: iload 7
      //   1018: istore 4
      //   1020: iload 7
      //   1022: istore 5
      //   1024: iload 7
      //   1026: istore 6
      //   1028: aload_1
      //   1029: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   1032: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1035: astore 13
      //   1037: iload 7
      //   1039: istore_3
      //   1040: goto -398 -> 642
      //   1043: iload_3
      //   1044: istore 7
      //   1046: iload_3
      //   1047: sipush 2048
      //   1050: iand
      //   1051: sipush 2048
      //   1054: if_icmpeq +30 -> 1084
      //   1057: iload_3
      //   1058: istore 4
      //   1060: iload_3
      //   1061: istore 5
      //   1063: iload_3
      //   1064: istore 6
      //   1066: aload_0
      //   1067: new 138	java/util/ArrayList
      //   1070: dup
      //   1071: invokespecial 139	java/util/ArrayList:<init>	()V
      //   1074: putfield 174	b/i/b/a/c/e/a$c:m	Ljava/util/List;
      //   1077: iload_3
      //   1078: sipush 2048
      //   1081: ior
      //   1082: istore 7
      //   1084: iload 7
      //   1086: istore 4
      //   1088: iload 7
      //   1090: istore 5
      //   1092: iload 7
      //   1094: istore 6
      //   1096: aload_0
      //   1097: getfield 174	b/i/b/a/c/e/a$c:m	Ljava/util/List;
      //   1100: astore 12
      //   1102: iload 7
      //   1104: istore 4
      //   1106: iload 7
      //   1108: istore 5
      //   1110: iload 7
      //   1112: istore 6
      //   1114: aload_1
      //   1115: getstatic 177	b/i/b/a/c/e/a$k:a	Lb/i/b/a/c/g/s;
      //   1118: aload_2
      //   1119: invokevirtual 123	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   1122: astore 13
      //   1124: iload 7
      //   1126: istore_3
      //   1127: goto -485 -> 642
      //   1130: iload_3
      //   1131: istore 7
      //   1133: iload_3
      //   1134: sipush 1024
      //   1137: iand
      //   1138: sipush 1024
      //   1141: if_icmpeq +30 -> 1171
      //   1144: iload_3
      //   1145: istore 4
      //   1147: iload_3
      //   1148: istore 5
      //   1150: iload_3
      //   1151: istore 6
      //   1153: aload_0
      //   1154: new 138	java/util/ArrayList
      //   1157: dup
      //   1158: invokespecial 139	java/util/ArrayList:<init>	()V
      //   1161: putfield 179	b/i/b/a/c/e/a$c:l	Ljava/util/List;
      //   1164: iload_3
      //   1165: sipush 1024
      //   1168: ior
      //   1169: istore 7
      //   1171: iload 7
      //   1173: istore 4
      //   1175: iload 7
      //   1177: istore 5
      //   1179: iload 7
      //   1181: istore 6
      //   1183: aload_0
      //   1184: getfield 179	b/i/b/a/c/e/a$c:l	Ljava/util/List;
      //   1187: astore 12
      //   1189: iload 7
      //   1191: istore 4
      //   1193: iload 7
      //   1195: istore 5
      //   1197: iload 7
      //   1199: istore 6
      //   1201: aload_1
      //   1202: getstatic 182	b/i/b/a/c/e/a$ab:a	Lb/i/b/a/c/g/s;
      //   1205: aload_2
      //   1206: invokevirtual 123	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   1209: astore 13
      //   1211: iload 7
      //   1213: istore_3
      //   1214: goto -572 -> 642
      //   1217: iload_3
      //   1218: istore 7
      //   1220: iload_3
      //   1221: sipush 512
      //   1224: iand
      //   1225: sipush 512
      //   1228: if_icmpeq +30 -> 1258
      //   1231: iload_3
      //   1232: istore 4
      //   1234: iload_3
      //   1235: istore 5
      //   1237: iload_3
      //   1238: istore 6
      //   1240: aload_0
      //   1241: new 138	java/util/ArrayList
      //   1244: dup
      //   1245: invokespecial 139	java/util/ArrayList:<init>	()V
      //   1248: putfield 184	b/i/b/a/c/e/a$c:k	Ljava/util/List;
      //   1251: iload_3
      //   1252: sipush 512
      //   1255: ior
      //   1256: istore 7
      //   1258: iload 7
      //   1260: istore 4
      //   1262: iload 7
      //   1264: istore 5
      //   1266: iload 7
      //   1268: istore 6
      //   1270: aload_0
      //   1271: getfield 184	b/i/b/a/c/e/a$c:k	Ljava/util/List;
      //   1274: astore 12
      //   1276: iload 7
      //   1278: istore 4
      //   1280: iload 7
      //   1282: istore 5
      //   1284: iload 7
      //   1286: istore 6
      //   1288: aload_1
      //   1289: getstatic 187	b/i/b/a/c/e/a$u:a	Lb/i/b/a/c/g/s;
      //   1292: aload_2
      //   1293: invokevirtual 123	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   1296: astore 13
      //   1298: iload 7
      //   1300: istore_3
      //   1301: goto -659 -> 642
      //   1304: iload_3
      //   1305: istore 7
      //   1307: iload_3
      //   1308: sipush 256
      //   1311: iand
      //   1312: sipush 256
      //   1315: if_icmpeq +30 -> 1345
      //   1318: iload_3
      //   1319: istore 4
      //   1321: iload_3
      //   1322: istore 5
      //   1324: iload_3
      //   1325: istore 6
      //   1327: aload_0
      //   1328: new 138	java/util/ArrayList
      //   1331: dup
      //   1332: invokespecial 139	java/util/ArrayList:<init>	()V
      //   1335: putfield 189	b/i/b/a/c/e/a$c:j	Ljava/util/List;
      //   1338: iload_3
      //   1339: sipush 256
      //   1342: ior
      //   1343: istore 7
      //   1345: iload 7
      //   1347: istore 4
      //   1349: iload 7
      //   1351: istore 5
      //   1353: iload 7
      //   1355: istore 6
      //   1357: aload_0
      //   1358: getfield 189	b/i/b/a/c/e/a$c:j	Ljava/util/List;
      //   1361: astore 12
      //   1363: iload 7
      //   1365: istore 4
      //   1367: iload 7
      //   1369: istore 5
      //   1371: iload 7
      //   1373: istore 6
      //   1375: aload_1
      //   1376: getstatic 192	b/i/b/a/c/e/a$o:a	Lb/i/b/a/c/g/s;
      //   1379: aload_2
      //   1380: invokevirtual 123	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   1383: astore 13
      //   1385: iload 7
      //   1387: istore_3
      //   1388: goto -746 -> 642
      //   1391: iload_3
      //   1392: istore 7
      //   1394: iload_3
      //   1395: sipush 128
      //   1398: iand
      //   1399: sipush 128
      //   1402: if_icmpeq +30 -> 1432
      //   1405: iload_3
      //   1406: istore 4
      //   1408: iload_3
      //   1409: istore 5
      //   1411: iload_3
      //   1412: istore 6
      //   1414: aload_0
      //   1415: new 138	java/util/ArrayList
      //   1418: dup
      //   1419: invokespecial 139	java/util/ArrayList:<init>	()V
      //   1422: putfield 194	b/i/b/a/c/e/a$c:i	Ljava/util/List;
      //   1425: iload_3
      //   1426: sipush 128
      //   1429: ior
      //   1430: istore 7
      //   1432: iload 7
      //   1434: istore 4
      //   1436: iload 7
      //   1438: istore 5
      //   1440: iload 7
      //   1442: istore 6
      //   1444: aload_0
      //   1445: getfield 194	b/i/b/a/c/e/a$c:i	Ljava/util/List;
      //   1448: astore 12
      //   1450: iload 7
      //   1452: istore 4
      //   1454: iload 7
      //   1456: istore 5
      //   1458: iload 7
      //   1460: istore 6
      //   1462: aload_1
      //   1463: getstatic 197	b/i/b/a/c/e/a$e:a	Lb/i/b/a/c/g/s;
      //   1466: aload_2
      //   1467: invokevirtual 123	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   1470: astore 13
      //   1472: iload 7
      //   1474: istore_3
      //   1475: goto -833 -> 642
      //   1478: iload_3
      //   1479: istore 4
      //   1481: iload_3
      //   1482: istore 5
      //   1484: iload_3
      //   1485: istore 6
      //   1487: aload_1
      //   1488: aload_1
      //   1489: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   1492: invokevirtual 134	b/i/b/a/c/g/e:b	(I)I
      //   1495: istore 10
      //   1497: iload_3
      //   1498: istore 7
      //   1500: iload_3
      //   1501: bipush 64
      //   1503: iand
      //   1504: bipush 64
      //   1506: if_icmpeq +48 -> 1554
      //   1509: iload_3
      //   1510: istore 7
      //   1512: iload_3
      //   1513: istore 4
      //   1515: iload_3
      //   1516: istore 5
      //   1518: iload_3
      //   1519: istore 6
      //   1521: aload_1
      //   1522: invokevirtual 136	b/i/b/a/c/g/e:h	()I
      //   1525: ifle +29 -> 1554
      //   1528: iload_3
      //   1529: istore 4
      //   1531: iload_3
      //   1532: istore 5
      //   1534: iload_3
      //   1535: istore 6
      //   1537: aload_0
      //   1538: new 138	java/util/ArrayList
      //   1541: dup
      //   1542: invokespecial 139	java/util/ArrayList:<init>	()V
      //   1545: putfield 199	b/i/b/a/c/e/a$c:h	Ljava/util/List;
      //   1548: iload_3
      //   1549: bipush 64
      //   1551: ior
      //   1552: istore 7
      //   1554: iload 10
      //   1556: istore 8
      //   1558: iload 7
      //   1560: istore_3
      //   1561: iload 7
      //   1563: istore 4
      //   1565: iload 7
      //   1567: istore 5
      //   1569: iload 7
      //   1571: istore 6
      //   1573: aload_1
      //   1574: invokevirtual 136	b/i/b/a/c/g/e:h	()I
      //   1577: ifle -641 -> 936
      //   1580: iload 7
      //   1582: istore 4
      //   1584: iload 7
      //   1586: istore 5
      //   1588: iload 7
      //   1590: istore 6
      //   1592: aload_0
      //   1593: getfield 199	b/i/b/a/c/e/a$c:h	Ljava/util/List;
      //   1596: aload_1
      //   1597: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   1600: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1603: invokeinterface 153 2 0
      //   1608: pop
      //   1609: goto -55 -> 1554
      //   1612: iload_3
      //   1613: istore 7
      //   1615: iload_3
      //   1616: bipush 64
      //   1618: iand
      //   1619: bipush 64
      //   1621: if_icmpeq +29 -> 1650
      //   1624: iload_3
      //   1625: istore 4
      //   1627: iload_3
      //   1628: istore 5
      //   1630: iload_3
      //   1631: istore 6
      //   1633: aload_0
      //   1634: new 138	java/util/ArrayList
      //   1637: dup
      //   1638: invokespecial 139	java/util/ArrayList:<init>	()V
      //   1641: putfield 199	b/i/b/a/c/e/a$c:h	Ljava/util/List;
      //   1644: iload_3
      //   1645: bipush 64
      //   1647: ior
      //   1648: istore 7
      //   1650: iload 7
      //   1652: istore 4
      //   1654: iload 7
      //   1656: istore 5
      //   1658: iload 7
      //   1660: istore 6
      //   1662: aload_0
      //   1663: getfield 199	b/i/b/a/c/e/a$c:h	Ljava/util/List;
      //   1666: astore 12
      //   1668: iload 7
      //   1670: istore 4
      //   1672: iload 7
      //   1674: istore 5
      //   1676: iload 7
      //   1678: istore 6
      //   1680: aload_1
      //   1681: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   1684: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1687: astore 13
      //   1689: iload 7
      //   1691: istore_3
      //   1692: goto -1050 -> 642
      //   1695: iload_3
      //   1696: istore 7
      //   1698: iload_3
      //   1699: bipush 16
      //   1701: iand
      //   1702: bipush 16
      //   1704: if_icmpeq +29 -> 1733
      //   1707: iload_3
      //   1708: istore 4
      //   1710: iload_3
      //   1711: istore 5
      //   1713: iload_3
      //   1714: istore 6
      //   1716: aload_0
      //   1717: new 138	java/util/ArrayList
      //   1720: dup
      //   1721: invokespecial 139	java/util/ArrayList:<init>	()V
      //   1724: putfield 201	b/i/b/a/c/e/a$c:f	Ljava/util/List;
      //   1727: iload_3
      //   1728: bipush 16
      //   1730: ior
      //   1731: istore 7
      //   1733: iload 7
      //   1735: istore 4
      //   1737: iload 7
      //   1739: istore 5
      //   1741: iload 7
      //   1743: istore 6
      //   1745: aload_0
      //   1746: getfield 201	b/i/b/a/c/e/a$c:f	Ljava/util/List;
      //   1749: astore 12
      //   1751: iload 7
      //   1753: istore 4
      //   1755: iload 7
      //   1757: istore 5
      //   1759: iload 7
      //   1761: istore 6
      //   1763: aload_1
      //   1764: getstatic 204	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   1767: aload_2
      //   1768: invokevirtual 123	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   1771: astore 13
      //   1773: iload 7
      //   1775: istore_3
      //   1776: goto -1134 -> 642
      //   1779: iload_3
      //   1780: istore 7
      //   1782: iload_3
      //   1783: bipush 8
      //   1785: iand
      //   1786: bipush 8
      //   1788: if_icmpeq +29 -> 1817
      //   1791: iload_3
      //   1792: istore 4
      //   1794: iload_3
      //   1795: istore 5
      //   1797: iload_3
      //   1798: istore 6
      //   1800: aload_0
      //   1801: new 138	java/util/ArrayList
      //   1804: dup
      //   1805: invokespecial 139	java/util/ArrayList:<init>	()V
      //   1808: putfield 206	b/i/b/a/c/e/a$c:e	Ljava/util/List;
      //   1811: iload_3
      //   1812: bipush 8
      //   1814: ior
      //   1815: istore 7
      //   1817: iload 7
      //   1819: istore 4
      //   1821: iload 7
      //   1823: istore 5
      //   1825: iload 7
      //   1827: istore 6
      //   1829: aload_0
      //   1830: getfield 206	b/i/b/a/c/e/a$c:e	Ljava/util/List;
      //   1833: astore 12
      //   1835: iload 7
      //   1837: istore 4
      //   1839: iload 7
      //   1841: istore 5
      //   1843: iload 7
      //   1845: istore 6
      //   1847: aload_1
      //   1848: getstatic 209	b/i/b/a/c/e/a$ae:a	Lb/i/b/a/c/g/s;
      //   1851: aload_2
      //   1852: invokevirtual 123	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   1855: astore 13
      //   1857: iload 7
      //   1859: istore_3
      //   1860: goto -1218 -> 642
      //   1863: iload_3
      //   1864: istore 4
      //   1866: iload_3
      //   1867: istore 5
      //   1869: iload_3
      //   1870: istore 6
      //   1872: aload_0
      //   1873: aload_0
      //   1874: getfield 112	b/i/b/a/c/e/a$c:v	I
      //   1877: iconst_4
      //   1878: ior
      //   1879: putfield 112	b/i/b/a/c/e/a$c:v	I
      //   1882: iload_3
      //   1883: istore 4
      //   1885: iload_3
      //   1886: istore 5
      //   1888: iload_3
      //   1889: istore 6
      //   1891: aload_0
      //   1892: aload_1
      //   1893: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   1896: putfield 211	b/i/b/a/c/e/a$c:d	I
      //   1899: goto +941 -> 2840
      //   1902: iload_3
      //   1903: istore 4
      //   1905: iload_3
      //   1906: istore 5
      //   1908: iload_3
      //   1909: istore 6
      //   1911: aload_0
      //   1912: aload_0
      //   1913: getfield 112	b/i/b/a/c/e/a$c:v	I
      //   1916: iconst_2
      //   1917: ior
      //   1918: putfield 112	b/i/b/a/c/e/a$c:v	I
      //   1921: iload_3
      //   1922: istore 4
      //   1924: iload_3
      //   1925: istore 5
      //   1927: iload_3
      //   1928: istore 6
      //   1930: aload_0
      //   1931: aload_1
      //   1932: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   1935: putfield 213	b/i/b/a/c/e/a$c:c	I
      //   1938: goto +902 -> 2840
      //   1941: iload_3
      //   1942: istore 4
      //   1944: iload_3
      //   1945: istore 5
      //   1947: iload_3
      //   1948: istore 6
      //   1950: aload_1
      //   1951: aload_1
      //   1952: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   1955: invokevirtual 134	b/i/b/a/c/g/e:b	(I)I
      //   1958: istore 10
      //   1960: iload_3
      //   1961: istore 7
      //   1963: iload_3
      //   1964: bipush 32
      //   1966: iand
      //   1967: bipush 32
      //   1969: if_icmpeq +48 -> 2017
      //   1972: iload_3
      //   1973: istore 7
      //   1975: iload_3
      //   1976: istore 4
      //   1978: iload_3
      //   1979: istore 5
      //   1981: iload_3
      //   1982: istore 6
      //   1984: aload_1
      //   1985: invokevirtual 136	b/i/b/a/c/g/e:h	()I
      //   1988: ifle +29 -> 2017
      //   1991: iload_3
      //   1992: istore 4
      //   1994: iload_3
      //   1995: istore 5
      //   1997: iload_3
      //   1998: istore 6
      //   2000: aload_0
      //   2001: new 138	java/util/ArrayList
      //   2004: dup
      //   2005: invokespecial 139	java/util/ArrayList:<init>	()V
      //   2008: putfield 215	b/i/b/a/c/e/a$c:g	Ljava/util/List;
      //   2011: iload_3
      //   2012: bipush 32
      //   2014: ior
      //   2015: istore 7
      //   2017: iload 10
      //   2019: istore 8
      //   2021: iload 7
      //   2023: istore_3
      //   2024: iload 7
      //   2026: istore 4
      //   2028: iload 7
      //   2030: istore 5
      //   2032: iload 7
      //   2034: istore 6
      //   2036: aload_1
      //   2037: invokevirtual 136	b/i/b/a/c/g/e:h	()I
      //   2040: ifle -1104 -> 936
      //   2043: iload 7
      //   2045: istore 4
      //   2047: iload 7
      //   2049: istore 5
      //   2051: iload 7
      //   2053: istore 6
      //   2055: aload_0
      //   2056: getfield 215	b/i/b/a/c/e/a$c:g	Ljava/util/List;
      //   2059: aload_1
      //   2060: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   2063: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   2066: invokeinterface 153 2 0
      //   2071: pop
      //   2072: goto -55 -> 2017
      //   2075: iload_3
      //   2076: istore 7
      //   2078: iload_3
      //   2079: bipush 32
      //   2081: iand
      //   2082: bipush 32
      //   2084: if_icmpeq +29 -> 2113
      //   2087: iload_3
      //   2088: istore 4
      //   2090: iload_3
      //   2091: istore 5
      //   2093: iload_3
      //   2094: istore 6
      //   2096: aload_0
      //   2097: new 138	java/util/ArrayList
      //   2100: dup
      //   2101: invokespecial 139	java/util/ArrayList:<init>	()V
      //   2104: putfield 215	b/i/b/a/c/e/a$c:g	Ljava/util/List;
      //   2107: iload_3
      //   2108: bipush 32
      //   2110: ior
      //   2111: istore 7
      //   2113: iload 7
      //   2115: istore 4
      //   2117: iload 7
      //   2119: istore 5
      //   2121: iload 7
      //   2123: istore 6
      //   2125: aload_0
      //   2126: getfield 215	b/i/b/a/c/e/a$c:g	Ljava/util/List;
      //   2129: astore 12
      //   2131: iload 7
      //   2133: istore 4
      //   2135: iload 7
      //   2137: istore 5
      //   2139: iload 7
      //   2141: istore 6
      //   2143: aload_1
      //   2144: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   2147: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   2150: astore 13
      //   2152: iload 7
      //   2154: istore_3
      //   2155: goto -1513 -> 642
      //   2158: iload_3
      //   2159: istore 4
      //   2161: iload_3
      //   2162: istore 5
      //   2164: iload_3
      //   2165: istore 6
      //   2167: aload_0
      //   2168: aload_0
      //   2169: getfield 112	b/i/b/a/c/e/a$c:v	I
      //   2172: iconst_1
      //   2173: ior
      //   2174: putfield 112	b/i/b/a/c/e/a$c:v	I
      //   2177: iload_3
      //   2178: istore 4
      //   2180: iload_3
      //   2181: istore 5
      //   2183: iload_3
      //   2184: istore 6
      //   2186: aload_0
      //   2187: aload_1
      //   2188: invokevirtual 131	b/i/b/a/c/g/e:d	()I
      //   2191: putfield 217	b/i/b/a/c/e/a$c:b	I
      //   2194: iload_3
      //   2195: istore 7
      //   2197: goto +20 -> 2217
      //   2200: iconst_1
      //   2201: istore 9
      //   2203: goto -2152 -> 51
      //   2206: iload_3
      //   2207: istore 7
      //   2209: iload 11
      //   2211: ifne +6 -> 2217
      //   2214: goto -14 -> 2200
      //   2217: iload 7
      //   2219: istore_3
      //   2220: goto -2169 -> 51
      //   2223: astore_1
      //   2224: goto +51 -> 2275
      //   2227: astore_1
      //   2228: iload 5
      //   2230: istore 4
      //   2232: new 92	b/i/b/a/c/g/k
      //   2235: dup
      //   2236: aload_1
      //   2237: invokevirtual 221	java/io/IOException:getMessage	()Ljava/lang/String;
      //   2240: invokespecial 224	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   2243: astore_1
      //   2244: iload 5
      //   2246: istore 4
      //   2248: aload_1
      //   2249: aload_0
      //   2250: putfield 227	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   2253: iload 5
      //   2255: istore 4
      //   2257: aload_1
      //   2258: athrow
      //   2259: astore_1
      //   2260: iload 6
      //   2262: istore 4
      //   2264: aload_1
      //   2265: aload_0
      //   2266: putfield 227	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   2269: iload 6
      //   2271: istore 4
      //   2273: aload_1
      //   2274: athrow
      //   2275: iload 4
      //   2277: bipush 32
      //   2279: iand
      //   2280: bipush 32
      //   2282: if_icmpne +14 -> 2296
      //   2285: aload_0
      //   2286: aload_0
      //   2287: getfield 215	b/i/b/a/c/e/a$c:g	Ljava/util/List;
      //   2290: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2293: putfield 215	b/i/b/a/c/e/a$c:g	Ljava/util/List;
      //   2296: iload 4
      //   2298: bipush 8
      //   2300: iand
      //   2301: bipush 8
      //   2303: if_icmpne +14 -> 2317
      //   2306: aload_0
      //   2307: aload_0
      //   2308: getfield 206	b/i/b/a/c/e/a$c:e	Ljava/util/List;
      //   2311: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2314: putfield 206	b/i/b/a/c/e/a$c:e	Ljava/util/List;
      //   2317: iload 4
      //   2319: bipush 16
      //   2321: iand
      //   2322: bipush 16
      //   2324: if_icmpne +14 -> 2338
      //   2327: aload_0
      //   2328: aload_0
      //   2329: getfield 201	b/i/b/a/c/e/a$c:f	Ljava/util/List;
      //   2332: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2335: putfield 201	b/i/b/a/c/e/a$c:f	Ljava/util/List;
      //   2338: iload 4
      //   2340: bipush 64
      //   2342: iand
      //   2343: bipush 64
      //   2345: if_icmpne +14 -> 2359
      //   2348: aload_0
      //   2349: aload_0
      //   2350: getfield 199	b/i/b/a/c/e/a$c:h	Ljava/util/List;
      //   2353: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2356: putfield 199	b/i/b/a/c/e/a$c:h	Ljava/util/List;
      //   2359: iload 4
      //   2361: sipush 128
      //   2364: iand
      //   2365: sipush 128
      //   2368: if_icmpne +14 -> 2382
      //   2371: aload_0
      //   2372: aload_0
      //   2373: getfield 194	b/i/b/a/c/e/a$c:i	Ljava/util/List;
      //   2376: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2379: putfield 194	b/i/b/a/c/e/a$c:i	Ljava/util/List;
      //   2382: iload 4
      //   2384: sipush 256
      //   2387: iand
      //   2388: sipush 256
      //   2391: if_icmpne +14 -> 2405
      //   2394: aload_0
      //   2395: aload_0
      //   2396: getfield 189	b/i/b/a/c/e/a$c:j	Ljava/util/List;
      //   2399: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2402: putfield 189	b/i/b/a/c/e/a$c:j	Ljava/util/List;
      //   2405: iload 4
      //   2407: sipush 512
      //   2410: iand
      //   2411: sipush 512
      //   2414: if_icmpne +14 -> 2428
      //   2417: aload_0
      //   2418: aload_0
      //   2419: getfield 184	b/i/b/a/c/e/a$c:k	Ljava/util/List;
      //   2422: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2425: putfield 184	b/i/b/a/c/e/a$c:k	Ljava/util/List;
      //   2428: iload 4
      //   2430: sipush 1024
      //   2433: iand
      //   2434: sipush 1024
      //   2437: if_icmpne +14 -> 2451
      //   2440: aload_0
      //   2441: aload_0
      //   2442: getfield 179	b/i/b/a/c/e/a$c:l	Ljava/util/List;
      //   2445: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2448: putfield 179	b/i/b/a/c/e/a$c:l	Ljava/util/List;
      //   2451: iload 4
      //   2453: sipush 2048
      //   2456: iand
      //   2457: sipush 2048
      //   2460: if_icmpne +14 -> 2474
      //   2463: aload_0
      //   2464: aload_0
      //   2465: getfield 174	b/i/b/a/c/e/a$c:m	Ljava/util/List;
      //   2468: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2471: putfield 174	b/i/b/a/c/e/a$c:m	Ljava/util/List;
      //   2474: iload 4
      //   2476: sipush 4096
      //   2479: iand
      //   2480: sipush 4096
      //   2483: if_icmpne +14 -> 2497
      //   2486: aload_0
      //   2487: aload_0
      //   2488: getfield 172	b/i/b/a/c/e/a$c:n	Ljava/util/List;
      //   2491: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2494: putfield 172	b/i/b/a/c/e/a$c:n	Ljava/util/List;
      //   2497: iload 4
      //   2499: sipush 16384
      //   2502: iand
      //   2503: sipush 16384
      //   2506: if_icmpne +14 -> 2520
      //   2509: aload_0
      //   2510: aload_0
      //   2511: getfield 141	b/i/b/a/c/e/a$c:p	Ljava/util/List;
      //   2514: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2517: putfield 141	b/i/b/a/c/e/a$c:p	Ljava/util/List;
      //   2520: aload 15
      //   2522: invokevirtual 235	b/i/b/a/c/g/f:a	()V
      //   2525: aload_0
      //   2526: aload 14
      //   2528: invokevirtual 240	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   2531: putfield 89	b/i/b/a/c/e/a$c:u	Lb/i/b/a/c/g/d;
      //   2534: goto +15 -> 2549
      //   2537: astore_1
      //   2538: aload_0
      //   2539: aload 14
      //   2541: invokevirtual 240	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   2544: putfield 89	b/i/b/a/c/e/a$c:u	Lb/i/b/a/c/g/d;
      //   2547: aload_1
      //   2548: athrow
      //   2549: aload_0
      //   2550: getfield 244	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   2553: invokevirtual 248	b/i/b/a/c/g/h:c	()V
      //   2556: aload_1
      //   2557: athrow
      //   2558: iload_3
      //   2559: bipush 32
      //   2561: iand
      //   2562: bipush 32
      //   2564: if_icmpne +14 -> 2578
      //   2567: aload_0
      //   2568: aload_0
      //   2569: getfield 215	b/i/b/a/c/e/a$c:g	Ljava/util/List;
      //   2572: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2575: putfield 215	b/i/b/a/c/e/a$c:g	Ljava/util/List;
      //   2578: iload_3
      //   2579: bipush 8
      //   2581: iand
      //   2582: bipush 8
      //   2584: if_icmpne +14 -> 2598
      //   2587: aload_0
      //   2588: aload_0
      //   2589: getfield 206	b/i/b/a/c/e/a$c:e	Ljava/util/List;
      //   2592: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2595: putfield 206	b/i/b/a/c/e/a$c:e	Ljava/util/List;
      //   2598: iload_3
      //   2599: bipush 16
      //   2601: iand
      //   2602: bipush 16
      //   2604: if_icmpne +14 -> 2618
      //   2607: aload_0
      //   2608: aload_0
      //   2609: getfield 201	b/i/b/a/c/e/a$c:f	Ljava/util/List;
      //   2612: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2615: putfield 201	b/i/b/a/c/e/a$c:f	Ljava/util/List;
      //   2618: iload_3
      //   2619: bipush 64
      //   2621: iand
      //   2622: bipush 64
      //   2624: if_icmpne +14 -> 2638
      //   2627: aload_0
      //   2628: aload_0
      //   2629: getfield 199	b/i/b/a/c/e/a$c:h	Ljava/util/List;
      //   2632: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2635: putfield 199	b/i/b/a/c/e/a$c:h	Ljava/util/List;
      //   2638: iload_3
      //   2639: sipush 128
      //   2642: iand
      //   2643: sipush 128
      //   2646: if_icmpne +14 -> 2660
      //   2649: aload_0
      //   2650: aload_0
      //   2651: getfield 194	b/i/b/a/c/e/a$c:i	Ljava/util/List;
      //   2654: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2657: putfield 194	b/i/b/a/c/e/a$c:i	Ljava/util/List;
      //   2660: iload_3
      //   2661: sipush 256
      //   2664: iand
      //   2665: sipush 256
      //   2668: if_icmpne +14 -> 2682
      //   2671: aload_0
      //   2672: aload_0
      //   2673: getfield 189	b/i/b/a/c/e/a$c:j	Ljava/util/List;
      //   2676: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2679: putfield 189	b/i/b/a/c/e/a$c:j	Ljava/util/List;
      //   2682: iload_3
      //   2683: sipush 512
      //   2686: iand
      //   2687: sipush 512
      //   2690: if_icmpne +14 -> 2704
      //   2693: aload_0
      //   2694: aload_0
      //   2695: getfield 184	b/i/b/a/c/e/a$c:k	Ljava/util/List;
      //   2698: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2701: putfield 184	b/i/b/a/c/e/a$c:k	Ljava/util/List;
      //   2704: iload_3
      //   2705: sipush 1024
      //   2708: iand
      //   2709: sipush 1024
      //   2712: if_icmpne +14 -> 2726
      //   2715: aload_0
      //   2716: aload_0
      //   2717: getfield 179	b/i/b/a/c/e/a$c:l	Ljava/util/List;
      //   2720: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2723: putfield 179	b/i/b/a/c/e/a$c:l	Ljava/util/List;
      //   2726: iload_3
      //   2727: sipush 2048
      //   2730: iand
      //   2731: sipush 2048
      //   2734: if_icmpne +14 -> 2748
      //   2737: aload_0
      //   2738: aload_0
      //   2739: getfield 174	b/i/b/a/c/e/a$c:m	Ljava/util/List;
      //   2742: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2745: putfield 174	b/i/b/a/c/e/a$c:m	Ljava/util/List;
      //   2748: iload_3
      //   2749: sipush 4096
      //   2752: iand
      //   2753: sipush 4096
      //   2756: if_icmpne +14 -> 2770
      //   2759: aload_0
      //   2760: aload_0
      //   2761: getfield 172	b/i/b/a/c/e/a$c:n	Ljava/util/List;
      //   2764: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2767: putfield 172	b/i/b/a/c/e/a$c:n	Ljava/util/List;
      //   2770: iload_3
      //   2771: sipush 16384
      //   2774: iand
      //   2775: sipush 16384
      //   2778: if_icmpne +14 -> 2792
      //   2781: aload_0
      //   2782: aload_0
      //   2783: getfield 141	b/i/b/a/c/e/a$c:p	Ljava/util/List;
      //   2786: invokestatic 233	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   2789: putfield 141	b/i/b/a/c/e/a$c:p	Ljava/util/List;
      //   2792: aload 15
      //   2794: invokevirtual 235	b/i/b/a/c/g/f:a	()V
      //   2797: aload_0
      //   2798: aload 14
      //   2800: invokevirtual 240	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   2803: putfield 89	b/i/b/a/c/e/a$c:u	Lb/i/b/a/c/g/d;
      //   2806: goto +15 -> 2821
      //   2809: astore_1
      //   2810: aload_0
      //   2811: aload 14
      //   2813: invokevirtual 240	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   2816: putfield 89	b/i/b/a/c/e/a$c:u	Lb/i/b/a/c/g/d;
      //   2819: aload_1
      //   2820: athrow
      //   2821: aload_0
      //   2822: getfield 244	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   2825: invokevirtual 248	b/i/b/a/c/g/h:c	()V
      //   2828: return
      //   2829: astore_2
      //   2830: goto -305 -> 2525
      //   2833: astore_1
      //   2834: goto -37 -> 2797
      //   2837: goto -2581 -> 256
      //   2840: iload_3
      //   2841: istore 7
      //   2843: goto -626 -> 2217
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	2846	0	this	c
      //   0	2846	1	parame	b.i.b.a.c.g.e
      //   0	2846	2	paramg	g
      //   50	2791	3	i1	int
      //   57	2446	4	i2	int
      //   60	2194	5	i3	int
      //   63	2207	6	i4	int
      //   69	2773	7	i5	int
      //   425	1595	8	i6	int
      //   47	2155	9	i7	int
      //   816	1202	10	i8	int
      //   275	1935	11	bool	boolean
      //   75	2055	12	localObject1	Object
      //   72	2079	13	localObject2	Object
      //   36	2776	14	localb	b.i.b.a.c.g.d.b
      //   44	2749	15	localf	f
      // Exception table:
      //   from	to	target	type
      //   65	71	2223	finally
      //   265	277	2223	finally
      //   289	301	2223	finally
      //   310	319	2223	finally
      //   328	343	2223	finally
      //   357	367	2223	finally
      //   376	385	2223	finally
      //   394	405	2223	finally
      //   417	427	2223	finally
      //   453	460	2223	finally
      //   469	480	2223	finally
      //   499	506	2223	finally
      //   518	535	2223	finally
      //   550	556	2223	finally
      //   582	593	2223	finally
      //   612	618	2223	finally
      //   630	639	2223	finally
      //   651	661	2223	finally
      //   680	692	2223	finally
      //   701	710	2223	finally
      //   719	734	2223	finally
      //   748	758	2223	finally
      //   767	776	2223	finally
      //   785	796	2223	finally
      //   808	818	2223	finally
      //   844	851	2223	finally
      //   860	871	2223	finally
      //   897	904	2223	finally
      //   916	933	2223	finally
      //   945	951	2223	finally
      //   980	991	2223	finally
      //   1010	1016	2223	finally
      //   1028	1037	2223	finally
      //   1066	1077	2223	finally
      //   1096	1102	2223	finally
      //   1114	1124	2223	finally
      //   1153	1164	2223	finally
      //   1183	1189	2223	finally
      //   1201	1211	2223	finally
      //   1240	1251	2223	finally
      //   1270	1276	2223	finally
      //   1288	1298	2223	finally
      //   1327	1338	2223	finally
      //   1357	1363	2223	finally
      //   1375	1385	2223	finally
      //   1414	1425	2223	finally
      //   1444	1450	2223	finally
      //   1462	1472	2223	finally
      //   1487	1497	2223	finally
      //   1521	1528	2223	finally
      //   1537	1548	2223	finally
      //   1573	1580	2223	finally
      //   1592	1609	2223	finally
      //   1633	1644	2223	finally
      //   1662	1668	2223	finally
      //   1680	1689	2223	finally
      //   1716	1727	2223	finally
      //   1745	1751	2223	finally
      //   1763	1773	2223	finally
      //   1800	1811	2223	finally
      //   1829	1835	2223	finally
      //   1847	1857	2223	finally
      //   1872	1882	2223	finally
      //   1891	1899	2223	finally
      //   1911	1921	2223	finally
      //   1930	1938	2223	finally
      //   1950	1960	2223	finally
      //   1984	1991	2223	finally
      //   2000	2011	2223	finally
      //   2036	2043	2223	finally
      //   2055	2072	2223	finally
      //   2096	2107	2223	finally
      //   2125	2131	2223	finally
      //   2143	2152	2223	finally
      //   2167	2177	2223	finally
      //   2186	2194	2223	finally
      //   2232	2244	2223	finally
      //   2248	2253	2223	finally
      //   2257	2259	2223	finally
      //   2264	2269	2223	finally
      //   2273	2275	2223	finally
      //   65	71	2227	java/io/IOException
      //   265	277	2227	java/io/IOException
      //   289	301	2227	java/io/IOException
      //   310	319	2227	java/io/IOException
      //   328	343	2227	java/io/IOException
      //   357	367	2227	java/io/IOException
      //   376	385	2227	java/io/IOException
      //   394	405	2227	java/io/IOException
      //   417	427	2227	java/io/IOException
      //   453	460	2227	java/io/IOException
      //   469	480	2227	java/io/IOException
      //   499	506	2227	java/io/IOException
      //   518	535	2227	java/io/IOException
      //   550	556	2227	java/io/IOException
      //   582	593	2227	java/io/IOException
      //   612	618	2227	java/io/IOException
      //   630	639	2227	java/io/IOException
      //   651	661	2227	java/io/IOException
      //   680	692	2227	java/io/IOException
      //   701	710	2227	java/io/IOException
      //   719	734	2227	java/io/IOException
      //   748	758	2227	java/io/IOException
      //   767	776	2227	java/io/IOException
      //   785	796	2227	java/io/IOException
      //   808	818	2227	java/io/IOException
      //   844	851	2227	java/io/IOException
      //   860	871	2227	java/io/IOException
      //   897	904	2227	java/io/IOException
      //   916	933	2227	java/io/IOException
      //   945	951	2227	java/io/IOException
      //   980	991	2227	java/io/IOException
      //   1010	1016	2227	java/io/IOException
      //   1028	1037	2227	java/io/IOException
      //   1066	1077	2227	java/io/IOException
      //   1096	1102	2227	java/io/IOException
      //   1114	1124	2227	java/io/IOException
      //   1153	1164	2227	java/io/IOException
      //   1183	1189	2227	java/io/IOException
      //   1201	1211	2227	java/io/IOException
      //   1240	1251	2227	java/io/IOException
      //   1270	1276	2227	java/io/IOException
      //   1288	1298	2227	java/io/IOException
      //   1327	1338	2227	java/io/IOException
      //   1357	1363	2227	java/io/IOException
      //   1375	1385	2227	java/io/IOException
      //   1414	1425	2227	java/io/IOException
      //   1444	1450	2227	java/io/IOException
      //   1462	1472	2227	java/io/IOException
      //   1487	1497	2227	java/io/IOException
      //   1521	1528	2227	java/io/IOException
      //   1537	1548	2227	java/io/IOException
      //   1573	1580	2227	java/io/IOException
      //   1592	1609	2227	java/io/IOException
      //   1633	1644	2227	java/io/IOException
      //   1662	1668	2227	java/io/IOException
      //   1680	1689	2227	java/io/IOException
      //   1716	1727	2227	java/io/IOException
      //   1745	1751	2227	java/io/IOException
      //   1763	1773	2227	java/io/IOException
      //   1800	1811	2227	java/io/IOException
      //   1829	1835	2227	java/io/IOException
      //   1847	1857	2227	java/io/IOException
      //   1872	1882	2227	java/io/IOException
      //   1891	1899	2227	java/io/IOException
      //   1911	1921	2227	java/io/IOException
      //   1930	1938	2227	java/io/IOException
      //   1950	1960	2227	java/io/IOException
      //   1984	1991	2227	java/io/IOException
      //   2000	2011	2227	java/io/IOException
      //   2036	2043	2227	java/io/IOException
      //   2055	2072	2227	java/io/IOException
      //   2096	2107	2227	java/io/IOException
      //   2125	2131	2227	java/io/IOException
      //   2143	2152	2227	java/io/IOException
      //   2167	2177	2227	java/io/IOException
      //   2186	2194	2227	java/io/IOException
      //   65	71	2259	b/i/b/a/c/g/k
      //   265	277	2259	b/i/b/a/c/g/k
      //   289	301	2259	b/i/b/a/c/g/k
      //   310	319	2259	b/i/b/a/c/g/k
      //   328	343	2259	b/i/b/a/c/g/k
      //   357	367	2259	b/i/b/a/c/g/k
      //   376	385	2259	b/i/b/a/c/g/k
      //   394	405	2259	b/i/b/a/c/g/k
      //   417	427	2259	b/i/b/a/c/g/k
      //   453	460	2259	b/i/b/a/c/g/k
      //   469	480	2259	b/i/b/a/c/g/k
      //   499	506	2259	b/i/b/a/c/g/k
      //   518	535	2259	b/i/b/a/c/g/k
      //   550	556	2259	b/i/b/a/c/g/k
      //   582	593	2259	b/i/b/a/c/g/k
      //   612	618	2259	b/i/b/a/c/g/k
      //   630	639	2259	b/i/b/a/c/g/k
      //   651	661	2259	b/i/b/a/c/g/k
      //   680	692	2259	b/i/b/a/c/g/k
      //   701	710	2259	b/i/b/a/c/g/k
      //   719	734	2259	b/i/b/a/c/g/k
      //   748	758	2259	b/i/b/a/c/g/k
      //   767	776	2259	b/i/b/a/c/g/k
      //   785	796	2259	b/i/b/a/c/g/k
      //   808	818	2259	b/i/b/a/c/g/k
      //   844	851	2259	b/i/b/a/c/g/k
      //   860	871	2259	b/i/b/a/c/g/k
      //   897	904	2259	b/i/b/a/c/g/k
      //   916	933	2259	b/i/b/a/c/g/k
      //   945	951	2259	b/i/b/a/c/g/k
      //   980	991	2259	b/i/b/a/c/g/k
      //   1010	1016	2259	b/i/b/a/c/g/k
      //   1028	1037	2259	b/i/b/a/c/g/k
      //   1066	1077	2259	b/i/b/a/c/g/k
      //   1096	1102	2259	b/i/b/a/c/g/k
      //   1114	1124	2259	b/i/b/a/c/g/k
      //   1153	1164	2259	b/i/b/a/c/g/k
      //   1183	1189	2259	b/i/b/a/c/g/k
      //   1201	1211	2259	b/i/b/a/c/g/k
      //   1240	1251	2259	b/i/b/a/c/g/k
      //   1270	1276	2259	b/i/b/a/c/g/k
      //   1288	1298	2259	b/i/b/a/c/g/k
      //   1327	1338	2259	b/i/b/a/c/g/k
      //   1357	1363	2259	b/i/b/a/c/g/k
      //   1375	1385	2259	b/i/b/a/c/g/k
      //   1414	1425	2259	b/i/b/a/c/g/k
      //   1444	1450	2259	b/i/b/a/c/g/k
      //   1462	1472	2259	b/i/b/a/c/g/k
      //   1487	1497	2259	b/i/b/a/c/g/k
      //   1521	1528	2259	b/i/b/a/c/g/k
      //   1537	1548	2259	b/i/b/a/c/g/k
      //   1573	1580	2259	b/i/b/a/c/g/k
      //   1592	1609	2259	b/i/b/a/c/g/k
      //   1633	1644	2259	b/i/b/a/c/g/k
      //   1662	1668	2259	b/i/b/a/c/g/k
      //   1680	1689	2259	b/i/b/a/c/g/k
      //   1716	1727	2259	b/i/b/a/c/g/k
      //   1745	1751	2259	b/i/b/a/c/g/k
      //   1763	1773	2259	b/i/b/a/c/g/k
      //   1800	1811	2259	b/i/b/a/c/g/k
      //   1829	1835	2259	b/i/b/a/c/g/k
      //   1847	1857	2259	b/i/b/a/c/g/k
      //   1872	1882	2259	b/i/b/a/c/g/k
      //   1891	1899	2259	b/i/b/a/c/g/k
      //   1911	1921	2259	b/i/b/a/c/g/k
      //   1930	1938	2259	b/i/b/a/c/g/k
      //   1950	1960	2259	b/i/b/a/c/g/k
      //   1984	1991	2259	b/i/b/a/c/g/k
      //   2000	2011	2259	b/i/b/a/c/g/k
      //   2036	2043	2259	b/i/b/a/c/g/k
      //   2055	2072	2259	b/i/b/a/c/g/k
      //   2096	2107	2259	b/i/b/a/c/g/k
      //   2125	2131	2259	b/i/b/a/c/g/k
      //   2143	2152	2259	b/i/b/a/c/g/k
      //   2167	2177	2259	b/i/b/a/c/g/k
      //   2186	2194	2259	b/i/b/a/c/g/k
      //   2520	2525	2537	finally
      //   2792	2797	2809	finally
      //   2520	2525	2829	java/io/IOException
      //   2792	2797	2833	java/io/IOException
    }
    
    private c(i.b<c, ?> paramb)
    {
      super();
      this.u = paramb.a;
    }
    
    public static c a()
    {
      return t;
    }
    
    public static c a(InputStream paramInputStream, g paramg)
      throws IOException
    {
      return (c)a.b(paramInputStream, paramg);
    }
    
    private void m()
    {
      this.b = 6;
      this.c = 0;
      this.d = 0;
      this.e = Collections.emptyList();
      this.f = Collections.emptyList();
      this.g = Collections.emptyList();
      this.h = Collections.emptyList();
      this.i = Collections.emptyList();
      this.j = Collections.emptyList();
      this.k = Collections.emptyList();
      this.l = Collections.emptyList();
      this.m = Collections.emptyList();
      this.n = Collections.emptyList();
      this.o = a.ag.a();
      this.p = Collections.emptyList();
      this.q = a.am.a();
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      i.c.a locala = x();
      if ((this.v & 0x1) == 1) {
        paramf.a(1, this.b);
      }
      if (this.g.size() > 0)
      {
        paramf.e(18);
        paramf.e(this.w);
      }
      int i2 = 0;
      int i1 = 0;
      while (i1 < this.g.size())
      {
        paramf.a(((Integer)this.g.get(i1)).intValue());
        i1 += 1;
      }
      if ((this.v & 0x2) == 2) {
        paramf.a(3, this.c);
      }
      if ((this.v & 0x4) == 4) {
        paramf.a(4, this.d);
      }
      i1 = 0;
      while (i1 < this.e.size())
      {
        paramf.a(5, (q)this.e.get(i1));
        i1 += 1;
      }
      i1 = 0;
      while (i1 < this.f.size())
      {
        paramf.a(6, (q)this.f.get(i1));
        i1 += 1;
      }
      if (this.h.size() > 0)
      {
        paramf.e(58);
        paramf.e(this.x);
      }
      i1 = 0;
      while (i1 < this.h.size())
      {
        paramf.a(((Integer)this.h.get(i1)).intValue());
        i1 += 1;
      }
      i1 = 0;
      while (i1 < this.i.size())
      {
        paramf.a(8, (q)this.i.get(i1));
        i1 += 1;
      }
      i1 = 0;
      while (i1 < this.j.size())
      {
        paramf.a(9, (q)this.j.get(i1));
        i1 += 1;
      }
      i1 = 0;
      while (i1 < this.k.size())
      {
        paramf.a(10, (q)this.k.get(i1));
        i1 += 1;
      }
      i1 = 0;
      while (i1 < this.l.size())
      {
        paramf.a(11, (q)this.l.get(i1));
        i1 += 1;
      }
      i1 = 0;
      while (i1 < this.m.size())
      {
        paramf.a(13, (q)this.m.get(i1));
        i1 += 1;
      }
      if (this.n.size() > 0)
      {
        paramf.e(130);
        paramf.e(this.y);
      }
      i1 = 0;
      while (i1 < this.n.size())
      {
        paramf.a(((Integer)this.n.get(i1)).intValue());
        i1 += 1;
      }
      i1 = i2;
      if ((this.v & 0x8) == 8)
      {
        paramf.a(30, this.o);
        i1 = i2;
      }
      while (i1 < this.p.size())
      {
        paramf.a(31, ((Integer)this.p.get(i1)).intValue());
        i1 += 1;
      }
      if ((this.v & 0x10) == 16) {
        paramf.a(32, this.q);
      }
      locala.a(19000, paramf);
      paramf.c(this.u);
    }
    
    public final s<c> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.v & 0x1) == 1;
    }
    
    public final boolean d()
    {
      return (this.v & 0x2) == 2;
    }
    
    public final boolean e()
    {
      int i1 = this.z;
      if (i1 == 1) {
        return true;
      }
      if (i1 == 0) {
        return false;
      }
      if (!d())
      {
        this.z = 0;
        return false;
      }
      i1 = 0;
      while (i1 < this.e.size())
      {
        if (!((a.ae)this.e.get(i1)).e())
        {
          this.z = 0;
          return false;
        }
        i1 += 1;
      }
      i1 = 0;
      while (i1 < this.f.size())
      {
        if (!((a.aa)this.f.get(i1)).e())
        {
          this.z = 0;
          return false;
        }
        i1 += 1;
      }
      i1 = 0;
      while (i1 < this.i.size())
      {
        if (!((a.e)this.i.get(i1)).e())
        {
          this.z = 0;
          return false;
        }
        i1 += 1;
      }
      i1 = 0;
      while (i1 < this.j.size())
      {
        if (!((a.o)this.j.get(i1)).e())
        {
          this.z = 0;
          return false;
        }
        i1 += 1;
      }
      i1 = 0;
      while (i1 < this.k.size())
      {
        if (!((a.u)this.k.get(i1)).e())
        {
          this.z = 0;
          return false;
        }
        i1 += 1;
      }
      i1 = 0;
      while (i1 < this.l.size())
      {
        if (!((a.ab)this.l.get(i1)).e())
        {
          this.z = 0;
          return false;
        }
        i1 += 1;
      }
      i1 = 0;
      while (i1 < this.m.size())
      {
        if (!((a.k)this.m.get(i1)).e())
        {
          this.z = 0;
          return false;
        }
        i1 += 1;
      }
      if ((k()) && (!this.o.e()))
      {
        this.z = 0;
        return false;
      }
      if (!this.s.e())
      {
        this.z = 0;
        return false;
      }
      this.z = 1;
      return true;
    }
    
    public final int f()
    {
      int i1 = this.A;
      if (i1 != -1) {
        return i1;
      }
      i1 = this.v;
      int i4 = 0;
      if ((i1 & 0x1) == 1) {
        i1 = f.c(1, this.b) + 0;
      } else {
        i1 = 0;
      }
      int i3 = 0;
      int i2 = 0;
      while (i3 < this.g.size())
      {
        i2 += f.c(((Integer)this.g.get(i3)).intValue());
        i3 += 1;
      }
      i3 = i1 + i2;
      i1 = i3;
      if (!this.g.isEmpty()) {
        i1 = i3 + 1 + f.c(i2);
      }
      this.w = i2;
      i2 = i1;
      if ((this.v & 0x2) == 2) {
        i2 = i1 + f.c(3, this.c);
      }
      i1 = i2;
      if ((this.v & 0x4) == 4) {
        i1 = i2 + f.c(4, this.d);
      }
      i2 = 0;
      while (i2 < this.e.size())
      {
        i1 += f.c(5, (q)this.e.get(i2));
        i2 += 1;
      }
      i2 = 0;
      while (i2 < this.f.size())
      {
        i1 += f.c(6, (q)this.f.get(i2));
        i2 += 1;
      }
      i3 = 0;
      i2 = 0;
      while (i3 < this.h.size())
      {
        i2 += f.c(((Integer)this.h.get(i3)).intValue());
        i3 += 1;
      }
      i3 = i1 + i2;
      i1 = i3;
      if (!this.h.isEmpty()) {
        i1 = i3 + 1 + f.c(i2);
      }
      this.x = i2;
      i2 = 0;
      while (i2 < this.i.size())
      {
        i1 += f.c(8, (q)this.i.get(i2));
        i2 += 1;
      }
      i2 = 0;
      while (i2 < this.j.size())
      {
        i1 += f.c(9, (q)this.j.get(i2));
        i2 += 1;
      }
      i2 = 0;
      while (i2 < this.k.size())
      {
        i1 += f.c(10, (q)this.k.get(i2));
        i2 += 1;
      }
      i2 = 0;
      while (i2 < this.l.size())
      {
        i1 += f.c(11, (q)this.l.get(i2));
        i2 += 1;
      }
      i2 = 0;
      while (i2 < this.m.size())
      {
        i1 += f.c(13, (q)this.m.get(i2));
        i2 += 1;
      }
      i3 = 0;
      i2 = 0;
      while (i3 < this.n.size())
      {
        i2 += f.c(((Integer)this.n.get(i3)).intValue());
        i3 += 1;
      }
      i3 = i1 + i2;
      i1 = i3;
      if (!this.n.isEmpty()) {
        i1 = i3 + 2 + f.c(i2);
      }
      this.y = i2;
      i2 = i1;
      if ((this.v & 0x8) == 8) {
        i2 = i1 + f.c(30, this.o);
      }
      i3 = 0;
      i1 = i4;
      while (i1 < this.p.size())
      {
        i3 += f.c(((Integer)this.p.get(i1)).intValue());
        i1 += 1;
      }
      i2 = i2 + i3 + this.p.size() * 2;
      i1 = i2;
      if ((this.v & 0x10) == 16) {
        i1 = i2 + f.c(32, this.q);
      }
      i1 = i1 + this.s.f() + this.u.a();
      this.A = i1;
      return i1;
    }
    
    public final boolean g()
    {
      return (this.v & 0x4) == 4;
    }
    
    public final boolean k()
    {
      return (this.v & 0x8) == 8;
    }
    
    public final boolean l()
    {
      return (this.v & 0x10) == 16;
    }
    
    public static final class a
      extends i.b<a.c, a>
      implements a.d
    {
      private int c;
      private int d = 6;
      private int e;
      private int f;
      private List<a.ae> g = Collections.emptyList();
      private List<a.aa> h = Collections.emptyList();
      private List<Integer> i = Collections.emptyList();
      private List<Integer> j = Collections.emptyList();
      private List<a.e> k = Collections.emptyList();
      private List<a.o> l = Collections.emptyList();
      private List<a.u> m = Collections.emptyList();
      private List<a.ab> n = Collections.emptyList();
      private List<a.k> o = Collections.emptyList();
      private List<Integer> p = Collections.emptyList();
      private a.ag q = a.ag.a();
      private List<Integer> r = Collections.emptyList();
      private a.am s = a.am.a();
      
      private a a(int paramInt)
      {
        this.c |= 0x1;
        this.d = paramInt;
        return this;
      }
      
      private a a(a.ag paramag)
      {
        a.ag localag = paramag;
        if ((this.c & 0x2000) == 8192)
        {
          localag = paramag;
          if (this.q != a.ag.a()) {
            localag = a.ag.a(this.q).a(paramag).f();
          }
        }
        this.q = localag;
        this.c |= 0x2000;
        return this;
      }
      
      private a a(a.am paramam)
      {
        a.am localam = paramam;
        if ((this.c & 0x8000) == 32768)
        {
          localam = paramam;
          if (this.s != a.am.a()) {
            localam = a.am.a(this.s).a(paramam).f();
          }
        }
        this.s = localam;
        this.c |= 0x8000;
        return this;
      }
      
      private a b(int paramInt)
      {
        this.c |= 0x2;
        this.e = paramInt;
        return this;
      }
      
      private a c(int paramInt)
      {
        this.c |= 0x4;
        this.f = paramInt;
        return this;
      }
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 125	b/i/b/a/c/e/a$c:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 130 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$c
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 133	b/i/b/a/c/e/a$c$a:a	(Lb/i/b/a/c/e/a$c;)Lb/i/b/a/c/e/a$c$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 136	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$c
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 133	b/i/b/a/c/e/a$c$a:a	(Lb/i/b/a/c/e/a$c;)Lb/i/b/a/c/e/a$c$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a h()
      {
        return new a().a(i());
      }
      
      private a.c i()
      {
        int i2 = 0;
        a.c localc = new a.c(this, (byte)0);
        int i3 = this.c;
        if ((i3 & 0x1) == 1) {
          i2 = 1;
        }
        a.c.a(localc, this.d);
        int i1 = i2;
        if ((i3 & 0x2) == 2) {
          i1 = i2 | 0x2;
        }
        a.c.b(localc, this.e);
        i2 = i1;
        if ((i3 & 0x4) == 4) {
          i2 = i1 | 0x4;
        }
        a.c.c(localc, this.f);
        if ((this.c & 0x8) == 8)
        {
          this.g = Collections.unmodifiableList(this.g);
          this.c &= 0xFFFFFFF7;
        }
        a.c.a(localc, this.g);
        if ((this.c & 0x10) == 16)
        {
          this.h = Collections.unmodifiableList(this.h);
          this.c &= 0xFFFFFFEF;
        }
        a.c.b(localc, this.h);
        if ((this.c & 0x20) == 32)
        {
          this.i = Collections.unmodifiableList(this.i);
          this.c &= 0xFFFFFFDF;
        }
        a.c.c(localc, this.i);
        if ((this.c & 0x40) == 64)
        {
          this.j = Collections.unmodifiableList(this.j);
          this.c &= 0xFFFFFFBF;
        }
        a.c.d(localc, this.j);
        if ((this.c & 0x80) == 128)
        {
          this.k = Collections.unmodifiableList(this.k);
          this.c &= 0xFF7F;
        }
        a.c.e(localc, this.k);
        if ((this.c & 0x100) == 256)
        {
          this.l = Collections.unmodifiableList(this.l);
          this.c &= 0xFEFF;
        }
        a.c.f(localc, this.l);
        if ((this.c & 0x200) == 512)
        {
          this.m = Collections.unmodifiableList(this.m);
          this.c &= 0xFDFF;
        }
        a.c.g(localc, this.m);
        if ((this.c & 0x400) == 1024)
        {
          this.n = Collections.unmodifiableList(this.n);
          this.c &= 0xFBFF;
        }
        a.c.h(localc, this.n);
        if ((this.c & 0x800) == 2048)
        {
          this.o = Collections.unmodifiableList(this.o);
          this.c &= 0xF7FF;
        }
        a.c.i(localc, this.o);
        if ((this.c & 0x1000) == 4096)
        {
          this.p = Collections.unmodifiableList(this.p);
          this.c &= 0xEFFF;
        }
        a.c.j(localc, this.p);
        i1 = i2;
        if ((i3 & 0x2000) == 8192) {
          i1 = i2 | 0x8;
        }
        a.c.a(localc, this.q);
        if ((this.c & 0x4000) == 16384)
        {
          this.r = Collections.unmodifiableList(this.r);
          this.c &= 0xBFFF;
        }
        a.c.k(localc, this.r);
        i2 = i1;
        if ((i3 & 0x8000) == 32768) {
          i2 = i1 | 0x10;
        }
        a.c.a(localc, this.s);
        a.c.d(localc, i2);
        return localc;
      }
      
      private void k()
      {
        if ((this.c & 0x8) != 8)
        {
          this.g = new ArrayList(this.g);
          this.c |= 0x8;
        }
      }
      
      private void l()
      {
        if ((this.c & 0x10) != 16)
        {
          this.h = new ArrayList(this.h);
          this.c |= 0x10;
        }
      }
      
      private void m()
      {
        if ((this.c & 0x20) != 32)
        {
          this.i = new ArrayList(this.i);
          this.c |= 0x20;
        }
      }
      
      private void n()
      {
        if ((this.c & 0x40) != 64)
        {
          this.j = new ArrayList(this.j);
          this.c |= 0x40;
        }
      }
      
      private void o()
      {
        if ((this.c & 0x80) != 128)
        {
          this.k = new ArrayList(this.k);
          this.c |= 0x80;
        }
      }
      
      private void p()
      {
        if ((this.c & 0x100) != 256)
        {
          this.l = new ArrayList(this.l);
          this.c |= 0x100;
        }
      }
      
      private void q()
      {
        if ((this.c & 0x200) != 512)
        {
          this.m = new ArrayList(this.m);
          this.c |= 0x200;
        }
      }
      
      private void r()
      {
        if ((this.c & 0x400) != 1024)
        {
          this.n = new ArrayList(this.n);
          this.c |= 0x400;
        }
      }
      
      private void s()
      {
        if ((this.c & 0x800) != 2048)
        {
          this.o = new ArrayList(this.o);
          this.c |= 0x800;
        }
      }
      
      private void t()
      {
        if ((this.c & 0x1000) != 4096)
        {
          this.p = new ArrayList(this.p);
          this.c |= 0x1000;
        }
      }
      
      private void u()
      {
        if ((this.c & 0x4000) != 16384)
        {
          this.r = new ArrayList(this.r);
          this.c |= 0x4000;
        }
      }
      
      public final a a(a.c paramc)
      {
        if (paramc == a.c.a()) {
          return this;
        }
        if (paramc.c()) {
          a(paramc.b);
        }
        if (paramc.d()) {
          b(paramc.c);
        }
        if (paramc.g()) {
          c(paramc.d);
        }
        if (!a.c.a(paramc).isEmpty()) {
          if (this.g.isEmpty())
          {
            this.g = a.c.a(paramc);
            this.c &= 0xFFFFFFF7;
          }
          else
          {
            k();
            this.g.addAll(a.c.a(paramc));
          }
        }
        if (!a.c.b(paramc).isEmpty()) {
          if (this.h.isEmpty())
          {
            this.h = a.c.b(paramc);
            this.c &= 0xFFFFFFEF;
          }
          else
          {
            l();
            this.h.addAll(a.c.b(paramc));
          }
        }
        if (!a.c.c(paramc).isEmpty()) {
          if (this.i.isEmpty())
          {
            this.i = a.c.c(paramc);
            this.c &= 0xFFFFFFDF;
          }
          else
          {
            m();
            this.i.addAll(a.c.c(paramc));
          }
        }
        if (!a.c.d(paramc).isEmpty()) {
          if (this.j.isEmpty())
          {
            this.j = a.c.d(paramc);
            this.c &= 0xFFFFFFBF;
          }
          else
          {
            n();
            this.j.addAll(a.c.d(paramc));
          }
        }
        if (!a.c.e(paramc).isEmpty()) {
          if (this.k.isEmpty())
          {
            this.k = a.c.e(paramc);
            this.c &= 0xFF7F;
          }
          else
          {
            o();
            this.k.addAll(a.c.e(paramc));
          }
        }
        if (!a.c.f(paramc).isEmpty()) {
          if (this.l.isEmpty())
          {
            this.l = a.c.f(paramc);
            this.c &= 0xFEFF;
          }
          else
          {
            p();
            this.l.addAll(a.c.f(paramc));
          }
        }
        if (!a.c.g(paramc).isEmpty()) {
          if (this.m.isEmpty())
          {
            this.m = a.c.g(paramc);
            this.c &= 0xFDFF;
          }
          else
          {
            q();
            this.m.addAll(a.c.g(paramc));
          }
        }
        if (!a.c.h(paramc).isEmpty()) {
          if (this.n.isEmpty())
          {
            this.n = a.c.h(paramc);
            this.c &= 0xFBFF;
          }
          else
          {
            r();
            this.n.addAll(a.c.h(paramc));
          }
        }
        if (!a.c.i(paramc).isEmpty()) {
          if (this.o.isEmpty())
          {
            this.o = a.c.i(paramc);
            this.c &= 0xF7FF;
          }
          else
          {
            s();
            this.o.addAll(a.c.i(paramc));
          }
        }
        if (!a.c.j(paramc).isEmpty()) {
          if (this.p.isEmpty())
          {
            this.p = a.c.j(paramc);
            this.c &= 0xEFFF;
          }
          else
          {
            t();
            this.p.addAll(a.c.j(paramc));
          }
        }
        if (paramc.k()) {
          a(paramc.o);
        }
        if (!a.c.k(paramc).isEmpty()) {
          if (this.r.isEmpty())
          {
            this.r = a.c.k(paramc);
            this.c &= 0xBFFF;
          }
          else
          {
            u();
            this.r.addAll(a.c.k(paramc));
          }
        }
        if (paramc.l()) {
          a(paramc.q);
        }
        a(paramc);
        this.a = this.a.a(a.c.l(paramc));
        return this;
      }
      
      public final boolean e()
      {
        if ((this.c & 0x2) == 2) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 == 0) {
          return false;
        }
        int i1 = 0;
        while (i1 < this.g.size())
        {
          if (!((a.ae)this.g.get(i1)).e()) {
            return false;
          }
          i1 += 1;
        }
        i1 = 0;
        while (i1 < this.h.size())
        {
          if (!((a.aa)this.h.get(i1)).e()) {
            return false;
          }
          i1 += 1;
        }
        i1 = 0;
        while (i1 < this.k.size())
        {
          if (!((a.e)this.k.get(i1)).e()) {
            return false;
          }
          i1 += 1;
        }
        i1 = 0;
        while (i1 < this.l.size())
        {
          if (!((a.o)this.l.get(i1)).e()) {
            return false;
          }
          i1 += 1;
        }
        i1 = 0;
        while (i1 < this.m.size())
        {
          if (!((a.u)this.m.get(i1)).e()) {
            return false;
          }
          i1 += 1;
        }
        i1 = 0;
        while (i1 < this.n.size())
        {
          if (!((a.ab)this.n.get(i1)).e()) {
            return false;
          }
          i1 += 1;
        }
        i1 = 0;
        while (i1 < this.o.size())
        {
          if (!((a.k)this.o.get(i1)).e()) {
            return false;
          }
          i1 += 1;
        }
        if ((this.c & 0x2000) == 8192) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if ((i1 != 0) && (!this.q.e())) {
          return false;
        }
        return this.b.e();
      }
    }
    
    public static enum b
      implements j.a
    {
      private static j.b<b> h = new j.b() {};
      private final int i;
      
      private b(int paramInt1, int paramInt2)
      {
        this.i = paramInt1;
      }
      
      public static b a(int paramInt)
      {
        switch (paramInt)
        {
        default: 
          return null;
        case 6: 
          return g;
        case 5: 
          return f;
        case 4: 
          return e;
        case 3: 
          return d;
        case 2: 
          return c;
        case 1: 
          return b;
        }
        return a;
      }
      
      public final int a()
      {
        return this.i;
      }
    }
  }
  
  public static abstract interface d
    extends i.d
  {}
  
  public static final class e
    extends i.c<e>
    implements a.f
  {
    public static s<e> a = new b() {};
    private static final e e;
    public int b;
    public List<a.ai> c;
    public List<Integer> d;
    private final d f;
    private int g;
    private byte h = -1;
    private int i = -1;
    
    static
    {
      e locale = new e();
      e = locale;
      locale.d();
    }
    
    private e()
    {
      this.f = d.b;
    }
    
    /* Error */
    private e(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 45	b/i/b/a/c/g/i$c:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 47	b/i/b/a/c/e/a$e:h	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 49	b/i/b/a/c/e/a$e:i	I
      //   14: aload_0
      //   15: invokespecial 43	b/i/b/a/c/e/a$e:d	()V
      //   18: invokestatic 63	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   21: astore 12
      //   23: aload 12
      //   25: iconst_1
      //   26: invokestatic 68	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   29: astore 13
      //   31: iconst_0
      //   32: istore 8
      //   34: iconst_0
      //   35: istore_3
      //   36: iload 8
      //   38: ifne +579 -> 617
      //   41: iload_3
      //   42: istore 4
      //   44: iload_3
      //   45: istore 5
      //   47: iload_3
      //   48: istore 6
      //   50: aload_1
      //   51: invokevirtual 73	b/i/b/a/c/g/e:a	()I
      //   54: istore 7
      //   56: iload 7
      //   58: ifeq +425 -> 483
      //   61: iload 7
      //   63: bipush 8
      //   65: if_icmpeq +379 -> 444
      //   68: iload 7
      //   70: bipush 18
      //   72: if_icmpeq +291 -> 363
      //   75: iload 7
      //   77: sipush 248
      //   80: if_icmpeq +184 -> 264
      //   83: iload 7
      //   85: sipush 250
      //   88: if_icmpeq +28 -> 116
      //   91: iload_3
      //   92: istore 4
      //   94: iload_3
      //   95: istore 5
      //   97: iload_3
      //   98: istore 6
      //   100: aload_0
      //   101: aload_1
      //   102: aload 13
      //   104: aload_2
      //   105: iload 7
      //   107: invokevirtual 76	b/i/b/a/c/e/a$e:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   110: ifne -74 -> 36
      //   113: goto +370 -> 483
      //   116: iload_3
      //   117: istore 4
      //   119: iload_3
      //   120: istore 5
      //   122: iload_3
      //   123: istore 6
      //   125: aload_1
      //   126: aload_1
      //   127: invokevirtual 78	b/i/b/a/c/g/e:d	()I
      //   130: invokevirtual 81	b/i/b/a/c/g/e:b	(I)I
      //   133: istore 9
      //   135: iload_3
      //   136: istore 7
      //   138: iload_3
      //   139: iconst_4
      //   140: iand
      //   141: iconst_4
      //   142: if_icmpeq +47 -> 189
      //   145: iload_3
      //   146: istore 7
      //   148: iload_3
      //   149: istore 4
      //   151: iload_3
      //   152: istore 5
      //   154: iload_3
      //   155: istore 6
      //   157: aload_1
      //   158: invokevirtual 83	b/i/b/a/c/g/e:h	()I
      //   161: ifle +28 -> 189
      //   164: iload_3
      //   165: istore 4
      //   167: iload_3
      //   168: istore 5
      //   170: iload_3
      //   171: istore 6
      //   173: aload_0
      //   174: new 85	java/util/ArrayList
      //   177: dup
      //   178: invokespecial 86	java/util/ArrayList:<init>	()V
      //   181: putfield 88	b/i/b/a/c/e/a$e:d	Ljava/util/List;
      //   184: iload_3
      //   185: iconst_4
      //   186: ior
      //   187: istore 7
      //   189: iload 7
      //   191: istore 4
      //   193: iload 7
      //   195: istore 5
      //   197: iload 7
      //   199: istore 6
      //   201: aload_1
      //   202: invokevirtual 83	b/i/b/a/c/g/e:h	()I
      //   205: ifle +35 -> 240
      //   208: iload 7
      //   210: istore 4
      //   212: iload 7
      //   214: istore 5
      //   216: iload 7
      //   218: istore 6
      //   220: aload_0
      //   221: getfield 88	b/i/b/a/c/e/a$e:d	Ljava/util/List;
      //   224: aload_1
      //   225: invokevirtual 78	b/i/b/a/c/g/e:d	()I
      //   228: invokestatic 94	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   231: invokeinterface 100 2 0
      //   236: pop
      //   237: goto -48 -> 189
      //   240: iload 7
      //   242: istore 4
      //   244: iload 7
      //   246: istore 5
      //   248: iload 7
      //   250: istore 6
      //   252: aload_1
      //   253: iload 9
      //   255: invokevirtual 103	b/i/b/a/c/g/e:c	(I)V
      //   258: iload 7
      //   260: istore_3
      //   261: goto -225 -> 36
      //   264: iload_3
      //   265: istore 7
      //   267: iload_3
      //   268: iconst_4
      //   269: iand
      //   270: iconst_4
      //   271: if_icmpeq +28 -> 299
      //   274: iload_3
      //   275: istore 4
      //   277: iload_3
      //   278: istore 5
      //   280: iload_3
      //   281: istore 6
      //   283: aload_0
      //   284: new 85	java/util/ArrayList
      //   287: dup
      //   288: invokespecial 86	java/util/ArrayList:<init>	()V
      //   291: putfield 88	b/i/b/a/c/e/a$e:d	Ljava/util/List;
      //   294: iload_3
      //   295: iconst_4
      //   296: ior
      //   297: istore 7
      //   299: iload 7
      //   301: istore 4
      //   303: iload 7
      //   305: istore 5
      //   307: iload 7
      //   309: istore 6
      //   311: aload_0
      //   312: getfield 88	b/i/b/a/c/e/a$e:d	Ljava/util/List;
      //   315: astore 10
      //   317: iload 7
      //   319: istore 4
      //   321: iload 7
      //   323: istore 5
      //   325: iload 7
      //   327: istore 6
      //   329: aload_1
      //   330: invokevirtual 78	b/i/b/a/c/g/e:d	()I
      //   333: invokestatic 94	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   336: astore 11
      //   338: iload 7
      //   340: istore_3
      //   341: iload_3
      //   342: istore 4
      //   344: iload_3
      //   345: istore 5
      //   347: iload_3
      //   348: istore 6
      //   350: aload 10
      //   352: aload 11
      //   354: invokeinterface 100 2 0
      //   359: pop
      //   360: goto -324 -> 36
      //   363: iload_3
      //   364: istore 7
      //   366: iload_3
      //   367: iconst_2
      //   368: iand
      //   369: iconst_2
      //   370: if_icmpeq +28 -> 398
      //   373: iload_3
      //   374: istore 4
      //   376: iload_3
      //   377: istore 5
      //   379: iload_3
      //   380: istore 6
      //   382: aload_0
      //   383: new 85	java/util/ArrayList
      //   386: dup
      //   387: invokespecial 86	java/util/ArrayList:<init>	()V
      //   390: putfield 105	b/i/b/a/c/e/a$e:c	Ljava/util/List;
      //   393: iload_3
      //   394: iconst_2
      //   395: ior
      //   396: istore 7
      //   398: iload 7
      //   400: istore 4
      //   402: iload 7
      //   404: istore 5
      //   406: iload 7
      //   408: istore 6
      //   410: aload_0
      //   411: getfield 105	b/i/b/a/c/e/a$e:c	Ljava/util/List;
      //   414: astore 10
      //   416: iload 7
      //   418: istore 4
      //   420: iload 7
      //   422: istore 5
      //   424: iload 7
      //   426: istore 6
      //   428: aload_1
      //   429: getstatic 108	b/i/b/a/c/e/a$ai:a	Lb/i/b/a/c/g/s;
      //   432: aload_2
      //   433: invokevirtual 111	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   436: astore 11
      //   438: iload 7
      //   440: istore_3
      //   441: goto -100 -> 341
      //   444: iload_3
      //   445: istore 4
      //   447: iload_3
      //   448: istore 5
      //   450: iload_3
      //   451: istore 6
      //   453: aload_0
      //   454: aload_0
      //   455: getfield 113	b/i/b/a/c/e/a$e:g	I
      //   458: iconst_1
      //   459: ior
      //   460: putfield 113	b/i/b/a/c/e/a$e:g	I
      //   463: iload_3
      //   464: istore 4
      //   466: iload_3
      //   467: istore 5
      //   469: iload_3
      //   470: istore 6
      //   472: aload_0
      //   473: aload_1
      //   474: invokevirtual 78	b/i/b/a/c/g/e:d	()I
      //   477: putfield 115	b/i/b/a/c/e/a$e:b	I
      //   480: goto -444 -> 36
      //   483: iconst_1
      //   484: istore 8
      //   486: goto -450 -> 36
      //   489: astore_1
      //   490: goto +51 -> 541
      //   493: astore_1
      //   494: iload 5
      //   496: istore 4
      //   498: new 58	b/i/b/a/c/g/k
      //   501: dup
      //   502: aload_1
      //   503: invokevirtual 119	java/io/IOException:getMessage	()Ljava/lang/String;
      //   506: invokespecial 122	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   509: astore_1
      //   510: iload 5
      //   512: istore 4
      //   514: aload_1
      //   515: aload_0
      //   516: putfield 125	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   519: iload 5
      //   521: istore 4
      //   523: aload_1
      //   524: athrow
      //   525: astore_1
      //   526: iload 6
      //   528: istore 4
      //   530: aload_1
      //   531: aload_0
      //   532: putfield 125	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   535: iload 6
      //   537: istore 4
      //   539: aload_1
      //   540: athrow
      //   541: iload 4
      //   543: iconst_2
      //   544: iand
      //   545: iconst_2
      //   546: if_icmpne +14 -> 560
      //   549: aload_0
      //   550: aload_0
      //   551: getfield 105	b/i/b/a/c/e/a$e:c	Ljava/util/List;
      //   554: invokestatic 131	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   557: putfield 105	b/i/b/a/c/e/a$e:c	Ljava/util/List;
      //   560: iload 4
      //   562: iconst_4
      //   563: iand
      //   564: iconst_4
      //   565: if_icmpne +14 -> 579
      //   568: aload_0
      //   569: aload_0
      //   570: getfield 88	b/i/b/a/c/e/a$e:d	Ljava/util/List;
      //   573: invokestatic 131	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   576: putfield 88	b/i/b/a/c/e/a$e:d	Ljava/util/List;
      //   579: aload 13
      //   581: invokevirtual 133	b/i/b/a/c/g/f:a	()V
      //   584: aload_0
      //   585: aload 12
      //   587: invokevirtual 138	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   590: putfield 55	b/i/b/a/c/e/a$e:f	Lb/i/b/a/c/g/d;
      //   593: goto +15 -> 608
      //   596: astore_1
      //   597: aload_0
      //   598: aload 12
      //   600: invokevirtual 138	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   603: putfield 55	b/i/b/a/c/e/a$e:f	Lb/i/b/a/c/g/d;
      //   606: aload_1
      //   607: athrow
      //   608: aload_0
      //   609: getfield 142	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   612: invokevirtual 146	b/i/b/a/c/g/h:c	()V
      //   615: aload_1
      //   616: athrow
      //   617: iload_3
      //   618: iconst_2
      //   619: iand
      //   620: iconst_2
      //   621: if_icmpne +14 -> 635
      //   624: aload_0
      //   625: aload_0
      //   626: getfield 105	b/i/b/a/c/e/a$e:c	Ljava/util/List;
      //   629: invokestatic 131	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   632: putfield 105	b/i/b/a/c/e/a$e:c	Ljava/util/List;
      //   635: iload_3
      //   636: iconst_4
      //   637: iand
      //   638: iconst_4
      //   639: if_icmpne +14 -> 653
      //   642: aload_0
      //   643: aload_0
      //   644: getfield 88	b/i/b/a/c/e/a$e:d	Ljava/util/List;
      //   647: invokestatic 131	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   650: putfield 88	b/i/b/a/c/e/a$e:d	Ljava/util/List;
      //   653: aload 13
      //   655: invokevirtual 133	b/i/b/a/c/g/f:a	()V
      //   658: aload_0
      //   659: aload 12
      //   661: invokevirtual 138	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   664: putfield 55	b/i/b/a/c/e/a$e:f	Lb/i/b/a/c/g/d;
      //   667: goto +15 -> 682
      //   670: astore_1
      //   671: aload_0
      //   672: aload 12
      //   674: invokevirtual 138	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   677: putfield 55	b/i/b/a/c/e/a$e:f	Lb/i/b/a/c/g/d;
      //   680: aload_1
      //   681: athrow
      //   682: aload_0
      //   683: getfield 142	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   686: invokevirtual 146	b/i/b/a/c/g/h:c	()V
      //   689: return
      //   690: astore_2
      //   691: goto -107 -> 584
      //   694: astore_1
      //   695: goto -37 -> 658
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	698	0	this	e
      //   0	698	1	parame	b.i.b.a.c.g.e
      //   0	698	2	paramg	g
      //   35	603	3	j	int
      //   42	522	4	k	int
      //   45	475	5	m	int
      //   48	488	6	n	int
      //   54	385	7	i1	int
      //   32	453	8	i2	int
      //   133	121	9	i3	int
      //   315	100	10	localList	List
      //   336	101	11	localObject	Object
      //   21	652	12	localb	b.i.b.a.c.g.d.b
      //   29	625	13	localf	f
      // Exception table:
      //   from	to	target	type
      //   50	56	489	finally
      //   100	113	489	finally
      //   125	135	489	finally
      //   157	164	489	finally
      //   173	184	489	finally
      //   201	208	489	finally
      //   220	237	489	finally
      //   252	258	489	finally
      //   283	294	489	finally
      //   311	317	489	finally
      //   329	338	489	finally
      //   350	360	489	finally
      //   382	393	489	finally
      //   410	416	489	finally
      //   428	438	489	finally
      //   453	463	489	finally
      //   472	480	489	finally
      //   498	510	489	finally
      //   514	519	489	finally
      //   523	525	489	finally
      //   530	535	489	finally
      //   539	541	489	finally
      //   50	56	493	java/io/IOException
      //   100	113	493	java/io/IOException
      //   125	135	493	java/io/IOException
      //   157	164	493	java/io/IOException
      //   173	184	493	java/io/IOException
      //   201	208	493	java/io/IOException
      //   220	237	493	java/io/IOException
      //   252	258	493	java/io/IOException
      //   283	294	493	java/io/IOException
      //   311	317	493	java/io/IOException
      //   329	338	493	java/io/IOException
      //   350	360	493	java/io/IOException
      //   382	393	493	java/io/IOException
      //   410	416	493	java/io/IOException
      //   428	438	493	java/io/IOException
      //   453	463	493	java/io/IOException
      //   472	480	493	java/io/IOException
      //   50	56	525	b/i/b/a/c/g/k
      //   100	113	525	b/i/b/a/c/g/k
      //   125	135	525	b/i/b/a/c/g/k
      //   157	164	525	b/i/b/a/c/g/k
      //   173	184	525	b/i/b/a/c/g/k
      //   201	208	525	b/i/b/a/c/g/k
      //   220	237	525	b/i/b/a/c/g/k
      //   252	258	525	b/i/b/a/c/g/k
      //   283	294	525	b/i/b/a/c/g/k
      //   311	317	525	b/i/b/a/c/g/k
      //   329	338	525	b/i/b/a/c/g/k
      //   350	360	525	b/i/b/a/c/g/k
      //   382	393	525	b/i/b/a/c/g/k
      //   410	416	525	b/i/b/a/c/g/k
      //   428	438	525	b/i/b/a/c/g/k
      //   453	463	525	b/i/b/a/c/g/k
      //   472	480	525	b/i/b/a/c/g/k
      //   579	584	596	finally
      //   653	658	670	finally
      //   579	584	690	java/io/IOException
      //   653	658	694	java/io/IOException
    }
    
    private e(i.b<e, ?> paramb)
    {
      super();
      this.f = paramb.a;
    }
    
    public static e a()
    {
      return e;
    }
    
    private void d()
    {
      this.b = 6;
      this.c = Collections.emptyList();
      this.d = Collections.emptyList();
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      i.c.a locala = x();
      if ((this.g & 0x1) == 1) {
        paramf.a(1, this.b);
      }
      int m = 0;
      int j = 0;
      int k;
      for (;;)
      {
        k = m;
        if (j >= this.c.size()) {
          break;
        }
        paramf.a(2, (q)this.c.get(j));
        j += 1;
      }
      while (k < this.d.size())
      {
        paramf.a(31, ((Integer)this.d.get(k)).intValue());
        k += 1;
      }
      locala.a(19000, paramf);
      paramf.c(this.f);
    }
    
    public final s<e> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.g & 0x1) == 1;
    }
    
    public final boolean e()
    {
      int j = this.h;
      if (j == 1) {
        return true;
      }
      if (j == 0) {
        return false;
      }
      j = 0;
      while (j < this.c.size())
      {
        if (!((a.ai)this.c.get(j)).e())
        {
          this.h = 0;
          return false;
        }
        j += 1;
      }
      if (!this.s.e())
      {
        this.h = 0;
        return false;
      }
      this.h = 1;
      return true;
    }
    
    public final int f()
    {
      int j = this.i;
      if (j != -1) {
        return j;
      }
      j = this.g;
      int m = 0;
      if ((j & 0x1) == 1) {
        j = f.c(1, this.b) + 0;
      } else {
        j = 0;
      }
      int k = 0;
      while (k < this.c.size())
      {
        j += f.c(2, (q)this.c.get(k));
        k += 1;
      }
      int n = 0;
      k = m;
      m = n;
      while (k < this.d.size())
      {
        m += f.c(((Integer)this.d.get(k)).intValue());
        k += 1;
      }
      j = j + m + this.d.size() * 2 + this.s.f() + this.f.a();
      this.i = j;
      return j;
    }
    
    public static final class a
      extends i.b<a.e, a>
      implements a.f
    {
      private int c;
      private int d = 6;
      private List<a.ai> e = Collections.emptyList();
      private List<Integer> f = Collections.emptyList();
      
      private a a(int paramInt)
      {
        this.c |= 0x1;
        this.d = paramInt;
        return this;
      }
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 48	b/i/b/a/c/e/a$e:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 53 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$e
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 56	b/i/b/a/c/e/a$e$a:a	(Lb/i/b/a/c/e/a$e;)Lb/i/b/a/c/e/a$e$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 59	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$e
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 56	b/i/b/a/c/e/a$e$a:a	(Lb/i/b/a/c/e/a$e;)Lb/i/b/a/c/e/a$e$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a h()
      {
        return new a().a(i());
      }
      
      private a.e i()
      {
        int i = 0;
        a.e locale = new a.e(this, (byte)0);
        if ((this.c & 0x1) == 1) {
          i = 1;
        }
        a.e.a(locale, this.d);
        if ((this.c & 0x2) == 2)
        {
          this.e = Collections.unmodifiableList(this.e);
          this.c &= 0xFFFFFFFD;
        }
        a.e.a(locale, this.e);
        if ((this.c & 0x4) == 4)
        {
          this.f = Collections.unmodifiableList(this.f);
          this.c &= 0xFFFFFFFB;
        }
        a.e.b(locale, this.f);
        a.e.b(locale, i);
        return locale;
      }
      
      private void k()
      {
        if ((this.c & 0x2) != 2)
        {
          this.e = new ArrayList(this.e);
          this.c |= 0x2;
        }
      }
      
      private void l()
      {
        if ((this.c & 0x4) != 4)
        {
          this.f = new ArrayList(this.f);
          this.c |= 0x4;
        }
      }
      
      public final a a(a.e parame)
      {
        if (parame == a.e.a()) {
          return this;
        }
        if (parame.c()) {
          a(parame.b);
        }
        if (!a.e.a(parame).isEmpty()) {
          if (this.e.isEmpty())
          {
            this.e = a.e.a(parame);
            this.c &= 0xFFFFFFFD;
          }
          else
          {
            k();
            this.e.addAll(a.e.a(parame));
          }
        }
        if (!a.e.b(parame).isEmpty()) {
          if (this.f.isEmpty())
          {
            this.f = a.e.b(parame);
            this.c &= 0xFFFFFFFB;
          }
          else
          {
            l();
            this.f.addAll(a.e.b(parame));
          }
        }
        a(parame);
        this.a = this.a.a(a.e.c(parame));
        return this;
      }
      
      public final boolean e()
      {
        int i = 0;
        while (i < this.e.size())
        {
          if (!((a.ai)this.e.get(i)).e()) {
            return false;
          }
          i += 1;
        }
        return this.b.e();
      }
    }
  }
  
  public static abstract interface f
    extends i.d
  {}
  
  public static final class g
    extends i
    implements a.h
  {
    public static s<g> a = new b() {};
    private static final g b;
    private final d c;
    private List<a.i> d;
    private byte e = -1;
    private int f = -1;
    
    static
    {
      g localg = new g();
      b = localg;
      localg.d = Collections.emptyList();
    }
    
    private g()
    {
      this.c = d.b;
    }
    
    /* Error */
    private g(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 47	b/i/b/a/c/g/i:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 49	b/i/b/a/c/e/a$g:e	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 51	b/i/b/a/c/e/a$g:f	I
      //   14: aload_0
      //   15: invokestatic 43	java/util/Collections:emptyList	()Ljava/util/List;
      //   18: putfield 45	b/i/b/a/c/e/a$g:d	Ljava/util/List;
      //   21: invokestatic 66	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   24: astore 9
      //   26: aload 9
      //   28: iconst_1
      //   29: invokestatic 71	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   32: astore 10
      //   34: iconst_0
      //   35: istore 8
      //   37: iconst_0
      //   38: istore_3
      //   39: iload 8
      //   41: ifne +238 -> 279
      //   44: iload_3
      //   45: istore 5
      //   47: iload_3
      //   48: istore 6
      //   50: iload_3
      //   51: istore 7
      //   53: aload_1
      //   54: invokevirtual 76	b/i/b/a/c/g/e:a	()I
      //   57: istore 4
      //   59: iload 4
      //   61: ifeq +106 -> 167
      //   64: iload 4
      //   66: bipush 10
      //   68: if_icmpeq +28 -> 96
      //   71: iload_3
      //   72: istore 5
      //   74: iload_3
      //   75: istore 6
      //   77: iload_3
      //   78: istore 7
      //   80: aload_0
      //   81: aload_1
      //   82: aload 10
      //   84: aload_2
      //   85: iload 4
      //   87: invokevirtual 79	b/i/b/a/c/e/a$g:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   90: ifne -51 -> 39
      //   93: goto +74 -> 167
      //   96: iload_3
      //   97: istore 4
      //   99: iload_3
      //   100: iconst_1
      //   101: iand
      //   102: iconst_1
      //   103: if_icmpeq +28 -> 131
      //   106: iload_3
      //   107: istore 5
      //   109: iload_3
      //   110: istore 6
      //   112: iload_3
      //   113: istore 7
      //   115: aload_0
      //   116: new 81	java/util/ArrayList
      //   119: dup
      //   120: invokespecial 82	java/util/ArrayList:<init>	()V
      //   123: putfield 45	b/i/b/a/c/e/a$g:d	Ljava/util/List;
      //   126: iload_3
      //   127: iconst_1
      //   128: ior
      //   129: istore 4
      //   131: iload 4
      //   133: istore 5
      //   135: iload 4
      //   137: istore 6
      //   139: iload 4
      //   141: istore 7
      //   143: aload_0
      //   144: getfield 45	b/i/b/a/c/e/a$g:d	Ljava/util/List;
      //   147: aload_1
      //   148: getstatic 85	b/i/b/a/c/e/a$i:a	Lb/i/b/a/c/g/s;
      //   151: aload_2
      //   152: invokevirtual 88	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   155: invokeinterface 94 2 0
      //   160: pop
      //   161: iload 4
      //   163: istore_3
      //   164: goto -125 -> 39
      //   167: iconst_1
      //   168: istore 8
      //   170: goto -131 -> 39
      //   173: astore_1
      //   174: goto +51 -> 225
      //   177: astore_1
      //   178: iload 6
      //   180: istore 5
      //   182: new 60	b/i/b/a/c/g/k
      //   185: dup
      //   186: aload_1
      //   187: invokevirtual 98	java/io/IOException:getMessage	()Ljava/lang/String;
      //   190: invokespecial 101	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   193: astore_1
      //   194: iload 6
      //   196: istore 5
      //   198: aload_1
      //   199: aload_0
      //   200: putfield 104	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   203: iload 6
      //   205: istore 5
      //   207: aload_1
      //   208: athrow
      //   209: astore_1
      //   210: iload 7
      //   212: istore 5
      //   214: aload_1
      //   215: aload_0
      //   216: putfield 104	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   219: iload 7
      //   221: istore 5
      //   223: aload_1
      //   224: athrow
      //   225: iload 5
      //   227: iconst_1
      //   228: iand
      //   229: iconst_1
      //   230: if_icmpne +14 -> 244
      //   233: aload_0
      //   234: aload_0
      //   235: getfield 45	b/i/b/a/c/e/a$g:d	Ljava/util/List;
      //   238: invokestatic 108	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   241: putfield 45	b/i/b/a/c/e/a$g:d	Ljava/util/List;
      //   244: aload 10
      //   246: invokevirtual 110	b/i/b/a/c/g/f:a	()V
      //   249: aload_0
      //   250: aload 9
      //   252: invokevirtual 115	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   255: putfield 57	b/i/b/a/c/e/a$g:c	Lb/i/b/a/c/g/d;
      //   258: goto +15 -> 273
      //   261: astore_1
      //   262: aload_0
      //   263: aload 9
      //   265: invokevirtual 115	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   268: putfield 57	b/i/b/a/c/e/a$g:c	Lb/i/b/a/c/g/d;
      //   271: aload_1
      //   272: athrow
      //   273: aload_0
      //   274: invokevirtual 118	b/i/b/a/c/e/a$g:w	()V
      //   277: aload_1
      //   278: athrow
      //   279: iload_3
      //   280: iconst_1
      //   281: iand
      //   282: iconst_1
      //   283: if_icmpne +14 -> 297
      //   286: aload_0
      //   287: aload_0
      //   288: getfield 45	b/i/b/a/c/e/a$g:d	Ljava/util/List;
      //   291: invokestatic 108	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   294: putfield 45	b/i/b/a/c/e/a$g:d	Ljava/util/List;
      //   297: aload 10
      //   299: invokevirtual 110	b/i/b/a/c/g/f:a	()V
      //   302: aload_0
      //   303: aload 9
      //   305: invokevirtual 115	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   308: putfield 57	b/i/b/a/c/e/a$g:c	Lb/i/b/a/c/g/d;
      //   311: goto +15 -> 326
      //   314: astore_1
      //   315: aload_0
      //   316: aload 9
      //   318: invokevirtual 115	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   321: putfield 57	b/i/b/a/c/e/a$g:c	Lb/i/b/a/c/g/d;
      //   324: aload_1
      //   325: athrow
      //   326: aload_0
      //   327: invokevirtual 118	b/i/b/a/c/e/a$g:w	()V
      //   330: return
      //   331: astore_2
      //   332: goto -83 -> 249
      //   335: astore_1
      //   336: goto -34 -> 302
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	339	0	this	g
      //   0	339	1	parame	b.i.b.a.c.g.e
      //   0	339	2	paramg	g
      //   38	244	3	i	int
      //   57	105	4	j	int
      //   45	184	5	k	int
      //   48	156	6	m	int
      //   51	169	7	n	int
      //   35	134	8	i1	int
      //   24	293	9	localb	b.i.b.a.c.g.d.b
      //   32	266	10	localf	f
      // Exception table:
      //   from	to	target	type
      //   53	59	173	finally
      //   80	93	173	finally
      //   115	126	173	finally
      //   143	161	173	finally
      //   182	194	173	finally
      //   198	203	173	finally
      //   207	209	173	finally
      //   214	219	173	finally
      //   223	225	173	finally
      //   53	59	177	java/io/IOException
      //   80	93	177	java/io/IOException
      //   115	126	177	java/io/IOException
      //   143	161	177	java/io/IOException
      //   53	59	209	b/i/b/a/c/g/k
      //   80	93	209	b/i/b/a/c/g/k
      //   115	126	209	b/i/b/a/c/g/k
      //   143	161	209	b/i/b/a/c/g/k
      //   244	249	261	finally
      //   297	302	314	finally
      //   244	249	331	java/io/IOException
      //   297	302	335	java/io/IOException
    }
    
    private g(i.a parama)
    {
      super();
      this.c = parama.a;
    }
    
    public static a a(g paramg)
    {
      return a.g().a(paramg);
    }
    
    public static g a()
    {
      return b;
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      int i = 0;
      while (i < this.d.size())
      {
        paramf.a(1, (q)this.d.get(i));
        i += 1;
      }
      paramf.c(this.c);
    }
    
    public final s<g> b()
    {
      return a;
    }
    
    public final a c()
    {
      return a.g().a(this);
    }
    
    public final boolean e()
    {
      int i = this.e;
      if (i == 1) {
        return true;
      }
      if (i == 0) {
        return false;
      }
      i = 0;
      while (i < this.d.size())
      {
        if (!((a.i)this.d.get(i)).e())
        {
          this.e = 0;
          return false;
        }
        i += 1;
      }
      this.e = 1;
      return true;
    }
    
    public final int f()
    {
      int i = this.f;
      if (i != -1) {
        return i;
      }
      i = 0;
      int j = 0;
      while (i < this.d.size())
      {
        j += f.c(1, (q)this.d.get(i));
        i += 1;
      }
      i = j + this.c.a();
      this.f = i;
      return i;
    }
    
    public static final class a
      extends i.a<a.g, a>
      implements a.h
    {
      private int b;
      private List<a.i> c = Collections.emptyList();
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 39	b/i/b/a/c/e/a$g:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 44 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$g
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 47	b/i/b/a/c/e/a$g$a:a	(Lb/i/b/a/c/e/a$g;)Lb/i/b/a/c/e/a$g$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 50	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$g
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 47	b/i/b/a/c/e/a$g$a:a	(Lb/i/b/a/c/e/a$g;)Lb/i/b/a/c/e/a$g$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a h()
      {
        return new a().a(f());
      }
      
      private void i()
      {
        if ((this.b & 0x1) != 1)
        {
          this.c = new ArrayList(this.c);
          this.b |= 0x1;
        }
      }
      
      public final a a(a.g paramg)
      {
        if (paramg == a.g.a()) {
          return this;
        }
        if (!a.g.b(paramg).isEmpty()) {
          if (this.c.isEmpty())
          {
            this.c = a.g.b(paramg);
            this.b &= 0xFFFFFFFE;
          }
          else
          {
            i();
            this.c.addAll(a.g.b(paramg));
          }
        }
        this.a = this.a.a(a.g.c(paramg));
        return this;
      }
      
      public final boolean e()
      {
        int i = 0;
        while (i < this.c.size())
        {
          if (!((a.i)this.c.get(i)).e()) {
            return false;
          }
          i += 1;
        }
        return true;
      }
      
      public final a.g f()
      {
        a.g localg = new a.g(this, (byte)0);
        if ((this.b & 0x1) == 1)
        {
          this.c = Collections.unmodifiableList(this.c);
          this.b &= 0xFFFFFFFE;
        }
        a.g.a(localg, this.c);
        return localg;
      }
    }
  }
  
  public static abstract interface h
    extends r
  {}
  
  public static final class i
    extends i
    implements a.j
  {
    public static s<i> a = new b() {};
    private static final i e;
    b b;
    a.m c;
    c d;
    private final d f;
    private int g;
    private List<a.m> h;
    private byte i = -1;
    private int j = -1;
    
    static
    {
      i locali = new i();
      e = locali;
      locali.k();
    }
    
    private i()
    {
      this.f = d.b;
    }
    
    /* Error */
    private i(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 56	b/i/b/a/c/g/i:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 58	b/i/b/a/c/e/a$i:i	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 60	b/i/b/a/c/e/a$i:j	I
      //   14: aload_0
      //   15: invokespecial 54	b/i/b/a/c/e/a$i:k	()V
      //   18: invokestatic 74	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   21: astore 11
      //   23: aload 11
      //   25: iconst_1
      //   26: invokestatic 79	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   29: astore 12
      //   31: iconst_0
      //   32: istore 8
      //   34: iconst_0
      //   35: istore_3
      //   36: iload 8
      //   38: ifne +587 -> 625
      //   41: iload_3
      //   42: istore 5
      //   44: iload_3
      //   45: istore 6
      //   47: iload_3
      //   48: istore 7
      //   50: aload_1
      //   51: invokevirtual 84	b/i/b/a/c/g/e:a	()I
      //   54: istore 9
      //   56: iload 9
      //   58: ifeq +455 -> 513
      //   61: iload 9
      //   63: bipush 8
      //   65: if_icmpeq +356 -> 421
      //   68: iload 9
      //   70: bipush 18
      //   72: if_icmpeq +278 -> 350
      //   75: iload 9
      //   77: bipush 26
      //   79: if_icmpeq +143 -> 222
      //   82: iload 9
      //   84: bipush 32
      //   86: if_icmpeq +28 -> 114
      //   89: iload_3
      //   90: istore 5
      //   92: iload_3
      //   93: istore 6
      //   95: iload_3
      //   96: istore 7
      //   98: aload_0
      //   99: aload_1
      //   100: aload 12
      //   102: aload_2
      //   103: iload 9
      //   105: invokevirtual 87	b/i/b/a/c/e/a$i:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   108: ifne -72 -> 36
      //   111: goto +402 -> 513
      //   114: iload_3
      //   115: istore 5
      //   117: iload_3
      //   118: istore 6
      //   120: iload_3
      //   121: istore 7
      //   123: aload_1
      //   124: invokevirtual 89	b/i/b/a/c/g/e:d	()I
      //   127: istore 4
      //   129: iload_3
      //   130: istore 5
      //   132: iload_3
      //   133: istore 6
      //   135: iload_3
      //   136: istore 7
      //   138: iload 4
      //   140: invokestatic 92	b/i/b/a/c/e/a$i$c:a	(I)Lb/i/b/a/c/e/a$i$c;
      //   143: astore 10
      //   145: aload 10
      //   147: ifnonnull +38 -> 185
      //   150: iload_3
      //   151: istore 5
      //   153: iload_3
      //   154: istore 6
      //   156: iload_3
      //   157: istore 7
      //   159: aload 12
      //   161: iload 9
      //   163: invokevirtual 95	b/i/b/a/c/g/f:e	(I)V
      //   166: iload_3
      //   167: istore 5
      //   169: iload_3
      //   170: istore 6
      //   172: iload_3
      //   173: istore 7
      //   175: aload 12
      //   177: iload 4
      //   179: invokevirtual 95	b/i/b/a/c/g/f:e	(I)V
      //   182: goto -146 -> 36
      //   185: iload_3
      //   186: istore 5
      //   188: iload_3
      //   189: istore 6
      //   191: iload_3
      //   192: istore 7
      //   194: aload_0
      //   195: aload_0
      //   196: getfield 97	b/i/b/a/c/e/a$i:g	I
      //   199: iconst_4
      //   200: ior
      //   201: putfield 97	b/i/b/a/c/e/a$i:g	I
      //   204: iload_3
      //   205: istore 5
      //   207: iload_3
      //   208: istore 6
      //   210: iload_3
      //   211: istore 7
      //   213: aload_0
      //   214: aload 10
      //   216: putfield 99	b/i/b/a/c/e/a$i:d	Lb/i/b/a/c/e/a$i$c;
      //   219: goto -183 -> 36
      //   222: aconst_null
      //   223: astore 10
      //   225: iload_3
      //   226: istore 5
      //   228: iload_3
      //   229: istore 6
      //   231: iload_3
      //   232: istore 7
      //   234: aload_0
      //   235: getfield 97	b/i/b/a/c/e/a$i:g	I
      //   238: iconst_2
      //   239: iand
      //   240: iconst_2
      //   241: if_icmpne +21 -> 262
      //   244: iload_3
      //   245: istore 5
      //   247: iload_3
      //   248: istore 6
      //   250: iload_3
      //   251: istore 7
      //   253: aload_0
      //   254: getfield 101	b/i/b/a/c/e/a$i:c	Lb/i/b/a/c/e/a$m;
      //   257: invokestatic 106	b/i/b/a/c/e/a$m:a	(Lb/i/b/a/c/e/a$m;)Lb/i/b/a/c/e/a$m$a;
      //   260: astore 10
      //   262: iload_3
      //   263: istore 5
      //   265: iload_3
      //   266: istore 6
      //   268: iload_3
      //   269: istore 7
      //   271: aload_0
      //   272: aload_1
      //   273: getstatic 107	b/i/b/a/c/e/a$m:a	Lb/i/b/a/c/g/s;
      //   276: aload_2
      //   277: invokevirtual 110	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   280: checkcast 103	b/i/b/a/c/e/a$m
      //   283: putfield 101	b/i/b/a/c/e/a$i:c	Lb/i/b/a/c/e/a$m;
      //   286: aload 10
      //   288: ifnull +40 -> 328
      //   291: iload_3
      //   292: istore 5
      //   294: iload_3
      //   295: istore 6
      //   297: iload_3
      //   298: istore 7
      //   300: aload 10
      //   302: aload_0
      //   303: getfield 101	b/i/b/a/c/e/a$i:c	Lb/i/b/a/c/e/a$m;
      //   306: invokevirtual 113	b/i/b/a/c/e/a$m$a:a	(Lb/i/b/a/c/e/a$m;)Lb/i/b/a/c/e/a$m$a;
      //   309: pop
      //   310: iload_3
      //   311: istore 5
      //   313: iload_3
      //   314: istore 6
      //   316: iload_3
      //   317: istore 7
      //   319: aload_0
      //   320: aload 10
      //   322: invokevirtual 116	b/i/b/a/c/e/a$m$a:f	()Lb/i/b/a/c/e/a$m;
      //   325: putfield 101	b/i/b/a/c/e/a$i:c	Lb/i/b/a/c/e/a$m;
      //   328: iload_3
      //   329: istore 5
      //   331: iload_3
      //   332: istore 6
      //   334: iload_3
      //   335: istore 7
      //   337: aload_0
      //   338: aload_0
      //   339: getfield 97	b/i/b/a/c/e/a$i:g	I
      //   342: iconst_2
      //   343: ior
      //   344: putfield 97	b/i/b/a/c/e/a$i:g	I
      //   347: goto -311 -> 36
      //   350: iload_3
      //   351: istore 4
      //   353: iload_3
      //   354: iconst_2
      //   355: iand
      //   356: iconst_2
      //   357: if_icmpeq +28 -> 385
      //   360: iload_3
      //   361: istore 5
      //   363: iload_3
      //   364: istore 6
      //   366: iload_3
      //   367: istore 7
      //   369: aload_0
      //   370: new 118	java/util/ArrayList
      //   373: dup
      //   374: invokespecial 119	java/util/ArrayList:<init>	()V
      //   377: putfield 121	b/i/b/a/c/e/a$i:h	Ljava/util/List;
      //   380: iload_3
      //   381: iconst_2
      //   382: ior
      //   383: istore 4
      //   385: iload 4
      //   387: istore 5
      //   389: iload 4
      //   391: istore 6
      //   393: iload 4
      //   395: istore 7
      //   397: aload_0
      //   398: getfield 121	b/i/b/a/c/e/a$i:h	Ljava/util/List;
      //   401: aload_1
      //   402: getstatic 107	b/i/b/a/c/e/a$m:a	Lb/i/b/a/c/g/s;
      //   405: aload_2
      //   406: invokevirtual 110	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   409: invokeinterface 127 2 0
      //   414: pop
      //   415: iload 4
      //   417: istore_3
      //   418: goto -382 -> 36
      //   421: iload_3
      //   422: istore 5
      //   424: iload_3
      //   425: istore 6
      //   427: iload_3
      //   428: istore 7
      //   430: aload_1
      //   431: invokevirtual 89	b/i/b/a/c/g/e:d	()I
      //   434: istore 4
      //   436: iload_3
      //   437: istore 5
      //   439: iload_3
      //   440: istore 6
      //   442: iload_3
      //   443: istore 7
      //   445: iload 4
      //   447: invokestatic 130	b/i/b/a/c/e/a$i$b:a	(I)Lb/i/b/a/c/e/a$i$b;
      //   450: astore 10
      //   452: aload 10
      //   454: ifnonnull +22 -> 476
      //   457: iload_3
      //   458: istore 5
      //   460: iload_3
      //   461: istore 6
      //   463: iload_3
      //   464: istore 7
      //   466: aload 12
      //   468: iload 9
      //   470: invokevirtual 95	b/i/b/a/c/g/f:e	(I)V
      //   473: goto -307 -> 166
      //   476: iload_3
      //   477: istore 5
      //   479: iload_3
      //   480: istore 6
      //   482: iload_3
      //   483: istore 7
      //   485: aload_0
      //   486: aload_0
      //   487: getfield 97	b/i/b/a/c/e/a$i:g	I
      //   490: iconst_1
      //   491: ior
      //   492: putfield 97	b/i/b/a/c/e/a$i:g	I
      //   495: iload_3
      //   496: istore 5
      //   498: iload_3
      //   499: istore 6
      //   501: iload_3
      //   502: istore 7
      //   504: aload_0
      //   505: aload 10
      //   507: putfield 132	b/i/b/a/c/e/a$i:b	Lb/i/b/a/c/e/a$i$b;
      //   510: goto -474 -> 36
      //   513: iconst_1
      //   514: istore 8
      //   516: goto -480 -> 36
      //   519: astore_1
      //   520: goto +51 -> 571
      //   523: astore_1
      //   524: iload 6
      //   526: istore 5
      //   528: new 69	b/i/b/a/c/g/k
      //   531: dup
      //   532: aload_1
      //   533: invokevirtual 136	java/io/IOException:getMessage	()Ljava/lang/String;
      //   536: invokespecial 139	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   539: astore_1
      //   540: iload 6
      //   542: istore 5
      //   544: aload_1
      //   545: aload_0
      //   546: putfield 142	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   549: iload 6
      //   551: istore 5
      //   553: aload_1
      //   554: athrow
      //   555: astore_1
      //   556: iload 7
      //   558: istore 5
      //   560: aload_1
      //   561: aload_0
      //   562: putfield 142	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   565: iload 7
      //   567: istore 5
      //   569: aload_1
      //   570: athrow
      //   571: iload 5
      //   573: iconst_2
      //   574: iand
      //   575: iconst_2
      //   576: if_icmpne +14 -> 590
      //   579: aload_0
      //   580: aload_0
      //   581: getfield 121	b/i/b/a/c/e/a$i:h	Ljava/util/List;
      //   584: invokestatic 148	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   587: putfield 121	b/i/b/a/c/e/a$i:h	Ljava/util/List;
      //   590: aload 12
      //   592: invokevirtual 150	b/i/b/a/c/g/f:a	()V
      //   595: aload_0
      //   596: aload 11
      //   598: invokevirtual 155	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   601: putfield 66	b/i/b/a/c/e/a$i:f	Lb/i/b/a/c/g/d;
      //   604: goto +15 -> 619
      //   607: astore_1
      //   608: aload_0
      //   609: aload 11
      //   611: invokevirtual 155	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   614: putfield 66	b/i/b/a/c/e/a$i:f	Lb/i/b/a/c/g/d;
      //   617: aload_1
      //   618: athrow
      //   619: aload_0
      //   620: invokevirtual 158	b/i/b/a/c/e/a$i:w	()V
      //   623: aload_1
      //   624: athrow
      //   625: iload_3
      //   626: iconst_2
      //   627: iand
      //   628: iconst_2
      //   629: if_icmpne +14 -> 643
      //   632: aload_0
      //   633: aload_0
      //   634: getfield 121	b/i/b/a/c/e/a$i:h	Ljava/util/List;
      //   637: invokestatic 148	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   640: putfield 121	b/i/b/a/c/e/a$i:h	Ljava/util/List;
      //   643: aload 12
      //   645: invokevirtual 150	b/i/b/a/c/g/f:a	()V
      //   648: aload_0
      //   649: aload 11
      //   651: invokevirtual 155	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   654: putfield 66	b/i/b/a/c/e/a$i:f	Lb/i/b/a/c/g/d;
      //   657: goto +15 -> 672
      //   660: astore_1
      //   661: aload_0
      //   662: aload 11
      //   664: invokevirtual 155	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   667: putfield 66	b/i/b/a/c/e/a$i:f	Lb/i/b/a/c/g/d;
      //   670: aload_1
      //   671: athrow
      //   672: aload_0
      //   673: invokevirtual 158	b/i/b/a/c/e/a$i:w	()V
      //   676: return
      //   677: astore_2
      //   678: goto -83 -> 595
      //   681: astore_1
      //   682: goto -34 -> 648
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	685	0	this	i
      //   0	685	1	parame	b.i.b.a.c.g.e
      //   0	685	2	paramg	g
      //   35	593	3	k	int
      //   127	319	4	m	int
      //   42	533	5	n	int
      //   45	505	6	i1	int
      //   48	518	7	i2	int
      //   32	483	8	i3	int
      //   54	415	9	i4	int
      //   143	363	10	localObject	Object
      //   21	642	11	localb	b.i.b.a.c.g.d.b
      //   29	615	12	localf	f
      // Exception table:
      //   from	to	target	type
      //   50	56	519	finally
      //   98	111	519	finally
      //   123	129	519	finally
      //   138	145	519	finally
      //   159	166	519	finally
      //   175	182	519	finally
      //   194	204	519	finally
      //   213	219	519	finally
      //   234	244	519	finally
      //   253	262	519	finally
      //   271	286	519	finally
      //   300	310	519	finally
      //   319	328	519	finally
      //   337	347	519	finally
      //   369	380	519	finally
      //   397	415	519	finally
      //   430	436	519	finally
      //   445	452	519	finally
      //   466	473	519	finally
      //   485	495	519	finally
      //   504	510	519	finally
      //   528	540	519	finally
      //   544	549	519	finally
      //   553	555	519	finally
      //   560	565	519	finally
      //   569	571	519	finally
      //   50	56	523	java/io/IOException
      //   98	111	523	java/io/IOException
      //   123	129	523	java/io/IOException
      //   138	145	523	java/io/IOException
      //   159	166	523	java/io/IOException
      //   175	182	523	java/io/IOException
      //   194	204	523	java/io/IOException
      //   213	219	523	java/io/IOException
      //   234	244	523	java/io/IOException
      //   253	262	523	java/io/IOException
      //   271	286	523	java/io/IOException
      //   300	310	523	java/io/IOException
      //   319	328	523	java/io/IOException
      //   337	347	523	java/io/IOException
      //   369	380	523	java/io/IOException
      //   397	415	523	java/io/IOException
      //   430	436	523	java/io/IOException
      //   445	452	523	java/io/IOException
      //   466	473	523	java/io/IOException
      //   485	495	523	java/io/IOException
      //   504	510	523	java/io/IOException
      //   50	56	555	b/i/b/a/c/g/k
      //   98	111	555	b/i/b/a/c/g/k
      //   123	129	555	b/i/b/a/c/g/k
      //   138	145	555	b/i/b/a/c/g/k
      //   159	166	555	b/i/b/a/c/g/k
      //   175	182	555	b/i/b/a/c/g/k
      //   194	204	555	b/i/b/a/c/g/k
      //   213	219	555	b/i/b/a/c/g/k
      //   234	244	555	b/i/b/a/c/g/k
      //   253	262	555	b/i/b/a/c/g/k
      //   271	286	555	b/i/b/a/c/g/k
      //   300	310	555	b/i/b/a/c/g/k
      //   319	328	555	b/i/b/a/c/g/k
      //   337	347	555	b/i/b/a/c/g/k
      //   369	380	555	b/i/b/a/c/g/k
      //   397	415	555	b/i/b/a/c/g/k
      //   430	436	555	b/i/b/a/c/g/k
      //   445	452	555	b/i/b/a/c/g/k
      //   466	473	555	b/i/b/a/c/g/k
      //   485	495	555	b/i/b/a/c/g/k
      //   504	510	555	b/i/b/a/c/g/k
      //   590	595	607	finally
      //   643	648	660	finally
      //   590	595	677	java/io/IOException
      //   643	648	681	java/io/IOException
    }
    
    private i(i.a parama)
    {
      super();
      this.f = parama.a;
    }
    
    public static i a()
    {
      return e;
    }
    
    private void k()
    {
      this.b = b.a;
      this.h = Collections.emptyList();
      this.c = a.m.a();
      this.d = c.a;
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      if ((this.g & 0x1) == 1) {
        paramf.b(1, this.b.d);
      }
      int k = 0;
      while (k < this.h.size())
      {
        paramf.a(2, (q)this.h.get(k));
        k += 1;
      }
      if ((this.g & 0x2) == 2) {
        paramf.a(3, this.c);
      }
      if ((this.g & 0x4) == 4) {
        paramf.b(4, this.d.d);
      }
      paramf.c(this.f);
    }
    
    public final s<i> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.g & 0x1) == 1;
    }
    
    public final boolean d()
    {
      return (this.g & 0x2) == 2;
    }
    
    public final boolean e()
    {
      int k = this.i;
      if (k == 1) {
        return true;
      }
      if (k == 0) {
        return false;
      }
      k = 0;
      while (k < this.h.size())
      {
        if (!((a.m)this.h.get(k)).e())
        {
          this.i = 0;
          return false;
        }
        k += 1;
      }
      if ((d()) && (!this.c.e()))
      {
        this.i = 0;
        return false;
      }
      this.i = 1;
      return true;
    }
    
    public final int f()
    {
      int k = this.j;
      if (k != -1) {
        return k;
      }
      k = this.g;
      int m = 0;
      if ((k & 0x1) == 1) {
        k = f.d(1, this.b.d) + 0;
      } else {
        k = 0;
      }
      while (m < this.h.size())
      {
        k += f.c(2, (q)this.h.get(m));
        m += 1;
      }
      m = k;
      if ((this.g & 0x2) == 2) {
        m = k + f.c(3, this.c);
      }
      k = m;
      if ((this.g & 0x4) == 4) {
        k = m + f.d(4, this.d.d);
      }
      k += this.f.a();
      this.j = k;
      return k;
    }
    
    public final boolean g()
    {
      return (this.g & 0x4) == 4;
    }
    
    public static final class a
      extends i.a<a.i, a>
      implements a.j
    {
      private int b;
      private a.i.b c = a.i.b.a;
      private List<a.m> d = Collections.emptyList();
      private a.m e = a.m.a();
      private a.i.c f = a.i.c.a;
      
      private a a(a.i.b paramb)
      {
        if (paramb != null)
        {
          this.b |= 0x1;
          this.c = paramb;
          return this;
        }
        throw new NullPointerException();
      }
      
      private a a(a.i.c paramc)
      {
        if (paramc != null)
        {
          this.b |= 0x8;
          this.f = paramc;
          return this;
        }
        throw new NullPointerException();
      }
      
      private a a(a.m paramm)
      {
        a.m localm = paramm;
        if ((this.b & 0x4) == 4)
        {
          localm = paramm;
          if (this.e != a.m.a()) {
            localm = a.m.a(this.e).a(paramm).f();
          }
        }
        this.e = localm;
        this.b |= 0x4;
        return this;
      }
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 80	b/i/b/a/c/e/a$i:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 85 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$i
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 88	b/i/b/a/c/e/a$i$a:a	(Lb/i/b/a/c/e/a$i;)Lb/i/b/a/c/e/a$i$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 91	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$i
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 88	b/i/b/a/c/e/a$i$a:a	(Lb/i/b/a/c/e/a$i;)Lb/i/b/a/c/e/a$i$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a g()
      {
        return new a().a(h());
      }
      
      private a.i h()
      {
        int j = 0;
        a.i locali = new a.i(this, (byte)0);
        int k = this.b;
        if ((k & 0x1) == 1) {
          j = 1;
        }
        a.i.a(locali, this.c);
        if ((this.b & 0x2) == 2)
        {
          this.d = Collections.unmodifiableList(this.d);
          this.b &= 0xFFFFFFFD;
        }
        a.i.a(locali, this.d);
        int i = j;
        if ((k & 0x4) == 4) {
          i = j | 0x2;
        }
        a.i.a(locali, this.e);
        j = i;
        if ((k & 0x8) == 8) {
          j = i | 0x4;
        }
        a.i.a(locali, this.f);
        a.i.a(locali, j);
        return locali;
      }
      
      private void i()
      {
        if ((this.b & 0x2) != 2)
        {
          this.d = new ArrayList(this.d);
          this.b |= 0x2;
        }
      }
      
      public final a a(a.i parami)
      {
        if (parami == a.i.a()) {
          return this;
        }
        if (parami.c()) {
          a(parami.b);
        }
        if (!a.i.a(parami).isEmpty()) {
          if (this.d.isEmpty())
          {
            this.d = a.i.a(parami);
            this.b &= 0xFFFFFFFD;
          }
          else
          {
            i();
            this.d.addAll(a.i.a(parami));
          }
        }
        if (parami.d()) {
          a(parami.c);
        }
        if (parami.g()) {
          a(parami.d);
        }
        this.a = this.a.a(a.i.b(parami));
        return this;
      }
      
      public final boolean e()
      {
        int i = 0;
        while (i < this.d.size())
        {
          if (!((a.m)this.d.get(i)).e()) {
            return false;
          }
          i += 1;
        }
        if ((this.b & 0x4) == 4) {
          i = 1;
        } else {
          i = 0;
        }
        return (i == 0) || (this.e.e());
      }
    }
    
    public static enum b
      implements j.a
    {
      private static j.b<b> e = new j.b() {};
      final int d;
      
      private b(int paramInt1, int paramInt2)
      {
        this.d = paramInt1;
      }
      
      public static b a(int paramInt)
      {
        switch (paramInt)
        {
        default: 
          return null;
        case 2: 
          return c;
        case 1: 
          return b;
        }
        return a;
      }
      
      public final int a()
      {
        return this.d;
      }
    }
    
    public static enum c
      implements j.a
    {
      private static j.b<c> e = new j.b() {};
      final int d;
      
      private c(int paramInt1, int paramInt2)
      {
        this.d = paramInt1;
      }
      
      public static c a(int paramInt)
      {
        switch (paramInt)
        {
        default: 
          return null;
        case 2: 
          return c;
        case 1: 
          return b;
        }
        return a;
      }
      
      public final int a()
      {
        return this.d;
      }
    }
  }
  
  public static abstract interface j
    extends r
  {}
  
  public static final class k
    extends i.c<k>
    implements a.l
  {
    public static s<k> a = new b() {};
    private static final k c;
    public int b;
    private final d d;
    private int e;
    private byte f = -1;
    private int g = -1;
    
    static
    {
      k localk = new k();
      c = localk;
      localk.b = 0;
    }
    
    private k()
    {
      this.d = d.b;
    }
    
    /* Error */
    private k(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 41	b/i/b/a/c/g/i$c:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 43	b/i/b/a/c/e/a$k:f	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 45	b/i/b/a/c/e/a$k:g	I
      //   14: iconst_0
      //   15: istore_3
      //   16: aload_0
      //   17: iconst_0
      //   18: putfield 39	b/i/b/a/c/e/a$k:b	I
      //   21: invokestatic 60	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   24: astore 5
      //   26: aload 5
      //   28: iconst_1
      //   29: invokestatic 65	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   32: astore 6
      //   34: iload_3
      //   35: ifne +133 -> 168
      //   38: aload_1
      //   39: invokevirtual 70	b/i/b/a/c/g/e:a	()I
      //   42: istore 4
      //   44: iload 4
      //   46: ifeq +47 -> 93
      //   49: iload 4
      //   51: bipush 8
      //   53: if_icmpeq +19 -> 72
      //   56: aload_0
      //   57: aload_1
      //   58: aload 6
      //   60: aload_2
      //   61: iload 4
      //   63: invokevirtual 73	b/i/b/a/c/e/a$k:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   66: ifne -32 -> 34
      //   69: goto +24 -> 93
      //   72: aload_0
      //   73: aload_0
      //   74: getfield 75	b/i/b/a/c/e/a$k:e	I
      //   77: iconst_1
      //   78: ior
      //   79: putfield 75	b/i/b/a/c/e/a$k:e	I
      //   82: aload_0
      //   83: aload_1
      //   84: invokevirtual 77	b/i/b/a/c/g/e:d	()I
      //   87: putfield 39	b/i/b/a/c/e/a$k:b	I
      //   90: goto -56 -> 34
      //   93: iconst_1
      //   94: istore_3
      //   95: goto -61 -> 34
      //   98: astore_1
      //   99: goto +31 -> 130
      //   102: astore_1
      //   103: new 54	b/i/b/a/c/g/k
      //   106: dup
      //   107: aload_1
      //   108: invokevirtual 81	java/io/IOException:getMessage	()Ljava/lang/String;
      //   111: invokespecial 84	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   114: astore_1
      //   115: aload_1
      //   116: aload_0
      //   117: putfield 87	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   120: aload_1
      //   121: athrow
      //   122: astore_1
      //   123: aload_1
      //   124: aload_0
      //   125: putfield 87	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   128: aload_1
      //   129: athrow
      //   130: aload 6
      //   132: invokevirtual 89	b/i/b/a/c/g/f:a	()V
      //   135: aload_0
      //   136: aload 5
      //   138: invokevirtual 94	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   141: putfield 51	b/i/b/a/c/e/a$k:d	Lb/i/b/a/c/g/d;
      //   144: goto +15 -> 159
      //   147: astore_1
      //   148: aload_0
      //   149: aload 5
      //   151: invokevirtual 94	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   154: putfield 51	b/i/b/a/c/e/a$k:d	Lb/i/b/a/c/g/d;
      //   157: aload_1
      //   158: athrow
      //   159: aload_0
      //   160: getfield 98	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   163: invokevirtual 102	b/i/b/a/c/g/h:c	()V
      //   166: aload_1
      //   167: athrow
      //   168: aload 6
      //   170: invokevirtual 89	b/i/b/a/c/g/f:a	()V
      //   173: aload_0
      //   174: aload 5
      //   176: invokevirtual 94	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   179: putfield 51	b/i/b/a/c/e/a$k:d	Lb/i/b/a/c/g/d;
      //   182: goto +15 -> 197
      //   185: astore_1
      //   186: aload_0
      //   187: aload 5
      //   189: invokevirtual 94	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   192: putfield 51	b/i/b/a/c/e/a$k:d	Lb/i/b/a/c/g/d;
      //   195: aload_1
      //   196: athrow
      //   197: aload_0
      //   198: getfield 98	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   201: invokevirtual 102	b/i/b/a/c/g/h:c	()V
      //   204: return
      //   205: astore_2
      //   206: goto -71 -> 135
      //   209: astore_1
      //   210: goto -37 -> 173
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	213	0	this	k
      //   0	213	1	parame	b.i.b.a.c.g.e
      //   0	213	2	paramg	g
      //   15	80	3	i	int
      //   42	20	4	j	int
      //   24	164	5	localb	b.i.b.a.c.g.d.b
      //   32	137	6	localf	f
      // Exception table:
      //   from	to	target	type
      //   38	44	98	finally
      //   56	69	98	finally
      //   72	90	98	finally
      //   103	122	98	finally
      //   123	130	98	finally
      //   38	44	102	java/io/IOException
      //   56	69	102	java/io/IOException
      //   72	90	102	java/io/IOException
      //   38	44	122	b/i/b/a/c/g/k
      //   56	69	122	b/i/b/a/c/g/k
      //   72	90	122	b/i/b/a/c/g/k
      //   130	135	147	finally
      //   168	173	185	finally
      //   130	135	205	java/io/IOException
      //   168	173	209	java/io/IOException
    }
    
    private k(i.b<k, ?> paramb)
    {
      super();
      this.d = paramb.a;
    }
    
    public static k a()
    {
      return c;
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      i.c.a locala = x();
      if ((this.e & 0x1) == 1) {
        paramf.a(1, this.b);
      }
      locala.a(200, paramf);
      paramf.c(this.d);
    }
    
    public final s<k> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.e & 0x1) == 1;
    }
    
    public final boolean e()
    {
      int i = this.f;
      if (i == 1) {
        return true;
      }
      if (i == 0) {
        return false;
      }
      if (!this.s.e())
      {
        this.f = 0;
        return false;
      }
      this.f = 1;
      return true;
    }
    
    public final int f()
    {
      int i = this.g;
      if (i != -1) {
        return i;
      }
      int j = this.e;
      i = 0;
      if ((j & 0x1) == 1) {
        i = 0 + f.c(1, this.b);
      }
      i = i + this.s.f() + this.d.a();
      this.g = i;
      return i;
    }
    
    public static final class a
      extends i.b<a.k, a>
      implements a.l
    {
      private int c;
      private int d;
      
      private a a(int paramInt)
      {
        this.c |= 0x1;
        this.d = paramInt;
        return this;
      }
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 34	b/i/b/a/c/e/a$k:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 39 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$k
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 42	b/i/b/a/c/e/a$k$a:a	(Lb/i/b/a/c/e/a$k;)Lb/i/b/a/c/e/a$k$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 45	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$k
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 42	b/i/b/a/c/e/a$k$a:a	(Lb/i/b/a/c/e/a$k;)Lb/i/b/a/c/e/a$k$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a h()
      {
        return new a().a(i());
      }
      
      private a.k i()
      {
        int i = 0;
        a.k localk = new a.k(this, (byte)0);
        if ((this.c & 0x1) == 1) {
          i = 1;
        }
        a.k.a(localk, this.d);
        a.k.b(localk, i);
        return localk;
      }
      
      public final a a(a.k paramk)
      {
        if (paramk == a.k.a()) {
          return this;
        }
        if (paramk.c()) {
          a(paramk.b);
        }
        a(paramk);
        this.a = this.a.a(a.k.a(paramk));
        return this;
      }
      
      public final boolean e()
      {
        return this.b.e();
      }
    }
  }
  
  public static abstract interface l
    extends i.d
  {}
  
  public static final class m
    extends i
    implements a.n
  {
    public static s<m> a = new b() {};
    private static final m g;
    int b;
    int c;
    b d;
    a.aa e;
    int f;
    private final d h;
    private int i;
    private List<m> j;
    private List<m> k;
    private byte l = -1;
    private int m = -1;
    
    static
    {
      m localm = new m();
      g = localm;
      localm.m();
    }
    
    private m()
    {
      this.h = d.b;
    }
    
    /* Error */
    private m(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 53	b/i/b/a/c/g/i:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 55	b/i/b/a/c/e/a$m:l	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 57	b/i/b/a/c/e/a$m:m	I
      //   14: aload_0
      //   15: invokespecial 51	b/i/b/a/c/e/a$m:m	()V
      //   18: invokestatic 71	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   21: astore 12
      //   23: aload 12
      //   25: iconst_1
      //   26: invokestatic 76	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   29: astore 13
      //   31: iconst_0
      //   32: istore 8
      //   34: iconst_0
      //   35: istore_3
      //   36: iload 8
      //   38: ifne +776 -> 814
      //   41: iload_3
      //   42: istore 4
      //   44: iload_3
      //   45: istore 6
      //   47: iload_3
      //   48: istore 7
      //   50: aload_1
      //   51: invokevirtual 81	b/i/b/a/c/g/e:a	()I
      //   54: istore 5
      //   56: iload 5
      //   58: ifeq +621 -> 679
      //   61: iload 5
      //   63: bipush 8
      //   65: if_icmpeq +575 -> 640
      //   68: iload 5
      //   70: bipush 16
      //   72: if_icmpeq +529 -> 601
      //   75: iload 5
      //   77: bipush 24
      //   79: if_icmpeq +414 -> 493
      //   82: iload 5
      //   84: bipush 34
      //   86: if_icmpeq +276 -> 362
      //   89: iload 5
      //   91: bipush 40
      //   93: if_icmpeq +229 -> 322
      //   96: iload 5
      //   98: bipush 50
      //   100: if_icmpeq +138 -> 238
      //   103: iload 5
      //   105: bipush 58
      //   107: if_icmpeq +28 -> 135
      //   110: iload_3
      //   111: istore 4
      //   113: iload_3
      //   114: istore 6
      //   116: iload_3
      //   117: istore 7
      //   119: aload_0
      //   120: aload_1
      //   121: aload 13
      //   123: aload_2
      //   124: iload 5
      //   126: invokevirtual 84	b/i/b/a/c/e/a$m:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   129: ifne -93 -> 36
      //   132: goto +547 -> 679
      //   135: iload_3
      //   136: istore 5
      //   138: iload_3
      //   139: bipush 64
      //   141: iand
      //   142: bipush 64
      //   144: if_icmpeq +29 -> 173
      //   147: iload_3
      //   148: istore 4
      //   150: iload_3
      //   151: istore 6
      //   153: iload_3
      //   154: istore 7
      //   156: aload_0
      //   157: new 86	java/util/ArrayList
      //   160: dup
      //   161: invokespecial 87	java/util/ArrayList:<init>	()V
      //   164: putfield 89	b/i/b/a/c/e/a$m:k	Ljava/util/List;
      //   167: iload_3
      //   168: bipush 64
      //   170: ior
      //   171: istore 5
      //   173: iload 5
      //   175: istore 4
      //   177: iload 5
      //   179: istore 6
      //   181: iload 5
      //   183: istore 7
      //   185: aload_0
      //   186: getfield 89	b/i/b/a/c/e/a$m:k	Ljava/util/List;
      //   189: astore 10
      //   191: iload 5
      //   193: istore 4
      //   195: iload 5
      //   197: istore 6
      //   199: iload 5
      //   201: istore 7
      //   203: aload_1
      //   204: getstatic 46	b/i/b/a/c/e/a$m:a	Lb/i/b/a/c/g/s;
      //   207: aload_2
      //   208: invokevirtual 92	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   211: astore 11
      //   213: iload 5
      //   215: istore_3
      //   216: iload_3
      //   217: istore 4
      //   219: iload_3
      //   220: istore 6
      //   222: iload_3
      //   223: istore 7
      //   225: aload 10
      //   227: aload 11
      //   229: invokeinterface 98 2 0
      //   234: pop
      //   235: goto -199 -> 36
      //   238: iload_3
      //   239: istore 5
      //   241: iload_3
      //   242: bipush 32
      //   244: iand
      //   245: bipush 32
      //   247: if_icmpeq +29 -> 276
      //   250: iload_3
      //   251: istore 4
      //   253: iload_3
      //   254: istore 6
      //   256: iload_3
      //   257: istore 7
      //   259: aload_0
      //   260: new 86	java/util/ArrayList
      //   263: dup
      //   264: invokespecial 87	java/util/ArrayList:<init>	()V
      //   267: putfield 100	b/i/b/a/c/e/a$m:j	Ljava/util/List;
      //   270: iload_3
      //   271: bipush 32
      //   273: ior
      //   274: istore 5
      //   276: iload 5
      //   278: istore 4
      //   280: iload 5
      //   282: istore 6
      //   284: iload 5
      //   286: istore 7
      //   288: aload_0
      //   289: getfield 100	b/i/b/a/c/e/a$m:j	Ljava/util/List;
      //   292: astore 10
      //   294: iload 5
      //   296: istore 4
      //   298: iload 5
      //   300: istore 6
      //   302: iload 5
      //   304: istore 7
      //   306: aload_1
      //   307: getstatic 46	b/i/b/a/c/e/a$m:a	Lb/i/b/a/c/g/s;
      //   310: aload_2
      //   311: invokevirtual 92	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   314: astore 11
      //   316: iload 5
      //   318: istore_3
      //   319: goto -103 -> 216
      //   322: iload_3
      //   323: istore 4
      //   325: iload_3
      //   326: istore 6
      //   328: iload_3
      //   329: istore 7
      //   331: aload_0
      //   332: aload_0
      //   333: getfield 102	b/i/b/a/c/e/a$m:i	I
      //   336: bipush 16
      //   338: ior
      //   339: putfield 102	b/i/b/a/c/e/a$m:i	I
      //   342: iload_3
      //   343: istore 4
      //   345: iload_3
      //   346: istore 6
      //   348: iload_3
      //   349: istore 7
      //   351: aload_0
      //   352: aload_1
      //   353: invokevirtual 104	b/i/b/a/c/g/e:d	()I
      //   356: putfield 106	b/i/b/a/c/e/a$m:f	I
      //   359: goto -323 -> 36
      //   362: aconst_null
      //   363: astore 10
      //   365: iload_3
      //   366: istore 4
      //   368: iload_3
      //   369: istore 6
      //   371: iload_3
      //   372: istore 7
      //   374: aload_0
      //   375: getfield 102	b/i/b/a/c/e/a$m:i	I
      //   378: bipush 8
      //   380: iand
      //   381: bipush 8
      //   383: if_icmpne +21 -> 404
      //   386: iload_3
      //   387: istore 4
      //   389: iload_3
      //   390: istore 6
      //   392: iload_3
      //   393: istore 7
      //   395: aload_0
      //   396: getfield 108	b/i/b/a/c/e/a$m:e	Lb/i/b/a/c/e/a$aa;
      //   399: invokestatic 113	b/i/b/a/c/e/a$aa:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   402: astore 10
      //   404: iload_3
      //   405: istore 4
      //   407: iload_3
      //   408: istore 6
      //   410: iload_3
      //   411: istore 7
      //   413: aload_0
      //   414: aload_1
      //   415: getstatic 114	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   418: aload_2
      //   419: invokevirtual 92	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   422: checkcast 110	b/i/b/a/c/e/a$aa
      //   425: putfield 108	b/i/b/a/c/e/a$m:e	Lb/i/b/a/c/e/a$aa;
      //   428: aload 10
      //   430: ifnull +40 -> 470
      //   433: iload_3
      //   434: istore 4
      //   436: iload_3
      //   437: istore 6
      //   439: iload_3
      //   440: istore 7
      //   442: aload 10
      //   444: aload_0
      //   445: getfield 108	b/i/b/a/c/e/a$m:e	Lb/i/b/a/c/e/a$aa;
      //   448: invokevirtual 117	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   451: pop
      //   452: iload_3
      //   453: istore 4
      //   455: iload_3
      //   456: istore 6
      //   458: iload_3
      //   459: istore 7
      //   461: aload_0
      //   462: aload 10
      //   464: invokevirtual 120	b/i/b/a/c/e/a$aa$c:h	()Lb/i/b/a/c/e/a$aa;
      //   467: putfield 108	b/i/b/a/c/e/a$m:e	Lb/i/b/a/c/e/a$aa;
      //   470: iload_3
      //   471: istore 4
      //   473: iload_3
      //   474: istore 6
      //   476: iload_3
      //   477: istore 7
      //   479: aload_0
      //   480: aload_0
      //   481: getfield 102	b/i/b/a/c/e/a$m:i	I
      //   484: bipush 8
      //   486: ior
      //   487: putfield 102	b/i/b/a/c/e/a$m:i	I
      //   490: goto -454 -> 36
      //   493: iload_3
      //   494: istore 4
      //   496: iload_3
      //   497: istore 6
      //   499: iload_3
      //   500: istore 7
      //   502: aload_1
      //   503: invokevirtual 104	b/i/b/a/c/g/e:d	()I
      //   506: istore 9
      //   508: iload_3
      //   509: istore 4
      //   511: iload_3
      //   512: istore 6
      //   514: iload_3
      //   515: istore 7
      //   517: iload 9
      //   519: invokestatic 123	b/i/b/a/c/e/a$m$b:a	(I)Lb/i/b/a/c/e/a$m$b;
      //   522: astore 10
      //   524: aload 10
      //   526: ifnonnull +38 -> 564
      //   529: iload_3
      //   530: istore 4
      //   532: iload_3
      //   533: istore 6
      //   535: iload_3
      //   536: istore 7
      //   538: aload 13
      //   540: iload 5
      //   542: invokevirtual 126	b/i/b/a/c/g/f:e	(I)V
      //   545: iload_3
      //   546: istore 4
      //   548: iload_3
      //   549: istore 6
      //   551: iload_3
      //   552: istore 7
      //   554: aload 13
      //   556: iload 9
      //   558: invokevirtual 126	b/i/b/a/c/g/f:e	(I)V
      //   561: goto -525 -> 36
      //   564: iload_3
      //   565: istore 4
      //   567: iload_3
      //   568: istore 6
      //   570: iload_3
      //   571: istore 7
      //   573: aload_0
      //   574: aload_0
      //   575: getfield 102	b/i/b/a/c/e/a$m:i	I
      //   578: iconst_4
      //   579: ior
      //   580: putfield 102	b/i/b/a/c/e/a$m:i	I
      //   583: iload_3
      //   584: istore 4
      //   586: iload_3
      //   587: istore 6
      //   589: iload_3
      //   590: istore 7
      //   592: aload_0
      //   593: aload 10
      //   595: putfield 128	b/i/b/a/c/e/a$m:d	Lb/i/b/a/c/e/a$m$b;
      //   598: goto -562 -> 36
      //   601: iload_3
      //   602: istore 4
      //   604: iload_3
      //   605: istore 6
      //   607: iload_3
      //   608: istore 7
      //   610: aload_0
      //   611: aload_0
      //   612: getfield 102	b/i/b/a/c/e/a$m:i	I
      //   615: iconst_2
      //   616: ior
      //   617: putfield 102	b/i/b/a/c/e/a$m:i	I
      //   620: iload_3
      //   621: istore 4
      //   623: iload_3
      //   624: istore 6
      //   626: iload_3
      //   627: istore 7
      //   629: aload_0
      //   630: aload_1
      //   631: invokevirtual 104	b/i/b/a/c/g/e:d	()I
      //   634: putfield 130	b/i/b/a/c/e/a$m:c	I
      //   637: goto -601 -> 36
      //   640: iload_3
      //   641: istore 4
      //   643: iload_3
      //   644: istore 6
      //   646: iload_3
      //   647: istore 7
      //   649: aload_0
      //   650: aload_0
      //   651: getfield 102	b/i/b/a/c/e/a$m:i	I
      //   654: iconst_1
      //   655: ior
      //   656: putfield 102	b/i/b/a/c/e/a$m:i	I
      //   659: iload_3
      //   660: istore 4
      //   662: iload_3
      //   663: istore 6
      //   665: iload_3
      //   666: istore 7
      //   668: aload_0
      //   669: aload_1
      //   670: invokevirtual 104	b/i/b/a/c/g/e:d	()I
      //   673: putfield 132	b/i/b/a/c/e/a$m:b	I
      //   676: goto -640 -> 36
      //   679: iconst_1
      //   680: istore 8
      //   682: goto -646 -> 36
      //   685: astore_1
      //   686: goto +51 -> 737
      //   689: astore_1
      //   690: iload 6
      //   692: istore 4
      //   694: new 66	b/i/b/a/c/g/k
      //   697: dup
      //   698: aload_1
      //   699: invokevirtual 136	java/io/IOException:getMessage	()Ljava/lang/String;
      //   702: invokespecial 139	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   705: astore_1
      //   706: iload 6
      //   708: istore 4
      //   710: aload_1
      //   711: aload_0
      //   712: putfield 142	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   715: iload 6
      //   717: istore 4
      //   719: aload_1
      //   720: athrow
      //   721: astore_1
      //   722: iload 7
      //   724: istore 4
      //   726: aload_1
      //   727: aload_0
      //   728: putfield 142	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   731: iload 7
      //   733: istore 4
      //   735: aload_1
      //   736: athrow
      //   737: iload 4
      //   739: bipush 32
      //   741: iand
      //   742: bipush 32
      //   744: if_icmpne +14 -> 758
      //   747: aload_0
      //   748: aload_0
      //   749: getfield 100	b/i/b/a/c/e/a$m:j	Ljava/util/List;
      //   752: invokestatic 148	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   755: putfield 100	b/i/b/a/c/e/a$m:j	Ljava/util/List;
      //   758: iload 4
      //   760: bipush 64
      //   762: iand
      //   763: bipush 64
      //   765: if_icmpne +14 -> 779
      //   768: aload_0
      //   769: aload_0
      //   770: getfield 89	b/i/b/a/c/e/a$m:k	Ljava/util/List;
      //   773: invokestatic 148	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   776: putfield 89	b/i/b/a/c/e/a$m:k	Ljava/util/List;
      //   779: aload 13
      //   781: invokevirtual 150	b/i/b/a/c/g/f:a	()V
      //   784: aload_0
      //   785: aload 12
      //   787: invokevirtual 155	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   790: putfield 63	b/i/b/a/c/e/a$m:h	Lb/i/b/a/c/g/d;
      //   793: goto +15 -> 808
      //   796: astore_1
      //   797: aload_0
      //   798: aload 12
      //   800: invokevirtual 155	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   803: putfield 63	b/i/b/a/c/e/a$m:h	Lb/i/b/a/c/g/d;
      //   806: aload_1
      //   807: athrow
      //   808: aload_0
      //   809: invokevirtual 158	b/i/b/a/c/e/a$m:w	()V
      //   812: aload_1
      //   813: athrow
      //   814: iload_3
      //   815: bipush 32
      //   817: iand
      //   818: bipush 32
      //   820: if_icmpne +14 -> 834
      //   823: aload_0
      //   824: aload_0
      //   825: getfield 100	b/i/b/a/c/e/a$m:j	Ljava/util/List;
      //   828: invokestatic 148	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   831: putfield 100	b/i/b/a/c/e/a$m:j	Ljava/util/List;
      //   834: iload_3
      //   835: bipush 64
      //   837: iand
      //   838: bipush 64
      //   840: if_icmpne +14 -> 854
      //   843: aload_0
      //   844: aload_0
      //   845: getfield 89	b/i/b/a/c/e/a$m:k	Ljava/util/List;
      //   848: invokestatic 148	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   851: putfield 89	b/i/b/a/c/e/a$m:k	Ljava/util/List;
      //   854: aload 13
      //   856: invokevirtual 150	b/i/b/a/c/g/f:a	()V
      //   859: aload_0
      //   860: aload 12
      //   862: invokevirtual 155	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   865: putfield 63	b/i/b/a/c/e/a$m:h	Lb/i/b/a/c/g/d;
      //   868: goto +15 -> 883
      //   871: astore_1
      //   872: aload_0
      //   873: aload 12
      //   875: invokevirtual 155	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   878: putfield 63	b/i/b/a/c/e/a$m:h	Lb/i/b/a/c/g/d;
      //   881: aload_1
      //   882: athrow
      //   883: aload_0
      //   884: invokevirtual 158	b/i/b/a/c/e/a$m:w	()V
      //   887: return
      //   888: astore_2
      //   889: goto -105 -> 784
      //   892: astore_1
      //   893: goto -34 -> 859
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	896	0	this	m
      //   0	896	1	parame	b.i.b.a.c.g.e
      //   0	896	2	paramg	g
      //   35	803	3	n	int
      //   42	721	4	i1	int
      //   54	487	5	i2	int
      //   45	671	6	i3	int
      //   48	684	7	i4	int
      //   32	649	8	i5	int
      //   506	51	9	i6	int
      //   189	405	10	localObject	Object
      //   211	104	11	localq	q
      //   21	853	12	localb	b.i.b.a.c.g.d.b
      //   29	826	13	localf	f
      // Exception table:
      //   from	to	target	type
      //   50	56	685	finally
      //   119	132	685	finally
      //   156	167	685	finally
      //   185	191	685	finally
      //   203	213	685	finally
      //   225	235	685	finally
      //   259	270	685	finally
      //   288	294	685	finally
      //   306	316	685	finally
      //   331	342	685	finally
      //   351	359	685	finally
      //   374	386	685	finally
      //   395	404	685	finally
      //   413	428	685	finally
      //   442	452	685	finally
      //   461	470	685	finally
      //   479	490	685	finally
      //   502	508	685	finally
      //   517	524	685	finally
      //   538	545	685	finally
      //   554	561	685	finally
      //   573	583	685	finally
      //   592	598	685	finally
      //   610	620	685	finally
      //   629	637	685	finally
      //   649	659	685	finally
      //   668	676	685	finally
      //   694	706	685	finally
      //   710	715	685	finally
      //   719	721	685	finally
      //   726	731	685	finally
      //   735	737	685	finally
      //   50	56	689	java/io/IOException
      //   119	132	689	java/io/IOException
      //   156	167	689	java/io/IOException
      //   185	191	689	java/io/IOException
      //   203	213	689	java/io/IOException
      //   225	235	689	java/io/IOException
      //   259	270	689	java/io/IOException
      //   288	294	689	java/io/IOException
      //   306	316	689	java/io/IOException
      //   331	342	689	java/io/IOException
      //   351	359	689	java/io/IOException
      //   374	386	689	java/io/IOException
      //   395	404	689	java/io/IOException
      //   413	428	689	java/io/IOException
      //   442	452	689	java/io/IOException
      //   461	470	689	java/io/IOException
      //   479	490	689	java/io/IOException
      //   502	508	689	java/io/IOException
      //   517	524	689	java/io/IOException
      //   538	545	689	java/io/IOException
      //   554	561	689	java/io/IOException
      //   573	583	689	java/io/IOException
      //   592	598	689	java/io/IOException
      //   610	620	689	java/io/IOException
      //   629	637	689	java/io/IOException
      //   649	659	689	java/io/IOException
      //   668	676	689	java/io/IOException
      //   50	56	721	b/i/b/a/c/g/k
      //   119	132	721	b/i/b/a/c/g/k
      //   156	167	721	b/i/b/a/c/g/k
      //   185	191	721	b/i/b/a/c/g/k
      //   203	213	721	b/i/b/a/c/g/k
      //   225	235	721	b/i/b/a/c/g/k
      //   259	270	721	b/i/b/a/c/g/k
      //   288	294	721	b/i/b/a/c/g/k
      //   306	316	721	b/i/b/a/c/g/k
      //   331	342	721	b/i/b/a/c/g/k
      //   351	359	721	b/i/b/a/c/g/k
      //   374	386	721	b/i/b/a/c/g/k
      //   395	404	721	b/i/b/a/c/g/k
      //   413	428	721	b/i/b/a/c/g/k
      //   442	452	721	b/i/b/a/c/g/k
      //   461	470	721	b/i/b/a/c/g/k
      //   479	490	721	b/i/b/a/c/g/k
      //   502	508	721	b/i/b/a/c/g/k
      //   517	524	721	b/i/b/a/c/g/k
      //   538	545	721	b/i/b/a/c/g/k
      //   554	561	721	b/i/b/a/c/g/k
      //   573	583	721	b/i/b/a/c/g/k
      //   592	598	721	b/i/b/a/c/g/k
      //   610	620	721	b/i/b/a/c/g/k
      //   629	637	721	b/i/b/a/c/g/k
      //   649	659	721	b/i/b/a/c/g/k
      //   668	676	721	b/i/b/a/c/g/k
      //   779	784	796	finally
      //   854	859	871	finally
      //   779	784	888	java/io/IOException
      //   854	859	892	java/io/IOException
    }
    
    private m(i.a parama)
    {
      super();
      this.h = parama.a;
    }
    
    public static a a(m paramm)
    {
      return a.g().a(paramm);
    }
    
    public static m a()
    {
      return g;
    }
    
    private void m()
    {
      this.b = 0;
      this.c = 0;
      this.d = b.a;
      this.e = a.aa.a();
      this.f = 0;
      this.j = Collections.emptyList();
      this.k = Collections.emptyList();
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      if ((this.i & 0x1) == 1) {
        paramf.a(1, this.b);
      }
      if ((this.i & 0x2) == 2) {
        paramf.a(2, this.c);
      }
      if ((this.i & 0x4) == 4) {
        paramf.b(3, this.d.d);
      }
      if ((this.i & 0x8) == 8) {
        paramf.a(4, this.e);
      }
      if ((this.i & 0x10) == 16) {
        paramf.a(5, this.f);
      }
      int i2 = 0;
      int n = 0;
      int i1;
      for (;;)
      {
        i1 = i2;
        if (n >= this.j.size()) {
          break;
        }
        paramf.a(6, (q)this.j.get(n));
        n += 1;
      }
      while (i1 < this.k.size())
      {
        paramf.a(7, (q)this.k.get(i1));
        i1 += 1;
      }
      paramf.c(this.h);
    }
    
    public final s<m> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.i & 0x1) == 1;
    }
    
    public final boolean d()
    {
      return (this.i & 0x2) == 2;
    }
    
    public final boolean e()
    {
      int n = this.l;
      if (n == 1) {
        return true;
      }
      if (n == 0) {
        return false;
      }
      if ((k()) && (!this.e.e()))
      {
        this.l = 0;
        return false;
      }
      n = 0;
      while (n < this.j.size())
      {
        if (!((m)this.j.get(n)).e())
        {
          this.l = 0;
          return false;
        }
        n += 1;
      }
      n = 0;
      while (n < this.k.size())
      {
        if (!((m)this.k.get(n)).e())
        {
          this.l = 0;
          return false;
        }
        n += 1;
      }
      this.l = 1;
      return true;
    }
    
    public final int f()
    {
      int n = this.m;
      if (n != -1) {
        return n;
      }
      n = this.i;
      int i4 = 0;
      if ((n & 0x1) == 1) {
        i1 = f.c(1, this.b) + 0;
      } else {
        i1 = 0;
      }
      n = i1;
      if ((this.i & 0x2) == 2) {
        n = i1 + f.c(2, this.c);
      }
      int i1 = n;
      if ((this.i & 0x4) == 4) {
        i1 = n + f.d(3, this.d.d);
      }
      n = i1;
      if ((this.i & 0x8) == 8) {
        n = i1 + f.c(4, this.e);
      }
      i1 = n;
      if ((this.i & 0x10) == 16) {
        i1 = n + f.c(5, this.f);
      }
      n = i1;
      i1 = 0;
      int i2;
      int i3;
      for (;;)
      {
        i2 = n;
        i3 = i4;
        if (i1 >= this.j.size()) {
          break;
        }
        n += f.c(6, (q)this.j.get(i1));
        i1 += 1;
      }
      while (i3 < this.k.size())
      {
        i2 += f.c(7, (q)this.k.get(i3));
        i3 += 1;
      }
      n = i2 + this.h.a();
      this.m = n;
      return n;
    }
    
    public final boolean g()
    {
      return (this.i & 0x4) == 4;
    }
    
    public final boolean k()
    {
      return (this.i & 0x8) == 8;
    }
    
    public final boolean l()
    {
      return (this.i & 0x10) == 16;
    }
    
    public static final class a
      extends i.a<a.m, a>
      implements a.n
    {
      private int b;
      private int c;
      private int d;
      private a.m.b e = a.m.b.a;
      private a.aa f = a.aa.a();
      private int g;
      private List<a.m> h = Collections.emptyList();
      private List<a.m> i = Collections.emptyList();
      
      private a a(int paramInt)
      {
        this.b |= 0x1;
        this.c = paramInt;
        return this;
      }
      
      private a a(a.aa paramaa)
      {
        a.aa localaa = paramaa;
        if ((this.b & 0x8) == 8)
        {
          localaa = paramaa;
          if (this.f != a.aa.a()) {
            localaa = a.aa.a(this.f).a(paramaa).h();
          }
        }
        this.f = localaa;
        this.b |= 0x8;
        return this;
      }
      
      private a a(a.m.b paramb)
      {
        if (paramb != null)
        {
          this.b |= 0x4;
          this.e = paramb;
          return this;
        }
        throw new NullPointerException();
      }
      
      private a b(int paramInt)
      {
        this.b |= 0x2;
        this.d = paramInt;
        return this;
      }
      
      private a c(int paramInt)
      {
        this.b |= 0x10;
        this.g = paramInt;
        return this;
      }
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 84	b/i/b/a/c/e/a$m:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 89 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$m
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 92	b/i/b/a/c/e/a$m$a:a	(Lb/i/b/a/c/e/a$m;)Lb/i/b/a/c/e/a$m$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 95	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$m
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 92	b/i/b/a/c/e/a$m$a:a	(Lb/i/b/a/c/e/a$m;)Lb/i/b/a/c/e/a$m$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a h()
      {
        return new a().a(f());
      }
      
      private void i()
      {
        if ((this.b & 0x20) != 32)
        {
          this.h = new ArrayList(this.h);
          this.b |= 0x20;
        }
      }
      
      private void k()
      {
        if ((this.b & 0x40) != 64)
        {
          this.i = new ArrayList(this.i);
          this.b |= 0x40;
        }
      }
      
      public final a a(a.m paramm)
      {
        if (paramm == a.m.a()) {
          return this;
        }
        if (paramm.c()) {
          a(paramm.b);
        }
        if (paramm.d()) {
          b(paramm.c);
        }
        if (paramm.g()) {
          a(paramm.d);
        }
        if (paramm.k()) {
          a(paramm.e);
        }
        if (paramm.l()) {
          c(paramm.f);
        }
        if (!a.m.b(paramm).isEmpty()) {
          if (this.h.isEmpty())
          {
            this.h = a.m.b(paramm);
            this.b &= 0xFFFFFFDF;
          }
          else
          {
            i();
            this.h.addAll(a.m.b(paramm));
          }
        }
        if (!a.m.c(paramm).isEmpty()) {
          if (this.i.isEmpty())
          {
            this.i = a.m.c(paramm);
            this.b &= 0xFFFFFFBF;
          }
          else
          {
            k();
            this.i.addAll(a.m.c(paramm));
          }
        }
        this.a = this.a.a(a.m.d(paramm));
        return this;
      }
      
      public final boolean e()
      {
        if ((this.b & 0x8) == 8) {
          j = 1;
        } else {
          j = 0;
        }
        if ((j != 0) && (!this.f.e())) {
          return false;
        }
        int j = 0;
        while (j < this.h.size())
        {
          if (!((a.m)this.h.get(j)).e()) {
            return false;
          }
          j += 1;
        }
        j = 0;
        while (j < this.i.size())
        {
          if (!((a.m)this.i.get(j)).e()) {
            return false;
          }
          j += 1;
        }
        return true;
      }
      
      public final a.m f()
      {
        int k = 0;
        a.m localm = new a.m(this, (byte)0);
        int m = this.b;
        if ((m & 0x1) == 1) {
          k = 1;
        }
        a.m.a(localm, this.c);
        int j = k;
        if ((m & 0x2) == 2) {
          j = k | 0x2;
        }
        a.m.b(localm, this.d);
        k = j;
        if ((m & 0x4) == 4) {
          k = j | 0x4;
        }
        a.m.a(localm, this.e);
        j = k;
        if ((m & 0x8) == 8) {
          j = k | 0x8;
        }
        a.m.a(localm, this.f);
        k = j;
        if ((m & 0x10) == 16) {
          k = j | 0x10;
        }
        a.m.c(localm, this.g);
        if ((this.b & 0x20) == 32)
        {
          this.h = Collections.unmodifiableList(this.h);
          this.b &= 0xFFFFFFDF;
        }
        a.m.a(localm, this.h);
        if ((this.b & 0x40) == 64)
        {
          this.i = Collections.unmodifiableList(this.i);
          this.b &= 0xFFFFFFBF;
        }
        a.m.b(localm, this.i);
        a.m.d(localm, k);
        return localm;
      }
    }
    
    public static enum b
      implements j.a
    {
      private static j.b<b> e = new j.b() {};
      final int d;
      
      private b(int paramInt1, int paramInt2)
      {
        this.d = paramInt1;
      }
      
      public static b a(int paramInt)
      {
        switch (paramInt)
        {
        default: 
          return null;
        case 2: 
          return c;
        case 1: 
          return b;
        }
        return a;
      }
      
      public final int a()
      {
        return this.d;
      }
    }
  }
  
  public static abstract interface n
    extends r
  {}
  
  public static final class o
    extends i.c<o>
    implements a.p
  {
    public static s<o> a = new b() {};
    private static final o n;
    public int b;
    public int c;
    public int d;
    public a.aa e;
    public int f;
    public List<a.ae> g;
    public a.aa h;
    public int i;
    public List<a.ai> j;
    public a.ag k;
    public List<Integer> l;
    a.g m;
    private final d o;
    private int p;
    private byte q = -1;
    private int t = -1;
    
    static
    {
      o localo = new o();
      n = localo;
      localo.q();
    }
    
    private o()
    {
      this.o = d.b;
    }
    
    /* Error */
    private o(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 58	b/i/b/a/c/g/i$c:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 60	b/i/b/a/c/e/a$o:q	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 62	b/i/b/a/c/e/a$o:t	I
      //   14: aload_0
      //   15: invokespecial 56	b/i/b/a/c/e/a$o:q	()V
      //   18: invokestatic 76	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   21: astore 15
      //   23: aload 15
      //   25: iconst_1
      //   26: invokestatic 81	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   29: astore 16
      //   31: iconst_0
      //   32: istore 8
      //   34: iconst_0
      //   35: istore_3
      //   36: iload 8
      //   38: ifne +1530 -> 1568
      //   41: iload_3
      //   42: istore 4
      //   44: iload_3
      //   45: istore 5
      //   47: iload_3
      //   48: istore 6
      //   50: aload_1
      //   51: invokevirtual 86	b/i/b/a/c/g/e:a	()I
      //   54: istore 7
      //   56: aconst_null
      //   57: astore 12
      //   59: aconst_null
      //   60: astore 13
      //   62: aconst_null
      //   63: astore 14
      //   65: aconst_null
      //   66: astore 11
      //   68: iload 7
      //   70: lookupswitch	default:+1607->1677, 0:+1327->1397, 8:+1288->1358, 16:+1249->1319, 26:+1114->1184, 34:+1030->1100, 42:+898->968, 50:+811->881, 56:+771->841, 64:+731->801, 72:+692->762, 242:+536->606, 248:+431->501, 250:+277->347, 258:+146->216
      //   192: iload_3
      //   193: istore 4
      //   195: iload_3
      //   196: istore 5
      //   198: iload_3
      //   199: istore 6
      //   201: aload_0
      //   202: aload_1
      //   203: aload 16
      //   205: aload_2
      //   206: iload 7
      //   208: invokevirtual 89	b/i/b/a/c/e/a$o:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   211: istore 10
      //   213: goto +1190 -> 1403
      //   216: iload_3
      //   217: istore 4
      //   219: iload_3
      //   220: istore 5
      //   222: iload_3
      //   223: istore 6
      //   225: aload_0
      //   226: getfield 91	b/i/b/a/c/e/a$o:p	I
      //   229: sipush 256
      //   232: iand
      //   233: sipush 256
      //   236: if_icmpne +21 -> 257
      //   239: iload_3
      //   240: istore 4
      //   242: iload_3
      //   243: istore 5
      //   245: iload_3
      //   246: istore 6
      //   248: aload_0
      //   249: getfield 93	b/i/b/a/c/e/a$o:m	Lb/i/b/a/c/e/a$g;
      //   252: invokevirtual 98	b/i/b/a/c/e/a$g:c	()Lb/i/b/a/c/e/a$g$a;
      //   255: astore 11
      //   257: iload_3
      //   258: istore 4
      //   260: iload_3
      //   261: istore 5
      //   263: iload_3
      //   264: istore 6
      //   266: aload_0
      //   267: aload_1
      //   268: getstatic 99	b/i/b/a/c/e/a$g:a	Lb/i/b/a/c/g/s;
      //   271: aload_2
      //   272: invokevirtual 102	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   275: checkcast 95	b/i/b/a/c/e/a$g
      //   278: putfield 93	b/i/b/a/c/e/a$o:m	Lb/i/b/a/c/e/a$g;
      //   281: aload 11
      //   283: ifnull +40 -> 323
      //   286: iload_3
      //   287: istore 4
      //   289: iload_3
      //   290: istore 5
      //   292: iload_3
      //   293: istore 6
      //   295: aload 11
      //   297: aload_0
      //   298: getfield 93	b/i/b/a/c/e/a$o:m	Lb/i/b/a/c/e/a$g;
      //   301: invokevirtual 107	b/i/b/a/c/e/a$g$a:a	(Lb/i/b/a/c/e/a$g;)Lb/i/b/a/c/e/a$g$a;
      //   304: pop
      //   305: iload_3
      //   306: istore 4
      //   308: iload_3
      //   309: istore 5
      //   311: iload_3
      //   312: istore 6
      //   314: aload_0
      //   315: aload 11
      //   317: invokevirtual 110	b/i/b/a/c/e/a$g$a:f	()Lb/i/b/a/c/e/a$g;
      //   320: putfield 93	b/i/b/a/c/e/a$o:m	Lb/i/b/a/c/e/a$g;
      //   323: iload_3
      //   324: istore 4
      //   326: iload_3
      //   327: istore 5
      //   329: iload_3
      //   330: istore 6
      //   332: aload_0
      //   333: aload_0
      //   334: getfield 91	b/i/b/a/c/e/a$o:p	I
      //   337: sipush 256
      //   340: ior
      //   341: putfield 91	b/i/b/a/c/e/a$o:p	I
      //   344: goto -308 -> 36
      //   347: iload_3
      //   348: istore 4
      //   350: iload_3
      //   351: istore 5
      //   353: iload_3
      //   354: istore 6
      //   356: aload_1
      //   357: aload_1
      //   358: invokevirtual 112	b/i/b/a/c/g/e:d	()I
      //   361: invokevirtual 115	b/i/b/a/c/g/e:b	(I)I
      //   364: istore 9
      //   366: iload_3
      //   367: istore 7
      //   369: iload_3
      //   370: sipush 1024
      //   373: iand
      //   374: sipush 1024
      //   377: if_icmpeq +49 -> 426
      //   380: iload_3
      //   381: istore 7
      //   383: iload_3
      //   384: istore 4
      //   386: iload_3
      //   387: istore 5
      //   389: iload_3
      //   390: istore 6
      //   392: aload_1
      //   393: invokevirtual 117	b/i/b/a/c/g/e:h	()I
      //   396: ifle +30 -> 426
      //   399: iload_3
      //   400: istore 4
      //   402: iload_3
      //   403: istore 5
      //   405: iload_3
      //   406: istore 6
      //   408: aload_0
      //   409: new 119	java/util/ArrayList
      //   412: dup
      //   413: invokespecial 120	java/util/ArrayList:<init>	()V
      //   416: putfield 122	b/i/b/a/c/e/a$o:l	Ljava/util/List;
      //   419: iload_3
      //   420: sipush 1024
      //   423: ior
      //   424: istore 7
      //   426: iload 7
      //   428: istore 4
      //   430: iload 7
      //   432: istore 5
      //   434: iload 7
      //   436: istore 6
      //   438: aload_1
      //   439: invokevirtual 117	b/i/b/a/c/g/e:h	()I
      //   442: ifle +35 -> 477
      //   445: iload 7
      //   447: istore 4
      //   449: iload 7
      //   451: istore 5
      //   453: iload 7
      //   455: istore 6
      //   457: aload_0
      //   458: getfield 122	b/i/b/a/c/e/a$o:l	Ljava/util/List;
      //   461: aload_1
      //   462: invokevirtual 112	b/i/b/a/c/g/e:d	()I
      //   465: invokestatic 128	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   468: invokeinterface 134 2 0
      //   473: pop
      //   474: goto -48 -> 426
      //   477: iload 7
      //   479: istore 4
      //   481: iload 7
      //   483: istore 5
      //   485: iload 7
      //   487: istore 6
      //   489: aload_1
      //   490: iload 9
      //   492: invokevirtual 137	b/i/b/a/c/g/e:c	(I)V
      //   495: iload 7
      //   497: istore_3
      //   498: goto -462 -> 36
      //   501: iload_3
      //   502: istore 7
      //   504: iload_3
      //   505: sipush 1024
      //   508: iand
      //   509: sipush 1024
      //   512: if_icmpeq +30 -> 542
      //   515: iload_3
      //   516: istore 4
      //   518: iload_3
      //   519: istore 5
      //   521: iload_3
      //   522: istore 6
      //   524: aload_0
      //   525: new 119	java/util/ArrayList
      //   528: dup
      //   529: invokespecial 120	java/util/ArrayList:<init>	()V
      //   532: putfield 122	b/i/b/a/c/e/a$o:l	Ljava/util/List;
      //   535: iload_3
      //   536: sipush 1024
      //   539: ior
      //   540: istore 7
      //   542: iload 7
      //   544: istore 4
      //   546: iload 7
      //   548: istore 5
      //   550: iload 7
      //   552: istore 6
      //   554: aload_0
      //   555: getfield 122	b/i/b/a/c/e/a$o:l	Ljava/util/List;
      //   558: astore 11
      //   560: iload 7
      //   562: istore 4
      //   564: iload 7
      //   566: istore 5
      //   568: iload 7
      //   570: istore 6
      //   572: aload_1
      //   573: invokevirtual 112	b/i/b/a/c/g/e:d	()I
      //   576: invokestatic 128	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   579: astore 12
      //   581: iload 7
      //   583: istore_3
      //   584: iload_3
      //   585: istore 4
      //   587: iload_3
      //   588: istore 5
      //   590: iload_3
      //   591: istore 6
      //   593: aload 11
      //   595: aload 12
      //   597: invokeinterface 134 2 0
      //   602: pop
      //   603: goto -567 -> 36
      //   606: iload_3
      //   607: istore 4
      //   609: iload_3
      //   610: istore 5
      //   612: iload_3
      //   613: istore 6
      //   615: aload_0
      //   616: getfield 91	b/i/b/a/c/e/a$o:p	I
      //   619: istore 7
      //   621: sipush 128
      //   624: istore 9
      //   626: aload 12
      //   628: astore 11
      //   630: iload 7
      //   632: sipush 128
      //   635: iand
      //   636: sipush 128
      //   639: if_icmpne +21 -> 660
      //   642: iload_3
      //   643: istore 4
      //   645: iload_3
      //   646: istore 5
      //   648: iload_3
      //   649: istore 6
      //   651: aload_0
      //   652: getfield 139	b/i/b/a/c/e/a$o:k	Lb/i/b/a/c/e/a$ag;
      //   655: invokestatic 144	b/i/b/a/c/e/a$ag:a	(Lb/i/b/a/c/e/a$ag;)Lb/i/b/a/c/e/a$ag$a;
      //   658: astore 11
      //   660: iload_3
      //   661: istore 4
      //   663: iload_3
      //   664: istore 5
      //   666: iload_3
      //   667: istore 6
      //   669: aload_0
      //   670: aload_1
      //   671: getstatic 145	b/i/b/a/c/e/a$ag:a	Lb/i/b/a/c/g/s;
      //   674: aload_2
      //   675: invokevirtual 102	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   678: checkcast 141	b/i/b/a/c/e/a$ag
      //   681: putfield 139	b/i/b/a/c/e/a$o:k	Lb/i/b/a/c/e/a$ag;
      //   684: aload 11
      //   686: ifnull +40 -> 726
      //   689: iload_3
      //   690: istore 4
      //   692: iload_3
      //   693: istore 5
      //   695: iload_3
      //   696: istore 6
      //   698: aload 11
      //   700: aload_0
      //   701: getfield 139	b/i/b/a/c/e/a$o:k	Lb/i/b/a/c/e/a$ag;
      //   704: invokevirtual 148	b/i/b/a/c/e/a$ag$a:a	(Lb/i/b/a/c/e/a$ag;)Lb/i/b/a/c/e/a$ag$a;
      //   707: pop
      //   708: iload_3
      //   709: istore 4
      //   711: iload_3
      //   712: istore 5
      //   714: iload_3
      //   715: istore 6
      //   717: aload_0
      //   718: aload 11
      //   720: invokevirtual 151	b/i/b/a/c/e/a$ag$a:f	()Lb/i/b/a/c/e/a$ag;
      //   723: putfield 139	b/i/b/a/c/e/a$o:k	Lb/i/b/a/c/e/a$ag;
      //   726: iload_3
      //   727: istore 4
      //   729: iload_3
      //   730: istore 5
      //   732: iload_3
      //   733: istore 6
      //   735: aload_0
      //   736: getfield 91	b/i/b/a/c/e/a$o:p	I
      //   739: istore 7
      //   741: iload_3
      //   742: istore 4
      //   744: iload_3
      //   745: istore 5
      //   747: iload_3
      //   748: istore 6
      //   750: aload_0
      //   751: iload 7
      //   753: iload 9
      //   755: ior
      //   756: putfield 91	b/i/b/a/c/e/a$o:p	I
      //   759: goto -723 -> 36
      //   762: iload_3
      //   763: istore 4
      //   765: iload_3
      //   766: istore 5
      //   768: iload_3
      //   769: istore 6
      //   771: aload_0
      //   772: aload_0
      //   773: getfield 91	b/i/b/a/c/e/a$o:p	I
      //   776: iconst_1
      //   777: ior
      //   778: putfield 91	b/i/b/a/c/e/a$o:p	I
      //   781: iload_3
      //   782: istore 4
      //   784: iload_3
      //   785: istore 5
      //   787: iload_3
      //   788: istore 6
      //   790: aload_0
      //   791: aload_1
      //   792: invokevirtual 112	b/i/b/a/c/g/e:d	()I
      //   795: putfield 153	b/i/b/a/c/e/a$o:b	I
      //   798: goto -762 -> 36
      //   801: iload_3
      //   802: istore 4
      //   804: iload_3
      //   805: istore 5
      //   807: iload_3
      //   808: istore 6
      //   810: aload_0
      //   811: aload_0
      //   812: getfield 91	b/i/b/a/c/e/a$o:p	I
      //   815: bipush 64
      //   817: ior
      //   818: putfield 91	b/i/b/a/c/e/a$o:p	I
      //   821: iload_3
      //   822: istore 4
      //   824: iload_3
      //   825: istore 5
      //   827: iload_3
      //   828: istore 6
      //   830: aload_0
      //   831: aload_1
      //   832: invokevirtual 112	b/i/b/a/c/g/e:d	()I
      //   835: putfield 155	b/i/b/a/c/e/a$o:i	I
      //   838: goto -802 -> 36
      //   841: iload_3
      //   842: istore 4
      //   844: iload_3
      //   845: istore 5
      //   847: iload_3
      //   848: istore 6
      //   850: aload_0
      //   851: aload_0
      //   852: getfield 91	b/i/b/a/c/e/a$o:p	I
      //   855: bipush 16
      //   857: ior
      //   858: putfield 91	b/i/b/a/c/e/a$o:p	I
      //   861: iload_3
      //   862: istore 4
      //   864: iload_3
      //   865: istore 5
      //   867: iload_3
      //   868: istore 6
      //   870: aload_0
      //   871: aload_1
      //   872: invokevirtual 112	b/i/b/a/c/g/e:d	()I
      //   875: putfield 157	b/i/b/a/c/e/a$o:f	I
      //   878: goto -842 -> 36
      //   881: iload_3
      //   882: istore 7
      //   884: iload_3
      //   885: sipush 256
      //   888: iand
      //   889: sipush 256
      //   892: if_icmpeq +30 -> 922
      //   895: iload_3
      //   896: istore 4
      //   898: iload_3
      //   899: istore 5
      //   901: iload_3
      //   902: istore 6
      //   904: aload_0
      //   905: new 119	java/util/ArrayList
      //   908: dup
      //   909: invokespecial 120	java/util/ArrayList:<init>	()V
      //   912: putfield 159	b/i/b/a/c/e/a$o:j	Ljava/util/List;
      //   915: iload_3
      //   916: sipush 256
      //   919: ior
      //   920: istore 7
      //   922: iload 7
      //   924: istore 4
      //   926: iload 7
      //   928: istore 5
      //   930: iload 7
      //   932: istore 6
      //   934: aload_0
      //   935: getfield 159	b/i/b/a/c/e/a$o:j	Ljava/util/List;
      //   938: astore 11
      //   940: iload 7
      //   942: istore 4
      //   944: iload 7
      //   946: istore 5
      //   948: iload 7
      //   950: istore 6
      //   952: aload_1
      //   953: getstatic 162	b/i/b/a/c/e/a$ai:a	Lb/i/b/a/c/g/s;
      //   956: aload_2
      //   957: invokevirtual 102	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   960: astore 12
      //   962: iload 7
      //   964: istore_3
      //   965: goto -381 -> 584
      //   968: aload 13
      //   970: astore 11
      //   972: iload_3
      //   973: istore 4
      //   975: iload_3
      //   976: istore 5
      //   978: iload_3
      //   979: istore 6
      //   981: aload_0
      //   982: getfield 91	b/i/b/a/c/e/a$o:p	I
      //   985: bipush 32
      //   987: iand
      //   988: bipush 32
      //   990: if_icmpne +21 -> 1011
      //   993: iload_3
      //   994: istore 4
      //   996: iload_3
      //   997: istore 5
      //   999: iload_3
      //   1000: istore 6
      //   1002: aload_0
      //   1003: getfield 164	b/i/b/a/c/e/a$o:h	Lb/i/b/a/c/e/a$aa;
      //   1006: invokestatic 169	b/i/b/a/c/e/a$aa:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   1009: astore 11
      //   1011: iload_3
      //   1012: istore 4
      //   1014: iload_3
      //   1015: istore 5
      //   1017: iload_3
      //   1018: istore 6
      //   1020: aload_0
      //   1021: aload_1
      //   1022: getstatic 170	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   1025: aload_2
      //   1026: invokevirtual 102	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   1029: checkcast 166	b/i/b/a/c/e/a$aa
      //   1032: putfield 164	b/i/b/a/c/e/a$o:h	Lb/i/b/a/c/e/a$aa;
      //   1035: aload 11
      //   1037: ifnull +40 -> 1077
      //   1040: iload_3
      //   1041: istore 4
      //   1043: iload_3
      //   1044: istore 5
      //   1046: iload_3
      //   1047: istore 6
      //   1049: aload 11
      //   1051: aload_0
      //   1052: getfield 164	b/i/b/a/c/e/a$o:h	Lb/i/b/a/c/e/a$aa;
      //   1055: invokevirtual 173	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   1058: pop
      //   1059: iload_3
      //   1060: istore 4
      //   1062: iload_3
      //   1063: istore 5
      //   1065: iload_3
      //   1066: istore 6
      //   1068: aload_0
      //   1069: aload 11
      //   1071: invokevirtual 176	b/i/b/a/c/e/a$aa$c:h	()Lb/i/b/a/c/e/a$aa;
      //   1074: putfield 164	b/i/b/a/c/e/a$o:h	Lb/i/b/a/c/e/a$aa;
      //   1077: iload_3
      //   1078: istore 4
      //   1080: iload_3
      //   1081: istore 5
      //   1083: iload_3
      //   1084: istore 6
      //   1086: aload_0
      //   1087: aload_0
      //   1088: getfield 91	b/i/b/a/c/e/a$o:p	I
      //   1091: bipush 32
      //   1093: ior
      //   1094: putfield 91	b/i/b/a/c/e/a$o:p	I
      //   1097: goto -1061 -> 36
      //   1100: iload_3
      //   1101: istore 7
      //   1103: iload_3
      //   1104: bipush 32
      //   1106: iand
      //   1107: bipush 32
      //   1109: if_icmpeq +29 -> 1138
      //   1112: iload_3
      //   1113: istore 4
      //   1115: iload_3
      //   1116: istore 5
      //   1118: iload_3
      //   1119: istore 6
      //   1121: aload_0
      //   1122: new 119	java/util/ArrayList
      //   1125: dup
      //   1126: invokespecial 120	java/util/ArrayList:<init>	()V
      //   1129: putfield 178	b/i/b/a/c/e/a$o:g	Ljava/util/List;
      //   1132: iload_3
      //   1133: bipush 32
      //   1135: ior
      //   1136: istore 7
      //   1138: iload 7
      //   1140: istore 4
      //   1142: iload 7
      //   1144: istore 5
      //   1146: iload 7
      //   1148: istore 6
      //   1150: aload_0
      //   1151: getfield 178	b/i/b/a/c/e/a$o:g	Ljava/util/List;
      //   1154: astore 11
      //   1156: iload 7
      //   1158: istore 4
      //   1160: iload 7
      //   1162: istore 5
      //   1164: iload 7
      //   1166: istore 6
      //   1168: aload_1
      //   1169: getstatic 181	b/i/b/a/c/e/a$ae:a	Lb/i/b/a/c/g/s;
      //   1172: aload_2
      //   1173: invokevirtual 102	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   1176: astore 12
      //   1178: iload 7
      //   1180: istore_3
      //   1181: goto -597 -> 584
      //   1184: iload_3
      //   1185: istore 4
      //   1187: iload_3
      //   1188: istore 5
      //   1190: iload_3
      //   1191: istore 6
      //   1193: aload_0
      //   1194: getfield 91	b/i/b/a/c/e/a$o:p	I
      //   1197: istore 7
      //   1199: bipush 8
      //   1201: istore 9
      //   1203: aload 14
      //   1205: astore 11
      //   1207: iload 7
      //   1209: bipush 8
      //   1211: iand
      //   1212: bipush 8
      //   1214: if_icmpne +21 -> 1235
      //   1217: iload_3
      //   1218: istore 4
      //   1220: iload_3
      //   1221: istore 5
      //   1223: iload_3
      //   1224: istore 6
      //   1226: aload_0
      //   1227: getfield 183	b/i/b/a/c/e/a$o:e	Lb/i/b/a/c/e/a$aa;
      //   1230: invokestatic 169	b/i/b/a/c/e/a$aa:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   1233: astore 11
      //   1235: iload_3
      //   1236: istore 4
      //   1238: iload_3
      //   1239: istore 5
      //   1241: iload_3
      //   1242: istore 6
      //   1244: aload_0
      //   1245: aload_1
      //   1246: getstatic 170	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   1249: aload_2
      //   1250: invokevirtual 102	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   1253: checkcast 166	b/i/b/a/c/e/a$aa
      //   1256: putfield 183	b/i/b/a/c/e/a$o:e	Lb/i/b/a/c/e/a$aa;
      //   1259: aload 11
      //   1261: ifnull +40 -> 1301
      //   1264: iload_3
      //   1265: istore 4
      //   1267: iload_3
      //   1268: istore 5
      //   1270: iload_3
      //   1271: istore 6
      //   1273: aload 11
      //   1275: aload_0
      //   1276: getfield 183	b/i/b/a/c/e/a$o:e	Lb/i/b/a/c/e/a$aa;
      //   1279: invokevirtual 173	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   1282: pop
      //   1283: iload_3
      //   1284: istore 4
      //   1286: iload_3
      //   1287: istore 5
      //   1289: iload_3
      //   1290: istore 6
      //   1292: aload_0
      //   1293: aload 11
      //   1295: invokevirtual 176	b/i/b/a/c/e/a$aa$c:h	()Lb/i/b/a/c/e/a$aa;
      //   1298: putfield 183	b/i/b/a/c/e/a$o:e	Lb/i/b/a/c/e/a$aa;
      //   1301: iload_3
      //   1302: istore 4
      //   1304: iload_3
      //   1305: istore 5
      //   1307: iload_3
      //   1308: istore 6
      //   1310: aload_0
      //   1311: getfield 91	b/i/b/a/c/e/a$o:p	I
      //   1314: istore 7
      //   1316: goto -575 -> 741
      //   1319: iload_3
      //   1320: istore 4
      //   1322: iload_3
      //   1323: istore 5
      //   1325: iload_3
      //   1326: istore 6
      //   1328: aload_0
      //   1329: aload_0
      //   1330: getfield 91	b/i/b/a/c/e/a$o:p	I
      //   1333: iconst_4
      //   1334: ior
      //   1335: putfield 91	b/i/b/a/c/e/a$o:p	I
      //   1338: iload_3
      //   1339: istore 4
      //   1341: iload_3
      //   1342: istore 5
      //   1344: iload_3
      //   1345: istore 6
      //   1347: aload_0
      //   1348: aload_1
      //   1349: invokevirtual 112	b/i/b/a/c/g/e:d	()I
      //   1352: putfield 185	b/i/b/a/c/e/a$o:d	I
      //   1355: goto -1319 -> 36
      //   1358: iload_3
      //   1359: istore 4
      //   1361: iload_3
      //   1362: istore 5
      //   1364: iload_3
      //   1365: istore 6
      //   1367: aload_0
      //   1368: aload_0
      //   1369: getfield 91	b/i/b/a/c/e/a$o:p	I
      //   1372: iconst_2
      //   1373: ior
      //   1374: putfield 91	b/i/b/a/c/e/a$o:p	I
      //   1377: iload_3
      //   1378: istore 4
      //   1380: iload_3
      //   1381: istore 5
      //   1383: iload_3
      //   1384: istore 6
      //   1386: aload_0
      //   1387: aload_1
      //   1388: invokevirtual 112	b/i/b/a/c/g/e:d	()I
      //   1391: putfield 187	b/i/b/a/c/e/a$o:c	I
      //   1394: goto -1358 -> 36
      //   1397: iconst_1
      //   1398: istore 8
      //   1400: goto -1364 -> 36
      //   1403: iload 10
      //   1405: ifne -1369 -> 36
      //   1408: goto -11 -> 1397
      //   1411: astore_1
      //   1412: goto +51 -> 1463
      //   1415: astore_1
      //   1416: iload 5
      //   1418: istore 4
      //   1420: new 71	b/i/b/a/c/g/k
      //   1423: dup
      //   1424: aload_1
      //   1425: invokevirtual 191	java/io/IOException:getMessage	()Ljava/lang/String;
      //   1428: invokespecial 194	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   1431: astore_1
      //   1432: iload 5
      //   1434: istore 4
      //   1436: aload_1
      //   1437: aload_0
      //   1438: putfield 197	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   1441: iload 5
      //   1443: istore 4
      //   1445: aload_1
      //   1446: athrow
      //   1447: astore_1
      //   1448: iload 6
      //   1450: istore 4
      //   1452: aload_1
      //   1453: aload_0
      //   1454: putfield 197	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   1457: iload 6
      //   1459: istore 4
      //   1461: aload_1
      //   1462: athrow
      //   1463: iload 4
      //   1465: bipush 32
      //   1467: iand
      //   1468: bipush 32
      //   1470: if_icmpne +14 -> 1484
      //   1473: aload_0
      //   1474: aload_0
      //   1475: getfield 178	b/i/b/a/c/e/a$o:g	Ljava/util/List;
      //   1478: invokestatic 203	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1481: putfield 178	b/i/b/a/c/e/a$o:g	Ljava/util/List;
      //   1484: iload 4
      //   1486: sipush 256
      //   1489: iand
      //   1490: sipush 256
      //   1493: if_icmpne +14 -> 1507
      //   1496: aload_0
      //   1497: aload_0
      //   1498: getfield 159	b/i/b/a/c/e/a$o:j	Ljava/util/List;
      //   1501: invokestatic 203	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1504: putfield 159	b/i/b/a/c/e/a$o:j	Ljava/util/List;
      //   1507: iload 4
      //   1509: sipush 1024
      //   1512: iand
      //   1513: sipush 1024
      //   1516: if_icmpne +14 -> 1530
      //   1519: aload_0
      //   1520: aload_0
      //   1521: getfield 122	b/i/b/a/c/e/a$o:l	Ljava/util/List;
      //   1524: invokestatic 203	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1527: putfield 122	b/i/b/a/c/e/a$o:l	Ljava/util/List;
      //   1530: aload 16
      //   1532: invokevirtual 205	b/i/b/a/c/g/f:a	()V
      //   1535: aload_0
      //   1536: aload 15
      //   1538: invokevirtual 210	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1541: putfield 68	b/i/b/a/c/e/a$o:o	Lb/i/b/a/c/g/d;
      //   1544: goto +15 -> 1559
      //   1547: astore_1
      //   1548: aload_0
      //   1549: aload 15
      //   1551: invokevirtual 210	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1554: putfield 68	b/i/b/a/c/e/a$o:o	Lb/i/b/a/c/g/d;
      //   1557: aload_1
      //   1558: athrow
      //   1559: aload_0
      //   1560: getfield 214	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   1563: invokevirtual 218	b/i/b/a/c/g/h:c	()V
      //   1566: aload_1
      //   1567: athrow
      //   1568: iload_3
      //   1569: bipush 32
      //   1571: iand
      //   1572: bipush 32
      //   1574: if_icmpne +14 -> 1588
      //   1577: aload_0
      //   1578: aload_0
      //   1579: getfield 178	b/i/b/a/c/e/a$o:g	Ljava/util/List;
      //   1582: invokestatic 203	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1585: putfield 178	b/i/b/a/c/e/a$o:g	Ljava/util/List;
      //   1588: iload_3
      //   1589: sipush 256
      //   1592: iand
      //   1593: sipush 256
      //   1596: if_icmpne +14 -> 1610
      //   1599: aload_0
      //   1600: aload_0
      //   1601: getfield 159	b/i/b/a/c/e/a$o:j	Ljava/util/List;
      //   1604: invokestatic 203	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1607: putfield 159	b/i/b/a/c/e/a$o:j	Ljava/util/List;
      //   1610: iload_3
      //   1611: sipush 1024
      //   1614: iand
      //   1615: sipush 1024
      //   1618: if_icmpne +14 -> 1632
      //   1621: aload_0
      //   1622: aload_0
      //   1623: getfield 122	b/i/b/a/c/e/a$o:l	Ljava/util/List;
      //   1626: invokestatic 203	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1629: putfield 122	b/i/b/a/c/e/a$o:l	Ljava/util/List;
      //   1632: aload 16
      //   1634: invokevirtual 205	b/i/b/a/c/g/f:a	()V
      //   1637: aload_0
      //   1638: aload 15
      //   1640: invokevirtual 210	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1643: putfield 68	b/i/b/a/c/e/a$o:o	Lb/i/b/a/c/g/d;
      //   1646: goto +15 -> 1661
      //   1649: astore_1
      //   1650: aload_0
      //   1651: aload 15
      //   1653: invokevirtual 210	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1656: putfield 68	b/i/b/a/c/e/a$o:o	Lb/i/b/a/c/g/d;
      //   1659: aload_1
      //   1660: athrow
      //   1661: aload_0
      //   1662: getfield 214	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   1665: invokevirtual 218	b/i/b/a/c/g/h:c	()V
      //   1668: return
      //   1669: astore_2
      //   1670: goto -135 -> 1535
      //   1673: astore_1
      //   1674: goto -37 -> 1637
      //   1677: goto -1485 -> 192
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1680	0	this	o
      //   0	1680	1	parame	b.i.b.a.c.g.e
      //   0	1680	2	paramg	g
      //   35	1580	3	i1	int
      //   42	1471	4	i2	int
      //   45	1397	5	i3	int
      //   48	1410	6	i4	int
      //   54	1261	7	i5	int
      //   32	1367	8	i6	int
      //   364	838	9	i7	int
      //   211	1193	10	bool	boolean
      //   66	1228	11	localObject1	Object
      //   57	1120	12	localObject2	Object
      //   60	909	13	localObject3	Object
      //   63	1141	14	localObject4	Object
      //   21	1631	15	localb	b.i.b.a.c.g.d.b
      //   29	1604	16	localf	f
      // Exception table:
      //   from	to	target	type
      //   50	56	1411	finally
      //   201	213	1411	finally
      //   225	239	1411	finally
      //   248	257	1411	finally
      //   266	281	1411	finally
      //   295	305	1411	finally
      //   314	323	1411	finally
      //   332	344	1411	finally
      //   356	366	1411	finally
      //   392	399	1411	finally
      //   408	419	1411	finally
      //   438	445	1411	finally
      //   457	474	1411	finally
      //   489	495	1411	finally
      //   524	535	1411	finally
      //   554	560	1411	finally
      //   572	581	1411	finally
      //   593	603	1411	finally
      //   615	621	1411	finally
      //   651	660	1411	finally
      //   669	684	1411	finally
      //   698	708	1411	finally
      //   717	726	1411	finally
      //   735	741	1411	finally
      //   750	759	1411	finally
      //   771	781	1411	finally
      //   790	798	1411	finally
      //   810	821	1411	finally
      //   830	838	1411	finally
      //   850	861	1411	finally
      //   870	878	1411	finally
      //   904	915	1411	finally
      //   934	940	1411	finally
      //   952	962	1411	finally
      //   981	993	1411	finally
      //   1002	1011	1411	finally
      //   1020	1035	1411	finally
      //   1049	1059	1411	finally
      //   1068	1077	1411	finally
      //   1086	1097	1411	finally
      //   1121	1132	1411	finally
      //   1150	1156	1411	finally
      //   1168	1178	1411	finally
      //   1193	1199	1411	finally
      //   1226	1235	1411	finally
      //   1244	1259	1411	finally
      //   1273	1283	1411	finally
      //   1292	1301	1411	finally
      //   1310	1316	1411	finally
      //   1328	1338	1411	finally
      //   1347	1355	1411	finally
      //   1367	1377	1411	finally
      //   1386	1394	1411	finally
      //   1420	1432	1411	finally
      //   1436	1441	1411	finally
      //   1445	1447	1411	finally
      //   1452	1457	1411	finally
      //   1461	1463	1411	finally
      //   50	56	1415	java/io/IOException
      //   201	213	1415	java/io/IOException
      //   225	239	1415	java/io/IOException
      //   248	257	1415	java/io/IOException
      //   266	281	1415	java/io/IOException
      //   295	305	1415	java/io/IOException
      //   314	323	1415	java/io/IOException
      //   332	344	1415	java/io/IOException
      //   356	366	1415	java/io/IOException
      //   392	399	1415	java/io/IOException
      //   408	419	1415	java/io/IOException
      //   438	445	1415	java/io/IOException
      //   457	474	1415	java/io/IOException
      //   489	495	1415	java/io/IOException
      //   524	535	1415	java/io/IOException
      //   554	560	1415	java/io/IOException
      //   572	581	1415	java/io/IOException
      //   593	603	1415	java/io/IOException
      //   615	621	1415	java/io/IOException
      //   651	660	1415	java/io/IOException
      //   669	684	1415	java/io/IOException
      //   698	708	1415	java/io/IOException
      //   717	726	1415	java/io/IOException
      //   735	741	1415	java/io/IOException
      //   750	759	1415	java/io/IOException
      //   771	781	1415	java/io/IOException
      //   790	798	1415	java/io/IOException
      //   810	821	1415	java/io/IOException
      //   830	838	1415	java/io/IOException
      //   850	861	1415	java/io/IOException
      //   870	878	1415	java/io/IOException
      //   904	915	1415	java/io/IOException
      //   934	940	1415	java/io/IOException
      //   952	962	1415	java/io/IOException
      //   981	993	1415	java/io/IOException
      //   1002	1011	1415	java/io/IOException
      //   1020	1035	1415	java/io/IOException
      //   1049	1059	1415	java/io/IOException
      //   1068	1077	1415	java/io/IOException
      //   1086	1097	1415	java/io/IOException
      //   1121	1132	1415	java/io/IOException
      //   1150	1156	1415	java/io/IOException
      //   1168	1178	1415	java/io/IOException
      //   1193	1199	1415	java/io/IOException
      //   1226	1235	1415	java/io/IOException
      //   1244	1259	1415	java/io/IOException
      //   1273	1283	1415	java/io/IOException
      //   1292	1301	1415	java/io/IOException
      //   1310	1316	1415	java/io/IOException
      //   1328	1338	1415	java/io/IOException
      //   1347	1355	1415	java/io/IOException
      //   1367	1377	1415	java/io/IOException
      //   1386	1394	1415	java/io/IOException
      //   50	56	1447	b/i/b/a/c/g/k
      //   201	213	1447	b/i/b/a/c/g/k
      //   225	239	1447	b/i/b/a/c/g/k
      //   248	257	1447	b/i/b/a/c/g/k
      //   266	281	1447	b/i/b/a/c/g/k
      //   295	305	1447	b/i/b/a/c/g/k
      //   314	323	1447	b/i/b/a/c/g/k
      //   332	344	1447	b/i/b/a/c/g/k
      //   356	366	1447	b/i/b/a/c/g/k
      //   392	399	1447	b/i/b/a/c/g/k
      //   408	419	1447	b/i/b/a/c/g/k
      //   438	445	1447	b/i/b/a/c/g/k
      //   457	474	1447	b/i/b/a/c/g/k
      //   489	495	1447	b/i/b/a/c/g/k
      //   524	535	1447	b/i/b/a/c/g/k
      //   554	560	1447	b/i/b/a/c/g/k
      //   572	581	1447	b/i/b/a/c/g/k
      //   593	603	1447	b/i/b/a/c/g/k
      //   615	621	1447	b/i/b/a/c/g/k
      //   651	660	1447	b/i/b/a/c/g/k
      //   669	684	1447	b/i/b/a/c/g/k
      //   698	708	1447	b/i/b/a/c/g/k
      //   717	726	1447	b/i/b/a/c/g/k
      //   735	741	1447	b/i/b/a/c/g/k
      //   750	759	1447	b/i/b/a/c/g/k
      //   771	781	1447	b/i/b/a/c/g/k
      //   790	798	1447	b/i/b/a/c/g/k
      //   810	821	1447	b/i/b/a/c/g/k
      //   830	838	1447	b/i/b/a/c/g/k
      //   850	861	1447	b/i/b/a/c/g/k
      //   870	878	1447	b/i/b/a/c/g/k
      //   904	915	1447	b/i/b/a/c/g/k
      //   934	940	1447	b/i/b/a/c/g/k
      //   952	962	1447	b/i/b/a/c/g/k
      //   981	993	1447	b/i/b/a/c/g/k
      //   1002	1011	1447	b/i/b/a/c/g/k
      //   1020	1035	1447	b/i/b/a/c/g/k
      //   1049	1059	1447	b/i/b/a/c/g/k
      //   1068	1077	1447	b/i/b/a/c/g/k
      //   1086	1097	1447	b/i/b/a/c/g/k
      //   1121	1132	1447	b/i/b/a/c/g/k
      //   1150	1156	1447	b/i/b/a/c/g/k
      //   1168	1178	1447	b/i/b/a/c/g/k
      //   1193	1199	1447	b/i/b/a/c/g/k
      //   1226	1235	1447	b/i/b/a/c/g/k
      //   1244	1259	1447	b/i/b/a/c/g/k
      //   1273	1283	1447	b/i/b/a/c/g/k
      //   1292	1301	1447	b/i/b/a/c/g/k
      //   1310	1316	1447	b/i/b/a/c/g/k
      //   1328	1338	1447	b/i/b/a/c/g/k
      //   1347	1355	1447	b/i/b/a/c/g/k
      //   1367	1377	1447	b/i/b/a/c/g/k
      //   1386	1394	1447	b/i/b/a/c/g/k
      //   1530	1535	1547	finally
      //   1632	1637	1649	finally
      //   1530	1535	1669	java/io/IOException
      //   1632	1637	1673	java/io/IOException
    }
    
    private o(i.b<o, ?> paramb)
    {
      super();
      this.o = paramb.a;
    }
    
    public static o a()
    {
      return n;
    }
    
    public static o a(InputStream paramInputStream, g paramg)
      throws IOException
    {
      return (o)a.b(paramInputStream, paramg);
    }
    
    private void q()
    {
      this.b = 6;
      this.c = 6;
      this.d = 0;
      this.e = a.aa.a();
      this.f = 0;
      this.g = Collections.emptyList();
      this.h = a.aa.a();
      this.i = 0;
      this.j = Collections.emptyList();
      this.k = a.ag.a();
      this.l = Collections.emptyList();
      this.m = a.g.a();
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      i.c.a locala = x();
      if ((this.p & 0x2) == 2) {
        paramf.a(1, this.c);
      }
      if ((this.p & 0x4) == 4) {
        paramf.a(2, this.d);
      }
      if ((this.p & 0x8) == 8) {
        paramf.a(3, this.e);
      }
      int i2 = 0;
      int i1 = 0;
      while (i1 < this.g.size())
      {
        paramf.a(4, (q)this.g.get(i1));
        i1 += 1;
      }
      if ((this.p & 0x20) == 32) {
        paramf.a(5, this.h);
      }
      i1 = 0;
      while (i1 < this.j.size())
      {
        paramf.a(6, (q)this.j.get(i1));
        i1 += 1;
      }
      if ((this.p & 0x10) == 16) {
        paramf.a(7, this.f);
      }
      if ((this.p & 0x40) == 64) {
        paramf.a(8, this.i);
      }
      if ((this.p & 0x1) == 1) {
        paramf.a(9, this.b);
      }
      i1 = i2;
      if ((this.p & 0x80) == 128)
      {
        paramf.a(30, this.k);
        i1 = i2;
      }
      while (i1 < this.l.size())
      {
        paramf.a(31, ((Integer)this.l.get(i1)).intValue());
        i1 += 1;
      }
      if ((this.p & 0x100) == 256) {
        paramf.a(32, this.m);
      }
      locala.a(19000, paramf);
      paramf.c(this.o);
    }
    
    public final s<o> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.p & 0x1) == 1;
    }
    
    public final boolean d()
    {
      return (this.p & 0x2) == 2;
    }
    
    public final boolean e()
    {
      int i1 = this.q;
      if (i1 == 1) {
        return true;
      }
      if (i1 == 0) {
        return false;
      }
      if (!g())
      {
        this.q = 0;
        return false;
      }
      if ((k()) && (!this.e.e()))
      {
        this.q = 0;
        return false;
      }
      i1 = 0;
      while (i1 < this.g.size())
      {
        if (!((a.ae)this.g.get(i1)).e())
        {
          this.q = 0;
          return false;
        }
        i1 += 1;
      }
      if ((m()) && (!this.h.e()))
      {
        this.q = 0;
        return false;
      }
      i1 = 0;
      while (i1 < this.j.size())
      {
        if (!((a.ai)this.j.get(i1)).e())
        {
          this.q = 0;
          return false;
        }
        i1 += 1;
      }
      if ((o()) && (!this.k.e()))
      {
        this.q = 0;
        return false;
      }
      if ((p()) && (!this.m.e()))
      {
        this.q = 0;
        return false;
      }
      if (!this.s.e())
      {
        this.q = 0;
        return false;
      }
      this.q = 1;
      return true;
    }
    
    public final int f()
    {
      int i1 = this.t;
      if (i1 != -1) {
        return i1;
      }
      i1 = this.p;
      int i3 = 0;
      if ((i1 & 0x2) == 2) {
        i2 = f.c(1, this.c) + 0;
      } else {
        i2 = 0;
      }
      i1 = i2;
      if ((this.p & 0x4) == 4) {
        i1 = i2 + f.c(2, this.d);
      }
      int i2 = i1;
      if ((this.p & 0x8) == 8) {
        i2 = i1 + f.c(3, this.e);
      }
      i1 = i2;
      i2 = 0;
      while (i2 < this.g.size())
      {
        i1 += f.c(4, (q)this.g.get(i2));
        i2 += 1;
      }
      i2 = i1;
      if ((this.p & 0x20) == 32) {
        i2 = i1 + f.c(5, this.h);
      }
      int i4 = 0;
      i1 = i2;
      i2 = i4;
      while (i2 < this.j.size())
      {
        i1 += f.c(6, (q)this.j.get(i2));
        i2 += 1;
      }
      i2 = i1;
      if ((this.p & 0x10) == 16) {
        i2 = i1 + f.c(7, this.f);
      }
      i1 = i2;
      if ((this.p & 0x40) == 64) {
        i1 = i2 + f.c(8, this.i);
      }
      i2 = i1;
      if ((this.p & 0x1) == 1) {
        i2 = i1 + f.c(9, this.b);
      }
      i1 = i2;
      if ((this.p & 0x80) == 128) {
        i1 = i2 + f.c(30, this.k);
      }
      i4 = 0;
      i2 = i3;
      i3 = i4;
      while (i2 < this.l.size())
      {
        i3 += f.c(((Integer)this.l.get(i2)).intValue());
        i2 += 1;
      }
      i2 = i1 + i3 + this.l.size() * 2;
      i1 = i2;
      if ((this.p & 0x100) == 256) {
        i1 = i2 + f.c(32, this.m);
      }
      i1 = i1 + this.s.f() + this.o.a();
      this.t = i1;
      return i1;
    }
    
    public final boolean g()
    {
      return (this.p & 0x4) == 4;
    }
    
    public final boolean k()
    {
      return (this.p & 0x8) == 8;
    }
    
    public final boolean l()
    {
      return (this.p & 0x10) == 16;
    }
    
    public final boolean m()
    {
      return (this.p & 0x20) == 32;
    }
    
    public final boolean n()
    {
      return (this.p & 0x40) == 64;
    }
    
    public final boolean o()
    {
      return (this.p & 0x80) == 128;
    }
    
    public final boolean p()
    {
      return (this.p & 0x100) == 256;
    }
    
    public static final class a
      extends i.b<a.o, a>
      implements a.p
    {
      private int c;
      private int d = 6;
      private int e = 6;
      private int f;
      private a.aa g = a.aa.a();
      private int h;
      private List<a.ae> i = Collections.emptyList();
      private a.aa j = a.aa.a();
      private int k;
      private List<a.ai> l = Collections.emptyList();
      private a.ag m = a.ag.a();
      private List<Integer> n = Collections.emptyList();
      private a.g o = a.g.a();
      
      private a a(int paramInt)
      {
        this.c |= 0x1;
        this.d = paramInt;
        return this;
      }
      
      private a a(a.aa paramaa)
      {
        a.aa localaa = paramaa;
        if ((this.c & 0x8) == 8)
        {
          localaa = paramaa;
          if (this.g != a.aa.a()) {
            localaa = a.aa.a(this.g).a(paramaa).h();
          }
        }
        this.g = localaa;
        this.c |= 0x8;
        return this;
      }
      
      private a a(a.ag paramag)
      {
        a.ag localag = paramag;
        if ((this.c & 0x200) == 512)
        {
          localag = paramag;
          if (this.m != a.ag.a()) {
            localag = a.ag.a(this.m).a(paramag).f();
          }
        }
        this.m = localag;
        this.c |= 0x200;
        return this;
      }
      
      private a a(a.g paramg)
      {
        a.g localg = paramg;
        if ((this.c & 0x800) == 2048)
        {
          localg = paramg;
          if (this.o != a.g.a()) {
            localg = a.g.a(this.o).a(paramg).f();
          }
        }
        this.o = localg;
        this.c |= 0x800;
        return this;
      }
      
      private a b(int paramInt)
      {
        this.c |= 0x2;
        this.e = paramInt;
        return this;
      }
      
      private a b(a.aa paramaa)
      {
        a.aa localaa = paramaa;
        if ((this.c & 0x40) == 64)
        {
          localaa = paramaa;
          if (this.j != a.aa.a()) {
            localaa = a.aa.a(this.j).a(paramaa).h();
          }
        }
        this.j = localaa;
        this.c |= 0x40;
        return this;
      }
      
      private a c(int paramInt)
      {
        this.c |= 0x4;
        this.f = paramInt;
        return this;
      }
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 118	b/i/b/a/c/e/a$o:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 123 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$o
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 126	b/i/b/a/c/e/a$o$a:a	(Lb/i/b/a/c/e/a$o;)Lb/i/b/a/c/e/a$o$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 129	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$o
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 126	b/i/b/a/c/e/a$o$a:a	(Lb/i/b/a/c/e/a$o;)Lb/i/b/a/c/e/a$o$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a d(int paramInt)
      {
        this.c |= 0x10;
        this.h = paramInt;
        return this;
      }
      
      private a e(int paramInt)
      {
        this.c |= 0x80;
        this.k = paramInt;
        return this;
      }
      
      private a h()
      {
        return new a().a(i());
      }
      
      private a.o i()
      {
        int i2 = 0;
        a.o localo = new a.o(this, (byte)0);
        int i3 = this.c;
        if ((i3 & 0x1) == 1) {
          i2 = 1;
        }
        a.o.a(localo, this.d);
        int i1 = i2;
        if ((i3 & 0x2) == 2) {
          i1 = i2 | 0x2;
        }
        a.o.b(localo, this.e);
        i2 = i1;
        if ((i3 & 0x4) == 4) {
          i2 = i1 | 0x4;
        }
        a.o.c(localo, this.f);
        i1 = i2;
        if ((i3 & 0x8) == 8) {
          i1 = i2 | 0x8;
        }
        a.o.a(localo, this.g);
        i2 = i1;
        if ((i3 & 0x10) == 16) {
          i2 = i1 | 0x10;
        }
        a.o.d(localo, this.h);
        if ((this.c & 0x20) == 32)
        {
          this.i = Collections.unmodifiableList(this.i);
          this.c &= 0xFFFFFFDF;
        }
        a.o.a(localo, this.i);
        i1 = i2;
        if ((i3 & 0x40) == 64) {
          i1 = i2 | 0x20;
        }
        a.o.b(localo, this.j);
        i2 = i1;
        if ((i3 & 0x80) == 128) {
          i2 = i1 | 0x40;
        }
        a.o.e(localo, this.k);
        if ((this.c & 0x100) == 256)
        {
          this.l = Collections.unmodifiableList(this.l);
          this.c &= 0xFEFF;
        }
        a.o.b(localo, this.l);
        i1 = i2;
        if ((i3 & 0x200) == 512) {
          i1 = i2 | 0x80;
        }
        a.o.a(localo, this.m);
        if ((this.c & 0x400) == 1024)
        {
          this.n = Collections.unmodifiableList(this.n);
          this.c &= 0xFBFF;
        }
        a.o.c(localo, this.n);
        i2 = i1;
        if ((i3 & 0x800) == 2048) {
          i2 = i1 | 0x100;
        }
        a.o.a(localo, this.o);
        a.o.f(localo, i2);
        return localo;
      }
      
      private void k()
      {
        if ((this.c & 0x20) != 32)
        {
          this.i = new ArrayList(this.i);
          this.c |= 0x20;
        }
      }
      
      private void l()
      {
        if ((this.c & 0x100) != 256)
        {
          this.l = new ArrayList(this.l);
          this.c |= 0x100;
        }
      }
      
      private void m()
      {
        if ((this.c & 0x400) != 1024)
        {
          this.n = new ArrayList(this.n);
          this.c |= 0x400;
        }
      }
      
      public final a a(a.o paramo)
      {
        if (paramo == a.o.a()) {
          return this;
        }
        if (paramo.c()) {
          a(paramo.b);
        }
        if (paramo.d()) {
          b(paramo.c);
        }
        if (paramo.g()) {
          c(paramo.d);
        }
        if (paramo.k()) {
          a(paramo.e);
        }
        if (paramo.l()) {
          d(paramo.f);
        }
        if (!a.o.a(paramo).isEmpty()) {
          if (this.i.isEmpty())
          {
            this.i = a.o.a(paramo);
            this.c &= 0xFFFFFFDF;
          }
          else
          {
            k();
            this.i.addAll(a.o.a(paramo));
          }
        }
        if (paramo.m()) {
          b(paramo.h);
        }
        if (paramo.n()) {
          e(paramo.i);
        }
        if (!a.o.b(paramo).isEmpty()) {
          if (this.l.isEmpty())
          {
            this.l = a.o.b(paramo);
            this.c &= 0xFEFF;
          }
          else
          {
            l();
            this.l.addAll(a.o.b(paramo));
          }
        }
        if (paramo.o()) {
          a(paramo.k);
        }
        if (!a.o.c(paramo).isEmpty()) {
          if (this.n.isEmpty())
          {
            this.n = a.o.c(paramo);
            this.c &= 0xFBFF;
          }
          else
          {
            m();
            this.n.addAll(a.o.c(paramo));
          }
        }
        if (paramo.p()) {
          a(paramo.m);
        }
        a(paramo);
        this.a = this.a.a(a.o.d(paramo));
        return this;
      }
      
      public final boolean e()
      {
        if ((this.c & 0x4) == 4) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 == 0) {
          return false;
        }
        if ((this.c & 0x8) == 8) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if ((i1 != 0) && (!this.g.e())) {
          return false;
        }
        int i1 = 0;
        while (i1 < this.i.size())
        {
          if (!((a.ae)this.i.get(i1)).e()) {
            return false;
          }
          i1 += 1;
        }
        if ((this.c & 0x40) == 64) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if ((i1 != 0) && (!this.j.e())) {
          return false;
        }
        i1 = 0;
        while (i1 < this.l.size())
        {
          if (!((a.ai)this.l.get(i1)).e()) {
            return false;
          }
          i1 += 1;
        }
        if ((this.c & 0x200) == 512) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if ((i1 != 0) && (!this.m.e())) {
          return false;
        }
        if ((this.c & 0x800) == 2048) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if ((i1 != 0) && (!this.o.e())) {
          return false;
        }
        return this.b.e();
      }
    }
  }
  
  public static abstract interface p
    extends i.d
  {}
  
  public static enum q
    implements j.a
  {
    private static j.b<q> e = new j.b() {};
    private final int f;
    
    private q(int paramInt1, int paramInt2)
    {
      this.f = paramInt1;
    }
    
    public static q a(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return null;
      case 3: 
        return d;
      case 2: 
        return c;
      case 1: 
        return b;
      }
      return a;
    }
    
    public final int a()
    {
      return this.f;
    }
  }
  
  public static enum r
    implements j.a
  {
    private static j.b<r> e = new j.b() {};
    private final int f;
    
    private r(int paramInt1, int paramInt2)
    {
      this.f = paramInt1;
    }
    
    public static r a(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return null;
      case 3: 
        return d;
      case 2: 
        return c;
      case 1: 
        return b;
      }
      return a;
    }
    
    public final int a()
    {
      return this.f;
    }
  }
  
  public static final class s
    extends i.c<s>
    implements a.t
  {
    public static s<s> a = new b() {};
    private static final s g;
    public List<a.o> b;
    public List<a.u> c;
    public List<a.ab> d;
    public a.ag e;
    public a.am f;
    private final d h;
    private int i;
    private byte j = -1;
    private int k = -1;
    
    static
    {
      s locals = new s();
      g = locals;
      locals.g();
    }
    
    private s()
    {
      this.h = d.b;
    }
    
    /* Error */
    private s(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 51	b/i/b/a/c/g/i$c:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 53	b/i/b/a/c/e/a$s:j	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 55	b/i/b/a/c/e/a$s:k	I
      //   14: aload_0
      //   15: invokespecial 49	b/i/b/a/c/e/a$s:g	()V
      //   18: invokestatic 69	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   21: astore 11
      //   23: aload 11
      //   25: iconst_1
      //   26: invokestatic 74	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   29: astore 12
      //   31: iconst_0
      //   32: istore 8
      //   34: iconst_0
      //   35: istore_3
      //   36: iload 8
      //   38: ifne +760 -> 798
      //   41: iload_3
      //   42: istore 4
      //   44: iload_3
      //   45: istore 5
      //   47: iload_3
      //   48: istore 6
      //   50: aload_1
      //   51: invokevirtual 79	b/i/b/a/c/g/e:a	()I
      //   54: istore 7
      //   56: iload 7
      //   58: ifeq +587 -> 645
      //   61: iload 7
      //   63: bipush 26
      //   65: if_icmpeq +499 -> 564
      //   68: iload 7
      //   70: bipush 34
      //   72: if_icmpeq +411 -> 483
      //   75: iload 7
      //   77: bipush 42
      //   79: if_icmpeq +304 -> 383
      //   82: aconst_null
      //   83: astore 10
      //   85: aconst_null
      //   86: astore 9
      //   88: iload 7
      //   90: sipush 242
      //   93: if_icmpeq +161 -> 254
      //   96: iload 7
      //   98: sipush 258
      //   101: if_icmpeq +28 -> 129
      //   104: iload_3
      //   105: istore 4
      //   107: iload_3
      //   108: istore 5
      //   110: iload_3
      //   111: istore 6
      //   113: aload_0
      //   114: aload_1
      //   115: aload 12
      //   117: aload_2
      //   118: iload 7
      //   120: invokevirtual 82	b/i/b/a/c/e/a$s:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   123: ifne -87 -> 36
      //   126: goto +519 -> 645
      //   129: iload_3
      //   130: istore 4
      //   132: iload_3
      //   133: istore 5
      //   135: iload_3
      //   136: istore 6
      //   138: aload_0
      //   139: getfield 84	b/i/b/a/c/e/a$s:i	I
      //   142: iconst_2
      //   143: iand
      //   144: iconst_2
      //   145: if_icmpne +21 -> 166
      //   148: iload_3
      //   149: istore 4
      //   151: iload_3
      //   152: istore 5
      //   154: iload_3
      //   155: istore 6
      //   157: aload_0
      //   158: getfield 86	b/i/b/a/c/e/a$s:f	Lb/i/b/a/c/e/a$am;
      //   161: invokestatic 91	b/i/b/a/c/e/a$am:a	(Lb/i/b/a/c/e/a$am;)Lb/i/b/a/c/e/a$am$a;
      //   164: astore 9
      //   166: iload_3
      //   167: istore 4
      //   169: iload_3
      //   170: istore 5
      //   172: iload_3
      //   173: istore 6
      //   175: aload_0
      //   176: aload_1
      //   177: getstatic 92	b/i/b/a/c/e/a$am:a	Lb/i/b/a/c/g/s;
      //   180: aload_2
      //   181: invokevirtual 95	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   184: checkcast 88	b/i/b/a/c/e/a$am
      //   187: putfield 86	b/i/b/a/c/e/a$s:f	Lb/i/b/a/c/e/a$am;
      //   190: aload 9
      //   192: ifnull +40 -> 232
      //   195: iload_3
      //   196: istore 4
      //   198: iload_3
      //   199: istore 5
      //   201: iload_3
      //   202: istore 6
      //   204: aload 9
      //   206: aload_0
      //   207: getfield 86	b/i/b/a/c/e/a$s:f	Lb/i/b/a/c/e/a$am;
      //   210: invokevirtual 98	b/i/b/a/c/e/a$am$a:a	(Lb/i/b/a/c/e/a$am;)Lb/i/b/a/c/e/a$am$a;
      //   213: pop
      //   214: iload_3
      //   215: istore 4
      //   217: iload_3
      //   218: istore 5
      //   220: iload_3
      //   221: istore 6
      //   223: aload_0
      //   224: aload 9
      //   226: invokevirtual 101	b/i/b/a/c/e/a$am$a:f	()Lb/i/b/a/c/e/a$am;
      //   229: putfield 86	b/i/b/a/c/e/a$s:f	Lb/i/b/a/c/e/a$am;
      //   232: iload_3
      //   233: istore 4
      //   235: iload_3
      //   236: istore 5
      //   238: iload_3
      //   239: istore 6
      //   241: aload_0
      //   242: aload_0
      //   243: getfield 84	b/i/b/a/c/e/a$s:i	I
      //   246: iconst_2
      //   247: ior
      //   248: putfield 84	b/i/b/a/c/e/a$s:i	I
      //   251: goto -215 -> 36
      //   254: aload 10
      //   256: astore 9
      //   258: iload_3
      //   259: istore 4
      //   261: iload_3
      //   262: istore 5
      //   264: iload_3
      //   265: istore 6
      //   267: aload_0
      //   268: getfield 84	b/i/b/a/c/e/a$s:i	I
      //   271: iconst_1
      //   272: iand
      //   273: iconst_1
      //   274: if_icmpne +21 -> 295
      //   277: iload_3
      //   278: istore 4
      //   280: iload_3
      //   281: istore 5
      //   283: iload_3
      //   284: istore 6
      //   286: aload_0
      //   287: getfield 103	b/i/b/a/c/e/a$s:e	Lb/i/b/a/c/e/a$ag;
      //   290: invokestatic 108	b/i/b/a/c/e/a$ag:a	(Lb/i/b/a/c/e/a$ag;)Lb/i/b/a/c/e/a$ag$a;
      //   293: astore 9
      //   295: iload_3
      //   296: istore 4
      //   298: iload_3
      //   299: istore 5
      //   301: iload_3
      //   302: istore 6
      //   304: aload_0
      //   305: aload_1
      //   306: getstatic 109	b/i/b/a/c/e/a$ag:a	Lb/i/b/a/c/g/s;
      //   309: aload_2
      //   310: invokevirtual 95	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   313: checkcast 105	b/i/b/a/c/e/a$ag
      //   316: putfield 103	b/i/b/a/c/e/a$s:e	Lb/i/b/a/c/e/a$ag;
      //   319: aload 9
      //   321: ifnull +40 -> 361
      //   324: iload_3
      //   325: istore 4
      //   327: iload_3
      //   328: istore 5
      //   330: iload_3
      //   331: istore 6
      //   333: aload 9
      //   335: aload_0
      //   336: getfield 103	b/i/b/a/c/e/a$s:e	Lb/i/b/a/c/e/a$ag;
      //   339: invokevirtual 112	b/i/b/a/c/e/a$ag$a:a	(Lb/i/b/a/c/e/a$ag;)Lb/i/b/a/c/e/a$ag$a;
      //   342: pop
      //   343: iload_3
      //   344: istore 4
      //   346: iload_3
      //   347: istore 5
      //   349: iload_3
      //   350: istore 6
      //   352: aload_0
      //   353: aload 9
      //   355: invokevirtual 115	b/i/b/a/c/e/a$ag$a:f	()Lb/i/b/a/c/e/a$ag;
      //   358: putfield 103	b/i/b/a/c/e/a$s:e	Lb/i/b/a/c/e/a$ag;
      //   361: iload_3
      //   362: istore 4
      //   364: iload_3
      //   365: istore 5
      //   367: iload_3
      //   368: istore 6
      //   370: aload_0
      //   371: aload_0
      //   372: getfield 84	b/i/b/a/c/e/a$s:i	I
      //   375: iconst_1
      //   376: ior
      //   377: putfield 84	b/i/b/a/c/e/a$s:i	I
      //   380: goto -344 -> 36
      //   383: iload_3
      //   384: istore 7
      //   386: iload_3
      //   387: iconst_4
      //   388: iand
      //   389: iconst_4
      //   390: if_icmpeq +28 -> 418
      //   393: iload_3
      //   394: istore 4
      //   396: iload_3
      //   397: istore 5
      //   399: iload_3
      //   400: istore 6
      //   402: aload_0
      //   403: new 117	java/util/ArrayList
      //   406: dup
      //   407: invokespecial 118	java/util/ArrayList:<init>	()V
      //   410: putfield 120	b/i/b/a/c/e/a$s:d	Ljava/util/List;
      //   413: iload_3
      //   414: iconst_4
      //   415: ior
      //   416: istore 7
      //   418: iload 7
      //   420: istore 4
      //   422: iload 7
      //   424: istore 5
      //   426: iload 7
      //   428: istore 6
      //   430: aload_0
      //   431: getfield 120	b/i/b/a/c/e/a$s:d	Ljava/util/List;
      //   434: astore 9
      //   436: iload 7
      //   438: istore 4
      //   440: iload 7
      //   442: istore 5
      //   444: iload 7
      //   446: istore 6
      //   448: aload_1
      //   449: getstatic 123	b/i/b/a/c/e/a$ab:a	Lb/i/b/a/c/g/s;
      //   452: aload_2
      //   453: invokevirtual 95	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   456: astore 10
      //   458: iload 7
      //   460: istore_3
      //   461: iload_3
      //   462: istore 4
      //   464: iload_3
      //   465: istore 5
      //   467: iload_3
      //   468: istore 6
      //   470: aload 9
      //   472: aload 10
      //   474: invokeinterface 129 2 0
      //   479: pop
      //   480: goto -444 -> 36
      //   483: iload_3
      //   484: istore 7
      //   486: iload_3
      //   487: iconst_2
      //   488: iand
      //   489: iconst_2
      //   490: if_icmpeq +28 -> 518
      //   493: iload_3
      //   494: istore 4
      //   496: iload_3
      //   497: istore 5
      //   499: iload_3
      //   500: istore 6
      //   502: aload_0
      //   503: new 117	java/util/ArrayList
      //   506: dup
      //   507: invokespecial 118	java/util/ArrayList:<init>	()V
      //   510: putfield 131	b/i/b/a/c/e/a$s:c	Ljava/util/List;
      //   513: iload_3
      //   514: iconst_2
      //   515: ior
      //   516: istore 7
      //   518: iload 7
      //   520: istore 4
      //   522: iload 7
      //   524: istore 5
      //   526: iload 7
      //   528: istore 6
      //   530: aload_0
      //   531: getfield 131	b/i/b/a/c/e/a$s:c	Ljava/util/List;
      //   534: astore 9
      //   536: iload 7
      //   538: istore 4
      //   540: iload 7
      //   542: istore 5
      //   544: iload 7
      //   546: istore 6
      //   548: aload_1
      //   549: getstatic 134	b/i/b/a/c/e/a$u:a	Lb/i/b/a/c/g/s;
      //   552: aload_2
      //   553: invokevirtual 95	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   556: astore 10
      //   558: iload 7
      //   560: istore_3
      //   561: goto -100 -> 461
      //   564: iload_3
      //   565: istore 7
      //   567: iload_3
      //   568: iconst_1
      //   569: iand
      //   570: iconst_1
      //   571: if_icmpeq +28 -> 599
      //   574: iload_3
      //   575: istore 4
      //   577: iload_3
      //   578: istore 5
      //   580: iload_3
      //   581: istore 6
      //   583: aload_0
      //   584: new 117	java/util/ArrayList
      //   587: dup
      //   588: invokespecial 118	java/util/ArrayList:<init>	()V
      //   591: putfield 136	b/i/b/a/c/e/a$s:b	Ljava/util/List;
      //   594: iload_3
      //   595: iconst_1
      //   596: ior
      //   597: istore 7
      //   599: iload 7
      //   601: istore 4
      //   603: iload 7
      //   605: istore 5
      //   607: iload 7
      //   609: istore 6
      //   611: aload_0
      //   612: getfield 136	b/i/b/a/c/e/a$s:b	Ljava/util/List;
      //   615: astore 9
      //   617: iload 7
      //   619: istore 4
      //   621: iload 7
      //   623: istore 5
      //   625: iload 7
      //   627: istore 6
      //   629: aload_1
      //   630: getstatic 139	b/i/b/a/c/e/a$o:a	Lb/i/b/a/c/g/s;
      //   633: aload_2
      //   634: invokevirtual 95	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   637: astore 10
      //   639: iload 7
      //   641: istore_3
      //   642: goto -181 -> 461
      //   645: iconst_1
      //   646: istore 8
      //   648: goto -612 -> 36
      //   651: astore_1
      //   652: goto +51 -> 703
      //   655: astore_1
      //   656: iload 5
      //   658: istore 4
      //   660: new 64	b/i/b/a/c/g/k
      //   663: dup
      //   664: aload_1
      //   665: invokevirtual 143	java/io/IOException:getMessage	()Ljava/lang/String;
      //   668: invokespecial 146	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   671: astore_1
      //   672: iload 5
      //   674: istore 4
      //   676: aload_1
      //   677: aload_0
      //   678: putfield 149	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   681: iload 5
      //   683: istore 4
      //   685: aload_1
      //   686: athrow
      //   687: astore_1
      //   688: iload 6
      //   690: istore 4
      //   692: aload_1
      //   693: aload_0
      //   694: putfield 149	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   697: iload 6
      //   699: istore 4
      //   701: aload_1
      //   702: athrow
      //   703: iload 4
      //   705: iconst_1
      //   706: iand
      //   707: iconst_1
      //   708: if_icmpne +14 -> 722
      //   711: aload_0
      //   712: aload_0
      //   713: getfield 136	b/i/b/a/c/e/a$s:b	Ljava/util/List;
      //   716: invokestatic 155	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   719: putfield 136	b/i/b/a/c/e/a$s:b	Ljava/util/List;
      //   722: iload 4
      //   724: iconst_2
      //   725: iand
      //   726: iconst_2
      //   727: if_icmpne +14 -> 741
      //   730: aload_0
      //   731: aload_0
      //   732: getfield 131	b/i/b/a/c/e/a$s:c	Ljava/util/List;
      //   735: invokestatic 155	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   738: putfield 131	b/i/b/a/c/e/a$s:c	Ljava/util/List;
      //   741: iload 4
      //   743: iconst_4
      //   744: iand
      //   745: iconst_4
      //   746: if_icmpne +14 -> 760
      //   749: aload_0
      //   750: aload_0
      //   751: getfield 120	b/i/b/a/c/e/a$s:d	Ljava/util/List;
      //   754: invokestatic 155	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   757: putfield 120	b/i/b/a/c/e/a$s:d	Ljava/util/List;
      //   760: aload 12
      //   762: invokevirtual 157	b/i/b/a/c/g/f:a	()V
      //   765: aload_0
      //   766: aload 11
      //   768: invokevirtual 162	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   771: putfield 61	b/i/b/a/c/e/a$s:h	Lb/i/b/a/c/g/d;
      //   774: goto +15 -> 789
      //   777: astore_1
      //   778: aload_0
      //   779: aload 11
      //   781: invokevirtual 162	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   784: putfield 61	b/i/b/a/c/e/a$s:h	Lb/i/b/a/c/g/d;
      //   787: aload_1
      //   788: athrow
      //   789: aload_0
      //   790: getfield 165	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   793: invokevirtual 169	b/i/b/a/c/g/h:c	()V
      //   796: aload_1
      //   797: athrow
      //   798: iload_3
      //   799: iconst_1
      //   800: iand
      //   801: iconst_1
      //   802: if_icmpne +14 -> 816
      //   805: aload_0
      //   806: aload_0
      //   807: getfield 136	b/i/b/a/c/e/a$s:b	Ljava/util/List;
      //   810: invokestatic 155	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   813: putfield 136	b/i/b/a/c/e/a$s:b	Ljava/util/List;
      //   816: iload_3
      //   817: iconst_2
      //   818: iand
      //   819: iconst_2
      //   820: if_icmpne +14 -> 834
      //   823: aload_0
      //   824: aload_0
      //   825: getfield 131	b/i/b/a/c/e/a$s:c	Ljava/util/List;
      //   828: invokestatic 155	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   831: putfield 131	b/i/b/a/c/e/a$s:c	Ljava/util/List;
      //   834: iload_3
      //   835: iconst_4
      //   836: iand
      //   837: iconst_4
      //   838: if_icmpne +14 -> 852
      //   841: aload_0
      //   842: aload_0
      //   843: getfield 120	b/i/b/a/c/e/a$s:d	Ljava/util/List;
      //   846: invokestatic 155	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   849: putfield 120	b/i/b/a/c/e/a$s:d	Ljava/util/List;
      //   852: aload 12
      //   854: invokevirtual 157	b/i/b/a/c/g/f:a	()V
      //   857: aload_0
      //   858: aload 11
      //   860: invokevirtual 162	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   863: putfield 61	b/i/b/a/c/e/a$s:h	Lb/i/b/a/c/g/d;
      //   866: goto +15 -> 881
      //   869: astore_1
      //   870: aload_0
      //   871: aload 11
      //   873: invokevirtual 162	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   876: putfield 61	b/i/b/a/c/e/a$s:h	Lb/i/b/a/c/g/d;
      //   879: aload_1
      //   880: athrow
      //   881: aload_0
      //   882: getfield 165	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   885: invokevirtual 169	b/i/b/a/c/g/h:c	()V
      //   888: return
      //   889: astore_2
      //   890: goto -125 -> 765
      //   893: astore_1
      //   894: goto -37 -> 857
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	897	0	this	s
      //   0	897	1	parame	b.i.b.a.c.g.e
      //   0	897	2	paramg	g
      //   35	802	3	m	int
      //   42	703	4	n	int
      //   45	637	5	i1	int
      //   48	650	6	i2	int
      //   54	586	7	i3	int
      //   32	615	8	i4	int
      //   86	530	9	localObject	Object
      //   83	555	10	localq	q
      //   21	851	11	localb	b.i.b.a.c.g.d.b
      //   29	824	12	localf	f
      // Exception table:
      //   from	to	target	type
      //   50	56	651	finally
      //   113	126	651	finally
      //   138	148	651	finally
      //   157	166	651	finally
      //   175	190	651	finally
      //   204	214	651	finally
      //   223	232	651	finally
      //   241	251	651	finally
      //   267	277	651	finally
      //   286	295	651	finally
      //   304	319	651	finally
      //   333	343	651	finally
      //   352	361	651	finally
      //   370	380	651	finally
      //   402	413	651	finally
      //   430	436	651	finally
      //   448	458	651	finally
      //   470	480	651	finally
      //   502	513	651	finally
      //   530	536	651	finally
      //   548	558	651	finally
      //   583	594	651	finally
      //   611	617	651	finally
      //   629	639	651	finally
      //   660	672	651	finally
      //   676	681	651	finally
      //   685	687	651	finally
      //   692	697	651	finally
      //   701	703	651	finally
      //   50	56	655	java/io/IOException
      //   113	126	655	java/io/IOException
      //   138	148	655	java/io/IOException
      //   157	166	655	java/io/IOException
      //   175	190	655	java/io/IOException
      //   204	214	655	java/io/IOException
      //   223	232	655	java/io/IOException
      //   241	251	655	java/io/IOException
      //   267	277	655	java/io/IOException
      //   286	295	655	java/io/IOException
      //   304	319	655	java/io/IOException
      //   333	343	655	java/io/IOException
      //   352	361	655	java/io/IOException
      //   370	380	655	java/io/IOException
      //   402	413	655	java/io/IOException
      //   430	436	655	java/io/IOException
      //   448	458	655	java/io/IOException
      //   470	480	655	java/io/IOException
      //   502	513	655	java/io/IOException
      //   530	536	655	java/io/IOException
      //   548	558	655	java/io/IOException
      //   583	594	655	java/io/IOException
      //   611	617	655	java/io/IOException
      //   629	639	655	java/io/IOException
      //   50	56	687	b/i/b/a/c/g/k
      //   113	126	687	b/i/b/a/c/g/k
      //   138	148	687	b/i/b/a/c/g/k
      //   157	166	687	b/i/b/a/c/g/k
      //   175	190	687	b/i/b/a/c/g/k
      //   204	214	687	b/i/b/a/c/g/k
      //   223	232	687	b/i/b/a/c/g/k
      //   241	251	687	b/i/b/a/c/g/k
      //   267	277	687	b/i/b/a/c/g/k
      //   286	295	687	b/i/b/a/c/g/k
      //   304	319	687	b/i/b/a/c/g/k
      //   333	343	687	b/i/b/a/c/g/k
      //   352	361	687	b/i/b/a/c/g/k
      //   370	380	687	b/i/b/a/c/g/k
      //   402	413	687	b/i/b/a/c/g/k
      //   430	436	687	b/i/b/a/c/g/k
      //   448	458	687	b/i/b/a/c/g/k
      //   470	480	687	b/i/b/a/c/g/k
      //   502	513	687	b/i/b/a/c/g/k
      //   530	536	687	b/i/b/a/c/g/k
      //   548	558	687	b/i/b/a/c/g/k
      //   583	594	687	b/i/b/a/c/g/k
      //   611	617	687	b/i/b/a/c/g/k
      //   629	639	687	b/i/b/a/c/g/k
      //   760	765	777	finally
      //   852	857	869	finally
      //   760	765	889	java/io/IOException
      //   852	857	893	java/io/IOException
    }
    
    private s(i.b<s, ?> paramb)
    {
      super();
      this.h = paramb.a;
    }
    
    public static s a()
    {
      return g;
    }
    
    public static s a(InputStream paramInputStream, g paramg)
      throws IOException
    {
      return (s)a.b(paramInputStream, paramg);
    }
    
    private void g()
    {
      this.b = Collections.emptyList();
      this.c = Collections.emptyList();
      this.d = Collections.emptyList();
      this.e = a.ag.a();
      this.f = a.am.a();
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      i.c.a locala = x();
      int i1 = 0;
      int m = 0;
      while (m < this.b.size())
      {
        paramf.a(3, (q)this.b.get(m));
        m += 1;
      }
      m = 0;
      int n;
      for (;;)
      {
        n = i1;
        if (m >= this.c.size()) {
          break;
        }
        paramf.a(4, (q)this.c.get(m));
        m += 1;
      }
      while (n < this.d.size())
      {
        paramf.a(5, (q)this.d.get(n));
        n += 1;
      }
      if ((this.i & 0x1) == 1) {
        paramf.a(30, this.e);
      }
      if ((this.i & 0x2) == 2) {
        paramf.a(32, this.f);
      }
      locala.a(200, paramf);
      paramf.c(this.h);
    }
    
    public final s<s> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.i & 0x1) == 1;
    }
    
    public final boolean d()
    {
      return (this.i & 0x2) == 2;
    }
    
    public final boolean e()
    {
      int m = this.j;
      if (m == 1) {
        return true;
      }
      if (m == 0) {
        return false;
      }
      m = 0;
      while (m < this.b.size())
      {
        if (!((a.o)this.b.get(m)).e())
        {
          this.j = 0;
          return false;
        }
        m += 1;
      }
      m = 0;
      while (m < this.c.size())
      {
        if (!((a.u)this.c.get(m)).e())
        {
          this.j = 0;
          return false;
        }
        m += 1;
      }
      m = 0;
      while (m < this.d.size())
      {
        if (!((a.ab)this.d.get(m)).e())
        {
          this.j = 0;
          return false;
        }
        m += 1;
      }
      if ((c()) && (!this.e.e()))
      {
        this.j = 0;
        return false;
      }
      if (!this.s.e())
      {
        this.j = 0;
        return false;
      }
      this.j = 1;
      return true;
    }
    
    public final int f()
    {
      int m = this.k;
      if (m != -1) {
        return m;
      }
      int i3 = 0;
      int n = 0;
      m = 0;
      while (n < this.b.size())
      {
        m += f.c(3, (q)this.b.get(n));
        n += 1;
      }
      int i1 = 0;
      int i2;
      for (;;)
      {
        i2 = i3;
        n = m;
        if (i1 >= this.c.size()) {
          break;
        }
        m += f.c(4, (q)this.c.get(i1));
        i1 += 1;
      }
      while (i2 < this.d.size())
      {
        n += f.c(5, (q)this.d.get(i2));
        i2 += 1;
      }
      m = n;
      if ((this.i & 0x1) == 1) {
        m = n + f.c(30, this.e);
      }
      n = m;
      if ((this.i & 0x2) == 2) {
        n = m + f.c(32, this.f);
      }
      m = n + this.s.f() + this.h.a();
      this.k = m;
      return m;
    }
    
    public static final class a
      extends i.b<a.s, a>
      implements a.t
    {
      private int c;
      private List<a.o> d = Collections.emptyList();
      private List<a.u> e = Collections.emptyList();
      private List<a.ab> f = Collections.emptyList();
      private a.ag g = a.ag.a();
      private a.am h = a.am.a();
      
      private a a(a.ag paramag)
      {
        a.ag localag = paramag;
        if ((this.c & 0x8) == 8)
        {
          localag = paramag;
          if (this.g != a.ag.a()) {
            localag = a.ag.a(this.g).a(paramag).f();
          }
        }
        this.g = localag;
        this.c |= 0x8;
        return this;
      }
      
      private a a(a.am paramam)
      {
        a.am localam = paramam;
        if ((this.c & 0x10) == 16)
        {
          localam = paramam;
          if (this.h != a.am.a()) {
            localam = a.am.a(this.h).a(paramam).f();
          }
        }
        this.h = localam;
        this.c |= 0x10;
        return this;
      }
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 85	b/i/b/a/c/e/a$s:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 90 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$s
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 93	b/i/b/a/c/e/a$s$a:a	(Lb/i/b/a/c/e/a$s;)Lb/i/b/a/c/e/a$s$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 96	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$s
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 93	b/i/b/a/c/e/a$s$a:a	(Lb/i/b/a/c/e/a$s;)Lb/i/b/a/c/e/a$s$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a h()
      {
        return new a().a(i());
      }
      
      private a.s i()
      {
        int i = 0;
        a.s locals = new a.s(this, (byte)0);
        int k = this.c;
        if ((this.c & 0x1) == 1)
        {
          this.d = Collections.unmodifiableList(this.d);
          this.c &= 0xFFFFFFFE;
        }
        a.s.a(locals, this.d);
        if ((this.c & 0x2) == 2)
        {
          this.e = Collections.unmodifiableList(this.e);
          this.c &= 0xFFFFFFFD;
        }
        a.s.b(locals, this.e);
        if ((this.c & 0x4) == 4)
        {
          this.f = Collections.unmodifiableList(this.f);
          this.c &= 0xFFFFFFFB;
        }
        a.s.c(locals, this.f);
        if ((k & 0x8) == 8) {
          i = 1;
        }
        a.s.a(locals, this.g);
        int j = i;
        if ((k & 0x10) == 16) {
          j = i | 0x2;
        }
        a.s.a(locals, this.h);
        a.s.a(locals, j);
        return locals;
      }
      
      private void k()
      {
        if ((this.c & 0x1) != 1)
        {
          this.d = new ArrayList(this.d);
          this.c |= 0x1;
        }
      }
      
      private void l()
      {
        if ((this.c & 0x2) != 2)
        {
          this.e = new ArrayList(this.e);
          this.c |= 0x2;
        }
      }
      
      private void m()
      {
        if ((this.c & 0x4) != 4)
        {
          this.f = new ArrayList(this.f);
          this.c |= 0x4;
        }
      }
      
      public final a a(a.s params)
      {
        if (params == a.s.a()) {
          return this;
        }
        if (!a.s.a(params).isEmpty()) {
          if (this.d.isEmpty())
          {
            this.d = a.s.a(params);
            this.c &= 0xFFFFFFFE;
          }
          else
          {
            k();
            this.d.addAll(a.s.a(params));
          }
        }
        if (!a.s.b(params).isEmpty()) {
          if (this.e.isEmpty())
          {
            this.e = a.s.b(params);
            this.c &= 0xFFFFFFFD;
          }
          else
          {
            l();
            this.e.addAll(a.s.b(params));
          }
        }
        if (!a.s.c(params).isEmpty()) {
          if (this.f.isEmpty())
          {
            this.f = a.s.c(params);
            this.c &= 0xFFFFFFFB;
          }
          else
          {
            m();
            this.f.addAll(a.s.c(params));
          }
        }
        if (params.c()) {
          a(params.e);
        }
        if (params.d()) {
          a(params.f);
        }
        a(params);
        this.a = this.a.a(a.s.d(params));
        return this;
      }
      
      public final boolean e()
      {
        int i = 0;
        while (i < this.d.size())
        {
          if (!((a.o)this.d.get(i)).e()) {
            return false;
          }
          i += 1;
        }
        i = 0;
        while (i < this.e.size())
        {
          if (!((a.u)this.e.get(i)).e()) {
            return false;
          }
          i += 1;
        }
        i = 0;
        while (i < this.f.size())
        {
          if (!((a.ab)this.f.get(i)).e()) {
            return false;
          }
          i += 1;
        }
        if ((this.c & 0x8) == 8) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (!this.g.e())) {
          return false;
        }
        return this.b.e();
      }
    }
  }
  
  public static abstract interface t
    extends i.d
  {}
  
  public static final class u
    extends i.c<u>
    implements a.v
  {
    public static s<u> a = new b() {};
    private static final u n;
    public int b;
    public int c;
    public int d;
    public a.aa e;
    public int f;
    public List<a.ae> g;
    public a.aa h;
    public int i;
    public a.ai j;
    public int k;
    public int l;
    public List<Integer> m;
    private final d o;
    private int p;
    private byte q = -1;
    private int t = -1;
    
    static
    {
      u localu = new u();
      n = localu;
      localu.r();
    }
    
    private u()
    {
      this.o = d.b;
    }
    
    /* Error */
    private u(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 58	b/i/b/a/c/g/i$c:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 60	b/i/b/a/c/e/a$u:q	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 62	b/i/b/a/c/e/a$u:t	I
      //   14: aload_0
      //   15: invokespecial 56	b/i/b/a/c/e/a$u:r	()V
      //   18: invokestatic 76	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   21: astore 14
      //   23: aload 14
      //   25: iconst_1
      //   26: invokestatic 81	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   29: astore 15
      //   31: iconst_0
      //   32: istore 8
      //   34: iconst_0
      //   35: istore_3
      //   36: iload 8
      //   38: ifne +1363 -> 1401
      //   41: iload_3
      //   42: istore 4
      //   44: iload_3
      //   45: istore 5
      //   47: iload_3
      //   48: istore 6
      //   50: aload_1
      //   51: invokevirtual 86	b/i/b/a/c/g/e:a	()I
      //   54: istore 7
      //   56: aconst_null
      //   57: astore 12
      //   59: aconst_null
      //   60: astore 13
      //   62: aconst_null
      //   63: astore 11
      //   65: iload 7
      //   67: lookupswitch	default:+1421->1488, 0:+1186->1253, 8:+1147->1214, 16:+1108->1175, 26:+973->1040, 34:+889->956, 42:+757->824, 50:+605->672, 56:+564->631, 64:+523->590, 72:+483->550, 80:+443->510, 88:+404->471, 248:+299->366, 250:+145->212
      //   188: iload_3
      //   189: istore 4
      //   191: iload_3
      //   192: istore 5
      //   194: iload_3
      //   195: istore 6
      //   197: aload_0
      //   198: aload_1
      //   199: aload 15
      //   201: aload_2
      //   202: iload 7
      //   204: invokevirtual 89	b/i/b/a/c/e/a$u:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   207: istore 10
      //   209: goto +1050 -> 1259
      //   212: iload_3
      //   213: istore 4
      //   215: iload_3
      //   216: istore 5
      //   218: iload_3
      //   219: istore 6
      //   221: aload_1
      //   222: aload_1
      //   223: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   226: invokevirtual 94	b/i/b/a/c/g/e:b	(I)I
      //   229: istore 9
      //   231: iload_3
      //   232: istore 7
      //   234: iload_3
      //   235: sipush 2048
      //   238: iand
      //   239: sipush 2048
      //   242: if_icmpeq +49 -> 291
      //   245: iload_3
      //   246: istore 7
      //   248: iload_3
      //   249: istore 4
      //   251: iload_3
      //   252: istore 5
      //   254: iload_3
      //   255: istore 6
      //   257: aload_1
      //   258: invokevirtual 96	b/i/b/a/c/g/e:h	()I
      //   261: ifle +30 -> 291
      //   264: iload_3
      //   265: istore 4
      //   267: iload_3
      //   268: istore 5
      //   270: iload_3
      //   271: istore 6
      //   273: aload_0
      //   274: new 98	java/util/ArrayList
      //   277: dup
      //   278: invokespecial 99	java/util/ArrayList:<init>	()V
      //   281: putfield 101	b/i/b/a/c/e/a$u:m	Ljava/util/List;
      //   284: iload_3
      //   285: sipush 2048
      //   288: ior
      //   289: istore 7
      //   291: iload 7
      //   293: istore 4
      //   295: iload 7
      //   297: istore 5
      //   299: iload 7
      //   301: istore 6
      //   303: aload_1
      //   304: invokevirtual 96	b/i/b/a/c/g/e:h	()I
      //   307: ifle +35 -> 342
      //   310: iload 7
      //   312: istore 4
      //   314: iload 7
      //   316: istore 5
      //   318: iload 7
      //   320: istore 6
      //   322: aload_0
      //   323: getfield 101	b/i/b/a/c/e/a$u:m	Ljava/util/List;
      //   326: aload_1
      //   327: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   330: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   333: invokeinterface 113 2 0
      //   338: pop
      //   339: goto -48 -> 291
      //   342: iload 7
      //   344: istore 4
      //   346: iload 7
      //   348: istore 5
      //   350: iload 7
      //   352: istore 6
      //   354: aload_1
      //   355: iload 9
      //   357: invokevirtual 116	b/i/b/a/c/g/e:c	(I)V
      //   360: iload 7
      //   362: istore_3
      //   363: goto -327 -> 36
      //   366: iload_3
      //   367: istore 7
      //   369: iload_3
      //   370: sipush 2048
      //   373: iand
      //   374: sipush 2048
      //   377: if_icmpeq +30 -> 407
      //   380: iload_3
      //   381: istore 4
      //   383: iload_3
      //   384: istore 5
      //   386: iload_3
      //   387: istore 6
      //   389: aload_0
      //   390: new 98	java/util/ArrayList
      //   393: dup
      //   394: invokespecial 99	java/util/ArrayList:<init>	()V
      //   397: putfield 101	b/i/b/a/c/e/a$u:m	Ljava/util/List;
      //   400: iload_3
      //   401: sipush 2048
      //   404: ior
      //   405: istore 7
      //   407: iload 7
      //   409: istore 4
      //   411: iload 7
      //   413: istore 5
      //   415: iload 7
      //   417: istore 6
      //   419: aload_0
      //   420: getfield 101	b/i/b/a/c/e/a$u:m	Ljava/util/List;
      //   423: astore 11
      //   425: iload 7
      //   427: istore 4
      //   429: iload 7
      //   431: istore 5
      //   433: iload 7
      //   435: istore 6
      //   437: aload_1
      //   438: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   441: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   444: astore 12
      //   446: iload 7
      //   448: istore_3
      //   449: iload_3
      //   450: istore 4
      //   452: iload_3
      //   453: istore 5
      //   455: iload_3
      //   456: istore 6
      //   458: aload 11
      //   460: aload 12
      //   462: invokeinterface 113 2 0
      //   467: pop
      //   468: goto -432 -> 36
      //   471: iload_3
      //   472: istore 4
      //   474: iload_3
      //   475: istore 5
      //   477: iload_3
      //   478: istore 6
      //   480: aload_0
      //   481: aload_0
      //   482: getfield 118	b/i/b/a/c/e/a$u:p	I
      //   485: iconst_1
      //   486: ior
      //   487: putfield 118	b/i/b/a/c/e/a$u:p	I
      //   490: iload_3
      //   491: istore 4
      //   493: iload_3
      //   494: istore 5
      //   496: iload_3
      //   497: istore 6
      //   499: aload_0
      //   500: aload_1
      //   501: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   504: putfield 120	b/i/b/a/c/e/a$u:b	I
      //   507: goto -471 -> 36
      //   510: iload_3
      //   511: istore 4
      //   513: iload_3
      //   514: istore 5
      //   516: iload_3
      //   517: istore 6
      //   519: aload_0
      //   520: aload_0
      //   521: getfield 118	b/i/b/a/c/e/a$u:p	I
      //   524: bipush 64
      //   526: ior
      //   527: putfield 118	b/i/b/a/c/e/a$u:p	I
      //   530: iload_3
      //   531: istore 4
      //   533: iload_3
      //   534: istore 5
      //   536: iload_3
      //   537: istore 6
      //   539: aload_0
      //   540: aload_1
      //   541: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   544: putfield 122	b/i/b/a/c/e/a$u:i	I
      //   547: goto -511 -> 36
      //   550: iload_3
      //   551: istore 4
      //   553: iload_3
      //   554: istore 5
      //   556: iload_3
      //   557: istore 6
      //   559: aload_0
      //   560: aload_0
      //   561: getfield 118	b/i/b/a/c/e/a$u:p	I
      //   564: bipush 16
      //   566: ior
      //   567: putfield 118	b/i/b/a/c/e/a$u:p	I
      //   570: iload_3
      //   571: istore 4
      //   573: iload_3
      //   574: istore 5
      //   576: iload_3
      //   577: istore 6
      //   579: aload_0
      //   580: aload_1
      //   581: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   584: putfield 124	b/i/b/a/c/e/a$u:f	I
      //   587: goto -551 -> 36
      //   590: iload_3
      //   591: istore 4
      //   593: iload_3
      //   594: istore 5
      //   596: iload_3
      //   597: istore 6
      //   599: aload_0
      //   600: aload_0
      //   601: getfield 118	b/i/b/a/c/e/a$u:p	I
      //   604: sipush 512
      //   607: ior
      //   608: putfield 118	b/i/b/a/c/e/a$u:p	I
      //   611: iload_3
      //   612: istore 4
      //   614: iload_3
      //   615: istore 5
      //   617: iload_3
      //   618: istore 6
      //   620: aload_0
      //   621: aload_1
      //   622: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   625: putfield 126	b/i/b/a/c/e/a$u:l	I
      //   628: goto -592 -> 36
      //   631: iload_3
      //   632: istore 4
      //   634: iload_3
      //   635: istore 5
      //   637: iload_3
      //   638: istore 6
      //   640: aload_0
      //   641: aload_0
      //   642: getfield 118	b/i/b/a/c/e/a$u:p	I
      //   645: sipush 256
      //   648: ior
      //   649: putfield 118	b/i/b/a/c/e/a$u:p	I
      //   652: iload_3
      //   653: istore 4
      //   655: iload_3
      //   656: istore 5
      //   658: iload_3
      //   659: istore 6
      //   661: aload_0
      //   662: aload_1
      //   663: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   666: putfield 128	b/i/b/a/c/e/a$u:k	I
      //   669: goto -633 -> 36
      //   672: iload_3
      //   673: istore 4
      //   675: iload_3
      //   676: istore 5
      //   678: iload_3
      //   679: istore 6
      //   681: aload_0
      //   682: getfield 118	b/i/b/a/c/e/a$u:p	I
      //   685: istore 7
      //   687: sipush 128
      //   690: istore 9
      //   692: iload 7
      //   694: sipush 128
      //   697: iand
      //   698: sipush 128
      //   701: if_icmpne +21 -> 722
      //   704: iload_3
      //   705: istore 4
      //   707: iload_3
      //   708: istore 5
      //   710: iload_3
      //   711: istore 6
      //   713: aload_0
      //   714: getfield 130	b/i/b/a/c/e/a$u:j	Lb/i/b/a/c/e/a$ai;
      //   717: invokestatic 135	b/i/b/a/c/e/a$ai:a	(Lb/i/b/a/c/e/a$ai;)Lb/i/b/a/c/e/a$ai$a;
      //   720: astore 11
      //   722: iload_3
      //   723: istore 4
      //   725: iload_3
      //   726: istore 5
      //   728: iload_3
      //   729: istore 6
      //   731: aload_0
      //   732: aload_1
      //   733: getstatic 136	b/i/b/a/c/e/a$ai:a	Lb/i/b/a/c/g/s;
      //   736: aload_2
      //   737: invokevirtual 139	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   740: checkcast 132	b/i/b/a/c/e/a$ai
      //   743: putfield 130	b/i/b/a/c/e/a$u:j	Lb/i/b/a/c/e/a$ai;
      //   746: aload 11
      //   748: ifnull +40 -> 788
      //   751: iload_3
      //   752: istore 4
      //   754: iload_3
      //   755: istore 5
      //   757: iload_3
      //   758: istore 6
      //   760: aload 11
      //   762: aload_0
      //   763: getfield 130	b/i/b/a/c/e/a$u:j	Lb/i/b/a/c/e/a$ai;
      //   766: invokevirtual 142	b/i/b/a/c/e/a$ai$a:a	(Lb/i/b/a/c/e/a$ai;)Lb/i/b/a/c/e/a$ai$a;
      //   769: pop
      //   770: iload_3
      //   771: istore 4
      //   773: iload_3
      //   774: istore 5
      //   776: iload_3
      //   777: istore 6
      //   779: aload_0
      //   780: aload 11
      //   782: invokevirtual 145	b/i/b/a/c/e/a$ai$a:g	()Lb/i/b/a/c/e/a$ai;
      //   785: putfield 130	b/i/b/a/c/e/a$u:j	Lb/i/b/a/c/e/a$ai;
      //   788: iload_3
      //   789: istore 4
      //   791: iload_3
      //   792: istore 5
      //   794: iload_3
      //   795: istore 6
      //   797: aload_0
      //   798: getfield 118	b/i/b/a/c/e/a$u:p	I
      //   801: istore 7
      //   803: iload_3
      //   804: istore 4
      //   806: iload_3
      //   807: istore 5
      //   809: iload_3
      //   810: istore 6
      //   812: aload_0
      //   813: iload 7
      //   815: iload 9
      //   817: ior
      //   818: putfield 118	b/i/b/a/c/e/a$u:p	I
      //   821: goto -785 -> 36
      //   824: aload 12
      //   826: astore 11
      //   828: iload_3
      //   829: istore 4
      //   831: iload_3
      //   832: istore 5
      //   834: iload_3
      //   835: istore 6
      //   837: aload_0
      //   838: getfield 118	b/i/b/a/c/e/a$u:p	I
      //   841: bipush 32
      //   843: iand
      //   844: bipush 32
      //   846: if_icmpne +21 -> 867
      //   849: iload_3
      //   850: istore 4
      //   852: iload_3
      //   853: istore 5
      //   855: iload_3
      //   856: istore 6
      //   858: aload_0
      //   859: getfield 147	b/i/b/a/c/e/a$u:h	Lb/i/b/a/c/e/a$aa;
      //   862: invokestatic 152	b/i/b/a/c/e/a$aa:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   865: astore 11
      //   867: iload_3
      //   868: istore 4
      //   870: iload_3
      //   871: istore 5
      //   873: iload_3
      //   874: istore 6
      //   876: aload_0
      //   877: aload_1
      //   878: getstatic 153	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   881: aload_2
      //   882: invokevirtual 139	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   885: checkcast 149	b/i/b/a/c/e/a$aa
      //   888: putfield 147	b/i/b/a/c/e/a$u:h	Lb/i/b/a/c/e/a$aa;
      //   891: aload 11
      //   893: ifnull +40 -> 933
      //   896: iload_3
      //   897: istore 4
      //   899: iload_3
      //   900: istore 5
      //   902: iload_3
      //   903: istore 6
      //   905: aload 11
      //   907: aload_0
      //   908: getfield 147	b/i/b/a/c/e/a$u:h	Lb/i/b/a/c/e/a$aa;
      //   911: invokevirtual 156	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   914: pop
      //   915: iload_3
      //   916: istore 4
      //   918: iload_3
      //   919: istore 5
      //   921: iload_3
      //   922: istore 6
      //   924: aload_0
      //   925: aload 11
      //   927: invokevirtual 159	b/i/b/a/c/e/a$aa$c:h	()Lb/i/b/a/c/e/a$aa;
      //   930: putfield 147	b/i/b/a/c/e/a$u:h	Lb/i/b/a/c/e/a$aa;
      //   933: iload_3
      //   934: istore 4
      //   936: iload_3
      //   937: istore 5
      //   939: iload_3
      //   940: istore 6
      //   942: aload_0
      //   943: aload_0
      //   944: getfield 118	b/i/b/a/c/e/a$u:p	I
      //   947: bipush 32
      //   949: ior
      //   950: putfield 118	b/i/b/a/c/e/a$u:p	I
      //   953: goto -917 -> 36
      //   956: iload_3
      //   957: istore 7
      //   959: iload_3
      //   960: bipush 32
      //   962: iand
      //   963: bipush 32
      //   965: if_icmpeq +29 -> 994
      //   968: iload_3
      //   969: istore 4
      //   971: iload_3
      //   972: istore 5
      //   974: iload_3
      //   975: istore 6
      //   977: aload_0
      //   978: new 98	java/util/ArrayList
      //   981: dup
      //   982: invokespecial 99	java/util/ArrayList:<init>	()V
      //   985: putfield 161	b/i/b/a/c/e/a$u:g	Ljava/util/List;
      //   988: iload_3
      //   989: bipush 32
      //   991: ior
      //   992: istore 7
      //   994: iload 7
      //   996: istore 4
      //   998: iload 7
      //   1000: istore 5
      //   1002: iload 7
      //   1004: istore 6
      //   1006: aload_0
      //   1007: getfield 161	b/i/b/a/c/e/a$u:g	Ljava/util/List;
      //   1010: astore 11
      //   1012: iload 7
      //   1014: istore 4
      //   1016: iload 7
      //   1018: istore 5
      //   1020: iload 7
      //   1022: istore 6
      //   1024: aload_1
      //   1025: getstatic 164	b/i/b/a/c/e/a$ae:a	Lb/i/b/a/c/g/s;
      //   1028: aload_2
      //   1029: invokevirtual 139	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   1032: astore 12
      //   1034: iload 7
      //   1036: istore_3
      //   1037: goto -588 -> 449
      //   1040: iload_3
      //   1041: istore 4
      //   1043: iload_3
      //   1044: istore 5
      //   1046: iload_3
      //   1047: istore 6
      //   1049: aload_0
      //   1050: getfield 118	b/i/b/a/c/e/a$u:p	I
      //   1053: istore 7
      //   1055: bipush 8
      //   1057: istore 9
      //   1059: aload 13
      //   1061: astore 11
      //   1063: iload 7
      //   1065: bipush 8
      //   1067: iand
      //   1068: bipush 8
      //   1070: if_icmpne +21 -> 1091
      //   1073: iload_3
      //   1074: istore 4
      //   1076: iload_3
      //   1077: istore 5
      //   1079: iload_3
      //   1080: istore 6
      //   1082: aload_0
      //   1083: getfield 166	b/i/b/a/c/e/a$u:e	Lb/i/b/a/c/e/a$aa;
      //   1086: invokestatic 152	b/i/b/a/c/e/a$aa:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   1089: astore 11
      //   1091: iload_3
      //   1092: istore 4
      //   1094: iload_3
      //   1095: istore 5
      //   1097: iload_3
      //   1098: istore 6
      //   1100: aload_0
      //   1101: aload_1
      //   1102: getstatic 153	b/i/b/a/c/e/a$aa:a	Lb/i/b/a/c/g/s;
      //   1105: aload_2
      //   1106: invokevirtual 139	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   1109: checkcast 149	b/i/b/a/c/e/a$aa
      //   1112: putfield 166	b/i/b/a/c/e/a$u:e	Lb/i/b/a/c/e/a$aa;
      //   1115: aload 11
      //   1117: ifnull +40 -> 1157
      //   1120: iload_3
      //   1121: istore 4
      //   1123: iload_3
      //   1124: istore 5
      //   1126: iload_3
      //   1127: istore 6
      //   1129: aload 11
      //   1131: aload_0
      //   1132: getfield 166	b/i/b/a/c/e/a$u:e	Lb/i/b/a/c/e/a$aa;
      //   1135: invokevirtual 156	b/i/b/a/c/e/a$aa$c:a	(Lb/i/b/a/c/e/a$aa;)Lb/i/b/a/c/e/a$aa$c;
      //   1138: pop
      //   1139: iload_3
      //   1140: istore 4
      //   1142: iload_3
      //   1143: istore 5
      //   1145: iload_3
      //   1146: istore 6
      //   1148: aload_0
      //   1149: aload 11
      //   1151: invokevirtual 159	b/i/b/a/c/e/a$aa$c:h	()Lb/i/b/a/c/e/a$aa;
      //   1154: putfield 166	b/i/b/a/c/e/a$u:e	Lb/i/b/a/c/e/a$aa;
      //   1157: iload_3
      //   1158: istore 4
      //   1160: iload_3
      //   1161: istore 5
      //   1163: iload_3
      //   1164: istore 6
      //   1166: aload_0
      //   1167: getfield 118	b/i/b/a/c/e/a$u:p	I
      //   1170: istore 7
      //   1172: goto -369 -> 803
      //   1175: iload_3
      //   1176: istore 4
      //   1178: iload_3
      //   1179: istore 5
      //   1181: iload_3
      //   1182: istore 6
      //   1184: aload_0
      //   1185: aload_0
      //   1186: getfield 118	b/i/b/a/c/e/a$u:p	I
      //   1189: iconst_4
      //   1190: ior
      //   1191: putfield 118	b/i/b/a/c/e/a$u:p	I
      //   1194: iload_3
      //   1195: istore 4
      //   1197: iload_3
      //   1198: istore 5
      //   1200: iload_3
      //   1201: istore 6
      //   1203: aload_0
      //   1204: aload_1
      //   1205: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   1208: putfield 168	b/i/b/a/c/e/a$u:d	I
      //   1211: goto -1175 -> 36
      //   1214: iload_3
      //   1215: istore 4
      //   1217: iload_3
      //   1218: istore 5
      //   1220: iload_3
      //   1221: istore 6
      //   1223: aload_0
      //   1224: aload_0
      //   1225: getfield 118	b/i/b/a/c/e/a$u:p	I
      //   1228: iconst_2
      //   1229: ior
      //   1230: putfield 118	b/i/b/a/c/e/a$u:p	I
      //   1233: iload_3
      //   1234: istore 4
      //   1236: iload_3
      //   1237: istore 5
      //   1239: iload_3
      //   1240: istore 6
      //   1242: aload_0
      //   1243: aload_1
      //   1244: invokevirtual 91	b/i/b/a/c/g/e:d	()I
      //   1247: putfield 170	b/i/b/a/c/e/a$u:c	I
      //   1250: goto -1214 -> 36
      //   1253: iconst_1
      //   1254: istore 8
      //   1256: goto -1220 -> 36
      //   1259: iload 10
      //   1261: ifne -1225 -> 36
      //   1264: goto -11 -> 1253
      //   1267: astore_1
      //   1268: goto +51 -> 1319
      //   1271: astore_1
      //   1272: iload 5
      //   1274: istore 4
      //   1276: new 71	b/i/b/a/c/g/k
      //   1279: dup
      //   1280: aload_1
      //   1281: invokevirtual 174	java/io/IOException:getMessage	()Ljava/lang/String;
      //   1284: invokespecial 177	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   1287: astore_1
      //   1288: iload 5
      //   1290: istore 4
      //   1292: aload_1
      //   1293: aload_0
      //   1294: putfield 180	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   1297: iload 5
      //   1299: istore 4
      //   1301: aload_1
      //   1302: athrow
      //   1303: astore_1
      //   1304: iload 6
      //   1306: istore 4
      //   1308: aload_1
      //   1309: aload_0
      //   1310: putfield 180	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   1313: iload 6
      //   1315: istore 4
      //   1317: aload_1
      //   1318: athrow
      //   1319: iload 4
      //   1321: bipush 32
      //   1323: iand
      //   1324: bipush 32
      //   1326: if_icmpne +14 -> 1340
      //   1329: aload_0
      //   1330: aload_0
      //   1331: getfield 161	b/i/b/a/c/e/a$u:g	Ljava/util/List;
      //   1334: invokestatic 186	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1337: putfield 161	b/i/b/a/c/e/a$u:g	Ljava/util/List;
      //   1340: iload 4
      //   1342: sipush 2048
      //   1345: iand
      //   1346: sipush 2048
      //   1349: if_icmpne +14 -> 1363
      //   1352: aload_0
      //   1353: aload_0
      //   1354: getfield 101	b/i/b/a/c/e/a$u:m	Ljava/util/List;
      //   1357: invokestatic 186	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1360: putfield 101	b/i/b/a/c/e/a$u:m	Ljava/util/List;
      //   1363: aload 15
      //   1365: invokevirtual 188	b/i/b/a/c/g/f:a	()V
      //   1368: aload_0
      //   1369: aload 14
      //   1371: invokevirtual 193	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1374: putfield 68	b/i/b/a/c/e/a$u:o	Lb/i/b/a/c/g/d;
      //   1377: goto +15 -> 1392
      //   1380: astore_1
      //   1381: aload_0
      //   1382: aload 14
      //   1384: invokevirtual 193	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1387: putfield 68	b/i/b/a/c/e/a$u:o	Lb/i/b/a/c/g/d;
      //   1390: aload_1
      //   1391: athrow
      //   1392: aload_0
      //   1393: getfield 197	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   1396: invokevirtual 201	b/i/b/a/c/g/h:c	()V
      //   1399: aload_1
      //   1400: athrow
      //   1401: iload_3
      //   1402: bipush 32
      //   1404: iand
      //   1405: bipush 32
      //   1407: if_icmpne +14 -> 1421
      //   1410: aload_0
      //   1411: aload_0
      //   1412: getfield 161	b/i/b/a/c/e/a$u:g	Ljava/util/List;
      //   1415: invokestatic 186	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1418: putfield 161	b/i/b/a/c/e/a$u:g	Ljava/util/List;
      //   1421: iload_3
      //   1422: sipush 2048
      //   1425: iand
      //   1426: sipush 2048
      //   1429: if_icmpne +14 -> 1443
      //   1432: aload_0
      //   1433: aload_0
      //   1434: getfield 101	b/i/b/a/c/e/a$u:m	Ljava/util/List;
      //   1437: invokestatic 186	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1440: putfield 101	b/i/b/a/c/e/a$u:m	Ljava/util/List;
      //   1443: aload 15
      //   1445: invokevirtual 188	b/i/b/a/c/g/f:a	()V
      //   1448: aload_0
      //   1449: aload 14
      //   1451: invokevirtual 193	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1454: putfield 68	b/i/b/a/c/e/a$u:o	Lb/i/b/a/c/g/d;
      //   1457: goto +15 -> 1472
      //   1460: astore_1
      //   1461: aload_0
      //   1462: aload 14
      //   1464: invokevirtual 193	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1467: putfield 68	b/i/b/a/c/e/a$u:o	Lb/i/b/a/c/g/d;
      //   1470: aload_1
      //   1471: athrow
      //   1472: aload_0
      //   1473: getfield 197	b/i/b/a/c/g/i$c:s	Lb/i/b/a/c/g/h;
      //   1476: invokevirtual 201	b/i/b/a/c/g/h:c	()V
      //   1479: return
      //   1480: astore_2
      //   1481: goto -113 -> 1368
      //   1484: astore_1
      //   1485: goto -37 -> 1448
      //   1488: goto -1300 -> 188
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1491	0	this	u
      //   0	1491	1	parame	b.i.b.a.c.g.e
      //   0	1491	2	paramg	g
      //   35	1391	3	i1	int
      //   42	1304	4	i2	int
      //   45	1253	5	i3	int
      //   48	1266	6	i4	int
      //   54	1117	7	i5	int
      //   32	1223	8	i6	int
      //   229	829	9	i7	int
      //   207	1053	10	bool	boolean
      //   63	1087	11	localObject1	Object
      //   57	976	12	localObject2	Object
      //   60	1000	13	localObject3	Object
      //   21	1442	14	localb	b.i.b.a.c.g.d.b
      //   29	1415	15	localf	f
      // Exception table:
      //   from	to	target	type
      //   50	56	1267	finally
      //   197	209	1267	finally
      //   221	231	1267	finally
      //   257	264	1267	finally
      //   273	284	1267	finally
      //   303	310	1267	finally
      //   322	339	1267	finally
      //   354	360	1267	finally
      //   389	400	1267	finally
      //   419	425	1267	finally
      //   437	446	1267	finally
      //   458	468	1267	finally
      //   480	490	1267	finally
      //   499	507	1267	finally
      //   519	530	1267	finally
      //   539	547	1267	finally
      //   559	570	1267	finally
      //   579	587	1267	finally
      //   599	611	1267	finally
      //   620	628	1267	finally
      //   640	652	1267	finally
      //   661	669	1267	finally
      //   681	687	1267	finally
      //   713	722	1267	finally
      //   731	746	1267	finally
      //   760	770	1267	finally
      //   779	788	1267	finally
      //   797	803	1267	finally
      //   812	821	1267	finally
      //   837	849	1267	finally
      //   858	867	1267	finally
      //   876	891	1267	finally
      //   905	915	1267	finally
      //   924	933	1267	finally
      //   942	953	1267	finally
      //   977	988	1267	finally
      //   1006	1012	1267	finally
      //   1024	1034	1267	finally
      //   1049	1055	1267	finally
      //   1082	1091	1267	finally
      //   1100	1115	1267	finally
      //   1129	1139	1267	finally
      //   1148	1157	1267	finally
      //   1166	1172	1267	finally
      //   1184	1194	1267	finally
      //   1203	1211	1267	finally
      //   1223	1233	1267	finally
      //   1242	1250	1267	finally
      //   1276	1288	1267	finally
      //   1292	1297	1267	finally
      //   1301	1303	1267	finally
      //   1308	1313	1267	finally
      //   1317	1319	1267	finally
      //   50	56	1271	java/io/IOException
      //   197	209	1271	java/io/IOException
      //   221	231	1271	java/io/IOException
      //   257	264	1271	java/io/IOException
      //   273	284	1271	java/io/IOException
      //   303	310	1271	java/io/IOException
      //   322	339	1271	java/io/IOException
      //   354	360	1271	java/io/IOException
      //   389	400	1271	java/io/IOException
      //   419	425	1271	java/io/IOException
      //   437	446	1271	java/io/IOException
      //   458	468	1271	java/io/IOException
      //   480	490	1271	java/io/IOException
      //   499	507	1271	java/io/IOException
      //   519	530	1271	java/io/IOException
      //   539	547	1271	java/io/IOException
      //   559	570	1271	java/io/IOException
      //   579	587	1271	java/io/IOException
      //   599	611	1271	java/io/IOException
      //   620	628	1271	java/io/IOException
      //   640	652	1271	java/io/IOException
      //   661	669	1271	java/io/IOException
      //   681	687	1271	java/io/IOException
      //   713	722	1271	java/io/IOException
      //   731	746	1271	java/io/IOException
      //   760	770	1271	java/io/IOException
      //   779	788	1271	java/io/IOException
      //   797	803	1271	java/io/IOException
      //   812	821	1271	java/io/IOException
      //   837	849	1271	java/io/IOException
      //   858	867	1271	java/io/IOException
      //   876	891	1271	java/io/IOException
      //   905	915	1271	java/io/IOException
      //   924	933	1271	java/io/IOException
      //   942	953	1271	java/io/IOException
      //   977	988	1271	java/io/IOException
      //   1006	1012	1271	java/io/IOException
      //   1024	1034	1271	java/io/IOException
      //   1049	1055	1271	java/io/IOException
      //   1082	1091	1271	java/io/IOException
      //   1100	1115	1271	java/io/IOException
      //   1129	1139	1271	java/io/IOException
      //   1148	1157	1271	java/io/IOException
      //   1166	1172	1271	java/io/IOException
      //   1184	1194	1271	java/io/IOException
      //   1203	1211	1271	java/io/IOException
      //   1223	1233	1271	java/io/IOException
      //   1242	1250	1271	java/io/IOException
      //   50	56	1303	b/i/b/a/c/g/k
      //   197	209	1303	b/i/b/a/c/g/k
      //   221	231	1303	b/i/b/a/c/g/k
      //   257	264	1303	b/i/b/a/c/g/k
      //   273	284	1303	b/i/b/a/c/g/k
      //   303	310	1303	b/i/b/a/c/g/k
      //   322	339	1303	b/i/b/a/c/g/k
      //   354	360	1303	b/i/b/a/c/g/k
      //   389	400	1303	b/i/b/a/c/g/k
      //   419	425	1303	b/i/b/a/c/g/k
      //   437	446	1303	b/i/b/a/c/g/k
      //   458	468	1303	b/i/b/a/c/g/k
      //   480	490	1303	b/i/b/a/c/g/k
      //   499	507	1303	b/i/b/a/c/g/k
      //   519	530	1303	b/i/b/a/c/g/k
      //   539	547	1303	b/i/b/a/c/g/k
      //   559	570	1303	b/i/b/a/c/g/k
      //   579	587	1303	b/i/b/a/c/g/k
      //   599	611	1303	b/i/b/a/c/g/k
      //   620	628	1303	b/i/b/a/c/g/k
      //   640	652	1303	b/i/b/a/c/g/k
      //   661	669	1303	b/i/b/a/c/g/k
      //   681	687	1303	b/i/b/a/c/g/k
      //   713	722	1303	b/i/b/a/c/g/k
      //   731	746	1303	b/i/b/a/c/g/k
      //   760	770	1303	b/i/b/a/c/g/k
      //   779	788	1303	b/i/b/a/c/g/k
      //   797	803	1303	b/i/b/a/c/g/k
      //   812	821	1303	b/i/b/a/c/g/k
      //   837	849	1303	b/i/b/a/c/g/k
      //   858	867	1303	b/i/b/a/c/g/k
      //   876	891	1303	b/i/b/a/c/g/k
      //   905	915	1303	b/i/b/a/c/g/k
      //   924	933	1303	b/i/b/a/c/g/k
      //   942	953	1303	b/i/b/a/c/g/k
      //   977	988	1303	b/i/b/a/c/g/k
      //   1006	1012	1303	b/i/b/a/c/g/k
      //   1024	1034	1303	b/i/b/a/c/g/k
      //   1049	1055	1303	b/i/b/a/c/g/k
      //   1082	1091	1303	b/i/b/a/c/g/k
      //   1100	1115	1303	b/i/b/a/c/g/k
      //   1129	1139	1303	b/i/b/a/c/g/k
      //   1148	1157	1303	b/i/b/a/c/g/k
      //   1166	1172	1303	b/i/b/a/c/g/k
      //   1184	1194	1303	b/i/b/a/c/g/k
      //   1203	1211	1303	b/i/b/a/c/g/k
      //   1223	1233	1303	b/i/b/a/c/g/k
      //   1242	1250	1303	b/i/b/a/c/g/k
      //   1363	1368	1380	finally
      //   1443	1448	1460	finally
      //   1363	1368	1480	java/io/IOException
      //   1443	1448	1484	java/io/IOException
    }
    
    private u(i.b<u, ?> paramb)
    {
      super();
      this.o = paramb.a;
    }
    
    public static u a()
    {
      return n;
    }
    
    private void r()
    {
      this.b = 518;
      this.c = 2054;
      this.d = 0;
      this.e = a.aa.a();
      this.f = 0;
      this.g = Collections.emptyList();
      this.h = a.aa.a();
      this.i = 0;
      this.j = a.ai.a();
      this.k = 0;
      this.l = 0;
      this.m = Collections.emptyList();
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      i.c.a locala = x();
      if ((this.p & 0x2) == 2) {
        paramf.a(1, this.c);
      }
      if ((this.p & 0x4) == 4) {
        paramf.a(2, this.d);
      }
      if ((this.p & 0x8) == 8) {
        paramf.a(3, this.e);
      }
      int i2 = 0;
      int i1 = 0;
      while (i1 < this.g.size())
      {
        paramf.a(4, (q)this.g.get(i1));
        i1 += 1;
      }
      if ((this.p & 0x20) == 32) {
        paramf.a(5, this.h);
      }
      if ((this.p & 0x80) == 128) {
        paramf.a(6, this.j);
      }
      if ((this.p & 0x100) == 256) {
        paramf.a(7, this.k);
      }
      if ((this.p & 0x200) == 512) {
        paramf.a(8, this.l);
      }
      if ((this.p & 0x10) == 16) {
        paramf.a(9, this.f);
      }
      if ((this.p & 0x40) == 64) {
        paramf.a(10, this.i);
      }
      i1 = i2;
      if ((this.p & 0x1) == 1)
      {
        paramf.a(11, this.b);
        i1 = i2;
      }
      while (i1 < this.m.size())
      {
        paramf.a(31, ((Integer)this.m.get(i1)).intValue());
        i1 += 1;
      }
      locala.a(19000, paramf);
      paramf.c(this.o);
    }
    
    public final s<u> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.p & 0x1) == 1;
    }
    
    public final boolean d()
    {
      return (this.p & 0x2) == 2;
    }
    
    public final boolean e()
    {
      int i1 = this.q;
      if (i1 == 1) {
        return true;
      }
      if (i1 == 0) {
        return false;
      }
      if (!g())
      {
        this.q = 0;
        return false;
      }
      if ((k()) && (!this.e.e()))
      {
        this.q = 0;
        return false;
      }
      i1 = 0;
      while (i1 < this.g.size())
      {
        if (!((a.ae)this.g.get(i1)).e())
        {
          this.q = 0;
          return false;
        }
        i1 += 1;
      }
      if ((m()) && (!this.h.e()))
      {
        this.q = 0;
        return false;
      }
      if ((o()) && (!this.j.e()))
      {
        this.q = 0;
        return false;
      }
      if (!this.s.e())
      {
        this.q = 0;
        return false;
      }
      this.q = 1;
      return true;
    }
    
    public final int f()
    {
      int i1 = this.t;
      if (i1 != -1) {
        return i1;
      }
      i1 = this.p;
      int i3 = 0;
      if ((i1 & 0x2) == 2) {
        i2 = f.c(1, this.c) + 0;
      } else {
        i2 = 0;
      }
      i1 = i2;
      if ((this.p & 0x4) == 4) {
        i1 = i2 + f.c(2, this.d);
      }
      int i2 = i1;
      if ((this.p & 0x8) == 8) {
        i2 = i1 + f.c(3, this.e);
      }
      i1 = i2;
      i2 = 0;
      while (i2 < this.g.size())
      {
        i1 += f.c(4, (q)this.g.get(i2));
        i2 += 1;
      }
      i2 = i1;
      if ((this.p & 0x20) == 32) {
        i2 = i1 + f.c(5, this.h);
      }
      i1 = i2;
      if ((this.p & 0x80) == 128) {
        i1 = i2 + f.c(6, this.j);
      }
      i2 = i1;
      if ((this.p & 0x100) == 256) {
        i2 = i1 + f.c(7, this.k);
      }
      i1 = i2;
      if ((this.p & 0x200) == 512) {
        i1 = i2 + f.c(8, this.l);
      }
      i2 = i1;
      if ((this.p & 0x10) == 16) {
        i2 = i1 + f.c(9, this.f);
      }
      i1 = i2;
      if ((this.p & 0x40) == 64) {
        i1 = i2 + f.c(10, this.i);
      }
      i2 = i1;
      if ((this.p & 0x1) == 1) {
        i2 = i1 + f.c(11, this.b);
      }
      int i4 = 0;
      i1 = i3;
      i3 = i4;
      while (i1 < this.m.size())
      {
        i3 += f.c(((Integer)this.m.get(i1)).intValue());
        i1 += 1;
      }
      i1 = i2 + i3 + this.m.size() * 2 + this.s.f() + this.o.a();
      this.t = i1;
      return i1;
    }
    
    public final boolean g()
    {
      return (this.p & 0x4) == 4;
    }
    
    public final boolean k()
    {
      return (this.p & 0x8) == 8;
    }
    
    public final boolean l()
    {
      return (this.p & 0x10) == 16;
    }
    
    public final boolean m()
    {
      return (this.p & 0x20) == 32;
    }
    
    public final boolean n()
    {
      return (this.p & 0x40) == 64;
    }
    
    public final boolean o()
    {
      return (this.p & 0x80) == 128;
    }
    
    public final boolean p()
    {
      return (this.p & 0x100) == 256;
    }
    
    public final boolean q()
    {
      return (this.p & 0x200) == 512;
    }
    
    public static final class a
      extends i.b<a.u, a>
      implements a.v
    {
      private int c;
      private int d = 518;
      private int e = 2054;
      private int f;
      private a.aa g = a.aa.a();
      private int h;
      private List<a.ae> i = Collections.emptyList();
      private a.aa j = a.aa.a();
      private int k;
      private a.ai l = a.ai.a();
      private int m;
      private int n;
      private List<Integer> o = Collections.emptyList();
      
      private a a(int paramInt)
      {
        this.c |= 0x1;
        this.d = paramInt;
        return this;
      }
      
      private a a(a.aa paramaa)
      {
        a.aa localaa = paramaa;
        if ((this.c & 0x8) == 8)
        {
          localaa = paramaa;
          if (this.g != a.aa.a()) {
            localaa = a.aa.a(this.g).a(paramaa).h();
          }
        }
        this.g = localaa;
        this.c |= 0x8;
        return this;
      }
      
      private a a(a.ai paramai)
      {
        a.ai localai = paramai;
        if ((this.c & 0x100) == 256)
        {
          localai = paramai;
          if (this.l != a.ai.a()) {
            localai = a.ai.a(this.l).a(paramai).g();
          }
        }
        this.l = localai;
        this.c |= 0x100;
        return this;
      }
      
      private a b(int paramInt)
      {
        this.c |= 0x2;
        this.e = paramInt;
        return this;
      }
      
      private a b(a.aa paramaa)
      {
        a.aa localaa = paramaa;
        if ((this.c & 0x40) == 64)
        {
          localaa = paramaa;
          if (this.j != a.aa.a()) {
            localaa = a.aa.a(this.j).a(paramaa).h();
          }
        }
        this.j = localaa;
        this.c |= 0x40;
        return this;
      }
      
      private a c(int paramInt)
      {
        this.c |= 0x4;
        this.f = paramInt;
        return this;
      }
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 99	b/i/b/a/c/e/a$u:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 104 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$u
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 107	b/i/b/a/c/e/a$u$a:a	(Lb/i/b/a/c/e/a$u;)Lb/i/b/a/c/e/a$u$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 110	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$u
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 107	b/i/b/a/c/e/a$u$a:a	(Lb/i/b/a/c/e/a$u;)Lb/i/b/a/c/e/a$u$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a d(int paramInt)
      {
        this.c |= 0x10;
        this.h = paramInt;
        return this;
      }
      
      private a e(int paramInt)
      {
        this.c |= 0x80;
        this.k = paramInt;
        return this;
      }
      
      private a f(int paramInt)
      {
        this.c |= 0x200;
        this.m = paramInt;
        return this;
      }
      
      private a g(int paramInt)
      {
        this.c |= 0x400;
        this.n = paramInt;
        return this;
      }
      
      private a h()
      {
        return new a().a(i());
      }
      
      private a.u i()
      {
        int i2 = 0;
        a.u localu = new a.u(this, (byte)0);
        int i3 = this.c;
        if ((i3 & 0x1) == 1) {
          i2 = 1;
        }
        a.u.a(localu, this.d);
        int i1 = i2;
        if ((i3 & 0x2) == 2) {
          i1 = i2 | 0x2;
        }
        a.u.b(localu, this.e);
        i2 = i1;
        if ((i3 & 0x4) == 4) {
          i2 = i1 | 0x4;
        }
        a.u.c(localu, this.f);
        i1 = i2;
        if ((i3 & 0x8) == 8) {
          i1 = i2 | 0x8;
        }
        a.u.a(localu, this.g);
        i2 = i1;
        if ((i3 & 0x10) == 16) {
          i2 = i1 | 0x10;
        }
        a.u.d(localu, this.h);
        if ((this.c & 0x20) == 32)
        {
          this.i = Collections.unmodifiableList(this.i);
          this.c &= 0xFFFFFFDF;
        }
        a.u.a(localu, this.i);
        i1 = i2;
        if ((i3 & 0x40) == 64) {
          i1 = i2 | 0x20;
        }
        a.u.b(localu, this.j);
        i2 = i1;
        if ((i3 & 0x80) == 128) {
          i2 = i1 | 0x40;
        }
        a.u.e(localu, this.k);
        i1 = i2;
        if ((i3 & 0x100) == 256) {
          i1 = i2 | 0x80;
        }
        a.u.a(localu, this.l);
        i2 = i1;
        if ((i3 & 0x200) == 512) {
          i2 = i1 | 0x100;
        }
        a.u.f(localu, this.m);
        i1 = i2;
        if ((i3 & 0x400) == 1024) {
          i1 = i2 | 0x200;
        }
        a.u.g(localu, this.n);
        if ((this.c & 0x800) == 2048)
        {
          this.o = Collections.unmodifiableList(this.o);
          this.c &= 0xF7FF;
        }
        a.u.b(localu, this.o);
        a.u.h(localu, i1);
        return localu;
      }
      
      private void k()
      {
        if ((this.c & 0x20) != 32)
        {
          this.i = new ArrayList(this.i);
          this.c |= 0x20;
        }
      }
      
      private void l()
      {
        if ((this.c & 0x800) != 2048)
        {
          this.o = new ArrayList(this.o);
          this.c |= 0x800;
        }
      }
      
      public final a a(a.u paramu)
      {
        if (paramu == a.u.a()) {
          return this;
        }
        if (paramu.c()) {
          a(paramu.b);
        }
        if (paramu.d()) {
          b(paramu.c);
        }
        if (paramu.g()) {
          c(paramu.d);
        }
        if (paramu.k()) {
          a(paramu.e);
        }
        if (paramu.l()) {
          d(paramu.f);
        }
        if (!a.u.a(paramu).isEmpty()) {
          if (this.i.isEmpty())
          {
            this.i = a.u.a(paramu);
            this.c &= 0xFFFFFFDF;
          }
          else
          {
            k();
            this.i.addAll(a.u.a(paramu));
          }
        }
        if (paramu.m()) {
          b(paramu.h);
        }
        if (paramu.n()) {
          e(paramu.i);
        }
        if (paramu.o()) {
          a(paramu.j);
        }
        if (paramu.p()) {
          f(paramu.k);
        }
        if (paramu.q()) {
          g(paramu.l);
        }
        if (!a.u.b(paramu).isEmpty()) {
          if (this.o.isEmpty())
          {
            this.o = a.u.b(paramu);
            this.c &= 0xF7FF;
          }
          else
          {
            l();
            this.o.addAll(a.u.b(paramu));
          }
        }
        a(paramu);
        this.a = this.a.a(a.u.c(paramu));
        return this;
      }
      
      public final boolean e()
      {
        if ((this.c & 0x4) == 4) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 == 0) {
          return false;
        }
        if ((this.c & 0x8) == 8) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if ((i1 != 0) && (!this.g.e())) {
          return false;
        }
        int i1 = 0;
        while (i1 < this.i.size())
        {
          if (!((a.ae)this.i.get(i1)).e()) {
            return false;
          }
          i1 += 1;
        }
        if ((this.c & 0x40) == 64) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if ((i1 != 0) && (!this.j.e())) {
          return false;
        }
        if ((this.c & 0x100) == 256) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if ((i1 != 0) && (!this.l.e())) {
          return false;
        }
        return this.b.e();
      }
    }
  }
  
  public static abstract interface v
    extends i.d
  {}
  
  public static final class w
    extends i
    implements a.x
  {
    public static s<w> a = new b() {};
    private static final w b;
    private final d c;
    private List<b> d;
    private byte e = -1;
    private int f = -1;
    
    static
    {
      w localw = new w();
      b = localw;
      localw.d = Collections.emptyList();
    }
    
    private w()
    {
      this.c = d.b;
    }
    
    /* Error */
    private w(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 59	b/i/b/a/c/g/i:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 61	b/i/b/a/c/e/a$w:e	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 63	b/i/b/a/c/e/a$w:f	I
      //   14: aload_0
      //   15: invokestatic 55	java/util/Collections:emptyList	()Ljava/util/List;
      //   18: putfield 57	b/i/b/a/c/e/a$w:d	Ljava/util/List;
      //   21: invokestatic 78	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   24: astore 9
      //   26: aload 9
      //   28: iconst_1
      //   29: invokestatic 83	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   32: astore 10
      //   34: iconst_0
      //   35: istore 8
      //   37: iconst_0
      //   38: istore_3
      //   39: iload 8
      //   41: ifne +238 -> 279
      //   44: iload_3
      //   45: istore 5
      //   47: iload_3
      //   48: istore 6
      //   50: iload_3
      //   51: istore 7
      //   53: aload_1
      //   54: invokevirtual 88	b/i/b/a/c/g/e:a	()I
      //   57: istore 4
      //   59: iload 4
      //   61: ifeq +106 -> 167
      //   64: iload 4
      //   66: bipush 10
      //   68: if_icmpeq +28 -> 96
      //   71: iload_3
      //   72: istore 5
      //   74: iload_3
      //   75: istore 6
      //   77: iload_3
      //   78: istore 7
      //   80: aload_0
      //   81: aload_1
      //   82: aload 10
      //   84: aload_2
      //   85: iload 4
      //   87: invokevirtual 91	b/i/b/a/c/e/a$w:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   90: ifne -51 -> 39
      //   93: goto +74 -> 167
      //   96: iload_3
      //   97: istore 4
      //   99: iload_3
      //   100: iconst_1
      //   101: iand
      //   102: iconst_1
      //   103: if_icmpeq +28 -> 131
      //   106: iload_3
      //   107: istore 5
      //   109: iload_3
      //   110: istore 6
      //   112: iload_3
      //   113: istore 7
      //   115: aload_0
      //   116: new 93	java/util/ArrayList
      //   119: dup
      //   120: invokespecial 94	java/util/ArrayList:<init>	()V
      //   123: putfield 57	b/i/b/a/c/e/a$w:d	Ljava/util/List;
      //   126: iload_3
      //   127: iconst_1
      //   128: ior
      //   129: istore 4
      //   131: iload 4
      //   133: istore 5
      //   135: iload 4
      //   137: istore 6
      //   139: iload 4
      //   141: istore 7
      //   143: aload_0
      //   144: getfield 57	b/i/b/a/c/e/a$w:d	Ljava/util/List;
      //   147: aload_1
      //   148: getstatic 95	b/i/b/a/c/e/a$w$b:a	Lb/i/b/a/c/g/s;
      //   151: aload_2
      //   152: invokevirtual 98	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   155: invokeinterface 104 2 0
      //   160: pop
      //   161: iload 4
      //   163: istore_3
      //   164: goto -125 -> 39
      //   167: iconst_1
      //   168: istore 8
      //   170: goto -131 -> 39
      //   173: astore_1
      //   174: goto +51 -> 225
      //   177: astore_1
      //   178: iload 6
      //   180: istore 5
      //   182: new 72	b/i/b/a/c/g/k
      //   185: dup
      //   186: aload_1
      //   187: invokevirtual 108	java/io/IOException:getMessage	()Ljava/lang/String;
      //   190: invokespecial 111	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   193: astore_1
      //   194: iload 6
      //   196: istore 5
      //   198: aload_1
      //   199: aload_0
      //   200: putfield 114	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   203: iload 6
      //   205: istore 5
      //   207: aload_1
      //   208: athrow
      //   209: astore_1
      //   210: iload 7
      //   212: istore 5
      //   214: aload_1
      //   215: aload_0
      //   216: putfield 114	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   219: iload 7
      //   221: istore 5
      //   223: aload_1
      //   224: athrow
      //   225: iload 5
      //   227: iconst_1
      //   228: iand
      //   229: iconst_1
      //   230: if_icmpne +14 -> 244
      //   233: aload_0
      //   234: aload_0
      //   235: getfield 57	b/i/b/a/c/e/a$w:d	Ljava/util/List;
      //   238: invokestatic 118	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   241: putfield 57	b/i/b/a/c/e/a$w:d	Ljava/util/List;
      //   244: aload 10
      //   246: invokevirtual 120	b/i/b/a/c/g/f:a	()V
      //   249: aload_0
      //   250: aload 9
      //   252: invokevirtual 125	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   255: putfield 69	b/i/b/a/c/e/a$w:c	Lb/i/b/a/c/g/d;
      //   258: goto +15 -> 273
      //   261: astore_1
      //   262: aload_0
      //   263: aload 9
      //   265: invokevirtual 125	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   268: putfield 69	b/i/b/a/c/e/a$w:c	Lb/i/b/a/c/g/d;
      //   271: aload_1
      //   272: athrow
      //   273: aload_0
      //   274: invokevirtual 127	b/i/b/a/c/e/a$w:w	()V
      //   277: aload_1
      //   278: athrow
      //   279: iload_3
      //   280: iconst_1
      //   281: iand
      //   282: iconst_1
      //   283: if_icmpne +14 -> 297
      //   286: aload_0
      //   287: aload_0
      //   288: getfield 57	b/i/b/a/c/e/a$w:d	Ljava/util/List;
      //   291: invokestatic 118	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   294: putfield 57	b/i/b/a/c/e/a$w:d	Ljava/util/List;
      //   297: aload 10
      //   299: invokevirtual 120	b/i/b/a/c/g/f:a	()V
      //   302: aload_0
      //   303: aload 9
      //   305: invokevirtual 125	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   308: putfield 69	b/i/b/a/c/e/a$w:c	Lb/i/b/a/c/g/d;
      //   311: goto +15 -> 326
      //   314: astore_1
      //   315: aload_0
      //   316: aload 9
      //   318: invokevirtual 125	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   321: putfield 69	b/i/b/a/c/e/a$w:c	Lb/i/b/a/c/g/d;
      //   324: aload_1
      //   325: athrow
      //   326: aload_0
      //   327: invokevirtual 127	b/i/b/a/c/e/a$w:w	()V
      //   330: return
      //   331: astore_2
      //   332: goto -83 -> 249
      //   335: astore_1
      //   336: goto -34 -> 302
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	339	0	this	w
      //   0	339	1	parame	b.i.b.a.c.g.e
      //   0	339	2	paramg	g
      //   38	244	3	i	int
      //   57	105	4	j	int
      //   45	184	5	k	int
      //   48	156	6	m	int
      //   51	169	7	n	int
      //   35	134	8	i1	int
      //   24	293	9	localb	b.i.b.a.c.g.d.b
      //   32	266	10	localf	f
      // Exception table:
      //   from	to	target	type
      //   53	59	173	finally
      //   80	93	173	finally
      //   115	126	173	finally
      //   143	161	173	finally
      //   182	194	173	finally
      //   198	203	173	finally
      //   207	209	173	finally
      //   214	219	173	finally
      //   223	225	173	finally
      //   53	59	177	java/io/IOException
      //   80	93	177	java/io/IOException
      //   115	126	177	java/io/IOException
      //   143	161	177	java/io/IOException
      //   53	59	209	b/i/b/a/c/g/k
      //   80	93	209	b/i/b/a/c/g/k
      //   115	126	209	b/i/b/a/c/g/k
      //   143	161	209	b/i/b/a/c/g/k
      //   244	249	261	finally
      //   297	302	314	finally
      //   244	249	331	java/io/IOException
      //   297	302	335	java/io/IOException
    }
    
    private w(i.a parama)
    {
      super();
      this.c = parama.a;
    }
    
    public static a a(w paramw)
    {
      return a.g().a(paramw);
    }
    
    public static w a()
    {
      return b;
    }
    
    public final b a(int paramInt)
    {
      return (b)this.d.get(paramInt);
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      int i = 0;
      while (i < this.d.size())
      {
        paramf.a(1, (q)this.d.get(i));
        i += 1;
      }
      paramf.c(this.c);
    }
    
    public final s<w> b()
    {
      return a;
    }
    
    public final a c()
    {
      return a.g().a(this);
    }
    
    public final boolean e()
    {
      int i = this.e;
      if (i == 1) {
        return true;
      }
      if (i == 0) {
        return false;
      }
      i = 0;
      while (i < this.d.size())
      {
        if (!a(i).e())
        {
          this.e = 0;
          return false;
        }
        i += 1;
      }
      this.e = 1;
      return true;
    }
    
    public final int f()
    {
      int i = this.f;
      if (i != -1) {
        return i;
      }
      i = 0;
      int j = 0;
      while (i < this.d.size())
      {
        j += f.c(1, (q)this.d.get(i));
        i += 1;
      }
      i = j + this.c.a();
      this.f = i;
      return i;
    }
    
    public static final class a
      extends i.a<a.w, a>
      implements a.x
    {
      private int b;
      private List<a.w.b> c = Collections.emptyList();
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 39	b/i/b/a/c/e/a$w:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 44 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$w
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 47	b/i/b/a/c/e/a$w$a:a	(Lb/i/b/a/c/e/a$w;)Lb/i/b/a/c/e/a$w$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 50	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$w
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 47	b/i/b/a/c/e/a$w$a:a	(Lb/i/b/a/c/e/a$w;)Lb/i/b/a/c/e/a$w$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a h()
      {
        return new a().a(f());
      }
      
      private void i()
      {
        if ((this.b & 0x1) != 1)
        {
          this.c = new ArrayList(this.c);
          this.b |= 0x1;
        }
      }
      
      public final a a(a.w paramw)
      {
        if (paramw == a.w.a()) {
          return this;
        }
        if (!a.w.b(paramw).isEmpty()) {
          if (this.c.isEmpty())
          {
            this.c = a.w.b(paramw);
            this.b &= 0xFFFFFFFE;
          }
          else
          {
            i();
            this.c.addAll(a.w.b(paramw));
          }
        }
        this.a = this.a.a(a.w.c(paramw));
        return this;
      }
      
      public final boolean e()
      {
        int i = 0;
        while (i < this.c.size())
        {
          if (!((a.w.b)this.c.get(i)).e()) {
            return false;
          }
          i += 1;
        }
        return true;
      }
      
      public final a.w f()
      {
        a.w localw = new a.w(this, (byte)0);
        if ((this.b & 0x1) == 1)
        {
          this.c = Collections.unmodifiableList(this.c);
          this.b &= 0xFFFFFFFE;
        }
        a.w.a(localw, this.c);
        return localw;
      }
    }
    
    public static final class b
      extends i
      implements a.w.c
    {
      public static s<b> a = new b() {};
      private static final b e;
      public int b;
      public int c;
      public b d;
      private final d f;
      private int g;
      private byte h = -1;
      private int i = -1;
      
      static
      {
        b localb = new b();
        e = localb;
        localb.k();
      }
      
      private b()
      {
        this.f = d.b;
      }
      
      /* Error */
      private b(b.i.b.a.c.g.e parame, g paramg)
        throws b.i.b.a.c.g.k
      {
        // Byte code:
        //   0: aload_0
        //   1: invokespecial 50	b/i/b/a/c/g/i:<init>	()V
        //   4: aload_0
        //   5: iconst_m1
        //   6: putfield 52	b/i/b/a/c/e/a$w$b:h	B
        //   9: aload_0
        //   10: iconst_m1
        //   11: putfield 54	b/i/b/a/c/e/a$w$b:i	I
        //   14: aload_0
        //   15: invokespecial 48	b/i/b/a/c/e/a$w$b:k	()V
        //   18: invokestatic 68	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
        //   21: astore 6
        //   23: aload 6
        //   25: iconst_1
        //   26: invokestatic 73	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
        //   29: astore 7
        //   31: iconst_0
        //   32: istore_3
        //   33: iload_3
        //   34: ifne +219 -> 253
        //   37: aload_1
        //   38: invokevirtual 78	b/i/b/a/c/g/e:a	()I
        //   41: istore 4
        //   43: iload 4
        //   45: ifeq +136 -> 181
        //   48: iload 4
        //   50: bipush 8
        //   52: if_icmpeq +108 -> 160
        //   55: iload 4
        //   57: bipush 16
        //   59: if_icmpeq +80 -> 139
        //   62: iload 4
        //   64: bipush 24
        //   66: if_icmpeq +19 -> 85
        //   69: aload_0
        //   70: aload_1
        //   71: aload 7
        //   73: aload_2
        //   74: iload 4
        //   76: invokevirtual 81	b/i/b/a/c/e/a$w$b:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
        //   79: ifne -46 -> 33
        //   82: goto +99 -> 181
        //   85: aload_1
        //   86: invokevirtual 83	b/i/b/a/c/g/e:d	()I
        //   89: istore 5
        //   91: iload 5
        //   93: invokestatic 86	b/i/b/a/c/e/a$w$b$b:a	(I)Lb/i/b/a/c/e/a$w$b$b;
        //   96: astore 8
        //   98: aload 8
        //   100: ifnonnull +20 -> 120
        //   103: aload 7
        //   105: iload 4
        //   107: invokevirtual 89	b/i/b/a/c/g/f:e	(I)V
        //   110: aload 7
        //   112: iload 5
        //   114: invokevirtual 89	b/i/b/a/c/g/f:e	(I)V
        //   117: goto -84 -> 33
        //   120: aload_0
        //   121: aload_0
        //   122: getfield 91	b/i/b/a/c/e/a$w$b:g	I
        //   125: iconst_4
        //   126: ior
        //   127: putfield 91	b/i/b/a/c/e/a$w$b:g	I
        //   130: aload_0
        //   131: aload 8
        //   133: putfield 93	b/i/b/a/c/e/a$w$b:d	Lb/i/b/a/c/e/a$w$b$b;
        //   136: goto -103 -> 33
        //   139: aload_0
        //   140: aload_0
        //   141: getfield 91	b/i/b/a/c/e/a$w$b:g	I
        //   144: iconst_2
        //   145: ior
        //   146: putfield 91	b/i/b/a/c/e/a$w$b:g	I
        //   149: aload_0
        //   150: aload_1
        //   151: invokevirtual 83	b/i/b/a/c/g/e:d	()I
        //   154: putfield 95	b/i/b/a/c/e/a$w$b:c	I
        //   157: goto -124 -> 33
        //   160: aload_0
        //   161: aload_0
        //   162: getfield 91	b/i/b/a/c/e/a$w$b:g	I
        //   165: iconst_1
        //   166: ior
        //   167: putfield 91	b/i/b/a/c/e/a$w$b:g	I
        //   170: aload_0
        //   171: aload_1
        //   172: invokevirtual 83	b/i/b/a/c/g/e:d	()I
        //   175: putfield 97	b/i/b/a/c/e/a$w$b:b	I
        //   178: goto -145 -> 33
        //   181: iconst_1
        //   182: istore_3
        //   183: goto -150 -> 33
        //   186: astore_1
        //   187: goto +31 -> 218
        //   190: astore_1
        //   191: new 63	b/i/b/a/c/g/k
        //   194: dup
        //   195: aload_1
        //   196: invokevirtual 101	java/io/IOException:getMessage	()Ljava/lang/String;
        //   199: invokespecial 104	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
        //   202: astore_1
        //   203: aload_1
        //   204: aload_0
        //   205: putfield 107	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   208: aload_1
        //   209: athrow
        //   210: astore_1
        //   211: aload_1
        //   212: aload_0
        //   213: putfield 107	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   216: aload_1
        //   217: athrow
        //   218: aload 7
        //   220: invokevirtual 109	b/i/b/a/c/g/f:a	()V
        //   223: aload_0
        //   224: aload 6
        //   226: invokevirtual 114	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
        //   229: putfield 60	b/i/b/a/c/e/a$w$b:f	Lb/i/b/a/c/g/d;
        //   232: goto +15 -> 247
        //   235: astore_1
        //   236: aload_0
        //   237: aload 6
        //   239: invokevirtual 114	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
        //   242: putfield 60	b/i/b/a/c/e/a$w$b:f	Lb/i/b/a/c/g/d;
        //   245: aload_1
        //   246: athrow
        //   247: aload_0
        //   248: invokevirtual 116	b/i/b/a/c/e/a$w$b:w	()V
        //   251: aload_1
        //   252: athrow
        //   253: aload 7
        //   255: invokevirtual 109	b/i/b/a/c/g/f:a	()V
        //   258: aload_0
        //   259: aload 6
        //   261: invokevirtual 114	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
        //   264: putfield 60	b/i/b/a/c/e/a$w$b:f	Lb/i/b/a/c/g/d;
        //   267: goto +15 -> 282
        //   270: astore_1
        //   271: aload_0
        //   272: aload 6
        //   274: invokevirtual 114	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
        //   277: putfield 60	b/i/b/a/c/e/a$w$b:f	Lb/i/b/a/c/g/d;
        //   280: aload_1
        //   281: athrow
        //   282: aload_0
        //   283: invokevirtual 116	b/i/b/a/c/e/a$w$b:w	()V
        //   286: return
        //   287: astore_2
        //   288: goto -65 -> 223
        //   291: astore_1
        //   292: goto -34 -> 258
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	295	0	this	b
        //   0	295	1	parame	b.i.b.a.c.g.e
        //   0	295	2	paramg	g
        //   32	151	3	j	int
        //   41	65	4	k	int
        //   89	24	5	m	int
        //   21	252	6	localb	b.i.b.a.c.g.d.b
        //   29	225	7	localf	f
        //   96	36	8	localb1	b
        // Exception table:
        //   from	to	target	type
        //   37	43	186	finally
        //   69	82	186	finally
        //   85	98	186	finally
        //   103	117	186	finally
        //   120	136	186	finally
        //   139	157	186	finally
        //   160	178	186	finally
        //   191	210	186	finally
        //   211	218	186	finally
        //   37	43	190	java/io/IOException
        //   69	82	190	java/io/IOException
        //   85	98	190	java/io/IOException
        //   103	117	190	java/io/IOException
        //   120	136	190	java/io/IOException
        //   139	157	190	java/io/IOException
        //   160	178	190	java/io/IOException
        //   37	43	210	b/i/b/a/c/g/k
        //   69	82	210	b/i/b/a/c/g/k
        //   85	98	210	b/i/b/a/c/g/k
        //   103	117	210	b/i/b/a/c/g/k
        //   120	136	210	b/i/b/a/c/g/k
        //   139	157	210	b/i/b/a/c/g/k
        //   160	178	210	b/i/b/a/c/g/k
        //   218	223	235	finally
        //   253	258	270	finally
        //   218	223	287	java/io/IOException
        //   253	258	291	java/io/IOException
      }
      
      private b(i.a parama)
      {
        super();
        this.f = parama.a;
      }
      
      public static b a()
      {
        return e;
      }
      
      private void k()
      {
        this.b = -1;
        this.c = 0;
        this.d = b.b;
      }
      
      public final void a(f paramf)
        throws IOException
      {
        f();
        if ((this.g & 0x1) == 1) {
          paramf.a(1, this.b);
        }
        if ((this.g & 0x2) == 2) {
          paramf.a(2, this.c);
        }
        if ((this.g & 0x4) == 4) {
          paramf.b(3, this.d.d);
        }
        paramf.c(this.f);
      }
      
      public final s<b> b()
      {
        return a;
      }
      
      public final boolean c()
      {
        return (this.g & 0x1) == 1;
      }
      
      public final boolean d()
      {
        return (this.g & 0x2) == 2;
      }
      
      public final boolean e()
      {
        int j = this.h;
        if (j == 1) {
          return true;
        }
        if (j == 0) {
          return false;
        }
        if (!d())
        {
          this.h = 0;
          return false;
        }
        this.h = 1;
        return true;
      }
      
      public final int f()
      {
        int j = this.i;
        if (j != -1) {
          return j;
        }
        int k = this.g;
        j = 0;
        if ((k & 0x1) == 1) {
          j = 0 + f.c(1, this.b);
        }
        k = j;
        if ((this.g & 0x2) == 2) {
          k = j + f.c(2, this.c);
        }
        j = k;
        if ((this.g & 0x4) == 4) {
          j = k + f.d(3, this.d.d);
        }
        j += this.f.a();
        this.i = j;
        return j;
      }
      
      public final boolean g()
      {
        return (this.g & 0x4) == 4;
      }
      
      public static final class a
        extends i.a<a.w.b, a>
        implements a.w.c
      {
        private int b;
        private int c = -1;
        private int d;
        private a.w.b.b e = a.w.b.b.b;
        
        private a a(int paramInt)
        {
          this.b |= 0x1;
          this.c = paramInt;
          return this;
        }
        
        private a a(a.w.b.b paramb)
        {
          if (paramb != null)
          {
            this.b |= 0x4;
            this.e = paramb;
            return this;
          }
          throw new NullPointerException();
        }
        
        private a b(int paramInt)
        {
          this.b |= 0x2;
          this.d = paramInt;
          return this;
        }
        
        /* Error */
        private a c(b.i.b.a.c.g.e parame, g paramg)
          throws IOException
        {
          // Byte code:
          //   0: aconst_null
          //   1: astore_3
          //   2: getstatic 51	b/i/b/a/c/e/a$w$b:a	Lb/i/b/a/c/g/s;
          //   5: aload_1
          //   6: aload_2
          //   7: invokeinterface 56 3 0
          //   12: checkcast 14	b/i/b/a/c/e/a$w$b
          //   15: astore_1
          //   16: aload_0
          //   17: aload_1
          //   18: invokevirtual 59	b/i/b/a/c/e/a$w$b$a:a	(Lb/i/b/a/c/e/a$w$b;)Lb/i/b/a/c/e/a$w$b$a;
          //   21: pop
          //   22: aload_0
          //   23: areturn
          //   24: astore_2
          //   25: aload_3
          //   26: astore_1
          //   27: goto +15 -> 42
          //   30: astore_2
          //   31: aload_2
          //   32: getfield 62	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
          //   35: checkcast 14	b/i/b/a/c/e/a$w$b
          //   38: astore_1
          //   39: aload_2
          //   40: athrow
          //   41: astore_2
          //   42: aload_1
          //   43: ifnull +9 -> 52
          //   46: aload_0
          //   47: aload_1
          //   48: invokevirtual 59	b/i/b/a/c/e/a$w$b$a:a	(Lb/i/b/a/c/e/a$w$b;)Lb/i/b/a/c/e/a$w$b$a;
          //   51: pop
          //   52: aload_2
          //   53: athrow
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	54	0	this	a
          //   0	54	1	parame	b.i.b.a.c.g.e
          //   0	54	2	paramg	g
          //   1	25	3	localObject	Object
          // Exception table:
          //   from	to	target	type
          //   2	16	24	finally
          //   31	39	24	finally
          //   2	16	30	b/i/b/a/c/g/k
          //   39	41	41	finally
        }
        
        private a g()
        {
          return new a().a(h());
        }
        
        private a.w.b h()
        {
          int j = 0;
          a.w.b localb = new a.w.b(this, (byte)0);
          int k = this.b;
          if ((k & 0x1) == 1) {
            j = 1;
          }
          a.w.b.a(localb, this.c);
          int i = j;
          if ((k & 0x2) == 2) {
            i = j | 0x2;
          }
          a.w.b.b(localb, this.d);
          j = i;
          if ((k & 0x4) == 4) {
            j = i | 0x4;
          }
          a.w.b.a(localb, this.e);
          a.w.b.c(localb, j);
          return localb;
        }
        
        public final a a(a.w.b paramb)
        {
          if (paramb == a.w.b.a()) {
            return this;
          }
          if (paramb.c()) {
            a(paramb.b);
          }
          if (paramb.d()) {
            b(paramb.c);
          }
          if (paramb.g()) {
            a(paramb.d);
          }
          this.a = this.a.a(a.w.b.a(paramb));
          return this;
        }
        
        public final boolean e()
        {
          int i;
          if ((this.b & 0x2) == 2) {
            i = 1;
          } else {
            i = 0;
          }
          return i != 0;
        }
      }
      
      public static enum b
        implements j.a
      {
        private static j.b<b> e = new j.b() {};
        final int d;
        
        private b(int paramInt1, int paramInt2)
        {
          this.d = paramInt1;
        }
        
        public static b a(int paramInt)
        {
          switch (paramInt)
          {
          default: 
            return null;
          case 2: 
            return c;
          case 1: 
            return b;
          }
          return a;
        }
        
        public final int a()
        {
          return this.d;
        }
      }
    }
    
    public static abstract interface c
      extends r
    {}
  }
  
  public static abstract interface x
    extends r
  {}
  
  public static final class y
    extends i
    implements a.z
  {
    public static s<y> a = new b() {};
    private static final y b;
    private final d c;
    private o d;
    private byte e = -1;
    private int f = -1;
    
    static
    {
      y localy = new y();
      b = localy;
      localy.d = n.a;
    }
    
    private y()
    {
      this.c = d.b;
    }
    
    /* Error */
    private y(b.i.b.a.c.g.e parame, g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 44	b/i/b/a/c/g/i:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 46	b/i/b/a/c/e/a$y:e	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 48	b/i/b/a/c/e/a$y:f	I
      //   14: aload_0
      //   15: getstatic 40	b/i/b/a/c/g/n:a	Lb/i/b/a/c/g/o;
      //   18: putfield 42	b/i/b/a/c/e/a$y:d	Lb/i/b/a/c/g/o;
      //   21: invokestatic 63	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   24: astore 9
      //   26: aload 9
      //   28: iconst_1
      //   29: invokestatic 68	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   32: astore 10
      //   34: iconst_0
      //   35: istore 8
      //   37: iconst_0
      //   38: istore_3
      //   39: iload 8
      //   41: ifne +248 -> 289
      //   44: iload_3
      //   45: istore 5
      //   47: iload_3
      //   48: istore 6
      //   50: iload_3
      //   51: istore 7
      //   53: aload_1
      //   54: invokevirtual 73	b/i/b/a/c/g/e:a	()I
      //   57: istore 4
      //   59: iload 4
      //   61: ifeq +114 -> 175
      //   64: iload 4
      //   66: bipush 10
      //   68: if_icmpeq +28 -> 96
      //   71: iload_3
      //   72: istore 5
      //   74: iload_3
      //   75: istore 6
      //   77: iload_3
      //   78: istore 7
      //   80: aload_0
      //   81: aload_1
      //   82: aload 10
      //   84: aload_2
      //   85: iload 4
      //   87: invokevirtual 76	b/i/b/a/c/e/a$y:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   90: ifne -51 -> 39
      //   93: goto +82 -> 175
      //   96: iload_3
      //   97: istore 5
      //   99: iload_3
      //   100: istore 6
      //   102: iload_3
      //   103: istore 7
      //   105: aload_1
      //   106: invokevirtual 79	b/i/b/a/c/g/e:c	()Lb/i/b/a/c/g/d;
      //   109: astore 11
      //   111: iload_3
      //   112: istore 4
      //   114: iload_3
      //   115: iconst_1
      //   116: iand
      //   117: iconst_1
      //   118: if_icmpeq +28 -> 146
      //   121: iload_3
      //   122: istore 5
      //   124: iload_3
      //   125: istore 6
      //   127: iload_3
      //   128: istore 7
      //   130: aload_0
      //   131: new 38	b/i/b/a/c/g/n
      //   134: dup
      //   135: invokespecial 80	b/i/b/a/c/g/n:<init>	()V
      //   138: putfield 42	b/i/b/a/c/e/a$y:d	Lb/i/b/a/c/g/o;
      //   141: iload_3
      //   142: iconst_1
      //   143: ior
      //   144: istore 4
      //   146: iload 4
      //   148: istore 5
      //   150: iload 4
      //   152: istore 6
      //   154: iload 4
      //   156: istore 7
      //   158: aload_0
      //   159: getfield 42	b/i/b/a/c/e/a$y:d	Lb/i/b/a/c/g/o;
      //   162: aload 11
      //   164: invokeinterface 85 2 0
      //   169: iload 4
      //   171: istore_3
      //   172: goto -133 -> 39
      //   175: iconst_1
      //   176: istore 8
      //   178: goto -139 -> 39
      //   181: astore_1
      //   182: goto +51 -> 233
      //   185: astore_1
      //   186: iload 6
      //   188: istore 5
      //   190: new 57	b/i/b/a/c/g/k
      //   193: dup
      //   194: aload_1
      //   195: invokevirtual 89	java/io/IOException:getMessage	()Ljava/lang/String;
      //   198: invokespecial 92	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   201: astore_1
      //   202: iload 6
      //   204: istore 5
      //   206: aload_1
      //   207: aload_0
      //   208: putfield 95	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   211: iload 6
      //   213: istore 5
      //   215: aload_1
      //   216: athrow
      //   217: astore_1
      //   218: iload 7
      //   220: istore 5
      //   222: aload_1
      //   223: aload_0
      //   224: putfield 95	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   227: iload 7
      //   229: istore 5
      //   231: aload_1
      //   232: athrow
      //   233: iload 5
      //   235: iconst_1
      //   236: iand
      //   237: iconst_1
      //   238: if_icmpne +16 -> 254
      //   241: aload_0
      //   242: aload_0
      //   243: getfield 42	b/i/b/a/c/e/a$y:d	Lb/i/b/a/c/g/o;
      //   246: invokeinterface 98 1 0
      //   251: putfield 42	b/i/b/a/c/e/a$y:d	Lb/i/b/a/c/g/o;
      //   254: aload 10
      //   256: invokevirtual 100	b/i/b/a/c/g/f:a	()V
      //   259: aload_0
      //   260: aload 9
      //   262: invokevirtual 104	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   265: putfield 54	b/i/b/a/c/e/a$y:c	Lb/i/b/a/c/g/d;
      //   268: goto +15 -> 283
      //   271: astore_1
      //   272: aload_0
      //   273: aload 9
      //   275: invokevirtual 104	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   278: putfield 54	b/i/b/a/c/e/a$y:c	Lb/i/b/a/c/g/d;
      //   281: aload_1
      //   282: athrow
      //   283: aload_0
      //   284: invokevirtual 107	b/i/b/a/c/e/a$y:w	()V
      //   287: aload_1
      //   288: athrow
      //   289: iload_3
      //   290: iconst_1
      //   291: iand
      //   292: iconst_1
      //   293: if_icmpne +16 -> 309
      //   296: aload_0
      //   297: aload_0
      //   298: getfield 42	b/i/b/a/c/e/a$y:d	Lb/i/b/a/c/g/o;
      //   301: invokeinterface 98 1 0
      //   306: putfield 42	b/i/b/a/c/e/a$y:d	Lb/i/b/a/c/g/o;
      //   309: aload 10
      //   311: invokevirtual 100	b/i/b/a/c/g/f:a	()V
      //   314: aload_0
      //   315: aload 9
      //   317: invokevirtual 104	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   320: putfield 54	b/i/b/a/c/e/a$y:c	Lb/i/b/a/c/g/d;
      //   323: goto +15 -> 338
      //   326: astore_1
      //   327: aload_0
      //   328: aload 9
      //   330: invokevirtual 104	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   333: putfield 54	b/i/b/a/c/e/a$y:c	Lb/i/b/a/c/g/d;
      //   336: aload_1
      //   337: athrow
      //   338: aload_0
      //   339: invokevirtual 107	b/i/b/a/c/e/a$y:w	()V
      //   342: return
      //   343: astore_2
      //   344: goto -85 -> 259
      //   347: astore_1
      //   348: goto -34 -> 314
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	351	0	this	y
      //   0	351	1	parame	b.i.b.a.c.g.e
      //   0	351	2	paramg	g
      //   38	254	3	i	int
      //   57	113	4	j	int
      //   45	192	5	k	int
      //   48	164	6	m	int
      //   51	177	7	n	int
      //   35	142	8	i1	int
      //   24	305	9	localb	b.i.b.a.c.g.d.b
      //   32	278	10	localf	f
      //   109	54	11	locald	d
      // Exception table:
      //   from	to	target	type
      //   53	59	181	finally
      //   80	93	181	finally
      //   105	111	181	finally
      //   130	141	181	finally
      //   158	169	181	finally
      //   190	202	181	finally
      //   206	211	181	finally
      //   215	217	181	finally
      //   222	227	181	finally
      //   231	233	181	finally
      //   53	59	185	java/io/IOException
      //   80	93	185	java/io/IOException
      //   105	111	185	java/io/IOException
      //   130	141	185	java/io/IOException
      //   158	169	185	java/io/IOException
      //   53	59	217	b/i/b/a/c/g/k
      //   80	93	217	b/i/b/a/c/g/k
      //   105	111	217	b/i/b/a/c/g/k
      //   130	141	217	b/i/b/a/c/g/k
      //   158	169	217	b/i/b/a/c/g/k
      //   254	259	271	finally
      //   309	314	326	finally
      //   254	259	343	java/io/IOException
      //   309	314	347	java/io/IOException
    }
    
    private y(i.a parama)
    {
      super();
      this.c = parama.a;
    }
    
    public static a a(y paramy)
    {
      return a.g().a(paramy);
    }
    
    public static y a()
    {
      return b;
    }
    
    public final String a(int paramInt)
    {
      return (String)this.d.get(paramInt);
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      int i = 0;
      while (i < this.d.size())
      {
        paramf.a(1, this.d.a(i));
        i += 1;
      }
      paramf.c(this.c);
    }
    
    public final s<y> b()
    {
      return a;
    }
    
    public final a c()
    {
      return a.g().a(this);
    }
    
    public final boolean e()
    {
      int i = this.e;
      if (i == 1) {
        return true;
      }
      if (i == 0) {
        return false;
      }
      this.e = 1;
      return true;
    }
    
    public final int f()
    {
      int i = this.f;
      if (i != -1) {
        return i;
      }
      i = 0;
      int j = 0;
      while (i < this.d.size())
      {
        j += f.b(this.d.a(i));
        i += 1;
      }
      i = j + 0 + this.d.size() * 1 + this.c.a();
      this.f = i;
      return i;
    }
    
    public static final class a
      extends i.a<a.y, a>
      implements a.z
    {
      private int b;
      private o c = n.a;
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 36	b/i/b/a/c/e/a$y:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 41 3 0
        //   12: checkcast 9	b/i/b/a/c/e/a$y
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 44	b/i/b/a/c/e/a$y$a:a	(Lb/i/b/a/c/e/a$y;)Lb/i/b/a/c/e/a$y$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 47	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/a$y
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 44	b/i/b/a/c/e/a$y$a:a	(Lb/i/b/a/c/e/a$y;)Lb/i/b/a/c/e/a$y$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	g
        //   1	25	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   2	16	24	finally
        //   31	39	24	finally
        //   2	16	30	b/i/b/a/c/g/k
        //   39	41	41	finally
      }
      
      private a h()
      {
        return new a().a(f());
      }
      
      private void i()
      {
        if ((this.b & 0x1) != 1)
        {
          this.c = new n(this.c);
          this.b |= 0x1;
        }
      }
      
      public final a a(a.y paramy)
      {
        if (paramy == a.y.a()) {
          return this;
        }
        if (!a.y.b(paramy).isEmpty()) {
          if (this.c.isEmpty())
          {
            this.c = a.y.b(paramy);
            this.b &= 0xFFFFFFFE;
          }
          else
          {
            i();
            this.c.addAll(a.y.b(paramy));
          }
        }
        this.a = this.a.a(a.y.c(paramy));
        return this;
      }
      
      public final boolean e()
      {
        return true;
      }
      
      public final a.y f()
      {
        a.y localy = new a.y(this, (byte)0);
        if ((this.b & 0x1) == 1)
        {
          this.c = this.c.b();
          this.b &= 0xFFFFFFFE;
        }
        a.y.a(localy, this.c);
        return localy;
      }
    }
  }
  
  public static abstract interface z
    extends r
  {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
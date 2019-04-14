package b.i.b.a.c.e.b;

import b.i.b.a.c.e.a.w;
import b.i.b.a.c.e.a.w.a;
import b.i.b.a.c.e.a.y;
import b.i.b.a.c.e.a.y.a;
import b.i.b.a.c.g.b;
import b.i.b.a.c.g.d;
import b.i.b.a.c.g.f;
import b.i.b.a.c.g.i;
import b.i.b.a.c.g.i.a;
import b.i.b.a.c.g.n;
import b.i.b.a.c.g.o;
import b.i.b.a.c.g.q;
import b.i.b.a.c.g.r;
import b.i.b.a.c.g.s;
import b.i.b.a.c.g.t;
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
    private static final a h;
    public List<a.c> b;
    public List<a.c> c;
    public o d;
    public a.y e;
    public a.w f;
    public List<b.i.b.a.c.e.a.a> g;
    private final d i;
    private int j;
    private byte k = -1;
    private int l = -1;
    
    static
    {
      a locala = new a();
      h = locala;
      locala.g();
    }
    
    private a()
    {
      this.i = d.b;
    }
    
    /* Error */
    private a(b.i.b.a.c.g.e parame, b.i.b.a.c.g.g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 50	b/i/b/a/c/g/i:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 52	b/i/b/a/c/e/b/a$a:k	B
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 54	b/i/b/a/c/e/b/a$a:l	I
      //   14: aload_0
      //   15: invokespecial 48	b/i/b/a/c/e/b/a$a:g	()V
      //   18: invokestatic 68	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   21: astore 11
      //   23: aload 11
      //   25: iconst_1
      //   26: invokestatic 73	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   29: astore 12
      //   31: iconst_0
      //   32: istore 8
      //   34: iconst_0
      //   35: istore_3
      //   36: iload 8
      //   38: ifne +867 -> 905
      //   41: iload_3
      //   42: istore 4
      //   44: iload_3
      //   45: istore 5
      //   47: iload_3
      //   48: istore 6
      //   50: aload_1
      //   51: invokevirtual 78	b/i/b/a/c/g/e:a	()I
      //   54: istore 7
      //   56: iload 7
      //   58: ifeq +674 -> 732
      //   61: iload 7
      //   63: bipush 10
      //   65: if_icmpeq +586 -> 651
      //   68: iload 7
      //   70: bipush 18
      //   72: if_icmpeq +498 -> 570
      //   75: iload 7
      //   77: bipush 26
      //   79: if_icmpeq +412 -> 491
      //   82: aconst_null
      //   83: astore 10
      //   85: aconst_null
      //   86: astore 9
      //   88: iload 7
      //   90: bipush 34
      //   92: if_icmpeq +270 -> 362
      //   95: iload 7
      //   97: bipush 42
      //   99: if_icmpeq +138 -> 237
      //   102: iload 7
      //   104: bipush 50
      //   106: if_icmpeq +28 -> 134
      //   109: iload_3
      //   110: istore 4
      //   112: iload_3
      //   113: istore 5
      //   115: iload_3
      //   116: istore 6
      //   118: aload_0
      //   119: aload_1
      //   120: aload 12
      //   122: aload_2
      //   123: iload 7
      //   125: invokevirtual 81	b/i/b/a/c/e/b/a$a:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   128: ifne -92 -> 36
      //   131: goto +601 -> 732
      //   134: iload_3
      //   135: istore 7
      //   137: iload_3
      //   138: bipush 32
      //   140: iand
      //   141: bipush 32
      //   143: if_icmpeq +29 -> 172
      //   146: iload_3
      //   147: istore 4
      //   149: iload_3
      //   150: istore 5
      //   152: iload_3
      //   153: istore 6
      //   155: aload_0
      //   156: new 83	java/util/ArrayList
      //   159: dup
      //   160: invokespecial 84	java/util/ArrayList:<init>	()V
      //   163: putfield 86	b/i/b/a/c/e/b/a$a:g	Ljava/util/List;
      //   166: iload_3
      //   167: bipush 32
      //   169: ior
      //   170: istore 7
      //   172: iload 7
      //   174: istore 4
      //   176: iload 7
      //   178: istore 5
      //   180: iload 7
      //   182: istore 6
      //   184: aload_0
      //   185: getfield 86	b/i/b/a/c/e/b/a$a:g	Ljava/util/List;
      //   188: astore 9
      //   190: iload 7
      //   192: istore 4
      //   194: iload 7
      //   196: istore 5
      //   198: iload 7
      //   200: istore 6
      //   202: aload_1
      //   203: getstatic 89	b/i/b/a/c/e/a$a:a	Lb/i/b/a/c/g/s;
      //   206: aload_2
      //   207: invokevirtual 92	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   210: astore 10
      //   212: iload 7
      //   214: istore_3
      //   215: iload_3
      //   216: istore 4
      //   218: iload_3
      //   219: istore 5
      //   221: iload_3
      //   222: istore 6
      //   224: aload 9
      //   226: aload 10
      //   228: invokeinterface 98 2 0
      //   233: pop
      //   234: goto -198 -> 36
      //   237: iload_3
      //   238: istore 4
      //   240: iload_3
      //   241: istore 5
      //   243: iload_3
      //   244: istore 6
      //   246: aload_0
      //   247: getfield 100	b/i/b/a/c/e/b/a$a:j	I
      //   250: iconst_2
      //   251: iand
      //   252: iconst_2
      //   253: if_icmpne +21 -> 274
      //   256: iload_3
      //   257: istore 4
      //   259: iload_3
      //   260: istore 5
      //   262: iload_3
      //   263: istore 6
      //   265: aload_0
      //   266: getfield 102	b/i/b/a/c/e/b/a$a:f	Lb/i/b/a/c/e/a$w;
      //   269: invokevirtual 107	b/i/b/a/c/e/a$w:c	()Lb/i/b/a/c/e/a$w$a;
      //   272: astore 9
      //   274: iload_3
      //   275: istore 4
      //   277: iload_3
      //   278: istore 5
      //   280: iload_3
      //   281: istore 6
      //   283: aload_0
      //   284: aload_1
      //   285: getstatic 108	b/i/b/a/c/e/a$w:a	Lb/i/b/a/c/g/s;
      //   288: aload_2
      //   289: invokevirtual 92	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   292: checkcast 104	b/i/b/a/c/e/a$w
      //   295: putfield 102	b/i/b/a/c/e/b/a$a:f	Lb/i/b/a/c/e/a$w;
      //   298: aload 9
      //   300: ifnull +40 -> 340
      //   303: iload_3
      //   304: istore 4
      //   306: iload_3
      //   307: istore 5
      //   309: iload_3
      //   310: istore 6
      //   312: aload 9
      //   314: aload_0
      //   315: getfield 102	b/i/b/a/c/e/b/a$a:f	Lb/i/b/a/c/e/a$w;
      //   318: invokevirtual 113	b/i/b/a/c/e/a$w$a:a	(Lb/i/b/a/c/e/a$w;)Lb/i/b/a/c/e/a$w$a;
      //   321: pop
      //   322: iload_3
      //   323: istore 4
      //   325: iload_3
      //   326: istore 5
      //   328: iload_3
      //   329: istore 6
      //   331: aload_0
      //   332: aload 9
      //   334: invokevirtual 116	b/i/b/a/c/e/a$w$a:f	()Lb/i/b/a/c/e/a$w;
      //   337: putfield 102	b/i/b/a/c/e/b/a$a:f	Lb/i/b/a/c/e/a$w;
      //   340: iload_3
      //   341: istore 4
      //   343: iload_3
      //   344: istore 5
      //   346: iload_3
      //   347: istore 6
      //   349: aload_0
      //   350: aload_0
      //   351: getfield 100	b/i/b/a/c/e/b/a$a:j	I
      //   354: iconst_2
      //   355: ior
      //   356: putfield 100	b/i/b/a/c/e/b/a$a:j	I
      //   359: goto -323 -> 36
      //   362: aload 10
      //   364: astore 9
      //   366: iload_3
      //   367: istore 4
      //   369: iload_3
      //   370: istore 5
      //   372: iload_3
      //   373: istore 6
      //   375: aload_0
      //   376: getfield 100	b/i/b/a/c/e/b/a$a:j	I
      //   379: iconst_1
      //   380: iand
      //   381: iconst_1
      //   382: if_icmpne +21 -> 403
      //   385: iload_3
      //   386: istore 4
      //   388: iload_3
      //   389: istore 5
      //   391: iload_3
      //   392: istore 6
      //   394: aload_0
      //   395: getfield 118	b/i/b/a/c/e/b/a$a:e	Lb/i/b/a/c/e/a$y;
      //   398: invokevirtual 123	b/i/b/a/c/e/a$y:c	()Lb/i/b/a/c/e/a$y$a;
      //   401: astore 9
      //   403: iload_3
      //   404: istore 4
      //   406: iload_3
      //   407: istore 5
      //   409: iload_3
      //   410: istore 6
      //   412: aload_0
      //   413: aload_1
      //   414: getstatic 124	b/i/b/a/c/e/a$y:a	Lb/i/b/a/c/g/s;
      //   417: aload_2
      //   418: invokevirtual 92	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   421: checkcast 120	b/i/b/a/c/e/a$y
      //   424: putfield 118	b/i/b/a/c/e/b/a$a:e	Lb/i/b/a/c/e/a$y;
      //   427: aload 9
      //   429: ifnull +40 -> 469
      //   432: iload_3
      //   433: istore 4
      //   435: iload_3
      //   436: istore 5
      //   438: iload_3
      //   439: istore 6
      //   441: aload 9
      //   443: aload_0
      //   444: getfield 118	b/i/b/a/c/e/b/a$a:e	Lb/i/b/a/c/e/a$y;
      //   447: invokevirtual 129	b/i/b/a/c/e/a$y$a:a	(Lb/i/b/a/c/e/a$y;)Lb/i/b/a/c/e/a$y$a;
      //   450: pop
      //   451: iload_3
      //   452: istore 4
      //   454: iload_3
      //   455: istore 5
      //   457: iload_3
      //   458: istore 6
      //   460: aload_0
      //   461: aload 9
      //   463: invokevirtual 132	b/i/b/a/c/e/a$y$a:f	()Lb/i/b/a/c/e/a$y;
      //   466: putfield 118	b/i/b/a/c/e/b/a$a:e	Lb/i/b/a/c/e/a$y;
      //   469: iload_3
      //   470: istore 4
      //   472: iload_3
      //   473: istore 5
      //   475: iload_3
      //   476: istore 6
      //   478: aload_0
      //   479: aload_0
      //   480: getfield 100	b/i/b/a/c/e/b/a$a:j	I
      //   483: iconst_1
      //   484: ior
      //   485: putfield 100	b/i/b/a/c/e/b/a$a:j	I
      //   488: goto -452 -> 36
      //   491: iload_3
      //   492: istore 4
      //   494: iload_3
      //   495: istore 5
      //   497: iload_3
      //   498: istore 6
      //   500: aload_1
      //   501: invokevirtual 135	b/i/b/a/c/g/e:c	()Lb/i/b/a/c/g/d;
      //   504: astore 9
      //   506: iload_3
      //   507: istore 7
      //   509: iload_3
      //   510: iconst_4
      //   511: iand
      //   512: iconst_4
      //   513: if_icmpeq +28 -> 541
      //   516: iload_3
      //   517: istore 4
      //   519: iload_3
      //   520: istore 5
      //   522: iload_3
      //   523: istore 6
      //   525: aload_0
      //   526: new 137	b/i/b/a/c/g/n
      //   529: dup
      //   530: invokespecial 138	b/i/b/a/c/g/n:<init>	()V
      //   533: putfield 140	b/i/b/a/c/e/b/a$a:d	Lb/i/b/a/c/g/o;
      //   536: iload_3
      //   537: iconst_4
      //   538: ior
      //   539: istore 7
      //   541: iload 7
      //   543: istore 4
      //   545: iload 7
      //   547: istore 5
      //   549: iload 7
      //   551: istore 6
      //   553: aload_0
      //   554: getfield 140	b/i/b/a/c/e/b/a$a:d	Lb/i/b/a/c/g/o;
      //   557: aload 9
      //   559: invokeinterface 145 2 0
      //   564: iload 7
      //   566: istore_3
      //   567: goto -531 -> 36
      //   570: iload_3
      //   571: istore 7
      //   573: iload_3
      //   574: iconst_2
      //   575: iand
      //   576: iconst_2
      //   577: if_icmpeq +28 -> 605
      //   580: iload_3
      //   581: istore 4
      //   583: iload_3
      //   584: istore 5
      //   586: iload_3
      //   587: istore 6
      //   589: aload_0
      //   590: new 83	java/util/ArrayList
      //   593: dup
      //   594: invokespecial 84	java/util/ArrayList:<init>	()V
      //   597: putfield 147	b/i/b/a/c/e/b/a$a:c	Ljava/util/List;
      //   600: iload_3
      //   601: iconst_2
      //   602: ior
      //   603: istore 7
      //   605: iload 7
      //   607: istore 4
      //   609: iload 7
      //   611: istore 5
      //   613: iload 7
      //   615: istore 6
      //   617: aload_0
      //   618: getfield 147	b/i/b/a/c/e/b/a$a:c	Ljava/util/List;
      //   621: astore 9
      //   623: iload 7
      //   625: istore 4
      //   627: iload 7
      //   629: istore 5
      //   631: iload 7
      //   633: istore 6
      //   635: aload_1
      //   636: getstatic 150	b/i/b/a/c/e/b/a$c:a	Lb/i/b/a/c/g/s;
      //   639: aload_2
      //   640: invokevirtual 92	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   643: astore 10
      //   645: iload 7
      //   647: istore_3
      //   648: goto -433 -> 215
      //   651: iload_3
      //   652: istore 7
      //   654: iload_3
      //   655: iconst_1
      //   656: iand
      //   657: iconst_1
      //   658: if_icmpeq +28 -> 686
      //   661: iload_3
      //   662: istore 4
      //   664: iload_3
      //   665: istore 5
      //   667: iload_3
      //   668: istore 6
      //   670: aload_0
      //   671: new 83	java/util/ArrayList
      //   674: dup
      //   675: invokespecial 84	java/util/ArrayList:<init>	()V
      //   678: putfield 152	b/i/b/a/c/e/b/a$a:b	Ljava/util/List;
      //   681: iload_3
      //   682: iconst_1
      //   683: ior
      //   684: istore 7
      //   686: iload 7
      //   688: istore 4
      //   690: iload 7
      //   692: istore 5
      //   694: iload 7
      //   696: istore 6
      //   698: aload_0
      //   699: getfield 152	b/i/b/a/c/e/b/a$a:b	Ljava/util/List;
      //   702: astore 9
      //   704: iload 7
      //   706: istore 4
      //   708: iload 7
      //   710: istore 5
      //   712: iload 7
      //   714: istore 6
      //   716: aload_1
      //   717: getstatic 150	b/i/b/a/c/e/b/a$c:a	Lb/i/b/a/c/g/s;
      //   720: aload_2
      //   721: invokevirtual 92	b/i/b/a/c/g/e:a	(Lb/i/b/a/c/g/s;Lb/i/b/a/c/g/g;)Lb/i/b/a/c/g/q;
      //   724: astore 10
      //   726: iload 7
      //   728: istore_3
      //   729: goto -514 -> 215
      //   732: iconst_1
      //   733: istore 8
      //   735: goto -699 -> 36
      //   738: astore_1
      //   739: goto +51 -> 790
      //   742: astore_1
      //   743: iload 5
      //   745: istore 4
      //   747: new 63	b/i/b/a/c/g/k
      //   750: dup
      //   751: aload_1
      //   752: invokevirtual 156	java/io/IOException:getMessage	()Ljava/lang/String;
      //   755: invokespecial 159	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   758: astore_1
      //   759: iload 5
      //   761: istore 4
      //   763: aload_1
      //   764: aload_0
      //   765: putfield 162	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   768: iload 5
      //   770: istore 4
      //   772: aload_1
      //   773: athrow
      //   774: astore_1
      //   775: iload 6
      //   777: istore 4
      //   779: aload_1
      //   780: aload_0
      //   781: putfield 162	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   784: iload 6
      //   786: istore 4
      //   788: aload_1
      //   789: athrow
      //   790: iload 4
      //   792: iconst_1
      //   793: iand
      //   794: iconst_1
      //   795: if_icmpne +14 -> 809
      //   798: aload_0
      //   799: aload_0
      //   800: getfield 152	b/i/b/a/c/e/b/a$a:b	Ljava/util/List;
      //   803: invokestatic 168	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   806: putfield 152	b/i/b/a/c/e/b/a$a:b	Ljava/util/List;
      //   809: iload 4
      //   811: iconst_2
      //   812: iand
      //   813: iconst_2
      //   814: if_icmpne +14 -> 828
      //   817: aload_0
      //   818: aload_0
      //   819: getfield 147	b/i/b/a/c/e/b/a$a:c	Ljava/util/List;
      //   822: invokestatic 168	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   825: putfield 147	b/i/b/a/c/e/b/a$a:c	Ljava/util/List;
      //   828: iload 4
      //   830: iconst_4
      //   831: iand
      //   832: iconst_4
      //   833: if_icmpne +16 -> 849
      //   836: aload_0
      //   837: aload_0
      //   838: getfield 140	b/i/b/a/c/e/b/a$a:d	Lb/i/b/a/c/g/o;
      //   841: invokeinterface 171 1 0
      //   846: putfield 140	b/i/b/a/c/e/b/a$a:d	Lb/i/b/a/c/g/o;
      //   849: iload 4
      //   851: bipush 32
      //   853: iand
      //   854: bipush 32
      //   856: if_icmpne +14 -> 870
      //   859: aload_0
      //   860: aload_0
      //   861: getfield 86	b/i/b/a/c/e/b/a$a:g	Ljava/util/List;
      //   864: invokestatic 168	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   867: putfield 86	b/i/b/a/c/e/b/a$a:g	Ljava/util/List;
      //   870: aload 12
      //   872: invokevirtual 173	b/i/b/a/c/g/f:a	()V
      //   875: aload_0
      //   876: aload 11
      //   878: invokevirtual 177	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   881: putfield 60	b/i/b/a/c/e/b/a$a:i	Lb/i/b/a/c/g/d;
      //   884: goto +15 -> 899
      //   887: astore_1
      //   888: aload_0
      //   889: aload 11
      //   891: invokevirtual 177	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   894: putfield 60	b/i/b/a/c/e/b/a$a:i	Lb/i/b/a/c/g/d;
      //   897: aload_1
      //   898: athrow
      //   899: aload_0
      //   900: invokevirtual 180	b/i/b/a/c/e/b/a$a:w	()V
      //   903: aload_1
      //   904: athrow
      //   905: iload_3
      //   906: iconst_1
      //   907: iand
      //   908: iconst_1
      //   909: if_icmpne +14 -> 923
      //   912: aload_0
      //   913: aload_0
      //   914: getfield 152	b/i/b/a/c/e/b/a$a:b	Ljava/util/List;
      //   917: invokestatic 168	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   920: putfield 152	b/i/b/a/c/e/b/a$a:b	Ljava/util/List;
      //   923: iload_3
      //   924: iconst_2
      //   925: iand
      //   926: iconst_2
      //   927: if_icmpne +14 -> 941
      //   930: aload_0
      //   931: aload_0
      //   932: getfield 147	b/i/b/a/c/e/b/a$a:c	Ljava/util/List;
      //   935: invokestatic 168	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   938: putfield 147	b/i/b/a/c/e/b/a$a:c	Ljava/util/List;
      //   941: iload_3
      //   942: iconst_4
      //   943: iand
      //   944: iconst_4
      //   945: if_icmpne +16 -> 961
      //   948: aload_0
      //   949: aload_0
      //   950: getfield 140	b/i/b/a/c/e/b/a$a:d	Lb/i/b/a/c/g/o;
      //   953: invokeinterface 171 1 0
      //   958: putfield 140	b/i/b/a/c/e/b/a$a:d	Lb/i/b/a/c/g/o;
      //   961: iload_3
      //   962: bipush 32
      //   964: iand
      //   965: bipush 32
      //   967: if_icmpne +14 -> 981
      //   970: aload_0
      //   971: aload_0
      //   972: getfield 86	b/i/b/a/c/e/b/a$a:g	Ljava/util/List;
      //   975: invokestatic 168	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   978: putfield 86	b/i/b/a/c/e/b/a$a:g	Ljava/util/List;
      //   981: aload 12
      //   983: invokevirtual 173	b/i/b/a/c/g/f:a	()V
      //   986: aload_0
      //   987: aload 11
      //   989: invokevirtual 177	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   992: putfield 60	b/i/b/a/c/e/b/a$a:i	Lb/i/b/a/c/g/d;
      //   995: goto +15 -> 1010
      //   998: astore_1
      //   999: aload_0
      //   1000: aload 11
      //   1002: invokevirtual 177	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1005: putfield 60	b/i/b/a/c/e/b/a$a:i	Lb/i/b/a/c/g/d;
      //   1008: aload_1
      //   1009: athrow
      //   1010: aload_0
      //   1011: invokevirtual 180	b/i/b/a/c/e/b/a$a:w	()V
      //   1014: return
      //   1015: astore_2
      //   1016: goto -141 -> 875
      //   1019: astore_1
      //   1020: goto -34 -> 986
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1023	0	this	a
      //   0	1023	1	parame	b.i.b.a.c.g.e
      //   0	1023	2	paramg	b.i.b.a.c.g.g
      //   35	930	3	m	int
      //   42	812	4	n	int
      //   45	724	5	i1	int
      //   48	737	6	i2	int
      //   54	673	7	i3	int
      //   32	702	8	i4	int
      //   86	617	9	localObject	Object
      //   83	642	10	localq	q
      //   21	980	11	localb	b.i.b.a.c.g.d.b
      //   29	953	12	localf	f
      // Exception table:
      //   from	to	target	type
      //   50	56	738	finally
      //   118	131	738	finally
      //   155	166	738	finally
      //   184	190	738	finally
      //   202	212	738	finally
      //   224	234	738	finally
      //   246	256	738	finally
      //   265	274	738	finally
      //   283	298	738	finally
      //   312	322	738	finally
      //   331	340	738	finally
      //   349	359	738	finally
      //   375	385	738	finally
      //   394	403	738	finally
      //   412	427	738	finally
      //   441	451	738	finally
      //   460	469	738	finally
      //   478	488	738	finally
      //   500	506	738	finally
      //   525	536	738	finally
      //   553	564	738	finally
      //   589	600	738	finally
      //   617	623	738	finally
      //   635	645	738	finally
      //   670	681	738	finally
      //   698	704	738	finally
      //   716	726	738	finally
      //   747	759	738	finally
      //   763	768	738	finally
      //   772	774	738	finally
      //   779	784	738	finally
      //   788	790	738	finally
      //   50	56	742	java/io/IOException
      //   118	131	742	java/io/IOException
      //   155	166	742	java/io/IOException
      //   184	190	742	java/io/IOException
      //   202	212	742	java/io/IOException
      //   224	234	742	java/io/IOException
      //   246	256	742	java/io/IOException
      //   265	274	742	java/io/IOException
      //   283	298	742	java/io/IOException
      //   312	322	742	java/io/IOException
      //   331	340	742	java/io/IOException
      //   349	359	742	java/io/IOException
      //   375	385	742	java/io/IOException
      //   394	403	742	java/io/IOException
      //   412	427	742	java/io/IOException
      //   441	451	742	java/io/IOException
      //   460	469	742	java/io/IOException
      //   478	488	742	java/io/IOException
      //   500	506	742	java/io/IOException
      //   525	536	742	java/io/IOException
      //   553	564	742	java/io/IOException
      //   589	600	742	java/io/IOException
      //   617	623	742	java/io/IOException
      //   635	645	742	java/io/IOException
      //   670	681	742	java/io/IOException
      //   698	704	742	java/io/IOException
      //   716	726	742	java/io/IOException
      //   50	56	774	b/i/b/a/c/g/k
      //   118	131	774	b/i/b/a/c/g/k
      //   155	166	774	b/i/b/a/c/g/k
      //   184	190	774	b/i/b/a/c/g/k
      //   202	212	774	b/i/b/a/c/g/k
      //   224	234	774	b/i/b/a/c/g/k
      //   246	256	774	b/i/b/a/c/g/k
      //   265	274	774	b/i/b/a/c/g/k
      //   283	298	774	b/i/b/a/c/g/k
      //   312	322	774	b/i/b/a/c/g/k
      //   331	340	774	b/i/b/a/c/g/k
      //   349	359	774	b/i/b/a/c/g/k
      //   375	385	774	b/i/b/a/c/g/k
      //   394	403	774	b/i/b/a/c/g/k
      //   412	427	774	b/i/b/a/c/g/k
      //   441	451	774	b/i/b/a/c/g/k
      //   460	469	774	b/i/b/a/c/g/k
      //   478	488	774	b/i/b/a/c/g/k
      //   500	506	774	b/i/b/a/c/g/k
      //   525	536	774	b/i/b/a/c/g/k
      //   553	564	774	b/i/b/a/c/g/k
      //   589	600	774	b/i/b/a/c/g/k
      //   617	623	774	b/i/b/a/c/g/k
      //   635	645	774	b/i/b/a/c/g/k
      //   670	681	774	b/i/b/a/c/g/k
      //   698	704	774	b/i/b/a/c/g/k
      //   716	726	774	b/i/b/a/c/g/k
      //   870	875	887	finally
      //   981	986	998	finally
      //   870	875	1015	java/io/IOException
      //   981	986	1019	java/io/IOException
    }
    
    private a(i.a parama)
    {
      super();
      this.i = parama.a;
    }
    
    public static a a()
    {
      return h;
    }
    
    public static a a(InputStream paramInputStream)
      throws IOException
    {
      return (a)a.a(paramInputStream);
    }
    
    private void g()
    {
      this.b = Collections.emptyList();
      this.c = Collections.emptyList();
      this.d = n.a;
      this.e = a.y.a();
      this.f = a.w.a();
      this.g = Collections.emptyList();
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      int n = 0;
      int m = 0;
      while (m < this.b.size())
      {
        paramf.a(1, (q)this.b.get(m));
        m += 1;
      }
      m = 0;
      while (m < this.c.size())
      {
        paramf.a(2, (q)this.c.get(m));
        m += 1;
      }
      m = 0;
      while (m < this.d.size())
      {
        paramf.a(3, this.d.a(m));
        m += 1;
      }
      if ((this.j & 0x1) == 1) {
        paramf.a(4, this.e);
      }
      m = n;
      if ((this.j & 0x2) == 2)
      {
        paramf.a(5, this.f);
        m = n;
      }
      while (m < this.g.size())
      {
        paramf.a(6, (q)this.g.get(m));
        m += 1;
      }
      paramf.c(this.i);
    }
    
    public final s<a> b()
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
      m = 0;
      while (m < this.b.size())
      {
        if (!((a.c)this.b.get(m)).e())
        {
          this.k = 0;
          return false;
        }
        m += 1;
      }
      m = 0;
      while (m < this.c.size())
      {
        if (!((a.c)this.c.get(m)).e())
        {
          this.k = 0;
          return false;
        }
        m += 1;
      }
      if ((d()) && (!this.f.e()))
      {
        this.k = 0;
        return false;
      }
      m = 0;
      while (m < this.g.size())
      {
        if (!((b.i.b.a.c.e.a.a)this.g.get(m)).e())
        {
          this.k = 0;
          return false;
        }
        m += 1;
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
      int i2 = 0;
      int n = 0;
      m = 0;
      while (n < this.b.size())
      {
        m += f.c(1, (q)this.b.get(n));
        n += 1;
      }
      n = 0;
      while (n < this.c.size())
      {
        m += f.c(2, (q)this.c.get(n));
        n += 1;
      }
      n = 0;
      int i1 = 0;
      while (n < this.d.size())
      {
        i1 += f.b(this.d.a(n));
        n += 1;
      }
      n = m + i1 + this.d.size() * 1;
      m = n;
      if ((this.j & 0x1) == 1) {
        m = n + f.c(4, this.e);
      }
      i1 = i2;
      n = m;
      if ((this.j & 0x2) == 2)
      {
        n = m + f.c(5, this.f);
        i1 = i2;
      }
      while (i1 < this.g.size())
      {
        n += f.c(6, (q)this.g.get(i1));
        i1 += 1;
      }
      m = n + this.i.a();
      this.l = m;
      return m;
    }
    
    public static final class a
      extends i.a<a.a, a>
      implements a.b
    {
      private int b;
      private List<a.c> c = Collections.emptyList();
      private List<a.c> d = Collections.emptyList();
      private o e = n.a;
      private a.y f = a.y.a();
      private a.w g = a.w.a();
      private List<b.i.b.a.c.e.a.a> h = Collections.emptyList();
      
      private a a(a.w paramw)
      {
        a.w localw = paramw;
        if ((this.b & 0x10) == 16)
        {
          localw = paramw;
          if (this.g != a.w.a()) {
            localw = a.w.a(this.g).a(paramw).f();
          }
        }
        this.g = localw;
        this.b |= 0x10;
        return this;
      }
      
      private a a(a.y paramy)
      {
        a.y localy = paramy;
        if ((this.b & 0x8) == 8)
        {
          localy = paramy;
          if (this.f != a.y.a()) {
            localy = a.y.a(this.f).a(paramy).f();
          }
        }
        this.f = localy;
        this.b |= 0x8;
        return this;
      }
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, b.i.b.a.c.g.g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 91	b/i/b/a/c/e/b/a$a:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 96 3 0
        //   12: checkcast 9	b/i/b/a/c/e/b/a$a
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 99	b/i/b/a/c/e/b/a$a$a:a	(Lb/i/b/a/c/e/b/a$a;)Lb/i/b/a/c/e/b/a$a$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 102	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/b/a$a
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 99	b/i/b/a/c/e/b/a$a$a:a	(Lb/i/b/a/c/e/b/a$a;)Lb/i/b/a/c/e/b/a$a$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	b.i.b.a.c.g.g
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
      
      private a.a h()
      {
        int i = 0;
        a.a locala = new a.a(this, (byte)0);
        int k = this.b;
        if ((this.b & 0x1) == 1)
        {
          this.c = Collections.unmodifiableList(this.c);
          this.b &= 0xFFFFFFFE;
        }
        a.a.a(locala, this.c);
        if ((this.b & 0x2) == 2)
        {
          this.d = Collections.unmodifiableList(this.d);
          this.b &= 0xFFFFFFFD;
        }
        a.a.b(locala, this.d);
        if ((this.b & 0x4) == 4)
        {
          this.e = this.e.b();
          this.b &= 0xFFFFFFFB;
        }
        a.a.a(locala, this.e);
        if ((k & 0x8) == 8) {
          i = 1;
        }
        a.a.a(locala, this.f);
        int j = i;
        if ((k & 0x10) == 16) {
          j = i | 0x2;
        }
        a.a.a(locala, this.g);
        if ((this.b & 0x20) == 32)
        {
          this.h = Collections.unmodifiableList(this.h);
          this.b &= 0xFFFFFFDF;
        }
        a.a.c(locala, this.h);
        a.a.a(locala, j);
        return locala;
      }
      
      private void i()
      {
        if ((this.b & 0x1) != 1)
        {
          this.c = new ArrayList(this.c);
          this.b |= 0x1;
        }
      }
      
      private void k()
      {
        if ((this.b & 0x2) != 2)
        {
          this.d = new ArrayList(this.d);
          this.b |= 0x2;
        }
      }
      
      private void l()
      {
        if ((this.b & 0x4) != 4)
        {
          this.e = new n(this.e);
          this.b |= 0x4;
        }
      }
      
      private void m()
      {
        if ((this.b & 0x20) != 32)
        {
          this.h = new ArrayList(this.h);
          this.b |= 0x20;
        }
      }
      
      public final a a(a.a parama)
      {
        if (parama == a.a.a()) {
          return this;
        }
        if (!a.a.a(parama).isEmpty()) {
          if (this.c.isEmpty())
          {
            this.c = a.a.a(parama);
            this.b &= 0xFFFFFFFE;
          }
          else
          {
            i();
            this.c.addAll(a.a.a(parama));
          }
        }
        if (!a.a.b(parama).isEmpty()) {
          if (this.d.isEmpty())
          {
            this.d = a.a.b(parama);
            this.b &= 0xFFFFFFFD;
          }
          else
          {
            k();
            this.d.addAll(a.a.b(parama));
          }
        }
        if (!a.a.c(parama).isEmpty()) {
          if (this.e.isEmpty())
          {
            this.e = a.a.c(parama);
            this.b &= 0xFFFFFFFB;
          }
          else
          {
            l();
            this.e.addAll(a.a.c(parama));
          }
        }
        if (parama.c()) {
          a(parama.e);
        }
        if (parama.d()) {
          a(parama.f);
        }
        if (!a.a.d(parama).isEmpty()) {
          if (this.h.isEmpty())
          {
            this.h = a.a.d(parama);
            this.b &= 0xFFFFFFDF;
          }
          else
          {
            m();
            this.h.addAll(a.a.d(parama));
          }
        }
        this.a = this.a.a(a.a.e(parama));
        return this;
      }
      
      public final boolean e()
      {
        int i = 0;
        while (i < this.c.size())
        {
          if (!((a.c)this.c.get(i)).e()) {
            return false;
          }
          i += 1;
        }
        i = 0;
        while (i < this.d.size())
        {
          if (!((a.c)this.d.get(i)).e()) {
            return false;
          }
          i += 1;
        }
        if ((this.b & 0x10) == 16) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (!this.g.e())) {
          return false;
        }
        i = 0;
        while (i < this.h.size())
        {
          if (!((b.i.b.a.c.e.a.a)this.h.get(i)).e()) {
            return false;
          }
          i += 1;
        }
        return true;
      }
    }
  }
  
  public static abstract interface b
    extends r
  {}
  
  public static final class c
    extends i
    implements a.d
  {
    public static s<c> a = new b() {};
    private static final c g;
    public o b;
    public List<Integer> c;
    public o d;
    public o e;
    public List<Integer> f;
    private final d h;
    private int i;
    private Object j;
    private int k = -1;
    private int l = -1;
    private byte m = -1;
    private int n = -1;
    
    static
    {
      c localc = new c();
      g = localc;
      localc.k();
    }
    
    private c()
    {
      this.h = d.b;
    }
    
    /* Error */
    private c(b.i.b.a.c.g.e parame, b.i.b.a.c.g.g paramg)
      throws b.i.b.a.c.g.k
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 50	b/i/b/a/c/g/i:<init>	()V
      //   4: aload_0
      //   5: iconst_m1
      //   6: putfield 52	b/i/b/a/c/e/b/a$c:k	I
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 54	b/i/b/a/c/e/b/a$c:l	I
      //   14: aload_0
      //   15: iconst_m1
      //   16: putfield 56	b/i/b/a/c/e/b/a$c:m	B
      //   19: aload_0
      //   20: iconst_m1
      //   21: putfield 58	b/i/b/a/c/e/b/a$c:n	I
      //   24: aload_0
      //   25: invokespecial 48	b/i/b/a/c/e/b/a$c:k	()V
      //   28: invokestatic 72	b/i/b/a/c/g/d:h	()Lb/i/b/a/c/g/d$b;
      //   31: astore 13
      //   33: aload 13
      //   35: iconst_1
      //   36: invokestatic 77	b/i/b/a/c/g/f:a	(Ljava/io/OutputStream;I)Lb/i/b/a/c/g/f;
      //   39: astore 14
      //   41: iconst_0
      //   42: istore 8
      //   44: iconst_0
      //   45: istore_3
      //   46: iload 8
      //   48: ifne +1067 -> 1115
      //   51: iload_3
      //   52: istore 4
      //   54: iload_3
      //   55: istore 5
      //   57: iload_3
      //   58: istore 6
      //   60: aload_1
      //   61: invokevirtual 82	b/i/b/a/c/g/e:a	()I
      //   64: istore 7
      //   66: iload 7
      //   68: ifeq +847 -> 915
      //   71: iload 7
      //   73: bipush 10
      //   75: if_icmpeq +788 -> 863
      //   78: iload 7
      //   80: bipush 18
      //   82: if_icmpeq +707 -> 789
      //   85: iload 7
      //   87: bipush 24
      //   89: if_icmpeq +620 -> 709
      //   92: iload 7
      //   94: bipush 26
      //   96: if_icmpeq +482 -> 578
      //   99: iload 7
      //   101: bipush 34
      //   103: if_icmpeq +398 -> 501
      //   106: iload 7
      //   108: bipush 42
      //   110: if_icmpeq +296 -> 406
      //   113: iload 7
      //   115: bipush 48
      //   117: if_icmpeq +187 -> 304
      //   120: iload 7
      //   122: bipush 50
      //   124: if_icmpeq +28 -> 152
      //   127: iload_3
      //   128: istore 4
      //   130: iload_3
      //   131: istore 5
      //   133: iload_3
      //   134: istore 6
      //   136: aload_0
      //   137: aload_1
      //   138: aload 14
      //   140: aload_2
      //   141: iload 7
      //   143: invokevirtual 85	b/i/b/a/c/e/b/a$c:a	(Lb/i/b/a/c/g/e;Lb/i/b/a/c/g/f;Lb/i/b/a/c/g/g;I)Z
      //   146: ifne -100 -> 46
      //   149: goto +766 -> 915
      //   152: iload_3
      //   153: istore 4
      //   155: iload_3
      //   156: istore 5
      //   158: iload_3
      //   159: istore 6
      //   161: aload_1
      //   162: aload_1
      //   163: invokevirtual 87	b/i/b/a/c/g/e:d	()I
      //   166: invokevirtual 90	b/i/b/a/c/g/e:b	(I)I
      //   169: istore 10
      //   171: iload_3
      //   172: istore 7
      //   174: iload_3
      //   175: bipush 32
      //   177: iand
      //   178: bipush 32
      //   180: if_icmpeq +48 -> 228
      //   183: iload_3
      //   184: istore 7
      //   186: iload_3
      //   187: istore 4
      //   189: iload_3
      //   190: istore 5
      //   192: iload_3
      //   193: istore 6
      //   195: aload_1
      //   196: invokevirtual 92	b/i/b/a/c/g/e:h	()I
      //   199: ifle +29 -> 228
      //   202: iload_3
      //   203: istore 4
      //   205: iload_3
      //   206: istore 5
      //   208: iload_3
      //   209: istore 6
      //   211: aload_0
      //   212: new 94	java/util/ArrayList
      //   215: dup
      //   216: invokespecial 95	java/util/ArrayList:<init>	()V
      //   219: putfield 97	b/i/b/a/c/e/b/a$c:f	Ljava/util/List;
      //   222: iload_3
      //   223: bipush 32
      //   225: ior
      //   226: istore 7
      //   228: iload 7
      //   230: istore_3
      //   231: iload 10
      //   233: istore 9
      //   235: iload 7
      //   237: istore 4
      //   239: iload 7
      //   241: istore 5
      //   243: iload 7
      //   245: istore 6
      //   247: aload_1
      //   248: invokevirtual 92	b/i/b/a/c/g/e:h	()I
      //   251: ifle +35 -> 286
      //   254: iload 7
      //   256: istore 4
      //   258: iload 7
      //   260: istore 5
      //   262: iload 7
      //   264: istore 6
      //   266: aload_0
      //   267: getfield 97	b/i/b/a/c/e/b/a$c:f	Ljava/util/List;
      //   270: aload_1
      //   271: invokevirtual 87	b/i/b/a/c/g/e:d	()I
      //   274: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   277: invokeinterface 109 2 0
      //   282: pop
      //   283: goto -55 -> 228
      //   286: iload_3
      //   287: istore 4
      //   289: iload_3
      //   290: istore 5
      //   292: iload_3
      //   293: istore 6
      //   295: aload_1
      //   296: iload 9
      //   298: invokevirtual 112	b/i/b/a/c/g/e:c	(I)V
      //   301: goto -255 -> 46
      //   304: iload_3
      //   305: istore 7
      //   307: iload_3
      //   308: bipush 32
      //   310: iand
      //   311: bipush 32
      //   313: if_icmpeq +29 -> 342
      //   316: iload_3
      //   317: istore 4
      //   319: iload_3
      //   320: istore 5
      //   322: iload_3
      //   323: istore 6
      //   325: aload_0
      //   326: new 94	java/util/ArrayList
      //   329: dup
      //   330: invokespecial 95	java/util/ArrayList:<init>	()V
      //   333: putfield 97	b/i/b/a/c/e/b/a$c:f	Ljava/util/List;
      //   336: iload_3
      //   337: bipush 32
      //   339: ior
      //   340: istore 7
      //   342: iload 7
      //   344: istore 4
      //   346: iload 7
      //   348: istore 5
      //   350: iload 7
      //   352: istore 6
      //   354: aload_0
      //   355: getfield 97	b/i/b/a/c/e/b/a$c:f	Ljava/util/List;
      //   358: astore 11
      //   360: iload 7
      //   362: istore 4
      //   364: iload 7
      //   366: istore 5
      //   368: iload 7
      //   370: istore 6
      //   372: aload_1
      //   373: invokevirtual 87	b/i/b/a/c/g/e:d	()I
      //   376: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   379: astore 12
      //   381: iload 7
      //   383: istore_3
      //   384: iload_3
      //   385: istore 4
      //   387: iload_3
      //   388: istore 5
      //   390: iload_3
      //   391: istore 6
      //   393: aload 11
      //   395: aload 12
      //   397: invokeinterface 109 2 0
      //   402: pop
      //   403: goto -357 -> 46
      //   406: iload_3
      //   407: istore 4
      //   409: iload_3
      //   410: istore 5
      //   412: iload_3
      //   413: istore 6
      //   415: aload_1
      //   416: invokevirtual 115	b/i/b/a/c/g/e:c	()Lb/i/b/a/c/g/d;
      //   419: astore 11
      //   421: iload_3
      //   422: istore 7
      //   424: iload_3
      //   425: bipush 16
      //   427: iand
      //   428: bipush 16
      //   430: if_icmpeq +29 -> 459
      //   433: iload_3
      //   434: istore 4
      //   436: iload_3
      //   437: istore 5
      //   439: iload_3
      //   440: istore 6
      //   442: aload_0
      //   443: new 117	b/i/b/a/c/g/n
      //   446: dup
      //   447: invokespecial 118	b/i/b/a/c/g/n:<init>	()V
      //   450: putfield 120	b/i/b/a/c/e/b/a$c:e	Lb/i/b/a/c/g/o;
      //   453: iload_3
      //   454: bipush 16
      //   456: ior
      //   457: istore 7
      //   459: iload 7
      //   461: istore 4
      //   463: iload 7
      //   465: istore 5
      //   467: iload 7
      //   469: istore 6
      //   471: aload_0
      //   472: getfield 120	b/i/b/a/c/e/b/a$c:e	Lb/i/b/a/c/g/o;
      //   475: astore 12
      //   477: iload 7
      //   479: istore_3
      //   480: iload_3
      //   481: istore 4
      //   483: iload_3
      //   484: istore 5
      //   486: iload_3
      //   487: istore 6
      //   489: aload 12
      //   491: aload 11
      //   493: invokeinterface 125 2 0
      //   498: goto -452 -> 46
      //   501: iload_3
      //   502: istore 4
      //   504: iload_3
      //   505: istore 5
      //   507: iload_3
      //   508: istore 6
      //   510: aload_1
      //   511: invokevirtual 115	b/i/b/a/c/g/e:c	()Lb/i/b/a/c/g/d;
      //   514: astore 11
      //   516: iload_3
      //   517: istore 7
      //   519: iload_3
      //   520: bipush 8
      //   522: iand
      //   523: bipush 8
      //   525: if_icmpeq +29 -> 554
      //   528: iload_3
      //   529: istore 4
      //   531: iload_3
      //   532: istore 5
      //   534: iload_3
      //   535: istore 6
      //   537: aload_0
      //   538: new 117	b/i/b/a/c/g/n
      //   541: dup
      //   542: invokespecial 118	b/i/b/a/c/g/n:<init>	()V
      //   545: putfield 127	b/i/b/a/c/e/b/a$c:d	Lb/i/b/a/c/g/o;
      //   548: iload_3
      //   549: bipush 8
      //   551: ior
      //   552: istore 7
      //   554: iload 7
      //   556: istore 4
      //   558: iload 7
      //   560: istore 5
      //   562: iload 7
      //   564: istore 6
      //   566: aload_0
      //   567: getfield 127	b/i/b/a/c/e/b/a$c:d	Lb/i/b/a/c/g/o;
      //   570: astore 12
      //   572: iload 7
      //   574: istore_3
      //   575: goto -95 -> 480
      //   578: iload_3
      //   579: istore 4
      //   581: iload_3
      //   582: istore 5
      //   584: iload_3
      //   585: istore 6
      //   587: aload_1
      //   588: aload_1
      //   589: invokevirtual 87	b/i/b/a/c/g/e:d	()I
      //   592: invokevirtual 90	b/i/b/a/c/g/e:b	(I)I
      //   595: istore 10
      //   597: iload_3
      //   598: istore 7
      //   600: iload_3
      //   601: iconst_4
      //   602: iand
      //   603: iconst_4
      //   604: if_icmpeq +47 -> 651
      //   607: iload_3
      //   608: istore 7
      //   610: iload_3
      //   611: istore 4
      //   613: iload_3
      //   614: istore 5
      //   616: iload_3
      //   617: istore 6
      //   619: aload_1
      //   620: invokevirtual 92	b/i/b/a/c/g/e:h	()I
      //   623: ifle +28 -> 651
      //   626: iload_3
      //   627: istore 4
      //   629: iload_3
      //   630: istore 5
      //   632: iload_3
      //   633: istore 6
      //   635: aload_0
      //   636: new 94	java/util/ArrayList
      //   639: dup
      //   640: invokespecial 95	java/util/ArrayList:<init>	()V
      //   643: putfield 129	b/i/b/a/c/e/b/a$c:c	Ljava/util/List;
      //   646: iload_3
      //   647: iconst_4
      //   648: ior
      //   649: istore 7
      //   651: iload 7
      //   653: istore_3
      //   654: iload 10
      //   656: istore 9
      //   658: iload 7
      //   660: istore 4
      //   662: iload 7
      //   664: istore 5
      //   666: iload 7
      //   668: istore 6
      //   670: aload_1
      //   671: invokevirtual 92	b/i/b/a/c/g/e:h	()I
      //   674: ifle -388 -> 286
      //   677: iload 7
      //   679: istore 4
      //   681: iload 7
      //   683: istore 5
      //   685: iload 7
      //   687: istore 6
      //   689: aload_0
      //   690: getfield 129	b/i/b/a/c/e/b/a$c:c	Ljava/util/List;
      //   693: aload_1
      //   694: invokevirtual 87	b/i/b/a/c/g/e:d	()I
      //   697: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   700: invokeinterface 109 2 0
      //   705: pop
      //   706: goto -55 -> 651
      //   709: iload_3
      //   710: istore 7
      //   712: iload_3
      //   713: iconst_4
      //   714: iand
      //   715: iconst_4
      //   716: if_icmpeq +28 -> 744
      //   719: iload_3
      //   720: istore 4
      //   722: iload_3
      //   723: istore 5
      //   725: iload_3
      //   726: istore 6
      //   728: aload_0
      //   729: new 94	java/util/ArrayList
      //   732: dup
      //   733: invokespecial 95	java/util/ArrayList:<init>	()V
      //   736: putfield 129	b/i/b/a/c/e/b/a$c:c	Ljava/util/List;
      //   739: iload_3
      //   740: iconst_4
      //   741: ior
      //   742: istore 7
      //   744: iload 7
      //   746: istore 4
      //   748: iload 7
      //   750: istore 5
      //   752: iload 7
      //   754: istore 6
      //   756: aload_0
      //   757: getfield 129	b/i/b/a/c/e/b/a$c:c	Ljava/util/List;
      //   760: astore 11
      //   762: iload 7
      //   764: istore 4
      //   766: iload 7
      //   768: istore 5
      //   770: iload 7
      //   772: istore 6
      //   774: aload_1
      //   775: invokevirtual 87	b/i/b/a/c/g/e:d	()I
      //   778: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   781: astore 12
      //   783: iload 7
      //   785: istore_3
      //   786: goto -402 -> 384
      //   789: iload_3
      //   790: istore 4
      //   792: iload_3
      //   793: istore 5
      //   795: iload_3
      //   796: istore 6
      //   798: aload_1
      //   799: invokevirtual 115	b/i/b/a/c/g/e:c	()Lb/i/b/a/c/g/d;
      //   802: astore 11
      //   804: iload_3
      //   805: istore 7
      //   807: iload_3
      //   808: iconst_2
      //   809: iand
      //   810: iconst_2
      //   811: if_icmpeq +28 -> 839
      //   814: iload_3
      //   815: istore 4
      //   817: iload_3
      //   818: istore 5
      //   820: iload_3
      //   821: istore 6
      //   823: aload_0
      //   824: new 117	b/i/b/a/c/g/n
      //   827: dup
      //   828: invokespecial 118	b/i/b/a/c/g/n:<init>	()V
      //   831: putfield 131	b/i/b/a/c/e/b/a$c:b	Lb/i/b/a/c/g/o;
      //   834: iload_3
      //   835: iconst_2
      //   836: ior
      //   837: istore 7
      //   839: iload 7
      //   841: istore 4
      //   843: iload 7
      //   845: istore 5
      //   847: iload 7
      //   849: istore 6
      //   851: aload_0
      //   852: getfield 131	b/i/b/a/c/e/b/a$c:b	Lb/i/b/a/c/g/o;
      //   855: astore 12
      //   857: iload 7
      //   859: istore_3
      //   860: goto -380 -> 480
      //   863: iload_3
      //   864: istore 4
      //   866: iload_3
      //   867: istore 5
      //   869: iload_3
      //   870: istore 6
      //   872: aload_1
      //   873: invokevirtual 115	b/i/b/a/c/g/e:c	()Lb/i/b/a/c/g/d;
      //   876: astore 11
      //   878: iload_3
      //   879: istore 4
      //   881: iload_3
      //   882: istore 5
      //   884: iload_3
      //   885: istore 6
      //   887: aload_0
      //   888: aload_0
      //   889: getfield 133	b/i/b/a/c/e/b/a$c:i	I
      //   892: iconst_1
      //   893: ior
      //   894: putfield 133	b/i/b/a/c/e/b/a$c:i	I
      //   897: iload_3
      //   898: istore 4
      //   900: iload_3
      //   901: istore 5
      //   903: iload_3
      //   904: istore 6
      //   906: aload_0
      //   907: aload 11
      //   909: putfield 135	b/i/b/a/c/e/b/a$c:j	Ljava/lang/Object;
      //   912: goto -866 -> 46
      //   915: iconst_1
      //   916: istore 8
      //   918: goto -872 -> 46
      //   921: astore_1
      //   922: goto +51 -> 973
      //   925: astore_1
      //   926: iload 5
      //   928: istore 4
      //   930: new 67	b/i/b/a/c/g/k
      //   933: dup
      //   934: aload_1
      //   935: invokevirtual 139	java/io/IOException:getMessage	()Ljava/lang/String;
      //   938: invokespecial 142	b/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   941: astore_1
      //   942: iload 5
      //   944: istore 4
      //   946: aload_1
      //   947: aload_0
      //   948: putfield 145	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   951: iload 5
      //   953: istore 4
      //   955: aload_1
      //   956: athrow
      //   957: astore_1
      //   958: iload 6
      //   960: istore 4
      //   962: aload_1
      //   963: aload_0
      //   964: putfield 145	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
      //   967: iload 6
      //   969: istore 4
      //   971: aload_1
      //   972: athrow
      //   973: iload 4
      //   975: iconst_2
      //   976: iand
      //   977: iconst_2
      //   978: if_icmpne +16 -> 994
      //   981: aload_0
      //   982: aload_0
      //   983: getfield 131	b/i/b/a/c/e/b/a$c:b	Lb/i/b/a/c/g/o;
      //   986: invokeinterface 148 1 0
      //   991: putfield 131	b/i/b/a/c/e/b/a$c:b	Lb/i/b/a/c/g/o;
      //   994: iload 4
      //   996: iconst_4
      //   997: iand
      //   998: iconst_4
      //   999: if_icmpne +14 -> 1013
      //   1002: aload_0
      //   1003: aload_0
      //   1004: getfield 129	b/i/b/a/c/e/b/a$c:c	Ljava/util/List;
      //   1007: invokestatic 154	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1010: putfield 129	b/i/b/a/c/e/b/a$c:c	Ljava/util/List;
      //   1013: iload 4
      //   1015: bipush 8
      //   1017: iand
      //   1018: bipush 8
      //   1020: if_icmpne +16 -> 1036
      //   1023: aload_0
      //   1024: aload_0
      //   1025: getfield 127	b/i/b/a/c/e/b/a$c:d	Lb/i/b/a/c/g/o;
      //   1028: invokeinterface 148 1 0
      //   1033: putfield 127	b/i/b/a/c/e/b/a$c:d	Lb/i/b/a/c/g/o;
      //   1036: iload 4
      //   1038: bipush 16
      //   1040: iand
      //   1041: bipush 16
      //   1043: if_icmpne +16 -> 1059
      //   1046: aload_0
      //   1047: aload_0
      //   1048: getfield 120	b/i/b/a/c/e/b/a$c:e	Lb/i/b/a/c/g/o;
      //   1051: invokeinterface 148 1 0
      //   1056: putfield 120	b/i/b/a/c/e/b/a$c:e	Lb/i/b/a/c/g/o;
      //   1059: iload 4
      //   1061: bipush 32
      //   1063: iand
      //   1064: bipush 32
      //   1066: if_icmpne +14 -> 1080
      //   1069: aload_0
      //   1070: aload_0
      //   1071: getfield 97	b/i/b/a/c/e/b/a$c:f	Ljava/util/List;
      //   1074: invokestatic 154	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1077: putfield 97	b/i/b/a/c/e/b/a$c:f	Ljava/util/List;
      //   1080: aload 14
      //   1082: invokevirtual 156	b/i/b/a/c/g/f:a	()V
      //   1085: aload_0
      //   1086: aload 13
      //   1088: invokevirtual 160	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1091: putfield 64	b/i/b/a/c/e/b/a$c:h	Lb/i/b/a/c/g/d;
      //   1094: goto +15 -> 1109
      //   1097: astore_1
      //   1098: aload_0
      //   1099: aload 13
      //   1101: invokevirtual 160	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1104: putfield 64	b/i/b/a/c/e/b/a$c:h	Lb/i/b/a/c/g/d;
      //   1107: aload_1
      //   1108: athrow
      //   1109: aload_0
      //   1110: invokevirtual 163	b/i/b/a/c/e/b/a$c:w	()V
      //   1113: aload_1
      //   1114: athrow
      //   1115: iload_3
      //   1116: iconst_2
      //   1117: iand
      //   1118: iconst_2
      //   1119: if_icmpne +16 -> 1135
      //   1122: aload_0
      //   1123: aload_0
      //   1124: getfield 131	b/i/b/a/c/e/b/a$c:b	Lb/i/b/a/c/g/o;
      //   1127: invokeinterface 148 1 0
      //   1132: putfield 131	b/i/b/a/c/e/b/a$c:b	Lb/i/b/a/c/g/o;
      //   1135: iload_3
      //   1136: iconst_4
      //   1137: iand
      //   1138: iconst_4
      //   1139: if_icmpne +14 -> 1153
      //   1142: aload_0
      //   1143: aload_0
      //   1144: getfield 129	b/i/b/a/c/e/b/a$c:c	Ljava/util/List;
      //   1147: invokestatic 154	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1150: putfield 129	b/i/b/a/c/e/b/a$c:c	Ljava/util/List;
      //   1153: iload_3
      //   1154: bipush 8
      //   1156: iand
      //   1157: bipush 8
      //   1159: if_icmpne +16 -> 1175
      //   1162: aload_0
      //   1163: aload_0
      //   1164: getfield 127	b/i/b/a/c/e/b/a$c:d	Lb/i/b/a/c/g/o;
      //   1167: invokeinterface 148 1 0
      //   1172: putfield 127	b/i/b/a/c/e/b/a$c:d	Lb/i/b/a/c/g/o;
      //   1175: iload_3
      //   1176: bipush 16
      //   1178: iand
      //   1179: bipush 16
      //   1181: if_icmpne +16 -> 1197
      //   1184: aload_0
      //   1185: aload_0
      //   1186: getfield 120	b/i/b/a/c/e/b/a$c:e	Lb/i/b/a/c/g/o;
      //   1189: invokeinterface 148 1 0
      //   1194: putfield 120	b/i/b/a/c/e/b/a$c:e	Lb/i/b/a/c/g/o;
      //   1197: iload_3
      //   1198: bipush 32
      //   1200: iand
      //   1201: bipush 32
      //   1203: if_icmpne +14 -> 1217
      //   1206: aload_0
      //   1207: aload_0
      //   1208: getfield 97	b/i/b/a/c/e/b/a$c:f	Ljava/util/List;
      //   1211: invokestatic 154	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1214: putfield 97	b/i/b/a/c/e/b/a$c:f	Ljava/util/List;
      //   1217: aload 14
      //   1219: invokevirtual 156	b/i/b/a/c/g/f:a	()V
      //   1222: aload_0
      //   1223: aload 13
      //   1225: invokevirtual 160	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1228: putfield 64	b/i/b/a/c/e/b/a$c:h	Lb/i/b/a/c/g/d;
      //   1231: goto +15 -> 1246
      //   1234: astore_1
      //   1235: aload_0
      //   1236: aload 13
      //   1238: invokevirtual 160	b/i/b/a/c/g/d$b:a	()Lb/i/b/a/c/g/d;
      //   1241: putfield 64	b/i/b/a/c/e/b/a$c:h	Lb/i/b/a/c/g/d;
      //   1244: aload_1
      //   1245: athrow
      //   1246: aload_0
      //   1247: invokevirtual 163	b/i/b/a/c/e/b/a$c:w	()V
      //   1250: return
      //   1251: astore_2
      //   1252: goto -167 -> 1085
      //   1255: astore_1
      //   1256: goto -34 -> 1222
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1259	0	this	c
      //   0	1259	1	parame	b.i.b.a.c.g.e
      //   0	1259	2	paramg	b.i.b.a.c.g.g
      //   45	1156	3	i1	int
      //   52	1012	4	i2	int
      //   55	897	5	i3	int
      //   58	910	6	i4	int
      //   64	794	7	i5	int
      //   42	875	8	i6	int
      //   233	424	9	i7	int
      //   169	486	10	i8	int
      //   358	550	11	localObject1	Object
      //   379	477	12	localObject2	Object
      //   31	1206	13	localb	b.i.b.a.c.g.d.b
      //   39	1179	14	localf	f
      // Exception table:
      //   from	to	target	type
      //   60	66	921	finally
      //   136	149	921	finally
      //   161	171	921	finally
      //   195	202	921	finally
      //   211	222	921	finally
      //   247	254	921	finally
      //   266	283	921	finally
      //   295	301	921	finally
      //   325	336	921	finally
      //   354	360	921	finally
      //   372	381	921	finally
      //   393	403	921	finally
      //   415	421	921	finally
      //   442	453	921	finally
      //   471	477	921	finally
      //   489	498	921	finally
      //   510	516	921	finally
      //   537	548	921	finally
      //   566	572	921	finally
      //   587	597	921	finally
      //   619	626	921	finally
      //   635	646	921	finally
      //   670	677	921	finally
      //   689	706	921	finally
      //   728	739	921	finally
      //   756	762	921	finally
      //   774	783	921	finally
      //   798	804	921	finally
      //   823	834	921	finally
      //   851	857	921	finally
      //   872	878	921	finally
      //   887	897	921	finally
      //   906	912	921	finally
      //   930	942	921	finally
      //   946	951	921	finally
      //   955	957	921	finally
      //   962	967	921	finally
      //   971	973	921	finally
      //   60	66	925	java/io/IOException
      //   136	149	925	java/io/IOException
      //   161	171	925	java/io/IOException
      //   195	202	925	java/io/IOException
      //   211	222	925	java/io/IOException
      //   247	254	925	java/io/IOException
      //   266	283	925	java/io/IOException
      //   295	301	925	java/io/IOException
      //   325	336	925	java/io/IOException
      //   354	360	925	java/io/IOException
      //   372	381	925	java/io/IOException
      //   393	403	925	java/io/IOException
      //   415	421	925	java/io/IOException
      //   442	453	925	java/io/IOException
      //   471	477	925	java/io/IOException
      //   489	498	925	java/io/IOException
      //   510	516	925	java/io/IOException
      //   537	548	925	java/io/IOException
      //   566	572	925	java/io/IOException
      //   587	597	925	java/io/IOException
      //   619	626	925	java/io/IOException
      //   635	646	925	java/io/IOException
      //   670	677	925	java/io/IOException
      //   689	706	925	java/io/IOException
      //   728	739	925	java/io/IOException
      //   756	762	925	java/io/IOException
      //   774	783	925	java/io/IOException
      //   798	804	925	java/io/IOException
      //   823	834	925	java/io/IOException
      //   851	857	925	java/io/IOException
      //   872	878	925	java/io/IOException
      //   887	897	925	java/io/IOException
      //   906	912	925	java/io/IOException
      //   60	66	957	b/i/b/a/c/g/k
      //   136	149	957	b/i/b/a/c/g/k
      //   161	171	957	b/i/b/a/c/g/k
      //   195	202	957	b/i/b/a/c/g/k
      //   211	222	957	b/i/b/a/c/g/k
      //   247	254	957	b/i/b/a/c/g/k
      //   266	283	957	b/i/b/a/c/g/k
      //   295	301	957	b/i/b/a/c/g/k
      //   325	336	957	b/i/b/a/c/g/k
      //   354	360	957	b/i/b/a/c/g/k
      //   372	381	957	b/i/b/a/c/g/k
      //   393	403	957	b/i/b/a/c/g/k
      //   415	421	957	b/i/b/a/c/g/k
      //   442	453	957	b/i/b/a/c/g/k
      //   471	477	957	b/i/b/a/c/g/k
      //   489	498	957	b/i/b/a/c/g/k
      //   510	516	957	b/i/b/a/c/g/k
      //   537	548	957	b/i/b/a/c/g/k
      //   566	572	957	b/i/b/a/c/g/k
      //   587	597	957	b/i/b/a/c/g/k
      //   619	626	957	b/i/b/a/c/g/k
      //   635	646	957	b/i/b/a/c/g/k
      //   670	677	957	b/i/b/a/c/g/k
      //   689	706	957	b/i/b/a/c/g/k
      //   728	739	957	b/i/b/a/c/g/k
      //   756	762	957	b/i/b/a/c/g/k
      //   774	783	957	b/i/b/a/c/g/k
      //   798	804	957	b/i/b/a/c/g/k
      //   823	834	957	b/i/b/a/c/g/k
      //   851	857	957	b/i/b/a/c/g/k
      //   872	878	957	b/i/b/a/c/g/k
      //   887	897	957	b/i/b/a/c/g/k
      //   906	912	957	b/i/b/a/c/g/k
      //   1080	1085	1097	finally
      //   1217	1222	1234	finally
      //   1080	1085	1251	java/io/IOException
      //   1217	1222	1255	java/io/IOException
    }
    
    private c(i.a parama)
    {
      super();
      this.h = parama.a;
    }
    
    public static c a()
    {
      return g;
    }
    
    private d g()
    {
      Object localObject = this.j;
      if ((localObject instanceof String))
      {
        localObject = d.a((String)localObject);
        this.j = localObject;
        return (d)localObject;
      }
      return (d)localObject;
    }
    
    private void k()
    {
      this.j = "";
      this.b = n.a;
      this.c = Collections.emptyList();
      this.d = n.a;
      this.e = n.a;
      this.f = Collections.emptyList();
    }
    
    public final void a(f paramf)
      throws IOException
    {
      f();
      if ((this.i & 0x1) == 1) {
        paramf.a(1, g());
      }
      int i2 = 0;
      int i1 = 0;
      while (i1 < this.b.size())
      {
        paramf.a(2, this.b.a(i1));
        i1 += 1;
      }
      if (this.c.size() > 0)
      {
        paramf.e(26);
        paramf.e(this.k);
      }
      i1 = 0;
      while (i1 < this.c.size())
      {
        paramf.a(((Integer)this.c.get(i1)).intValue());
        i1 += 1;
      }
      i1 = 0;
      while (i1 < this.d.size())
      {
        paramf.a(4, this.d.a(i1));
        i1 += 1;
      }
      i1 = 0;
      while (i1 < this.e.size())
      {
        paramf.a(5, this.e.a(i1));
        i1 += 1;
      }
      i1 = i2;
      if (this.f.size() > 0)
      {
        paramf.e(50);
        paramf.e(this.l);
        i1 = i2;
      }
      while (i1 < this.f.size())
      {
        paramf.a(((Integer)this.f.get(i1)).intValue());
        i1 += 1;
      }
      paramf.c(this.h);
    }
    
    public final s<c> b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return (this.i & 0x1) == 1;
    }
    
    public final String d()
    {
      Object localObject = this.j;
      if ((localObject instanceof String)) {
        return (String)localObject;
      }
      localObject = (d)localObject;
      String str = ((d)localObject).e();
      if (((d)localObject).f()) {
        this.j = str;
      }
      return str;
    }
    
    public final boolean e()
    {
      int i1 = this.m;
      if (i1 == 1) {
        return true;
      }
      if (i1 == 0) {
        return false;
      }
      if (!c())
      {
        this.m = 0;
        return false;
      }
      this.m = 1;
      return true;
    }
    
    public final int f()
    {
      int i1 = this.n;
      if (i1 != -1) {
        return i1;
      }
      i1 = this.i;
      int i5 = 0;
      if ((i1 & 0x1) == 1) {
        i1 = f.b(1, g()) + 0;
      } else {
        i1 = 0;
      }
      int i3 = 0;
      int i2 = 0;
      while (i3 < this.b.size())
      {
        i2 += f.b(this.b.a(i3));
        i3 += 1;
      }
      int i6 = this.b.size();
      int i4 = 0;
      i3 = 0;
      while (i4 < this.c.size())
      {
        i3 += f.c(((Integer)this.c.get(i4)).intValue());
        i4 += 1;
      }
      i2 = i1 + i2 + i6 * 1 + i3;
      i1 = i2;
      if (!this.c.isEmpty()) {
        i1 = i2 + 1 + f.c(i3);
      }
      this.k = i3;
      i3 = 0;
      i2 = 0;
      while (i3 < this.d.size())
      {
        i2 += f.b(this.d.a(i3));
        i3 += 1;
      }
      i6 = this.d.size();
      i4 = 0;
      i3 = 0;
      while (i4 < this.e.size())
      {
        i3 += f.b(this.e.a(i4));
        i4 += 1;
      }
      int i7 = this.e.size();
      i4 = 0;
      while (i5 < this.f.size())
      {
        i4 += f.c(((Integer)this.f.get(i5)).intValue());
        i5 += 1;
      }
      i2 = i1 + i2 + i6 * 1 + i3 + i7 * 1 + i4;
      i1 = i2;
      if (!this.f.isEmpty()) {
        i1 = i2 + 1 + f.c(i4);
      }
      this.l = i4;
      i1 += this.h.a();
      this.n = i1;
      return i1;
    }
    
    public static final class a
      extends i.a<a.c, a>
      implements a.d
    {
      private int b;
      private Object c = "";
      private o d = n.a;
      private List<Integer> e = Collections.emptyList();
      private o f = n.a;
      private o g = n.a;
      private List<Integer> h = Collections.emptyList();
      
      /* Error */
      private a c(b.i.b.a.c.g.e parame, b.i.b.a.c.g.g paramg)
        throws IOException
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: getstatic 61	b/i/b/a/c/e/b/a$c:a	Lb/i/b/a/c/g/s;
        //   5: aload_1
        //   6: aload_2
        //   7: invokeinterface 66 3 0
        //   12: checkcast 9	b/i/b/a/c/e/b/a$c
        //   15: astore_1
        //   16: aload_0
        //   17: aload_1
        //   18: invokevirtual 69	b/i/b/a/c/e/b/a$c$a:a	(Lb/i/b/a/c/e/b/a$c;)Lb/i/b/a/c/e/b/a$c$a;
        //   21: pop
        //   22: aload_0
        //   23: areturn
        //   24: astore_2
        //   25: aload_3
        //   26: astore_1
        //   27: goto +15 -> 42
        //   30: astore_2
        //   31: aload_2
        //   32: getfield 72	b/i/b/a/c/g/k:a	Lb/i/b/a/c/g/q;
        //   35: checkcast 9	b/i/b/a/c/e/b/a$c
        //   38: astore_1
        //   39: aload_2
        //   40: athrow
        //   41: astore_2
        //   42: aload_1
        //   43: ifnull +9 -> 52
        //   46: aload_0
        //   47: aload_1
        //   48: invokevirtual 69	b/i/b/a/c/e/b/a$c$a:a	(Lb/i/b/a/c/e/b/a$c;)Lb/i/b/a/c/e/b/a$c$a;
        //   51: pop
        //   52: aload_2
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	parame	b.i.b.a.c.g.e
        //   0	54	2	paramg	b.i.b.a.c.g.g
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
      
      private a.c h()
      {
        int i = 0;
        a.c localc = new a.c(this, (byte)0);
        if ((this.b & 0x1) == 1) {
          i = 1;
        }
        a.c.a(localc, this.c);
        if ((this.b & 0x2) == 2)
        {
          this.d = this.d.b();
          this.b &= 0xFFFFFFFD;
        }
        a.c.a(localc, this.d);
        if ((this.b & 0x4) == 4)
        {
          this.e = Collections.unmodifiableList(this.e);
          this.b &= 0xFFFFFFFB;
        }
        a.c.a(localc, this.e);
        if ((this.b & 0x8) == 8)
        {
          this.f = this.f.b();
          this.b &= 0xFFFFFFF7;
        }
        a.c.b(localc, this.f);
        if ((this.b & 0x10) == 16)
        {
          this.g = this.g.b();
          this.b &= 0xFFFFFFEF;
        }
        a.c.c(localc, this.g);
        if ((this.b & 0x20) == 32)
        {
          this.h = Collections.unmodifiableList(this.h);
          this.b &= 0xFFFFFFDF;
        }
        a.c.b(localc, this.h);
        a.c.a(localc, i);
        return localc;
      }
      
      private void i()
      {
        if ((this.b & 0x2) != 2)
        {
          this.d = new n(this.d);
          this.b |= 0x2;
        }
      }
      
      private void k()
      {
        if ((this.b & 0x4) != 4)
        {
          this.e = new ArrayList(this.e);
          this.b |= 0x4;
        }
      }
      
      private void l()
      {
        if ((this.b & 0x8) != 8)
        {
          this.f = new n(this.f);
          this.b |= 0x8;
        }
      }
      
      private void m()
      {
        if ((this.b & 0x10) != 16)
        {
          this.g = new n(this.g);
          this.b |= 0x10;
        }
      }
      
      private void n()
      {
        if ((this.b & 0x20) != 32)
        {
          this.h = new ArrayList(this.h);
          this.b |= 0x20;
        }
      }
      
      public final a a(a.c paramc)
      {
        if (paramc == a.c.a()) {
          return this;
        }
        if (paramc.c())
        {
          this.b |= 0x1;
          this.c = a.c.a(paramc);
        }
        if (!a.c.b(paramc).isEmpty()) {
          if (this.d.isEmpty())
          {
            this.d = a.c.b(paramc);
            this.b &= 0xFFFFFFFD;
          }
          else
          {
            i();
            this.d.addAll(a.c.b(paramc));
          }
        }
        if (!a.c.c(paramc).isEmpty()) {
          if (this.e.isEmpty())
          {
            this.e = a.c.c(paramc);
            this.b &= 0xFFFFFFFB;
          }
          else
          {
            k();
            this.e.addAll(a.c.c(paramc));
          }
        }
        if (!a.c.d(paramc).isEmpty()) {
          if (this.f.isEmpty())
          {
            this.f = a.c.d(paramc);
            this.b &= 0xFFFFFFF7;
          }
          else
          {
            l();
            this.f.addAll(a.c.d(paramc));
          }
        }
        if (!a.c.e(paramc).isEmpty()) {
          if (this.g.isEmpty())
          {
            this.g = a.c.e(paramc);
            this.b &= 0xFFFFFFEF;
          }
          else
          {
            m();
            this.g.addAll(a.c.e(paramc));
          }
        }
        if (!a.c.f(paramc).isEmpty()) {
          if (this.h.isEmpty())
          {
            this.h = a.c.f(paramc);
            this.b &= 0xFFFFFFDF;
          }
          else
          {
            n();
            this.h.addAll(a.c.f(paramc));
          }
        }
        this.a = this.a.a(a.c.g(paramc));
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
        return i != 0;
      }
    }
  }
  
  public static abstract interface d
    extends r
  {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
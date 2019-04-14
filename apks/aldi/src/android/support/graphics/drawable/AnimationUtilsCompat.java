package android.support.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.annotation.RestrictTo;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class AnimationUtilsCompat
{
  private static Interpolator createInterpolatorFromXml(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    int i = paramXmlPullParser.getDepth();
    paramResources = null;
    for (;;)
    {
      int j = paramXmlPullParser.next();
      if (((j == 3) && (paramXmlPullParser.getDepth() <= i)) || (j == 1)) {
        return paramResources;
      }
      if (j == 2)
      {
        paramResources = Xml.asAttributeSet(paramXmlPullParser);
        paramTheme = paramXmlPullParser.getName();
        if (!paramTheme.equals("linearInterpolator")) {
          break;
        }
        paramResources = new LinearInterpolator();
      }
    }
    if (paramTheme.equals("accelerateInterpolator")) {
      paramResources = new AccelerateInterpolator(paramContext, paramResources);
    }
    for (;;)
    {
      break;
      if (paramTheme.equals("decelerateInterpolator"))
      {
        paramResources = new DecelerateInterpolator(paramContext, paramResources);
      }
      else
      {
        if (paramTheme.equals("accelerateDecelerateInterpolator"))
        {
          paramResources = new AccelerateDecelerateInterpolator();
          break;
        }
        if (paramTheme.equals("cycleInterpolator"))
        {
          paramResources = new CycleInterpolator(paramContext, paramResources);
        }
        else if (paramTheme.equals("anticipateInterpolator"))
        {
          paramResources = new AnticipateInterpolator(paramContext, paramResources);
        }
        else if (paramTheme.equals("overshootInterpolator"))
        {
          paramResources = new OvershootInterpolator(paramContext, paramResources);
        }
        else if (paramTheme.equals("anticipateOvershootInterpolator"))
        {
          paramResources = new AnticipateOvershootInterpolator(paramContext, paramResources);
        }
        else
        {
          if (paramTheme.equals("bounceInterpolator"))
          {
            paramResources = new BounceInterpolator();
            break;
          }
          if (!paramTheme.equals("pathInterpolator")) {
            break label274;
          }
          paramResources = new PathInterpolatorCompat(paramContext, paramResources, paramXmlPullParser);
        }
      }
    }
    label274:
    paramContext = new StringBuilder("Unknown interpolator name: ");
    paramContext.append(paramXmlPullParser.getName());
    throw new RuntimeException(paramContext.toString());
    return paramResources;
  }
  
  /* Error */
  public static Interpolator loadInterpolator(Context paramContext, int paramInt)
    throws android.content.res.Resources.NotFoundException
  {
    // Byte code:
    //   0: getstatic 126	android/os/Build$VERSION:SDK_INT	I
    //   3: bipush 21
    //   5: if_icmplt +9 -> 14
    //   8: aload_0
    //   9: iload_1
    //   10: invokestatic 130	android/view/animation/AnimationUtils:loadInterpolator	(Landroid/content/Context;I)Landroid/view/animation/Interpolator;
    //   13: areturn
    //   14: aconst_null
    //   15: astore 5
    //   17: aconst_null
    //   18: astore_2
    //   19: aconst_null
    //   20: astore 4
    //   22: iload_1
    //   23: ldc -125
    //   25: if_icmpne +11 -> 36
    //   28: new 133	android/support/v4/view/animation/FastOutLinearInInterpolator
    //   31: dup
    //   32: invokespecial 134	android/support/v4/view/animation/FastOutLinearInInterpolator:<init>	()V
    //   35: areturn
    //   36: iload_1
    //   37: ldc -121
    //   39: if_icmpne +11 -> 50
    //   42: new 137	android/support/v4/view/animation/FastOutSlowInInterpolator
    //   45: dup
    //   46: invokespecial 138	android/support/v4/view/animation/FastOutSlowInInterpolator:<init>	()V
    //   49: areturn
    //   50: iload_1
    //   51: ldc -117
    //   53: if_icmpne +11 -> 64
    //   56: new 141	android/support/v4/view/animation/LinearOutSlowInInterpolator
    //   59: dup
    //   60: invokespecial 142	android/support/v4/view/animation/LinearOutSlowInInterpolator:<init>	()V
    //   63: areturn
    //   64: aload_0
    //   65: invokevirtual 148	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   68: iload_1
    //   69: invokevirtual 154	android/content/res/Resources:getAnimation	(I)Landroid/content/res/XmlResourceParser;
    //   72: astore_3
    //   73: aload_0
    //   74: aload_0
    //   75: invokevirtual 148	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   78: aload_0
    //   79: invokevirtual 158	android/content/Context:getTheme	()Landroid/content/res/Resources$Theme;
    //   82: aload_3
    //   83: invokestatic 160	android/support/graphics/drawable/AnimationUtilsCompat:createInterpolatorFromXml	(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)Landroid/view/animation/Interpolator;
    //   86: astore_0
    //   87: aload_3
    //   88: ifnull +9 -> 97
    //   91: aload_3
    //   92: invokeinterface 165 1 0
    //   97: aload_0
    //   98: areturn
    //   99: astore_0
    //   100: aload_3
    //   101: astore_2
    //   102: goto +129 -> 231
    //   105: astore_2
    //   106: aload_3
    //   107: astore_0
    //   108: aload_2
    //   109: astore_3
    //   110: goto +11 -> 121
    //   113: astore_2
    //   114: aload_3
    //   115: astore_0
    //   116: aload_2
    //   117: astore_3
    //   118: goto +58 -> 176
    //   121: aload_0
    //   122: astore_2
    //   123: new 100	java/lang/StringBuilder
    //   126: dup
    //   127: ldc -89
    //   129: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   132: astore 4
    //   134: aload_0
    //   135: astore_2
    //   136: aload 4
    //   138: iload_1
    //   139: invokestatic 173	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   142: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aload_0
    //   147: astore_2
    //   148: new 120	android/content/res/Resources$NotFoundException
    //   151: dup
    //   152: aload 4
    //   154: invokevirtual 114	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: invokespecial 174	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   160: astore 4
    //   162: aload_0
    //   163: astore_2
    //   164: aload 4
    //   166: aload_3
    //   167: invokevirtual 178	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   170: pop
    //   171: aload_0
    //   172: astore_2
    //   173: aload 4
    //   175: athrow
    //   176: aload_0
    //   177: astore_2
    //   178: new 100	java/lang/StringBuilder
    //   181: dup
    //   182: ldc -89
    //   184: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   187: astore 4
    //   189: aload_0
    //   190: astore_2
    //   191: aload 4
    //   193: iload_1
    //   194: invokestatic 173	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   197: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: pop
    //   201: aload_0
    //   202: astore_2
    //   203: new 120	android/content/res/Resources$NotFoundException
    //   206: dup
    //   207: aload 4
    //   209: invokevirtual 114	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: invokespecial 174	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   215: astore 4
    //   217: aload_0
    //   218: astore_2
    //   219: aload 4
    //   221: aload_3
    //   222: invokevirtual 178	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   225: pop
    //   226: aload_0
    //   227: astore_2
    //   228: aload 4
    //   230: athrow
    //   231: aload_2
    //   232: ifnull +9 -> 241
    //   235: aload_2
    //   236: invokeinterface 165 1 0
    //   241: aload_0
    //   242: athrow
    //   243: astore_0
    //   244: goto -13 -> 231
    //   247: astore_3
    //   248: aload 4
    //   250: astore_0
    //   251: goto -130 -> 121
    //   254: astore_3
    //   255: aload 5
    //   257: astore_0
    //   258: goto -82 -> 176
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	261	0	paramContext	Context
    //   0	261	1	paramInt	int
    //   18	84	2	localObject1	Object
    //   105	4	2	localIOException1	IOException
    //   113	4	2	localXmlPullParserException1	XmlPullParserException
    //   122	114	2	localContext	Context
    //   72	150	3	localObject2	Object
    //   247	1	3	localIOException2	IOException
    //   254	1	3	localXmlPullParserException2	XmlPullParserException
    //   20	229	4	localObject3	Object
    //   15	241	5	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   73	87	99	finally
    //   73	87	105	java/io/IOException
    //   73	87	113	org/xmlpull/v1/XmlPullParserException
    //   28	36	243	finally
    //   42	50	243	finally
    //   56	64	243	finally
    //   64	73	243	finally
    //   123	134	243	finally
    //   136	146	243	finally
    //   148	162	243	finally
    //   164	171	243	finally
    //   173	176	243	finally
    //   178	189	243	finally
    //   191	201	243	finally
    //   203	217	243	finally
    //   219	226	243	finally
    //   228	231	243	finally
    //   28	36	247	java/io/IOException
    //   42	50	247	java/io/IOException
    //   56	64	247	java/io/IOException
    //   64	73	247	java/io/IOException
    //   28	36	254	org/xmlpull/v1/XmlPullParserException
    //   42	50	254	org/xmlpull/v1/XmlPullParserException
    //   56	64	254	org/xmlpull/v1/XmlPullParserException
    //   64	73	254	org/xmlpull/v1/XmlPullParserException
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/graphics/drawable/AnimationUtilsCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
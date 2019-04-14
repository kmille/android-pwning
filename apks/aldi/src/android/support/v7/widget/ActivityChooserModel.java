package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ActivityChooserModel
  extends DataSetObservable
{
  static final String ATTRIBUTE_ACTIVITY = "activity";
  static final String ATTRIBUTE_TIME = "time";
  static final String ATTRIBUTE_WEIGHT = "weight";
  static final boolean DEBUG = false;
  private static final int DEFAULT_ACTIVITY_INFLATION = 5;
  private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1.0F;
  public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
  public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
  private static final String HISTORY_FILE_EXTENSION = ".xml";
  private static final int INVALID_INDEX = -1;
  static final String LOG_TAG = "ActivityChooserModel";
  static final String TAG_HISTORICAL_RECORD = "historical-record";
  static final String TAG_HISTORICAL_RECORDS = "historical-records";
  private static final Map<String, ActivityChooserModel> sDataModelRegistry = new HashMap();
  private static final Object sRegistryLock = new Object();
  private final List<ActivityResolveInfo> mActivities = new ArrayList();
  private OnChooseActivityListener mActivityChoserModelPolicy;
  private ActivitySorter mActivitySorter = new DefaultSorter();
  boolean mCanReadHistoricalData = true;
  final Context mContext;
  private final List<HistoricalRecord> mHistoricalRecords = new ArrayList();
  private boolean mHistoricalRecordsChanged = true;
  final String mHistoryFileName;
  private int mHistoryMaxSize = 50;
  private final Object mInstanceLock = new Object();
  private Intent mIntent;
  private boolean mReadShareHistoryCalled = false;
  private boolean mReloadActivities = false;
  
  private ActivityChooserModel(Context paramContext, String paramString)
  {
    this.mContext = paramContext.getApplicationContext();
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.endsWith(".xml")))
    {
      paramContext = new StringBuilder();
      paramContext.append(paramString);
      paramContext.append(".xml");
      this.mHistoryFileName = paramContext.toString();
      return;
    }
    this.mHistoryFileName = paramString;
  }
  
  private boolean addHistoricalRecord(HistoricalRecord paramHistoricalRecord)
  {
    boolean bool = this.mHistoricalRecords.add(paramHistoricalRecord);
    if (bool)
    {
      this.mHistoricalRecordsChanged = true;
      pruneExcessiveHistoricalRecordsIfNeeded();
      persistHistoricalDataIfNeeded();
      sortActivitiesIfNeeded();
      notifyChanged();
    }
    return bool;
  }
  
  private void ensureConsistentState()
  {
    boolean bool1 = loadActivitiesIfNeeded();
    boolean bool2 = readHistoricalDataIfNeeded();
    pruneExcessiveHistoricalRecordsIfNeeded();
    if ((bool1 | bool2))
    {
      sortActivitiesIfNeeded();
      notifyChanged();
    }
  }
  
  public static ActivityChooserModel get(Context paramContext, String paramString)
  {
    synchronized (sRegistryLock)
    {
      ActivityChooserModel localActivityChooserModel2 = (ActivityChooserModel)sDataModelRegistry.get(paramString);
      ActivityChooserModel localActivityChooserModel1 = localActivityChooserModel2;
      if (localActivityChooserModel2 == null)
      {
        localActivityChooserModel1 = new ActivityChooserModel(paramContext, paramString);
        sDataModelRegistry.put(paramString, localActivityChooserModel1);
      }
      return localActivityChooserModel1;
    }
  }
  
  private boolean loadActivitiesIfNeeded()
  {
    boolean bool = this.mReloadActivities;
    int i = 0;
    if ((bool) && (this.mIntent != null))
    {
      this.mReloadActivities = false;
      this.mActivities.clear();
      List localList = this.mContext.getPackageManager().queryIntentActivities(this.mIntent, 0);
      int j = localList.size();
      while (i < j)
      {
        ResolveInfo localResolveInfo = (ResolveInfo)localList.get(i);
        this.mActivities.add(new ActivityResolveInfo(localResolveInfo));
        i += 1;
      }
      return true;
    }
    return false;
  }
  
  private void persistHistoricalDataIfNeeded()
  {
    if (this.mReadShareHistoryCalled)
    {
      if (!this.mHistoricalRecordsChanged) {
        return;
      }
      this.mHistoricalRecordsChanged = false;
      if (!TextUtils.isEmpty(this.mHistoryFileName)) {
        new PersistHistoryAsyncTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] { new ArrayList(this.mHistoricalRecords), this.mHistoryFileName });
      }
      return;
    }
    throw new IllegalStateException("No preceding call to #readHistoricalData");
  }
  
  private void pruneExcessiveHistoricalRecordsIfNeeded()
  {
    int j = this.mHistoricalRecords.size() - this.mHistoryMaxSize;
    if (j <= 0) {
      return;
    }
    this.mHistoricalRecordsChanged = true;
    int i = 0;
    while (i < j)
    {
      this.mHistoricalRecords.remove(0);
      i += 1;
    }
  }
  
  private boolean readHistoricalDataIfNeeded()
  {
    if ((this.mCanReadHistoricalData) && (this.mHistoricalRecordsChanged) && (!TextUtils.isEmpty(this.mHistoryFileName)))
    {
      this.mCanReadHistoricalData = false;
      this.mReadShareHistoryCalled = true;
      readHistoricalDataImpl();
      return true;
    }
    return false;
  }
  
  /* Error */
  private void readHistoricalDataImpl()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 135	android/support/v7/widget/ActivityChooserModel:mContext	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 160	android/support/v7/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   8: invokevirtual 267	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_2
    //   12: invokestatic 273	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore_3
    //   16: aload_3
    //   17: aload_2
    //   18: ldc_w 275
    //   21: invokeinterface 281 3 0
    //   26: iconst_0
    //   27: istore_1
    //   28: iload_1
    //   29: iconst_1
    //   30: if_icmpeq +18 -> 48
    //   33: iload_1
    //   34: iconst_2
    //   35: if_icmpeq +13 -> 48
    //   38: aload_3
    //   39: invokeinterface 284 1 0
    //   44: istore_1
    //   45: goto -17 -> 28
    //   48: ldc 63
    //   50: aload_3
    //   51: invokeinterface 287 1 0
    //   56: invokevirtual 290	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   59: ifeq +123 -> 182
    //   62: aload_0
    //   63: getfield 114	android/support/v7/widget/ActivityChooserModel:mHistoricalRecords	Ljava/util/List;
    //   66: astore 4
    //   68: aload 4
    //   70: invokeinterface 206 1 0
    //   75: aload_3
    //   76: invokeinterface 284 1 0
    //   81: istore_1
    //   82: iload_1
    //   83: iconst_1
    //   84: if_icmpeq +89 -> 173
    //   87: iload_1
    //   88: iconst_3
    //   89: if_icmpeq -14 -> 75
    //   92: iload_1
    //   93: iconst_4
    //   94: if_icmpeq -19 -> 75
    //   97: ldc 60
    //   99: aload_3
    //   100: invokeinterface 287 1 0
    //   105: invokevirtual 290	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   108: ifeq +54 -> 162
    //   111: aload 4
    //   113: new 18	android/support/v7/widget/ActivityChooserModel$HistoricalRecord
    //   116: dup
    //   117: aload_3
    //   118: aconst_null
    //   119: ldc 29
    //   121: invokeinterface 294 3 0
    //   126: aload_3
    //   127: aconst_null
    //   128: ldc 32
    //   130: invokeinterface 294 3 0
    //   135: invokestatic 300	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   138: aload_3
    //   139: aconst_null
    //   140: ldc 35
    //   142: invokeinterface 294 3 0
    //   147: invokestatic 306	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   150: invokespecial 309	android/support/v7/widget/ActivityChooserModel$HistoricalRecord:<init>	(Ljava/lang/String;JF)V
    //   153: invokeinterface 168 2 0
    //   158: pop
    //   159: goto -84 -> 75
    //   162: new 261	org/xmlpull/v1/XmlPullParserException
    //   165: dup
    //   166: ldc_w 311
    //   169: invokespecial 312	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   172: athrow
    //   173: aload_2
    //   174: ifnull +120 -> 294
    //   177: aload_2
    //   178: invokevirtual 317	java/io/FileInputStream:close	()V
    //   181: return
    //   182: new 261	org/xmlpull/v1/XmlPullParserException
    //   185: dup
    //   186: ldc_w 319
    //   189: invokespecial 312	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   192: athrow
    //   193: astore_3
    //   194: goto +101 -> 295
    //   197: astore_3
    //   198: getstatic 321	android/support/v7/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
    //   201: astore 4
    //   203: new 149	java/lang/StringBuilder
    //   206: dup
    //   207: ldc_w 323
    //   210: invokespecial 324	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   213: astore 5
    //   215: aload 5
    //   217: aload_0
    //   218: getfield 160	android/support/v7/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   221: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: pop
    //   225: aload 4
    //   227: aload 5
    //   229: invokevirtual 158	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   232: aload_3
    //   233: invokestatic 330	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   236: pop
    //   237: aload_2
    //   238: ifnull +56 -> 294
    //   241: aload_2
    //   242: invokevirtual 317	java/io/FileInputStream:close	()V
    //   245: return
    //   246: astore_3
    //   247: getstatic 321	android/support/v7/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
    //   250: astore 4
    //   252: new 149	java/lang/StringBuilder
    //   255: dup
    //   256: ldc_w 323
    //   259: invokespecial 324	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   262: astore 5
    //   264: aload 5
    //   266: aload_0
    //   267: getfield 160	android/support/v7/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   270: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: pop
    //   274: aload 4
    //   276: aload 5
    //   278: invokevirtual 158	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   281: aload_3
    //   282: invokestatic 330	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   285: pop
    //   286: aload_2
    //   287: ifnull +7 -> 294
    //   290: aload_2
    //   291: invokevirtual 317	java/io/FileInputStream:close	()V
    //   294: return
    //   295: aload_2
    //   296: ifnull +7 -> 303
    //   299: aload_2
    //   300: invokevirtual 317	java/io/FileInputStream:close	()V
    //   303: aload_3
    //   304: athrow
    //   305: astore_2
    //   306: return
    //   307: astore_2
    //   308: return
    //   309: astore_2
    //   310: return
    //   311: astore_2
    //   312: return
    //   313: astore_2
    //   314: goto -11 -> 303
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	317	0	this	ActivityChooserModel
    //   27	68	1	i	int
    //   11	289	2	localFileInputStream	java.io.FileInputStream
    //   305	1	2	localFileNotFoundException	java.io.FileNotFoundException
    //   307	1	2	localIOException1	java.io.IOException
    //   309	1	2	localIOException2	java.io.IOException
    //   311	1	2	localIOException3	java.io.IOException
    //   313	1	2	localIOException4	java.io.IOException
    //   15	124	3	localXmlPullParser	org.xmlpull.v1.XmlPullParser
    //   193	1	3	localObject1	Object
    //   197	36	3	localIOException5	java.io.IOException
    //   246	58	3	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   66	209	4	localObject2	Object
    //   213	64	5	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   12	26	193	finally
    //   38	45	193	finally
    //   48	75	193	finally
    //   75	82	193	finally
    //   97	159	193	finally
    //   162	173	193	finally
    //   182	193	193	finally
    //   198	237	193	finally
    //   247	286	193	finally
    //   12	26	197	java/io/IOException
    //   38	45	197	java/io/IOException
    //   48	75	197	java/io/IOException
    //   75	82	197	java/io/IOException
    //   97	159	197	java/io/IOException
    //   162	173	197	java/io/IOException
    //   182	193	197	java/io/IOException
    //   12	26	246	org/xmlpull/v1/XmlPullParserException
    //   38	45	246	org/xmlpull/v1/XmlPullParserException
    //   48	75	246	org/xmlpull/v1/XmlPullParserException
    //   75	82	246	org/xmlpull/v1/XmlPullParserException
    //   97	159	246	org/xmlpull/v1/XmlPullParserException
    //   162	173	246	org/xmlpull/v1/XmlPullParserException
    //   182	193	246	org/xmlpull/v1/XmlPullParserException
    //   0	12	305	java/io/FileNotFoundException
    //   177	181	307	java/io/IOException
    //   241	245	309	java/io/IOException
    //   290	294	311	java/io/IOException
    //   299	303	313	java/io/IOException
  }
  
  private boolean sortActivitiesIfNeeded()
  {
    if ((this.mActivitySorter != null) && (this.mIntent != null) && (!this.mActivities.isEmpty()) && (!this.mHistoricalRecords.isEmpty()))
    {
      this.mActivitySorter.sort(this.mIntent, this.mActivities, Collections.unmodifiableList(this.mHistoricalRecords));
      return true;
    }
    return false;
  }
  
  public Intent chooseActivity(int paramInt)
  {
    synchronized (this.mInstanceLock)
    {
      if (this.mIntent == null) {
        return null;
      }
      ensureConsistentState();
      Object localObject2 = (ActivityResolveInfo)this.mActivities.get(paramInt);
      localObject2 = new ComponentName(((ActivityResolveInfo)localObject2).resolveInfo.activityInfo.packageName, ((ActivityResolveInfo)localObject2).resolveInfo.activityInfo.name);
      Intent localIntent1 = new Intent(this.mIntent);
      localIntent1.setComponent((ComponentName)localObject2);
      if (this.mActivityChoserModelPolicy != null)
      {
        Intent localIntent2 = new Intent(localIntent1);
        if (this.mActivityChoserModelPolicy.onChooseActivity(this, localIntent2)) {
          return null;
        }
      }
      addHistoricalRecord(new HistoricalRecord((ComponentName)localObject2, System.currentTimeMillis(), 1.0F));
      return localIntent1;
    }
  }
  
  public ResolveInfo getActivity(int paramInt)
  {
    synchronized (this.mInstanceLock)
    {
      ensureConsistentState();
      ResolveInfo localResolveInfo = ((ActivityResolveInfo)this.mActivities.get(paramInt)).resolveInfo;
      return localResolveInfo;
    }
  }
  
  public int getActivityCount()
  {
    synchronized (this.mInstanceLock)
    {
      ensureConsistentState();
      int i = this.mActivities.size();
      return i;
    }
  }
  
  public int getActivityIndex(ResolveInfo paramResolveInfo)
  {
    for (;;)
    {
      int i;
      synchronized (this.mInstanceLock)
      {
        ensureConsistentState();
        List localList = this.mActivities;
        int j = localList.size();
        i = 0;
        if (i < j)
        {
          if (((ActivityResolveInfo)localList.get(i)).resolveInfo == paramResolveInfo) {
            return i;
          }
        }
        else {
          return -1;
        }
      }
      i += 1;
    }
  }
  
  public ResolveInfo getDefaultActivity()
  {
    synchronized (this.mInstanceLock)
    {
      ensureConsistentState();
      if (!this.mActivities.isEmpty())
      {
        ResolveInfo localResolveInfo = ((ActivityResolveInfo)this.mActivities.get(0)).resolveInfo;
        return localResolveInfo;
      }
      return null;
    }
  }
  
  public int getHistoryMaxSize()
  {
    synchronized (this.mInstanceLock)
    {
      int i = this.mHistoryMaxSize;
      return i;
    }
  }
  
  public int getHistorySize()
  {
    synchronized (this.mInstanceLock)
    {
      ensureConsistentState();
      int i = this.mHistoricalRecords.size();
      return i;
    }
  }
  
  public Intent getIntent()
  {
    synchronized (this.mInstanceLock)
    {
      Intent localIntent = this.mIntent;
      return localIntent;
    }
  }
  
  public void setActivitySorter(ActivitySorter paramActivitySorter)
  {
    synchronized (this.mInstanceLock)
    {
      if (this.mActivitySorter == paramActivitySorter) {
        return;
      }
      this.mActivitySorter = paramActivitySorter;
      if (sortActivitiesIfNeeded()) {
        notifyChanged();
      }
      return;
    }
  }
  
  public void setDefaultActivity(int paramInt)
  {
    for (;;)
    {
      synchronized (this.mInstanceLock)
      {
        ensureConsistentState();
        ActivityResolveInfo localActivityResolveInfo1 = (ActivityResolveInfo)this.mActivities.get(paramInt);
        ActivityResolveInfo localActivityResolveInfo2 = (ActivityResolveInfo)this.mActivities.get(0);
        if (localActivityResolveInfo2 != null)
        {
          f = localActivityResolveInfo2.weight - localActivityResolveInfo1.weight + 5.0F;
          addHistoricalRecord(new HistoricalRecord(new ComponentName(localActivityResolveInfo1.resolveInfo.activityInfo.packageName, localActivityResolveInfo1.resolveInfo.activityInfo.name), System.currentTimeMillis(), f));
          return;
        }
      }
      float f = 1.0F;
    }
  }
  
  public void setHistoryMaxSize(int paramInt)
  {
    synchronized (this.mInstanceLock)
    {
      if (this.mHistoryMaxSize == paramInt) {
        return;
      }
      this.mHistoryMaxSize = paramInt;
      pruneExcessiveHistoricalRecordsIfNeeded();
      if (sortActivitiesIfNeeded()) {
        notifyChanged();
      }
      return;
    }
  }
  
  public void setIntent(Intent paramIntent)
  {
    synchronized (this.mInstanceLock)
    {
      if (this.mIntent == paramIntent) {
        return;
      }
      this.mIntent = paramIntent;
      this.mReloadActivities = true;
      ensureConsistentState();
      return;
    }
  }
  
  public void setOnChooseActivityListener(OnChooseActivityListener paramOnChooseActivityListener)
  {
    synchronized (this.mInstanceLock)
    {
      this.mActivityChoserModelPolicy = paramOnChooseActivityListener;
      return;
    }
  }
  
  public static abstract interface ActivityChooserModelClient
  {
    public abstract void setActivityChooserModel(ActivityChooserModel paramActivityChooserModel);
  }
  
  public static final class ActivityResolveInfo
    implements Comparable<ActivityResolveInfo>
  {
    public final ResolveInfo resolveInfo;
    public float weight;
    
    public ActivityResolveInfo(ResolveInfo paramResolveInfo)
    {
      this.resolveInfo = paramResolveInfo;
    }
    
    public final int compareTo(ActivityResolveInfo paramActivityResolveInfo)
    {
      return Float.floatToIntBits(paramActivityResolveInfo.weight) - Float.floatToIntBits(this.weight);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (paramObject == null) {
        return false;
      }
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (ActivityResolveInfo)paramObject;
      return Float.floatToIntBits(this.weight) == Float.floatToIntBits(((ActivityResolveInfo)paramObject).weight);
    }
    
    public final int hashCode()
    {
      return Float.floatToIntBits(this.weight) + 31;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[");
      localStringBuilder.append("resolveInfo:");
      localStringBuilder.append(this.resolveInfo.toString());
      localStringBuilder.append("; weight:");
      localStringBuilder.append(new BigDecimal(this.weight));
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract interface ActivitySorter
  {
    public abstract void sort(Intent paramIntent, List<ActivityChooserModel.ActivityResolveInfo> paramList, List<ActivityChooserModel.HistoricalRecord> paramList1);
  }
  
  static final class DefaultSorter
    implements ActivityChooserModel.ActivitySorter
  {
    private static final float WEIGHT_DECAY_COEFFICIENT = 0.95F;
    private final Map<ComponentName, ActivityChooserModel.ActivityResolveInfo> mPackageNameToActivityMap = new HashMap();
    
    public final void sort(Intent paramIntent, List<ActivityChooserModel.ActivityResolveInfo> paramList, List<ActivityChooserModel.HistoricalRecord> paramList1)
    {
      paramIntent = this.mPackageNameToActivityMap;
      paramIntent.clear();
      int j = paramList.size();
      int i = 0;
      Object localObject;
      while (i < j)
      {
        localObject = (ActivityChooserModel.ActivityResolveInfo)paramList.get(i);
        ((ActivityChooserModel.ActivityResolveInfo)localObject).weight = 0.0F;
        paramIntent.put(new ComponentName(((ActivityChooserModel.ActivityResolveInfo)localObject).resolveInfo.activityInfo.packageName, ((ActivityChooserModel.ActivityResolveInfo)localObject).resolveInfo.activityInfo.name), localObject);
        i += 1;
      }
      i = paramList1.size() - 1;
      float f2;
      for (float f1 = 1.0F; i >= 0; f1 = f2)
      {
        localObject = (ActivityChooserModel.HistoricalRecord)paramList1.get(i);
        ActivityChooserModel.ActivityResolveInfo localActivityResolveInfo = (ActivityChooserModel.ActivityResolveInfo)paramIntent.get(((ActivityChooserModel.HistoricalRecord)localObject).activity);
        f2 = f1;
        if (localActivityResolveInfo != null)
        {
          localActivityResolveInfo.weight += ((ActivityChooserModel.HistoricalRecord)localObject).weight * f1;
          f2 = f1 * 0.95F;
        }
        i -= 1;
      }
      Collections.sort(paramList);
    }
  }
  
  public static final class HistoricalRecord
  {
    public final ComponentName activity;
    public final long time;
    public final float weight;
    
    public HistoricalRecord(ComponentName paramComponentName, long paramLong, float paramFloat)
    {
      this.activity = paramComponentName;
      this.time = paramLong;
      this.weight = paramFloat;
    }
    
    public HistoricalRecord(String paramString, long paramLong, float paramFloat)
    {
      this(ComponentName.unflattenFromString(paramString), paramLong, paramFloat);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (paramObject == null) {
        return false;
      }
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (HistoricalRecord)paramObject;
      if (this.activity == null)
      {
        if (((HistoricalRecord)paramObject).activity != null) {
          return false;
        }
      }
      else if (!this.activity.equals(((HistoricalRecord)paramObject).activity)) {
        return false;
      }
      if (this.time != ((HistoricalRecord)paramObject).time) {
        return false;
      }
      return Float.floatToIntBits(this.weight) == Float.floatToIntBits(((HistoricalRecord)paramObject).weight);
    }
    
    public final int hashCode()
    {
      int i;
      if (this.activity == null) {
        i = 0;
      } else {
        i = this.activity.hashCode();
      }
      return ((i + 31) * 31 + (int)(this.time ^ this.time >>> 32)) * 31 + Float.floatToIntBits(this.weight);
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[");
      localStringBuilder.append("; activity:");
      localStringBuilder.append(this.activity);
      localStringBuilder.append("; time:");
      localStringBuilder.append(this.time);
      localStringBuilder.append("; weight:");
      localStringBuilder.append(new BigDecimal(this.weight));
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract interface OnChooseActivityListener
  {
    public abstract boolean onChooseActivity(ActivityChooserModel paramActivityChooserModel, Intent paramIntent);
  }
  
  final class PersistHistoryAsyncTask
    extends AsyncTask<Object, Void, Void>
  {
    PersistHistoryAsyncTask() {}
    
    /* Error */
    public final Void doInBackground(Object... paramVarArgs)
    {
      // Byte code:
      //   0: aload_1
      //   1: iconst_0
      //   2: aaload
      //   3: checkcast 33	java/util/List
      //   6: astore 4
      //   8: aload_1
      //   9: iconst_1
      //   10: aaload
      //   11: checkcast 35	java/lang/String
      //   14: astore 5
      //   16: aload_0
      //   17: getfield 14	android/support/v7/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroid/support/v7/widget/ActivityChooserModel;
      //   20: getfield 39	android/support/v7/widget/ActivityChooserModel:mContext	Landroid/content/Context;
      //   23: aload 5
      //   25: iconst_0
      //   26: invokevirtual 45	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
      //   29: astore_1
      //   30: invokestatic 51	android/util/Xml:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
      //   33: astore 5
      //   35: aload 5
      //   37: aload_1
      //   38: aconst_null
      //   39: invokeinterface 57 3 0
      //   44: aload 5
      //   46: ldc 59
      //   48: getstatic 65	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
      //   51: invokeinterface 69 3 0
      //   56: aload 5
      //   58: aconst_null
      //   59: ldc 71
      //   61: invokeinterface 75 3 0
      //   66: pop
      //   67: aload 4
      //   69: invokeinterface 79 1 0
      //   74: istore_3
      //   75: iconst_0
      //   76: istore_2
      //   77: iload_2
      //   78: iload_3
      //   79: if_icmpge +102 -> 181
      //   82: aload 4
      //   84: iconst_0
      //   85: invokeinterface 83 2 0
      //   90: checkcast 85	android/support/v7/widget/ActivityChooserModel$HistoricalRecord
      //   93: astore 6
      //   95: aload 5
      //   97: aconst_null
      //   98: ldc 87
      //   100: invokeinterface 75 3 0
      //   105: pop
      //   106: aload 5
      //   108: aconst_null
      //   109: ldc 89
      //   111: aload 6
      //   113: getfield 92	android/support/v7/widget/ActivityChooserModel$HistoricalRecord:activity	Landroid/content/ComponentName;
      //   116: invokevirtual 98	android/content/ComponentName:flattenToString	()Ljava/lang/String;
      //   119: invokeinterface 102 4 0
      //   124: pop
      //   125: aload 5
      //   127: aconst_null
      //   128: ldc 104
      //   130: aload 6
      //   132: getfield 107	android/support/v7/widget/ActivityChooserModel$HistoricalRecord:time	J
      //   135: invokestatic 111	java/lang/String:valueOf	(J)Ljava/lang/String;
      //   138: invokeinterface 102 4 0
      //   143: pop
      //   144: aload 5
      //   146: aconst_null
      //   147: ldc 113
      //   149: aload 6
      //   151: getfield 116	android/support/v7/widget/ActivityChooserModel$HistoricalRecord:weight	F
      //   154: invokestatic 119	java/lang/String:valueOf	(F)Ljava/lang/String;
      //   157: invokeinterface 102 4 0
      //   162: pop
      //   163: aload 5
      //   165: aconst_null
      //   166: ldc 87
      //   168: invokeinterface 122 3 0
      //   173: pop
      //   174: iload_2
      //   175: iconst_1
      //   176: iadd
      //   177: istore_2
      //   178: goto -101 -> 77
      //   181: aload 5
      //   183: aconst_null
      //   184: ldc 71
      //   186: invokeinterface 122 3 0
      //   191: pop
      //   192: aload 5
      //   194: invokeinterface 125 1 0
      //   199: aload_0
      //   200: getfield 14	android/support/v7/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroid/support/v7/widget/ActivityChooserModel;
      //   203: iconst_1
      //   204: putfield 129	android/support/v7/widget/ActivityChooserModel:mCanReadHistoricalData	Z
      //   207: aload_1
      //   208: ifnull +191 -> 399
      //   211: aload_1
      //   212: invokevirtual 134	java/io/FileOutputStream:close	()V
      //   215: aconst_null
      //   216: areturn
      //   217: astore 4
      //   219: goto +182 -> 401
      //   222: astore 4
      //   224: getstatic 138	android/support/v7/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
      //   227: astore 5
      //   229: new 140	java/lang/StringBuilder
      //   232: dup
      //   233: ldc -114
      //   235: invokespecial 145	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   238: astore 6
      //   240: aload 6
      //   242: aload_0
      //   243: getfield 14	android/support/v7/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroid/support/v7/widget/ActivityChooserModel;
      //   246: getfield 148	android/support/v7/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
      //   249: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   252: pop
      //   253: aload 5
      //   255: aload 6
      //   257: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   260: aload 4
      //   262: invokestatic 161	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   265: pop
      //   266: aload_0
      //   267: getfield 14	android/support/v7/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroid/support/v7/widget/ActivityChooserModel;
      //   270: iconst_1
      //   271: putfield 129	android/support/v7/widget/ActivityChooserModel:mCanReadHistoricalData	Z
      //   274: aload_1
      //   275: ifnull +124 -> 399
      //   278: goto -67 -> 211
      //   281: astore 4
      //   283: getstatic 138	android/support/v7/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
      //   286: astore 5
      //   288: new 140	java/lang/StringBuilder
      //   291: dup
      //   292: ldc -114
      //   294: invokespecial 145	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   297: astore 6
      //   299: aload 6
      //   301: aload_0
      //   302: getfield 14	android/support/v7/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroid/support/v7/widget/ActivityChooserModel;
      //   305: getfield 148	android/support/v7/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
      //   308: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   311: pop
      //   312: aload 5
      //   314: aload 6
      //   316: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   319: aload 4
      //   321: invokestatic 161	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   324: pop
      //   325: aload_0
      //   326: getfield 14	android/support/v7/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroid/support/v7/widget/ActivityChooserModel;
      //   329: iconst_1
      //   330: putfield 129	android/support/v7/widget/ActivityChooserModel:mCanReadHistoricalData	Z
      //   333: aload_1
      //   334: ifnull +65 -> 399
      //   337: goto -126 -> 211
      //   340: astore 4
      //   342: getstatic 138	android/support/v7/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
      //   345: astore 5
      //   347: new 140	java/lang/StringBuilder
      //   350: dup
      //   351: ldc -114
      //   353: invokespecial 145	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   356: astore 6
      //   358: aload 6
      //   360: aload_0
      //   361: getfield 14	android/support/v7/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroid/support/v7/widget/ActivityChooserModel;
      //   364: getfield 148	android/support/v7/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
      //   367: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   370: pop
      //   371: aload 5
      //   373: aload 6
      //   375: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   378: aload 4
      //   380: invokestatic 161	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   383: pop
      //   384: aload_0
      //   385: getfield 14	android/support/v7/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroid/support/v7/widget/ActivityChooserModel;
      //   388: iconst_1
      //   389: putfield 129	android/support/v7/widget/ActivityChooserModel:mCanReadHistoricalData	Z
      //   392: aload_1
      //   393: ifnull +6 -> 399
      //   396: goto -185 -> 211
      //   399: aconst_null
      //   400: areturn
      //   401: aload_0
      //   402: getfield 14	android/support/v7/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroid/support/v7/widget/ActivityChooserModel;
      //   405: iconst_1
      //   406: putfield 129	android/support/v7/widget/ActivityChooserModel:mCanReadHistoricalData	Z
      //   409: aload_1
      //   410: ifnull +7 -> 417
      //   413: aload_1
      //   414: invokevirtual 134	java/io/FileOutputStream:close	()V
      //   417: aload 4
      //   419: athrow
      //   420: astore_1
      //   421: getstatic 138	android/support/v7/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
      //   424: ldc -114
      //   426: aload 5
      //   428: invokestatic 164	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   431: invokevirtual 168	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
      //   434: aload_1
      //   435: invokestatic 161	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   438: pop
      //   439: aconst_null
      //   440: areturn
      //   441: astore_1
      //   442: aconst_null
      //   443: areturn
      //   444: astore_1
      //   445: goto -28 -> 417
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	448	0	this	PersistHistoryAsyncTask
      //   0	448	1	paramVarArgs	Object[]
      //   76	102	2	i	int
      //   74	6	3	j	int
      //   6	77	4	localList	List
      //   217	1	4	localObject1	Object
      //   222	39	4	localIOException	java.io.IOException
      //   281	39	4	localIllegalStateException	IllegalStateException
      //   340	78	4	localIllegalArgumentException	IllegalArgumentException
      //   14	413	5	localObject2	Object
      //   93	281	6	localObject3	Object
      // Exception table:
      //   from	to	target	type
      //   35	75	217	finally
      //   82	174	217	finally
      //   181	199	217	finally
      //   224	266	217	finally
      //   283	325	217	finally
      //   342	384	217	finally
      //   35	75	222	java/io/IOException
      //   82	174	222	java/io/IOException
      //   181	199	222	java/io/IOException
      //   35	75	281	java/lang/IllegalStateException
      //   82	174	281	java/lang/IllegalStateException
      //   181	199	281	java/lang/IllegalStateException
      //   35	75	340	java/lang/IllegalArgumentException
      //   82	174	340	java/lang/IllegalArgumentException
      //   181	199	340	java/lang/IllegalArgumentException
      //   16	30	420	java/io/FileNotFoundException
      //   211	215	441	java/io/IOException
      //   413	417	444	java/io/IOException
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v7/widget/ActivityChooserModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.arch.persistence.room.util;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.ColumnInfo.SQLiteTypeAffinity;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class TableInfo
{
  public final Map<String, Column> columns;
  public final Set<ForeignKey> foreignKeys;
  @Nullable
  public final Set<Index> indices;
  public final String name;
  
  public TableInfo(String paramString, Map<String, Column> paramMap, Set<ForeignKey> paramSet)
  {
    this(paramString, paramMap, paramSet, Collections.emptySet());
  }
  
  public TableInfo(String paramString, Map<String, Column> paramMap, Set<ForeignKey> paramSet, Set<Index> paramSet1)
  {
    this.name = paramString;
    this.columns = Collections.unmodifiableMap(paramMap);
    this.foreignKeys = Collections.unmodifiableSet(paramSet);
    if (paramSet1 == null) {
      paramString = null;
    } else {
      paramString = Collections.unmodifiableSet(paramSet1);
    }
    this.indices = paramString;
  }
  
  public static TableInfo read(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    return new TableInfo(paramString, readColumns(paramSupportSQLiteDatabase, paramString), readForeignKeys(paramSupportSQLiteDatabase, paramString), readIndices(paramSupportSQLiteDatabase, paramString));
  }
  
  private static Map<String, Column> readColumns(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    Object localObject = new StringBuilder("PRAGMA table_info(`");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("`)");
    paramSupportSQLiteDatabase = paramSupportSQLiteDatabase.query(((StringBuilder)localObject).toString());
    paramString = new HashMap();
    for (;;)
    {
      try
      {
        if (paramSupportSQLiteDatabase.getColumnCount() > 0)
        {
          int i = paramSupportSQLiteDatabase.getColumnIndex("name");
          int j = paramSupportSQLiteDatabase.getColumnIndex("type");
          int k = paramSupportSQLiteDatabase.getColumnIndex("notnull");
          int m = paramSupportSQLiteDatabase.getColumnIndex("pk");
          if (paramSupportSQLiteDatabase.moveToNext())
          {
            localObject = paramSupportSQLiteDatabase.getString(i);
            String str = paramSupportSQLiteDatabase.getString(j);
            if (paramSupportSQLiteDatabase.getInt(k) == 0) {
              break label187;
            }
            bool = true;
            paramString.put(localObject, new Column((String)localObject, str, bool, paramSupportSQLiteDatabase.getInt(m)));
            continue;
          }
        }
        return paramString;
      }
      finally
      {
        paramSupportSQLiteDatabase.close();
      }
      label187:
      boolean bool = false;
    }
  }
  
  private static List<ForeignKeyWithSequence> readForeignKeyFieldMappings(Cursor paramCursor)
  {
    int j = paramCursor.getColumnIndex("id");
    int k = paramCursor.getColumnIndex("seq");
    int m = paramCursor.getColumnIndex("from");
    int n = paramCursor.getColumnIndex("to");
    int i1 = paramCursor.getCount();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < i1)
    {
      paramCursor.moveToPosition(i);
      localArrayList.add(new ForeignKeyWithSequence(paramCursor.getInt(j), paramCursor.getInt(k), paramCursor.getString(m), paramCursor.getString(n)));
      i += 1;
    }
    Collections.sort(localArrayList);
    return localArrayList;
  }
  
  private static Set<ForeignKey> readForeignKeys(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    HashSet localHashSet = new HashSet();
    Object localObject = new StringBuilder("PRAGMA foreign_key_list(`");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("`)");
    paramSupportSQLiteDatabase = paramSupportSQLiteDatabase.query(((StringBuilder)localObject).toString());
    try
    {
      int j = paramSupportSQLiteDatabase.getColumnIndex("id");
      int k = paramSupportSQLiteDatabase.getColumnIndex("seq");
      int m = paramSupportSQLiteDatabase.getColumnIndex("table");
      int n = paramSupportSQLiteDatabase.getColumnIndex("on_delete");
      int i1 = paramSupportSQLiteDatabase.getColumnIndex("on_update");
      paramString = readForeignKeyFieldMappings(paramSupportSQLiteDatabase);
      int i2 = paramSupportSQLiteDatabase.getCount();
      int i = 0;
      while (i < i2)
      {
        paramSupportSQLiteDatabase.moveToPosition(i);
        if (paramSupportSQLiteDatabase.getInt(k) == 0)
        {
          int i3 = paramSupportSQLiteDatabase.getInt(j);
          localObject = new ArrayList();
          ArrayList localArrayList = new ArrayList();
          Iterator localIterator = paramString.iterator();
          while (localIterator.hasNext())
          {
            ForeignKeyWithSequence localForeignKeyWithSequence = (ForeignKeyWithSequence)localIterator.next();
            if (localForeignKeyWithSequence.mId == i3)
            {
              ((List)localObject).add(localForeignKeyWithSequence.mFrom);
              localArrayList.add(localForeignKeyWithSequence.mTo);
            }
          }
          localHashSet.add(new ForeignKey(paramSupportSQLiteDatabase.getString(m), paramSupportSQLiteDatabase.getString(n), paramSupportSQLiteDatabase.getString(i1), (List)localObject, localArrayList));
        }
        i += 1;
      }
      return localHashSet;
    }
    finally
    {
      paramSupportSQLiteDatabase.close();
    }
  }
  
  @Nullable
  private static Index readIndex(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString, boolean paramBoolean)
  {
    Object localObject = new StringBuilder("PRAGMA index_xinfo(`");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("`)");
    paramSupportSQLiteDatabase = paramSupportSQLiteDatabase.query(((StringBuilder)localObject).toString());
    try
    {
      int i = paramSupportSQLiteDatabase.getColumnIndex("seqno");
      int j = paramSupportSQLiteDatabase.getColumnIndex("cid");
      int k = paramSupportSQLiteDatabase.getColumnIndex("name");
      if ((i != -1) && (j != -1) && (k != -1))
      {
        localObject = new TreeMap();
        while (paramSupportSQLiteDatabase.moveToNext()) {
          if (paramSupportSQLiteDatabase.getInt(j) >= 0) {
            ((TreeMap)localObject).put(Integer.valueOf(paramSupportSQLiteDatabase.getInt(i)), paramSupportSQLiteDatabase.getString(k));
          }
        }
        ArrayList localArrayList = new ArrayList(((TreeMap)localObject).size());
        localArrayList.addAll(((TreeMap)localObject).values());
        paramString = new Index(paramString, paramBoolean, localArrayList);
        return paramString;
      }
      return null;
    }
    finally
    {
      paramSupportSQLiteDatabase.close();
    }
  }
  
  @Nullable
  private static Set<Index> readIndices(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    Object localObject1 = new StringBuilder("PRAGMA index_list(`");
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append("`)");
    paramString = paramSupportSQLiteDatabase.query(((StringBuilder)localObject1).toString());
    for (;;)
    {
      try
      {
        int i = paramString.getColumnIndex("name");
        int j = paramString.getColumnIndex("origin");
        int k = paramString.getColumnIndex("unique");
        if ((i != -1) && (j != -1) && (k != -1))
        {
          localObject1 = new HashSet();
          if (paramString.moveToNext())
          {
            if (!"c".equals(paramString.getString(j))) {
              continue;
            }
            Object localObject2 = paramString.getString(i);
            int m = paramString.getInt(k);
            bool = true;
            if (m == 1)
            {
              localObject2 = readIndex(paramSupportSQLiteDatabase, (String)localObject2, bool);
              if (localObject2 == null) {
                return null;
              }
              ((HashSet)localObject1).add(localObject2);
            }
          }
          else
          {
            return (Set<Index>)localObject1;
          }
        }
        else
        {
          return null;
        }
      }
      finally
      {
        paramString.close();
      }
      boolean bool = false;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject != null)
    {
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (TableInfo)paramObject;
      if (this.name != null)
      {
        if (!this.name.equals(((TableInfo)paramObject).name)) {
          return false;
        }
      }
      else if (((TableInfo)paramObject).name != null) {
        return false;
      }
      if (this.columns != null)
      {
        if (!this.columns.equals(((TableInfo)paramObject).columns)) {
          return false;
        }
      }
      else if (((TableInfo)paramObject).columns != null) {
        return false;
      }
      if (this.foreignKeys != null)
      {
        if (!this.foreignKeys.equals(((TableInfo)paramObject).foreignKeys)) {
          return false;
        }
      }
      else if (((TableInfo)paramObject).foreignKeys != null) {
        return false;
      }
      if (this.indices != null)
      {
        if (((TableInfo)paramObject).indices == null) {
          return true;
        }
        return this.indices.equals(((TableInfo)paramObject).indices);
      }
      return true;
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = this.name;
    int k = 0;
    int i;
    if (str != null) {
      i = this.name.hashCode();
    } else {
      i = 0;
    }
    int j;
    if (this.columns != null) {
      j = this.columns.hashCode();
    } else {
      j = 0;
    }
    if (this.foreignKeys != null) {
      k = this.foreignKeys.hashCode();
    }
    return (i * 31 + j) * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("TableInfo{name='");
    localStringBuilder.append(this.name);
    localStringBuilder.append('\'');
    localStringBuilder.append(", columns=");
    localStringBuilder.append(this.columns);
    localStringBuilder.append(", foreignKeys=");
    localStringBuilder.append(this.foreignKeys);
    localStringBuilder.append(", indices=");
    localStringBuilder.append(this.indices);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static class Column
  {
    @ColumnInfo.SQLiteTypeAffinity
    public final int affinity;
    public final String name;
    public final boolean notNull;
    public final int primaryKeyPosition;
    public final String type;
    
    public Column(String paramString1, String paramString2, boolean paramBoolean, int paramInt)
    {
      this.name = paramString1;
      this.type = paramString2;
      this.notNull = paramBoolean;
      this.primaryKeyPosition = paramInt;
      this.affinity = findAffinity(paramString2);
    }
    
    @ColumnInfo.SQLiteTypeAffinity
    private static int findAffinity(@Nullable String paramString)
    {
      if (paramString == null) {
        return 5;
      }
      paramString = paramString.toUpperCase(Locale.US);
      if (paramString.contains("INT")) {
        return 3;
      }
      if ((!paramString.contains("CHAR")) && (!paramString.contains("CLOB")) && (!paramString.contains("TEXT")))
      {
        if (paramString.contains("BLOB")) {
          return 5;
        }
        if ((!paramString.contains("REAL")) && (!paramString.contains("FLOA")) && (!paramString.contains("DOUB"))) {
          return 1;
        }
        return 4;
      }
      return 2;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (paramObject != null)
      {
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (Column)paramObject;
        if (Build.VERSION.SDK_INT >= 20)
        {
          if (this.primaryKeyPosition != ((Column)paramObject).primaryKeyPosition) {
            return false;
          }
        }
        else if (isPrimaryKey() != ((Column)paramObject).isPrimaryKey()) {
          return false;
        }
        if (!this.name.equals(((Column)paramObject).name)) {
          return false;
        }
        if (this.notNull != ((Column)paramObject).notNull) {
          return false;
        }
        if (this.affinity == ((Column)paramObject).affinity) {
          return true;
        }
      }
      return false;
    }
    
    public int hashCode()
    {
      int j = this.name.hashCode();
      int k = this.affinity;
      int i;
      if (this.notNull) {
        i = 1231;
      } else {
        i = 1237;
      }
      return ((j * 31 + k) * 31 + i) * 31 + this.primaryKeyPosition;
    }
    
    public boolean isPrimaryKey()
    {
      return this.primaryKeyPosition > 0;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("Column{name='");
      localStringBuilder.append(this.name);
      localStringBuilder.append('\'');
      localStringBuilder.append(", type='");
      localStringBuilder.append(this.type);
      localStringBuilder.append('\'');
      localStringBuilder.append(", affinity='");
      localStringBuilder.append(this.affinity);
      localStringBuilder.append('\'');
      localStringBuilder.append(", notNull=");
      localStringBuilder.append(this.notNull);
      localStringBuilder.append(", primaryKeyPosition=");
      localStringBuilder.append(this.primaryKeyPosition);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static class ForeignKey
  {
    @NonNull
    public final List<String> columnNames;
    @NonNull
    public final String onDelete;
    @NonNull
    public final String onUpdate;
    @NonNull
    public final List<String> referenceColumnNames;
    @NonNull
    public final String referenceTable;
    
    public ForeignKey(@NonNull String paramString1, @NonNull String paramString2, @NonNull String paramString3, @NonNull List<String> paramList1, @NonNull List<String> paramList2)
    {
      this.referenceTable = paramString1;
      this.onDelete = paramString2;
      this.onUpdate = paramString3;
      this.columnNames = Collections.unmodifiableList(paramList1);
      this.referenceColumnNames = Collections.unmodifiableList(paramList2);
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (paramObject != null)
      {
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (ForeignKey)paramObject;
        if (!this.referenceTable.equals(((ForeignKey)paramObject).referenceTable)) {
          return false;
        }
        if (!this.onDelete.equals(((ForeignKey)paramObject).onDelete)) {
          return false;
        }
        if (!this.onUpdate.equals(((ForeignKey)paramObject).onUpdate)) {
          return false;
        }
        if (!this.columnNames.equals(((ForeignKey)paramObject).columnNames)) {
          return false;
        }
        return this.referenceColumnNames.equals(((ForeignKey)paramObject).referenceColumnNames);
      }
      return false;
    }
    
    public int hashCode()
    {
      return (((this.referenceTable.hashCode() * 31 + this.onDelete.hashCode()) * 31 + this.onUpdate.hashCode()) * 31 + this.columnNames.hashCode()) * 31 + this.referenceColumnNames.hashCode();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("ForeignKey{referenceTable='");
      localStringBuilder.append(this.referenceTable);
      localStringBuilder.append('\'');
      localStringBuilder.append(", onDelete='");
      localStringBuilder.append(this.onDelete);
      localStringBuilder.append('\'');
      localStringBuilder.append(", onUpdate='");
      localStringBuilder.append(this.onUpdate);
      localStringBuilder.append('\'');
      localStringBuilder.append(", columnNames=");
      localStringBuilder.append(this.columnNames);
      localStringBuilder.append(", referenceColumnNames=");
      localStringBuilder.append(this.referenceColumnNames);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  static class ForeignKeyWithSequence
    implements Comparable<ForeignKeyWithSequence>
  {
    final String mFrom;
    final int mId;
    final int mSequence;
    final String mTo;
    
    ForeignKeyWithSequence(int paramInt1, int paramInt2, String paramString1, String paramString2)
    {
      this.mId = paramInt1;
      this.mSequence = paramInt2;
      this.mFrom = paramString1;
      this.mTo = paramString2;
    }
    
    public int compareTo(@NonNull ForeignKeyWithSequence paramForeignKeyWithSequence)
    {
      int j = this.mId - paramForeignKeyWithSequence.mId;
      int i = j;
      if (j == 0) {
        i = this.mSequence - paramForeignKeyWithSequence.mSequence;
      }
      return i;
    }
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static class Index
  {
    public static final String DEFAULT_PREFIX = "index_";
    public final List<String> columns;
    public final String name;
    public final boolean unique;
    
    public Index(String paramString, boolean paramBoolean, List<String> paramList)
    {
      this.name = paramString;
      this.unique = paramBoolean;
      this.columns = paramList;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (paramObject != null)
      {
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (Index)paramObject;
        if (this.unique != ((Index)paramObject).unique) {
          return false;
        }
        if (!this.columns.equals(((Index)paramObject).columns)) {
          return false;
        }
        if (this.name.startsWith("index_")) {
          return ((Index)paramObject).name.startsWith("index_");
        }
        return this.name.equals(((Index)paramObject).name);
      }
      return false;
    }
    
    public int hashCode()
    {
      throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("Index{name='");
      localStringBuilder.append(this.name);
      localStringBuilder.append('\'');
      localStringBuilder.append(", unique=");
      localStringBuilder.append(this.unique);
      localStringBuilder.append(", columns=");
      localStringBuilder.append(this.columns);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/persistence/room/util/TableInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.arch.persistence.db;

import android.support.annotation.Nullable;

public final class SimpleSQLiteQuery
  implements SupportSQLiteQuery
{
  @Nullable
  private final Object[] mBindArgs;
  private final String mQuery;
  
  public SimpleSQLiteQuery(String paramString)
  {
    this(paramString, null);
  }
  
  public SimpleSQLiteQuery(String paramString, @Nullable Object[] paramArrayOfObject)
  {
    this.mQuery = paramString;
    this.mBindArgs = paramArrayOfObject;
  }
  
  private static void bind(SupportSQLiteProgram paramSupportSQLiteProgram, int paramInt, Object paramObject)
  {
    if (paramObject == null)
    {
      paramSupportSQLiteProgram.bindNull(paramInt);
      return;
    }
    if ((paramObject instanceof byte[]))
    {
      paramSupportSQLiteProgram.bindBlob(paramInt, (byte[])paramObject);
      return;
    }
    if ((paramObject instanceof Float))
    {
      paramSupportSQLiteProgram.bindDouble(paramInt, ((Float)paramObject).floatValue());
      return;
    }
    if ((paramObject instanceof Double))
    {
      paramSupportSQLiteProgram.bindDouble(paramInt, ((Double)paramObject).doubleValue());
      return;
    }
    if ((paramObject instanceof Long))
    {
      paramSupportSQLiteProgram.bindLong(paramInt, ((Long)paramObject).longValue());
      return;
    }
    if ((paramObject instanceof Integer))
    {
      paramSupportSQLiteProgram.bindLong(paramInt, ((Integer)paramObject).intValue());
      return;
    }
    if ((paramObject instanceof Short))
    {
      paramSupportSQLiteProgram.bindLong(paramInt, ((Short)paramObject).shortValue());
      return;
    }
    if ((paramObject instanceof Byte))
    {
      paramSupportSQLiteProgram.bindLong(paramInt, ((Byte)paramObject).byteValue());
      return;
    }
    if ((paramObject instanceof String))
    {
      paramSupportSQLiteProgram.bindString(paramInt, (String)paramObject);
      return;
    }
    if ((paramObject instanceof Boolean))
    {
      long l;
      if (((Boolean)paramObject).booleanValue()) {
        l = 1L;
      } else {
        l = 0L;
      }
      paramSupportSQLiteProgram.bindLong(paramInt, l);
      return;
    }
    paramSupportSQLiteProgram = new StringBuilder("Cannot bind ");
    paramSupportSQLiteProgram.append(paramObject);
    paramSupportSQLiteProgram.append(" at index ");
    paramSupportSQLiteProgram.append(paramInt);
    paramSupportSQLiteProgram.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
    throw new IllegalArgumentException(paramSupportSQLiteProgram.toString());
  }
  
  public static void bind(SupportSQLiteProgram paramSupportSQLiteProgram, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      return;
    }
    int j = paramArrayOfObject.length;
    int i = 0;
    while (i < j)
    {
      Object localObject = paramArrayOfObject[i];
      i += 1;
      bind(paramSupportSQLiteProgram, i, localObject);
    }
  }
  
  public final void bindTo(SupportSQLiteProgram paramSupportSQLiteProgram)
  {
    bind(paramSupportSQLiteProgram, this.mBindArgs);
  }
  
  public final int getArgCount()
  {
    if (this.mBindArgs == null) {
      return 0;
    }
    return this.mBindArgs.length;
  }
  
  public final String getSql()
  {
    return this.mQuery;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/persistence/db/SimpleSQLiteQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
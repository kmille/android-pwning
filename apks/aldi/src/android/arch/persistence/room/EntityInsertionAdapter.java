package android.arch.persistence.room;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.support.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract class EntityInsertionAdapter<T>
  extends SharedSQLiteStatement
{
  public EntityInsertionAdapter(RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  protected abstract void bind(SupportSQLiteStatement paramSupportSQLiteStatement, T paramT);
  
  public final void insert(Iterable<T> paramIterable)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext())
      {
        bind(localSupportSQLiteStatement, paramIterable.next());
        localSupportSQLiteStatement.executeInsert();
      }
      return;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final void insert(T paramT)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      bind(localSupportSQLiteStatement, paramT);
      localSupportSQLiteStatement.executeInsert();
      return;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final void insert(T[] paramArrayOfT)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      int j = paramArrayOfT.length;
      int i = 0;
      while (i < j)
      {
        bind(localSupportSQLiteStatement, paramArrayOfT[i]);
        localSupportSQLiteStatement.executeInsert();
        i += 1;
      }
      return;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final long insertAndReturnId(T paramT)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      bind(localSupportSQLiteStatement, paramT);
      long l = localSupportSQLiteStatement.executeInsert();
      return l;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final long[] insertAndReturnIdsArray(Collection<T> paramCollection)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      long[] arrayOfLong = new long[paramCollection.size()];
      int i = 0;
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        bind(localSupportSQLiteStatement, paramCollection.next());
        arrayOfLong[i] = localSupportSQLiteStatement.executeInsert();
        i += 1;
      }
      return arrayOfLong;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final long[] insertAndReturnIdsArray(T[] paramArrayOfT)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      long[] arrayOfLong = new long[paramArrayOfT.length];
      int k = paramArrayOfT.length;
      int i = 0;
      int j = 0;
      while (i < k)
      {
        bind(localSupportSQLiteStatement, paramArrayOfT[i]);
        arrayOfLong[j] = localSupportSQLiteStatement.executeInsert();
        j += 1;
        i += 1;
      }
      return arrayOfLong;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final Long[] insertAndReturnIdsArrayBox(Collection<T> paramCollection)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      Long[] arrayOfLong = new Long[paramCollection.size()];
      int i = 0;
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        bind(localSupportSQLiteStatement, paramCollection.next());
        arrayOfLong[i] = Long.valueOf(localSupportSQLiteStatement.executeInsert());
        i += 1;
      }
      return arrayOfLong;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final Long[] insertAndReturnIdsArrayBox(T[] paramArrayOfT)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      Long[] arrayOfLong = new Long[paramArrayOfT.length];
      int k = paramArrayOfT.length;
      int i = 0;
      int j = 0;
      while (i < k)
      {
        bind(localSupportSQLiteStatement, paramArrayOfT[i]);
        arrayOfLong[j] = Long.valueOf(localSupportSQLiteStatement.executeInsert());
        j += 1;
        i += 1;
      }
      return arrayOfLong;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final List<Long> insertAndReturnIdsList(Collection<T> paramCollection)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      ArrayList localArrayList = new ArrayList(paramCollection.size());
      int i = 0;
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        bind(localSupportSQLiteStatement, paramCollection.next());
        localArrayList.add(i, Long.valueOf(localSupportSQLiteStatement.executeInsert()));
        i += 1;
      }
      return localArrayList;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final List<Long> insertAndReturnIdsList(T[] paramArrayOfT)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      ArrayList localArrayList = new ArrayList(paramArrayOfT.length);
      int k = paramArrayOfT.length;
      int i = 0;
      int j = 0;
      while (i < k)
      {
        bind(localSupportSQLiteStatement, paramArrayOfT[i]);
        localArrayList.add(j, Long.valueOf(localSupportSQLiteStatement.executeInsert()));
        j += 1;
        i += 1;
      }
      return localArrayList;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/persistence/room/EntityInsertionAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
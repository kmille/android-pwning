package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class GlideException
  extends Exception
{
  private static final StackTraceElement[] EMPTY_ELEMENTS = new StackTraceElement[0];
  private static final long serialVersionUID = 1L;
  private final List<Throwable> causes;
  private Class<?> dataClass;
  private DataSource dataSource;
  private String detailMessage;
  private Key key;
  
  public GlideException(String paramString)
  {
    this(paramString, Collections.emptyList());
  }
  
  public GlideException(String paramString, Throwable paramThrowable)
  {
    this(paramString, Collections.singletonList(paramThrowable));
  }
  
  public GlideException(String paramString, List<Throwable> paramList)
  {
    this.detailMessage = paramString;
    setStackTrace(EMPTY_ELEMENTS);
    this.causes = paramList;
  }
  
  private void addRootCauses(Throwable paramThrowable, List<Throwable> paramList)
  {
    if ((paramThrowable instanceof GlideException))
    {
      paramThrowable = ((GlideException)paramThrowable).getCauses().iterator();
      while (paramThrowable.hasNext()) {
        addRootCauses((Throwable)paramThrowable.next(), paramList);
      }
      return;
    }
    paramList.add(paramThrowable);
  }
  
  private static void appendCauses(List<Throwable> paramList, Appendable paramAppendable)
  {
    try
    {
      appendCausesWrapped(paramList, paramAppendable);
      return;
    }
    catch (IOException paramList)
    {
      throw new RuntimeException(paramList);
    }
  }
  
  private static void appendCausesWrapped(List<Throwable> paramList, Appendable paramAppendable)
    throws IOException
  {
    int k = paramList.size();
    int j;
    for (int i = 0; i < k; i = j)
    {
      Object localObject = paramAppendable.append("Cause (");
      j = i + 1;
      ((Appendable)localObject).append(String.valueOf(j)).append(" of ").append(String.valueOf(k)).append("): ");
      localObject = (Throwable)paramList.get(i);
      if ((localObject instanceof GlideException)) {
        ((GlideException)localObject).printStackTrace(paramAppendable);
      } else {
        appendExceptionMessage((Throwable)localObject, paramAppendable);
      }
    }
  }
  
  private static void appendExceptionMessage(Throwable paramThrowable, Appendable paramAppendable)
  {
    try
    {
      paramAppendable.append(paramThrowable.getClass().toString()).append(": ").append(paramThrowable.getMessage()).append('\n');
      return;
    }
    catch (IOException paramAppendable)
    {
      for (;;) {}
    }
    throw new RuntimeException(paramThrowable);
  }
  
  private void printStackTrace(Appendable paramAppendable)
  {
    appendExceptionMessage(this, paramAppendable);
    appendCauses(getCauses(), new IndentedAppendable(paramAppendable));
  }
  
  public final Throwable fillInStackTrace()
  {
    return this;
  }
  
  public final List<Throwable> getCauses()
  {
    return this.causes;
  }
  
  public final String getMessage()
  {
    StringBuilder localStringBuilder = new StringBuilder(71);
    localStringBuilder.append(this.detailMessage);
    if (this.dataClass != null)
    {
      localObject1 = new StringBuilder(", ");
      ((StringBuilder)localObject1).append(this.dataClass);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    else
    {
      localObject1 = "";
    }
    localStringBuilder.append((String)localObject1);
    if (this.dataSource != null)
    {
      localObject1 = new StringBuilder(", ");
      ((StringBuilder)localObject1).append(this.dataSource);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    else
    {
      localObject1 = "";
    }
    localStringBuilder.append((String)localObject1);
    if (this.key != null)
    {
      localObject1 = new StringBuilder(", ");
      ((StringBuilder)localObject1).append(this.key);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    else
    {
      localObject1 = "";
    }
    localStringBuilder.append((String)localObject1);
    Object localObject2 = getRootCauses();
    if (((List)localObject2).isEmpty()) {
      return localStringBuilder.toString();
    }
    if (((List)localObject2).size() == 1) {}
    for (Object localObject1 = "\nThere was 1 cause:";; localObject1 = " causes:")
    {
      localStringBuilder.append((String)localObject1);
      break;
      localStringBuilder.append("\nThere were ");
      localStringBuilder.append(((List)localObject2).size());
    }
    localObject1 = ((List)localObject2).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Throwable)((Iterator)localObject1).next();
      localStringBuilder.append('\n');
      localStringBuilder.append(localObject2.getClass().getName());
      localStringBuilder.append('(');
      localStringBuilder.append(((Throwable)localObject2).getMessage());
      localStringBuilder.append(')');
    }
    localStringBuilder.append("\n call GlideException#logRootCauses(String) for more detail");
    return localStringBuilder.toString();
  }
  
  public final List<Throwable> getRootCauses()
  {
    ArrayList localArrayList = new ArrayList();
    addRootCauses(this, localArrayList);
    return localArrayList;
  }
  
  public final void logRootCauses(String paramString)
  {
    paramString = getRootCauses();
    int k = paramString.size();
    int j;
    for (int i = 0; i < k; i = j)
    {
      StringBuilder localStringBuilder = new StringBuilder("Root cause (");
      j = i + 1;
      localStringBuilder.append(j);
      localStringBuilder.append(" of ");
      localStringBuilder.append(k);
      localStringBuilder.append(")");
      paramString.get(i);
    }
  }
  
  public final void printStackTrace()
  {
    printStackTrace(System.err);
  }
  
  public final void printStackTrace(PrintStream paramPrintStream)
  {
    printStackTrace(paramPrintStream);
  }
  
  public final void printStackTrace(PrintWriter paramPrintWriter)
  {
    printStackTrace(paramPrintWriter);
  }
  
  final void setLoggingDetails(Key paramKey, DataSource paramDataSource)
  {
    setLoggingDetails(paramKey, paramDataSource, null);
  }
  
  final void setLoggingDetails(Key paramKey, DataSource paramDataSource, Class<?> paramClass)
  {
    this.key = paramKey;
    this.dataSource = paramDataSource;
    this.dataClass = paramClass;
  }
  
  static final class IndentedAppendable
    implements Appendable
  {
    private static final String EMPTY_SEQUENCE = "";
    private static final String INDENT = "  ";
    private final Appendable appendable;
    private boolean printedNewLine = true;
    
    IndentedAppendable(Appendable paramAppendable)
    {
      this.appendable = paramAppendable;
    }
    
    @NonNull
    private CharSequence safeSequence(@Nullable CharSequence paramCharSequence)
    {
      Object localObject = paramCharSequence;
      if (paramCharSequence == null) {
        localObject = "";
      }
      return (CharSequence)localObject;
    }
    
    public final Appendable append(char paramChar)
      throws IOException
    {
      boolean bool2 = this.printedNewLine;
      boolean bool1 = false;
      if (bool2)
      {
        this.printedNewLine = false;
        this.appendable.append("  ");
      }
      if (paramChar == '\n') {
        bool1 = true;
      }
      this.printedNewLine = bool1;
      this.appendable.append(paramChar);
      return this;
    }
    
    public final Appendable append(@Nullable CharSequence paramCharSequence)
      throws IOException
    {
      paramCharSequence = safeSequence(paramCharSequence);
      return append(paramCharSequence, 0, paramCharSequence.length());
    }
    
    public final Appendable append(@Nullable CharSequence paramCharSequence, int paramInt1, int paramInt2)
      throws IOException
    {
      paramCharSequence = safeSequence(paramCharSequence);
      boolean bool1 = this.printedNewLine;
      boolean bool2 = false;
      if (bool1)
      {
        this.printedNewLine = false;
        this.appendable.append("  ");
      }
      bool1 = bool2;
      if (paramCharSequence.length() > 0)
      {
        bool1 = bool2;
        if (paramCharSequence.charAt(paramInt2 - 1) == '\n') {
          bool1 = true;
        }
      }
      this.printedNewLine = bool1;
      this.appendable.append(paramCharSequence, paramInt1, paramInt2);
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/GlideException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
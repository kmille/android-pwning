package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class JsonParser
{
  /* Error */
  public final JsonElement parse(JsonReader paramJsonReader)
    throws JsonIOException, JsonSyntaxException
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 25	com/google/gson/stream/JsonReader:isLenient	()Z
    //   4: istore_2
    //   5: aload_1
    //   6: iconst_1
    //   7: invokevirtual 29	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   10: aload_1
    //   11: invokestatic 33	com/google/gson/internal/Streams:parse	(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;
    //   14: astore_3
    //   15: aload_1
    //   16: iload_2
    //   17: invokevirtual 29	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   20: aload_3
    //   21: areturn
    //   22: astore_3
    //   23: goto +85 -> 108
    //   26: astore_3
    //   27: new 35	java/lang/StringBuilder
    //   30: dup
    //   31: ldc 37
    //   33: invokespecial 40	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   36: astore 4
    //   38: aload 4
    //   40: aload_1
    //   41: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: aload 4
    //   47: ldc 46
    //   49: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: new 51	com/google/gson/JsonParseException
    //   56: dup
    //   57: aload 4
    //   59: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: aload_3
    //   63: invokespecial 58	com/google/gson/JsonParseException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   66: athrow
    //   67: astore_3
    //   68: new 35	java/lang/StringBuilder
    //   71: dup
    //   72: ldc 37
    //   74: invokespecial 40	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   77: astore 4
    //   79: aload 4
    //   81: aload_1
    //   82: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload 4
    //   88: ldc 46
    //   90: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: new 51	com/google/gson/JsonParseException
    //   97: dup
    //   98: aload 4
    //   100: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: aload_3
    //   104: invokespecial 58	com/google/gson/JsonParseException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   107: athrow
    //   108: aload_1
    //   109: iload_2
    //   110: invokevirtual 29	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   113: aload_3
    //   114: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	JsonParser
    //   0	115	1	paramJsonReader	JsonReader
    //   4	106	2	bool	boolean
    //   14	7	3	localJsonElement	JsonElement
    //   22	1	3	localObject	Object
    //   26	37	3	localOutOfMemoryError	OutOfMemoryError
    //   67	47	3	localStackOverflowError	StackOverflowError
    //   36	63	4	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   10	15	22	finally
    //   27	67	22	finally
    //   68	108	22	finally
    //   10	15	26	java/lang/OutOfMemoryError
    //   10	15	67	java/lang/StackOverflowError
  }
  
  public final JsonElement parse(Reader paramReader)
    throws JsonIOException, JsonSyntaxException
  {
    try
    {
      paramReader = new JsonReader(paramReader);
      JsonElement localJsonElement = parse(paramReader);
      if (!localJsonElement.isJsonNull())
      {
        if (paramReader.peek() == JsonToken.END_DOCUMENT) {
          return localJsonElement;
        }
        throw new JsonSyntaxException("Did not consume the entire document.");
      }
      return localJsonElement;
    }
    catch (NumberFormatException paramReader)
    {
      throw new JsonSyntaxException(paramReader);
    }
    catch (IOException paramReader)
    {
      throw new JsonIOException(paramReader);
    }
    catch (MalformedJsonException paramReader)
    {
      throw new JsonSyntaxException(paramReader);
    }
  }
  
  public final JsonElement parse(String paramString)
    throws JsonSyntaxException
  {
    return parse(new StringReader(paramString));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/gson/JsonParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
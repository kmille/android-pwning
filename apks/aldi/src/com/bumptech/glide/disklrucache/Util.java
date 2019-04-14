package com.bumptech.glide.disklrucache;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

final class Util
{
  static final Charset US_ASCII = Charset.forName("US-ASCII");
  static final Charset UTF_8 = Charset.forName("UTF-8");
  
  static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (RuntimeException paramCloseable)
    {
      throw paramCloseable;
      return;
    }
    catch (Exception paramCloseable) {}
  }
  
  static void deleteContents(File paramFile)
    throws IOException
  {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null)
    {
      int j = arrayOfFile.length;
      int i = 0;
      while (i < j)
      {
        paramFile = arrayOfFile[i];
        if (paramFile.isDirectory()) {
          deleteContents(paramFile);
        }
        if (paramFile.delete()) {
          i += 1;
        } else {
          throw new IOException("failed to delete file: ".concat(String.valueOf(paramFile)));
        }
      }
      return;
    }
    throw new IOException("not a readable directory: ".concat(String.valueOf(paramFile)));
  }
  
  static String readFully(Reader paramReader)
    throws IOException
  {
    try
    {
      Object localObject1 = new StringWriter();
      char[] arrayOfChar = new char['Ѐ'];
      for (;;)
      {
        int i = paramReader.read(arrayOfChar);
        if (i == -1) {
          break;
        }
        ((StringWriter)localObject1).write(arrayOfChar, 0, i);
      }
      localObject1 = ((StringWriter)localObject1).toString();
      return (String)localObject1;
    }
    finally
    {
      paramReader.close();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/disklrucache/Util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
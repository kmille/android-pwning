package com.google.gson;

public class JsonParseException
  extends RuntimeException
{
  static final long serialVersionUID = -4086729973971783390L;
  
  public JsonParseException(String paramString)
  {
    super(paramString);
  }
  
  public JsonParseException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public JsonParseException(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/gson/JsonParseException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
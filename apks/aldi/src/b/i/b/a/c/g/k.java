package b.i.b.a.c.g;

import java.io.IOException;

public final class k
  extends IOException
{
  public q a = null;
  
  public k(String paramString)
  {
    super(paramString);
  }
  
  static k a()
  {
    return new k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
  }
  
  static k b()
  {
    return new k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  static k c()
  {
    return new k("CodedInputStream encountered a malformed varint.");
  }
  
  static k d()
  {
    return new k("Protocol message contained an invalid tag (zero).");
  }
  
  static k e()
  {
    return new k("Protocol message end-group tag did not match expected tag.");
  }
  
  static k f()
  {
    return new k("Protocol message tag had invalid wire type.");
  }
  
  static k g()
  {
    return new k("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
  }
  
  static k h()
  {
    return new k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
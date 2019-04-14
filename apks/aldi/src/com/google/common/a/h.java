package com.google.common.a;

import com.google.common.base.j;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

final class h
  extends b
  implements Serializable
{
  private final MessageDigest a;
  private final int b;
  private final boolean c;
  private final String d;
  
  h(String paramString1, String paramString2)
  {
    this.a = a(paramString1);
    this.b = this.a.getDigestLength();
    this.d = ((String)j.a(paramString2));
    this.c = a(this.a);
  }
  
  private static MessageDigest a(String paramString)
  {
    try
    {
      paramString = MessageDigest.getInstance(paramString);
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      throw new AssertionError(paramString);
    }
  }
  
  private static boolean a(MessageDigest paramMessageDigest)
  {
    try
    {
      paramMessageDigest.clone();
      return true;
    }
    catch (CloneNotSupportedException paramMessageDigest)
    {
      for (;;) {}
    }
    return false;
  }
  
  public final f a()
  {
    if (this.c) {}
    try
    {
      a locala = new a((MessageDigest)this.a.clone(), this.b, (byte)0);
      return locala;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      for (;;) {}
    }
    return new a(a(this.a.getAlgorithm()), this.b, (byte)0);
  }
  
  public final String toString()
  {
    return this.d;
  }
  
  static final class a
    extends a
  {
    private final MessageDigest a;
    private final int b;
    private boolean c;
    
    private a(MessageDigest paramMessageDigest, int paramInt)
    {
      this.a = paramMessageDigest;
      this.b = paramInt;
    }
    
    private void b()
    {
      j.b(this.c ^ true, "Cannot re-use a Hasher after calling hash() on it");
    }
    
    public final d a()
    {
      b();
      this.c = true;
      if (this.b == this.a.getDigestLength()) {}
      for (byte[] arrayOfByte = this.a.digest();; arrayOfByte = Arrays.copyOf(this.a.digest(), this.b)) {
        return d.a(arrayOfByte);
      }
    }
    
    protected final void a(byte paramByte)
    {
      b();
      this.a.update(paramByte);
    }
    
    protected final void a(byte[] paramArrayOfByte, int paramInt)
    {
      b();
      this.a.update(paramArrayOfByte, 0, paramInt);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
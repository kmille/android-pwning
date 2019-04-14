package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@KeepForSdk
@ShowFirstParty
@SafeParcelable.Class(creator="BitmapTeleporterCreator")
public class BitmapTeleporter
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  @KeepForSdk
  public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();
  @SafeParcelable.Field(id=3)
  private final int mType;
  @SafeParcelable.VersionField(id=1)
  private final int zale;
  @SafeParcelable.Field(id=2)
  private ParcelFileDescriptor zalf;
  private Bitmap zalg;
  private boolean zalh;
  private File zali;
  
  @SafeParcelable.Constructor
  BitmapTeleporter(@SafeParcelable.Param(id=1) int paramInt1, @SafeParcelable.Param(id=2) ParcelFileDescriptor paramParcelFileDescriptor, @SafeParcelable.Param(id=3) int paramInt2)
  {
    this.zale = paramInt1;
    this.zalf = paramParcelFileDescriptor;
    this.mType = paramInt2;
    this.zalg = null;
    this.zalh = false;
  }
  
  @KeepForSdk
  public BitmapTeleporter(Bitmap paramBitmap)
  {
    this.zale = 1;
    this.zalf = null;
    this.mType = 0;
    this.zalg = paramBitmap;
    this.zalh = true;
  }
  
  private static void zaa(Closeable paramCloseable)
  {
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  private final FileOutputStream zabz()
  {
    if (this.zali != null) {
      try
      {
        localFile = File.createTempFile("teleporter", ".tmp", this.zali);
      }
      catch (IOException localIOException)
      {
        File localFile;
        FileOutputStream localFileOutputStream;
        label45:
        throw new IllegalStateException("Could not create temporary file", localIOException);
      }
    }
    try
    {
      localFileOutputStream = new FileOutputStream(localFile);
      this.zalf = ParcelFileDescriptor.open(localFile, 268435456);
      localFile.delete();
      return localFileOutputStream;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      break label45;
    }
    throw new IllegalStateException("Temporary file is somehow already deleted");
    throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
  }
  
  /* Error */
  @KeepForSdk
  public Bitmap get()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 55	com/google/android/gms/common/data/BitmapTeleporter:zalh	Z
    //   4: ifne +121 -> 125
    //   7: new 117	java/io/DataInputStream
    //   10: dup
    //   11: new 119	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   14: dup
    //   15: aload_0
    //   16: getfield 49	com/google/android/gms/common/data/BitmapTeleporter:zalf	Landroid/os/ParcelFileDescriptor;
    //   19: invokespecial 122	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   22: invokespecial 125	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   25: astore_3
    //   26: aload_3
    //   27: invokevirtual 129	java/io/DataInputStream:readInt	()I
    //   30: newarray <illegal type>
    //   32: astore 5
    //   34: aload_3
    //   35: invokevirtual 129	java/io/DataInputStream:readInt	()I
    //   38: istore_1
    //   39: aload_3
    //   40: invokevirtual 129	java/io/DataInputStream:readInt	()I
    //   43: istore_2
    //   44: aload_3
    //   45: invokevirtual 133	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   48: invokestatic 139	android/graphics/Bitmap$Config:valueOf	(Ljava/lang/String;)Landroid/graphics/Bitmap$Config;
    //   51: astore 4
    //   53: aload_3
    //   54: aload 5
    //   56: invokevirtual 143	java/io/DataInputStream:read	([B)I
    //   59: pop
    //   60: aload_3
    //   61: invokestatic 145	com/google/android/gms/common/data/BitmapTeleporter:zaa	(Ljava/io/Closeable;)V
    //   64: aload 5
    //   66: invokestatic 151	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
    //   69: astore_3
    //   70: iload_1
    //   71: iload_2
    //   72: aload 4
    //   74: invokestatic 157	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   77: astore 4
    //   79: aload 4
    //   81: aload_3
    //   82: invokevirtual 161	android/graphics/Bitmap:copyPixelsFromBuffer	(Ljava/nio/Buffer;)V
    //   85: aload_0
    //   86: aload 4
    //   88: putfield 53	com/google/android/gms/common/data/BitmapTeleporter:zalg	Landroid/graphics/Bitmap;
    //   91: aload_0
    //   92: iconst_1
    //   93: putfield 55	com/google/android/gms/common/data/BitmapTeleporter:zalh	Z
    //   96: goto +29 -> 125
    //   99: astore 4
    //   101: goto +17 -> 118
    //   104: astore 4
    //   106: new 101	java/lang/IllegalStateException
    //   109: dup
    //   110: ldc -93
    //   112: aload 4
    //   114: invokespecial 111	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   117: athrow
    //   118: aload_3
    //   119: invokestatic 145	com/google/android/gms/common/data/BitmapTeleporter:zaa	(Ljava/io/Closeable;)V
    //   122: aload 4
    //   124: athrow
    //   125: aload_0
    //   126: getfield 53	com/google/android/gms/common/data/BitmapTeleporter:zalg	Landroid/graphics/Bitmap;
    //   129: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	BitmapTeleporter
    //   38	33	1	i	int
    //   43	29	2	j	int
    //   25	94	3	localObject1	Object
    //   51	36	4	localObject2	Object
    //   99	1	4	localObject3	Object
    //   104	19	4	localIOException	IOException
    //   32	33	5	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   26	60	99	finally
    //   106	118	99	finally
    //   26	60	104	java/io/IOException
  }
  
  @KeepForSdk
  public void release()
  {
    if (!this.zalh) {}
    try
    {
      this.zalf.close();
      return;
    }
    catch (IOException localIOException) {}
  }
  
  @KeepForSdk
  public void setTempDir(File paramFile)
  {
    if (paramFile != null)
    {
      this.zali = paramFile;
      return;
    }
    throw new NullPointerException("Cannot set null temp directory");
  }
  
  /* Error */
  public void writeToParcel(android.os.Parcel paramParcel, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 49	com/google/android/gms/common/data/BitmapTeleporter:zalf	Landroid/os/ParcelFileDescriptor;
    //   4: ifnonnull +138 -> 142
    //   7: aload_0
    //   8: getfield 53	com/google/android/gms/common/data/BitmapTeleporter:zalg	Landroid/graphics/Bitmap;
    //   11: astore 5
    //   13: aload 5
    //   15: invokevirtual 176	android/graphics/Bitmap:getRowBytes	()I
    //   18: aload 5
    //   20: invokevirtual 179	android/graphics/Bitmap:getHeight	()I
    //   23: imul
    //   24: invokestatic 183	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   27: astore 4
    //   29: aload 5
    //   31: aload 4
    //   33: invokevirtual 186	android/graphics/Bitmap:copyPixelsToBuffer	(Ljava/nio/Buffer;)V
    //   36: aload 4
    //   38: invokevirtual 190	java/nio/ByteBuffer:array	()[B
    //   41: astore 6
    //   43: new 192	java/io/DataOutputStream
    //   46: dup
    //   47: new 194	java/io/BufferedOutputStream
    //   50: dup
    //   51: aload_0
    //   52: invokespecial 196	com/google/android/gms/common/data/BitmapTeleporter:zabz	()Ljava/io/FileOutputStream;
    //   55: invokespecial 199	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   58: invokespecial 200	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   61: astore 4
    //   63: aload 4
    //   65: aload 6
    //   67: arraylength
    //   68: invokevirtual 204	java/io/DataOutputStream:writeInt	(I)V
    //   71: aload 4
    //   73: aload 5
    //   75: invokevirtual 207	android/graphics/Bitmap:getWidth	()I
    //   78: invokevirtual 204	java/io/DataOutputStream:writeInt	(I)V
    //   81: aload 4
    //   83: aload 5
    //   85: invokevirtual 179	android/graphics/Bitmap:getHeight	()I
    //   88: invokevirtual 204	java/io/DataOutputStream:writeInt	(I)V
    //   91: aload 4
    //   93: aload 5
    //   95: invokevirtual 211	android/graphics/Bitmap:getConfig	()Landroid/graphics/Bitmap$Config;
    //   98: invokevirtual 214	android/graphics/Bitmap$Config:toString	()Ljava/lang/String;
    //   101: invokevirtual 217	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   104: aload 4
    //   106: aload 6
    //   108: invokevirtual 221	java/io/DataOutputStream:write	([B)V
    //   111: aload 4
    //   113: invokestatic 145	com/google/android/gms/common/data/BitmapTeleporter:zaa	(Ljava/io/Closeable;)V
    //   116: goto +26 -> 142
    //   119: astore_1
    //   120: goto +15 -> 135
    //   123: astore_1
    //   124: new 101	java/lang/IllegalStateException
    //   127: dup
    //   128: ldc -33
    //   130: aload_1
    //   131: invokespecial 111	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   134: athrow
    //   135: aload 4
    //   137: invokestatic 145	com/google/android/gms/common/data/BitmapTeleporter:zaa	(Ljava/io/Closeable;)V
    //   140: aload_1
    //   141: athrow
    //   142: aload_1
    //   143: invokestatic 229	com/google/android/gms/common/internal/safeparcel/SafeParcelWriter:beginObjectHeader	(Landroid/os/Parcel;)I
    //   146: istore_3
    //   147: aload_1
    //   148: iconst_1
    //   149: aload_0
    //   150: getfield 47	com/google/android/gms/common/data/BitmapTeleporter:zale	I
    //   153: invokestatic 232	com/google/android/gms/common/internal/safeparcel/SafeParcelWriter:writeInt	(Landroid/os/Parcel;II)V
    //   156: aload_1
    //   157: iconst_2
    //   158: aload_0
    //   159: getfield 49	com/google/android/gms/common/data/BitmapTeleporter:zalf	Landroid/os/ParcelFileDescriptor;
    //   162: iload_2
    //   163: iconst_1
    //   164: ior
    //   165: iconst_0
    //   166: invokestatic 236	com/google/android/gms/common/internal/safeparcel/SafeParcelWriter:writeParcelable	(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //   169: aload_1
    //   170: iconst_3
    //   171: aload_0
    //   172: getfield 51	com/google/android/gms/common/data/BitmapTeleporter:mType	I
    //   175: invokestatic 232	com/google/android/gms/common/internal/safeparcel/SafeParcelWriter:writeInt	(Landroid/os/Parcel;II)V
    //   178: aload_1
    //   179: iload_3
    //   180: invokestatic 239	com/google/android/gms/common/internal/safeparcel/SafeParcelWriter:finishObjectHeader	(Landroid/os/Parcel;I)V
    //   183: aload_0
    //   184: aconst_null
    //   185: putfield 49	com/google/android/gms/common/data/BitmapTeleporter:zalf	Landroid/os/ParcelFileDescriptor;
    //   188: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	189	0	this	BitmapTeleporter
    //   0	189	1	paramParcel	android.os.Parcel
    //   0	189	2	paramInt	int
    //   146	34	3	i	int
    //   27	109	4	localObject	Object
    //   11	83	5	localBitmap	Bitmap
    //   41	66	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   63	111	119	finally
    //   124	135	119	finally
    //   63	111	123	java/io/IOException
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/data/BitmapTeleporter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
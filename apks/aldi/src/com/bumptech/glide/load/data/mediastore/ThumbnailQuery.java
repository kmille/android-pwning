package com.bumptech.glide.load.data.mediastore;

import android.database.Cursor;
import android.net.Uri;

abstract interface ThumbnailQuery
{
  public abstract Cursor query(Uri paramUri);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/data/mediastore/ThumbnailQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
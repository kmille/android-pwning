package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import android.support.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamLocalUriFetcher
  extends LocalUriFetcher<InputStream>
{
  private static final int ID_CONTACTS_CONTACT = 3;
  private static final int ID_CONTACTS_LOOKUP = 1;
  private static final int ID_CONTACTS_PHOTO = 4;
  private static final int ID_CONTACTS_THUMBNAIL = 2;
  private static final int ID_LOOKUP_BY_PHONE = 5;
  private static final UriMatcher URI_MATCHER;
  
  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    URI_MATCHER = localUriMatcher;
    localUriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
    URI_MATCHER.addURI("com.android.contacts", "contacts/lookup/*", 1);
    URI_MATCHER.addURI("com.android.contacts", "contacts/#/photo", 2);
    URI_MATCHER.addURI("com.android.contacts", "contacts/#", 3);
    URI_MATCHER.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    URI_MATCHER.addURI("com.android.contacts", "phone_lookup/*", 5);
  }
  
  public StreamLocalUriFetcher(ContentResolver paramContentResolver, Uri paramUri)
  {
    super(paramContentResolver, paramUri);
  }
  
  private InputStream loadResourceFromUri(Uri paramUri, ContentResolver paramContentResolver)
    throws FileNotFoundException
  {
    int i = URI_MATCHER.match(paramUri);
    if (i != 1) {
      if (i != 3)
      {
        if (i != 5) {
          return paramContentResolver.openInputStream(paramUri);
        }
      }
      else {
        return openContactPhotoInputStream(paramContentResolver, paramUri);
      }
    }
    paramUri = ContactsContract.Contacts.lookupContact(paramContentResolver, paramUri);
    if (paramUri != null) {
      return openContactPhotoInputStream(paramContentResolver, paramUri);
    }
    throw new FileNotFoundException("Contact cannot be found");
  }
  
  private InputStream openContactPhotoInputStream(ContentResolver paramContentResolver, Uri paramUri)
  {
    return ContactsContract.Contacts.openContactPhotoInputStream(paramContentResolver, paramUri, true);
  }
  
  protected void close(InputStream paramInputStream)
    throws IOException
  {
    paramInputStream.close();
  }
  
  @NonNull
  public Class<InputStream> getDataClass()
  {
    return InputStream.class;
  }
  
  protected InputStream loadResource(Uri paramUri, ContentResolver paramContentResolver)
    throws FileNotFoundException
  {
    paramContentResolver = loadResourceFromUri(paramUri, paramContentResolver);
    if (paramContentResolver != null) {
      return paramContentResolver;
    }
    throw new FileNotFoundException("InputStream is null for ".concat(String.valueOf(paramUri)));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/data/StreamLocalUriFetcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
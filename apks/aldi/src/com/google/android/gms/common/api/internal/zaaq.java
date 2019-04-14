package com.google.android.gms.common.api.internal;

import android.support.annotation.WorkerThread;
import com.google.android.gms.common.api.Api.Client;
import java.util.ArrayList;

final class zaaq
  extends zaau
{
  private final ArrayList<Api.Client> zago;
  
  public zaaq(ArrayList<Api.Client> paramArrayList)
  {
    super(paramArrayList, null);
    ArrayList localArrayList;
    this.zago = localArrayList;
  }
  
  @WorkerThread
  public final void zaan()
  {
    zaak.zad(this.zagi).zaed.zagz = zaak.zag(this.zagi);
    ArrayList localArrayList = (ArrayList)this.zago;
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      Object localObject = localArrayList.get(i);
      i += 1;
      ((Api.Client)localObject).getRemoteService(zaak.zah(this.zagi), zaak.zad(this.zagi).zaed.zagz);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaaq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
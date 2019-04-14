package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.zzi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzaa
  extends zzi<zzaa>
{
  private ProductAction zzri;
  private final Map<String, List<Product>> zzrj = new HashMap();
  private final List<Promotion> zzrk = new ArrayList();
  private final List<Product> zzrl = new ArrayList();
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    if (!this.zzrl.isEmpty()) {
      localHashMap.put("products", this.zzrl);
    }
    if (!this.zzrk.isEmpty()) {
      localHashMap.put("promotions", this.zzrk);
    }
    if (!this.zzrj.isEmpty()) {
      localHashMap.put("impressions", this.zzrj);
    }
    localHashMap.put("productAction", this.zzri);
    return zza(localHashMap);
  }
  
  public final ProductAction zzat()
  {
    return this.zzri;
  }
  
  public final List<Product> zzau()
  {
    return Collections.unmodifiableList(this.zzrl);
  }
  
  public final Map<String, List<Product>> zzav()
  {
    return this.zzrj;
  }
  
  public final List<Promotion> zzaw()
  {
    return Collections.unmodifiableList(this.zzrk);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
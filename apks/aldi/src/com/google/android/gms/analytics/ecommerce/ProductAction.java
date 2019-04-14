package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@VisibleForTesting
public class ProductAction
{
  public static final String ACTION_ADD = "add";
  public static final String ACTION_CHECKOUT = "checkout";
  public static final String ACTION_CHECKOUT_OPTION = "checkout_option";
  @Deprecated
  public static final String ACTION_CHECKOUT_OPTIONS = "checkout_options";
  public static final String ACTION_CLICK = "click";
  public static final String ACTION_DETAIL = "detail";
  public static final String ACTION_PURCHASE = "purchase";
  public static final String ACTION_REFUND = "refund";
  public static final String ACTION_REMOVE = "remove";
  private Map<String, String> zzux = new HashMap();
  
  public ProductAction(String paramString)
  {
    put("&pa", paramString);
  }
  
  private final void put(String paramString1, String paramString2)
  {
    Preconditions.checkNotNull(paramString1, "Name should be non-null");
    this.zzux.put(paramString1, paramString2);
  }
  
  @VisibleForTesting
  public final Map<String, String> build()
  {
    return new HashMap(this.zzux);
  }
  
  public ProductAction setCheckoutOptions(String paramString)
  {
    put("&col", paramString);
    return this;
  }
  
  public ProductAction setCheckoutStep(int paramInt)
  {
    put("&cos", Integer.toString(paramInt));
    return this;
  }
  
  public ProductAction setProductActionList(String paramString)
  {
    put("&pal", paramString);
    return this;
  }
  
  public ProductAction setProductListSource(String paramString)
  {
    put("&pls", paramString);
    return this;
  }
  
  public ProductAction setTransactionAffiliation(String paramString)
  {
    put("&ta", paramString);
    return this;
  }
  
  public ProductAction setTransactionCouponCode(String paramString)
  {
    put("&tcc", paramString);
    return this;
  }
  
  public ProductAction setTransactionId(String paramString)
  {
    put("&ti", paramString);
    return this;
  }
  
  public ProductAction setTransactionRevenue(double paramDouble)
  {
    put("&tr", Double.toString(paramDouble));
    return this;
  }
  
  public ProductAction setTransactionShipping(double paramDouble)
  {
    put("&ts", Double.toString(paramDouble));
    return this;
  }
  
  public ProductAction setTransactionTax(double paramDouble)
  {
    put("&tt", Double.toString(paramDouble));
    return this;
  }
  
  public String toString()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.zzux.entrySet().iterator();
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((String)localEntry.getKey()).startsWith("&")) {}
      for (String str = ((String)localEntry.getKey()).substring(1);; str = (String)localEntry.getKey())
      {
        localHashMap.put(str, (String)localEntry.getValue());
        break;
      }
    }
    return zzi.zza(localHashMap);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/ecommerce/ProductAction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
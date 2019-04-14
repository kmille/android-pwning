package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.HitBuilders.HitBuilder;
import com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@VisibleForTesting
public final class zzgk
  extends zzgh
{
  private static final String ID = zza.zzcj.toString();
  private static final String zzbfe = zzb.zzdp.toString();
  private static final String zzbff = zzb.zzea.toString();
  private static final String zzbfg = zzb.zzhf.toString();
  private static final String zzbfh = zzb.zzgy.toString();
  private static final String zzbfi = zzb.zzgx.toString();
  private static final String zzbfj = zzb.zzdz.toString();
  private static final String zzbfk = zzb.zzmn.toString();
  private static final String zzbfl = zzb.zzmq.toString();
  private static final String zzbfm = zzb.zzms.toString();
  private static final List<String> zzbfn = Arrays.asList(new String[] { "detail", "checkout", "checkout_option", "click", "add", "remove", "purchase", "refund" });
  private static final Pattern zzbfo = Pattern.compile("dimension(\\d+)");
  private static final Pattern zzbfp = Pattern.compile("metric(\\d+)");
  private static Map<String, String> zzbfq;
  private static Map<String, String> zzbfr;
  private final DataLayer zzaxn;
  private final Set<String> zzbfs;
  private final zzgf zzbft;
  
  public zzgk(Context paramContext, DataLayer paramDataLayer)
  {
    this(paramContext, paramDataLayer, new zzgf(paramContext));
  }
  
  @VisibleForTesting
  private zzgk(Context paramContext, DataLayer paramDataLayer, zzgf paramzzgf)
  {
    super(ID, new String[0]);
    this.zzaxn = paramDataLayer;
    this.zzbft = paramzzgf;
    this.zzbfs = new HashSet();
    this.zzbfs.add("");
    this.zzbfs.add("0");
    this.zzbfs.add("false");
  }
  
  private static boolean zzc(Map<String, zzm> paramMap, String paramString)
  {
    paramMap = (zzm)paramMap.get(paramString);
    if (paramMap == null) {
      return false;
    }
    return zzgj.zzg(paramMap).booleanValue();
  }
  
  private static void zzd(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    if (paramString2 != null) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  private final String zzdu(String paramString)
  {
    paramString = this.zzaxn.get(paramString);
    if (paramString == null) {
      return null;
    }
    return paramString.toString();
  }
  
  private static Product zzi(Map<String, Object> paramMap)
  {
    Product localProduct = new Product();
    Object localObject1 = paramMap.get("id");
    if (localObject1 != null) {
      localProduct.setId(String.valueOf(localObject1));
    }
    localObject1 = paramMap.get("name");
    if (localObject1 != null) {
      localProduct.setName(String.valueOf(localObject1));
    }
    localObject1 = paramMap.get("brand");
    if (localObject1 != null) {
      localProduct.setBrand(String.valueOf(localObject1));
    }
    localObject1 = paramMap.get("category");
    if (localObject1 != null) {
      localProduct.setCategory(String.valueOf(localObject1));
    }
    localObject1 = paramMap.get("variant");
    if (localObject1 != null) {
      localProduct.setVariant(String.valueOf(localObject1));
    }
    localObject1 = paramMap.get("coupon");
    if (localObject1 != null) {
      localProduct.setCouponCode(String.valueOf(localObject1));
    }
    localObject1 = paramMap.get("position");
    if (localObject1 != null) {
      localProduct.setPosition(zzo(localObject1).intValue());
    }
    localObject1 = paramMap.get("price");
    if (localObject1 != null) {
      localProduct.setPrice(zzn(localObject1).doubleValue());
    }
    localObject1 = paramMap.get("quantity");
    if (localObject1 != null) {
      localProduct.setQuantity(zzo(localObject1).intValue());
    }
    Iterator localIterator = paramMap.keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        break label429;
      }
      localObject1 = (String)localIterator.next();
      Object localObject2 = zzbfo.matcher((CharSequence)localObject1);
      if (!((Matcher)localObject2).matches()) {
        break label349;
      }
      try
      {
        i = Integer.parseInt(((Matcher)localObject2).group(1));
        localProduct.setCustomDimension(i, String.valueOf(paramMap.get(localObject1)));
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        int i;
        for (;;) {}
      }
    }
    localObject2 = "illegal number in custom dimension value: ";
    localObject1 = String.valueOf(localObject1);
    if (((String)localObject1).length() != 0) {
      label322:
      localObject1 = ((String)localObject2).concat((String)localObject1);
    }
    for (localObject1 = new String("illegal number in custom dimension value: ");; localObject1 = new String("illegal number in custom metric value: "))
    {
      zzdi.zzab((String)localObject1);
      break;
      label349:
      localObject2 = zzbfp.matcher((CharSequence)localObject1);
      if (!((Matcher)localObject2).matches()) {
        break;
      }
      try
      {
        i = Integer.parseInt(((Matcher)localObject2).group(1));
        localProduct.setCustomMetric(i, zzo(paramMap.get(localObject1)).intValue());
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        for (;;) {}
      }
      localObject2 = "illegal number in custom metric value: ";
      localObject1 = String.valueOf(localObject1);
      if (((String)localObject1).length() != 0) {
        break label322;
      }
    }
    label429:
    return localProduct;
  }
  
  private static Map<String, String> zzi(zzm paramzzm)
  {
    paramzzm = zzgj.zzh(paramzzm);
    if (!(paramzzm instanceof Map)) {
      return null;
    }
    Object localObject = (Map)paramzzm;
    paramzzm = new LinkedHashMap();
    localObject = ((Map)localObject).entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      paramzzm.put(localEntry.getKey().toString(), localEntry.getValue().toString());
    }
    return paramzzm;
  }
  
  private final Map<String, String> zzj(zzm paramzzm)
  {
    if (paramzzm == null) {
      return new HashMap();
    }
    paramzzm = zzi(paramzzm);
    if (paramzzm == null) {
      return new HashMap();
    }
    String str = (String)paramzzm.get("&aip");
    if ((str != null) && (this.zzbfs.contains(str.toLowerCase()))) {
      paramzzm.remove("&aip");
    }
    return paramzzm;
  }
  
  private static Double zzn(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      try
      {
        paramObject = Double.valueOf((String)paramObject);
        return (Double)paramObject;
      }
      catch (NumberFormatException paramObject)
      {
        paramObject = String.valueOf(((NumberFormatException)paramObject).getMessage());
        if (((String)paramObject).length() != 0) {
          paramObject = "Cannot convert the object to Double: ".concat((String)paramObject);
        } else {
          paramObject = new String("Cannot convert the object to Double: ");
        }
        throw new RuntimeException((String)paramObject);
      }
    }
    if ((paramObject instanceof Integer)) {
      return Double.valueOf(((Integer)paramObject).doubleValue());
    }
    if ((paramObject instanceof Double)) {
      return (Double)paramObject;
    }
    paramObject = String.valueOf(paramObject.toString());
    if (((String)paramObject).length() != 0) {
      paramObject = "Cannot convert the object to Double: ".concat((String)paramObject);
    } else {
      paramObject = new String("Cannot convert the object to Double: ");
    }
    throw new RuntimeException((String)paramObject);
  }
  
  private static Integer zzo(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      try
      {
        paramObject = Integer.valueOf((String)paramObject);
        return (Integer)paramObject;
      }
      catch (NumberFormatException paramObject)
      {
        paramObject = String.valueOf(((NumberFormatException)paramObject).getMessage());
        if (((String)paramObject).length() != 0) {
          paramObject = "Cannot convert the object to Integer: ".concat((String)paramObject);
        } else {
          paramObject = new String("Cannot convert the object to Integer: ");
        }
        throw new RuntimeException((String)paramObject);
      }
    }
    if ((paramObject instanceof Double)) {
      return Integer.valueOf(((Double)paramObject).intValue());
    }
    if ((paramObject instanceof Integer)) {
      return (Integer)paramObject;
    }
    paramObject = String.valueOf(paramObject.toString());
    if (((String)paramObject).length() != 0) {
      paramObject = "Cannot convert the object to Integer: ".concat((String)paramObject);
    } else {
      paramObject = new String("Cannot convert the object to Integer: ");
    }
    throw new RuntimeException((String)paramObject);
  }
  
  public final void zzg(Map<String, zzm> paramMap)
  {
    Tracker localTracker = this.zzbft.zzdp("_GTM_DEFAULT_TRACKER_");
    localTracker.enableAdvertisingIdCollection(zzc(paramMap, "collect_adid"));
    boolean bool = zzc(paramMap, zzbfg);
    int i = 0;
    int j = 0;
    Object localObject5 = null;
    Object localObject4 = null;
    Object localObject6;
    label145:
    label147:
    Object localObject7;
    Object localObject3;
    if (bool)
    {
      localObject6 = new HitBuilders.ScreenViewBuilder();
      Object localObject1 = zzj((zzm)paramMap.get(zzbfj));
      ((HitBuilders.HitBuilder)localObject6).setAll((Map)localObject1);
      if (zzc(paramMap, zzbfh))
      {
        paramMap = this.zzaxn.get("ecommerce");
        if (!(paramMap instanceof Map)) {
          break label145;
        }
      }
      else
      {
        paramMap = zzgj.zzh((zzm)paramMap.get(zzbfi));
        if (!(paramMap instanceof Map)) {
          break label145;
        }
      }
      paramMap = (Map)paramMap;
      break label147;
      paramMap = null;
      if (paramMap != null)
      {
        localObject5 = (String)((Map)localObject1).get("&cu");
        localObject1 = localObject5;
        if (localObject5 == null) {
          localObject1 = (String)paramMap.get("currencyCode");
        }
        if (localObject1 != null) {
          ((HitBuilders.HitBuilder)localObject6).set("&cu", (String)localObject1);
        }
        localObject1 = paramMap.get("impressions");
        if ((localObject1 instanceof List))
        {
          localObject5 = ((List)localObject1).iterator();
          while (((Iterator)localObject5).hasNext())
          {
            localObject1 = (Map)((Iterator)localObject5).next();
            try
            {
              ((HitBuilders.HitBuilder)localObject6).addImpression(zzi((Map)localObject1), (String)((Map)localObject1).get("list"));
            }
            catch (RuntimeException localRuntimeException1)
            {
              localObject2 = String.valueOf(localRuntimeException1.getMessage());
              if (((String)localObject2).length() != 0) {
                localObject2 = "Failed to extract a product from DataLayer. ".concat((String)localObject2);
              } else {
                localObject2 = new String("Failed to extract a product from DataLayer. ");
              }
              zzdi.e((String)localObject2);
            }
          }
        }
        if (paramMap.containsKey("promoClick")) {}
        for (Object localObject2 = "promoClick";; localObject2 = "promoView")
        {
          localObject2 = (List)((Map)paramMap.get(localObject2)).get("promotions");
          break;
          localObject2 = localObject4;
          if (!paramMap.containsKey("promoView")) {
            break;
          }
        }
        if (localObject2 != null)
        {
          localObject4 = ((List)localObject2).iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject5 = (Map)((Iterator)localObject4).next();
            try
            {
              localObject2 = new Promotion();
              localObject7 = (String)((Map)localObject5).get("id");
              if (localObject7 != null) {
                ((Promotion)localObject2).setId(String.valueOf(localObject7));
              }
              localObject7 = (String)((Map)localObject5).get("name");
              if (localObject7 != null) {
                ((Promotion)localObject2).setName(String.valueOf(localObject7));
              }
              localObject7 = (String)((Map)localObject5).get("creative");
              if (localObject7 != null) {
                ((Promotion)localObject2).setCreative(String.valueOf(localObject7));
              }
              localObject5 = (String)((Map)localObject5).get("position");
              if (localObject5 != null) {
                ((Promotion)localObject2).setPosition(String.valueOf(localObject5));
              }
              ((HitBuilders.HitBuilder)localObject6).addPromotion((Promotion)localObject2);
            }
            catch (RuntimeException localRuntimeException2)
            {
              localObject3 = String.valueOf(localRuntimeException2.getMessage());
              if (((String)localObject3).length() != 0) {
                localObject3 = "Failed to extract a promotion from DataLayer. ".concat((String)localObject3);
              } else {
                localObject3 = new String("Failed to extract a promotion from DataLayer. ");
              }
              zzdi.e((String)localObject3);
            }
          }
          if (paramMap.containsKey("promoClick"))
          {
            ((HitBuilders.HitBuilder)localObject6).set("&promoa", "click");
            i = j;
          }
          else
          {
            ((HitBuilders.HitBuilder)localObject6).set("&promoa", "view");
          }
        }
        else
        {
          i = 1;
        }
        if (i != 0)
        {
          localObject4 = zzbfn.iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject3 = (String)((Iterator)localObject4).next();
            if (paramMap.containsKey(localObject3))
            {
              localObject4 = (Map)paramMap.get(localObject3);
              paramMap = (List)((Map)localObject4).get("products");
              if (paramMap != null)
              {
                localObject5 = paramMap.iterator();
                while (((Iterator)localObject5).hasNext())
                {
                  paramMap = (Map)((Iterator)localObject5).next();
                  try
                  {
                    ((HitBuilders.HitBuilder)localObject6).addProduct(zzi(paramMap));
                  }
                  catch (RuntimeException paramMap)
                  {
                    paramMap = String.valueOf(paramMap.getMessage());
                    if (paramMap.length() != 0) {
                      paramMap = "Failed to extract a product from DataLayer. ".concat(paramMap);
                    } else {
                      paramMap = new String("Failed to extract a product from DataLayer. ");
                    }
                    zzdi.e(paramMap);
                  }
                }
              }
              try
              {
                if (((Map)localObject4).containsKey("actionField"))
                {
                  paramMap = (Map)((Map)localObject4).get("actionField");
                  localObject3 = new ProductAction((String)localObject3);
                  localObject4 = paramMap.get("id");
                  if (localObject4 != null) {
                    ((ProductAction)localObject3).setTransactionId(String.valueOf(localObject4));
                  }
                  localObject4 = paramMap.get("affiliation");
                  if (localObject4 != null) {
                    ((ProductAction)localObject3).setTransactionAffiliation(String.valueOf(localObject4));
                  }
                  localObject4 = paramMap.get("coupon");
                  if (localObject4 != null) {
                    ((ProductAction)localObject3).setTransactionCouponCode(String.valueOf(localObject4));
                  }
                  localObject4 = paramMap.get("list");
                  if (localObject4 != null) {
                    ((ProductAction)localObject3).setProductActionList(String.valueOf(localObject4));
                  }
                  localObject4 = paramMap.get("option");
                  if (localObject4 != null) {
                    ((ProductAction)localObject3).setCheckoutOptions(String.valueOf(localObject4));
                  }
                  localObject4 = paramMap.get("revenue");
                  if (localObject4 != null) {
                    ((ProductAction)localObject3).setTransactionRevenue(zzn(localObject4).doubleValue());
                  }
                  localObject4 = paramMap.get("tax");
                  if (localObject4 != null) {
                    ((ProductAction)localObject3).setTransactionTax(zzn(localObject4).doubleValue());
                  }
                  localObject4 = paramMap.get("shipping");
                  if (localObject4 != null) {
                    ((ProductAction)localObject3).setTransactionShipping(zzn(localObject4).doubleValue());
                  }
                  localObject4 = paramMap.get("step");
                  paramMap = (Map<String, zzm>)localObject3;
                  if (localObject4 != null)
                  {
                    ((ProductAction)localObject3).setCheckoutStep(zzo(localObject4).intValue());
                    paramMap = (Map<String, zzm>)localObject3;
                  }
                }
                else
                {
                  paramMap = new ProductAction((String)localObject3);
                }
                ((HitBuilders.HitBuilder)localObject6).setProductAction(paramMap);
              }
              catch (RuntimeException paramMap)
              {
                paramMap = String.valueOf(paramMap.getMessage());
                if (paramMap.length() != 0) {
                  paramMap = "Failed to extract a product action from DataLayer. ".concat(paramMap);
                } else {
                  paramMap = new String("Failed to extract a product action from DataLayer. ");
                }
                zzdi.e(paramMap);
              }
            }
          }
        }
      }
      localTracker.send(((HitBuilders.HitBuilder)localObject6).build());
      return;
    }
    if (zzc(paramMap, zzbff))
    {
      localTracker.send(zzj((zzm)paramMap.get(zzbfj)));
      return;
    }
    if (zzc(paramMap, zzbfk))
    {
      localObject4 = zzdu("transactionId");
      if (localObject4 == null)
      {
        zzdi.e("Cannot find transactionId in data layer.");
        return;
      }
      localObject6 = new ArrayList();
      try
      {
        localObject7 = zzj((zzm)paramMap.get(zzbfj));
        ((Map)localObject7).put("&t", "transaction");
        localObject3 = (zzm)paramMap.get(zzbfl);
        if (localObject3 != null)
        {
          localObject3 = zzi((zzm)localObject3);
        }
        else
        {
          if (zzbfq == null)
          {
            localObject3 = new HashMap();
            ((HashMap)localObject3).put("transactionId", "&ti");
            ((HashMap)localObject3).put("transactionAffiliation", "&ta");
            ((HashMap)localObject3).put("transactionTax", "&tt");
            ((HashMap)localObject3).put("transactionShipping", "&ts");
            ((HashMap)localObject3).put("transactionTotal", "&tr");
            ((HashMap)localObject3).put("transactionCurrency", "&cu");
            zzbfq = (Map)localObject3;
          }
          localObject3 = zzbfq;
        }
        localObject3 = ((Map)localObject3).entrySet().iterator();
        Object localObject8;
        while (((Iterator)localObject3).hasNext())
        {
          localObject8 = (Map.Entry)((Iterator)localObject3).next();
          zzd((Map)localObject7, (String)((Map.Entry)localObject8).getValue(), zzdu((String)((Map.Entry)localObject8).getKey()));
        }
        ((List)localObject6).add(localObject7);
        localObject3 = this.zzaxn.get("transactionProducts");
        if (localObject3 == null)
        {
          localObject3 = localObject5;
        }
        else
        {
          if (!(localObject3 instanceof List)) {
            break label1961;
          }
          localObject5 = ((List)localObject3).iterator();
          while (((Iterator)localObject5).hasNext()) {
            if (!(((Iterator)localObject5).next() instanceof Map)) {
              throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
            }
          }
          localObject3 = (List)localObject3;
        }
        if (localObject3 != null)
        {
          localObject5 = ((List)localObject3).iterator();
          while (((Iterator)localObject5).hasNext())
          {
            localObject7 = (Map)((Iterator)localObject5).next();
            if (((Map)localObject7).get("name") == null)
            {
              zzdi.e("Unable to send transaction item hit due to missing 'name' field.");
              return;
            }
            localObject8 = zzj((zzm)paramMap.get(zzbfj));
            ((Map)localObject8).put("&t", "item");
            ((Map)localObject8).put("&ti", localObject4);
            localObject3 = (zzm)paramMap.get(zzbfm);
            if (localObject3 != null)
            {
              localObject3 = zzi((zzm)localObject3);
            }
            else
            {
              if (zzbfr == null)
              {
                localObject3 = new HashMap();
                ((HashMap)localObject3).put("name", "&in");
                ((HashMap)localObject3).put("sku", "&ic");
                ((HashMap)localObject3).put("category", "&iv");
                ((HashMap)localObject3).put("price", "&ip");
                ((HashMap)localObject3).put("quantity", "&iq");
                ((HashMap)localObject3).put("currency", "&cu");
                zzbfr = (Map)localObject3;
              }
              localObject3 = zzbfr;
            }
            localObject3 = ((Map)localObject3).entrySet().iterator();
            while (((Iterator)localObject3).hasNext())
            {
              Map.Entry localEntry = (Map.Entry)((Iterator)localObject3).next();
              zzd((Map)localObject8, (String)localEntry.getValue(), (String)((Map)localObject7).get(localEntry.getKey()));
            }
            ((List)localObject6).add(localObject8);
          }
        }
        paramMap = (ArrayList)localObject6;
        j = paramMap.size();
        while (i < j)
        {
          localObject3 = paramMap.get(i);
          i += 1;
          localTracker.send((Map)localObject3);
        }
        label1961:
        throw new IllegalArgumentException("transactionProducts should be of type List.");
      }
      catch (IllegalArgumentException paramMap)
      {
        zzdi.zza("Unable to send transaction", paramMap);
        return;
      }
    }
    zzdi.zzab("Ignoring unknown tag.");
    return;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzgk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
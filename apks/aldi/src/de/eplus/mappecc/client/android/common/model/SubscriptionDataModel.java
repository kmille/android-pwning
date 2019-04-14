package de.eplus.mappecc.client.android.common.model;

import android.support.annotation.NonNull;
import com.a.a.b;
import com.a.a.f;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.restclient.model.DisplayGroupItemModel;
import de.eplus.mappecc.client.android.common.restclient.model.DisplayGroupItemModel.ItemTypeEnum;
import de.eplus.mappecc.client.android.common.restclient.model.DisplayGroupModel;
import de.eplus.mappecc.client.android.common.restclient.model.OfferInfoModel;
import de.eplus.mappecc.client.android.common.restclient.model.PackModel;
import de.eplus.mappecc.client.android.common.restclient.model.PackModel.PackStatusEnum;
import de.eplus.mappecc.client.android.common.restclient.model.PackgroupModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidMobile;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionModel;
import de.eplus.mappecc.client.android.common.utils.DateUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Months;
import org.joda.time.ReadableInstant;

public class SubscriptionDataModel
{
  public static final int ACCOUNT_HISTORY_EVN_DAYS_BETWEEN = 91;
  public static final int ACCOUNT_HISTORY_MONTH_LIMIT = 35;
  final Localizer localizer;
  SubscriptionModel subscriptionModel;
  
  public SubscriptionDataModel(SubscriptionModel paramSubscriptionModel, Localizer paramLocalizer)
  {
    this.subscriptionModel = paramSubscriptionModel;
    this.localizer = paramLocalizer;
  }
  
  protected boolean canEqual(Object paramObject)
  {
    return paramObject instanceof SubscriptionDataModel;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof SubscriptionDataModel)) {
      return false;
    }
    paramObject = (SubscriptionDataModel)paramObject;
    if (!((SubscriptionDataModel)paramObject).canEqual(this)) {
      return false;
    }
    Object localObject = getSubscriptionModel();
    SubscriptionModel localSubscriptionModel = ((SubscriptionDataModel)paramObject).getSubscriptionModel();
    if (localObject == null)
    {
      if (localSubscriptionModel != null) {
        return false;
      }
    }
    else if (!localObject.equals(localSubscriptionModel)) {
      return false;
    }
    localObject = getLocalizer();
    paramObject = ((SubscriptionDataModel)paramObject).getLocalizer();
    if (localObject == null)
    {
      if (paramObject != null) {
        return false;
      }
    }
    else if (!localObject.equals(paramObject)) {
      return false;
    }
    return true;
  }
  
  @NonNull
  public List<BalanceMonthSelectionModel> getAccountHistoryEVNItems(@NonNull DateTime paramDateTime)
  {
    Object localObject2 = getSubscriptionModel().getActivationDate();
    if (localObject2 == null) {
      localObject2 = paramDateTime;
    }
    Object localObject1 = localObject2;
    if (Days.daysBetween((ReadableInstant)localObject2, paramDateTime).getDays() > 91) {
      localObject1 = paramDateTime.minusDays(91);
    }
    localObject2 = new LinkedList();
    while (DateUtils.isEarlierMonthThan((DateTime)localObject1, paramDateTime))
    {
      ((LinkedList)localObject2).addFirst(new BalanceMonthSelectionModel((DateTime)localObject1));
      localObject1 = ((DateTime)localObject1).plusMonths(1);
    }
    return (List<BalanceMonthSelectionModel>)localObject2;
  }
  
  @NonNull
  public List<BalanceMonthSelectionModel> getAccountHistoryItems(@NonNull DateTime paramDateTime, int paramInt)
  {
    Object localObject2 = ((PrepaidMobile)this.subscriptionModel.getSubTypeModel()).getMigratedAt();
    Object localObject1 = this.subscriptionModel.getActivationDate();
    if (localObject1 == null) {
      localObject1 = paramDateTime;
    }
    if (localObject2 != null) {
      if (Days.daysBetween((ReadableInstant)localObject2, paramDateTime).getDays() > paramInt) {
        localObject1 = localObject2;
      } else if (Days.daysBetween((ReadableInstant)localObject1, paramDateTime).getDays() > paramInt) {
        localObject1 = paramDateTime.minusDays(paramInt);
      }
    }
    localObject2 = localObject1;
    if (Months.monthsBetween((ReadableInstant)localObject1, paramDateTime).getMonths() > 35) {
      localObject2 = paramDateTime.minusMonths(35);
    }
    localObject1 = new LinkedList();
    while (DateUtils.isEarlierMonthThan((DateTime)localObject2, paramDateTime))
    {
      ((LinkedList)localObject1).addFirst(new BalanceMonthSelectionModel((DateTime)localObject2));
      localObject2 = ((DateTime)localObject2).plusMonths(1);
    }
    return (List<BalanceMonthSelectionModel>)localObject1;
  }
  
  public List<PackModel> getCancelablePacks()
  {
    ArrayList localArrayList = new ArrayList();
    if (getSubscriptionModel() != null)
    {
      if (getSubscriptionModel().getPacks() == null) {
        return localArrayList;
      }
      Iterator localIterator = getSubscriptionModel().getPacks().iterator();
      while (localIterator.hasNext())
      {
        PackModel localPackModel = (PackModel)localIterator.next();
        if (new PackDataModel(localPackModel, this.localizer).isPackCancelable()) {
          localArrayList.add(localPackModel);
        }
      }
    }
    return localArrayList;
  }
  
  public LinkedHashMap<DisplayGroupModel, List<PackModel>> getDisplayGroupModelListMap()
  {
    Object localObject = getSortedDisplayGroupModels();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localObject = ((List)localObject).iterator();
    label20:
    if (((Iterator)localObject).hasNext())
    {
      DisplayGroupModel localDisplayGroupModel = (DisplayGroupModel)((Iterator)localObject).next();
      localLinkedHashMap.put(localDisplayGroupModel, new LinkedList());
      Iterator localIterator1 = localDisplayGroupModel.getItems().iterator();
      for (;;)
      {
        if (!localIterator1.hasNext()) {
          break label20;
        }
        DisplayGroupItemModel localDisplayGroupItemModel = (DisplayGroupItemModel)localIterator1.next();
        if (localDisplayGroupItemModel.getItemType() != DisplayGroupItemModel.ItemTypeEnum.PACK) {
          break;
        }
        Iterator localIterator2 = getPackModelList().iterator();
        while (localIterator2.hasNext())
        {
          PackModel localPackModel = (PackModel)localIterator2.next();
          if ((localPackModel.getPackStatus() == PackModel.PackStatusEnum.BOOKABLE) && (localPackModel.getServiceItemCode().equals(localDisplayGroupItemModel.getId()))) {
            ((List)localLinkedHashMap.get(localDisplayGroupModel)).add(localPackModel);
          }
        }
      }
    }
    return localLinkedHashMap;
  }
  
  public Localizer getLocalizer()
  {
    return this.localizer;
  }
  
  public OfferInfoModel getOfferInfoModel()
  {
    if (getSubscriptionModel() == null) {
      return null;
    }
    return getSubscriptionModel().getOfferInfo();
  }
  
  public List<PackModel> getPackModelList()
  {
    Object localObject = getSubscriptionModel().getOfferInfo().getPacks();
    ArrayList localArrayList = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.addAll(((PackgroupModel)((Iterator)localObject).next()).getPacks());
    }
    return localArrayList;
  }
  
  public List<PackModel> getProminentPackModelList()
  {
    Map localMap = (Map)f.a(getPackModelList()).a(b.a(-..Lambda.SubscriptionDataModel.uXVDdgCr23r9iiWZPoSm6uayLZw.INSTANCE, -..Lambda.SubscriptionDataModel.Y1UNCWZMhnEthQNUhZa3igC_hJQ.INSTANCE));
    return (List)f.a(getSubscriptionModel().getOfferInfo().getProminentOptions()).a(-..Lambda.SubscriptionDataModel.pYI6-LyGAodWd6PUcsqHUCiexrY.INSTANCE).a(new -..Lambda.SubscriptionDataModel.9zi7fGygzbRD_PR3wOUA9EFcN2k(localMap)).a(b.a());
  }
  
  public List<DisplayGroupModel> getSortedDisplayGroupModels()
  {
    if (getSubscriptionModel() != null)
    {
      if (getSubscriptionModel().getOfferInfo() == null) {
        return null;
      }
      List localList = getOfferInfoModel().getDisplayGroups();
      Collections.sort(localList, new DisplayGroupComperator(null));
      return localList;
    }
    return null;
  }
  
  public SubscriptionModel getSubscriptionModel()
  {
    return this.subscriptionModel;
  }
  
  public boolean hasPacksAvailable()
  {
    if (getSubscriptionModel() != null)
    {
      if (getSubscriptionModel().getOfferInfo() == null) {
        return false;
      }
      OfferInfoModel localOfferInfoModel = getSubscriptionModel().getOfferInfo();
      List localList = localOfferInfoModel.getDisplayGroups();
      int i;
      if ((localList != null) && (localList.size() != 0)) {
        i = 0;
      } else {
        i = 1;
      }
      int j;
      if ((localList != null) && (!f.a(localList).a(-..Lambda.SubscriptionDataModel.fokuu8RddZx7j9YtxZrvD_ewVVU.INSTANCE, 1))) {
        j = 0;
      } else {
        j = 1;
      }
      int k;
      if ((localOfferInfoModel.getPacks() != null) && (!localOfferInfoModel.getPacks().isEmpty())) {
        k = 0;
      } else {
        k = 1;
      }
      if ((k == 0) && (i == 0) && (j == 0)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean hasProminentOptions()
  {
    return (getSubscriptionModel() != null) && (getSubscriptionModel().getOfferInfo() != null) && (getSubscriptionModel().getOfferInfo().getPacks() != null) && (getSubscriptionModel().getOfferInfo().getProminentOptions() != null);
  }
  
  public int hashCode()
  {
    Object localObject = getSubscriptionModel();
    int j = 43;
    int i;
    if (localObject == null) {
      i = 43;
    } else {
      i = localObject.hashCode();
    }
    localObject = getLocalizer();
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return (i + 59) * 59 + j;
  }
  
  public boolean isFlatHierarchie()
  {
    List localList = getSortedDisplayGroupModels();
    return (localList.size() == 1) && (((DisplayGroupModel)localList.get(0)).getFrontendName().equalsIgnoreCase("DEFAULT"));
  }
  
  public void setSubscriptionModel(SubscriptionModel paramSubscriptionModel)
  {
    this.subscriptionModel = paramSubscriptionModel;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("SubscriptionDataModel(subscriptionModel=");
    localStringBuilder.append(getSubscriptionModel());
    localStringBuilder.append(", localizer=");
    localStringBuilder.append(getLocalizer());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  static class DisplayGroupComperator
    implements Serializable, Comparator<DisplayGroupModel>
  {
    public int compare(@NonNull DisplayGroupModel paramDisplayGroupModel1, @NonNull DisplayGroupModel paramDisplayGroupModel2)
    {
      return paramDisplayGroupModel1.getFrontendRank().compareTo(paramDisplayGroupModel2.getFrontendRank());
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/model/SubscriptionDataModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
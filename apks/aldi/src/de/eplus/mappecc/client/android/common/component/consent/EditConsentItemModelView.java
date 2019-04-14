package de.eplus.mappecc.client.android.common.component.consent;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.google.common.collect.m;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.restclient.model.ConsentFeatureModel;
import de.eplus.mappecc.client.android.common.restclient.model.ConsentItemModel;
import de.eplus.mappecc.client.android.common.restclient.model.ConsentItemModel.ClientEnum;
import de.eplus.mappecc.client.android.common.utils.DateUtils;
import de.eplus.mappecc.client.android.common.utils.UiUtils;
import de.eplus.mappecc.client.android.feature.customer.consents.ConsentsAdapter.Callback;
import de.eplus.mappecc.client.android.feature.customer.consents.parser.ConsentParser;
import de.eplus.mappecc.client.android.feature.customer.consents.viewholder.editviewholder.EditConsentsItemRow;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;

public class EditConsentItemModelView
  extends LinearLayout
{
  private LinearLayout content;
  @Inject
  Localizer localizer;
  
  public EditConsentItemModelView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public EditConsentItemModelView(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public EditConsentItemModelView(Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  @RequiresApi(api=21)
  public EditConsentItemModelView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init();
  }
  
  private void addToRow(EditConsentsItemRow paramEditConsentsItemRow, String paramString1, String paramString2, List<ConsentFeatureModel> paramList, @NonNull ConsentsAdapter.Callback paramCallback)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      ConsentFeatureModel localConsentFeatureModel = (ConsentFeatureModel)paramList.next();
      ConsentCheckBoxForm localConsentCheckBoxForm = new ConsentCheckBoxForm(paramEditConsentsItemRow.getContext());
      localConsentCheckBoxForm.setChecked(localConsentFeatureModel.isIsGranted().booleanValue());
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString1);
      ((StringBuilder)localObject).append("@@@");
      ((StringBuilder)localObject).append(paramString2);
      ((StringBuilder)localObject).append("@@@");
      ((StringBuilder)localObject).append(localConsentFeatureModel.getId());
      localConsentCheckBoxForm.setConsentItemId(((StringBuilder)localObject).toString());
      localConsentCheckBoxForm.setDescription(localConsentFeatureModel.getText());
      localObject = new ViewGroup.MarginLayoutParams(-1, -2);
      ((ViewGroup.MarginLayoutParams)localObject).topMargin = UiUtils.dpToPx(16.0F);
      localConsentCheckBoxForm.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localConsentCheckBoxForm.setCheckBoxListener(new -..Lambda.EditConsentItemModelView.HTz2cCPlinw-cbdayEGcQccGSqA(paramCallback, paramString2, localConsentFeatureModel));
      paramEditConsentsItemRow.addViewToLayout(localConsentCheckBoxForm);
    }
  }
  
  private String getLastUpdatedText(ConsentItemModel paramConsentItemModel)
  {
    if ((paramConsentItemModel.getLastUpdate() != null) && (paramConsentItemModel.getClient() != null) && (paramConsentItemModel.getClient() != ConsentItemModel.ClientEnum.UNKNOWN)) {
      return this.localizer.getString(2131691468, m.a("date", DateUtils.toLocaleDefaultMediumDateString(paramConsentItemModel.getLastUpdate()), "client", paramConsentItemModel.getClient().getValue()));
    }
    return this.localizer.getString(2131691466);
  }
  
  private void init()
  {
    inflate(getContext(), 2131427446, this);
    B2PApplication.component.inject(this);
    setOrientation(1);
    setGravity(3);
    this.content = ((LinearLayout)findViewById(2131231044));
  }
  
  public void addItems(String paramString, List<ConsentItemModel> paramList, @NonNull ConsentsAdapter.Callback paramCallback)
  {
    this.content.removeAllViewsInLayout();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      ConsentItemModel localConsentItemModel = (ConsentItemModel)paramList.next();
      EditConsentsItemRow localEditConsentsItemRow = new EditConsentsItemRow(this.content.getContext());
      localEditConsentsItemRow.setShortScope(ConsentParser.parse(localConsentItemModel.getShortScope()));
      localEditConsentsItemRow.setItemSwitch(localConsentItemModel.isIsGranted().booleanValue());
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append("@@@");
      localStringBuilder.append(localConsentItemModel.getId());
      localEditConsentsItemRow.setIdsOnSwitch(localStringBuilder.toString());
      localEditConsentsItemRow.setLastUpdate(getLastUpdatedText(localConsentItemModel));
      addToRow(localEditConsentsItemRow, paramString, localConsentItemModel.getId(), localConsentItemModel.getChannels(), paramCallback);
      addToRow(localEditConsentsItemRow, paramString, localConsentItemModel.getId(), localConsentItemModel.getDataTypes(), paramCallback);
      addToRow(localEditConsentsItemRow, paramString, localConsentItemModel.getId(), localConsentItemModel.getProductTypes(), paramCallback);
      addToRow(localEditConsentsItemRow, paramString, localConsentItemModel.getId(), localConsentItemModel.getPurposeTypes(), paramCallback);
      localEditConsentsItemRow.setOnCheckedChangeListener(new -..Lambda.EditConsentItemModelView.FpFQxuw38zLrHQaNN81vfVZBurs(paramCallback, localConsentItemModel));
      this.content.addView(localEditConsentsItemRow);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/consent/EditConsentItemModelView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
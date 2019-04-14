package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import android.app.Application;
import android.support.annotation.NonNull;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Component.Builder;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;
import de.eplus.mappecc.client.android.common.base.ReloginPresenter;
import de.eplus.mappecc.client.android.common.broadcastreceiver.SimSwapReceiver;
import de.eplus.mappecc.client.android.common.broadcastreceiver.TimeoutReceiver;
import de.eplus.mappecc.client.android.common.component.bankdetail.BankDetailsView;
import de.eplus.mappecc.client.android.common.component.bookedpack.BookedPackView;
import de.eplus.mappecc.client.android.common.component.button.CustomButton;
import de.eplus.mappecc.client.android.common.component.cellcard.CellCardView;
import de.eplus.mappecc.client.android.common.component.checkbox.CheckBoxForm;
import de.eplus.mappecc.client.android.common.component.consent.ConsentCheckBoxForm;
import de.eplus.mappecc.client.android.common.component.consent.EditConsentItemModelView;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.B2PDialogBuilder;
import de.eplus.mappecc.client.android.common.component.edittext.InputForm;
import de.eplus.mappecc.client.android.common.component.expandablecellcard.ExpandableCellCardView;
import de.eplus.mappecc.client.android.common.component.expandabletable.ExpandableTableView;
import de.eplus.mappecc.client.android.common.component.legalpill.LegalPilleView;
import de.eplus.mappecc.client.android.common.component.ratingbar.RatingBarForm;
import de.eplus.mappecc.client.android.common.component.tabbar.TabBarView;
import de.eplus.mappecc.client.android.common.component.textview.CustomTextView;
import de.eplus.mappecc.client.android.common.dependencyinjection.service.Box7APIModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.service.CacheModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.service.FactoryModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.service.MoeModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.service.NetworkModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.service.OttoModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.service.RechargeSettingsModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.service.UtilsModule;
import de.eplus.mappecc.client.android.common.eventbus.BusEventReceiver;
import de.eplus.mappecc.client.android.common.model.PackDataModel;
import de.eplus.mappecc.client.android.common.model.PackViewModel;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.accounts.Box7AccountsManager;
import de.eplus.mappecc.client.android.common.network.box7.customer.Box7CustomerManager;
import de.eplus.mappecc.client.android.common.network.box7.loginaccount.Box7LoginAccountManager;
import de.eplus.mappecc.client.android.common.network.box7.misc.Box7MiscManager;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.network.moe.LocalizerBatchOperationFactory;
import de.eplus.mappecc.client.android.common.network.moe.MoeImageView;
import de.eplus.mappecc.client.android.common.network.moe.MoeUpdateManager;
import de.eplus.mappecc.client.android.common.network.moe.core.MoeStreamingResourceTask;
import de.eplus.mappecc.client.android.common.network.moe.core.MoeStreamingResourceTaskFactory;
import de.eplus.mappecc.client.android.common.network.moe.core.MoeTask;
import de.eplus.mappecc.client.android.common.network.moe.core.MoeTaskFactory;
import de.eplus.mappecc.client.android.common.network.piranha.LoginManager;
import de.eplus.mappecc.client.android.common.repository.database.B2PDatabase;
import de.eplus.mappecc.client.android.common.utils.DateUtils;
import de.eplus.mappecc.client.android.common.utils.ErrorUtils;
import de.eplus.mappecc.client.android.common.utils.ImageUtils;
import de.eplus.mappecc.client.android.common.utils.JsonUtil;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import de.eplus.mappecc.client.android.common.utils.PermissionUtils;
import de.eplus.mappecc.client.android.common.utils.SimUtils;
import de.eplus.mappecc.client.android.common.utils.Timer;
import de.eplus.mappecc.client.android.common.utils.UiUtils;
import de.eplus.mappecc.client.android.common.utils.formatter.MoneyModelFormatter;
import de.eplus.mappecc.client.android.common.utils.helper.TEFPasswordHelper;
import de.eplus.mappecc.client.android.common.utils.migration.ResetApplicationUtil;
import de.eplus.mappecc.client.android.common.utils.preferences.NetworkPreferences;
import de.eplus.mappecc.client.android.feature.customer.ChangeAddressPresenter;
import de.eplus.mappecc.client.android.feature.customer.ChangeEmailPresenter;
import de.eplus.mappecc.client.android.feature.customer.ChangePasswordPresenter;
import de.eplus.mappecc.client.android.feature.customer.CustomerDetailsFragmentPresenter;
import de.eplus.mappecc.client.android.feature.customer.MyAccountFragmentPresenter;
import de.eplus.mappecc.client.android.feature.customer.NotRegisteredFragmentPresenter;
import de.eplus.mappecc.client.android.feature.customer.PhoneNumberView;
import de.eplus.mappecc.client.android.feature.customer.changeaccount.ChangeAccountPresenter;
import de.eplus.mappecc.client.android.feature.customer.consents.ConsentsPresenter;
import de.eplus.mappecc.client.android.feature.customer.consents.model.DetailConsentsModel;
import de.eplus.mappecc.client.android.feature.customer.consents.model.EditConsentsModel;
import de.eplus.mappecc.client.android.feature.customer.consents.parser.rule.ImportantParagraphParsingRule;
import de.eplus.mappecc.client.android.feature.customer.consents.viewholder.editviewholder.EditConsentsViewHolder;
import de.eplus.mappecc.client.android.feature.customer.history.ConsumeFragmentPresenter;
import de.eplus.mappecc.client.android.feature.customer.history.ConsumeOverviewFragmentPresenter;
import de.eplus.mappecc.client.android.feature.customer.history.CounterPackView;
import de.eplus.mappecc.client.android.feature.customer.history.EVNDataModel;
import de.eplus.mappecc.client.android.feature.customer.thirdparty.BarrierPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.bankaccountchange.DirectDebitFragmentPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.confirmation.DirectDebitConfirmationFragmentPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.method.DirectDebitMethodFragmentPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.DirectDebitPaymentChoiceActivityPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.DirectDebitPaymentChoiceConfirmFragmentPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.DirectDebitPaymentChoiceFragmentPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.setting.DirectDebitSettingsFragmentPresenter;
import de.eplus.mappecc.client.android.feature.help.analytics.AnalyticsPresenter;
import de.eplus.mappecc.client.android.feature.help.analytics.dialog.AnalyticsDialog;
import de.eplus.mappecc.client.android.feature.help.imprint.ImprintActivityPresenter;
import de.eplus.mappecc.client.android.feature.help.license.LicenseActivityPresenter;
import de.eplus.mappecc.client.android.feature.help.term.TermsPresenter;
import de.eplus.mappecc.client.android.feature.homescreen.counterview.CounterViewModel;
import de.eplus.mappecc.client.android.feature.homescreen.currentcredit.CurrentCreditPresenter;
import de.eplus.mappecc.client.android.feature.homescreen.currentcredit.CurrentCreditView;
import de.eplus.mappecc.client.android.feature.homescreen.inappinfoview.InAppInfoView;
import de.eplus.mappecc.client.android.feature.login.LoginPresenter;
import de.eplus.mappecc.client.android.feature.onboarding.content.OnBoardingTabView;
import de.eplus.mappecc.client.android.feature.pack.book.PackBookFragmentPresenter;
import de.eplus.mappecc.client.android.feature.pack.book.packages.PackagesView;
import de.eplus.mappecc.client.android.feature.pack.bookconfirm.PackBookConfirmFragmentPresenter;
import de.eplus.mappecc.client.android.feature.pack.cancel.PackCancelFragmentPresenter;
import de.eplus.mappecc.client.android.feature.pack.cancelconfirm.PackCancelConfirmFragmentPresenter;
import de.eplus.mappecc.client.android.feature.pack.detail.PackDetailsPresenter;
import de.eplus.mappecc.client.android.feature.pack.detail.PackDetailsView;
import de.eplus.mappecc.client.android.feature.pack.family.PackFamilyPresenter;
import de.eplus.mappecc.client.android.feature.pack.family.PackFamilyView;
import de.eplus.mappecc.client.android.feature.pack.overview.carousel.CarouselView;
import de.eplus.mappecc.client.android.feature.pack.overview.teaser.TeaserView;
import de.eplus.mappecc.client.android.feature.pack.unbook.PackUnbookView;
import de.eplus.mappecc.client.android.feature.pack.vas.VasInfoPresenter;
import de.eplus.mappecc.client.android.feature.pack.vas.VasPresenter;
import de.eplus.mappecc.client.android.feature.pack.vas.VasView;
import de.eplus.mappecc.client.android.feature.rating.feedback.FeedbackScreenFragmentPresenter;
import de.eplus.mappecc.client.android.feature.rating.rule.implementation.RatingShowingRule;
import de.eplus.mappecc.client.android.feature.rating.starpage.StarRatingPresenter;
import de.eplus.mappecc.client.android.feature.reauth.ReAuthFragmentPresenter;
import de.eplus.mappecc.client.android.feature.resetpassword.overview.ResetFragmentPresenter;
import de.eplus.mappecc.client.android.feature.resetpassword.password.ResetPasswordFragmentPresenter;
import de.eplus.mappecc.client.android.feature.splashscreen.SplashPresenter;
import de.eplus.mappecc.client.android.feature.splashscreen.endpoint.EndpointSwitchDialogFragment;
import de.eplus.mappecc.client.android.feature.topup.bank.TopUpBankPresenter;
import de.eplus.mappecc.client.android.feature.topup.choice.TopUpChoiceFragmentPresenter;
import de.eplus.mappecc.client.android.feature.topup.depositselector.DepositSelectorView;
import de.eplus.mappecc.client.android.feature.topup.voucher.TopUpVoucherFragmentPresenter;
import de.eplus.mappecc.client.android.feature.trash.PiaEntryView;
import javax.inject.Singleton;

@Component(modules={AppModule.class, ActivityBindingModule.class, AndroidSupportInjectionModule.class, CacheModule.class, OttoModule.class, NetworkModule.class, FactoryModule.class, Box7APIModule.class, UtilsModule.class, MoeModule.class, ManagerModule.class, SecurityModule.class, RepositoryModule.class, RechargeSettingsModule.class, DatabaseModule.class})
@Singleton
public abstract class AppComponent
  implements AndroidInjector<DaggerApplication>
{
  public abstract void inject(DaggerApplication paramDaggerApplication);
  
  public abstract void inject(ReloginPresenter paramReloginPresenter);
  
  public abstract void inject(SimSwapReceiver paramSimSwapReceiver);
  
  public abstract void inject(TimeoutReceiver paramTimeoutReceiver);
  
  public abstract void inject(BankDetailsView paramBankDetailsView);
  
  public abstract void inject(BookedPackView paramBookedPackView);
  
  public abstract void inject(@NonNull CustomButton paramCustomButton);
  
  public abstract void inject(CellCardView paramCellCardView);
  
  public abstract void inject(@NonNull CheckBoxForm paramCheckBoxForm);
  
  public abstract void inject(ConsentCheckBoxForm paramConsentCheckBoxForm);
  
  public abstract void inject(EditConsentItemModelView paramEditConsentItemModelView);
  
  public abstract void inject(B2PDialogBuilder paramB2PDialogBuilder);
  
  public abstract void inject(InputForm paramInputForm);
  
  public abstract void inject(ExpandableCellCardView paramExpandableCellCardView);
  
  public abstract void inject(ExpandableTableView paramExpandableTableView);
  
  public abstract void inject(LegalPilleView paramLegalPilleView);
  
  public abstract void inject(@NonNull RatingBarForm paramRatingBarForm);
  
  public abstract void inject(TabBarView paramTabBarView);
  
  public abstract void inject(@NonNull CustomTextView paramCustomTextView);
  
  public abstract void inject(BusEventReceiver paramBusEventReceiver);
  
  public abstract void inject(PackDataModel paramPackDataModel);
  
  public abstract void inject(PackViewModel paramPackViewModel);
  
  public abstract void inject(Box7Cache paramBox7Cache);
  
  public abstract void inject(Box7AccountsManager paramBox7AccountsManager);
  
  public abstract void inject(Box7CustomerManager paramBox7CustomerManager);
  
  public abstract void inject(Box7LoginAccountManager paramBox7LoginAccountManager);
  
  public abstract void inject(Box7MiscManager paramBox7MiscManager);
  
  public abstract void inject(Box7SubscriptionManager paramBox7SubscriptionManager);
  
  public abstract void inject(LocalizationManagerFactory paramLocalizationManagerFactory);
  
  public abstract void inject(LocalizerBatchOperationFactory paramLocalizerBatchOperationFactory);
  
  public abstract void inject(@NonNull MoeImageView paramMoeImageView);
  
  public abstract void inject(MoeUpdateManager paramMoeUpdateManager);
  
  public abstract void inject(MoeStreamingResourceTask paramMoeStreamingResourceTask);
  
  public abstract void inject(MoeStreamingResourceTaskFactory paramMoeStreamingResourceTaskFactory);
  
  public abstract void inject(MoeTask paramMoeTask);
  
  public abstract void inject(MoeTaskFactory paramMoeTaskFactory);
  
  public abstract void inject(LoginManager paramLoginManager);
  
  public abstract void inject(B2PDatabase paramB2PDatabase);
  
  public abstract void inject(DateUtils paramDateUtils);
  
  public abstract void inject(ErrorUtils paramErrorUtils);
  
  public abstract void inject(ImageUtils paramImageUtils);
  
  public abstract void inject(JsonUtil paramJsonUtil);
  
  public abstract void inject(NetworkUtils paramNetworkUtils);
  
  public abstract void inject(PermissionUtils paramPermissionUtils);
  
  public abstract void inject(SimUtils paramSimUtils);
  
  public abstract void inject(Timer paramTimer);
  
  public abstract void inject(UiUtils paramUiUtils);
  
  public abstract void inject(MoneyModelFormatter paramMoneyModelFormatter);
  
  public abstract void inject(TEFPasswordHelper paramTEFPasswordHelper);
  
  public abstract void inject(ResetApplicationUtil paramResetApplicationUtil);
  
  public abstract void inject(NetworkPreferences paramNetworkPreferences);
  
  public abstract void inject(ChangeAddressPresenter paramChangeAddressPresenter);
  
  public abstract void inject(ChangeEmailPresenter paramChangeEmailPresenter);
  
  public abstract void inject(ChangePasswordPresenter paramChangePasswordPresenter);
  
  public abstract void inject(CustomerDetailsFragmentPresenter paramCustomerDetailsFragmentPresenter);
  
  public abstract void inject(MyAccountFragmentPresenter paramMyAccountFragmentPresenter);
  
  public abstract void inject(NotRegisteredFragmentPresenter paramNotRegisteredFragmentPresenter);
  
  public abstract void inject(PhoneNumberView paramPhoneNumberView);
  
  public abstract void inject(ChangeAccountPresenter paramChangeAccountPresenter);
  
  public abstract void inject(ConsentsPresenter paramConsentsPresenter);
  
  public abstract void inject(DetailConsentsModel paramDetailConsentsModel);
  
  public abstract void inject(@NonNull EditConsentsModel paramEditConsentsModel);
  
  public abstract void inject(@NonNull ImportantParagraphParsingRule paramImportantParagraphParsingRule);
  
  public abstract void inject(EditConsentsViewHolder paramEditConsentsViewHolder);
  
  public abstract void inject(ConsumeFragmentPresenter paramConsumeFragmentPresenter);
  
  public abstract void inject(ConsumeOverviewFragmentPresenter paramConsumeOverviewFragmentPresenter);
  
  public abstract void inject(CounterPackView paramCounterPackView);
  
  public abstract void inject(EVNDataModel paramEVNDataModel);
  
  public abstract void inject(BarrierPresenter paramBarrierPresenter);
  
  public abstract void inject(DirectDebitFragmentPresenter paramDirectDebitFragmentPresenter);
  
  public abstract void inject(DirectDebitConfirmationFragmentPresenter paramDirectDebitConfirmationFragmentPresenter);
  
  public abstract void inject(DirectDebitMethodFragmentPresenter paramDirectDebitMethodFragmentPresenter);
  
  public abstract void inject(DirectDebitPaymentChoiceActivityPresenter paramDirectDebitPaymentChoiceActivityPresenter);
  
  public abstract void inject(DirectDebitPaymentChoiceConfirmFragmentPresenter paramDirectDebitPaymentChoiceConfirmFragmentPresenter);
  
  public abstract void inject(DirectDebitPaymentChoiceFragmentPresenter paramDirectDebitPaymentChoiceFragmentPresenter);
  
  public abstract void inject(DirectDebitSettingsFragmentPresenter paramDirectDebitSettingsFragmentPresenter);
  
  public abstract void inject(AnalyticsPresenter paramAnalyticsPresenter);
  
  public abstract void inject(AnalyticsDialog paramAnalyticsDialog);
  
  public abstract void inject(ImprintActivityPresenter paramImprintActivityPresenter);
  
  public abstract void inject(LicenseActivityPresenter paramLicenseActivityPresenter);
  
  public abstract void inject(TermsPresenter paramTermsPresenter);
  
  public abstract void inject(CounterViewModel paramCounterViewModel);
  
  public abstract void inject(CurrentCreditPresenter paramCurrentCreditPresenter);
  
  public abstract void inject(CurrentCreditView paramCurrentCreditView);
  
  public abstract void inject(InAppInfoView paramInAppInfoView);
  
  public abstract void inject(LoginPresenter paramLoginPresenter);
  
  public abstract void inject(OnBoardingTabView paramOnBoardingTabView);
  
  public abstract void inject(PackBookFragmentPresenter paramPackBookFragmentPresenter);
  
  public abstract void inject(PackagesView paramPackagesView);
  
  public abstract void inject(PackBookConfirmFragmentPresenter paramPackBookConfirmFragmentPresenter);
  
  public abstract void inject(PackCancelFragmentPresenter paramPackCancelFragmentPresenter);
  
  public abstract void inject(PackCancelConfirmFragmentPresenter paramPackCancelConfirmFragmentPresenter);
  
  public abstract void inject(PackDetailsPresenter paramPackDetailsPresenter);
  
  public abstract void inject(PackDetailsView paramPackDetailsView);
  
  public abstract void inject(PackFamilyPresenter paramPackFamilyPresenter);
  
  public abstract void inject(PackFamilyView paramPackFamilyView);
  
  public abstract void inject(CarouselView paramCarouselView);
  
  public abstract void inject(TeaserView paramTeaserView);
  
  public abstract void inject(PackUnbookView paramPackUnbookView);
  
  public abstract void inject(VasInfoPresenter paramVasInfoPresenter);
  
  public abstract void inject(VasPresenter paramVasPresenter);
  
  public abstract void inject(VasView paramVasView);
  
  public abstract void inject(FeedbackScreenFragmentPresenter paramFeedbackScreenFragmentPresenter);
  
  public abstract void inject(RatingShowingRule paramRatingShowingRule);
  
  public abstract void inject(StarRatingPresenter paramStarRatingPresenter);
  
  public abstract void inject(ReAuthFragmentPresenter paramReAuthFragmentPresenter);
  
  public abstract void inject(ResetFragmentPresenter paramResetFragmentPresenter);
  
  public abstract void inject(ResetPasswordFragmentPresenter paramResetPasswordFragmentPresenter);
  
  public abstract void inject(SplashPresenter paramSplashPresenter);
  
  public abstract void inject(EndpointSwitchDialogFragment paramEndpointSwitchDialogFragment);
  
  public abstract void inject(TopUpBankPresenter paramTopUpBankPresenter);
  
  public abstract void inject(TopUpChoiceFragmentPresenter paramTopUpChoiceFragmentPresenter);
  
  public abstract void inject(DepositSelectorView paramDepositSelectorView);
  
  public abstract void inject(TopUpVoucherFragmentPresenter paramTopUpVoucherFragmentPresenter);
  
  public abstract void inject(PiaEntryView paramPiaEntryView);
  
  @Component.Builder
  public static abstract interface Builder
  {
    @BindsInstance
    public abstract Builder application(Application paramApplication);
    
    public abstract AppComponent build();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/AppComponent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
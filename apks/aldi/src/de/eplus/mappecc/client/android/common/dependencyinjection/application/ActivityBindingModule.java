package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.AccountOverviewActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.AnalyticsActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.BarrierActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.ChangeAccountActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.ChangeAddressActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.ChangeEmailActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.ChangePasswordActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.ConsentsActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.DirectDebitActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.DirectDebitPaymentChoiceActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.DirectDebitSettingsActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.HelpActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.HomeScreenActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.ImprintActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.InvoiceOverviewActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.LicenseActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.LoginActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.MyAccountActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.OnBoardingActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.PerActivity;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.PublicInfoAreaActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.RatingActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.ResetActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.SplashActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.TermsActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.TopUpActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.ConsumeFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.ConsumeOverviewFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.CustomerDetailsFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.DirectDebitConfirmationFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.DirectDebitFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.DirectDebitMethodFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.DirectDebitPaymentChoiceConfirmFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.DirectDebitPaymentChoiceFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.DirectDebitSettingsFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.FeedbackScreenFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.MyAccountFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PackBookConfirmFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PackBookFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PackCancelConfirmFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PackCancelFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PackOverviewFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.ResetFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.ResetPasswordFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.StarRatingModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.ThankYouModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.TopUpBankModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.TopUpChoiceFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.TopUpOverviewFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.TopUpVoucherFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.VasInfoFragmentModule;
import de.eplus.mappecc.client.android.feature.customer.AccountOverviewActivity;
import de.eplus.mappecc.client.android.feature.customer.ChangeAccountActivity;
import de.eplus.mappecc.client.android.feature.customer.ChangeAddressActivity;
import de.eplus.mappecc.client.android.feature.customer.ChangeEmailActivity;
import de.eplus.mappecc.client.android.feature.customer.ChangePasswordActivity;
import de.eplus.mappecc.client.android.feature.customer.consents.ConsentsActivity;
import de.eplus.mappecc.client.android.feature.customer.history.MyAccountActivity;
import de.eplus.mappecc.client.android.feature.customer.invoice.InvoiceOverviewActivity;
import de.eplus.mappecc.client.android.feature.customer.thirdparty.BarrierActivity;
import de.eplus.mappecc.client.android.feature.directdebit.bankaccountchange.DirectDebitActivity;
import de.eplus.mappecc.client.android.feature.directdebit.method.DirectDebitMethodActivity;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.DirectDebitPaymentChoiceActivity;
import de.eplus.mappecc.client.android.feature.directdebit.setting.DirectDebitSettingsActivity;
import de.eplus.mappecc.client.android.feature.help.HelpActivity;
import de.eplus.mappecc.client.android.feature.help.analytics.activity.AnalyticsActivity;
import de.eplus.mappecc.client.android.feature.help.imprint.ImprintActivity;
import de.eplus.mappecc.client.android.feature.help.license.LicenseActivity;
import de.eplus.mappecc.client.android.feature.help.term.TermsActivity;
import de.eplus.mappecc.client.android.feature.homescreen.HomeScreenActivity;
import de.eplus.mappecc.client.android.feature.login.LoginActivity;
import de.eplus.mappecc.client.android.feature.onboarding.OnBoardingActivity;
import de.eplus.mappecc.client.android.feature.pack.PackActivity;
import de.eplus.mappecc.client.android.feature.rating.RatingActivity;
import de.eplus.mappecc.client.android.feature.resetpassword.ResetActivity;
import de.eplus.mappecc.client.android.feature.splashscreen.SplashActivity;
import de.eplus.mappecc.client.android.feature.topup.TopUpActivity;
import de.eplus.mappecc.client.android.feature.trash.PublicInfoAreaActivity;

@Module
public abstract class ActivityBindingModule
{
  @PerActivity
  @ContributesAndroidInjector(modules={AccountOverviewActivityModule.class, CustomerDetailsFragmentModule.class})
  abstract AccountOverviewActivity accountOverviewActivityInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={AnalyticsActivityModule.class})
  abstract AnalyticsActivity analyticsInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={BarrierActivityModule.class})
  abstract BarrierActivity barrierInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={ChangeAccountActivityModule.class})
  abstract ChangeAccountActivity changeAccountInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={ChangeAddressActivityModule.class})
  abstract ChangeAddressActivity changeAddressInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={ChangeEmailActivityModule.class})
  abstract ChangeEmailActivity changeEmailInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={ChangePasswordActivityModule.class})
  abstract ChangePasswordActivity changePasswordInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={ConsentsActivityModule.class})
  abstract ConsentsActivity consentsInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={DirectDebitActivityModule.class, DirectDebitFragmentModule.class, DirectDebitConfirmationFragmentModule.class})
  abstract DirectDebitActivity directDebitInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={DirectDebitMethodFragmentModule.class})
  abstract DirectDebitMethodActivity directDebitMethodInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={DirectDebitPaymentChoiceActivityModule.class, DirectDebitPaymentChoiceFragmentModule.class, DirectDebitPaymentChoiceConfirmFragmentModule.class})
  abstract DirectDebitPaymentChoiceActivity directDebitPaymentChoiceInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={DirectDebitSettingsActivityModule.class, DirectDebitSettingsFragmentModule.class})
  abstract DirectDebitSettingsActivity directDebitSettingsInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={RatingActivityModule.class, StarRatingModule.class, ThankYouModule.class, FeedbackScreenFragmentModule.class})
  abstract RatingActivity feedbackActivityInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={HelpActivityModule.class})
  abstract HelpActivity helpActivityInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={HomeScreenActivityModule.class})
  abstract HomeScreenActivity homeScreenInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={ImprintActivityModule.class})
  abstract ImprintActivity imprintInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={InvoiceOverviewActivityModule.class})
  abstract InvoiceOverviewActivity invoiceOverviewInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={LicenseActivityModule.class})
  abstract LicenseActivity licenseInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={LoginActivityModule.class})
  abstract LoginActivity loginInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={MyAccountActivityModule.class, MyAccountFragmentModule.class, ConsumeFragmentModule.class, ConsumeOverviewFragmentModule.class})
  abstract MyAccountActivity myAccountActivityInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={PackOverviewFragmentModule.class, PackBookFragmentModule.class, PackBookConfirmFragmentModule.class, PackCancelFragmentModule.class, PackCancelConfirmFragmentModule.class, VasInfoFragmentModule.class})
  abstract PackActivity packActivityInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={PublicInfoAreaActivityModule.class})
  abstract PublicInfoAreaActivity publicInfoAreaInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={ResetActivityModule.class, ResetFragmentModule.class, ResetPasswordFragmentModule.class})
  abstract ResetActivity resetActivityInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={SplashActivityModule.class})
  abstract SplashActivity splashInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={TermsActivityModule.class})
  abstract TermsActivity termsInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={TopUpActivityModule.class, TopUpBankModule.class, TopUpVoucherFragmentModule.class, TopUpChoiceFragmentModule.class, TopUpOverviewFragmentModule.class})
  abstract TopUpActivity topUpInjector();
  
  @PerActivity
  @ContributesAndroidInjector(modules={OnBoardingActivityModule.class})
  abstract OnBoardingActivity tutorialInjector();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.constraint.solver.widgets;

import java.util.Arrays;

public class Helper
  extends ConstraintWidget
{
  protected ConstraintWidget[] mWidgets = new ConstraintWidget[4];
  protected int mWidgetsCount = 0;
  
  public void add(ConstraintWidget paramConstraintWidget)
  {
    if (this.mWidgetsCount + 1 > this.mWidgets.length) {
      this.mWidgets = ((ConstraintWidget[])Arrays.copyOf(this.mWidgets, this.mWidgets.length * 2));
    }
    this.mWidgets[this.mWidgetsCount] = paramConstraintWidget;
    this.mWidgetsCount += 1;
  }
  
  public void removeAllIds()
  {
    this.mWidgetsCount = 0;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/constraint/solver/widgets/Helper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
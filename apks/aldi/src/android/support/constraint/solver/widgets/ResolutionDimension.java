package android.support.constraint.solver.widgets;

public class ResolutionDimension
  extends ResolutionNode
{
  float value = 0.0F;
  
  public void remove()
  {
    this.state = 2;
  }
  
  public void reset()
  {
    super.reset();
    this.value = 0.0F;
  }
  
  public void resolve(int paramInt)
  {
    if ((this.state == 0) || (this.value != paramInt))
    {
      this.value = paramInt;
      if (this.state == 1) {
        invalidate();
      }
      didResolve();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/constraint/solver/widgets/ResolutionDimension.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
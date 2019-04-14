package android.support.constraint.solver;

public class GoalRow
  extends ArrayRow
{
  public GoalRow(Cache paramCache)
  {
    super(paramCache);
  }
  
  public void addError(SolverVariable paramSolverVariable)
  {
    super.addError(paramSolverVariable);
    paramSolverVariable.usageInRowCount -= 1;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/constraint/solver/GoalRow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
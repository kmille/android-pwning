package android.support.constraint.solver.widgets;

import java.util.ArrayList;

public class Snapshot
{
  private ArrayList<Connection> mConnections = new ArrayList();
  private int mHeight;
  private int mWidth;
  private int mX;
  private int mY;
  
  public Snapshot(ConstraintWidget paramConstraintWidget)
  {
    this.mX = paramConstraintWidget.getX();
    this.mY = paramConstraintWidget.getY();
    this.mWidth = paramConstraintWidget.getWidth();
    this.mHeight = paramConstraintWidget.getHeight();
    paramConstraintWidget = paramConstraintWidget.getAnchors();
    int j = paramConstraintWidget.size();
    int i = 0;
    while (i < j)
    {
      ConstraintAnchor localConstraintAnchor = (ConstraintAnchor)paramConstraintWidget.get(i);
      this.mConnections.add(new Connection(localConstraintAnchor));
      i += 1;
    }
  }
  
  public void applyTo(ConstraintWidget paramConstraintWidget)
  {
    paramConstraintWidget.setX(this.mX);
    paramConstraintWidget.setY(this.mY);
    paramConstraintWidget.setWidth(this.mWidth);
    paramConstraintWidget.setHeight(this.mHeight);
    int j = this.mConnections.size();
    int i = 0;
    while (i < j)
    {
      ((Connection)this.mConnections.get(i)).applyTo(paramConstraintWidget);
      i += 1;
    }
  }
  
  public void updateFrom(ConstraintWidget paramConstraintWidget)
  {
    this.mX = paramConstraintWidget.getX();
    this.mY = paramConstraintWidget.getY();
    this.mWidth = paramConstraintWidget.getWidth();
    this.mHeight = paramConstraintWidget.getHeight();
    int j = this.mConnections.size();
    int i = 0;
    while (i < j)
    {
      ((Connection)this.mConnections.get(i)).updateFrom(paramConstraintWidget);
      i += 1;
    }
  }
  
  static class Connection
  {
    private ConstraintAnchor mAnchor;
    private int mCreator;
    private int mMargin;
    private ConstraintAnchor.Strength mStrengh;
    private ConstraintAnchor mTarget;
    
    public Connection(ConstraintAnchor paramConstraintAnchor)
    {
      this.mAnchor = paramConstraintAnchor;
      this.mTarget = paramConstraintAnchor.getTarget();
      this.mMargin = paramConstraintAnchor.getMargin();
      this.mStrengh = paramConstraintAnchor.getStrength();
      this.mCreator = paramConstraintAnchor.getConnectionCreator();
    }
    
    public void applyTo(ConstraintWidget paramConstraintWidget)
    {
      paramConstraintWidget.getAnchor(this.mAnchor.getType()).connect(this.mTarget, this.mMargin, this.mStrengh, this.mCreator);
    }
    
    public void updateFrom(ConstraintWidget paramConstraintWidget)
    {
      this.mAnchor = paramConstraintWidget.getAnchor(this.mAnchor.getType());
      int i;
      if (this.mAnchor != null)
      {
        this.mTarget = this.mAnchor.getTarget();
        this.mMargin = this.mAnchor.getMargin();
        this.mStrengh = this.mAnchor.getStrength();
        i = this.mAnchor.getConnectionCreator();
      }
      for (;;)
      {
        this.mCreator = i;
        return;
        this.mTarget = null;
        i = 0;
        this.mMargin = 0;
        this.mStrengh = ConstraintAnchor.Strength.STRONG;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/constraint/solver/widgets/Snapshot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
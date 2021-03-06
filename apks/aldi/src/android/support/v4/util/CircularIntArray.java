package android.support.v4.util;

public final class CircularIntArray
{
  private int mCapacityBitmask;
  private int[] mElements;
  private int mHead;
  private int mTail;
  
  public CircularIntArray()
  {
    this(8);
  }
  
  public CircularIntArray(int paramInt)
  {
    if (paramInt > 0)
    {
      if (paramInt <= 1073741824)
      {
        int i = paramInt;
        if (Integer.bitCount(paramInt) != 1) {
          i = Integer.highestOneBit(paramInt - 1) << 1;
        }
        this.mCapacityBitmask = (i - 1);
        this.mElements = new int[i];
        return;
      }
      throw new IllegalArgumentException("capacity must be <= 2^30");
    }
    throw new IllegalArgumentException("capacity must be >= 1");
  }
  
  private void doubleCapacity()
  {
    int i = this.mElements.length;
    int j = i - this.mHead;
    int k = i << 1;
    if (k >= 0)
    {
      int[] arrayOfInt = new int[k];
      System.arraycopy(this.mElements, this.mHead, arrayOfInt, 0, j);
      System.arraycopy(this.mElements, 0, arrayOfInt, j, this.mHead);
      this.mElements = arrayOfInt;
      this.mHead = 0;
      this.mTail = i;
      this.mCapacityBitmask = (k - 1);
      return;
    }
    throw new RuntimeException("Max array capacity exceeded");
  }
  
  public final void addFirst(int paramInt)
  {
    this.mHead = (this.mHead - 1 & this.mCapacityBitmask);
    this.mElements[this.mHead] = paramInt;
    if (this.mHead == this.mTail) {
      doubleCapacity();
    }
  }
  
  public final void addLast(int paramInt)
  {
    this.mElements[this.mTail] = paramInt;
    this.mTail = (this.mTail + 1 & this.mCapacityBitmask);
    if (this.mTail == this.mHead) {
      doubleCapacity();
    }
  }
  
  public final void clear()
  {
    this.mTail = this.mHead;
  }
  
  public final int get(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < size()))
    {
      int[] arrayOfInt = this.mElements;
      int i = this.mHead;
      return arrayOfInt[(this.mCapacityBitmask & i + paramInt)];
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public final int getFirst()
  {
    if (this.mHead != this.mTail) {
      return this.mElements[this.mHead];
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public final int getLast()
  {
    if (this.mHead != this.mTail) {
      return this.mElements[(this.mTail - 1 & this.mCapacityBitmask)];
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public final boolean isEmpty()
  {
    return this.mHead == this.mTail;
  }
  
  public final int popFirst()
  {
    if (this.mHead != this.mTail)
    {
      int i = this.mElements[this.mHead];
      this.mHead = (this.mHead + 1 & this.mCapacityBitmask);
      return i;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public final int popLast()
  {
    if (this.mHead != this.mTail)
    {
      int i = this.mTail - 1 & this.mCapacityBitmask;
      int j = this.mElements[i];
      this.mTail = i;
      return j;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public final void removeFromEnd(int paramInt)
  {
    if (paramInt <= 0) {
      return;
    }
    if (paramInt <= size())
    {
      int i = this.mTail;
      this.mTail = (this.mCapacityBitmask & i - paramInt);
      return;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public final void removeFromStart(int paramInt)
  {
    if (paramInt <= 0) {
      return;
    }
    if (paramInt <= size())
    {
      int i = this.mHead;
      this.mHead = (this.mCapacityBitmask & i + paramInt);
      return;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public final int size()
  {
    return this.mTail - this.mHead & this.mCapacityBitmask;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/util/CircularIntArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
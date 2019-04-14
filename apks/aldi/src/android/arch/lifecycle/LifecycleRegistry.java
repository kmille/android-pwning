package android.arch.lifecycle;

import android.arch.core.internal.FastSafeIterableMap;
import android.arch.core.internal.SafeIterableMap.IteratorWithAdditions;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public class LifecycleRegistry
  extends Lifecycle
{
  private static final String LOG_TAG = "LifecycleRegistry";
  private int mAddingObserverCounter = 0;
  private boolean mHandlingEvent = false;
  private final WeakReference<LifecycleOwner> mLifecycleOwner;
  private boolean mNewEventOccurred = false;
  private FastSafeIterableMap<LifecycleObserver, ObserverWithState> mObserverMap = new FastSafeIterableMap();
  private ArrayList<Lifecycle.State> mParentStates = new ArrayList();
  private Lifecycle.State mState;
  
  public LifecycleRegistry(@NonNull LifecycleOwner paramLifecycleOwner)
  {
    this.mLifecycleOwner = new WeakReference(paramLifecycleOwner);
    this.mState = Lifecycle.State.INITIALIZED;
  }
  
  private void backwardPass(LifecycleOwner paramLifecycleOwner)
  {
    Iterator localIterator = this.mObserverMap.descendingIterator();
    while ((localIterator.hasNext()) && (!this.mNewEventOccurred))
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ObserverWithState localObserverWithState = (ObserverWithState)localEntry.getValue();
      while ((localObserverWithState.mState.compareTo(this.mState) > 0) && (!this.mNewEventOccurred) && (this.mObserverMap.contains(localEntry.getKey())))
      {
        Lifecycle.Event localEvent = downEvent(localObserverWithState.mState);
        pushParentState(getStateAfter(localEvent));
        localObserverWithState.dispatchEvent(paramLifecycleOwner, localEvent);
        popParentState();
      }
    }
  }
  
  private Lifecycle.State calculateTargetState(LifecycleObserver paramLifecycleObserver)
  {
    paramLifecycleObserver = this.mObserverMap.ceil(paramLifecycleObserver);
    Lifecycle.State localState = null;
    if (paramLifecycleObserver != null) {
      paramLifecycleObserver = ((ObserverWithState)paramLifecycleObserver.getValue()).mState;
    } else {
      paramLifecycleObserver = null;
    }
    if (!this.mParentStates.isEmpty()) {
      localState = (Lifecycle.State)this.mParentStates.get(this.mParentStates.size() - 1);
    }
    return min(min(this.mState, paramLifecycleObserver), localState);
  }
  
  private static Lifecycle.Event downEvent(Lifecycle.State paramState)
  {
    switch (paramState)
    {
    default: 
      throw new IllegalArgumentException("Unexpected state value ".concat(String.valueOf(paramState)));
    case ???: 
      throw new IllegalArgumentException();
    case ???: 
      return Lifecycle.Event.ON_PAUSE;
    case ???: 
      return Lifecycle.Event.ON_STOP;
    case ???: 
      return Lifecycle.Event.ON_DESTROY;
    }
    throw new IllegalArgumentException();
  }
  
  private void forwardPass(LifecycleOwner paramLifecycleOwner)
  {
    SafeIterableMap.IteratorWithAdditions localIteratorWithAdditions = this.mObserverMap.iteratorWithAdditions();
    while ((localIteratorWithAdditions.hasNext()) && (!this.mNewEventOccurred))
    {
      Map.Entry localEntry = (Map.Entry)localIteratorWithAdditions.next();
      ObserverWithState localObserverWithState = (ObserverWithState)localEntry.getValue();
      while ((localObserverWithState.mState.compareTo(this.mState) < 0) && (!this.mNewEventOccurred) && (this.mObserverMap.contains(localEntry.getKey())))
      {
        pushParentState(localObserverWithState.mState);
        localObserverWithState.dispatchEvent(paramLifecycleOwner, upEvent(localObserverWithState.mState));
        popParentState();
      }
    }
  }
  
  static Lifecycle.State getStateAfter(Lifecycle.Event paramEvent)
  {
    switch (1.$SwitchMap$android$arch$lifecycle$Lifecycle$Event[paramEvent.ordinal()])
    {
    default: 
      throw new IllegalArgumentException("Unexpected event value ".concat(String.valueOf(paramEvent)));
    case 6: 
      return Lifecycle.State.DESTROYED;
    case 5: 
      return Lifecycle.State.RESUMED;
    case 3: 
    case 4: 
      return Lifecycle.State.STARTED;
    }
    return Lifecycle.State.CREATED;
  }
  
  private boolean isSynced()
  {
    if (this.mObserverMap.size() == 0) {
      return true;
    }
    Lifecycle.State localState1 = ((ObserverWithState)this.mObserverMap.eldest().getValue()).mState;
    Lifecycle.State localState2 = ((ObserverWithState)this.mObserverMap.newest().getValue()).mState;
    return (localState1 == localState2) && (this.mState == localState2);
  }
  
  static Lifecycle.State min(@NonNull Lifecycle.State paramState1, @Nullable Lifecycle.State paramState2)
  {
    if ((paramState2 != null) && (paramState2.compareTo(paramState1) < 0)) {
      return paramState2;
    }
    return paramState1;
  }
  
  private void moveToState(Lifecycle.State paramState)
  {
    if (this.mState == paramState) {
      return;
    }
    this.mState = paramState;
    if ((!this.mHandlingEvent) && (this.mAddingObserverCounter == 0))
    {
      this.mHandlingEvent = true;
      sync();
      this.mHandlingEvent = false;
      return;
    }
    this.mNewEventOccurred = true;
  }
  
  private void popParentState()
  {
    this.mParentStates.remove(this.mParentStates.size() - 1);
  }
  
  private void pushParentState(Lifecycle.State paramState)
  {
    this.mParentStates.add(paramState);
  }
  
  private void sync()
  {
    LifecycleOwner localLifecycleOwner = (LifecycleOwner)this.mLifecycleOwner.get();
    if (localLifecycleOwner == null) {
      return;
    }
    while (!isSynced())
    {
      this.mNewEventOccurred = false;
      if (this.mState.compareTo(((ObserverWithState)this.mObserverMap.eldest().getValue()).mState) < 0) {
        backwardPass(localLifecycleOwner);
      }
      Map.Entry localEntry = this.mObserverMap.newest();
      if ((!this.mNewEventOccurred) && (localEntry != null) && (this.mState.compareTo(((ObserverWithState)localEntry.getValue()).mState) > 0)) {
        forwardPass(localLifecycleOwner);
      }
    }
    this.mNewEventOccurred = false;
  }
  
  private static Lifecycle.Event upEvent(Lifecycle.State paramState)
  {
    switch (paramState)
    {
    default: 
      throw new IllegalArgumentException("Unexpected state value ".concat(String.valueOf(paramState)));
    case ???: 
      throw new IllegalArgumentException();
    case ???: 
      return Lifecycle.Event.ON_RESUME;
    case ???: 
      return Lifecycle.Event.ON_START;
    }
    return Lifecycle.Event.ON_CREATE;
  }
  
  public void addObserver(@NonNull LifecycleObserver paramLifecycleObserver)
  {
    if (this.mState == Lifecycle.State.DESTROYED) {
      localState = Lifecycle.State.DESTROYED;
    } else {
      localState = Lifecycle.State.INITIALIZED;
    }
    ObserverWithState localObserverWithState = new ObserverWithState(paramLifecycleObserver, localState);
    if ((ObserverWithState)this.mObserverMap.putIfAbsent(paramLifecycleObserver, localObserverWithState) != null) {
      return;
    }
    LifecycleOwner localLifecycleOwner = (LifecycleOwner)this.mLifecycleOwner.get();
    if (localLifecycleOwner == null) {
      return;
    }
    int i;
    if ((this.mAddingObserverCounter == 0) && (!this.mHandlingEvent)) {
      i = 0;
    } else {
      i = 1;
    }
    Lifecycle.State localState = calculateTargetState(paramLifecycleObserver);
    this.mAddingObserverCounter += 1;
    while ((localObserverWithState.mState.compareTo(localState) < 0) && (this.mObserverMap.contains(paramLifecycleObserver)))
    {
      pushParentState(localObserverWithState.mState);
      localObserverWithState.dispatchEvent(localLifecycleOwner, upEvent(localObserverWithState.mState));
      popParentState();
      localState = calculateTargetState(paramLifecycleObserver);
    }
    if (i == 0) {
      sync();
    }
    this.mAddingObserverCounter -= 1;
  }
  
  @NonNull
  public Lifecycle.State getCurrentState()
  {
    return this.mState;
  }
  
  public int getObserverCount()
  {
    return this.mObserverMap.size();
  }
  
  public void handleLifecycleEvent(@NonNull Lifecycle.Event paramEvent)
  {
    moveToState(getStateAfter(paramEvent));
  }
  
  @MainThread
  public void markState(@NonNull Lifecycle.State paramState)
  {
    moveToState(paramState);
  }
  
  public void removeObserver(@NonNull LifecycleObserver paramLifecycleObserver)
  {
    this.mObserverMap.remove(paramLifecycleObserver);
  }
  
  static class ObserverWithState
  {
    GenericLifecycleObserver mLifecycleObserver;
    Lifecycle.State mState;
    
    ObserverWithState(LifecycleObserver paramLifecycleObserver, Lifecycle.State paramState)
    {
      this.mLifecycleObserver = Lifecycling.getCallback(paramLifecycleObserver);
      this.mState = paramState;
    }
    
    void dispatchEvent(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
    {
      Lifecycle.State localState = LifecycleRegistry.getStateAfter(paramEvent);
      this.mState = LifecycleRegistry.min(this.mState, localState);
      this.mLifecycleObserver.onStateChanged(paramLifecycleOwner, paramEvent);
      this.mState = localState;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/lifecycle/LifecycleRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
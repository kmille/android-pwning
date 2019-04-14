package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SupportRequestManagerFragment
  extends Fragment
{
  private static final String TAG = "SupportRMFragment";
  private final Set<SupportRequestManagerFragment> childRequestManagerFragments = new HashSet();
  private final ActivityFragmentLifecycle lifecycle;
  @Nullable
  private Fragment parentFragmentHint;
  @Nullable
  private RequestManager requestManager;
  private final RequestManagerTreeNode requestManagerTreeNode = new SupportFragmentRequestManagerTreeNode();
  @Nullable
  private SupportRequestManagerFragment rootRequestManagerFragment;
  
  public SupportRequestManagerFragment()
  {
    this(new ActivityFragmentLifecycle());
  }
  
  @SuppressLint({"ValidFragment"})
  @VisibleForTesting
  public SupportRequestManagerFragment(@NonNull ActivityFragmentLifecycle paramActivityFragmentLifecycle)
  {
    this.lifecycle = paramActivityFragmentLifecycle;
  }
  
  private void addChildRequestManagerFragment(SupportRequestManagerFragment paramSupportRequestManagerFragment)
  {
    this.childRequestManagerFragments.add(paramSupportRequestManagerFragment);
  }
  
  @Nullable
  private Fragment getParentFragmentUsingHint()
  {
    Fragment localFragment = getParentFragment();
    if (localFragment != null) {
      return localFragment;
    }
    return this.parentFragmentHint;
  }
  
  private boolean isDescendant(@NonNull Fragment paramFragment)
  {
    Fragment localFragment1 = getParentFragmentUsingHint();
    for (;;)
    {
      Fragment localFragment2 = paramFragment.getParentFragment();
      if (localFragment2 == null) {
        break;
      }
      if (localFragment2.equals(localFragment1)) {
        return true;
      }
      paramFragment = paramFragment.getParentFragment();
    }
    return false;
  }
  
  private void registerFragmentWithRoot(@NonNull FragmentActivity paramFragmentActivity)
  {
    unregisterFragmentWithRoot();
    this.rootRequestManagerFragment = Glide.get(paramFragmentActivity).getRequestManagerRetriever().getSupportRequestManagerFragment(paramFragmentActivity);
    if (!equals(this.rootRequestManagerFragment)) {
      this.rootRequestManagerFragment.addChildRequestManagerFragment(this);
    }
  }
  
  private void removeChildRequestManagerFragment(SupportRequestManagerFragment paramSupportRequestManagerFragment)
  {
    this.childRequestManagerFragments.remove(paramSupportRequestManagerFragment);
  }
  
  private void unregisterFragmentWithRoot()
  {
    if (this.rootRequestManagerFragment != null)
    {
      this.rootRequestManagerFragment.removeChildRequestManagerFragment(this);
      this.rootRequestManagerFragment = null;
    }
  }
  
  @NonNull
  Set<SupportRequestManagerFragment> getDescendantRequestManagerFragments()
  {
    if (this.rootRequestManagerFragment == null) {
      return Collections.emptySet();
    }
    if (equals(this.rootRequestManagerFragment)) {
      return Collections.unmodifiableSet(this.childRequestManagerFragments);
    }
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.rootRequestManagerFragment.getDescendantRequestManagerFragments().iterator();
    while (localIterator.hasNext())
    {
      SupportRequestManagerFragment localSupportRequestManagerFragment = (SupportRequestManagerFragment)localIterator.next();
      if (isDescendant(localSupportRequestManagerFragment.getParentFragmentUsingHint())) {
        localHashSet.add(localSupportRequestManagerFragment);
      }
    }
    return Collections.unmodifiableSet(localHashSet);
  }
  
  @NonNull
  ActivityFragmentLifecycle getGlideLifecycle()
  {
    return this.lifecycle;
  }
  
  @Nullable
  public RequestManager getRequestManager()
  {
    return this.requestManager;
  }
  
  @NonNull
  public RequestManagerTreeNode getRequestManagerTreeNode()
  {
    return this.requestManagerTreeNode;
  }
  
  public void onAttach(Context paramContext)
  {
    super.onAttach(paramContext);
    try
    {
      registerFragmentWithRoot(getActivity());
      return;
    }
    catch (IllegalStateException paramContext)
    {
      for (;;) {}
    }
    Log.isLoggable("SupportRMFragment", 5);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.lifecycle.onDestroy();
    unregisterFragmentWithRoot();
  }
  
  public void onDetach()
  {
    super.onDetach();
    this.parentFragmentHint = null;
    unregisterFragmentWithRoot();
  }
  
  public void onStart()
  {
    super.onStart();
    this.lifecycle.onStart();
  }
  
  public void onStop()
  {
    super.onStop();
    this.lifecycle.onStop();
  }
  
  void setParentFragmentHint(@Nullable Fragment paramFragment)
  {
    this.parentFragmentHint = paramFragment;
    if ((paramFragment != null) && (paramFragment.getActivity() != null)) {
      registerFragmentWithRoot(paramFragment.getActivity());
    }
  }
  
  public void setRequestManager(@Nullable RequestManager paramRequestManager)
  {
    this.requestManager = paramRequestManager;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    localStringBuilder.append("{parent=");
    localStringBuilder.append(getParentFragmentUsingHint());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  class SupportFragmentRequestManagerTreeNode
    implements RequestManagerTreeNode
  {
    SupportFragmentRequestManagerTreeNode() {}
    
    @NonNull
    public Set<RequestManager> getDescendants()
    {
      Object localObject = SupportRequestManagerFragment.this.getDescendantRequestManagerFragments();
      HashSet localHashSet = new HashSet(((Set)localObject).size());
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        SupportRequestManagerFragment localSupportRequestManagerFragment = (SupportRequestManagerFragment)((Iterator)localObject).next();
        if (localSupportRequestManagerFragment.getRequestManager() != null) {
          localHashSet.add(localSupportRequestManagerFragment.getRequestManager());
        }
      }
      return localHashSet;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(super.toString());
      localStringBuilder.append("{fragment=");
      localStringBuilder.append(SupportRequestManagerFragment.this);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/manager/SupportRequestManagerFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
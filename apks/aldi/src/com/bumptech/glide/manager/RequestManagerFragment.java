package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Deprecated
public class RequestManagerFragment
  extends Fragment
{
  private static final String TAG = "RMFragment";
  private final Set<RequestManagerFragment> childRequestManagerFragments = new HashSet();
  private final ActivityFragmentLifecycle lifecycle;
  @Nullable
  private Fragment parentFragmentHint;
  @Nullable
  private RequestManager requestManager;
  private final RequestManagerTreeNode requestManagerTreeNode = new FragmentRequestManagerTreeNode();
  @Nullable
  private RequestManagerFragment rootRequestManagerFragment;
  
  public RequestManagerFragment()
  {
    this(new ActivityFragmentLifecycle());
  }
  
  @SuppressLint({"ValidFragment"})
  @VisibleForTesting
  RequestManagerFragment(@NonNull ActivityFragmentLifecycle paramActivityFragmentLifecycle)
  {
    this.lifecycle = paramActivityFragmentLifecycle;
  }
  
  private void addChildRequestManagerFragment(RequestManagerFragment paramRequestManagerFragment)
  {
    this.childRequestManagerFragments.add(paramRequestManagerFragment);
  }
  
  @TargetApi(17)
  @Nullable
  private Fragment getParentFragmentUsingHint()
  {
    Fragment localFragment;
    if (Build.VERSION.SDK_INT >= 17) {
      localFragment = getParentFragment();
    } else {
      localFragment = null;
    }
    if (localFragment != null) {
      return localFragment;
    }
    return this.parentFragmentHint;
  }
  
  @TargetApi(17)
  private boolean isDescendant(@NonNull Fragment paramFragment)
  {
    Fragment localFragment1 = getParentFragment();
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
  
  private void registerFragmentWithRoot(@NonNull Activity paramActivity)
  {
    unregisterFragmentWithRoot();
    this.rootRequestManagerFragment = Glide.get(paramActivity).getRequestManagerRetriever().getRequestManagerFragment(paramActivity);
    if (!equals(this.rootRequestManagerFragment)) {
      this.rootRequestManagerFragment.addChildRequestManagerFragment(this);
    }
  }
  
  private void removeChildRequestManagerFragment(RequestManagerFragment paramRequestManagerFragment)
  {
    this.childRequestManagerFragments.remove(paramRequestManagerFragment);
  }
  
  private void unregisterFragmentWithRoot()
  {
    if (this.rootRequestManagerFragment != null)
    {
      this.rootRequestManagerFragment.removeChildRequestManagerFragment(this);
      this.rootRequestManagerFragment = null;
    }
  }
  
  @TargetApi(17)
  @NonNull
  Set<RequestManagerFragment> getDescendantRequestManagerFragments()
  {
    if (equals(this.rootRequestManagerFragment)) {
      return Collections.unmodifiableSet(this.childRequestManagerFragments);
    }
    if ((this.rootRequestManagerFragment != null) && (Build.VERSION.SDK_INT >= 17))
    {
      HashSet localHashSet = new HashSet();
      Iterator localIterator = this.rootRequestManagerFragment.getDescendantRequestManagerFragments().iterator();
      while (localIterator.hasNext())
      {
        RequestManagerFragment localRequestManagerFragment = (RequestManagerFragment)localIterator.next();
        if (isDescendant(localRequestManagerFragment.getParentFragment())) {
          localHashSet.add(localRequestManagerFragment);
        }
      }
      return Collections.unmodifiableSet(localHashSet);
    }
    return Collections.emptySet();
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
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    try
    {
      registerFragmentWithRoot(paramActivity);
      return;
    }
    catch (IllegalStateException paramActivity)
    {
      for (;;) {}
    }
    Log.isLoggable("RMFragment", 5);
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
  
  class FragmentRequestManagerTreeNode
    implements RequestManagerTreeNode
  {
    FragmentRequestManagerTreeNode() {}
    
    @NonNull
    public Set<RequestManager> getDescendants()
    {
      Object localObject = RequestManagerFragment.this.getDescendantRequestManagerFragments();
      HashSet localHashSet = new HashSet(((Set)localObject).size());
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        RequestManagerFragment localRequestManagerFragment = (RequestManagerFragment)((Iterator)localObject).next();
        if (localRequestManagerFragment.getRequestManager() != null) {
          localHashSet.add(localRequestManagerFragment.getRequestManager());
        }
      }
      return localHashSet;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(super.toString());
      localStringBuilder.append("{fragment=");
      localStringBuilder.append(RequestManagerFragment.this);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/manager/RequestManagerFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
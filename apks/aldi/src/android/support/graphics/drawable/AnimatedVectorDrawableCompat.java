package android.support.graphics.drawable;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AnimatedVectorDrawableCompat
  extends VectorDrawableCommon
  implements Animatable2Compat
{
  private static final String ANIMATED_VECTOR = "animated-vector";
  private static final boolean DBG_ANIMATION_VECTOR_DRAWABLE = false;
  private static final String LOGTAG = "AnimatedVDCompat";
  private static final String TARGET = "target";
  private AnimatedVectorDrawableCompatState mAnimatedVectorState;
  ArrayList<Animatable2Compat.AnimationCallback> mAnimationCallbacks = null;
  private Animator.AnimatorListener mAnimatorListener = null;
  private ArgbEvaluator mArgbEvaluator = null;
  AnimatedVectorDrawableDelegateState mCachedConstantStateDelegate;
  final Drawable.Callback mCallback = new Drawable.Callback()
  {
    public void invalidateDrawable(Drawable paramAnonymousDrawable)
    {
      AnimatedVectorDrawableCompat.this.invalidateSelf();
    }
    
    public void scheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable, long paramAnonymousLong)
    {
      AnimatedVectorDrawableCompat.this.scheduleSelf(paramAnonymousRunnable, paramAnonymousLong);
    }
    
    public void unscheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable)
    {
      AnimatedVectorDrawableCompat.this.unscheduleSelf(paramAnonymousRunnable);
    }
  };
  private Context mContext;
  
  AnimatedVectorDrawableCompat()
  {
    this(null, null, null);
  }
  
  private AnimatedVectorDrawableCompat(@Nullable Context paramContext)
  {
    this(paramContext, null, null);
  }
  
  private AnimatedVectorDrawableCompat(@Nullable Context paramContext, @Nullable AnimatedVectorDrawableCompatState paramAnimatedVectorDrawableCompatState, @Nullable Resources paramResources)
  {
    this.mContext = paramContext;
    if (paramAnimatedVectorDrawableCompatState != null)
    {
      this.mAnimatedVectorState = paramAnimatedVectorDrawableCompatState;
      return;
    }
    this.mAnimatedVectorState = new AnimatedVectorDrawableCompatState(paramContext, paramAnimatedVectorDrawableCompatState, this.mCallback, paramResources);
  }
  
  public static void clearAnimationCallbacks(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      if (!(paramDrawable instanceof Animatable)) {
        return;
      }
      if (Build.VERSION.SDK_INT >= 24)
      {
        ((AnimatedVectorDrawable)paramDrawable).clearAnimationCallbacks();
        return;
      }
      ((AnimatedVectorDrawableCompat)paramDrawable).clearAnimationCallbacks();
    }
  }
  
  @Nullable
  public static AnimatedVectorDrawableCompat create(@NonNull Context paramContext, @DrawableRes int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 24)
    {
      localObject = new AnimatedVectorDrawableCompat(paramContext);
      ((AnimatedVectorDrawableCompat)localObject).mDelegateDrawable = ResourcesCompat.getDrawable(paramContext.getResources(), paramInt, paramContext.getTheme());
      ((AnimatedVectorDrawableCompat)localObject).mDelegateDrawable.setCallback(((AnimatedVectorDrawableCompat)localObject).mCallback);
      ((AnimatedVectorDrawableCompat)localObject).mCachedConstantStateDelegate = new AnimatedVectorDrawableDelegateState(((AnimatedVectorDrawableCompat)localObject).mDelegateDrawable.getConstantState());
      return (AnimatedVectorDrawableCompat)localObject;
    }
    Object localObject = paramContext.getResources();
    try
    {
      localObject = ((Resources)localObject).getXml(paramInt);
      AttributeSet localAttributeSet = Xml.asAttributeSet((XmlPullParser)localObject);
      do
      {
        paramInt = ((XmlPullParser)localObject).next();
      } while ((paramInt != 2) && (paramInt != 1));
      if (paramInt == 2) {
        return createFromXmlInner(paramContext, paramContext.getResources(), (XmlPullParser)localObject, localAttributeSet, paramContext.getTheme());
      }
      throw new XmlPullParserException("No start tag found");
    }
    catch (XmlPullParserException|IOException paramContext)
    {
      Log.e("AnimatedVDCompat", "parser error", paramContext);
    }
    return null;
  }
  
  public static AnimatedVectorDrawableCompat createFromXmlInner(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    paramContext = new AnimatedVectorDrawableCompat(paramContext);
    paramContext.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return paramContext;
  }
  
  public static void registerAnimationCallback(Drawable paramDrawable, Animatable2Compat.AnimationCallback paramAnimationCallback)
  {
    if (paramDrawable != null)
    {
      if (paramAnimationCallback == null) {
        return;
      }
      if (!(paramDrawable instanceof Animatable)) {
        return;
      }
      if (Build.VERSION.SDK_INT >= 24)
      {
        registerPlatformCallback((AnimatedVectorDrawable)paramDrawable, paramAnimationCallback);
        return;
      }
      ((AnimatedVectorDrawableCompat)paramDrawable).registerAnimationCallback(paramAnimationCallback);
    }
  }
  
  @RequiresApi(23)
  private static void registerPlatformCallback(@NonNull AnimatedVectorDrawable paramAnimatedVectorDrawable, @NonNull Animatable2Compat.AnimationCallback paramAnimationCallback)
  {
    paramAnimatedVectorDrawable.registerAnimationCallback(paramAnimationCallback.getPlatformCallback());
  }
  
  private void removeAnimatorSetListener()
  {
    if (this.mAnimatorListener != null)
    {
      this.mAnimatedVectorState.mAnimatorSet.removeListener(this.mAnimatorListener);
      this.mAnimatorListener = null;
    }
  }
  
  private void setupAnimatorsForTarget(String paramString, Animator paramAnimator)
  {
    paramAnimator.setTarget(this.mAnimatedVectorState.mVectorDrawable.getTargetByName(paramString));
    if (Build.VERSION.SDK_INT < 21) {
      setupColorAnimator(paramAnimator);
    }
    if (this.mAnimatedVectorState.mAnimators == null)
    {
      this.mAnimatedVectorState.mAnimators = new ArrayList();
      this.mAnimatedVectorState.mTargetNameMap = new ArrayMap();
    }
    this.mAnimatedVectorState.mAnimators.add(paramAnimator);
    this.mAnimatedVectorState.mTargetNameMap.put(paramAnimator, paramString);
  }
  
  private void setupColorAnimator(Animator paramAnimator)
  {
    Object localObject;
    if ((paramAnimator instanceof AnimatorSet))
    {
      localObject = ((AnimatorSet)paramAnimator).getChildAnimations();
      if (localObject != null)
      {
        int i = 0;
        while (i < ((List)localObject).size())
        {
          setupColorAnimator((Animator)((List)localObject).get(i));
          i += 1;
        }
      }
    }
    if ((paramAnimator instanceof ObjectAnimator))
    {
      paramAnimator = (ObjectAnimator)paramAnimator;
      localObject = paramAnimator.getPropertyName();
      if (("fillColor".equals(localObject)) || ("strokeColor".equals(localObject)))
      {
        if (this.mArgbEvaluator == null) {
          this.mArgbEvaluator = new ArgbEvaluator();
        }
        paramAnimator.setEvaluator(this.mArgbEvaluator);
      }
    }
  }
  
  public static boolean unregisterAnimationCallback(Drawable paramDrawable, Animatable2Compat.AnimationCallback paramAnimationCallback)
  {
    if (paramDrawable != null)
    {
      if (paramAnimationCallback == null) {
        return false;
      }
      if (!(paramDrawable instanceof Animatable)) {
        return false;
      }
      if (Build.VERSION.SDK_INT >= 24) {
        return unregisterPlatformCallback((AnimatedVectorDrawable)paramDrawable, paramAnimationCallback);
      }
      return ((AnimatedVectorDrawableCompat)paramDrawable).unregisterAnimationCallback(paramAnimationCallback);
    }
    return false;
  }
  
  @RequiresApi(23)
  private static boolean unregisterPlatformCallback(AnimatedVectorDrawable paramAnimatedVectorDrawable, Animatable2Compat.AnimationCallback paramAnimationCallback)
  {
    return paramAnimatedVectorDrawable.unregisterAnimationCallback(paramAnimationCallback.getPlatformCallback());
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    if (this.mDelegateDrawable != null) {
      DrawableCompat.applyTheme(this.mDelegateDrawable, paramTheme);
    }
  }
  
  public boolean canApplyTheme()
  {
    if (this.mDelegateDrawable != null) {
      return DrawableCompat.canApplyTheme(this.mDelegateDrawable);
    }
    return false;
  }
  
  public void clearAnimationCallbacks()
  {
    if (this.mDelegateDrawable != null)
    {
      ((AnimatedVectorDrawable)this.mDelegateDrawable).clearAnimationCallbacks();
      return;
    }
    removeAnimatorSetListener();
    if (this.mAnimationCallbacks == null) {
      return;
    }
    this.mAnimationCallbacks.clear();
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.mDelegateDrawable != null)
    {
      this.mDelegateDrawable.draw(paramCanvas);
      return;
    }
    this.mAnimatedVectorState.mVectorDrawable.draw(paramCanvas);
    if (this.mAnimatedVectorState.mAnimatorSet.isStarted()) {
      invalidateSelf();
    }
  }
  
  public int getAlpha()
  {
    if (this.mDelegateDrawable != null) {
      return DrawableCompat.getAlpha(this.mDelegateDrawable);
    }
    return this.mAnimatedVectorState.mVectorDrawable.getAlpha();
  }
  
  public int getChangingConfigurations()
  {
    if (this.mDelegateDrawable != null) {
      return this.mDelegateDrawable.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | this.mAnimatedVectorState.mChangingConfigurations;
  }
  
  public Drawable.ConstantState getConstantState()
  {
    if ((this.mDelegateDrawable != null) && (Build.VERSION.SDK_INT >= 24)) {
      return new AnimatedVectorDrawableDelegateState(this.mDelegateDrawable.getConstantState());
    }
    return null;
  }
  
  public int getIntrinsicHeight()
  {
    if (this.mDelegateDrawable != null) {
      return this.mDelegateDrawable.getIntrinsicHeight();
    }
    return this.mAnimatedVectorState.mVectorDrawable.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    if (this.mDelegateDrawable != null) {
      return this.mDelegateDrawable.getIntrinsicWidth();
    }
    return this.mAnimatedVectorState.mVectorDrawable.getIntrinsicWidth();
  }
  
  public int getOpacity()
  {
    if (this.mDelegateDrawable != null) {
      return this.mDelegateDrawable.getOpacity();
    }
    return this.mAnimatedVectorState.mVectorDrawable.getOpacity();
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
    throws XmlPullParserException, IOException
  {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    if (this.mDelegateDrawable != null)
    {
      DrawableCompat.inflate(this.mDelegateDrawable, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    int i = paramXmlPullParser.getEventType();
    int j = paramXmlPullParser.getDepth();
    while ((i != 1) && ((paramXmlPullParser.getDepth() >= j + 1) || (i != 3)))
    {
      if (i == 2)
      {
        Object localObject = paramXmlPullParser.getName();
        TypedArray localTypedArray;
        if ("animated-vector".equals(localObject))
        {
          localTypedArray = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE);
          i = localTypedArray.getResourceId(0, 0);
          localObject = localTypedArray;
          if (i != 0)
          {
            localObject = VectorDrawableCompat.create(paramResources, i, paramTheme);
            ((VectorDrawableCompat)localObject).setAllowCaching(false);
            ((VectorDrawableCompat)localObject).setCallback(this.mCallback);
            if (this.mAnimatedVectorState.mVectorDrawable != null) {
              this.mAnimatedVectorState.mVectorDrawable.setCallback(null);
            }
            this.mAnimatedVectorState.mVectorDrawable = ((VectorDrawableCompat)localObject);
            localObject = localTypedArray;
          }
        }
        for (;;)
        {
          ((TypedArray)localObject).recycle();
          break label273;
          if (!"target".equals(localObject)) {
            break label273;
          }
          localTypedArray = paramResources.obtainAttributes(paramAttributeSet, AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE_TARGET);
          String str = localTypedArray.getString(0);
          i = localTypedArray.getResourceId(1, 0);
          localObject = localTypedArray;
          if (i != 0)
          {
            if (this.mContext == null) {
              break;
            }
            setupAnimatorsForTarget(str, AnimatorInflaterCompat.loadAnimator(this.mContext, i));
            localObject = localTypedArray;
          }
        }
        localTypedArray.recycle();
        throw new IllegalStateException("Context can't be null when inflating animators");
      }
      label273:
      i = paramXmlPullParser.next();
    }
    this.mAnimatedVectorState.setupAnimatorSet();
  }
  
  public boolean isAutoMirrored()
  {
    if (this.mDelegateDrawable != null) {
      return DrawableCompat.isAutoMirrored(this.mDelegateDrawable);
    }
    return this.mAnimatedVectorState.mVectorDrawable.isAutoMirrored();
  }
  
  public boolean isRunning()
  {
    if (this.mDelegateDrawable != null) {
      return ((AnimatedVectorDrawable)this.mDelegateDrawable).isRunning();
    }
    return this.mAnimatedVectorState.mAnimatorSet.isRunning();
  }
  
  public boolean isStateful()
  {
    if (this.mDelegateDrawable != null) {
      return this.mDelegateDrawable.isStateful();
    }
    return this.mAnimatedVectorState.mVectorDrawable.isStateful();
  }
  
  public Drawable mutate()
  {
    if (this.mDelegateDrawable != null) {
      this.mDelegateDrawable.mutate();
    }
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    if (this.mDelegateDrawable != null)
    {
      this.mDelegateDrawable.setBounds(paramRect);
      return;
    }
    this.mAnimatedVectorState.mVectorDrawable.setBounds(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    if (this.mDelegateDrawable != null) {
      return this.mDelegateDrawable.setLevel(paramInt);
    }
    return this.mAnimatedVectorState.mVectorDrawable.setLevel(paramInt);
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.mDelegateDrawable != null) {
      return this.mDelegateDrawable.setState(paramArrayOfInt);
    }
    return this.mAnimatedVectorState.mVectorDrawable.setState(paramArrayOfInt);
  }
  
  public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback paramAnimationCallback)
  {
    if (this.mDelegateDrawable != null)
    {
      registerPlatformCallback((AnimatedVectorDrawable)this.mDelegateDrawable, paramAnimationCallback);
      return;
    }
    if (paramAnimationCallback == null) {
      return;
    }
    if (this.mAnimationCallbacks == null) {
      this.mAnimationCallbacks = new ArrayList();
    }
    if (this.mAnimationCallbacks.contains(paramAnimationCallback)) {
      return;
    }
    this.mAnimationCallbacks.add(paramAnimationCallback);
    if (this.mAnimatorListener == null) {
      this.mAnimatorListener = new AnimatorListenerAdapter()
      {
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          paramAnonymousAnimator = new ArrayList(AnimatedVectorDrawableCompat.this.mAnimationCallbacks);
          int j = paramAnonymousAnimator.size();
          int i = 0;
          while (i < j)
          {
            ((Animatable2Compat.AnimationCallback)paramAnonymousAnimator.get(i)).onAnimationEnd(AnimatedVectorDrawableCompat.this);
            i += 1;
          }
        }
        
        public void onAnimationStart(Animator paramAnonymousAnimator)
        {
          paramAnonymousAnimator = new ArrayList(AnimatedVectorDrawableCompat.this.mAnimationCallbacks);
          int j = paramAnonymousAnimator.size();
          int i = 0;
          while (i < j)
          {
            ((Animatable2Compat.AnimationCallback)paramAnonymousAnimator.get(i)).onAnimationStart(AnimatedVectorDrawableCompat.this);
            i += 1;
          }
        }
      };
    }
    this.mAnimatedVectorState.mAnimatorSet.addListener(this.mAnimatorListener);
  }
  
  public void setAlpha(int paramInt)
  {
    if (this.mDelegateDrawable != null)
    {
      this.mDelegateDrawable.setAlpha(paramInt);
      return;
    }
    this.mAnimatedVectorState.mVectorDrawable.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    if (this.mDelegateDrawable != null)
    {
      DrawableCompat.setAutoMirrored(this.mDelegateDrawable, paramBoolean);
      return;
    }
    this.mAnimatedVectorState.mVectorDrawable.setAutoMirrored(paramBoolean);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.mDelegateDrawable != null)
    {
      this.mDelegateDrawable.setColorFilter(paramColorFilter);
      return;
    }
    this.mAnimatedVectorState.mVectorDrawable.setColorFilter(paramColorFilter);
  }
  
  public void setTint(int paramInt)
  {
    if (this.mDelegateDrawable != null)
    {
      DrawableCompat.setTint(this.mDelegateDrawable, paramInt);
      return;
    }
    this.mAnimatedVectorState.mVectorDrawable.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    if (this.mDelegateDrawable != null)
    {
      DrawableCompat.setTintList(this.mDelegateDrawable, paramColorStateList);
      return;
    }
    this.mAnimatedVectorState.mVectorDrawable.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    if (this.mDelegateDrawable != null)
    {
      DrawableCompat.setTintMode(this.mDelegateDrawable, paramMode);
      return;
    }
    this.mAnimatedVectorState.mVectorDrawable.setTintMode(paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.mDelegateDrawable != null) {
      return this.mDelegateDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    this.mAnimatedVectorState.mVectorDrawable.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void start()
  {
    if (this.mDelegateDrawable != null)
    {
      ((AnimatedVectorDrawable)this.mDelegateDrawable).start();
      return;
    }
    if (this.mAnimatedVectorState.mAnimatorSet.isStarted()) {
      return;
    }
    this.mAnimatedVectorState.mAnimatorSet.start();
    invalidateSelf();
  }
  
  public void stop()
  {
    if (this.mDelegateDrawable != null)
    {
      ((AnimatedVectorDrawable)this.mDelegateDrawable).stop();
      return;
    }
    this.mAnimatedVectorState.mAnimatorSet.end();
  }
  
  public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback paramAnimationCallback)
  {
    if (this.mDelegateDrawable != null) {
      unregisterPlatformCallback((AnimatedVectorDrawable)this.mDelegateDrawable, paramAnimationCallback);
    }
    if ((this.mAnimationCallbacks != null) && (paramAnimationCallback != null))
    {
      boolean bool = this.mAnimationCallbacks.remove(paramAnimationCallback);
      if (this.mAnimationCallbacks.size() == 0) {
        removeAnimatorSetListener();
      }
      return bool;
    }
    return false;
  }
  
  static class AnimatedVectorDrawableCompatState
    extends Drawable.ConstantState
  {
    AnimatorSet mAnimatorSet;
    ArrayList<Animator> mAnimators;
    int mChangingConfigurations;
    ArrayMap<Animator, String> mTargetNameMap;
    VectorDrawableCompat mVectorDrawable;
    
    public AnimatedVectorDrawableCompatState(Context paramContext, AnimatedVectorDrawableCompatState paramAnimatedVectorDrawableCompatState, Drawable.Callback paramCallback, Resources paramResources)
    {
      if (paramAnimatedVectorDrawableCompatState != null)
      {
        this.mChangingConfigurations = paramAnimatedVectorDrawableCompatState.mChangingConfigurations;
        paramContext = paramAnimatedVectorDrawableCompatState.mVectorDrawable;
        int i = 0;
        if (paramContext != null)
        {
          paramContext = paramAnimatedVectorDrawableCompatState.mVectorDrawable.getConstantState();
          if (paramResources != null) {}
          for (paramContext = paramContext.newDrawable(paramResources);; paramContext = paramContext.newDrawable())
          {
            this.mVectorDrawable = ((VectorDrawableCompat)paramContext);
            break;
          }
          this.mVectorDrawable = ((VectorDrawableCompat)this.mVectorDrawable.mutate());
          this.mVectorDrawable.setCallback(paramCallback);
          this.mVectorDrawable.setBounds(paramAnimatedVectorDrawableCompatState.mVectorDrawable.getBounds());
          this.mVectorDrawable.setAllowCaching(false);
        }
        if (paramAnimatedVectorDrawableCompatState.mAnimators != null)
        {
          int j = paramAnimatedVectorDrawableCompatState.mAnimators.size();
          this.mAnimators = new ArrayList(j);
          this.mTargetNameMap = new ArrayMap(j);
          while (i < j)
          {
            paramCallback = (Animator)paramAnimatedVectorDrawableCompatState.mAnimators.get(i);
            paramContext = paramCallback.clone();
            paramCallback = (String)paramAnimatedVectorDrawableCompatState.mTargetNameMap.get(paramCallback);
            paramContext.setTarget(this.mVectorDrawable.getTargetByName(paramCallback));
            this.mAnimators.add(paramContext);
            this.mTargetNameMap.put(paramContext, paramCallback);
            i += 1;
          }
          setupAnimatorSet();
        }
      }
    }
    
    public int getChangingConfigurations()
    {
      return this.mChangingConfigurations;
    }
    
    public Drawable newDrawable()
    {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
    
    public void setupAnimatorSet()
    {
      if (this.mAnimatorSet == null) {
        this.mAnimatorSet = new AnimatorSet();
      }
      this.mAnimatorSet.playTogether(this.mAnimators);
    }
  }
  
  @RequiresApi(24)
  static class AnimatedVectorDrawableDelegateState
    extends Drawable.ConstantState
  {
    private final Drawable.ConstantState mDelegateState;
    
    public AnimatedVectorDrawableDelegateState(Drawable.ConstantState paramConstantState)
    {
      this.mDelegateState = paramConstantState;
    }
    
    public boolean canApplyTheme()
    {
      return this.mDelegateState.canApplyTheme();
    }
    
    public int getChangingConfigurations()
    {
      return this.mDelegateState.getChangingConfigurations();
    }
    
    public Drawable newDrawable()
    {
      AnimatedVectorDrawableCompat localAnimatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
      localAnimatedVectorDrawableCompat.mDelegateDrawable = this.mDelegateState.newDrawable();
      localAnimatedVectorDrawableCompat.mDelegateDrawable.setCallback(localAnimatedVectorDrawableCompat.mCallback);
      return localAnimatedVectorDrawableCompat;
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      AnimatedVectorDrawableCompat localAnimatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
      localAnimatedVectorDrawableCompat.mDelegateDrawable = this.mDelegateState.newDrawable(paramResources);
      localAnimatedVectorDrawableCompat.mDelegateDrawable.setCallback(localAnimatedVectorDrawableCompat.mCallback);
      return localAnimatedVectorDrawableCompat;
    }
    
    public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      AnimatedVectorDrawableCompat localAnimatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
      localAnimatedVectorDrawableCompat.mDelegateDrawable = this.mDelegateState.newDrawable(paramResources, paramTheme);
      localAnimatedVectorDrawableCompat.mDelegateDrawable.setCallback(localAnimatedVectorDrawableCompat.mCallback);
      return localAnimatedVectorDrawableCompat;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/graphics/drawable/AnimatedVectorDrawableCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
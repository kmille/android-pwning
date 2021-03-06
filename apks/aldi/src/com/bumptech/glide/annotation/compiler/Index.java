package com.bumptech.glide.annotation.compiler;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.TYPE})
@interface Index
{
  String[] extensions() default {};
  
  String[] modules() default {};
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/annotation/compiler/Index.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
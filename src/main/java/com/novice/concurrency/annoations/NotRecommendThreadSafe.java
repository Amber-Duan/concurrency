package com.novice.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 推荐写法的类
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface NotRecommendThreadSafe {
    String value() default "";
}

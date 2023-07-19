package com.yuncitys.smart.merge.annonation;

import org.springframework.cache.interceptor.DefaultKeyGenerator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author smart
 * @create 2018/2/1.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface CacheClear {

    public String pre() default "";

    public String key() default "";

    public String[] keys() default "";

}

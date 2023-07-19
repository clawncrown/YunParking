package com.yuncitys.smart.merge.annonation;

import com.yuncitys.smart.merge.facade.DefaultMergeResultParser;
import com.yuncitys.smart.merge.facade.IMergeResultParser;

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
public @interface Cache {

    public String key() default "";

    /**
     * 返回类型
     *
     * @return
     * @author Ace
     * @date 2017年5月4日
     */
    public Class[] result() default Object.class;

}

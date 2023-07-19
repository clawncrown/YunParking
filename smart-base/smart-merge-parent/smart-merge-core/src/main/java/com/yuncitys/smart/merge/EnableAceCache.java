package com.yuncitys.smart.merge;

import com.yuncitys.smart.merge.configuration.MergeAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author ace
 * @create 2017/11/17.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(MergeAutoConfiguration.class)
@Documented
@Inherited
public @interface EnableAceCache {
}
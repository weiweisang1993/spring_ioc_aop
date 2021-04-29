package com.service.annoation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ：炜哥
 * @date ：创建于 2021/4/29 16:24
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RunBefore {
    String run_name() default "这是默认的值";
}

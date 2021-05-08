package com.service.annoation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ：炜哥
 * @date ：创建于 2021/4/29 8:22 下午
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface CanBeNull {
}

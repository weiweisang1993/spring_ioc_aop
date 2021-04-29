package com.service.annoation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ：炜哥
 * @date ：创建于 2021/4/29 9:43
 * @description：验签注解
 * @modified By：
 * @version: 1.0
 */
@Target({ElementType.METHOD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SignCheck {

    //基本数据类型
    int iValue();
    double douValue();
    long lonValue();
    float floValue();
    char chValue();
    boolean booValue();
    short shoValue();
    byte byteValue();

    //字符串类型，注意跟char的区别
    String stringValue();

    //注解类
    ExampleAnnoation annocationValue();

    //Class
    Class<?> classValue();

    //枚举类
    WeekEnum enumValue();

    //还有一些数组，下面就举一个例子
    int[] iListValue();

}

enum WeekEnum{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}

@interface ExampleAnnoation{

}

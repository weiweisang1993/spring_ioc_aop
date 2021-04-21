package com.service.ClassAnalysis;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ：炜哥
 * @description：TODO
 * @date ：2021/4/17 17:04
 */
public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("com.service.ClassAnalysis.Dog");//Dog类里没有无参构造方法
        //Dog dog = (Dog) c.newInstance();//直接抛InstantiationException异常

        Constructor constructor = c.getConstructor(String.class);
        Dog dog = (Dog) constructor.newInstance();

    }
}

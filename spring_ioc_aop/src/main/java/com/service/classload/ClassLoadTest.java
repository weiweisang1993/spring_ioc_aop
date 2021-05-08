package com.service.classload;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class ClassLoadTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Dog dog1 = new Dog("旺财");
        Dog dog2 = new Dog("小黑" + "ds");
        Class c = Class.forName("com.service.classload.Dog");//为了测试，加了无参构造
        Dog dog3 = (Dog) c.newInstance();
        System.out.println(dog1.getClass() == dog2.getClass());
        System.out.println(dog1.getClass() == dog3.getClass());

        new ArrayList<Integer>();




    }
}

package com.service.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ：炜哥
 * @date ：创建于 2021/4/27 10:39
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class clazz = Class.forName("com.service.reflection.Animal");

        //反射构造类测试

        //获取公有有参构造类
        /*Constructor public_params_constructor = clazz.getConstructor(String.class, Integer.class);
        System.out.println("获取公有有参构造类：" + public_params_constructor);

        //获取私有无参构造类
        Constructor private_params_construtor = clazz.getDeclaredConstructor(null);
        private_params_construtor.setAccessible(true);//设置允许访问，忽略修饰符
        System.out.println("获取私有无参构造类：" + private_params_construtor);

        //两者都可以通过newInstance来创建独享
        Object obj = private_params_construtor.newInstance();
        obj = public_params_constructor.newInstance("狗子", 10);;

        Animal animal = (Animal) obj;
        System.out.println("年龄" + animal.age);*/

        //获取私有字段
        /*Field private_field = clazz.getDeclaredField("name");
        System.out.println("获取私有成员变量：" + private_field);
        //获取公共字段
        Field public_field = clazz.getField("age");
        System.out.println("获取公共成员变量：" + public_field);

        //调用字段
        Object o = clazz.getConstructor(String.class, Integer.class).newInstance("狗子", 10);
        public_field.set(o, 5);
        private_field.setAccessible(true);//暴力反射，解除私有限定
        private_field.set(o, "小白");
        Animal animal = (Animal) o;
        System.out.println("狗的年龄：" + animal.age);*/


        //获取公有方法
        Method public_method = clazz.getMethod("showName", String.class);
        System.out.println("公共方法：" + public_method);

        Method private_method = clazz.getDeclaredMethod("showAge", int.class);
        System.out.println("私有方法：" + private_method);

        //调用字段
        Object o = clazz.getConstructor(String.class, Integer.class).newInstance("狗子", 10);
        public_method.invoke(o,"小黑");
        private_method.setAccessible(true);//暴力反射
        private_method.invoke(o,4);

        Animal animal = (Animal) o;
        System.out.println("狗的年龄：" + animal.age);
    }

}

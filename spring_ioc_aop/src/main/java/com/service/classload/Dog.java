package com.service.classload;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 炜哥
 * @since 2021-04-18 11:01:41
 *
 * 执行顺序：（优先级从高到低。）静态代码块>构造代码块>构造方法>普通方法。
 * 其中静态代码块只执行一次。构造代码块在每次创建对象是都会执行。
 */
public class Dog {

    //默认狗狗的最大年龄是16岁
    private static int dog_max_age = 16;

    //狗的名字
    private String dog_name;

    public Dog() {
    }

    {
        System.out.println("狗狗的构造代码块");
    }

    static {
        System.out.println("狗狗的静态代码块");
    }

    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();
        animals.add("小狗");
        animals.add("小猫");

    }

    public Dog(String dog_name) {
        this.dog_name = dog_name;
    }

    public void getDogInfo(){
        System.out.println("名字是:"+dog_name + "  年龄：" + dog_max_age);
    }
    //狗叫

    public static void barking(){
        System.out.println("汪汪汪~~~");
    }
}

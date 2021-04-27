package com.service.reflection;

/**
 * @author ：炜哥
 * @date ：创建于 2021/4/27 10:08
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Animal {

    //私有成员变量
    private String name = "动物";

    //公有成员变量
    public int age = 7;

    //无参构造函数
    private Animal() {
        System.out.println("调用公有无参构造方法");
    }

    //公有有参构造函数
    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("调用公有构造方法name:" + this.name + " age:" + this.age);
    }

    //私有有参构造函数
    private Animal(String name) {
        System.out.println("调用私有构造方法name:" + this.name);
    }

    //公有成员方法
    public void showName(String name) {
        System.out.println("调用公有成员方法，输入名字：" + name + " 内部name:" + this.name);
    }

    //私有成员方法
    private void showAge(int age) {
        System.out.println("调用私有成员方法，输入年龄：" + age);
    }

    //main方法
    public static void main(String[] args) {
        System.out.println("调用main方法");
    }
}

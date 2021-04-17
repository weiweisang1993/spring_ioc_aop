package com.service.dynamic_proxy;

import com.service.static_proxy.SaveMoney;
import com.service.static_proxy.SaveMoneyToBankImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理测试
 *
 * @author ：炜哥
 * @description：TODO
 * @date ：2021/4/14 16:36
 */
public class SaveProxyTest {

    public static void main(String[] args) {

        //定义一个炜哥存钱10000元的实际对象，炜哥要去存10000元了
        SaveMoney saveMoney = new SaveMoneyToBankImpl("炜哥",10000);

        /**
         * 炜哥把要存的一万元和身份信息交给银行工作人员（生成一个代理对象）
         *
         * 代理对象的调用处理程序
         * 你可以把它想象成一个“传入真实对象生成代理对象”的程序，其内置的invoke()方法会最终调用真实对象的方法
         */
        InvocationHandler invocationHandler = new ProxyHandler(saveMoney);

        /**
         * 通过newProxyInstance创建一个代理对象
         *
         * 第一个参数 the class loader to define the dynamic_proxy class
         * 产生指定代理对象的类加载器
         *
         * 第二个参数 the list of interfaces for the dynamic_proxy class to implement
         * 需要实现的实际对象接口列表
         *
         * 第三个参数 invocationHandler的invoke方法the invocation handler to dispatch method invocations to
         * 一个把method方法派给代理的处理程序，即拦截method和实现对应
         *
         * 返回参数
         * a dynamic_proxy instance with the specified invocation handler of a that is defined by the specified class loader
         * and that implements the specified interfaces
         * 返回一个代理对象，该对象是被指定的类加载器定义并且实现了指定接口
         *
         */
        SaveMoney saveMoneyProxy = (SaveMoney) Proxy.newProxyInstance(
                saveMoney.getClass().getClassLoader(),
                saveMoney.getClass().getInterfaces(),
                invocationHandler);

        saveMoneyProxy.saveMoney();
    }
}

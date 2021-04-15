package com.service.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author ：炜哥
 * @description：TODO
 * @date ：2021/4/14 16:36
 */
public class AdminServiceDynamicProxy {

    public static void main(String[] args) {

        TeacherServiceImpl teacherServiceimpl = new TeacherServiceImpl();

        /**
         * 代理对象的调用处理程序
         * 你可以把它想象成一个“传入真实对象生成代理对象”的程序，其内置的invoke()方法会最终调用真实对象的方法
         */
        InvocationHandler invocationHandler = new ProxyHandler(teacherServiceimpl);

        /**
         * 通过newProxyInstance创建一个代理对象
         *
         * 第一个参数 类加载器 the class loader to define the proxy class
         * 第二个参数 需要实现的代理类接口列表 the list of interfaces for the proxy class to implement
         * 第三个参数 一个把method方法派给代理的处理程序the invocation handler to dispatch method invocations to
         *
         * 返回参数 返回一个代理对象，该对象是被被指定的类加载器定义并且实现了指定接口
         * a proxy instance with the specified invocation handler of a that is defined by the specified class loader
         * and that implements the specified interfaces
         */
        TeacherService proxyForTeacherService = (TeacherService) Proxy.newProxyInstance(
                teacherServiceimpl.getClass().getClassLoader(),
                teacherServiceimpl.getClass().getInterfaces(),
                invocationHandler);

        System.out.println(proxyForTeacherService.say());
    }
}

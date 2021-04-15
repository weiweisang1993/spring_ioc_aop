package com.service.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ：炜哥
 * @description：TODO
 * @date ：2021/4/15 14:20
 */
public class ProxyHandler implements InvocationHandler {

    //需要代理的真实对象
    private Object target;

    //真实对象赋值
    public ProxyHandler(Object target) {
        this.target = target;
    }

    /**
     * proxy:代理类代理的真实代理对象com.sun.proxy.$Proxy0
     * method:我们所要调用某个对象真实的方法的Method对象
     * args:指代代理对象方法传递的参数
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke before");
        Object o = method.invoke(target);
        System.out.println("invoke after");
        return o;
    }
}

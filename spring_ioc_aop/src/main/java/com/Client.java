package com;

/**
 * @author ：炜哥
 * @description：TODO
 * @date ：2021/4/9 14:37
 */

import com.factory.BeanFactory;
import com.service.AocExampleService;
import com.service.impl.AocExampleServiceImpl;

/**
 * 表现层，调用业务流程
 */
public class Client {


    public static void main(String[] args) {
        //AocExampleService as = new AocExampleServiceImpl();

        AocExampleService as = (AocExampleService) BeanFactory.getBean("aocservice");
        as.saveAccount();
    }
}

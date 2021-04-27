package com.service.impl;

import com.dao.AocExampleMapper;
import com.dao.impl.AocExampleMapperImpl;
import com.factory.BeanFactory;
import com.service.AocExampleService;

import java.lang.reflect.Constructor;

/**
 * @author ：炜哥
 * @description：TODO
 * @date ：2021/4/9 14:35
 */
public class AocExampleServiceImpl implements AocExampleService {

    //AocExampleMapper aocExampleMapper = new AocExampleMapperImpl();

    AocExampleMapper aocExampleMapper = (AocExampleMapper) BeanFactory.getBean("aocmapper");

    public void saveAccount() {
        aocExampleMapper.saveAccount();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("com.Student");
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }

}

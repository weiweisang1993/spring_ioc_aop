package com.service.annoation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author ：炜哥
 * @date ：创建于 2021/4/29 16:26
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class AnnocationTest {

    public static void main(String[] args) throws NoSuchMethodException {
        Class<AnnocationTest> annocationTestClass = AnnocationTest.class;
        //反射获取testAnnocation方法
        Method method = annocationTestClass.getMethod("testAnnocation");

        //判断是否存在某个注解对象
        boolean isExist = method.isAnnotationPresent(RunBefore.class);
        System.out.println("是否存在目标注解：" + isExist);

        //反射获取目标注解对象
        RunBefore runBefore = method.getAnnotation(RunBefore.class);
        System.out.println("注解对象属性：" + runBefore.run_name());


    }

    @RunBefore(run_name = "测试注解运行")
    public void testAnnocation() {

    }
}

package com.factory;

/**
 * @author ：炜哥
 * @description：TODO
 * @date ：2021/4/9 14:42
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 一个创建bean对象的工厂
 * <p>
 * <p>
 * Bean:在计算机英语中，有可重用组件的意义
 * JavaBean：用java语言编写的实体类
 * javaBean>实体类
 * <p>
 * 用来创建service和dao对象的工厂
 * <p>
 * 1.配置文件来读取service和dao 的类路径
 * 2.读取后，通过反射创建对象
 */
public class BeanFactory {


    //定义一个properties对象
    private static Properties properties;

    //定义一个用于存储创建的对象，称之为容器
    private static Map<String,Object> beans;

    //使用静态方法为properties赋值
    static {
        try {
            //实例化对象
            properties = new Properties();
            //获取properties的文件流对象
            //注意，这里其实也用到了反射来获取配置文件
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            properties.load(in);
            beans = new HashMap<String, Object>();
            //取出配置文件中所有的key
            Enumeration keys = properties.keys();
            //遍历枚举
            while(keys.hasMoreElements()){
                //key
                String key = keys.nextElement().toString();
                //value
                String beanPath = properties.getProperty(key);
                //通过反射创建对象
                try {
                    Object value = Class.forName(beanPath).newInstance();
                    //存入容器
                    beans.put(key,value);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 根据bean的name获取bean对象
     *
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName) {
//        Object bean = null;
//        String beanPath = properties.getProperty(beanName);
//        try {
//            //这里每次取对象都会生成一个新的对象，不是同一个
//            bean = Class.forName(beanPath).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return bean;

        return beans.get(beanName);
    }

}

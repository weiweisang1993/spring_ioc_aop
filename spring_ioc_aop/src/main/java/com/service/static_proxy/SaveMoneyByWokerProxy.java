package com.service.static_proxy;

/**
 * 存钱代理，银行柜员代理存钱
 *
 * @author 炜哥
 * @since 2021-04-15 21:56:39
 */
public class SaveMoneyByWokerProxy implements SaveMoney {

    //代理对象
    SaveMoney saveMoneyProxy;

    //通过构造器给代理对象赋值
    public SaveMoneyByWokerProxy(SaveMoney saveMoney) {
        this.saveMoneyProxy = saveMoney;
    }

    /**
     * 用代理存钱（工作人员帮忙存钱）
     * 在这里会有一些业务流程上的操作
     */
    public void saveMoney() {
        System.out.println("工作人员开始验钞...");
        System.out.println("验钞通过...");
        saveMoneyProxy.saveMoney();
        System.out.println("存钱完毕...");
    }
}

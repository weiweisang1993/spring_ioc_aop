package com.service.static_proxy;


/**
 * 代理存钱测试类
 *
 * @author 炜哥
 * @since 2021-04-15 22:01:53
 */
public class SaveMoneyProxyTest {

    public static void main(String[] args) {

        //定义一个炜哥存钱10000元的实际对象，炜哥要去存10000元了
        SaveMoney weigeSaveMoney = new SaveMoneyToBankImpl("炜哥",10000);

        //炜哥把要存的一万元和身份信息交给银行工作人员（生成一个代理对象）
        SaveMoneyByWokerProxy workerProxySaveMoney = new SaveMoneyByWokerProxy(weigeSaveMoney);

        //代理对象也就是银行工作人员开始存钱（实际由代理类完成实际对象的方法）
        workerProxySaveMoney.saveMoney();
    }

}

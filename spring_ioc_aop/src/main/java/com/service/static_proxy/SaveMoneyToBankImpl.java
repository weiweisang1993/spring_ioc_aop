package com.service.static_proxy;

/**
 * 存钱实现
 * 谁存钱，存了多少钱
 *
 * @author
 */
public class SaveMoneyToBankImpl implements SaveMoney {

    private String peopleName;

    private int money;

    public SaveMoneyToBankImpl(String peopleName,int money) {
        this.peopleName = peopleName;
        this.money = money;
    }

    /**
     * 具体实现存钱
     */
    public void saveMoney() {
        System.out.println(peopleName + "在银行存了" + money + "元");
    }
}

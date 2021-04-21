package com.service.extendsexample;

/**
 * @author ：炜哥
 * @description：TODO 一个有钱有赚钱门路的爹
 * @date ：2021/4/21 14:05
 */
public class RichFather {

    public RichFather() {
        System.out.println("富一代爸爸我出生了，嘴里叼着");
    }

    public RichFather(int money) {
        this.money = money;
    }

    //爸爸我有1000万现金，但现在剩下的钱要藏起来了
    private int money = 10000000;

    protected void makemoney(){
        money += 100000;
        System.out.println("这是爹爹的赚钱方法");
    }

    //在爸爸的世界里，妈妈拿钱是天经地义的
    public void consumeMoneyByMonther(int consumeMoney) {
        this.money -= consumeMoney;
        System.out.println("通过妈妈拿了" + consumeMoney);
    }

    //让妈妈看看爸爸还剩多少钱
    public int getMoney() {
        return this.money;
    }
}

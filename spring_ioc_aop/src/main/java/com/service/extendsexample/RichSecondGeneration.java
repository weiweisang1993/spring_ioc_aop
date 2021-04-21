package com.service.extendsexample;

/**
 * @author ：炜哥
 * @description：TODO 富二代
 * @date ：2021/4/21 14:09
 */
public class RichSecondGeneration extends RichFather {

    public RichSecondGeneration() {
        System.out.println("富二代出生了");
    }

    //一万块零花钱
    public int money = 10000;

    @Override
    public void makemoney (){
        System.out.println("这是富二代的赚钱方法");
        this.money += 5000;//每个月赚的不多
        super.makemoney();//顺便帮爸爸管理着赚钱
    }

    public void consume(int consume_money) {
//        System.out.println("我在夜场消费，花了" + consume_money + "元");
//        money -= consume_money;
//        System.out.println("我的钱还剩" + money);
//        System.out.println("爸爸的钱还剩" + super.money);

//        System.out.println("我在夜场消费超标" + consume_money + "，只能把老爸的钱"+super.money+"偷过来花了");
//        super.money -= consume_money;
//        System.out.println("我的钱还剩" + money);
//        System.out.println("爸爸的钱还剩" + super.money);

        //手段升级，通过妈妈拿钱
        System.out.println("我在夜场消费超标" + consume_money + "，老爸的钱藏起来，怎么办？");
        consumeMoneyByMonther(consume_money);
        System.out.println("我的钱还剩" + money);
        System.out.println("爸爸的钱还剩" + super.getMoney());
    }
}

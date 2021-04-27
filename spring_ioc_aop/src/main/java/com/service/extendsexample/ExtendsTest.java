package com.service.extendsexample;

/**
 * @author ：炜哥
 * @description：TODO
 * @date ：2021/4/21 14:11
 */
public class ExtendsTest {

    public static void main(String[] args) {
        RichSecondGeneration richSecondGeneration = new RichSecondGeneration();
        //富二代消费
        //richSecondGeneration.consume(4000);

        //富二代洗心革面，开始赚钱
        richSecondGeneration.makemoney();
        System.out.println("我的钱还剩" + richSecondGeneration.money);
        System.out.println("爸爸的钱还剩" + richSecondGeneration.getMoney());

        //花式赚钱
        richSecondGeneration.makemoney("拼多多");
    }

}

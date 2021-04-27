package com.service.extendsexample;

/**
 * @author ：炜哥
 * @date ：创建于 2021/4/22 13:53
 * @description：多态举例
 * @modified By：
 * @version: 1.0
 */

//正常状态下的爹
class NormalFather {

    protected int fight_num = 100;

    //要钱的时候
    void say() {
        System.out.println("这里有三万，拿去吧");
    }

}

//愤怒的爹
class AngerFather extends NormalFather {

    protected int fight_num = 10086;

    void say() {
        System.out.println("要什么要！没钱没钱！败家玩意儿！滚犊子！！！");
    }

    void throwSomething() {
        System.out.println("砸了锅碗瓢盆");
    }

}

//开心的爹
class HappyFather extends NormalFather {

    protected int fight_num = 5;

    void say() {
        System.out.println("十万够不够，儿砸别亏待自己，不够再问爹爹拿奥~~~");
    }

    void sing() {
        System.out.println("甜甜地唱了首歌");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {

//        NormalFather father = new AngerFather();
//        AngerFather angerFather = (AngerFather)father;
//
//        AngerFather angerFather1 = new AngerFather();
        //angerFather.say();
        //System.out.println("这时候爹爹的战斗力为：" + ((AngerFather) father).fight_num);

//        whoMakeMoney(new RichDad());
//        whoMakeMoney(new FirstSon());
//        whoMakeMoney(new SecondSon());

        getMoney(new AngerFather());
    }

    public static void getMoney(NormalFather father){

        father.say();
        if(father instanceof AngerFather){
            ((AngerFather) father).throwSomething();
        }
        if(father instanceof HappyFather){
            ((HappyFather) father).sing();
        }
    }

}


package com.service.thread;

/**
 * @author ：炜哥
 * @date ：创建于 2021/5/27 9:42 下午
 * @description：线程不安全之银行取钱
 * @modified By：
 * @version: 1.0
 */
public class UnsafeGetMoneyFromBank {

    public static void main(String[] args) {
        //先定义一个资金
        Account account = new Account(100,"家庭积蓄");

        //定义两个取钱动作

        Thread husband = new Thread(new GetMoneyFromBank(account,30),"老公");
        Thread wife = new Thread(new GetMoneyFromBank(account,80),"老婆");

        husband.start();
        wife.start();

    }
}

class Account{
    //余额
    int money;

    //卡名
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

/**
 * 模拟银行取钱
 */
class GetMoneyFromBank implements Runnable{

    /**
     * 账户
     */
    Account account;

    /**
     * 取了多少钱
     */
    int getMoney;

    public GetMoneyFromBank(Account account, int getMoney) {
        this.account = account;
        this.getMoney = getMoney;
    }

    @Override
    public void run() {

        synchronized (account){

            if(account.money < getMoney){
                //剩余钱不够取时
                System.out.println(Thread.currentThread().getName() + "钱不够取不了");
                return;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //钱够了的话就正常执行以下逻辑
            account.money = account.money - getMoney;
            System.out.println(Thread.currentThread().getName()+"取走了"+getMoney);

            System.out.println(account.name+"还剩下"+account.money);
        }

    }


}

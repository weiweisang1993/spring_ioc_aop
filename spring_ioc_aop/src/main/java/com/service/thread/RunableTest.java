package com.service.thread;

import static com.sun.tools.doclint.Entity.or;

/**
 * @author ：炜哥
 * @date ：创建于 2021/5/18 9:34 下午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class RunableTest implements Runnable{

    //一共有100张票
    private int ticketNum = 10;

    @Override
    public void run() {
        getTicket();
    }

    private void getTicket(){
        while(true){
            if(ticketNum <= 0 ){
                break;
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+">>拿到了第"+ticketNum-- +"张票");
        }
    }

    public static void main(String[] args) {
        RunableTest runableTest = new RunableTest();

        new Thread(runableTest,"小明").start();
        new Thread(runableTest,"小红").start();
        new Thread(runableTest,"该死的黄牛党").start();
    }
}

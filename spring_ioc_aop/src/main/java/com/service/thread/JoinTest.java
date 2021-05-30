package com.service.thread;

/**
 * @author ：炜哥
 * @date ：创建于 2021/5/24 9:37 下午
 * @description：线程强制执行join测试
 * @modified By：
 * @version: 1.0
 */
public class JoinTest implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程vip来了"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinTest joinTest = new JoinTest();
        Thread thread = new Thread(joinTest);
        //开启线程
        thread.start();

        //main主线程，中间被我们开启的线程强行插队
        for (int i = 0; i < 500; i++) {
            if(i == 200){
                System.out.println("开始插队了");
                thread.join();
            }
            System.out.println("main主线程运行"+i);
        }

    }


}

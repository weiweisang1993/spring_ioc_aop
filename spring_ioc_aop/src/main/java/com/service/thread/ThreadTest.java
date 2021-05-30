package com.service.thread;

/**
 * @author ：炜哥
 * @date ：创建于 2021/5/18 9:09 下午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class ThreadTest extends Thread{

    @Override
    public void run(){
        for (int i = 20; i > 0; i--) {
            System.out.println("子线程："+i);
        }
    }

    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.start();
        for (int i = 1000; i > 0; i--) {
            System.out.println("主线程："+i);
        }
    }
}

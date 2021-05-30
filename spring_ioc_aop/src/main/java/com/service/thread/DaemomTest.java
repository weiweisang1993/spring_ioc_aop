package com.service.thread;

/**
 * @author ：炜哥
 * @date ：创建于 2021/5/27 9:11 下午
 * @description：守护线程
 * @modified By：
 * @version: 1.0
 */
public class DaemomTest {
    public static void main(String[] args) {
        God god = new God();
        You you = new You();
        Thread thread = new Thread(god);
        //守护线程，默认是false
        thread.setDaemon(true);
        thread.start();

        new Thread(you).start();
    }
}

class You implements Runnable{

    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println("你在这个世界上活着的"+i);
        }
    }
}

class God implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("上帝一直都在");
        }
    }
}

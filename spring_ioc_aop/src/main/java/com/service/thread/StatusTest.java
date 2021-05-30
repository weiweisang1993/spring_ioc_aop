package com.service.thread;

/**
 * @author ：炜哥
 * @date ：创建于 2021/5/24 10:04 下午
 * @description：查看线程状态测试类
 * @modified By：
 * @version: 1.0
 */
public class StatusTest{

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            //函数式编程 lambda表达式

            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("线程执行中....");
        });

        //观察状态
        Thread.State state = thread.getState();
        System.out.println("创建线程："+state);

        //观察启动
        thread.start();
        state = thread.getState();
        System.out.println("执行start()后:"+state);

        while(state != Thread.State.TERMINATED){
            //只要线程不终止，就输出
            Thread.sleep(300);
            state = thread.getState();
            System.out.println("检测线程状态："+state);
        }
    }
}

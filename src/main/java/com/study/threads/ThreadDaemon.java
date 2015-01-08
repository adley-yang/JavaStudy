package com.study.threads;

/**
 * Project Name:java
 * Package Name:com.study.threads
 * Date:15-1-8 下午3:34
 * Copyright (c) 2015, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class ThreadDaemon {

    static class A extends Thread {

        public void run() {
            while(true) {
                Thread.yield(); //yield()方法是停止当前线程，让同等优先权的线程运行。如果没有同等优先权的线程，那么Yield()方法将不会起作用。
            }
        }
    }

    static class B extends Thread {

        A a = new A();

        public void run() {
            //a 是否设置为后台线程，它优先级极低，通常不会和其它线程抢CPU。
            //如果JVM进程中活着的线程只剩下后台线程，那么意味着就要结束整个进程
            //a.setDaemon(true);
            a.start();
            System.out.println("B is end....");
        }
    }

    public static void main(String []args) throws InterruptedException {
        B b = new B();
        b.start();
        Thread.sleep(1000);
        System.out.println(b.a.getState());//输出RUNNABLE ，说明还未结束
    }
}

package com.study.threads;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.threads
 * Date:2014/12/21 22:08
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */

public class CounterThread extends Thread {

    protected Counter counter = null;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.add(i);
            System.out.println(Thread.currentThread().getName()+counter.showCount());
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread threadA = new CounterThread(counter);
        Thread threadB = new CounterThread(counter);

        threadA.start();
        threadB.start();
    }
}

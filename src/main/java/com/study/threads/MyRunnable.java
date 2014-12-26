package com.study.threads;
/**
 * Project Name:JavaStudy
 * Package Name:com.study.threads
 * Date:2014/12/21 19:41
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class MyRunnable implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName()+":MyThread running");
    }

    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName()+":Main Thread running");
        for(int i=0;i<10;i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }

        //Runnable接口的匿名类
        Runnable myRunnable = new Runnable(){
            public void run(){
                System.out.println("Runnable接口的匿名类 ---MyRunnable  running");
            }
        };
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}

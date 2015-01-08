package com.study.threads;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.threads
 * Date:2014/12/21 17:32
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */

/**
 * 创建Thread的子类
 * 创建Thread子类的一个实例并重写run方法，run方法会在调用start()方法之后被执行
 * 一旦线程启动后start方法就会立即返回，而不会等待到run方法执行完毕才返回。就好像run方法是在另外一个cpu上执行一样
 */
public class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+":State:"+Thread.currentThread().getState());
    }

    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName()+":Main Thread running");
        for(int i=0;i<10;i++) {
            MyThread myThread = new MyThread();
            System.out.println(myThread.getName()+":State:"+myThread.getState());
            myThread.start();
        }

        //Thread的匿名子类
        Thread thread = new Thread(){
            public void run(){
                System.out.println("Thread的匿名子类 ----Thread Running");
            }
        };
        thread.start();

    }
}

package com.study.threads;

/**
 * Project Name:java
 * Package Name:com.study.threads
 * Date:15-1-9 上午10:32
 * Copyright (c) 2015, adleyyang.cn@gmail.com All Rights Reserved.
 */
class TestExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("线程出现异常：");
        e.printStackTrace();
        System.out.printf("\n当前线程栈：");
        new Exception().printStackTrace();
    }
}
public class ExceptionHandlerTest {

    public static void main(String []args) {
        Thread t = new Thread() {
            public void run() {
                Integer.parseInt("ABC");
            }
        };
        t.setUncaughtExceptionHandler(new TestExceptionHandler());
        t.start();
    }
}

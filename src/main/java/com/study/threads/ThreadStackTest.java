package com.study.threads;

/**
 * Project Name:java
 * Package Name:com.study.threads
 * Date:15-1-9 上午10:45
 * Copyright (c) 2015, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class ThreadStackTest {

    public static void main(String []args) {
        printStack(getStackByThread());
        printStack(getStackByException());
    }

    private static void printStack(StackTraceElement []stacks) {
        for(StackTraceElement stack : stacks) {
            System.out.println(stack);
        }
        System.out.println("\n");
    }

    private static StackTraceElement[] getStackByThread() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] getStackByException() {
        return new Exception().getStackTrace();
    }
}

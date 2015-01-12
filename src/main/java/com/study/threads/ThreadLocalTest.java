package com.study.threads;

/**
 * Project Name:java
 * Package Name:com.study.threads
 * Date:15-1-12 上午10:38
 * Copyright (c) 2015, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class ThreadLocalTest {

    //每个ThreadLocal可以放一个线程级别的变量，但是它本身可以被多个线程共享使用，而且又可以达到线程安全的目的，且绝对线程安全

    static class ResourceClass {

        public final static ThreadLocal<String> RESOURCE_1 = new ThreadLocal<String>();

        public final static ThreadLocal<String> RESOURCE_2 = new ThreadLocal<String>();

    }

    static class A {

        public void setOne(String value) {
            ResourceClass.RESOURCE_1.set(value);
        }

        public void setTwo(String value) {
            ResourceClass.RESOURCE_2.set(value);
        }
    }

    static class B {
        public void display() {
            System.out.println(ResourceClass.RESOURCE_1.get() + ":" + ResourceClass.RESOURCE_2.get());
        }
    }

    public static void main(String[] args) {
        final A a = new A();
        final B b = new B();
        for (int i = 0; i < 15; i++) {
            final String resouce1 = "线程-" + i, resouce2 = " value = (" + i + ")";
            new Thread() {
                public void run() {
                    try {
                        a.setOne(resouce1);
                        a.setTwo(resouce2);
                        b.display();
                    } finally {
                        ResourceClass.RESOURCE_1.remove();
                        ResourceClass.RESOURCE_2.remove();
                    }
                }
            }.start();
        }
    }
}

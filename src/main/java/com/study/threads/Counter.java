package com.study.threads;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.threads
 * Date:2014/12/21 22:10
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */

/**
 * Java同步关键字（synchronzied）
 * 实例方法同步
 * 静态方法同步
 * 实例方法中同步块
 * 静态方法中同步块
 */

/**
 * Counter.add方法是同步在实例上，是因为add方法是实例方法并且被标记上synchronized关键字。
 * 因此每次只允许一个线程调用该方法。
 * 另外一个线程必须要等到第一个线程退出add()方法时，才能继续执行方法。
 */
public class Counter{
    long count = 0;

    public synchronized void add(long value){
        this.count += value;
    }

    public String showCount(){
        return  " count:"+count;
    }
}
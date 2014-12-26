package com.study.designpatterns.proxy;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.proxy
 * Date:14-12-26 上午11:47
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */

/**
 * 代理模式就是多一个代理类出来，替原对象进行一些操作
 */
public class Proxy implements Sourceable {

    private Source source;
    public Proxy(){
        super();
        this.source = new Source();
    }
    @Override
    public void method() {
        before();
        source.method();
        atfer();
    }
    private void atfer() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }
}
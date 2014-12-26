package com.study.designpatterns.adapter;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.adapter
 * Date:14-12-26 上午10:29
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
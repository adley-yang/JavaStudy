package com.study.designpatterns.proxy;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.proxy
 * Date:14-12-26 上午11:47
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
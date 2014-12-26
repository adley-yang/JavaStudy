package com.study.designpatterns.decorator;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.decorator
 * Date:14-12-26 上午11:27
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}

package com.study.designpatterns.decorator;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.decorator
 * Date:14-12-26 上午11:28
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
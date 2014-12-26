package com.study.designpatterns.proxy;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.proxy
 * Date:14-12-26 上午11:47
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class ProxyTest {

    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }

}

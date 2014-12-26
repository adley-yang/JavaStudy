package com.study.designpatterns.bridge;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.bridge
 * Date:14-12-26 下午3:08
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class SourceSub2 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }
}

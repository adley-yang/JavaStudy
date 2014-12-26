package com.study.designpatterns.adapter;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.adapter
 * Date:14-12-26 上午10:26
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}

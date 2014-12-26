package com.study.designpatterns.adapter;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.Adapter
 * Date:14-12-26 上午10:24
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public interface Targetable {

    /* 与原类中的方法相同 */
    public void method1();

    /* 新类的方法 */
    public void method2();
}
package com.study.designpatterns.bridge;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.bridge
 * Date:14-12-26 下午3:09
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
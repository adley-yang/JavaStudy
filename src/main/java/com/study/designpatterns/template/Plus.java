package com.study.designpatterns.template;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.template
 * Date:14-12-26 下午4:44
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int num1,int num2) {
        return num1 + num2;
    }
}

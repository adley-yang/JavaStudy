package com.study.designpatterns.strategy;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.strategy
 * Date:14-12-26 下午4:24
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class Minus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }

}
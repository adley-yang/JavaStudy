package com.study.designpatterns.strategy;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.strategy
 * Date:14-12-26 下午4:24
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public abstract class AbstractCalculator {

    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
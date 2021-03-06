package com.study.designpatterns.strategy;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.strategy
 * Date:14-12-26 下午4:25
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */

/**
 * 策略模式（strategy）
 * 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。
 * 需要设计一个接口，为一系列实现类提供统一的方法，多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类），提供辅助函数
 */
public class StrategyTest {

    public static void main(String[] args) {
        ICalculator cal1 = new Plus();
        int result = cal1.calculate("8+2");
        System.out.println(result);

        ICalculator cal2 = new Minus();
        result = cal2.calculate("8-2");
        System.out.println(result);

        ICalculator cal3 = new Multiply();
        result = cal3.calculate("8*2");
        System.out.println(result);

    }
}
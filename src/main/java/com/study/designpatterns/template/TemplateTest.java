package com.study.designpatterns.template;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.template
 * Date:14-12-26 下午4:44
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class TemplateTest {

    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}

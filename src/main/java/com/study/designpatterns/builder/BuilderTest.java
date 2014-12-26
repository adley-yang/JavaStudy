package com.study.designpatterns.builder;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.builder
 * Date:14-12-26 上午8:50
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class BuilderTest {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }

}

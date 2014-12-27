package com.study.designpatterns.chain;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.chain
 * Date:2014/12/27 17:45
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class ChainTest {

    public static void main(String[] args) {
        MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");

        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.operator();
    }
}

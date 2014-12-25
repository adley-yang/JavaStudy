package com.study.designpatterns.factory;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.factory
 * Date:2014/12/25 22:00
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}

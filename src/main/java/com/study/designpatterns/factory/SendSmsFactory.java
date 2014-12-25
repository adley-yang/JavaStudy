package com.study.designpatterns.factory;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.factory
 * Date:2014/12/25 22:19
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}

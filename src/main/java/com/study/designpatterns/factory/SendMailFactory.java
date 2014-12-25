package com.study.designpatterns.factory;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.factory
 * Date:2014/12/25 22:18
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class SendMailFactory implements Provider{
    @Override
    public Sender produce(){
        return new MailSender();
    }
}

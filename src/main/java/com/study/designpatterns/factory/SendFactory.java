package com.study.designpatterns.factory;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.factory
 * Date:2014/12/25 22:00
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class SendFactory {

    /**
     * 普通工厂模式
     *
     * @param type
     * @return
     */
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }

    /**
     * 多个工厂方法模式,是对普通工厂方法模式的改进，在普通工厂方法模式中，
     * 如果传递的字符串出错，则不能正确创建对象，
     * 而多个工厂方法模式是提供多个工厂方法，分别创建对象
     *
     * @return
     */
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }


    /**
     * 静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可
     *
     * @return
     */
    public static Sender sproduceMail() {
        return new MailSender();
    }

    public static Sender sproduceSms() {
        return new SmsSender();
    }
}

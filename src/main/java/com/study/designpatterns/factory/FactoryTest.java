package com.study.designpatterns.factory;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.factory
 * Date:2014/12/25 22:01
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class FactoryTest {

    public static void main(String[] args) {

        System.out.println("**********************   普通工厂模式   **********************************");
        SendFactory factory = new SendFactory();
        Sender sender1 = factory.produce("sms");
        sender1.Send();

        System.out.println("**********************   多个工厂方法模式   **********************************");
        Sender sender2 = factory.produceMail();
        sender2.Send();

        System.out.println("**********************   静态工厂方法模式   **********************************");
        Sender sender3 = SendFactory.sproduceMail();
        sender3.Send();

        System.out.println("**********************   抽象工厂模式   **********************************");
        //如果你现在想增加一个功能：发及时信息，则只需做一个实现类，
        // 实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码
        Provider provider1 = new SendMailFactory();
        Sender sender4 = provider1.produce();
        sender4.Send();

        Provider provider2 = new SendSmsFactory();
        Sender sender5 = provider2.produce();
        sender5.Send();
    }
}

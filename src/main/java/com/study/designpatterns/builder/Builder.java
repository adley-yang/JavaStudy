package com.study.designpatterns.builder;

import com.study.designpatterns.factory.MailSender;
import com.study.designpatterns.factory.Sender;
import com.study.designpatterns.factory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.builder
 * Date:14-12-26 上午8:48
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */

/**
 * 建造者模式（Builder）
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，
 * 用来创建复合对象，所谓复合对象就是指某个类具有不同的属性
 * <p/>
 * 工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分。
 * 因此，是选择工厂模式还是建造者模式，依实际情况而定
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}

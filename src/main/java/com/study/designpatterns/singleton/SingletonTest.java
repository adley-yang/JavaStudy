package com.study.designpatterns.singleton;

import java.util.Vector;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.singleton
 * Date:2014/12/25 23:11
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */

/**
 * 采用"影子实例"的办法为单例对象的属性同步更新
 */
public class SingletonTest {

    private static SingletonTest instance = null;
    private Vector properties = null;

    public Vector getProperties() {
        return properties;
    }

    private SingletonTest() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public void updateProperties() {
        SingletonTest shadow = new SingletonTest();
        properties = shadow.getProperties();
    }
}

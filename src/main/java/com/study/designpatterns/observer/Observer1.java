package com.study.designpatterns.observer;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.observer
 * Date:2014/12/27 16:38
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
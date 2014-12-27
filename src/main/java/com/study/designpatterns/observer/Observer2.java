package com.study.designpatterns.observer;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.observer
 * Date:2014/12/27 16:39
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }

}
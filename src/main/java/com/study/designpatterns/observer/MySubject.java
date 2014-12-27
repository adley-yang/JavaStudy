package com.study.designpatterns.observer;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.observer
 * Date:2014/12/27 16:40
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}

package com.study.designpatterns.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.observer
 * Date:2014/12/27 16:39
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<Observer>();
    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }
}

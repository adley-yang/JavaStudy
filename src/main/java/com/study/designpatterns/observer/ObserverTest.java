package com.study.designpatterns.observer;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.observer
 * Date:2014/12/27 16:41
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class ObserverTest {

    /**
     * MySubject类就是我们的主对象，Observer1和Observer2是依赖于MySubject的对象，
     * 当MySubject变化时，Observer1和Observer2必然变化。
     * AbstractSubject类中定义着需要监控的对象列表，
     * 可以对其进行修改：增加或删除被监控对象，且当MySubject变化时，负责通知在列表内存在的对象。
     */
    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }

}
package com.study.designpatterns.Iterator;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.Iterator
 * Date:2014/12/27 17:33
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class MyCollection implements Collection {

    public String string[] = {"A","B","C","D","E"};
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
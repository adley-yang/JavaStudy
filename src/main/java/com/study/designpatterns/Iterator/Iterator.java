package com.study.designpatterns.Iterator;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.Iterator
 * Date:2014/12/27 17:33
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public interface Iterator {
    //前移
    public Object previous();

    //后移
    public Object next();
    public boolean hasNext();

    //取得第一个元素
    public Object first();
}
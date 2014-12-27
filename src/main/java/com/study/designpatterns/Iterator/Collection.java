package com.study.designpatterns.Iterator;

import java.util.Iterator;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.Iterator
 * Date:2014/12/27 17:32
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public interface Collection {

    public com.study.designpatterns.Iterator.Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}

package com.study.designpatterns.Iterator;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.Iterator
 * Date:2014/12/27 17:34
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class IteratorTest {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

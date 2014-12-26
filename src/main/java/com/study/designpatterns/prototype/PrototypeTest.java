package com.study.designpatterns.prototype;

import java.io.IOException;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.prototype
 * Date:14-12-26 上午9:12
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        Prototype prototype = new Prototype();
        Prototype clonePrototype = (Prototype) prototype.clone();
        Prototype deepPrototype = (Prototype) prototype.deepClone();
    }
}

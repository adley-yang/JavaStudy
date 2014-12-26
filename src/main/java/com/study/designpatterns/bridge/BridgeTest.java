package com.study.designpatterns.bridge;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.bridge
 * Date:14-12-26 下午3:09
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class BridgeTest {

    public static void main(String[] args) {

        Bridge bridge = new MyBridge();

		/*调用第一个对象*/
        Sourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

		/*调用第二个对象*/
        Sourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}

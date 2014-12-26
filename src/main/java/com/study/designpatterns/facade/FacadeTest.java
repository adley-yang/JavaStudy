package com.study.designpatterns.facade;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.facade
 * Date:14-12-26 下午2:54
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */

/**
 * 外观模式是为了解决类与类之家的依赖关系的，
 * 像spring一样，可以将类和类之间的关系配置到配置文件中，
 * 而外观模式就是将他们的关系放在一个Facade类中，
 * 降低了类类之间的耦合度，该模式中没有涉及到接口
 */
public class FacadeTest {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}

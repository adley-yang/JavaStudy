package com.study.designpatterns.command;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.command
 * Date:2014/12/27 17:50
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class CommandTest {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}

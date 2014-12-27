package com.study.designpatterns.command;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.command
 * Date:2014/12/27 17:49
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}

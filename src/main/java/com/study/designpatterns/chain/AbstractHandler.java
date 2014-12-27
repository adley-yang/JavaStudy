package com.study.designpatterns.chain;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.chain
 * Date:2014/12/27 17:45
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}

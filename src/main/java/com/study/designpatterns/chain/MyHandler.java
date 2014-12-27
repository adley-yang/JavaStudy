package com.study.designpatterns.chain;

/**
 * Project Name:JavaStudy
 * Package Name:com.study.designpatterns.chain
 * Date:2014/12/27 17:45
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+" deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }
}
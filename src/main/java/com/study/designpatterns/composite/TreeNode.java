package com.study.designpatterns.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.composite
 * Date:14-12-26 下午3:57
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class TreeNode {

    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    //添加孩子节点
    public void add(TreeNode node){
        children.add(node);
    }

    //删除孩子节点
    public void remove(TreeNode node){
        children.remove(node);
    }

    //取得孩子节点
    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }
}
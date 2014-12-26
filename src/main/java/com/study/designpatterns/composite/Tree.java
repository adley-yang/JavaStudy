package com.study.designpatterns.composite;

/**
 * Project Name:java
 * Package Name:com.study.designpatterns.composite
 * Date:14-12-26 下午3:57
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */

/**
 * 组合模式（Composite）
 * 将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 */

public class Tree {

    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
    }
}
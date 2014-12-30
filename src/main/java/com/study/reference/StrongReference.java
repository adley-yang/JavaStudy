package com.study.reference;

/**
 * Project Name:java
 * Package Name:com.study.reference
 * Date:14-12-29 下午6:16
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class StrongReference {

    /**
     * StrongReference 是 Java 的默认引用实现,  它会尽可能长时间的存活于 JVM 内， 当没有任何对象指向它时 GC 执行后将会被回收
     */

    public static void main(String[] args) {

        Object referent = new Object();

        //通过赋值创建 StrongReference
        Object strongReference = referent;

        System.out.println("StrongReferenceGC前:" + referent.equals(strongReference));

        //GC
        referent = null;
        System.gc();

        //StrongReference 在 GC 后不会被回收
        System.out.println("StrongReferenceGC后:" + strongReference);//java.lang.Object@1632847
    }
}

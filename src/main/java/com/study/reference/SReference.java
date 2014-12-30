package com.study.reference;

import java.lang.ref.SoftReference;

/**
 * Project Name:java
 * Package Name:com.study.reference
 * Date:14-12-29 下午7:04
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class SReference {

    /**
     * SoftReference 于 WeakReference 的特性基本一致，
     * 最大的区别在于 SoftReference 会尽可能长的保留引用直到 JVM 内存不足时才会被回收(虚拟机保证),
     * 这一特性使得 SoftReference 非常适合缓存应用
     */
    public static void main(String[] args){

        Object referent = new Object();
        //创建弱引用
        SoftReference<Object> softRerference = new SoftReference<Object>(referent);

        System.out.println("SoftReference GC前:" + referent.equals(softRerference.get()));

        //GC
        referent = null;
        System.gc();

        //soft references 只有在 jvm OutOfMemory 之前才会被回收, 所以它非常适合缓存应用
        System.out.println("SoftReference GC后:" + softRerference.get()); //java.lang.Object@fcfa52

    }
}

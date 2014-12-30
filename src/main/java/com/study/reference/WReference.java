package com.study.reference;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Project Name:java
 * Package Name:com.study.reference
 * Date:14-12-29 下午6:26
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class WReference {

    /**
     * WeakReference， 顾名思义,  是一个弱引用,  当所引用的对象在 JVM 内不再有强引用时, GC 后 weak reference 将会被自动回收
     * <p/>
     * WeakHashMap 使用 WeakReference 作为 key， 一旦没有指向 key 的强引用, WeakHashMap 在 GC 后将自动删除相关的 entry
     */
    public static void main(String[] args) throws InterruptedException{
        System.out.println("********************        WeakReference          *********************************");
        Object referent = new Object();

        //创建弱引用
        WeakReference<Object> weakRerference = new WeakReference<Object>(referent);

        System.out.println("WeakReference GC前:" + referent.equals(weakRerference.get()));

        //GC
        referent = null;
        System.gc();

        //一旦没有指向 referent 的强引用, weak reference 在 GC 后会被自动回收
        System.out.println("WeakReference GC后:" + weakRerference.get());//null


        System.out.println("********************        WeakHashMap          *********************************");

        //weakHashMap
        Map<Object, Object> weakHashMap = new WeakHashMap<Object, Object>();
        Object key = new Object();
        Object value = new Object();
        weakHashMap.put(key, value);
        System.out.println("WeakHashMap GC前:" + weakHashMap.containsKey(key));

        //GC
        key = null;
        System.gc();

        //等待无效 entries 进入 ReferenceQueue 以便下一次调用 getTable 时被清理
        Thread.sleep(1000);

        //一旦没有指向 key 的强引用, WeakHashMap 在 GC 后将自动删除相关的 entry
        System.out.println("WeakHashMap GC后:" + weakHashMap.containsKey(key));
    }
}

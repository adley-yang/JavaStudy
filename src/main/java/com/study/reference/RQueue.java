package com.study.reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * Project Name:java
 * Package Name:com.study.reference
 * Date:14-12-30 上午9:18
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class RQueue {


    public static void main(String[] args) throws InterruptedException {

        /**
         * 当一个 WeakReference 开始返回 null 时， 它所指向的对象已经准备被回收，
         * 这时可以做一些合适的清理工作.
         * 将一个 ReferenceQueue 传给一个 Reference 的构造函数，
         * 当对象被回收时， 虚拟机会自动将这个对象插入到 ReferenceQueue 中，
         * WeakHashMap 就是利用 ReferenceQueue 来清除 key 已经没有强引用的 entries
         */

        Object referent = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<Object>();
        WeakReference<Object> weakReference = new WeakReference<Object>(referent, referenceQueue);
        WeakReference<Object> weakReference1 = new WeakReference<Object>(referent, referenceQueue);

        System.out.println("weakReference是否在引用队列中:" + weakReference.isEnqueued());
        System.out.println("weakReference1是否在引用队列中:" + weakReference1.isEnqueued());
        Reference<? extends Object> polled = referenceQueue.poll();
        System.out.println(polled);

        //GC
        referent = null;
        System.gc();

        System.out.println("weakReference是否在引用队列中:" + weakReference.isEnqueued());
        System.out.println("weakReference1是否在引用队列中:" + weakReference1.isEnqueued());
        Reference<? extends Object> removed = referenceQueue.remove(1);
        System.out.println("remover队列中:" + removed);
        System.out.println("weakReference是否在引用队列中:" + weakReference.isEnqueued());
        Reference<? extends Object> removed1 = referenceQueue.remove();
        System.out.println("remover队列中:" + removed1);
        System.out.println("weakReference1是否在引用队列中:" + weakReference1.isEnqueued());
    }
}

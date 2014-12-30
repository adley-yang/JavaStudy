package com.study.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * Project Name:java
 * Package Name:com.study.reference
 * Date:14-12-29 下午7:12
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class PReference {

    /**
     * Phantom Reference(幽灵引用) 与 WeakReference 和 SoftReference 有很大的不同,
     * 因为它的 get() 方法永远返回 null, 这也正是它名字的由来
     *
     * 一个永远返回 null 的 reference 要来何用,  请注意构造 PhantomReference 时的第二个参数 ReferenceQueue
     * (事实上 WeakReference & SoftReference 也可以有这个参数)，
     * PhantomReference 唯一的用处就是跟踪 referent  何时被 enqueue 到 ReferenceQueue 中.
     *
     *
     * PhantomReference  有两个好处， 其一， 它可以让我们准确地知道对象何时被从内存中删除， 这个特性可以被用于一些特殊的需求中
     * (例如 Distributed GC，  XWork 和 google-guice 中也使用 PhantomReference 做了一些清理性工作).
     * 其二， 它可以避免 finalization 带来的一些根本性问题, 上文提到 PhantomReference 的唯一作用就是跟踪 referent 何时被 enqueue 到 ReferenceQueue 中,
     * 但是 WeakReference 也有对应的功能, 两者的区别到底在哪呢 ?
     * 这就要说到 Object 的 finalize 方法, 此方法将在 gc 执行前被调用, 如果某个对象重载了 finalize 方法并故意在方法内创建本身的强引用,
     * 这将导致这一轮的 GC 无法回收这个对象并有可能引起任意次 GC， 最后的结果就是明明 JVM 内有很多 Garbage 却 OutOfMemory，
     * 使用 PhantomReference 就可以避免这个问题， 因为 PhantomReference 是在 finalize 方法执行后回收的，也就意味着此时已经不可能拿到原来的引用,
     * 也就不会出现上述问题,  当然这是一个很极端的例子, 一般不会出现.
     */
    public static void main(String[] args){

        Object referent = new Object();
        PhantomReference<Object> phantomReference = new PhantomReference<Object>(referent, new ReferenceQueue<Object>());

        // phantom reference 的 get 方法永远返回 null
        System.out.println("PhantomReference :" + phantomReference.get());
    }
}

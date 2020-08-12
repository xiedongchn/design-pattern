package com.xd.designpattern.singletonpattern.lazysingleton;

/**
 * Description
 *
 * @author xd
 * Created on 八月/10 00:09
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton;

    private LazySimpleSingleton() {
    }

    /**
     * 最简单的懒汉单例
     *
     * @return LazySimpleSingleton
     */
    public static LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }

    /**
     * 升级版一：加了同步锁，当两个线程同时执行方法时，后来的线程会变成MONITOR状态，处于阻塞状态，
     * 解决了线程不安全的问题
     *
     * @return LazySimpleSingleton
     */
    public synchronized static LazySimpleSingleton getInstance1() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }

    public void printInstanceInfo() {
        System.out.println("InstanceInfo" + lazySimpleSingleton);
    }
}

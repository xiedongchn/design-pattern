package com.xd.designpattern.singletonpattern.lazysingleton;

/**
 * 懒汉式单例测试类
 *
 * @author xd
 * Created on 八月/12 21:37
 */
public class TestLazySingleton {

    public static void main(String[] args) {
        testLazySimpleSingleton();
        testLazySimpleSingleton1();
        testLazyDoubleCheckSingleton();
    }

    /**
     * 测试懒汉式的线程安全问题，打印的实例可能不一样
     */
    public static void testLazySimpleSingleton() {
        new Thread(() -> System.out.println(Thread.currentThread().getName() + ":" + LazySimpleSingleton.getInstance1())).start();
        new Thread(() -> System.out.println(Thread.currentThread().getName() + ":" + LazySimpleSingleton.getInstance1())).start();
    }

    /**
     * 测试加了同步锁的简单懒汉式的线程安全问题，打印的实例是一样的，没有线程安全问题
     */
    public static void testLazySimpleSingleton1() {
        new Thread(() -> System.out.println(Thread.currentThread().getName() + ":" + LazySimpleSingleton.getInstance1())).start();
        new Thread(() -> System.out.println(Thread.currentThread().getName() + ":" + LazySimpleSingleton.getInstance1())).start();
    }

    /**
     * 测试双重检查锁的懒汉式单例
     */
    public static void testLazyDoubleCheckSingleton() {
        new Thread(() -> System.out.println(Thread.currentThread().getName() + ":" + LazyDoubleCheckSingleton.getInstance())).start();
        new Thread(() -> System.out.println(Thread.currentThread().getName() + ":" + LazyDoubleCheckSingleton.getInstance())).start();
    }
}

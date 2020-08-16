package com.xd.designpattern.singletonpattern.threadlocalsingleton;

/**
 * Description
 *
 * @author xd
 * Created on 八月/14 00:29
 */
public class TestThreadLocalSingleton {

    public static void main(String[] args) {
        testThreadLocalSingleton();
    }

    /**
     * 测试单例是否唯一
     */
    public static void testThreadLocalSingleton() {
        //下面三行代码，表示在主线程，ThreadLocal单例是线程安全的
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        //下面的代码，表示在不同线程内，ThreadLocal单例是线程安全的，两个子线程和主线程的对象也是不一样的
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
            System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
            System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        }).start();
    }
}

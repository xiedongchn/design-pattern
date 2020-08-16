package com.xd.designpattern.singletonpattern.threadlocalsingleton;

/**
 * ThreadLocalSingleton单例
 *
 * @author xd
 * Created on 八月/14 00:25
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> instance = ThreadLocal.withInitial(ThreadLocalSingleton::new);

    private ThreadLocalSingleton() {}

    /**
     * 参照{@link ThreadLocal#get()}方法的实现，ThreadLocal维护了一个ThreadLocalMap对象，
     * 其数据以当前线程名作为key，若key存在，则返回对应值，否则调用initialValue()方法初始化一个单例对象
     *
     * @return ThreadLocalSingleton
     */
    public static ThreadLocalSingleton getInstance() {
        return instance.get();
    }
}

package com.xd.designpattern.singletonpattern.lazysingleton;

/**
 * Description
 *
 * @author xd
 * Created on 八月/10 00:09
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazySimpleSingleton;

    private LazyDoubleCheckSingleton() {}

    /**
     * 升级版二：使用双重检查锁
     *
     * @return LazySimpleSingleton
     */
    public synchronized static LazyDoubleCheckSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazySimpleSingleton == null) {
                    lazySimpleSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySimpleSingleton;
    }

    public void printInstanceInfo() {
        System.out.println("InstanceInfo" + lazySimpleSingleton);
    }
}

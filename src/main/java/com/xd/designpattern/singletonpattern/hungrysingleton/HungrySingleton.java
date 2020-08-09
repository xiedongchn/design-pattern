package com.xd.designpattern.singletonpattern.hungrysingleton;

/**
 * 饿汉式单例，在类加载的时候就创建实例
 *
 *
 * @author xd
 * Created on 八月/9 23:56
 */
public class HungrySingleton {
    public static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}

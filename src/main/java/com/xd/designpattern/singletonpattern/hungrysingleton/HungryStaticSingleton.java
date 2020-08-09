package com.xd.designpattern.singletonpattern.hungrysingleton;

/**
 * Description
 *
 * @author xd
 * Created on 八月/10 00:02
 */
public class HungryStaticSingleton {
    public static final HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {}

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}

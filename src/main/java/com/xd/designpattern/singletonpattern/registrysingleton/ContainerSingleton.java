package com.xd.designpattern.singletonpattern.registrysingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description
 *
 * @author xd
 * Created on 八月/12 23:50
 */
public class ContainerSingleton {
    private static final Map<String, Object> ioc = new ConcurrentHashMap<>();

    public ContainerSingleton() {
    }

    public static Object getInstance(String className) {
        if (!ioc.containsKey(className)) {
            try {
                Object instance = Class.forName(className);
                ioc.put(className, instance);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return ioc.get(className);
    }
}

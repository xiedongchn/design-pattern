package com.xd.designpattern.singletonpattern.serializesingleton;

import java.io.Serializable;

/**
 * 序列化单例
 *
 * @author xd
 * Created on 八月/13 00:02
 */
public class SerializableSingleton implements Serializable {
    private static final long serialVersionUID = -2196742882766035413L;
    private static final SerializableSingleton instance = new SerializableSingleton();

    public SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return instance;
    }
}

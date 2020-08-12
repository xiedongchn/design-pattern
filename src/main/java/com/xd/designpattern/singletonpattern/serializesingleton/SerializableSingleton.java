package com.xd.designpattern.singletonpattern.serializesingleton;

import java.io.Serializable;

/**
 * Description
 *
 * @author xd
 * Created on 八月/13 00:02
 */
public class SerializableSingleton implements Serializable {
    private static final SerializableSingleton instance = new SerializableSingleton();

    public SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return instance;
    }
}

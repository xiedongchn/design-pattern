package com.xd.designpattern.singletonpattern.serializesingleton;

import java.io.Serializable;

/**
 * 序列化单例优化版，防止反序列化破坏单例，增加readResolve方法
 *
 * @author xd
 * Created on 八月/13 00:02
 */
public class SerializableSingletonOptimize implements Serializable {
    private static final long serialVersionUID = -2196742882766035413L;
    private static final SerializableSingletonOptimize instance = new SerializableSingletonOptimize();

    public SerializableSingletonOptimize() {
    }

    public static SerializableSingletonOptimize getInstance() {
        return instance;
    }

    public Object readResolve() {
        return instance;
    }
}

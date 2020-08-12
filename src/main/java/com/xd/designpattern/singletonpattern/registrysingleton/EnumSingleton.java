package com.xd.designpattern.singletonpattern.registrysingleton;

/**
 * 枚举式单例
 *
 * @author xd
 * Created on 八月/12 23:10
 */
public enum EnumSingleton {
    INSTANCE;

    private Object Data;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }
}

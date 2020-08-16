package com.xd.designpattern.util;

import java.lang.reflect.Field;

/**
 * Description
 *
 * @author xd
 * Created on 八月/15 22:28
 */
public class BeanUtil {

    /**
     * 拷贝对象
     *
     * @param prototype 原型对象
     * @return 拷贝对象
     */
    public static Object copyObject(Object prototype) {
        Class<?> clazz = prototype.getClass();
        Object newObject = null;
        try {
            newObject = clazz.newInstance();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                field.set(newObject, field.get(prototype));

            }
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return newObject;
    }
}

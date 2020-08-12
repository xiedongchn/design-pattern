package com.xd.designpattern.singletonpattern.registrysingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Description
 *
 * @author xd
 * Created on 八月/12 23:12
 */
public class TestRegistrySingleton {

    public static void main(String[] args) {
        testEnumSingleton();
        testEnumSingletonReflect();
    }

    public static void testEnumSingleton() {
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setData("test");
    }

    /**
     * 方法中分别通过三种反射方式获取枚举单例对象，分别会报如下异常：
     * 1、java.lang.NoSuchMethodException: com.xd.designpattern.singletonpattern.registrysingleton.EnumSingleton.<init>()
     * 2、java.lang.IllegalAccessException: Class com.xd.designpattern.singletonpattern.registrysingleton.TestRegistrySingleton can not access a member of class com.xd.designpattern.singletonpattern.registrysingleton.EnumSingleton with modifiers "private"
     * 3、Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
     *
     * 这表明Java从底层就限制了通过反射的方式获取枚举对象，所以枚举天然适合用来实现单例
     * 具体可以参考{@link java.lang.Enum}
     */
    public static void testEnumSingletonReflect() {
        try {
            Class clazz = EnumSingleton.class;
            Constructor constructor = clazz.getDeclaredConstructor();
            EnumSingleton o = (EnumSingleton) constructor.newInstance();
            System.out.println(o);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            Class clazz = EnumSingleton.class;
            Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
            EnumSingleton o = (EnumSingleton) constructor.newInstance("", 1);
            System.out.println(o);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            Class clazz = EnumSingleton.class;
            Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            EnumSingleton o = (EnumSingleton) constructor.newInstance("", 1);
            System.out.println(o);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void testContainerSingleton() {
        ContainerSingleton.getInstance("com.xd.designpattern.singletonpattern.registrysingleton.ContainerSingleton");
    }
}

package com.xd.designpattern.singletonpattern.serializesingleton;

import java.io.*;

/**
 * 单例的序列化与反序列化测试
 *
 * @author xd
 * Created on 八月/13 23:48
 */
public class TestSerializeSingleton {

    public static void main(String[] args) {
        testSerializeSingleton();
        testSerializableSingletonOptimize();
    }

    /**
     * 测试序列化会破坏单例的情况，先把s1写到文件中，再从文件中读取到s2，打印两个对象，
     * 发现两者不是同一个对象
     */
    public static void testSerializeSingleton() {
        SerializableSingleton s1 = SerializableSingleton.getInstance();
        SerializableSingleton s2;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("serialize.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("serialize.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s2 = (SerializableSingleton) ois.readObject();

            ois.close();

            System.out.println("s1:" + s1 + "\ns2:" + s2 + "\ns1=s2:" + (s1 == s2));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 由于类SerializableSingletonOptimize中增加了readResolve方法，故在反序列化过程中，
     * 也就是ois.readObject()方法中会查找是否有该方法，若实例已经有值则不再创建新的对象，并返回当前对象
     * 具体参照源码{@link ObjectInputStream#readOrdinaryObject(boolean)}
     */
    public static void testSerializableSingletonOptimize() {
        SerializableSingletonOptimize s1 = SerializableSingletonOptimize.getInstance();
        SerializableSingletonOptimize s2;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("serialize.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("serialize.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s2 = (SerializableSingletonOptimize) ois.readObject();

            ois.close();

            System.out.println("s1:" + s1 + "\ns2:" + s2 + "\ns1=s2:" + (s1 == s2));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

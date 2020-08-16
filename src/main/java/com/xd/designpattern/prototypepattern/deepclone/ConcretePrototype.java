package com.xd.designpattern.prototypepattern.deepclone;

import java.io.*;
import java.util.List;

/**
 * 深拷贝
 *
 * @author xd
 * Created on 八月/15 22:44
 */
public class ConcretePrototype implements Cloneable, Serializable {
    private static final long serialVersionUID = 5760455201912318480L;
    private static final ConcretePrototype instance = new ConcretePrototype();

    /**
     * 姓名(String->基本数据类型)
     */
    private String name;

    /**
     * 年龄(int->基本数据类型)
     */
    private int age;

    /**
     * 着装(List->引用数据类型)
     */
    private List<String> clothes;

    /**
     * 唯一全局访问点
     *
     * @return instance
     */
    public static ConcretePrototype getInstance() {
        return instance;
    }

    /**
     * 私有化构造方法
     */
    private ConcretePrototype() {}

    /**
     * 单例不要实现cloneable，防止反射调用clone方法破坏单例，如果非要实现，需要重写clone方法，并返回单例对象
     *
     * @return instance
     */
    @Override
    public ConcretePrototype clone() {
        return instance;
    }

    /**
     * 深拷贝，另一种深拷贝方式，通过json的方式，先把对象转换成json字符串，再把json字符串转换成新的对象
     *
     * @return 深克隆对象
     */
    public ConcretePrototype deepClone() {
        ConcretePrototype cloneObject = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            cloneObject = (ConcretePrototype) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return cloneObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getClothes() {
        return clothes;
    }

    public void setClothes(List<String> clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return String.format("ConcretePrototype{name='%s', age=%d, clothes=%s}", name, age, clothes);
    }

}

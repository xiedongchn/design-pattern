package com.xd.designpattern.prototypepattern.shallowclone;

import java.io.Serializable;
import java.util.List;

/**
 * Description
 *
 * @author xd
 * Created on 八月/15 22:44
 */
public class ConcretePrototype implements Cloneable, Serializable {
    private static final long serialVersionUID = -1862979200516822479L;

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
     * 浅拷贝
     *
     * @return 拷贝对象
     */
    @Override
    public ConcretePrototype clone() {
        try {
            //super.clone()对于引用数据类型，只是拷贝了内存地址
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
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

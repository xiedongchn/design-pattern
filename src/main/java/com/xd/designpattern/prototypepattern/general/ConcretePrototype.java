package com.xd.designpattern.prototypepattern.general;

import java.io.Serializable;
import java.util.List;

/**
 * Description
 *
 * @author xd
 * Created on 八月/15 22:44
 */
public class ConcretePrototype implements IPrototype, Serializable {
    private static final long serialVersionUID = 3076759632598347900L;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 着装
     */
    private List<String> clothes;

    @Override
    public Object clone() {
        ConcretePrototype newPrototype = new ConcretePrototype();
        newPrototype.setAge(getAge());
        newPrototype.setName(getName());
        return newPrototype;
        //return BeanUtil.copyObject(newPrototype);
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

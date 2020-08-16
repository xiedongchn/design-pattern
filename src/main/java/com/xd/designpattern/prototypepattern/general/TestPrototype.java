package com.xd.designpattern.prototypepattern.general;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式测试类
 *
 * @author xd
 * Created on 八月/15 22:50
 */
public class TestPrototype {

    public static void main(String[] args) {
        //创建原型对象
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setName("张三");
        prototype.setAge(1);
        List<String> clothes = new ArrayList<>();
        clothes.add("裤子");
        clothes.add("上衣");
        prototype.setClothes(clothes);

        //拷贝原型对象
        ConcretePrototype clonePrototype = (ConcretePrototype) prototype.clone();
        clonePrototype.setName("李四");

        System.out.println(prototype.hashCode() + ":" + prototype);
        System.out.println(clonePrototype.hashCode() + ":" + clonePrototype);
    }
}

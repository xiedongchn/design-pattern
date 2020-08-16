package com.xd.designpattern.prototypepattern.shallowclone;

import java.util.ArrayList;
import java.util.List;

/**
 * 浅拷贝测试类
 *
 * @author xd
 * Created on 八月/15 23:11
 */
public class TestShallow {

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
        ConcretePrototype clonePrototype = prototype.clone();
        clonePrototype.getClothes().add("帽子");

        System.out.println(prototype.hashCode() + ":" + prototype);
        System.out.println(clonePrototype.hashCode() + ":" + clonePrototype);
        System.out.println(prototype.getClothes() == clonePrototype.getClothes());
    }
}

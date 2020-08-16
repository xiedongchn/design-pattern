package com.xd.designpattern.prototypepattern.deepclone;

import java.util.ArrayList;
import java.util.List;

/**
 * 深拷贝测试类
 *
 * @author xd
 * Created on 八月/15 23:11
 */
public class TestDeepClone {

    public static void main(String[] args) {
        //创建原型对象
        ConcretePrototype prototype = ConcretePrototype.getInstance();
        prototype.setName("张三");
        prototype.setAge(1);
        List<String> clothes = new ArrayList<>();
        clothes.add("裤子");
        clothes.add("上衣");
        prototype.setClothes(clothes);

        //拷贝原型对象
        ConcretePrototype clonePrototype = prototype.deepClone();
        clonePrototype.getClothes().add("帽子");

        //这里展示出原型和单例本质上是冲突的
        System.out.println(prototype.hashCode() + ":" + prototype);
        System.out.println(clonePrototype.hashCode() + ":" + clonePrototype);
        System.out.println(prototype.getClothes() == clonePrototype.getClothes());
    }
}

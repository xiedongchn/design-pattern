package com.xd.designpattern.proxypatter.staticproxy;

/**
 * 静态代理测试类，一个对象对应一个代理对象，在该示例中相当于一个儿子一个妈，儿子上学，需要妈妈报名，
 * 繁杂的手续妈妈来做，儿子只需要等手续办完就能上学了。
 * 缺点：扩展困难，当需要代理的对象增多时，需要修改代理对象，例如生了二胎，多了个女儿(Daughter)也要上学，那么就需要
 * 修改Mommy的逻辑，增加对Daughter的引用
 *
 * @author xd
 * Created on 八月/16 12:20
 */
public class TestStaticProxy {

    public static void main(String[] args) {
        //儿子上学，妈妈报名
        Mommy mommy = new Mommy(new Son());
        mommy.signUpForSchool();
    }
}

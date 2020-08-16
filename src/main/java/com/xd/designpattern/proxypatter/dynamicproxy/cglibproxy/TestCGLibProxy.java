package com.xd.designpattern.proxypatter.dynamicproxy.cglibproxy;

/**
 * jdk代理测试类
 *
 * @author xd
 * Created on 八月/16 13:38
 */
public class TestCGLibProxy {

    public static void main(String[] args) {
        Mommy mommy = new Mommy();
        IChild son = (IChild) mommy.getInstance(Son.class);
        son.signUpForSchool();

        IChild daughter = (IChild) mommy.getInstance(Daughter.class);
        daughter.signUpForSchool();
    }
}

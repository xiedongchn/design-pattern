package com.xd.designpattern.proxypatter.dynamicproxy.myproxy;

/**
 * Description
 *
 * @author xd
 * Created on 八月/16 18:36
 */
public class TestMyProxy {

    public static void main(String[] args) {
        Mommy mommy = new Mommy();
        IChild son = (IChild) mommy.getInstance(new Son());
        son.signUpForSchool();
    }
}

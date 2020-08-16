package com.xd.designpattern.proxypatter.dynamicproxy.cglibproxy;

/**
 * 女儿
 *
 * @author xd
 * Created on 八月/16 12:55
 */
public class Daughter implements IChild {

    @Override
    public void signUpForSchool() {
        System.out.println("妹妹要上幼儿园");
    }
}

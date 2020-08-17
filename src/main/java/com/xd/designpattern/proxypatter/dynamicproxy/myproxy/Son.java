package com.xd.designpattern.proxypatter.dynamicproxy.myproxy;

/**
 * 儿子
 *
 * @author xd
 * Created on 八月/16 12:16
 */
public class Son implements IChild {

    @Override
    public void signUpForSchool() {
        System.out.println("儿子要上小学");
    }
}

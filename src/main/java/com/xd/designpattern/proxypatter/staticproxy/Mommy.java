package com.xd.designpattern.proxypatter.staticproxy;

/**
 * 妈妈
 *
 * @author xd
 * Created on 八月/16 12:16
 */
public class Mommy {
    private final Son son;

    public Mommy(Son son) {
        this.son = son;
    }

    public void signUpForSchool() {
        System.out.println("妈妈帮孩子准备材料");
        son.signUpForSchool();
        System.out.println("孩子上学");
    }
}

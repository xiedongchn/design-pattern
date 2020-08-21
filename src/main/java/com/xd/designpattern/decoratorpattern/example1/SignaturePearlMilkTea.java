package com.xd.designpattern.decoratorpattern.example1;

/**
 * 招牌珍珠奶茶，基础款
 *
 * @author xd
 * Created on 八月/19 21:59
 */
public class SignaturePearlMilkTea extends PearlMilkTea {

    public SignaturePearlMilkTea() {
    }

    @Override
    protected String getName() {
        return "招牌";
    }

    @Override
    protected Integer getPrice() {
        return 20;
    }
}

package com.xd.designpattern.decoratorpattern.example1;

/**
 * 奶茶加珍珠装饰器
 *
 * @author xd
 * Created on 八月/19 22:11
 */
public class PearlDecorator extends PearlMilkTeaDecorator {

    public PearlDecorator(PearlMilkTea pearlMilkTea) {
        super(pearlMilkTea);
    }

    protected String getName() {
        return super.getName() + "_加珍珠";
    }

    protected Integer getPrice() {
        return super.getPrice() + 2;//加珍珠2元
    }
}

package com.xd.designpattern.decoratorpattern.example1;

/**
 * 奶茶加奶装饰器
 *
 * @author xd
 * Created on 八月/19 22:00
 */
public class MilkDecorator extends PearlMilkTeaDecorator {

    public MilkDecorator(PearlMilkTea pearlMilkTea) {
        super(pearlMilkTea);
    }

    @Override
    protected String getName() {
        return super.getName() + "_加奶";
    }

    @Override
    protected Integer getPrice() {
        return super.getPrice() + 2;//加一份奶2块钱
    }
}

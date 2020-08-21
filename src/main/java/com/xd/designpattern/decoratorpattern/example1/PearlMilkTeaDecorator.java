package com.xd.designpattern.decoratorpattern.example1;

/**
 * 珍珠奶茶的装饰器
 *
 * @author xd
 * Created on 八月/19 22:05
 */
public class PearlMilkTeaDecorator extends PearlMilkTea {
    private final PearlMilkTea pearlMilkTea;

    public PearlMilkTeaDecorator(PearlMilkTea pearlMilkTea) {
        this.pearlMilkTea = pearlMilkTea;
    }

    @Override
    protected String getName() {
        return pearlMilkTea.getName();
    }

    @Override
    protected Integer getPrice() {
        return pearlMilkTea.getPrice();
    }
}

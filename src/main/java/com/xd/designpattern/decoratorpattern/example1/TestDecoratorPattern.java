package com.xd.designpattern.decoratorpattern.example1;

import org.junit.Test;

/**
 * Description
 *
 * @author xd
 * Created on 八月/19 22:14
 */
public class TestDecoratorPattern {

    @Test
    public void testDecoratorPattern() {
        PearlMilkTea pearlMilkTea = new SignaturePearlMilkTea();//获取基础款珍珠奶茶
        pearlMilkTea = new MilkDecorator(pearlMilkTea);//加奶
        pearlMilkTea = new PearlDecorator(pearlMilkTea);//加珍珠

        System.out.println(pearlMilkTea.getName() + ":" + pearlMilkTea.getPrice());
    }
}

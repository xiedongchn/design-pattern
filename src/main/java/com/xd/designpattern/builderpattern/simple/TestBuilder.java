package com.xd.designpattern.builderpattern.simple;

/**
 * Description
 *
 * @author xd
 * Created on 八月/16 01:43
 */
public class TestBuilder {

    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Book book = builder.setName("Java").setPrice(55).build();

        System.out.println(book.toString());
    }
}

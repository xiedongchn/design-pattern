package com.xd.designpattern.builderpattern.simple;

/**
 * 课程对象
 *
 * @author xd
 * Created on 八月/16 01:24
 */
public class Book {

    private String name;

    private float price;

    public Book() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Book{name='%s', price=%s}", name, price);
    }
}

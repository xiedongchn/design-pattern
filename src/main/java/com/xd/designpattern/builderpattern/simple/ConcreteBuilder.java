package com.xd.designpattern.builderpattern.simple;

/**
 * 课程创建者
 *
 * @author xd
 * Created on 八月/16 01:25
 */
public class ConcreteBuilder implements IBuilder {
    private final Book book = new Book();

    @Override
    public Book build() {
        return book;
    }

    /**
     * 返回ConcreteBuilder对象，链式编程
     *
     * @param name 名称
     * @return ConcreteBuilder
     */
    public ConcreteBuilder setName(String name) {
        this.book.setName(name);
        return this;
    }

    public ConcreteBuilder setPrice(float price) {
        this.book.setPrice(price);
        return this;
    }
}

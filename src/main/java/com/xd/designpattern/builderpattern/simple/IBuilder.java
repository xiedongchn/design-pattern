package com.xd.designpattern.builderpattern.simple;

/**
 * 简单的创建者
 *
 * @author xd
 * Created on 八月/16 01:24
 */
public interface IBuilder {

    /**
     * 构建课程
     *
     * @return Course
     */
    Book build();
}

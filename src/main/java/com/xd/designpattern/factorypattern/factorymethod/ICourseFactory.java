package com.xd.designpattern.factorypattern.factorymethod;

/**
 * 工厂方法模式接口
 *
 * @author xd
 * Created on 八月/8 17:58
 */
public interface ICourseFactory {

    /**
     * 创建课程
     *
     * @return ICourse
     */
    ICourse createCourse();
}

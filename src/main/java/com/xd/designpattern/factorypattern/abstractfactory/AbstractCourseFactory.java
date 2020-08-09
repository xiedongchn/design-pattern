package com.xd.designpattern.factorypattern.abstractfactory;

/**
 * 课程的抽象工厂
 *
 * @author xd
 * Created on 八月/9 22:40
 */
public abstract class AbstractCourseFactory {

    /**
     * 公共的初始化方法
     */
    void init() {
        System.out.println("初始化基础数据");
    }

    /**
     * 记录笔记
     *
     * @return INote
     */
    protected abstract INote createNote();

    /**
     * 记录视频
     *
     * @return IVideo
     */
    protected abstract IVideo createVideo();
}

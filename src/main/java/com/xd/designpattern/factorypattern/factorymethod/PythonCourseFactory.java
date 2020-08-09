package com.xd.designpattern.factorypattern.factorymethod;

/**
 * PythonCourse工厂
 *
 * @author xd
 * Created on 八月/8 18:01
 */
public class PythonCourseFactory implements ICourseFactory {

    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }
}

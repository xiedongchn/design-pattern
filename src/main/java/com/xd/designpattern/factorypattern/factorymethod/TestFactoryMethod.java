package com.xd.designpattern.factorypattern.factorymethod;

import org.junit.Test;

/**
 * Description
 *
 * @author xd
 * Created on 八月/8 18:01
 */
public class TestFactoryMethod {

    @Test
    public void createCourse() {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.createCourse();
        course.record();
    }
}

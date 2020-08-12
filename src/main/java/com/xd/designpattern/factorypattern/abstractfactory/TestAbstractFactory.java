package com.xd.designpattern.factorypattern.abstractfactory;

import org.junit.Test;

/**
 * Description
 *
 * @author xd
 * Created on 八月/9 22:54
 */
public class TestAbstractFactory {

    @Test
    public void createCourse() {
        AbstractCourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}

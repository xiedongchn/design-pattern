package com.xd.designpattern.factory.abstractfactory;

import com.xd.designpattern.factory.factorymethod.ICourseFactory;
import com.xd.designpattern.factory.factorymethod.JavaCourseFactory;
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

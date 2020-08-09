package com.xd.designpattern.factory.factorymethod;

import com.xd.designpattern.factory.abstractfactory.AbstractCourseFactory;
import com.xd.designpattern.factory.abstractfactory.INote;
import com.xd.designpattern.factory.abstractfactory.IVideo;

/**
 * JavaCourse工厂
 *
 * @author xd
 * Created on 八月/8 18:00
 */
public class JavaCourseFactory extends AbstractCourseFactory {

    @Override
    protected INote createNote() {
        return null;
    }

    @Override
    protected IVideo createVideo() {
        return null;
    }
}

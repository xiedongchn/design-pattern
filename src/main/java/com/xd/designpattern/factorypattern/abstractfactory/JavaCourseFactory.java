package com.xd.designpattern.factorypattern.abstractfactory;

/**
 * Description
 *
 * @author xd
 * Created on 八月/9 22:46
 */
public class JavaCourseFactory extends AbstractCourseFactory {

    @Override
    protected INote createNote() {
        super.init();
        return new JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}

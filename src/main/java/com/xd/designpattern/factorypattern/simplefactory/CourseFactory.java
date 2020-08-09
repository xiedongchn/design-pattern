package com.xd.designpattern.factory.simplefactory;

import com.xd.designpattern.factory.util.StringUtil;

/**
 * 简单的工厂模式
 * JDK中简单工厂模式的应用{@link java.util.Calendar#getInstance(java.util.TimeZone, java.util.Locale)}
 *
 * @author xd
 * Created on 八月/8 17:07
 */
public class CourseFactory {

    /**
     * 工厂方法一
     *
     * @param courseName 课程名
     * @return ICourse
     */
    public static ICourse createCourseV1(String courseName) {
        ICourse course = null;
        if ("Java".equals(courseName)) {
            course = new JavaCourse();
        } else if ("Python".equals(courseName)) {
            course = new PythonCourse();
        }
        return course;
    }

    /**
     * 工厂方法二，通过类名进行构造
     *
     * @param className 类名
     * @return ICourse
     */
    public static ICourse createCourseV2(String className) {
        if (!StringUtil.isNullOrEmpty(className)) {
            try {
                return (ICourse) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 通过类型构造对象
     *
     * @param clazz 类型
     * @return ICourse
     * @throws IllegalAccessException 非法访问属性异常
     * @throws InstantiationException 构造对象实例异常
     */
    public static ICourse createCourseV3(Class<? extends ICourse> clazz) throws IllegalAccessException, InstantiationException {
        return clazz != null ? clazz.newInstance() : null;
    }
}

package com.xd.designpattern.proxypatter.dynamicproxy.myproxy;

/**
 * Description
 *
 * @author xd
 * Created on 八月/16 18:31
 */
public class MyClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}

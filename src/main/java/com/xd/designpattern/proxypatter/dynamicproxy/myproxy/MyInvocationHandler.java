package com.xd.designpattern.proxypatter.dynamicproxy.myproxy;

import java.lang.reflect.Method;

/**
 * Description
 *
 * @author xd
 * Created on 八月/16 18:26
 */
public interface MyInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}

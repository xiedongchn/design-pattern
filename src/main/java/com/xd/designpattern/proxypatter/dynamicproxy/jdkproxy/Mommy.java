package com.xd.designpattern.proxypatter.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 妈妈
 *
 * @author xd
 * Created on 八月/16 12:16
 */
public class Mommy implements InvocationHandler {
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("妈妈帮孩子报名");
    }

    private void after() {
        System.out.println("妈妈送孩子上学");
    }
}

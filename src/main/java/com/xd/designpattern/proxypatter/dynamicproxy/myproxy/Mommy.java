package com.xd.designpattern.proxypatter.dynamicproxy.myproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 妈妈
 *
 * @author xd
 * Created on 八月/16 12:16
 */
public class Mommy implements MyInvocationHandler {
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
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

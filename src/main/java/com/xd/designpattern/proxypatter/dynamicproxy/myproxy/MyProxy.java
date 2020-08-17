package com.xd.designpattern.proxypatter.dynamicproxy.myproxy;


/**
 * Description
 *
 * @author xd
 * Created on 八月/16 18:29
 */
public class MyProxy {

    public static Object newProxyInstance(MyClassLoader loader, Class<?>[] interfaces, MyInvocationHandler h) {
        //1、动态生成源码Java文件
        String src = gennerateSrc(interfaces);

        //2、Java文件输出到磁盘
        //3、把java文件编译成class文件
        //4、把生成的class文件加载到jvm中
        //5、返回新的代理对象
        return null;
    }

    private static String gennerateSrc(Class<?>[] interfaces) {
        StringBuilder builder = new StringBuilder("com.xd.designpattern.proxypattern.myproxy" + "");

        return null;
    }
}

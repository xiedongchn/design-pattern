package com.xd.designpattern.proxypatter.dynamicproxy.jdkproxy;

import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * jdk代理测试类
 *
 * @author xd
 * Created on 八月/16 13:38
 */
public class TestJdkProxy {

    public static void main(String[] args) {
        Mommy mommy = new Mommy();
        IChild son = (IChild) mommy.getInstance(new Son());
        son.signUpForSchool();

        IChild daughter = (IChild) mommy.getInstance(new Daughter());
        daughter.signUpForSchool();
    }

    @Test
    public void genProxyClassFile() {
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IChild.class});
        FileOutputStream fos = null;
        try {
            String realPath = this.getClass().getResource("/").getPath();
            System.out.println(realPath);
            //根据生成的代理类对象，反编译查看源码
            fos = new FileOutputStream(new File(realPath + "$Proxy0.class"));
            fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

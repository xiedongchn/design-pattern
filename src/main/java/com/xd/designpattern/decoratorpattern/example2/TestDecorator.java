package com.xd.designpattern.decoratorpattern.example2;

import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

/**
 * Description
 *
 * @author xd
 * Created on 八月/19 22:44
 */
public class TestDecorator {
    private static final JsonLogger jsonLogger = JsonLoggerFactory.getLogger(TestDecorator.class);

    @Before
    public void initLoggerConfig() {
        // log4j:WARN No appenders could be found for logger (com.xd.designpattern.decoratorpattern.example2.TestDecorator).
        // log4j:WARN Please initialize the log4j system properly.
        // log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
        // 下面这行代码可以解决上面的报错
        BasicConfigurator.configure();
    }

    @Test
    public void testJsonLogger() throws IOException {
        jsonLogger.error("系统错误");

        // JDK中关于装饰器模式的用法
        // 输入输出流，把功能一层一层的封装，需要什么自己加
        // 非常经典，可以看下其类图，分析继承体系，都有相似的构造方法，通过构造方法传参，参数和实现类是一个继承体系内的
        // 在mybatis中，Cache接口及其实现类也是典型的装饰器模式的用法
        try {
            InputStream is = new FileInputStream("");
            BufferedInputStream bis = new BufferedInputStream(is);
            bis.read();

            bis.close();
            is.close();

            BufferedReader br = new BufferedReader(new FileReader(""));
            br.readLine();

            br = new BufferedReader(new StringReader(""));
            br.readLine();
        } catch (FileNotFoundException e) {
            jsonLogger.error(e);
        }
    }
}

package com.xd.designpattern.decoratorpattern.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JsonLogger工厂
 *
 * @author xd
 * Created on 八月/19 22:46
 */
public class JsonLoggerFactory {

    public static JsonLogger getLogger(Class<?> clazz) {
        Logger logger = LoggerFactory.getLogger(clazz);
        return new JsonLogger(logger);
    }
}

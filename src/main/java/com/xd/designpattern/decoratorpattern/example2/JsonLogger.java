package com.xd.designpattern.decoratorpattern.example2;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;

import java.util.Arrays;

/**
 * 使用装饰器模式扩展的Json日志工具，在log4j的基础上进行增强
 *
 * @author xd
 * Created on 八月/19 22:30
 */
public class JsonLogger extends LoggerDecorator {

    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void info(String s) {
        logger.info(newJSONObject("msg", s).toString());
    }

    @Override
    public void error(String s) {
        logger.error(newJSONObject("msg", s).toString());
    }

    public void error(Exception e) {
        JSONObject jsonObject = newJSONObject("ex", e.getClass().getName());
        jsonObject.put("stackTrace", Arrays.toString(e.getStackTrace()));
        logger.error(jsonObject.toString());
    }

    public JSONObject newJSONObject(String key, String msg) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(key, msg);
        return jsonObject;
    }
}

package com.xd.designpattern.factory.util;

import java.util.Objects;

/**
 * 字符串工具类
 *
 * @author xd
 * Created on 八月/8 17:16
 */
public class StringUtil {

    /**
     * 判断字符串是空串还是null
     *
     * @param str 要判断的字符串
     * @return boolea
     */
    public static boolean isNullOrEmpty(String str) {
        return Objects.isNull(str) || "".equals(str);
    }

}

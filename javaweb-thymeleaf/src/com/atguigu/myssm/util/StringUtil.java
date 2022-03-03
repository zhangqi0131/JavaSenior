package com.atguigu.myssm.util;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月02日 17:07  周三
 */
public class StringUtil {
    public static boolean isEmpty(String string) {
        return string == null || "".equals(string);
    }

    public static boolean isNotEmpty(String string) {
        return !isEmpty(string);
    }
}

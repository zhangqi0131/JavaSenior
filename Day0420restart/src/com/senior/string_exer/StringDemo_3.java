package com.senior.string_exer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-06 20:49
 **/


import org.junit.Test;

/**
 * 获取两个字符串中的最大相同子串
 * str1 = "asdkajsnheolloasdjnasd"  str2 = "saxheollomsw"
 *
 * 前提：只有一个最大子串
 */

public class StringDemo_3 {

    public String getMaxSameString(String str1, String str2) {

        if (str1 != null && str2 != null) {

            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;
            int length = minStr.length();

            for (int i = 0; i < length; i++) {

                for (int x = 0, y = length - i; y <= length; x++, y++) {
                    String subStr = minStr.substring(x, y);
                    if (maxStr.contains(subStr)) {
                        return subStr;
                    }
                }
            }
        }
        return null;


    }

    @Test
    public void test() {

        String str1 = "asdkajsnheolloasdjnasd";
        String str2 = "saxheollomsw";

        String maxSameString = getMaxSameString(str1, str2);
        System.out.println(maxSameString);


    }
}

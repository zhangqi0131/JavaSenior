package com.senior.string_exer;

import org.junit.Test;

/**
 * @program: JavaSenior
 * @description: 获取一个字符串在另一个字符串中出现的次数
 * @author: Zhang.Qi
 * @create: 2021-05-05 21:28
 **/

public class StringDemo_2 {

    /**
     * ab 在 skdjabdklfsjljabsdlkjab 中出现的次数
     * <p>
     * 获取subStr在mainStr中出现的次数
     *
     * @param mainStr
     * @param subStr
     * @return
     */

    public int getCount(String mainStr, String subStr) {

        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;

        if (mainLength >= subLength) {

            //1.
//            while ((index = mainStr.indexOf(subStr)) != -1) {
//                count++;
//                mainStr = mainStr.substring(index + subStr.length());
//            }

            //2.
            while ((index = mainStr.indexOf(subStr, index)) != -1) {
                count++;
                index += subLength;
            }
            return count;
        } else {
            return 0;
        }

    }

    @Test
    public void testGetCount() {

        String mainStr = "sabjabdklfsjljabsdlkjab";
        String subStr = "ab";

        int count = getCount(mainStr, subStr);
        System.out.println(count);
    }

}

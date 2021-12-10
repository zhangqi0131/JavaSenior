package com.senior.string_exer;

import org.junit.Test;

/**
 * @program: JavaSenior
 * @description: 字符串反转
 * @author: Zhang.Qi
 * @create: 2021-05-05 20:47
 **/

public class StringDemo_1 {

    /*
    将一个字符串反转。将一个字符串中指定部分进行反转
     */
    public String reverse(String str, int startIndex, int endIndex) {

        if (str != null) {

            char[] arr = str.toCharArray();
            for (int i = startIndex, j = endIndex; i < j; i++, j--) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            return new String(arr);
        }
        return null;
    }


    /*
    方式二：使用String的拼接
     */
    public String reverse1(String str, int startIndex, int endIndex) {

        if (str != null) {

            //1
            String reverseStr = str.substring(0, startIndex);
            //2
            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);
            }

            //3
            reverseStr += str.substring(endIndex + 1);

            return reverseStr;
        }
        return null;
    }


    /*
    方式3：使用StringBuffer/StringBuilder替换String
     */
    public String reverse2(String str, int startIndex, int endIndex) {

        if (str != null) {
            StringBuilder builder = new StringBuilder(str.length());

            //1
            builder.append(str.substring(0, startIndex));
            //2
            for (int i = endIndex; i >= startIndex; i--) {
                builder.append(str.charAt(i));
            }
            //3
            builder.append(str.substring(endIndex + 1));

            return builder.toString();
        }
        return null;

    }


    @Test
    public void testReverse() {

        String str = "abcdefg";
        String reverse = reverse2(str, 2, 5);

        System.out.println(str);
        System.out.println(reverse);


    }

}









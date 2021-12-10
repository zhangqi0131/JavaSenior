package zq.exercise;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PictureTest {

    //图片加密
    @Test
    public void test1(){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("2.jpg"));
            fos = new FileOutputStream("2sercert.jpg");

            byte[] buffer = new byte[20];
            int len;
            while ((len =fis.read(buffer)) != -1){
                //字节数组进行修改
                //错误写法，没有改数组
    //            for (byte b : buffer){
    //                b = (byte)(b ^ 5);
    //            }

                //正确写法
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte)(buffer[i] ^ 5);
                }

                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){

                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fis != null){

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    //图片解密
    @Test
    public void test2(){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("2sercert.jpg"));
            fos = new FileOutputStream("4sercert.jpg");

            byte[] buffer = new byte[20];
            int len;
            while ((len =fis.read(buffer)) != -1){
                //字节数组进行修改
                //错误写法，没有改数组
                //            for (byte b : buffer){
                //                b = (byte)(b ^ 5);
                //            }

                //正确写法
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte)(buffer[i] ^ 5);
                }

                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){

                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fis != null){

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package zq.java;

import org.junit.Test;

import java.io.*;

/**
 *
 * 对于文本文件(.txt  .java  .c  .cpp)，使用字符流处理
 * 对于非文本文件(.jpg  .avi.  .mp4  .doc  .ppt)，使用字节流处理
 *
 */
public class FileInputOutputStream {

    //使用字节流FileInputStream处理文本文件可能出现乱码
    @Test
    public void testFileInputStream() {
        FileInputStream fis = null;
        try {
            //1.造文件
            File file = new File("hello.txt");

            //2.造流
            fis = new FileInputStream(file);

            //3.读数据
            byte[] buffer = new byte[5];
            int len;//记录每次读取的字节的个数
            while ((len = fis.read(buffer)) != -1) {

                String str = new String(buffer, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {

        } finally {
            if (fis != null)
            //4.关闭流资源
            {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /*
    实现对图片的复制操作
     */
    @Test
    public void testFileInputOutputStream() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //
            File srcFile = new File("1.jpg");
            File destFile = new File("2.jpg");

            //
             fis = new FileInputStream(srcFile);
             fos = new FileOutputStream(destFile);

            //复制过程
            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }

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
            if (fis != null) {
                try {
                    //
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }




    /*
    指定路径下文件的复制

     */

    public void copyFile(String srcPath,String destPath){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            //
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //复制过程
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer,0, len);
            }

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
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testCopyFile(){
        long start = System.currentTimeMillis();

        String srcPath = "C:\\Users\\Zacha\\Desktop\\01-video.avi";
        String destPath = "C:\\Users\\Zacha\\Desktop\\02-video.avi";
        copyFile(srcPath,destPath);

        long end = System.currentTimeMillis();
        System.out.println("复制操作花费的时间为：" + (end - start));

    }




}
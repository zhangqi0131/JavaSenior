package zq.java;

import org.junit.Test;

import java.io.*;

/**
 *
 * 处理流之一：缓冲流的使用
 *
 * 1.缓冲流：
 * BufferedInputStream
 * BufferedOutputStream
 * BufferedReader
 * BufferedWriter
 *
 * 2.作用：提升流的读取、写入速度
 *      提高读写速度的原因：内部提供了缓冲区
 *
 *
 * 3.处理流，就是“套接在”已有的流的基础上
 *
 */


public class BufferedTest {

    @Test
    public void BufferedTest() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //1.造文件
            File srcfile = new File("1.jpg");
            File destfile = new File("3.jpg");

            //2.造流
            //2.1造节点流
            FileInputStream fis = new FileInputStream((srcfile));
            FileOutputStream fos = new FileOutputStream((destfile));

            //2.2造处理流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.读取和写入的过程
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);

                bos.flush();//刷新缓冲区
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭
            //要求：先关外层的流，再关内层的流
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }


        }

        //说明：关闭外层的同时，内层也会自动关闭。内层流的关闭可以省略
//        fos.close();
//        fis.close();
    }



    //实现文件复制的方法
    public void copyFileWithBuffered(String srcPath,String destPath){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //1.造文件
            File srcfile = new File(srcPath);
            File destfile = new File(destPath);

            //2.造流
            //2.1造节点流
            FileInputStream fis = new FileInputStream((srcfile));
            FileOutputStream fos = new FileOutputStream((destfile));

            //2.2造处理流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.读取和写入的过程
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

        //4.资源关闭
        //要求：先关外层的流，再关内层的流
        if (bos != null) {
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (bis != null) {
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //说明：关闭外层的同时，内层也会自动关闭。内层流的关闭可以省略
//        fos.close();
//        fis.close();
    }


    @Test
    public void testCopyWithBufferedStream(){
        long start = System.currentTimeMillis();

        String srcPath = "C:\\Users\\Zacha\\Desktop\\01-video.avi";
        String destPath = "C:\\Users\\Zacha\\Desktop\\03-video.avi";

        copyFileWithBuffered(srcPath,destPath);

        long end = System.currentTimeMillis();

        System.out.println("复制操作花费的时间为：" + (end - start));
    }




    /*
    使用BufferedReader和BufferedWriter实现文本文件的复制
     */
    @Test
    public void testBufferedReaderBufferedWriter() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {

            //创建文件和相应的流
            br = new BufferedReader(new FileReader(new File("czxt.txt")));
            bw = new BufferedWriter(new FileWriter(new File("czxt2.txt")));

            //读写操作
            //方法一：使用char[]数组
//            char[] cbuf = new char[1024];
//            int len;
//            while ((len = br.read(cbuf)) != -1){
//                bw.write(cbuf,0,len);
//            //bw.flush();
//        }

            //方法二：使用String
            String data;
            while ((data = br.readLine()) != null){
            //①
            //bw.write(data + "\n");//data中不包含换行符，需要另加


            //②
            bw.write(data + "\n");//data中不包含换行符
            bw.newLine();
            }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (bw != null){

                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null){

                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

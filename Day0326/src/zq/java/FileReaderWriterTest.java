package zq.java;

import org.junit.Test;

import java.io.*;

/**
 *
 *
 * 流的体系结构
 * 抽象基类         节点流（或文件流）                             缓冲流（处理流的一种）
 * InputStream     FileInputStream (read(byte [] cbuf))       BufferedInputStream (read(byte [] cbuf))
 * OutputStream    FileOutputStream (write(byte[],0,len))     BufferedOutputStream (write(byte[],0,len)) / flush()
 * Reader          FileReader (read(char [] cbuf))            BufferedReader (read(char [] cbuf) / readLine())
 * Writer          FileWriter (write(char[],0,len))           BufferedWriter (write(char[],0,len)) /flush()
 *
 *
 *
 */

/* 将Day0326下的hello.txt文件内容读入程序中，并输出到控制台

   注意点：
   1.read()的理解：返回读入的一个字符，如果达到文件末尾，返回-1
   2.异常的处理：为了保证流资源一定可以执行关闭操作。需要使用try-catch-finally处理
   3.读入的文件一定要存在，否则会报FileNotFoundException异常


 */


public class FileReaderWriterTest {

    public static void main(String[] args) {
        File file = new File("hello.txt");//相较于当前工程
        System.out.println(file.getAbsolutePath());

        File file1 = new File("Day0326\\hello.txt");
        System.out.println(file1.getAbsolutePath());

    }

    @Test
    public void testFileReader() {
        FileReader fr = null;
        try {
            //1.实例化File对象，指明要操作的文件
            File file = new File("hello.txt");//相较于当前Module

            //2.提供具体的流
            fr = new FileReader(file);


            //3.数据的读过程
            //read():返回读入的一个字符，如果达到文件末尾，返回-1
            //方式一：
            int data = fr.read();//
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();

                //            //方式二：
                //            int data;
                //            while (data = fr.read() !=  -1){
                //                System.out.println((char)data);
                //            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //4.流的关闭操作
        try {
                if (fr != null)//在try/catch里面外面都可以
                fr.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }


    //对read()方法操作升级：使用read()重载方法
    @Test
    public void testFileReader1() {
        FileReader fr = null;

        try {
            //1.File类的实例化
            File file = new File("hello.txt");

            //2.FileReader流的实例化
            fr = new FileReader(file);

            //3.读入的操作
            //read(char[] cbuf)：返回每次读入cbuf数组中的字符的个数，如果达到文件末尾，返回-1
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                // 方式一：
                // 错误写法
//                for (int i = 0; i < cbuf.length; i++) {
//                    System.out.print(cbuf[i]);
//                }

                //正确写法
//                for (int i = 0; i < len; i++) {
//                    System.out.print(cbuf[i]);
//                }

                //方式二：
                //错误写法，对应方式一的错误写法
//                String str = new String(cbuf);
//                System.out.print(str);

                //方式二：
                //正确写法：
                String str = new String(cbuf,0,len);
                System.out.print(str);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null)
                //4.资源关闭
            {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /*从内存中写出数据到硬盘的文件里
    说明：
    1.输出操作，对应的file可以不存在，
        如果不存在，输出过程中会自动创建此文件
        如果存在，如果流使用的构造器是：FileWriter(file,false) / 对原有文件覆盖
                如果流使用的构造器是：FileWriter(file,true) / 不会覆盖原有文件，而是在源文件基础上追加内容（往后接着写）


     */
    @Test
    public void testFileWriter() {
        FileWriter fw = null;
        try {
            //1.提供file类的对象，指明写出到的文件
            File file  = new File("hello1.txt");

            //2.提供FileWriter的对象，用于数据的写出
            fw = new FileWriter(file,false);

            //3.写出的操作
            fw.write("hellloooooo!\n");
            fw.write("yeahhhhhhhh!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流资源的关闭
            if (fw != null){

                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void testFileReaderFileWriter() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建file类的对象，指明读入和写出的文件
//            File srcFile = new File("hello.txt");
//            File destFile = new File("hello2.txt");

            //不能使用字符流来处理图片等字节流数据
            File srcFile = new File("1.jpg");
            File destFile = new File("2.jpg");

            //2.创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3.数据的读入和写出操作
            char[] cbuf = new char[5];
            int len;//记录每次读入到cbuf数组中的字符的个数
            while ((len = fr.read(cbuf)) != -1){
                //每次写出len个字符
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4.关闭流资源
            //方式一：
//            try {
//                if (fw != null)
//                fw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally {
//                try {
//                    fr.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }

            //方式二：
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


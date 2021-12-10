package zq;

import org.junit.Test;

import java.io.*;

/**
 * 对象流的使用：
 * 1.ObjectOutputStream  和 ObjectInputStream
 * 2.作用：用于存储和读取基本数据类型数据或对象的处理流，
 * 3.要想一个java对象可序列化，需要满足相应的要求，见Person.java
 */


public class ObjectioStream {



    /*
    序列化过程：将内存中的java对象保存到磁盘中或通过网络传出去
    使用ObjectOutputStream实现
     */
    @Test
    public void testObjectioStream() {


        ObjectOutputStream oos = null;
        try {
            //1.
            oos = new ObjectOutputStream(new FileOutputStream("object.data"));

            //2.
            oos.writeObject(new String("我爱我家"));
            oos.flush(); //刷新操作

            oos.writeObject(new Person("张琪",22));
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null){

                //3.
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /*
    反序列化：将磁盘文件中的对象还原为内存中的java对象
    使用ObjectInputStream实现

     */

    @Test
    public void testObjectIOStream01(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.data"));

            Object obj = ois.readObject();
            String str = (String) obj;

            Person p = (Person) ois.readObject();

            System.out.println(str);
            System.out.println(p);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null){

                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}


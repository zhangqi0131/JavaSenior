package com.zq.oop_1.valuetransfer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-25 23:23
 **/

public class ValueTransferTest2 {
    public static void main(String[] args) {

        Data data = new Data();

        data.m = 10;
        data.n = 20;

        System.out.println("m = " + data.m + ", n = " + data.n);

        //交换m，n的值
//        int temp = data.m;
//        data.m = data.n;
//        data.n = temp;

        ValueTransferTest2 test = new ValueTransferTest2();
        test.swap(data);

        System.out.println("m = " + data.m + ", n = " + data.n);

    }

    public void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

class Data {
    int m;
    int n;
}

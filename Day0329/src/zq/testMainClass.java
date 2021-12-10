package zq;

/**
 * @program: JavaSenior
 * @description: none
 * @author: Zhang.Qi
 * @create: 2021-03-29 14:18
 */

public  class testMainClass{
        /*
        java同步锁的使用
         */
        public static void main(String[] args) {


            //实例化站台对象，为每一个站台取名字
            Station station1 = new Station("窗口1");
            Station station2 = new Station("窗口2");
            Station station3 = new Station("窗口3");

            //让每一个站台开始工作
            station1.start();
            station2.start();
            station3.start();
        }
}
package com.zq.oop_1.encapsulation;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-26 15:04
 **/

public class AnimalTest {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.name = "nina";
//        a.age = 1;
//        a.legs = 4;

        a.show();

        a.setLegs(66);
        a.show();

    }

}
    class Animal {

        String name;
        private int age;
        private int legs;

        //对属性的设置
        public  void setLegs(int l) {
            if (l >= 0 && l % 2 == 0) {
                legs = l;
            } else {
                legs = 0;
                //或者抛出一个异常，提示出错
            }
        }

        //对属性的获取
        public int getLegs() {
            return legs;
        }

        public void eat() {
            System.out.println("动物进食");
        }

        //age的get，set方法
        public int getAge() {
            return age;
        }

        public void setAge(int a) {
            age = a;
        }



        public void show() {
            System.out.println("name = " + name + ", age = " + age + ", legs = " +legs);
        }
}

















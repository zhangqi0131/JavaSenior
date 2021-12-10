package com.zq.interface_exer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-02 22:56
 **/

public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }

        if (o instanceof CompareObject) {
            ComparableCircle c = (ComparableCircle)o;
            //精度损失，不正确
//            return (int) (this.getRadius() - c.getRadius());

            //正确写法 1
            if (this.getRadius() > c.getRadius()) {
                return 1;
            } else if (this.getRadius() < c.getRadius()) {
                return -1;
            } else {
                return 0;
            }

            //正确写法 2
//            return this.getRadius().compareTo(c.getRadius());   使用Double包装类，为一个对象

        } else {
            return 0;
//            throw new RuntimeException("传入的数据类型不匹配");
        }

    }
}

package com.zq.equals_test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-29 19:31
 **/

public class OrderTest {


    public static void main(String[] args) {

        Order order1 = new Order(1001, "AA");
        Order order2 = new Order(1001, "BB");

        System.out.println(order1.equals(order2));

        Order order3 = new Order(1001, "BB");
        System.out.println(order2.equals(order3));

        String s1 = "BB";
        String s2 = "BB";
        System.out.println(s1 == s2); //true


    }

}

class Order {

    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Order) {
            Order order = (Order)obj;

            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        }
        return false;
    }
}





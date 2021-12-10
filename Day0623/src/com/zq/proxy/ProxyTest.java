package com.zq.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-06-30 22:49
 **/

interface Human{
    String getBelief();
    void eat(String food);
}

// 被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I believe I can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}

/*
一：根据加载到内存中的被代理类，动态地创建一个代理类及其对象
二：通过代理类的对象调用方法时，动态地调用被代理类中的同名方法
 */

class ProxyFactory{

    //调用此方法返回一个代理类对象（解决一）
    public static Object getProxyInstance(Object obj){
        // obj:被代理类的对象

        MyInvocationHandler handler = new MyInvocationHandler();

        handler.bind(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
    }
}

class MyInvocationHandler implements InvocationHandler{

    private Object obj;
    public void bind(Object obj){
        this.obj = obj;
    }

    // 通过代理类的对象，调用方法a时，就会自动调用以下的方法：invoke()
    // 将被代理类要执行的方法a的要执行的功能声明在invoke()中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 即为代理类对象要调用的方法，此方法也就作为了被代理类对象要调用的方法
        // obj：被代理类的对象
        Object returnValue = method.invoke(obj, args);
        // 上述方法的返回值就作为当前类中invoke()的返回值
        return returnValue;
    }
}


public class ProxyTest {
    public static void main(String[] args) {

        SuperMan superMan = new SuperMan();
        // proxyInstance:代理类的对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);

        // 通过代理类对象调用方法时，会自动调用被代理类中同名的方法
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("chicken");

    }

}














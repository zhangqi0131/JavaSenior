package com.atguigu.myssm.listener;

import com.atguigu.myssm.io.BeanFactory;
import com.atguigu.myssm.io.ClassPathXmlApplocationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月08日 17:42  周二
 */
//监听上下文启动，在上下文启动的时候创建IOC容器，将其保存到application作用域，
//后面中央控制器再从application作用域中IOC容器

@WebListener
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext application = servletContextEvent.getServletContext();
        String path = application.getInitParameter("contextConfigLocation");
        BeanFactory beanFactory = new ClassPathXmlApplocationContext();
        application.setAttribute("beanFactory",beanFactory);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("监听到了销毁动作");
    }
}

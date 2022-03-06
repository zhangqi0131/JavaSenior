package com.zq.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月05日 23:52  周六
 */
//@WebServlet(urlPatterns = {"/demo01"}, initParams = {@WebInitParam(name="hello", value = "world"), @WebInitParam(name="jerry", value="mouse")})

public class demo01Servlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        ServletConfig servletConfig = getServletConfig();

        String initValue = servletConfig.getInitParameter("hello");
        System.out.println("initValue = " +  initValue);

        ServletContext servletContext = getServletContext();
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        System.out.println(contextConfigLocation);

    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = request.getServletContext();
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        System.out.println(contextConfigLocation);

        request.getSession().getServletContext();
    }
}

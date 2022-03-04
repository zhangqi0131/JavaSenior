//package com.atguigu.fruit.servlets;
//
//import com.atguigu.fruit.dao.FruitDAO;
//import com.atguigu.fruit.dao.impl.FruitDAOImpl;
//import com.atguigu.fruit.pojo.Fruit;
//import com.atguigu.myssm.myspringmvc.ViewBaseServlet;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @author ZhangQi
// * @version 1.0.0
// * @Description TODO
// * @createTime 2022年03月02日 18:18  周三
// */
//@WebServlet("/update.do")
//public class UpdateServlet extends ViewBaseServlet {
//
//    private FruitDAO fruitDAO = new FruitDAOImpl();
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        request.setCharacterEncoding("utf-8");
//
//        String fidStr = request.getParameter("fid");
//        int fid = Integer.parseInt(fidStr);
//        String fname = request.getParameter("fname");
//        String priceStr = request.getParameter("price");
//        int price = Integer.parseInt(priceStr);
//        String fcountStr = request.getParameter("fcount");
//        int fcount = Integer.parseInt(fcountStr);
//        String remark = request.getParameter("remark");
//
//        fruitDAO.updateFruit(new Fruit(fid, fname, price, fcount, remark));
//
//        //super.processTemplate("index", request, response);
//
//        response.sendRedirect("index");
//    }
//}

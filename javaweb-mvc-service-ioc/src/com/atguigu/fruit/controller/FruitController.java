package com.atguigu.fruit.controller;

import com.atguigu.fruit.service.FruitService;
import com.atguigu.fruit.dao.FruitDAO;
import com.atguigu.fruit.dao.impl.FruitDAOImpl;
import com.atguigu.fruit.pojo.Fruit;
import com.atguigu.myssm.util.StringUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月03日 23:13  周四
 */

public class FruitController {

    private FruitService fruitService = null;


    private String index(String oper, String keyword, Integer pageNo, HttpServletRequest request) throws IOException {

        HttpSession session = request.getSession();
        if (pageNo == null) {
            pageNo = 1;
        }
        if (StringUtil.isNotEmpty(oper) && "search".equals(oper)) {
            // 通过关键字查询，pageNo应为1，keyword从请求参数获取
            pageNo = 1;
            if (StringUtil.isEmpty(keyword)) {
                keyword = "";
            }
            session.setAttribute("keyword", keyword);
        } else {
            Object keywordObj = session.getAttribute("keyword");
            if (keywordObj != null) {
                keyword = String.valueOf(keywordObj);
            } else {
                keyword = "";
            }
        }

        session.setAttribute("pageNo", pageNo);
        FruitDAO fruitDAO = new FruitDAOImpl();
        List<Fruit> fruitList = fruitDAO.getFruitList(keyword, pageNo);
        session.setAttribute("fruitList", fruitList);

        int pageCount = fruitDAO.getFruitCount(keyword);
        session.setAttribute("pageCount", pageCount);
        //保存到session作用域
        //此处的视图名称是 index
        //那么thymeleaf会将这个 逻辑视图名称 对应到 物理视图 名称上去
        //逻辑视图名称 ：   index
        //物理视图名称 ：   view-prefix + 逻辑视图名称 + view-suffix
        //所以真实的视图名称是：      /       index       .html
        //super.processTemplate("index", request, response);
        return "index";
    }

    private String add(String fname, Integer price, Integer fcount, String remark) {
        fruitService.addFruit(new Fruit(0, fname, price, fcount, remark));
        //response.sendRedirect("fruit.do");
        return "redirect.fruit.do";
    }

    private String del(Integer fid) {
        if (fid != null) {
            fruitService.delFruit(fid);
            //response.sendRedirect("fruit.do");
            return "redirect:edit.do";
        }
        return null;
    }

    private String edit(Integer fid, HttpServletRequest req) {

        if (fid != null) {
            Fruit fruit = fruitService.getFruitByFid(fid);
            req.setAttribute("fruit", fruit);
            //super.processTemplate("edit", req, resp);
            return "edit";
        }
        return null;
    }

    private String update(Integer fid, String fname, Integer price, Integer fcount, String remark) {

        fruitService.updateFruit(new Fruit(fid, fname, price, fcount, remark));

        //super.processTemplate("index", request, response);

        //response.sendRedirect("fruit.do");
        return "redirect:fruit.do";
    }
}

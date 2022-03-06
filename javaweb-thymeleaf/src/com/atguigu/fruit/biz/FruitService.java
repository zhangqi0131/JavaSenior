package com.atguigu.fruit.biz;

import com.atguigu.fruit.pojo.Fruit;

import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月06日 15:07  周日
 */
public interface FruitService {

    //获取指定页面的库存信息列表
    List<Fruit> getFruitList(String keyword, Integer pageNo);

    //添加库存信息记录
    void addFruit(Fruit fruit);

    //根据id查看指定库存记录
    Fruit getFruitById(Integer fid);

    //删除指定库存记录
    void delFruit(Integer fid);

    //获取总页数
    Integer getPageCount(String keyword);
}

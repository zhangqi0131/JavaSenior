package com.atguigu.fruit.dao;

import com.atguigu.fruit.pojo.Fruit;

import java.util.List;

public interface FruitDAO {
    //获取所有的库存列表信息
    List<Fruit> getFruitList(String keyword, Integer pageNo);

    // 根据fid获取特定的水果库存信息
    Fruit getFruitByFid(Integer fid);

    // 修改指定的库存记录
    void updateFruit(Fruit fruit);

    // 删除指定的库存记录
    void delFruit(Integer fid);

    void addFruit(Fruit fruit);

    // 查询总记录条数
    int getFruitCount(String keyword);
}

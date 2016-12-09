package com.irelandlight.service;

import com.irelandlight.model.ShopCar;
import org.apache.ibatis.annotations.Param;

/**
 * Created  with Intellij IDEA.
 * User: Ele_Chen
 * Date: 2016/12/5
 * Time: 17:52
 * Description: 购物车接口 .
 */
public interface ShopCarService {

    //添加用户购物车(ShopCar) 返回主键
    public void insertShopCarByShopCar(ShopCar shopCar) throws Exception;

    //添加用户购物车(用户id) 返回主键
    public void insertShopCarByConsumerId( @Param("consumerId") Long consumerId) throws Exception;

    //删除用户购物车
    public void deleteConsumerShopCarByConsumerId(@Param("consumerId") Long consumerId) throws Exception;

    //暂不提供修改用户购物车功能

    //通过用户Id查找购物车商品详情列表(resultMap)
    public ShopCar findShopCarGoodsDetailByConsumerId (@Param("consumerId") Long consumerId) throws Exception;

    public ShopCar  findShopCarDetailByConsumerId(@Param("consumerId") Long consumerId)throws Exception;

}

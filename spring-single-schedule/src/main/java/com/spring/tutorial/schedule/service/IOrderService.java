package com.spring.tutorial.schedule.service;

import pers.demo.asa.spring.common.bean.Order;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 10:55 2018/4/4.
 */
public interface IOrderService {
    /**
     * 处理单个订单
     *
     * @param order 订单信息
     */
    void dealOrder(Order order);
}

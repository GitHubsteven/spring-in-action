package com.spring.tutorial.schedule.service;

import org.springframework.stereotype.Service;
import pers.demo.asa.spring.common.bean.Order;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 10:55 2018/4/4.
 */
@Service
public class OrderServiceImpl implements IOrderService {
    @Override
    public void dealOrder(Order order) {
        System.out.println(order);
    }
}

package com.spring.tutorial.schedule.task;

import com.spring.tutorial.schedule.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.demo.asa.spring.common.bean.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 18:48 2019/11/19.
 */
@Service
public class ProcessOrderTask implements ITask {

    @Autowired
    private IOrderService iOrderService;

    private List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i < 3; i++) {
            int id = random.nextInt(100);
            Order order = new Order();
            order.setOrderId("orderId:" + id);
            order.setId((long) id);
            orders.add(order);
        }
        return orders;
    }

    public void startup() {
        List<Order> orders = getOrders();
        orders.forEach(order -> iOrderService.dealOrder(order));
        System.out.println("---------------------->end");
    }
}
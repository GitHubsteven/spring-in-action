package spring.in.action.spring.api.impl.service;

import org.springframework.web.bind.annotation.RequestParam;
import spring.in.action.spring.api.service.IDemoService;

import javax.xml.ws.ServiceMode;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 15:00 2019/8/8.
 */
public class IDemoServiceImpl implements IDemoService {
    @Override
    public String hello(@RequestParam String name) {
        return "hello";
    }

    @Override
    public String info() {
        return "info";
    }
}
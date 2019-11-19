package spring.in.action.spring.api.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 13:48 2019/8/26.
 */
@RequestMapping("/test")
public interface ITestService {

    @GetMapping("/introduce")
    String introduce();
}
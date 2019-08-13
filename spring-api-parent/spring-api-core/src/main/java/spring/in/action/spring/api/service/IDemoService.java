package spring.in.action.spring.api.service;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 14:44 2019/8/8.
 */
@RequestMapping("/demo")
public interface IDemoService {

    @GetMapping("/hello")
    String hello(@Validated @NotNull @RequestParam String name);
}
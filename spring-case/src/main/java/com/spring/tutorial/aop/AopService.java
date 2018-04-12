package com.spring.tutorial.aop;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 19:38 2018/4/12.
 */
public class AopService {

    public void operate1() {
        System.out.println("operate 1 running ...");
    }

    public void operate2() {
        System.out.println("operate 2 running ...");
        throw new RuntimeException("test exception!");
    }

    public Integer operate3() {
        System.out.println("operate 3 running ...");
        return 3;
    }
}

package test.spring.tutorial;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 17:17 2018/4/20.
 */
public class LogTest extends BaseServiceTest {
    private final Logger _$ = LoggerFactory.getLogger(LogTest.class);
    @Test
    public void logout(){
        _$.info("info");
        _$.error("error");
        _$.debug("debug");

    }
}

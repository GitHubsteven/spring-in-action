package test.spring.tutorial;

import com.spring.tutorial.configure.AppConfig;
import com.spring.tutorial.configure.SpringConfiguration;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 15:51 2018/4/20.
 */
// have no idea of this class, but it does not matter
@RunWith(SpringJUnit4ClassRunner.class)
//suppose load the context, in other word, you can think it is the container managing the beans
@ContextConfiguration(classes = {SpringConfiguration.class, AppConfig.class})
public abstract class BaseServiceTest {
    final Logger logger = LoggerFactory.getLogger(BaseServiceTest.class);
}

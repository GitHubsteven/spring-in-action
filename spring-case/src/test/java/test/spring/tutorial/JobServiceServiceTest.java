package test.spring.tutorial;

import com.spring.tutorial.service.manage.JobManager;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 16:48 2018/4/20.
 */
public class JobServiceServiceTest extends BaseServiceTest {
    @Autowired
    private JobManager jobManager;

    @Test
    public void listJobs(){
        logger.info("=======start to list jobs=======");
        jobManager.introduceJob();
    }
}
